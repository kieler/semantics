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
package de.cau.cs.kieler.core.kexpressions.keffects.extensions

import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsSerializeHumanReadableExtensions
import de.cau.cs.kieler.core.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.core.kexpressions.keffects.Assignment
import de.cau.cs.kieler.core.kexpressions.keffects.Effect
import de.cau.cs.kieler.core.kexpressions.keffects.Emission
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference

/**
 * @author ssm
 *
 * @kieler.design 2015-06-08 proposed ssm
 * @kieler.rating 2015-06-08 proposed yellow
 */
class KEffectsSerializeExtensions extends KExpressionsSerializeHumanReadableExtensions {
    
    public def CharSequence serializeAssignment(Assignment assignment, CharSequence expressionString) {
        var res = assignment.valuedObject.name
        if (!assignment.indices.nullOrEmpty) {
            for(index : assignment.indices) {
                res = res + "[" + index.serialize + "]"
            }
        }
        
        if (assignment.operator == AssignOperator::ASSIGN) {
            res = res + " = " 
        } else 
        if (assignment.operator == AssignOperator::ASSIGNADD) {
            res = res + " += " 
        } else 
        if (assignment.operator == AssignOperator::ASSIGNSUB) {
            res = res + " -= " 
        } else 
        if (assignment.operator == AssignOperator::ASSIGNMUL) {
            res = res + " *= " 
        } else 
        if (assignment.operator == AssignOperator::ASSIGNDIV) {
            res = res + " /= " 
        } else 
        if (assignment.operator == AssignOperator::POSTFIXADD) {
            res = res + "++"
            return res; 
        } else 
        if (assignment.operator == AssignOperator::POSTFIXSUB) {
            res = res + "--"
            return res; 
        }  
        
        return res + expressionString
    }
    
    def dispatch CharSequence serialize(Assignment assignment) {
        assignment.serializeAssignment(assignment.expression.serialize)
    }
    
    def dispatch CharSequence serialize(Emission emission) {
        val objectContainer = emission.valuedObject.eContainer
        if (objectContainer instanceof Declaration) {
            if ((objectContainer as Declaration).type != ValueType::PURE) {
                return (emission.valuedObject.name + "(" + emission.newValue.serialize + ")")             
            } else {
                return emission.valuedObject.name
            }
        } else {
            return emission.valuedObject.name
        }
    }
    
    def dispatch CharSequence serialize(EList<Effect> effects) {
        if (!effects.empty) {
            var String label = "" 
            for(effect : effects) {
                label = label + effect.serialize as String + "; "
            }
            label = label.substring(0, label.length - 2)
            return label
        }
        return ""
    }
    
    def dispatch CharSequence serializeHR(Assignment assignment) {
        if (assignment.expression == null) {
            assignment.serializeAssignment("")
        } else {
            assignment.serializeAssignment(assignment.expression.serialize.humanReadable)
        }
    }
    
    def dispatch CharSequence serializeHR(Emission emission) {
        val objectContainer = emission.valuedObject.eContainer
        if (objectContainer instanceof Declaration) {
            if ((objectContainer as Declaration).type != ValueType::PURE) {
                return (emission.valuedObject.name + "(" + emission.newValue.serializeHR + ")")             
            } else {
                return emission.valuedObject.name
            }
        } else {
            return emission.valuedObject.name
        }
    }
    
    
    
//    override dispatch CharSequence serializeHR(FunctionCall functionCall) {
//    	super.serializeHR(functionCall)
//    }    
//    
//    override dispatch CharSequence serializeHR(ValuedObjectReference valuedObjectReference) {
//    	super.serializeHR(valuedObjectReference)
//    }
//
//    override dispatch CharSequence serializeHR(OperatorExpression expression) {
//    	super.serializeHR(expression)
//    }
//    
//    override dispatch CharSequence serializeHR(Expression expression) {
//        super.serializeHR(expression)
//    }
}