/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.view.registry

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.ui.klighd.models.CodePlaceHolder
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.kicool.ui.klighd.syntheses.CodePlaceHolderSynthesis
import de.cau.cs.kieler.klighd.kgraph.KNode
import java.util.Collection
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.EdgeRouting
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.ProcessorSystem
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import org.eclipse.elk.core.options.Direction
import de.cau.cs.kieler.klighd.krendering.Trigger

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import org.eclipse.elk.alg.layered.options.LayerConstraint

/**
 * @author ssm
 * @kieler.design 2018-06-01 proposed
 * @kieler.rating 2018-06-01 proposed yellow 
 */
@ViewSynthesisShared
class KiCoolRegistrySynthesis extends AbstractDiagramSynthesis<KiCoolRegistrySummary> {

    @Inject extension KNodeExtensionsReplacement
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    
    public static val KLIGHD_ACTION_FOCUS_NODE = "de.cau.cs.kieler.ui.view.registry.focusNode"
    public static val KLIGHD_ACTION_DEFOCUS_NODE = "de.cau.cs.kieler.ui.view.registry.deFocusNode"
    
    public static val KIELER_QUALIFIED_NAME_PREFIX = "de.cau.cs.kieler."
    
    public static val SynthesisOption SHOW_BUNDLES = SynthesisOption::createCheckOption("Show Bundles", true)
    public static val SynthesisOption SHOW_SOURCE_FILES = SynthesisOption::createCheckOption("Show Source Files", true)
    public static val SynthesisOption SHOW_SYSTEMS = SynthesisOption::createCheckOption("Show Systems", true)
    public static val SynthesisOption SHOW_PROCESSORS = SynthesisOption::createCheckOption("Show Processors", true)
        
    public static val SynthesisOption FULLY_QUALIFIED_KIELER_PREFIX = SynthesisOption::createCheckOption("Show KIELER Qualified Name Prefix", false)
    public static val SynthesisOption FULLY_QUALIFIED_PROCESSOR_NAMES = SynthesisOption::createCheckOption("Show Long Processor Names", false)
    
    
    val processorConnections = <String, Integer> newHashMap
    
    override getDisplayedSynthesisOptions() {
        <SynthesisOption> newLinkedList => [
            add(SHOW_BUNDLES)
            add(SHOW_SOURCE_FILES)
            add(SHOW_SYSTEMS)
            add(SHOW_PROCESSORS)
            add(FULLY_QUALIFIED_KIELER_PREFIX)
            add(FULLY_QUALIFIED_PROCESSOR_NAMES)
        ]
    }    
    
    val idNodeMap = <String, KNode> newHashMap
    
