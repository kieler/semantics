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

/**
 * KLighD visualization for Transformation Mapping Graphs.
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
    /**
     * Each Model is a element in a tree.
     * Creates synthesis for tree with given model as root element
     */
    override KNode transform(ResolveModelWrapper resolvePair) {
        val rootNode = createNode();
        rootNode.addInvisibleContainerRendering;

        val sourceModelWrapper = resolvePair.sourceModel;
        val targetModelWrapper = resolvePair.targetModel;

        if (sourceModelWrapper.transient || sourceModelWrapper.transient ||
            !TransformationTreeDiagramSynthesis::SHOW_MODELS.booleanValue) {
            rootNode.addObjectMappingNodes(resolveWrapperMapping(sourceModelWrapper, targetModelWrapper));
        } else {
            val vc = usedContext;
            val sourceDiagramNode = LightDiagramServices::translateModel(sourceModelWrapper.rootObject.EObject, vc);
            val targetDiagramNode = LightDiagramServices::translateModel(targetModelWrapper.rootObject.EObject, vc);

            if (sourceDiagramNode == null || targetDiagramNode == null || sourceDiagramNode.children.empty ||
                targetDiagramNode.children.empty) {
                rootNode.addObjectMappingNodes(resolveWrapperMapping(sourceModelWrapper, targetModelWrapper));
            } else {
                val mapping = resolveMapping(sourceModelWrapper, sourceModelWrapper.rootObject.EObject,
                    targetModelWrapper, targetModelWrapper.rootObject.EObject);
                if (mapping != null) {
                    sourceDiagramNode.addSourceRectangle;
                    targetDiagramNode.addTargetRectangle;
                    rootNode.children += sourceDiagramNode;
                    rootNode.children += targetDiagramNode;
                    translateMappingToEdges(sourceDiagramNode, targetDiagramNode, mapping);
                } else {
                    rootNode.children += createNode => [it.addRectangle.addText("ERROR: No mapping available");];
                }
            }
        }
        return rootNode;
    }

    private def addObjectMappingNodes(KNode rootNode, Multimap<EObjectWrapper, EObjectWrapper> mapping) {
        if (mapping != null && !mapping.empty) {
            mapping.entries.forEach [ entry |
                createEdge() => [
                    it.source = entry.key.transformObjectWrapperNode(rootNode, true);
                    it.target = entry.value.transformObjectWrapperNode(rootNode, false);
                    it.addPolyline.addArrowDecorator;
                ]
            ];
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
            rootNode.children += createNode => [it.addRectangle.addText("ERROR: No mapping available");];
        }
    }

    private def KNode create node : translateObject(object,usedContext) transformObjectWrapperNode(
        EObjectWrapper object, KNode rootNode, boolean isSource) {
        rootNode.children += node;
        if (isSource) {
            node.addSourceRectangle;
        } else {
            node.addTargetRectangle;
        }
    }

    private def translateMappingToEdges(KNode sourceDiagramNode, KNode targetDiagramNode,
        Multimap<EObject, EObject> mapping) {
        val elementMapping = HashMultimap::create;
        sourceDiagramNode.eAllContentsOfType(KGraphElement).forEach [
            val data = it.getData(KLayoutData);
            if (data != null) {
                elementMapping.put(data.getProperty(KlighdInternalProperties.MODEL_ELEMEMT), it);
            }
        ];
        targetDiagramNode.eAllContentsOfType(KGraphElement).forEach [
            val data = it.getData(KLayoutData);
            if (data != null) {
                elementMapping.put(data.getProperty(KlighdInternalProperties.MODEL_ELEMEMT), it);
            }
        ];

        mapping.entries.forEach [
            val sourceDiagramElements = elementMapping.get(it.key);
            val targetDiagramElements = elementMapping.get(it.value);
            sourceDiagramElements.forEach [ source |
                targetDiagramElements.forEach [ target |
                    if (source instanceof KGraphElement && source instanceof KGraphElement) {
                        val edge = createEdge;
                        edge.addPolyline => [
                            it.foreground = "red".color;
                            it.addArrowDecorator;
                        ]
                        edge.setLayoutOption(LayoutOptions::NO_LAYOUT, true);

                        // actual source
                        if (source instanceof KNode) {
                            edge.setSource(source as KNode);
                        } else {
                            edge.setSource(getNearestNode(source as KGraphElement, sourceDiagramNode));

                        //TODO activate when advanced Edge placement is implemented
                        //edge.setLayoutOption(KlighdProperties::ACTUAL_EDGE_SOURCE, source as KGraphElement);
                        }

                        // actual target
                        if (target instanceof KNode) {
                            edge.setTarget(target as KNode);
                        } else {
                            edge.setTarget(getNearestNode(target as KGraphElement, targetDiagramNode));

                        //TODO activate when advanced Edge placement is implemented
                        //edge.setLayoutOption(KlighdProperties::ACTUAL_EDGE_TARGET,target as KGraphElement);
                        }
                    }
                ];
            ];
        ];
    }

    def KNode getNearestNode(KGraphElement elem, KNode defaultNode) {
        if (elem instanceof KNode) {
            return elem as KNode;
        } else if (elem instanceof KEdge) {
            return (elem as KEdge).source;
        } else if (elem instanceof KLabel) {
            return (elem as KLabel).parent.getNearestNode(defaultNode);
        } else if (elem instanceof KPort) {
            return (elem as KPort).node;
        }
        return defaultNode;
    }

    private def addSourceRectangle(KNode node) {
        node.addRectangle => [
            it.foreground = "red".color;
            it.lineStyle = LineStyle.DOT;
        ];
    }

    private def addTargetRectangle(KNode node) {
        node.addRectangle => [
            it.foreground = "blue".color;
            it.lineStyle = LineStyle.DOT;
        ];

    }

}
