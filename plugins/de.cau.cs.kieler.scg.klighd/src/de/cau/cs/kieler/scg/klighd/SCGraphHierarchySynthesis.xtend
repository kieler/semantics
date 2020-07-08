/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.klighd

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.ui.klighd.KiCoDiagramViewProperties
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRoundedBendsPolyline
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.GuardDependency
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScheduleDependency
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.scg.extensions.SCGSerializeHRExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import de.cau.cs.kieler.scg.processors.analyzer.LoopAnalyzerV2
import de.cau.cs.kieler.scg.processors.analyzer.LoopData
import de.cau.cs.kieler.scg.processors.priority.PriorityAuxiliaryData
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.core.options.HierarchyHandling
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.emf.ecore.EObject

import static de.cau.cs.kieler.scg.klighd.ColorStore.Color.*
import static de.cau.cs.kieler.scg.klighd.SCGraphSynthesisOptions.*
import static de.cau.cs.kieler.scg.processors.SCGAnnotations.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author kolja
 * 
 */
class SCGraphHierarchySynthesis {

    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KPortExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGThreadExtensions
    @Inject extension SCGSerializeHRExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCGDependencyExtensions
    @Inject extension ColorStore
    @Inject extension SCGraphSynthesisHelper

    /** 
     * Constants for hierarchical node groups
     * Since hierarchy, basic blocks and scheduling blocks use the same mechanism to group nodes and draw hierarchical edges, 
     * use this constants to define the desired kind of group. 
     */
    static val int NODEGROUPING_HIERARCHY = 0
    static val int NODEGROUPING_BASICBLOCK = 1
    static val int NODEGROUPING_SCHEDULINGBLOCK = 2
    static val int NODEGROUPING_GUARDBLOCK = 3
    static val int NODEGROUPING_SCHEDULE = 4
    static val int NODEGROUPING_SCC = 5

    protected val HashMultimap<KNode, KNode> hierarchyAttachment = HashMultimap.create
    protected val Map<KNode, KNode> annotationNodeAttachments = <KNode, KNode>newHashMap

    /**
     * Apply any hierarchy if the corresponding option is set. Since layout of edges between nodes
     * in different hierarchies is not supported, the synthesis splits these edges at the hierarchy
     * border and connects them via a port. Thus, a kind of pseudo hierarchical edge layout is archived. 
     */
    def void applyHierarchy(SCGraph scg, KNode root, HashMap<Entry, ThreadPathType> threadTypes) {
        if (!SHOW_HIERARCHY.booleanValue) {
            return
        }
        
        if ((SHOW_BASICBLOCKS.booleanValue || SHOW_SCHEDULINGBLOCKS.booleanValue) && !scg.basicBlocks.nullOrEmpty) {
            root.setLayoutOption(LayeredOptions::HIERARCHY_HANDLING, HierarchyHandling.INCLUDE_CHILDREN)
        }
        
        scg.nodes.filter(typeof(Fork)).forEach [
            allNext.map[target].filter(typeof(Entry)).forEach [ entry |
                if (entry !== null) {
                    var label = ""
                    if (entry.hasAnnotation(ANNOTATION_LABEL)) {
                        label = entry.getStringAnnotationValue(ANNOTATION_LABEL)
                    } else {
                        label = entry.getStringAnnotationValue(ANNOTATION_REGIONNAME)
                    }
                    val REGION_LABEL = label
                    entry.getThreadNodes.createHierarchy(NODEGROUPING_HIERARCHY, null) => [
                        var text = ""
                        if(!REGION_LABEL.nullOrEmpty) text = REGION_LABEL
                        val threadPathType = threadTypes.get(entry)
                        if (threadPathType !== null) {
                            if(!REGION_LABEL.nullOrEmpty) text = text + " - "
                            text = text + threadPathType.toString2
                        }

                        var threadSegmentIDText = ""
                        if (entry.hasAnnotation(PriorityAuxiliaryData.THREAD_SEGMENT_ANNOTATION)) {
                            threadSegmentIDText = "ThreadID: " +
                                (entry.getAnnotation(
                                    PriorityAuxiliaryData.THREAD_SEGMENT_ANNOTATION) as IntAnnotation).value.toString
                            val labelTR = addOutsideTopLeftNodeLabel(threadSegmentIDText, 10,
                                KlighdConstants::DEFAULT_FONT_NAME) => [
                                it.KRendering.setForeground(REGION_LABEL.color)
                            ]
                            labelTR.KRendering.setProperty(SCGraphDiagramSynthesis.THREAD_PRIO_PROPERTY, true)
                        }

                        if (SHOW_POTENTIALPROBLEMS.booleanValue) {
                            // Workaround for fixing the massive whitespace: using centered labels
                            addInsideTopCenteredNodeLabel(text, 10, KlighdConstants::DEFAULT_FONT_NAME) => [
                                it.KRendering.setForeground(REGION_LABEL.color);
                            ]
                        }

                    ]
                }
            ]
        ]
    }

