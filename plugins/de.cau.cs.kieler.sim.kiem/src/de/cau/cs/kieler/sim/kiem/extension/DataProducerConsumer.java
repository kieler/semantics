package de.cau.cs.kieler.sim.kiem.extension;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;


public abstract class DataProducerConsumer implements IExecutableExtension {
	
	private String name;
	private String ModelFile;
	private boolean enabled;
	private boolean producer;
	private boolean consumer;
	
	
	public DataProducerConsumer() {
		super();
		producer = false;
		consumer = false;
		enabled = true;
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

	public void setProducer(boolean producer) {
		this.producer = producer;
	}

	public boolean isConsumer() {
		return consumer;
	}

	public void setConsumer(boolean consumer) {
		this.consumer = consumer;
	}
	
	public String getModelFile() {
		return ModelFile;
	}
	
	public void setModelFile(String ModelFile) {
		this.ModelFile = ModelFile;
		return;
	}
	
}
