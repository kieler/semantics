/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.gmf.combinations;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.kivi.CombinationParameter;
import de.cau.cs.kieler.core.model.CoreModelPlugin;
import de.cau.cs.kieler.core.model.gmf.effects.HighlightEffect;
import de.cau.cs.kieler.core.model.gmf.triggers.DiffStateTrigger.DiffStates;

/**
 * 
 * 
 * @author Sebastian Schäfer - ssc AT informatik.uni-kiel.de
 * @kieler.rating 2011-12-07 red
 */
public class DiffStateCombination extends AbstractCombination {
    /** The preference key for the highlight color for the "new states". */
    public static final String IS_COLOR = DiffStateCombination.class.getCanonicalName() + "isColor";
    
    /** The preference key for the highlight color for the "original states". */
    public static final String SHALL_COLOR = DiffStateCombination.class.getCanonicalName()
            + "shallColor";
    
    /** Properties this combination offers to the user. */
    private static final CombinationParameter<?>[] PARAMETERS = new CombinationParameter[] {
        new CombinationParameter<RGB>(IS_COLOR, getPreferenceStore(), "Is states color",
                "The color to use for (erroneous) \"new\" states in a simulation",
                ColorConstants.red.getRGB()),
        new CombinationParameter<RGB>(SHALL_COLOR, getPreferenceStore(), "Shall states color",
                "The color to use for \"original\" states in a simulation recording",
                ColorConstants.yellow.getRGB()) };
    
    /**
     * Creates a SyncCharts simulation combination.
     */
    public DiffStateCombination() {
        this.enableEffectRecording();
    }
    
    /**
     * Get the preference store used by this combination.
     * 
     * @return the preference store
     */
    private static IPreferenceStore getPreferenceStore() {
        return CoreModelPlugin.getDefault().getPreferenceStore();
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
     * Execute this combination using the original and new states.
     * 
     * @param errorStates
     *            the original and new states
     */
    public void execute(final DiffStates errorStates) {
        Color isColor = new Color(null, PreferenceConverter.getColor(getPreferenceStore(),
                IS_COLOR));
        Color shallColor = new Color(null, PreferenceConverter.getColor(getPreferenceStore(),
                SHALL_COLOR));
        
        // Undo previous colorizations
        undoRecordedEffects();
        
        /*
         * This code depends on Kiml. Introducing such a dependency into the core seems like
         * a bad idea. Therefore, we do not make 100% sure, that the layout is triggered.
         * In a perfect world, it should suffice to just call undoRecordedEffects() like above.
         * 
        if(errorStates.getIsStates().isEmpty() || errorStates.getShallStates().isEmpty()) {
            // ensure that layout is triggered and all previous effects are undone
            this.schedule(new LayoutEffect(errorStates.getDiagramEditor(), null, zoom, progressBar,
                    false, animate));
            return;
        }*/
        
        // colorize all "is" states
        for (EObject obj : errorStates.getIsStates()) {
            schedule(new HighlightEffect(obj, errorStates.getDiagramEditor(), isColor));
        }
        
        // colorize all "shall" states
        for (EObject obj : errorStates.getShallStates()) {
            schedule(new HighlightEffect(obj, errorStates.getDiagramEditor(), shallColor));
        }
    }
}
