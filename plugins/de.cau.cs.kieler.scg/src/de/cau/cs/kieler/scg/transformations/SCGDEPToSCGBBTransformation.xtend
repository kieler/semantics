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
package de.cau.cs.kieler.scg.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGCopyExtensions
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.scgbb.BasicBlock
import de.cau.cs.kieler.scgbb.SCGraphBB
import de.cau.cs.kieler.scgbb.ScgbbFactory
import de.cau.cs.kieler.scgbb.SchedulingBlock
import de.cau.cs.kieler.scgdep.Dependency
import de.cau.cs.kieler.scgdep.SCGraphDep
import java.util.ArrayList
import java.util.List
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scgbb.BlockType

/** 
 * SCGDEP to SCGBB Transformation 
 * 
 * @author ssm
 * @kieler.design 2013-10-24 proposed 
 * @kieler.rating 2013-10-24 proposed yellow
 */

// This class contains all mandatory methods for the SCGDEP-to-SCGBB-Transformation.
class SCGDEPToSCGBBTransformation {
    
    // Inject SCG Extensions.    
    @Inject
    extension SCGExtensions
    
    @Inject 
    extension SCGCopyExtensions
         
    // -------------------------------------------------------------------------
    // -- M2M Transformation 
    // -------------------------------------------------------------------------
    
    def SCGraphBB transformSCGDEPToSCGBB(SCGraphDep scgdep) {
        // Create new SCGDEP...
        val scgbb = ScgbbFactory::eINSTANCE.createSCGraphBB()

        scgdep.copySCG(scgbb)                  

        // Create GO signal
//        val go = KExpressionsFactory::eINSTANCE.createValuedObject
//        go.name = '_GO'
//        go.type = ValueType::BOOL;
//        scgbb.valuedObjects.add(go)
        
        // Create basic blocks.
        scgbb.createBasicBlocks(scgbb.nodes.head, 0)
        
        return scgbb;
    }   
    

    // -------------------------------------------------------------------------
    // -- CREATE Basic Blocks 
    // -------------------------------------------------------------------------
     def int createBasicBlocks(SCGraphBB scg, Node rootNode, int guardIndex) {
        val predecessorBlocks = <BasicBlock> newLinkedList
        createBasicBlocks(scg, rootNode, guardIndex, predecessorBlocks)        
    }   
        
    def int createBasicBlocks(SCGraphBB scg, Node rootNode, int guardIndex, List<BasicBlock> predecessorBlocks
    ) {
        var newIndex = guardIndex
        var node = rootNode
        
        val List<Node> nodes = new ArrayList<Node> => [ n |
            scg.basicBlocks.forEach[bb|bb.schedulingBlocks.forEach[sb|n.addAll(sb.nodes)]]
        ]
        if (nodes.contains(rootNode)) {
            
            return newIndex;
        }
        
        val guard = KExpressionsFactory::eINSTANCE.createValuedObject
        guard.name = 'guard' + newIndex.toString
        guard.type = ValueType::BOOL;
        newIndex = newIndex + 1
        
        var schedulingBlock = ScgbbFactory::eINSTANCE.createSchedulingBlock
        while(node != null) {
            schedulingBlock.nodes.add(node)
            
            if (node instanceof Conditional) {
                val block = scg.insertBasicBlock(guard, schedulingBlock, predecessorBlocks)
                newIndex = scg.createBasicBlocks((node as Conditional).then.target, newIndex, newLinkedList(block))
                newIndex = scg.createBasicBlocks((node as Conditional).getElse.target, newIndex, newLinkedList(block))
                node = null
            } else 
            if (node instanceof Surface) {
                val block = scg.insertBasicBlock(guard, schedulingBlock, predecessorBlocks)
                newIndex = scg.createBasicBlocks((node as Surface).depth, newIndex, newLinkedList(block))
                node = null
            }  else
            if (node.eAllContents.filter(typeof(ControlFlow)).size != 1) {
                val block = scg.insertBasicBlock(guard, schedulingBlock, predecessorBlocks)
                for(flow : node.eAllContents.filter(typeof(ControlFlow)).toList) {
                    newIndex = scg.createBasicBlocks(flow.target, newIndex, newLinkedList(block))
                }
                if (node instanceof Fork) {
                    val joinPredecessors = <BasicBlock> newLinkedList
                    node.getAllNext.forEach[joinPredecessors.add((it.target as Entry).exit.basicBlock)]
                    newIndex = scg.createBasicBlocks((node as Fork).join, newIndex, joinPredecessors)
                }
                node = null                
            } else {
                val next = node.eAllContents.filter(typeof(ControlFlow)).head.target
                if (next instanceof Join) {
                    scg.insertBasicBlock(guard, schedulingBlock, predecessorBlocks)
                    node = null
                } else
                if (next != null && next.incoming.filter(typeof(ControlFlow)).size > 1) {
                    val block = scg.insertBasicBlock(guard, schedulingBlock, predecessorBlocks)
                    newIndex = scg.createBasicBlocks(next, newIndex, newLinkedList(block)) 
                    node = null;
                } else {
                    node = next
                }
            }
        }
                
        newIndex
    }
 
         
    def BasicBlock insertBasicBlock(SCGraphBB scg, ValuedObject guard, SchedulingBlock schedulingBlock,
        List<BasicBlock> predecessorBlocks
    ) {
        val basicBlock = ScgbbFactory::eINSTANCE.createBasicBlock
        
        if (schedulingBlock.nodes.head instanceof Depth) { basicBlock.blockType = BlockType::DEPTH }
        if (schedulingBlock.nodes.head instanceof Join) { basicBlock.blockType = BlockType::SYNCHRONIZER }
      
        basicBlock.guards.add(guard)
        basicBlock.schedulingBlocks.addAll(schedulingBlock.splitSchedulingBlock(basicBlock))
        basicBlock.predecessors.addAll(predecessorBlocks)
        if (basicBlock.predecessors.size == 0) {
        	basicBlock.goBlock = true
        } else {
        	basicBlock.predecessors.forEach[ 
        		val lastNode = schedulingBlocks.last.nodes.last
        		if (lastNode instanceof Conditional) {
        			basicBlock.blockType =  BlockType::BRANCH
        			basicBlock.condition = (lastNode as Conditional).condition
        		}
        	]
        }
        scg.basicBlocks.add(basicBlock)
        
        basicBlock
    }
    
    def List<SchedulingBlock> splitSchedulingBlock(SchedulingBlock schedulingBlock, BasicBlock basicBlock) {
        val schedulingBlocks = <SchedulingBlock> newLinkedList
        var SchedulingBlock block = null
        var ValuedObject guard = null
        for (node : schedulingBlock.nodes) {
            if (block == null || 
                (node.incoming.filter(typeof(Dependency)).filter[it.concurrent&&!it.confluent].size > 0)
            ) {
                if (block != null) schedulingBlocks.add(block)
                if (guard == null) {
                	guard = basicBlock.guards.head
                } else {
			        guard = KExpressionsFactory::eINSTANCE.createValuedObject
        			guard.name = basicBlock.guards.head.name + (96 + schedulingBlocks.size + 1) as char
        			guard.type = ValueType::BOOL
        			basicBlock.guards.add(guard)
                }
                block = ScgbbFactory::eINSTANCE.createSchedulingBlock()
                block.dependencies.addAll(node.incoming.filter(typeof(Dependency)))
                block.guard = guard  
            }
            block.nodes.add(node)
        }
        if (block != null) schedulingBlocks.add(block)
        
        schedulingBlocks
    }

   // -------------------------------------------------------------------------   
}