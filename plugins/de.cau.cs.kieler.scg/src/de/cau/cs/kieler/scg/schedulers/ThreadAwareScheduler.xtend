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

import com.google.inject.Inject
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SchedulingBlock
import java.util.ArrayList
import java.util.List
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.ScheduledBlock
import de.cau.cs.kieler.scg.ScgFactory

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
 * @kieler.design 2014-01-18 proposed 
 * @kieler.rating 2014-01-18 proposed yellow
 */
class ThreadAwareScheduler extends SimpleScheduler {

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    	
	@Inject
	extension SCGCoreExtensions
	
    @Inject
    extension SCGControlFlowExtensions
    
    @Inject
    extension SCGThreadExtensions		

    // -------------------------------------------------------------------------
    // -- Scheduler 
    // -------------------------------------------------------------------------
    		
	private def int clusterDependencyCount(List<SchedulingBlock> cluster) {
		var dependencies = 0
			
		for (sBlock : cluster) {
			for (nodes : sBlock.nodes) {
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
	    	
    	scg.nodes.filter(typeof(Fork)).forEach[
    		allNext.map[ target ].filter(typeof(Entry)).forEach[
    			val cluster = <SchedulingBlock> newArrayList
    			threadNodes.forEach[ node |
    				val sBlock = node.schedulingBlock
    				if (!cluster.contains(sBlock)) { 
    					cluster += sBlock
    					marked += sBlock
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
	    	
    	constraints => [ schedulingBlockClusters = clusters.sortBy [ clusterDependencyCount ] ]
    }
	
	
    protected def int topologicalClusterPlacement(SchedulingBlock schedulingBlock, 
        int clusterPosition, 
        List<SchedulingBlock> schedulingBlocks, List<ScheduledBlock> schedule, 
        SchedulingConstraints constraints, List<SchedulingBlock> visited, SCGraph scg
    ) {
        var placed = 0
        if (!visited.contains(schedulingBlock)) {
            visited.add(schedulingBlock)
            for(predecessor : schedulingBlock.basicBlock.predecessors) {
                for (sBlock : predecessor.basicBlock.schedulingBlocks) {
                    if (schedulingBlocks.contains(sBlock)) {
                        sBlock.topologicalClusterPlacement(clusterPosition, schedulingBlocks, schedule,
                            constraints, visited, scg)
                    }
                }
            }
            for(dependency : schedulingBlock.dependencies) {
                if (dependency.concurrent && !dependency.confluent) {
                    if (schedulingBlocks.contains((dependency.eContainer as Node).schedulingBlock)) { 
                        (dependency.eContainer as Node).schedulingBlock.topologicalClusterPlacement(
                            clusterPosition, schedulingBlocks, schedule, constraints, visited, scg)
                    } 
                }
            }
            
//            if (schedulingBlock.isPlaceable(schedulingBlocks, schedule, scg)) {
//            	val scheduledBlock = ScgFactory.eINSTANCE.createScheduledBlock => [
//            		it.schedulingBlock = schedulingBlock
//            	]
//                schedule.add(scheduledBlock)
                placedBlocks.add(schedulingBlock)
                constraints.schedulingBlockClusters.get(clusterPosition).remove(schedulingBlock)
                placed = placed + 1
            }
//        } 
        placed
    }	
	
	
    protected override boolean createSchedule(SCGraph scg, List<ScheduledBlock> schedule, SchedulingConstraints constraints,
    	KielerCompilerContext context) {

        // fixpoint is set to true if an iteration cannot set any remaining blocks.
        var fixpoint  = false
        
        val schedulingBlocks = new ArrayList<SchedulingBlock>(schedulingBlockCount)
        schedulingBlocks.addAll(constraints.schedulingBlocks)
        
        // As long as there are blocks remaining and we have not reached a fix point.
        while (constraints.schedulingBlockClusters.clustersSize > 0 && !fixpoint) {
        	// Assume fix point.
   	    	fixpoint = true
   	    	
            val visitList = <SchedulingBlock> newArrayList

            var clusterPosition = 0
            var clusterPlaced = 0
            
   	    	for(cluster : constraints.schedulingBlockClusters) {
   	    	   for(sBlock : cluster) {
   	    	       val placed = sBlock.topologicalClusterPlacement(clusterPosition, cluster, schedule, constraints, visitList, scg)
   	    	       clusterPlaced = clusterPlaced + placed
   	    	   }
   	    	   clusterPosition = clusterPosition + 1
   	    	}
   	    	
   	    	if (clusterPlaced != 0) fixpoint = false
         
        }
    	
    	!fixpoint 
    }
	
}