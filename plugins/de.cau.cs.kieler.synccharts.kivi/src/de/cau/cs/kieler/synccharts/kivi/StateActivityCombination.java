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
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import de.cau.cs.kieler.core.kivi.IEffect;
import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.kivi.StateActivityTrigger.ActiveStates;
import de.cau.cs.kieler.core.model.util.ModelingUtil;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.kiml.gmf.CompartmentCollapseExpandEffect;

/**
 * A combination that visualizes the simulation of a SyncChart.
 * 
 * @author mmu
 * 
 */
public class StateActivityCombination extends AbstractCombination {

    public static final String HIGHLIGHT_COLOR = StateActivityCombination.class.getCanonicalName()
            + ".highlightColor";

    private Map<EObject, StateActivityHighlightEffect> highlightEffects = new HashMap<EObject, StateActivityHighlightEffect>();
    private Map<EObject, CompartmentCollapseExpandEffect> collapseEffects = new HashMap<EObject, CompartmentCollapseExpandEffect>();

    /**
     * Execute this combination using the active states state.
     * 
     * @param activeStates
     *            the active states
     */
    public void execute(final ActiveStates activeStates) {
        // if there are no active states, the simulation has finished.
        // Undo every harm you have done before
        if (activeStates.getActiveStates().isEmpty()) {
            undo();
            return;
        }

        // initially collapse all states
        if (collapseEffects.size() == 0) {
            init(activeStates.getDiagramEditor());
        }

        // assume every effect needs to be undone
        Map<EObject, IEffect> highlightsToUndo = new HashMap<EObject, IEffect>(highlightEffects);
        Map<EObject, CompartmentCollapseExpandEffect> collapsesToUndo;
        collapsesToUndo = new HashMap<EObject, CompartmentCollapseExpandEffect>(collapseEffects);

        // these were most recently active i steps ago
        for (int i = 0; i < activeStates.getActiveStates().size(); i++) {
            List<EObject> currentStep = activeStates.getActiveStates().get(i);
            for (EObject e : currentStep) {
                // check if an effect exists for this edit part
                StateActivityHighlightEffect highlightEffect = highlightEffects.get(e);
                CompartmentCollapseExpandEffect collapseEffect = collapseEffects.get(e);
                if (highlightEffect == null) {
                    // if not then create new one
                    highlightEffect = new StateActivityHighlightEffect(e,
                            activeStates.getDiagramEditor());
                    highlightEffects.put(e, highlightEffect);
                } else {
                    // if it does then don't undo it later
                    highlightsToUndo.remove(e);
                }
                // there is a collapse effect for every state, no need to create on demand
                if (collapseEffect != null) {
                    collapsesToUndo.remove(e); // don't collapse this later
                    collapseEffect.setCollapsed(false); // expand it instead
                    collapseEffect.schedule();
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
        for (CompartmentCollapseExpandEffect effect : collapsesToUndo.values()) {
            effect.setCollapsed(true);
            effect.schedule();
        }
    }

    /**
     * Create collapse effects for all macro states (not for simple ones).
     * 
     * @throws KielerModelException
     */
    private void init(final DiagramEditor editor) {
        Collection<EObject> states = ModelingUtil.getAllByType(
                SyncchartsPackage.eINSTANCE.getState(), editor.getDiagramEditPart());
        for (EObject state : states) {
            // remove the root State because it represents the whole SM and will not be active
            if (state.eContainer() == null || state.eContainer().eContainer() == null) {
                continue;
            } else if (((State) state).getRegions().size() != 0) { // only collapse macrostates
                CompartmentCollapseExpandEffect collapseEffect = new CompartmentCollapseExpandEffect(
                        editor, state, SyncchartsPackage.eINSTANCE.getState_Regions(), 1, true,
                        true);
                collapseEffect.schedule();
                collapseEffects.put(state, collapseEffect);
            }
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
        for (IEffect effect : collapseEffects.values()) {
            effect.scheduleUndo();
        }
        collapseEffects.clear();
    }

    /**
     * Get the parameters of this combination.
     * 
     * @return the parameters
     */
    public static List<Pair<String, Class<?>>> getParameters() {
        // TODO refactor with constants etc
        List<Pair<String, Class<?>>> list = new ArrayList<Pair<String, Class<?>>>();
        list.add(new Pair<String, Class<?>>(HIGHLIGHT_COLOR, RGB.class));
        return list;
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
            return new Color(null, new RGB(0.0f, 1.0f, 1.0f));
        } else {
            // a shade of blue
            return new Color(null, new RGB(240.0f, 1.0f, 1.0f - 1.0f / steps * (step - 1)));
        }
    }

}
