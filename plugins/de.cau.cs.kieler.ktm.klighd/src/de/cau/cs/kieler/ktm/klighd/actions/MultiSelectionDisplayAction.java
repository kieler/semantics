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

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.klighd.IAction;
import de.cau.cs.kieler.klighd.LightDiagramServices;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.ktm.klighd.resolve.ResolveModelWrapper;
import de.cau.cs.kieler.ktm.transformationtree.ModelWrapper;

/**
 * @author als
 * 
 */
public class MultiSelectionDisplayAction extends SelectionDisplayAction implements IAction {
    public static final String ID =
            "de.cau.cs.kieler.ktm.klighd.actions.MultiSelectionDisplayAction";

    /**
     * {@inheritDoc}
     */
    public ActionResult execute(ActionContext context) {
        KNode node = context.getKNode();
        final ViewContext vc = context.getViewContext();
        Object targetObject = vc.getSourceElement(node);

        // if its an valid click in tree
        if (node != null && targetObject != null && targetObject instanceof ModelWrapper) {
            ModelWrapper targetMW = (ModelWrapper) targetObject;

            // if source model is selected
            if (selectedSourceNode.containsKey(vc) && selectedSourceNode.get(vc) != node) {
                // if no target model of if not another target is selected
                if (!selectedTargetNode.containsKey(vc) || selectedTargetNode.get(vc) != node) {
                    ModelWrapper sourceMW =
                            (ModelWrapper) vc.getSourceElement(selectedSourceNode.get(vc));

                    // remove old diagram (may not necessary if only source is displayed bit when
                    // already a resolved diagram is displayed source diagram will contain mapping
                    // edges)
                    node.getParent().getChildren().remove(displayedSubDiagram.get(vc));
                    displayedSubDiagram.remove(vc);

                    // Deselect old target if any
                    if (selectedTargetNode.containsKey(vc)) {
                        KNode targetNode = selectedTargetNode.get(vc);
                        resetHighlightedNode(targetNode);
                        selectedTargetNode.remove(vc);
                    }

                    KNode subDiagram =
                            LightDiagramServices.translateModel(new ResolveModelWrapper(sourceMW,
                                    targetMW), vc);
                    if (subDiagram != null) {
                        node.getParent().getChildren().add(subDiagram);
                        displayedSubDiagram.put(vc, subDiagram);

                        highlightNode(node, false);
                        selectedTargetNode.put(vc, node);
                    }
                    return ActionResult.createResult(true);
                }
            }
        }
        return ActionResult.createResult(false);
    }

}
