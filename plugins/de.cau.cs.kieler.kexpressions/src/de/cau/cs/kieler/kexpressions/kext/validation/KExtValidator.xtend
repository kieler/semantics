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
package de.cau.cs.kieler.kexpressions.kext.validation

import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import org.eclipse.xtext.validation.Check
import de.cau.cs.kieler.kexpressions.VariableDeclaration

/**
 * @author ssm
 * @kieler.design 2017-05-15 proposed 
 * @kieler.rating 2017-05-15 proposed yellow
 */
class KExtValidator extends AbstractKExtJavaValidator {
    
    static val WRONG_CARDINALITY_TYPE = "Array cardinalities must be an int literal or a reference to a constant int object."
    static val String NO_CONST_LITERAL = "Const objects must be bound to literals";
     
    @Check
    def void checkConstDeclarationInArrays(Declaration declaration) {
        for (vo : declaration.valuedObjects) {
            for (card : vo.cardinalities) {
                var ok = false
                if (card instanceof IntValue) ok = true
                if (card instanceof ValuedObjectReference) {
                    val refVO = card.valuedObject
                    val refDecl = refVO.eContainer as VariableDeclaration
                    if (refDecl.const && refDecl.type == ValueType.INT) {
                        if (refVO.initialValue != null && refVO.initialValue instanceof IntValue) ok = true
                    }
                }
                
                if (!ok) {
                    error(WRONG_CARDINALITY_TYPE, card, null)
                } 
            }
        }
    }

   @Check
   def void checkConstBinding(VariableDeclaration declaration) {
       if (declaration.isConst) {
           for (valuedObject : declaration.getValuedObjects) {
               val initialValue = valuedObject.getInitialValue
               if (initialValue != null) {
                   var ok = false
                   // If it is a literal, it's ok.
                   if (initialValue instanceof Value) ok = true
                   
                   // If it is an subtraction operator expression with a single literal, it's ok. E.g., -12
                   if (initialValue instanceof OperatorExpression) {
                       if (initialValue.operator == OperatorType.SUB) {
                           if (initialValue.subExpressions.size == 1 &&
                               initialValue.subExpressions.head instanceof Value) ok = true
                       } 
                   }
                   if (!ok) error(NO_CONST_LITERAL, valuedObject, null, -1);
               }
           }
       }
    } 
}
