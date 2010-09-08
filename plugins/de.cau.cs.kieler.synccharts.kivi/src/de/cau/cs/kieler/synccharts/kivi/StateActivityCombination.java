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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import de.cau.cs.kieler.kivi.KiViPlugin;
import de.cau.cs.kieler.kivi.core.CombinationParameter;
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

    private static final CombinationParameter[] PARAMETERS = new CombinationParameter[] {
            new CombinationParameter("highlightColor", "float", "0.0"),
            new CombinationParameter("historyColor", "float", "240.0") };

    private List<List<EditPart>> activeStates;

    private Map<EditPart, StateActivityHighlightEffect> effects = new HashMap<EditPart, StateActivityHighlightEffect>();

    @Override
    public void execute() {
        if (activeStates == null) { // simulation finished
            undo();
            return;
        }

        // assume every effect needs to be undone
        Map<EditPart, IEffect> toUndo = new HashMap<EditPart, IEffect>(effects);

        // these were last active i steps ago
        for (int i = 0; i < activeStates.size(); i++) {
            List<EditPart> currentStep = activeStates.get(i);
            for (EditPart e : currentStep) {
                if (e instanceof GraphicalEditPart) {
                    // check if an effect exists for this edit part
                    StateActivityHighlightEffect effect = effects.get(e);
                    if (effect == null) {
                        // if not then create new one
                        effect = new StateActivityHighlightEffect((GraphicalEditPart) e);
                        effects.put(e, effect);
                    } else {
                        // if it does then don't undo it later
                        toUndo.remove(e);
                    }
                    // update its color instead of undo and create a new effect to avoid flashing
                    effect.setColor(getColor(i, activeStates.size()));
                    Viewmanagement.getInstance().executeEffect(effect);
                }
            }
        }

        // undo any effect that was not found in the active states
        for (Map.Entry<EditPart, IEffect> entry : toUndo.entrySet()) {
            Viewmanagement.getInstance().undoEffect(entry.getValue());
            effects.remove(entry.getKey());
        }
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

    /**
     * Get the parameters of this combination.
     * 
     * @return the parameters
     */
    public static CombinationParameter[] getParameters() {
        return PARAMETERS;
    }

    private Color getColor(final int step, final int steps) {
        if (step == 0) {
            return new Color(null, new RGB(Float.parseFloat(KiViPlugin.getDefault()
                    .getPreferenceStore()
                    .getString(getClass().getCanonicalName() + ".highlightColor")), 1.0f, 1.0f));
        } else {
            // a shade of blue
            return new Color(null, new RGB(Float.parseFloat(KiViPlugin.getDefault()
                    .getPreferenceStore()
                    .getString(getClass().getCanonicalName() + ".historyColor")), 1.0f, 1.0f - 1.0f
                    / steps * (step - 1)));
        }
    }
}
