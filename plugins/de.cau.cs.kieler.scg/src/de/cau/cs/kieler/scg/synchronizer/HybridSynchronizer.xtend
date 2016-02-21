/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.synchronizer

import com.google.inject.Inject
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.scg.Fork

/** 
 * This class is part of the SCG transformation chain. In particular a synchronizer is called by the scheduler
 * whenever multiple threads join again. <br>
 * The chain is used to gather important information 
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
 *   |    |-- Scheduling
 *   |    |   |-- Synchonize threads			<== YOU ARE HERE
 *   |    |-- Optimization
 *   |-- Sequentialization (new SCG)
 *       |-- Optimization					
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-01-21 proposed 
 * @kieler.rating 2013-01-21 proposed yellow
 * 
 * @extends AbstractSCGSynchronizer
 */

class HybridSynchronizer extends AbstractSynchronizer {
	
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    
    @Inject
    extension SCGCoreExtensions
    
    @Inject
    extension SCGControlFlowExtensions
        
    @Inject
    extension KExpressionsValuedObjectExtensions	

    @Inject
    extension KExpressionsCreateExtensions  
    
    @Inject
    extension KExpressionsComplexCreateExtensions 
	
    // -------------------------------------------------------------------------
    // -- Constants
    // -------------------------------------------------------------------------
    	
    public static val SYNCHRONIZER_ID = "de.cau.cs.kieler.scg.synchronizer.hybrid"    	
    	
   	private val String FORKVARSUFFIX = "_F"
   	private val String EXITVARSUFFIX = "_T"
    	
    // -------------------------------------------------------------------------
    // -- Synchronizer
    // -------------------------------------------------------------------------	
	
	override protected build(Join join, Guard guard, SchedulingBlock schedulingBlock, SCGraph scg) {
    	// Create a new SynchronizerData class which holds the data to return.
        val data = new SynchronizerData()
		
		// Since we are working we completely enriched SCGs, we can use the SCG extensions 
		// to retrieve the scheduling block of the join node in question.
		val joinSB = join.schedulingBlock
        val forkSB = join.fork.schedulingBlock

        // The valued object of the GuardExpression of the synchronizer is the guard of the
        // scheduling block of the join node. 
        data.guardExpression.valuedObject = joinSB.guards.head.valuedObject

        
        val forkVar = createValuedObject(forkSB.guards.head.valuedObject.name + FORKVARSUFFIX)
        data.valuedObjects.add(forkVar)
        data.addAdditionalAssignment(forkSB, forkVar, TRUE)
        data.addAdditionalAssignment(joinSB, forkVar, FALSE)
		data.guardExpression.expression = forkVar.reference
		
		val exitExpression = createLogicalOrExpression
		// Create a new list for all exit nodes of the threads of the fork-join-combination...
        val exitNodes = <Exit> newLinkedList
        // ... and fill the list with the exit nodes of all threads.
        join.allPrevious.forEach[
        	val exit = it.eContainer as Exit
        	val exitSB = exit.schedulingBlock 
        	exitNodes.add(exit)
//        	val exitVar = createValuedObject(exitSB.guard.name + EXITVARSUFFIX)
            val exitVar = createValuedObject(exitSB.guards.head.valuedObject.name + EXITVARSUFFIX)
        	data.valuedObjects.add(exitVar)
        	data.addAdditionalAssignment(forkSB, exitVar, TRUE)
        	data.addAdditionalAssignment(exitSB, exitVar, FALSE)
        	exitExpression.subExpressions.add(exitVar.reference)
        	data.threadMapping.put(exit.entry, exitVar)
        ]
        
        data.guardExpression.expression = data.guardExpression.expression.and(exitExpression.not)
        
	}
    
    override isSynchronizable(Fork fork, Iterable<ThreadPathType> threadPathTypes, boolean instantaneousFeedback) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override getId() {
        return SYNCHRONIZER_ID
    }
    
//    override getExcludedPredecessors(Join join, Map<Node, SchedulingBlock> schedulingBlockCache,
//    	List<AbstractKielerCompilerAncillaryData> ancillaryData
//    ) {
//        <Predecessor> newHashSet
//    }    
//    
//	override getAdditionalPredecessors(Join join, Map<Node, SchedulingBlock> schedulingBlockCache, List<AbstractKielerCompilerAncillaryData> ancillaryData) {
//		<Predecessor> newHashSet
//	}    
		
}