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
import com.google.inject.Guice
import com.google.inject.Module
import com.google.inject.Binder
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import com.google.inject.Scopes
import info.scce.cfg.ConditionEdge
import info.scce.cfg.AssignmentEdge
import de.cau.cs.kieler.scg.processors.add.SymbolicExecuterWrapper
import de.cau.cs.kieler.scg.processors.add.SymbolicExecuterStages
import info.scce.addlib.dd.xdd.XDD
import info.scce.cfg.generator.DotGeneratorExpressionDAG
import info.scce.cfg.condition.ConditionNode
import info.scce.cfg.term.TermNode
import info.scce.cfg.condition.BinaryConditionCompareNode
import info.scce.cfg.condition.BinaryConditionNode
import info.scce.cfg.condition.LeafConditionNode
import info.scce.cfg.term.BinaryTermNode
import info.scce.cfg.expression.ExpressionNode
import de.cau.cs.kieler.klighd.krendering.KLineStyle
import de.cau.cs.kieler.klighd.krendering.LineStyle
import info.scce.cfg.xdd.ParallelAssignment
import de.cau.cs.kieler.klighd.SynthesisOption

/**
 * @author ssm
 *
 */
class ADDSymbolicExecuterSynthesis extends AbstractDiagramSynthesis<SymbolicExecuterWrapper> {
  
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
    
    static val SynthesisOption CONNECT_ADDS = SynthesisOption::createCheckOption("Connect ADDs", true);
    
    override getDisplayedSynthesisOptions() {
        return newLinkedList(
            SynthesisOption::createSeparator("Visibility"),
            CONNECT_ADDS
            )
    }    
    
    var int dupXDDNum = 0;
    
    override transform(SymbolicExecuterWrapper model) {
        val node = createNode
        
        node.setLayoutOption(CoreOptions::DIRECTION, Direction::DOWN)
        node.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
        node.setLayoutOption(LayeredOptions::LAYERING_STRATEGY, LayeringStrategy::LONGEST_PATH)
        node.setLayoutOption(LayeredOptions::SPACING_NODE_NODE_BETWEEN_LAYERS, 20d)
        node.setLayoutOption(LayeredOptions::SPACING_NODE_NODE, 5d)
        node.setLayoutOption(LayeredOptions::EDGE_ROUTING_SPLINES_SLOPPY_LAYER_SPACING_FACTOR, 0.2d)

        if (model.stage == SymbolicExecuterStages.CUTPOINTS) model.transformCutpoints(node)
        if (model.stage == SymbolicExecuterStages.ADDS) model.transformADDs(node)        
        if (model.stage == SymbolicExecuterStages.ED) model.transformED(node)                
        node.children.add(createNode)
        
        node
    }
    
    def transformCutpoints(SymbolicExecuterWrapper model, KNode rootKNode) {
        for (cp : model.executer.cutpointToLeafs.keySet) {
            val info = model.executer.cutpointToLeafs.get(cp)
            
            val knode = cp.createNode() => [
                rootKNode.children.add(it)
                setKID(cp.toString)
            ]
            
            val nodeLabel = cp
            
            val figure = knode.addRoundedRectangle(20f, 20f, 1f) => [
                associateWith(node)
                knode.setMinimalNodeSize(20f, 20f)
                it.addText(nodeLabel).associateWith(node).setSurroundingSpace(4, 0.1f, 2, 0) 
                background = "#88d".color
            ]                
        }
        
        val teNode = "te".createNode() => [
            rootKNode.children.add(it)
            setKID("te")
        ]
        val figure = teNode.addRoundedRectangle(20f, 20f, 1f) => [
            associateWith(node)
            teNode.setMinimalNodeSize(20f, 20f)
            it.addText("te").associateWith(node).setSurroundingSpace(4, 0.1f, 2, 0) 
            background = "#88d".color
        ]     

        for (cp : model.executer.cutpointToLeafs.keySet) {
            val info = model.executer.cutpointToLeafs.get(cp)
            for (i : info) {
                var label = i.pathCondition.toString + " \n { " +
                    i.assignments.join(", \n    ") + " }"
                    
                val edge = createEdge()
                edge.setKID(cp.toString + i.targetCutpoint.toString)
                edge.source = cp.getNode
                edge.target = i.targetCutpoint.getNode
                edge.addSpline => [
                    lineWidth = 1;
                    foreground = "#000".color
                    addArrowDecorator
                ]                    
                edge.createLabel.configureCenterEdgeLabel(label, 9, KlighdConstants::DEFAULT_FONT_NAME)                
            }
         }

    }
    
    def transformADDs(SymbolicExecuterWrapper model, KNode rootKNode) {
        val xddMap = model.executer.labelXDDMap   
        for (node : xddMap.keySet) {
            
            val n = node.createNode
            n.setKID(node.toString)
            val figure = n.addRectangle() => [
                associateWith(n)
                n.setMinimalNodeSize(20f, 20f)
                it.addText(node).associateWith(n).setSurroundingSpace(4, 0.1f, 2, 0)
                it.foreground.color = "#fff".color
                
            ]   
            rootKNode.children.add(n)
        }
        
        if (CONNECT_ADDS.booleanValue) {
            val n = "te".createNode
            n.setKID("te")
            val figure = n.addRectangle() => [
                associateWith(n)
                n.setMinimalNodeSize(20f, 20f)
                it.addText("te").associateWith(n).setSurroundingSpace(4, 0.1f, 2, 0)
                it.foreground.color = "#fff".color
                
            ]   
            rootKNode.children.add(n)
        }        
                       
        for (node : xddMap.keySet) {
            
            val xdd = xddMap.get(node)
            xdd.transformXDD(rootKNode)
            node.createXDDEdge(xdd, XDDEdge.SOLID)            
        }     
    }
    
