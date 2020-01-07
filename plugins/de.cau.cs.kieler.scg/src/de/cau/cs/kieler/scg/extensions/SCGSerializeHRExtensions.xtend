package de.cau.cs.kieler.scg.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.PrintCall
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsSerializeHRExtensions
import de.cau.cs.kieler.scg.Assignment
import java.util.List
import de.cau.cs.kieler.kexpressions.RandomCall
import de.cau.cs.kieler.kexpressions.RandomizeCall
import de.cau.cs.kieler.kexpressions.ParameterAccessType

/**
 * @author ssm
 * 
 * @kieler.design 2015-09-17 proposed ssm
 * @kieler.rating 2015-09-17 proposed yellow
 *
 */
class SCGSerializeHRExtensions extends KEffectsSerializeHRExtensions {
    
    @Inject extension KEffectsExtensions

    dispatch def CharSequence serialize(Assignment assignment) {
        if (assignment.valuedObject !== null) {
            var CharSequence assignmentText = ""
            if (assignment.expression !== null && !assignment.operator.isPostfixOperator) {
                assignmentText = serialize(assignment.expression)
            }
            var valuedObjectName = assignment.reference.serializeVOR.toString
            if (assignment.expression instanceof TextExpression) {
                assignmentText = (assignment.expression as TextExpression).text
            }
            var assignmentStr = valuedObjectName + assignment.operator.serializeAssignOperator + assignmentText
            assignmentStr
        } else if (assignment.expression instanceof TextExpression) {
            (assignment.expression as TextExpression).text
        } else if (assignment.expression instanceof FunctionCall) {
            serialize(assignment.expression) 
        } else if (assignment.expression instanceof PrintCall) {
            (assignment.expression as PrintCall).serialize
        } else if (assignment.expression instanceof RandomCall) {
            (assignment.expression as RandomCall).serialize
        } else if (assignment.expression instanceof RandomizeCall) {
            (assignment.expression as RandomizeCall).serialize
        }
    }
    
    dispatch def CharSequence serializeHR(Assignment assignment) {
        if (assignment.valuedObject !== null) {
            var CharSequence assignmentText = ""
            if (assignment.expression !== null && !assignment.operator.isPostfixOperator) {
                assignmentText = assignment.expression.serializeHR
            }
            var valuedObjectName = assignment.reference.serializeVOR.toString
            if (assignment.expression instanceof TextExpression) {
                assignmentText = (assignment.expression as TextExpression).text
            }
            var assignmentStr = valuedObjectName + assignment.operator.serializeAssignOperator + assignmentText
            assignmentStr
        } else if (assignment.expression instanceof TextExpression) {
            (assignment.expression as TextExpression).text
        } else if (assignment.expression instanceof FunctionCall) {
            serialize(assignment.expression) 
        } else if (assignment.expression instanceof ReferenceCall) {
            (assignment.expression as ReferenceCall).serializeHR
        } else if (assignment.expression instanceof PrintCall) {
            (assignment.expression as PrintCall).serializeHR
        } else if (assignment.expression instanceof RandomCall) {
            (assignment.expression as RandomCall).serializeHR
        } else if (assignment.expression instanceof RandomizeCall) {
            (assignment.expression as RandomizeCall).serializeHR
        }
    }
    
    dispatch override CharSequence serialize(FunctionCall fc) {
        var funcCall = fc.functionName + "("

        var cnt = 0
        for (par : fc.parameters) {
            if (cnt > 0) {
                funcCall = funcCall + ", "
            }
            if (par.accessType === ParameterAccessType.PURE_OUTPUT) {
                funcCall = funcCall + "!&"
            }
            else if (par.accessType === ParameterAccessType.CALL_BY_REFERENCE) {
                funcCall = funcCall + "&"
            }            
            funcCall = funcCall + par.expression.serialize
            cnt = cnt + 1
        }
        funcCall = funcCall + ")"
        return funcCall
    }
    
    dispatch override CharSequence serializeHR(FunctionCall fc) {
        return fc.serialize
    }
    
    protected def CharSequence serializeIndices(List<Expression> indices) {
        var String indicesStr = ""
        for(index : indices) {
            indicesStr = indicesStr + "[" + 
                serialize(index)
                + "]"          
        }
        indicesStr
    }
    
    protected def CharSequence serializeHRIndices(List<Expression> indices) {
        var String indicesStr = ""
        for(index : indices) {
            indicesStr = indicesStr + "[" + 
                serializeHR(index)
                + "]"          
        }
        indicesStr
    }        
}