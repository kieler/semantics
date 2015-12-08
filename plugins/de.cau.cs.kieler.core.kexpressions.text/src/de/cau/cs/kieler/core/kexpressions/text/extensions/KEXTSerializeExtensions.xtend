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
package de.cau.cs.kieler.core.kexpressions.text.extensions

import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.core.kexpressions.text.kext.TestEntity
import de.cau.cs.kieler.core.kexpressions.text.kext.AnnotatedExpression

/**
 * @author ssm
 *
 * @kieler.design 2015-06-09 proposed ssm
 * @kieler.rating 2015-06-09 proposed yellow
 */
class KEXTSerializeExtensions extends KEffectsSerializeExtensions {
    
    def dispatch CharSequence serialize(TestEntity entity) {
        if (entity.effect != null) {
        	return entity.effect.serialize
        } else {
        	return entity.expression.serialize
        }
    }
    
    def dispatch CharSequence serialize(AnnotatedExpression annotatedExpression) {
    	annotatedExpression.expression.serialize
    }
    
    def dispatch CharSequence serializeHR(TestEntity entity) {
        if (entity.effect != null) {
            return entity.effect.serializeHR
        } else {
            return entity.expression.serializeHR
        }
    } 
    
    def dispatch CharSequence serializeHR(AnnotatedExpression annotatedExpression) {
        annotatedExpression.expression.serializeHR
    }       

}