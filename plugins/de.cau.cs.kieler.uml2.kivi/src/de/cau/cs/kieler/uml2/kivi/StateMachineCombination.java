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

import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.papyrus.diagram.statemachine.UmlStateMachineDiagramForMultiEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import de.cau.cs.kieler.core.kivi.CombinationParameter;
import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.model.gmf.effects.HighlightEffect;
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

    /**
     * The preference key for the black & white mode.
     */
    public static final String BW_MODE = StateMachineCombination.class.getCanonicalName()
            + ".bwMode";

    private static final CombinationParameter<?>[] PARAMETERS = new CombinationParameter[] {
            new CombinationParameter<RGB>(HIGHLIGHT_COLOR, getPreferenceStore(), "Highlight Color",
                    "The color to use for highlighting active states", ColorConstants.red.getRGB()),
            new CombinationParameter<RGB>(HISTORY_COLOR, getPreferenceStore(), "History Color",
                    "The color to use for highlighting previously active states",
                    ColorConstants.blue.getRGB()),
            new CombinationParameter<Boolean>(BW_MODE, getPreferenceStore(), "Black && White",
                    "Dashed lines for active states, dotted lines for history states.", false)
    };

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
        undoRecordedEffects();
        // if there are no active states, the simulation has finished.
        if (activeStates.getActiveStates().isEmpty()) {
            return;
        }

        // these were most recently active i steps ago
        for (int i = 0; i < activeStates.getActiveStates().size(); i++) {
            List<EObject> currentStep = activeStates.getActiveStates().get(i);
            for (EObject e : currentStep) {
                if (isBW()) {
                    schedule(new HighlightEffect(e, activeStates.getDiagramEditor(), getColor(i,
                            activeStates.getActiveStates().size()), (i == 0 ? SWT.LINE_DOT
                            : SWT.LINE_DASH)));
                } else {
                    schedule(new HighlightEffect(e, activeStates.getDiagramEditor(), getColor(i,
                            activeStates.getActiveStates().size())));
                }
            }
        }
    }

    /**
     * Get the parameters of this combination.
     * 
     * @return the parameters
     */
    public static CombinationParameter<?>[] getParameters() {
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

    private boolean isBW() {
        return getPreferenceStore().getBoolean(BW_MODE);
    }
}