    def applyDependencyHierarchy(SCGraph scg) {
        if (!SHOW_HIERARCHY.booleanValue) {
            return
        }
        scg.nodes.filterNull.filter[dependencies.filter(GuardDependency).size > 0].forEach [
            val allNodes = it.dependencies.filter(GuardDependency).map[targetNode].toList
            val kContainer = allNodes.createHierarchy(NODEGROUPING_GUARDBLOCK, null)

            for (edge : kContainer.outgoingEdges.filter [
                getProperty(SCGraphDiagramSynthesis.GRAPH_DEPENDENCY) instanceof GuardDependency
            ].toList) {
                edge.targetPort.remove
                edge.remove
            }
            while (kContainer.incomingEdges.filter [
                getProperty(SCGraphDiagramSynthesis.GRAPH_DEPENDENCY) instanceof GuardDependency
            ].size > 1) {
                val edge = kContainer.incomingEdges.filter [
                    getProperty(SCGraphDiagramSynthesis.GRAPH_DEPENDENCY) instanceof GuardDependency
                ].get(1)
                edge.targetPort.remove
                kContainer.incomingEdges -= edge
                edge.remove
            }
            kContainer.incomingEdges.filter [
                getProperty(SCGraphDiagramSynthesis.GRAPH_DEPENDENCY) instanceof GuardDependency
            ].head?.getData(typeof(KRoundedBendsPolyline)).addHeadArrowDecorator
        ]
    }

