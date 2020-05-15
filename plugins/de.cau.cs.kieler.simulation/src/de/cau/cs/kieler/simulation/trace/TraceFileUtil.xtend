/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.trace

import de.cau.cs.kieler.core.model.ModelUtil
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.trace.ktrace.KTraceFactory
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile
import java.io.File
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResourceSet
import de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory
import de.cau.cs.kieler.simulation.trace.ktrace.Tick
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class TraceFileUtil {
    
    public static val KEYWORDS = #["reset", "pause", "goto"]
    
    static extension KTraceFactory = KTraceFactory.eINSTANCE
    static extension KExpressionsFactory = KExpressionsFactory.eINSTANCE
    static extension KEffectsFactory = KEffectsFactory.eINSTANCE
    static extension KExpressionsCompareExtensions = new KExpressionsCompareExtensions()
    
    
    static def loadTraceFile(File file) {
        val resourceSet = KTraceStandaloneSetup.doSetup.getInstance(XtextResourceSet)
        val uri = URI.createFileURI(file.absolutePath)
        val resource = resourceSet.getResource(uri, true)
        return resource.getContents().head as TraceFile
    }
    
    // TODO only save changes
    static def saveTraceToFile(File file, SimulationContext context, boolean append) {
        val eso = file.name.endsWith(".eso") || file.name.endsWith(".esi")
        val traceFile = if (append) {
            file.loadTraceFile
        } else {
            createTraceFile
        }
        val trace = createTrace
        traceFile.traces += trace
        
        for (pool : context.history.reverseIterator.toIterable) {
            val tick = createTick
            trace.ticks += tick
            val marked = newArrayList
            for (entry : pool.entries.values.filter[isInput || isOutput]) {
                val vo = traceFile.getVO(entry.name)
                val effect = if (eso) {
                    if (entry.rawValue.isJsonPrimitive
                        && entry.rawValue.asJsonPrimitive.isBoolean
                        && entry.combinedProperties.contains("signal")) {
                        if (entry.rawValue.asJsonPrimitive.asBoolean) {
                            val valName = entry.name + "_val" // FIXME magic name
                            if (pool.entries.containsKey(valName)) {
                                val value = pool.entries.get(valName)
                                marked += valName
                                createEmission => [
                                    reference = createValuedObjectReference => [
                                        valuedObject = vo
                                    ]
                                    newValue = value.getTypedKValue(null)
                                ]
                            } else if (entry.rawValue.asJsonPrimitive.asBoolean) {
                                createEmission => [
                                    reference = createValuedObjectReference => [
                                        valuedObject = vo
                                    ]
                                ]
                            }
                        } else {
                            null
                        }
                    } else if (!marked.contains(entry.name)){
                        createEmission => [
                            reference = createValuedObjectReference => [
                                valuedObject = vo
                            ]
                            newValue = entry.getTypedKValue(null)
                        ]
                    }
                } else {
                    createAssignment => [
                        reference = createValuedObjectReference => [
                            valuedObject = vo
                        ]
                        expression = entry.getTypedKValue(null)
                    ]
                }
                if (effect !== null) {
                    var skip = false
                    if (trace.ticks.size > 1) {
                        val prevEffect = trace.ticks.reverseView.drop(1).map[
                            val prevEffects = if (entry.isInput) it.inputs else if (entry.isOutput) it.outputs
                            if (eso) {
                                prevEffects.map[it as Emission].findFirst[reference.valuedObject == vo]
                            } else {
                                prevEffects.map[it as Assignment].findFirst[reference.valuedObject == vo]
                            }
                        ].filterNull.head
                        if (prevEffect !== null) {
                            if (eso) {
                                val emit = prevEffect as Emission
                                skip = emit.newValue !== null && emit.newValue.equals2((effect as Emission).newValue)
                            } else {
                                val asm = prevEffect as Assignment
                                skip = asm.expression.equals2((effect as Assignment).expression)
                            }
                        }
                        
                    }
                    if (!skip) {
                        if (entry.isInput) tick.inputs += effect
                        if (entry.isOutput) tick.outputs += effect
                        if (entry.isInput && entry.isOutput) throw new Exception("InputOutput Variables are not supported")
                    }
                }
            }
        }
        
        // escape keywords
        for (variable : traceFile.aggregatedValuedObjects) {
            if (KEYWORDS.contains(variable.name)) {
                variable.name = "^" + variable.name // escape
            }
        }
        
        // save
        if (append) {
            traceFile.eResource.save(emptyMap)
        } else {
            val uri = URI.createFileURI(file.absolutePath)
            ModelUtil.saveModel(traceFile, uri)
        }
    }
    
    private static def getVO(TraceFile tf, String voName) {
        var vo = tf.aggregatedValuedObjects.findFirst[name.equals(voName)]
        if (vo === null) {
            vo = createValuedObject => [name = voName]
            tf.aggregatedValuedObjects += vo
        }
        return vo
    }
}