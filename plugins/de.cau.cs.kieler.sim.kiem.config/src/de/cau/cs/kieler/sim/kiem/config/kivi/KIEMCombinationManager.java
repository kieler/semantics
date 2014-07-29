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
package de.cau.cs.kieler.sim.kiem.config.kivi;

import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPartReference;

import de.cau.cs.kieler.core.model.adapter.GlobalPartAdapter;

/**
 * Observes all parts and triggers execution of combination. 
 * <p>
 * Replaces KiVi plugin behavior
 * 
 * @author als
 * @kieler.design 2014-07-29 proposed
 * @kieler.rating 2014-07-29 proposed yellow
 * 
 */
public class KIEMCombinationManager implements IStartup, IPartListener2 {

    /** Global Listener Adapter. */
    private GlobalPartAdapter adapter;
    private KIEMExecutionAutoloadCombination autoload;
    private KIEMModelSelectionCombination selection;

    // -- STARTUP
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void earlyStartup() {
        autoload = new KIEMExecutionAutoloadCombination();
        selection = new KIEMModelSelectionCombination();
        adapter = new GlobalPartAdapter(this, true);        
    }

    // -- LISTENER
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void partActivated(IWorkbenchPartReference partRef) {
        selection.execute(partRef);
        autoload.execute(partRef);
    }

    /**
     * {@inheritDoc}
     */
    public void partBroughtToTop(IWorkbenchPartReference partRef) {
    }

    /**
     * {@inheritDoc}
     */
    public void partClosed(IWorkbenchPartReference partRef) {
    }

    /**
     * {@inheritDoc}
     */
    public void partDeactivated(IWorkbenchPartReference partRef) {
    }

    /**
     * {@inheritDoc}
     */
    public void partOpened(IWorkbenchPartReference partRef) {
    }

    /**
     * {@inheritDoc}
     */
    public void partHidden(IWorkbenchPartReference partRef) {
    }

    /**
     * {@inheritDoc}
     */
    public void partVisible(IWorkbenchPartReference partRef) {
    }

    /**
     * {@inheritDoc}
     */
    public void partInputChanged(IWorkbenchPartReference partRef) {
    }

}
