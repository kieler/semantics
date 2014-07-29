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

import com.google.common.collect.ImmutableList
import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.KielerCompilerException
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Schedule
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.analyzer.InterleavedAssignmentAnalyzer
import de.cau.cs.kieler.scg.analyzer.PotentialInstantaneousLoopAnalyzer
import de.cau.cs.kieler.scg.extensions.SCGCacheExtensions
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import java.util.HashMap
import java.util.List

/** 
 * This class is part of the SCG transformation chain. In particular a scheduler performs additional 
 * (for the particular scheduler) important analyses, creates one or more schedules for the SCG which 
 * may include the execution of synchronizers and runs conclusive optimizations on the graph if available. 
 * This abstract class defines the generic interface of a scheduler 
 * since they may be several schedulers for different tasks/graphs.<br>
 * The transformation chain is used to gather important information 
 * about the schedulability of a given SCG. This is done in several key steps. Between two steps the results 
 * are cached in specifically designed metamodels for further processing. At the end of the transformation
 * chain a newly generated (and sequentialized) SCG is returned. <br>
 * You can either call the transformations manually or use the SCG transformation extensions to enrich the
 * SCGs with the desired information.<br>
 * <pre>
 * SCG 
 *   |-- Dependency Analysis 	 					
 *   |-- Basic Block Analysis
 *   |-- Scheduler
 *   |    |-- Graph analyses
 *   |    |-- Scheduling					<== YOU ARE HERE
 *   |    |   |-- Synchonize threads		
 *   |    |-- Optimization
 *   |-- Sequentialization (new SCG)
 *       |-- Optimization					
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
    
    /** Inject SCG extensions. */    
    @Inject
    extension SCGExtensions    

	/** Inject SCG cache extensions. */
    @Inject
    extension SCGCacheExtensions    
    
    
    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
    
    /** Storage space for the interleaved assignment analyzer id. */
    protected var String interleavedAssignmentAnalyzerId = ""
    
    protected val ANALYZER_NODE_LIMIT = 100;
    
    private var PROGRESS_SCGSIZE = 0;
    private var PROGRESS_PLACED = 0;
    
    private val List<SchedulingBlock> TSVISITED = <SchedulingBlock> newArrayList; 
    private val schedulingBlockCache = new HashMap<Node, SchedulingBlock>
    

    
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
    
    /**
     * The analyze method is called by the abstract interface. The user may place additional analyses in this class. 
     * They will be perfomed before the scheduling takes place.
     * <pre>
     * Scheduler: Analyses --> Build schedule --> Optimization
     * </pre>
     * This method is called by the interface. There is no need to call it directly.
     * 
     * @param scg
     * 			the source scg
     * @return Returns the {@code AnalyzerData} structure.
     */
	override protected analyze(SCGraph scg) {
		// Our scheduler creates instances of the potential instantaneous loop and interleaved assignment analyzer.
		val PotentialInstantaneousLoopAnalyzer loopAnalyzer = Guice.createInjector().getInstance(typeof(PotentialInstantaneousLoopAnalyzer))
		val InterleavedAssignmentAnalyzer assignmentAnalyzer = Guice.createInjector().getInstance(typeof(InterleavedAssignmentAnalyzer))
		interleavedAssignmentAnalyzerId = assignmentAnalyzer.analysisId
		
		// The results are gathered in the analyzer data structure, persisted in the SCG and returned to the caller.
//		TODO: deactivated
//		if (scg.nodes.size <= ANALYZER_NODE_LIMIT)
//		    assignmentAnalyzer.analyze(loopAnalyzer.analyze(scg)).copyAllAnalyses(scg).SCG as SCGraph
//		else {
//		    System.out.println("SCG too big for experimental analyses. Skipping...")
//		    scg
//        }
        scg
    }    
    
    /**
     * The optimize method is called by the interface after the scheduling took place. It can be used to execute particular 
     * optimizer to optimize the SCG.<br>
     * <pre>
     * Scheduler: Analyses --> Build schedule --> Optimization
     * </pre>
     * This method is called by the interface. There is no need to call it directly. 
     * 
     * @param scg
     * 			the source scg
     * @return Returns the (optimized) SCG.
     */
	override protected optimize(SCGraph scg) {
		// No optimizations at the moment
		scg
	}
	
    protected override SchedulingConstraints orderSchedulingBlocks(SCGraph scg) {
        val schedulingBlocks = <SchedulingBlock> newLinkedList
        scg.basicBlocks.forEach[schedulingBlocks.addAll(it.schedulingBlocks)]
        
        new SchedulingConstraints => [
        	it.schedulingBlocks = schedulingBlocks
        ]    
    }
    
    protected def boolean isPlaceable(SchedulingBlock schedulingBlock, List<SchedulingBlock> remainingBlocks, 
    	Schedule schedule, SCGraph scg
    ) {
       	// Assume all preconditions are met and query parent basic block.
        val parentBB = schedulingBlock.eContainer as BasicBlock
                
        // For all predecessor blocks check whether they are already processed.
        for(pred : parentBB.predecessors){
            for(sb : pred.basicBlock.schedulingBlocks){
           	// If any scheduling block of that basic block is not already in our schedule,
           	// the precondition test fails. Set placeable to false.
	            if (!schedule.schedulingBlocks.contains(sb)) { return false }
            }
        }
                
        // Basically, perform the same test for dependency. We cannot create a guard expression 
        // if any block containing a dependency is still in our list.
        for(dep : schedulingBlock.dependencies) {
            if (dep.concurrent && !dep.confluent) {
           	// If the interleaved assignment analyzer marked this dependency as interleaving, ignore it.
//    	       	if (scg.analyses.filter[ id == interleavedAssignmentAnalyzerId ].filter[ objectReferences.contains(dep) ].empty) 
					val sb = schedulingBlockCache.get(dep.eContainer as Node)
	    	      	if (!schedule.schedulingBlocks.contains(sb)) { return false }
            }
    	}
    	
    	return true
    }
    
    protected def int topologicalPlacement(SchedulingBlock schedulingBlock, 
        List<SchedulingBlock> schedulingBlocks, Schedule schedule, 
        SchedulingConstraints constraints, SCGraph scg
    ) {
        var placed = 0 as int
        if (!TSVISITED.contains(schedulingBlock)) {
            TSVISITED.add(schedulingBlock)
            for(pred : schedulingBlock.basicBlock.predecessors) {
                for (sb : pred.basicBlock.schedulingBlocks) {
                    sb.topologicalPlacement(schedulingBlocks, schedule, constraints, scg)
                }
            }
            for(dep : schedulingBlock.dependencies) {
                if (dep.concurrent && !dep.confluent) {
//                    if (scg.analyses.filter[ id == interleavedAssignmentAnalyzerId ].filter[ objectReferences.contains(dep) ].empty) 
						val sb = schedulingBlockCache.get(dep.eContainer as Node)
                        sb.topologicalPlacement(schedulingBlocks, schedule, constraints, scg) 
                }
            }
            
            if (schedulingBlock.isPlaceable(schedulingBlocks, schedule, scg) && !schedule.schedulingBlocks.contains(schedulingBlock)) {
                schedule.schedulingBlocks.add(schedulingBlock)
                // TODO: Revamp guards
                // scg.guards += schedulingBlock.createGuardExpression(schedule, scg)
                schedulingBlocks.remove(schedulingBlock)
                placed = placed + 1
                PROGRESS_PLACED = PROGRESS_PLACED + 1
                if (PROGRESS_PLACED % 100 == 0) {
                    System.out.print("o");
                }
                if (PROGRESS_PLACED % 1000 == 0) {
                    System.out.println("");
                }
            }
        } 
        
        placed
    }
    
    protected override boolean createSchedule(SCGraph scg, Schedule schedule, SchedulingConstraints constraints) {

        val schedulingBlocks = <SchedulingBlock> newArrayList => [ it.addAll(constraints.schedulingBlocks) ]
        
        val schedulingBlocksCopy = ImmutableList::copyOf(schedulingBlocks)
        
        PROGRESS_SCGSIZE = schedulingBlocksCopy.size
        PROGRESS_PLACED = 0
        System.out.println("Scheduling "+PROGRESS_SCGSIZE+" scheduling blocks...")
        TSVISITED.clear
        
        for (sb : schedulingBlocksCopy) {
            sb.topologicalPlacement(schedulingBlocks, schedule, constraints, scg)
        }
        
        schedule.schedulingBlocks.size == schedulingBlocksCopy.size
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
    override protected SCGraph build(SCGraph scg, KielerCompilerContext context) {
    	// Create a new schedule using the scgsched factory.
        val schedule = ScgFactory::eINSTANCE.createSchedule
        
 
        
        // Create and fill a list for all scheduling blocks.
        val schedulingConstraints = scg.orderSchedulingBlocks
        
        scg.createSchedulingBlockCache(schedulingBlockCache)
        
        val schedulable = scg.createSchedule(schedule, schedulingConstraints)
        
        // Print out results on the console
        // and add the scheduling information to the graph.
        if (!schedulable) {
            if (context != null) {
                context.getCompilationResult().addPostponedWarning(new KielerCompilerException(getId(), "The SCG is NOT ASC-schedulable!"));
            }
            System::out.println("The SCG is NOT ASC-schedulable!")
//            scg.setUnschedulable(true)            
            scg.schedules.add(schedule)
        } else {
            System::out.println("The SCG is ASC-schedulable.")
//            scg.setUnschedulable(false)
            scg.schedules.add(schedule)
        }
        
        // Return the graph.
        scg
    }
    

}