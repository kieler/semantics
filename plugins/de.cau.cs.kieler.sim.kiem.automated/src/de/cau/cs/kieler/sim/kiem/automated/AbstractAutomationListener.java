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
package de.cau.cs.kieler.sim.kiem.automated;

import java.util.List;

import org.eclipse.core.runtime.IPath;

import de.cau.cs.kieler.sim.kiem.automated.data.AbstractResult;
import de.cau.cs.kieler.sim.kiem.automated.data.IterationResult;

/**
 * Abstract implementation of the automation listener.
 * 
 * @author soh
 */
public abstract class AbstractAutomationListener implements IAutomationListener {

    /**
     * {@inheritDoc}
     */
    public void doPostAutomationProcessing() {
    }

    /**
     * {@inheritDoc}
     */
    public void doPreAutomationProcessing() {
    }

    /**
     * {@inheritDoc}
     */
    public void receiveModelFileResults(final IPath executionFile,
            final List<AbstractResult> results) {
    }

    /**
     * {@inheritDoc}
     */
    public void executionFileStarted(final IPath executionFile,
            final Exception exception) {
    }

    /**
     * {@inheritDoc}
     */
    public void receiveIterationResult(final IterationResult result) {
    }

    /**
     * {@inheritDoc}
     */
    public void receiveIterationResult(final List<IterationResult> results) {
    }

    /**
     * {@inheritDoc}
     */
    public void refresh() {
    }

}
