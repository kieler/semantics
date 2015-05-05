package de.cau.cs.kieler.c.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import de.cau.cs.kieler.c.*;

public class KielerCParser {

    public static void parse(String cProgram) throws Exception {
        // create a CharStream
        ANTLRInputStream input = new ANTLRInputStream(cProgram);

        // create a lexer that feeds off of input CharStream
        CLexer lexer = new CLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        CParser parser = new CParser(tokens);

        ParseTree tree = parser.primaryExpression(); 
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
	    
	   
}
