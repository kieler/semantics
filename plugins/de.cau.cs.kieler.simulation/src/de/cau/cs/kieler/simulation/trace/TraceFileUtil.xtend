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
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.trace.ktrace.KTraceFactory
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile
import java.io.ByteArrayInputStream
import java.io.File
import java.io.InputStream
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.serializer.ISerializer

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
    
    /**
     * Loads a trace from a file into a {@link TraceFile}.
     * @param file The file to load
     * @return The loaded {@link TraceFile} model.
     */
    static def loadTraceFile(File file) {
        return loadTraceFile(file.absolutePath)
    }
    
    /**
     * Loads a trace from a file URI into a {@link TraceFile}.
     * @param fileUri The uri of the file to load as a String
     * @return The loaded {@link TraceFile} model.
     */
    static def loadTraceFile(String fileUri) {
        val resourceSet = KTraceStandaloneSetup.doSetup.getInstance(XtextResourceSet)
        val uri = URI.createFileURI(fileUri)
        val resource = resourceSet.getResource(uri, true)
        return resource.getContents().head as TraceFile
    }
    
    /**
     * Loads a trace from a String into a {@link TraceFile}.
     * @param fileContent The trace content to load.
     * @return The loaded {@link TraceFile} model.
     */
    static def loadTraceString(String fileContent) {
        val resourceSet = KTraceStandaloneSetup.doSetup.getInstance(XtextResourceSet)
        val uri = URI.createURI("dummy:/trace.ktrace")
        val resource = resourceSet.createResource(uri)
        val InputStream in = new ByteArrayInputStream(fileContent.getBytes());
        resource.load(in, resourceSet.getLoadOptions());
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
        
        saveContextToTraceFile(traceFile, context, eso)
        
        // save
        if (append) {
            traceFile.eResource.save(emptyMap)
        } else {
            val uri = URI.createFileURI(file.absolutePath)
            ModelUtil.saveModel(traceFile, uri)
        }
    }
    
    /**
     * Saves the trace in the {@code context} into the file given by the {@code fileUri}.
     */
    static def saveTraceToFile(String fileUri, SimulationContext context) {
        val eso = fileUri.endsWith(".eso") || fileUri.endsWith(".esi")
        val traceFile = createTraceFile
        
        saveContextToTraceFile(traceFile, context, eso)
        
        // save
        val uri = URI.createFileURI(fileUri)
        ModelUtil.saveModel(traceFile, uri)
    }
    
    
    /**
     * The content of a trace file for the given simulation context as a String.
     */
    static def String saveTraceToString(SimulationContext context) {
        // TODO: what about eso?
        val eso = false
        val traceFile = createTraceFile
        
        saveContextToTraceFile(traceFile, context, eso)
        
        val ISerializer serializer = KTraceStandaloneSetup.doSetup.getInstance(ISerializer)
        return serializer.serialize(traceFile)
    }
    
    /**
     * Save the trace from the simulation context to the already created TraceFile.
     */
    private static def saveContextToTraceFile(TraceFile traceFile, SimulationContext context, boolean eso) {
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