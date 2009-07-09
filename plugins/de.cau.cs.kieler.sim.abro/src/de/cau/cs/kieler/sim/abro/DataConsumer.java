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
	public void initialize() {
		// TODO Auto-generated method stub
		System.out.println("ABRO DataConsumer initialze");
	}

	@Override
	public void updateData(JSONObject JSONobject) {
		// TODO Auto-generated method stub

	}

}
