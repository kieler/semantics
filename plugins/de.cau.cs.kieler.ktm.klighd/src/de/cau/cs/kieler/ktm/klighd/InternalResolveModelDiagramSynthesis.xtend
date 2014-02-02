/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.ktm.klighd

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KGraphElement
import de.cau.cs.kieler.core.kgraph.KLabel
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions
import de.cau.cs.kieler.ktm.klighd.resolve.ResolveModelWrapper
import de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.ktm.klighd.util.NearestNodeUtil
import de.cau.cs.kieler.ktm.klighd.util.MappingEdgeProperties
import de.cau.cs.kieler.core.krendering.KRendering

/**
 * KLighD visualization for mappings between two ModelWrappers.
 * 
 * @author als
 */
class InternalResolveModelDiagramSynthesis extends AbstractDiagramSynthesis<ResolveModelWrapper> {

    @Inject
    extension KNodeExtensions

    @Inject
    extension KEdgeExtensions

    @Inject
    extension KPortExtensions

    @Inject
    extension KLabelExtensions

    @Inject
    extension KRenderingExtensions

    @Inject
    extension KContainerRenderingExtensions

    @Inject
    extension KPolylineExtensions

    @Inject
    extension KColorExtensions

    @Inject
    extension TransformationTreeExtensions

    @Inject
    extension TransformationTreeDiagramSynthesis ttSyn

    // -------------------------------------------------------------------------
    // The Main entry transform function
    private val sourceNodeHighlightingColor = RENDERING_FACTORY.createKColor() =>
        [it.red = 0; it.green = 0; it.blue = 255];
    private val targetNodeHighlightingColor = RENDERING_FACTORY.createKColor() =>
        [it.red = 255; it.green = 0; it.blue = 0];
    private val mappingEdgeColor = RENDERING_FACTORY.createKColor() => [it.red = 255; it.green = 0; it.blue = 0];

    /**
     * Resolves a mapping between source and target ModelWraper in ResolveModelWrapper
     */
    override KNode transform(ResolveModelWrapper resolvePair) {
        val rootNode = createNode();
        rootNode.addInvisibleContainerRendering;

        val sourceModelWrapper = resolvePair.sourceModel;
        val targetModelWrapper = resolvePair.targetModel;

        //if one of the models is transient or should not be displayed with its own synthesis then add basic EObject synthesis
        if (sourceModelWrapper.transient || sourceModelWrapper.transient ||
            !TransformationTreeDiagramSynthesis::SHOW_MODELS.booleanValue) {

            //add node for EObjects with edges form resolved mapping
            rootNode.addEObjectMappingNode(resolveWrapperMapping(sourceModelWrapper, targetModelWrapper));
        } else { // if models should be displayed with their own synthesis           
            val vc = usedContext;

            //translate internal models of source and target ModelWrappers
            val sourceDiagramNode = LightDiagramServices::translateModel(sourceModelWrapper.rootObject.EObject, vc);
            val targetDiagramNode = LightDiagramServices::translateModel(targetModelWrapper.rootObject.EObject, vc);

            if (sourceDiagramNode == null || targetDiagramNode == null || sourceDiagramNode.children.empty ||
                targetDiagramNode.children.empty) { //if no synthesis is available fall back to basic EObject synthesis
                rootNode.addEObjectMappingNode(resolveWrapperMapping(sourceModelWrapper, targetModelWrapper));
            } else {

                //if models of source and target ModelWrappers were translated correctly resolve a mapping on EObjects
                val mapping = resolveMapping(sourceModelWrapper, sourceModelWrapper.rootObject.EObject,
                    targetModelWrapper, targetModelWrapper.rootObject.EObject);
                if (mapping != null) {

                    //add translated models to rootNode
                    sourceDiagramNode.addSourceRectangle;
                    targetDiagramNode.addTargetRectangle;
                    rootNode.children += sourceDiagramNode;
                    rootNode.children += targetDiagramNode;

                    //add resulting mapping edges
                    translateMappingToEdges(sourceDiagramNode, targetDiagramNode, mapping);
                } else {

                    //if mapping is faulty (null) display error node
                    rootNode.addErrorNode();
                }
            }
        }
        return rootNode;
    }

    /**
     * Adds a KNode containing a representation of all EObjectWrapper in mapping with their mapping-relation-edges
     */
    private def addEObjectMappingNode(KNode rootNode, Multimap<EObjectWrapper, EObjectWrapper> mapping) {
        if (mapping != null && !mapping.empty) {

            // add all mapping edges           
            mapping.entries.forEach [ entry |
                createEdge() => [
                    //create nodes for EObjectWrappers
                    it.source = entry.key.transformObjectWrapperNode(rootNode, true);
                    it.target = entry.value.transformObjectWrapperNode(rootNode, false);
                    it.addPolyline.addArrowDecorator;
                ]
            ];

            //surrounding rectangle separating this collection
            rootNode.addRoundedRectangle(8, 8, 1) => [
                it.lineWidth = 2;
                it.foreground = "gray".color;
                if (TransformationTreeDiagramSynthesis::SHOW_SHADOW.booleanValue) {
                    it.shadow = "black".color;
                    it.shadow.XOffset = 4;
                    it.shadow.YOffset = 4;
                }
            ];
        } else {

            //if mapping is faulty (null) display error node
            rootNode.addErrorNode();
        }
    }

