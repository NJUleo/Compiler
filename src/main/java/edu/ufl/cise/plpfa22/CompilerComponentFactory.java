/**  This code is provided for solely for use of students in the course COP5556 Programming Language Principles at the 
 * University of Florida during the Fall Semester 2022 as part of the course project.  No other use is authorized. 
 */

package edu.ufl.cise.plpfa22;

import edu.ufl.cise.plpfa22.ast.ASTVisitor;

public class CompilerComponentFactory {

	public static ILexer getLexer(String input) {
		return new LexerImp(input);

	}

	public static IParser getParser(ILexer lexer) {
		return new ParserImp(lexer);
	}

	public static ASTVisitor getScopeVisitor() {
		return new ASTScopeVisitor();
	}

	public static ASTVisitor getTypeInferenceVisitor() {
		return new ASTTypeVisitor();
	}

	public static ASTVisitor getCodeGenVisitor(String className, String packageName, String string) {
		return new CodeGenVisitor(className, packageName, string);
	}

}