    /**
     * Synthesizes the basic blocks.
     * 
     * @param scg
     *          the SCG containing the basic block information
     * @return Returns nothing.
     */
    def void synthesizeBasicBlocks(SCGraph scg) {

        val schedulingBlockMapping = new HashMap<SchedulingBlock, KNode>

        val bbContainerList = new HashMap<BasicBlock, KNode>()
        for (basicBlock : scg.basicBlocks) {
            if (SHOW_BASICBLOCKS.booleanValue) {
                val bbNodes = <Node>newLinkedList
                basicBlock.schedulingBlocks.forEach[bbNodes.addAll(it.nodes)]
                val bbContainer = bbNodes.createHierarchy(NODEGROUPING_BASICBLOCK, basicBlock).associateWith(basicBlock)
                bbContainerList.put(basicBlock, bbContainer)
                var bbName = basicBlock.schedulingBlocks.head.guards.head.valuedObject.name

                if (scg.hasAnnotation(ANNOTATION_GUARDCREATOR)) {
                    val guard = basicBlock.schedulingBlocks.head.guards.head
                    var String expText
                    if (basicBlock.deadBlock && (guard === null || guard.expression === null)) {
                        expText = "<null>"
                    } else {
                        val exp = guard.expression.copy
                        expText = serializeHR(exp) as String
                    }
                    bbName = bbName + "\n" + expText
                }

                bbName = bbName.replaceAll("_g", "g")
                bbName.createLabel(bbContainer).configureOutsideTopLeftNodeLabel(bbName, 9,
                    KlighdConstants::DEFAULT_FONT_NAME).KRendering.foreground = BASICBLOCKBORDER.color
            }
            if (SHOW_SCHEDULINGBLOCKS.booleanValue) {
                for (schedulingBlock : basicBlock.schedulingBlocks) {
                    val sbContainer = schedulingBlock.nodes.createHierarchy(NODEGROUPING_SCHEDULINGBLOCK,
                        schedulingBlock).associateWith(schedulingBlock)
                    schedulingBlockMapping.put(schedulingBlock, sbContainer)
                    var sbName = "<null>"
                    if (!schedulingBlock.label.nullOrEmpty) {
                        sbName = schedulingBlock.label + " "
                    }
                    if (schedulingBlock.guards.head !== null) {
                        if (schedulingBlock.guards.head.valuedObject.name != schedulingBlock.label) {
                            sbName = sbName + "(" + schedulingBlock.guards.head.valuedObject.name + ")" // reference.valuedObject.name
                        }
                    }

                    if (scg.hasAnnotation(ANNOTATION_GUARDCREATOR)) {
                        var expText = "<null>"
                        if (schedulingBlock.guards.head !== null /* && !schedulingBlock.basicBlock.deadBlock */ ) {
                            expText = serializeHR(schedulingBlock.guards.head.expression) as String
                        }
                        sbName = sbName + "\n" + expText
                    }

                    if (!SHOW_BASICBLOCKS.booleanValue ||
                        basicBlock.schedulingBlocks.size > 1) {
                        sbName = sbName.replaceAll("_g", "g")
                        sbName.createLabel(sbContainer).associateWith(schedulingBlock).
                            configureOutsideTopLeftNodeLabel(sbName, 9, KlighdConstants::DEFAULT_FONT_NAME).
                            KRendering.foreground = SCHEDULINGBLOCKBORDER.color
                    }

                    if (basicBlock.deadBlock) {
                        sbContainer.getData(typeof(KRoundedRectangle)) => [
                            it.lineStyle = LineStyle::SOLID
                            it.foreground = SCHEDULING_DEADCODE.color
                        ]
                        sbContainer.KRendering.background = SCHEDULING_DEADCODE.color
                        sbContainer.KRendering.background.alpha = 128

                        if (!SHOW_DEAD_BLOCKS.booleanValue) {
                            sbContainer.children.clear
                            sbContainer.remove
                        }
                    } else if (basicBlock.termBlock) {
                        sbContainer.getData(KRoundedRectangle) => [
                            it.lineWidth = 2.0f
                        ]
                    }

                    if (schedulingBlock.basicBlock.finalBlock &&
                        schedulingBlock.basicBlock.schedulingBlocks.head == schedulingBlock) {
                        sbContainer.KRendering.lineStyle = LineStyle::DASH
                        sbContainer.KRendering.foreground = PASSIVE_REGION_COLOR.color
                        sbContainer.KRendering.background = PASSIVE_REGION_COLOR.color
                        sbContainer.KRendering.background.alpha = 96
                    }
                }
            }
        }
    }
    
    def void synthesizeScheduleGroups(SCGraph scg) {
        if (!scg.hasSchedulingData) return;
        
        val schedules = <List<Node>> newArrayList

        for (node : scg.nodes.filter[ incomingLinks.filter(ScheduleDependency).empty && incomingLinks.filter(GuardDependency).empty ]) {
            val newSchedule = <Node> newArrayList => [ s | 
                s += node
                node.dependencies.filter(GuardDependency).forEach[ s += it.targetNode ]
            ]
            var next = node.dependencies.filter(ScheduleDependency).head?.targetNode
            while (next !== null) {
                newSchedule += next
                next.dependencies.filter(GuardDependency).forEach[ newSchedule += it.targetNode ]
                next = next.dependencies.filter(ScheduleDependency).head?.targetNode
            }            
            
            schedules += newSchedule
        }        
        
        System.out.println("Schedules " + schedules.size)
        for(schedule : schedules) {
            schedule.createHierarchy(NODEGROUPING_SCHEDULE, null)
        }        
    }

