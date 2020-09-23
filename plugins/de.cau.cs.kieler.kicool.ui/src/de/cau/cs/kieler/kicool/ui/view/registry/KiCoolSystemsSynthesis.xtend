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
import de.cau.cs.kieler.kicool.ProcessorAlternativeGroup
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.ProcessorSystem
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.ide.view.registry.KNodeExtensionsReplacement
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.Trigger
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import java.util.Collection
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortSide

import static extension de.cau.cs.kieler.kicool.registration.KiCoolRegistration.*
import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * @author ssm
 * @kieler.design 2018-06-01 proposed
 * @kieler.rating 2018-06-01 proposed yellow 
 */
@ViewSynthesisShared
class KiCoolSystemsSynthesis extends AbstractDiagramSynthesis<KiCoolSystemsSummary> {

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
    
    public static val SynthesisOption SHOW_META_ONLY = SynthesisOption::createCheckOption("Show Meta Systems Only", false)
    public static val SynthesisOption SHOW_PROCESSOR_DETAILS = SynthesisOption::createCheckOption("Show Processor Details", false)
        
    public static val SynthesisOption FULLY_QUALIFIED_KIELER_PREFIX = SynthesisOption::createCheckOption("Show KIELER Qualified Name Prefix", false)
    public static val SynthesisOption FULLY_QUALIFIED_PROCESSOR_NAMES = SynthesisOption::createCheckOption("Show Long Processor Names", false)
    
    public static val SynthesisOption BUNDLE_EDGES = SynthesisOption::createCheckOption("Bundle Edges", false)
    
    
    val processorConnections = <String, Integer> newHashMap
    
    val systemMetaFirst = <System, String> newHashMap
    val systemMetaLast = <System, String> newHashMap
    
    override getDisplayedSynthesisOptions() {
        <SynthesisOption> newLinkedList => [
            add(SHOW_PROCESSOR_DETAILS)
            add(FULLY_QUALIFIED_KIELER_PREFIX)
            add(BUNDLE_EDGES)
        ]
    }    
    
    val idNodeMap = <String, KNode> newHashMap
    
