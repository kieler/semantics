package de.cau.cs.kieler.sim.table;

import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataProducer;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataProducerInterface;

public class DataProducer extends JSONStringDataProducer implements
		JSONStringDataProducerInterface {

	public DataProducer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executionInitialize() {
		// TODO Auto-generated method stub
		System.out.println("Raw Table DataProducer initialize");
	}

	@Override
	public void executionReset() {
		// TODO Auto-generated method stub

	}

	@Override
	public String executionStep() {
		// TODO Auto-generated method stub
		return null;
	}

}
