/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem.extension;

import org.eclipse.jface.action.ControlContribution;

/**
 * Classes implementing this interface may be asked to contribute
 * to the toolbar in the KIEM view.
 * 
 * @author soh
 *
 */
public interface IKiemToolbarContributor {

    /**
     * Asks the class to give a list of control contributions
     * for the toolbar.
     * 
     * @param info may hold some information, usually null
     * @return the list of controls that should be contributed.
     */
    ControlContribution[] provideToolbarContributions(Object info);
}
