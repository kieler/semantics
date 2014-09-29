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
package de.cau.cs.kieler.scg.sequentializer

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.BranchType
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Predecessor
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Schedule
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.extensions.UnsupportedSCGException
import de.cau.cs.kieler.scg.synchronizer.SynchronizerSelector
import java.util.HashMap
import java.util.List

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.ScheduledBlock
import de.cau.cs.kieler.core.kexpressions.Declaration
import java.util.Set
import de.cau.cs.kieler.scg.analyzer.PotentialInstantaneousLoopResult
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.OperatorExpression

/** 
 * This class is part of the SCG transformation chain. The chain is used to gather information 
 * about the schedulability of a given SCG. This is done in several key steps. Contrary to the first 
 * version of SCGs, there is only one SCG meta-model. In each step the gathered data will be added to 
 * the model. 
 * You can either call the transformation manually or use KiCo to perform a series of transformations.
 * <pre>
 * SCG 
 *   |-- Dependency Analysis 	 					
 *   |-- Basic Block Analysis				
 *   |-- Scheduler
 *   |-- Sequentialization (new SCG)	<== YOU ARE HERE
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-12-05 proposed 
 * @kieler.rating 2013-12-05 proposed yellow
 */

class SimpleSequentializer extends AbstractSequentializer {

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    
    @Inject
    extension SCGCoreExtensions
    
    @Inject 
    extension SCGDeclarationExtensions
         
    @Inject 
    extension KExpressionsExtension	
    
    @Inject
    extension AnnotationsExtensions

    @Inject
    extension SynchronizerSelector
    
    // -------------------------------------------------------------------------
    // -- Globals
    // -------------------------------------------------------------------------
    
    private static val ANNOTATION_SEQUENTIALIZED = "sequentialized" 
    
    protected val schedulingBlockCache = new HashMap<Node, SchedulingBlock>
    protected var KielerCompilerContext compilerContext

    /** Caching for predecessors */
    protected val predecessorTwinCache = <Predecessor, Predecessor> newHashMap
    protected val predecessorBBCache = <BasicBlock, List<Predecessor>> newHashMap
    protected val predecessorSBCache = <Predecessor, List<SchedulingBlock>> newHashMap
    protected val predecessorTwinMark = <SchedulingBlock> newHashSet
    
    public static val SCHIZOPHRENIC_SUFFIX = "_s"
    protected val schizophrenicGuards = <ValuedObject> newHashSet
    protected var schizophrenicGuardCounter = 0
    protected var Declaration schizoDeclaration = null
    protected var Set<Node> pilData = null
         
               
    // -------------------------------------------------------------------------
    // -- Sequentializer
    // -------------------------------------------------------------------------    
      
