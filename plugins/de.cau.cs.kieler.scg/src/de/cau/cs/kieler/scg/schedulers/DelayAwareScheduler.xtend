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
 package de.cau.cs.kieler.scg.schedulers

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Predecessor
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScheduledBlock
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.extensions.SCGCacheExtensions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.synchronizer.DepthJoinSynchronizer
import de.cau.cs.kieler.scg.synchronizer.SynchronizerSelector
import java.util.List
import java.util.Set

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
 * @kieler.design 2013-11-27 proposed 
 * @kieler.rating 2013-11-27 proposed yellow
 */
class DelayAwareScheduler extends SimpleScheduler {
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    
    override getId() {
        //TODO: Create unique transformation ID and register this class as transformation
        return null //SCGTransformations::SCHEDULING_ID
    }

    override getName() {
        //TODO: see above
        return null //SCGTransformations::SCHEDULING_NAME
    }

    override getProducedFeatureId() {
        return SCGFeatures::SCHEDULING_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::GUARD_ID)
    }
    
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
     
    @Inject
    extension SCGCoreExtensions
    
    @Inject
    extension SynchronizerSelector    
    
    protected val schizophrenicBlocks = <SchedulingBlock> newHashSet
    protected val schizophrenicEntry = <SchedulingBlock> newHashSet
    
    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
    
    protected val predecessorExcludeSet = <Predecessor> newHashSet   
    protected val predecessorIncludeSets = <BasicBlock, Set<Predecessor>> newHashMap 
    
    public def boolean isPlaceable(SchedulingBlock schedulingBlock, List<SchedulingBlock> remainingBlocks, 
        List<ScheduledBlock> schedule, SCGraph scg, Set<Node> pilData, boolean schizophrenic, boolean depthJoin
    ) {
        // Assume all preconditions are met and query parent basic block.
        val parentBasicBlock = schedulingBlock.eContainer as BasicBlock

        val preceedingSchedulingBlocks = <SchedulingBlock> newHashSet
        // For all predecessor blocks check whether they are already processed.
        if (schedulingBlock != schedulingBlock.basicBlock.schedulingBlocks.head) {
            var index = schedulingBlock.basicBlock.schedulingBlocks.indexOf(schedulingBlock)
            preceedingSchedulingBlocks += schedulingBlock.basicBlock.schedulingBlocks.get(index - 1)
        } else {        
          for(predecessor : parentBasicBlock.predecessors){
            if (!predecessorExcludeSet.contains(predecessor)) {
//                for(sBlock : predecessor.basicBlock.schedulingBlocks.last){
                    val sBlock = predecessor.basicBlock.schedulingBlocks.last
                    preceedingSchedulingBlocks += sBlock
                }
            }
        for(sBlock:preceedingSchedulingBlocks) {        
                    // If any scheduling block of that basic block is not already in our schedule,
                    // the precondition test fails. Set placeable to false.
                    if (
//                    	!placedBlocks.contains(sBlock) && 
//                        !(schizophrenic && !schizophrenicBlocks.contains(sBlock)) &&
                        !(schizophrenic && (schizophrenicEntry.contains(sBlock) || sBlock.isOnCriticalPath(pilData))) &&
                        !(depthJoin && schizophrenicBlocks.contains(sBlock))
                    ) { return false }
                }
            }
//            }
        
//        // For all predecessor blocks check whether they are already processed.
//        if (predecessorIncludeSets.containsKey(parentBasicBlock)) {
//	        for(predecessor : predecessorIncludeSets.get(parentBasicBlock)){
//    	        if (!predecessorExcludeSet.contains(predecessor)) {
//        	        for(sBlock : predecessor.basicBlock.schedulingBlocks){
//            	        // If any scheduling block of that basic block is not already in our schedule,
//                	    // the precondition test fails. Set placeable to false.
//                    if (!placedBlocks.contains(sBlock) && 
//                        !(schizophrenic && (sBlock.basicBlock.entryBlock || sBlock.isOnCriticalPath(pilData))) &&
//                        !(depthJoin && schizophrenicBlocks.contains(sBlock))
//                    ) { return false }
//                	}
//            	}
//        	}        
//        }
                
        // Basically, perform the same test for dependency. We cannot create a guard expression 
        // if any block containing a dependency is still in our list.
        for(dependency : schedulingBlock.dependencies.filter(typeof(DataDependency))) {
            if (dependency.concurrent && !dependency.confluent) {
                val sBlock = schedulingBlockCache.get(dependency.eContainer as Node)
                    if (
//                    	!placedBlocks.contains(sBlock) && 
                        !(schizophrenic && (schizophrenicEntry.contains(sBlock) || sBlock.isOnCriticalPath(pilData))) &&
                        !(depthJoin && schizophrenicBlocks.contains(sBlock)) &&
                        !schizophrenicBlocks.contains(sBlock)
                    ) { return false }
            }
        }
        
        return true
    }
   
    
    public def void topologicalPlacement(SchedulingBlock schedulingBlock, 
        List<SchedulingBlock> schedulingBlocks, List<ScheduledBlock> schedule, 
        SchedulingConstraints constraints, SCGraph scg, Set<Node> pilData, boolean schizophrenic,
        String debugIn
    ) {
        System.out.print(debugIn + "Scheduling block: " + schedulingBlock.guard.valuedObject.name + ": ")
        
        if (schizophrenic && schizophrenicEntry.contains(schedulingBlock)) {
            System.out.println(" schizophrenic entry block!")
            return
        }
        if (schizophrenic && schizophrenicBlocks.contains(schedulingBlock)) {
            System.out.println(" schizophrenic block already exists!")
            return
        }
        
        if (!topologicalSortVisited.contains(schedulingBlock)) {
        	if (!schizophrenic) {
        	    System.out.println(" scheduling.")
//            	topologicalSortVisited.add(schedulingBlock)
           	} else {
                System.out.println(" schizophrenic.")
           	}
           	
           	var depthJoin = false
            if (schedulingBlock.basicBlock.synchronizerBlock && 
                schedulingBlock == schedulingBlock.basicBlock.schedulingBlocks.head
            ) {
                val join = schedulingBlock.basicBlock.schedulingBlocks.head.nodes.head as Join
                val synchronizer = join.synchronizer
                if (synchronizer.id == DepthJoinSynchronizer::SYNCHRONIZER_ID) {
                    depthJoin = true
                }
            }           	
           	
           	val preceedingSchizo = <SchedulingBlock, Boolean> newHashMap
           	val preceedingSchedulingBlocks = <SchedulingBlock> newHashSet
            if (schedulingBlock != schedulingBlock.basicBlock.schedulingBlocks.head) {
                var index = schedulingBlock.basicBlock.schedulingBlocks.indexOf(schedulingBlock)
                preceedingSchedulingBlocks += schedulingBlock.basicBlock.schedulingBlocks.get(index - 1)
            } else {
                for(predecessor : schedulingBlock.basicBlock.predecessors) {
                    if (!predecessorExcludeSet.contains(predecessor)) {
//                    if (!schizophrenic) {
	                   	    preceedingSchedulingBlocks += predecessor.basicBlock.schedulingBlocks.last
//	            	} else {
//	            	    for(sb : predecessor.basicBlock.schedulingBlocks) {
//	            	        if (!sb.isOnCriticalPath(pilData)) {
//	            	            preceedingSchedulingBlocks += sb
//	            	        }
//	            	    }
//	            	}
                	}
               	}
           	}
//	        if (predecessorIncludeSets.containsKey(schedulingBlock.basicBlock)) {
//    	        for(predecessor : predecessorIncludeSets.get(schedulingBlock.basicBlock)) {
//        	        if (!predecessorExcludeSet.contains(predecessor)) {
//		            	preceedingSchedulingBlocks += predecessor.basicBlock.schedulingBlocks
//	            	}
//            	}
//           	}
            for(dependency : schedulingBlock.dependencies.filter(typeof(DataDependency))) {
                if (dependency.concurrent && !dependency.confluent) {
                    val sb = schedulingBlockCache.get(dependency.eContainer as Node)
                    preceedingSchizo.put(sb, true)
                    preceedingSchedulingBlocks += sb
                }
            }

            
            System.out.print(debugIn + "" + schedulingBlock.guard.valuedObject.name + " needs: ")
            for(sb : preceedingSchedulingBlocks) {
                System.out.print(sb.guard.valuedObject.name + " ")
            }
            System.out.println("")
            
            if (schedulingBlock.guard.valuedObject.name == 'g11') {
                System.out.println("HERE!")
            }
                       	
            for (sBlock : preceedingSchedulingBlocks) {
	            if (!topologicalSortVisited.contains(sBlock)) {
			        var isSchizophrenic = false
			        if (!schizophrenic) {
			            
			            if (depthJoin || 
			                (preceedingSchizo.containsKey(sBlock) && preceedingSchizo.get(sBlock) == true)
			                ) {
		                    if (sBlock.isOnCriticalPath(pilData)) {
		                        isSchizophrenic = true
	                        }
		                }
			            
	        	        sBlock.topologicalPlacement(schedulingBlocks, schedule, constraints, scg, pilData, isSchizophrenic, debugIn + "  ")
				    } else {
					    if (sBlock.isOnCriticalPath(pilData)) {
						   	isSchizophrenic = true
						}
						if (!schizophrenicEntry.contains(sBlock)) {
							sBlock.topologicalPlacement(schedulingBlocks, schedule, constraints, scg, pilData, isSchizophrenic, debugIn + "  ")
						}
					}
                }
            }
            
            if (schedulingBlock.isPlaceable(schedulingBlocks, schedule, scg, pilData, schizophrenic, depthJoin)) {
//            	val scheduledBlock = ScgFactory.eINSTANCE.createScheduledBlock => [
//            		it.schedulingBlock = schedulingBlock
//            		it.schizophrenic = schizophrenic
//            	]
//                schedule.add(scheduledBlock)
                if (!schizophrenic) {
//                	placedBlocks.add(schedulingBlock)
                	System.out.println(debugIn + "-> Scheduled non schizophrenic scheduling block " + schedulingBlock.guard.valuedObject.name)
              	} else {
              	    schizophrenicBlocks += schedulingBlock
                    System.out.println(debugIn + "-> Scheduled schizophrenic scheduling block " + schedulingBlock.guard.valuedObject.name)
              	}
            } else {
                System.out.println(debugIn + schedulingBlock.guard.valuedObject.name + " UNPLACEABLE!")
            }
        } else {
            System.out.println(" already placed.")
        }
    }    
    
