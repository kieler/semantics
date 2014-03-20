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

import java.util.LinkedList;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.kgraph.KEdge;
import de.cau.cs.kieler.core.kgraph.KGraphElement;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.KInvisibility;
import de.cau.cs.kieler.core.krendering.KPolyline;
import de.cau.cs.kieler.core.krendering.KRenderingFactory;
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData;
import de.cau.cs.kieler.klighd.IAction;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.util.KlighdProperties;
import de.cau.cs.kieler.ktm.klighd.TransformationTreeDiagramSynthesis;
import de.cau.cs.kieler.ktm.klighd.util.MappingProperties;
import de.cau.cs.kieler.ktm.klighd.util.NearestNodeUtil;

/**
 * Action for displaying hided edges in a resolved diagram.
 * 
 * @author als
 * 
 */
public class EdgeSelectionAction implements IAction {

    /** Action ID. */
    public static final String ID = "de.cau.cs.kieler.ktm.klighd.actions.EdgeSelectionAction";

    /**
     * {@inheritDoc}
     */
    public ActionResult execute(final ActionContext context) {
        final KGraphElement element = context.getKGraphElement();
        final ViewContext vc = context.getViewContext();

        // check id clicked valid element and edges should be selectable
        if (element != null
                && vc.getOptionValue(TransformationTreeDiagramSynthesis.HIDE_EDGES) != null
                && ((Boolean) vc.getOptionValue(TransformationTreeDiagramSynthesis.HIDE_EDGES))
                        .booleanValue()) {
            // check if clicked on mapping edge
            boolean clickedMappingEdge = false;
            if (element instanceof KEdge) {
                KLayoutData data = ((KEdge) element).getData(KLayoutData.class);
                if (data != null) {
                    Boolean isMappingEdge = data.getProperty(MappingProperties.IS_MAPPING_EDGE);
                    if (isMappingEdge != null) {
                        clickedMappingEdge = isMappingEdge.booleanValue();
                    }
                }
            }
            if (clickedMappingEdge) {
                // hide selected mapping edge
                setInvisible((KEdge) element, true);
            } else { // else clicked on element in a resolved model

                // List of all elements which edges should be highlighted
                final LinkedList<KGraphElement> selectedElements = new LinkedList<KGraphElement>();
                selectedElements.add(element);
                // add all KGraphElements in selection
                for (Object object : context.getContextViewer().getSelection().toList()) {
                    if (object instanceof KGraphElement) {
                        selectedElements.add((KGraphElement) object);
                    }
                }

                // get nearest node to element
                KNode rootNode = NearestNodeUtil.getNearestNode(element);
                if (rootNode != null) {
                    // get rootNode
                    while (rootNode.getParent() != null) {
                        rootNode = rootNode.getParent();
                    }

                    // get all edges in diagram
                    for (KEdge edge : Lists.newArrayList(Iterators.filter(rootNode.eAllContents(),
                            KEdge.class))) {
                        // if edge is mapping edge
                        KLayoutData data = edge.getData(KLayoutData.class);
                        if (data != null) {
                            Boolean isMappingEdge =
                                    data.getProperty(MappingProperties.IS_MAPPING_EDGE);
                            if (isMappingEdge != null && isMappingEdge.booleanValue()) {
                                // TODO activate when advanced edge placement is implemented
                                KGraphElement actualSource = null;// data.getProperty(KlighdProperties.ACTUAL_EDGE_SOURCE);
                                KGraphElement actualTarget = null;// data.getProperty(KlighdProperties.ACTUAL_EDGE_TARGET);
                                // show edge if selected
                                if (selectedElements.contains(edge.getSource())
                                        || selectedElements.contains(edge.getTarget())
                                        || (actualSource != null && selectedElements
                                                .contains(actualSource))
                                        || (actualTarget != null && selectedElements
                                                .contains(actualTarget))) {
                                    setInvisible(edge, false);
                                } else {// else hide it
                                    setInvisible(edge, true);
                                }
                            }
                        }
                    }
                }
                return ActionResult.createResult(true);
            }
            // context.getKGraphElement().getData(type)
        }

        return ActionResult.createResult(false);
    }

    /**
     * Sets invisibility of an edge.
     * 
     * @param edge
     * @param invisible
     */
    private void setInvisible(final KEdge edge, final boolean invisible) {
        KPolyline line = edge.getData(KPolyline.class);
        if (line != null) {
            KInvisibility invisibility =
                    (KInvisibility) Iterables.find(line.getStyles(),
                            Predicates.instanceOf(KInvisibility.class), null);
            if (invisibility == null) {
                invisibility = KRenderingFactory.eINSTANCE.createKInvisibility();
                line.getStyles().add(invisibility);
            }
            invisibility.setInvisible(invisible);
            invisibility.setPropagateToChildren(true);
        }
    }
}
