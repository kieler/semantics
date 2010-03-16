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

import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.automated.AbstractAutomatedProducer;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * This class is just for testing the automated execution feature. No real need
 * to review it.
 * 
 * @author soh
 * @kieler.rating 2010-01-29 red
 */
public class AutoTestComponent extends AbstractAutomatedProducer {

    private static final double RND_VALID = 0.2;

    /** The number of iterations this component wants to execute. */
    private int maxIteration;

    /** The number of steps this component wants to execute. */
    private int maxStep;

    /** The index of the current iteration. */
    private int iteration = 0;

    /** The step counter. */
    private int stepCounter = 0;

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public List<KiemProperty> produceInformation() {
        List<KiemProperty> result = new LinkedList<KiemProperty>();
        boolean valid = Math.random() > RND_VALID
                && !(stepCounter == (2 * 2) && iteration == 2);
        result.add(new KiemProperty("valid", valid));
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameters(final List<KiemProperty> properties) {
        for (KiemProperty prop : properties) {
            if (prop.getKey().equals(ITERATION)) {
                iteration = Integer.parseInt(prop.getValue());
            }
        }
        maxIteration = (int) (Math.random() * 2 * 2) + 2;
        maxStep = (int) (Math.random() * 2 * 2 * 2 + 2 + 2 + 2);
        stepCounter = 0;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject jSONObject)
            throws KiemExecutionException {
        stepCounter++;
        if (stepCounter == (2 * 2) && iteration == 2) {
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
    @Override
    public int wantsMoreRuns() {
        return maxIteration - iteration;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int wantsMoreSteps() {
        return maxStep - stepCounter;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getSupportedExtensions() {
        String[] result = { "strl", "kids", "kasm" };
        return result;
    }
    // --------------------------------------------------------------------------

}
