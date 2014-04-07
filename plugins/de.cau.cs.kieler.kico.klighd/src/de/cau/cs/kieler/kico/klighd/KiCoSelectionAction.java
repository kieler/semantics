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
package de.cau.cs.kieler.kico.klighd;

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
import de.cau.cs.kieler.klighd.IAction;

/**
 * This is first draft of an {@link IAction} realizing the collapsing and expanding of
 * {@link de.cau.cs.kieler.core.kgraph.KNode KNodes}.
 * 
 * @author cmot
 */
public class KiCoSelectionAction implements IAction {

    /**
     * The extension id of this actions. This id is to be mentioned in instances of
     * {@link de.cau.cs.kieler.core.krendering.KAction KAction}.
     */
    public static final String ID = "de.cau.cs.kieler.kico.klighd.KiCoSelectionAction";

    /** The instance of k rendering extensions for reuse Xtend code here (coloring). */
    public static KRenderingExtensions kRenderingExtensions = new KRenderingExtensions();

    // -------------------------------------------------------------------------
    
    /**
     * Helper method to get the rectangle for coloring.
     *
     * @param data the data
     * @return the rectangle
     */
    KRoundedRectangle getRectangle(KGraphData data) {
        if (data instanceof KRoundedRectangle) {
            return (KRoundedRectangle) data;
        }
        if (data instanceof KContainerRendering) {
            KContainerRendering container = (KContainerRendering) data;
            for (KRendering child : container.getChildren()) {
                KRoundedRectangle returnValue = getRectangle(child);
                if (returnValue != null) {
                    return returnValue;
                }
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Helper method to get the rectangle for coloring.
     *
     * @param kNode the k node
     * @return the rectangle
     */
    KRoundedRectangle getRectangle(KNode kNode) {
        for (KGraphData data : kNode.getData()) {
            if (data instanceof KRoundedRectangle) {
                return (KRoundedRectangle) data;
            }
            KRoundedRectangle returnValue = getRectangle(data);
            if (returnValue != null) {
                return returnValue;
            }
        }
        return null;
    }
    
    // -------------------------------------------------------------------------

    /**
     * Helper method to get the label for coloring.
     *
     * @param data the data
     * @return the label
     */
    KText getLabel(KGraphData data) {
        if (data instanceof KText) {
            return (KText) data;
        }
        if (data instanceof KContainerRendering) {
            KContainerRendering container = (KContainerRendering) data;
            for (KRendering child : container.getChildren()) {
                KText returnValue = getLabel(child);
                if (returnValue != null) {
                    return returnValue;
                }
            }
        }
        return null;
    }
    
    // -------------------------------------------------------------------------

    /**
     * Helper method to get the label for coloring.
     *
     * @param kNode the k node
     * @return the label
     */
    KText getLabel(KNode kNode) {
        for (KGraphData data : kNode.getData()) {
            if (data instanceof KText) {
                return (KText) data;
            }
            KText returnValue = getLabel(data);
            if (returnValue != null) {
                return returnValue;
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------
    
    /**
     * Helper method to copy a color when coloring a selection.
     *
     * @param color the color
     * @return the k color
     */
    KColor copy(KColor color) {
        return EcoreUtil2.copy(color);
    }

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

//        TransformationDummy transformationDummy =
//                KiCoSelectionView.knode2transformationDummy.get(kNode);
        
        TransformationDummy transformationDummy = (TransformationDummy) context.getDomainElement(kNode);
        
        if (transformationDummy != null) {
            String id = transformationDummy.id;

            // Find the right rectangle and ktext label to color
            KRoundedRectangle rect = getRectangle(kNode);
            KText kText = getLabel(kNode);

            if (!KiCoSelectionView.isSelectedTransformation(id)) {
                // Select
                if (rect != null) {
                    kRenderingExtensions.setBackgroundGradient(rect,
                            copy(KiCoDiagramSynthesis.BLUE3), copy(KiCoDiagramSynthesis.BLUE4), 90);
                    kRenderingExtensions.setSelectionBackgroundGradient(rect,
                            copy(KiCoDiagramSynthesis.BLUE3), copy(KiCoDiagramSynthesis.BLUE4), 90);
                }
                if (kText != null) {
                    kRenderingExtensions.setForeground(kText, KiCoDiagramSynthesis.WHITE);
                    kRenderingExtensions.setSelectionBackground(kText,
                            copy(KiCoDiagramSynthesis.BLUE3));
                }
                KiCoSelectionView.addSelectedTransformation(id);
            } else {
                // Un select
                if (rect != null) {
                    kRenderingExtensions.setBackgroundGradient(rect,
                            copy(KiCoDiagramSynthesis.BLUE1), copy(KiCoDiagramSynthesis.BLUE2), 90);
                    kRenderingExtensions.setSelectionBackgroundGradient(rect,
                            copy(KiCoDiagramSynthesis.BLUE1), copy(KiCoDiagramSynthesis.BLUE2), 90);
                }
                if (kText != null) {
                    kRenderingExtensions.setForeground(kText, KiCoDiagramSynthesis.DARKGRAY);
                    kRenderingExtensions.setSelectionBackground(kText,
                            copy(KiCoDiagramSynthesis.WHITE));
                }
                KiCoSelectionView.removeSelectedTransformation(id);
            }

            System.out.println(Arrays.toString(KiCoSelectionView.getSelectedTransformations()
                    .toArray()));
        }

        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().setFocus();
        
        return ActionResult.createResult(true).dontAnimateLayout();
    }

    // -------------------------------------------------------------------------
}
