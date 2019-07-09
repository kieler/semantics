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
package de.cau.cs.kieler.sccharts.ui.synthesis

import de.cau.cs.kieler.kexpressions.Expression
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import java.util.List
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kexpressions.kext.DeclarationScope
import de.cau.cs.kieler.kexpressions.IgnoreValue
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions
import java.util.Set
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import static extension  org.eclipse.xtext.EcoreUtil2.*
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.FloatValue
import java.util.Map

/**
 * The class models a wiring instance if given a list of equations (assignments).
 * 
 * @author ssm
 * @kieler.design 2017-09-26 proposed
 * @kieler.rating 2017-09-26 proposed yellow
 *
 */
class Wiring {
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension KExpressionsCompareExtensions
    @Inject extension SCChartsScopeExtensions
    
    /** The single wires */  
    @Accessors val wires = <Wire> newLinkedHashSet
    
    /** Source-Sink Wires */ 
    val index = <Pair<Expression, Expression>, Wire> newHashMap
    /** Storage for valuedObject, subObject expressions */
    val semanticReferenceIndex = <Pair<ValuedObject, ValuedObject>, Expression> newHashMap
    
    var externalCounter = 1

    /** Main method that receives the list of equations. */
    def createWires(List<Assignment> equations) {
        val processedEquations = <Assignment> newLinkedHashSet
        
        for (eq : equations) {
            // Filter out dupes that would create identical wires.
            if (eq.unprocessedEquation(processedEquations)) {
                eq.createWires
                processedEquations += eq
            }
        }
        
        // Things that must be done after all wires were created are placed in postProcess.
        postProcess
    }
    
    private def boolean unprocessedEquation(Assignment equation, Set<Assignment> processedEquations) {
        for (e : processedEquations) {
            if (equation.reference.equals2(e.reference) &&
                equation.expression.equals2(e.expression)) {
                    return false                    
            }
        }
        return true
    }
    
    /** Create a wiring for a a single assignment. */
    def void createWires(Assignment equation) {
        equation.expression.create(equation.reference, equation)
    }
    
    /** 
     * This method creates wires between a source and a sink. Usually only one wire is created, but there are exceptions.
     * Source's and sink's class type define the characteristics of the wire. 
     * For example, if a wire's source is a literal, the wire is always seen as an interface and hence always
     * creates a "source" node.
     * As another example, if the source is a vector of values then create a wire for each of the values and 
     * connect them to the sink.
     */
    private def Wire create(Expression originalSource, Expression sink, Assignment equation) {
        var source = originalSource
        if (source instanceof VectorValue) {
            // Vectors a treated differently because they potentially result in more than one wire.
            return source.resolveVectorValueSource(sink, equation)
        }
        if (source instanceof OperatorExpression) {
            if (source.operator == OperatorType.SUB && source.subExpressions.size == 1) {
                source = source.resolveSubOperatorExpressionPrefix(sink, equation)
            }
        }
        
        val wire = createWire(source, sink)
        wire.equation = equation
        
        // Depending on the source's (sink's) type, we have to set wire characteristics.
        // In the case of an operator expression, we also have to create more wires.
        var src = wire.source
        if (wire.semanticSource instanceof ValuedObjectReference) {
            if (wire.semanticSource.asValuedObjectReference.valuedObject.declaration instanceof ReferenceDeclaration) {
                src = wire.semanticSource
            }
        }
        switch(src) {
            Value: wire.sourceIsInterface = true
            ValuedObjectReference: {
                val declaration = src.valuedObject.declaration
                if (declaration instanceof VariableDeclaration) {
                    wire.sourceIsInterface = declaration.input
                    wire.sourceIsDeclaredInEquationScope = declaration.nextScope == source.nextScope
                } else if (declaration instanceof ReferenceDeclaration) {
                    wire.semanticSourceReferenceDeclaration = declaration 
                    wire.externalSourceReferenceCounter = 
                        if (declaration.isExternalReferenceDeclaration) externalCounter else 0
                }
            }
            OperatorExpression: {
                for (expression : src.subExpressions.indexed) {
                    val w = expression.value.create(source, equation)
                    w.sinkIndex = expression.key
                }    
            }
        }
        
        var snk = wire.semanticSink
        if (wire.semanticSource instanceof ValuedObjectReference) {
            if (wire.semanticSource.asValuedObjectReference.valuedObject.declaration instanceof ReferenceDeclaration) {
                snk = wire.semanticSink
            }
        }
        switch(snk) {
            ValuedObjectReference: {
                val declaration = snk.valuedObject.declaration
                if (declaration instanceof VariableDeclaration) {
                    wire.sinkIsInterface = declaration.output
                    wire.sinkIsDeclaredInEquationScope = declaration.nextScope == sink.nextScope
                } else if (declaration instanceof ReferenceDeclaration) {
                    wire.semanticSinkReferenceDeclaration = declaration 
//                    wire.externalSinkReferenceCounter = 
//                        if (declaration.isExternalReferenceDeclaration) externalCounter else 0
                }
            }
        }
        
        externalCounter++
        
        wire 
    }
    
