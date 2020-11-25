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
package de.cau.cs.kieler.scg.processors.add

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.BranchType
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Predecessor
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.UnsupportedSCGException
import de.cau.cs.kieler.scg.processors.SCGFeatures
import java.util.HashMap
import java.util.List
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.keffects.Dependency
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import info.scce.cfg.ControlFlowGraph
import de.cau.cs.kieler.scg.Assignment
import info.scce.cfg.AssignmentVertex
import info.scce.cfg.VertexType
import info.scce.cfg.ConditionVertex
import info.scce.cfg.Vertex

/** 
 * 
 * @author ssm
 * @kieler.design 2020-11-25 proposed 
 * @kieler.rating 2020-11-25 proposed yellow
 */

class ADDControlFlowGraph extends ExogenousProcessor<SCGraphs, ADDCFGWrapper> implements Traceable {

    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCGMethodExtensions
    
    protected val nodeMapping = <Node, Vertex> newHashMap
    protected var Node entryNode
    protected var Node exitNode
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.addcfg"
    }
    
    override getName() {
        "ADD CFG"
    }
    
    override process() {
        val ControlFlowGraph cfg = new ControlFlowGraph();
        
        model.scgs.head.transformSCGToAddControlFlowGraph(cfg)
        
        setModel(new ADDCFGWrapper => [ model = cfg ])
    }
    
    def void transformSCGToAddControlFlowGraph(SCGraph scg, ControlFlowGraph cfg) {
        var vertexNum = 0;
        val entryNode = scg.nodes.head.asEntry?.next.target
        val exitNode = scg.nodes.filter(Exit).head
        
        if (entryNode === null) return;
        
        for (n : scg.nodes.filter[ it instanceof Assignment || it instanceof Conditional ]) {
            val vType = if (n == entryNode) VertexType.START else VertexType.NORMAL
            val vDesc = if (n == entryNode) "st" else "" + vertexNum
            val v = switch(n) {
                Assignment: new AssignmentVertex(vDesc, vType)
                Conditional: new ConditionVertex(vDesc, vType)
            }
            vertexNum = vertexNum + 1
            
            if (n.hasAnnotation("cutPoint")) v.cutpoint = true
            
            cfg.addVertex(v)
            
            nodeMapping.put(n, v)
        }
        
        val te = new Vertex("te", VertexType.END)
        cfg.addVertex(te)
        nodeMapping.put(exitNode, te)
    }

  
}
