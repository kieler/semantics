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

import de.cau.cs.kieler.scg.schedulers.AbstractSCGScheduler
import de.cau.cs.kieler.scgbb.SchedulingBlock
import de.cau.cs.kieler.scgsched.ScgschedFactory
import de.cau.cs.kieler.scgbb.BasicBlock

import com.google.common.collect.ImmutableListimport com.google.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scgsched.SCGraphSched
import com.google.inject.Guice
import de.cau.cs.kieler.scg.analyzer.PotentialInstantaneousLoopAnalyzer
import de.cau.cs.kieler.scgsched.GuardExpression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.scg.extensions.SCGCopyExtensions
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scgbb.BlockType
import de.cau.cs.kieler.scg.synchronizer.SurfaceSynchronizer
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.scgbb.Predecessor
import de.cau.cs.kieler.scg.analyzer.InterleavedAssignmentAnalyzer
import de.cau.cs.kieler.scg.extensions.UnsupportedSCGException

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension

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
class SimpleScheduler extends AbstractSCGScheduler {
    
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    
    /** Inject SCG extensions. */    
    @Inject
    extension SCGExtensions    

	/** Inject SCG copy extensions. */
    @Inject
    extension SCGCopyExtensions    
    
    /** Inject KExpression extensions. */
    @Inject
    extension KExpressionsExtension
    
    
    // -------------------------------------------------------------------------
    // -- Constants 
    // -------------------------------------------------------------------------
    
    /** Name of the go signal. */
    private static val String GOGUARDNAME = "_GO"
    
    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
    
