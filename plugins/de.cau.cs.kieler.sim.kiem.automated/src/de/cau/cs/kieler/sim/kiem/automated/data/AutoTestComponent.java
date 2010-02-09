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
package de.cau.cs.kieler.sim.kiem.automated.data;

import java.util.LinkedList;
import java.util.List;

import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IAutomatedProducer;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * This class is just for testing the automated execution feature. No real need
 * to review it.
 * 
 * @author soh
 * @kieler.rating 2010-01-29 red
 */
public class AutoTestComponent extends JSONObjectDataComponent implements
        IAutomatedProducer {

    /** The number of iterations this component wants to execute. */
    private static final int MAX_ITERATION = 3;

    /** The number of steps this component wants to execute. */
    private static final int MAX_STEP = 7;

    /** The index of the current iteration. */
    private int iteration = 0;

    /** The step counter. */
    private int stepCounter = 0;

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public List<KiemProperty> produceInformation() {
        List<KiemProperty> result = new LinkedList<KiemProperty>();
        result.add(new KiemProperty("Iteration", iteration + ""));
        result.add(new KiemProperty("Step finished", stepCounter + ""));
        return result;
    }

    /**
     * {@inheritDoc}
     */
    public void setParameters(final List<KiemProperty> properties) {
        for (KiemProperty prop : properties) {
            if (prop.getKey().equals(ITERATION)) {
                iteration = Integer.parseInt(prop.getValue());
            }
        }
        stepCounter = 0;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject jSONObject)
            throws KiemExecutionException {
        stepCounter++;
        if (stepCounter == 2 && iteration == 2) {
            throw new KiemExecutionException("", false, null);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {

    }

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {

    }

    /**
     * {@inheritDoc}
     */
    public int wantsMoreRuns() {
        return MAX_ITERATION - iteration;
    }

    /**
     * {@inheritDoc}
     */
    public int wantsMoreSteps() {
        return MAX_STEP - stepCounter;
    }

    /**
     * {@inheritDoc}
     */
    public String[] getSupportedExtensions() {
        String[] result = { "strl", "kids" };
        return result;
    }
    // --------------------------------------------------------------------------

}