    /**
     * transformSCGSchedToSeqSCG executes the transformation of an SCG with scheduling information to an
     * standard SCG without any further information. Naturally, the SCG will only consist of an 
     * entry-exit node pair and a series of assignment and conditionals.<br>
     * <strong>This amalgamation of nodes constitutes the tick function of the circuit approach.</strong>
     * 
     * @param scgsched
     * 			the source SCG with scheduling information
     * @return Returns a sequentialized standard SCG.
     */    
     override SCGraph sequentialize(SCGraph scg, KielerCompilerContext context) {

        val timestamp = System.currentTimeMillis
        compilerContext = context
        
        val pilData = context.compilationResult.ancillaryData.filter(typeof(PotentialInstantaneousLoopResult)).head.criticalNodes.toSet
          
        /**
         * Since we want to build a new SCG, we cannot use the SCG copy extensions because it would 
         * preserve all previous (node) data.
         * Therefore, we only copy the interface and extend the declaration by the guards of the 
         * basic blocks.
         */
        val newSCG = ScgFactory::eINSTANCE.createSCGraph => [
        	annotations += createStringAnnotation(ANNOTATION_SEQUENTIALIZED, "")
        ]
        schizoDeclaration = createDeclaration=>[ setType(ValueType::BOOL) ]
		val predecessorList = <Predecessor> newArrayList
		val basicBlockList = <BasicBlock> newArrayList
        scg.copyDeclarations(newSCG)
       	val guardDeclaration = createDeclaration=>[ setType(ValueType::BOOL) ]
       	newSCG.declarations += guardDeclaration
        scg.basicBlocks.forEach[
        	basicBlockList += it
        	predecessorList += it.predecessors
            schedulingBlocks.forEach[
                val vo = createValuedObject(it.guard.name) 
                    => [ guardDeclaration.valuedObjects += it ]
                it.guard.addToValuedObjectMapping(vo)
                // Create the scheduling cache on the fly.
        		it.nodes.forEach[ node | schedulingBlockCache.put(node, it) ]
            ]
        ]
        val vo = newSCG.createGOSignal
        vo.addToValuedObjectMapping(vo)
        
        var time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Preparation for sequentialization: caches finished (time elapsed: "+(time / 1000)+"s).")          

        // Create the predecessor caches for each predecessor.
        predecessorList.forEach[ p |
            if (p.branchType == BranchType::TRUEBRANCH) {
                p.cacheTwin(basicBlockList)
            } 
            else if (p.branchType == BranchType::ELSEBRANCH) {
                p.cacheTwin(basicBlockList)
            }
        ]
        
        time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Preparation for sequentialization finished (time elapsed: "+(time / 1000)+"s).")          
        
		// Create the entry node, a control flow for the entry node, add the node.
        val entry = ScgFactory::eINSTANCE.createEntry
    	entry.next = ScgFactory::eINSTANCE.createControlFlow
        newSCG.nodes.add(entry)
        
        // Now, call the worker method. It returns the last control flows which have to be connected to the exit node.
        val nodeCache = <Node> newLinkedList
        val exitControlFlows = scg.schedules.head.transformSchedule(newSCG, entry.next, nodeCache)
        
        // Create an exit node and connect the control flow. Add the node.
        val exit = ScgFactory::eINSTANCE.createExit
        exitControlFlows.forEach[ it.target = exit ]
        nodeCache.add(exit)
        
        newSCG.nodes += nodeCache
        
        time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Sequentialization finished (overall time elapsed: "+(time / 1000)+"s).")  
                
        // Return the SCG.
        if (schizoDeclaration.valuedObjects.size > 0) newSCG.declarations += schizoDeclaration
        newSCG     	
    }
    
