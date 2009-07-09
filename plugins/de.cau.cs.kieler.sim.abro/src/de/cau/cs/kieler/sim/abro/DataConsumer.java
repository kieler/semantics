package de.cau.cs.kieler.sim.abro;

import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataConsumer;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataConsumerInterface;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class DataConsumer extends JSONObjectDataConsumer implements
		JSONObjectDataConsumerInterface {

	public DataConsumer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executionInitialize() {
		// TODO Auto-generated method stub
		System.out.println("ABRO DataConsumer initialze");
	}

	@Override
	public boolean isDeltaListener() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateData(JSONObject JSONobject) {
		// TODO Auto-generated method stub

	}

}
