/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/

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
	private static final int DATA_DELTA_POOL_HISTORY_MAX = 4;
	
	private List<JSONObject> dataDeltaPool;
	private JSONObject dataPool;
	private JSONMerger jsonMerger;
	private int poolCounter;  		   		//up to DATA_DELTA_POOL_HISTORY_MAX
	private long poolCounterDiff;			//remember diff
	
	//-------------------------------------------------------------------------
	
	/**
	 * Instantiates a new JSON data pool.
	 */
	public JSONDataPool() {
		dataDeltaPool = new LinkedList<JSONObject>();
		dataDeltaPool.add(new JSONObject());
		dataPool = new JSONObject();
		jsonMerger = new JSONMerger();
		poolCounter = 0;
	}

	//-------------------------------------------------------------------------
	
	/**
	 * Gets the current pool counter.
	 * 
	 * @return the pool counter
	 */
	public synchronized long getPoolCounter() {
		return (this.poolCounter + this.poolCounterDiff);
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Gets the most current data. This is the most efficient method to call
	 * since it just returns the current data pool contents. But be aware of
	 * the fact that the returned JSON object may have hundreds of values!
	 * 
	 * @param filterKeys the filter keys, optional, may be null 
	 * 
	 * @return the JSONObject containing all data
	 * 
	 * @throws JSONException a JSON exception
	 */
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
	
	/**
	 * Gets the pool start index from a provided deltaIndex. if teh deltaIndex
	 * is FAR TOO old, then it will return ALL values accumulated within
	 * index 0 of the delta list!
	 * 
	 * @param deltaIndex the delta index
	 * 
	 * @return the pool start index
	 */
	private int getPoolIndex(long deltaIndex) {
		int newIndex = (int)(deltaIndex - this.poolCounterDiff);
		//if deltaIndex is FAR TOO old, then we will
		//get ALL values accumulated within index 0 of the delta list!
		//(-1 means get ALL values => results in start index to be 0)
		if (newIndex < -1) newIndex = -1;
		return newIndex;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Gets the delta data between (since) the deltaPoolIndexFrom and the
	 * deltaPoolIndexTo or the current index if the latter is not provided.
	 * It optionally filters the results if filterKeys is not null.
	 * 
	 * @param filterKeys the filter keys, optional, may be null 
	 * @param deltaPoolIndex the delta pool index 
	 * 
	 * @return the delta data
	 * 
	 * @throws JSONException the JSON exception
	 */
	public JSONObject getDeltaData(String[] filterKeys,
		   	   long deltaPoolIndexFrom) throws JSONException {
		return getDeltaData(filterKeys,
			   	   deltaPoolIndexFrom,
			   	   this.getPoolCounter());
	}
	public JSONObject getDeltaData(String[] filterKeys,
							   	   long deltaPoolIndexFrom,
							   	   long deltaPoolIndexTo) throws JSONException {
		JSONObject returnObject = null;
		int poolCounterFrom = getPoolIndex(deltaPoolIndexFrom) + 1;
		int poolCounterTo = getPoolIndex(deltaPoolIndexTo);
		if (filterKeys == null) {
			//all data
			returnObject = new JSONObject();
			for (int c = poolCounterFrom; c <= poolCounterTo; c++) {
				 JSONObject JSONobj = dataDeltaPool.get(c);
				 returnObject = jsonMerger.mergeObjects(returnObject,JSONobj);
			}
		}
		else {
			//filtered data
			returnObject = new JSONObject();
			for (int c = poolCounterFrom; c <= poolCounterTo; c++) {
				 JSONObject JSONobj = dataDeltaPool.get(c);
				 for (int cc = 0; cc < filterKeys.length; cc++) {
				 		if (JSONobj.has(filterKeys[cc])) {
					 		Object obj = JSONobj.get(filterKeys[cc]);
					 		returnObject.accumulate(filterKeys[cc], obj);
					 	}
				 }
			}
		}
		return returnObject;
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Puts a new JSONObject into the data pool. It will also put the item
	 * into the delta pool list. If the list gets too large (according to
	 * DATA_DELTA_POOL_HISTORY_MAX) then we accumulate the history older
	 * than that into the object with the index 0. This allowes us to play
	 * back up to DATA_DELTA_POOL_HISTORY_MAX data producers (*NOT* ticks).
	 * 
	 * @param newData the new JSONObject to save
	 * 
	 * @throws JSONException  a JSON exception
	 */
	public synchronized void putData(JSONObject newData) throws JSONException {
		if (poolCounter >= DATA_DELTA_POOL_HISTORY_MAX) {
			//always take the first object in the deltaList as a BASE object
			//and accumulate following objects in it when the list gets
			//too full according to its limit
			JSONObject baseObject = this.dataDeltaPool.get(0);
			JSONObject objectToRemove = this.dataDeltaPool.get(1);
			this.dataDeltaPool.remove(0);
			JSONObject merged = jsonMerger.mergeObjects(baseObject, objectToRemove);
			this.dataDeltaPool.set(0, merged);
			this.poolCounterDiff++;
			this.poolCounter--;
		}
		
		if (newData != null) {
			//merge new data
			this.dataDeltaPool.add(newData);
			this.dataPool = jsonMerger.mergeObjects(this.dataPool, newData);
			this.poolCounter++;
		}
		else {
			//no change
			this.dataDeltaPool.add(new JSONObject());
			this.poolCounter++;
		}
	}
	
}
