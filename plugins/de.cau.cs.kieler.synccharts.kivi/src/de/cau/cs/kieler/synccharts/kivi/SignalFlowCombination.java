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
import org.eclipse.jface.viewers.IStructuredSelection;

import de.cau.cs.kieler.core.expressions.Expression;
import de.cau.cs.kieler.core.expressions.Signal;
import de.cau.cs.kieler.core.expressions.ValuedObjectReference;
import de.cau.cs.kieler.kivi.core.IEffect;
import de.cau.cs.kieler.kivi.core.Viewmanagement;
import de.cau.cs.kieler.kivi.core.impl.AbstractCombination;
import de.cau.cs.kieler.kivi.examples.SelectionTrigger;
import de.cau.cs.kieler.synccharts.Effect;
import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * Started by the signal flow button, visualizes the flow of signals in a SyncChart diagram.
 * 
 * @author mmu
 * 
 */
public class SignalFlowCombination extends AbstractCombination {

    private boolean pushed;

    private IStructuredSelection selection;

    private SyncchartsDiagramEditor editor;

    private List<IEffect> iEffects = new ArrayList<IEffect>();

    @Override
    public void execute() {
        if (pushed) {
            // initializations
            List<SignalPair> triggers = new ArrayList<SignalPair>();
            List<SignalPair> effects = new ArrayList<SignalPair>();

            // inspect the current selection
            Object selected = selection.getFirstElement();
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
            List<?> connections = editor.getDiagramEditPart().getConnections();
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
                            triggers.add(new SignalPair((Signal) reference.getValuedObject(),
                                    editPart));
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
                                        triggers.add(new SignalPair((Signal) reference
                                                .getValuedObject(), editPart));
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
                            effects.add(new SignalPair(emission.getSignal(), editPart));
                        }
                    }
                }
            }

            // check all triggers against all effects for same signals
            List<IEffect> newEffects = new ArrayList<IEffect>();
            for (SignalPair effect : effects) {
                for (SignalPair trigger : triggers) {
                    if (effect.getSignal() == trigger.getSignal()) {
                        // sort out irrelevant transitions if a transition was selected
                        if (relevantLabel == null || effect.getEditPart() == relevantLabel
                                || trigger.getEditPart() == relevantLabel) {
                            IEffect iEffect = new ArrowEffect(effect.getEditPart(),
                                    trigger.getEditPart());
                            newEffects.add(iEffect);
                        }
                    }
                }
            }
            
            // remove all old arrows if this is an updated execution
            Viewmanagement.getInstance().undoEffect(iEffects);
            Viewmanagement.getInstance().executeEffect(newEffects);
            iEffects = newEffects;
        } else {
            // remove all arrows if the button is not pushed
            undo();
        }
    }

    /**
     * Listen to SignalFlowTriggers.
     * 
     * @param trigger
     *            the signal flow trigger
     * @return true
     */
    public boolean evaluate(final SignalFlowTrigger trigger) {
        pushed = trigger.isPushed();
        if (trigger.getSelection() instanceof IStructuredSelection) {
            selection = (IStructuredSelection) trigger.getSelection();
        }
        if (trigger.getEditor() instanceof SyncchartsDiagramEditor) {
            editor = (SyncchartsDiagramEditor) trigger.getEditor();
            return true;
        } else {
            return false;
        }
    }

    /**
     * Listen to selection changes to update the arrow forest.
     * 
     * @param trigger
     *            the selection trigger
     * @return true if something needs to be done
     */
    public boolean evaluate(final SelectionTrigger trigger) {
        if (pushed && trigger.getSelection() instanceof IStructuredSelection
                && trigger.getWorkbenchPart() instanceof SyncchartsDiagramEditor) {
            selection = (IStructuredSelection) trigger.getSelection();
            editor = (SyncchartsDiagramEditor) trigger.getWorkbenchPart();
            return true;
        } else {
            return false;
        }
    }

    /**
     * {@inheritDoc}
     */
    public void undo() {
        Viewmanagement.getInstance().undoEffect(iEffects);
        iEffects.clear();
    }
    
    /**
     * A simple pair to map signal to edit part.
     * 
     * @author mmu
     * 
     */
    public class SignalPair {

        /**
         * The signal.
         */
        private Signal signal;

        /**
         * The edit part.
         */
        private GraphicalEditPart editPart;

        /**
         * Create a new SignalPair.
         * 
         * @param s
         *            the signal
         * @param e
         *            the edit part
         */
        public SignalPair(final Signal s, final GraphicalEditPart e) {
            signal = s;
            editPart = e;
        }

        /**
         * Get the signal.
         * 
         * @return the signal
         */
        public Signal getSignal() {
            return signal;
        }

        /**
         * Get the edit part.
         * 
         * @return the edit part
         */
        public GraphicalEditPart getEditPart() {
            return editPart;
        }
    }

}
