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
package de.cau.cs.kieler.ktm.klighd.actions;

import java.util.WeakHashMap;

import com.google.common.collect.Iterables;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.KColor;
import de.cau.cs.kieler.core.krendering.KColoring;
import de.cau.cs.kieler.core.krendering.KForeground;
import de.cau.cs.kieler.core.krendering.KInvisibility;
import de.cau.cs.kieler.core.krendering.KRectangle;
import de.cau.cs.kieler.core.krendering.KRendering;
import de.cau.cs.kieler.core.krendering.KRenderingFactory;
import de.cau.cs.kieler.klighd.IAction;
import de.cau.cs.kieler.klighd.LightDiagramServices;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.ktm.klighd.TransformationTreeDiagramSynthesis;
import de.cau.cs.kieler.ktm.transformationtree.ModelWrapper;

/**
 * @author als
 * 
 */
public class SelectionDisplayAction implements IAction {

    public static final String ID = "de.cau.cs.kieler.ktm.klighd.actions.SelectionDisplayAction";

    // TODO check in values prevent key from being deleted
    protected static final WeakHashMap<ViewContext, KNode> selectedSourceNode =
            new WeakHashMap<ViewContext, KNode>();
    protected static final WeakHashMap<ViewContext, KNode> selectedTargetNode =
            new WeakHashMap<ViewContext, KNode>();
    protected static final WeakHashMap<ViewContext, KNode> displayedSubDiagram =
            new WeakHashMap<ViewContext, KNode>();
    protected static final WeakHashMap<KNode, KColoring<? extends KColoring<?>>> highlighting =
            new WeakHashMap<KNode, KColoring<? extends KColoring<?>>>();

    /**
     * {@inheritDoc}
     */
    public ActionResult execute(ActionContext context) {
        KNode node = context.getKNode();
        final ViewContext vc = context.getViewContext();
        Object sourceObject = vc.getSourceElement(node);

        // click on root node -> clear all submodels
        if (node != null && node.getParent() == null) {
            if (displayedSubDiagram.containsKey(vc)) {
                clearSubModel(node, vc);
                return ActionResult.createResult(true);
            }
        }

        // if clicked valid node
        if (node != null && sourceObject != null && sourceObject instanceof ModelWrapper) {
            // if clicked an unselected node or switch from resolve to single display of models
            if (!selectedSourceNode.containsKey(vc) || selectedSourceNode.get(vc) != node
                    || selectedTargetNode.containsKey(vc)) {
                ModelWrapper sourceMW = (ModelWrapper) sourceObject;

                if (displayedSubDiagram.containsKey(vc)) {
                    clearSubModel(node.getParent(), vc);
                }

                KNode subDiagram = null;
                if (sourceMW.isTransient()) {
                    vc.configureOption(TransformationTreeDiagramSynthesis.SYNTHESIZE_TREE, false);
                    subDiagram = LightDiagramServices.translateModel(sourceMW, vc);
                    vc.configureOption(TransformationTreeDiagramSynthesis.SYNTHESIZE_TREE, true);
                } else {
                    subDiagram =
                            LightDiagramServices.translateModel(sourceMW.getRootObject()
                                    .getEObject(), vc);
                    if (subDiagram != null && subDiagram.getChildren().isEmpty()) {
                        vc.configureOption(TransformationTreeDiagramSynthesis.SYNTHESIZE_TREE,
                                false);
                        subDiagram = LightDiagramServices.translateModel(sourceMW, vc);
                        vc.configureOption(TransformationTreeDiagramSynthesis.SYNTHESIZE_TREE, true);
                    }
                }
                if (subDiagram != null) {
                    hideSurroundingRectangle(subDiagram);
                    node.getParent().getChildren().add(subDiagram);
                    displayedSubDiagram.put(vc, subDiagram);

                    selectedSourceNode.put(vc, node);
                    highlightNode(node, true);

                    return ActionResult.createResult(true);
                }
            }
        }

        return ActionResult.createResult(false);
    }

    protected void highlightNode(KNode node, boolean source) {
        KColor color = KRenderingFactory.eINSTANCE.createKColor();
        if (source) {
            color.setRed(255);
        } else {
            color.setBlue(255);
        }
        KForeground fg = KRenderingFactory.eINSTANCE.createKForeground();
        // fg.setPropagateToChildren(true);
        fg.setColor(color);
        node.getData(KRendering.class).getStyles().add(fg);
        highlighting.put(node, fg);
    }

    protected void resetHighlightedNode(KNode node) {
        if (highlighting.containsKey(node)) {
            node.getData(KRendering.class).getStyles().remove(highlighting.get(node));
            highlighting.remove(node);
        }
    }

    protected void clearSubModel(KNode rootNode, ViewContext vc) {
        KNode sourceNode = selectedSourceNode.get(vc);
        resetHighlightedNode(sourceNode);
        selectedSourceNode.remove(vc);

        if (selectedTargetNode.containsKey(vc)) {
            KNode targetNode = selectedTargetNode.get(vc);
            resetHighlightedNode(targetNode);
            selectedTargetNode.remove(vc);
        }

        rootNode.getChildren().remove(displayedSubDiagram.get(vc));
        displayedSubDiagram.remove(vc);
    }

    protected void hideSurroundingRectangle(KNode node) {
        KRectangle rootRectangle = KRenderingFactory.eINSTANCE.createKRectangle();
        KInvisibility invisibility = KRenderingFactory.eINSTANCE.createKInvisibility();
        invisibility.setInvisible(true);
        rootRectangle.getStyles().add(invisibility);
        node.getData().add(rootRectangle);       
    }
}
