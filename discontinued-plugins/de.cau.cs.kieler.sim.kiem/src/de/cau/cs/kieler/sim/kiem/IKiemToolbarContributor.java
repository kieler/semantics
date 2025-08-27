/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ControlContribution;

/**
 * <p>
 * Classes implementing this interface may be asked if they want to contribute
 * controls to the toolbar inside the KIEM View.
 * </p>
 * <p>
 * The plugin will add the components from left to right in the order that the
 * contributors are stored in the extension registry. KIEM's own controls will
 * be added after the contributed components have been added.
 * </p>
 * 
 * @author soh
 * @kieler.rating 2010-02-03 proposed yellow
 */
public interface IKiemToolbarContributor {

    /**
     * <p>
     * The plugin will add the components from left to right in the order that
     * the contributors are stored in the extension registry. KIEM's own
     * controls will be added after the contributed components have been added.
     * </p>
     * <p>
     * The array should contain the components in the order that they are
     * supposed to be added, null values will be ignored.
     * </p>
     * 
     * @param info
     *            may hold some information.
     * @return the list of controls that should be contributed.
     */
    ControlContribution[] provideToolbarContributions(Object info);

    /**
     * <p>
     * The plugin will add the components from left to right in the order that
     * the contributors are stored in the extension registry. KIEM's own
     * controls will be added after the contributed components have been added.
     * </p>
     * <p>
     * The array should contain the components in the order that they are
     * supposed to be added, null values will be ignored.
     * </p>
     * 
     * @param info
     *            may hold some information.
     * @return the list of controls that should be contributed.
     */
    Action[] provideToolbarActions(Object info);
}
