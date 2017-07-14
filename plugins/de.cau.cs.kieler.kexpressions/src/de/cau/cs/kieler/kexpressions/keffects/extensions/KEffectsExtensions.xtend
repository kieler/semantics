/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2016 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kexpressions.keffects.extensions

import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.keffects.HostcodeEffect
import de.cau.cs.kieler.kexpressions.keffects.ReferenceCallEffect
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.CombineOperator

/**
 * @author ssm
 *
 * @kieler.design 2016-01-07 proposed ssm
 * @kieler.rating 2016-01-07 proposed yellow
 */
class KEffectsExtensions {
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsComplexCreateExtensions    
    
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
   
    def ReferenceCallEffect createReferenceCallEffect() {
        KEffectsFactory::eINSTANCE.createReferenceCallEffect()
    }
    
    
    def createEmission() {
        KEffectsFactory::eINSTANCE.createEmission
    }

    // was assign
    def createAssignment(ValuedObject valuedObject) {
        KEffectsFactory::eINSTANCE.createAssignment => [ it.valuedObject = valuedObject ]
    }

    // was assignRelative
    def Assignment createRelativeAssignmentWithOr(ValuedObject valuedObject, Expression newValue) {
        valuedObject.createAssignment(valuedObject.reference.or(newValue))
    }
    
    
    // was assignRelativeAnd
    def Assignment createRelativeAssignmentWithAnd(ValuedObject valuedObject, Expression newValue) {
        valuedObject.createAssignment(valuedObject.reference.and(newValue))
    }    
    
    // was assingCombined
    def Assignment createCombinedAssignment(ValuedObject valuedObject, Expression newValue) {
        if (valuedObject.combineOperator == CombineOperator::AND) {
            return valuedObject.createAssignment(valuedObject.reference.and(newValue))
        } else if (valuedObject.combineOperator == CombineOperator::OR) {
            return valuedObject.createAssignment(valuedObject.reference.or(newValue))
        } else if (valuedObject.combineOperator == CombineOperator::ADD) {
            return valuedObject.createAssignment(valuedObject.reference.add(newValue))
        } else if (valuedObject.combineOperator == CombineOperator::MULT) {
            return valuedObject.createAssignment(valuedObject.reference.mult(newValue))
        } else if (valuedObject.combineOperator == CombineOperator::MAX) {
            return valuedObject.createAssignment(valuedObject.reference.max(newValue))
        } else if (valuedObject.combineOperator == CombineOperator::MIN) {
            return valuedObject.createAssignment(valuedObject.reference.min(newValue))
        }
        return valuedObject.createAssignment(newValue)
    }
    

    def createHostcodeEffect(String text) {
        KEffectsFactory::eINSTANCE.createHostcodeEffect => [  it.text = text ]
    }

    def createEmission(ValuedObject valuedObject) {
        KEffectsFactory::eINSTANCE.createEmission => [ it.valuedObject = valuedObject ]
    }
    
    def emit(ValuedObject valuedObject) {
        valuedObject.createEmission
    }

    def createEmission(ValuedObject valuedObject, Expression newValue) {
        KEffectsFactory::eINSTANCE.createEmission => [ 
            it.valuedObject = valuedObject
            it.newValue = newValue
        ]
    }    
     
    def emit(ValuedObject valuedObject, Expression newValue) {
        valuedObject.createEmission(newValue)
    }

}