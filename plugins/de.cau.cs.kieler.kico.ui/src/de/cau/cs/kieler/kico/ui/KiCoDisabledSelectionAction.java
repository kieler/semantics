/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.ui;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.kico.Feature;
import de.cau.cs.kieler.kico.FeatureGroup;
import de.cau.cs.kieler.kico.KielerCompilerSelection;
import de.cau.cs.kieler.klighd.IAction;

/**
 * This action realizes the disabled selection if transformation IDs.
 * 
 * @author cmot
 * @kieler.design 2015-03-15 proposed
 * @kieler.rating 2015-03-15 proposed yellow
 */
public class KiCoDisabledSelectionAction extends KiCoKlighdAction implements IAction {

    /**
     * The extension id of this actions. This id is to be mentioned in instances of
     * {@link de.cau.cs.kieler.core.krendering.KAction KAction}.
     */
    public static final String ID = "de.cau.cs.kieler.kico.klighd.KiCoDisabledSelectionAction";

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}.<br>
     * <br>
     * This ones expands the KNode provided in 'context'.<br>
     * It is important to notice that collapsing a node means the collapsing of its child area.
     * Thus, the node itself is visible and gets layouted, while all its children and edges
     * originating from or pointing to that children are marked as non-ACTIVE, removed from the
     * diagram rendering (see GraphController#deactivateSubgraph(KNode), and ignored in the layout
     * process. This implies that the collapsed node is now treated as a non-hierarchical node whose
     * size is determined by the values in the KShapeLayout rather than by the MIN_WIDTH/MIN_HEIGHT
     * layout options.
     * 
     */
    public ActionResult execute(final ActionContext context) {

        KNode kNode = context.getKNode();
        Feature feature = (Feature) context.getDomainElement(kNode);

        if (feature != null) {
            int activeEditorID = KiCoSelectionView.getActiveEditorID();
            KiCoSelectionDiagramModel selectionModel =
                    KiCoSelectionView.getSelectionModel(activeEditorID);
            KielerCompilerSelection selection = selectionModel.getContext().getSelection();

            boolean skip = false;

            // Only allow disabling of TransformationFeatures or Features with a single transformation only
            if (feature instanceof FeatureGroup) {
                skip = true;
            }
            if (feature.isAlternative()) {
                skip = true;
            }

            if (selection != null && !skip) {
                // Test if the transformation is already disabled, then unselect it otherwise select
                // it

                if (!KiCoSelectionView.isDisabledTransformation(feature, selection)) {
                    KiCoSelectionView.disableTransformation(feature, selection,
                            context.getViewContext());
                } else {
                    KiCoSelectionView.enableTransformation(feature, selection,
                            context.getViewContext());
                }
                System.out.println("Selected features are: " + selection);
            }

        }

        // Notify listeners about currently active transformations
        KiCoSelectionView.notifySelectionChangeEventListener();

        return ActionResult.createResult(true).dontAnimateLayout();
    }

    // -------------------------------------------------------------------------
}