    /**
     * This worker function takes the scheduling information of an enriched SCG and creates the nodes of
     * a sequentialized SCG. 
     * 
     * @param schedule
     * 			the scheduling information
     * @param scg
     * 			the target SCG
     * @param controlFlow
     * 			the source control flow which points to the next node
     * @return Returns a list of outgoing control flows. The caller should connect them to their surrounding environment. 
     * @throws UnsupportedSCGException
     * 			if no guard expression can be found for a specific guard.
     */
    protected def transformSchedule(Schedule schedule, SCGraph scg, ControlFlow controlFlow, List<Node> nodeCache) {
    	
    	// Since the last node maybe a conditional node, it is possible to conclude the schedule with more than one
    	// outgoing control flow. Create a list to hold the control flows and add the incoming one.
    	val nextControlFlows = <ControlFlow> newArrayList
    	nextControlFlows.add(controlFlow)
    	
    	
    	// For each scheduling block in the schedule iterate.
    	for (sb : schedule.scheduledBlocks) {
    		val sBlock = sb.schedulingBlock
	  	   /**
   			 * For each guard a guard expression exists.
   		     * Retrieve the expression and test it for null. 
	  	     * If the guard expression is null, the scheduler could not create an expression for this guard. This is bad. Perhaps the SCG is erroneous. Throw an exception.
		     * Otherwise, it is possible that the guard expression houses empty expressions for a synchronizer. Add them as well.
		     */    		
   			// Retrieve the guard expression from the scheduling information.
       		sb.createAndAddGuardExpression(nextControlFlows, schedule, scg, nodeCache) 
    		
    		/**
    		 * If the scheduling block includes assignment nodes, they must be executed if the corresponding guard 
    		 * evaluates to true. Therefore, create a conditional for the guard and add the assignment to the
    		 * true branch. They will execute their expression if the guard is active in this tick instance. 
    		 */
    		if (sBlock.nodes.filter(typeof(Assignment)).size>0)
    		{
    			// Create a conditional and set a reference of the guard as condition.
    			val conditional = ScgFactory::eINSTANCE.createConditional
                conditional.condition = sBlock.guard.reference.copySCGExpression
    			
    			// Create control flows for the two branches and set the actual control flow to the conditional.
    			conditional.then = ScgFactory::eINSTANCE.createControlFlow
    			conditional.^else = ScgFactory::eINSTANCE.createControlFlow
    			nextControlFlows.forEach[ target = conditional ]
    			nextControlFlows.clear
    			
    			// Add the conditional.
                nodeCache.add(conditional)
    			
    			// Now, use the SCG copy extensions to copy the assignment and connect them appropriately
    			// in the true branch of the conditional.
    			var nextControlFlow = conditional.then
    			for (assignment : sBlock.nodes.filter(typeof(Assignment))) {
    				val Assignment conditionalAssignment = assignment.copySCGNode(scg) as Assignment
    				nextControlFlow.target = conditionalAssignment
                    nodeCache.add(conditionalAssignment)
    				nextControlFlow = ScgFactory::eINSTANCE.createControlFlow
    				conditionalAssignment.next = nextControlFlow
    			}
    			nextControlFlows.add(nextControlFlow)
    			
    			// Subsequently, add the last control flow of the true branch and the control flow of the
    			// else branch to the control flow list. These are the new entry flows for the next assignment
    			// or the return value (in which case they will be connected to the exit node by the caller). 
    			nextControlFlows.add(conditional.^else)

    		}
    		
     	}
    	
    	// Return any remaining control flows for the caller.
    	nextControlFlows
    }
    
    protected def Assignment copySCGNode(Assignment assignment, SCGraph target) {
    	ScgFactory::eINSTANCE.createAssignment => [
            it.assignment = assignment.assignment.copySCGExpression
            it.valuedObject = assignment.valuedObject.getValuedObjectCopyWNULL;
            for(index : assignment.indices) {	
                indices += index.copySCGExpression
            }
        ]
    } 
    
    protected def addGuardExpression(Assignment assignment, GuardExpression guardExpression, 
        List<ControlFlow> nextControlFlows, SCGraph scg, List<Node> nodeCache
    ) {
        // Create empty expressions if present.
        guardExpression.emptyExpressions.forEach[ emptyExpression |
            var i = 0
            while(scg.findValuedObjectByName(emptyExpression.valuedObject.name + "_" + i)!=null) {
                i = i + 1
            }
            val newValuedObject = scg.createValuedObject(emptyExpression.valuedObject.name + "_" + i).setTypeBool
            emptyExpression.valuedObject.addToValuedObjectMapping(newValuedObject)
                                    
            ScgFactory::eINSTANCE.createAssignment => [ emptyExpressionAssignment |
                emptyExpressionAssignment.valuedObject = emptyExpression.valuedObject.getValuedObjectCopy
                emptyExpressionAssignment.assignment = emptyExpression.expression.copySCGExpression
                nodeCache.add(emptyExpressionAssignment)
                nextControlFlows.forEach[ target = emptyExpressionAssignment ]
                nextControlFlows.clear 
                emptyExpressionAssignment.next = ScgFactory::eINSTANCE.createControlFlow             
                nextControlFlows.add(emptyExpressionAssignment.next)
            ]
        ]
        
        // Create additional expressions if present.
        guardExpression.additionalExpressions.forEach[ additionalExpression |
            val newValuedObject = scg.createValuedObject(additionalExpression.valuedObject.name).setTypeBool
            additionalExpression.valuedObject.addToValuedObjectMapping(newValuedObject)
                                    
            ScgFactory::eINSTANCE.createAssignment => [ additionalExpressionAssignment |
                additionalExpressionAssignment.valuedObject = additionalExpression.valuedObject.getValuedObjectCopy
                additionalExpressionAssignment.assignment = additionalExpression.expression.copySCGExpression
                nodeCache.add(additionalExpressionAssignment)
                nextControlFlows.forEach[ target = additionalExpressionAssignment ]
                nextControlFlows.clear 
                additionalExpressionAssignment.next = ScgFactory::eINSTANCE.createControlFlow             
                nextControlFlows.add(additionalExpressionAssignment.next)
            ]
        ]        
        // Then, copy the expression of the guard to the newly created assignment.
        assignment.assignment = guardExpression.expression.copySCGExpression    
    }    
    
    
    
