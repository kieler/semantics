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
package de.cau.cs.kieler.synccharts.kivi;

import java.util.List;

import org.eclipse.gef.EditPart;

import de.cau.cs.kieler.kivi.core.Viewmanagement;
import de.cau.cs.kieler.kivi.core.impl.AbstractTrigger;

/**
 * A trigger notifying the view management about the active states during
 * simulation.
 * 
 * @author mmu
 * 
 */
public class StateActivityTrigger extends AbstractTrigger {

    private List<List<EditPart>> activeStates;

    private static StateActivityTrigger instance;

    /**
     * Default constructor.
     */
    public StateActivityTrigger() {
        instance = this;
    }

    private StateActivityTrigger(final List<List<EditPart>> aS) {
        activeStates = aS;
    }

    /**
     * Convenience method to get the current instance of this trigger.
     * 
     * @return instance of this trigger
     */
    public static StateActivityTrigger getInstance() {
        return instance;
    }

    /**
     * Give map of active states to the view management.
     * 
     * @param aS
     *            map of active states
     */
    public void step(final List<List<EditPart>> aS) {
        Viewmanagement.getInstance().trigger(new StateActivityTrigger(aS));
    }

    @Override
    public void register() {
    }

    @Override
    public void unregister() {
    }

    /**
     * Get the map of active states.
     * 
     * @return active states
     */
    public List<List<EditPart>> getActiveStates() {
        return activeStates;
    }

}
