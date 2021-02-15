/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.c.sccharts.processors

import java.nio.charset.StandardCharsets
import org.eclipse.cdt.core.dom.ast.IASTArraySubscriptExpression
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression
import org.eclipse.cdt.core.dom.ast.IASTDeclarationStatement
import org.eclipse.cdt.core.dom.ast.IASTEqualsInitializer
import org.eclipse.cdt.core.dom.ast.IASTExpression
import org.eclipse.cdt.core.dom.ast.IASTExpressionStatement
import org.eclipse.cdt.core.dom.ast.IASTFieldReference
import org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression
import org.eclipse.cdt.core.dom.ast.IASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTInitializer
import org.eclipse.cdt.core.dom.ast.IASTLiteralExpression
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclSpecifier
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclaration
import org.eclipse.cdt.core.dom.ast.IASTStatement
import org.eclipse.cdt.core.dom.ast.IASTUnaryExpression
import org.eclipse.cdt.internal.core.dom.parser.ASTNode

/**
 * Static helper methods for converting expressions and statements used by the C Development
 * Tooling to their String representation.
 * 
 * @author nre
 */
final class CDTToStringConverter {
    
    private new() {
        // Dont initialize this class, only use it's static methods.
    }
    
    /**
     * Build a string representation of the expression.
     */
    static def String exprToString(IASTExpression expr, byte[] sourceFileContents) {
        if (expr === null) {
            return ""
        }
        
        if (expr instanceof ASTNode && sourceFileContents !== null && !sourceFileContents.empty) {
            return stringContentFromNode(expr as ASTNode, sourceFileContents)
        }
        
        // Otherwise, do a best effort for reconstructing the string.
        var expressionAsString = ""
        
        switch (expr) {
            IASTFunctionCallExpression: {
                // Retrieve the function's name
                val funcName = (expr.getFunctionNameExpression as IASTIdExpression).getName.toString
                expressionAsString = funcName + "("
                
                // Translate the arguments
                val arguments = expr.getArguments
                for (var i = 0; i < arguments.length; i++) {
                    val argument = arguments.get(i)
                    
                    if (argument instanceof IASTExpression) {
                        expressionAsString += argument.exprToString(sourceFileContents)
                    } else {
                        println("unsupported argument type in function call to convert to string: " + argument.class)
                    }
                    
                    if (i < arguments.length - 1) {
                        expressionAsString += ", "
                    } else expressionAsString += ")"
                }
            }
            IASTBinaryExpression: {
                // Translate the elemenmts of the binary expression
                val operator = expr.getOperator.cdtBinaryOpTypeToString
                val operand1 = expr.getOperand1.exprToString(sourceFileContents)
                val operand2 = expr.getOperand2.exprToString(sourceFileContents)
                
                expressionAsString = "(" + operand1 + " " + operator + " " + operand2 + ")"
            }
            IASTUnaryExpression: {
                // Translate the elements of a unary expression
                var postOperator = expr.getOperator.cdtUnaryOpTypeToString
                var preOperator = ""
                
                if (postOperator.contains("exp")) {
                    preOperator = postOperator.substring(0, postOperator.indexOf("exp"))
                    postOperator = ""
                }
                
                val operand = expr.getOperand.exprToString(sourceFileContents)
                
                expressionAsString = "(" + preOperator + operand + postOperator + ")"
            }
            IASTFieldReference: {
                // Translate the use of a struct
                val structExpr = expr.getFieldOwner
                val structName = structExpr.exprToString(sourceFileContents)
                val fieldName = expr.getFieldName
                expressionAsString = structName + "->" + fieldName
            }
            IASTArraySubscriptExpression: {
                // Translate the use on an array
                val arrayExpr = expr.getArrayExpression
                val arrayName = arrayExpr.exprToString(sourceFileContents)
                val arrayArgExpr = expr.getArgument
                var String arrayArgName;
                if (arrayArgExpr instanceof IASTExpression) {
                    arrayArgName = arrayArgExpr.exprToString(sourceFileContents)
                } else {
                    println("unsupported argument type in array subscript expression to convert to string: " + arrayArgExpr.class)
                }
                
                expressionAsString = arrayName + "[" + arrayArgName + "]"
            }
            IASTIdExpression: {
                //Translate the use of a variable
                expressionAsString = expr.getName.toString    
            }
            IASTLiteralExpression: {
                // Translate the use of a literal
                expressionAsString = expr.toString
            }
            IASTExpressionStatement: {
                // Extract the expression out of the expression statement
                expressionAsString = expr.getExpression.exprToString(sourceFileContents)
            }
            default: {
                println("Unsupported expression to convert to string: " + expr?.class)
            }
        }
        
        return expressionAsString
    }
    
