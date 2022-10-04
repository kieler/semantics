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
package de.cau.cs.kieler.scg.processors

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.ExpressionDependency
import de.cau.cs.kieler.scg.GuardDependency
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import java.util.LinkedHashSet
import java.util.Set
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.kexpressions.keffects.Dependency
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.kexpressions.keffects.ControlDependency
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions

/** 
 * @author ssm
 * @kieler.design 2017-08-07 proposed 
 * @kieler.rating 2017-08-07 proposed yellow
 */
class SimpleGuardScheduler extends InplaceProcessor<SCGraphs> implements Traceable {
        
    @Inject extension KEffectsExtensions
    @Inject extension SCGDependencyExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension SCGMethodExtensions
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.scheduler"
    }
    
    override getName() {
        "Scheduler"
    }
    
    override process() {
        val model = getModel
        
        for(scg : model.scgs.ignoreMethods) {
            scg.schedule
        }
    }    
    
    

	/**
	 * {@inherited}
	 */
    def void schedule(SCGraph scg) {
    	/** 
    	 * The {@code nodesToSchedule} {@link Set} contains the nodes that are still
    	 * not scheduled. The topological sort should remove nodes after they have been placed.
    	 */
    	val nodesToSchedule = new LinkedHashSet<Node>
    	nodesToSchedule += scg.nodes.filter[ incomingLinks.filter(GuardDependency).empty ]
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
    		//System.out.println("The SCG is NOT asc-schedulable!")
    		if (unschedulableNodes.size > 0) {
    		    if (annotationModelCreatorDelegate !== null) {
    		      annotationModelCreatorDelegate.create(unschedulableNodes, environment)
    		    }
    		}
    	} else {
    		//System.out.println("The SCG is asc-schedulable.")
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
			    if (dependency.eContainer instanceof Assignment && dependency.targetNode instanceof Assignment) {
	   			    environment.errors.add("Can't schedule from " + dependency.eContainer.asNode.asAssignment.valuedObject.name + 
                        " to " + dependency.targetNode.asAssignment.valuedObject.name, dependency.eContainer, true)
    			} else {
                    environment.errors.add("Can't schedule from " + dependency.eContainer.asNode.class.simpleName + 
                        " to " + dependency.target.asNode.class.simpleName, dependency.eContainer, true)
    			}
			    unscheduableNodes += dependency.eContainer as Node
			    unscheduableNodes += node
				return
			}
		}
		
		// Add this node to the schedule.
		schedule += node
		
		// Immediately schedule conditional guards
		// This is important as only their SB guard assignment is associated with their dependencies
		for (dep : node.outgoingLinks.filter(ControlDependency)) {
		    val next = dep.targetNode
		    val nextDeps = next.getSchedulingDependencies.toList
		    if (nodesToSchedule.contains(next) && (nextDeps.size == 1 || nextDeps.forall[schedule.contains(it.eContainer.asNode)])) {
                topologicalScheduling(next, nodesToSchedule, schedule, unscheduableNodes)
            }
		}
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
		node.incomingLinks.filter(Dependency).filter[ d |
			d instanceof ExpressionDependency ||
			d instanceof ControlDependency ||
			(d instanceof DataDependency && ((d as DataDependency).concurrent && !(d as DataDependency).confluent))
		]
	}
	
	public static IAnnotationModelCreator annotationModelCreatorDelegate = null
}
