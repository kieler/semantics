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
import de.cau.cs.kieler.simulation.trace.TraceDataProvider
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.simulation.FileExtensions.*
import de.cau.cs.kieler.simulation.core.VariableType

/**
 * @author aas
 *
 */
class TraceHandler extends DefaultDataHandler {
    
    public val tracePath = new ConfigurableAttribute("file")
    public val modelName = new ConfigurableAttribute("modelName")
    public val traceNumber = new ConfigurableAttribute("traceNumber", 0)
    public val tickNumber = new ConfigurableAttribute("tickNumber", 0)
    public val checkOutputs = new ConfigurableAttribute("checkOutputs", true)
    public val checkInterface = new ConfigurableAttribute("checkInterface", true)
    
    /**
     * The trace model that should be used to load the trace data.
     * This can be used programatically instead of a path to a file that contains a trace model.
     */
    @Accessors
    private TraceFile externalTraceModel
        
    private var TraceDataProvider traceDataProvider;
    
    override read(DataPool pool) {
        initialize
        if(isFinished) {
//            System.err.println("Trace is finished already.")
            return;
        }
        // Compare variables in pool with output of this tick
        val tracePool = traceDataProvider.getDataPool(tickNumber.intValue)
        
        for(model : pool.models) {
            for(variable : model.variables) {
                if(variable.isOutput) {
                    var TraceMismatchEvent event
                    val isPresent = (variable.value != false && variable.value != 0)
                    // No variable in currentPool => this variable is absent in the trace
                    var boolean shouldBePresent = true
                    val correspondingVariable = getCorrespondingVariable(tracePool, model, variable)
                    
                    // Check if it is an valued signal
                    val isVSSignal = model.variables.exists[name.startsWith(variable.name) && name.equals(variable.name + "_val")]
                    val isVSValue = variable.name.endsWith("_val") 
                                    && model.variables.exists[name.equals(variable.name.substring(0, variable.name.length - 4))]
                    
                    if (!isVSValue && correspondingVariable === null) {
                        if(correspondingVariable === null) {
                            // Variable is absent in the trace
                            shouldBePresent = false
                        } else if (isVSSignal) {
                            val valVar = model.variables.findFirst[name.equals(variable.name + "_val")]
                            val valVarCorrespondingVariable = getCorrespondingVariable(tracePool, model, valVar)
                            if (valVarCorrespondingVariable === null) {
                                if(!valVar.match(correspondingVariable)) {
                                    event = createTraceMismatchEvent(variable, correspondingVariable.value)
                                }
                            } else {
                                if(!variable.match(correspondingVariable)) {
                                    event = createTraceMismatchEvent(variable, correspondingVariable.value)
                                }
                                shouldBePresent = correspondingVariable.isPresent
                            }
                        } else {
                            if(!variable.match(correspondingVariable)) {
                                event = createTraceMismatchEvent(variable, correspondingVariable.value)
                            }
                            shouldBePresent = correspondingVariable.isPresent
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
        }
        
        if (checkInterface.boolValue) {
            for(model : tracePool.models) {
                for(variable : model.variables) {
                    if(variable.isOutput) {
                        if(getCorrespondingVariable(pool, model, variable) == null) {
                            SimulationManager.instance?.fireEvent(createTraceInterfaceMismatchEvent(variable))
                        }
                    }
                }
            }
        }
        
        // Get next tick
        loadNextTick
    }
    
    def match(Variable a, Variable b) {
        if (a.value instanceof Boolean && b.value instanceof Integer) {
            return (a.value == (b.value != 0))
        } else if (a.value instanceof Integer && b.value instanceof Boolean) {
            return ((a.value != 0) == b.value)
        } else {
            return (a.value == b.value)
        }
    }
    
    override write(DataPool pool) {
        initialize
        if(isFinished) {
//            System.err.println("Trace is finished already.")
            return;
        }
        // Set inputs of variables in the pool to inputs of the trace.
        val tracePool = traceDataProvider.getDataPool(tickNumber.intValue)
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
        if(traceDataProvider == null) {
            if(externalTraceModel != null) {
                loadTrace(externalTraceModel)
            } else {
                val path = new Path(tracePath.stringValue)
                switch(path.fileExtension.toLowerCase) {
                    case TRACES.contains(path.fileExtension.toLowerCase): loadTrace(path)
//                    case SIM_HISTORY: loadDataPoolHistory(path)
                    default:
                        throw new Exception("The file '"+path.toOSString+"' is not a supported trace format.")
                }
            }
        }
    }
    
    private def void loadTrace(IPath path) {
        val traceFileHandle = getFile(path)
        if(traceFileHandle !== null && traceFileHandle.exists) {
            traceDataProvider = new TraceDataProvider(traceFileHandle, traceNumber.intValue)
        } else {
            throw new Exception("Could not load trace '"+path.toOSString+"'")
        }
    }
    
    private def void loadTrace(TraceFile trace) {
        traceDataProvider = new TraceDataProvider(trace, traceNumber.intValue)
    }
    
//    private def void loadDataPoolHistory(IPath path) {
//        val traceFileHandle = getFile(path)
//        if(traceFileHandle != null && traceFileHandle.exists) {
//            val lines = Files.readLines(new File(traceFileHandle.location.toOSString), Charsets.UTF_8)
//            var DataPool lastPool
//            for(line : lines) {
//                val modelName = "Model"
//                val model = Model.createFromJson(modelName, line)
//                if(model != null) {
//                    val pool = new DataPool()
//                    pool.addModel(model)
//                    if(lastPool != null) {
//                        pool.previousPool = lastPool
//                    }
//                    lastPool = pool
//                    currentTraceTick.add(pool)
//                }
//            }
//        } else {
//            throw new Exception("Could not load trace '"+path.toOSString+"'")
//        }
//    }
    
    private def TraceEvent createTraceFinishedEvent() {
        val event = new TraceFinishedEvent()
        event.tickNumber = tickNumber.intValue
        event.traceNumber = traceNumber.intValue
        event.traceFile = traceDataProvider.sourceFile
        return event
    }
    
    private def TraceMismatchEvent createTraceMismatchEvent(Variable variable, Object expectedValue) {
        val event = new TraceMismatchEvent()
        event.tickNumber = tickNumber.intValue
        event.traceNumber = traceNumber.intValue
        event.traceFile = traceDataProvider.sourceFile
        event.variable = variable
        event.expectedValue = expectedValue
        // The trace number and tick number starts with zero in the data handler.
        // Thus to match the displayed value in the data pool view,
        // it needs to be increased by one
        event.message = "Mismatch of variable '"+variable.name+"' "
                      + "after tick "+(event.tickNumber+1)+" "
                      + "of trace "+(event.traceNumber+1)+" "
                      + "from '"+traceDataProvider.filePath+"'\n"
                      + "(trace value: "+expectedValue+", simulation value: "+variable.value+")"
        return event
    }
    
    private def TraceMismatchEvent createTraceInterfaceMismatchEvent(Variable variable) {
        val event = new TraceMismatchEvent()
        event.tickNumber = tickNumber.intValue
        event.traceNumber = traceNumber.intValue
        event.traceFile = traceDataProvider.sourceFile
        event.variable = variable
        // The trace number and tick number starts with zero in the data handler.
        // Thus to match the displayed value in the data pool view,
        // it needs to be increased by one
        event.message = "Interface mismatch of variable '"+variable.name+"' "
                      + "after tick "+(event.tickNumber+1)+" "
                      + "of trace "+(event.traceNumber+1)+" "
                      + "from '"+traceDataProvider.filePath+"'\n"
                      + "The trace expects this output variable"
        return event
    }
    
    private def void loadNextTick() {
        tickNumber.value = tickNumber.intValue+1
        if(tickNumber.intValue >= traceDataProvider.traceLength) {
            val event = createTraceFinishedEvent
            SimulationManager.instance.fireEvent(event)
        }
    }
    
    private def boolean isFinished() {
        return tickNumber.intValue >= traceDataProvider.traceLength
    }   
    
    override getName() {
        "trace"
    }
    
    override toString() {
        return "Trace '" + tracePath.value + "'"
    }
}