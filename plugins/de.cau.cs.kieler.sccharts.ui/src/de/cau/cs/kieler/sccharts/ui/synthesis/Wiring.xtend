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
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValueExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.core.model.Pair
import de.cau.cs.kieler.kexpressions.ValuedObject

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
    
    @Accessors val wires = <Wire> newLinkedHashSet
    val index = <Pair<Expression, Expression>, Wire> newHashMap
    val semanticReferenceIndex = <ValuedObject, Expression> newHashMap

    def getWires() {
        wires
    }
    
    def getWire(Expression expression) {
        return index.get(expression)
    }
    
    def createWires(List<Assignment> equations) {
        for (eq : equations) {
            eq.createWires
        }
    }
    
    def void createWires(Assignment equation) {
        equation.expression.create(equation.reference)
    }
    
    def private Wire create(Expression source, Expression sink) {
        val wire = createWire(source, sink)
        
        switch(source) {
            Value: wire.sourceIsInterface = true
            ValuedObjectReference: {
                val declaration = source.valuedObject.declaration
                if (declaration instanceof VariableDeclaration) {
                    wire.sourceIsInterface = declaration.input
                }
            }
        }
        
        wire 
    }

    def protected Wire createWire(Expression source, Expression sink) {
        val oldWire = index.get(new Pair<Expression, Expression>(source, sink))
        if (oldWire != null) return oldWire
        
        val wire = new Wire(source, sink, this) 
        
        var semanticSource = source
        var semanticSink = sink
        if (source instanceof ValuedObjectReference) {
            val existingSemanticReference = semanticReferenceIndex.get(source.valuedObject)
            if (existingSemanticReference != null) {
                semanticSource = existingSemanticReference
            } else {
                semanticReferenceIndex.put(source.valuedObject, source)
            }
        } 
        wire.semanticSource = semanticSource
        wire.semanticSink = semanticSink
        
        wires += wire
        index.put(new Pair<Expression, Expression>(source, sink), wire)
        
        return wire
    }
    
    def protected Wire getExistingWire(Expression source, Expression target) {
        return index.get(new Pair<Expression, Expression>(source, target))
    } 
    
    
}