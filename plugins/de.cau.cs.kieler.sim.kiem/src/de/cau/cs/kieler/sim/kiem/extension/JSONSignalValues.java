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

package de.cau.cs.kieler.sim.kiem.extension;

import de.cau.cs.kieler.sim.kiem.json.JSONArray;
import de.cau.cs.kieler.sim.kiem.json.JSONException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class JSONSignalValues {
	
	public static void setPresent(JSONObject signalValue,
								  boolean isPresent) 
														throws JSONException {
		signalValue.put("status", isPresent);
	}

	//-------------------------------------------------------------------------
	
	public static boolean isSignalValue(Object signalValue) 
														throws JSONException {
		if (!(signalValue instanceof JSONObject)) return false;
		return ((JSONObject)signalValue).has("status");
	}
	
	//-------------------------------------------------------------------------
	
	public static Object getSignalValue(Object signalValue)
													throws JSONException {
		if (!isSignalValue(signalValue)) return null;
		if (((JSONObject)signalValue).has("value")) 
			return ((JSONObject)signalValue).get("value");
		return null;
	}
	
	//-------------------------------------------------------------------------
	
	public static boolean isPresent(Object signalValue) 
													throws JSONException {
		if (!isSignalValue(signalValue)) return false;
		if (((JSONObject)signalValue).has("status")) {
			return (((JSONObject)signalValue).getBoolean("status"));
		}
		return false;
	}

	//-------------------------------------------------------------------------
	
	public static JSONObject newValue(Object value, 
									  boolean present) 
														throws JSONException {
		
		JSONObject returnObject =  new JSONObject();

		returnObject.accumulate("value", value);
		returnObject.accumulate("status",present);
		
		return returnObject;
	}
	
	//-------------------------------------------------------------------------
	
	public static JSONObject newValue(boolean present) 
														throws JSONException {
		
		JSONObject returnObject =  new JSONObject();

		returnObject.accumulate("status",present);
		
		return returnObject;
	}
}
