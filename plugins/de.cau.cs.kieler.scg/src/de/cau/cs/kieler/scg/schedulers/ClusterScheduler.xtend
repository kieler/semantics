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

import de.cau.cs.kieler.scg.schedulers.SimpleScheduler
import de.cau.cs.kieler.scgsched.SCGraphSched
import de.cau.cs.kieler.scgbb.SchedulingBlock
import java.util.List
import de.cau.cs.kieler.scg.Fork
import com.google.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scgsched.Schedule
import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scgdep.Dependency

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
 * @kieler.design 2014-01-18 proposed 
 * @kieler.rating 2014-01-18 proposed yellow
 */
class ClusterScheduler extends SimpleScheduler {
	
		@Inject
		extension SCGExtensions
		
		private def int clusterDependencies(List<SchedulingBlock> cluster) {
			var dependencies = 0
			
			for (sb : cluster) {
				for (nodes : sb.nodes) {
					dependencies = dependencies + 
						nodes.incoming.filter(typeof(Dependency)).filter[ concurrent == true ].size
				}
			}
			
		    dependencies
		}
		
		private def int clustersSize(List<List<SchedulingBlock>> clusters) {
			var size = 0
			for (cluster : clusters) {
				size = size + cluster.size
			}
			size
		}
	
	    protected override SchedulingConstraints orderSchedulingBlocks(SCGraphSched scg) {
	    	val constraints = super.orderSchedulingBlocks(scg)
	    	val marked = <SchedulingBlock> newArrayList
	    	val clusters = <List<SchedulingBlock>> newArrayList
	    	
	    	scg.eAllContents.filter(typeof(Fork)).forEach[
	    		allNext.map[ target ].filter(typeof(Entry)).forEach[
	    			val cluster = <SchedulingBlock> newArrayList
	    			threadNodes.forEach[ node |
	    				val sb = node.schedulingBlock
	    				if (!cluster.contains(sb)) { 
	    					cluster += sb
	    					marked += sb
	    				}
	    			]
	    			clusters += cluster
	    		]
	    	]
	    	
	    	val cluster = <SchedulingBlock> newArrayList
	    	constraints.schedulingBlocks.forEach[
	    		if (!marked.contains(it)) cluster += it
	    	]
	    	clusters.add(0, cluster)
	    	
	    	constraints => [ schedulingBlockClusters = clusters.sortBy [ clusterDependencies ] ]
    }
	
	
	
    protected override boolean createSchedule(SCGraphSched scg, Schedule schedule, SchedulingConstraints constraints) {
        // fixpoint is set to true if an iteration cannot set any remaining blocks.
        var fixpoint  = false
   	    var clusterPos = 0
        
        val schedulingBlocks = <SchedulingBlock> newArrayList => [ it.addAll(constraints.schedulingBlocks) ]
        
        // As long as there are blocks remaining and we have not reached a fix point.
        while (constraints.schedulingBlockClusters.clustersSize > 0 && !fixpoint) {
        	// Assume fix point.
	        var clusterFixPoint = false
	        val reiterateCluster = true
   	    	fixpoint = true
         
         	while(constraints.schedulingBlockClusters.size>0 && !clusterFixPoint) {
	            // Copy all remaining blocks.
    	        var clusterCopy = ImmutableList::copyOf(constraints.schedulingBlockClusters.get(clusterPos))
    	        
    	        clusterFixPoint = true
            
        	    // For each block try to process it.
            	for(block : clusterCopy) {
                
                	// If all preconditions are met, process this block, add it to the schedule and create its guard expression.
	                // Then, remove it from our list of remaining blocks.
    	            if (block.isPlaceable(schedulingBlocks, schedule, scg)) {
        	            schedule.schedulingBlocks.add(block)
            	        scg.guards += block.createGuardExpression(scg)
                    
                	    schedulingBlocks.remove(block)
                    	constraints.schedulingBlockClusters.get(clusterPos) -= block
                    
	                    // This iteration updated the lists. This is not a fix point.
    	                clusterFixPoint = false
    	                fixpoint = false
        	        }
       	        }
       	        
       	        if (clusterFixPoint) {
  	        		clusterPos = clusterPos + 1
   	        		if (clusterPos >= constraints.schedulingBlockClusters.size) {
   	        			clusterPos = 0
	    	    	}
       	        } else {
//       	        	clusterPos = 0
       	        }
            }
        }
    	
    	!fixpoint 
    }
	
}