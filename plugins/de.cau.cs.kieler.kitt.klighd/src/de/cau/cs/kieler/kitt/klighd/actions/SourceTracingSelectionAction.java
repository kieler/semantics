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
import de.cau.cs.kieler.kitt.klighd.tracing.TracingProperties;
import de.cau.cs.kieler.kitt.klighd.tracing.TracingSynthesisOption.TracingMode;
import de.cau.cs.kieler.kitt.klighd.update.TracingVisualizationUpdateStrategy;
import de.cau.cs.kieler.klighd.IKlighdSelection;

/**
 * 
 * Action to select a node as source model in tracing selection.
 * 
 * @author als
 * @kieler.design 2014-08-26 proposed
 * @kieler.rating 2014-08-26 proposed yellow
 */
public class SourceTracingSelectionAction extends AbstractTracingSelectionAction {
    
    /**
     * Standard Constructor
     */
    public SourceTracingSelectionAction() {
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

        boolean updateTracing = false;
        
        // update selection
        for (EObject obj : getModelRootNodes(root)) {
            KLayoutData data = ((KNode) obj).getData(KLayoutData.class);
            // set new selection
            if (obj == context.getKNode()) {
                data.setProperty(TracingProperties.TRACING_SOURCE_SELECTION, true);
            } // remove selection from current source node
            else {
                data.setProperty(TracingProperties.TRACING_SOURCE_SELECTION, false);
            }
            //check for corresponding target
            updateTracing |= data.getProperty(TracingProperties.TRACING_TARGET_SELECTION);
        }

        //update tracing edges if necessary
        if (updateTracing) {
            TracingVisualizationUpdateStrategy.visualizeTracing(context.getViewContext()
                    .getProperty(TracingProperties.TRACING_VISUALIZATION_MODE), root, context
                    .getViewContext(), Lists.newArrayList(((IKlighdSelection) context
                    .getContextViewer().getSelection()).diagramElementsIterator()), true);
            return ActionResult.createResult(true);
        }// update selection visualization if necessary
        else if (context.getViewContext().getProperty(TracingProperties.TRACING_VISUALIZATION_MODE) != TracingMode.NO_TRACING) {
            showTracingSelection(root);
            return ActionResult.createResult(true);
        }

        return ActionResult.createResult(false);
    }
}
