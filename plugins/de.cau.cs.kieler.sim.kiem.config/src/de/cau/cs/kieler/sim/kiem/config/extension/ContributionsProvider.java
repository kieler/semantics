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

package de.cau.cs.kieler.sim.kiem.config.extension;

import org.eclipse.jface.action.ControlContribution;

import de.cau.cs.kieler.sim.kiem.IKiemToolbarContributor;
import de.cau.cs.kieler.sim.kiem.config.managers.ContributionManager;

/**
 * Provides two combo boxes for the toolbar in the Execution Manager.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public final class ContributionsProvider implements IKiemToolbarContributor {

    /**
     * {@inheritDoc}
     */
    public ControlContribution[] provideToolbarContributions(final Object info) {
        return ContributionManager.getInstance().getContributions();
    }
}
