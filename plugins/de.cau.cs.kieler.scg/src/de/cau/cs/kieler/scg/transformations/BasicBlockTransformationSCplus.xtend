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

/** 
 * This class is part of the SCG transformation chain. The chain is used to gather important information 
 * about the schedulability of a given SCG. This is done in several key steps. Between two steps the results 
 * are cached in specifically designed metamodels for further processing. At the end of the transformation
 * chain a newly generated (and sequentialized) SCG is returned. <br>
 * You can either call the transformations manually or use the SCG transformation extensions to enrich the
 * SCGs with the desired information.<br>
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
    override def List<SchedulingBlock> splitSchedulingBlock(SchedulingBlock schedulingBlock, BasicBlock basicBlock) {
    	// Create a new list of scheduling blocks.
        val schedulingBlocks = <SchedulingBlock> newLinkedList
        
        // Set the variables of the actual block to null to mark the first iteration.
        var SchedulingBlock block = null
        
        // Examine each node of the original scheduling block.
        for (node : schedulingBlock.nodes) {
        	// In the first iteration or if we have to split the block...
            if (block == null || 
                (node.incoming.filter(typeof(Dependency)).filter[ concurrent&&!confluent ].size > 0) ||
                (node.eContents.filter(typeof(Dependency)).filter[ concurrent&&!confluent ].size > 0)
            ) {
            	// ... add the block if it is not the first.
                if (block != null) schedulingBlocks.add(block)
                // Create a new scheduling block, add all incoming dependencies of the node to the block for caching purposes
                // and store a reference of the guard.
                block = ScgFactory::eINSTANCE.createSchedulingBlock()
                block.dependencies.addAll(node.incoming.filter(typeof(Dependency)))
            }
            // Add the node to the scheduling block.
            block.nodes.add(node)
        }
        // Finally, add the block to the list, if it is not empty and return the list of blocks.
        if (block != null) schedulingBlocks.add(block)
        
        schedulingBlocks
    }
    
  
}