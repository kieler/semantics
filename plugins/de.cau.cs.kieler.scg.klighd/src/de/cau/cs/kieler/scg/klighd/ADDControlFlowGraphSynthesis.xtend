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

import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGSerializeHRExtensions
import info.scce.cfg.AssignmentEdge
import info.scce.cfg.ConditionEdge
import info.scce.cfg.ControlFlowGraph
import javax.inject.Inject
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.alg.layered.options.LayeringStrategy
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.alg.layered.options.LayerConstraint

/**
 * @author ssm
 *
 */
class ADDControlFlowGraphSynthesis extends AbstractDiagramSynthesis<ControlFlowGraph> {
  
    @Inject extension SCGControlFlowExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension KNodeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KLabelExtensions
    @Inject extension KPortExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    @Inject extension SCGSerializeHRExtensions
    @Inject extension CommonSynthesisUtil
    
    var int nodeNum = 0;
    
    override transform(ControlFlowGraph model) {
        val node = createNode
        
        node.setLayoutOption(CoreOptions::DIRECTION, Direction::DOWN)
        node.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
        node.setLayoutOption(LayeredOptions::LAYERING_STRATEGY, LayeringStrategy::LONGEST_PATH)
        node.setLayoutOption(LayeredOptions::SPACING_NODE_NODE_BETWEEN_LAYERS, 5d)
        node.setLayoutOption(LayeredOptions::SPACING_NODE_NODE, 5d)
        node.setLayoutOption(LayeredOptions::EDGE_ROUTING_SPLINES_SLOPPY_LAYER_SPACING_FACTOR, 0.5d)
        
        nodeNum = 0;
        (model as ControlFlowGraph).transformControlFlowGraph(node);
        
        node
    }
    
    def transformControlFlowGraph(ControlFlowGraph cfg, KNode rootKNode) {
        val vertices = cfg.getVertexList
        val cutPoints = cfg.getCutpoints
        
        for (v : vertices) {
            val knode = v.createNode() => [
                rootKNode.children.add(it)
            ]
            knode.setKID(v.toString)
            
            val nodeLabel = 
                if (v == cfg.startVertex) "st" else 
                if (v == cfg.endVertex) "te" else
                "" + nodeNum  
            nodeNum = nodeNum + 1        
            
            if (v == cfg.startVertex) {
                knode.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::FIRST)
            }    
            
            val figure = knode.addRoundedRectangle(20f, 20f, 1f) => [
                associateWith(node)
                knode.setMinimalNodeSize(20f, 20f)
                it.addText(nodeLabel).associateWith(node).setSurroundingSpace(4, 0.1f, 2, 0) 
                
                if (cutPoints.contains(v)) background = "#88d".color
                
                
            ]                
        }
        
        for (v : vertices) {
            val outgoingEdges = v.getOutgoingEdges();
            for (e : outgoingEdges) {
                val edge = createEdge()
                edge.setKID(v.toString + e.toString)
                edge.source = v.getNode
                edge.target = e.targetVertex.getNode
                edge.addSpline => [
                    lineWidth = 1;
                    foreground = "#000".color
                    addArrowDecorator
                ]   
                if (e instanceof AssignmentEdge) {
                    edge.createLabel.configureCenterEdgeLabel(e.getAssignment.toString, 9, KlighdConstants::DEFAULT_FONT_NAME)
                }
                if (e instanceof ConditionEdge) {
                    edge.createLabel.configureCenterEdgeLabel(e.getCondition.toString, 9, KlighdConstants::DEFAULT_FONT_NAME)
                }                 
            }
        }
    }
    
}