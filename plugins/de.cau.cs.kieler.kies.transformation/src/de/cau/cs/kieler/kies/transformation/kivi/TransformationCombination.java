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
package de.cau.cs.kieler.kies.transformation.kivi;

import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.kivi.triggers.EffectTrigger.EffectTriggerState;
import de.cau.cs.kieler.kies.transformation.kivi.TransformationTrigger.TransformationState;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;
import de.cau.cs.kieler.kiml.ui.layout.LayoutEffect;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * @author uru
 * 
 */
public class TransformationCombination extends AbstractCombination {

    private TransformationEffect effect;

    /**
     * 
     */
    public TransformationCombination() {
        super();
    }

    /**
     * executes this combination.
     * 
     * @param state
     *            the descriptor containing information about the transformation.
     * @param transformationTrigger
     *            used to determine if the transformation was already executed and the result can be
     *            retrieved.
     */
    public void execute(final TransformationState state,
            final EffectTriggerState<TransformationEffect> transformationTrigger) {

        if (transformationTrigger.getSequenceNumber() > state.getSequenceNumber()) {
            System.out.println("effect has been executed" + effect.getResult());
        } else {
            System.out.println("standard execution");
            // start the transformation
            effect = new TransformationEffect(state.getXtendFacade(), state.getDescriptor(),
                    state.getEditingDomain(), state.getSemaphore());
            effect.schedule();

            IEditorPart activeEditor = TransformationUtil.getActiveEditor();
            if (activeEditor instanceof SyncchartsDiagramEditor) {
                // refresh GMF edit policies
                RefreshGMFElementsEffect gmfEffect = new RefreshGMFElementsEffect(
                        (SyncchartsDiagramEditor) activeEditor);
                gmfEffect.schedule();

                // apply automatic layout by triggering the trigger (null layouts whole diagram)
                LayoutEffect layoutEffect = new LayoutEffect(activeEditor, null);
                layoutEffect.schedule();
            }
        }
    }
}
