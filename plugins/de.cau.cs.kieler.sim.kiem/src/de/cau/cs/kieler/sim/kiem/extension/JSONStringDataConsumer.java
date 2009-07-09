package de.cau.cs.kieler.sim.kiem.extension;

public abstract class JSONStringDataConsumer extends DataProducerConsumer implements JSONStringDataConsumerInterface {
	
	//constructor
	public JSONStringDataConsumer() {
		super();
		this.setConsumer(true);
		this.setProducer(false);
		this.setJSON(false);
	}
	
	//provide some key's of interest 
	public String[] getFilterKeys() {
		return null;
	}

	public boolean isDeltaListener() {
		return false;
	}

}
