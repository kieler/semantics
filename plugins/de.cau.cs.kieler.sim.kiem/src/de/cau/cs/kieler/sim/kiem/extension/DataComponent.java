package de.cau.cs.kieler.sim.kiem.extension;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.views.KiemView;

public abstract class DataComponent implements IDataComponent,
											   IExecutableExtension {
	
	private String name;
	private String modelFile;
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
				KIEMViewInstance.updateView();
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
				KIEMViewInstance.updateView();
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
				KIEMViewInstance.updateView();
				return;
			}
		}
		throw new Exception("This instance is not a master! Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public void masterSetDelay(int delay) throws Exception {
		if (this.isMaster()) {
			if (KIEMViewInstance != null) {
				KIEMViewInstance.initDataComponent();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				KIEMInstance.execution.setDelay(delay);
				KIEMViewInstance.updateView();
				return;
			}
		}
		throw new Exception("This instance is not a master! Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public int masterGetDelay() throws Exception {
		if (this.isMaster()) {
			if (KIEMViewInstance != null) {
				KIEMViewInstance.initDataComponent();
			}
			if ((KIEMInstance != null)&&(KIEMInstance.execution != null)) {
				return KIEMInstance.execution.getDelay();
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
				KIEMViewInstance.updateView();
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
