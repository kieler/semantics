/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem.data;

import java.io.Serializable;
import java.util.HashMap;

import de.cau.cs.kieler.sim.kiem.extension.DataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemEvent;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * The Class DataComponentEx. Is a wrapper for the
 * {@link de.cau.cs.kieler.sim.kiem.extension.DataComponent} class. It should enrich the above class
 * with information that is only needed for instances in the running execution manager and its view.
 * For example whether a DataComponent instance is enabled or disabled or the current pool index for
 * delta observer DataComponents.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class DataComponentEx implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4500131140237160894L;

    /** The contained DataComponent. */
    private transient DataComponent component;

    /** The pool indices for history steps. */
    private transient HashMap<Long, Long> poolIndices;

    /** The currently stored delta index. */
    private transient long deltaIndex;

    /** The boolean json flag indicating a JSON capable DataComponent. */
    private transient boolean json;

    /** Indicates that the properties are unfolded. */
    private transient boolean unfolded;

    /**
     * The boolean enabled flag indicating whether the DataComponent is enabled or not.
     */
    private boolean enabled;

    /** Indicates that the properties are unfolded. */
    private KiemProperty[] properties;

    /** The component id of the component for deserialization. */
    private String componentId;

    // -------------------------------------------------------------------------

    // private synchronized void writeObject( java.io.ObjectOutputStream s )
    // throws IOException {
    // //do not save anything
    // System.out.println("SAVING");
    // }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new DataComponentEx wrapping a DataComponent.
     * 
     * @param componentParam
     *            the contained DataComponent
     */
    public DataComponentEx(final DataComponent componentParam) {
        super();
        this.component = componentParam;
        this.enabled = true;
        this.json = true;
        this.poolIndices = new HashMap<Long, Long>();
        this.deltaIndex = 0;
        this.properties = this.component.getProperties();
        this.componentId = component.getDataComponentId();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets a component id to identify DataComponents during loading because the DataComponents
     * itself do not get serialized.
     * 
     * @return the component id
     */
    public String getComponentId() {
        return componentId;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the properties for the DataComponent and this DataComponentEx instance. These are just
     * too links to the same properties.
     * 
     * @param propertiesParam
     *            the new properties
     */
    public void setProperties(final KiemProperty[] propertiesParam) {
        this.component.setProperties(propertiesParam);
        this.properties = propertiesParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether this DataComponent is a JSON component that is able to handle JSONObjects of
     * the following Java implementation {@link "http://www.json.org/java"}.
     * 
     * @return true, if this DataComponent is JSON capable
     */
    public boolean isJSON() {
        if (this.getDataComponent() instanceof JSONObjectDataComponent) {
            this.json = true;
        } else {
            this.json = false;
        }
        return this.json;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the properties of this DataComponent are unfolded.
     * 
     * @return true, if properties are unfolded
     */
    public boolean isUnfolded() {
        return this.unfolded;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets whether the properties of this DataComponent are unfolded.
     * 
     * @param unfoldedParam
     *            set to true if they are unfolded
     */
    public void setUnfolded(final boolean unfoldedParam) {
        this.unfolded = unfoldedParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the contained DataComponent.
     * 
     * @return the contained DataComponent
     */
    public DataComponent getDataComponent() {
        return component;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the DataComponent is enabled or disabled.
     * 
     * @return true, if is enabled
     */
    public boolean isEnabled() {
        return enabled;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the enabled flag of this DataComponent. This is also reflected by the KiemView GUI
     * whenever a refresh is triggered.
     * 
     * @param enabledParam
     *            true, if the DataComponent is enabled
     */
    public void setEnabled(final boolean enabledParam) {
        this.enabled = enabledParam;
        // notify the DataComponent
        if (enabledParam) {
            this.component.notifyEvent(new KiemEvent(KiemEvent.ACTIVATED));
        }
        else {
            this.component.notifyEvent(new KiemEvent(KiemEvent.DEACTIVATED));
        }
        //this.component.notifyEnabled(enabledParam);
    }

    // -------------------------------------------------------------------------

    /**
     * Reset pool indices. This is called whenever the execution is reset.
     */
    public void resetPoolIndices() {
        poolIndices = new HashMap<Long, Long>();
    }

    // -------------------------------------------------------------------------

    /**
     * Adds a pool index for a given step. This is necessary to recover delta pool indices of a
     * history step.
     * 
     * @param poolIndex
     *            the pool index to add
     * @param stepCounter
     *            the related step counter
     */
    public void addPoolIndex(final long poolIndex, final long stepCounter) {
        if (!poolIndices.containsKey(stepCounter)) {
            poolIndices.put(stepCounter, poolIndex);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the pool index of a specific step. This is necessary to recover delta pool indices of a
     * history step.
     * 
     * @param stepCounter
     *            the step counter to find the related pool index
     * 
     * @return the related pool index
     */
    public long getPoolIndex(final long stepCounter) {
        if (!poolIndices.containsKey(stepCounter)) {
            return -1;
        }
        return poolIndices.get(stepCounter);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the delta index. This is used for delta DataComponents only. The delta index is the last
     * pool index when this DataComponent as an observer did not get skipped.
     * 
     * @return the delta index
     */
    public long getDeltaIndex() {
        return this.deltaIndex;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the delta index. This is used for delta DataComponents only. The delta index is the last
     * pool index when this DataComponent as an observer did not get skipped.
     * 
     * @param deltaIndexParam
     *            the new delta index
     */
    public void setDeltaIndex(final long deltaIndexParam) {
        this.deltaIndex = deltaIndexParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the DataComponent is a producer <B>AND</B> an observer at the same time.
     * 
     * @return true, if it is a producer and an observer
     */
    public boolean isProducerObserver() {
        return (this.isProducer() && this.isObserver());
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the DataComponent is a pure producer only.
     * 
     * @return true, if it is a producer only
     */
    public boolean isProducerOnly() {
        return (this.isProducer() && !this.isObserver());
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the DataComponent is a pure observer only.
     * 
     * @return true, if it is an observer only
     */
    public boolean isObserverOnly() {
        return (!this.isProducer() && this.isObserver());
    }

    // -------------------------------------------------------------------------
    // -- PROXY METHODS --
    // -------------------------------------------------------------------------

    /**
     * Checks whether the DataComponent is an producer.
     * 
     * @return true, if it is a producer
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isProducer()
     */
    public boolean isProducer() {
        return this.component.isProducer();
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the DataComponent is an observer.
     * 
     * @return true, if it is an observer
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isObserver()
     */
    public boolean isObserver() {
        return this.component.isObserver();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the name of the DataComponent.
     * 
     * @return the name
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#getName()
     */
    public String getName() {
        return this.component.getName();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the filter keys if the DataComponent provides any or null if it is an observer and wants
     * <B>ALL</B> complete data.
     * 
     * @return the filter keys
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#provideFilterKeys()
     */
    public String[] provideFilterKeys() {
        return this.component.provideFilterKeys();
    }

    // -------------------------------------------------------------------------

    /**
     * This method is implemented by the DataComponent if it provides a String[] array of interface
     * variables.
     * 
     * @return the String[] array of interface variables
     * 
     * @throws KiemInitializationException
     *             the KIEM initialization exception
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#provideInterfaceKeys()
     */
    @Deprecated
    public String[] provideInterfaceKeys() throws KiemInitializationException {
        return this.component.provideInterfaceKeys();
    }

    // -------------------------------------------------------------------------

    /**
     * This method is implemented by the DataComponent if it provides a JSONObject of initial
     * variables.
     * 
     * @return the JSONObject of initial variables
     * 
     * @throws KiemInitializationException
     *             the KIEM initialization exception
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent#provideInitialVariables()
     * @see de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent#provideInitialVariables()
     */
    public JSONObject provideInitialVariables() throws KiemInitializationException {
        JSONObject initialVariables = null;
        if (isJSON()) {
            initialVariables = ((JSONObjectDataComponent) this.component).provideInitialVariables();
        } else {
            String initialVariablesString = ((JSONStringDataComponent) this.component)
                    .provideInitialVariables();
            //only try this with valid Strings
            if (initialVariablesString != null) {
                try {
                    initialVariables = new JSONObject(initialVariablesString);
                } catch (JSONException e) {
                    throw new KiemInitializationException(
                            "Cannot parse initial variables into JSONObject.", false, e);
                }
            }
        }
        return initialVariables;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the KiemProperties of this DataComponent.
     * 
     * @return the KiemProperties
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#getProperties()
     */
    public KiemProperty[] getProperties() {
        return this.properties;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the DataComponent is a delta observer.
     * 
     * @return true, if DataComponent is a delta observer
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isDeltaObserver()
     */
    public boolean isDeltaObserver() {
        return this.component.isDeltaObserver();
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the DataComponent is a history observer.
     * 
     * @return true, if DataComponent is a history observer
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isHistoryObserver()
     */
    public boolean isHistoryObserver() {
        return this.component.isHistoryObserver();
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if the current step is a history step. Normally only called by the DataConsumer itself
     * to implement special behavior within its step() method.
     * 
     * @return true, if current step is a history step
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isHistoryStep()
     */
    public boolean isHistoryStep() {
        return this.component.isHistoryStep();
    }

    // -------------------------------------------------------------------------

    /**
     * Flag the current step as a history step. Called by the execution manager.
     * 
     * @param historyStep
     *            true, if the step is a history step
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#setHistoryStep(boolean)
     */
    public void setHistoryStep(final boolean historyStep) {
        this.component.setHistoryStep(historyStep);
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether this DataComponent implements a master.
     * 
     * @return true, if the DataComponent is a master
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isMaster()
     */
    public boolean isMaster() {
        return this.component.isMaster();
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is pause flag.
     * 
     * @return true, if is pause flag
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isPauseFlag()
     */
    public boolean isPauseFlag() {
        return this.component.isPauseFlag();
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is a macro step is finished.
     * 
     * @return true, if checks if is macro step done
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isMacroStepDone()
     */
    public boolean isMacroStepDone() {
        return this.component.isMacroStepDone();
    }

    // -------------------------------------------------------------------------

    /**
     * Let the DataComponent check its properties. It is supposed to throw an error if a property is
     * not set correctly.
     * 
     * @param propertiesParam
     *            the KiemProperties of this component
     * 
     * @throws KiemPropertyException
     *             an Exception in case of an error
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#checkProperties(KiemProperty[])
     */
    public void checkProperties(final KiemProperty[] propertiesParam) throws KiemPropertyException {
        this.component.checkProperties(propertiesParam);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the global interface variable keys. This method is called by the execution manager after
     * it collects the union of interface variable keys of all DataComponents.
     * 
     * @param globalInterfaceKeys
     *            all interface variable keys
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#setInterfaceKeys(String[])
     */
    @Deprecated
    public void setInterfaceKeys(final String[] globalInterfaceKeys) {
        this.component.setInterfaceKeys(globalInterfaceKeys);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the global initial variables. This method is called by the execution manager after it
     * collects the union of initial variables of all DataComponents.
     * 
     * @param globalInitialVariables
     *            all interface variable keys
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent#setInitialVariables(JSONObject)
     * @see de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent#setInitialVariables(String)
     */
    public void setInitialVariables(final JSONObject globalInitialVariables) {
        if (isJSON()) {
            ((JSONObjectDataComponent) this.component).setInitialVariables(globalInitialVariables);
        } else {
            ((JSONStringDataComponent) this.component).setInitialVariables(globalInitialVariables
                    .toString());
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the master is implementing GUI buttons.
     * 
     * @return true, if is master DataComponent is implementing GUI buttons
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isMasterImplementingGUI()
     */
    public boolean isMasterImplementingGUI() {
        return this.component.isMasterImplementingGUI();
    }

    // -------------------------------------------------------------------------

//    /**
//     * Master component enables/disables and implements GUI button step back.
//     * 
//     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIstepBack()
//     */
//    public void masterGUIstepBack() {
//        this.component.masterGUIstepBack();
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Master component enables/disables and implements GUI button step.
//     * 
//     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIstep()
//     */
//    public void masterGUIstep() {
//        this.component.masterGUIstep();
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Master component enables/disables and implements GUI button macro step.
//     * 
//     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUImacroStep()
//     */
//    public void masterGUImacroStep() {
//        this.component.masterGUImacroStep();
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Master component enables/disables and implements GUI button run.
//     * 
//     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIrun()
//     */
//    public void masterGUIrun() {
//        this.component.masterGUIrun();
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Master component enables/disables and implements GUI button pause.
//     * 
//     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIpause()
//     */
//    public void masterGUIpause() {
//        this.component.masterGUIpause();
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Master component enables/disables and implements GUI button stop.
//     * 
//     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIstop()
//     */
//    public void masterGUIstop() {
//        this.component.masterGUIstop();
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Master component enables/disables and implements GUI button step back.
//     * 
//     * @return true, if button is enabled
//     * 
//     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIisEnabledStepBack()
//     */
//    public boolean masterGUIisEnabledStepBack() {
//        return this.component.masterGUIisEnabledStepBack();
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Master component enables/disables and implements GUI button step.
//     * 
//     * @return true, if button is enabled
//     * 
//     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIisEnabledStep()
//     */
//    public boolean masterGUIisEnabledStep() {
//        return this.component.masterGUIisEnabledStep();
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Master component enables/disables and implements GUI button macro step.
//     * 
//     * @return true, if button is enabled
//     * 
//     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIisEnabledMacroStep()
//     */
//    public boolean masterGUIisEnabledMacroStep() {
//        return this.component.masterGUIisEnabledMacroStep();
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Master component enables/disables and implements GUI button pause.
//     * 
//     * @return true, if button is enabled
//     * 
//     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIisEnabledPause()
//     */
//    public boolean masterGUIisEnabledPause() {
//        return this.component.masterGUIisEnabledPause();
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Master component enables/disables and implements GUI button run.
//     * 
//     * @return true, if button is enabled
//     * 
//     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIisEnabledRun()
//     */
//    public boolean masterGUIisEnabledRun() {
//        return this.component.masterGUIisEnabledRun();
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Master component enables/disables and implements GUI button stop.
//     * 
//     * @return true, if button is enabled
//     * 
//     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIisEnabledStop()
//     */
//    public boolean masterGUIisEnabledStop() {
//        return this.component.masterGUIisEnabledStop();
//    }

    // -------------------------------------------------------------------------

    /**
     * If this is component is a master and implements the GUI it must react to
     * user button hits.<BR>
     * <BR>
     * The command can be either:<BR>
     * MASTER_CMD_STEP for the step button<BR>
     * MASTER_CMD_MACROSTEP for the macro step button<BR>
     * MASTER_CMD_RUN for the run button<BR>
     * MASTER_CMD_PAUSE for the pause button<BR>
     * MASTER_CMD_STOP for the stop button<BR>
     * MASTER_CMD_STEPBACK for the back step button<BR>
     * <BR>
     * 
     * @param command
     *            the command
     */
    public void masterGUI(final int command) {
        this.component.masterGUI(command);
    }

    // -------------------------------------------------------------------------

    /**
     * If this is component is a master and implements the GUI it must tell KIEM when user buttons
     * are enabled/disabled. <BR>
     * <BR>
     * The command can be either:<BR>
     * MASTER_CMD_STEP for the step button<BR>
     * MASTER_CMD_MACROSTEP for the macro step button<BR>
     * MASTER_CMD_RUN for the run button<BR>
     * MASTER_CMD_PAUSE for the pause button<BR>
     * MASTER_CMD_STOP for the stop button<BR>
     * MASTER_CMD_STEPBACK for the back step button<BR>
     * <BR>
     * 
     * @param command
     *            the command
     * 
     * @return true, if the specific button is enabled
     */
    public boolean masterGUIisEnabled(final int command) {
        return this.component.masterGUIisEnabled(command);
    }
    
    // -------------------------------------------------------------------------

    /**
     * Noop does nothing. It is used in switch/if branches to satisfy checkstyle.
     */
    public void noop() {
        // do a lot of nothing
    }

}
