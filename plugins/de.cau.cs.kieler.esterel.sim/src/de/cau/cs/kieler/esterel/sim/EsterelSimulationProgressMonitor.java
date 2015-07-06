/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.sim;

import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
 
import de.cau.cs.kieler.core.model.util.ProgressMonitorAdapter;

/**
 * A progress monitor for Esterel simulators.
 * 
 * @author cmot
 * @kieler.design 2015-06-30 proposed cmot
 * @kieler.rating 2015-06-30 proposed yellow
 * 
 */
// -----------------------------------------------------------------------------
// -----------------------------------------------------------------------------

public class EsterelSimulationProgressMonitor implements ProgressMonitor {

    /** The number of tasks. */
    static final int NUMBER_OF_TASKS = 10; 
    protected ProgressMonitorAdapter kielerProgressMonitor;
    protected int numberOfComponents = 1;
    protected int numberOfComponentsDone = 0;

    /**
     * Instantiates a new EsterelSimulationProgressMonitor with some number of subcomponents.
     * 
     * @param kielerProgressMonitorParam
     *            the kieler progress monitor param
     * @param numberOfComponentsParam
     *            the number of components param
     */
    public EsterelSimulationProgressMonitor(
            final ProgressMonitorAdapter kielerProgressMonitorParam,
            final int numberOfComponentsParam) {
        kielerProgressMonitor = kielerProgressMonitorParam;
        numberOfComponents = numberOfComponentsParam;
        numberOfComponentsDone = 0;
    }

    /**
     * {@inheritDoc}
     */
    public void beginTask(final String name, final int totalWork) {
        kielerProgressMonitor.begin(name, numberOfComponents);
    }

    /**
     * {@inheritDoc}
     */
    public void done() {
        // is called by the workflow wrapper
    }

    /**
     * {@inheritDoc}
     */
    public void finished(final Object element, final Object context) {
    }

    /**
     * {@inheritDoc}
     */
    public void internalWorked(final double work) {
    }

    /**
     * {@inheritDoc}
     */
    public boolean isCanceled() {
        return (kielerProgressMonitor.isCanceled());
    }

    /**
     * {@inheritDoc}
     */
    public void postTask(final Object element, final Object context) {
        kielerProgressMonitor.worked(numberOfComponentsDone);
        numberOfComponentsDone++;
    }

    /**
     * {@inheritDoc}
     */
    public void preTask(final Object element, final Object context) {
        kielerProgressMonitor.worked(numberOfComponentsDone);
    }

    /**
     * {@inheritDoc}
     */
    public void setCanceled(final boolean value) {
    }

    /**
     * {@inheritDoc}
     */
    public void setTaskName(final String name) {
    }

    /**
     * {@inheritDoc}
     */
    public void started(final Object element, final Object context) {
    }

    /**
     * {@inheritDoc}
     */
    public void subTask(final String name) {
        kielerProgressMonitor.subTask(UNKNOWN);
    }

    /**
     * {@inheritDoc}
     */
    public void worked(final int work) {
        kielerProgressMonitor.worked(work);
    }

}