    override transform(KiCoolRegistrySummary model) {
        val rootRootNode = model.createNode(0)
        val rootNode = model.createNode(1)
        processorConnections.clear
        
        rootRootNode.addLayoutParam(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID)
        rootRootNode.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
        rootRootNode.setLayoutOption(CoreOptions::DIRECTION, Direction.DOWN)
        rootNode.addLayoutParam(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID)
        rootNode.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
        rootNode.setLayoutOption(CoreOptions::DIRECTION, Direction.DOWN)
        rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE, 80d)
        rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE_BETWEEN_LAYERS, 80d)
        rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE, 80d)
        rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_EDGE, 10d)
        
        
        rootNode.children += model.createSystemNodes
        rootNode.children += model.createProcessorNodes
        rootNode.children += model.createFileNodes
        rootNode.children += model.createBundleNodes
        rootNode.children += model.connectSystemsWithProcessors
        rootNode.children += model.connectReferencedSystems
        rootNode.children += model.connectBundlesWithFiles
        rootNode.children += model.connectBundlesWithSystems
        rootNode.children += model.connectFilesWithSystems        
        
        rootNode.addRoundedRectangle(0, 0, 1) => [
            it.addAction(Trigger.DOUBLECLICK, KLIGHD_ACTION_DEFOCUS_NODE)
        ]
        
        rootRootNode.children += rootNode
        rootRootNode
    }
    
    def protected Collection<KNode> createSystemNodes(KiCoolRegistrySummary model) {
        val result = <KNode> newLinkedList
        if (!SHOW_SYSTEMS.booleanValue) return result
        
        for (s : model.systemList) {
            val node = s.createNode.toIdNodeMap(s.id) 
            node.createPort("in") => [ node.ports += it ]
            node.createPort("out") => [ node.ports += it ]
            
            node.setMinimalNodeSize(64, 64); // 2 x corner radius
            val content = node.addRoundedRectangle(4, 4, 1) => [
                // Mark this figure as container for further content
                setBackgroundGradient("#fdd".color, "#f88".color, 90);
                foreground = "#000".color;
                it.addAction(Trigger.SINGLECLICK, KLIGHD_ACTION_FOCUS_NODE)
            ]
            
            content.addText(s.id.kielerPrefix) => [
                fontSize = 32;
                // Add surrounding space
                setGridPlacementData().from(LEFT, 32, 0, TOP, 28, 0).to(RIGHT, 32, 0, BOTTOM, 28, 0);
                suppressSelectability
            ]            
            
            result += node
        }
        
        return result
    }
    
    def protected Collection<KNode> createProcessorNodes(KiCoolRegistrySummary model) {
        val result = <KNode> newLinkedList
        if (!SHOW_PROCESSORS.booleanValue) return result
        
        for (p : model.getProcessorIds) {
            val node = p.createNode.toIdNodeMap(p) 
            node.createPort("in") => [ node.ports += it ]
            node.createPort("out") => [ node.ports += it ]
            
            node.setMinimalNodeSize(34, 34); // 2 x corner radius
            val content = node.addRoundedRectangle(4, 4, 1) => [
                // Mark this figure as container for further content
                setBackgroundGradient("#fff".color, "#aaf".color, 90);
                foreground = "#000".color;
                it.addAction(Trigger.SINGLECLICK, KLIGHD_ACTION_FOCUS_NODE)
            ]
            
            var text = p.kielerPrefix
            if (!FULLY_QUALIFIED_PROCESSOR_NAMES.booleanValue) {
               val lastDot = p.lastIndexOf(".")
               if (lastDot > -1) {
                   text = p.substring(lastDot + 1)
               } 
            }
            
            content.addText(text) => [
                fontSize = 14;
                // Add surrounding space
                setGridPlacementData().from(LEFT, 14, 0, TOP, 14, 0).to(RIGHT, 14, 0, BOTTOM, 14, 0);
                suppressSelectability
            ]            
            
            processorConnections.put(p, new Integer(0))
            
            result += node
        }
        
        return result
    }
    
    def protected Collection<KNode> createFileNodes(KiCoolRegistrySummary model) {
        val result = <KNode> newLinkedList
        if (!SHOW_SOURCE_FILES.booleanValue) return result
                
        for (s : model.fileMap.keySet) {
            val node = s.createNode.toIdNodeMap(s) 
            node.createPort("in") => [ node.ports += it ]
            node.createPort("out") => [ node.ports += it ]
            
            node.setMinimalNodeSize(96, 96); // 2 x corner radius
            val content = node.addRoundedRectangle(4, 4, 1) => [
                // Mark this figure as container for further content
                setBackgroundGradient("#dfd".color, "#8f8".color, 90);
                foreground = "#000".color;
                it.addAction(Trigger.SINGLECLICK, KLIGHD_ACTION_FOCUS_NODE)
            ]
            
            content.addText(s.kielerPrefix) => [
                fontSize = 48;
                // Add surrounding space
                setGridPlacementData().from(LEFT, 32, 0, TOP, 28, 0).to(RIGHT, 32, 0, BOTTOM, 28, 0);
                suppressSelectability
            ]            
            
            result += node
        }
        
        return result
    }
    
    def protected Collection<KNode> createBundleNodes(KiCoolRegistrySummary model) {
        val result = <KNode> newLinkedList
        if (!SHOW_BUNDLES.booleanValue) return result
        
        for (s : model.bundleMap.keySet + model.bundleMapPublic.keySet) {
            val node = s.createNode.toIdNodeMap(s) 
            
            node.setLayoutOption(LayeredOptions.LAYERING_LAYER_CONSTRAINT, LayerConstraint.FIRST)
            
            node.createPort("in") => [ node.ports += it ]
            node.createPort("out") => [ node.ports += it ]
            
            node.setMinimalNodeSize(128, 128); // 2 x corner radius
            val content = node.addEllipse() => [
                // Mark this figure as container for further content
                setBackgroundGradient("#ffd".color, "#ff8".color, 90);
                foreground = "#000".color;
                lineWidth = 1
                it.addAction(Trigger.SINGLECLICK, KLIGHD_ACTION_FOCUS_NODE)
            ]
            
            content.addText(s.kielerPrefix) => [
                fontSize = 64;
                // Add surrounding space
                setGridPlacementData().from(LEFT, 32, 0, TOP, 28, 0).to(RIGHT, 32, 0, BOTTOM, 28, 0);
                suppressSelectability
            ]            
            
            result += node
        }
        
        return result
    }
    
    
    def protected Collection<KNode> connectSystemsWithProcessors(KiCoolRegistrySummary model) {
        val result = <KNode> newLinkedList
        if (!SHOW_PROCESSORS.booleanValue) return result
        if (!SHOW_SYSTEMS.booleanValue) return result
        
        for (s : model.systemList) {
            val rList = s.eAllContents.filter(ProcessorReference).toList
            for (p : rList) {
                s.createEdge(p) => [
                    source = s.id.getNodeById
                    target = p.id.getNodeById
                    sourcePort = source.getPort("out")
//                    targetPort = target.getPort("in")
                    addPolyline => [
                        addHeadArrowDecorator
                        addJunctionPointDecorator
                        selectionLineWidth = 6f
                        selectionForeground = "#99f".color
                    ]
                ]
                
                processorConnections.put(p.id, processorConnections.get(p.id) + 1)
            }
        }
        
        return result
    }
    
    def protected Collection<KNode> connectReferencedSystems(KiCoolRegistrySummary model) {
        val result = <KNode> newLinkedList
        if (!SHOW_SYSTEMS.booleanValue) return result
        
        for (s : model.systemList) {
            val rList = s.eAllContents.filter(ProcessorSystem).toList
            for (p : rList) {
                s.createEdge(p) => [
                    source = s.id.getNodeById
                    target = p.id.getNodeById
                    sourcePort = source.getPort("out")
//                    targetPort = target.getPort("in")
                    addPolyline => [
                        addHeadArrowDecorator
                        addJunctionPointDecorator
                    ]
                ]
            }
        }
        
        return result
    }    
        
    def protected Collection<KNode> connectBundlesWithFiles(KiCoolRegistrySummary model) {
        val result = <KNode> newLinkedList
        if (!SHOW_BUNDLES.booleanValue) return result
        if (!SHOW_SOURCE_FILES.booleanValue) return result
        
        for (s : model.bundleMap.keySet) {
            val rList = model.bundleMap.get(s)
            for (p : rList) {
                s.createEdge(p) => [
                    source = s.getNodeById
                    target = p.getNodeById
                    sourcePort = source.getPort("out")
                    addPolyline => [
                        addHeadArrowDecorator
                        addJunctionPointDecorator
                    ]
                ]
            }
        }
        
        return result
    }   
    
    def protected Collection<KNode> connectBundlesWithSystems(KiCoolRegistrySummary model) {
        val result = <KNode> newLinkedList
        if (!SHOW_BUNDLES.booleanValue) return result
        if (!SHOW_SYSTEMS.booleanValue) return result
        
        for (s : model.bundleMapPublic.keySet) {
            val rList = model.bundleMapPublic.get(s)
            for (p : rList) {
                s.createEdge(p) => [
                    source = s.getNodeById
                    target = p.id.getNodeById
                    sourcePort = source.getPort("out")
                    addPolyline => [
                        addHeadArrowDecorator
                        addJunctionPointDecorator
                    ]
                ]
            }
        }
        
        return result
    }  
    
    def protected Collection<KNode> connectFilesWithSystems(KiCoolRegistrySummary model) {
        val result = <KNode> newLinkedList
        if (!SHOW_SOURCE_FILES.booleanValue) return result
        if (!SHOW_SYSTEMS.booleanValue) return result
        
        for (s : model.fileMap.keySet) {
            val rList = model.fileMap.get(s)
            for (p : rList) {
                s.createEdge(p) => [
                    source = s.getNodeById
                    target = p.id.getNodeById
                    sourcePort = source.getPort("out")
                    addPolyline => [
                        addHeadArrowDecorator
                        addJunctionPointDecorator
                    ]
                ]
            }
        }
        
        return result
    }       


    
    def private kielerPrefix(String s) {
        if (!FULLY_QUALIFIED_KIELER_PREFIX.booleanValue) {
            if (s.startsWith(KIELER_QUALIFIED_NAME_PREFIX)) {
                return s.substring(KIELER_QUALIFIED_NAME_PREFIX.length)
            }            
        }
        return s
    }
    
    def private toIdNodeMap(KNode node, String id) {
        idNodeMap.put(id, node)
        return node
    }
    
    def private getNodeById(String id) {
        return idNodeMap.get(id)
    }
    
}
