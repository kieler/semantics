/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kexpressions.keffects.extensions

import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.kexpressions.keffects.Emission
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.keffects.PrintCallEffect
import de.cau.cs.kieler.kexpressions.keffects.ReferenceCallEffect
import de.cau.cs.kieler.kexpressions.keffects.RandomizeCallEffect

/**
 * Serialization of KEffects in human readable form.
 * 
 * @author ssm
 *
 * @kieler.design 2015-06-08 proposed ssm
 * @kieler.rating 2015-06-08 proposed yellow
 */
class KEffectsSerializeHRExtensions extends KEffectsSerializeExtensions {
        
    def dispatch CharSequence serializeHR(Assignment assignment) {
        if (assignment.expression === null) {
            assignment.serializeAssignment("")
        } else {
            assignment.serializeAssignment(assignment.expression.serializeHR)
        }
    }
    
    def dispatch CharSequence serializeHR(Emission emission) {
        val valuedObjectContainer = emission.reference.valuedObject.eContainer
        if (valuedObjectContainer instanceof VariableDeclaration) {
            if (valuedObjectContainer.type != ValueType::PURE) {
                if (emission.newValue !== null) {
                    return (emission.reference.valuedObject.name + "(" + emission.newValue.serializeHR + ")")
                 } else {
                    return emission.reference.valuedObject.name
                 }             
            } else {
                return emission.reference.valuedObject.name
            }
        } else {
            return emission.reference.valuedObject.name
        }
    }
    
    def dispatch CharSequence serializeHR(EList<Effect> effects) {
        if (!effects.empty) {
            var String label = "" 
            for(effect : effects) {
                label = label + effect.serializeHR + "; "
            }
            label = label.substring(0, label.length - 2)
            return label
        }
        return ""
    }    
    
    def dispatch CharSequence serializeHR(PrintCallEffect printCallEffect) {
        var paramStr = printCallEffect.parameters.serializeHRParameters.toString
        
        return "print(" + paramStr.substring(1, paramStr.length - 1) + ")"
    }    
    
    def dispatch CharSequence serializeHR(ReferenceCallEffect referenceCallEffect) {
        var text = new StringBuilder()
        if (referenceCallEffect.super) {
            text.append("super.")
        }
        text.append(referenceCallEffect.serializeVOR)
        text.append(referenceCallEffect.parameters.serializeHRParameters)
        return text
    }
    
    def dispatch CharSequence serializeHR(RandomizeCallEffect randomizeCallEffect) {
        return "randomize";
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