    override transform(KiCoolSystemsSummary model) {
        val rootRootNode = model.createNode(0)
        val rootNode = model.createNode(1)
        processorConnections.clear
        
        rootRootNode.addLayoutParam(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID)
        rootRootNode.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
        rootRootNode.setLayoutOption(CoreOptions::DIRECTION, Direction.DOWN)
        rootNode.addLayoutParam(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID)
        rootNode.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
        rootNode.setLayoutOption(CoreOptions::DIRECTION, Direction.DOWN)
        
        if (BUNDLE_EDGES.booleanValue) {
            rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE, 200d)
            rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE_BETWEEN_LAYERS, 200d)
            rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE, 80d)
            rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_EDGE, 200d)
            rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_EDGE_BETWEEN_LAYERS, 200d)
            rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE_BETWEEN_LAYERS, 200d)
            rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_EDGE, 200d)
        } else {
            rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE, 80d)
            rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE_BETWEEN_LAYERS, 80d)
            rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE, 80d)
            rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_EDGE, 10d)
            rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_EDGE_BETWEEN_LAYERS, 10d)
            rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE_BETWEEN_LAYERS, 10d)
        }
        
        
        if (SHOW_PROCESSOR_DETAILS.booleanValue) {
            rootNode.children += model.createPGraph            
        } else {
            rootNode.children += model.createSystemNodes
            rootNode.children += model.createSystemsMetaModels
    //        rootNode.children += model.connectSystemPaths
            rootNode.children += model.connectReferencedSystems
        }
        
        rootNode.addRoundedRectangle(0, 0, 1) => [
            it.addAction(Trigger.DOUBLECLICK, KLIGHD_ACTION_DEFOCUS_NODE)
        ]
        
        rootRootNode.children += rootNode
        rootRootNode
    }
    
    def protected Collection<KNode> createSystemNodes(KiCoolSystemsSummary model) {
        val result = <KNode> newLinkedList
        
        for (s : model.systemList) {
            val node = s.createNode.toIdNodeMap(s.id) 
//            node.createPort("in") => [ node.ports += it ]
//            node.createPort("out") => [ node.ports += it ]
            
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
    
    
    def protected Collection<KNode> connectReferencedSystems(KiCoolSystemsSummary model) {
        val result = <KNode> newLinkedList
        
        for (s : model.systemList) {
            if (s.id.endsWith("esterel.scest.scl.simulation.netlist.java")) {
//                println("HERE")
            }            
            
            
            val fs = s.getFirstSystem
            if (fs === null) {
                val pfName = systemMetaFirst.get(s)
               pfName.createNewEdge(s.id)                
            } else {
                fs.id.createNewEdge(s.id)
            }
            
            val ls = s.getLastSystem
            if (ls === null) {
                val plName = systemMetaLast.get(s)
                s.id.createNewEdge(plName)                
            } else {
                s.id.createNewEdge(ls.id)
            }
        }
        
        return result
    }
    
    protected def createNewEdge(String sid, String tid) {
        sid.createEdge(tid) => [
            source = sid.getNodeById
            target = tid.getNodeById
            addPolyline => [
                addHeadArrowDecorator
                addJunctionPointDecorator
            ]
        ]
        
    }
    
    
    def protected createSystemsMetaModels(KiCoolSystemsSummary model) {
        val result = <KNode> newLinkedList
        
        for (s : model.systemList) {
            if (s.id.endsWith("esterel.scest.scl.simulation.netlist.java")) {
//                println("HERE")
            }
            val firstProcessor = s.getFirstProcessor
            val lastProcessor = s.getLastProcessor
            val pfTypes = firstProcessor.id.getModelTypes
            val plTypes = lastProcessor.id.getModelTypes
            val pfName = (pfTypes.source as Class<?>).name
            val plName = (plTypes.target as Class<?>).name
            
//            println(s.id + " | pf: " + pfName + " | pl : " + plName)
            
            result += createMetaModelNode(pfName, pfName.unqualified)
            result += createMetaModelNode(plName, plName.unqualified)
            
            systemMetaFirst.put(s, pfName)
            systemMetaLast.put(s, plName)
        }
        
        return result
    }   
    
    def protected createMetaModelNode(String id, String name) {
        val node = id.createNode.toIdNodeMap(id) 
        
        val content = node.addRoundedRectangle(4, 4, 2) => [
            setBackgroundGradient("#fdd".color, "#8f8".color, 90);
            foreground = "#000".color;
            it.addAction(Trigger.SINGLECLICK, KLIGHD_ACTION_FOCUS_NODE)
        ]
        
        content.addText(name) => [
            fontSize = 32;
            setGridPlacementData().from(LEFT, 32, 0, TOP, 28, 0).to(RIGHT, 32, 0, BOTTOM, 28, 0);
            suppressSelectability
        ]

        return node        
    }
    
    
    def protected Collection<KNode> connectSystemPaths(KiCoolSystemsSummary model) {
        val result = <KNode> newLinkedList
        
//        for (s : model.systemList) {
//            val rList = s.eAllContents.filter(ProcessorSystem).toList
//            for (p : rList) {
//                s.createEdge(p) => [
//                    source = s.id.getNodeById
//                    target = p.id.getNodeById
////                    sourcePort = source.getPort("out")
////                    targetPort = target.getPort("in")
//                    addPolyline => [
//                        addHeadArrowDecorator
//                        addJunctionPointDecorator
//                    ]
//                ]
//            }
//        }
        
        return result
    }
    
    
    
    
    
    def protected createPGraph(KiCoolSystemsSummary model) {
        val result = <KNode>newLinkedList

        val pGraph = new PGraph
        for (s : model.systemList) {
            pGraph.addSystem(s)
        }
        
        val pNodes = pGraph.pNodes + pGraph.metaNodes.values
        
        for (p : pNodes) {
            val node = p.createNode
            node.addLayoutParam(LayeredOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
            if (p.type == 0) {
                node.setMinimalNodeSize(34 * 3, 34 * 5); 
            } else {
                node.setMinimalNodeSize(34 * 12, 34 * 10);
            }
            val content = node.addRoundedRectangle(4, 4, 1) => [
                if (p.type == 0) {
                    setBackgroundGradient("#fff".color, "#aaf".color, 90);
                } else {
                    setBackgroundGradient("#fdd".color, "#8f8".color, 90);
                }
                foreground = "#000".color;
//                it.addAction(Trigger.SINGLECLICK, KLIGHD_ACTION_FOCUS_NODE)
            ]
            
            var text = p.id.kielerPrefix
            content.addText(text) => [
                fontSize = 64;
                // Add surrounding space
                setGridPlacementData().from(LEFT, 14, 0, TOP, 14, 0).to(RIGHT, 14, 0, BOTTOM, 14, 0);
                suppressSelectability
            ]
            
            result += node                
        }
        
        if (BUNDLE_EDGES.booleanValue) {
            var i = 0
            for (p : pNodes) {
                val succs = <PNode, Integer> newHashMap
                for (s : p.successors) {
                    succs.put(s, if (succs.containsKey(s)) succs.get(s) + 1 else 1)
                }
                for (s : succs.keySet) {
                    val pNode = p.node
                    val sNode = s.node
                    p.createEdge(s, i++) => [
                        source = pNode
                        target = sNode
                        sourcePort = pNode.createPort("out", it) => [ pNode.ports += it it.addLayoutParam(LayeredOptions.PORT_SIDE, PortSide.SOUTH)]
                        targetPort = sNode.createPort("in", it) => [ sNode.ports += it it.addLayoutParam(LayeredOptions.PORT_SIDE, PortSide.NORTH)]
                        addPolyline => [
                            addHeadArrowDecorator
                            addJunctionPointDecorator
                            lineWidth = (succs.get(s) * 7) as int
                            setForeground("#000".color, 75)
                        ]
//                        addLayoutParam(CoreOptions.PRIORITY, 100 - succs.get(s))
                    ]                
                }
            }
        } else {
            var i = 0
            for (p : pNodes) {
                for (s : p.successors) {
                    val pNode = p.node
                    val sNode = s.node
                    p.createEdge(s, i++) => [
                        source = pNode
                        target = sNode
                        sourcePort = pNode.createPort("out", it) => [ pNode.ports += it it.addLayoutParam(LayeredOptions.PORT_SIDE, PortSide.SOUTH)]
                        targetPort = sNode.createPort("in", it) => [ sNode.ports += it it.addLayoutParam(LayeredOptions.PORT_SIDE, PortSide.NORTH)]
                        addPolyline => [
                            addHeadArrowDecorator
                            addJunctionPointDecorator
                        ]
                    ]                
                }
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
    
    def private unqualified(String s) {
        return s.replaceAll("^.+\\.", "")
    }
    
    def private toIdNodeMap(KNode node, String id) {
        idNodeMap.put(id, node)
        return node
    }
    
    def private getNodeById(String id) {
        return idNodeMap.get(id)
    }
    
    
    
    static def dispatch ProcessorSystem getFirstSystem(ProcessorReference processor) {
        return null
    }

    static def dispatch ProcessorSystem getFirstSystem(ProcessorGroup processorGroup) {
        return processorGroup.processors.head.getFirstSystem
    }

    static def dispatch ProcessorSystem getFirstSystem(ProcessorAlternativeGroup processorGroup) {
        return processorGroup.processors.head.getFirstSystem
    }

    static def dispatch ProcessorSystem getFirstSystem(ProcessorSystem processorSystem) {
        return processorSystem
    }
    
    static def dispatch ProcessorSystem getFirstSystem(System system) {
        return system.processors.getFirstSystem
    }  


    static def dispatch ProcessorSystem getLastSystem(ProcessorReference processor) {
        return null
    }

    static def dispatch ProcessorSystem getLastSystem(ProcessorGroup processorGroup) {
        return processorGroup.processors.last.getLastSystem
    }

    static def dispatch ProcessorSystem getLastSystem(ProcessorAlternativeGroup processorGroup) {
        return processorGroup.processors.last.getLastSystem
    }

    static def dispatch ProcessorSystem getLastSystem(ProcessorSystem processorSystem) {
        return processorSystem
    }
    
    static def dispatch ProcessorSystem getLastSystem(System system) {
        return system.processors.getLastSystem
    }        
}

