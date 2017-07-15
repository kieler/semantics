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
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.Variable
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path

/**
 * @author aas
 *
 */
class Trace extends DefaultDataHandler {
    
    public val tracePath = new ConfigurableAttribute("file")
    public val modelName = new ConfigurableAttribute("modelName")
    public val currentTraceNumber = new ConfigurableAttribute("traceNumber", 0)
    public val currentTickNumber = new ConfigurableAttribute("tickNumber", 0)
    public val checkOutputs = new ConfigurableAttribute("checkOutputs", true)
    
    private int traceCount = 0
    private IFile traceFile
    private List<DataPool> currentTrace
    
    private var EsoUtil esoUtil;
    
    override read(DataPool pool) {
        initialize
        if(isFinished) {
//            System.err.println("Trace is finished already.")
            return;
        }
        // Compare variables in pool with output of this tick
        val tracePool = currentTrace.get(currentTickNumber.intValue)
        for(model : pool.models) {
            for(variable : model.variables) {
                if(variable.isOutput) {
                    var TraceMismatchEvent event
                    val isPresent = (variable.value != false && variable.value != 0)
                    // No variable in currentPool => this variable is absent in the trace
                    var boolean shouldBePresent = true
                    val correspondingVariable = getCorrespondingVariable(tracePool, model, variable)
                    if(correspondingVariable == null) {
                        // Variable is absent in the trace
                        shouldBePresent = false
                    } else {
                        var boolean match
                        // The present state is still OK
                        // if a boolean is true and an integer is not equal to 0
                        // if or a boolean is false and an integer is equal to 0
                        if(variable.value instanceof Boolean
                            && correspondingVariable.value instanceof Integer) {
                            match = (variable.value == (correspondingVariable.value != 0))
                        } else if (variable.value instanceof Integer
                            && correspondingVariable.value instanceof Boolean){
                             match = ((variable.value != 0) == correspondingVariable.value)
                        } else {
                             match = (variable.value == correspondingVariable.value)
                        }
                        if(!match) {
                            event = createTraceMismatchEvent(variable, correspondingVariable.value)
                        }
                    }
                    if(isPresent != shouldBePresent) {
                        event = createTraceMismatchEvent(variable, variable.toggledPresentState)
                    }
                    if(event != null) {
                        SimulationManager.instance?.fireEvent(event)
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
//            System.err.println("Trace is finished already.")
            return;
        }
        // Set inputs of variables in the pool to inputs of the trace.
        val tracePool = currentTrace.get(currentTickNumber.intValue)
        for(model : pool.models) {
            for(variable : model.variables) {
                if(variable.isInput) {
                    // No variable in currentPool => this variable is absent in the trace
                    val correspondingVariable = getCorrespondingVariable(tracePool, model, variable)
                    if(correspondingVariable == null) {
                        // Variable is absent in the trace
                        variable.setAbsent
                    } else {
                        // Variable is present in the trace, or is valued signal
                        variable.value = correspondingVariable.value
                    }
                }   
            }    
        }
        
        // Don't compare outputs of the simulation with the trace.
        // So only inputs should be set and we can get the next tick now.
        if(!checkOutputs.boolValue) {
            loadNextTick
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
            if(path.fileExtension.toLowerCase == "eso") {
                loadEsoTrace(path)
            }
            // TODO: Other trace format with complete data pool history?
        }
    }
    
    private def void loadEsoTrace(IPath path) {
        traceFile = getFile(path)
        if(traceFile != null && traceFile.exists) {
            esoUtil = new EsoUtil(traceFile)
            traceCount = esoUtil.traceCount
            currentTrace = esoUtil.getTraceAsDataPools(currentTraceNumber.intValue)
        } else {
            throw new Exception("Could not load trace '"+path.toOSString+"'")
        }
    }
    
    private def TraceEvent createTraceFinishedEvent() {
        val event = new TraceFinishedEvent()
        event.tickNumber = currentTickNumber.intValue
        event.traceNumber = currentTraceNumber.intValue
        event.traceFile = traceFile
        return event
    }
    
    private def TraceMismatchEvent createTraceMismatchEvent(Variable variable, Object expectedValue) {
        val event = new TraceMismatchEvent()
        event.tickNumber = currentTickNumber.intValue
        event.traceNumber = currentTraceNumber.intValue
        event.traceFile = traceFile
        event.variable = variable
        event.expectedValue = expectedValue
        // The trace number and tick number starts with zero in the data handler.
        // Thus to match the displayed value in the data pool view,
        // it needs to be increased by one
        event.message = "Mismatch of variable '"+variable.name+"' "
                      + "after tick "+(event.tickNumber+1)+" "
                      + "of trace "+(event.traceNumber+1)+" "
                      + "from '"+traceFile.projectRelativePath.toOSString+"'\n"
                      + "(trace value: "+expectedValue+", simulation value: "+variable.value+")"
        return event
    }
    
    private def void loadNextTick() {
        currentTickNumber.value = currentTickNumber.intValue+1
        if(currentTickNumber.intValue >= currentTrace.size) {
            val event = createTraceFinishedEvent
            SimulationManager.instance.fireEvent(event)
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