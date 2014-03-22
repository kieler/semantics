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
package de.cau.cs.kieler.ktm.klighd.mapping

import com.google.inject.Inject
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KGraphElement
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions
import de.cau.cs.kieler.ktm.klighd.TransformationTreeDiagramSynthesis
import de.cau.cs.kieler.ktm.transformationtree.ModelWrapper
import java.lang.ref.WeakReference
import java.util.LinkedList

import static extension de.cau.cs.kieler.ktm.klighd.util.NearestNodeUtil.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * This synthesis inserts mapping edges into a TransformationTree diagram
 * 
 * @author als
 *
 */
@ViewSynthesisShared
class MappingSynthesis {

    @Inject
    extension KEdgeExtensions

    @Inject
    extension KRenderingExtensions

    @Inject
    extension KPolylineExtensions

    @Inject
    extension TransformationTreeExtensions
    
    // -------------------------------------------------------------------------
    // Constants    
    private static val mappingEdgeColor = KRenderingFactory.eINSTANCE.createKColor() =>
        [it.red = 255; it.green = 0; it.blue = 0];

    private static val selectEdgeActionID = "de.cau.cs.kieler.ktm.klighd.actions.MappingEdgeSelectionAction";

    def void createMappingEdges(KNode sourceNode, KNode targetNode, LinkedList<WeakReference<KEdge>> edgeRefList,
        ViewContext vc) {

        //Get ModelWrapper of Nodes
        val ModelWrapper sourceModelWrapper = vc.getSourceElement(sourceNode) as ModelWrapper;
        val ModelWrapper targetModelWrapper = vc.getSourceElement(targetNode) as ModelWrapper;

        if (sourceModelWrapper == null || targetModelWrapper == null) {
            return
        }

        //crate a mapping based on ModelWrappers
        val modelWrapperMapping = joinWrapperMappings(sourceModelWrapper, targetModelWrapper);

        if (modelWrapperMapping == null) {
            return
        }

        /* if sourceModelWrapper is transient or no EObjectWrapper is synthesized in diagram, 
         * component-diagram synthesis is NOT used, so modelWrapperMapping can used directly
         * to identify EObjectWrappers.
         * Else a mapping to internal model is needed. 
         */
        val sourceModelWrapperMapping = if (sourceModelWrapper.transient ||
                !vc.getTargetElements(sourceModelWrapper.rootObject).empty) {
                null
            } else {
                modelInstanceMapping(sourceModelWrapper, sourceModelWrapper.rootObject.EObject)
            }

        /*if targetModelWrapper is transient or no EObjectWrapper is synthesized in diagram, 
         * component-diagram synthesis is NOT used, so modelWrapperMapping can used directly
         * to identify EObjectWrappers.
         * Else a mapping to internal model is needed. 
         */
        val targetModelWrapperMapping = if (targetModelWrapper.transient ||
                !vc.getTargetElements(targetModelWrapper.rootObject).empty) {
                null
            } else {
                modelInstanceMapping(targetModelWrapper, targetModelWrapper.rootObject.EObject)
            }

        //indicates if edges should be invisible
        val selectiveEdges = if (vc.getOptionValue(TransformationTreeDiagramSynthesis.HIDE_EDGES) != null) {
                vc.getOptionValue(TransformationTreeDiagramSynthesis.HIDE_EDGES) as Boolean
            } else {
                false //default
            }

        //iterate over all mapping entries and create edges between all elements in diagram 
        // which source model elements are related in mapping
        modelWrapperMapping.entries.forEach [
            //if mapping a to diagram objects is needed, resolve key
            val sourceElement = if (sourceModelWrapperMapping != null) {
                    sourceModelWrapperMapping.get(it.key)
                } else {
                    it.key
                }
            //if mapping a to diagram objects is needed, resolve value
            val targetElement = if (targetModelWrapperMapping != null) {
                    targetModelWrapperMapping.get(it.value)
                } else {
                    it.value
                }
            //get elements in diagram
            val sourceDiagramElements = vc.getTargetElements(sourceElement);
            val targetDiagramElements = vc.getTargetElements(targetElement);
            //iterate over all combinations of diagram elements and create edges
            sourceDiagramElements.forEach [ sourceEObj |
                targetDiagramElements.forEach [ targetEObj |
                    //mapping-edges are only supported for KGraphElements
                    if (sourceEObj instanceof KGraphElement && targetEObj instanceof KGraphElement) {
                        val source = sourceEObj as KGraphElement;
                        val target = targetEObj as KGraphElement;
                        val edge = createEdge;
                        //add to list of mapping edges in MappingVisualizer
                        edgeRefList.add(new WeakReference(edge));
                        
                        //add shape
                        edge.addPolyline => [
                            it.foreground = mappingEdgeColor.copy;
                            it.invisible = selectiveEdges;
                            //add action for selective displaying of mapping edge
                            it.addSingleClickAction(selectEdgeActionID);
                            it.addArrowDecorator => [
                                it.invisible = selectiveEdges;
                            ]
                        ]

                        //NO_LAYOUT option provides attaching edges to all kinds of KGraphElement
                        edge.getData(KLayoutData).setProperty(LayoutOptions.NO_LAYOUT, true);

                        //Set IS_MAPPING_EDGE to mark this edge as an mapping edge
                        edge.getData(KLayoutData).setProperty(MappingProperties.IS_MAPPING_EDGE, true);

                        /* if source is a node attach edge to this node else calculate the nearest KNode 
                        *  to source-KGraphElement and attach edge to this node while setting a property 
                        *  which indicates the actual source of the edge causing the layout algorithm to
                        *  redirect edge.
                        */
                        if (source instanceof KNode) {
                            edge.setSource(source as KNode);
                        } else {
                            edge.setSource(source.nearestNode);

                        //TODO activate when advanced edge placement is implemented
                        //edge.setLayoutOption(KlighdProperties.ACTUAL_EDGE_SOURCE, source as KGraphElement);
                        }

                        // set target node or actual target and nearest node
                        if (target instanceof KNode) {
                            edge.setTarget(target as KNode);
                        } else {
                            edge.setTarget(target.nearestNode);

                        //TODO activate when advanced edge placement is implemented
                        //edge.setLayoutOption(KlighdProperties.ACTUAL_EDGE_TARGET,target as KGraphElement);
                        }

                        //add action for selective displaying of mapping edges to all associated source and target renderings
                        source.data.filter(KRendering).forEach [
                            it.addSingleClickAction(selectEdgeActionID);
                        ];
                        target.data.filter(KRendering).forEach [
                            it.addSingleClickAction(selectEdgeActionID);
                        ];
                    }
                ];
            ];
        ];
    }
}
