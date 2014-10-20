/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;

/**
 * A special sub progress monitor that is able to handle 0% - 100% of work done during a
 * transformation.
 * 
 * @author cmot
 * @kieler.design 2014-07-08 proposed
 * @kieler.rating 2014-07-08 proposed yellow
 */
public class KielerCompilerProgressMonitor extends SubProgressMonitor {

    /** The work done. */
    int workDone = 0;

    // -------------------------------------------------------------------------

    /**
     * @param monitor
     * @param ticks
     */
    public KielerCompilerProgressMonitor(IProgressMonitor monitor, int ticks) {
        super(monitor, ticks);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the percent done.
     *
     * @return the percent done
     */
    public int getPercentDone() {
        return workDone;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the percent done between 0 and 100.
     *
     * @param percent the new percent done
     */
    public void setPercentDone(int percent) {
        if (percent > 100) {
            percent = 100;
        }
        if (percent > workDone) {
            int diff = percent - workDone;
            super.getWrappedProgressMonitor().worked(diff);
            workDone = percent;
        }
    }

    // -------------------------------------------------------------------------

}
