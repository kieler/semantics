/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kexpressions.keffects.util

import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.keffects.Assignment

/**
 * Container class für ValuedObjects
 * 
 * @author ssm
 * @kieler.design 2013-10-23 proposed 
 * @kieler.rating 2013-10-23 proposed yellow
 */
class ValuedObjectContainer {
    
    @Inject extension KExpressionsCompareExtensions
    
    private var valuedObject = null
    private var indices = <Expression> newArrayList

    def set(Assignment assignment) {
        valuedObject = assignment.valuedObject
        indices.clear
        for(e : assignment.indices) {
            indices += e
        }
    }
    
    def set(ValuedObjectReference valuedObjectReference) {
        valuedObject = valuedObjectReference.valuedObject
        indices.clear
        for(e : valuedObjectReference.indices) {
            indices += e
        }
    }
    
    override equals(Object object) {
        if (object instanceof ValuedObjectContainer) {
            if (!valuedObject.equals(object.valuedObject)) return false
            if (indices.size != object.indices.size) return false
            if (indices.size>0) {
                for(var i = 0; i < indices.size; i++) {
                    if (!indices.get(i).equals2(object.indices.get(i))) return false
                }
            }
            return true
        }
        return super.equals(object)
    }
    
    override hashCode() {
        valuedObject.hashCode
    }
    
}