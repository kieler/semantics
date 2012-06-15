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

package de.cau.cs.kieler.sim.abro;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeChoice;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeModel;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeWorkspaceFile;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * The class DataComponent. It implements the KIEM Extension Point for JSONObject capable
 * DataComponents. The behavior is described in {@link AbroPlugin} and the method
 * {@link #step(JSONObject)} implements this behavior.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class DataComponent extends JSONObjectDataComponent implements IJSONObjectDataComponent {

    /** The state ''wait for A''. */
    private boolean wA;

    /** The state ''wait for B''. */
    private boolean wB;

    /** The state ''done A''. */
    private boolean dA;

    /** The state ''done B''. */
    private boolean dB;

    /** The done state (got A and B). */
    private boolean done;

    /** The name of the state variable to output. */
    private String stateName;
    
    private boolean visible;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new data component.
     */
    public DataComponent() {
        visible = true;
    }

    // -------------------------------------------------------------------------

    /**
     * Reset abo.
     */
    private void resetABO() {
        wA = true;
        wB = true;
        dA = false;
        dB = false;
        done = false;
    }

    // -------------------------------------------------------------------------

    /**
     * Transition_w a_d a.
     */
    private void transitionFromwATodA() {
        wA = false;
        dA = true;
    }

    // -------------------------------------------------------------------------

    /**
     * Transition_w b_d b.
     */
    private void transitionFromwBTodB() {
        wB = false;
        dB = true;
    }

    // -------------------------------------------------------------------------

    /**
     * Transition_done.
     */
    private void transitionTodone() {
        dB = false;
        dA = false;
        done = true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject jSONObject) throws KiemExecutionException {

        JSONObject returnObj = new JSONObject();
        try {
            if (jSONObject.has("E") && (JSONSignalValues.isPresent(jSONObject.get("E")))) {
                // raise sample error when signal E is present
                throw new KiemExecutionException("Error detected!", true, null);
            }

            if (jSONObject.has("R") && (JSONSignalValues.isPresent(jSONObject.get("R")))) {
                // reset ABO when R is present
                resetABO();
            } else {
                if (wA && jSONObject.has("A") && (JSONSignalValues.isPresent(jSONObject.get("A")))) {
                    // take transition from waitA to doneA when A is present
                    transitionFromwATodA();
                }
                if (wB && jSONObject.has("B") && (JSONSignalValues.isPresent(jSONObject.get("B")))) {
                    // take transition from waitB to doneB when B is present
                    transitionFromwBTodB();
                }
                if (dA && dB) {
                    // take normal termination if in both states doneA and doneB
                    transitionTodone();
                    returnObj.accumulate("O", JSONSignalValues.newValue(true));
                }
            }
            // return the current state(s) ABRO is in
            if (done) {
                returnObj.accumulate(stateName, "done");
            }
            if (dA && !dB) {
                returnObj.accumulate(stateName, "dA, wB");
            }
            if (dB && !dA) {
                returnObj.accumulate(stateName, "wa, dB");
            }
            if (wA && wB) {
                returnObj.accumulate(stateName, "wA, wB");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return returnObj;
    }

    // --------------------------------------------------------------------------
    // additional methods


    /**
     * {@inheritDoc}
     */
    public void initialize() {
        stateName = getProperties()[0].getValue();
        // write some warm welcome to the console
        System.out.println("ABRO in Java in KIELER in ACTION :-) initialize");
        resetABO();
    }

    // -------------------------------------------------------------------------


    /**
     * {@inheritDoc}
     */
    public void wrapup() {
        visible = !visible;
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
    public boolean isDeltaObserver() {
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

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isMaster()
     */
    @Override
    public boolean isMaster() {
        return false;
    }

    // -------------------------------------------------------------------------

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent#provideInitialVariables()
     */
    @Override
    public JSONObject provideInitialVariables() {
        JSONObject returnObj = new JSONObject();
        try {
            returnObj.accumulate("A", JSONSignalValues.newValue(false));
            returnObj.accumulate("B", JSONSignalValues.newValue(false));
            returnObj.accumulate("R", JSONSignalValues.newValue(false));
            returnObj.accumulate("O", JSONSignalValues.newValue(false));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return returnObj;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isMultiInstantiable()
     */
    @Override
    public boolean isMultiInstantiable() {
        return true;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#provideProperties()
     */
    @Override
    public KiemProperty[] provideProperties() {
        // CHECKSTYLEOFF MagicNumber
        // Rationale: only 5 example properties
        KiemProperty[] properties = new KiemProperty[7];
        properties[0] = new KiemProperty("state name", "ABRO state");
        properties[1] = new KiemProperty("some bool", true);
        properties[2] = new KiemProperty("an integer", 2);
        // when loading this property, restore its value to default
        properties[2].setRestoreToDefaultOnLoad(true);
        properties[3] = new KiemProperty("a file", new KiemPropertyTypeFile(), "c:/nothing.txt");
        String[] items = {"trace 1", "trace 2", "trace 3", "trace 4"};
        properties[4] = new KiemProperty("a choice", new KiemPropertyTypeChoice(items), items[2]);
        properties[5] = new KiemProperty("workspace file", new KiemPropertyTypeWorkspaceFile(),
                "/nothing.txt");
        properties[6] = new KiemProperty("editor", new KiemPropertyTypeModel(), "");
        // CHECKSTYLEON MagicNumber
        return properties;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.cau.cs.kieler.sim.kiem.internal.DataComponent#checkProperties(de.cau.cs.kieler.sim.kiem
     * .data.KiemProperty[])
     */
    @Override
    public void checkProperties(final KiemProperty[] properties) throws KiemPropertyException {
        if (properties[0].getValue().trim().length() == 0) {
            throw new KiemPropertyException("The state name cannot be empty!");
        }
    }

    // -------------------------------------------------------------------------
    
    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent#provideEventOfInterest()
     */
    @Override
    public KiemEvent provideEventOfInterest() {
        int[] events = {KiemEvent.LOAD, KiemEvent.SAVE};
        KiemEvent event = new KiemEvent(events);
        System.out.println(event.getEventCodesAsList());
        return (event);
    }
    
    // -------------------------------------------------------------------------
    
    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent#provideEventOfInterest()
     */
    @Override
    public void notifyEvent(final KiemEvent event) {
        return;
    }
    
    // -------------------------------------------------------------------------
    
    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent#isInvisible()
     */
    @Override
    public boolean isInvisible() {
        return false;
    }
}
