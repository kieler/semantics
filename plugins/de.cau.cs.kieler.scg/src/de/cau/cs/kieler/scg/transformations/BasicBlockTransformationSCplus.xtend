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

import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.SchedulingBlock
import java.util.List
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Node

/** 
 * This class is part of the SCG transformation chain. The chain is used to gather information 
 * about the schedulability of a given SCG. This is done in several key steps. Contrary to the first 
 * version of SCGs, there is only one SCG meta-model. In each step the gathered data will be added to 
 * the model. 
 * You can either call the transformation manually or use KiCo to perform a series of transformations.
 * <pre>
 * SCG 
 *   |-- Dependency Analysis 	 					
 *   |-- Basic Block Analysis					<== YOU ARE HERE
 *   |-- Scheduler
 *   |-- Sequentialization (new SCG)
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-10-24 proposed 
 * @kieler.rating 2013-10-24 proposed yellow
 */

class BasicBlockTransformationSCplus extends BasicBlockTransformation {
    
    // -------------------------------------------------------------------------
    // -- Transformation methods
    // -------------------------------------------------------------------------
    
    /**
     * splitSchedulingBlock takes a scheduling block and splits it in different blocks 
     * depending on incoming dependency edges. 
     * 
     * @param schedulingBlock
     * 			the scheduling block in question
     * @param basicBlock
     * 			the basic block the scheduling block will belong to
     * @return Returns a list of scheduling blocks which will at least contain one block.
     */
    override def List<SchedulingBlock> createSchedulingBlocks(List<Node> nodeList, BasicBlock basicBlock, 
        ValuedObject guard
    ) {
        // Create a new list of scheduling blocks.
        val schedulingBlocks = <SchedulingBlock> newLinkedList
        
        // Set the variables of the actual block to null to mark the first iteration.
        var SchedulingBlock block = null
        var ValuedObject sbGuard = null
        
        // Examine each node of the original scheduling block.
        for (node : nodeList) {
            // In the first iteration or if we have to split the block...
            if (block == null || 
                (node.incoming.filter(typeof(Dependency)).filter[ concurrent&&!confluent ].size > 0) ||
                (node.eContents.filter(typeof(Dependency)).filter[ concurrent&&!confluent ].size > 0)
            ) {
                // ... add the block if it is not the first.
                if (block != null) schedulingBlocks.add(block)
                if (sbGuard == null) {
                    // If it is the first block, re-use the guard of the basic block.
                    sbGuard = guard
                } else {
                    // Otherwise, create a new guard and add it to the list of guards in the basic block. 
                    // It must be present in the list of the basic block because this list is the containment 
                    // of the guards in the metamodel. The information is later used to serialize the guard names. 
                    sbGuard = KExpressionsFactory::eINSTANCE.createValuedObject
                    if (schedulingBlocks.size>25) {
                        sbGuard.name = guard.name + "z" + (schedulingBlocks.size - 25) 
                    } else {
                        sbGuard.name = guard.name + (96 + schedulingBlocks.size + 1) as char
                    }
                    
                    // ALWAYS use the guard of the basic block
//                  guard = basicBlock.guard
                }
                // Create a new scheduling block, add all incoming dependencies of the node to the block for caching purposes
                // and store a reference of the guard.
                val newGuard = ScgFactory::eINSTANCE.createGuard
                newGuard.valuedObject = sbGuard;
                (basicBlock.eContainer as SCGraph).guards += newGuard
                
                block = ScgFactory::eINSTANCE.createSchedulingBlock()
                block.guard = newGuard
                block.dependencies.addAll(node.incoming.filter(typeof(Dependency)))
            }
            // Add the node to the scheduling block.
            block.nodes.add(node)
            processedNodes.add(node)
        }
        // Finally, add the block to the list, if it is not empty and return the list of blocks.
        if (block != null) schedulingBlocks.add(block)
        
        schedulingBlocks
    }
    
  
}