    /**
     * createGuardExpression creates an expression for a guard of a specific scheduling block.
     * 
     * @param schedulingBlock
     *          the scheduling block in question.
     * @param scg
     *          the SCG
     * @return Returns the guard expression.
     * @throws UnsupportedSCGException 
     *      Throws an UnsupportedSCGException if a standard guarded block has no predecessor information.
     */
    protected def void createAndAddGuardExpression(ScheduledBlock scheduledBlock, 
        List<ControlFlow> nextControlFlows, Schedule schedule, SCGraph scg, List<Node> nodeCache
    ) {
        
        // Query the basic block of the scheduling block.
        val basicBlock = scheduledBlock.schedulingBlock.basicBlock
                
        val assignment = ScgFactory::eINSTANCE.createAssignment
        
        if (!scheduledBlock.schizophrenic) {
            assignment.valuedObject = scheduledBlock.schedulingBlock.guard.getValuedObjectCopy
        } else {
            var ValuedObject vo = scg.findValuedObjectByName(scheduledBlock.schedulingBlock.guard.name + SCHIZOPHRENIC_SUFFIX)
            if (vo == null) {
                vo = createValuedObject(scheduledBlock.schedulingBlock.guard.name + SCHIZOPHRENIC_SUFFIX)
                schizoDeclaration.valuedObjects += vo
                assignment.valuedObject = vo
            }
        }        
        
        /** 
         * If the scheduling block is the first scheduling block in the basic block,
         * create an appropriate expression for the activity state of this guard.
         * A more accurate description of the interconnectivity between the activity states
         * of the basic blocks can be found in rtsys:ssm-dt, 2013.
         */
         
        // Is the scheduling block the first scheduling block of the basic block?
        if (basicBlock.schedulingBlocks.head == scheduledBlock.schedulingBlock) {
            if (basicBlock.goBlock) {
                /**
                 * If the basic block is a GO block, meaning it should be active when the programs starts,
                 * add a reference to the GO signal as expression for the guard.
                 */
                 scheduledBlock.handleGoBlockGuardExpression(assignment, nextControlFlows, schedule, 
                     scg, nodeCache)
            } 
            else if (basicBlock.depthBlock) {
                /**
                 * If the basic block is a depth block, meaning it is delayed in its execution,
                 * add a pre operator expression as expression for the guard.
                 */
                scheduledBlock.handleDepthBlockGuardExpression(assignment, nextControlFlows, schedule, 
                    scg, nodeCache)
            }
            else if (basicBlock.synchronizerBlock) {
                /**
                 * If the basic block is a surface block, meaning it is responsible for joining concurrent threads,
                 * invoke a synchronizer. The synchronizer will create the guard expression for this node.
                 * Additionally, the synchronizer may create new valued objects mandatory for the expression.
                 * These must be added to the graph in order to be serializable later on. 
                 */
                scheduledBlock.handleSynchronizerBlockGuardExpression(assignment, nextControlFlows, schedule,
                    scg, nodeCache)   
            } else {
                /**
                 * If the block is neither of them, it solely depends on the activity states of previous basic blocks.
                 * At least one block must be active to activate the current block. Therefore, connect all guards
                 * of the predecessors with OR expressions.
                 */
                scheduledBlock.handleStandardBlockGuardExpression(assignment, nextControlFlows, schedule,
                    scg, nodeCache)               
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
            scheduledBlock.handleSubsequentSchedulingBlockGuardExpression(assignment, nextControlFlows, schedule, 
                scg, nodeCache)
        }
                
        // Connect all control flows to the new assignment and clear the list.
        nextControlFlows.forEach[ target = assignment ]
        nextControlFlows.clear
            
        // Create a new control flow and take the assignment node as source.
        assignment.next = ScgFactory::eINSTANCE.createControlFlow
        nextControlFlows.add(assignment.next)
        
        if (scheduledBlock.schizophrenic) {
            assignment.assignment = scg.fixSchizophrenicExpression(assignment.assignment)
        }
            
        // Add the assignment to the SCG.
        nodeCache.add(assignment)
    }
    
    
    // --- CREATE GUARDS: GO BLOCK 
    
    protected def handleGoBlockGuardExpression(ScheduledBlock scheduledBlock, Assignment assignment,  
        List<ControlFlow> nextFlows, Schedule schedule, SCGraph scg, List<Node> nodeCache
    ) {
        val gExpr = scheduledBlock.schedulingBlock.createGoBlockGuardExpression(schedule, scg)
        assignment.addGuardExpression(gExpr, nextFlows, scg, nodeCache)       
    }
    
    protected def GuardExpression createGoBlockGuardExpression(SchedulingBlock schedulingBlock, Schedule schedule, SCGraph scg) {
        new GuardExpression => [
            valuedObject = schedulingBlock.guard
            expression = scg.findValuedObjectByName(GOGUARDNAME).reference
        ]
    }
    

    // --- CREATE GUARDS: DEPTH BLOCK 

    protected def handleDepthBlockGuardExpression(ScheduledBlock scheduledBlock, Assignment assignment,  
        List<ControlFlow> nextFlows, Schedule schedule, SCGraph scg,  List<Node> nodeCache
    ) {
        val gExpr = scheduledBlock.schedulingBlock.createDepthBlockGuardExpression(schedule, scg)
        assignment.addGuardExpression(gExpr, nextFlows, scg, nodeCache)       
    }
    
    protected def GuardExpression createDepthBlockGuardExpression(SchedulingBlock schedulingBlock, Schedule schedule, SCGraph scg) {
        new GuardExpression => [
            valuedObject = schedulingBlock.guard
            expression = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                setOperator(OperatorType::PRE)
                subExpressions.add(schedulingBlock.basicBlock.preGuard.reference)
            ]
        ]
    }


