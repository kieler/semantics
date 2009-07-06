package de.cau.cs.kieler.sim.table;

import de.cau.cs.kieler.sim.kiem.extension.DataConsumerInterface;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class DataConsumer extends
		de.cau.cs.kieler.sim.kiem.extension.DataConsumer implements
		DataConsumerInterface {

	public DataConsumer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ExecutionInitialize() {
		// TODO Auto-generated method stub
		System.out.println("Table initialze");
	}

	@Override
	public void UpdateAllData(JSONObject object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateAllData(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateDeltaData(JSONObject object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateDeltaData(String string) {
		// TODO Auto-generated method stub
		
	}


}
