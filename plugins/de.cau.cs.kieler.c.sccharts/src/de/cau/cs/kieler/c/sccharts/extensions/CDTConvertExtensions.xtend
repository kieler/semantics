package de.cau.cs.kieler.c.sccharts.extensions

import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression
import org.eclipse.cdt.core.dom.ast.IASTUnaryExpression
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclSpecifier

/**
 * @author lan
 */
class CDTConvertExtensions {
    
    
    // Converts CDT types to KExpression ValueTypes if possible
    def ValueType CDTTypeConversion(int n) {
        switch (n) {
            case IASTSimpleDeclSpecifier.t_void: null
            case IASTSimpleDeclSpecifier.t_char: ValueType::STRING
            case IASTSimpleDeclSpecifier.t_int: ValueType::INT
            case IASTSimpleDeclSpecifier.t_float: ValueType::FLOAT
            case IASTSimpleDeclSpecifier.t_double: ValueType::DOUBLE
            case IASTSimpleDeclSpecifier.t_bool: ValueType::BOOL
            case IASTSimpleDeclSpecifier.t_wchar_t: ValueType::STRING
            case IASTSimpleDeclSpecifier.t_typeof: null
            case IASTSimpleDeclSpecifier.t_decltype: null
            case IASTSimpleDeclSpecifier.t_auto: null
            case IASTSimpleDeclSpecifier.t_char16_t: ValueType::STRING
            case IASTSimpleDeclSpecifier.t_char32_t: ValueType::STRING
            default: null
        }
    }
    
    // Converts the type of CDT BinaryExpression Operators to KExpression OperatorTypes if possible
    def OperatorType CDTBinaryOpTypeConversion(int n) {
        var OperatorType opType
        
        switch (n) {
            case IASTBinaryExpression.op_multiply: opType = OperatorType::MULT
            case IASTBinaryExpression.op_divide: opType = OperatorType::DIV
            case IASTBinaryExpression.op_modulo: opType = OperatorType::MOD
            case IASTBinaryExpression.op_plus: opType = OperatorType::ADD
            case IASTBinaryExpression.op_minus: opType = OperatorType::SUB
            case IASTBinaryExpression.op_shiftLeft: opType = OperatorType::SHIFT_LEFT
            case IASTBinaryExpression.op_shiftRight: opType = OperatorType::SHIFT_RIGHT
            case IASTBinaryExpression.op_lessThan: opType = OperatorType::LT
            case IASTBinaryExpression.op_greaterThan: opType = OperatorType::GT
            case IASTBinaryExpression.op_lessEqual: opType = OperatorType::LEQ
            case IASTBinaryExpression.op_greaterEqual: opType = OperatorType::GEQ
            case IASTBinaryExpression.op_binaryAnd: opType = OperatorType::BITWISE_AND
            case IASTBinaryExpression.op_binaryXor: opType = OperatorType::BITWISE_XOR
            case IASTBinaryExpression.op_binaryOr: opType = OperatorType::BITWISE_OR
            case IASTBinaryExpression.op_logicalAnd: opType = OperatorType::LOGICAL_AND
            case IASTBinaryExpression.op_logicalOr: opType = OperatorType::LOGICAL_OR
            //case IASTBinaryExpression.op_assign: opType = "="
            //case IASTBinaryExpression.op_multiplyAssign: opType = "*="
            //case IASTBinaryExpression.op_divideAssign: opType = "/="
            //case IASTBinaryExpression.op_moduloAssign: opType = "%="
            //case IASTBinaryExpression.op_plusAssign: opType = "+="
            //case IASTBinaryExpression.op_minusAssign: opType = "-="
            //case IASTBinaryExpression.op_shiftLeftAssign: opType = "<<="
            //case IASTBinaryExpression.op_shiftRightAssign: opType = ">>="
            //case IASTBinaryExpression.op_binaryAndAssign: opType = "&="
            //case IASTBinaryExpression.op_binaryXorAssign: opType = "^="
            //case IASTBinaryExpression.op_binaryOrAssign: opType = "|="
            case IASTBinaryExpression.op_equals: opType = OperatorType::EQ
            case IASTBinaryExpression.op_notequals: opType = OperatorType::NE
            //case IASTBinaryExpression.op_pmdot: opType = "pointer to member field dereference"
            //case IASTBinaryExpression.op_pmarrow: opType = "pointer to member pointer dereference"
            //case IASTBinaryExpression.op_max: opType = "op_max >?"
            //case IASTBinaryExpression.op_min: opType = "op_min <?"
            //case IASTBinaryExpression.op_ellipses: opType = "op_ellipses ..."
            default: opType = null
        }
        
        return opType
    }
    
