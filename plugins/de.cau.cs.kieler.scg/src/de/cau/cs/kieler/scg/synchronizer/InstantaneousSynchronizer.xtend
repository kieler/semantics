/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
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
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
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
 * @kieler.design 2013-11-28 proposed 
 * @kieler.rating 2013-11-28 proposed yellow
 * 
 * @extends AbstractSCGSynchronizer
 */

class InstantaneousSynchronizer extends AbstractSynchronizer {
 
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension SCGControlFlowExtensions

    public static val SYNCHRONIZER_ID = "de.cau.cs.kieler.scg.synchronizer.instantaneous"

    // -------------------------------------------------------------------------
    // -- Synchronizer
    // -------------------------------------------------------------------------
    /**
     * In general (according to the Esterel v5 primer) a synchronizer is active if
     * all threads are exited or already finished in this tick AND if at least one 
     * thread reached its end in this tick.<br>
	 * The <em>surface synchronizer</em> looks for surface blocks in the threads and uses them
	 * to determine active threads. Any thread currently residing in a surface node
	 * is not finished and consumes time. This is used to build the empty flags of 
	 * the synchronizer.<br>
	 * To build the expression for the thread termination it is sufficient to check the
	 * activity state of the basic block which comprises the exit node of the tread.<br>
	 * To implement the actual synchronizer we must override the build method.<br>
	 * 
	 * @param join
	 * 			the join node in question
	 * @return
	 * 		Returns a {@code SynchronizerData} class including all mandatory data for the scheduler.
	 */  
    override protected build(Join join, Guard guard, SchedulingBlock schedulingBlock, SCGraph scg) {
        var data = new SynchronizerData()=> [ 
            setJoin(join)
            setGuard(guard)
        ]
		
		val joinSB = join.getCachedSchedulingBlock
		
        val exitNodes = join.allPrevious.map[ eContainer as Exit ]
        
        data.guardExpression.valuedObject = joinSB.guard.valuedObject
                
        data.guardExpression.expression = exitNodes.head.getCachedSchedulingBlock.guard.valuedObject.reference
        
        guard.expression = data.guardExpression.expression

    }
       
    override getId() {
        return SYNCHRONIZER_ID
    }
    
    override isSynchronizable(Fork fork, Iterable<ThreadPathType> threadPathTypes, boolean instantaneousFeedback) {
        var synchronizable = true
        
        for(tpt : threadPathTypes) {
            if (tpt != ThreadPathType::INSTANTANEOUS) synchronizable = false
        } 
        
        synchronizable
    }
    
//    override getExcludedPredecessors(Join join, Map<Node, SchedulingBlock> schedulingBlockCache,
//    	List<AbstractKielerCompilerAncillaryData> ancillaryData) {
//        <Predecessor> newHashSet
//    }
//	
//	override getAdditionalPredecessors(Join join, Map<Node, SchedulingBlock> schedulingBlockCache, List<AbstractKielerCompilerAncillaryData> ancillaryData) {
//		<Predecessor> newHashSet
//	}
    
}