/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.codegen.dependencies.xtend

import de.cau.cs.kieler.synccharts.*
import de.cau.cs.kieler.synccharts.codegen.dependencies.*
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.*
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyFactory
import de.cau.cs.kieler.core.kexpressions.*
import java.util.*
import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
//import org.eclipse.xtend.util.stdlib.TraceComponent
import org.eclipse.xtend.util.stdlib.*
import org.eclipse.emf.common.util.BasicEList
import java.lang.System
import de.cau.cs.kieler.synccharts.Transition
import com.google.common.collect.Lists

class Synccharts2Dependenies {
	 
	// ======================================================================================================
	// ==                                 T R A V E R S E    S Y N C C H A R T                             ==
	// ======================================================================================================
	
	def create dependencies : DependencyFactory::eINSTANCE.createDependencies() transform (Region root) {
		dependencies.transform(root);
	}		
	
	def Dependencies transform( Dependencies dependencies, Region root) {
		var rootState = root.states.head();
		//System::out.println("Hierarchical8 "+ state.id + ", ");

		// create nodes for all states 
		for (state : root.getAllStates(dependencies)) {
			if (state.outgoingTransitions.size == 0) {
				dependencies.createSimpleOrStrongAndWeakNoedes(state, null);
			}
			for (transition : state.outgoingTransitions) {
				dependencies.createSimpleOrStrongAndWeakNoedes(state, transition);
			}
		}


		// create dependencies between nodes
		for (state : root.getAllStates(dependencies)) {
			dependencies.handleTransitionDependency(state);
			
			for (transition : state.outgoingTransitions) {
				var firstNode  = dependencies.getNode(transition.sourceState, transition, DependencyType::STRONG);
				
				if (transition.targetState.outgoingTransitions.size == 0) {
					dependencies.handleControlFlowDependency(firstNode, state, transition, null);
				}
				for (targetTransition: transition.targetState.outgoingTransitions) {
					dependencies.handleControlFlowDependency(firstNode, state, transition, targetTransition);
				}
				
				dependencies.handleSignalDependency(transition, rootState);
			}
		}
		
		// topological sort
		dependencies.topologicalSort();

		return dependencies;
	}
	
	// -----------------------------------------------------------------------------------------------------

	def List<State> getAllStates(Region region, Dependencies dependencies) {
		var List<State> stateList = new ArrayList()
		for (state : region.states) {
			stateList.add(state)
			for (regionsOfState : state.regions) {
				var childStates = regionsOfState.getAllStates(dependencies);
				for (childState : childStates) {
					dependencies.handleHierarchyDependency(childState, state);
				}
				stateList.addAll(childStates)
			}  
		}
		stateList
	}

	def List<State> getAllStatesOfRegion (Region region) {
		region.states
	}

	def List<Region> getAllRegionsOfState (State state) {
		state.regions
	}
	
	
	// ======================================================================================================
	// ==                                 H A N D L E    D E P E N D E N C Y                               ==
	// ======================================================================================================

	def handleHierarchyDependencyHelper(Dependencies dependencies, State childState, Node PW, Node PS, Transition childStateTransition) {
			val CS = dependencies.getNode(childState, childStateTransition, DependencyType::STRONG);
			dependencies.getHierarchyDependency(PW, CS);
			dependencies.getHierarchyDependency(CS, PS);
			if (childState.hierarchical) {
				val CW = dependencies.getNode(childState, childStateTransition, DependencyType::WEAK);
				dependencies.getHierarchyDependency(PW, CW);
				dependencies.getHierarchyDependency(CW, PS);
			}
	}
	
	def handleHierarchyDependencyHelper(Dependencies dependencies, State childState, State state, Transition stateTransition) {
		val PS = dependencies.getNode(state, stateTransition, DependencyType::STRONG);
		var PW = PS;
		if (state.hierarchical) {
			PW = dependencies.getNode(state, stateTransition, DependencyType::WEAK);
		}
		else {
			PW = null;
		}
		// if state has no outgoing transitions, do with dummy self-transition
		val childStateTransitions = childState.outgoingTransitions.toList(); 
		if (childStateTransitions.empty) { 
			dependencies.handleHierarchyDependencyHelper(childState, PW, PS, null);
		}
		else {
			for (childStateTransition : childStateTransitions) {
				 dependencies.handleHierarchyDependencyHelper(childState, PW, PS, childStateTransition);
			}
		}
	}
	
	
	// Weak dependencies from parentWeak to (childWeak and childStrong)
	// Strong dependencies from (childWeak and childStrong) to parentStrong
	def handleHierarchyDependency(Dependencies dependencies, State childState, State state) {
		var stateTransitions = state.outgoingTransitions.toList();
		if (stateTransitions.empty) {
			// if state has no outgoing transitions, do with dummy self-transition
			dependencies.handleHierarchyDependencyHelper(childState, state, null);
		}
		else {
			for (stateTransition : stateTransitions) {
				dependencies.handleHierarchyDependencyHelper(childState, state, stateTransition);
			}
		}
		
	}
	
