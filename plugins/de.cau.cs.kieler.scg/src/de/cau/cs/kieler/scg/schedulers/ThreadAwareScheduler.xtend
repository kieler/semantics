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
import de.cau.cs.kieler.scg.SchedulingBlock
import java.util.List
import de.cau.cs.kieler.scg.Fork
import com.google.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Schedule
import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.SCGraph

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
class ThreadAwareScheduler extends SimpleScheduler {
	
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
	
	    protected override SchedulingConstraints orderSchedulingBlocks(SCGraph scg) {
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
	
	
    protected def int topologicalClusterPlacement(SchedulingBlock schedulingBlock, 
        int clusterPos, 
        List<SchedulingBlock> schedulingBlocks, List<SchedulingBlock> schedule, 
        SchedulingConstraints constraints, List<SchedulingBlock> visited, SCGraph scg
    ) {
        var placed = 0 as int
        if (!visited.contains(schedulingBlock)) {
            visited.add(schedulingBlock)
            for(pred : schedulingBlock.basicBlock.predecessors) {
                for (sb : pred.basicBlock.schedulingBlocks) {
                    if (schedulingBlocks.contains(sb))
                        sb.topologicalClusterPlacement(clusterPos, schedulingBlocks, schedule, constraints, visited, scg)
                }
            }
            for(dep : schedulingBlock.dependencies) {
                if (dep.concurrent && !dep.confluent) {
//                    if (scg.analyses.filter[ id == interleavedAssignmentAnalyzerId ].filter[ objectReferences.contains(dep) ].empty)
                        if (schedulingBlocks.contains((dep.eContainer as Node).schedulingBlock)) 
                        (dep.eContainer as Node).schedulingBlock.topologicalClusterPlacement(clusterPos, schedulingBlocks, schedule, constraints, visited, scg) 
                }
            }
            
            if (schedulingBlock.isPlaceable(schedulingBlocks, schedule, scg)) {
                schedule.add(schedulingBlock)
                placedBlocks.add(schedulingBlock)
                // TODO: Revamp guards
                // scg.guards += schedulingBlock.createGuardExpression(schedule, scg)
//                schedulingBlocks.remove(schedulingBlock)
                constraints.schedulingBlockClusters.get(clusterPos).remove(schedulingBlock)
                placed = placed + 1
            }
        } 
        
        placed
    }	
	
	
    protected override boolean createSchedule(SCGraph scg, List<SchedulingBlock> schedule, SchedulingConstraints constraints) {
        // fixpoint is set to true if an iteration cannot set any remaining blocks.
        var fixpoint  = false
        
        val schedulingBlocks = <SchedulingBlock> newArrayList => [ it.addAll(constraints.schedulingBlocks) ]
        
        // As long as there are blocks remaining and we have not reached a fix point.
        while (constraints.schedulingBlockClusters.clustersSize > 0 && !fixpoint) {
        	// Assume fix point.
	        var clusterFixPoint = false
	        val reiterateCluster = true
   	    	fixpoint = true
   	    	
            val visitList = <SchedulingBlock> newArrayList
            val clusters = ImmutableList::copyOf(constraints.schedulingBlockClusters)

            var clusterPos = 0
            var clusterPlaced = 0
            
   	    	for(cluster : clusters) {
   	    	   val clusterCopy = ImmutableList::copyOf(cluster)
   	    	   for(sb : clusterCopy) {
   	    	       val placed = sb.topologicalClusterPlacement(clusterPos, cluster, schedule, constraints, visitList, scg)
   	    	       clusterPlaced = clusterPlaced + placed
   	    	   }
   	    	   clusterPos = clusterPos + 1
   	    	}
   	    	
   	    	if (clusterPlaced != 0) fixpoint = false
         
        }
    	
    	!fixpoint 
    }
	
}