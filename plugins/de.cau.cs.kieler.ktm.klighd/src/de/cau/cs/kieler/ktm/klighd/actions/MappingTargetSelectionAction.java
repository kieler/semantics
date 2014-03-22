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
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.ktm.klighd.mapping.MappingVisualizer;
import de.cau.cs.kieler.ktm.transformationtree.ModelWrapper;

/**
 * Action to select an additional node in tree and display a resolved model with joined mapping.
 * 
 * @author als
 * 
 */
public class MappingTargetSelectionAction implements IAction {

    /** Action ID. */
    public static final String ID =
            "de.cau.cs.kieler.ktm.klighd.actions.MappingTargetSelectionAction";

    /**
     * {@inheritDoc}
     */
    public ActionResult execute(final ActionContext context) {
        final KNode node = context.getKNode();
        final ViewContext vc = context.getViewContext();
        final Object targetObject = vc.getSourceElement(node);
        // if clicked valid node (ModelWrapper node in TransformationTree)
        if (node != null && targetObject != null && targetObject instanceof ModelWrapper) {
            // select this one
            return ActionResult.createResult(MappingVisualizer.getMappingVisualizer(vc)
                    .setSelectedTargetNode(node));
        }
        return ActionResult.createResult(false);
    }
}
