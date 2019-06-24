# vdocs

vdocs is a simple mkdocs wrapper that supports named variable replacements in both the mkdocs.yml and all markdown files.



Simply define a vdocs.yml file, and place both it and the vdocs.exe in the same directory as the mkdocs.yml file, and then execute vdocs, passing in the directory to the mkdocs 'docs' folder, and vdocs will iterate through all the files, replacing each occurrence of the variable with its defined value, before building the docs.



## Configuration

Define a vdocs.yml file as follows:

```
/*

	variable defintions follow the form:

	variable_name: 'variable value';

	it is good practice to use an uncommon and consistent naming convention or prefix for variable names
	so that replacements are not made against actual words that might occur in the markdown text.

	for example, variable names starting with double @ symbols might work nicely, e.g.:

	@@product_name: 'Acme Toaster 2000';
	@@serial_number: 'ABCDEFG12345';

*/

// variables below this line

@@prod: 'My Product';
@@support_email: 'some_address@some_co.com';
```



Place the vdocs.yml file in the same directory as the mkdocs.yml file.



Update all *.md and mkdocs.yml files to use the variables defined, e.g.:

```
// index.md

# Introduction to @@prod


## What is @@prod?

- @@prod is the best product in the world

For more information, email us at @@support_email.

...
  
```



Be sure to either copy the vdocs.exe to the same directory, or add it to your system's PATH variable.



## Usage

Open a command window and browse to the mkdocs.yml folder, then execute vdocs, passing in the directory for the *.md files (usually the same as is defined for the 'docs' attribute in the mkdocs.yml file).

![1561404375442](D:\Code\Altus\vdocs\Docs\cmd.png)