//    override def boolean createSchedule(SCGraph scg, List<ScheduledBlock> schedule, SchedulingConstraints constraints, 
//    	KielerCompilerContext context) {
//
//        val schedulingBlocks = new ArrayList<SchedulingBlock>(schedulingBlockCount)
//        schedulingBlocks.addAll(constraints.schedulingBlocks)
//        
//        for(sBlock:schedulingBlocks) {
//            System.out.println(sBlock.guard.valuedObject.name)
//        }
//        
//        topologicalSortVisited.clear
////        placedBlocks.clear
//        predecessorExcludeSet.clear
//        schizophrenicBlocks.clear
//        schizophrenicEntry.clear
//        
//        val pilData = context.compilationResult.ancillaryData.filter(typeof(PotentialInstantaneousLoopResult)).head.criticalNodes.toSet
//
//		for(schedulingBlock : schedulingBlocks.filter[ basicBlock.synchronizerBlock ]) {        
//            val join = schedulingBlock.basicBlock.schedulingBlocks.head.nodes.head as Join
//            if (!join.hasAnnotation(SynchronizerSelector::ANNOTATION_SELECTEDSYNCHRONIZER)) {
//                val synchronizer = join.chooseSynchronizer
//                System.out.println("Using synchronizer " + synchronizer.getId + " for " + join.toString);
//                synchronizer.annotate(join)
//                if (synchronizer.id == DepthJoinSynchronizer::SYNCHRONIZER_ID) {
//                    join.fork.allNext.map[ target ].forEach[ schizophrenicEntry += schedulingBlockCache.get(it) ]
//                }
//            
////                predecessorExcludeSet += synchronizer.getExcludedPredecessors(join, schedulingBlockCache, context.compilationResult.ancillaryData)
////                val predecessorIncludeSet = synchronizer.getAdditionalPredecessors(join, schedulingBlockCache, context.compilationResult.ancillaryData)
////                predecessorIncludeSets.put(schedulingBlock.basicBlock, predecessorIncludeSet)
//            }
//        }        
//        
//        for (sBlock : schedulingBlocks) {
//        	if (!topologicalSortVisited.contains(sBlock)) {
//                sBlock.topologicalPlacement(schedulingBlocks, schedule, constraints, scg, pilData, false, "")
//            }
//        }
//        
////        if (schedule.size >= schedulingBlocks.size) {
//            System.out.println("  ")
//            System.out.println("  SCHEDULE  ")
//            System.out.println("  --------")
//            System.out.println("  ")
//            
//            for(sBlock : schedule) {
//                System.out.print("  " + sBlock.schedulingBlock.guard.valuedObject.name)
//                if (sBlock.schizophrenic) {
//                    System.out.println("  schizophrenic")
//                } else {
//                    System.out.println("  ")
//                }                
//            }
////        }
//        
//        schedule.filter[ !schizophrenic ].size == schedulingBlocks.size
//    }

	protected def boolean isOnCriticalPath(SchedulingBlock schedulingBlock, Set<Node> pilData) {
	    for(node:schedulingBlock.nodes) {
	    	if (pilData.contains(node)) return true
	   	}
	   	false
	}
	
}