    /**
     * Translates and adds an EObjectWrapper to a KNode of rootNode depending on synthesis from 
     * TransformationTreeDiagramSysnthesis to maintain consistent L&F.
     * Depending on flag isSource a source or target colored rectangle will be added
     */
    private def KNode create node : translateObject(object,usedContext) transformObjectWrapperNode(
        EObjectWrapper object, KNode rootNode, boolean isSource) {
        rootNode.children += node;

        //add colored rectangle
        if (isSource) {
            node.addSourceRectangle;
        } else {
            node.addTargetRectangle;
        }
    }

    /**
     * Adds mapping edges to already translated diagrams.
     */
    private def translateMappingToEdges(KNode sourceDiagramNode, KNode targetDiagramNode,
        Multimap<EObject, EObject> mapping) {

        //create a mapping between model elements and their translated diagram elements
        val elementMapping = HashMultimap::create;

        //map source elements
        sourceDiagramNode.eAllContentsOfType(KGraphElement).forEach [
            val data = it.getData(KLayoutData);
            if (data != null) {
                elementMapping.put(data.getProperty(KlighdInternalProperties.MODEL_ELEMEMT), it);
            }
        ];

        //map target elements
        targetDiagramNode.eAllContentsOfType(KGraphElement).forEach [
            val data = it.getData(KLayoutData);
            if (data != null) {
                elementMapping.put(data.getProperty(KlighdInternalProperties.MODEL_ELEMEMT), it);
            }
        ];

        //iterate over all mapping enbtreise and create edges between all elements in diagram 
        // which source model elements are related in mapping
        mapping.entries.forEach [
            val sourceDiagramElements = elementMapping.get(it.key);
            val targetDiagramElements = elementMapping.get(it.value);
            sourceDiagramElements.forEach [ source |
                targetDiagramElements.forEach [ target |
                    //inter model mapping-edges are only supported for KGraphElements
                    if (source instanceof KGraphElement && source instanceof KGraphElement) {
                        val edge = createEdge;
                        edge.addPolyline => [
                            it.foreground = mappingEdgeColor.copy;
                            it.invisible = TransformationTreeDiagramSynthesis.HIDE_EDGES.booleanValue;
                            //add action for selective displaying of mapping edge
                            it.addSingleClickAction("de.cau.cs.kieler.ktm.klighd.actions.EdgeSelectionAction");
                            it.addArrowDecorator => [
                                it.invisible = TransformationTreeDiagramSynthesis.HIDE_EDGES.booleanValue;
                            ]
                        ]

                        //NO_LAYOUT option provides attaching edges to all kinds of KGraphElement
                        edge.setLayoutOption(LayoutOptions.NO_LAYOUT, true);

                        //Set IS_MAPPING_EDGE to mark this edge as an mapping edge
                        edge.setLayoutOption(MappingEdgeProperties.IS_MAPPING_EDGE, true);

                        // if source is a node attach edge to this node else calculate the nearest KNode 
                        // to source-KGraphElement and attach edge to this node while setting a property 
                        //  which indicates the actual source of the edge causing the layout algorithm to redirect edge.
                        if (source instanceof KNode) {
                            edge.setSource(source as KNode);
                        } else {
                            edge.setSource(NearestNodeUtil.getNearestNode(source as KGraphElement, sourceDiagramNode));

                        //TODO activate when advanced edge placement is implemented
                        //edge.setLayoutOption(KlighdProperties::ACTUAL_EDGE_SOURCE, source as KGraphElement);
                        }

                        // set target node or actual target and nearest node
                        if (target instanceof KNode) {
                            edge.setTarget(target as KNode);
                        } else {
                            edge.setTarget(NearestNodeUtil.getNearestNode(target as KGraphElement, targetDiagramNode));

                        //TODO activate when advanced edge placement is implemented
                        //edge.setLayoutOption(KlighdProperties::ACTUAL_EDGE_TARGET,target as KGraphElement);
                        }

                        //add action for selective displaying of mapping edges to all associated source and target renderings
                        source.data.filter(KRendering).forEach [
                            it.addSingleClickAction("de.cau.cs.kieler.ktm.klighd.actions.EdgeSelectionAction");
                        ];
                        target.data.filter(KRendering).forEach [
                            it.addSingleClickAction("de.cau.cs.kieler.ktm.klighd.actions.EdgeSelectionAction");
                        ];

                    }
                ];
            ];
        ];
    }

    /**
     * Adds a rectangle with style and color of a source node
     */
    private def addSourceRectangle(KNode node) {
        node.addRectangle => [
            it.foreground = sourceNodeHighlightingColor.copy;
            it.lineStyle = LineStyle.DOT;
        ];
    }

    /**
     * Adds a rectangle with style and color of a target node
     */
    private def addTargetRectangle(KNode node) {
        node.addRectangle => [
            it.foreground = targetNodeHighlightingColor.copy;
            it.lineStyle = LineStyle.DOT;
        ];

    }

    /**
     * Adds an node with an mapping error message to given node.
     */
    private def addErrorNode(KNode node) {
        node.children += createNode => [it.addRectangle.addText("ERROR: No mapping available");];
    }

}
