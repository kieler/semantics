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
package de.cau.cs.kieler.sim.esi;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.esi.esi.signal;
import de.cau.cs.kieler.sim.esi.esi.tick;
import de.cau.cs.kieler.sim.esi.trace.ITraceList;
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
public class OutputValidator extends JSONObjectDataComponent implements IAutomatedProducer {

    private static final String[] SUPPORTED_FILES = {};

    // private tracelist tracelist = null;
    // private Iterator<trace> iTrace;
    // private Iterator<tick> iTick;

    private int pos = 0;
    private int errorPos = 0;

    private boolean isValid = true;

    private ITraceList tracelist;

    private Set<String> outputs = null;

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject input) throws KiemExecutionException {

        JSONObject res = new JSONObject();
        if (tracelist != null) {
            if (outputs == null) {
                outputs = tracelist.getOutputs();
            }
            // if (tracelist.current() == null || !tracelist.current().hasNext()
            // && tracelist.hasNext()) {
            // // pos += "! reset".length();
            // tracelist.next();
            // }
            if (tracelist.current() != null) {
                tick tick = tracelist.current().current();
                boolean valid = true;
                try {
                    // Everything in the trace is emitted
                    for (signal sig : tick.getOutput()) {
                        if (input.has(sig.getName())) {
                            Object obj = input.get(sig.getName());
                            if (!JSONSignalValues.isPresent(obj)) {
                                valid = false;
                                break;
                            }
                            if (sig.isValued()) {
                                if ((Integer) (JSONSignalValues.getSignalValue(obj)) != sig
                                        .getVal()) {
                                    valid = false;
                                    break;
                                }
                            }
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
        tracelist = null;
        for (DataComponentWrapper component : KiemPlugin.getDefault().getDataComponentWrapperList()) {
            if (component.getDataComponent() instanceof ITraceProvider) {
                tracelist = ((ITraceProvider) component.getDataComponent()).getTrace();
                break;
            }
        }

        if (tracelist == null) {
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
        tracelist = null;
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
