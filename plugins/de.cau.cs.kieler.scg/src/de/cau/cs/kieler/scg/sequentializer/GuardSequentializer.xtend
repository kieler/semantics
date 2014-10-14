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
import de.cau.cs.kieler.scg.synchronizer.DepthJoinSynchronizer
import de.cau.cs.kieler.scg.synchronizer.SynchronizerData
import de.cau.cs.kieler.scg.Guard

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

class GuardSequentializer extends AbstractSequentializer {

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
    protected var SynchronizerData joinData = null
    
    protected val guardBlockCache = <ValuedObject, SchedulingBlock> newHashMap
         
               
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

        if (scg.hasAnnotation(AbstractSequentializer::ANNOTATION_SEQUENTIALIZED)) {
            return scg
        }

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
        
        val schedulingBlocks = <SchedulingBlock> newArrayList
        scg.basicBlocks.forEach[
        	it.schedulingBlocks.forEach[
        		schedulingBlocks += it
        		guardBlockCache.put(it.guard.valuedObject, it)
        	]
        ]
        
        scg.copyDeclarations(newSCG)
       	val guardDeclaration = createDeclaration=>[ setType(ValueType::BOOL) ]
       	newSCG.declarations += guardDeclaration
        scg.guards.forEach[
            val vo = createValuedObject(it.valuedObject.name) 
                => [ guardDeclaration.valuedObjects += it ]
            it.valuedObject.addToValuedObjectMapping(vo)
        ]
        
        var time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Preparation for sequentialization: caches finished (time elapsed: "+(time / 1000)+"s).")          
        
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
    	for (guard : schedule.guards) {
//    		val sBlock = guardBlockCache.get(guard.valuedObject)
    		val sBlock = guard.schedulingBlockLink
	  	   /**
   			 * For each guard a guard expression exists.
   		     * Retrieve the expression and test it for null. 
	  	     * If the guard expression is null, the scheduler could not create an expression for this guard. This is bad. Perhaps the SCG is erroneous. Throw an exception.
		     * Otherwise, it is possible that the guard expression houses empty expressions for a synchronizer. Add them as well.
		     */    		
		     
		     val assignment2 = ScgFactory::eINSTANCE.createAssignment
			 assignment2.addGuardExpression(guard, nextControlFlows, scg, nodeCache)		     
    		
    		/**
    		 * If the scheduling block includes assignment nodes, they must be executed if the corresponding guard 
    		 * evaluates to true. Therefore, create a conditional for the guard and add the assignment to the
    		 * true branch. They will execute their expression if the guard is active in this tick instance. 
    		 */
    		if (sBlock != null && guard.sequentialize && sBlock.nodes.filter(typeof(Assignment)).size>0)
    		{
    			// Create a conditional and set a reference of the guard as condition.
    			val conditional = ScgFactory::eINSTANCE.createConditional
                conditional.condition = guard.valuedObject.reference.copySCGExpression
//                if (sb.schizophrenic) {
//                    conditional.condition = scg.fixSchizophrenicExpression(conditional.condition)
//                }
    			
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
    				conditionalAssignment.addAnnotation(ANNOTATION_CONDITIONALASSIGNMENT, guard.valuedObject.name)
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
    
    protected def Assignment addGuardExpression(Assignment assignment, Guard guard, 
        List<ControlFlow> nextControlFlows, SCGraph scg, List<Node> nodeCache
    ) {
        // Then, copy the expression of the guard to the newly created assignment.
        assignment.valuedObject = guard.valuedObject.getValuedObjectCopyWNULL
        assignment.assignment = guard.expression.copySCGExpression
        
		nextControlFlows.forEach[ target = assignment ]
		nextControlFlows.clear
		// Add the conditional.
        nodeCache.add(assignment)
        val nextControlFlow = ScgFactory::eINSTANCE.createControlFlow
        assignment.next = nextControlFlow
        nextControlFlows.add(nextControlFlow)
            
        assignment
    }    
        
    def ValuedObject findValuedObjectByName(Declaration declaration, String name) {
        for(vo : declaration.valuedObjects) {
            if (vo.name == name) return vo
        }
        return null
    }    
    
}