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
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration

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
    val semanticReferenceIndex = <Pair<ValuedObject, ValuedObject>, Expression> newHashMap

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
                } else if (declaration instanceof ReferenceDeclaration) {
                    wire.semanticSourceReferenceDeclaration = declaration 
                }
            }
            OperatorExpression: {
                for (expression : source.subExpressions) {
                    expression.create(source)
                }    
            }
        }
        
        switch(sink) {
            ValuedObjectReference: {
                val declaration = sink.valuedObject.declaration
                if (declaration instanceof VariableDeclaration) {
                    wire.sinkIsInterface = declaration.output
                } else if (declaration instanceof ReferenceDeclaration) {
                    wire.semanticSinkReferenceDeclaration = declaration 
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
            var existingSemanticReference = semanticReferenceIndex.get(new Pair<ValuedObject, ValuedObject>(source.valuedObject, null))
            if (existingSemanticReference != null) {
                // Directly connect the semantic source to the source of an already existing wire. 
                if (existingSemanticReference instanceof ValuedObjectReference) {
                    val existingWire = existingSemanticReference.getSemanticSinkWire
                    if (existingWire != null) {
                        existingSemanticReference = existingWire.semanticSource
                    }
                }
                semanticSource = existingSemanticReference
            } else {
                semanticReferenceIndex.put(new Pair<ValuedObject, ValuedObject>(source.valuedObject, null), source)
            }
        } 
        if (sink instanceof ValuedObjectReference) {
            val srValuedObject = null //if (sink.subReference != null) sink.subReference.valuedObject else null
            val existingSemanticReference = semanticReferenceIndex.get(new Pair<ValuedObject, ValuedObject>(sink.valuedObject, srValuedObject))
            if (existingSemanticReference != null) {
                semanticSink = existingSemanticReference
            } else {
                semanticReferenceIndex.put(new Pair<ValuedObject, ValuedObject>(sink.valuedObject, srValuedObject), sink)
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
    
    def Wire getSemanticSourceWire(ValuedObjectReference valuedObjectReference) {
        val expression = semanticReferenceIndex.get(new Pair<ValuedObject, ValuedObject>(valuedObjectReference.valuedObject, null))
        for (wire : wires) {
            if (wire.semanticSource == expression) return wire
        }
        return null
    }

    def Wire getSemanticSinkWire(ValuedObjectReference valuedObjectReference) {
        val expression = semanticReferenceIndex.get(new Pair<ValuedObject, ValuedObject>(valuedObjectReference.valuedObject, null))
        for (wire : wires) {
            if (wire.semanticSink == expression) return wire
        }
        return null
    }
    
}