package de.cau.cs.kieler.sim.kiem.execution;

import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.sim.kiem.json.*;

public class JSONDataPool {
	
	//this is the maximum number of steps that will be kept in history
	//note that the history is needed for Delta Listener only
	private static final int DATA_DELTA_POOL_HISTORY_MAX = 10000;
	
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
	
	public long getPoolCounter() {
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
		
	public JSONObject getDeltaData(String[] filterKeys,
							   	   long deltaPoolIndex) throws JSONException {
		JSONObject returnObject = null;
		if (filterKeys == null) {
			//all data
			returnObject = new JSONObject();
			for (int c = (int)(deltaPoolIndex-this.poolCounterDiff);
				 c < this.poolCounter; c++) {
				 JSONObject JSONobj = dataDeltaPool.get(c);
				 jsonMerger.mergeObjects(returnObject,JSONobj);
			}
		}
		else {
			//filtered data
			returnObject = new JSONObject();
			for (int c = (int)(deltaPoolIndex-this.poolCounterDiff);
				 c < this.poolCounter; c++) {
				 JSONObject JSONobj = dataDeltaPool.get(c);
				 for (int cc = 0; cc < filterKeys.length; cc++) {
						Object obj = JSONobj.get(filterKeys[cc]);
						returnObject.append(filterKeys[cc], obj);
				 }
			}
		}
		return returnObject;
	}
	
	//-------------------------------------------------------------------------
	
	public synchronized void putData(JSONObject newData) throws JSONException {
		if (poolCounter >= DATA_DELTA_POOL_HISTORY_MAX) {
			this.dataDeltaPool.remove(0);
			this.poolCounterDiff--;
		}
		
		if (newData != null) {
			//merge new data
			this.dataDeltaPool.add(jsonMerger.mergeObjects(
					this.dataDeltaPool.get(poolCounter), newData));
			jsonMerger.mergeObjects(this.dataPool, newData);
			this.poolCounter++;
		}
	}
	
}