    /** Storage space for the interleaved assignment analyzer id. */
    private var String interleavedAssignmentAnalyzerId = ""
    
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
	override protected analyze(SCGraphSched scg) {
		// Our scheduler creates instances of the potential instantaneous loop and interleaved assignment analyzer.
		val PotentialInstantaneousLoopAnalyzer loopAnalyzer = Guice.createInjector().getInstance(typeof(PotentialInstantaneousLoopAnalyzer))
		val InterleavedAssignmentAnalyzer assignmentAnalyzer = Guice.createInjector().getInstance(typeof(InterleavedAssignmentAnalyzer))
		interleavedAssignmentAnalyzerId = assignmentAnalyzer.analysisId
		
		// The results are gathered in the analyzer data structure, persisted in the SCG and returned to the caller.
		assignmentAnalyzer.analyze(loopAnalyzer.analyze(scg)).copyAllAnalyses(scg).SCG as SCGraphSched
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
	override protected optimize(SCGraphSched scg) {
		// No optimizations at the moment
		scg
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
    override protected SCGraphSched build(SCGraphSched scg) {
    	// Create a new schedule using the scgsched factory.
        val schedule = ScgschedFactory::eINSTANCE.createSchedule
        // Create and fill a list for all scheduling blocks.
        val schedulingBlocks = <SchedulingBlock> newLinkedList
        scg.basicBlocks.forEach[schedulingBlocks.addAll(it.schedulingBlocks)]
        
        /**
         * To form (circuit like) guard expression a GO signal must be created.  
         * It is needed in the guard expression of blocks that are active
         * when the program starts.
         */
         
        // Create a new signal using the kexpression factory for the GO signal.
        // Don't forget to add it to the SCG.
        KExpressionsFactory::eINSTANCE.createValuedObject => [
        	name = GOGUARDNAME
        	type = ValueType::BOOL
        	scg.valuedObjects.add(it)
        ]
        
        // fixpoint is set to true if an iteration cannot set any remaining blocks.
        var fixpoint  = false
        
        // As long as there are blocks remaining and we have not reached a fix point.
        while (schedulingBlocks.size > 0 && !fixpoint) {
        	// Assume fix point.
            fixpoint = true
            
            // Copy all remaining blocks.
            var schedulingBlocksCopy = ImmutableList::copyOf(schedulingBlocks)
            
            // For each block try to process it.
            for(block : schedulingBlocksCopy) {
            	// Assume all preconditions are met and query parent basic block.
                var placeable = true
                val parentBB = block.eContainer as BasicBlock
                
                // For all predecessor blocks check whether they are already processed.
                for(pred:parentBB.predecessors){
                    for(sb:pred.basicBlock.schedulingBlocks){
                    	// If any scheduling block of that basic block is not already in our schedule,
                    	// the precondition test fails. Set placeable to false.
                        if (!schedule.schedulingBlocks.contains(sb)) { placeable = false }
                    }
                }
                
                // Basically, perform the same test for dependency. We cannot create a guard expression 
                // if any block containing a dependency is still in our list.
                for(dep:block.dependencies) {
                    if (dep.concurrent && !dep.confluent) {
                    	// If the interleaved assignment analyzer marked this dependency as interleaving, ignore it.
                    	if (scg.analyses.filter[ id == interleavedAssignmentAnalyzerId ].filter[ objectReferences.contains(dep) ].empty) 
	                    	if (!schedule.schedulingBlocks.contains((dep.eContainer as Node).schedulingBlock)) { placeable = false }
                    }
                }
                
                // If all preconditions are met, process this block, add it to the schedule and create its guard expression.
                // Then, remove it from our list of remaining blocks.
                if (placeable) {
                    schedule.schedulingBlocks.add(block)
                    scg.guards += block.createGuardExpression(scg)
                    schedulingBlocks.remove(block)
                    
                    // This iteration updated the lists. This is not a fix point.
                    fixpoint = false
                }
            }
        }
        
        // Print out results on the console
        // and add the scheduling information to the graph.
        if (fixpoint) {
            System::out.println("The SCG is NOT ASC-schedulable!")
            scg.setUnschedulable(true)            
            scg.schedules.add(schedule)
        } else {
            System::out.println("The SCG is ASC-schedulable.")
            scg.setUnschedulable(false)
            scg.schedules.add(schedule)
        }
        
        // Return the graph.
        scg
    }
    
    /**
     * createGuardExpression creates an expression for a guard of a specific scheduling block.
     * 
     * @param schedulingBlock
     * 			the scheduling block in question.
     * @param scg
     * 			the SCG
     * @return Returns the guard expression.
     * @throws UnsupportedSCGException 
     * 		Throws an UnsupportedSCGException if a standard guarded block has no predecessor information.
     */
    protected def GuardExpression createGuardExpression(SchedulingBlock schedulingBlock, SCGraph scg) {
    	// Create a new guard expression using the scgsched factory.
    	// The valued object of that guard expression is the guard itself.
    	val gExpr = ScgschedFactory::eINSTANCE.createGuardExpression
    	gExpr.valuedObject = schedulingBlock.guard
    	
    	// Query the basic block of the scheduling block.
    	val basicBlock = schedulingBlock.basicBlock
    	
    	/** 
    	 * If the scheduling block is the first scheduling block in the basic block,
    	 * create an appropriate expression for the activity state of this guard.
    	 * A more accurate description of the interconnectivity between the activity states
    	 * of the basic blocks can be found in rtsys:ssm-dt, 2013.
    	 */
    	 
		// Is the scheduling block the first scheduling block of the basic block?
    	if (basicBlock.schedulingBlocks.head == schedulingBlock) {
    		if (basicBlock.goBlock) {
    			/**
    			 * If the basic block is a GO block, meaning it should be active when the programs starts,
    			 * add a reference to the GO signal as expression for the guard.
    			 */
    			gExpr.expression = scg.findValuedObjectByName(GOGUARDNAME).reference
    		} 
    		else if (basicBlock.blockType == BlockType::DEPTH) {
    			/**
    			 * If the basic block is a depth block, meaning it is delayed in its execution,
    			 * add a pre operator expression as expression for the guard.
    			 */
    			val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression
    			expression.setOperator(OperatorType::PRE)
    			expression.subExpressions.add(basicBlock.preGuard.reference)
    			gExpr.expression = expression
    		}
    		else if (basicBlock.blockType == BlockType::SYNCHRONIZER) {
    			/**
    			 * If the basic block is a surface block, meaning it is responsible for joining concurrent threads,
    			 * invoke a synchronizer. The synchronizer will create the guard expression for this node.
    			 * Additionally, the synchronizer may create new valued objects mandatory for the expression.
    			 * These must be added to the graph in order to be serializable later on. 
    			 */
    			// The simple scheduler uses the SurfaceSynchronizer. 
    			// The result of the synchronizer is stored in the synchronizerData class joinData.
				val SurfaceSynchronizer synchronizer = Guice.createInjector().getInstance(typeof(SurfaceSynchronizer))
				val joinData = synchronizer.synchronize(schedulingBlock.nodes.head as Join)
				
				// Add additional valued objects to the SCG and use the guard expression of the synchronizer as it is.
				scg.valuedObjects += joinData.valuedObjects
				return joinData.guardExpression			
			} else {
				/**
				 * If the block is neither of them, it solely depends on the activity states of previous basic blocks.
				 * At least one block must be active to activate the current block. Therefore, connect all guards
				 * of the predecessors with OR expressions.
				 */
				 
				// If there are more than one predecessor, create an operator expression and connect them via OR.
				if (basicBlock.predecessors.size>1) {
					// Create OR operator expression via kexpressions factory.
					val expr = KExpressionsFactory::eINSTANCE.createOperatorExpression
					expr.setOperator(OperatorType::OR)
					
					// For each predecessor add its expression to the sub expressions list of the operator expression.
					basicBlock.predecessors.forEach[ expr.subExpressions += it.predecessorExpression ]
					gExpr.expression = expr
				} 
				// If it is exactly one predecessor, we can use its expression directly.
				else if (basicBlock.predecessors.size == 1) {
					gExpr.expression = basicBlock.predecessors.head.predecessorExpression
				} 
				else 
				{
					/**
					 * If we reach this point, the basic block contains no predecessor information but is not marked as go block.
					 * This is not supported by this scheduler: throw an exception. 
					 */
				    if (!basicBlock.deadBlock) {
					   throw new UnsupportedSCGException("Cannot handle standard guard without predecessor information!")
				    } else {
				       gExpr.expression = FALSE  
				    }
				}
			}
		} else {
			/**
			 * If the scheduling block is not the first scheduling block in the basic block, it is active 
			 * if and only if its basic block, and in this case the first scheduling block of the basic block,
			 * is active but possibly at a later stage in the net list. Add a reference of the guard of the first
			 * scheduling block as expression.
			 * 
			 * HINT: There were some concerns that the expression would maybe evaluate differently at a later stage in 
			 * the net list and that the whole expression must be re-evaluated at that particular point of time.
			 * However, due to the rules valid for the basic block and scheduling block creation, this scenario 
			 * cannot occur. A difference of guard evaluation with respect to data dependencies can only occur 
			 * between conditional nodes but conditional nodes force the create of new basic blocks after their execution.
			 * Therefore, there will always be a new basic block with a new guard expression in this scenario.
			 */
			gExpr.expression = basicBlock.schedulingBlocks.head.guard.reference
		}
		    	
		// Return the expression
    	gExpr
    }
    
    /**
     * PredecessorExpression forms a single expression with respect to the predecessor,
     * meaning that the expression is a reference to the guard of the predecessor and
     * combined with the (negated) expression of a condition in the case of a 
     * conditional predecessor.
     *  
     * @param predecessor
     * 			The predecessor in question.
     * @return Returns the expression for this predecessor.
     * @throws UnsupportedSCGException
     * 		Throws an UnsupportedSCGException if the predecessor does not contain sufficient information to form the expression.
     */
    protected def Expression predecessorExpression(Predecessor predecessor) {
    	// Return a solely reference as expression if the predecessor is not a conditional
    	if (predecessor.blockType == BlockType::NORMAL) {
    		return predecessor.basicBlock.guards.head.reference
    	}
    	// If we are in the true branch of the predecessor, combine the predecessor guard reference with
    	// the condition of the conditional and return the expression.
    	else if (predecessor.blockType == BlockType::TRUEBRANCH) {
   			val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression
   			expression.setOperator(OperatorType::AND)
   			expression.subExpressions += predecessor.basicBlock.guards.last.reference
   			expression.subExpressions += predecessor.conditional.condition.copy
   			return expression
   		}
    	// If we are in the true branch of the predecessor, combine the predecessor guard reference with
    	// the negated condition of the conditional and return the expression.
   		else if (predecessor.blockType == BlockType::ELSEBRANCH) {
   			val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression
   			expression.setOperator(OperatorType::AND)
   			expression.subExpressions += predecessor.basicBlock.guards.last.reference
   			expression.subExpressions += predecessor.conditional.condition.copy.negate
   			return expression
   		}
    		
    	throw new UnsupportedSCGException("Cannot create predecessor expression without predecessor block type information.")
    }

}