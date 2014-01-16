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
import de.cau.cs.kieler.ktm.klighd.layout.TransformationTreeLayoutProperties
import de.cau.cs.kieler.ktm.klighd.resolve.ResolveModelWrapper
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.ktm.transformationtree.ModelWrapper
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper
import java.util.HashMap
import de.cau.cs.kieler.klighd.ViewContext

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
    extension TransformationTreeDiagramSynthesis

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

        //TODO use parent vContext
        val vc = this.getUsedContext();

        if (sourceModelWrapper.transient || sourceModelWrapper.transient ||
            !((vc.getOptionValue(TransformationTreeDiagramSynthesis::SHOW_MODELS) as Boolean) ?: true)) {
            rootNode.addObjectMappingNodes(resolveWrapperMapping(sourceModelWrapper, targetModelWrapper), vc);
        } else {
            val sourceDiagramNode = LightDiagramServices::translateModel(sourceModelWrapper.rootObject.EObject, vc);
            val targetDiagramNode = LightDiagramServices::translateModel(targetModelWrapper.rootObject.EObject, vc);

            if (sourceDiagramNode == null || targetDiagramNode == null || sourceDiagramNode.children.empty ||
                targetDiagramNode.children.empty) {
                rootNode.addObjectMappingNodes(resolveWrapperMapping(sourceModelWrapper, targetModelWrapper), vc);
            } else {
                val mapping = resolveMapping(sourceModelWrapper, sourceModelWrapper.rootObject.EObject,
                    targetModelWrapper, targetModelWrapper.rootObject.EObject);
                if (mapping != null) {
                    sourceDiagramNode.addSourceRectangle;
                    targetDiagramNode.addTargetRectangle;
                    rootNode.children += sourceDiagramNode;
                    rootNode.children += targetDiagramNode;
                    translateMappingToEdges(sourceDiagramNode, targetDiagramNode, mapping,
                        (vc.getOptionValue(TransformationTreeDiagramSynthesis::SELECTIVE_MAPPING_VISUALISATION) as Boolean) ?:
                            false);
                } else {
                    rootNode.children += createNode => [it.addRectangle.addText("ERROR: No mapping available");];
                }
            }
        }
        return rootNode;
    }

    def addObjectMappingNodes(KNode rootNode, Multimap<EObjectWrapper, EObjectWrapper> mapping, ViewContext vc) {
        val showShadow = (vc.getOptionValue(TransformationTreeDiagramSynthesis::SHOW_SHADOW) as Boolean) ?: true;
        val showAttributes = (vc.getOptionValue(TransformationTreeDiagramSynthesis::SHOW_ATTRIBUTES) as Boolean) ?: true;
        if (mapping != null && !mapping.empty) {
            mapping.entries.forEach [ entry |
                createEdge() => [
                    it.source = entry.key.transformObjectWrapperNode(rootNode, showShadow, showAttributes, true);
                    it.target = entry.value.transformObjectWrapperNode(rootNode, showShadow, showAttributes, false);
                    it.addPolyline.addArrowDecorator;
                ]
            ];
        } else {
            rootNode.children += createNode => [it.addRectangle.addText("ERROR: No mapping available");];
        }
    }

    private def KNode create node : translateObject(object, showAttributes, showShadows) transformObjectWrapperNode(
        EObjectWrapper object, KNode rootNode, boolean showAttributes, boolean showShadows, boolean isSource) {
        rootNode.children += node;
        if (isSource) {
            node.addSourceRectangle;
        } else {
            node.addTargetRectangle;
        }
    }

    def translateMappingToEdges(KNode sourceDiagramNode, KNode targetDiagramNode, Multimap<EObject, EObject> mapping,
        boolean invisibleEdges) {
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
                            it.invisible = invisibleEdges;
                            it.addArrowDecorator;
                        ]
                        edge.setLayoutOption(LayoutOptions::NO_LAYOUT, true);

                        // actual source
                        if (source instanceof KNode) {
                            edge.setSource(source as KNode);
                        } else {
                            edge.setSource(getNearestNode(source as KGraphElement, sourceDiagramNode));
                            edge.setLayoutOption(KlighdProperties::ACTUAL_EDGE_SOURCE,
                                source as KGraphElement);
                        }

                        // actual target
                        if (target instanceof KNode) {
                            edge.setTarget(target as KNode);
                        } else {
                            edge.setTarget(getNearestNode(target as KGraphElement, targetDiagramNode));
                            edge.setLayoutOption(KlighdProperties::ACTUAL_EDGE_TARGET,
                                target as KGraphElement);
                        }
                    }
                ];
            ];
        ];

    // TODO rederinges rausfiltern und daran die action anhängen die
    // pfeile einzelnt highlighted
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

    def addSourceRectangle(KNode node) {
        node.addRectangle => [
            it.foreground = "red".color;
            it.lineStyle = LineStyle.DOT;
        ];
    }

    def addTargetRectangle(KNode node) {
        node.addRectangle => [
            it.foreground = "blue".color;
            it.lineStyle = LineStyle.DOT;
        ];

    }

}
