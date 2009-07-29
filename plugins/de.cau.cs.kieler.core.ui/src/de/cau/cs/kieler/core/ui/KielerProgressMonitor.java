/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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
package de.cau.cs.kieler.core.ui;

import org.eclipse.core.runtime.IProgressMonitor;

import de.cau.cs.kieler.core.alg.BasicProgressMonitor;


/**
 * Wrapper class for Eclipse progress monitors.
 * 
 * @author <a href="mailto:msp@informatik.uni-kiel.de">Miro Sp&ouml;nemann</a>
 */
public class KielerProgressMonitor extends BasicProgressMonitor {

	/** the Eclipse progress monitor used by this monitor */
	private IProgressMonitor progressMonitor;
	/** the number of work units that were already submitted */
	private int submittedWork = 0;

	/**
	 * Creates a progress monitor wrapper for a given Eclipse progress
	 * monitor.
	 * 
	 * @param progressMonitor the progress monitor
	 */
	public KielerProgressMonitor(IProgressMonitor progressMonitor) {
		this.progressMonitor = progressMonitor;
	}
	
	/**
	 * Reports to the integrated Eclipse progress monitor that the current
	 * task begins.
	 * 
     * @param name task name
     * @param totalWork total amount of work for the new task
     * @param topInstance if true, this progress monitor is the top instance
	 */
	protected void doBegin(String name, int totalWork, boolean topInstance) {
        if (topInstance)
			progressMonitor.beginTask(name, totalWork <= 0
					? IProgressMonitor.UNKNOWN : totalWork);
		else
			progressMonitor.subTask(name);
	}

	/**
	 * Reports to the integrated Eclipse progress monitor that the main task
	 * is done, if this is the top instance.
     * 
     * @param topInstance if true, this progress monitor is the top instance
	 */
	protected void doDone(boolean topInstance) {
		if (topInstance)
			progressMonitor.done();
	}
	
	/**
	 * Returns true if the integrated Eclipse progress monitor reports
	 * cancellation.
	 * 
	 * @return true if the user has requested to cancel the operation
	 */
	public boolean isCanceled() {
	    return progressMonitor.isCanceled();
	}

	/**
	 * Creates a new instance of {@code KielerProgressMonitor}.
     * 
     * @param work amount of work that is completed in the current monitor
     *     instance when the sub-task ends
     * @return a new progress monitor instance
	 */
	public BasicProgressMonitor doSubTask(int work) {
		return new KielerProgressMonitor(progressMonitor);
	}

	/**
	 * Reports to the integrated Eclipse progress monitor that some
	 * work was done, if this is the top instance.
     * 
     * @param work amount of work that has just been done
     * @param completedWork total number of work that is done for this task
     * @param topInstance if true, this progress monitor is the top instance
	 */
	protected void doWorked(float work, float completedWork,
	        boolean topInstance) {
		if (topInstance) {
			int newWork = (int)completedWork;
			if (newWork > submittedWork) {
				progressMonitor.worked(newWork - submittedWork);
				submittedWork = newWork;
			}
		}
	}

}
