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
package de.cau.cs.kieler.kitt.klighd.actions;

import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData;
import de.cau.cs.kieler.kitt.klighd.tracing.TracingSynthesisOption.TracingMode;
import de.cau.cs.kieler.kitt.klighd.tracing.internal.InternalTracingProperties;
import de.cau.cs.kieler.kitt.klighd.update.TracingVisualizationUpdateStrategy;
import de.cau.cs.kieler.klighd.IKlighdSelection;

/**
 * 
 * Action to remove all tracing selection.
 * 
 * @author als
 * @kieler.design 2014-08-26 proposed
 * @kieler.rating 2014-08-26 proposed yellow
 */
public class DeselectTracingSelectionAction extends AbstractTracingSelectionAction {

    /**
     * Standard Constructor
     */
    public DeselectTracingSelectionAction() {
    }

    /**
     * {@inheritDoc}
     */
    public ActionResult execute(ActionContext context) {
        KNode root = context.getKNode();
        // get root node
        while (root.getParent() != null) {
            root = root.getParent();
        }

        boolean updateTracing = getTracingSelection(root, context.getViewContext()) != null;

        // remove all selections from all nodes
        for (EObject obj : getModelRootNodes(root)) {
            KLayoutData data = ((KNode) obj).getData(KLayoutData.class);
            data.setProperty(InternalTracingProperties.SOURCE_SELECTION, false);
            data.setProperty(InternalTracingProperties.TARGET_SELECTION, false);
        }

        // update tracing edges if necessary
        if (updateTracing) {
            TracingVisualizationUpdateStrategy.visualizeTracing(context.getViewContext()
                    .getProperty(InternalTracingProperties.VISUALIZATION_MODE), root, context
                    .getViewContext(), Lists.newArrayList(((IKlighdSelection) context
                    .getContextViewer().getSelection()).diagramElementsIterator()), true);
            return ActionResult.createResult(true);
        }// remove selection visualization if necessary
        else if (context.getViewContext().getProperty(InternalTracingProperties.VISUALIZATION_MODE) != TracingMode.NO_TRACING) {
            hideTracingSelection(root);
            return ActionResult.createResult(true);
        }

        return ActionResult.createResult(false);
    }

}
