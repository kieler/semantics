package de.cau.cs.kieler.sim.kiem.extension;

public abstract class DataConsumer extends DataProducerConsumer implements DataConsumerInterface {
	
	public DataConsumer() {
		super();
		this.setConsumer(true);
	}
	
}