    // --- CREATE GUARDS: SYNCHRONIZER BLOCK 

    protected def handleSynchronizerBlockGuardExpression(ScheduledBlock scheduledBlock, Assignment assignment,  
        List<ControlFlow> nextFlows, Schedule schedule, SCGraph scg,  List<Node> nodeCache
    ) {
        val gExpr = scheduledBlock.schedulingBlock.createSynchronizerBlockGuardExpression(schedule, scg)
        assignment.addGuardExpression(gExpr, nextFlows, scg, nodeCache)       
    }
    
    protected def GuardExpression createSynchronizerBlockGuardExpression(SchedulingBlock schedulingBlock, Schedule schedule, SCGraph scg) {
        // The simple scheduler uses the SurfaceSynchronizer. 
        // The result of the synchronizer is stored in the synchronizerData class joinData.
        val synchronizer = (schedulingBlock.nodes.head as Join).getSynchronizer
        System.out.println("Sequentializing join with " + synchronizer.id)
        val joinData = synchronizer.synchronize(schedulingBlock.nodes.head as Join, compilerContext, schedulingBlockCache)

        joinData.guardExpression
    }
    
    
    // --- CREATE GUARDS: STANDARD BLOCK 

    protected def handleStandardBlockGuardExpression(ScheduledBlock scheduledBlock, Assignment assignment,  
        List<ControlFlow> nextFlows, Schedule schedule, SCGraph scg,  List<Node> nodeCache
    ) {
        val gExpr = scheduledBlock.createStandardBlockGuardExpression(schedule, scg)
        assignment.addGuardExpression(gExpr, nextFlows, scg, nodeCache)       
    }
    