    /**
     * Build a string representation of the statement
     */
    static def String stmtToString(IASTStatement stmt, byte[] sourceFileContents) {
        if (stmt instanceof ASTNode && sourceFileContents !== null && !sourceFileContents.empty) {
            return stringContentFromNode(stmt as ASTNode, sourceFileContents)
        }
        
        // Otherwise, do a best effort for reconstructing the string.
        var String stmtAsString = ""
        
        switch (stmt) {
            IASTDeclarationStatement: {
                val decl = stmt.declaration
                if (decl instanceof IASTSimpleDeclaration) {
                    val specifier = decl.declSpecifier
                    if (specifier instanceof IASTSimpleDeclSpecifier) {
                        stmtAsString += specifier.specifierToString + " "
                    }
                    for (var int i = 0; i < decl.declarators.length; i++) {
                        val declarator = (decl as IASTSimpleDeclaration).declarators.get(i);
                        val name = declarator.name
                        val initializer = declarator.initializer
                        var String value
                        if (initializer instanceof IASTEqualsInitializer &&
                            (initializer as IASTEqualsInitializer).initializerClause instanceof IASTExpression) {
                            value = ((initializer as IASTEqualsInitializer).initializerClause as IASTExpression).exprToString(sourceFileContents)
                        }
                        stmtAsString += name + " " + initializer.initializerToString + " " + value
                        if (i != decl.declarators.length - 1) {
                            stmtAsString += ", "
                        }
                    }
                }
            }
            default: {
                println("Yet unsupported statement to String: " + stmt.class)
            }
        }
        
        return stmtAsString
    }
    
    /** Return the given node as a String from the given source file contents. */
    static def String stringContentFromNode(ASTNode node, byte[] sourceFileContents) {
        return new String(sourceFileContents, node.offset, node.length, StandardCharsets.UTF_8)
    }
    
    /**
     * Build a string representation of the IASTInitializer.
     */
    static def String initializerToString(IASTInitializer initializer) {
        switch (initializer) {
            IASTEqualsInitializer: {
                return "="
            }
            default: {
                println("Yet unsupported initializer to String: " + initializer.class)
                return "unsupportedInitializer"
            }
        }
    }
    
    /**
     * Build a string representation of the IASTSimpleDeclSpecifier.
     */
    static def String specifierToString(IASTSimpleDeclSpecifier specifier) {
        switch (specifier.type) {
            case IASTSimpleDeclSpecifier.t_unspecified: {
                return "unspecified"
            }
            case IASTSimpleDeclSpecifier.t_void: {
                return "void"
            }
            case IASTSimpleDeclSpecifier.t_char: {
                return "char"
            }
            case IASTSimpleDeclSpecifier.t_int: {
                return "int"
            }
            case IASTSimpleDeclSpecifier.t_float: {
                return "float"
            }
            case IASTSimpleDeclSpecifier.t_double: {
                return "double"
            }
            case IASTSimpleDeclSpecifier.t_bool: {
                return "bool"
            }
            case IASTSimpleDeclSpecifier.t_wchar_t: {
                return "wchar"
            }
            case IASTSimpleDeclSpecifier.t_typeof: {
                return "typeof"
            }
            case IASTSimpleDeclSpecifier.t_decltype: {
                return "decltype"
            }
            case IASTSimpleDeclSpecifier.t_auto: {
                return "auto"
            }
            case IASTSimpleDeclSpecifier.t_char16_t: {
                return "char16"
            }
            case IASTSimpleDeclSpecifier.t_char32_t: {
                return "char32"
            }
            case IASTSimpleDeclSpecifier.t_int128: {
                return "int128"
            }
            case IASTSimpleDeclSpecifier.t_float128: {
                return "float128"
            }
            case IASTSimpleDeclSpecifier.t_decimal32: {
                return "decimal32"
            }
            case IASTSimpleDeclSpecifier.t_decimal64: {
                return "decimal64"
            }
            case IASTSimpleDeclSpecifier.t_decimal128: {
                return "decimal128"
            }
            case IASTSimpleDeclSpecifier.t_decltype_auto: {
                return "decltype_auto"
            }
        }
    }
    
    
    
