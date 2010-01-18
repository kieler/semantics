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
 * Classes implementing this interface may be asked if they want
 * to contribute controls to the toolbar inside the KIEM View.
 * <BR><BR>
 * The plugin will add the components from left to right in the order
 * that the contributors are stored in the extension registry. KIEM's 
 * own controls will be added after the contributed components have
 * been added.
 * <BR><BR>
 * @author soh
 *
 */
public interface IKiemToolbarContributor {

    /**
     * The plugin will add the components from left to right in the order
     * that the contributors are stored in the extension registry. KIEM's 
     * own controls will be added after the contributed components have
     * been added.
     * <BR><BR>
     * The array should contain the components in the order that they
     * are supposed to be added, null values will be ignored.
     * <BR><BR>
     * @param info may hold some information.
     * @return the list of controls that should be contributed.
     */
    ControlContribution[] provideToolbarContributions(Object info);
}
