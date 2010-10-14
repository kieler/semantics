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

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.kivi.triggers.EffectTrigger.EffectTriggerState;
import de.cau.cs.kieler.core.model.effects.CompartmentCollapseExpandEffect;
import de.cau.cs.kieler.kiml.ui.layout.LayoutEffect;

/**
 * Performs layout after a collapse or expand effect has been executed.
 * 
 * @author mmu
 * 
 */
public class LayoutAfterCollapseCombination extends AbstractCombination {

    /**
     * Listen to collapse/expand effects.
     * 
     * @param effectState
     *            the effect state containing the most recent collapse/expand effect
     */
    public void execute(final EffectTriggerState<CompartmentCollapseExpandEffect> effectState) {
        dontUndo();
        if (effectState.getEffect().hasJustExecuted()) {
            schedule(new LayoutEffect(effectState.getEffect().getTargetEditor(), effectState
                    .getEffect().getTargetNode()));
        }
    }
}
