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
package de.cau.cs.kieler.simulation.core

import de.cau.cs.kieler.prom.ExtensionLookupUtil
import de.cau.cs.kieler.prom.build.Configurable
import de.cau.cs.kieler.simulation.kisim.Action
import de.cau.cs.kieler.simulation.kisim.ActionOperation
import de.cau.cs.kieler.simulation.kisim.SimulationConfiguration
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.prom.build.ConfigurableAttribute

/**
 * The simulation manager holds a configuration of a simulation and takes care of its execution.
 * The configuration is a list of step actions to perform in a loop.
 * A single iteration of all step actions represent the execution of a macro tick.
 * <br><br>
 * Executing a simulation step will call the method of the step action on the data handler in the step action
 * and thereby updating the current state of the simulation.
 * <br><br>
 * The manager can step through the simulation handler by handler<br>
 * or using all handlers of a macro tick at once<br>
 * or executing the step actions continuously in a loop.
 * <br><br>
 * The continuously execution is done in a separate thread until it is paused (<i>playing</i> and <i>pausing</i> the simulation). 
 * 
 * @author aas
 *
 */
class SimulationManager extends Configurable {
    
    /**
     * Singleton instance.
     */
    public static var SimulationManager instance
    
    /**
     * Default delay in milliseconds when playing the simulation
     */
    public static val DEFAULT_PAUSE = 200;
    
    /**
     * Default delay in milliseconds when playing the simulation
     */
    public static val MIN_PAUSE = 10;
    
    /**
     * Default delay in milliseconds when playing the simulation
     */
    public static val MAX_PAUSE = 3000;
    
    /**
     * The pause in milliseconds that is waited between two ticks in play mode.
     * The time is including the duration of the tick,
     * thus the actually waited time might be smaller, if the tick took longer to execute.
     */
    @Accessors(PUBLIC_GETTER)
    private static var int desiredTickPause = DEFAULT_PAUSE
    
    /**
     * List of event listeners
     */
    private static val List<SimulationListener> listeners = newArrayList
    
    /**
     * The length of the saved data pool history.
     * If set to a value smaller than 1, no history will be recorded.
     */
    public val maxHistoryLength = new ConfigurableAttribute("historyLength", -1)
    /**
     * The name of an input variable in the data pool,
     * which should receive the current system time as value.
     */
    public val currentTimeVariable = new ConfigurableAttribute("currentTimeVariable")
    /**
     * The name of an output variable in the data pool,
     * that determines the next time the tick function should be called.
     */
    public val nextTickTimeVariable = new ConfigurableAttribute("nextTickTimeVariable")
    
    /**
     * The job that executes the step actions concurrently when playing.
     */
    private var Job steppingJob
    /**
     * Is the simulation performed continuously in a separate thread? 
     */
    @Accessors(PUBLIC_GETTER)
    private var boolean isPlaying
    
    /**
     * Has the simulation been stopped? 
     */
     @Accessors(PUBLIC_GETTER)
    private var boolean isStopped
    
    @Accessors(PUBLIC_GETTER)
    private var int positionInHistory;
    
    /**
     * The configuration that has been used to create the simulation.
     */
    @Accessors
    private var SimulationConfiguration usedConfiguration
    
    /**
     * Instances of the data handlers in the step actions without duplicates.
     */
    private val List<DataHandler> dataHandlers = newArrayList()
    /**
     * The list of step actions that make up a macro tick simulation.
     */
    private val List<StepAction> actions = newArrayList()

    /**
     * The current state of the simulation.
     */
    private var StepState currentState
    
    /**
     * The history of step states of this simulation run from old to new.
     */
    private var List<StepState> history = newArrayList()
    
    /**
     * Id's of the data handlers used. There may be multiple handlers with the same id.
     */
    val Map<DataHandler, String> idForDataHandler = newHashMap
    
    val Set<DataHandler> initializedHandlers = newHashSet
    
    /**
     * Constructor
     */
    new() {
        super()
        if(instance != null) {
            instance.stop()
        }
        instance = this
        
        // Save initial state
        val pool = new DataPool
        currentState = new StepState(pool, 0)
    }
    
