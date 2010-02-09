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
package de.cau.cs.kieler.sim.kiem.automated.ui;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

/**
 * Super class for all actions that have to do with skipping.
 * 
 * @author soh
 * @kieler.rating 2010-02-08 proposed yellow
 */
public abstract class SkipAction implements IViewActionDelegate {

    /**
     * {@inheritDoc}
     */
    public void init(final IViewPart view) {
    }

    /**
     * {@inheritDoc}
     */
    public void selectionChanged(final IAction action,
            final ISelection selection) {
    }

}
