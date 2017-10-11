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

import de.cau.cs.kieler.kexpressions.Expression
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import java.util.List
import java.util.Set
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValueExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions

/**
 * @author ssm
 * @kieler.design 2017-09-26 proposed
 * @kieler.rating 2017-09-26 proposed yellow
 *
 */
class Wiring {
    
    @Inject extension KExpressionsValueExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsDeclarationExtensions    
    @Inject extension KEffectsExtensions
    
    @Accessors val wires = <Wire> newHashSet
    val index = <Expression, Wire> newHashMap

    def getWires() {
        wires
    }
    
    def getWire(Expression expression) {
        return index.get(expression)
    }
    
    def createWires(List<Assignment> equations) {
        val visited = <Expression> newHashSet 
        for (eq : equations) {
            eq.createWires(visited)
        }
    }
    
    def void createWires(Assignment equation, Set<Expression> visited) {
        equation.expression.create(visited) 
        equation.reference.create(visited) => [
            sink = equation.valuedObject.output    
        ]
    }

    def private dispatch Wire create(Value expression, Set<Expression> visited) {
        if (visited.contains(expression)) return expression.getExistingWire;
        visited += expression
        
        return expression.createWire
    }
    
    def private dispatch Wire create(ValuedObjectReference expression, Set<Expression> visited) {
        if (visited.contains(expression)) return expression.getExistingWire;
        visited += expression
        
        val declaration = expression.valuedObject.declaration
        
        if (declaration instanceof VariableDeclaration) {
            val existingWire = expression.getExistingWire  
            if (existingWire != null && !existingWire.contains(expression)) {
                existingWire.names += expression
                return existingWire => [ source = declaration.input ]
            } else {
                return expression.createWire => [ source = declaration.input ]
            }                  
        } 
    }    
    
    
    
    def protected Wire createWire(Expression expression) {
        val oldWire = index.get(expression)
        if (oldWire != null) return oldWire
        
        val wire = new Wire(expression, this) 
        wires += wire
        index.put(expression, wire)
        
        return wire
    }
    
    def protected Wire getExistingWire(Expression expression) {
        if (expression instanceof ValuedObjectReference) {
            return wires.filter[ names.filter(ValuedObjectReference).exists[ it.valuedObject == expression.valuedObject ] ].head
        }
        return null 
    } 
    
    
}