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

package de.cau.cs.kieler.sim.kiem.internal;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;

import de.cau.cs.kieler.sim.kiem.IDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemMasterException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.Messages;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.ui.views.KiemView;

/**
 * The DataComponent class implements the basic behavior of a data observer and/or data producer
 * component. Implemented components may want to override some of the here provided methods.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de <BR>
 * <BR>
 *         <B>DEPRECATED: use AbstractDataComponent instead!</B>
 * 
 */
public abstract class DataComponent implements IDataComponent, IExecutableExtension {

    /** The name of the DataComponent. */
    private String name;

    /** The KIEM instance. For access to the execution thread. */
    private KiemPlugin kIEMInstance;

    /** The KIEM view instance. Thread iff this DataComponent is a master */
    private KiemView kIEMViewInstance;

    /** The properties of the DataComponent. */
    private KiemProperty[] properties;

    /** The configuration element for accessing the plug-in ID. */
    private IConfigurationElement configEle;

    /** The global interface variable keys. Filled by the execution mgr */
    private String[] globalInterfaceKeys;

    /**
     * The history step. Indicates that the step is a history step, all produced data will not be
     * considered.
     */
    private boolean historyStep;

    /** The Constant to imitate a user run command. */
    public static final int MASTER_CMD_RUN = 1;

    /** The Constant to imitate a user pause command. */
    public static final int MASTER_CMD_PAUSE = 2;

    /** The Constant to imitate a user stop command. */
    public static final int MASTER_CMD_STOP = 3;

    /** The Constant to imitate a user step command. */
    public static final int MASTER_CMD_STEP = 4;

    /** The Constant to imitate a user macro step command. */
    public static final int MASTER_CMD_MACROSTEP = 5;

    /** The Constant to imitate a user step command. */
    public static final int MASTER_CMD_STEPBACK = 6;

    // -------------------------------------------------------------------------

