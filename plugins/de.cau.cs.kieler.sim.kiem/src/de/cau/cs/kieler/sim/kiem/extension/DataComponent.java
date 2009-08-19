/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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
 ******************************************************************************/

package de.cau.cs.kieler.sim.kiem.extension;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.Messages;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.views.KiemView;

/**
 * The DataComponent class implements the basic behavior of a data observer
 * and/or data producer component. Implemented components may want to
 * override some of the here provided methods.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public abstract class DataComponent implements IDataComponent,
											   IExecutableExtension {
	
	/** The name of the DataComponent. */
	private String name;
	
	/** The KIEM instance. For access to the execution thread.*/
	private KiemPlugin KIEMInstance;   	
	
	/** The KIEM view instance. Thread iff this DataComponent is a master */
	private KiemView KIEMViewInstance; 		
									   		
	/** The properties of the DataComponent. */
	private KiemProperty[] properties;
	
	/** The configuration element for accessing the plug-in ID. */
	private IConfigurationElement configEle;
	
	/** The global interface variable keys. Filled by the execution mgr */
	private String[] globalInterfaceKeys;
	
	/** The history step. Indicates that the step is a history step, all
	 *  produced data will not be considered. */
	private boolean historyStep;			
	
	//-------------------------------------------------------------------------
	
	/**
	 * Constructor initializes the properties with the
	 * {@link #provideProperties} provideProperties
	 * method that may be overridden by the component. It sets the properties
	 * to null in the default case to indicate that the DataComponent has no
	 * properties.
	 */
	public DataComponent() {
		super();
		properties = provideProperties();
	}

	//-------------------------------------------------------------------------
	
	/**
	 * Gets the String representation id of a DataComponent. The id will be
	 * constituted by getting the pluginID and adding information about the
	 * implemented extension point, i.e., the property types and names and 
	 * the type of DataProducer. Note that this class can be overridden if
	 * the implementation wants to provide its own identification.
	 * 
	 * @return the id as a String
	 */
	public String getDataComponentId() {
		String propertiesId = "";
		if (this.provideProperties() != null) {
			KiemProperty[] properties = this.provideProperties();
			for (int c = 0; c < properties.length; c++) {
				propertiesId += properties[c].getKey();
				propertiesId += properties[c].getType().getClass().getName();
			}
		}
		String type = "";
		if (this.isDeltaObserver()) type += "1"; else type += "0";
		if (this.isHistoryObserver()) type += "1"; else type += "0";
		if (this.isMaster()) type += "1"; else type += "0";
		if (this.isMasterImplementingGUI()) type += "1"; else type += "0";
		if (this.isMultiInstantiable()) type += "1"; else type += "0";
		if (this.isObserver()) type += "1"; else type += "0";
		if (this.isProducer()) type += "1"; else type += "0";
		return 	this.getPluginId()
			    + type
				+ propertiesId;
	}

	//-------------------------------------------------------------------------

	/**
	 * Sets the properties. This method is needed to modify properties after
	 * deserialization.
	 * 
	 * @param properties the new KiemProperty[] array
	 */
	public void setProperties(KiemProperty[] properties) {
		this.properties = properties;
	}

	//-------------------------------------------------------------------------
	
	/**
	 * Sets the configuration element. This method is needed to instantiate
	 * several component instances only.
	 * 
	 * @param configEle the new configuration element
	 */
	public final void setConfigurationElemenet
									(IConfigurationElement configEle) {
		this.configEle = configEle;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Gets the configuration element. This method is needed to instantiate
	 * several component instances only.
	 * 
	 * @return the configuration element
	 */
	public final IConfigurationElement getConfigurationElement() {
		return this.configEle;
	}

	//-------------------------------------------------------------------------
	
	/**
	 * Gets the component's plug-in ID.
	 * 
	 * @return the plug-in ID
	 */
	public final String getPluginId() {
		if (getConfigurationElement() == null) return null;
		return getConfigurationElement().getContributor().getName();
	}
	
	//-------------------------------------------------------------------------
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
	 */
	public final void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		this.name = config.getAttribute("name");
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Gets the name of the component which is defined in the extension.
	 * 
	 * @return the name of the DataComponent
	 */
	public final String getName() {
		return name;
	}

	//-------------------------------------------------------------------------

	/**
	 * Overwrite this if this component is explicitly multi instantiable ONLY!
	 * note that you have to consider thread safety here because all instances
	 * will be run in a different (and hence concurrent) thread
	 * be aware of this for example if you share a common view etc.
	 * 
	 * @return 	a boolean indicating that the component is multi threadable
	 */
	public boolean isMultiInstantiable() {
		return false;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * If this DataComponent implements an observer, provide some key's of
	 * interest. If you use null then not filter is being used and the component
	 * will get all values.
	 * 
	 * @return 	a String array with the keys of interest
	 */
	public String[] provideFilterKeys() {
		return null;
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Returns the properties associated with this component. These are set in
	 * the constructor and may be overridden by 
	 * {@link #provideProperties}.
	 * 
	 * @return 	KiemProperty[] array of properties
	 */
	public final KiemProperty[] getProperties() {
		return this.properties;
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Provide properties. The component may create and publicize its
	 * properties with this method.
	 * They will be set/modified by the execution manager during
	 * the user edits them. Whenever the user decides to run/start the execution
	 * the properties are tested (see below) and the component may use
	 * there settings.
	 * 
	 * @return the KiemProperty[]
	 */
	public KiemProperty[] provideProperties() {
		return null;
	}

	//-------------------------------------------------------------------------
	
	/**
	 * This method is intended to check if the properties are filled correctly.
	 * Here a component may check for required and optional properties and 
	 * their settings. Also an {@link: KiemPropertyError} can be raised if some 
	 * property prevents the the execution of this component.
	 * 
	 * @param properties the properties with the current user settings
	 * 
	 * @throws KiemPropertyException if a property prevents the execution of 
	 * 								 this DataComponent this error should be
	 * 								 thrown
	 */
	public void checkProperties(KiemProperty[] properties) 
											throws KiemPropertyException {
	}

	//-------------------------------------------------------------------------

	/**
	 * Provide (local) interface variable keys. This is an optional method that
	 * will provide some interface variable keys that can be used by other 
	 * DataComponents within and after the initialization phase every 
	 * DataComponent may receive the union of all those variable keys by calling
	 * the {@link #getInterfaceKeys()} method.
	 * 
	 * @return the local interface variable keys
	 */
	public String[] provideInterfaceKeys() {
		return null;
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Sets the global interface variable keys. Is called by the execution 
	 * manager during the initialization phase.
	 * 
	 * @param globalInterfaceKeys the new global interface variable keys
	 */
	public final void setInterfaceKeys
									(String[] globalInterfaceKeys) {
		this.globalInterfaceKeys = globalInterfaceKeys;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Gets the (global) interface variable keys. Is called by the execution
	 * manager during the initialization phase.
	 * 
	 * @return the global interface variables
	 */
	protected final String[] getInterfaceKeys() {
		if (globalInterfaceKeys == null) {
			//probably not initialized or there are no such
			//variable keys
			return null;
		}
		else
			return globalInterfaceKeys;
	}

	//-------------------------------------------------------------------------

	/**
	 * Overwrite this if this component can explicitly handle past recorded
	 * history values.<BR>
	 * In case the user makes steps back into the history, only observers
	 * that return true in this method will get any (recorded) history data.
	 * Components that return false (default) will not get any data, while
	 * the the user navigates within the recorded tick area.
	 * 
	 * @return a boolean indicating that the component is recorded observer
	 */
	public boolean isHistoryObserver() {
		return false;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Sets the history step flag. This is called by the execution
	 * manager to flag that the current step lies in history.
	 * 
	 * @param historyStep the flag to set
	 */
	public final void setHistoryStep(boolean historyStep) {
		this.historyStep = historyStep;
	}

	//-------------------------------------------------------------------------
	
	/**
	 * Checks if the current step is a history step. This can be called
	 * by the component itself to check if the current step lies in
	 * history. If this is the case, any produced output data will not
	 * be considered. The DataComponent may implement special behavior in
	 * its step() method depending on the return value of this method.
	 * 
	 * @return true, if is history step
	 */
	public final boolean isHistoryStep() {
		return this.historyStep;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Checks if is delta observer. Delta values means all changed values that
	 * are in the present and were in the past ticks when this component may
	 * have been skipped.<BR>
	 * If a component wants all (accumulated & updated) values of the present
	 * tick, it should return false.
	 * 
	 * @return true, if is delta observer
	 */
	public boolean isDeltaObserver() {
		return false;
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Checks if is pause flag. This method can be overridden to force the
	 * execution to pause. Be careful if you override this method - it will
	 * force the simulation to pause and hence it <B>CANNOT</B> proceed until
	 * *EVERY* component's isPauseFlag() returns false!
	 * Also the step() function will never get called again!
	 * Be careful when implementing side effects in this method!
	 * 
	 * @return true, if is pause flag
	 */
	public boolean isPauseFlag() {
		return false;
	}

	//-------------------------------------------------------------------------
	
	/**
	 * Checks if is a macro step is done. Override this method to flag that a
	 * "macro tick" is not yet done during e.g., a fixed point semantics of a
	 * DataComponent.
	 * <BR><BR>
	 * In case ANY DataComponent raises this flag (by returning false) the
	 * KIEM GUI will display another icon "Macro Step Execution" that will
	 * perform as many steps until each DataComponent returns true (possibly
	 * an infinite number of steps) any following step should be interpreted
	 * as the beginning of a new macro step <B>ALL</B> DataComponents that already
	 * have flagged isStepDone == true will not be scheduled again during this
	 * MacroStep if you need them to update again they should also return a
	 * false value.
	 * <BR><BR>
	 * Also note that this method is ignored for pure Data Observers because
	 * there is blocking impact on the schedule from them.
	 * 
	 * @return true, if is macro step is done
	 */
	//TODO: not implemented yet
	public boolean isMacroStepDone() {
		return true;
	}

	//-------------------------------------------------------------------------

	//-------------------------------------------------------------------------
	// The following methods are called before the command is processed
	// note: these command methods are called inside the synchronized lock
	//       so deadlock can easily occur if these or another object called 
	//		 from within these methods refer to the execution-thread!!!
	//-------------------------------------------------------------------------
	/**
	 * Command step. Called just before a step command is executed.
	 * ATTENTION: This command method is called inside the
	 * synchronized lock so a deadlock can easily occur if this or another
	 * object called from within this method refers to the execution-thread!
	 */
	public void commandStep() {
		//BE CAREFUL WHEN USING THIS (S.A.)//
	}

	//-------------------------------------------------------------------------
	
	/**
	 * Command macro step. Called just before a macro step command is executed.<BR>
	 * ATTENTION: This command method is called inside the
	 * synchronized lock so a deadlock can easily occur if this or another
	 * object called from within this method refers to the execution-thread!
	 */
	public void commandMacroStep() {
		//BE CAREFUL WHEN USING THIS (S.A.)//
	}

	//-------------------------------------------------------------------------
	
	/**
	 * Command run. Called just before a run command is executed.<BR>
	 * ATTENTION: This command method is called inside the
	 * synchronized lock so a deadlock can easily occur if this or another
	 * object called from within this method refers to the execution-thread!
	 */
	public void commandRun() {
		//BE CAREFUL WHEN USING THIS (S.A.)//
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Command pause. Called just before a pause command is executed.<BR>
	 * ATTENTION: This command method is called inside the
	 * synchronized lock so a deadlock can easily occur if this or another
	 * object called from within this method refers to the execution-thread!
	 */
	public void commandPause() {
		//BE CAREFUL WHEN USING THIS (S.A.)//
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Command stop. Called just before a stop command is executed.<BR>
	 * ATTENTION: This command method is called inside the
	 * synchronized lock so a deadlock can easily occur if this or another
	 * object called from within this method refers to the execution-thread!
	 */
	public void commandStop() {
		//BE CAREFUL WHEN USING THIS (S.A.)//
	}
	
	//-------------------------------------------------------------------------

	//-------------------------------------------------------------------------
	//           at most ONE DataComponent can be a Master! 
	//-------------------------------------------------------------------------
	/**
	 * Override this, if this DataComponent is a master.<BR>
	 * If it returns true then<BR>
	 * 1. ExecutionManager ensures that no other master is present<BR>
	 * 2. Calling stepExecution initializes a tick
	 * <BR><BR>
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * 
	 * @return true, if is master
	 */
	public boolean isMaster() {
		return false;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Override this if the DataComponents implements the GUI buttons by
	 * itself. When this option returns false, then the component must
	 * implement the following methods:<BR>
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
	
	//-------------------------------------------------------------------------
	
	/**
	 * Master step execution. If this is a master it can initiate the execution
	 * this method returns -1 if the previous step did not completed yet
	 * otherwise it will return the last execution time of the full step
	 * <BR><BR>
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * This method <B>SHOULD NOT</B> be overridden!
	 * 
	 * @throws KiemMasterException a KiemMasterException
	 */
	public final void masterStepExecution() throws KiemMasterException  {
		if (this.isMaster()) {
			if ((KIEMInstance != null)) {
				KIEMInstance.initExecution();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.stepExecutionSync();
				KIEMViewInstance.updateViewAsync();
				return;
			}
		}
		throw new KiemMasterException(Messages.ErrorKiemMasterException);
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Master macro step execution. If this is a master it can initiate the
	 * execution this method returns -1 if the previous step did not completed
	 * yet otherwise it will return the last execution time of the full step.
	 * <BR><BR>
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * This method <B>SHOULD NOT</B> be overridden!
	 * 
	 * @throws KiemMasterException a KiemMasterException
	 */
	public final void masterMacroStepExecution() throws KiemMasterException {
		if (this.isMaster()) {
			if ((KIEMInstance != null)) {
				KIEMInstance.initExecution();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.macroStepExecutionSync();
				KIEMViewInstance.updateViewAsync();
				return;
			}
		}
		throw new KiemMasterException(Messages.ErrorKiemMasterException);
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Master stop execution. If this is a master it can stop the execution.
	 * <BR><BR>
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * This method <B>SHOULD NOT</B> be overridden!
	 * 
	 * @throws KiemMasterException a KiemMasterException
	 */
	public final void masterStopExecution() throws KiemMasterException {
		if (this.isMaster()) {
			if (KIEMInstance != null) {
				KIEMInstance.initExecution();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.stopExecutionSync();
				KIEMInstance.execution = null;
				KIEMViewInstance.updateViewAsync();
				return;
			}
		}
		throw new KiemMasterException(Messages.ErrorKiemMasterException);
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Master pause execution. If this is a master it can pause the execution.
	 * <BR><BR>
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * This method <B>SHOULD NOT</B> be overridden!
	 * 
	 * @throws KiemMasterException a KiemMasterException
	 */
	public final void masterPauseExecution() throws KiemMasterException {
		if (this.isMaster()) {
			if ((KIEMInstance != null)) {
				KIEMInstance.initExecution();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.pauseExecutionSync();
				KIEMViewInstance.updateViewAsync();
				return;
			}
		}
		throw new KiemMasterException(Messages.ErrorKiemMasterException);
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Master set aimed step duration. If this is a master it can set the
	 * aimed step duration.
	 * <BR><BR>
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * This method <B>SHOULD NOT</B> be overridden!
	 *
	 * @param aimedStepDuration the aimed step duration
	 * 
	 * @throws KiemMasterException a KiemMasterException
	 */
	public final void masterSetAimedStepDuration(int aimedStepDuration)
													throws KiemMasterException {
		if (this.isMaster()) {
			if (KIEMInstance != null) {
				KIEMInstance.initExecution();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.setAimedStepDuration(aimedStepDuration);
				KIEMViewInstance.updateViewAsync();
				return;
			}
		}
		throw new KiemMasterException(Messages.ErrorKiemMasterException);
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Master get aimed step duration. If this is a master it can get the
	 * aimed step duration.
	 * <BR><BR>
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * This method <B>SHOULD NOT</B> be overridden!
	 * 
	 * @return the aimed step duration set priorly
	 * 
	 * @throws KiemMasterException a KiemMasterException
	 */
	public final int masterGetAimedStepDuration() throws KiemMasterException {
		if (this.isMaster()) {
			if (KIEMInstance != null) {
				KIEMInstance.initExecution();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				return KIEMInstance.execution.getAimedStepDuration();
			}
		}
		throw new KiemMasterException(Messages.ErrorKiemMasterException);
	}

	//-------------------------------------------------------------------------

	/**
	 * Master run execution. If this is a master it can run the execution.
	 * <BR><BR>
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * This method <B>SHOULD NOT</B> be overridden!
	 * 
	 * @throws KiemMasterException a KiemMasterException
	 */
	public final void masterRunExecution() throws KiemMasterException {
		if (this.isMaster()) {
			if ((KIEMInstance != null)) {
				KIEMInstance.initExecution();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.runExecutionSync();
				KIEMViewInstance.updateViewAsync();
				return;
			}
		}
		throw new KiemMasterException(Messages.ErrorKiemMasterException);
	}

	//-------------------------------------------------------------------------

	/**
	 * Master is paused. If this is a master it can detect whether the
	 * execution is currently paused.
	 * <BR><BR>
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * This method <B>SHOULD NOT</B> be overridden!
	 * 	 
	 * @return true, if paused
	 * 
	 * @throws KiemMasterException a KiemMasterException
	 */
	public final boolean masterIsPaused() throws KiemMasterException {
		if (this.isMaster()) {
			if (KIEMInstance != null) {
				KIEMInstance.initExecution();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				return KIEMInstance.execution.isPaused();
			}
		}
		throw new KiemMasterException(Messages.ErrorKiemMasterException);
	}

	//-------------------------------------------------------------------------

	/**
	 * Master is running. If this is a master it can detect whether the
	 * execution is currently running.
	 * <BR><BR>
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * This method <B>SHOULD NOT</B> be overridden!
	 * 
	 * @return true, if running
	 * 
	 * @throws KiemMasterException a KiemMasterException
	 */
	public final boolean masterIsRunning() throws KiemMasterException {
		if (this.isMaster()) {
			if (KIEMInstance != null) {
				KIEMInstance.initExecution();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				return KIEMInstance.execution.isRunning();
			}
		}
		throw new KiemMasterException(Messages.ErrorKiemMasterException);
	}

	//-------------------------------------------------------------------------

	/**
	 * Master is set. Is called from the ExecutionManager only iff isMaster()
	 * returns true!
	 * <BR><BR>
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * This method <B>SHOULD NOT</B> be overridden!
	 * 
	 * @param KIEMInstance the KIEM instance
	 * @param KIEMViewInstance the KIEM view instance
	 */
	public final void masterSetKIEMInstances(KiemPlugin KIEMInstance, 
							  		   KiemView KIEMViewInstance) {
		this.KIEMInstance = KIEMInstance;
		this.KIEMViewInstance = KIEMViewInstance;
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Master implementation of the step back button. This is only called if
	 * the component returns true in method isMasterImplementingGUI.
	 */
	public void	masterGUIstepBack() {
		//no default implementation
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Master implementation of the step button. This is only called if the
	 * component returns true in method isMasterImplementingGUI.
	 */
	public void	masterGUIstep() {
		//no default implementation
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Master implementation of the macro step button. This is only called if
	 * the component returns true in method isMasterImplementingGUI.
	 */
	public void	masterGUImacroStep() {
		//no default implementation
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Master implementation of the run button. This is only called if the
	 * component returns true in method isMasterImplementingGUI.
	 */
	public void masterGUIrun() {
		//no default implementation
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Master implementation of the pause button. This is only called if the
	 * component returns true in method isMasterImplementingGUI.
	 */
	public void masterGUIpause() {
		//no default implementation
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Master implementation of the stop button. This is only called if the
	 * component returns true in method isMasterImplementingGUI.
	 */
	public void masterGUIstop() {
		//no default implementation
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Master implementing GUI buttons should return whether step back button
	 * is enabled.
	 * 
	 * @return true, if button is enabled
	 */
	public boolean masterGUIisEnabledStepBack() {
		return false;
	}
		
	//-------------------------------------------------------------------------

	/**
	 * Master implementing GUI buttons should return whether
	 * step button is enabled.
	 * 
	 * @return true, if button is enabled
	 */
	public boolean masterGUIisEnabledStep() {
		return false;
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Master implementing GUI buttons should return whether
	 * macro step button is enabled.
	 * 
	 * @return true, if button is enabled
	 */
	public boolean masterGUIisEnabledMacroStep() {
		return false;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Master implementing GUI buttons should return whether
	 * run button is enabled.
	 * 
	 * @return true, if button is enabled
	 */
	public boolean masterGUIisEnabledRun() {
		return false;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Master implementing GUI buttons should return whether
	 * pause button is enabled.
	 * 
	 * @return true, if button is enabled
	 */
	public boolean masterGUIisEnabledPause() {
		return false;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Master implementing GUI buttons should return whether
	 * stop button is enabled.
	 * 
	 * @return true, if button is enabled
	 */
	public boolean masterGUIisEnabledStop() {
		return false;
	}
		
   	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	protected final void finalize() throws Throwable {
		_DataComponent();
    }
	
   	//-------------------------------------------------------------------------

	/**
	  * _dataComponent is a destructor of the DataComponent that is called by
	  * the execution manager before the DataComponent instance is removed
	  * from the list. If the DataComponent needs to free any resources 
	  * immediately (e.g., closing socket streams) this can be done here.
	  */
	public void _DataComponent() {
		//noop
	}
	
}
