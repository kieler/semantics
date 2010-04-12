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
package de.cau.cs.kieler.sim.kiem.automated.ui.ui;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

import de.cau.cs.kieler.sim.kiem.automated.execution.AutomationManager;
import de.cau.cs.kieler.sim.kiem.automated.ui.KiemAutoUIPlugin;

/**
 * This button is responsible for clearing the results view.
 * 
 * @author soh
 * @kieler.rating 2010-02-01 proposed yellow
 */
public class ClearViewAction implements IViewActionDelegate {

    /**
     * {@inheritDoc}
     */
    public void init(final IViewPart view) {
    }

    /**
     * {@inheritDoc}
     */
    public void run(final IAction action) {
        if (!AutomationManager.getInstance().isRunning()) {
            KiemAutoUIPlugin.getAutomatedEvalView().clear();
        }
    }

    /**
     * {@inheritDoc}
     */
    public void selectionChanged(final IAction action,
            final ISelection selection) {
    }

}
