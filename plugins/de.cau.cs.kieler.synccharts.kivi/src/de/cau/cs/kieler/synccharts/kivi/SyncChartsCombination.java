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

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import de.cau.cs.kieler.core.kivi.CombinationParameter;
import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.model.gmf.effects.FocusContextEffect;
import de.cau.cs.kieler.core.model.gmf.effects.HighlightEffect;
import de.cau.cs.kieler.kiml.ui.KimlUiPlugin;
import de.cau.cs.kieler.kiml.ui.diagram.LayoutEffect;
import de.cau.cs.kieler.sim.kivi.StateActivityTrigger.ActiveStates;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * A combination that visualizes the simulation of a SyncChart.
 * 
 * @author mmu, cmot
 */
public class SyncChartsCombination extends AbstractCombination {

    /**
     * The preference key for the highlight color.
     */
    public static final String HIGHLIGHT_COLOR = SyncChartsCombination.class.getCanonicalName()
            + ".highlightColor";

    /**
     * The preference key for the highlight color.
     */
    public static final String ERROR_HIGHLIGHT_COLOR = SyncChartsCombination.class.getCanonicalName()
            + ".errorHighlightColor";

    /**
     * The preference key for the history color.
     */
    public static final String HISTORY_COLOR = SyncChartsCombination.class.getCanonicalName()
            + ".historyColor";

    /**
     * The preference key for the color of inactive states.
     */
    public static final String INACTIVE_COLOR = SyncChartsCombination.class.getCanonicalName()
            + ".inactiveColor";

    /**
     * The preference key for the background color of inactive states.
     */
    public static final String INACTIVE_BGCOLOR = SyncChartsCombination.class.getCanonicalName()
            + ".inactiveBGColor";

    /**
     * The preference key for the highlight background color.
     */
    public static final String HIGHLIGHT_BGCOLOR = SyncChartsCombination.class.getCanonicalName()
            + ".highlightBGColor";

    /**
     * The preference key for the history background color.
     */
    public static final String HISTORY_BGCOLOR = SyncChartsCombination.class.getCanonicalName()
            + ".historyBGColor";

    /**
     * The preference key for the black & white mode.
     */
    public static final String BW_MODE = SyncChartsCombination.class.getCanonicalName() + ".bwMode";

    /**
     * The preference key for the focus & context mode.
     */
    public static final String FC_MODE = SyncChartsCombination.class.getCanonicalName() + ".fcMode";

    /** parameter id for animation. */
    private static final String ANIMATE = "de.cau.cs.kieler.kiml.animate";
    /** parameter id for zoom to fit. */
    private static final String ZOOM_TO_FIT = "de.cau.cs.kieler.kiml.zoomToFit";
    /** parameter id for progress bar. */
    private static final String PROGRESS_BAR = "de.cau.cs.kieler.kiml.progressBar";
    
    /**
     * Creates a SyncCharts simulation combination. 
     */
    public SyncChartsCombination() {
        this.enableEffectRecording();
    }
    
    private static final CombinationParameter<?>[] PARAMETERS = new CombinationParameter[] {
        	new CombinationParameter<RGB>(ERROR_HIGHLIGHT_COLOR, getPreferenceStore(), "Error Highlight Color",
                "The color to use for highlighting erroneous states", new RGB(255, 0, 255)),
            new CombinationParameter<RGB>(HIGHLIGHT_COLOR, getPreferenceStore(), "Highlight Color",
                    "The color to use for highlighting active states", ColorConstants.red.getRGB()),
            new CombinationParameter<RGB>(HIGHLIGHT_BGCOLOR, getPreferenceStore(),
                    "Highlight Background Color",
                    "The background color to use for highlighting active states",
                    ColorConstants.white.getRGB()),
            new CombinationParameter<RGB>(HISTORY_COLOR, getPreferenceStore(), "History Color",
                    "The color to use for highlighting previously active states",
                    ColorConstants.blue.getRGB()),
            new CombinationParameter<RGB>(HISTORY_BGCOLOR, getPreferenceStore(),
                    "History Background Color",
                    "The background color to use for highlighting previously active states",
                    ColorConstants.white.getRGB()),
            new CombinationParameter<RGB>(INACTIVE_COLOR, getPreferenceStore(), "Inactive Color",
                    "The color to use for highlighting inactive states",
                    ColorConstants.gray.getRGB()),
            new CombinationParameter<RGB>(INACTIVE_BGCOLOR, getPreferenceStore(),
                    "Inactive Background Color",
                    "The background color to use for highlighting inactive states",
                    ColorConstants.white.getRGB()),
            new CombinationParameter<Boolean>(BW_MODE, getPreferenceStore(), "Black && White",
                    "Dashed lines for active states, dotted lines for history states.", false),
            new CombinationParameter<Boolean>(FC_MODE, getPreferenceStore(), "Focus && Context",
                    "Collapse inactive states, expand active/history states.", true)
    };