    /**
     * Constructor with initial configuration.
     */
    new(SimulationConfiguration config) {
        this()
        usedConfiguration = config
        // Load attributes
        this.updateConfigurableAttributes(config.attributes)
        // Load data handlers
        val List<DataHandler> loadedHandlers = newArrayList
        for(handlerConfig : config.handlers) {
            // Instantiate matching data handler
            val name = handlerConfig.name
            val requiredConfig = [IConfigurationElement elem | elem.getAttribute("name") == name]
            val configurationElements = ExtensionLookupUtil.getConfigurationElements("de.cau.cs.kieler.simulation.dataHandler",
                                                                                      requiredConfig)
            if(!configurationElements.isNullOrEmpty) {
                val element = configurationElements.get(0)
                val handler = ExtensionLookupUtil.instantiateClassFromConfiguration(element) as DataHandler
                handler.updateConfigurableAttributes(handlerConfig.attributes)
                // Remember the id for this handler
                if(handlerConfig.id != null) {
                    idForDataHandler.put(handler, handlerConfig.id)
                    // Set model name of simulators to id from configuration
                    if(handler instanceof Simulator) {
                        handler.baseModelName = handlerConfig.id
                    }
                }
                
                // Remember to initialize this handler,
                // even if it is not added to the macro tick actions
                loadedHandlers.add(handler)
            } else {
                throw new Exception("Data handler name '"+name+"' could not be instantiated.")
            }
        }
        // Initialize loaded handlers
        initializeHandlers(loadedHandlers)
        
        // Add actions that make up a macro tick
        if(config.execution != null) {
            for(action : config.execution.actions) {
                val handler = action.findDataHandler
                // Add step action with the corresponding method
                switch(action.operation) {
                    case ActionOperation.WRITE : {
                        addAction(StepAction.Method.WRITE, handler)
                    }
                    case ActionOperation.READ : {
                        addAction(StepAction.Method.READ, handler)
                    }
                }
            }
        }
    }
    
    private def findDataHandler(Action action) {
        // Find handler that matches the id and name of the action
        val handlersMatchingId = newArrayList
        if(action.id != null) {
            for(entry : idForDataHandler.entrySet) {
                if(entry.value == action.id) {
                    handlersMatchingId.add(entry.key)
                }
            }
        } else {
            handlersMatchingId.addAll(dataHandlers)
        }
        val handler = handlersMatchingId.findFirst[it.name == action.handler]
        if(handler == null) {
            throw new Exception(action.handler+" data handler with id '"+action.id+"' has not been configured.")
        }
        return handler
    }
    
    /**
     * Sets the play delay.
     */
    public static def void setDesiredTickPause(int value) {
        if(value >= MIN_PAUSE && value <= MAX_PAUSE) {
            desiredTickPause = value
        } else {
            throw new IllegalArgumentException("Desired pause for simulation must be between "+MIN_PAUSE+" to "+MAX_PAUSE)
        }
    }
    
    /**
     * Returns the number of the current macro tick to be exectued.
     */
    public def int getCurrentMacroTickNumber() {
        if(currentState != null) {
            if(actions.size > 0) {
                return currentState.actionIndex / actions.size
            } else {
                return currentState.actionIndex
            }
        } else {
            return 0
        }
    }
    
    /**
     * Adds a data handler
     */
    private def void addHandler(DataHandler handler) {
        if(!dataHandlers.contains(handler))
            dataHandlers.add(handler)
    }
    
    /**
     * Adds a step action.
     * A step action to read a data handler should not be added, if that handler is updated after every step anyway. 
     * In this case it is sufficient to add this handler to the list of data handlers. 
     */
    public def void addAction(StepAction.Method method, DataHandler handler) {
        addHandler(handler)
        actions.add(new StepAction(method, handler))
    }
    
    /**
     * Add simulator to an already initialized simulation.
     */
    public def void append(Simulator simulator) {
        simulator.initialize(currentPool)
//        println("Appended simulator")
        fireEvent(SimulationEventType.INITIALIZED)
    }
    
    /**
     * Initialize the simulation.
     * All simulators are initilized to create the initial data pool.
     */
    public def void initialize() {
        // Initialize handlers
        initializeHandlers(dataHandlers)
        
        // Perform actions from initialization part of configuration
        if(usedConfiguration != null && usedConfiguration.initialization != null) {
            for(action : usedConfiguration.initialization.actions) {
                val handler = action.findDataHandler
                // Add step action with the corresponding method
                switch(action.operation) {
                    case ActionOperation.WRITE : {
                        val stepAction = new StepAction(StepAction.Method.WRITE, handler)
                        stepAction.apply(currentPool)
                    }
                    case ActionOperation.READ : {
                        val stepAction = new StepAction(StepAction.Method.READ, handler)
                        stepAction.apply(currentPool)
                    }
                }
            }
        }
        
//        println("Initilized simulation")
        fireEvent(SimulationEventType.INITIALIZED)
    }
    
