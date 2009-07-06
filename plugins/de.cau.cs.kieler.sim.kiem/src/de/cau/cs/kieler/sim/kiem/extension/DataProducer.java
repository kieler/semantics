package de.cau.cs.kieler.sim.kiem.extension;

public abstract class DataProducer extends DataProducerConsumer implements DataProducerInterface {
	
	public DataProducer() {
		super();
		this.setProducer(true);
	}

}
