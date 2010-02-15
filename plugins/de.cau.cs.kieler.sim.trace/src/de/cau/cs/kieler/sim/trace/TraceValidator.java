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
package de.cau.cs.kieler.sim.trace;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.trace.ITraceList;
import de.cau.cs.kieler.sim.kiem.IAutomatedProducer;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeBool;

/**
 * Data-component to read traces in esi format.
 * 
 * @author ctr
 */
public class TraceValidator extends JSONObjectDataComponent implements IAutomatedProducer {

    private static final String[] SUPPORTED_FILES = {};

    private int pos = 0;
    private int errorPos = 0;

    private boolean isValid = true;

    private TraceReader traceReader;

    private Set<String> outputs = null;

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject input) throws KiemExecutionException {

        JSONObject res = new JSONObject();
        if (traceReader != null) {

            if (traceReader.current != null) {
                ITick tick = traceReader.current.current();
                boolean valid = true;
                try {
                    // Everything in the trace is emitted
                    for (Signal sig : tick.getOutputs()) {
                        if (input.has(sig.getName())) {
                            Object obj = input.get(sig.getName());
                            if (!JSONSignalValues.isPresent(obj)) {
                                valid = false;
                                break;
                            }
                            // TODO: valued signals
                            /*
                             * if (sig.isValued()) { if ((Integer)
                             * (JSONSignalValues.getSignalValue(obj)) != sig .getVal()) { valid =
                             * false; break; } }
                             */
                        } else {
                            valid = false;

                            break;
                        }
                    }

                    /** TODO:Everything emitted is in the trace */
                    // Iterator<String> key = input.keys();
                    // while (key.hasNext()) {
                    //                     
                    // JSONObject obj = input.getJSONObject(key.next());
                    // if (JSONSignalValues.isSignalValue(obj)) {
                    // if (JSONSignalValues.isPresent(obj) &&
                    // !tick.getInput().contains(key)) {
                    // valid = false;
                    // break;
                    // } else {
                    // if (tick.getInput().contains(key)) {
                    // valid = false;
                    // break;
                    // }
                    //
                    // }
                    // }
                    // }
                    if (isValid && !valid) {
                        isValid = false;
                        errorPos = pos;
                    }
                    res.accumulate("valid", JSONSignalValues.newValue(pos, valid));
                    res.accumulate("not valid", JSONSignalValues.newValue(pos, !valid));
                    res.accumulate("traceValid", JSONSignalValues.newValue(errorPos, isValid));

                } catch (JSONException e) {
                    throw new KiemExecutionException("Error building JSON Object", false, e);
                }
            }
            pos++;
        }

        return res;
    }

    // --------------------------------------------------------------------------
    // additional methods
    /** {@inheritDoc} */
    @Override
    public JSONObject provideInitialVariables() throws KiemInitializationException {
        JSONObject res = new JSONObject();
        traceReader = null;
        for (DataComponentWrapper component : KiemPlugin.getDefault().getDataComponentWrapperList()) {
            if (component.getDataComponent() instanceof TraceReader) {
                traceReader = ((TraceReader) component.getDataComponent());
                break;
            }
        }

        if (traceReader == null) {
            throw new KiemInitializationException(
                    "Need at least one trace provider in the Execution.", true, null);
        }

        try {
            res.accumulate("valid", JSONSignalValues.newValue(true));
        } catch (JSONException e) {
            throw new KiemInitializationException("JSON error", true, e);
        }
        return res;
    }

    /** {@inheritDoc} */
    public void initialize() throws KiemInitializationException {
        // tracelist = null;
        /*
         * if (tracelist == null) { // load new trace try { String name =
         * getProperties()[0].getValue(); if (traceFile != null) { // Automated run name =
         * traceFile; } tracelist = new EsiFile(getClass(), name); } catch (Exception e) { throw new
         * KiemInitializationException("Cannot open trace file", true, e); } }
         */
        isValid = true;
    }

    /** {@inheritDoc} */
    public boolean isObserver() {
        return true;
    }

    /** {@inheritDoc} */
    public void wrapup() {
        traceReader = null;
    }

    /**
     * {@inheritDoc}
     */
    public List<KiemProperty> produceInformation() {
        List<KiemProperty> res = new LinkedList<KiemProperty>();
        res.add(new KiemProperty("valid", new KiemPropertyTypeBool(), String.valueOf(isValid)));
        return res;
    }

    /**
     * {@inheritDoc}
     */
    public void setParameters(final List<KiemProperty> properties) {
    }

    /**
     * {@inheritDoc}
     */
    public int wantsMoreRuns() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    public int wantsMoreSteps() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    public String[] getSupportedExtensions() {
        return SUPPORTED_FILES;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return true;
    }
}
