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
import de.cau.cs.kieler.kexpressions.keffects.Emission
import org.eclipse.emf.common.util.EList

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
            it.reference = valuedObject.reference
            it.expression = expression
        ]
    }
    
    def Assignment createAssignment(ValuedObject valuedObject, Expression expression, AssignOperator operator) {
        KEffectsFactory.eINSTANCE.createAssignment => [
            it.reference = valuedObject.reference
            it.expression = expression
            it.operator = operator
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
        KEffectsFactory::eINSTANCE.createAssignment => [ it.reference = valuedObject.reference ]
    }

    // was assignRelative
    def Assignment createRelativeAssignmentWithOr(ValuedObject valuedObject, Expression newValue) {
        valuedObject.createAssignment(newValue, AssignOperator.ASSIGNOR)
    }
    
    
    // was assignRelativeAnd
    def Assignment createRelativeAssignmentWithAnd(ValuedObject valuedObject, Expression newValue) {
        valuedObject.createAssignment(newValue, AssignOperator.ASSIGNAND)
    }    
    
    // was assingCombined
    def Assignment createCombinedAssignment(ValuedObject valuedObject, Expression newValue) {
        val op = switch(valuedObject.combineOperator) {
            case ADD: AssignOperator.ASSIGNADD
            case AND: AssignOperator.ASSIGNAND
            case MAX: AssignOperator.ASSIGNMAX
            case MIN: AssignOperator.ASSIGNMIN
            case MULT: AssignOperator.ASSIGNMUL
            case OR: AssignOperator.ASSIGNOR
            default: AssignOperator.ASSIGN
        }
        return valuedObject.createAssignment(newValue, op)
    }
    
    def Assignment setValuedObject(Assignment assignment, ValuedObject valuedObject) {
        if (assignment.reference == null) {
            assignment.reference = valuedObject.reference
        } else {
            assignment.reference.valuedObject = valuedObject
        }
        assignment
    }
    
    def ValuedObject getValuedObject(Assignment assignment) {
        if (assignment.reference == null) null else assignment.reference.valuedObject
    }
    
    def EList<Expression> getIndices(Assignment assignment) {
        if (assignment.reference == null) {
            return null
        } else {
            return assignment.reference.indices
        }
    }
    
    def getAllAssignmentReferences(Assignment assignment) {
        assignment.reference.allReferences + assignment.expression.allReferences
    }
    
    
    def createHostcodeEffect(String text) {
        KEffectsFactory::eINSTANCE.createHostcodeEffect => [  it.text = text ]
    }

    def createEmission(ValuedObject valuedObject) {
        KEffectsFactory::eINSTANCE.createEmission => [ it.reference = valuedObject.reference ]
    }
    
    def emit(ValuedObject valuedObject) {
        valuedObject.createEmission
    }

    def createEmission(ValuedObject valuedObject, Expression newValue) {
        KEffectsFactory::eINSTANCE.createEmission => [ 
            it.reference = valuedObject.reference
            it.newValue = newValue
        ]
    }    
     
    def emit(ValuedObject valuedObject, Expression newValue) {
        valuedObject.createEmission(newValue)
    }
    
    def Emission setValuedObject(Emission emission, ValuedObject valuedObject) {
        if (emission.reference == null) {
            emission.reference = valuedObject.reference
        } else {
            emission.reference.valuedObject = valuedObject
        }
        emission
    }
    
    def ValuedObject getValuedObject(Emission emission) {
        if (emission.reference == null) null else emission.reference.valuedObject
    }    

}