    protected def void postProcess() {
        for (wire : wires) {
            wire.postProcess
        }
        
        for (wire : wires.filter[ sourceIsEquationTarget ].toList) {
            val semanticSinks = wires.filter[ semanticSink == wire.semanticSink ].toList
            for (w : semanticSinks.filter[ it != wire ].toList) {
                w.semanticSink = w.sink
                w.semanticSinkReferenceDeclaration = null
            }
//            if (wire.source instanceof ValuedObjectReference) {
//                wire.semanticSource = wire.source
//            }
        }
        
        for (wire : wires.filter[ sourceIsEquationTarget ].toList) {
            // This looks weird without the declaredScope test. 
            // If you want to improve this, compare DF-0018 and DX-03.
            if (wire.source instanceof OperatorExpression || wire.isSourceIsDeclaredInEquationScope) {
                wire.sourceIsEquationTarget = false
            }
//            if (!sourceWires.nullOrEmpty) {
//                wire.sourceIsEquationTarget = false
//            }
        }
    }
    
    protected def void postProcess(Wire wire) {
        var src = wire.source
        if (src instanceof ValuedObjectReference) {
            val declaration = src.valuedObject.declaration
            if (declaration instanceof VariableDeclaration) {
//                if (declaration.input) {
//                    if (src.isSelfReferencingEquation(wire.equation, wire)) {
//                        if (!(wire.sink instanceof ValuedObjectReference) || (wire.sink.asValuedObjectReference.valuedObject == src.valuedObject))
//                            wire.sourceIsEquationTarget = true
//                    }
                    src.markSelfReferencingEquation(wire)
//                }
            }
        }                
    }
    
    /** 
     * This method splits up vector values and creates wires for each value.
     * This is only possible if the sink is a referenced object (with more input ports).
     */
    protected def Wire resolveVectorValueSource(VectorValue source, Expression sink, Assignment equation) {
        var sinkTarget = sink
        val isReferenceSink = sink.getReferenceDeclarationReference instanceof DeclarationScope
        val valuedObjectList = if (isReferenceSink) sink.getReferenceDeclarationReference.asDeclarationScope.valuedObjects.filter[ input ].toList 
            else null
        var i = 0
        for (vector : source.values) {
            if (!(vector instanceof IgnoreValue)) {
                if (isReferenceSink) {
                    if (i < valuedObjectList.size) {
                        sinkTarget = sink.asValuedObjectReference.valuedObject.reference 
                        sinkTarget.asValuedObjectReference.subReference = valuedObjectList.get(i).reference
                     } else {
                         sinkTarget = sink
                     }
                }
                vector.create(sinkTarget, equation)
            }
            i++
        }
        return null
    }

    /** 
     * This method create a single wire between a source and a sink.
     * Before creating a wire, the method checks if such a wire already exists and returns it if so.
     * Additionally, even if such a wire does not exist, it is possible that a semantic source or sink of the wire exists.
     * For example, if you assign "A = I" and then "O = A" then both A and O will have I as source.
     * The method redirects semantic sources and sinks automatically. 
     */
    protected def Wire createWire(Expression source, Expression sink) {
        val oldWire = index.get(new Pair<Expression, Expression>(source, sink))
        if (oldWire !== null) return oldWire
        
        val wire = new Wire(source, sink, this) 
        
        var semanticSource = source
        var semanticSink = sink
        
        if (source instanceof ValuedObjectReference) {
//            if (source.isInputVariableReference) {
            
                if (source.subReference !== null) {
                    wire.semanticSourceSubReference = source.subReference
                }
                
                var existingSemanticReference = semanticReferenceIndex.get(new Pair<ValuedObject, ValuedObject>(source.valuedObject, null))
                if (existingSemanticReference !== null) {
                    // Directly connect the semantic source to the source of an already existing wire. 
                    if (existingSemanticReference instanceof ValuedObjectReference) {
                        if (source.subReference === null) {
                            val existingWire = existingSemanticReference.getSemanticSinkWire
                            if (existingWire !== null) {
                                // We don't want to use the existing semantic wire to the node if the subreference points to 
                                // a referenced node. Therefore, only redirect to the existing wire if there is no subreference. 
                                semanticSource = existingWire.semanticSource
                                wire.semanticSourceSubReference = existingWire.semanticSourceSubReference
                            } else {
                                semanticSource = existingSemanticReference
                            }
                        } else {
                            semanticSource = existingSemanticReference
                        }
                    }
                } else {
                    semanticReferenceIndex.put(new Pair<ValuedObject, ValuedObject>(source.valuedObject, null), source)
                }
//            }
        }
        
         
        if (sink instanceof ValuedObjectReference) {
//            if (sink.isOutputVariableReference) {
            
                if (sink.subReference !== null) {
                    wire.semanticSinkSubReference = sink.subReference
                }
                
                val srValuedObject = null // if (sink.subReference != null) sink.subReference.valuedObject else null
                val existingSemanticReference = semanticReferenceIndex.get(new Pair<ValuedObject, ValuedObject>(sink.valuedObject, srValuedObject))
                if (existingSemanticReference !== null) {
                    if (existingSemanticReference instanceof ValuedObjectReference) {
                        if (sink.subReference === null) {
                            val existingWire = existingSemanticReference.getSemanticSourceWire
                            if (existingWire !== null) {
                                semanticSink = existingWire.semanticSink
                                wire.semanticSinkSubReference = existingWire.semanticSinkSubReference
                            } 
                        } else {
                            semanticSink = existingSemanticReference
                        }
                    }
                } else {
                    semanticReferenceIndex.put(new Pair<ValuedObject, ValuedObject>(sink.valuedObject, srValuedObject), sink)
                }
//            }
        }
        wire.semanticSource = semanticSource
        wire.semanticSink = semanticSink
        
        wires += wire
        index.put(new Pair<Expression, Expression>(source, sink), wire)
        
        return wire
    }
    
