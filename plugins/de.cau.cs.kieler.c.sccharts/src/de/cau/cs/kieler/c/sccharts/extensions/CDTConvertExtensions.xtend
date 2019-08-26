package de.cau.cs.kieler.c.sccharts.extensions

import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType

class CDTConvertExtensions {
    
    def ValueType CDTTypeConversion(int n) {
        switch n {
            case 1: null
            case 2: ValueType::STRING
            case 3: ValueType::INT
            case 4: ValueType::FLOAT
            case 5: ValueType::DOUBLE
            case 6: ValueType::BOOL
            case 7: ValueType::STRING
            case 8: null
            case 9: null
            case 10: null
            case 11: ValueType::STRING
            case 12: ValueType::STRING
            default: null
        }
    }
    
    def OperatorType CDTBinaryOpTypeConversion(int n) {
        var OperatorType opType
        
        switch(n) {
            case 1: opType = OperatorType::MULT
            case 2: opType = OperatorType::DIV
            case 3: opType = OperatorType::MOD
            case 4: opType = OperatorType::ADD
            case 5: opType = OperatorType::SUB
            case 6: opType = OperatorType::SHIFT_LEFT
            case 7: opType = OperatorType::SHIFT_RIGHT
            case 8: opType = OperatorType::LT
            case 9: opType = OperatorType::GT
            case 10: opType = OperatorType::LEQ
            case 11: opType = OperatorType::GEQ
            case 12: opType = OperatorType::BITWISE_AND
            case 13: opType = OperatorType::BITWISE_XOR
            case 14: opType = OperatorType::BITWISE_OR
            case 15: opType = OperatorType::LOGICAL_AND
            case 16: opType = OperatorType::LOGICAL_OR
            //case 17: opType = "="
            //case 18: opType = "*="
            //case 19: opType = "/="
            //case 20: opType = "%="
            //case 21: opType = "+="
            //case 22: opType = "-="
            //case 23: opType = "<<="
            //case 24: opType = ">>="
            //case 25: opType = "&="
            //case 26: opType = "^="
            //case 27: opType = "|="
            case 28: opType = OperatorType::EQ
            case 29: opType = OperatorType::NE
            //case 30: opType = "pointer to member field dereference"
            //case 31: opType = "pointer to member pointer dereference"
            //case 32: opType = "op_max >?"
            //case 33: opType = "op_min <?"
            //case 34: opType = "op_ellipses ..."
            default: opType = OperatorType::ADD //TODO DARF NICH ADD BLEIBEN!!!!!!!
        }
        
        return opType
    }
    
    def OperatorType CDTUnaryOpTypeConversion(int n) {
        var OperatorType opType
        
        switch(n) {
            case 0: opType = OperatorType::POSTFIX_ADD  //++exp
            case 1: opType = OperatorType::POSTFIX_SUB  //--exp
            case 2: opType = OperatorType::ADD  //+exp
            case 3: opType = OperatorType::SUB  //-exp
            case 4: opType = OperatorType::MULT  //*exp
            case 5: opType = OperatorType::BITWISE_AND  //&exp
            case 6: opType = OperatorType::BITWISE_NOT  //~exp
            case 7: opType = OperatorType::NOT  //!exp
            case 8: {opType = null;println("unary Type conversion found sizeofOperator")}  //sizeof exp
            case 9: opType = OperatorType::POSTFIX_ADD  //exp++
            case 10: opType = OperatorType::POSTFIX_SUB  //exp--
            case 11: opType = null  //( exp )
            case 12: opType = null  //throw exp
            case 13: opType = null  //typeid( exp )
            case 14: opType = null  //typeof exp //should not be used
            case 15: opType = null  //alignOf exp //will not be illustrated
            case 16: opType = null  //sizeof parameterPack //C++ only
            case 17: opType = null  //noexcept ( exp ) //C++ only
            case 18: opType = null  //label Reference
            default: opType = null
        }
        
        opType
    }
    
    def String CDTBinaryOpTypeToString(int n) {
        var String opType
        
        switch(n) {
            case 1: opType = "*"
            case 2: opType = "/"
            case 3: opType = "%"
            case 4: opType = "+"
            case 5: opType = "-"
            case 6: opType = "<<"
            case 7: opType = ">>"
            case 8: opType = "<"
            case 9: opType = ">"
            case 10: opType = "<="
            case 11: opType = ">="
            case 12: opType = "&"
            case 13: opType = "^"
            case 14: opType = "|"
            case 15: opType = "&&"
            case 16: opType = "||"
            case 17: opType = "="
            case 18: opType = "*="
            case 19: opType = "/="
            case 20: opType = "%="
            case 21: opType = "+="
            case 22: opType = "-="
            case 23: opType = "<<="
            case 24: opType = ">>="
            case 25: opType = "&="
            case 26: opType = "^="
            case 27: opType = "|="
            case 28: opType = "=="
            case 29: opType = "!="
            //case 30: opType = "pointer to member field dereference"
            //case 31: opType = "pointer to member pointer dereference"
            //case 32: opType = "op_max >?"
            //case 33: opType = "op_min <?"
            //case 34: opType = "op_ellipses ..."
            default: opType = ""
        }
        
        return opType
    }
    
    def String CDTUnaryOpTypeToString(int n) {
        var String opType
        
        switch(n) {
            case 0: opType = "++exp"
            case 1: opType = "--exp"
            case 2: opType = "+exp"
            case 3: opType = "-exp"
            case 4: opType = "*exp"
            case 5: opType = "&exp"
            case 6: opType = "~"
            case 7: opType = "!"
            case 8: {opType = null;println("unary Type conversion found sizeofOperator")}  //sizeof exp
            case 9: opType = "++"
            case 10: opType = "--"
            case 11: opType = null  //( exp )
            case 12: opType = null  //throw exp
            case 13: opType = null  //typeid( exp )
            case 14: opType = null  //typeof exp //should not be used
            case 15: opType = null  //alignOf exp //will not be illustrated
            case 16: opType = null  //sizeof parameterPack //C++ only
            case 17: opType = null  //noexcept ( exp ) //C++ only
            case 18: opType = null  //label Reference
            default: opType = null
        }
        
        opType
    }
    
}