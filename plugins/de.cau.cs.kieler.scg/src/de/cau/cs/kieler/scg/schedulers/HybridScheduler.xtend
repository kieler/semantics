/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.schedulers

import de.cau.cs.kieler.scg.schedulers.ClusterScheduler
import de.cau.cs.kieler.scgsched.SCGraphSched
import de.cau.cs.kieler.scgsched.Schedule
import de.cau.cs.kieler.scgsched.GuardExpression
import de.cau.cs.kieler.scgbb.SchedulingBlock
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.synchronizer.HybridSynchronizer
import com.google.inject.Guice
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.synchronizer.SynchronizerData
import de.cau.cs.kieler.scgsched.ScgschedFactory
import com.google.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGExtensions

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
 * @kieler.design 2014-01-23 proposed 
 * @kieler.rating 2014-01-23 proposed yellow
 */

class HybridScheduler extends ClusterScheduler {
	
    protected override boolean createSchedule(SCGraphSched scg, Schedule schedule, SchedulingConstraints constraints) {
		super.createSchedule(scg, schedule, constraints) 
	} 
	
	protected override GuardExpression createSynchronizerBlockGuardExpression(SchedulingBlock schedulingBlock, SCGraph scg) {
		// The simple scheduler uses the SurfaceSynchronizer. 
		// The result of the synchronizer is stored in the synchronizerData class joinData.
		val HybridSynchronizer synchronizer = Guice.createInjector().getInstance(typeof(HybridSynchronizer))
		val joinData = synchronizer.synchronize(schedulingBlock.nodes.head as Join)

		// Add additional valued objects to the SCG and use the guard expression of the synchronizer as it is.
		scg.valuedObjects += joinData.valuedObjects
		
		joinData.createSynchronizerAlteration(scg as SCGraphSched).guardExpression
    }
    
    protected def SynchronizerData createSynchronizerAlteration(SynchronizerData synchronizerData, SCGraphSched scg) {
    	synchronizerData => [ data |
    		data.additionalAssignmentBlocks.forEach [ block |
				data.getAdditionalAssignments(block).forEach[ dataPair |
		    		ScgschedFactory::eINSTANCE.createAssignmentAddition => [
    					valuedObject = dataPair.first
    					expression = dataPair.second
    					
    					if (block.nodes.head instanceof Join) {
    						position = (block.nodes.head as Join) 	
    					} else {
    						position = block.nodes.last
    					}
    					
    					scg.alterations.add(it)
    				]
    			]
    		]
    	]
    }
	
}