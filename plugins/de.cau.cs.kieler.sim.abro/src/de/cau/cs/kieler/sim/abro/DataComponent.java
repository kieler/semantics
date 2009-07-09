package de.cau.cs.kieler.sim.abro;

import java.util.Random;

import de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class DataComponent extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {

	public DataComponent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public JSONObject step(JSONObject JSONobject) {
		// TODO Auto-generated method stub
		try{Thread.sleep(new Random().nextInt(200));}catch(Exception e){}
		return null;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		System.out.println("ABRO DataConsumerProducer initialize");
	}

	@Override
	public boolean isConsumer() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isProducer() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
