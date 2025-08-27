/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.mobile.tablemaster;

import org.json.JSONException;
import org.json.JSONObject;


/**
 * The Class JSONMerger implements the merging functionality of used
 * by the DataPool. It is able to merge two JSONObjects (that are
 * lists of key-value-pairs) into one object.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @author Stephan Knaur <skn@informatik.uni-kiel.de>
 * 
 */
public class JSONMerger {
	
	//-------------------------------------------------------------------------

	/**
	 * Instantiates a new jSON merger.
	 */
	JSONMerger() {
			
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Merges two JSON objects together (recursively), with values from
	 * "merge" replacing values in "base" to produce a new object.
	 * 
	 * @param base The base object that values will be replaced into.
	 * @param merge The object to merge values from.
	 * 
	 * @return the JSON object
	 * 
	 * @throws JSONException if the two objects can't be merged for some
	 * reason.
	 */
	  public static JSONObject mergeObjects(JSONObject base, JSONObject merge)
	      throws JSONException {
	    // Clone the initial object (JSONObject doesn't support "clone").

	    //JSONObject clone = new JSONObject(base, JSONObject.getNames(base));
	    JSONObject clone = new JSONObject(base.toString());
	    // Walk parameter list for the merged object and merge recursively.
	    String[] fields = JSONObject.getNames(merge);
	    if (fields != null && fields.length > 0) {
		    for (String field : fields) {
		    	  //opt = get object if exists otherwise set to null
			      Object existing = clone.opt(field);
			      //here the object does exists
			      Object update = merge.get(field); 
			      if (existing == null || update == null) {
			        // New custom config, not referenced in the prototype, or
			        // Removing a pre-configured value.
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
		    }//next field
	    }//end if there are fields to add
	    return clone;
	  }
	  
}
