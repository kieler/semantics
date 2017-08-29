/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.processors.transformators

import com.google.inject.Inject
import de.cau.cs.kieler.scg.ControlDependency
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.ExpressionDependency
import de.cau.cs.kieler.scg.GuardDependency
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import java.util.LinkedHashSet
import java.util.Set
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import java.util.List

/** 
 * @author ssm
 * @kieler.design 2017-08-07 proposed 
 * @kieler.rating 2017-08-07 proposed yellow
 */
class SimpleGuardScheduler extends Processor<SCGraphs, SCGraphs> {
        
    @Inject extension SCGDependencyExtensions
    @Inject extension SCGCoreExtensions
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.transformators.scheduler"
    }
    
    override getName() {
        "Scheduler V2"
    }
    
    override getType() {
        ProcessorType.TRANSFORMATOR
    }
    
    override process() {
        val model = getModel
        
        for(scg : model.scgs) {
            scg.schedule
        }
    }    

	/**
	 * {@inherited}
	 */
    public def void schedule(SCGraph scg) {
    	/** 
    	 * The {@code nodesToSchedule} {@link Set} contains the nodes that are still
    	 * not scheduled. The topological sort should remove nodes after they have been placed.
    	 */
    	val nodesToSchedule = scg.nodes.filter[ incoming.filter(GuardDependency).empty].toSet
    	val estimatedScheduleSize = nodesToSchedule.size 	
    	
    	/**
    	 * {@code Schedule} contains the schedule determined by the topological sort. 
    	 * It is also used for cointainment testing and hence a {@link LinkedHashSet} is used. 
    	 */
    	val schedule = new LinkedHashSet<Node>
    	val unschedulableNodes = new LinkedHashSet<Node>
    	
    	// As long as there are nodes to schedule, call the topological sort method.
    	while(!nodesToSchedule.empty) {
	    	topologicalScheduling(nodesToSchedule.head, nodesToSchedule, schedule, unschedulableNodes)
    	}
    	
    	// Create schedule dependencies for the generated schedule
    	val scheduleList = schedule.toList
    	for(var i = 0; i < scheduleList.size-1; i++) {
    		scheduleList.get(i).createScheduleDependency(scheduleList.get(i+1))
    	}
    	
    	// ASC schedulability output
    	if (schedule.size < estimatedScheduleSize) {
    	    environment.errors.add("The SCG is NOT asc-schedulable!")
    		System.out.println("The SCG is NOT asc-schedulable!")
    		if (unschedulableNodes.size > 0) {
    		    createAnnotatedUnschedulableNodesModel(unschedulableNodes)
    		}
    	} else {
    		System.out.println("The SCG is asc-schedulable.")
    	}
    }
    
	/**
	 * {@code topologicalScheduling} generates a scheduling by applying a topological sort to the nodes. 
	 * 
	 * @param node
	 * 			the actual node
	 * @param nodesToSchedule
	 * 			the remaining nodes, this set also indicates whether or not a node has already been visited.
	 * @param schedule
	 * 			the generated schedule, this set indicates whether or not a node has already been scheduled.
	 * @return Returns nothing.
	 */
	protected def void topologicalScheduling(Node node, Set<Node> nodesToSchedule, Set<Node> schedule, Set<Node> unscheduableNodes) {
		// Remove this node from the set and hence mark it as visited.
		nodesToSchedule -= node
		val dependencies = node.getSchedulingDependencies.toList
		
		// For all relevant dependencies, perform a topological sort if the nodes have not been visited.
		for(dependency : dependencies) {
			if (nodesToSchedule.contains(dependency.eContainer as Node)) {
				topologicalScheduling(dependency.eContainer as Node, nodesToSchedule, schedule, unscheduableNodes)
			}			
		}
		
		// Check if all required nodes were scheduled. If not, abort.
		for(dependency : dependencies) {
			if (!schedule.contains(dependency.eContainer as Node)) {
				environment.errors.add("Can't schedule from " + dependency.eContainer.asNode.asAssignment.valuedObject.name + 
					" to " + dependency.target.asAssignment.valuedObject.name, dependency.eContainer, true)
			    unscheduableNodes += dependency.eContainer as Node
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
			d instanceof ControlDependency ||
			(d instanceof DataDependency && ((d as DataDependency).concurrent && !(d as DataDependency).confluent))
		]
	}
	
	@Inject extension SCChartsScopeExtensions
	
	protected def void createAnnotatedUnschedulableNodesModel(Set<Node> unschedulableNodes) {
	    val originalModel = environment.getProperty(Environment.ORIGINAL_MODEL)
	    if (originalModel instanceof SCCharts) {
    	    val guardedNodes = unschedulableNodes.map[ dependencies ].flatten.filter(GuardDependency).map[ target ].filter(Assignment).toList
    	    
    	    val states = originalModel.rootStates.head.getAllContainedStates.toIterable.filter[ !actions.empty || !outgoingTransitions.empty ].toList
    	    for (state : states) {
    	        val actions = state.actions + state.outgoingTransitions
    	        for (assignment : actions.map[ effects ].flatten.filter(Assignment)) {
    	            if (assignment.heuristicallyTheSameTo(guardedNodes)) {
    	                environment.errors.add(originalModel, 
    	                   "Causal loop!", 
    	                   assignment.eContainer, assignment.valuedObject.name)
    	            }
    	        }
    	    } 
	    }
	}
    
    def boolean heuristicallyTheSameTo(Assignment assignment, List<Assignment> assignments) {
        for (compAss : assignments) {
            if (assignment.valuedObject.name == compAss.valuedObject.name) {
                // TODO: This is a PROTOTYPE. Use compare extension to get a better match.
                return true
            }
        }
        return false
    }
	
}
