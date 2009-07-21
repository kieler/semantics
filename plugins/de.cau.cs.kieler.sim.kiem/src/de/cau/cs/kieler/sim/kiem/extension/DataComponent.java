package de.cau.cs.kieler.sim.kiem.extension;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.views.KiemView;

public abstract class DataComponent implements IDataComponent,
											   IExecutableExtension {
	
	private String name;
	private KiemPlugin KIEMInstance;   		//only contains access to execution
	private KiemView KIEMViewInstance; 		//thread iff this DataComponent
									   		//is a master
	private KiemProperty[] properties;
	private IConfigurationElement configEle;
	
	public DataComponent() {
		super();
		properties = initializeProperties();
	}
	
	public KiemProperty[] getProperties() {
		return this.properties;
	}
	
	public void setConfigurationElemenet(IConfigurationElement configEle) {
		this.configEle = configEle;
	}
	public IConfigurationElement getConfigurationElement() {
		return this.configEle;
	}
	
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		this.name = config.getAttribute("name");
	}
	
	public String getName() {
		return name;
	}

	//-------------------------------------------------------------------------

	//overwrite this if this component is explicitly multi instantiable ONLY!
	//note that you have to consider thread safety here because all instances
	//will be run in a different (and hence concurrent) thread
	//be aware of this for example if you share a common view etc
	public boolean isMultiInstantiable() {
		return false;
	}
	
	//-------------------------------------------------------------------------
	private String modelFile;

	protected String getModelFile() {
		return modelFile;
	}
	
	public void setModelFile(String modelFile) {
		this.modelFile = modelFile;
		return;
	}
	
	//if this producer/Observer needs the model file override this
	//and return true
	//the ExecutionManager will then check for it
	public boolean isModelFileNeeded() {
		return false;
	}
		
	//-------------------------------------------------------------------------

	//if this DataComponent implements a Observer, 
	//provide some key's of interest 
	public String[] getFilterKeys() {
		return null;
	}
	
	//-------------------------------------------------------------------------
	
	//provide some properties that the user should enter
	public KiemProperty[] initializeProperties() {
		return null;
	}

	//-------------------------------------------------------------------------
	private String[] globalInterfaceVariables;

	//this is an optional method that will provide some
	//interfae Variables that can be used by other DataComponents
	//within and after the initialization phase every DataComponent
	//may receive the union of all thos variables by calling the
	//getGlobalInterfaceVariables() method
	public String[] getLocalInterfaceVariables() {
		return null;
	}
	
	public void setGloblaInterfaceVariables
									(String[] globalInterfaceVariables) {
		this.globalInterfaceVariables = globalInterfaceVariables;
	}
	
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
	
	//Delta values means all values that are in the present and were in the
	//past ticks when this component may have been skipped
	//If a component do only want values of the present tick, it should override
	//and return false
	public boolean isDeltaObserver() {
		return true;
	}
	
	//-------------------------------------------------------------------------

	//this method can be overridden to force the execution to pause
	//be carefull if you override this method it will force the simulation
	//to pause and hence it *CANNOT* proceed until *EVERY* component's
	//isPauseFlag() returns false!
	//also the step() function will never get called again!
	//be careful when implementing side effects in this method!
	public boolean isPauseFlag() {
		return false;
	}

	//TODO: not implemented yet
	//override this method to flag that a "macro tick" is not yet done
	//during e.g., a fixedpoint semantics of a DataComponent
	//in case ANY DataComponent raises this flag (by returning false)
	//the KIEM GUI will display another icon "Macro Step Execution"
	//that will perform as many steps until each DataComponent returns
	//true (possibly an infinite number of steps)
	//any following step should be interpreted as the beginning of a new
	//macro step
	//All DataComponents that already have flaged isStepDone == true will
	//not be scheduled again during this MacroStep
	//if you need them to update again they should also return a false
	//value.
	//Also note that this method is ignored for pure data Observers because
	//there is blocking impact on the schedule from them
	public boolean isStepDone() {
		return true;
	}

	//-------------------------------------------------------------------------
	// The following methods are called before the command is processed
	// note: these command methods are called inside the synchronized lock
	//       so deadlock can occur if you or another object within these
	//		 methods refer to the execution-thread!!!
	//-------------------------------------------------------------------------
	public void commandStep() {
		//BE CAREFUL WHEN USING THIS (S.A.)//
	}
	public void commandMacroStep() {
		//BE CAREFUL WHEN USING THIS (S.A.)//
	}
	public void commandPlay() {
		//BE CAREFUL WHEN USING THIS (S.A.)//
	}
	public void commandPause() {
		//BE CAREFUL WHEN USING THIS (S.A.)//
	}
	public void commandStop() {
		//BE CAREFUL WHEN USING THIS (S.A.)//
	}
	
	//-------------------------------------------------------------------------
	//           at most ONE DataComponent can be a Master! 
	//-------------------------------------------------------------------------
	//override isMaster, if this DataComponent is a master
	//should return false to true
	//then
	// 1. ExecutionManager ensures that no other
	//	  master is present
	// 2. Calling stepExecution initializes a tick
	public boolean isMaster() {
		return false;
	}
	//if this is a master it can initiate the execution
	//this method returns -1 if the previous step did not completed yet
	//otherwise it will return the last execution time of the full step
	public void masterStepExecution() throws Exception {
		if (this.isMaster()) {
			if ((KIEMViewInstance != null)) {
				KIEMViewInstance.initDataComponentEx();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.stepExecution();
				KIEMViewInstance.updateViewAsync();
			}
		}
		throw new Exception("This instance is not a master!"
							+"Override isMaster() to return true!");
	}
	//if this is a master it can initiate the execution
	//this method returns -1 if the previous step did not completed yet
	//otherwise it will return the last execution time of the full step
	public void masterMacroStepExecution() throws Exception {
		if (this.isMaster()) {
			if ((KIEMViewInstance != null)) {
				KIEMViewInstance.initDataComponentEx();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.macroStepExecution();
				KIEMViewInstance.updateViewAsync();
			}
		}
		throw new Exception("This instance is not a master!"
							+"Override isMaster() to return true!");
	}
	//if this is a master it can stop the execution
	public void masterStopExecution() throws Exception {
		if (this.isMaster()) {
			if (KIEMViewInstance != null) {
				KIEMViewInstance.initDataComponentEx();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.stopExecution();
				KIEMInstance.resetCurrentModelFile();
				KIEMInstance.execution = null;
				KIEMViewInstance.updateViewAsync();
				return;
			}
		}
		throw new Exception("This instance is not a master!"
				+"Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public void masterPauseExecution() throws Exception {
		if (this.isMaster()) {
			if ((KIEMViewInstance != null)) {
				KIEMViewInstance.initDataComponentEx();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.pauseExecution();
				KIEMViewInstance.updateViewAsync();
				return;
			}
		}
		throw new Exception("This instance is not a master!"
				+"Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public void masterSetAimedStepDuration(int aimedStepDuration) throws Exception {
		if (this.isMaster()) {
			if (KIEMViewInstance != null) {
				KIEMViewInstance.initDataComponentEx();
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
	//if this is a master it can pause the execution
	public int masterGetAimedStepDuration() throws Exception {
		if (this.isMaster()) {
			if (KIEMViewInstance != null) {
				KIEMViewInstance.initDataComponentEx();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				return KIEMInstance.execution.getAimedStepDuration();
			}
		}
		throw new Exception("This instance is not a master!"
				+"Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public void masterRunExecution() throws Exception {
		if (this.isMaster()) {
			if ((KIEMViewInstance != null)) {
				KIEMViewInstance.initDataComponentEx();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.runExecution();
				KIEMViewInstance.updateViewAsync();
				return;
			}
		}
		throw new Exception("This instance is not a master!"
				+"Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public boolean masterIsPaused() throws Exception {
		if (this.isMaster()) {
			if (KIEMViewInstance != null) {
				KIEMViewInstance.initDataComponentEx();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				return KIEMInstance.execution.isPaused();
			}
		}
		throw new Exception("This instance is not a master!"
				+"Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public boolean masterIsRunning() throws Exception {
		if (this.isMaster()) {
			if (KIEMViewInstance != null) {
				KIEMViewInstance.initDataComponentEx();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				return KIEMInstance.execution.isRunning();
			}
		}
		throw new Exception("This instance is not a master!"
				+"Override isMaster() to return true!");
	}
	//is called from the ExecutionManager only iff isMaster() returns true
	public void masterSetKIEMInstances(KiemPlugin KIEMInstance, 
							  		   KiemView KIEMViewInstance) {
		this.KIEMInstance = KIEMInstance;
		this.KIEMViewInstance = KIEMViewInstance;
	}
	//-------------------------------------------------------------------------
	
}
