package de.cau.cs.kieler.sim.table;

import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataConsumer;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataConsumerInterface;

public class DataConsumer extends JSONStringDataConsumer implements
		JSONStringDataConsumerInterface {

	public DataConsumer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Raw Table DataConsomer initialize");
	}

	@Override
	public void updateData(String JSONstring) {
		// TODO Auto-generated method stub

	}

}
