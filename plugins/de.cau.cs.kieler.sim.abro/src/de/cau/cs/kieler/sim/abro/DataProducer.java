package de.cau.cs.kieler.sim.abro;

import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataProducer;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataProducerInterface;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class DataProducer extends JSONObjectDataProducer implements
		JSONObjectDataProducerInterface {

	public DataProducer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		try{Thread.sleep(2000);}catch(Exception e){}
		System.out.println("ABRO DataProducer initialze");
	}


	@Override
	public JSONObject step() {
		// TODO Auto-generated method stub
		return null;
	}

}