    protected def GuardExpression createStandardBlockGuardExpression(ScheduledBlock scheduledBlock, Schedule schedule, SCGraph scg) {
        val basicBlock = scheduledBlock.schedulingBlock.basicBlock
        
        val gExpr = new GuardExpression;
        gExpr.valuedObject = scheduledBlock.schedulingBlock.guard
        
        val relevantPredecessors = <Predecessor> newHashSet
        if (scheduledBlock.schizophrenic) {
            relevantPredecessors += basicBlock.predecessors.filter[ !basicBlock.entryBlock ]
        } else {
            relevantPredecessors += basicBlock.predecessors
        }
        
        // If there are more than one predecessor, create an operator expression and connect them via OR.
        if (relevantPredecessors.size>1) {
            // Create OR operator expression via kexpressions factory.
            val expr = KExpressionsFactory::eINSTANCE.createOperatorExpression
            expr.setOperator(OperatorType::OR)
                    
            // For each predecessor add its expression to the sub expressions list of the operator expression.
            relevantPredecessors.forEach[ 
//                if (!scheduledBlock.schizophrenic || it.basicBlock.entryBlock)
                    expr.subExpressions += it.predecessorExpression(scheduledBlock.schedulingBlock, schedule, scg)
            ]
            gExpr.expression = expr
        } 
        // If it is exactly one predecessor, we can use its expression directly.
        else if (relevantPredecessors.size == 1) {
//            if (!scheduledBlock.schizophrenic || basicBlock.predecessors.head.basicBlock.entryBlock)
                gExpr.expression = relevantPredecessors.head.predecessorExpression(scheduledBlock.schedulingBlock, schedule, scg)
        } 
        else 
        {
            /**
            * If we reach this point, the basic block contains no predecessor information but is not marked as go block.
            * This is not supported by this scheduler: throw an exception. 
            */
            if (!basicBlock.deadBlock && !scheduledBlock.schizophrenic) {
                throw new UnsupportedSCGException("Cannot handle standard guard without predecessor information!")
            } else {
                gExpr.expression = FALSE  
            }
        }
        gExpr       
    }


    // --- CREATE GUARDS: SUBSEQUENT SCHEDULING BLOCK 

    protected def handleSubsequentSchedulingBlockGuardExpression(ScheduledBlock scheduledBlock, Assignment assignment,  
        List<ControlFlow> nextFlows, Schedule schedule, SCGraph scg,  List<Node> nodeCache
    ) {
        val gExpr = scheduledBlock.schedulingBlock.createSubsequentSchedulingBlockGuardExpression(schedule, scg)
        assignment.addGuardExpression(gExpr, nextFlows, scg, nodeCache)       
    }

    
    protected def GuardExpression createSubsequentSchedulingBlockGuardExpression(SchedulingBlock schedulingBlock, Schedule schedule, SCGraph scg) {
        new GuardExpression => [
            valuedObject = schedulingBlock.guard
            expression = schedulingBlock.basicBlock.schedulingBlocks.head.guard.reference
        ]
    }
    
