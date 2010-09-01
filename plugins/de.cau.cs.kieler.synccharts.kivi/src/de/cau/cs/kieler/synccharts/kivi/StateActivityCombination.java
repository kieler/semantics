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

import org.eclipse.draw2d.ColorConstants;
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

    private static final Color HIGHLIGHT_COLOR = ColorConstants.red;

    private List<List<EditPart>> activeStates;

    private Map<EditPart, StateActivityHighlightEffect> effects = new HashMap<EditPart, StateActivityHighlightEffect>();

    @Override
    public void execute() {
        if (activeStates == null) { // simulation finished
            undo();
            return;
        }
System.out.println(effects.size());
        Map<EditPart, IEffect> toUndo = new HashMap<EditPart, IEffect>(effects);

        for (EditPart e : activeStates.get(0)) {
            if (e instanceof GraphicalEditPart) {
                StateActivityHighlightEffect effect = effects.get(e);
                if (effect == null) {
                    effect = new StateActivityHighlightEffect((GraphicalEditPart) e);
                    effects.put(e, effect);
                } else {
                    toUndo.remove(e);
                }
                effect.setColor(HIGHLIGHT_COLOR);
                Viewmanagement.getInstance().executeEffect(effect);
            }
        }

        for (int i = 1; i < activeStates.size(); i++) {
            List<EditPart> currentStep = activeStates.get(i);
            for (EditPart e : currentStep) {
                if (e instanceof GraphicalEditPart) {
                    StateActivityHighlightEffect effect = effects.get(e);
                    if (effect == null) {
                        effect = new StateActivityHighlightEffect((GraphicalEditPart) e);
                        effects.put(e, effect);
                    } else {
                        toUndo.remove(e);
                    }
                    effect.setColor(historyColor(i, activeStates.size()));
                    Viewmanagement.getInstance().executeEffect(effect);
                }
            }
        }
        
        for (Map.Entry<EditPart, IEffect> entry : toUndo.entrySet()) {
            Viewmanagement.getInstance().undoEffect(entry.getValue());
            effects.remove(entry.getKey());
        }
System.out.println(effects.size());
    }

    /**
     * {@inheritDoc}
     */
    public void undo() {
        for (IEffect effect : effects.values()) {
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

    private static Color historyColor(int step, int steps) {
        return new Color(null, new RGB(240.0f, 1.0f, 1.0f - 1.0f / steps * (step - 1)));
    }

}
