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

import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.scg.SCGraphs
import javax.inject.Inject
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.scg.extensions.SCGSerializeHRExtensions
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.alg.layered.options.LayeringStrategy
import info.scce.cfg.ControlFlowGraph
import info.scce.cfg.Vertex
import de.cau.cs.kieler.scg.processors.add.ADDCFGWrapper
import com.google.inject.Guice
import com.google.inject.Module
import com.google.inject.Binder
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import com.google.inject.Scopes

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
            
            val nodeLabel = 
                if (v == cfg.startVertex) "st" else 
                if (v == cfg.endVertex) "te" else
                "" + nodeNum  
            nodeNum = nodeNum + 1            
            
            val figure = knode.addRoundedRectangle(20f, 20f, 1f) => [
                associateWith(node)
                knode.setMinimalNodeSize(20f, 20f)
                it.addText(nodeLabel).associateWith(node).setSurroundingSpace(4, 0.1f, 2, 0) 
                
                if (cutPoints.contains(v)) background = "#88d".color
            ]                
        }
    }
    
    def transformProgramGraph(SCGraph scg, KNode rootKNode) {
        
        val visited = <Node> newHashSet
        val nodeList = newLinkedList => [ it.push(scg.nodes.head.allNext.head.target as Node) ]
        
        while (!nodeList.empty) {
            val node = nodeList.pop
            visited += node
            val knode = node.createNode => [
                rootKNode.children.add(it)
            ]
            
            val nextNodes = node.allNext.toList
            
            val nodeLabel = 
                if (nodeNum == 0) "st" else 
                if (nextNodes.size == 0) "te" else
                "" + nodeNum  
            if (nextNodes.size != 0) nodeNum = nodeNum + 1
            
            val cutPoint = node.hasAnnotation("cutPoint") || nextNodes.size == 0
            
            val figure = knode.addRoundedRectangle(20f, 20f, 1f) => [
                associateWith(node)
                knode.setMinimalNodeSize(20f, 20f)
                it.addText(nodeLabel).associateWith(node).setSurroundingSpace(4, 0.1f, 2, 0) 
                
                if (cutPoint) background = "#88d".color
            ]            
            
            nextNodes.map[target].filter(Node).forEach[ 
                if (!visited.contains(it))
                if (it instanceof Assignment || it instanceof Conditional || it instanceof Exit) 
                nodeList.push(it)
            ]
        }
        
        for (node : visited) {
            for (prevNode : node.allNext.map[target].filter(Node)) {
                val edge = createEdge()
                edge.source = node.getNode
                edge.target = prevNode.getNode
                edge.addSpline => [
                    lineWidth = 1;
                    foreground = "#000".color
                    addArrowDecorator
                ]                
                switch(node) {
                    Assignment: {
                        edge.createLabel.configureCenterEdgeLabel(serializeHR(node) as String, 9, KlighdConstants::DEFAULT_FONT_NAME)       
                    }
                    Conditional: {
                        if ((node.then.target as Node).getNode === prevNode.getNode) {
                            edge.createLabel.configureCenterEdgeLabel(serializeHR(node.condition) as String, 9, KlighdConstants::DEFAULT_FONT_NAME)                        
                        } else {
                            edge.createLabel.configureCenterEdgeLabel("!(" + serializeHR(node.condition) as String + ")", 9, KlighdConstants::DEFAULT_FONT_NAME)
                        }
                    }
                }
            }
        }

    }        
        
}