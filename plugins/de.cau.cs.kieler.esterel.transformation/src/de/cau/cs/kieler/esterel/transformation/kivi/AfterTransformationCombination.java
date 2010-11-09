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
package de.cau.cs.kieler.esterel.transformation.kivi;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.esterel.transformation.kivi.AfterTransformationTrigger.TransformingState;
import de.cau.cs.kieler.kiml.ui.layout.LayoutEffect;

/**
 * @author uru
 * 
 */
public class AfterTransformationCombination extends AbstractCombination {
    /**
     * Execute autolayout.
     * 
     * @param trigger
     *            corresponding trigger
     */
    public void execute(final TransformingState trigger) {
        // System.out.println("Combination running!!");
        LayoutEffect effect = new LayoutEffect(trigger.getDiagramEditor(), trigger.getRootState());
        schedule(effect);
    }
}
