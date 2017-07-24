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
package de.cau.cs.kieler.scg.codegen

import de.cau.cs.kieler.scg.extensions.SCGSerializeHRExtensions
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.BoolValue

/**
 * @author ssm
 *
 */
class SCG2CSerializeHRExtensions extends SCGSerializeHRExtensions {
    
    @Accessors var String valuedObjectPrefix
    @Accessors var String prePrefix 
    
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
    
    protected override CharSequence serializeHROperatorExpressionPRE(OperatorExpression expression) {
        val prefix = valuedObjectPrefix
        valuedObjectPrefix = valuedObjectPrefix + prePrefix
        val s = expression.subExpressions.head.serializeHR
        valuedObjectPrefix = prefix
        return s
    }  
    
    override dispatch CharSequence serialize(BoolValue expression) {
        if(expression.value == true) return "1"
        return "0"
    }
    
}