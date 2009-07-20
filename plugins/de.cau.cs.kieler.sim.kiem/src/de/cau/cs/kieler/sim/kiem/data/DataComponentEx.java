package de.cau.cs.kieler.sim.kiem.data;

import de.cau.cs.kieler.sim.kiem.extension.DataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;


public class DataComponentEx {
	
	private boolean enabled;
	private boolean skipped;
	protected KiemPropertyList properties;  //List of properties
	private DataComponent component;
	private long deltaIndex;
	private Boolean json;
	private Boolean propertyComponent; 	   //this component is just a property!
	
	//normal constructor
	public DataComponentEx(DataComponent component) {
		super();
		this.component = component;
		this.enabled = true;
		this.skipped = false;
		this.properties = new KiemPropertyList(this.component.getProperties());
		this.propertyComponent = false;
		this.json = null;
		this.deltaIndex = 0;
	}

	// --------- for property list entries ------------------------- 
	public DataComponentEx() {
		this.component = null;
		this.enabled = true;
		this.skipped = false;
		this.properties = null;
		this.propertyComponent = true;
		this.json = null;
		this.deltaIndex = 0;
	}

	public boolean isPropertyComponent() {
		return this.propertyComponent;
	}
	public void setPropertyComponent(boolean propertyComponent) {
		this.propertyComponent = propertyComponent;
	}
	// --------- ------------------------- ------------------------- 

	public boolean isJSON() {
		if (this.json != null) return this.json.booleanValue();
		if (this.getDataComponent() instanceof JSONObjectDataComponent)
			this.json = new Boolean(true);
		else
			this.json = new Boolean(false);
		return this.json.booleanValue();
	}
	
	public DataComponent getDataComponent() {
		return component;
	}
	
	public KiemPropertyList getPropertyList() {
		return this.properties;
	}
	
	
	//indicates that this component was skipped
	//(this prevents its deltaIndex to advance)
	public boolean getSkipped() {
		return skipped;
	}
	public void setSkipped(boolean skipped) {
		this.skipped = skipped;
	}

	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	//this is used to store the deltaIndex values inside the components
	//object
	public long getDeltaIndex() {
		return deltaIndex;
	}
	public void setDeltaIndex(long deltaIndex) {
		this.deltaIndex = deltaIndex;
	}
	
	
	public boolean isProducer() {
		return this.component.isProducer();
	}
	public boolean isObserver() {
		return this.component.isObserver();
	}
	public boolean isProducerObserver() {
		return (this.isProducer() && this.isObserver());
	}
	public boolean isProducerOnly() {
		return (this.isProducer() && !this.isObserver());
	}
	public boolean isObserverOnly() {
		return (!this.isProducer() && this.isObserver());
	}
	
	//-----------------------------------------------------------------------
	// PROXY METHODS
	
	public String getName() {
		return this.component.getName();
	}
	
	public String[] getFilterKeys() {
		return this.component.getFilterKeys();
	}
	public String[] getLocalInterfaceVariables() {
		return this.component.getLocalInterfaceVariables(); 
	}
	public KiemProperty[] getProperties() {
		return this.component.getProperties(); 
	}

	public boolean isDeltaObserver() {
		return this.component.isDeltaObserver(); 
	}
	public boolean isMaster() {
		return this.component.isMaster(); 
	}
	public boolean isPauseFlag() {
		return this.component.isPauseFlag(); 
	}
	public boolean isStepDone() {
		return this.component.isStepDone(); 
	}
	public boolean isModelFileNeeded() {
		return this.component.isModelFileNeeded(); 
	}
	
	public void setModelFile(String modelFile) {
		this.component.setModelFile(modelFile); 
	}
	public void setGloblaInterfaceVariables(String[] globalInterfaceVariables) {
		this.component.setGloblaInterfaceVariables(globalInterfaceVariables); 
	}
	
}
