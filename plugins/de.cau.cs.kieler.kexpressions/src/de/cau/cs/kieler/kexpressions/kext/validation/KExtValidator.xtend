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

import org.eclipse.xtext.validation.Check
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.ValueType

/**
 * @author ssm
 * @kieler.design 2017-05-15 proposed 
 * @kieler.rating 2017-05-15 proposed yellow
 */
class KExtValidator extends de.cau.cs.kieler.kexpressions.kext.validation.AbstractKExtJavaValidator {
    
    static val WRONG_CARDINALITY_TYPE = "Array cardinalities must be an int literal or a reference to a constant int object." 

    @Check
    def void checkConstDeclarationInArrays(Declaration declaration) {
        for (vo : declaration.valuedObjects) {
            for (card : vo.cardinalities) {
                var ok = false
                if (card instanceof IntValue) ok = true
                if (card instanceof ValuedObjectReference) {
                    val refVO = card.valuedObject
                    val refDecl = refVO.eContainer as Declaration
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

}
