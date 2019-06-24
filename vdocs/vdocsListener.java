// Generated from vdocs.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link vdocsParser}.
 */
public interface vdocsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link vdocsParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(vdocsParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link vdocsParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(vdocsParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link vdocsParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(vdocsParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link vdocsParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(vdocsParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link vdocsParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(vdocsParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link vdocsParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(vdocsParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link vdocsParser#namedElement}.
	 * @param ctx the parse tree
	 */
	void enterNamedElement(vdocsParser.NamedElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vdocsParser#namedElement}.
	 * @param ctx the parse tree
	 */
	void exitNamedElement(vdocsParser.NamedElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vdocsParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompileUnit(vdocsParser.CompileUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link vdocsParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompileUnit(vdocsParser.CompileUnitContext ctx);
}