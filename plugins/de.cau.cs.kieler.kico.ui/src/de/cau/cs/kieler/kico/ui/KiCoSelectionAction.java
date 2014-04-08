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

import java.util.Arrays;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.EcoreUtil2;

import de.cau.cs.kieler.core.kgraph.KGraphData;
import de.cau.cs.kieler.core.kgraph.KLabel;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.KColor;
import de.cau.cs.kieler.core.krendering.KContainerRendering;
import de.cau.cs.kieler.core.krendering.KRendering;
import de.cau.cs.kieler.core.krendering.KRoundedRectangle;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.kico.TransformationDummy;
import de.cau.cs.kieler.kico.klighd.KiCoDiagramSynthesis;
import de.cau.cs.kieler.klighd.IAction;

/**
 * This is first draft of an {@link IAction} realizing the collapsing and expanding of
 * {@link de.cau.cs.kieler.core.kgraph.KNode KNodes}.
 * 
 * @author cmot
 * @kieler.design 2014-04-08 proposed
 * @kieler.rating 2014-04-08 proposed yellow
 */
public class KiCoSelectionAction extends KiCoKlighdAction implements IAction {

    /**
     * The extension id of this actions. This id is to be mentioned in instances of
     * {@link de.cau.cs.kieler.core.krendering.KAction KAction}.
     */
    public static final String ID = "de.cau.cs.kieler.kico.klighd.KiCoSelectionAction";


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
        
        TransformationDummy transformationDummy = (TransformationDummy) context.getDomainElement(kNode);
        
        if (transformationDummy != null) {
            String id = transformationDummy.id;

            if (!KiCoSelectionView.isSelectedTransformation(id, KiCoSelectionView.getActiveEditorID())) {
                // Select
                setLabelColor(transformationDummy, context, KiCoDiagramSynthesis.WHITE, KiCoDiagramSynthesis.BLUE3);
                setStateColor(transformationDummy, context, KiCoDiagramSynthesis.BLUE3, KiCoDiagramSynthesis.BLUE4);
                KiCoSelectionView.addSelectedTransformation(id, KiCoSelectionView.getActiveEditorID());
            } else {
                // Un select
                setLabelColor(transformationDummy, context, KiCoDiagramSynthesis.DARKGRAY, KiCoDiagramSynthesis.BLUE1);
                setStateColor(transformationDummy, context, KiCoDiagramSynthesis.BLUE1, KiCoDiagramSynthesis.BLUE2);
                KiCoSelectionView.removeSelectedTransformation(id, KiCoSelectionView.getActiveEditorID());
            }

            System.out.println(Arrays.toString(KiCoSelectionView.getSelectedTransformations(KiCoSelectionView.getActiveEditorID())
                    .toArray()));
        }

        // Ensures that the KLighD view redraws the diagram of the curretly selected editor
        KiCoSelectionView.getActiveEditor().setFocus();
        
        return ActionResult.createResult(true).dontAnimateLayout();
    }

    // -------------------------------------------------------------------------
}
