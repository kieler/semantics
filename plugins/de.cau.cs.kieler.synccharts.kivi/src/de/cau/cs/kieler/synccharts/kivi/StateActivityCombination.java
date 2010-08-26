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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;

import de.cau.cs.kieler.kivi.core.IEffect;
import de.cau.cs.kieler.kivi.core.Viewmanagement;
import de.cau.cs.kieler.kivi.core.impl.AbstractCombination;

/**
 * A combination that visualizes the simulation of a SyncChart.
 * 
 * @author mmu
 * 
 */
public class StateActivityCombination extends AbstractCombination {

    private List<EditPart> activeStates;

    private Map<EditPart, IEffect> previousEffects = new HashMap<EditPart, IEffect>();

    @Override
    public void execute() {
        // compute diff
        List<EditPart> activatedStates = new ArrayList<EditPart>(activeStates);
        List<EditPart> deactivatedStates = new ArrayList<EditPart>();
        for (EditPart e : previousEffects.keySet()) {
            if (!activatedStates.remove(e)) {
                deactivatedStates.add(e);
            }
        }
        // undo effects for newly deactivated states
        for (EditPart e : deactivatedStates) {
            Viewmanagement.getInstance().undoEffect(previousEffects.remove(e));
        }
        // do effects for newly activated states
        for (EditPart e : activatedStates) {
            if (e instanceof GraphicalEditPart) {
                IEffect effect = new StateActivityHighlightEffect((GraphicalEditPart) e);
                previousEffects.put(e, effect);
                Viewmanagement.getInstance().executeEffect(effect);
            }
        }
    }

    /**
     * Receive events from StateActivityTriggers.
     * 
     * @param trigger
     *            the trigger
     * @return true
     */
    public boolean evaluate(final StateActivityTrigger trigger) {
        activeStates = trigger.getActiveStates();
        return true;
    }

}
