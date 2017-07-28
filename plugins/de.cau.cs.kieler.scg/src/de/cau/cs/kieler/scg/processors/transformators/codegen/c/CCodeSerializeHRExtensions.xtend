/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.codegen.c

import de.cau.cs.kieler.scg.extensions.SCGSerializeHRExtensions
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.ValueType
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.ReferenceCall
import java.util.List
import de.cau.cs.kieler.kexpressions.Expression

/**
 * @author ssm
 *
 */
class CCodeSerializeHRExtensions extends SCGSerializeHRExtensions {
    
    @Inject extension KEffectsExtensions    
    
    @Accessors var String valuedObjectPrefix
    @Accessors var String prePrefix 
    
    override dispatch CharSequence serialize(ValueType valueType) {
        if (valueType == ValueType.BOOL) {
            return "char"
        } else {
            return valueType.literal
        }
    }
    
    override dispatch CharSequence serialize(ValuedObject valuedObject) {
        var vo = valuedObjectPrefix + valuedObject.name
        for (index : valuedObject.cardinalities) {
            vo = vo + "[" + index.toString + "]"
        }
        vo
    }    
    
    override dispatch CharSequence serialize(ValuedObjectReference valuedObjectReference) {
        var vo = valuedObjectPrefix + valuedObjectReference.valuedObject.name
        for (index : valuedObjectReference.indices) {
            vo = vo + "[" + index.serialize + "]"
        }
        vo
    }    
    
    override dispatch CharSequence serializeHR(ValuedObjectReference valuedObjectReference) {
        var vo = valuedObjectPrefix + valuedObjectReference.valuedObject.name
        for (index : valuedObjectReference.indices) {
            vo = vo + "[" + index.serializeHR + "]"
        }
        vo
    }    
    
    protected override CharSequence serializeHROperatorExpressionPRE(OperatorExpression expression) {
        val prefix = valuedObjectPrefix
        valuedObjectPrefix = valuedObjectPrefix + prePrefix
        val s = expression.subExpressions.head.serializeHR
        valuedObjectPrefix = prefix
        return s.toString.replaceFirst(prePrefix + "_", prePrefix)
    }  
    
    override dispatch CharSequence serialize(BoolValue expression) {
        if(expression.value == true) return "1"
        return "0"
    }
    
    public override CharSequence serializeAssignment(Assignment assignment, CharSequence expressionStr) {
        var res = ""
        
        if (assignment.valuedObject != null) {
            res = res + valuedObjectPrefix + assignment.valuedObject.name
            if (!assignment.indices.nullOrEmpty) {
                for(index : assignment.indices) {
                    res = res + "[" + index.serialize + "]"
                }
            }
            
            res = res + assignment.operator.serializeAssignOperator
        }
        if (expressionStr != null) {
            res = res + expressionStr
        }
        
        return res
    }   
    
    dispatch override CharSequence serializeHR(de.cau.cs.kieler.scg.Assignment assignment) {
        if (assignment.valuedObject != null) {
            var CharSequence assignmentText = ""
            if (assignment.expression != null && !assignment.operator.isPostfixOperator) {
                assignmentText = serializeHR(assignment.expression)
            }
            var valuedObjectName = valuedObjectPrefix + assignment.valuedObject.name
            if (!assignment.indices.nullOrEmpty) {
                valuedObjectName = valuedObjectName + serializeHRIndices(assignment.indices)
            }
            if (assignment.expression instanceof TextExpression) {
                assignmentText = (assignment.expression as TextExpression).text
            }
            var assignmentStr = valuedObjectName + assignment.operator.serializeAssignOperator + assignmentText
            assignmentStr
        } else if (assignment.expression instanceof TextExpression) {
            (assignment.expression as TextExpression).text
        } else if (assignment.expression instanceof FunctionCall) {
            serialize(assignment.expression) 
        }
        else if (assignment.expression instanceof ReferenceCall) {
            (assignment.expression as ReferenceCall).serializeHR
        }
    }    
    
    protected override CharSequence serializeHRIndices(List<Expression> indices) {
        var String indicesStr = ""
        for(index : indices) {
            indicesStr = indicesStr + "[" + 
                serializeHR(index)
                + "]"          
        }
        indicesStr
    }     
    
    
}