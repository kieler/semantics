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
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

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

    private List<List<EditPart>> activeStates;

    private List<IEffect> effects = new ArrayList<IEffect>();

    @Override
    public void execute() {
        if (activeStates == null) { // simulation finished
            undo();
            return;
        }

        // TODO avoid undo/redo for effects that do not change anything
        for (IEffect effect : effects) {
            Viewmanagement.getInstance().undoEffect(effect);
        }
        effects.clear();

        for (int i = 0; i < activeStates.size(); i++) {
            List<EditPart> currentStep = activeStates.get(i);
            for (EditPart e : currentStep) {
                if (e instanceof GraphicalEditPart) {
                    IEffect effect = new StateActivityHighlightEffect((GraphicalEditPart) e,
                            new Color(null, new RGB(0.0f, 1.0f, 1.0f - 1.0f / activeStates.size()
                                    * i)));
                    effects.add(effect);
                    Viewmanagement.getInstance().executeEffect(effect);
                }
            }
        }

    }

    /**
     * {@inheritDoc}
     */
    public void undo() {
        for (IEffect effect : effects) {
            Viewmanagement.getInstance().undoEffect(effect);
        }
        effects.clear();
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
