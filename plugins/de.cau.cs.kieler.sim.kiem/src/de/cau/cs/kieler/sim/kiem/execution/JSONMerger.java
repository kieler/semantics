package de.cau.cs.kieler.sim.kiem.execution;

import de.cau.cs.kieler.sim.kiem.json.*;

public class JSONMerger {

	//This class merges two JSON-Objects
	
	JSONMerger() {
			
	}
	/**
	   * Merges two JSON objects together (recursively), with values from "merge"
	   * replacing values in "base" to produce a new object.
	   *
	   * @param base The base object that values will be replaced into.
	   * @param merge The object to merge values from.
	   *
	   * @throws JSONException if the two objects can't be merged for some reason.
	   */
	  public JSONObject mergeObjects(JSONObject base, JSONObject merge)
	      throws JSONException {
	    // Clone the initial object (JSONObject doesn't support "clone").

	    //JSONObject clone = new JSONObject(base, JSONObject.getNames(base));
	    JSONObject clone = new JSONObject(base.toString());
	    // Walk parameter list for the merged object and merge recursively.
	    String[] fields = JSONObject.getNames(merge);
	    for (String field : fields) {
	      Object existing = clone.opt(field); //opt = get object if exists otherwise set to null
	      Object update = merge.get(field); //here the object does exists
	      if (existing == null || update == null) {
	        // It's new custom config, not referenced in the prototype, or
	        // it's removing a pre-configured value.
	        clone.put(field, update);
	      } else {
	        // Merge if object type is JSONObject.
	        if (update instanceof JSONObject &&
	            existing instanceof JSONObject) {
	          clone.put(field, mergeObjects((JSONObject)existing,
	                                        (JSONObject)update));
	        } else {
	          // Otherwise we just overwrite it.
	          clone.put(field, update);
	        }
	      }
	    }
	    return clone;
	  }

}
