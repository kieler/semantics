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

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.core.expressions.Expression;
import de.cau.cs.kieler.core.expressions.Signal;
import de.cau.cs.kieler.core.expressions.ValuedObjectReference;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.core.kivi.IEffect;
import de.cau.cs.kieler.core.kivi.KiVi;
import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.model.util.ModelingUtil;
import de.cau.cs.kieler.core.ui.listeners.SelectionTrigger.SelectionState;
import de.cau.cs.kieler.synccharts.Effect;
import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionLabelEditPart;
import de.cau.cs.kieler.synccharts.kivi.SignalFlowTrigger.SignalFlowActiveState;

/**
 * Started by the signal flow button, visualizes the flow of signals in a SyncChart diagram.
 * 
 * @author mmu
 * 
 */
public class SignalFlowCombination extends AbstractCombination {

    private List<IEffect> iEffects = new ArrayList<IEffect>();

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
            // initializations
            List<Pair<Signal, GraphicalEditPart>> triggers;
            triggers = new ArrayList<Pair<Signal, GraphicalEditPart>>();
            List<Pair<Signal, GraphicalEditPart>> effects;
            effects = new ArrayList<Pair<Signal, GraphicalEditPart>>();

            // inspect the current selection
            Object selected = null;
            if (selection.getSelectedEObjects().size() > 0) {
                selected = selection.getSelectedEObjects().get(0);
                // FIXME move to EObjects later
                selected = ModelingUtil.getEditPart(selection.getDiagramEditor()
                        .getDiagramEditPart(), (EObject) selected);
            }

            Signal relevantSignal = null;
            TransitionLabelEditPart relevantLabel = null;

            // check if a signal is selected at the top of a state
            // --> show all paths of this signal
            if (selected instanceof SignalEditPart) {
                relevantSignal = (Signal) ((View) ((SignalEditPart) selected).getModel())
                        .getElement();
                // check if a transition is selected
                // --> show all incoming and outgoing signals
            } else if (selected instanceof TransitionEditPart) {
                for (Object child : ((TransitionEditPart) selected).getChildren()) {
                    if (child instanceof TransitionLabelEditPart) {
                        relevantLabel = (TransitionLabelEditPart) child;
                        break;
                    }
                }
                // check if a transition is selected by its label
            } else if (selected instanceof TransitionLabelEditPart) {
                relevantLabel = (TransitionLabelEditPart) selected;
            }

            // traverse all connection edit parts to get all triggers and effects used in the
            // diagram along with their edit part
            List<?> connections = selection.getDiagramEditor().getDiagramEditPart()
                    .getConnections();
            for (Object o : connections) {
                ConnectionEditPart connection = (ConnectionEditPart) o;
                GraphicalEditPart editPart = null;

                // retrieve the label
                for (Object child : connection.getChildren()) {
                    if (child instanceof TransitionLabelEditPart) {
                        editPart = (GraphicalEditPart) child;
                        break;
                    }
                }
                if (editPart == null) {
                    continue; // transition has no label
                }
                // inspect all triggers
                Transition transition = (Transition) ((View) connection.getModel()).getElement();
                Expression expression = transition.getTrigger();
                // simple trigger
                if (expression instanceof ValuedObjectReference) {
                    ValuedObjectReference reference = (ValuedObjectReference) expression;
                    if (reference.getValuedObject() instanceof Signal) {
                        // sort out irrelevant signals if a signal was selected
                        if (relevantSignal == null || relevantSignal == reference.getValuedObject()) {
                            triggers.add(new Pair<Signal, GraphicalEditPart>((Signal) reference
                                    .getValuedObject(), editPart));
                        }
                    }
                } else {
                    // complex trigger or no trigger if null
                    if (expression != null) {
                        TreeIterator<EObject> iterator = expression.eAllContents();
                        while (iterator.hasNext()) {
                            EObject object = iterator.next();
                            if (object instanceof ValuedObjectReference) {
                                ValuedObjectReference reference = (ValuedObjectReference) object;
                                if (reference.getValuedObject() instanceof Signal) {
                                    // sort out irrelevant signals if a signal was selected
                                    if (relevantSignal == null
                                            || relevantSignal == reference.getValuedObject()) {
                                        triggers.add(new Pair<Signal, GraphicalEditPart>(
                                                (Signal) reference.getValuedObject(), editPart));
                                    }
                                }
                            }
                        }
                    }
                }

                // inspect all effects
                for (Effect effect : transition.getEffects()) {
                    if (effect instanceof Emission) {
                        Emission emission = (Emission) effect;
                        // sort out irrelevant signals if a signal was selected
                        if (relevantSignal == null || relevantSignal == emission.getSignal()) {
                            effects.add(new Pair<Signal, GraphicalEditPart>(emission.getSignal(),
                                    editPart));
                        }
                    }
                }
            }

            // check all triggers against all effects for same signals
            List<IEffect> newEffects = new ArrayList<IEffect>();
            for (Pair<Signal, GraphicalEditPart> effect : effects) {
                for (Pair<Signal, GraphicalEditPart> trigger : triggers) {
                    if (effect.getFirst() == trigger.getFirst()) {
                        // sort out irrelevant transitions if a transition was selected
                        if (relevantLabel == null || effect.getSecond() == relevantLabel
                                || trigger.getSecond() == relevantLabel) {
                            IEffect iEffect = new ArrowEffect(
                                    // effect.getSecond(), trigger.getSecond(), false);
                                    ((View) effect.getSecond().getModel()).getElement(),
                                    ((View) trigger.getSecond().getModel()).getElement(), false);
                            newEffects.add(iEffect);
                        }
                    }
                }
            }

            // remove all old arrows if this is an updated execution
            for (IEffect effect : iEffects) {
                effect.scheduleUndo();
            }
            iEffects = newEffects;
            for (IEffect effect : iEffects) {
                effect.schedule();
            }
        } else {
            // remove all arrows if the button is not pushed
            undo();
        }
    }

    /**
     * {@inheritDoc}
     */
    public void undo() {
        for (IEffect effect : iEffects) {
            effect.scheduleUndo();
        }
        iEffects.clear();
    }
}
