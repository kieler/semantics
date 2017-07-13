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
package de.cau.cs.kieler.simulation.handlers

import de.cau.cs.kieler.prom.build.ConfigurableAttribute
import de.cau.cs.kieler.simulation.core.DataPool
import org.eclipse.core.runtime.Path
import java.util.List
import de.cau.cs.kieler.simulation.core.Variable
import de.cau.cs.kieler.simulation.core.Model

/**
 * @author aas
 *
 */
class Trace extends DefaultDataHandler {
    
    public val tracePath = new ConfigurableAttribute("file")
    public val modelName = new ConfigurableAttribute("modelName")
    public val currentTraceNumber = new ConfigurableAttribute("traceNumber", 0)
    public val currentTickNumber = new ConfigurableAttribute("tickNumber", 0)
    
    private int traceCount = 0
    private List<DataPool> currentTrace
    
    private var EsoUtil esoUtil;
    
    override read(DataPool pool) {
        initialize
        if(isFinished) {
            System.err.println("Trace is finished already.")
            return;
        }
        println("checking pool")
        
        // Read outputs for this tick and compare with variables in data pool.
        val currentPool = currentTrace.get(currentTickNumber.intValue);
        for(m : currentPool.models) {
            for(v : m.variables) {
                if(v.isOutput) {
                    val correspondingVariable = getCorrespondingVariable(pool, m, v)
                    val match = v.value == correspondingVariable.value
                    if(!match) {
                        System.err.println("Mismatch of variable '"+v.name+"' "
                                         + "in tick "+currentTickNumber.intValue+" "
                                         + "of trace "+currentTraceNumber.intValue+"\n"
                                         + "(value in trace:"+v.value+", value in simulation:"+correspondingVariable.value+")")
                    }
                }
            }
        }
        
        // Find outputs of pool that are present but should be absent in the trace.
        for(model : pool.models) {
            for(variable : model.variables) {
                if(variable.isOutput) {
                    val isPresent = (variable.value != false && variable.value != 0)
                    // No variable in currentPool => this variable is absent in the trace
                    var boolean shouldBeAbsent = false
                    if(pool.models.size == 1) {
                        if(currentPool.getVariable(variable.name) == null) {
                            shouldBeAbsent = true
                        }
                    } else {
                        val m = currentPool.getModel(model.name)
                        if(m != null) {
                            val v = m.getVariable(variable.name)
                            if(v == null) {
                                shouldBeAbsent = true
                            }
                        } else {
                            shouldBeAbsent = true
                        }
                    }
                    // Check that present state matches
                    if(isPresent && shouldBeAbsent) {
                        System.err.println("Mismatch of variable '"+variable.name+"' "
                                         + "in tick "+currentTickNumber+" "
                                         + "of trace "+currentTraceNumber
                                         + "(expected absent but was present)")
                    }
                }
            }
        }
        
        // Get next tick
        loadNextTick
    }
    
    override write(DataPool pool) {
        initialize
        if(isFinished) {
            System.err.println("Trace is finished already.")
            return;
        }
        // Read inputs for this tick and set corresponding variables in data pool.
        val currentPool = currentTrace.get(currentTickNumber.intValue);
        for(m : currentPool.models) {
            for(v : m.variables) {
                if(v.isInput) {
                    println("setting "+v.name+" to "+ v.value)
                    val correspondingVariable = getCorrespondingVariable(pool, m, v)
                    correspondingVariable.value = v.value
//                    correspondingVariable.userValue = v.value
                }
            }
        }
        
        // Set input variables in simulation to false if no input variable in currentPool was present
        for(model : pool.models) {
            for(variable : model.variables) {
                if(variable.isInput) {
                    // No variable in currentPool => this variable is absent in the trace
                    var boolean isAbsent = false
                    if(pool.models.size == 1) {
                        if(currentPool.getVariable(variable.name) == null) {
                            isAbsent = true
                        }
                    } else {
                        val m = currentPool.getModel(model.name)
                        if(m != null) {
                            val v = m.getVariable(variable.name)
                            if(v == null) {
                                isAbsent = true
                            }
                        } else {
                            isAbsent = true
                        }
                    }
                    // Set variable to 0 or false if absent
                    if(isAbsent) {
                        println("setting "+variable.name+" to absent")
                        if(variable.value instanceof Boolean) {
                            variable.value = false
//                            variable.userValue = false
                        } else if (variable.value instanceof Number) {
                            variable.value = true
//                            variable.userValue = 0
                        }
                    }
                }
            }
        }
    }
    
    private def Variable getCorrespondingVariable(DataPool pool, Model model, Variable variable) {
        var Variable correspondingVariable
        if(pool.models.size == 1) {
            correspondingVariable = pool.getVariable(variable.name)
        } else {
            val correspondingModel = pool.getModel(model.name)
            correspondingVariable = correspondingModel.getVariable(variable.name)
        }
        return correspondingVariable
    }
    
    private def void initialize() {
        if(currentTrace == null) {
            val path = new Path(tracePath.stringValue)
            val esoFile = getFile(path)
            if(esoFile != null && esoFile.exists) {
                esoUtil = new EsoUtil(esoFile)
                traceCount = esoUtil.traceCount
                currentTrace = esoUtil.getTraceAsDataPools(currentTraceNumber.intValue)
            } else {
                System.err.println("ESO file does not exist")
            }
        }
    }
    
    private def void loadNextTick() {
        currentTickNumber.value = currentTickNumber.intValue+1
        if(currentTickNumber.intValue >= currentTrace.size) {
            // TODO: Fire finished event.
            System.err.println("Trace finished")
        }
    }
    
    private def boolean isFinished() {
        return currentTickNumber.intValue >= currentTrace.size
    }   
    
    override getName() {
        "trace"
    }
    
    override toString() {
        return "Trace '" + tracePath.value + "'"
    }
}