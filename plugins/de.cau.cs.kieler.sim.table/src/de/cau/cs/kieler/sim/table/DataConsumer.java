package de.cau.cs.kieler.sim.table;

import java.util.Random;

import de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class DataConsumer extends JSONStringDataComponent implements
		IJSONStringDataComponent {

	public DataConsumer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String step(String JSONString) {
		// TODO Auto-generated method stub
		try{Thread.sleep(new Random().nextInt(200));}catch(Exception e){}
		return null;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Raw Table Consumer initialize");
	}

	@Override
	public boolean isConsumer() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isProducer() {
		// TODO Auto-generated method stub
		return false;
	}

}
