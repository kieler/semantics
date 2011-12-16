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
package de.cau.cs.kieler.core.model.xtend.m2m;

import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

import de.cau.cs.kieler.core.ui.KielerProgressMonitor;

/**
 * 
 * @author cmot
 * @author haf Copied from SyncChartsSimDataComponent. TODO: add documentation
 * 
 */
public class M2MProgressMonitor implements ProgressMonitor {

    private KielerProgressMonitor kielerProgressMonitor;
    private int numberOfComponents = 1;
    private int numberOfComponentsDone = 0;

    /**
     * 
     * Creates a new M2MProgressMonitor.
     * 
     * @param kielerProgressMonitorParam
     *            the monitor
     * @param numberOfComponentsParam
     *            the number of components
     */
    public M2MProgressMonitor(
            final KielerProgressMonitor kielerProgressMonitorParam,
            final int numberOfComponentsParam) {
        kielerProgressMonitor = kielerProgressMonitorParam;
        numberOfComponents = numberOfComponentsParam;
        numberOfComponentsDone = 0;
    }

    /**
     * 
     * {@inheritDoc}
     */
    public void beginTask(final String name, final int totalWork) {
        kielerProgressMonitor.begin(name, numberOfComponents);
    }

    /**
     * 
     * {@inheritDoc}
     */
    public void done() {
        // is called by the workflow wrapper
    }

    /**
     * 
     * {@inheritDoc}
     */
    public void finished(final Object element, final Object context) {
    }

    /**
     * 
     * {@inheritDoc}
     */
    public void internalWorked(final double work) {
    }

    /**
     * 
     * {@inheritDoc}
     */
    public boolean isCanceled() {
        return (kielerProgressMonitor.isCanceled());
    }

    /**
     * 
     * {@inheritDoc}
     */
    public void postTask(final Object element, final Object context) {
        kielerProgressMonitor.worked(numberOfComponentsDone);
        numberOfComponentsDone++;
    }

    /**
     * 
     * {@inheritDoc}
     */
    public void preTask(final Object element, final Object context) {
        // kielerProgressMonitor.begin(element.toString(), 1);
        kielerProgressMonitor.worked(numberOfComponentsDone);
    }

    /**
     * 
     * {@inheritDoc}
     */
    public void setCanceled(final boolean value) {
    }

    /**
     * 
     * {@inheritDoc}
     */
    public void setTaskName(final String name) {
    }

    /**
     * 
     * {@inheritDoc}
     */
    public void started(final Object element, final Object context) {
    }

    /**
     * 
     * {@inheritDoc}
     */
    public void subTask(final String name) {
        kielerProgressMonitor.subTask(UNKNOWN);
    }

    /**
     * 
     * {@inheritDoc}
     */
    public void worked(final int work) {
        kielerProgressMonitor.worked(work);
    }

}
