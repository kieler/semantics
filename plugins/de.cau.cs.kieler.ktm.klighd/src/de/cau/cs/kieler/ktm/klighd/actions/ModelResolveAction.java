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

import java.lang.ref.WeakReference;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.klighd.IAction;
import de.cau.cs.kieler.klighd.LightDiagramServices;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.ktm.klighd.resolve.ResolveModelWrapper;
import de.cau.cs.kieler.ktm.transformationtree.ModelWrapper;

/**
 * Action to select an additional node in tree and display a resolved model with joined mapping.
 * 
 * @author als
 * 
 */
public class ModelResolveAction extends ModelSelectionAction implements IAction {

    /** Action ID. */
    public static final String ID = "de.cau.cs.kieler.ktm.klighd.actions.ModelResolveAction";

    /**
     * {@inheritDoc}
     */
    public ActionResult execute(final ActionContext context) {
        KNode node = context.getKNode();
        final ViewContext vc = context.getViewContext();
        Object targetObject = vc.getSourceElement(node);

        // if clicked valid node (ModelWrapper node in TransformationTree)
        if (node != null && targetObject != null && targetObject instanceof ModelWrapper) {
            // get diagrams root Node
            KNode rootNode = node;
            while (rootNode.getParent() != null) {
                rootNode = rootNode.getParent();
            }
            ModelWrapper targetMW = (ModelWrapper) targetObject;

            // if a source-model-node is selected
            if (selectedSourceNode.containsKey(vc) && selectedSourceNode.get(vc).get() != node) {
                // if no target model is selected or a new target is selected
                if (!selectedTargetNode.containsKey(vc) || selectedTargetNode.get(vc).get() != node) {
                    KNode sourceNode = selectedSourceNode.get(vc).get();
                    if (sourceNode != null) {
                        ModelWrapper sourceMW = (ModelWrapper) vc.getSourceElement(sourceNode);

                        // remove old diagram (may not necessary if only source is displayed but
                        // when
                        // already a resolved diagram is displayed source diagram will contain
                        // mapping
                        // edges)
                        rootNode.getChildren().remove(displayedSubDiagram.get(vc).get());
                        displayedSubDiagram.remove(vc);

                        // Deselect old target-node if any
                        if (selectedTargetNode.containsKey(vc)) {
                            KNode targetNode = selectedTargetNode.get(vc).get();
                            if (targetNode != null) {
                                resetHighlightedNode(targetNode);
                                selectedTargetNode.remove(vc);
                            } else {
                                selectedTargetNode.remove(vc);
                            }
                        }

                        // Translate source and target model to a diagram with a resolve relation
                        KNode subDiagram =
                                LightDiagramServices.translateModel(new ResolveModelWrapper(
                                        sourceMW, targetMW), vc);

                        // if synthesis was successful add subdiagram
                        if (subDiagram != null) {
                            rootNode.getChildren().add(subDiagram);
                            displayedSubDiagram.put(vc, new WeakReference<KNode>(subDiagram));

                            highlightNode(node, targetNodeHighlightingColor);
                            selectedTargetNode.put(vc, new WeakReference<KNode>(node));
                        }

                        return ActionResult.createResult(true);
                    }else{
                        selectedSourceNode.remove(vc);
                    }
                }
            }
        }
        return ActionResult.createResult(false);
    }

}
