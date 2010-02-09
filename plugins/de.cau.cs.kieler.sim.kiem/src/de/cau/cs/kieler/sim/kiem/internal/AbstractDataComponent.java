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
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 yellow
 * 
 */
public abstract class AbstractDataComponent implements IDataComponent, IExecutableExtension {

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
     * case to indicate that the DataComponent has no properties.
     */
    public AbstractDataComponent() {
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
     * @return the id as a String
     */
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
     * Flag that this component can be run multible times in different threads. Overwrite this if
     * this component is explicitly multi instantiable ONLY! note that you have to consider thread
     * safety here because all instances will be run in a different (and hence concurrent) thread be
     * aware of this for example if you share a common view etc.
     * 
     * @return a boolean indicating that the component is multi threadable
     */
    public boolean isMultiInstantiable() {
        return false;
    }

    // -------------------------------------------------------------------------
    
    /**
     * If the component doesn't want to appear in the scheduling list, it
     * may set this flag to true. This implies that the specific
     * component then cannot be added or removed.
     * 
     * @return true, if is invisible
     */
    public boolean isInvisible() {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * If this DataComponent implements an observer, provide some key's of interest. If you use null
     * then no filter is being used and the component will get all values.<BR>
     * <BR>
     * As an example one could use the following code if the component is only interested in values
     * with the (top-)key "state" and "emergency":<BR>
     * <BR>
     * public String[] provideFilterKeys() {<BR>
     * String[] myFilter = {"state","emergency"};<BR>
     * return myFilter;<BR>
     * }<BR>
     * 
     * @return a String array with the keys of interest or null for "no filter"
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
     * Provide properties for this component. The component may create and publicize its properties
     * with this method. They will be set/modified by the execution manager during the user edits
     * them. Whenever the user decides to run/start the execution the properties are tested (see
     * below) and the component may use there settings.<BR>
     * <BR>
     * The following lists a simple example for such properties:<BR>
     * 
     * \ATOverride <BR>
     *           public KiemProperty[] provideProperties() { <BR>
     *           KiemProperty[] properties = new KiemProperty[7]; <BR>
     *           properties[0] = new KiemProperty( <BR>
     *           "state name", <BR>
     *           "state"); <BR>
     *           properties[1] = new KiemProperty( <BR>
     *           "some bool", <BR>
     *           true); <BR>
     *           properties[2] = new KiemProperty( <BR>
     *           "an integer", <BR>
     *           2); <BR>
     *           properties[3] = new KiemProperty( <BR>
     *           "a file", <BR>
     *           new KiemPropertyTypeFile(), <BR>
     *           "c:/nothing.txt"); <BR>
     *           String[] items = {"trace 1","trace 2", "trace 3", "trace 4"}; <BR>
     *           properties[4] = new KiemProperty( <BR>
     *           "a choice", <BR>
     *           new KiemPropertyTypeChoice(items), <BR>
     *           items[2]); <BR>
     *           properties[5] = new KiemProperty( <BR>
     *           "workspace file", <BR>
     *           new KiemPropertyTypeWorkspaceFile(), <BR>
     *           "/nothing.txt"); <BR>
     *           properties[6] = new KiemProperty( <BR>
     *           "editor", <BR>
     *           new KiemPropertyTypeEditor(), <BR>
     *           ""); <BR>
     *           return properties; <BR>
     *           } <BR>
     * <BR>
     *           These are built-in types that can always be extended using the KiemProperty class.
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
     * Flags that this component can handle past, already computed history values. Overwrite this if
     * this component can explicitly handle past recorded history values.<BR>
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
     * Checks if component is a delta observer. Delta values are all changed values that exist in
     * the present tick (and in the past ticks when this component may have been skipped).<BR>
     * If a component wants all (accumulated & updated) values of the present tick, it should return
     * false.<BR>
     * <BR>
     * Example:<BR>
     * <BR>
     * Step...........|..1..|..2..|..3..|..4..|..5..|<BR>
     * -----------------------------------------------------<BR>
     * Producer.......|..A..|../..|..B..|..C..|..D..|<BR>
     * -----------------------------------------------------<BR>
     * Observer.......|.A...|.skip|.skip|.ABC.|.ABCD|<BR>
     * -----------------------------------------------------<BR>
     * DeltaObserver..|.A...|.skip|.skip|.BC..|.D...|<BR>
     * -----------------------------------------------------<BR>
     * <BR>
     * The above figure shows an execution of 5 steps with three participating DataComponents. One
     * producer generates (different) data at steps 1, 3, 4, and 5. It does not produce any data in
     * step 2. Both observers get skipped in steps 2 and 3 (e. g., because they might be a little
     * slow). In step 1 both observers get the A data. Because there is no data in the pool, both
     * inputs (their parameter values) are the same. In steps 2 and 3 both get skipped. Their step()
     * method is not called in these steps. In step 4 the DeltaObserver gets only the B and the D
     * data, produced in steps 3 and 4 (these are the delta values to the last time it was not
     * skipped, i. e., step 1). The other observer gets the whole data of the pool, namely the A, B,
     * and the C data. In step 5 the recently produced D data are the only ones that arrive at the
     * DeltaObserver while the other observer gets all ever produced data A, B, C and D.
     * 
     * @return true, if is delta observer
     */
    public boolean isDeltaObserver() {
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
     * impact on the schedule from them. <BR>
     * <BR>
     * <B>NOTE: This method has not been implemented yet!</B>
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
     * If this component is a master it can set the aimed step duration. <BR>
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
     * If this component is a master it can get the aimed step duration. <BR>
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
     * If this is component is a master it can control the execution using this method. <BR>
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
     * If this component is a master it can detect whether the execution is currently paused. <BR>
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
     * If this component is a master it can detect whether the execution is currently running. <BR>
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
     * This method is called from the ExecutionManager only iff isMaster() returns true! <BR>
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
     * finalize() is a destructor of the DataComponent that is called by the execution manager
     * before the DataComponent instance is removed from the list. If the DataComponent needs to
     * free any resources immediately (e.g., closing socket streams) this can be done here.
     */
    public void finalize() {
    }

    // -------------------------------------------------------------------------

    /**
     * Return a KiemEvent type (integer value) that represents a number of events this component
     * wants to listen to.<BR>
     * <BR>
     * A KiemEvent can be a combination of several events. The simplest way to register for two
     * events that e.g., indicate a step-command and the removal of the component is to have the
     * following code:<BR>
     * <BR>
     * public KiemEvent provideEventOfInterest() { <BR>
     * return new KiemEvent(CMD_STEP+DELETED); <BR>
     * }<BR>
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
