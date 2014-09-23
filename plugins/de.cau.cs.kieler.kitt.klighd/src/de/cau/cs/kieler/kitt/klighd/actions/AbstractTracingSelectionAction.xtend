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
package de.cau.cs.kieler.kitt.klighd.actions

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.Colors
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData
import de.cau.cs.kieler.kitt.klighd.tracing.TracingProperties
import de.cau.cs.kieler.kitt.tracingtree.ModelWrapper
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*

/**
 * 
 * Abstract base class for all action handling selection for tracing.
 * <p>
 * Also handles highlighting of selected nodes.
 * 
 * @author als
 * @kieler.design 2014-08-26 proposed
 * @kieler.rating 2014-08-26 proposed yellow
 */
abstract class AbstractTracingSelectionAction implements IAction {

    /** KRenderingFactory to generate KRenderings. */
    private static val factory = KRenderingFactory.eINSTANCE;

    /**
     * Adds highlighting styles to selected diagram elements.
     * @param diagram the diagram.
     */
    static def showTracingSelection(KNode diagram) {
        diagram.getModelRootNodes.forEach [
            val node = it as KNode
            val data = node.getData(KLayoutData);
            val highlighting = data.getProperty(TracingProperties.TRACING_SELECTION_HIGHLIGHTING);
            val isSource = data.getProperty(TracingProperties.TRACING_SOURCE_SELECTION);
            val isTarget = data.getProperty(TracingProperties.TRACING_TARGET_SELECTION);
            if (highlighting == null && isSource) {
                data.setProperty(TracingProperties.TRACING_SELECTION_HIGHLIGHTING,
                    node.getData().filter(KRendering).fold(newLinkedList()) [ list, rendering |
                        //Source selection style
                        val fg = factory.createKForeground();
                        val c = factory.createKColor();
                        c.setColor(Colors.AQUAMARINE);
                        fg.setColor(c);
                        rendering.styles.add(fg);
                        list.add(fg);
                        return list;
                    ]);
            } else if (highlighting == null && isTarget) {
                data.setProperty(TracingProperties.TRACING_SELECTION_HIGHLIGHTING,
                    node.getData().filter(KRendering).fold(newLinkedList()) [ list, rendering |
                        //Target selection style
                        val fg = factory.createKForeground();
                        val c = factory.createKColor();
                        c.setColor(Colors.VIOLET_RED);
                        fg.setColor(c);
                        rendering.styles.add(fg);
                        list.add(fg);
                        return list;
                    ]);
            } else if (highlighting != null && !isSource && !isTarget) {
                highlighting.forEach [
                    //remove style from its parent
                    (it.eContainer as KRendering).getStyles().remove(it);
                ];
                data.setProperty(TracingProperties.TRACING_SELECTION_HIGHLIGHTING, null);
            }
        ];

    //TODO maybe fisheye view when both source and target are selected
    }

    /**
     * Removed highlighting styles from selected diagram elements.
     * @param diagram the diagram.
     */
    static def hideTracingSelection(KNode diagram) {
        diagram.getModelRootNodes.forEach [
            val data = (it as KNode).getData(KLayoutData);
            //get styles from property
            val highlighting = data.getProperty(TracingProperties.TRACING_SELECTION_HIGHLIGHTING);
            if (highlighting != null) {
                highlighting.forEach [
                    //remove style from its parent
                    (it.eContainer as KRendering).getStyles().remove(it);
                ];
                data.setProperty(TracingProperties.TRACING_SELECTION_HIGHLIGHTING, null);
            }
        ];
    }

    /**
     * Returns the Pair of original models elements selected in the given diagram.
     * Returns null if not both source and target are selected.
     * @param diagram the diagram.
     * @param viewContext the view context of the diagram.
     * @return selected source target pair or null.
     */
    static def Pair<EObject, EObject> getTracingSelection(KNode diagram, ViewContext viewContext) {
        //get selected nodes
        val sourceModelNode = diagram.getModelRootNodes.findFirst [
            (it as KNode).getData(KLayoutData)?.getProperty(TracingProperties.TRACING_SOURCE_SELECTION);
        ];
        val targetModelNode = diagram.getModelRootNodes.findFirst [
            (it as KNode).getData(KLayoutData)?.getProperty(TracingProperties.TRACING_TARGET_SELECTION);
        ];
        if (sourceModelNode != null && targetModelNode != null && sourceModelNode != targetModelNode) {
            //map to model elements
            val sourceModelObject = viewContext.getSourceElement(sourceModelNode);
            val targetModelObject = viewContext.getSourceElement(targetModelNode);
            if (sourceModelObject instanceof EObject && targetModelObject instanceof EObject) {
                return new Pair(sourceModelObject as EObject, targetModelObject as EObject);
            }
        }
        return null;
    }

    /**
     * Returns an Iterable over all node in given diagram representing tracing model root nodes.
     * @param diagram the diagram.
     * @return Iterator over diagram nodes.
     */
    protected static def getModelRootNodes(KNode diagram) {
        return diagram.eAllContentsOfType2(typeof(KNode)).filter [
            val data = (it as KNode).getData(KLayoutData);
            if (data != null) {
                //ModelRootNodes can be marked with property or are instances of ModelWrapper
                return data.getProperty(TracingProperties.TRACED_MODEL_ROOT_NODE) ||
                    data.getProperty(KlighdInternalProperties.MODEL_ELEMEMT) instanceof ModelWrapper;
            } else {
                return false;
            }
        ].toIterable;
    }

}