    def transformXDD(XDD xdd, KNode kNode) {
        val node = xdd.createNode
        node.setKID(xdd.toString)
        if (xdd.isConstant) {
            val v = xdd.v as ParallelAssignment
            val label = v.assignments.join(", \n")
            val figure = node.addRectangle() => [
                associateWith(node)
                node.setMinimalNodeSize(20f, 20f)
                it.addText(label).associateWith(node).setSurroundingSpace(4, 0.1f, 2, 0) 
            ]                  
            // xdd.v.getTargetVertex
            // xdd.v.getAssignments
            if (v instanceof ParallelAssignment) {
                if (CONNECT_ADDS.booleanValue) {
                    xdd.createXDDEdge(v.targetVertex, XDDEdge.DOTTED)
                } else {
                    val pair = new Pair<String, Integer>(v.targetVertex, dupXDDNum)
                    val n = pair.createNode
                    n.setKID(pair.toString)
                    dupXDDNum = dupXDDNum + 1
                    val f = n.addRectangle() => [
                        associateWith(n)
                        n.setMinimalNodeSize(20f, 20f)
                        it.addText(v.targetVertex).associateWith(n).setSurroundingSpace(4, 0.1f, 2, 0)
                        it.foreground.color = "#fff".color
                        
                    ]
                    kNode.children.add(n)
                    xdd.createXDDEdge(pair, XDDEdge.DOTTED)                      
                }  
            }      
        } else {
            val figure = node.addRoundedRectangle(20f, 20f, 1f) => [
                associateWith(node)
                node.setMinimalNodeSize(20f, 20f)
                it.addText(xdd.readName).associateWith(node).setSurroundingSpace(4, 0.1f, 2, 0) 
            ]                          
            
            val elseXDD = xdd.e.transformXDD(kNode)
            val trueXDD = xdd.t.transformXDD(kNode)
            
            xdd.createXDDEdge(trueXDD, XDDEdge.SOLID)
            xdd.createXDDEdge(elseXDD, XDDEdge.DASHED)                              
        }
        
        kNode.children.add(node)
        
        xdd
    }
    
    def createXDDEdge(Object source, Object target, XDDEdge edgeType) {
        val edge = createEdge()
        edge.setKID(source.toString + target.toString)
        edge.source = source.getNode
        edge.target = target.getNode
        edge.addSpline => [
            lineWidth = 1;
            foreground = "#000".color
            addArrowDecorator
            if (edgeType == XDDEdge.DASHED) lineStyle = LineStyle.DASH
            if (edgeType == XDDEdge.DOTTED) lineStyle = LineStyle.DOT 
        ]
        edge               
    }    
    
    
    
    def transformED(SymbolicExecuterWrapper model, KNode rootKNode) {
        val ed = model.expressionDAG
        
        val dot = new DotGeneratorExpressionDAG(ed, "")        
        
        for(exp : ed.allPredicates + ed.allSubexpressions) {
            val label = switch(exp) {
                    ConditionNode: dot.conditionNodeToDotLabel(exp)
                    TermNode: dot.termNodeToDotLabel(exp) 
                }

            val node = exp.createNode
            node.setKID(exp.toString)
            
            val isOperator = exp instanceof BinaryConditionCompareNode ||
                             exp instanceof BinaryConditionNode ||
                             exp instanceof BinaryTermNode
            
            val figure = (if (isOperator) node.addRoundedRectangle(20f, 20f, 1f) else node.addRectangle()) 
            => [
                associateWith(node)
                node.setMinimalNodeSize(20f, 20f)
                it.addText(label).associateWith(node).setSurroundingSpace(4, 0.1f, 2, 0) 
            ]       
            
            rootKNode.children.add(node)
        }

        for(exp : ed.allPredicates + ed.allSubexpressions) {
            
            switch(exp) {
                BinaryConditionCompareNode: {
                    exp.createEDEdge(exp.left)
                    exp.createEDEdge(exp.right)                  
                } 
                BinaryConditionNode: {
                    exp.createEDEdge(exp.left)
                    exp.createEDEdge(exp.right)                  
                }
                BinaryTermNode: {
                    exp.createEDEdge(exp.left)
                    exp.createEDEdge(exp.right)                  
                    
                }
            }
        }
        
    }
    
    def createEDEdge(ExpressionNode source, ExpressionNode target) {
        val edge = createEdge()
        edge.setKID(source.toString + target.toString)
        edge.source = source.getNode
        edge.target = target.getNode
        edge.addSpline => [
            lineWidth = 1;
            foreground = "#000".color
            addArrowDecorator
        ]               
    }
    
}
