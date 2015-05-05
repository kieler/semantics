/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.c.sccharts

import de.cau.cs.kieler.c.CParser.PrimaryExpressionContext;
import org.eclipse.xtend.lib.annotations.Accessors
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.CommonToken
import de.cau.cs.kieler.c.CParser
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.ValueType

/**
 * @author ssm
 *
 */
class PECProcessor {
    
    var int pecP = 0;
    
    
    def procecess(PrimaryExpressionContext pec) {
        pecP = 0

        // return value
        skip        
        val returnDeclaration = kex.createDeclaration => [
            type = ValueType::INT
            output = true
        ]
        val returnValue = kex.createValuedObject => [
            name = "return"
            returnDeclaration.valuedObjects += it
        ]
        
        // function 
        skip
        val model = scc.createState => [
            label = pec.getToken.getIdentifer
            id = label
            
            declarations += returnDeclaration
        ]
        
        // parameters
        skip
        val inputDeclaration = kex.createDeclaration => [
            type = ValueType::INT
            input = true
            model.declarations += it
        ]
        
        var token = pec.getToken
        while (!token.isRightParen) {
            if (token.isInt) {
              val iName = pec.getToken.getIdentifer
              kex.createValuedObject => [
                  name = iName
                  inputDeclaration.valuedObjects += it
              ]  
            }
            token = pec.getToken
        }
        
        pec.nextLBrace
        // program
        
        model
    }
  
    private def getToken(PrimaryExpressionContext pec) {
        val ParseTree child = pec.children.get(pecP)
        val ErrorNode node = child as ErrorNode
        val CommonToken token = node.getSymbol as CommonToken
        pecP = pecP + 1        
        token
    }
    
    private def hasNext(PrimaryExpressionContext pec) {
      (pecP < pec.children.length)  
    }
    
    private def skip() {
        pecP = pecP + 1
    }
    
    private def nextLBrace(PrimaryExpressionContext pec) {
        do {
            val token = pec.getToken
            if (token.type == CParser::LeftBrace) return token
        } while (pec.hasNext)
        return null
    }
    
    private def isInt(CommonToken token) {
        token.type == CParser::Int
    }
    
    private def isIdentifier(CommonToken token) {
        token.type == CParser::Identifier
    }
    
    private def getIdentifer(CommonToken token) {
        token.text
    }

    private def isRightParen(CommonToken token) {
        token.type == CParser::RightParen
    }

    
    private def isConstant(CommonToken token) {
        token.type == CParser::Constant
    }

    private def isStringLiteral(CommonToken token) {
        token.type == CParser::StringLiteral
    }
    
 
    
    private def scc() {
        SCChartsFactory::eINSTANCE
    }
    
    private def kex() {
        KExpressionsFactory::eINSTANCE
    }
  
}



/*
(primaryExpression int function fib ( int n ) { int fl = 0 ; int fh = 1 ; if ( n <= 1 ) { fh = n ; } else { for ( int i = 2 ; i <= n ; i ++ ) { int tmp = fh ; fh += fl ; fl = tmp ; } } printf ( "%s %s" , n , fib ) ; })
32: 'int'
105: Identifier function
105: Identifier fib
59: '('
32: 'int'
105: Identifier n
60: ')'
63: '{'
32: 'int'
105: Identifier fl
89: '='
106: Constant 0
87: ';'
32: 'int'
105: Identifier fh
89: '='
106: Constant 1
87: ';'
30: 'if'
59: '('
105: Identifier n
66: '<='
106: Constant 1
60: ')'
63: '{'
105: Identifier fh
89: '='
105: Identifier n
87: ';'
64: '}'
24: 'else'
63: '{'
28: 'for'
59: '('
32: 'int'
105: Identifier i
89: '='
106: Constant 2
87: ';'
105: Identifier i
66: '<='
105: Identifier n
87: ';'
105: Identifier i
72: '++'
60: ')'
63: '{'
32: 'int'
105: Identifier tmp
89: '='
105: Identifier fh
87: ';'
105: Identifier fh
93: '+='
105: Identifier fl
87: ';'
105: Identifier fl
89: '='
105: Identifier tmp
87: ';'
64: '}'
64: '}'
105: Identifier printf
59: '('
107: StringLiteral "%s %s"
88: ','
105: Identifier n
88: ','
105: Identifier fib
60: ')'
87: ';'
64: '}'
 */