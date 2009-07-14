package de.cau.cs.kieler.sim.kiem.execution;

import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.sim.kiem.json.*;

public class JSONDataPool {
	
	//this is the maximum number of consecutive new entries that will be kept
	//in history for a delta update
	//meaning that between two consecutive calls of getDeltaData there should
	//not be more than DATA_DELTA_POOL_HISTORY_MAX new entries been produced
	//(regardless of any steps!)
	//note that the history is needed for Delta Listener only
	private static final int DATA_DELTA_POOL_HISTORY_MAX = 1000000;
	
	private List<JSONObject> dataDeltaPool;
	private JSONObject dataPool;
	private JSONMerger jsonMerger;
	private int poolCounter;  		   		//up to DATA_DELTA_POOL_HISTORY_MAX
	private long poolCounterDiff;			//remember diff
	
	//-------------------------------------------------------------------------
	
	public JSONDataPool() {
		dataDeltaPool = new LinkedList<JSONObject>();
		dataDeltaPool.add(new JSONObject());
		dataPool = new JSONObject();
		jsonMerger = new JSONMerger();
		poolCounter = 0;
	}

	//-------------------------------------------------------------------------
	
	public synchronized long getPoolCounter() {
		return (this.poolCounter + this.poolCounterDiff);
	}
	
	//-------------------------------------------------------------------------

	public JSONObject getData(String[] filterKeys) throws JSONException {
		JSONObject returnObject = null;
		if (filterKeys == null) {
			//all data
			//return a copy of all data
			returnObject = new JSONObject(
									this.dataPool.toString());
		}
		else {
			//filtered data
			returnObject = new JSONObject();
			for (int c = 0; c < filterKeys.length; c++) {
				Object obj = dataPool.get(filterKeys[c]);
				returnObject.append(filterKeys[c], obj);
			}
			
		}
		return returnObject;
	}
	
	//-------------------------------------------------------------------------
	
	private int getPoolStartIndex(long deltaIndex) {
		int newIndex = (int)(deltaIndex - this.poolCounterDiff + 1);
		//if deltaIndex is FAR TOO old, then we can only
		//copy the values in memory 
		//THIS MEANS getDeltaData() WAS CALLED TOO LONG AGO 
		if (newIndex < 0) newIndex = 0;
		return newIndex;
	}
	
	public JSONObject getDeltaData(String[] filterKeys,
							   	   long deltaPoolIndex) throws JSONException {
		JSONObject returnObject = null;
		if (filterKeys == null) {
			//all data
			returnObject = new JSONObject();
			for (int c = getPoolStartIndex(deltaPoolIndex);
				 c <= this.poolCounter; c++) {
				 JSONObject JSONobj = dataDeltaPool.get(c);
				 returnObject = jsonMerger.mergeObjects(returnObject,JSONobj);
			}
		}
		else {
			//filtered data
			returnObject = new JSONObject();
			for (int c = getPoolStartIndex(deltaPoolIndex);
				 c <= this.poolCounter; c++) {
				 JSONObject JSONobj = dataDeltaPool.get(c);
				 for (int cc = 0; cc < filterKeys.length; cc++) {
				 		if (JSONobj.has(filterKeys[cc])) {
					 		Object obj = JSONobj.get(filterKeys[cc]);
					 		returnObject.accumulate(filterKeys[cc], obj);
					 	}
				 }
			}
		}
		System.out.println("POOL(DELTA="+deltaPoolIndex+")"+returnObject.toString());
		
		return returnObject;
	}
	
	//-------------------------------------------------------------------------
	
	public synchronized void putData(JSONObject newData) throws JSONException {
		if (poolCounter >= DATA_DELTA_POOL_HISTORY_MAX) {
			this.dataDeltaPool.remove(0);
			this.poolCounterDiff++;
			this.poolCounter--;
		}
		
		if (newData != null) {
			//merge new data
			this.dataDeltaPool.add(newData);
			this.dataPool = jsonMerger.mergeObjects(this.dataPool, newData);
			this.poolCounter++;
		}
	}
	
}
