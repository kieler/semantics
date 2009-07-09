package de.cau.cs.kieler.sim.table;

import de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class DataProducer extends JSONStringDataComponent implements
		IJSONStringDataComponent {

	public DataProducer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String step(String JSONString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Raw Table Producer initialize");
	}

	@Override
	public boolean isConsumer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isProducer() {
		// TODO Auto-generated method stub
		return true;
	}

}
