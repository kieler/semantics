/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.transformations.schedulers

import com.google.inject.Inject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.ControlDependency
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.ExpressionDependency
import de.cau.cs.kieler.scg.GuardDependency
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.transformations.SCGTransformations
import java.util.LinkedHashSet
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
 * @kieler.design 2016-02-24 proposed 
 * @kieler.rating 2016-02-24 proposed yellow
 */
class SimpleGuardScheduler extends AbstractProductionTransformation implements Traceable {
        
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    
    override getId() {
        return SCGTransformations::SCHEDULING_ID
    }

    override getName() {
        return SCGTransformations::SCHEDULING_NAME
    }

    override getProducedFeatureId() {
        return SCGFeatures::SCHEDULING_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::GUARDS_ID)
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    
    @Inject
    extension SCGDependencyExtensions

    // -------------------------------------------------------------------------
    // -- Scheduler 
    // -------------------------------------------------------------------------

	/**
	 * {@inherited}
	 */
    public def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
    	/** 
    	 * The {@code nodesToSchedule} {@link Set} contains the nodes that are still
    	 * not scheduled. The topological sort should remove nodes after they have been placed.
    	 */
    	val nodesToSchedule = scg.nodes.filter[ incoming.filter(GuardDependency).empty ].toSet
    	val estimatedScheduleSize = nodesToSchedule.size 	
    	
    	/**
    	 * {@code Schedule} contains the schedule determined by the topological sort. 
    	 * It is also used for cointainment testing and hence a {@link LinkedHashSet} is used. 
    	 */
    	val schedule = new LinkedHashSet<Node>
    	
    	// As long as there are nodes to schedule, call the topological sort method.
    	while(!nodesToSchedule.empty) {
	    	topologicalScheduling(nodesToSchedule.head, nodesToSchedule, schedule)
    	}
    	
    	// Create schedule dependencies for the generated schedule
    	for(var i = 0; i < schedule.size-1; i++) {
    		schedule.get(i).createScheduleDependency(schedule.get(i+1))
    	}
    	
    	// ASC schedulability output
    	if (schedule.size < estimatedScheduleSize) {
    		System.err.println("The SCG is NOT asc-schedulable!")
    	} else {
    		System.out.println("The SCG is asc-schedulable.")
    		for(s : schedule) {
    			System.out.print((s as Assignment).valuedObject.name + " ")
    		}
    		System.out.println
    	}
    	
    	scg
    }
    
	/**
	 * {@code topologicalScheduling} generates a scheduling by applying a topological sort to the nodes 
	 * schedule. 
	 * 
	 * @param node
	 * 			the actual node
	 * @param nodesToSchedule
	 * 			the remaining nodes, this set also indicates whether or not a node has already been visited.
	 * @param schedule
	 * 			the generated schedule, this set indicates whether or not a node has already been scheduled.
	 * @return Returns nothing.
	 */
	protected def void topologicalScheduling(Node node, Set<Node> nodesToSchedule, LinkedHashSet<Node> schedule) {
		// Remove this node from the set since and hence mark it as visited.
		nodesToSchedule -= node
		val dependencies = node.getSchedulingDependencies.toList
		
		// For all relevant dependencies, perform a topological sort if the nodes has not been visited.
		for(dependency : dependencies) {
			if (nodesToSchedule.contains(dependency.eContainer as Node)) {
				topologicalScheduling(dependency.eContainer as Node, nodesToSchedule, schedule)
			}			
		}
		
		// Check if all required dependent nodes were scheduled. If not, abort.
		for(dependency : dependencies) {
			if (!schedule.contains(dependency.eContainer as Node)) {
				return
			}
		}
		
		// Add this node to the schedule.
		schedule += node
	}
	
	/**
	 * {@code getSchedulingDependencies} retrieves the dependencies that are relevant for the scheduling. 
	 * Derived classes may override this method to add or remove dependencies.
	 * 
	 * @param node
	 * 			the actual node
	 * @return Returns an {@link Iterable} that contains the relevant dependencies.
	 */	
	protected def Iterable<Dependency> getSchedulingDependencies(Node node) {
		node.incoming.filter(Dependency).filter[ d |
			d instanceof ExpressionDependency ||
			d instanceof ControlDependency
		]
	}

}