	def handleTransitionDependency(Dependencies dependencies, State state) {
		var orderedTransitions = state.outgoingTransitions.filter(e|true).sort(e1, e2 | if (e1.priority < e2.priority) {-1} else {1});
		var i = 1;
		for (transition : orderedTransitions) {
 			if (i < orderedTransitions.size) {
				var nextTransition = orderedTransitions.get(i);
				if (nextTransition != null) {
					var sourceNode = dependencies.getNode(state, transition, DependencyType::STRONG);
					var targetNode = dependencies.getNode(state, nextTransition, DependencyType::STRONG);
					dependencies.getTransitionDependency(sourceNode, targetNode);
					if (state.hierarchical) {
						var sourceNodeW = dependencies.getNode(state, transition, DependencyType::WEAK);
						var targetNodeW = dependencies.getNode(state, nextTransition, DependencyType::WEAK);
						dependencies.getTransitionDependency(sourceNodeW, targetNodeW);
						//dependencies.getTransitionDependency(sourceNodeW, targetNode)  //TODO: necessary or correct???
						//dependencies.getTransitionDependency(sourceNode, targetNodeW)  //TODO: necessary or correct???
					}
				}
				i=i+1;
			}
		}
	}
	
	def handleControlFlowDependency(Dependencies dependencies, Node firstNode, State state, Transition transition, Transition targetTransition) {
			var secondNode = dependencies.getNode(transition.targetState, targetTransition, DependencyType::STRONG);
			if (firstNode != secondNode) {
				 	if (transition.isImmediate) {
						dependencies.getControlFlowDependency(firstNode, secondNode, transition.isImmediate)
				 	}
				
					if (transition.sourceState.hierarchical) {
						var firstNodeW  = dependencies.getNode(transition.sourceState, transition, DependencyType::WEAK);
						if (transition.isImmediate) {
							dependencies.getControlFlowDependency(firstNodeW, secondNode, transition.isImmediate)  //TODO: necessary or correct???

							if (transition.targetState.hierarchical) {
								var secondNodeW = dependencies.getNode(transition.targetState, targetTransition, DependencyType::WEAK);
								dependencies.getControlFlowDependency(firstNodeW, secondNodeW, transition.isImmediate)
								dependencies.getControlFlowDependency(firstNode, secondNodeW, transition.isImmediate)  //TODO: necessary or correct???
							}
						}
						
					}
			}
	}
	
	def handleSignalDependency(Dependencies dependencies, Transition transition, State rootState) {
				for (effect : transition.eAllContents().toIterable().filter(typeof(Emission))) {
					
					// get other states that test for this signal in out going transition triggers
					// (the scope of the signal should be respected because we a
					// not searching for the NAME but for the object to appear in transition
					// triggers
					//
					// (effect as Emission).signal; == emitted signal
					//
					var allTransitions = rootState.eAllContents().toIterable().filter(typeof(Transition)).toList;
					var triggeredTransitions =  allTransitions.filter (e |
						 	e.trigger != null &&
						    e.trigger.triggerContainingSignal((effect as Emission).signal)); 
						
					for (triggeredTransition : triggeredTransitions) {
						var emitterState = transition.sourceState;
						var triggerState = (triggeredTransition as Transition).sourceState;
						
						var emitterNode = dependencies.getNode(emitterState, transition, DependencyType::STRONG);
						var triggerNode = dependencies.getNode(triggerState, triggeredTransition, DependencyType::STRONG);
						dependencies.getSignalDependency(emitterNode, triggerNode);
						//TODO: all the following necessary/correct???
						if (emitterState.hierarchical) {
							var emitterNodeW = dependencies.getNode(emitterState, transition, DependencyType::WEAK);
							dependencies.getSignalDependency(emitterNodeW, triggerNode);
						}
						if (triggerState.hierarchical) {
							var triggerNodeW = dependencies.getNode(triggerState, triggeredTransition, DependencyType::WEAK);
							dependencies.getSignalDependency(emitterNode, triggerNodeW);
						}
						if (emitterState.hierarchical && triggerState.hierarchical) {
							var emitterNodeW = dependencies.getNode(emitterState, transition, DependencyType::WEAK);
							var triggerNodeW = dependencies.getNode(triggerState, triggeredTransition, DependencyType::WEAK);
							dependencies.getSignalDependency(emitterNodeW, triggerNodeW);
						}
					}										
				}
	}


	// ======================================================================================================
	// ==                      R E T R I E V E    C R E A T E D    D E P E N D E N C Y                     ==
	// ======================================================================================================

	def Dependency getSignalDependency(Dependencies dependencies, Node emitterNode, Node triggerNode) {
		var newDependency = DependencyFactory::eINSTANCE.createSignalDependency();
		dependencies.getDependency(triggerNode, emitterNode, newDependency);
	}

	def Dependency getControlFlowDependency(Dependencies dependencies, Node firstNode, Node secondNode, boolean isImmediate) {
		var newDependency = DependencyFactory::eINSTANCE.createControlflowDependency();
		newDependency.setImmediate(isImmediate);
		dependencies.getDependency(secondNode, firstNode, newDependency);
	}