    // Converts CDT UnaryOperatorTypes to KExpression OperatorTypes if possible
    def OperatorType CDTUnaryOpTypeConversion(int n) {
        var OperatorType opType
        
        switch (n) {
            case IASTUnaryExpression.op_prefixIncr: opType = OperatorType::POSTFIX_ADD  //++exp
            case IASTUnaryExpression.op_prefixDecr: opType = OperatorType::POSTFIX_SUB  //--exp
            case IASTUnaryExpression.op_plus: opType = OperatorType::ADD  //+exp
            case IASTUnaryExpression.op_minus: opType = OperatorType::SUB  //-exp
            case IASTUnaryExpression.op_star: opType = OperatorType::MULT  //*exp
            case IASTUnaryExpression.op_amper: opType = OperatorType::BITWISE_AND  //&exp
            case IASTUnaryExpression.op_tilde: opType = OperatorType::BITWISE_NOT  //~exp
            case IASTUnaryExpression.op_not: opType = OperatorType::NOT  //!exp
            case IASTUnaryExpression.op_sizeof: opType = null  //sizeof exp
            case IASTUnaryExpression.op_postFixIncr: opType = OperatorType::POSTFIX_ADD  //exp++
            case IASTUnaryExpression.op_postFixDecr: opType = OperatorType::POSTFIX_SUB  //exp--
            case IASTUnaryExpression.op_bracketedPrimary: opType = null  //( exp )
            case IASTUnaryExpression.op_throw: opType = null  //throw exp
            case IASTUnaryExpression.op_typeid: opType = null  //typeid( exp )
            case IASTUnaryExpression.op_typeof: opType = null  //typeof exp //should not be used
            case IASTUnaryExpression.op_alignOf: opType = null  //alignOf exp //will not be illustrated
            case IASTUnaryExpression.op_sizeofParameterPack: opType = null  //sizeof parameterPack //C++ only
            case IASTUnaryExpression.op_noexcept: opType = null  //noexcept ( exp ) //C++ only
            case IASTUnaryExpression.op_labelReference: opType = null  //label Reference
            default: opType = null
        }
        
        opType
    }
    
    // Converts a CDT BinaryOperator into a String representation
    def String CDTBinaryOpTypeToString(int n) {
        var String opType
        
        switch (n) {
            case IASTBinaryExpression.op_multiply: opType = "*"
            case IASTBinaryExpression.op_divide: opType = "/"
            case IASTBinaryExpression.op_modulo: opType = "%"
            case IASTBinaryExpression.op_plus: opType = "+"
            case IASTBinaryExpression.op_minus: opType = "-"
            case IASTBinaryExpression.op_shiftLeft: opType = "<<"
            case IASTBinaryExpression.op_shiftRight: opType = ">>"
            case IASTBinaryExpression.op_lessThan: opType = "<"
            case IASTBinaryExpression.op_greaterThan: opType = ">"
            case IASTBinaryExpression.op_lessEqual: opType = "<="
            case IASTBinaryExpression.op_greaterEqual: opType = ">="
            case IASTBinaryExpression.op_binaryAnd: opType = "&"
            case IASTBinaryExpression.op_binaryXor: opType = "^"
            case IASTBinaryExpression.op_binaryOr: opType = "|"
            case IASTBinaryExpression.op_logicalAnd: opType = "&&"
            case IASTBinaryExpression.op_logicalOr: opType = "||"
            case IASTBinaryExpression.op_assign: opType = "="
            case IASTBinaryExpression.op_multiplyAssign: opType = "*="
            case IASTBinaryExpression.op_divideAssign: opType = "/="
            case IASTBinaryExpression.op_moduloAssign: opType = "%="
            case IASTBinaryExpression.op_plusAssign: opType = "+="
            case IASTBinaryExpression.op_minusAssign: opType = "-="
            case IASTBinaryExpression.op_shiftLeftAssign: opType = "<<="
            case IASTBinaryExpression.op_shiftRightAssign: opType = ">>="
            case IASTBinaryExpression.op_binaryAndAssign: opType = "&="
            case IASTBinaryExpression.op_binaryXorAssign: opType = "^="
            case IASTBinaryExpression.op_binaryOrAssign: opType = "|="
            case IASTBinaryExpression.op_equals: opType = "=="
            case IASTBinaryExpression.op_notequals: opType = "!="
            //case IASTBinaryExpression.op_pmdot: opType = "pointer to member field dereference"
            //case IASTBinaryExpression.op_pmarrow: opType = "pointer to member pointer dereference"
            //case IASTBinaryExpression.op_max: opType = "op_max >?"
            //case IASTBinaryExpression.op_min: opType = "op_min <?"
            //case IASTBinaryExpression.op_ellipses: opType = "op_ellipses ..."
            default: opType = ""
        }
        
        return opType
    }
    
    // Converts a CDT UnaryOperator into a String representation
    def String CDTUnaryOpTypeToString(int n) {
        var String opType
        
        switch (n) {
            case IASTUnaryExpression.op_prefixIncr: opType = "++exp"
            case IASTUnaryExpression.op_prefixDecr: opType = "--exp"
            case IASTUnaryExpression.op_plus: opType = "+exp"
            case IASTUnaryExpression.op_minus: opType = "-exp"
            case IASTUnaryExpression.op_star: opType = "*exp"
            case IASTUnaryExpression.op_amper: opType = "&exp"
            case IASTUnaryExpression.op_tilde: opType = "~"
            case IASTUnaryExpression.op_not: opType = "!"
            case IASTUnaryExpression.op_sizeof: opType = null  //sizeof exp
            case IASTUnaryExpression.op_postFixIncr: opType = "++"
            case IASTUnaryExpression.op_postFixDecr: opType = "--"
            case IASTUnaryExpression.op_bracketedPrimary: opType = null  //( exp )
            case IASTUnaryExpression.op_throw: opType = null  //throw exp
            case IASTUnaryExpression.op_typeid: opType = null  //typeid( exp )
            case IASTUnaryExpression.op_typeof: opType = null  //typeof exp //should not be used
            case IASTUnaryExpression.op_alignOf: opType = null  //alignOf exp //will not be illustrated
            case IASTUnaryExpression.op_sizeofParameterPack: opType = null  //sizeof parameterPack //C++ only
            case IASTUnaryExpression.op_noexcept: opType = null  //noexcept ( exp ) //C++ only
            case IASTUnaryExpression.op_labelReference: opType = null  //label Reference
            default: opType = ""
        }
        
        opType
    }
    
}