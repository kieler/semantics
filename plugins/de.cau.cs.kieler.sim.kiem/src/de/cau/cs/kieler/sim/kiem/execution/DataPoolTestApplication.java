package de.cau.cs.kieler.sim.kiem.execution;

import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class DataPoolTestApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] filter = {"key","key2","key4"};
		
		// TODO Auto-generated method stub
		try {
			JSONDataPool dataPool = new JSONDataPool();
			long index = dataPool.getPoolCounter();
			dataPool.putData(new JSONObject("{key=value}"));
			dataPool.putData(new JSONObject("{key2=value2}"));
			System.out.println(dataPool.getDeltaData(filter,index).toString());
			index = dataPool.getPoolCounter();
			dataPool.putData(new JSONObject("{key3=value3}"));
			dataPool.putData(new JSONObject("{key4=value4}"));
			System.out.println(dataPool.getDeltaData(filter,index).toString());
			System.out.println(dataPool.getData(null).toString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
