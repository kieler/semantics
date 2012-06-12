/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.ui;

import org.eclipse.swt.widgets.ProgressBar;

import de.cau.cs.kieler.core.alg.BasicProgressMonitor;

/**
 * Progress monitor that reports progress to a progress bar.
 *
 * @author msp
 */
public class ProgressBarMonitor extends BasicProgressMonitor {
    
    /** the progress bar to which progress is reported. */
    private ProgressBar progressBar;
    
    /**
     * Creates a progress bar monitor.
     * 
     * @param theprogressBar the progress bar to which progress is reported
     */
    public ProgressBarMonitor(final ProgressBar theprogressBar) {
        this.progressBar = theprogressBar;
    }
    
    /**
     * Creates a progress bar monitor with given maximal number of hierarchy levels. Progress
     * is reported to parent monitors only up to the specified hierarchy level.
     * 
     * @param theprogressBar the progress bar to which progress is reported
     * @param maxLevels maximal number of hierarchy levels for which progress is reported
     */
    public ProgressBarMonitor(final ProgressBar theprogressBar, final int maxLevels) {
        super(maxLevels);
        this.progressBar = theprogressBar;
    }

    /**
     * Reports to the integrated progress bar that the current task begins.
     * 
     * @param name task name
     * @param totalWork total amount of work for the new task
     * @param topInstance if true, this progress monitor is the top instance
     * @param maxHierarchyLevels maximal number of reported hierarchy levels
     */
    @Override
    protected void doBegin(final String name, final float totalWork,
            final boolean topInstance, final int maxHierarchyLevels) {
        if (topInstance) {
            progressBar.setSelection(progressBar.getMinimum());
        }
    }

    /**
     * Creates a new instance of {@code ProgressBarMonitor}.
     * 
     * @param work amount of work that is completed in the current monitor
     *            instance when the sub-task ends
     * @param maxHierarchyLevels the maximal number of hierarchy levels for the parent
     *         progress monitor
     * @return a new progress monitor instance
     */
    @Override
    public BasicProgressMonitor doSubTask(final float work, final int maxHierarchyLevels) {
        if (maxHierarchyLevels > 0) {
            return new ProgressBarMonitor(progressBar, maxHierarchyLevels - 1);
        } else {
            return new ProgressBarMonitor(progressBar, maxHierarchyLevels);            
        }
    }

    /**
     * Reports to the integrated progress bar that some work was done, if this is the top instance.
     * 
     * @param completedWork total number of work that is done for this task
     * @param totalWork total number of work that is targeted for completion
     * @param topInstance if true, this progress monitor is the top instance
     */
    @Override
    protected void doWorked(final float completedWork, final float totalWork,
            final boolean topInstance) {
        if (topInstance) {
            int value = Math.round((progressBar.getMaximum() - progressBar.getMinimum())
                    * completedWork / totalWork);
            progressBar.setSelection(progressBar.getMinimum() + value);
        }
    }

}
