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
import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.configurable.Configurable
import de.cau.cs.kieler.prom.configurable.ConfigurableAttribute
import de.cau.cs.kieler.simulation.SimulationPlugin
import de.cau.cs.kieler.simulation.core.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.core.events.SimulationEvent
import de.cau.cs.kieler.simulation.core.events.SimulationListener
import de.cau.cs.kieler.simulation.core.events.SimulationOperation
import de.cau.cs.kieler.simulation.kisim.Action
import de.cau.cs.kieler.simulation.kisim.SimulationConfiguration
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.core.runtime.preferences.InstanceScope
import org.eclipse.xtend.lib.annotations.Accessors
import org.osgi.service.prefs.Preferences
import java.util.ArrayList

/**
 * The simulation manager holds a configuration of a simulation and takes care of its execution.
 * The configuration is a list of step actions to perform in a loop.
 * A single iteration of all step actions represent the execution of a macro tick.
 * <br><br>
 * Executing a simulation step will perform the operation by the data handler of the step action
 * and thereby updating the current state of the simulation.
 * <br><br>
 * The manager can step through the simulation handler by handler (step sub tick)<br>
 * or using all handlers of a macro tick at once (step macro tick)<br>
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
     * Default pause in milliseconds when playing the simulation
     */
    public static val DEFAULT_PAUSE = 500;
    
    /**
     * Default maxmimum history length
     */
    public static val DEFAULT_MAX_HISTORY_LENGTH = 100;
    
    /**
     * Minimum pause in milliseconds when playing the simulation
     */
    public static val MIN_PAUSE = 10;
    
    /**
     * Maximum pause in milliseconds when playing the simulation
     */
    public static val MAX_PAUSE = 3000;
    
    /**
     * The pause in milliseconds that is waited between two ticks in play mode.
     * The time is including the duration of the tick,
     * thus the actually waited time might be smaller, if the tick took longer to execute.
     */
    @Accessors(PUBLIC_GETTER)
    private static var int desiredTickPause = loadDesiredTickPause
    
    /**
     * List of event listeners
     */
    @Accessors(PUBLIC_GETTER)
    private static val List<SimulationListener> listeners = newArrayList
    
    /**
     * The disabled listeners that should not receive any events.
     */
    private static val Set<SimulationListener> disabledListeners = newHashSet
    
    private static val DISABLED_LISTENERS_ATTR = "disabledSimulationListeners"
    private static val MAX_HISTORY_LENGTH_ATTR = "maxHistoryLength"
    private static val DESIRED_PAUSE_ATTR = "desiredTickPause"
    
    /**
     * The name of an input variable in the data pool,
     * which should receive the current system time as value.
     */
    public val currentTimeVariable = new ConfigurableAttribute("currentTimeVariable", null, #[String])
    
    /**
     * The name of an output variable in the data pool,
     * that determines the next time the tick function should be called.
     */
    public val nextTickTimeVariable = new ConfigurableAttribute("nextTickTimeVariable",null, #[String])
    
    /**
     * The job that executes the step actions concurrently when playing.
     */
    private var Job steppingJob = new AsynchronousSimulationJob("Simulation Player", this)
    
    /**
     * Flag to determine if the simulation is playing automatically in a separate thread.
     */
    @Accessors(PUBLIC_GETTER)
    private var boolean isPlaying
    
    /**
     * Has the simulation been stopped? 
     */
     @Accessors(PUBLIC_GETTER)
    private var boolean isStopped
    
    /**
     * The position when scrolling through the history.
     * 0 is the current data pool, 1 is the previous data pool, 2 is two data pools ago, etc.
     */
    @Accessors(PUBLIC_GETTER)
    private var int positionInHistory;
    
    /**
     * The configuration that has been used to create the simulation.
     * May be null if the simulation was started programatically.
     */
    @Accessors(PUBLIC_GETTER)
    private var SimulationConfiguration usedConfiguration
    
    /**
     * The file handle of the used configuration.
     * May be null if the simulation was started programatically.
     */
    @Accessors(PUBLIC_GETTER)
    private var IFile usedConfigurationFile
    
    /**
     * Instances of the data handlers in the step actions without duplicates.
     */
    private val Set<DataHandler> dataHandlers = newHashSet()
    /**
     * The list of step actions that make up a macro tick simulation.
     */
    private val List<StepAction> actions = newArrayList()

    /**
     * The current state of the simulation.
     */
    @Accessors(PUBLIC_GETTER)
    private var StepState currentState
    
    /**
     * The history of step states of this simulation run from old to new.
     */
    @Accessors(PUBLIC_GETTER)
    private var List<StepState> history = newArrayList()
    
    /**
     * Id's of the data handlers used. There may be multiple handlers with the same id.
     */
    val Map<DataHandler, String> idForDataHandler = newHashMap
    
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
     * 
     * @param config The simulation configuration
     */
    new(SimulationConfiguration config) {
        this()
        // Remember the used configuration
        usedConfiguration = config
        usedConfigurationFile = ModelImporter.toPlatformResource(config?.eResource)
        
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
        
        // Add actions that make up a macro tick
        if(config.execution != null) {
            for(action : config.execution.actions) {
                val handler = action.findDataHandler
                // Add step action with the corresponding method
                addAction(action.operation, handler)
            }
        }
    }
    
    /**
     * Find handler that matches the id and name of the action.
     * 
     * @param action The action
     */
    private def findDataHandler(Action action) {
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
     * Sets the pause between ticks in play mode.
     * 
     * @param value The new value in milliseconds
     */
    public static def void setDesiredTickPause(int value) {
        if(value >= MIN_PAUSE && value <= MAX_PAUSE) {
            desiredTickPause = value
            saveDesiredTickPause
        } else {
            throw new IllegalArgumentException("Desired pause for simulation must be between "+MIN_PAUSE+" to "+MAX_PAUSE)
        }
    }
    
    /**
     * Returns the number of the current macro tick to be exectued.
     * 
     * @return the number of the current macro tick to be exectued.
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
     * Returns the number of the current sub tick within the current macro tick to be exectued.
     * 
     * @return the number of the current sub tick within the current macro tick to be exectued.
     */
    public def int getCurrentSubTickNumber() {
        if(currentState != null) {
            if(actions.size > 0) {
                return currentState.actionIndex % actions.size
            } else {
                return 0
            }
        } else {
            return 0
        }
    }
    
    /**
     * Adds a data handler
     * 
     * @param handler The handler
     */
    private def void addHandler(DataHandler handler) {
        if(!dataHandlers.contains(handler))
            dataHandlers.add(handler)
    }
    
    /**
     * Adds a step action before all others.
     * 
     * @param method The method to be performed. Can be null if the handler has only a single method.
     * @param handler The handler that should perform the method
     */
    public def void prependAction(String method, DataHandler handler) {
        if(method == null) {
            prependAction(handler)
        } else {
            addHandler(handler)
            actions.add(0, new StepAction(method, handler))    
        }
    }
    
    /**
     * Adds a step action for a handler, which has only a single operation it can perform.
     * 
     * @param handler The handler that should perform its method
     */
    public def void prependAction(DataHandler handler) {
        addHandler(handler)
        actions.add(0, new StepAction(handler))
    }
    
    /**
     * Adds a step action.
     * 
     * @param method The method to be performed. Can be null if the handler has only a single method.
     * @param handler The handler that should perform the method
     */
    public def void addAction(String method, DataHandler handler) {
        if(method == null) {
            addAction(handler)
        } else {
            addHandler(handler)
            actions.add(new StepAction(method, handler))    
        }
    }
    
    /**
     * Adds a step action for a handler, which has only a single operation it can perform.
     * 
     * @param handler The handler that should perform its method
     */
    public def void addAction(DataHandler handler) {
        addHandler(handler)
        actions.add(new StepAction(handler))
    }
    
    /**
     * Initialize the simulation.
     * All simulators are initilized to create the initial data pool.
     */
    public def void initialize() {
        // Initialize handlers
        initializeHandlers
        
        // Perform actions from initialization part of configuration
        if(usedConfiguration != null && usedConfiguration.initialization != null) {
            for(action : usedConfiguration.initialization.actions) {
                val handler = action.findDataHandler
                // Add step action with the corresponding method
                val stepAction = new StepAction(action.operation, handler)
                stepAction.apply(currentPool)
            }
        }
        // Fire initialization event
        fireEvent(SimulationOperation.INITIALIZED)
    }
    
    /**
     * Initializes the data handlers.
     * 
     * @param handlers The data handlers
     */
    private def void initializeHandlers() {
        for(handler : dataHandlers) {
            handler.initialize
            // Initialize simulation handlers
            if(handler instanceof Simulator) {
                handler.initialize(currentPool)
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
        // Notify listeners that a tick is going to happen
        fireEvent(SimulationOperation.BEFORE_STEPPING)
        // Create following state
        val DataPool pool = createNextPool()
        // Apply user made changes
        pool.applyUserValues
        // Perform action on this new state
        currentAction.apply(pool)
        // Save new state
        setNewState(pool, currentState.actionIndex + 1)
        // Fire event
        fireEvent(SimulationOperation.SUB_STEP)
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
        // Notify listeners that a tick is going to happen
        fireEvent(SimulationOperation.BEFORE_STEPPING)
        // Create following state
        val DataPool pool = createNextPool()
        // Apply user made changes
        pool.applyUserValues
        // Perform actions on this new state
        val nextActionIndex = applyMacroTickActions(pool)
        // Save new state
        setNewState(pool, nextActionIndex)
        // Fire event
        fireEvent(SimulationOperation.MACRO_STEP)
    }
    
    /**
     * Go back to the previous state of the simulation.
     */
    public def void stepHistoryForward() {
        if(isStopped) {
            return
        } else if(isPlaying) {
            pause
        }
        // Load state from history
        val lastPositionInHistory = positionInHistory
        positionInHistory--;
        if(positionInHistory < 0) {
            positionInHistory = history.size;
        }
        if(lastPositionInHistory != positionInHistory) {
            loadStateFromHistory
            // Fire event
            fireEvent(SimulationOperation.STEP_HISTORY_FORWARD)
        }
    }
    
    /**
     * Go back to the previous state of the simulation.
     */
    public def void stepHistoryBack() {
        if(isStopped) {
            return
        } else if(isPlaying) {
            pause
        }
        // Load state from history
        val lastPositionInHistory = positionInHistory
        positionInHistory++;
        if(positionInHistory > history.size) {
            positionInHistory = 0;
        }
        if(lastPositionInHistory != positionInHistory) {
            loadStateFromHistory
            // Fire event
            fireEvent(SimulationOperation.STEP_HISTORY_BACK)
        }
    }

    /**
     * Loads the values of a former state in the simulation.
     * Therefore the user values of the current state are set to the values of a former tick.  
     */
    private def void loadStateFromHistory() {
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
    }

    /**
     * Execute stepping through the simulation frequently in a dedicated thread.
     */
    public def void play() {
        // Nothing to do if the simulation is already in play mode.
        if(isStopped || isPlaying) {
            return
        }
        isPlaying= true
        // Create a new job to step through the simulation concurrently
        steppingJob.schedule()
    }
    
    /**
     * Stop the dedicated thread for simulation execution.
     */
    public def void pause() {
        if(isStopped || !isPlaying) {
            return
        }
        isPlaying = false
        
        fireEvent(SimulationOperation.PAUSE)
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
        // Fire event
        fireEvent(SimulationOperation.STOP)
    }
    
    /**
     * Returns the data pool of the current state.
     * 
     * @return the data pool of the current state
     */
    public def DataPool getCurrentPool() {
        if(currentState == null) {
            return null
        }
        return currentState.pool
    }
    
    /**
     * Returns the step action of the current state's step action index.
     * 
     * @return the step action of the current state's step action index.
     */
    public def StepAction getCurrentAction() {
        if(currentState == null) {
            return null
        }
        return getActionStep(currentState.actionIndex)
    }
    
    /**
     * Returns the step action with the given step action index.
     * 
     * @return the step action with the given step action index.
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
     * 
     * @param newPool The data pool of the new state
     * @param newActionIndex The action index of the new state
     */
    protected def void setNewState(DataPool newPool, int newActionIndex) {
        // Add current state to history
        if(currentState != null) {
            history.add(currentState)
        }
        // Remove oldest states if history is too long
        if(maxHistoryLength.intValue >= 0 && history.size > maxHistoryLength.intValue) {
            history.remove(0)
            if(!history.isEmpty) {
                val newOldestState = history.get(0)
                newOldestState.pool.previousPool = null    
            }
        }
        newPool.actionIndex = newActionIndex
        currentState = new StepState(newPool, newActionIndex)
    }
    
    /**
     * Create the data pool for the following state.
     * 
     * @return The data pool for the following state
     */
    protected def DataPool createNextPool() {
        // Drop states in history if a former state was loaded
        if(positionInHistory > 0) {
            val loadedState = historyState
            for(var i = 1; i <= positionInHistory; i++) {
                history.remove(history.size - 1)    
            }
            positionInHistory = 0
            // The current state replaces the loaded state
            currentState.pool.previousPool = loadedState.pool.previousPool
            currentState.actionIndex = loadedState.actionIndex
        }
        // Clone pool for next tick
        val pool = currentPool.clone()
        // Set history of new pool
        if(maxHistoryLength.intValue != 0) {
            pool.previousPool = currentPool
        }
        return pool
    }
    
    public def StepState getHistoryState() {
        if(positionInHistory > 0) {
            return history.get(history.size - positionInHistory)
        } else {
            return null
        }
    }
    
    /**
     * Applies all step actions to the given pool that make up a macro tick.
     * 
     * @param pool The pool
     */
    protected def int applyMacroTickActions(DataPool pool) {
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
     * 
     * @param event The Event
     */
    public def void fireEvent(SimulationEvent event) {
        for(l : listeners) {
            if(!isDisabled(l)) {
               l.update(event)    
           }
        }
    }
     
    /**
     * Notifies all listeners about handling the simulation.
     * 
     * @param operation The operation that triggered this event
     */
    public def void fireEvent(SimulationOperation operation) {
        val e = new SimulationControlEvent(operation, currentPool)
        fireEvent(e)
    }
     
    /**
     * Adds a listener to be notified about simulation events.
     * 
     * @param listener The listener
     */
    public static def void add(SimulationListener listener) {
        if(!listeners.contains(listener)) {
            listeners.add(listener)
        }
        // Check if this listener was disabled the last time.
        val disabledNames = getDisabledListenerNames
        if(disabledNames.contains(listener.name)) {
            disable(listener)
        }
    }
    
    /**
     * Removes a listener.
     * 
     * @param listener The listener
     */
    public static def void remove(SimulationListener listener) {
        listeners.remove(listener)
    }
     
    /**
     * Enables a listener.
     * 
     * @param listener The listener
     */
    public static def void enable(SimulationListener listener) {
        disabledListeners.remove(listener)
        // Persist the disabled state
        val disabledNames = getDisabledListenerNames
        disabledNames.remove(listener.name)
        preferences.put(DISABLED_LISTENERS_ATTR, disabledNames.join(","))
        preferences.flush()
    }
    
    /**
     * Disables a listener.
     * 
     * @param listener The listener
     */
    public static def void disable(SimulationListener listener) {
        if(!disabledListeners.contains(disabledListeners)) {
            disabledListeners.add(listener)
        }
        // Persist the disabled state
        val disabledNames = getDisabledListenerNames
        if(!disabledNames.contains(listener.name)) {
            disabledNames.add(listener.name)
        }
        preferences.put(DISABLED_LISTENERS_ATTR, disabledNames.join(","))
        preferences.flush()
    }
    
    /**
     * Checks if a listener is disabled.
     * 
     * @param listener The listener
     */
    public static def boolean isDisabled(SimulationListener listener) {
        return disabledListeners.contains(listener)
    }
    
    /**
     * Returns the names of the persisted disabled simulation listeners.
     * 
     * @return the names of the persisted disabled simulation listeners.
     */
    private static def ArrayList<String> getDisabledListenerNames() {
        val disabledCSV = preferences.get(DISABLED_LISTENERS_ATTR, "")
        val result = newArrayList
        for(name : disabledCSV.split(",")) {
            if(!name.isNullOrEmpty) {
                result.add(name)    
            }
        }
        return result
    }
    
    /**
     * Returns the maximum history length.
     * 
     * @return the maximum history length.
     */
    public static def int getMaxHistoryLength() {
        preferences.getInt(MAX_HISTORY_LENGTH_ATTR, DEFAULT_MAX_HISTORY_LENGTH)
    }
    
    /**
     * Sets the maximum history length.
     * 
     * @param value The new value
     */
    public static def void setMaxHistoryLength(int value) {
        preferences.putInt(MAX_HISTORY_LENGTH_ATTR, value)
    }
    
    /**
     * Returns the preferences in which the attributes are stored.
     */
    private static def Preferences getPreferences() {
        return InstanceScope.INSTANCE.getNode(SimulationPlugin.PLUGIN_ID)
    }
    
    /**
     * Loads the desired tick pause from the preferences.
     */
    private static def int loadDesiredTickPause() {
        return preferences.getInt(DESIRED_PAUSE_ATTR, DEFAULT_PAUSE)
    }
    
    /**
     * Saves the desired tick pause to the preferences.
     */
    private static def void saveDesiredTickPause() {
        preferences.putInt(DESIRED_PAUSE_ATTR, desiredTickPause)
        preferences.flush
    }
}