package de.cau.cs.kieler.c.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import de.cau.cs.kieler.c.*;
import de.cau.cs.kieler.c.CParser.PrimaryExpressionContext;

public class KielerCParser {

    public static PrimaryExpressionContext parse(String cProgram) throws Exception {
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

        PrimaryExpressionContext pec = (PrimaryExpressionContext) tree;
        processPrimaryExpressionContext(pec);
//        processTree(tree,"");
        
        return pec;
    }
    
    public static void processPrimaryExpressionContext(PrimaryExpressionContext pec) {
        for(ParseTree child : pec.children) {
            String po = "";
            ErrorNode node = (ErrorNode) child;
            CommonToken token = (CommonToken) node.getSymbol();
            int typeID = token.getType();
            String tokenName = CParser.tokenNames[typeID];
            po = po + typeID+": "+tokenName;
            
            if (typeID == CParser.Identifier) {
                po = po + " " + token.getText();
            }
            if (typeID == CParser.Constant) {
                po = po + " " + token.getText();
            }
            if (typeID == CParser.StringLiteral) {
                po = po + " " + token.getText();
            }
            
            System.out.println(po);
        }
    }
    
    public static void processTree(ParseTree tree, String indend) {
        int count = tree.getChildCount();
        System.out.println(indend+count);
        
        for(int i = 0; i<count; i++) {
            ParseTree t = tree.getChild(i);
            CommonToken token = (CommonToken) t.getPayload();
            int typeID = token.getType();
            String tokenName = CParser.tokenNames[typeID];
            System.out.println(indend+typeID+": "+tokenName);
        }
    }
	   
}