    /**
     * Initializes all data handlers that have not been initialized yet
     */
    private def void initializeHandlers(List<DataHandler> handlers) {
        // Initialize simulators
        for(handler : handlers) {
            if(handler instanceof Simulator) {
                if(!initializedHandlers.contains(handler)) {
                    initializedHandlers.add(handler)           
                    handler.initialize(currentPool)
                }
            }
        }
    }
    
    /**
     * Execute a single step action and save the resulting state.
     */
    public def void stepSubTick() {
        if(isStopped) {
            return
        } else if(isPlaying) {
            pause()
        }
        
        // Apply user made changes
        currentPool.applyUserValues
        
        // Create following state
        val DataPool pool = createNextPool()
        // Perform action on this new state
        currentAction.apply(pool)
        // Save new state
        setNewState(pool, currentState.actionIndex + 1)
        
//        println("Sub Stepped simulation")
        fireEvent(SimulationEventType.SUB_STEP)
    }
    
    /**
     * Execute all step actions that make up a macro tick and save the resulting state.
     */
    public def void stepMacroTick() {
        if(isStopped) {
            return
        } else if(isPlaying) {
            pause()
        }
        
        // Apply user made changes
        currentPool.applyUserValues
        
        // Create following state
        val DataPool pool = createNextPool()
        // Perform actions on this new state
        val nextActionIndex = applyMacroTickActions(pool)
        // Save new state
        setNewState(pool, nextActionIndex)
//        println("Stepped simulation macro tick")
        fireEvent(SimulationEventType.MACRO_STEP)
    }
    
    /**
     * Go back to the previous state of the simulation.
     */
    public def void stepBack() {
        if(isStopped) {
            return
        } else if(isPlaying) {
            pause()
        }
        
        // Load state from history
        positionInHistory++;
        if(positionInHistory > history.size) {
            positionInHistory = 0;
        }
        if(positionInHistory > 0) {
            val oldState = history.get(history.size - positionInHistory)
            if(oldState != null) {
                // Set user value of all variables to value of old state
                for(m : currentPool.models) {
                    val oldModel = oldState.pool.getModel(m.name)
                    if(oldModel != null) {
                        for(v : m.variables) {
                            val oldVariable = oldModel.getVariable(v.name)
                            if(oldVariable != null) {
                                v.userValue = oldVariable.value
                            }
                        }
                    }
                }
            }
        } else {
            // Reset all user values
            for(v : currentPool.allVariables) {
                v.userValue = null
            }
        }
        
        fireEvent(SimulationEventType.STEP_BACK)
    }

    /**
     * Execute stepping through the simulation frequently in a dedicated thread.
     */
    public def void play() {
        if(isStopped) {
            return
        }
        if(!isPlaying) {
            isPlaying= true
            
            steppingJob = new Job("Simulation Player") {
                override protected run(IProgressMonitor monitor) {
                    var int currentTime = System.currentTimeMillis.intValue
                    var int nextTickTime = currentTime
                    while(isPlaying) {
                        currentTime = System.currentTimeMillis.intValue
                        if(nextTickTime > currentTime) {
                            // Wait until next tick time reached
                            val pause = nextTickTime - currentTime 
                            Thread.sleep(pause);
                        }
                        // Save time BEFORE the tick is executed
                        val int timeBeforeTick = System.currentTimeMillis.intValue
                        
                        // Notify listeners of new state
                        fireEvent(SimulationEventType.PLAYING)
                        
                        // Apply user made changes
                        currentPool.applyUserValues
                        // Set variable of model to current time if needed
                        if(currentTimeVariable.value != null) {
                            val variable = currentPool.getVariable(currentTimeVariable.stringValue)
                            if(variable.isInput) {
                                variable.value = System.currentTimeMillis.intValue
                            } else {
                                throw new Exception("The variable that receives the current time must be an input")
                            }
                        }
                        // Create following state
                        val DataPool pool = createNextPool()
                        // Perform actions on this new state
                        val nextActionIndex = applyMacroTickActions(pool)
                        // Save new state
                        setNewState(pool, nextActionIndex)
                        
                        // Set absolute time for next tick (possibly from a variable in the data pool)
                        if(nextTickTimeVariable.value != null) {
                            val variable = currentPool.getVariable(nextTickTimeVariable.stringValue)
                            if(variable.isOutput) {
                                nextTickTime = variable.value.doubleValue.intValue
                            } else {
                                throw new Exception("The variable that determines the time for the next tick must be an output")
                            }
                        } else {
                            nextTickTime = timeBeforeTick + desiredTickPause
                        }
                        currentTime = System.currentTimeMillis.intValue
                        
                        // If the nextTickTime is already smaller than the currentTime,
                        // the tick took more time than the play delay. Thus it is too slow
                        if(nextTickTime < currentTime) {
                            val event = new SimulationEvent
                            event.type = SimulationEventType.ERROR
                            event.message = "Tick needed longer than desired. "
                                          + "(needed: "+(currentTime-timeBeforeTick)+" ms, "
                                          + "desired: "+(timeBeforeTick-nextTickTime)+ " ms)"
                            System.err.println(event.message)
                            fireEvent(event)
                        }
                    }
                    fireEvent(SimulationEventType.MACRO_STEP)
                    return Status.OK_STATUS
                }
            }
            steppingJob.schedule()
        }
    }
    
