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

package de.cau.cs.kieler.sim.kiem.execution;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * The Class JSONMerger implements the merging functionality of used by the DataPool. It is able to
 * merge two JSONObjects (that are lists of key-value-pairs) into one object.
 * 
 * @author cmot, skn
 * @kieler.design 2009-12-08
 * @kieler.rating 2010-01-15 yellow
 * 
 */
public class JSONMerger {

    // -------------------------------------------------------------------------

    /**
     * Merges two JSON objects together, with values from "merge" replacing values in
     * "base" to produce a new object.
     * 
     * @param base
     *            The base object that values will be replaced into.
     * @param merge
     *            The object to merge values from.
     * 
     * @return the JSON object
     * 
     * @throws JSONException
     *             if the two objects can't be merged for some reason.
     */
    public static JSONObject mergeObjects(final JSONObject base, final JSONObject merge)
            throws JSONException {
        // Clone the initial object (JSONObject doesn't support "clone").
        JSONObject clone = new JSONObject(base.toString());
        
        // Walk parameter list for the merged object and add all fields to the base object.
        String[] fields = JSONObject.getNames(merge);
        if (fields != null && fields.length > 0) {
            for (String field : fields) {
                // Get value of the field.
                Object update = merge.get(field);
                // Add the field to the base object or replace a former value
                clone.put(field, update);
            }
        }
        return clone;
    }
}
