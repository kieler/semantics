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
package de.cau.cs.kieler.simulation.trace

import com.google.common.collect.HashMultimap
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonNull
import com.google.gson.JsonPrimitive
import com.google.inject.Guice
import com.google.inject.Injector
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.eval.PartialExpressionEvaluator
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.simulation.DataPool
import de.cau.cs.kieler.simulation.DataPoolEntry
import de.cau.cs.kieler.simulation.trace.ktrace.Tick
import de.cau.cs.kieler.simulation.trace.ktrace.Trace
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile
import javax.inject.Inject
import org.eclipse.xtend.lib.annotations.Accessors

import static com.google.common.base.Preconditions.*

import static extension de.cau.cs.kieler.simulation.util.JsonUtil.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class TraceDataProvider {
    
    @Accessors
    val Trace trace
    @Accessors
    val TraceFile tracefile
    
    @Accessors
    val boolean signalSemantics
    
    var int inputTick = -1
    var int outputTick = -1   
    val DataPool state = new DataPool
    val inputNames = <String>newHashSet
    val outputNames = <String>newHashSet
    
    @Inject Injector injector
    @Inject extension PartialExpressionEvaluator
       
    // -----------------------------------------------------------------------------------------
    
    new(Trace trace) {
        this.trace = trace
        this.tracefile = trace.eContainer as TraceFile
        checkNotNull(tracefile, "Trace is not contained in a TraceFile")
        this.signalSemantics = if (trace.eResource !== null && trace.eResource.URI !== null) {
            val fileExt = trace.eResource.URI.fileExtension
            "eso".equals(fileExt) || "esi".equals(fileExt)
        } else {
            trace.eAllContents.filter(Assignment).empty
        }
        if (injector === null) {
            injector = Guice.createInjector
            injector.injectMembers(this)
        }   
        compute = true
        reset()
    }
    
    def reset() {
        inputTick = -1
        outputTick = -1
        state.clear
        inputNames.clear
        outputNames.clear  
    }
    
    def applyTraceInputs(int tick) {
        checkArgument(tick >= 0 && tick < trace.ticks.size, "Current tick number out of trace range")
        checkArgument(inputTick + 1 == tick, "Trace and simulation out of sync")
        trace.ticks.get(tick).applyTickEffects(true)
        inputTick++
    }
        
    def applyTraceOutputs(int tick) {
        checkArgument(tick >= 0 && tick < trace.ticks.size, "Current tick number out of trace range")
        checkArgument(outputTick + 1 == tick, "Trace and simulation out of sync")
        trace.ticks.get(tick).applyTickEffects(false)
        outputTick++
    }
    
    private def void applyTickEffects(Tick tick, boolean applyInputs) {
        val effects = if (applyInputs) {
            tick.inputs
        } else {
            tick.outputs
        }
        if (signalSemantics) {
            if (applyInputs) {
                // Reset all signals
                val reset = tracefile.aggregatedValuedObjects.toMap([
                    name
                ],[
                    new JsonPrimitive(false) as JsonElement
                ])
                state.setValues(reset)
            }
            
            // Set emmited signals
            val inputs = effects.filter(Emission).toMap([
                reference.valuedObject.name
            ],[
                newValue
            ])
            for (input : inputs.entrySet) {
                val name = input.key
                if (applyInputs) {
                    inputNames += name
                } else {
                    outputNames += name
                }
                val value = input.value
                
                state.setValue(name, new JsonPrimitive(true))
                if (value !== null) { // FIXME name magic
                    state.setValue(name + "_val", value.toJsonValue)
                }
            }
        } else {
            for (input : effects.filter(Assignment)) {
                var vor = input.reference
                val name = vor.valuedObject.name
                if (applyInputs) {
                    inputNames += name
                } else {
                    outputNames += name
                }
                var value = input.expression.toJsonValue
                
                if (!vor.indices.nullOrEmpty) {
                    var idx = 0
                    val entry = state.entries.get(name)
                    var JsonArray array = if (entry !== null && entry.rawValue?.isJsonArray) {
                        entry.rawValue.asJsonArray
                    } else {
                        new JsonArray
                    }
                    state.setValue(name, array)
                    val iter = vor.indices.iterator
                    do {
                        idx = (iter.next as IntValue).value
                        if (array.size <= idx) {
                            for (var i = array.size; i <= idx; i++) {
                                array.add(JsonNull.INSTANCE)
                            }
                            if (iter.hasNext) {
                                array.set(idx, new JsonArray)
                            }
                        }
                        if (iter.hasNext) {
                            array = array.get(idx).asJsonArray
                        }
                    } while (iter.hasNext)
                    array.set(idx, value)
                } else {
                    state.setValue(name, value)
                }
            }
        }
    }
    
    public def void passInputs(DataPool pool) {
        val names = pool.entries.entrySet.filter[value.isInput].map[key].toSet
        names.addAll(inputNames)
        if (signalSemantics) {
            for (input : names) {
                val traceEntry = state.entries.get(input)
                if (traceEntry !== null) {
                    val valName = input + "_val"// FIXME name magic
                    if (state.entries.containsKey(valName) && !pool.entries.containsKey(valName) && !pool.isSignal(input)) {
                        pool.setValue(input, state.entries.get(valName).rawValue.cloneJson)
                    } else {
                        pool.setValue(input, traceEntry.rawValue.cloneJson)
                    }
                } else {
                    // Input that was not specified in trace but must be resetted
                    inputNames += input
                    state.setValue(input, new JsonPrimitive(false))
                    state.setValue(input + "_val", new JsonPrimitive(0))
                }
            }
        } else {
            for (input : names) {
                val traceEntry = state.entries.get(input)
                if (traceEntry !== null) {
                    pool.setValue(input, traceEntry.rawValue.cloneJson)
                }
            }
        }
    }
    
    public def mismatches(DataPool pool) {
        val mm = HashMultimap.<DataPoolEntry, DataPoolEntry>create
        val names = pool.entries.entrySet.filter[value.isOutput].map[key].toSet
        names.addAll(outputNames)
        for (output : names) {
            var traceEntry = state.entries.get(output)
            val poolEntry = pool.entries.get(output)
            if (traceEntry !== null) {
                if (poolEntry !== null) {
                    if (signalSemantics) {
                        val valName = output + "_val"// FIXME name magic
                        if (state.entries.containsKey(valName)
                            && !pool.entries.containsKey(valName)
                            && !pool.isSignal(output)) {
                            traceEntry = state.entries.get(valName)
                        }
                    }
                    if (traceEntry.mismatch(poolEntry)) {
                        mm.put(poolEntry, traceEntry)
                    }
                } else {
                    mm.put(null, traceEntry)
                }
            }
        }
        return mm
    }
    
    private def boolean mismatch(DataPoolEntry traceEntry, DataPoolEntry poolEntry) {
        val pool = poolEntry.rawValue
        val trace = traceEntry.rawValue
        if (trace.isJsonPrimitive
            && trace.asJsonPrimitive.isBoolean) {
            return trace.asJsonPrimitive.asBoolean.booleanValue.xor(pool.isTruthy)
        } else if (signalSemantics // Legacy boolean encoding as numbers in eso
            && pool.isJsonPrimitive
            && pool.asJsonPrimitive.isBoolean
            && trace.isJsonPrimitive
            && trace.asJsonPrimitive.isNumber) {
            val num = trace.asJsonPrimitive.asNumber
            if (num.doubleValue == 0.0) {
                return pool.asJsonPrimitive.asBoolean.booleanValue.xor(false)
            } else if (num.doubleValue == 1.0) {
                return pool.asJsonPrimitive.asBoolean.booleanValue.xor(true)
            } else {
                return true
            }
        } else {
            return !pool.equals(trace)
        }
    }
    
    private def isSignal(DataPool pool, String name) {
        // FIXME keyword magic
        return pool.outputs.keySet.map[variableInformation].filterNull.map[variables.get(name)].filterNull.flatten.filterNull.exists[properties.contains("signal")]
    }
}