    /**
     * PredecessorExpression forms a single expression with respect to the predecessor,
     * meaning that the expression is a reference to the guard of the predecessor and
     * combined with the (negated) expression of a condition in the case of a 
     * conditional predecessor.
     *  
     * @param predecessor
     *          The predecessor in question.
     * @return Returns the expression for this predecessor.
     * @throws UnsupportedSCGException
     *      Throws an UnsupportedSCGException if the predecessor does not contain sufficient information to form the expression.
     */
    protected def Expression predecessorExpression(Predecessor predecessor, SchedulingBlock schedulingBlock, Schedule schedule, SCGraph scg) {
        // Return a solely reference as expression if the predecessor is not a conditional
        if (predecessor.branchType == BranchType::NORMAL) {
            return predecessor.basicBlock.schedulingBlocks.head.guard.reference
        }
        // If we are in the true branch of the predecessor, combine the predecessor guard reference with
        // the condition of the conditional and return the expression.
        else if (predecessor.branchType == BranchType::TRUEBRANCH) {
            val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression
            expression.setOperator(OperatorType::AND)
            expression.subExpressions += predecessor.basicBlock.schedulingBlocks.head.guard.reference
            expression.subExpressions += predecessor.conditional.condition.copy
            
            // Conditional branches are mutual exclusive. Since the other branch may modify the condition 
            // make sure the subsequent branch will not evaluate to true if the first one was already taken.
            val twin = predecessor.getSchedulingBlockTwin(BranchType::ELSEBRANCH, schedule, scg)
            if (predecessorTwinMark.contains(twin)) {
                expression.subExpressions.add(0, twin.guard.reference.negate)
            } 
            predecessorTwinMark.add(schedulingBlock)
            
            return expression.fix
        }
        // If we are in the true branch of the predecessor, combine the predecessor guard reference with
        // the negated condition of the conditional and return the expression.
        else if (predecessor.branchType == BranchType::ELSEBRANCH) {
            val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression
            expression.setOperator(OperatorType::AND)
            expression.subExpressions += predecessor.basicBlock.schedulingBlocks.head.guard.reference
            expression.subExpressions += predecessor.conditional.condition.copy.negate

            // Conditional branches are mutual exclusive. Since the other branch may modify the condition 
            // make sure the subsequent branch will not evaluate to true if the first one was already taken.
            val twin = predecessor.getSchedulingBlockTwin(BranchType::TRUEBRANCH, schedule, scg)
            if (predecessorTwinMark.contains(twin)) {
                expression.subExpressions.add(0, twin.guard.reference.negate)
            } 
            predecessorTwinMark.add(schedulingBlock)

            return expression.fix
        }
            
        throw new UnsupportedSCGException("Cannot create predecessor expression without predecessor block type information.")
    }
    
    protected def SchedulingBlock getSchedulingBlockTwin(Predecessor predecessor, BranchType blockType, Schedule schedule, SCGraph scg) {
        val twin = predecessorTwinCache.get(predecessor)
        predecessorSBCache.get(twin).head
    }

    private def cacheTwin(Predecessor predecessor, List<BasicBlock> basicBlocks) {
        val bb = predecessor.basicBlock
        var predList = predecessorBBCache.get(bb)
        if (predList == null) {
            predList = <Predecessor> newArrayList => [ add(predecessor) ]
            predecessorBBCache.put(bb, predList)
        } else {
            val fPred = predList.get(0)
            predList.add(predecessor)
            predecessorTwinCache.put(fPred, predecessor)
            predecessorTwinCache.put(predecessor, fPred)
            
            
            val sbList1 = <SchedulingBlock> newArrayList
            val basicBlock1 = fPred.eContainer as BasicBlock
            sbList1 += basicBlock1.schedulingBlocks.head
            predecessorSBCache.put(fPred, sbList1)
            
            val sbList2 = <SchedulingBlock> newArrayList
            val basicBlock2 = predecessor.eContainer as BasicBlock
            sbList2 += basicBlock2.schedulingBlocks.head
            predecessorSBCache.put(predecessor, sbList2)
        }
    }
 
    protected def Expression fixSchizophrenicExpression(SCGraph scg, Expression expression) {
        if (expression instanceof ValuedObjectReference) {
            val vor = (expression as ValuedObjectReference)
            val newVO = scg.findValuedObjectByName(vor.valuedObject.name + SCHIZOPHRENIC_SUFFIX)
            if (newVO != null) {
                vor.valuedObject = newVO 
            }
        } else if (expression instanceof OperatorExpression) {
            val vors = (expression as OperatorExpression).eAllContents.filter(typeof(ValuedObjectReference))
            for(vor : vors.toIterable) {
                val newVO = scg.findValuedObjectByName(vor.valuedObject.name + SCHIZOPHRENIC_SUFFIX)
                if (newVO != null) {
                    vor.valuedObject = newVO 
                }
            }
        }
        
        expression
    }   
    
}