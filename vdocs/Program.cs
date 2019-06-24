using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace vdocs
{
    class Program
    {
        static void Main(string[] args)
        {
            var parser = CreateParser(File.ReadAllText("vdocs.yml"));
            var path = Path.Combine(Environment.CurrentDirectory, args[0]);
            var variables = parser.variables();
            Console.WriteLine("Replacing Variables...");
            foreach (var file in Directory.GetFiles(path, "*.md"))
            {
                ReplaceFile(file, variables);
            }

            ReplaceFile(Path.Combine(Environment.CurrentDirectory, "mkdocs.yml"), variables);
            Console.WriteLine("Replacement Complete...");

            var psi = new ProcessStartInfo("mkdocs");
            psi.WorkingDirectory = Environment.CurrentDirectory;
            psi.Arguments = "build";
            psi.UseShellExecute = false;
            psi.RedirectStandardOutput = true;

            var proc = Process.Start(psi);
            var output = proc.StandardOutput.ReadToEnd();
            proc.WaitForExit();

            Console.WriteLine(output);

            foreach (var temp in Directory.GetFiles(path, "*.v"))
            {
                var file = temp.Substring(0, temp.Length - 2);
                File.Delete(file);
                File.Move(temp, file);
            }

            var mk_temp = Path.Combine(Environment.CurrentDirectory, "mkdocs.yml.v");
            var mk_file = mk_temp.Substring(0, mk_temp.Length - 2);
            File.Delete(mk_file);
            File.Move(mk_temp, mk_file);

            Console.WriteLine("Build Complete");
        }

        static void ReplaceFile(string file, vdocsParser.VariablesContext variables)
        {
            Console.WriteLine("Replacing " + file + "...");
            var temp = file + ".v";
            if (File.Exists(temp))
            {
                File.Delete(temp);
            }
            File.Move(file, temp);
            var text = File.ReadAllText(temp);
            foreach (var variable in variables.children?.OfType<vdocsParser.VariableContext>())
            {
                var name = variable.GetChild(0).GetText();
                var value = variable.GetChild(2).GetText();
                Console.WriteLine("Replacing all occurrences of " + name + " with " + value);
                value = value.Substring(1, value.Length - 2); // trim off leading and trailing ' or "
                text = text.Replace(name, value);
            }
            using (var sw = File.CreateText(file))
            {
                sw.Write(text);
            }
        }


        static vdocsParser CreateParser(string variables)
        {
            var inputStream = new AntlrInputStream(variables);
            var lexer = new vdocsLexer(inputStream);
            var commonTokenStream = new CommonTokenStream(lexer);
            var parser = new vdocsParser(commonTokenStream);
            return parser;
        }
    }
}
