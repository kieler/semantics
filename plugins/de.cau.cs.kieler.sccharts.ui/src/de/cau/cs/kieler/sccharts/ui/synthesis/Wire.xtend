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
package de.cau.cs.kieler.sccharts.ui.synthesis

import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.OperatorExpression
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.sccharts.Scope

/**
 * @author ssm
 * @kieler.design 2017-09-26 proposed
 * @kieler.rating 2017-09-26 proposed yellow
 * 
 */
class Wire {

    @Accessors var Value value = null
    @Accessors var ValuedObjectReference valuedObjectReference = null
    @Accessors var OperatorExpression operatorExpression = null
    @Accessors var ValuedObjectReference subReference = null
    @Accessors var Wiring wiring = null
    @Accessors var boolean sink = false
    @Accessors var Assignment equation = null
    @Accessors var Wire redirectedWire = null 
    @Accessors var ReferenceDeclaration referenceDeclaration = null

    new(Expression expression, Wiring wiring, ValuedObjectReference subReference) {
        this.wiring = wiring
        switch (expression) {
            Value:
                this.value = expression
            ValuedObjectReference: {
                this.valuedObjectReference = expression
                val valuedObject = expression.valuedObject
                if (valuedObject.eContainer instanceof ReferenceDeclaration) {
                    this.referenceDeclaration = valuedObject.eContainer as ReferenceDeclaration
                    this.subReference = subReference                
                }
            }
            OperatorExpression: {
                this.operatorExpression = expression
                if (wiring != null)
                for (subExpression : expression.subExpressions) {
                    switch (subExpression) {
                        Value: wiring.getWire(subExpression)
                        ValuedObjectReference: wiring.getWire(subExpression)
                        OperatorExpression: wiring.getWire(subExpression)
                    }
                }
            }
        }
        if(wiring != null) wiring.add(this)
    }

    def Expression getExpression() {
        if (value != null)
            return value
        else if(valuedObjectReference != null) return valuedObjectReference else return operatorExpression
    }

    override equals(Object object) {
        if (object instanceof Wire) {
            if (value != null) {
                return value.equals(object.value)
            } else if (valuedObjectReference != null) {
                return valuedObjectReference.valuedObject.equals(object.valuedObjectReference.valuedObject)
            } else {
                return operatorExpression.equals(object.operatorExpression)
            }
        } else {
            return false
        }
    }

    override int hashCode() {
        if (value != null) {
            return value.hashCode
        } else if (valuedObjectReference != null) {
            return valuedObjectReference.valuedObject.hashCode
        } else {
            return operatorExpression.hashCode
        }
    }
    
    def Scope getReference() {
        if (referenceDeclaration == null) return null
        return referenceDeclaration.reference as Scope
    }
}