	def Dependency getHierarchyDependency(Dependencies dependencies, Node sourceNode, Node targetNode) {
		var newDependency = DependencyFactory::eINSTANCE.createHierarchyDependency();
		dependencies.getDependency(sourceNode, targetNode, newDependency);
	}

	def Dependency getTransitionDependency(Dependencies dependencies, Node sourceNode, Node targetNode) {
		var newDependency = DependencyFactory::eINSTANCE.createTransitionDependency();
		dependencies.getDependency(targetNode, sourceNode, newDependency);
	}
	
	
	// ======================================================================================================
	// ==                                         C R E A T I O N                                          ==
	// ======================================================================================================

	def Dependency getDependency(Dependencies dependencies, Node sourceNode, Node targetNode, Dependency newDependency) {
		var dependency = dependencies.dependencies.filter(e|
			   e.eClass.toString.equalsIgnoreCase(newDependency.eClass.toString())
			&& e.sourceNode == sourceNode
			&& e.targetNode == targetNode);
		
		if (dependency.size > 0) {
			return dependency.head;
		}
		// not yet found newDependency => add it
		newDependency.setSourceNode(sourceNode);
		newDependency.setTargetNode(targetNode);
		dependencies.dependencies.add(newDependency);
		return newDependency;
	}
	
	def void createSimpleOrStrongAndWeakNoedes(Dependencies dependencies, State state, Transition transition) {
		if (state.hierarchical) {
				dependencies.getNode(state, transition, DependencyType::STRONG);
				dependencies.getNode(state, transition, DependencyType::WEAK);
		}
		else {
				dependencies.getNode(state, transition, DependencyType::STRONG);
		}
	}

	def Node getNode(Dependencies dependencies, State state, Transition transition, DependencyType type) {
		var node = dependencies.nodes.filter(e|(e.type == type) && (e.state == state) && (e.transition == transition));
		if (node.size > 0) {
			return node.head;
		}
		// not yet found newNode => add it
		var newNode = DependencyFactory::eINSTANCE.createNode();
		newNode.setState(state);
		var stateId = state.id;
		if (transition != null) {
			stateId = stateId + transition.priority;
		}
		if (type == DependencyType::WEAK) {
			newNode.setId(stateId + "_W");
		}
		else {
			newNode.setId(stateId + "_S");
		} 
		newNode.setTransition(transition);
		newNode.setType(type);
		dependencies.nodes.add(newNode);
		return newNode;
	}


	// ======================================================================================================
	// ==                                          H E L P E R                                             ==
	// ======================================================================================================
	
	def boolean isHierarchical(State state) {
		state.regions.size > 0;
	}

	def dispatch Boolean triggerContainingSignal(Expression trigger, Signal signal) {
		return false;
	}
	def dispatch Boolean triggerContainingSignal(ComplexExpression trigger, Signal signal) {
		var returnValue = false;
		for (expression : trigger.subExpressions) {
			returnValue = returnValue || expression.triggerContainingSignal(signal);
		}
		return returnValue;
	}
	def dispatch Boolean triggerContainingSignal(ValuedObjectReference trigger, Signal signal) {
		var returnValue = trigger.valuedObject == signal;
		for (expression : trigger.subExpressions) {
			returnValue = returnValue || expression.triggerContainingSignal(signal);
		}
		return returnValue;
	}
	
	// ======================================================================================================
	// ==                                   T O P O L O G I C A L    S O R T                               ==
	// ======================================================================================================
	
	//	L <- Empty list that will contain the sorted nodes
	//	S <- Set of all nodes with no outgoing edges
	//	for each node n in S do
	//  	  visit(n) 
	//	function visit(node n)
	// 	   if n has not been visited yet then
	// 	       mark n as visited
	// 	       for each node m with an edge from m to n do
	// 	           visit(m)
	// 	       add n to L	
	
	def topologicalSort(Dependencies dependencies) {
		// reset dependencies
		for (node : dependencies.nodes) {
			node.setPriority(-1);
		}
		
		var nodesWithoutOutgoingEdges = dependencies.nodes.filter(e | e.outgoingDependencies == null || e.outgoingDependencies.size == 0);
		var tmpPrio = 0;
		for (node : nodesWithoutOutgoingEdges) {
			tmpPrio = node.visit(tmpPrio);
		}
	}
	
	
	def int visit(Node node, int priority) {
		if (node.priority == -1) {
			node.setPriority(-2);
			var tmpPrio = priority;
			for (incomingDependency : node.incomingDependencies) {
				val nextNode = incomingDependency.sourceNode;
				if (nextNode != node) {
//					System::out.println("At "+ node.id + " visit next " + nextNode.id);
					tmpPrio = nextNode.visit(tmpPrio);
				}
			}
//			node.setPriority(1 + (node.eContainer as Dependencies).nodes.size - (tmpPrio + 1));
			node.setPriority((tmpPrio + 1));
			return tmpPrio + 1;
		}
		else {
			return priority;
		}
	}
	
}













