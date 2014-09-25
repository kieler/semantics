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
 package de.cau.cs.kieler.scg.schedulers

import com.google.inject.Inject
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Predecessor
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.synchronizer.SynchronizerSelector
import java.util.List
import java.util.Set
import java.util.ArrayList
import de.cau.cs.kieler.kico.KielerCompilerContext

/** 
 * This class is part of the SCG transformation chain. 
 * The transformation chain is used to gather important information 
 * about the schedulability of a given SCG. This is done in several key steps. 
 * You can either call the transformation manually or use KiCo to perform a series of transformations.
 * <pre>
 * SCG 
 *   |-- Dependency Analysis                        
 *   |-- Basic Block Analysis
 *   |-- Scheduler                          <== YOU ARE HERE
 *   |-- Sequentialization (new SCG)                
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-11-27 proposed 
 * @kieler.rating 2013-11-27 proposed yellow
 */
class DelayAwareScheduler extends SimpleScheduler {
    
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
     
    @Inject
    extension SCGCoreExtensions
       
    @Inject
    extension SynchronizerSelector
    
    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
    
    protected val predecessorExcludeSet = <Predecessor> newHashSet   
    protected val predecessorIncludeSets = <BasicBlock, Set<Predecessor>> newHashMap 
    
    override def boolean isPlaceable(SchedulingBlock schedulingBlock, List<SchedulingBlock> remainingBlocks, 
        List<SchedulingBlock> schedule, SCGraph scg
    ) {
        // Assume all preconditions are met and query parent basic block.
        val parentBasicBlock = schedulingBlock.eContainer as BasicBlock
                
        // For all predecessor blocks check whether they are already processed.
        for(predecessor : parentBasicBlock.predecessors){
            if (!predecessorExcludeSet.contains(predecessor)) {
                for(sBlock : predecessor.basicBlock.schedulingBlocks){
                    // If any scheduling block of that basic block is not already in our schedule,
                    // the precondition test fails. Set placeable to false.
                    if (!placedBlocks.contains(sBlock)) { return false }
                }
            }
        }
        
        // For all predecessor blocks check whether they are already processed.
        if (predecessorIncludeSets.containsKey(parentBasicBlock)) {
	        for(predecessor : predecessorIncludeSets.get(parentBasicBlock)){
    	        if (!predecessorExcludeSet.contains(predecessor)) {
        	        for(sBlock : predecessor.basicBlock.schedulingBlocks){
            	        // If any scheduling block of that basic block is not already in our schedule,
                	    // the precondition test fails. Set placeable to false.
                    	if (!placedBlocks.contains(sBlock)) { return false }
                	}
            	}
        	}        
        }
                
        // Basically, perform the same test for dependency. We cannot create a guard expression 
        // if any block containing a dependency is still in our list.
        for(dependency : schedulingBlock.dependencies) {
            if (dependency.concurrent && !dependency.confluent) {
                val sBlock = schedulingBlockCache.get(dependency.eContainer as Node)
                if (!placedBlocks.contains(sBlock)) { return false }
            }
        }
        
        return true
    }
   
    
    override def void topologicalPlacement(SchedulingBlock schedulingBlock, 
        List<SchedulingBlock> schedulingBlocks, List<SchedulingBlock> schedule, 
        SchedulingConstraints constraints, SCGraph scg
    ) {
        if (!topologicalSortVisited.contains(schedulingBlock)) {
            topologicalSortVisited.add(schedulingBlock)
            
            for(predecessor : schedulingBlock.basicBlock.predecessors) {
                if (!predecessorExcludeSet.contains(predecessor)) {
                    for (sBlock : predecessor.basicBlock.schedulingBlocks) {
                        if (!topologicalSortVisited.contains(sBlock))
                             sBlock.topologicalPlacement(schedulingBlocks, schedule, constraints, scg)
                    }
                }
            }
	        if (predecessorIncludeSets.containsKey(schedulingBlock.basicBlock)) {
    	        for(predecessor : predecessorIncludeSets.get(schedulingBlock.basicBlock)) {
        	        if (!predecessorExcludeSet.contains(predecessor)) {
            	        for (sBlock : predecessor.basicBlock.schedulingBlocks) {
                	        if (!topologicalSortVisited.contains(sBlock))
                    	         sBlock.topologicalPlacement(schedulingBlocks, schedule, constraints, scg)
	                    }
    	            }
        	    }
        	}
            for(dependency : schedulingBlock.dependencies) {
                if (dependency.concurrent && !dependency.confluent) {
                    val sBlock = schedulingBlockCache.get(dependency.eContainer as Node)
                    if (!topologicalSortVisited.contains(sBlock)) {
                        sBlock.topologicalPlacement(schedulingBlocks, schedule, constraints, scg)
                    } 
                }
            }
            
            if (schedulingBlock.isPlaceable(schedulingBlocks, schedule, scg)) {
                schedule.add(schedulingBlock)
                placedBlocks.add(schedulingBlock)
            }
        } 
    }    
    
    override def boolean createSchedule(SCGraph scg, List<SchedulingBlock> schedule, SchedulingConstraints constraints, 
    	KielerCompilerContext context) {

        val schedulingBlocks = new ArrayList<SchedulingBlock>(schedulingBlockCount)
        schedulingBlocks.addAll(constraints.schedulingBlocks)
        
        topologicalSortVisited.clear
        placedBlocks.clear
        predecessorExcludeSet.clear

		for(schedulingBlock : schedulingBlocks.filter[ basicBlock.synchronizerBlock ]) {        
            val join = schedulingBlock.basicBlock.schedulingBlocks.head.nodes.head as Join
            val synchronizer = join.chooseSynchronizer
            System.out.println("Using synchronizer " + synchronizer.getId + " for " + join.toString);
            synchronizer.annotate(join)
            
            predecessorExcludeSet += synchronizer.getExcludedPredecessors(join, schedulingBlockCache, context.compilationResult.ancillaryData)
            val predecessorIncludeSet = synchronizer.getAdditionalPredecessors(join, schedulingBlockCache, context.compilationResult.ancillaryData)
            predecessorIncludeSets.put(schedulingBlock.basicBlock, predecessorIncludeSet)
        }        
        
        for (sBlock : schedulingBlocks) {
        	if (!topologicalSortVisited.contains(sBlock)) {
                sBlock.topologicalPlacement(schedulingBlocks, schedule, constraints, scg)
            }
        }
        
        schedule.size == schedulingBlocks.size
    }

}