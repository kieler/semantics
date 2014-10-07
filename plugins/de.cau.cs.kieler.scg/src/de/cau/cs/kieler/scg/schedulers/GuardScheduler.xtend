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

import com.google.inject.Inject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.KielerCompilerException
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.extensions.SCGCacheExtensions
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.analyzer.PotentialInstantaneousLoopAnalyzer
import com.google.inject.Guice
import de.cau.cs.kieler.scg.ScheduledBlock
import de.cau.cs.kieler.scg.analyzer.PotentialInstantaneousLoopResult
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import java.util.Set
import de.cau.cs.kieler.scg.Dependency

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
class GuardScheduler extends AbstractScheduler {
    
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
     
    @Inject
    extension SCGCoreExtensions    

    @Inject
    extension SCGCacheExtensions    
    
    
    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
   
    protected val topologicalSortVisited = <Guard> newHashSet 
    protected val schedulingBlockCache = new HashMap<Node, SchedulingBlock>
    protected var int schedulingBlockCount
    
    protected val placedVOs = <ValuedObject> newHashSet
    protected val guardCache = <ValuedObject, Guard> newHashMap  

    
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
    
    protected override SchedulingConstraints orderSchedulingBlocks(SCGraph scg) {
        val schedulingBlocks = <SchedulingBlock> newLinkedList
        scg.basicBlocks.forEach[ schedulingBlocks.addAll(it.schedulingBlocks) ]
        
        val guardList = <Guard> newArrayList => [ addAll(scg.guards) ]
        
        new SchedulingConstraints => [
        	it.schedulingBlocks = schedulingBlocks
        	it.guards = guardList
        ]    
    }
        
    protected def void topologicalPlacement(Guard guard, 
        List<Guard> guards, List<Guard> schedule, 
        SchedulingConstraints constraints, SCGraph scg, String indent
    ) {
        if (!topologicalSortVisited.contains(guard)) {
        	
        	topologicalSortVisited.add(guard)
        	
			val VOR = <ValuedObject> newArrayList
			
			if (guard.expression instanceof ValuedObjectReference) {
				VOR += (guard.expression as ValuedObjectReference).valuedObject	
			} else {
				if (guard.expression instanceof OperatorExpression && (guard.expression as OperatorExpression).operator != OperatorType::PRE) {
					guard.expression.eAllContents.filter(typeof(ValuedObjectReference)).map[ valuedObject ].forEach[ VOR += it ]
				}
			}   
			
			if (guard.schedulingBlockLink != null) {
			    val dependencies = guard.schedulingBlockLink.getAllDependencies
			    if (!dependencies.empty) {
			        System.out.print(indent + "Guard " + guard.valuedObject.name + " has dependencies: ")
			        for(dependency : dependencies) {
			            if (dependency.concurrent && !dependency.confluent) {
			                val sb = schedulingBlockCache.get(dependency.eContainer)
			                System.out.print(sb.guard.valuedObject.name + " ")
			                
			                // TODO: VERIFY!
//			                if (guard.schizophrenic) {
			                    val schizoGuard = scg.guards.filter[ it.schedulingBlockLink == sb && it.schizophrenic].toList
			                    if (!schizoGuard.empty) {
			                        VOR += schizoGuard.head.valuedObject
                                    System.out.print(" using " + schizoGuard.head.valuedObject.name)			                        
//			                    }
			                } else {
    			                VOR += sb.guard.valuedObject
  			                }
    	                }
			        }
                    System.out.println("")
			    }
			}
			
			System.out.print(indent + "Placing guard " + guard.valuedObject.name + ": ")
			for(ref : VOR) {
				System.out.print(ref.name + " ")
			}
			System.out.println("")
			for(ref : VOR) {
				if (!placedVOs.contains(ref)) {
					val tpGuard = guardCache.get(ref)
					tpGuard.topologicalPlacement(guards, schedule, constraints, scg, indent + "  ")
				} 
			}

			var placeable = true			
			for(ref : VOR) {
				if (!placedVOs.contains(ref)) {
                    System.out.println(indent + ref.name + " not placed!")
					placeable = false
				}
			}			
			
			if (placeable) {
                System.out.println(indent + "  " + guard.valuedObject.name + " placed.")
				schedule += guard
				placedVOs += guard.valuedObject
				guards -= guard
			}
			   	
        }

    }
    
    
    protected def boolean createSchedule(SCGraph scg, List<Guard> schedule, SchedulingConstraints constraints,
    	KielerCompilerContext context) {

        val guards = new ArrayList<Guard>
        guards += constraints.guards
        val guardLoop = new ArrayList<Guard>
        guardLoop += guards
        
        topologicalSortVisited.clear
        
        for (guard : guardLoop) {
        	if (!topologicalSortVisited.contains(guard)) {
                guard.topologicalPlacement(guards, schedule, constraints, scg, "")
            }
        }
        
        System.out.print("Scheduled guards: ")
        for (g : schedule) { System.out.print(g.valuedObject.name + " ") }
        System.out.println("")
        
        guards.size == 0
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
    override public SCGraph schedule(SCGraph scg, KielerCompilerContext context) {

    	// Create a new schedule using the scgsched factory.
        val schedule = ScgFactory::eINSTANCE.createSchedule
        
        schedulingBlockCache.clear
        scg.createSchedulingBlockCache(schedulingBlockCache)

        // Create and fill a list for all scheduling blocks.
        val schedulingConstraints = scg.orderSchedulingBlocks
        
        placedVOs.clear
        scg.declarations.forEach[ decl |
        	placedVOs += decl.valuedObjects
        ]
        
        guardCache.clear
        scg.guards.forEach[ g |
        	guardCache.put(g.valuedObject, g)
        ]
        
        val guardList = <Guard> newLinkedList
        var schedulable = scg.createSchedule(guardList, schedulingConstraints, context)
		schedule.guards += guardList
        
        // Print out results on the console
        // and add the scheduling information to the graph.
        if (!schedulable) {
            if (context != null) {
                context.getCompilationResult().addPostponedWarning(new KielerCompilerException(getId(), "The SCG is NOT ASC-schedulable!"));
            }
            System::out.println("The SCG is NOT ASC-schedulable!")
            scg.schedules.add(schedule)
        } else {
            System::out.println("The SCG is ASC-schedulable.")
            scg.schedules.add(schedule)
        }
        
        scg
    }
    
    
    private def Set<Dependency> getAllDependencies(SchedulingBlock schedulingBlock) {
    	val returnSet = <Dependency> newHashSet;
    	
    	(schedulingBlock.eContainer as BasicBlock).schedulingBlocks.forEach[ returnSet += it.dependencies ]
    	
    	returnSet
    }

}