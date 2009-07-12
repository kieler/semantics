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
			dataPool.putData(new JSONObject("{key3=value3}"));
			dataPool.putData(new JSONObject("{key4=value4}"));
			dataPool.putData(new JSONObject("{key5=value5}"));
			dataPool.putData(new JSONObject("{key6=value6}"));
			dataPool.putData(new JSONObject("{key7=value7}"));
			dataPool.putData(new JSONObject("{key8=value8}"));
			dataPool.putData(new JSONObject("{key9=value9}"));
			dataPool.putData(new JSONObject("{key10=value10}"));
			dataPool.putData(new JSONObject("{key11=value11}"));
			dataPool.putData(new JSONObject("{key12=value12}"));
			System.out.println(dataPool.getDeltaData(filter,index).toString());
			index = dataPool.getPoolCounter();
			dataPool.putData(new JSONObject("{key13=value13}"));
			dataPool.putData(new JSONObject("{key14=value14}"));
			System.out.println(dataPool.getDeltaData(filter,index).toString());
			System.out.println(dataPool.getData(null).toString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
