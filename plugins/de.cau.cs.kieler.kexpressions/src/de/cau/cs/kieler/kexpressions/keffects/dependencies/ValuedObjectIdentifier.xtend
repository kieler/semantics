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
package de.cau.cs.kieler.kexpressions.keffects.dependencies

import com.google.inject.Guice
import com.google.inject.Injector
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsSerializeHRExtensions
import java.util.ArrayList
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * The ValuedObjectIdentifier is used to distinguish accesses to a valued object that are decidable at compile time from
 * accesses that are dynamic. Therefore, the identifier stores the valued object in question and its indices list, 
 * if it is an array. An array access is only decidable iff all indices are statically decidable.
 * Accesses that result in equal identifier will return equal hash codes and true in the equal test.
 * 
 * @author ssm
 * @kieler.design 2017-08-21 proposed 
 * @kieler.rating 2017-08-21 proposed yellow
 */
class ValuedObjectIdentifier {
    
    @Accessors ValuedObject valuedObject
    @Accessors List<Expression> indices
    @Accessors ValuedObjectIdentifier parentVOI
    @Accessors List<ScheduleObjectReference> schedule = new ArrayList(0)
    
    static val KExpressionsCompareExtensions compare = new KExpressionsCompareExtensions
    static val KExpressionsValuedObjectExtensions vos = new KExpressionsValuedObjectExtensions
    
    new(Assignment assignment) {
        var ref = vos.getLowermostReference(assignment.reference)
        this.valuedObject = ref.valuedObject
        this.indices = ref.indices.immutableCopy.removeDynamicIndices
        // If is member of class, register parent
        if (vos.isSubReference(ref)) {
            parentVOI = new ValuedObjectIdentifier(ref.eContainer as ValuedObjectReference)
        }
        this.schedule = assignment.schedule
    }
    
    new(ValuedObjectReference valuedObjectReference) {
        this.valuedObject = valuedObjectReference.valuedObject
        this.indices = valuedObjectReference.indices.immutableCopy.removeDynamicIndices
        // If is member of class, register parent
        if (vos.isSubReference(valuedObjectReference)) {
            parentVOI = new ValuedObjectIdentifier(valuedObjectReference.eContainer as ValuedObjectReference)
        }
        this.schedule = valuedObjectReference.schedule
    }
    
    new(ValuedObject valuedObjecT) {
        this.valuedObject = valuedObject
        this.indices = null
        this.parentVOI = null
    }
    
    protected new() {}
    
    def ValuedObjectIdentifier getGenericIdentifier() {
        return new ValuedObjectIdentifier => [
            it.valuedObject = this.valuedObject
            it.indices = null
            if (this.parentVOI !== null) {
                it.parentVOI = this.parentVOI.genericIdentifier
            }
        ]
    }
    
    def isArraySpecificIdentifier() {
        indices !== null
    }
    
    /**
     * removeDynamicIndices basically turns the identifier into a generic identifier due to the null list, 
     * iff one index is not determinable at compile time.
     */
    protected def List<Expression> removeDynamicIndices(List<Expression> indices) {
        if (indices === null || indices.size == 0) return null
        val indexList = <Expression> newArrayList
        
        for (index : indices) {
            if (index instanceof ValuedObjectReference) {
                return null
            } else if (index instanceof OperatorExpression) {
                if (index.eAllContents.filter(ValuedObjectReference).size > 0) {
                    return null
                }
                
                // Conservatively reject operator expressions as specific identifier. 
                // An improvement would be to evaluate the expression and accept it if the result is a valid literal.
                return null
            }
            indexList += index
        }         
        indexList
    }
    
    override int hashCode() {
        if (valuedObject === null) return 0;
        valuedObject.hashCode
    }
    
    override boolean equals(Object object) {
        if (object instanceof ValuedObjectIdentifier) {
            if (this.valuedObject != object.valuedObject) return false
            if (this.parentVOI !== null) {
                if (!this.parentVOI.equals(object.parentVOI)) {
                    return false
                }
            }
            if (this.indices === null) {
                if (object.indices === null) return true else return false
            } else {
                if (object.indices === null) {
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
    
    
    override String toString() {
        val result = new StringBuffer("VOI");
        result.append("(");
        result.append(String.format("%08x", this.hashCode()));
        result.append(")");
        result.append(" ");
        result.append(serializer.serialize(valuedObject).toString);
        if (indices !== null) {
            result.append(".")
            for (index : indices) {
                result.append("[")
                result.append(serializer.serialize(index).toString)
                result.append("]")
            }
        }
        if (parentVOI !== null) {
            result.append(".")
            result.append("parent: {")
            result.append(parentVOI.toString)
            result.append("}")
        }
        return result.toString();
    }
    
    private static Injector injector = Guice.createInjector();
    private static KEffectsSerializeHRExtensions serializer =  injector.getInstance(KEffectsSerializeHRExtensions);    
}