package de.cau.cs.kieler.sim.kiem.extension;

public abstract class JSONObjectDataProducer extends DataProducerConsumer implements JSONObjectDataProducerInterface {
	
	public JSONObjectDataProducer() {
		super();
		this.setProducer(true);
		this.setConsumer(false);
		this.setJSON(true);
	}

}