    def void synthesizeSCCInGuardSCG(SCGraph scg) {
        val rootModel = scg.eContainer
        var LoopData ld = null;

        val compilationContext = synthesis.usedContext.getProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT)
        if (compilationContext !== null) {
            val scgs = scg.eContainer
            if (scgs !== null) {
                ld = compilationContext.getResultForModel(scgs)?.getProperty(LoopAnalyzerV2.LOOP_DATA, rootModel)
            }
        }

        if(ld === null) return;

        for (l : ld.loops) {
            val guardedNodes = <Node>newHashSet
            for (n : l.criticalNodes.filter[it !== null]) {
                for (gd : n.dependencies.filter(GuardDependency)) {
                    guardedNodes += gd.target as Node
                }
            }

            createHierarchy((l.criticalNodes + guardedNodes).toList, NODEGROUPING_SCC, scg)
        }
    }

    /**
     * This method takes a list of nodes and creates a new container around them. 
     * All edges between nodes inside this container and nodes on the outside of the container a split up
     * and connected via ports on the container border. 
     * 
     * @param nodes
     *          the list of nodes that should be includes in the hierarchy
     * @param
     *          the kindof grouping that should be applied.
     * @return Returns the container KNode.
     */
    private def KNode createHierarchy(List<Node> nodes, int nodeGrouping, EObject contextObject) {

        // Gather mandatory information.
        val firstNode = nodes.head
        val kParent = firstNode.node.eContainer as KNode
        val kContainer = firstNode.createNode("hierarchy" + nodeGrouping.toString)
        val kNodeList = new ArrayList<KNode>
        nodes.forEach [ e |
            kNodeList.add(e.node)
            val attachments = hierarchyAttachment.get(e.node)
            if (!attachments.empty) {
                attachments.forEach[kNodeList += it]
            }
            val annotationNode = annotationNodeAttachments.get(e.node)
            if (annotationNode !== null) {
                kNodeList += annotationNode
            }
        ]

        // Set options for the container.
        if (topdown())
            kContainer.addLayoutParam(CoreOptions::DIRECTION, Direction::DOWN)
        else
            kContainer.addLayoutParam(CoreOptions::DIRECTION, Direction::RIGHT)
        kContainer.addLayoutParam(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
        kContainer.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
        kContainer.addLayoutParam(CoreOptions::SEPARATE_CONNECTED_COMPONENTS,
            LAYOUT_SEPARATE_CC.booleanValue);
        kContainer.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FREE);
        if (USE_ADAPTIVEZOOM.booleanValue)
            kContainer.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.10);

        if (nodeGrouping == NODEGROUPING_HIERARCHY) {
            kContainer.addRoundedRectangle(5, 5, 0)
            kContainer.KRendering.foreground = SCCHARTSBLUE.color;
            kContainer.KRendering.foreground.alpha = Math.round(
                HIERARCHY_TRANSPARENCY.objectValue as Float)
            kContainer.KRendering.background = SCCHARTSBLUE.color;
            kContainer.KRendering.background.alpha = Math.round(
                HIERARCHY_TRANSPARENCY.objectValue as Float)
        }
        if (nodeGrouping == NODEGROUPING_BASICBLOCK) {
            kContainer.addRoundedRectangle(1, 1, 1) => [
                lineStyle = LineStyle::SOLID
                associateWith(contextObject)
            ]
            kContainer.KRendering.foreground = BASICBLOCKBORDER.color;
            kContainer.KRendering.foreground.alpha = Math.round(255f)
            kContainer.KRendering.background = SCCHARTSBLUE.color;
            kContainer.KRendering.background.alpha = Math.round(0f)
        }
        if (nodeGrouping == NODEGROUPING_SCHEDULINGBLOCK) {
            kContainer.addRoundedRectangle(1, 1, 1) => [
                lineStyle = LineStyle::SOLID
                associateWith(contextObject)
            ]
            kContainer.KRendering.foreground = SCHEDULINGBLOCKBORDER.color;
            kContainer.KRendering.foreground.alpha = Math.round(255f)
            kContainer.KRendering.background = SCCHARTSBLUE.color;
            kContainer.KRendering.background.alpha = Math.round(0f)
        }
        if (nodeGrouping == NODEGROUPING_GUARDBLOCK) {
            kContainer.addRoundedRectangle(1, 1, 1) => [
                lineStyle = LineStyle::SOLID
                associateWith(contextObject)
            ]
            kContainer.KRendering.foreground = DEPENDENCY_GUARD.color;
            kContainer.KRendering.foreground.alpha = Math.round(255f)
            kContainer.KRendering.background = DEPENDENCY_GUARD.color;
            kContainer.KRendering.background.alpha = Math.round(80f)
        }
        if (nodeGrouping == NODEGROUPING_SCHEDULE) {
            kContainer.addRoundedRectangle(1, 1, 2) => [
                lineStyle = LineStyle::SOLID
                associateWith(contextObject)
            ]
            kContainer.KRendering.foreground = SCHEDULEBORDER.color;
            kContainer.KRendering.foreground.alpha = Math.round(196f)
            kContainer.KRendering.background = SCCHARTSBLUE.color;
            kContainer.KRendering.background.alpha = Math.round(0f)
        }
        if (nodeGrouping == NODEGROUPING_SCC) {
            kContainer.addRoundedRectangle(1, 1, 2) => [
                lineStyle = LineStyle::SOLID
                associateWith(contextObject)
            ]
            kContainer.KRendering.foreground = SCHEDULINGBLOCKBORDER.color;
            kContainer.KRendering.foreground.alpha = Math.round(196f)
            kContainer.KRendering.background = SCCHARTSBLUE.color;
            kContainer.KRendering.background.alpha = Math.round(0f)
        }

        // Add the nodes to the container.
        // They will be removed from the original parent!
        for (tn : kNodeList) {
            kContainer.children += tn
        }

        // Add the container to the original parent.
        if(kParent !== null) kParent.children += kContainer

        // Determine all interleaving edges...       
        val iSecEdges = new ArrayList<KEdge>
        for (rc : kNodeList) {
            iSecEdges.addAll(rc.outgoingEdges.filter[!kNodeList.contains(it.target)])
            iSecEdges.addAll(rc.incomingEdges.filter[!kNodeList.contains(it.source)])
        }
        // ... and split them up. This is done by re-routing the edge. The source of the edge is now the
        // container. A new edge is then created to attach the original source with the corresponding 
        // port on the border of the container.
        for (ne : iSecEdges) {
            val portName = SCGraphSynthesisHelper.SCGPORTID_HIERARCHYPORTS + ne.hashCode.toString +
                nodeGrouping.toString + ne.source.hashCode.toString + kContainer.hashCode.toString

            val hPort = kContainer.addHelperPort(portName)
            val origSource = ne.source
            val origSourcePort = ne.sourcePort
            ne.source = kContainer
            ne.sourcePort = hPort
            val newEdge = ne.semanticObject.createNewEdge()
            newEdge.source = origSource
            newEdge.sourcePort = origSourcePort
            newEdge.target = kContainer
            newEdge.targetPort = kContainer.getPort(portName)
            newEdge.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
            if (USE_ADAPTIVEZOOM.booleanValue)
                newEdge.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.50)
            newEdge.addRoundedBendsPolyline(8, CONTROLFLOW_THICKNESS.floatValue) => [
                it.lineStyle = ne.KRendering.lineStyleValue
                it.foreground = ne.KRendering.foreground
            ]
            newEdge.labels.addAll(ne.labels)

            // Save edge properties
            if (ne.getProperty(SCGraphDiagramSynthesis.GRAPH_DEPENDENCY) !== null) {
                newEdge.setProperty(SCGraphDiagramSynthesis.GRAPH_DEPENDENCY,
                    ne.getProperty(SCGraphDiagramSynthesis.GRAPH_DEPENDENCY))
            }

        }
        kContainer
    }
}
