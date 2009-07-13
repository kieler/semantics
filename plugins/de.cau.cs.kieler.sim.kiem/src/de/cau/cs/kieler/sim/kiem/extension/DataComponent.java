package de.cau.cs.kieler.sim.kiem.extension;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.views.KiemView;

public abstract class DataComponent implements IDataComponent,
											   IExecutableExtension {
	
	private String name;
	private boolean enabled;
	private boolean json;
	private KiemPlugin KIEMInstance;   //only contains access to execution
	private KiemView KIEMViewInstance; //thread iff this DataComponent
									   //is a master
	
	public DataComponent() {
		super();
		enabled = true;
		json = false;
	}
	
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		this.name = config.getAttribute("name");
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public boolean isJSON() {
		return this.json;
	}
	protected void setJSON(boolean json) {
		this.json = json;
	}
	
	public boolean isProducerConsumer() {
		return (this.isProducer() && this.isConsumer());
	}
	public boolean isPureProducer() {
		return (this.isProducer() && !this.isConsumer());
	}
	public boolean isPureConsumer() {
		return (!this.isProducer() && this.isConsumer());
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
	
	//if this producer/consumer needs the model file override this
	//and return true
	//the ExecutionManager will then check for it
	public boolean needModelFile() {
		return false;
	}
		
	//-------------------------------------------------------------------------

	//if this DataComponent implements a consumer, 
	//provide some key's of interest 
	public String[] getFilterKeys() {
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
	
	//if this DataComponent implements a consumer, which wants delta values 
	//only, it should override this method to return true
	public boolean isDeltaConsumer() {
		return false;
	}
	//this is used to store the deltaIndex values inside the components
	//object
	public long deltaIndex = 0;
	
	//-------------------------------------------------------------------------

	//TODO: not implemented yet
	//this method can be overridden to force the execution to pause
	//please note that it cannot be guaranteed that the execution is paused
	//because if the user clicks "play" or "step" in the GUI, or if a master
	//calls step(), then the execution continues
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
	//Also note that this method is ignored for pure data consumers because
	//there is blocking impact on the schedule from them
	public boolean isStepDone() {
		return true;
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
	public int masterStepExecution() throws Exception {
		if (this.isMaster()) {
			if ((KIEMViewInstance != null)) {
				KIEMViewInstance.initDataComponent();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				int returnValue = KIEMInstance.execution.stepExecution();
				KIEMViewInstance.updateView(true);
				return returnValue;
			}
		}
		throw new Exception("This instance is not a master! Override isMaster() to return true!");
	}
	//if this is a master it can stop the execution
	public void masterStopExecution() throws Exception {
		if (this.isMaster()) {
			if (KIEMViewInstance != null) {
				KIEMViewInstance.initDataComponent();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.stopExecution();
				KIEMInstance.resetCurrentModelFile();
				KIEMInstance.execution = null;
				KIEMViewInstance.updateView(true);
				return;
			}
		}
		throw new Exception("This instance is not a master! Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public void masterPauseExecution() throws Exception {
		if (this.isMaster()) {
			if ((KIEMViewInstance != null)) {
				KIEMViewInstance.initDataComponent();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.pauseExecution();
				KIEMViewInstance.updateView(true);
				return;
			}
		}
		throw new Exception("This instance is not a master! Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public void masterSetAimedStepDuration(int aimedStepDuration) throws Exception {
		if (this.isMaster()) {
			if (KIEMViewInstance != null) {
				KIEMViewInstance.initDataComponent();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.setAimedStepDuration(aimedStepDuration);
				KIEMViewInstance.updateView(true);
				return;
			}
		}
		throw new Exception("This instance is not a master! Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public int masterGetAimedStepDuration() throws Exception {
		if (this.isMaster()) {
			if (KIEMViewInstance != null) {
				KIEMViewInstance.initDataComponent();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				return KIEMInstance.execution.getAimedStepDuration();
			}
		}
		throw new Exception("This instance is not a master! Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public void masterRunExecution() throws Exception {
		if (this.isMaster()) {
			if ((KIEMViewInstance != null)) {
				KIEMViewInstance.initDataComponent();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.runExecution();
				KIEMViewInstance.updateView(true);
				return;
			}
		}
		throw new Exception("This instance is not a master! Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public boolean masterIsPaused() throws Exception {
		if (this.isMaster()) {
			if (KIEMViewInstance != null) {
				KIEMViewInstance.initDataComponent();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				return KIEMInstance.execution.isPaused();
			}
		}
		throw new Exception("This instance is not a master! Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public boolean masterIsRunning() throws Exception {
		if (this.isMaster()) {
			if (KIEMViewInstance != null) {
				KIEMViewInstance.initDataComponent();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				return KIEMInstance.execution.isRunning();
			}
		}
		throw new Exception("This instance is not a master! Override isMaster() to return true!");
	}
	//is called from the ExecutionManager only iff isMaster() returns true
	public void masterSetKIEMInstances(KiemPlugin KIEMInstance, 
							  		   KiemView KIEMViewInstance) {
		this.KIEMInstance = KIEMInstance;
		this.KIEMViewInstance = KIEMViewInstance;
	}
	//-------------------------------------------------------------------------
	
	
}