    /**
     * Execute this combination using the active states state.
     * 
     * @param activeStates
     *            the active states
     */
    public void execute(final ActiveStates activeStates) {
        // papyrus and synccharts share one trigger state
        if (!(activeStates.getDiagramEditor() instanceof SyncchartsDiagramEditor)) {
            return;
        }
        IPreferenceStore layoutPrefStore = KimlUiPlugin.getDefault().getPreferenceStore();
        boolean animate = layoutPrefStore.getBoolean(ANIMATE);
        boolean zoom = layoutPrefStore.getBoolean(ZOOM_TO_FIT);
        boolean progressBar = layoutPrefStore.getBoolean(PROGRESS_BAR);
        
        // reset all formerly painted states
        undoRecordedEffects();
        // if there are no active states, the simulation has finished.
        if ((activeStates.getActiveStates().isEmpty()
                || activeStates.getActiveStates().get(0).isEmpty()) && 
                (activeStates.getErrorStates().isEmpty()
                || activeStates.getErrorStates().get(0).isEmpty())) {
            // schedule layout effect to ensure that layout is triggered after simulation is
            //completed and all undos are executed
            this.schedule(new LayoutEffect(activeStates.getDiagramEditor(), null, zoom, progressBar,
                    false, animate));
            return;
        }

        // collapse / expand states as necessary and perform a new layout
        if (getPreferenceStore().getBoolean(FC_MODE)) {
            FocusContextEffect focusEffect = new FocusContextEffect(activeStates.getDiagramEditor());
            focusEffect.addFocus(activeStates.getHistoryStates(), 0);
            focusEffect.addFocus(activeStates.getErrorStates().get(0), 0);
            this.schedule(focusEffect);
            this.schedule(new LayoutEffect(activeStates.getDiagramEditor(), null, zoom, progressBar,
                    false, animate));
        }

        // coloring all states inactive/gray
        EObject root = activeStates.getDiagramEditor().getDiagram().getElement();
        for (Iterator<EObject> i = root.eAllContents(); i.hasNext();) {
            EObject current = i.next();
            if (current.eContainer() != root
                    && (current instanceof State || current instanceof Transition)) {
                HighlightEffect effect = new HighlightEffect(current,
                        activeStates.getDiagramEditor(), getColor(-1, -1), getBackgroundColor(-1,
                                -1), true);
                effect.setChangeWidth(false);
                schedule(effect);
            }
        }

        // highlight history states
        // these were most recently active i steps ago
        for (int i = 0; i < activeStates.getActiveStates().size(); i++) {
        	//Active states
            List<EObject> currentEObjectList = activeStates.getActiveStates().get(i);
            for (EObject eObject : currentEObjectList) {
                if (getPreferenceStore().getBoolean(BW_MODE) && i != 0) {
                    schedule(new HighlightEffect(eObject, activeStates.getDiagramEditor(), getColor(i,
                            activeStates.getActiveStates().size()), getBackgroundColor(i,
                            activeStates.getActiveStates().size()), SWT.LINE_DASH));
                } else {
                    schedule(new HighlightEffect(eObject, activeStates.getDiagramEditor(), getColor(i,
                            activeStates.getActiveStates().size()), getBackgroundColor(i,
                            activeStates.getActiveStates().size())));
                }
            }
            //Error states
            List<EObject> errorEObjectList = activeStates.getErrorStates().get(i);
            Color errorColor = new Color(null, PreferenceConverter.getColor(getPreferenceStore(), ERROR_HIGHLIGHT_COLOR));
            for (EObject eObject : errorEObjectList) {
                if (getPreferenceStore().getBoolean(BW_MODE) && i != 0) {
                    schedule(new HighlightEffect(eObject, activeStates.getDiagramEditor(), errorColor, getBackgroundColor(i, activeStates.getErrorStates().size()), SWT.LINE_DOT));
                } else {
                    schedule(new HighlightEffect(eObject, activeStates.getDiagramEditor(), errorColor, getBackgroundColor(i,
                            activeStates.getErrorStates().size())));
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
        if (step == -1) {
            return new Color(null, PreferenceConverter.getColor(getPreferenceStore(),
                    INACTIVE_COLOR));
        } else if (step == 0) {
            return new Color(null, PreferenceConverter.getColor(getPreferenceStore(),
                    HIGHLIGHT_COLOR));
        } else {
            // fade history color to inactive color
            float factor = ((float) step - 1.0f) / (float) steps;
            float[] inactive = PreferenceConverter.getColor(getPreferenceStore(), INACTIVE_COLOR)
                    .getHSB();
            float[] history = PreferenceConverter.getColor(getPreferenceStore(), HISTORY_COLOR)
                    .getHSB();
            float[] current = new float[] { history[0],
                    history[1] - (history[1] - inactive[1]) * factor,
                    history[2] - (history[2] - inactive[2]) * factor };
            return new Color(null, new RGB(current[0], current[1], current[2]));
        }
    }

    private Color getBackgroundColor(final int step, final int steps) {
        if (step == -1) {
            return new Color(null, PreferenceConverter.getColor(getPreferenceStore(),
                    INACTIVE_BGCOLOR));
        } else if (step == 0) {
            return new Color(null, PreferenceConverter.getColor(getPreferenceStore(),
                    HIGHLIGHT_BGCOLOR));
        } else {
            // fade history color to inactive color
            float factor = ((float) step - 1.0f) / (float) steps;
            float[] inactive = PreferenceConverter.getColor(getPreferenceStore(), INACTIVE_BGCOLOR)
                    .getHSB();
            float[] history = PreferenceConverter.getColor(getPreferenceStore(), HISTORY_BGCOLOR)
                    .getHSB();
            float[] current = new float[] { history[0],
                    history[1] - (history[1] - inactive[1]) * factor,
                    history[2] - (history[2] - inactive[2]) * factor };
            return new Color(null, new RGB(current[0], current[1], current[2]));
        }
    }
    
}
