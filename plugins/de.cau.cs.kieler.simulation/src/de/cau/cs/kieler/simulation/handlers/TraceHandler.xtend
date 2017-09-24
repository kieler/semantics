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

import de.cau.cs.kieler.prom.FileExtensions
import de.cau.cs.kieler.prom.configurable.ConfigurableAttribute
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.DataPoolOperation
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.Variable
import de.cau.cs.kieler.simulation.trace.TraceDataProvider
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile
import org.eclipse.core.runtime.Path
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Loads a trace file and sets inputs of a model accordingly to some tick of the trace.
 * Can also compare the outputs of a tick with the outputs of the trace.
 * 
 * @author aas
 *
 */
class TraceHandler extends DefaultDataHandler {
    
    /**
     * The path to the trace file.
     * The path must be either an absolute path in the workspace (i.e. /Project/Some/Folders/MyFile.txt)
     * or a project relative path in the project of the currently running simulation configuration file.
     */
    public val tracePath = new ConfigurableAttribute("file")
    /**
     * The name of the model of which the inputs should be set and outputs should be checked
     */
    public val modelName = new ConfigurableAttribute("modelName")
    /**
     * The number of the trace to use (in case there are multiple traces in the file) 
     */
    public val traceNumber = new ConfigurableAttribute("traceNumber", 0)
    /**
     * The current tick of the loaded trace that is used
     */
    public val tickNumber = new ConfigurableAttribute("tickNumber", 0)
    /**
     * Determines if the interface should be checked.
     * For instance an additional output can cause a trace mismatch if the interface is checked.
     */
    public val checkInterface = new ConfigurableAttribute("checkInterface", true)
    
    /**
     * The operation that sets the inputs of the model to the inputs from the trace.
     */
    private val writeOperation = new DataPoolOperation("write") {
        override apply(DataPool pool) {
            write(pool)
        }
    }
    
    /**
     * The operation that checks the outputs of the model and compares them with the trace.
     */
    private val checkOperation = new DataPoolOperation("check") {
        override apply(DataPool pool) {
            compare(pool)
        }
    }
    
    /**
     * The operation that loads the next tick.
     * This should be called after the inputs have been set and outputs have been checked.
     * However, if the outputs are not checked and the trace is only used to set inputs,
     * then this should be called after the inputs have been set.
     */
    private val loadNextTickOperation = new DataPoolOperation("loadNextTick") {
        override apply(DataPool pool) {
            loadNextTick
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getOperations() {
        return #[writeOperation, checkOperation, loadNextTickOperation]
    }
    
    /**
     * The trace model that should be used to load the trace data.
     * This can be used programatically instead of a path to a file that contains a trace model.
     */
    @Accessors
    private TraceFile externalTraceModel
    
    /**
     * A trace data provider to read the traces and turn them into data pools.
     */
    private var TraceDataProvider traceDataProvider;
    
    /**
     * Compares the output of the pool with the outputs in the trace for the current tick.
     * 
     * @param pool The pool
     */
    public def void compare(DataPool pool) {
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
    }
    
    /**
     * Compares the values of the given variables.
     * Thereby the present/absent state of booleans (true or false) and integers (0 or not 0) are taken as the same value.
     * Thus comparing a boolean with value false to an integer with value 42 would return true by this method.
     * 
     * @param a The first variable
     * @param b The first variable
     * @return true if the values of the variables match, possibly wrt. their present state 
     */
    def match(Variable a, Variable b) {
        if (a.value instanceof Boolean && b.value instanceof Integer) {
            return (a.value == (b.value != 0))
        } else if (a.value instanceof Integer && b.value instanceof Boolean) {
            return ((a.value != 0) == b.value)
        } else {
            return (a.value == b.value)
        }
    }
    
    /**
     * Sets the input of the data pool to the input from the trace of the current tick.
     * 
     * @param pool The pool
     */
    public def void write(DataPool pool) {
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
    }
    
    /**
     * Loads the next tick.
     */
    public def void loadNextTick() {
        tickNumber.value = tickNumber.intValue+1
        if(tickNumber.intValue >= traceDataProvider.traceLength) {
            val event = createTraceFinishedEvent
            SimulationManager.instance.fireEvent(event)
        }
    }
    
    /**
     * Returns the corresponding variable from the pool for the given variable in the given model.
     * 
     * @param pool The pool
     * @param model The model
     * @param variable The variable
     * @return the corresponding variable
     */
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
    
    /**
     * {@inheritDoc}
     */
    override initialize() {
        if(traceDataProvider == null) {
            if(externalTraceModel != null) {
                loadTrace(externalTraceModel)
            } else {
                val path = new Path(tracePath.stringValue)
                if(FileExtensions.TRACES.contains(path.fileExtension.toLowerCase)) {
                    loadTrace(path.toOSString)
                } else {
                    throw new Exception("The file '"+path.toOSString+"' is not a supported trace format.")
                }
            }
        }
    }
    
    /**
     * Loads a trace from the given file.
     * 
     * @param path The path to the file
     */
    private def void loadTrace(String path) {
        val traceFileHandle = getIFile(path)
        if(traceFileHandle !== null && traceFileHandle.exists) {
            traceDataProvider = new TraceDataProvider(traceFileHandle, traceNumber.intValue)
        } else {
            throw new Exception("Could not load trace '"+path+"'")
        }
    }
    
    /**
     * Loads the given trace.
     * 
     * @param trace The trace
     */
    private def void loadTrace(TraceFile trace) {
        traceDataProvider = new TraceDataProvider(trace, traceNumber.intValue)
    }
    
    /**
     * Creates an event because the frace has reached its end.
     * 
     * @return The created event
     */
    private def TraceFinishedEvent createTraceFinishedEvent() {
        val event = new TraceFinishedEvent()
        event.tickNumber = tickNumber.intValue
        event.traceNumber = traceNumber.intValue
        event.traceFile = traceDataProvider.sourceFile
        return event
    }
    
    /**
     * Creates an event because of a variable value mismatch.
     * 
     * @param variable The variable of which the value did not match
     * @param expectedValue The value that was expected in the trace
     * @return the created event
     */
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
    
    /**
     * Creates an event because of an interface mismatch.
     * 
     * @param variable The variable that did not match with the interface of the trace
     * @return the created event
     */
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
    
    /**
     * Checks whether this trace reached the end.
     * 
     * @return true if there is no new data in the trace
     */
    private def boolean isFinished() {
        return tickNumber.intValue >= traceDataProvider.traceLength
    }   
    
    /**
     * {@inheritDoc}
     */
    override getName() {
        "trace"
    }
    
    /**
     * {@inheritDoc}
     */
    override toString() {
        return "Trace '" + tracePath.value + "'"
    }
}