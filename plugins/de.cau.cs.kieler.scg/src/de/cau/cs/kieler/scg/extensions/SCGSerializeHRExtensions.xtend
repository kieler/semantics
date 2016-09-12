package de.cau.cs.kieler.scg.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeHRExtensions
import de.cau.cs.kieler.scg.Assignment
import java.util.List

/**
 * @author ssm
 * 
 * @kieler.design 2015-09-17 proposed ssm
 * @kieler.rating 2015-09-17 proposed yellow
 *
 */
class SCGSerializeHRExtensions extends KEffectsSerializeHRExtensions {
    
    @Inject
    extension KEffectsExtensions

    dispatch def CharSequence serialize(Assignment assignment) {
        if (assignment.valuedObject != null) {
            var CharSequence assignmentText = ""
            if (assignment.assignment != null && !assignment.operator.isPostfixOperator) {
                assignmentText = serialize(assignment.assignment)
            }
            var valuedObjectName = assignment.valuedObject.name
            if (!assignment.indices.nullOrEmpty) {
                valuedObjectName = valuedObjectName + serializeIndices(assignment.indices)
            }
            if (assignment.assignment instanceof TextExpression) {
                assignmentText = (assignment.assignment as TextExpression).text
            }
            var assignmentStr = valuedObjectName + assignment.operator.serializeAssignOperator + assignmentText
            assignmentStr
        } else if (assignment.assignment instanceof TextExpression) {
            (assignment.assignment as TextExpression).text
        } else if (assignment.assignment instanceof FunctionCall) {
            serialize(assignment.assignment) 
        }
    }
    
    dispatch def CharSequence serializeHR(Assignment assignment) {
        if (assignment.valuedObject != null) {
            var CharSequence assignmentText = ""
            if (assignment.assignment != null && !assignment.operator.isPostfixOperator) {
                assignmentText = serializeHR(assignment.assignment)
            }
            var valuedObjectName = assignment.valuedObject.name
            if (!assignment.indices.nullOrEmpty) {
                valuedObjectName = valuedObjectName + serializeHRIndices(assignment.indices)
            }
            if (assignment.assignment instanceof TextExpression) {
                assignmentText = (assignment.assignment as TextExpression).text
            }
            var assignmentStr = valuedObjectName + assignment.operator.serializeAssignOperator + assignmentText
            assignmentStr
        } else if (assignment.assignment instanceof TextExpression) {
            (assignment.assignment as TextExpression).text
        } else if (assignment.assignment instanceof FunctionCall) {
            serialize(assignment.assignment) 
        }
    }
    
    dispatch override CharSequence serialize(FunctionCall fc) {
        var funcCall = fc.functionName + "("

        var cnt = 0
        for (par : fc.parameters) {
            if (cnt > 0) {
                funcCall = funcCall + ", "
            }
            if (par.pureOutput) {
                funcCall = funcCall + "!"
            }
            if (par.callByReference) {
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