/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
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
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.views.KiemView;

/**
 * @author cmot
 * The DataComponent class implements the basic behavior of a Data Observer
 * and/or Data Producer component. Implemented components may want to 
 * override some of the here provided methods.
 */
public abstract class DataComponent implements IDataComponent,
											   IExecutableExtension {
	
	private String name;
	private KiemPlugin KIEMInstance;   		//only contains access to execution
	private KiemView KIEMViewInstance; 		//thread iff this DataComponent
									   		//is a master
	private KiemProperty[] properties;
	private IConfigurationElement configEle;
	private String[] globalInterfaceVariables;
	
	//-------------------------------------------------------------------------
	
	/**
	 * Constructor initializes the properties with the @link:DataComponent#inititializProperties() inititializProperties
	 * method that may be overridden.
	 */
	public DataComponent() {
		super();
		properties = initializeProperties();
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Sets the configuration elemenet. This method is needed to instantiate 
	 * several component instances only.
	 * 
	 * @param configEle the new configuration elemenet
	 */
	public final void setConfigurationElemenet(IConfigurationElement configEle) {
		this.configEle = configEle;
	}
	
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
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
	 */
	public final void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		this.name = config.getAttribute("name");
	}
	
	/**
	 * Gets the name of the component which is defined in the extension.
	 * 
	 * @return the name of the component
	 */
	public final String getName() {
		return name;
	}

	//-------------------------------------------------------------------------

	/**
	 * Overwrite this if this component is explicitly multi instantiable ONLY! 
	 * note that you have to consider thread safety here because all instances 
	 * will be run in a different (and hence concurrent) thread 
	 * be aware of this for example if you share a common view etc
	 *  
	 * @return 		a boolean indicating that the component is multi threadable
	 */
	public boolean isMultiInstantiable() {
		return false;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * If this DataComponent implements an Observer, provide some key's of
	 * interest. If you use null then not filter is being used and the component
	 * will get all values. 
	 * 
	 * @return		a String array with the keys of interest
	 */
	public String[] getFilterKeys() {
		return null;
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Returns the properties associated with this component. These are set in
	 * the constructor and may be overridden by @see:DataComponent#initializeProperties() initializeProperties().
	 * 
	 * @return 	KiemProperty[] array of properties
	 */
	public final KiemProperty[] getProperties() {
		return this.properties;
	}
	
	/**
	 * Initialize properties. The component may create and publicize its 
	 * properties with this method.
	 * They will be set/modified by the execution manager during
	 * the user edits them. Whenever the user decides to run/start the execution
	 * the properties are tested (see below) and the component may use
	 * there settings.
	 * 
	 * @return the kiem property[]
	 */
	public KiemProperty[] initializeProperties() {
		return null;
	}
	
	/**
	 * This method is intended to test if the properties are filled correctly.
	 * Here a component may check for required and optional properties and their
	 * settings. Also an @see:KiemPropertyError can be raised if some property
	 * prevents the the execution of this component.
	 *   
	 * @param properties 			properties with the current user settings
	 * @throws KiemPropertyError	if a property prevents the execution throw
	 * 								this error
	 */
	public void testProperties(KiemProperty[] properties) 
												throws KiemPropertyException {
	}

	//-------------------------------------------------------------------------

	/**
	 * Gets the local interface variables. This is an optional method that will 
	 * provide some interface variables that can be used by other DataComponents
	 * within and after the initialization phase every DataComponent may receive
	 * the union of all those variables by calling the 
	 * getGlobalInterfaceVariables() method.
	 * 
	 * @return the local interface variables
	 */
	public String[] getLocalInterfaceVariables() {
		return null;
	}
	
	/**
	 * Sets the global interface variables. Is called by the execution manager
	 * during the initialization phase.
	 * 
	 * @param globalInterfaceVariables the new global interface variables
	 */
	public final void setGlobalInterfaceVariables
									(String[] globalInterfaceVariables) {
		this.globalInterfaceVariables = globalInterfaceVariables;
	}
	
	/**
	 * Gets the global interface variables. Is called by the execution manager
	 * during the initialization phase.
	 * 
	 * @return the global interface variables
	 */
	protected String[] getGlobalInterfaceVariables() {
		if (globalInterfaceVariables == null) {
			//probably not initialized or there are no such
			//variables
			return null;
		}
		else
			return globalInterfaceVariables;
	}

	//-------------------------------------------------------------------------
	
	/**
	 * Checks if is delta observer. Delta values means all values that are in
	 * the present and were in the past ticks when this component may have been
	 * skipped. If a component does only want values of the present tick, it 
	 * should override and return false.
	 * 
	 * @return true, if is delta observer
	 */
	public boolean isDeltaObserver() {
		return true;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Checks if is pause flag. This method can be overridden to force the 
	 * execution to pause. Be careful if you override this method - it will 
	 * force the simulation to pause and hence it *CANNOT* proceed until 
	 * *EVERY* component's isPauseFlag() returns false! 
	 * Also the step() function will never get called again! 
	 * Be careful when implementing side effects in this method!
	 * 
	 * @return true, if is pause flag
	 */
	public boolean isPauseFlag() {
		return false;
	}

	/**
	 * Checks if is a macro step is done. Override this method to flag that a
	 * "macro tick" is not yet done during e.g., a fixed point semantics of a 
	 * DataComponent.
	 * In case ANY DataComponent raises this flag (by returning false) the 
	 * KIEM GUI will display another icon "Macro Step Execution" that will 
	 * perform as many steps until each DataComponent returns true (possibly
	 * an infinite number of steps) any following step should be interpreted 
	 * as the beginning of a new macro step *ALL* DataComponents that already 
	 * have flagged isStepDone == true will not be scheduled again during this
	 * MacroStep if you need them to update again they should also return a 
	 * false value.	
	 * Also note that this method is ignored for pure Data Observers because
	 * there is blocking impact on the schedule from them. 
	 * 
	 * @return true, if is macro step is done
	 */
	//TODO: not implemented yet
	public boolean isStepDone() {
		return true;
	}

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
	 * object called from within this method refers to the execution-thread!!!
	 */
	public void commandStep() {
		//BE CAREFUL WHEN USING THIS (S.A.)//
	}
	
	/**
	 * Command macro step. Called just before a macro step command is executed.
	 * ATTENTION: This command method is called inside the 
	 * synchronized lock so a deadlock can easily occur if this or another 
	 * object called from within this method refers to the execution-thread!!!
	 */
	public void commandMacroStep() {
		//BE CAREFUL WHEN USING THIS (S.A.)//
	}
	
	/**
	 * Command run. Called just before a run command is executed.
	 * ATTENTION: This command method is called inside the 
	 * synchronized lock so a deadlock can easily occur if this or another 
	 * object called from within this method refers to the execution-thread!!!
	 */
	public void commandRun() {
		//BE CAREFUL WHEN USING THIS (S.A.)//
	}
	
	/**
	 * Command pause. Called just before a pause command is executed.
	 * ATTENTION: This command method is called inside the 
	 * synchronized lock so a deadlock can easily occur if this or another 
	 * object called from within this method refers to the execution-thread!!!
	 */
	public void commandPause() {
		//BE CAREFUL WHEN USING THIS (S.A.)//
	}
	
	/**
	 * Command stop. Called just before a stop command is executed.
	 * ATTENTION: This command method is called inside the
	 * synchronized lock so a deadlock can easily occur if this or another
	 * object called from within this method refers to the execution-thread!!!
	 */
	public void commandStop() {
		//BE CAREFUL WHEN USING THIS (S.A.)//
	}
	
	//-------------------------------------------------------------------------
	//           at most ONE DataComponent can be a Master! 
	//-------------------------------------------------------------------------
	/**
	 * Override this, if this DataComponent is a master.
	 * If it returns true then
	 * 		1. ExecutionManager ensures that no other master is present
	 * 		2. Calling stepExecution initializes a tick
	 * 
	 * ATTENTION: At most ONE DataComponent can be a Master! 
	 * 
	 * @return true, if is master
	 */
	public boolean isMaster() {
		return false;
	}
	
	/**
	 * Override this if the DataComponents implements the GUI buttons by
	 * itself. When this option returns false, then the component must
	 * implement the following methods:
	 * 		masterGUIstep
	 * 		masterGUImacrostep
	 * 		masterGUIrun
	 * 		masterGUIpause
	 * 		masterGUIstop
	 *  	masterGUIisEnabledStep
	 *  	masterGUIisEnabledMacroStep
	 *  	masterGUIisEnabledRun
	 *  	masterGUIisEnabledPause
	 *  	masterGUIisEnabledStop
	 * 
	 * @return true, if component implements the GUI buttons
	 */
	public boolean isMasterImplementingGUI() {
		return false;
	}
	
	
	/**
	 * Master step execution. If this is a master it can initiate the execution
	 * this method returns -1 if the previous step did not completed yet
	 * otherwise it will return the last execution time of the full step
	 * 
	 * ATTENTION: At most ONE DataComponent can be a Master! 
	 * This method *SHOULD NOT* be overridden!
	 * 
	 * @throws Exception the exception
	 */
	public final void masterStepExecution() throws Exception {
		if (this.isMaster()) {
			if ((KIEMInstance != null)) {
				KIEMInstance.initExecution();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.stepExecutionSync();
				KIEMViewInstance.updateViewAsync();
			}
		}
		throw new Exception("This instance is not a master!"
							+"Override isMaster() to return true!");
	}
	
	/**
	 * Master macro step execution. If this is a master it can initiate the 
	 * execution this method returns -1 if the previous step did not completed 
	 * yet otherwise it will return the last execution time of the full step.
	 * 
	 * ATTENTION: At most ONE DataComponent can be a Master! 
	 * This method *SHOULD NOT* be overridden!
	 * 
	 * @throws Exception the exception
	 */
	public final void masterMacroStepExecution() throws Exception {
		if (this.isMaster()) {
			if ((KIEMInstance != null)) {
				KIEMInstance.initExecution();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.macroStepExecutionSync();
				KIEMViewInstance.updateViewAsync();
			}
		}
		throw new Exception("This instance is not a master!"
							+"Override isMaster() to return true!");
	}
	
	/**
	 * Master stop execution. If this is a master it can stop the execution.
	 * 
	 * ATTENTION: At most ONE DataComponent can be a Master! 
	 * This method *SHOULD NOT* be overridden!
	 * 
	 * @throws Exception the exception
	 */
	public final void masterStopExecution() throws Exception {
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
		throw new Exception("This instance is not a master!"
				+"Override isMaster() to return true!");
	}
	
	/**
	 * Master pause execution. If this is a master it can pause the execution.
	 * 
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * This method *SHOULD NOT* be overridden!
	 * 
	 * @throws Exception the exception
	 */
	public final void masterPauseExecution() throws Exception {
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
		throw new Exception("This instance is not a master!"
				+"Override isMaster() to return true!");
	}
	
	/**
	 * Master set aimed step duration. If this is a master it can set the
	 * aimed step duration.
	 * 
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * This method *SHOULD NOT* be overridden!
	 * 
	 * @param aimedStepDuration the aimed step duration
	 * 
	 * @throws Exception the exception
	 */
	public final void masterSetAimedStepDuration(int aimedStepDuration) throws Exception {
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
		throw new Exception("This instance is not a master!"
				+"Override isMaster() to return true!");
	}
	
	/**
	 * Master get aimed step duration. If this is a master it can get the
	 * aimed step duration.
	 * 
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * This method *SHOULD NOT* be overridden!
	 * 
	 * @return the aimed step duration set priorly
	 * 
	 * @throws Exception the exception
	 */
	public final int masterGetAimedStepDuration() throws Exception {
		if (this.isMaster()) {
			if (KIEMInstance != null) {
				KIEMInstance.initExecution();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				return KIEMInstance.execution.getAimedStepDuration();
			}
		}
		throw new Exception("This instance is not a master!"
				+"Override isMaster() to return true!");
	}

	/**
	 * Master run execution. If this is a master it can run the execution.
	 * 
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * This method *SHOULD NOT* be overridden!
	 * 
	 * @throws Exception the exception
	 */
	public final void masterRunExecution() throws Exception {
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
		throw new Exception("This instance is not a master!"
				+"Override isMaster() to return true!");
	}

	/**
	 * Master is paused. If this is a master it can detect whether the
	 * execution is currently paused.
	 * 
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * This method *SHOULD NOT* be overridden!
	 * 
	 * @return true, if paused
	 * 
	 * @throws Exception the exception
	 */
	public final boolean masterIsPaused() throws Exception {
		if (this.isMaster()) {
			if (KIEMInstance != null) {
				KIEMInstance.initExecution();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				return KIEMInstance.execution.isPaused();
			}
		}
		throw new Exception("This instance is not a master!"
				+"Override isMaster() to return true!");
	}

	/**
	 * Master is running. If this is a master it can detect whether the 
	 * execution is currently running.
	 * 
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * This method *SHOULD NOT* be overridden!
	 * 
	 * @return true, if running
	 * 
	 * @throws Exception the exception
	 */
	public final boolean masterIsRunning() throws Exception {
		if (this.isMaster()) {
			if (KIEMInstance != null) {
				KIEMInstance.initExecution();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				return KIEMInstance.execution.isRunning();
			}
		}
		throw new Exception("This instance is not a master!"
				+"Override isMaster() to return true!");
	}

	/**
	 * Master set kiem instances. Is called from the ExecutionManager
	 * only iff isMaster() returns true! 
	 * 
	 * ATTENTION: At most ONE DataComponent can be a Master!
	 * This method *SHOULD NOT* be overridden!
	 * 
	 * @param KIEMInstance the kIEM instance
	 * @param KIEMViewInstance the kIEM view instance
	 */
	public final void masterSetKIEMInstances(KiemPlugin KIEMInstance, 
							  		   KiemView KIEMViewInstance) {
		this.KIEMInstance = KIEMInstance;
		this.KIEMViewInstance = KIEMViewInstance;
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Master implementation of the step button. This is only called if the
	 * component returns true in method isMasterImplementingGUI
	 */
	public void	masterGUIstep() {
		//no default implementation
	}
	
	/**
	 * Master implementation of the macro step button. This is only called if
	 * the component returns true in method isMasterImplementingGUI
	 */
	public void	masterGUImacroStep() {
		//no default implementation
	}
	
	/**
	 * Master implementation of the run button. This is only called if the
	 * component returns true in method isMasterImplementingGUI
	 */
	public void masterGUIrun() {
		//no default implementation
	}
	
	/**
	 * Master implementation of the pause button. This is only called if the
	 * component returns true in method isMasterImplementingGUI
	 */
	public void masterGUIpause() {
		//no default implementation
	}
	
	/**
	 * Master implementation of the stop button. This is only called if the
	 * component returns true in method isMasterImplementingGUI
	 */
	public void masterGUIstop() {
		//no default implementation
	}
		
	/**
	 * Master implementing GUI buttons should return whether
	 * step button is enabled.
	 * 
	 * @return true, if button is enabled
	 */
	public boolean masterGUIisEnabledStep() {
		return false;
	}
	
	/**
	 * Master implementing GUI buttons should return whether
	 * macro step button is enabled.
	 * 
	 * @return true, if button is enabled
	 */
	public boolean masterGUIisEnabledMacroStep() {
		return false;
	}
	
	/**
	 * Master implementing GUI buttons should return whether
	 * run button is enabled.
	 * 
	 * @return true, if button is enabled
	 */
	public boolean masterGUIisEnabledRun() {
		return false;
	}
	
	/**
	 * Master implementing GUI buttons should return whether
	 * pause button is enabled.
	 * 
	 * @return true, if button is enabled
	 */
	public boolean masterGUIisEnabledPause() {
		return false;
	}
	
	/**
	 * Master implementing GUI buttons should return whether
	 * stop button is enabled.
	 * 
	 * @return true, if button is enabled
	 */
	public boolean masterGUIisEnabledStop() {
		return false;
	}
		
}
