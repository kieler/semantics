package de.cau.cs.kieler.sim.kiem.extension;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;

public abstract class DataProducerConsumer implements IExecutableExtension {
	
	private String name;
	private String ModelFile;
	private boolean enabled;
	private boolean producer;
	private boolean consumer;
	private boolean json;
	KiemPlugin KIEM;                   //only contains accesss to execution
									   //thread iff this DataProducerConsumer
									   //is a master
	
	public DataProducerConsumer() {
		super();
		producer = false;
		consumer = false;
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
	
	public boolean isProducer() {
		return producer;
	}

	protected void setProducer(boolean producer) {
		this.producer = producer;
	}

	public boolean isConsumer() {
		return consumer;
	}

	protected void setConsumer(boolean consumer) {
		this.consumer = consumer;
	}
	
	public String getModelFile() {
		return ModelFile;
	}
	
	public void setModelFile(String ModelFile) {
		this.ModelFile = ModelFile;
		return;
	}

	public boolean isJSON() {
		return this.json;
	}
	protected void setJSON(boolean json) {
		this.json = json;
	}
	
	//-------------------------------------------------------------------------
	//           at most ONE DataProducerConsumer can be a Master! 
	//-------------------------------------------------------------------------
	//override isMaster, if this DataProducerConsumer is a master
	//should return false to true
	//then
	// 1. ExecutionManager ensures that no other
	//	  master is present
	// 2. Calling stepExecution initializes a tick
	public boolean isMaster() {
		return false;
	}
	//if this is a master it can initiate the execution
	public void masterStepExecution() {
		if (this.isMaster()) {
			if (KIEM != null) {
				KIEM.execution.stepExecution();
				return;
			}
		}
		throw new RuntimeException("This instance is not a master! Override isMaster() to return true!");
	}
	//if this is a master it can stop the execution
	public void masterStopExecution() {
		if (this.isMaster()) {
			if (KIEM != null) {
				KIEM.execution.stopExecution();
				return;
			}
		}
		throw new RuntimeException("This instance is not a master! Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public void masterPauseExecution() {
		if (this.isMaster()) {
			if (KIEM != null) {
				KIEM.execution.stopExecution();
				return;
			}
		}
		throw new RuntimeException("This instance is not a master! Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public void masterSetDelay(int delay) {
		if (this.isMaster()) {
			if (KIEM != null) {
				KIEM.execution.setDelay(delay);
				return;
			}
		}
		throw new RuntimeException("This instance is not a master! Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public int masterGetDelay() {
		if (this.isMaster()) {
			if (KIEM != null) {
				return KIEM.execution.getDelay();
			}
		}
		throw new RuntimeException("This instance is not a master! Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public void masterRunExecution() {
		if (this.isMaster()) {
			if (KIEM != null) {
				KIEM.execution.runExecution();
				return;
			}
		}
		throw new RuntimeException("This instance is not a master! Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public boolean masterIsPaused() {
		if (this.isMaster()) {
			if (KIEM != null) {
				return KIEM.execution.isPaused();
			}
		}
		throw new RuntimeException("This instance is not a master! Override isMaster() to return true!");
	}
	//if this is a master it can pause the execution
	public boolean masterIsRunning() {
		if (this.isMaster()) {
			if (KIEM != null) {
				return KIEM.execution.isRunning();
			}
		}
		throw new RuntimeException("This instance is not a master! Override isMaster() to return true!");
	}
	//is called from the ExecutionManager only iff isMaster() returns true
	public void masterSetKIEM(KiemPlugin KIEM) {
		this.KIEM = KIEM;
	}
	//-------------------------------------------------------------------------
	
	
}
