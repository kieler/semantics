/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
 */

package de.cau.cs.kieler.sim.syncsignalreset;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONSignalValues;

import org.json.JSONObject;

/**
 * The class DataComponent implements the KIEM Extension Point. The {@link #step(JSONObject)} method
 * looks out for present signals and resets the to be absent again, because signals within the
 * KIELER Execution Manager are explicitly made present or absent.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class DataComponent extends JSONObjectDataComponent implements IJSONObjectDataComponent {

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject allDataIn) throws KiemExecutionException {
        JSONObject allDataOut = new JSONObject();
        try {

            String[] fieldNames = JSONObject.getNames(allDataIn);
            if (fieldNames != null) {
                for (int c = 0; c < fieldNames.length; c++) {
                    // extract key, value from JSONObject
                    Object obj = allDataIn.get(fieldNames[c]);
                    String key = fieldNames[c];
                    if (obj instanceof JSONObject) {
                        // if signal
                        if (JSONSignalValues.isSignalValue((JSONObject) obj)) {
                            // if present
                            if (JSONSignalValues.isPresent((JSONObject) obj)) {
                                // modify and set absent
                                JSONSignalValues.setPresent((JSONObject) obj, false);
                                // add to return JSON value only if
                                // signal was changed
                                allDataOut.accumulate(key, (JSONObject) obj);
                            }
                        }
                    }
                }

            }
        } catch (Exception e) {
            // if an exception occurs then throw a KiemExecutionException
            throw new KiemExecutionException(e.getMessage(), false, e);
        }
        return allDataOut;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        // do nothing
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        // do nothing
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isDeltaObserver() {
        return false;
    }

}