    protected def Expression resolveSubOperatorExpressionPrefix(OperatorExpression source, Expression sink, Assignment equation) {
        val subExpression = source.subExpressions.head
        if (subExpression instanceof IntValue) {
            subExpression.value = -subExpression.value
            return subExpression
        } else if (subExpression instanceof FloatValue) {
            subExpression.value = -subExpression.value
            return subExpression
        }
        
        return source
    }
    
    protected def void markSelfReferencingEquation(ValuedObjectReference source, Wire wire) {
        if (source.isSameValuedObjectInReference(wire.sink)) {
            wire.sourceIsEquationTarget = true
        } else {
            val visited = <Wire, Boolean> newHashMap
            source.isSelfReferencingEquation(source, wire, visited)
        }
    }
    
    protected def boolean isSelfReferencingEquation(Expression source, ValuedObjectReference target, Wire wire, 
        Map<Wire, Boolean> visited
    ) {
//        println(wire)
        if (visited.containsKey(wire)) return visited.get(wire);
        visited.put(wire, false)

        if (wire.sink != target && wire.sink.isSameValuedObjectInReference(target)) {
            visited.put(wire, true)
            return true
        }
        
        switch(source) {
            ValuedObjectReference: {
                if (source != target && source.isSameValuedObjectInReference(target)) {
                    visited.put(wire, true)
                    return true
                } else {
                    val targetWires = wires.filter[ 
                        it.source == wire.sink ||
                        it.source.isSameValuedObjectInReference(wire.sink)
                    ].toList                    
                    if (targetWires.exists[ it.source.isSelfReferencingEquation(target, it, visited) ]) {
                        wire.sourceIsEquationTarget = true
//                        targetWires.forEach[ it.source.isSelfReferencingEquation(target, it, visited) ]
                    }
                    return false
                }
            }
            OperatorExpression: {
//                for (sre : source.subExpressions) {
                    val targetWires = wires.filter[ 
                        it.source == wire.sink ||
                        it.source.isSameValuedObjectInReference(wire.sink)
                    ].toList
//                    println(targetWires)
                    if (targetWires.exists[ it.source.isSelfReferencingEquation(target, it, visited) ]) {
//                        targetWires.forEach[ it.source.isSelfReferencingEquation(target, it, visited) ]
                        visited.put(wire, true)
                        return true
                    }
//                }
                return false
            }
            default: {}
        }
        return false
    }
    
    /** Retrieve an existing wire from the index. */
    def protected Wire getExistingWire(Expression source, Expression target) {
        return index.get(new Pair<Expression, Expression>(source, target))
    } 
    
    /** Retrieve the first wire with a matching semantic source. */
    def Wire getSemanticSourceWire(ValuedObjectReference valuedObjectReference) {
        val expression = semanticReferenceIndex.get(new Pair<ValuedObject, ValuedObject>(valuedObjectReference.valuedObject, null))
        for (wire : wires) {
            if (wire.semanticSource == expression) return wire
        }
        return null
    }

    /** Retrieve the first wire with a matching semantic sink. */
    def Wire getSemanticSinkWire(ValuedObjectReference valuedObjectReference) {
        val expression = semanticReferenceIndex.get(new Pair<ValuedObject, ValuedObject>(valuedObjectReference.valuedObject, null))
        for (wire : wires) {
            if (wire.semanticSink == expression) return wire
        }
        return null
    }
    
}