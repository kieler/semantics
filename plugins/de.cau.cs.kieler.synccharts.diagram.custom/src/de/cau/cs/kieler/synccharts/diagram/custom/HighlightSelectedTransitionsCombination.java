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
package de.cau.cs.kieler.synccharts.diagram.custom;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.model.gmf.effects.HighlightEffect;
import de.cau.cs.kieler.core.model.triggers.SelectionTrigger.DiagramSelectionState;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * Highlight selected transitions in SyncCharts.
 * 
 * @author mmu
 * 
 */
public class HighlightSelectedTransitionsCombination extends AbstractCombination {

    /**
     * Execute the combination when a new selection state is available.
     * 
     * FIXME selecting a transition during simulation can mess up the original color of the
     * transition because two different highlight effects are working on the same object.
     * Essentially the second highlight effect takes the first highlight effect's highlight color as
     * original color.
     * 
     * @param selection
     *            the current selection
     */
    public void execute(final DiagramSelectionState selection) {
        undoRecordedEffects();
        if (selection.getDiagramEditor() instanceof SyncchartsDiagramEditor) {
            for (EObject selected : selection.getSelectedEObjects()) {
                if (selected instanceof Transition) {
                    HighlightEffect e = new HighlightEffect(selected, selection.getDiagramEditor(),
                            ColorConstants.blue, true);
                    e.setChangeWidth(false);
                    schedule(e);
                }
            }
        }

    }
}