    /** Converts a CDT BinaryOperator into a String representation */
    static def String cdtBinaryOpTypeToString(int n) {
        switch (n) {
            case IASTBinaryExpression.op_multiply: return "*"
            case IASTBinaryExpression.op_divide: return "/"
            case IASTBinaryExpression.op_modulo: return "%"
            case IASTBinaryExpression.op_plus: return "+"
            case IASTBinaryExpression.op_minus: return "-"
            case IASTBinaryExpression.op_shiftLeft: return "<<"
            case IASTBinaryExpression.op_shiftRight: return ">>"
            case IASTBinaryExpression.op_lessThan: return "<"
            case IASTBinaryExpression.op_greaterThan: return ">"
            case IASTBinaryExpression.op_lessEqual: return "<="
            case IASTBinaryExpression.op_greaterEqual: return ">="
            case IASTBinaryExpression.op_binaryAnd: return "&"
            case IASTBinaryExpression.op_binaryXor: return "^"
            case IASTBinaryExpression.op_binaryOr: return "|"
            case IASTBinaryExpression.op_logicalAnd: return "&&"
            case IASTBinaryExpression.op_logicalOr: return "||"
            case IASTBinaryExpression.op_assign: return "="
            case IASTBinaryExpression.op_multiplyAssign: return "*="
            case IASTBinaryExpression.op_divideAssign: return "/="
            case IASTBinaryExpression.op_moduloAssign: return "%="
            case IASTBinaryExpression.op_plusAssign: return "+="
            case IASTBinaryExpression.op_minusAssign: return "-="
            case IASTBinaryExpression.op_shiftLeftAssign: return "<<="
            case IASTBinaryExpression.op_shiftRightAssign: return ">>="
            case IASTBinaryExpression.op_binaryAndAssign: return "&="
            case IASTBinaryExpression.op_binaryXorAssign: return "^="
            case IASTBinaryExpression.op_binaryOrAssign: return "|="
            case IASTBinaryExpression.op_equals: return "=="
            case IASTBinaryExpression.op_notequals: return "!="
            //case IASTBinaryExpression.op_pmdot: return "pointer to member field dereference"
            //case IASTBinaryExpression.op_pmarrow: return "pointer to member pointer dereference"
            //case IASTBinaryExpression.op_max: return "op_max >?"
            //case IASTBinaryExpression.op_min: return "op_min <?"
            //case IASTBinaryExpression.op_ellipses: return "op_ellipses ..."
            default: return ""
        }
    }
    
    /** Converts a CDT UnaryOperator into a String representation */
    static def String cdtUnaryOpTypeToString(int n) {
        switch (n) {
            case IASTUnaryExpression.op_prefixIncr: return "++exp"
            case IASTUnaryExpression.op_prefixDecr: return "--exp"
            case IASTUnaryExpression.op_plus: return "+exp"
            case IASTUnaryExpression.op_minus: return "-exp"
            case IASTUnaryExpression.op_star: return "*exp"
            case IASTUnaryExpression.op_amper: return "&exp"
            case IASTUnaryExpression.op_tilde: return "~"
            case IASTUnaryExpression.op_not: return "!"
            case IASTUnaryExpression.op_sizeof: return null  //sizeof exp
            case IASTUnaryExpression.op_postFixIncr: return "++"
            case IASTUnaryExpression.op_postFixDecr: return "--"
            case IASTUnaryExpression.op_bracketedPrimary: return null  //( exp )
            case IASTUnaryExpression.op_throw: return null  //throw exp
            case IASTUnaryExpression.op_typeid: return null  //typeid( exp )
            case IASTUnaryExpression.op_typeof: return null  //typeof exp //should not be used
            case IASTUnaryExpression.op_alignOf: return null  //alignOf exp //will not be illustrated
            case IASTUnaryExpression.op_sizeofParameterPack: return null  //sizeof parameterPack //C++ only
            case IASTUnaryExpression.op_noexcept: return null  //noexcept ( exp ) //C++ only
            case IASTUnaryExpression.op_labelReference: return null  //label Reference
            default: return ""
        }
    }
}