    /**
     * Stop the dedecated thread for simulation execution.
     */
    public def void pause() {
        if(isStopped) {
            return
        }
        if(isPlaying) {
            isPlaying = false
        }
        
        fireEvent(SimulationEventType.PAUSE)
    }
    
    /**
     * Stop the simulation and all data handlers.
     */
    public def void stop() {
        if(isStopped) {
            return
        }
        
        isPlaying = false
        // Wait for the concurrent thread to terminate
        if(steppingJob != null) {
            if(steppingJob.join(3000, null)) {
                steppingJob = null
            } else {
                throw new Exception("The concurrent thread that plays the simulation does not seem to terminate.")
            }
        }
        
        // Stop simulation
        isStopped = true
        for(handler : dataHandlers) {
            handler.stop()
        }
        currentState = null
        
        fireEvent(SimulationEventType.STOP)
    }
    
    /**
     * Returns the data pool of the current state
     */
    public def DataPool getCurrentPool() {
        if(currentState == null) {
            return null
        }
        return currentState.pool
    }
    
    /**
     * Returns the step action of the current state's step action index.
     */
    public def StepAction getCurrentAction() {
        if(currentState == null) {
            return null
        }
        return getActionStep(currentState.actionIndex)
    }
    
    /**
     * Returns the step action with the given step action index.
     */
    public def StepAction getActionStep(int index) {
        if(actions.isNullOrEmpty) {
            return null
        } 
        val relativeActionIndex = index % actions.size()
        return actions.get(relativeActionIndex)
    }
    
    /**
     * Sets the current state to a new state and updates the history.
     */
    private def void setNewState(DataPool newPool, int newActionIndex) {
        if(currentState != null) {
            history.add(currentState)
        }
        // Remove oldest states if history is too long
        if(maxHistoryLength.intValue >= 0 && history.size >= maxHistoryLength.intValue) {
            val oldState = history.get(0)
            oldState.pool.previousPool = null
            history.remove(0)
        }
        currentState = new StepState(newPool, newActionIndex)
    }
    
    /**
     * Create the data pool for the following state.
     */
    private def DataPool createNextPool() {
        positionInHistory = 0
        val pool = currentState.pool.clone()  
        if(maxHistoryLength.intValue != 0) {
            pool.previousPool = currentPool
        }
        return pool
    }
    
    /**
     * Applies all step actions that make up a macro tick to the given pool.
     */
    private def int applyMacroTickActions(DataPool pool) {
        // Round action index up to next fully done macro tick
        val macroTickActionCount = actions.size
        val currentActionIndex = currentState.actionIndex
        if(macroTickActionCount > 0) {
            val nextActionIndex = ((currentActionIndex + macroTickActionCount) / macroTickActionCount) * macroTickActionCount
            // Apply all data handlers up to next fully done macro tick
            for(var i = currentActionIndex; i < nextActionIndex; i++) {
                getActionStep(i).apply(pool)
            }
            return nextActionIndex
        } else {
            return currentState.actionIndex+1
        }
    }
    
    /**
     * Notifies all listeners about an event.
     */
     public def void fireEvent(SimulationEvent event) {
         for(l : listeners) {
             l.update(event)
         }
     }
    
    /**
     * Notifies all listeners about an event.
     */
     protected def void fireEvent(SimulationEventType type, Variable variable) {
         val e = new SimulationEvent()
         e.type = type
         e.pool = currentPool
         e.variable = variable
         fireEvent(e)
     }
     
     /**
     * Notifies all listeners about an event.
     * The pool is set to the current pool in the simulation.
     */
     public def void fireEvent(SimulationEventType type) {
         val e = new SimulationEvent()
         e.type = type
         e.pool = currentPool
         fireEvent(e)
     }
     
     public static def void addListener(SimulationListener listener) {
         if(!listeners.contains(listener)) {
             listeners.add(listener)
         }
     }
     
     public static def void removeListener(SimulationListener listener) {
         listeners.remove(listener)
     }
}