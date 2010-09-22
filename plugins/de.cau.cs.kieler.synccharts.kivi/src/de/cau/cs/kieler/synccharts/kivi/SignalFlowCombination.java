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
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.core.expressions.Signal;
import de.cau.cs.kieler.core.expressions.ValuedObjectReference;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.core.kivi.IEffect;
import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.kivi.SelectionTrigger.SelectionState;
import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.kivi.SignalFlowTrigger.SignalFlowActiveState;

/**
 * Started by the signal flow button, visualizes the flow of signals in a SyncChart diagram.
 * Depending on the currently selected objects only signals concerning these objects are displayed.
 * 
 * @author mmu
 * 
 */
public class SignalFlowCombination extends AbstractCombination {

    private Map<Pair<Transition, Transition>, IEffect> iEffects = new HashMap<Pair<Transition, Transition>, IEffect>();

    private boolean lastActive = false;

    /**
     * Execute the combination using the signal flow active state and the selection state.
     * 
     * @param active
     *            the signal flow active state
     * @param selection
     *            the selection state
     */
    public void execute(final SignalFlowActiveState active, final SelectionState selection) {
        if (active.isActive()) {
            if (!shouldExecute(selection.getSelectedEObjects())) {
                return;
            }

            // remember which signals appear in which transition
            List<Pair<Signal, Transition>> triggers, effects;
            triggers = new ArrayList<Pair<Signal, Transition>>();
            effects = new ArrayList<Pair<Signal, Transition>>();

            // traverse over all EObjects
            EObject diagramElement = selection.getDiagramEditor().getDiagram().getElement();
            for (Iterator<EObject> iterator = diagramElement.eAllContents(); iterator.hasNext();) {
                EObject current = iterator.next();

                // triggers
                if (current instanceof ValuedObjectReference) {
                    ValuedObjectReference reference = (ValuedObjectReference) current;
                    if (reference.getValuedObject() instanceof Signal) {
                        Signal signal = (Signal) reference.getValuedObject();
                        Transition transition = getTransition(current);
                        if (transition != null
                                && isRelevant(selection.getSelectedEObjects(), signal)) {
                            triggers.add(new Pair<Signal, Transition>(signal, transition));
                        }
                    }
                } else if (current instanceof Emission) { // effects
                    Emission emission = (Emission) current;
                    Transition transition = getTransition(current);
                    if (transition != null
                            && isRelevant(selection.getSelectedEObjects(), emission.getSignal())) {
                        effects.add(new Pair<Signal, Transition>(emission.getSignal(), transition));
                    }
                }
            }

            // check all triggers against all effects for same signals
            Map<Pair<Transition, Transition>, IEffect> toUndo;
            toUndo = new HashMap<Pair<Transition, Transition>, IEffect>(iEffects);
            iEffects.clear();
            for (Pair<Signal, Transition> effect : effects) {
                for (Pair<Signal, Transition> trigger : triggers) {
                    if (effect.getFirst() == trigger.getFirst()) {
                        // sort out irrelevant transitions if a transition was selected
                        if (isRelevant(selection.getSelectedEObjects(), effect.getSecond())
                                || isRelevant(selection.getSelectedEObjects(), trigger.getSecond())) {
                            Pair<Transition, Transition> pair = new Pair<Transition, Transition>(
                                    effect.getSecond(), trigger.getSecond());
                            IEffect oldEffect = toUndo.remove(pair);
                            if (oldEffect == null) {
                                ArrowEffect iEffect = new ArrowEffect(effect.getSecond(),
                                        trigger.getSecond(), false);
                                iEffects.put(new Pair<Transition, Transition>(effect.getSecond(),
                                        trigger.getSecond()), iEffect);
                            } else {
                                iEffects.put(pair, oldEffect);
                            }
                        }
                    }
                }
            }

            // remove all old arrows if this is an updated execution
            for (IEffect effect : toUndo.values()) {
                effect.scheduleUndo();
            }
            for (IEffect effect : iEffects.values()) {
                effect.schedule();
            }
        } else {
            // remove all arrows if the button is not pushed
            undo();
        }
        lastActive = active.isActive();

    }

    /**
     * {@inheritDoc}
     */
    public void undo() {
        for (IEffect effect : iEffects.values()) {
            effect.scheduleUndo();
        }
        iEffects.clear();
    }

    /**
     * Get the first ancestor-or-self that is a transition.
     * 
     * @param object
     * @return a transition ancestor or null
     */
    private Transition getTransition(final EObject object) {
        if (object instanceof Transition) {
            return (Transition) object;
        } else if (object == null) {
            return null;
        } else {
            return getTransition(object.eContainer());
        }
    }

    private boolean isRelevant(final List<EObject> selection, final Signal signal) {
        for (EObject object : selection) {
            if (object instanceof Signal) {
                return selection.contains(signal); // only check for containment if list has signals
            }
        }
        return true;
    }

    private boolean isRelevant(final List<EObject> selection, final Transition transition) {
        for (EObject object : selection) {
            if (object instanceof Transition) {
                return selection.contains(transition);
            }
        }
        return true;
    }

    private boolean shouldExecute(final List<EObject> selection) {
        if (!lastActive) { // execute if button has just been pushed
            return true;
        }
        if (selection.size() == 1) {
            EObject selected = selection.get(0);
            if (selected.eContainer() == null) { // don't re-draw if the root region was selected
                return false;
            }
        }
        return true;
    }

}
