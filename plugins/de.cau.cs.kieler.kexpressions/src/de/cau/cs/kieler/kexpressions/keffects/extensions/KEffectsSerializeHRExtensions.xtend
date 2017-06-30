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
package de.cau.cs.kieler.kexpressions.keffects.extensions

import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.kexpressions.keffects.Emission
import org.eclipse.emf.common.util.EList

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
        if (assignment.expression == null) {
            assignment.serializeAssignment("")
        } else {
            assignment.serializeAssignment(assignment.expression.serializeHR)
        }
    }
    
    def dispatch CharSequence serializeHR(Emission emission) {
        // cmot: Added NPE check
        if ((emission == null)||(emission.valuedObject == null)||(emission.valuedObject.eContainer == null)) {
            return "";
        }
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
    
    def dispatch CharSequence serializeHR(EList<Effect> effects) {
        if (!effects.empty) {
            var String label = "" 
            for(effect : effects) {
                label = label + effect.serializeHR as String + "; "
            }
            label = label.substring(0, label.length - 2)
            return label
        }
        return ""
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