/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.extensions

import de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.Assignment
import de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.KEffectsFactory
import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.legacy.kexpressions.Expression
import de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.HostcodeEffect

/**
 * @author ssm
 *
 * @kieler.design 2016-01-07 proposed ssm
 * @kieler.rating 2016-01-07 proposed yellow
 */
class KEffectsExtensions {
    
    def isPostfixOperator(AssignOperator operator) {
        operator == AssignOperator.POSTFIXADD || operator == AssignOperator.POSTFIXSUB
    }
    
    def isPostfixOperation(Assignment assignment) {
        assignment.operator.isPostfixOperator
    }
    
    def Assignment createAssignment() {
        KEffectsFactory.eINSTANCE.createAssignment
    }

    def Assignment createAssignment(ValuedObject valuedObject, Expression expression) {
        KEffectsFactory.eINSTANCE.createAssignment => [
            it.valuedObject = valuedObject
            it.expression = expression
        ]
    }
    
   // Convert a String into a host code effect
   def HostcodeEffect asHostcodeEffect(String hostCode) {
       val effect = KEffectsFactory::eINSTANCE.createHostcodeEffect()
       effect.text = hostCode;
       effect        
   }    

}