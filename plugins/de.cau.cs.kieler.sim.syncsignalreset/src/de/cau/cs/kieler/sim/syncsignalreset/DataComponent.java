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

package de.cau.cs.kieler.sim.syncsignalreset;

import de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONArray;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class DataComponent extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent#step(de.cau.cs.kieler.sim.kiem.json.JSONObject)
	 */
	public JSONObject step(JSONObject allDataIn) throws KiemExecutionException {
		JSONObject allDataOut = new JSONObject();
		try {
			
			String[] fieldNames = JSONObject.getNames(allDataIn);
			if (fieldNames != null) {
				for (int c = 0; c < fieldNames.length; c++) {
					//extract key, value from JSONObject
					Object obj = allDataIn.get(fieldNames[c]);
					String key = fieldNames[c];
					Object value;
					if (obj instanceof JSONObject) {
						//if signal
						if (JSONSignalValues.isSignalValue((JSONObject)obj)) {
							//if present
							if (JSONSignalValues.isPresent((JSONObject)obj)) {
								//modify and set absent
								JSONSignalValues.setPresent((JSONObject)obj, false);
								allDataOut.accumulate(key, (JSONObject)obj);
							}
						}
					}
				}
				
			}
		}catch(Exception e) {
			throw new KiemExecutionException(e.getMessage(), false, e);
		}
		return allDataOut;
	}		
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
	 */
	public void initialize() throws KiemInitializationException {
		// TODO Auto-generated method stub
		
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isObserver()
	 */
	public boolean isObserver() {
		// TODO Auto-generated method stub
		return true;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isProducer()
	 */
	public boolean isProducer() {
		// TODO Auto-generated method stub
		return true;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#wrapup()
	 */
	public void wrapup() throws KiemInitializationException {
		// TODO Auto-generated method stub
		
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isDeltaObserver()
	 */
	public boolean isDeltaObserver() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
