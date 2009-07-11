package de.cau.cs.kieler.sim.kiem.execution;

import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class DataPoolTestApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			JSONDataPool dataPool = new JSONDataPool();
			dataPool.putData(new JSONObject("{key=value}"));
			dataPool.putData(new JSONObject("{key2=value2}"));
			System.out.println(dataPool.getData(null).toString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
