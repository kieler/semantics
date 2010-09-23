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
package de.cau.cs.kieler.uml2.kivi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.papyrus.diagram.statemachine.UmlStateMachineDiagramForMultiEditor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import de.cau.cs.kieler.core.kivi.CombinationParameter;
import de.cau.cs.kieler.core.kivi.IEffect;
import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.sim.kivi.StateActivityHighlightEffect;
import de.cau.cs.kieler.sim.kivi.StateActivityTrigger.ActiveStates;

/**
 * A combination that visualizes the simulation of a SyncChart.
 * 
 * @author mmu
 * 
 */
public class StateMachineCombination extends AbstractCombination {

    /**
     * The preference key for the highlight color.
     */
    public static final String HIGHLIGHT_COLOR = StateMachineCombination.class.getCanonicalName()
            + ".highlightColor";

    /**
     * The preference key for the history color.
     */
    public static final String HISTORY_COLOR = StateMachineCombination.class.getCanonicalName()
            + ".historyColor";

    private static final CombinationParameter[] PARAMETERS = new CombinationParameter[] {
            new CombinationParameter(HIGHLIGHT_COLOR, getPreferenceStore(), "Highlight Color",
                    "The color to use for highlighting active states", ColorConstants.red.getRGB(),
                    CombinationParameter.RGB_TYPE),
            new CombinationParameter(HISTORY_COLOR, getPreferenceStore(), "History Color",
                    "The color to use for highlighting previously active states",
                    ColorConstants.blue.getRGB(), CombinationParameter.RGB_TYPE) };

    private Map<EObject, StateActivityHighlightEffect> highlightEffects;
    
    /**
     * Default constructor.
     */
    public StateMachineCombination() {
        super();
        highlightEffects = new HashMap<EObject, StateActivityHighlightEffect>();
    }

    /**
     * Execute this combination using the active states state.
     * 
     * @param activeStates
     *            the active states
     */
    public void execute(final ActiveStates activeStates) {
        if (!(activeStates.getDiagramEditor() instanceof UmlStateMachineDiagramForMultiEditor)) {
            return;
        }
        // if there are no active states, the simulation has finished.
        // Undo every harm you have done before
        if (activeStates.getActiveStates().isEmpty()) {
            undo();
            return;
        }

        // assume every effect needs to be undone
        Map<EObject, IEffect> highlightsToUndo = new HashMap<EObject, IEffect>(highlightEffects);

        // these were most recently active i steps ago
        for (int i = 0; i < activeStates.getActiveStates().size(); i++) {
            List<EObject> currentStep = activeStates.getActiveStates().get(i);
            for (EObject e : currentStep) {
                // check if an effect exists for this edit part
                StateActivityHighlightEffect highlightEffect = highlightEffects.get(e);
                if (highlightEffect == null) {
                    // if not then create new one
                    highlightEffect = new StateActivityHighlightEffect(e,
                            activeStates.getDiagramEditor());
                    highlightEffects.put(e, highlightEffect);
                } else {
                    // if it does then don't undo it later
                    highlightsToUndo.remove(e);
                }
                // update its color instead of undo and create a new effect to avoid flashing
                highlightEffect.setColor(getColor(i, activeStates.getActiveStates().size()));
                highlightEffect.schedule();
            }
        }

        // undo any effect that was not found in the active states
        for (Map.Entry<EObject, IEffect> entry : highlightsToUndo.entrySet()) {
            entry.getValue().scheduleUndo();
            highlightEffects.remove(entry.getKey()); // forget about this effect
        }
    }

    /**
     * {@inheritDoc}
     */
    public void undo() {
        for (IEffect effect : highlightEffects.values()) {
            effect.scheduleUndo();
        }
        highlightEffects.clear();
    }

    /**
     * Get the parameters of this combination.
     * 
     * @return the parameters
     */
    public static CombinationParameter[] getParameters() {
        return PARAMETERS;
    }

    /**
     * Get the preference store used by this combination.
     * 
     * @return the preference store
     */
    public static IPreferenceStore getPreferenceStore() {
        return Activator.getDefault().getPreferenceStore();
    }

    private Color getColor(final int step, final int steps) {
        if (step == 0) {
            return new Color(null, PreferenceConverter.getColor(getPreferenceStore(),
                    HIGHLIGHT_COLOR));
        } else {
            float[] hsb = PreferenceConverter.getColor(getPreferenceStore(), HISTORY_COLOR)
                    .getHSB();
            return new Color(null, new RGB(hsb[0], hsb[1], hsb[2] - hsb[2] / steps * (step - 1)));
        }
    }
}
