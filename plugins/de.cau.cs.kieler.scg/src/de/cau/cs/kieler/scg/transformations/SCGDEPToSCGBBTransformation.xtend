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
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.scgdep.AssignmentDep
import de.cau.cs.kieler.scgdep.ConditionalDep
import de.cau.cs.kieler.scgdep.Dependency
import de.cau.cs.kieler.scgdep.SCGraphDep
import de.cau.cs.kieler.scgdep.ScgdepFactory
import java.util.HashMap

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scgbb.ScgbbFactory
import de.cau.cs.kieler.scgbb.SCGraphBB
import de.cau.cs.kieler.scgdep.NodeDep
import java.util.List
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.scgbb.SchedulingBlock
import de.cau.cs.kieler.scgbb.BasicBlock
import java.util.ArrayList
import de.cau.cs.kieler.core.kexpressions.ValueTypeimport de.cau.cs.kieler.scg.extensions.SCGCopyExtensions

/** 
 * SCGDEP to SCGBB Transformation 
 * 
 * @author ssm
 * @kieler.design 2013-10-24 proposed 
 * @kieler.rating 2013-10-24 proposed yellow
 */

// This class contians all mandatory methods for the SCGDEP-to-SCGBB-Transformation.
class SCGDEPToSCGBBTransformation {
    
    // Inject SCG Extensions.    
    @Inject
    extension SCGExtensions
    
    @Inject 
    extension SCGCopyExtensions
         
    // -------------------------------------------------------------------------
    // -- M2M Transformation 
    // -------------------------------------------------------------------------
    
    def SCGraphDep transformSCGDEPToSCGBB(SCGraphDep scgdep) {
        // Create new SCGDEP...
        val scgbb = ScgbbFactory::eINSTANCE.createSCGraphBB()

        scgdep.copySCG(scgbb)                  

        // Create GO signal
        val go = KExpressionsFactory::eINSTANCE.createValuedObject
        go.name = '_GO'
        go.type = ValueType::BOOL;
        scgbb.valuedObjects.add(go)
        
        // Create basic blocks.
        scgbb.createBasicBlocks(scgbb.nodes.head, 0, null, go.reference)
        
        return scgbb;
    }   
    

    // -------------------------------------------------------------------------
    // -- CREATE Basic Blocks 
    // -------------------------------------------------------------------------
    
    def int createBasicBlocks(SCGraphBB scg, Node rootNode, int guardIndex, 
        BasicBlock predecessorBlock, Expression activationExpression
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
                val block = scg.insertBasicBlock(guard, schedulingBlock, predecessorBlock, activationExpression)
                newIndex = scg.createBasicBlocks((node as Conditional).then.target, newIndex, block, guard.reference)
                newIndex = scg.createBasicBlocks((node as Conditional).getElse.target, newIndex, block, guard.reference)
                node = null
            } else 
            if (node instanceof Surface) {
                val block = scg.insertBasicBlock(guard, schedulingBlock, predecessorBlock, activationExpression)
                newIndex = scg.createBasicBlocks((node as Surface).depth, newIndex, block, guard.reference)
                node = null
            }  else
            if (node.eAllContents.filter(typeof(ControlFlow)).size != 1) {
                val block = scg.insertBasicBlock(guard, schedulingBlock, predecessorBlock, activationExpression)
                for(flow : node.eAllContents.filter(typeof(ControlFlow)).toList) {
                    newIndex = scg.createBasicBlocks(flow.target, newIndex, block, guard.reference)
                }
                //TODO: create synchronizer
                if (node instanceof Fork) {
                    newIndex = scg.createBasicBlocks((node as Fork).join, newIndex, block, guard.reference)
                }
                node = null                
            } else {
                val next = node.eAllContents.filter(typeof(ControlFlow)).head.target
                if (next.incoming.filter(typeof(ControlFlow)).size > 1) {
                    val block = scg.insertBasicBlock(guard, schedulingBlock, predecessorBlock, activationExpression)
                    scg.createBasicBlocks(next, newIndex, block, guard.reference) 
                    node = null;
                } else 
                if (next instanceof Join) {
                    scg.insertBasicBlock(guard, schedulingBlock, predecessorBlock, activationExpression)
                    node = null
                } else {
                    node = next
                }
            }
        }
                
        newIndex
    }
 
     def BasicBlock insertBasicBlock(SCGraphBB scg, ValuedObject guard, SchedulingBlock schedulingBlock,
        BasicBlock predecessorBlock, Expression activationExpression) {
        
        val predecessorBlocks = <BasicBlock> newLinkedList
        val activationExpressions = <Expression> newLinkedList
        
        if (predecessorBlock != null) predecessorBlocks.add(predecessorBlock)
        activationExpressions.add(activationExpression)
        
        insertBasicBlock(scg, guard, schedulingBlock, predecessorBlocks, activationExpressions)        
    }   
        
    def BasicBlock insertBasicBlock(SCGraphBB scg, ValuedObject guard, SchedulingBlock schedulingBlock,
        List<BasicBlock> predecessorBlocks, List<Expression> activationExpressions
    ) {
        val basicBlock = ScgbbFactory::eINSTANCE.createBasicBlock
      
        basicBlock.schedulingBlocks.addAll(schedulingBlock.splitSchedulingBlock)
        basicBlock.guard = guard
        
        val newExpression = ScgbbFactory::eINSTANCE.createActivationExpression
        if (predecessorBlocks != null) newExpression.basicBlocks.addAll(predecessorBlocks)
        newExpression.expressions.addAll(activationExpressions)
        basicBlock.activationExpressions.add(newExpression)
        
        scg.basicBlocks.add(basicBlock)
        basicBlock
    }
    
    def List<SchedulingBlock> splitSchedulingBlock(SchedulingBlock schedulingblock) {
        val schedulingBlocks = <SchedulingBlock> newLinkedList
        var SchedulingBlock block = null
        for (node : schedulingblock.nodes) {
            if (block == null || 
                (node.incoming.filter(typeof(Dependency)).filter[it.concurrent&&!it.confluent].size > 0)
            ) {
                if (block != null) schedulingBlocks.add(block)
                block = ScgbbFactory::eINSTANCE.createSchedulingBlock()
                block.dependencies.addAll(node.incoming.filter(typeof(Dependency)))                
            }
            block.nodes.add(node)
        }
        if (block != null) schedulingBlocks.add(block)
        
        schedulingBlocks
    }

   // -------------------------------------------------------------------------   
}