    /**
     * Constructor initializes the properties with the {@link #provideProperties} provideProperties
     * method that may be overridden by the component. It sets the properties to null in the default
     * case to indicate that the DataComponent has no properties. <BR>
     * <BR>
     * <B>DEPRECATED: use AbstractDataComponent instead!</B>
     */
    @Deprecated
    public DataComponent() {
        super();
        properties = provideProperties();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the String representation id of a DataComponent. The id will be constituted by getting
     * the pluginID and adding information about the implemented extension point, i.e., the property
     * types and names and the type of DataProducer. Note that this class can be overridden if the
     * implementation wants to provide its own identification.
     * 
     * @return the id as a String <BR>
     * <BR>
     *         <B>DEPRECATED: use AbstractDataComponent instead!</B>
     */
    @Deprecated
    public String getDataComponentId() {
        String propertiesId = "";
        if (this.provideProperties() != null) {
            KiemProperty[] propertiesTmp = this.provideProperties();
            for (int c = 0; c < propertiesTmp.length; c++) {
                propertiesId = propertiesId + propertiesTmp[c].getKey();
                propertiesId = propertiesId + propertiesTmp[c].getType().getClass().getName();
            }
        }
        String type = "";
        if (this.isDeltaObserver()) {
            type += "1";
        } else {
            type += "0";
        }
        if (this.isHistoryObserver()) {
            type += "1";
        } else {
            type += "0";
        }
        if (this.isMaster()) {
            type += "1";
        } else {
            type += "0";
        }
        if (this.isMasterImplementingGUI()) {
            type += "1";
        } else {
            type += "0";
        }
        if (this.isMultiInstantiable()) {
            type += "1";
        } else {
            type += "0";
        }
        if (this.isObserver()) {
            type += "1";
        } else {
            type += "0";
        }
        if (this.isProducer()) {
            type += "1";
        } else {
            type += "0";
        }
        return this.getPluginId() + type + propertiesId.hashCode();
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the properties. This method is needed to modify properties after deserialization.
     * 
     * @param propertiesParam
     *            the new KiemProperty[] array
     */
    public final void setProperties(final KiemProperty[] propertiesParam) {
        this.properties = propertiesParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the configuration element. This method is needed to instantiate several component
     * instances only.
     * 
     * @param configEleParam
     *            the new configuration element
     */
    public final void setConfigurationElemenet(final IConfigurationElement configEleParam) {
        this.configEle = configEleParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the configuration element. This method is needed to instantiate several component
     * instances only.
     * 
     * @return the configuration element
     */
    public final IConfigurationElement getConfigurationElement() {
        return this.configEle;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the component's plug-in ID.
     * 
     * @return the plug-in ID
     */
    public final String getPluginId() {
        if (getConfigurationElement() == null) {
            return null;
        }
        return getConfigurationElement().getContributor().getName();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public final void setInitializationData(final IConfigurationElement config,
            final String propertyName, final Object data) throws CoreException {
        this.name = config.getAttribute("name");
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the name of the component which is defined in the extension point.
     * 
     * @return the name of the DataComponent
     */
    public final String getName() {
        return name;
    }

    // -------------------------------------------------------------------------

    /**
     * Overwrite this if this component is explicitly multi instantiable ONLY! note that you have to
     * consider thread safety here because all instances will be run in a different (and hence
     * concurrent) thread be aware of this for example if you share a common view etc.
     * 
     * @return a boolean indicating that the component is multi threadable
     */
    public boolean isMultiInstantiable() {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * If this DataComponent implements an observer, provide some key's of interest. If you use null
     * then no filter is being used and the component will get all values.
     * 
     * @return a String array with the keys of interest
     */
    public String[] provideFilterKeys() {
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Returns the properties associated with this component. These are set in the constructor and
     * may be overridden by {@link #provideProperties}.
     * 
     * @return KiemProperty[] array of properties
     */
    public final KiemProperty[] getProperties() {
        return this.properties;
    }

    // -------------------------------------------------------------------------

    /**
     * Provide properties. The component may create and publicize its properties with this method.
     * They will be set/modified by the execution manager during the user edits them. Whenever the
     * user decides to run/start the execution the properties are tested (see below) and the
     * component may use there settings.
     * 
     * @return the KiemProperty[] or null if no properties are provided
     */
    public KiemProperty[] provideProperties() {
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * This method is intended to check if the properties are set correctly. Here a component may
     * check for required and optional properties and their settings. Also an {@link:
     * KiemPropertyError} can be raised if some property prevents the execution of this component.
     * 
     * @param propertiesParam
     *            the properties with the current user settings
     * 
     * @throws KiemPropertyException
     *             if a property prevents the execution of this DataComponent this error should be
     *             thrown
     */
    public void checkProperties(final KiemProperty[] propertiesParam) throws KiemPropertyException {
    }

    // -------------------------------------------------------------------------

    /**
     * Provide (local) interface variable keys. This is an optional method that will provide some
     * interface variable keys that can be used by other DataComponents within and after the
     * initialization phase every DataComponent may receive the union of all those variable keys by
     * calling the {@link #getInterfaceKeys()} method. <BR>
     * <BR>
     * <B>DEPRECATED: Use
     * {@link de.cau.cs.kieler.sim.kiem.internal.JSONObjectDataComponent#provideInitialVariables()}
     * or
     * {@link de.cau.cs.kieler.sim.kiem.internal.JSONStringDataComponent#provideInitialVariables()}
     * instead!</B>
     * 
     * @return the local interface variable keys
     * @throws KiemInitializationException
     *             if a property prevents the execution of this DataComponent this error should be
     *             thrown
     */
    @Deprecated
    public String[] provideInterfaceKeys() throws KiemInitializationException {
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the global interface variable keys. Is called by the execution manager during the
     * initialization phase. <BR>
     * <BR>
     * <B>DEPRECATED: Use
     * {@link de.cau.cs.kieler.sim.kiem.internal.JSONObjectDataComponent#setInitialVariables (de.cau.cs.kieler.sim.kiem.json.JSONObject)}
     * or
     * {@link de.cau.cs.kieler.sim.kiem.internal.JSONStringDataComponent#setInitialVariables(String)}
     * instead!</B>
     * 
     * @param globalInterfaceKeysParam
     *            the new global interface variable keys
     */
    @Deprecated
    public final void setInterfaceKeys(final String[] globalInterfaceKeysParam) {
        this.globalInterfaceKeys = globalInterfaceKeysParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the (global) interface variable keys. Can be used by the DataComponent itself to
     * retrieve information about global interface keys. <BR>
     * <BR>
     * <B>DEPRECATED: Use
     * {@link de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent#getInitialVariables()()}
     * or {@link de.cau.cs.kieler.sim.kiem.internal.JSONStringDataComponent#getInitialVariables()}
     * instead!</B>
     * 
     * @return the global interface variables
     */
    @Deprecated
    protected final String[] getInterfaceKeys() {
        if (globalInterfaceKeys == null) {
            // probably not initialized or there are no such
            // variable keys
            return null;
        } else {
            return globalInterfaceKeys;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Overwrite this if this component can explicitly handle past recorded history values.<BR>
     * In case the user makes steps back into the history, only observers that return true in this
     * method will get any (recorded) history data. Components that return false (default) will not
     * get any data, while the the user navigates within the recorded tick area.
     * 
     * @return a boolean indicating that the component is recorded observer
     */
    public boolean isHistoryObserver() {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the history step flag. This is called by the execution manager to flag that the current
     * step lies in history.
     * 
     * @param historyStepParam
     *            the flag to set
     */
    public final void setHistoryStep(final boolean historyStepParam) {
        this.historyStep = historyStepParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if the current step is a history step. This can be called by the component itself to
     * check if the current step lies in history. If this is the case, any produced output data will
     * not be considered. The DataComponent may implement special behavior in its step() method
     * depending on the return value of this method.
     * 
     * @return true, if is history step
     */
    public final boolean isHistoryStep() {
        return this.historyStep;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is delta observer. Delta values are all changed values that are in the present and
     * were in the past ticks when this component may have been skipped.<BR>
     * If a component wants all (accumulated & updated) values of the present tick, it should return
     * false.
     * 
     * @return true, if is delta observer
     */
    public boolean isDeltaObserver() {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * This method can be overridden to force the execution to pause. Be careful if you override
     * this method - it will force the simulation to pause and hence it <B>CANNOT</B> proceed until
     * *EVERY* component's isPauseFlag() returns false! Also the step() function will never get
     * called again! Be careful when implementing side effects in this method!
     * 
     * @return true, if is pause flag
     */
    public boolean isPauseFlag() {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is a macro step is done. Override this method to flag that a "macro tick" is not
     * yet done during e.g., a fixed point semantics of a DataComponent. <BR>
     * <BR>
     * In case ANY DataComponent raises this flag (by returning false) the KIEM GUI will display
     * another icon "Macro Step Execution" that will perform as many steps until each DataComponent
     * returns true (possibly an infinite number of steps) any following step should be interpreted
     * as the beginning of a new macro step <B>ALL</B> DataComponents that already have flagged
     * isStepDone == true will not be scheduled again during this MacroStep if you need them to
     * update again they should also return a false value. <BR>
     * <BR>
     * Also note that this method is ignored for pure Data Observers because there is blocking
     * impact on the schedule from them.
     * 
     * @return true, if is macro step is done
     */
    // TODO: not implemented yet
    public boolean isMacroStepDone() {
        return true;
    }

    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // The following methods are called before the command is processed
    // note: these command methods are called inside the synchronized lock
    // so deadlock can easily occur if these or another object called
    // from within these methods refer to the execution-thread!!!
    // -------------------------------------------------------------------------
     /**
     * Command step. Called just before a step command is executed. ATTENTION: This command method
     * is called inside the synchronized lock so a deadlock can easily occur if this or another
     * object called from within this method refers to the execution-thread!
     * <BR><BR><B>DEPRECATED: use notifyEvent() instead!</B>
     */
     @Deprecated
     public void commandStep() {
     // BE CAREFUL WHEN USING THIS (S.A.)//
     }

    // -------------------------------------------------------------------------

     /**
     * Command macro step. Called just before a macro step command is executed.<BR>
     * ATTENTION: This command method is called inside the synchronized lock so a deadlock can
     * easily occur if this or another object called from within this method refers to the
     * execution-thread!
     * <BR><BR><B>DEPRECATED: use notifyEvent() instead!</B>
     */
     @Deprecated
     public void commandMacroStep() {
     // BE CAREFUL WHEN USING THIS (S.A.)//
     }

    // -------------------------------------------------------------------------

     /**
     * Command run. Called just before a run command is executed.<BR>
     * ATTENTION: This command method is called inside the synchronized lock so a deadlock can
     * easily occur if this or another object called from within this method refers to the
     * execution-thread!
     * <BR><BR><B>DEPRECATED: use notifyEvent() instead!</B>
     */
     @Deprecated
     public void commandRun() {
     // BE CAREFUL WHEN USING THIS (S.A.)//
     }

    // -------------------------------------------------------------------------

     /**
     * Command pause. Called just before a pause command is executed.<BR>
     * ATTENTION: This command method is called inside the synchronized lock so a deadlock can
     * easily occur if this or another object called from within this method refers to the
     * execution-thread!
     * <BR><BR><B>DEPRECATED: use notifyEvent() instead!</B>
     */
     @Deprecated
     public void commandPause() {
     // BE CAREFUL WHEN USING THIS (S.A.)//
     }

    // -------------------------------------------------------------------------

     /**
     * Command stop. Called just before a stop command is executed.<BR>
     * ATTENTION: This command method is called inside the synchronized lock so a deadlock can
     * easily occur if this or another object called from within this method refers to the
     * execution-thread!
     * <BR><BR><B>DEPRECATED: use notifyEvent() instead!</B>
     */
     @Deprecated
     public void commandStop() {
     // BE CAREFUL WHEN USING THIS (S.A.)//
     }

    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // at most ONE DataComponent can be a Master!
    // -------------------------------------------------------------------------
    /**
     * Override this, if this DataComponent is a master.<BR>
     * If it returns true then<BR>
     * 1. ExecutionManager ensures that no other master is present<BR>
     * 2. Calling stepExecution initializes a tick <BR>
     * <BR>
     * ATTENTION: At most ONE DataComponent can be a Master!
     * 
     * @return true, if is master
     */
    public boolean isMaster() {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Override this if the DataComponents implements the GUI buttons by itself. When this option
     * returns false, then the component must implement the following methods:<BR>
     * masterGUIstep<BR>
     * masterGUImacrostep<BR>
     * masterGUIrun<BR>
     * masterGUIpause<BR>
     * masterGUIstop<BR>
     * masterGUIisEnabledStep<BR>
     * masterGUIisEnabledMacroStep<BR>
     * masterGUIisEnabledRun<BR>
     * masterGUIisEnabledPause<BR>
     * masterGUIisEnabledStop<BR>
     * 
     * @return true, if component implements the GUI buttons
     */
    public boolean isMasterImplementingGUI() {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Master step execution. If this is a master it can initiate the execution this method returns
     * -1 if the previous step did not completed yet otherwise it will return the last execution
     * time of the full step <BR>
     * <BR>
     * ATTENTION: At most ONE DataComponent can be a Master! This method <B>SHOULD NOT</B> be
     * overridden!
     * 
     * @throws KiemMasterException
     *             a KiemMasterException
     * 
     * <BR>
     * <BR>
     *             <B> DEPRECATED: use masterCommand() method instead! </B>
     */
    @Deprecated
    public final void masterStepExecution() throws KiemMasterException {
        if (this.isMaster()) {
            if ((kIEMInstance != null)) {
                kIEMInstance.initExecution();
            }
            if ((kIEMInstance != null) && (kIEMInstance.getExecution() != null)) {
                kIEMInstance.getExecution().stepExecutionSync();
                kIEMViewInstance.updateViewAsync();
                return;
            }
        }
        throw new KiemMasterException(Messages.mErrorKiemMasterException);
    }

    // -------------------------------------------------------------------------

    /**
     * Master macro step execution. If this is a master it can initiate the execution this method
     * returns -1 if the previous step did not completed yet otherwise it will return the last
     * execution time of the full step. <BR>
     * <BR>
     * ATTENTION: At most ONE DataComponent can be a Master! This method <B>SHOULD NOT</B> be
     * overridden!
     * 
     * @throws KiemMasterException
     *             a KiemMasterException
     * 
     * <BR>
     * <BR>
     *             <B> DEPRECATED: use masterCommand() method instead! </B>
     */
    @Deprecated
    public final void masterMacroStepExecution() throws KiemMasterException {
        if (this.isMaster()) {
            if ((kIEMInstance != null)) {
                kIEMInstance.initExecution();
            }
            if ((kIEMInstance != null) && (kIEMInstance.getExecution() != null)) {
                kIEMInstance.getExecution().macroStepExecutionSync();
                kIEMViewInstance.updateViewAsync();
                return;
            }
        }
        throw new KiemMasterException(Messages.mErrorKiemMasterException);
    }

    // -------------------------------------------------------------------------

    /**
     * Master stop execution. If this is a master it can stop the execution. <BR>
     * <BR>
     * ATTENTION: At most ONE DataComponent can be a Master! This method <B>SHOULD NOT</B> be
     * overridden!
     * 
     * @throws KiemMasterException
     *             a KiemMasterException
     * 
     * <BR>
     * <BR>
     *             <B> DEPRECATED: use masterCommand() method instead! </B>
     */
    @Deprecated
    public final void masterStopExecution() throws KiemMasterException {
        if (this.isMaster()) {
            if (kIEMInstance != null) {
                kIEMInstance.initExecution();
            }
            if ((kIEMInstance != null) && (kIEMInstance.getExecution() != null)) {
                kIEMInstance.getExecution().stopExecutionSync();
                kIEMInstance.setExecution(null);
                kIEMViewInstance.updateViewAsync();
                return;
            }
        }
        throw new KiemMasterException(Messages.mErrorKiemMasterException);
    }

    // -------------------------------------------------------------------------

    /**
     * Master pause execution. If this is a master it can pause the execution. <BR>
     * <BR>
     * ATTENTION: At most ONE DataComponent can be a Master! This method <B>SHOULD NOT</B> be
     * overridden!
     * 
     * @throws KiemMasterException
     *             a KiemMasterException
     * 
     * <BR>
     * <BR>
     *             <B> DEPRECATED: use masterCommand() method instead! </B>
     */
    @Deprecated
    public final void masterPauseExecution() throws KiemMasterException {
        if (this.isMaster()) {
            if ((kIEMInstance != null)) {
                kIEMInstance.initExecution();
            }
            if ((kIEMInstance != null) && (kIEMInstance.getExecution() != null)) {
                kIEMInstance.getExecution().pauseExecutionSync();
                kIEMViewInstance.updateViewAsync();
                return;
            }
        }
        throw new KiemMasterException(Messages.mErrorKiemMasterException);
    }

    // -------------------------------------------------------------------------

    /**
     * Master set aimed step duration. If this is a master it can set the aimed step duration. <BR>
     * <BR>
     * ATTENTION: At most ONE DataComponent can be a Master! This method <B>SHOULD NOT</B> be
     * overridden!
     * 
     * @param aimedStepDuration
     *            the aimed step duration
     * 
     * @throws KiemMasterException
     *             a KiemMasterException
     */
    public final void masterSetAimedStepDuration(final int aimedStepDuration)
            throws KiemMasterException {
        if (this.isMaster()) {
            if (kIEMInstance != null) {
                kIEMInstance.initExecution();
            }
            if ((kIEMInstance != null) && (kIEMInstance.getExecution() != null)) {
                kIEMInstance.getExecution().setAimedStepDuration(aimedStepDuration);
                kIEMViewInstance.updateViewAsync();
                return;
            }
        }
        throw new KiemMasterException(Messages.mErrorKiemMasterException);
    }

    // -------------------------------------------------------------------------

    /**
     * Master get aimed step duration. If this is a master it can get the aimed step duration. <BR>
     * <BR>
     * ATTENTION: At most ONE DataComponent can be a Master! This method <B>SHOULD NOT</B> be
     * overridden!
     * 
     * @return the aimed step duration set priorly
     * 
     * @throws KiemMasterException
     *             a KiemMasterException
     */
    public final int masterGetAimedStepDuration() throws KiemMasterException {
        if (this.isMaster()) {
            if (kIEMInstance != null) {
                kIEMInstance.initExecution();
            }
            if ((kIEMInstance != null) && (kIEMInstance.getExecution() != null)) {
                return kIEMInstance.getExecution().getAimedStepDuration();
            }
        }
        throw new KiemMasterException(Messages.mErrorKiemMasterException);
    }

    // -------------------------------------------------------------------------

    /**
     * Master run execution. If this is a master it can run the execution. <BR>
     * <BR>
     * ATTENTION: At most ONE DataComponent can be a Master! This method <B>SHOULD NOT</B> be
     * overridden!
     * 
     * @throws KiemMasterException
     *             a KiemMasterException
     * 
     * <BR>
     * <BR>
     *             <B> DEPRECATED: use masterCommand() method instead! </B>
     */
    @Deprecated
    public final void masterRunExecution() throws KiemMasterException {
        if (this.isMaster()) {
            if ((kIEMInstance != null)) {
                kIEMInstance.initExecution();
            }
            if ((kIEMInstance != null) && (kIEMInstance.getExecution() != null)) {
                kIEMInstance.getExecution().runExecutionSync();
                kIEMViewInstance.updateViewAsync();
                return;
            }
        }
        throw new KiemMasterException(Messages.mErrorKiemMasterException);
    }

    // -------------------------------------------------------------------------

    /**
     * If this is component is a master it can control the execution. <BR>
     * <BR>
     * The command can be either:<BR>
     * MASTER_CMD_STEP to make an execution step<BR>
     * MASTER_CMD_MACROSTEP to make a macro step<BR>
     * MASTER_CMD_RUN to run the execution<BR>
     * MASTER_CMD_PAUSE to pause the execution<BR>
     * MASTER_CMD_STOP to stop the execution<BR>
     * MASTER_CMD_STEPBACK to make back step<BR>
     * <BR>
     * ATTENTION: At most ONE DataComponent can be a Master! This method <B>SHOULD NOT</B> be
     * overridden!
     * 
     * @param command
     *            the master command to process
     * 
     * @throws KiemMasterException
     *             a KiemMasterException
     */
    public final void masterCommand(final int command) throws KiemMasterException {
        if (!this.isMaster()) {
            throw new KiemMasterException(Messages.mErrorKiemMasterException);
        }
        if ((kIEMInstance != null)) {
            kIEMInstance.initExecution();
        }

        if ((kIEMInstance != null) && (kIEMInstance.getExecution() != null)) {
            switch (command) {
            case AbstractDataComponent.MASTER_CMD_STEP:
                kIEMInstance.getExecution().stepExecutionSync();
                break;
            case AbstractDataComponent.MASTER_CMD_MACROSTEP:
                kIEMInstance.getExecution().macroStepExecutionSync();
                break;
            case AbstractDataComponent.MASTER_CMD_RUN:
                kIEMInstance.getExecution().runExecutionSync();
                break;
            case AbstractDataComponent.MASTER_CMD_PAUSE:
                kIEMInstance.getExecution().pauseExecutionSync();
                break;
            case AbstractDataComponent.MASTER_CMD_STOP:
                kIEMInstance.getExecution().stopExecutionSync();
                break;
            case AbstractDataComponent.MASTER_CMD_STEPBACK:
                kIEMInstance.getExecution().stepBackExecutionSync();
                break;
            }
        }
        kIEMViewInstance.updateViewAsync();
        return;
    }

    // -------------------------------------------------------------------------

    /**
     * Master is paused. If this is a master it can detect whether the execution is currently
     * paused. <BR>
     * <BR>
     * ATTENTION: At most ONE DataComponent can be a Master! This method <B>SHOULD NOT</B> be
     * overridden!
     * 
     * @return true, if paused
     * 
     * @throws KiemMasterException
     *             a KiemMasterException
     */
    public final boolean masterIsPaused() throws KiemMasterException {
        if (this.isMaster()) {
            if (kIEMInstance != null) {
                kIEMInstance.initExecution();
            }
            if ((kIEMInstance != null) && (kIEMInstance.getExecution() != null)) {
                return kIEMInstance.getExecution().isPaused();
            }
        }
        throw new KiemMasterException(Messages.mErrorKiemMasterException);
    }

    // -------------------------------------------------------------------------

    /**
     * Master is running. If this is a master it can detect whether the execution is currently
     * running. <BR>
     * <BR>
     * ATTENTION: At most ONE DataComponent can be a Master! This method <B>SHOULD NOT</B> be
     * overridden!
     * 
     * @return true, if running
     * 
     * @throws KiemMasterException
     *             a KiemMasterException
     */
    public final boolean masterIsRunning() throws KiemMasterException {
        if (this.isMaster()) {
            if (kIEMInstance != null) {
                kIEMInstance.initExecution();
            }
            if ((kIEMInstance != null) && (kIEMInstance.getExecution() != null)) {
                return kIEMInstance.getExecution().isRunning();
            }
        }
        throw new KiemMasterException(Messages.mErrorKiemMasterException);
    }

    // -------------------------------------------------------------------------

    /**
     * Master is set. Is called from the ExecutionManager only iff isMaster() returns true! <BR>
     * <BR>
     * ATTENTION: At most ONE DataComponent can be a Master! This method <B>SHOULD NOT</B> be
     * overridden!
     * 
     * @param kIEMInstanceParam
     *            the KIEM instance
     * @param kIEMViewInstanceParam
     *            the KIEM view instance
     */
    public final void masterSetKIEMInstances(final KiemPlugin kIEMInstanceParam,
            final KiemView kIEMViewInstanceParam) {
        this.kIEMInstance = kIEMInstanceParam;
        this.kIEMViewInstance = kIEMViewInstanceParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Master implementation of the step back button. This is only called if the component returns
     * true in method isMasterImplementingGUI. <BR>
     * <BR>
     * <B> DEPRECATED: use masterGUI() or masterGUIisEnabled() method instead! </B>
     */
    @Deprecated
    public void masterGUIstepBack() {
        // no default implementation
    }

    // -------------------------------------------------------------------------

    /**
     * Master implementation of the step button. This is only called if the component returns true
     * in method isMasterImplementingGUI. <BR>
     * <BR>
     * <B> DEPRECATED: use masterGUI() or masterGUIisEnabled() method instead! </B>
     */
    @Deprecated
    public void masterGUIstep() {
        // no default implementation
    }

    // -------------------------------------------------------------------------

    /**
     * Master implementation of the macro step button. This is only called if the component returns
     * true in method isMasterImplementingGUI. <BR>
     * <BR>
     * <B> DEPRECATED: use masterGUI() or masterGUIisEnabled() method instead! </B>
     */
    @Deprecated
    public void masterGUImacroStep() {
        // no default implementation
    }

    // -------------------------------------------------------------------------

    /**
     * Master implementation of the run button. This is only called if the component returns true in
     * method isMasterImplementingGUI. <BR>
     * <BR>
     * <B> DEPRECATED: use masterGUI() or masterGUIisEnabled() method instead! </B>
     */
    @Deprecated
    public void masterGUIrun() {
        // no default implementation
    }

    // -------------------------------------------------------------------------

    /**
     * Master implementation of the pause button. This is only called if the component returns true
     * in method isMasterImplementingGUI. <BR>
     * <BR>
     * <B> DEPRECATED: use masterGUI() or masterGUIisEnabled() method instead! </B>
     */
    @Deprecated
    public void masterGUIpause() {
        // no default implementation
    }

    // -------------------------------------------------------------------------

    /**
     * Master implementation of the stop button. This is only called if the component returns true
     * in method isMasterImplementingGUI. <BR>
     * <BR>
     * <B> DEPRECATED: use masterGUI() or masterGUIisEnabled() method instead! </B>
     */
    @Deprecated
    public void masterGUIstop() {
        // no default implementation
    }

    // -------------------------------------------------------------------------

    /**
     * Master implementing GUI buttons should return whether step back button is enabled.
     * 
     * @return true, if button is enabled <BR>
     * <BR>
     *         <B> DEPRECATED: use masterGUI() or masterGUIisEnabled() method instead! </B>
     */
    @Deprecated
    public boolean masterGUIisEnabledStepBack() {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Master implementing GUI buttons should return whether step button is enabled.
     * 
     * @return true, if button is enabled <BR>
     * <BR>
     *         <B> DEPRECATED: use masterGUI() or masterGUIisEnabled() method instead! </B>
     */
    @Deprecated
    public boolean masterGUIisEnabledStep() {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Master implementing GUI buttons should return whether macro step button is enabled.
     * 
     * @return true, if button is enabled <BR>
     * <BR>
     *         <B> DEPRECATED: use masterGUI() or masterGUIisEnabled() method instead! </B>
     */
    @Deprecated
    public boolean masterGUIisEnabledMacroStep() {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Master implementing GUI buttons should return whether run button is enabled.
     * 
     * @return true, if button is enabled <BR>
     * <BR>
     *         <B> DEPRECATED: use masterGUI() or masterGUIisEnabled() method instead! </B>
     */
    @Deprecated
    public boolean masterGUIisEnabledRun() {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Master implementing GUI buttons should return whether pause button is enabled.
     * 
     * @return true, if button is enabled <BR>
     * <BR>
     *         <B> DEPRECATED: use masterGUI() or masterGUIisEnabled() method instead! </B>
     */
    @Deprecated
    public boolean masterGUIisEnabledPause() {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Master implementing GUI buttons should return whether stop button is enabled.
     * 
     * @return true, if button is enabled
     * 
     * <BR>
     * <BR>
     *         <B> DEPRECATED: use masterGUI() or masterGUIisEnabled() method instead! </B>
     */
    @Deprecated
    public boolean masterGUIisEnabledStop() {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * If this is component is a master and implements the GUI it must react to user button hits.<BR>
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
        // no default implementation
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
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * _dataComponent is a destructor of the DataComponent that is called by the execution manager
     * before the DataComponent instance is removed from the list. If the DataComponent needs to
     * free any resources immediately (e.g., closing socket streams) this can be done here.
     * <br><br>
     * <b>DEPRECATED: use AbstractDataComponent.finalize() instead!</b>
     */
    // CHECKSTYLEOFF Name
    // Rationale: Explicit destructors (in C++) use to start with a underline
    @Deprecated
    public void _DataComponent() {
    }

    // CHECKSTYLEON Name

    // -------------------------------------------------------------------------

    /**
     * This method is called whenever the user enables or disables the DataComponent in the user
     * interface list.
     * 
     * @param enabled
     *            true, if the DataComponent was enabled, false otherwise <BR>
     * <BR>
     *            <B> DEPRECATED: use notifyEvent() method instead! </B>
     */
    @Deprecated
    public void notifyEnabled(final boolean enabled) {
    }

    // -------------------------------------------------------------------------

    /**
     * This method is called during execution, whenever the steps changed.
     * 
     * @param currentStep
     *            the current step
     * @param totalSteps
     *            the total steps <BR>
     * <BR>
     *            <B> DEPRECATED: use notifyEvent() method instead! </B>
     */
    @Deprecated
    public void notifyStep(final long currentStep, final long totalSteps) {
    }

    // -------------------------------------------------------------------------

    /**
     * Return a KiemEvent type (integer value) that represents a number of events this component
     * wants to listen to.<BR>
     * <BR>
     * NOTE: The provision of event types is only read by KIEM once before the execution starts.
     * Hence, changes during the execution are not having any effect. In doubt, this method should
     * return more events than needed. These could dynamically be ignored when temporarily not of
     * interest.
     * 
     * @return the KiemEvent type indicating the events of interest
     */
    public KiemEvent provideEventOfInterest() {
        return new KiemEvent();
    }

    // -------------------------------------------------------------------------

    /**
     * This is the basic notify method that is called by KIEM whenever an event occurs for which
     * this DataComponent is registered (see {@link #provideEventOfInterest()}).
     * 
     * @param event
     *            the KiemEvent with additional attached information, depending on the specific
     *            event
     */
    public void notifyEvent(final KiemEvent event) {
        // no default implementation
    }

}
