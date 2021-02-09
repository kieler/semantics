/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.c.sccharts.extensions

import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression
import org.eclipse.cdt.core.dom.ast.IASTUnaryExpression
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclSpecifier

/**
 * Extension for converting CDT types and operators to their counterparts in KExpressions'
 * {@link ValueType} and {@link OperatorType}.
 * 
 * @author lan
 */
class CDTConvertExtensions {
    
    /** Converts CDT types to KExpression ValueTypes if possible */
    def ValueType cdtTypeConversion(int n) {
        switch (n) {
            case IASTSimpleDeclSpecifier.t_void: return null
            case IASTSimpleDeclSpecifier.t_char: return ValueType::STRING
            case IASTSimpleDeclSpecifier.t_int: return ValueType::INT
            case IASTSimpleDeclSpecifier.t_float: return ValueType::FLOAT
            case IASTSimpleDeclSpecifier.t_double: return ValueType::DOUBLE
            case IASTSimpleDeclSpecifier.t_bool: return ValueType::BOOL
            case IASTSimpleDeclSpecifier.t_wchar_t: return ValueType::STRING
            case IASTSimpleDeclSpecifier.t_typeof: return null
            case IASTSimpleDeclSpecifier.t_decltype: return null
            case IASTSimpleDeclSpecifier.t_auto: return null
            case IASTSimpleDeclSpecifier.t_char16_t: return ValueType::STRING
            case IASTSimpleDeclSpecifier.t_char32_t: return ValueType::STRING
            default: return null
        }
    }
    
    /** Converts the type of CDT BinaryExpression Operators to KExpression OperatorTypes if possible */
    def OperatorType cdtBinaryOpTypeConversion(int n) {
        switch (n) {
            case IASTBinaryExpression.op_multiply: return OperatorType::MULT
            case IASTBinaryExpression.op_divide: return OperatorType::DIV
            case IASTBinaryExpression.op_modulo: return OperatorType::MOD
            case IASTBinaryExpression.op_plus: return OperatorType::ADD
            case IASTBinaryExpression.op_minus: return OperatorType::SUB
            case IASTBinaryExpression.op_shiftLeft: return OperatorType::SHIFT_LEFT
            case IASTBinaryExpression.op_shiftRight: return OperatorType::SHIFT_RIGHT
            case IASTBinaryExpression.op_lessThan: return OperatorType::LT
            case IASTBinaryExpression.op_greaterThan: return OperatorType::GT
            case IASTBinaryExpression.op_lessEqual: return OperatorType::LEQ
            case IASTBinaryExpression.op_greaterEqual: return OperatorType::GEQ
            case IASTBinaryExpression.op_binaryAnd: return OperatorType::BITWISE_AND
            case IASTBinaryExpression.op_binaryXor: return OperatorType::BITWISE_XOR
            case IASTBinaryExpression.op_binaryOr: return OperatorType::BITWISE_OR
            case IASTBinaryExpression.op_logicalAnd: return OperatorType::LOGICAL_AND
            case IASTBinaryExpression.op_logicalOr: return OperatorType::LOGICAL_OR
            //case IASTBinaryExpression.op_assign: return "="
            //case IASTBinaryExpression.op_multiplyAssign: return "*="
            //case IASTBinaryExpression.op_divideAssign: return "/="
            //case IASTBinaryExpression.op_moduloAssign: return "%="
            //case IASTBinaryExpression.op_plusAssign: return "+="
            //case IASTBinaryExpression.op_minusAssign: return "-="
            //case IASTBinaryExpression.op_shiftLeftAssign: return "<<="
            //case IASTBinaryExpression.op_shiftRightAssign: return ">>="
            //case IASTBinaryExpression.op_binaryAndAssign: return "&="
            //case IASTBinaryExpression.op_binaryXorAssign: return "^="
            //case IASTBinaryExpression.op_binaryOrAssign: return "|="
            case IASTBinaryExpression.op_equals: return OperatorType::EQ
            case IASTBinaryExpression.op_notequals: return OperatorType::NE
            //case IASTBinaryExpression.op_pmdot: return "pointer to member field dereference"
            //case IASTBinaryExpression.op_pmarrow: return "pointer to member pointer dereference"
            //case IASTBinaryExpression.op_max: return "op_max >?"
            //case IASTBinaryExpression.op_min: return "op_min <?"
            //case IASTBinaryExpression.op_ellipses: return "op_ellipses ..."
            default: return null
        }
    }
    
    /** Converts CDT UnaryOperatorTypes to KExpression OperatorTypes if possible */
    def OperatorType cdtUnaryOpTypeConversion(int n) {
        switch (n) {
            case IASTUnaryExpression.op_prefixIncr: return OperatorType::POSTFIX_ADD  //++exp
            case IASTUnaryExpression.op_prefixDecr: return OperatorType::POSTFIX_SUB  //--exp
            case IASTUnaryExpression.op_plus: return OperatorType::ADD  //+exp
            case IASTUnaryExpression.op_minus: return OperatorType::SUB  //-exp
            case IASTUnaryExpression.op_star: return OperatorType::MULT  //*exp
            case IASTUnaryExpression.op_amper: return OperatorType::BITWISE_AND  //&exp
            case IASTUnaryExpression.op_tilde: return OperatorType::BITWISE_NOT  //~exp
            case IASTUnaryExpression.op_not: return OperatorType::NOT  //!exp
            case IASTUnaryExpression.op_sizeof: return null  //sizeof exp
            case IASTUnaryExpression.op_postFixIncr: return OperatorType::POSTFIX_ADD  //exp++
            case IASTUnaryExpression.op_postFixDecr: return OperatorType::POSTFIX_SUB  //exp--
            case IASTUnaryExpression.op_bracketedPrimary: return null  //( exp )
            case IASTUnaryExpression.op_throw: return null  //throw exp
            case IASTUnaryExpression.op_typeid: return null  //typeid( exp )
            case IASTUnaryExpression.op_typeof: return null  //typeof exp //should not be used
            case IASTUnaryExpression.op_alignOf: return null  //alignOf exp //will not be illustrated
            case IASTUnaryExpression.op_sizeofParameterPack: return null  //sizeof parameterPack //C++ only
            case IASTUnaryExpression.op_noexcept: return null  //noexcept ( exp ) //C++ only
            case IASTUnaryExpression.op_labelReference: return null  //label Reference
            default: return null
        }
    }
    
}