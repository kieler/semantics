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
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.KielerCompilerException
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.extensions.SCGCacheExtensions
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.analyzer.PotentialInstantaneousLoopAnalyzer
import com.google.inject.Guice
import de.cau.cs.kieler.scg.ScheduledBlock
import de.cau.cs.kieler.scg.analyzer.PotentialInstantaneousLoopResult
import de.cau.cs.kieler.scg.DataDependency

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
class SimpleScheduler extends AbstractScheduler {
    
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
     
    @Inject
    extension SCGCoreExtensions    

    @Inject
    extension SCGCacheExtensions    
    
    
    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
   
    protected val topologicalSortVisited = <SchedulingBlock> newHashSet 
    protected val schedulingBlockCache = new HashMap<Node, SchedulingBlock>
    protected var int schedulingBlockCount
    
    protected val placedBlocks = <SchedulingBlock> newHashSet 

    
    // -------------------------------------------------------------------------
    // -- Scheduler 
    // -------------------------------------------------------------------------
    
    /**
     * The simple scheduler travels through the list of scheduling blocks and tries to generate their
     * guard expressions. Therefore, all preconditions, especially predecessor blocks, of a scheduling block 
     * must be met before creating such an expression. If a block cannot be processed at a time, it is skipped 
     * in this iteration and will be processed in a later one. Thus, if in one iteration no block can be processed,
     * a fixed point is reached and the graph is not scheduable by this scheduler.  
     */
    
    protected override SchedulingConstraints orderSchedulingBlocks(SCGraph scg) {
        val schedulingBlocks = <SchedulingBlock> newLinkedList
        scg.basicBlocks.forEach[ schedulingBlocks.addAll(it.schedulingBlocks) ]
        
        new SchedulingConstraints => [
        	it.schedulingBlocks = schedulingBlocks
        ]    
    }
    
    protected def boolean isPlaceable(SchedulingBlock schedulingBlock, List<SchedulingBlock> remainingBlocks, 
    	List<ScheduledBlock> schedule, SCGraph scg
    ) {
       	// Assume all preconditions are met and query parent basic block.
        val parentBasicBlock = schedulingBlock.eContainer as BasicBlock
                
        // For all predecessor blocks check whether they are already processed.
        for(predecessor : parentBasicBlock.predecessors){
            for(sBlock : predecessor.basicBlock.schedulingBlocks){
           	// If any scheduling block of that basic block is not already in our schedule,
           	// the precondition test fails. Set placeable to false.
	            if (!placedBlocks.contains(sBlock)) { return false }
            }
        }
                
        // Basically, perform the same test for dependency. We cannot create a guard expression 
        // if any block containing a dependency is still in our list.
        for(dependency : schedulingBlock.dependencies.filter(typeof(DataDependency))) {
            if (dependency.concurrent && !dependency.confluent) {
				val sBlock = schedulingBlockCache.get(dependency.eContainer as Node)
    	      	if (!placedBlocks.contains(sBlock)) { return false }
            }
    	}
    	
    	return true
    }
    
    protected def void topologicalPlacement(SchedulingBlock schedulingBlock, 
        List<SchedulingBlock> schedulingBlocks, List<ScheduledBlock> schedule, 
        SchedulingConstraints constraints, SCGraph scg
    ) {
        if (!topologicalSortVisited.contains(schedulingBlock)) {
            topologicalSortVisited.add(schedulingBlock)
            for(predecessor : schedulingBlock.basicBlock.predecessors) {
                for (sBlock : predecessor.basicBlock.schedulingBlocks) {
                	if (!topologicalSortVisited.contains(sBlock))
                   		 sBlock.topologicalPlacement(schedulingBlocks, schedule, constraints, scg)
                }
            }
            for(dependency : schedulingBlock.dependencies.filter(typeof(DataDependency))) {
                if (dependency.concurrent && !dependency.confluent) {
					val sBlock = schedulingBlockCache.get(dependency.eContainer as Node)
					if (!topologicalSortVisited.contains(sBlock)) {
                   	    sBlock.topologicalPlacement(schedulingBlocks, schedule, constraints, scg)
               	    } 
                }
            }
            
            if (schedulingBlock.isPlaceable(schedulingBlocks, schedule, scg)) {
//            	val scheduledBlock = ScgFactory.eINSTANCE.createScheduledBlock => [
//            		it.schedulingBlock = schedulingBlock
//            	]
//                schedule.add(scheduledBlock)
                placedBlocks.add(schedulingBlock)
            }
        } 
    }
    
    
    protected def boolean createSchedule(SCGraph scg, List<ScheduledBlock> schedule, SchedulingConstraints constraints,
    	KielerCompilerContext context) {

        val schedulingBlocks = new ArrayList<SchedulingBlock>(schedulingBlockCount)
        schedulingBlocks.addAll(constraints.schedulingBlocks)
        
        topologicalSortVisited.clear
        placedBlocks.clear
        
        for (sBlock : schedulingBlocks) {
        	if (!topologicalSortVisited.contains(sBlock)) {
                sBlock.topologicalPlacement(schedulingBlocks, schedule, constraints, scg)
            }
        }
        
        schedule.size == schedulingBlocks.size
    }
    

	/**
	 * The build method builds the schedules for the given SCG. It uses the information from the dependency and
	 * basic block analyses to build the guard expressions of the blocks. A schedule itself is an ordered list
	 * of scheduling blocks. The next transformation step can use this information to create a new SCG containing
	 * the guard expressions in the correct order.<br>
     * <pre>
     * Scheduler: Analyses --> Build schedule --> Optimization
     * </pre>
	 * This method is called by the interface. There is no need to call it directly.
	 * 
	 * @param scg
	 * 			the source SCG
	 * @return Returns the enriched SCG model.
	 */
    override public SCGraph schedule(SCGraph scg, KielerCompilerContext context) {

    	// Create a new schedule using the scgsched factory.
        val schedule = ScgFactory::eINSTANCE.createSchedule
        
//        val PotentialInstantaneousLoopAnalyzer potentialInstantaneousLoopAnalyzer = 
//            Guice.createInjector().getInstance(typeof(PotentialInstantaneousLoopAnalyzer))
//        context.compilationResult.ancillaryData += potentialInstantaneousLoopAnalyzer.analyze(scg)
        val pilData = context.compilationResult.ancillaryData.filter(typeof(PotentialInstantaneousLoopResult)).head.criticalNodes.toSet
        

        // Create and fill a list for all scheduling blocks.
        val schedulingConstraints = scg.orderSchedulingBlocks
        
        schedulingBlockCount = scg.createSchedulingBlockCache(schedulingBlockCache)
        
        val sBlockList = <ScheduledBlock> newLinkedList
        var schedulable = scg.createSchedule(sBlockList, schedulingConstraints, context)
//		schedule.scheduledBlocks += sBlockList
        
        // Print out results on the console
        // and add the scheduling information to the graph.
        if (!schedulable) {
            if (context != null) {
                context.getCompilationResult().addPostponedWarning(new KielerCompilerException(getId(), "The SCG is NOT ASC-schedulable!"));
            }
            System::out.println("The SCG is NOT ASC-schedulable!")
            scg.schedules.add(schedule)
        } else {
            System::out.println("The SCG is ASC-schedulable.")
            scg.schedules.add(schedule)
        }
        
        scg
    }
    

}