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
package de.cau.cs.kieler.scg.processors.transformators.dependencies

import de.cau.cs.kieler.kexpressions.ValuedObject
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.Expression
import java.util.List
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions

/**
 * @author ssm
 *
 */
class ValuedObjectIdentifier {
    
    @Accessors ValuedObject valuedObject
    @Accessors List<Expression> indices
    
    static val KExpressionsCompareExtensions compare = new KExpressionsCompareExtensions
    
    protected new() {}
    
    new(Assignment assignment) {
        this.valuedObject = assignment.valuedObject
        this.indices = assignment.indices.removeDynamicIndices
    }
    
    new(ValuedObjectReference valuedObjectReference) {
        this.valuedObject = valuedObjectReference.valuedObject
        this.indices = valuedObjectReference.indices.removeDynamicIndices
    }
    
    def getGenericIdentifier() {
        new ValuedObjectIdentifier => [
            it.valuedObject = this.valuedObject
            it.indices = null
        ]
    }
    
    def isSpecificIdentifier() {
        indices != null
    }
    
    protected def List<Expression> removeDynamicIndices(List<Expression> indices) {
        if (indices == null || indices.size == 0) return null
        val indexList = <Expression> newArrayList
        
        for (index : indices) {
            if (index instanceof ValuedObjectReference) {
                return null
            } else if (index instanceof OperatorExpression) {
                if (index.eAllContents.filter(ValuedObjectReference).size > 0) {
                    return null
                }
            }
            indexList += index
        }         
        indexList
    }
    
    override int hashCode() {
        if (valuedObject == null) return 0;
        valuedObject.hashCode
    }
    
    override boolean equals(Object object) {
        if (object instanceof ValuedObjectIdentifier) {
            if (this.valuedObject != object.valuedObject) return false
            if (this.indices == null) {
                if (object.indices == null) return true else return false
            } else {
                if (object.indices == null) {
                    return false 
                } else {
                    if (this.indices.size != object.indices.size) {
                        return false 
                    } else {
                        var i = 0
                        for (index : this.indices) {
                            val oIndex = object.indices.get(i)
                            if (!compare.equals2(index, oIndex)) {
                                return false
                            }
                            i++
                        }
                        return true
                    }
                }
            }     
        } else {
            return false
        }
    }
}