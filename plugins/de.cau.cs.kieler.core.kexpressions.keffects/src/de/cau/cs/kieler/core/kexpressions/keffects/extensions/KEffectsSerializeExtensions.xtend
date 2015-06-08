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

import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsSerializeExtensions
import de.cau.cs.kieler.core.kexpressions.keffects.Assignment
import de.cau.cs.kieler.core.kexpressions.keffects.Emission
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.keffects.Effect
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.core.kexpressions.ValueType

/**
 * @author ssm
 *
 * @kieler.design 2015-06-08 proposed ssm
 * @kieler.rating 2015-06-08 proposed yellow
 */
class KEffectsSerializeExtensions extends KExpressionsSerializeExtensions {
    
    def dispatch CharSequence serialize(Assignment assignment) {
        assignment.valuedObject.name + " = " + assignment.expression.serialize
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
}