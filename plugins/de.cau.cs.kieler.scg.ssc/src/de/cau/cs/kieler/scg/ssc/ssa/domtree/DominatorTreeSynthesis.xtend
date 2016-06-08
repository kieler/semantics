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
package de.cau.cs.kieler.scg.ssc.ssa.domtree

import com.google.inject.Inject
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.util.Pair
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import java.util.List
import java.util.Map

class DominatorTreeSynthesis extends AbstractDiagramSynthesis<DominatorTreeModel> {
    @Inject
    extension SCGControlFlowExtensions
    @Inject
    extension SCGCoreExtensions
    @Inject
    extension KNodeExtensions

    @Inject
    extension KEdgeExtensions
//
//    @Inject
//    extension KLabelExtensions
    @Inject
    extension KRenderingExtensions

    @Inject
    extension KContainerRenderingExtensions

    @Inject
    extension KPolylineExtensions
    
    override getDisplayedLayoutOptions() {
        return newLinkedList(
            new Pair<IProperty<?>, List<?>>(LayoutOptions::SPACING, newArrayList(0, 150))
        )
    }
//
//    @Inject
//    extension KColorExtensions
    override transform(DominatorTreeModel dtm) {
        val dt = dtm.dominatorTree
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
        dtDiagram.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.tree")
        dtDiagram.addLayoutParam(LayoutOptions::DIRECTION, Direction.DOWN)
        dtDiagram.children += nodes.values

        return dtDiagram
    }

    def void createDTEdge(Map<BasicBlock, KNode> map, KNode node, BasicBlock bb, DominatorTree dt) {
        val idom = dt.idom(bb)
        if (idom != null) {
            createEdge => [
                source = map.get(idom)
                target = node
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
        if (bbNode != null) {
            bbNode.outgoingEdges.removeIf[
                val source = tracker.getSourceElement(target)
                return source instanceof BasicBlock || source == null
            ]
            node.children += bbNode
        } else {
            for (sb : bb.schedulingBlocks) {
                val sbNode = tracker.getTargetElements(sb).filter(KNode).head
                if (sbNode != null) {
                    if (sbNode.outgoingEdges.map[target].map[tracker.getSourceElement(it)].filter(SchedulingBlock).
                        exists[!bb.schedulingBlocks.contains(it)]) {
                        sbNode.outgoingEdges.clear
                    }
                    node.children += sbNode
                } else {
                    for (n : sb.nodes) {
                        val nNode = tracker.getTargetElements(n).filter(KNode).head
                        if (n.allNext.exists[target.basicBlock != bb]) {
                            nNode.outgoingEdges.removeIf [ edge |
                                !bb.schedulingBlocks.exists[nodes.contains(tracker.getSourceElement(edge.target))]
                            ]
                        }
                        node.children += nNode
                    }
                    node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered")
                    node.addLayoutParam(LayoutOptions::DIRECTION, Direction.DOWN)
                }
            }
        }
        return node
    }

}
