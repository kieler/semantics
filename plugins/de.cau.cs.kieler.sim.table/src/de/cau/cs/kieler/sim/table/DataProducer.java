package de.cau.cs.kieler.sim.table;

import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataProducer;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataProducerInterface;

public class DataProducer extends JSONStringDataProducer implements
		JSONStringDataProducerInterface {

	public DataProducer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Raw Table DataProducer initialize");
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	@Override
	public String step() {
		// TODO Auto-generated method stub
		return null;
	}

}
