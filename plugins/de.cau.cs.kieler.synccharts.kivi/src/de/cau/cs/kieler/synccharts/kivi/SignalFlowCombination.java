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
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

import de.cau.cs.kieler.core.kexpressions.Signal;
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.core.kivi.CombinationParameter;
import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.kivi.menu.KiviMenuContributionService;
import de.cau.cs.kieler.core.kivi.menu.ButtonTrigger.ButtonState;
import de.cau.cs.kieler.core.kivi.menu.KiviMenuContributionService.LocationScheme;
import de.cau.cs.kieler.core.kivi.menu.MenuItemEnableStateEffect;
import de.cau.cs.kieler.core.model.triggers.SelectionTrigger.SelectionState;
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

    /**
     * The preference key for the arrow color.
     */
    public static final String ARROW_COLOR = SignalFlowCombination.class.getCanonicalName()
            + ".arrowColor";

    private static final CombinationParameter[] PARAMETERS = new CombinationParameter[] {
        new CombinationParameter(
            ARROW_COLOR, getPreferenceStore(), "Arrow Color",
            "The color to paint the signal flow arrows in", ColorConstants.red.getRGB(),
            CombinationParameter.RGB_TYPE) };

    private static final int DEFAULT_LENGTH = 15;

    private static final String buttonId = "de.cau.cs.kieler.synccharts.kivi.signalflow";

    public SignalFlowCombination() {
        super();
        ImageDescriptor icon = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                "icons/signalflow.gif");
        String tooltip = "Show the Dual Model of the current SyncChart. "
                + "It shows the data communication from effects to triggers.";
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, buttonId, "Dual Model",
                tooltip, icon, SWT.CHECK, LocationScheme.MENU_POPUP_TOOLBAR, null, null, null,
                "de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorID");
    }

    /**
     * Execute the combination using the signal flow active state and the selection state.
     * 
     * @param button
     *            the signal flow active state
     * @param selection
     *            the selection state
     */
    public void execute(final ButtonState button, final SelectionState selection) {
        if (button.getButtonId().equals(buttonId)) {

            if (!button.isPushedIn()) {
                undoRecordedEffects(); // remove old arrows
                return;
            }

            if (!shouldExecute(button, selection)) {
                return; // keep arrows as-is, eg for exporting images
            }

            undoRecordedEffects(); // remove old arrows

            // remember which signals appear in which transition
            List<Pair<Signal, Transition>> triggers, effects;
            triggers = new ArrayList<Pair<Signal, Transition>>();
            effects = new ArrayList<Pair<Signal, Transition>>();

            // traverse over all EObjects
            EObject diagramElement = ((DiagramEditor) selection.getDiagramEditor()).getDiagram()
                    .getElement();
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
            for (Pair<Signal, Transition> effect : effects) {
                for (Pair<Signal, Transition> trigger : triggers) {
                    if (effect.getFirst() == trigger.getFirst()) {
                        // sort out irrelevant transitions if a transition was selected
                        if (isRelevant(selection.getSelectedEObjects(), effect.getSecond())
                                || isRelevant(selection.getSelectedEObjects(), trigger.getSecond())) {
                            schedule(new ArrowEffect(effect.getSecond(), trigger.getSecond(),
                                    getColor(), false));
                        }
                    }
                }
            }

            // haf: handle global inputs and outputs
            for (Pair<Signal, Transition> trigger : triggers) {
                if (trigger.getFirst().isIsInput()
                        && isRelevant(selection.getSelectedEObjects(), trigger.getSecond())) {
                    schedule(new PointerEffect(trigger.getSecond(), getColor(), DEFAULT_LENGTH,
                            true, PointerEffect.Direction.NORTH, false));
                }
            }
            for (Pair<Signal, Transition> effect : effects) {
                if (effect.getFirst().isIsOutput()
                        && isRelevant(selection.getSelectedEObjects(), effect.getSecond())) {
                    schedule(new PointerEffect(effect.getSecond(), getColor(), DEFAULT_LENGTH,
                            false, PointerEffect.Direction.SOUTH, false));
                }
            }
        }
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

    private boolean shouldExecute(final ButtonState button, final SelectionState selection) {
        if (button.getSequenceNumber() > selection.getSequenceNumber()) { // button was just pushed
            return true;
        }
        if (selection.getSelectedEObjects().size() == 1) {
            EObject selected = selection.getSelectedEObjects().get(0);
            if (selected.eContainer() == null) { // don't re-draw if the root region was selected
                return false;
            }
        }
        return true;
    }

    private static Color getColor() {
        return new Color(null, PreferenceConverter.getColor(getPreferenceStore(), ARROW_COLOR));
    }

    private static IPreferenceStore getPreferenceStore() {
        return Activator.getDefault().getPreferenceStore();
    }

    /**
     * Get the combination parameters for the signal flow combination.
     * 
     * @return the parameters
     */
    public static CombinationParameter[] getParameters() {
        return PARAMETERS;
    }

}
