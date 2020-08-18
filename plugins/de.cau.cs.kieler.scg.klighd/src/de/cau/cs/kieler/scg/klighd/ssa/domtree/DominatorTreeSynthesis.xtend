/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.klighd.ssa.domtree

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.processors.ssa.DominatorTree
import java.util.Map
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import de.cau.cs.kieler.klighd.SynthesisOption
import java.util.List

class DominatorTreeSynthesis extends AbstractDiagramSynthesis<SCGraphs> {
    
    @Inject
    extension SCGControlFlowExtensions
    @Inject
    extension SCGCoreExtensions
    @Inject
    extension KNodeExtensions

    @Inject
    extension KEdgeExtensions

    @Inject
    extension KRenderingExtensions

    @Inject
    extension AnnotationsExtensions

    @Inject
    extension KPolylineExtensions
    
    @Inject
    extension KContainerRenderingExtensions
    
    private static val EDGE_OPTIONS = #["Immediate Dominators", "Dominance Frontiers", "DFS Sequence", "BB Hierarchy"]
    
    /** Edge options */
    public static val SynthesisOption EDGES = SynthesisOption::createChoiceOption("Edges", EDGE_OPTIONS, EDGE_OPTIONS.head)
    
    override getDisplayedSynthesisOptions() {
        return newLinkedList(EDGES)
    }
    
    override transform(SCGraphs scgs) {
        createNode() => [
            for (scg : scgs.scgs) {
                children += scg.transform => [
                    addRectangle => [invisible = true]
                ]
            }
        ]
    }
    
    private def transform(SCGraph scg) {
        if (!scg.basicBlocks.nullOrEmpty) {
            return new DominatorTree(scg).transform
        } else {
            return createNode() => [
                children += createNode() => [
                    it.addRectangle() => [
                        it.invisible = true;
                        it.setGridPlacement(1);
                        //lower part is message
                        it.addRoundedRectangle(7, 7) => [
                            it.setGridPlacement(1);
                            it.lineWidth = 2;
                            //title
                            it.addText("Cannot create Dominator Tree!") => [
                                it.fontSize = 12;
                                it.setFontBold = true;
                                it.setGridPlacementData().from(LEFT, 8, 0, TOP, 8, 0).to(RIGHT, 8, 0, BOTTOM, 4, 0);
                                it.suppressSelectability;
                            ]
                            //message
                            it.addText("SCG does not contain any basic blocks.") => [
                                it.fontSize = 12;
                                it.setGridPlacementData().from(LEFT, 8, 0, TOP, 0, 0).to(RIGHT, 8, 0, BOTTOM, 4, 0);
                                it.suppressSelectability;
                            ]
                        ]
                    ]
                ]
            ]
        }
    }

    private def transform(DominatorTree dt) {
        val scg = dt.scg
        // Synthesize SCG
        val properties = new KlighdSynthesisProperties()
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_UPDATE_STRATEGY, SimpleUpdateStrategy.ID)
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
            "de.cau.cs.kieler.scg.klighd.diagramSynthesis")
        val subDiagramViewContext = LightDiagramServices::translateModel2(scg, usedContext, properties)
        usedContext.addChildViewContext(subDiagramViewContext)
        val scgDiagram = subDiagramViewContext.viewModel
        val tracker = new SourceModelTrackingAdapter();
        scgDiagram.eAdapters.add(tracker)
        val nodes = scg.basicBlocks.toInvertedMap[getDTNode(it, tracker)]
        nodes.entrySet.forEach[nodes.createDTEdge(value, key, dt)]

        val dtDiagram = createNode
        dtDiagram.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.mrtree")
        dtDiagram.addLayoutParam(CoreOptions::DIRECTION, Direction.DOWN)
        dtDiagram.children += nodes.values

        return dtDiagram
    }

    private def void createDTEdge(Map<BasicBlock, KNode> map, KNode node, BasicBlock bb, DominatorTree dt) {
        var List<Pair<KNode, KNode>> sourceTargetPairs = newLinkedList
        switch (EDGE_OPTIONS.indexOf(EDGES.objectValue)) {
            case 0: {
                sourceTargetPairs += new Pair(map.get(dt.idom(bb)), node)
            }
            case 1: {
                for (dFront: dt.getDominanceFrontiers(bb)) {
                    sourceTargetPairs += new Pair(node, map.get(dFront))
                }
            }
            case 2: {
                sourceTargetPairs += new Pair(map.get(dt.dfvertex(dt.dfnum(bb) - 1)), node)
            }
            case 3: {
                for (succ: dt.successors(bb)) {
                    sourceTargetPairs += new Pair(node, map.get(succ))
                }
            }
        }
        for (pair : sourceTargetPairs.filter[key !== null && value !== null]) {
            createEdge => [
                source = pair.key
                target = pair.value
                addPolyline => [
                    lineWidth = 3
                    it.addArrowDecorator
                ]
            ]
        }
    }

    private def KNode getDTNode(BasicBlock bb, SourceModelTrackingAdapter tracker) {
        val node = createNode
        node.addRectangle => [
            lineWidth = 3
        ]
        val bbNode = tracker.getTargetElements(bb).filter(KNode).head
        if (bbNode !== null) {
            bbNode.outgoingEdges.removeIf[
                val source = tracker.getSourceElement(target)
                return source instanceof BasicBlock || source === null
            ]
            node.children += bbNode
        } else {
            for (sb : bb.schedulingBlocks) {
                val sbNode = tracker.getTargetElements(sb).filter(KNode).head
                if (sbNode !== null) {
                    if (sbNode.outgoingEdges.map[target].map[tracker.getSourceElement(it)].filter(SchedulingBlock).
                        exists[!bb.schedulingBlocks.contains(it)]) {
                        sbNode.outgoingEdges.clear
                    }
                    node.children += sbNode
                } else {
                    for (n : sb.nodes) {
                        val nNode = tracker.getTargetElements(n).filter(KNode).head
                        if (n.allNext.exists[targetNode.basicBlock != bb]) {
                            nNode.outgoingEdges.removeIf [ edge |
                                !bb.schedulingBlocks.exists[nodes.contains(tracker.getSourceElement(edge.target))]
                            ]
                        }
                        node.children += nNode
                    }
                    node.addLayoutParam(CoreOptions::DIRECTION, Direction.DOWN)
                }
            }
        }
        return node
    }

}
