package de.cau.cs.kieler.scg.extensions

import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsSerializeHumanReadableExtensions
import de.cau.cs.kieler.scg.Assignment
import java.util.List

/**
 * @author ssm
 * 
 * @kieler.design 2015-09-17 proposed ssm
 * @kieler.rating 2015-09-17 proposed yellow
 *
 */
class SCGSerializeHumanReadableExtensions extends KExpressionsSerializeHumanReadableExtensions {	

    dispatch def CharSequence serialize(Assignment assignment) {
        if (assignment.valuedObject != null && assignment.assignment != null) {
            var assignmentText = serialize(assignment.assignment)
            var valuedObjectName = assignment.valuedObject.name
            if (!assignment.indices.nullOrEmpty) {
                valuedObjectName = valuedObjectName + serializeIndices(assignment.indices)
            }
            if (assignment.assignment instanceof TextExpression) {
                assignmentText = (assignment.assignment as TextExpression).text
            }
            var assignmentStr = valuedObjectName + " = " + assignmentText
            assignmentStr
        } else if (assignment.assignment instanceof TextExpression) {
            (assignment.assignment as TextExpression).text
        } else if (assignment.assignment instanceof FunctionCall) {
            serialize(assignment.assignment) 
        }
    }
    
    dispatch def CharSequence serializeHR(Assignment assignment) {
        if (assignment.valuedObject != null && assignment.assignment != null) {
            var assignmentText = serializeHR(assignment.assignment)
            var valuedObjectName = assignment.valuedObject.name
            if (!assignment.indices.nullOrEmpty) {
                valuedObjectName = valuedObjectName + serializeHRIndices(assignment.indices)
            }
            if (assignment.assignment instanceof TextExpression) {
                assignmentText = (assignment.assignment as TextExpression).text
            }
            var assignmentStr = valuedObjectName + " = " + assignmentText
            assignmentStr
        } else if (assignment.assignment instanceof TextExpression) {
            (assignment.assignment as TextExpression).text
        } else if (assignment.assignment instanceof FunctionCall) {
            serialize(assignment.assignment) 
        }
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