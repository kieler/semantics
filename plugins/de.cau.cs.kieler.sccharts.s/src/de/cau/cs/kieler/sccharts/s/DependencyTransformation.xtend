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
 package de.cau.cs.kieler.sccharts.s

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.Emission
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import java.util.ArrayList
import java.util.HashMap
import java.util.List

/** 
 * SCCharts DependencyTransformation Extension builds up a sorted list of dependencies between states
 * of an SCG normalized SCChart.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class DependencyTransformation { 

    @Inject
    extension SCChartsExtension
    
    // Create an empty dependency list
    HashMap<State, DependencyNode> states2DependencyNodes
    HashMap<State, DependencyNode> statesJoin2DependencyNodes
    
    //-------------------------------------------------------------------------
    //--      T R A N S F O R M      T O      D E P E N D E N C I E S        --
    //-------------------------------------------------------------------------
    
    // Calculate all dependencies and retrieve them as a list.
    def public DependencyGraph getDependencyGraph(Region rootRegion) {
        // Clear dependencies
        val dependencyGraph = new DependencyGraph() 
        val dependencies = dependencyGraph.dependencies
        val dependencyNodes = dependencyGraph.dependencyNodes
        states2DependencyNodes = new HashMap<State, DependencyNode>
        statesJoin2DependencyNodes = new HashMap<State, DependencyNode>
        
        // Go thru all states and create a dependency representation for it (DepenedencyState)
        for (state : rootRegion.allContainedStates) {
            if (state != rootRegion.rootState) {
                val dependencyNode = (new DependencyNode(state)).map(state, false)
                dependencyNodes.add(dependencyNode)
                if (state.hierarchical) {
                    // For hierarchical states additionally create a join-representation
                    val joinDependencyState = (new DependencyNode(state)).map(state, true)
                    joinDependencyState.setIsJoin(true)
                    dependencyNodes.add(joinDependencyState)
                }
            }
        }
        
        // Go thru all regions and states recursively and build up dependencies
        for (region : rootRegion.rootState.regions) {
           region.transformDependencies(dependencies)
        }

        // Topological Sort
        dependencyNodes.topologicalSort(dependencies)

        dependencyGraph
    }    

    // -------------------------------------------------------------------------   

    // For all valued object references within a transition's trigger, find and return all states that
    // emit or write to these valued objects.   
    def private List<State> statesToDependOn(Transition transition) {
       var stateList = new ArrayList<State>
       
       if (transition.trigger != null) {
           // All valuedObject references in the trigger of this transition
           var List<ValuedObjectReference> valuedObjectReferences
           if (transition.trigger instanceof ValuedObjectReference) {
               valuedObjectReferences = new ArrayList<ValuedObjectReference> 
               valuedObjectReferences.add(transition.trigger as ValuedObjectReference)
           } 
           else {
              valuedObjectReferences = transition.trigger.eAllContents.filter(typeof(ValuedObjectReference)).toList
           }
           
           for (valuedObjectReference : valuedObjectReferences) {
               // The valuedObject we search for
               val valuedObject = valuedObjectReference.valuedObject
               // Search ALL actions of the mode
               val allActions = transition.sourceState.rootState.eAllContents.filter(typeof(Action)).toList

               for (action : allActions) {
                   for (effect : action.effects) {
                       if (effect instanceof Emission && ((effect as Emission).valuedObject == valuedObject)) {
                           // We consider only SCG normalized SCCharts, hence only transitions
                           if (action instanceof Transition) {
                               val state = (action as Transition).sourceState
                               if (!stateList.contains(state)) {
                                   stateList.add(state)
                               }
                           }
                       }
                   }
               }
           }
       }
       stateList
    }

    // -------------------------------------------------------------------------   

    def private void transformDependencies(State state, List<Dependency> dependencies) {
        // Data dependencies
        for (transition : state.outgoingTransitions) {
            for (stateToDependOn : transition.statesToDependOn) {
               val newDataDependency = new DataDependency(state.dependencyNode, stateToDependOn.dependencyNode)
               dependencies.add(newDataDependency)
            } 
        }
        // Control Flow dependencies
        for (transition : state.incomingTransitions) {
            if (state.hierarchical) {
                for (region : state.regions) {
                    for (initialState : region.states.filter[isInitial]) {
                        val newControlFlowDependency = new ControlflowDependency(initialState.dependencyNode, state.dependencyNode)
                        dependencies.add(newControlFlowDependency)
                    }
                    for (finalState : region.states.filter[isFinal]) {
                        val newControlFlowDependency = new ControlflowDependency(state.joinDependencyState, finalState.dependencyNode)
                        dependencies.add(newControlFlowDependency)
                    }
                }
            }// else {
                if (transition.sourceState.hierarchical) {
                    val newControlFlowDependency = new ControlflowDependency(state.dependencyNode, transition.sourceState.joinDependencyState)
                    dependencies.add(newControlFlowDependency)
                } else {
                    if (transition.isImmediate) {
                        val newControlFlowDependency = new ControlflowDependency(state.dependencyNode, transition.sourceState.dependencyNode)
                        dependencies.add(newControlFlowDependency)
                    }
                }
            //}
        }
        // Go thru all regions and states recursively and build up dependencies
        for (region : state.regions) {
           region.transformDependencies(dependencies)
        }
    }

    // -------------------------------------------------------------------------   

    def private void transformDependencies(Region region, List<Dependency> dependencies) {
        // Go thru all states and states recursively and build up dependencies
        for (state : region.states) {
           state.transformDependencies(dependencies)
        }
    }

    
   //-------------------------------------------------------------------------
   //--                M A P P I N G    F U N C T I O N S                   --
   //-------------------------------------------------------------------------

    // Get a dependency representation for a state. For hierarchical states also a
    // join-representation can be retrieved.
    def private DependencyNode getDependencyNode(State state) {
       states2DependencyNodes.get(state)
    }

    // Get a  join dependency representation for a hierarchical state.
    def private DependencyNode getJoinDependencyState(State state) {
      statesJoin2DependencyNodes.get(state)
    }
    
    // Map a new dependency representation of a state to a state.
    def private DependencyNode map(DependencyNode dependencyNode, State state, boolean isJoin) {
        if (!isJoin) {
            states2DependencyNodes.put(state, dependencyNode)
        } else {
            statesJoin2DependencyNodes.put(state, dependencyNode)
        }
        dependencyNode
    }


   //-------------------------------------------------------------------------
   //--                  A C C E S S    F U N C T I O N S                   --
   //-------------------------------------------------------------------------
   
   // Get a list of states sorted by their priority with highest priority first.
   def public List<DependencyNode> getPioritySortedStates(List<DependencyNode> dependencyNodes) {
        dependencyNodes.sort(e1, e2 | comparePriorities(e1,e2));
   }
   
   def private int comparePriorities(DependencyNode e1, DependencyNode e2) {
        if (e1.getPriority > e2.getPriority) {-1} else {1}    
   }
   
   
   def private List<Dependency> outgoingDependencies(DependencyNode dependencyNode, List<Dependency> dependencies) {
       dependencies.filter[stateDepending == dependencyNode].toList 
   }

   def private List<Dependency> incomingDependencies(DependencyNode dependencyNode, List<Dependency> dependencies) {
       dependencies.filter[stateToDependOn == dependencyNode].toList 
   }


   //-------------------------------------------------------------------------
   //--                  T O P O L O G I C A L    S O R T                   --
   //-------------------------------------------------------------------------
   
   //    L <- Empty list that will contain the sorted nodes
   //    S <- Set of all nodes with no outgoing edges
   //    for each node n in S do
   //        visit(n) 
   //    function visit(node n)
   //        if n has not been visited yet then
   //            mark n as visited
   //            for each node m with an edge from m to n do
   //                visit(m)
   //            add n to L    
    
   // Starting the topological sort.
   def private List<DependencyNode> topologicalSort(List<DependencyNode> dependencyNodes, List<Dependency> dependencies) {
        val allDependencyStates = dependencyNodes
       
        // Reset dependencies and initialize with default priority -1
        for (dependencyNode : allDependencyStates) {
            dependencyNode.setPriority(-1)
        }
        
        val dependencyNodesWithNoEdges = allDependencyStates.filter(e | 
                                                e.outgoingDependencies(dependencies).nullOrEmpty 
                                             && e.incomingDependencies(dependencies).nullOrEmpty
        )

        // calculate priorities for all connected nodes (including the root)
        // now start with priority 0                                              
        var tmpPrio = 0;
        val dependencyNodesWithoutOutgoingEdges = allDependencyStates.filter(e | 
                                                    e.outgoingDependencies(dependencies).nullOrEmpty 
                                                && !e.incomingDependencies(dependencies).nullOrEmpty
        )
            
        for (dependencyNode : dependencyNodesWithoutOutgoingEdges) {
            tmpPrio = dependencyNode.visit(tmpPrio, dependencies);
        }

        // visit these unconnected nodes (these have prio -1) with the max-priority
        var maxPrio = tmpPrio + 1
        for (dependencyNode : dependencyNodesWithNoEdges) {
            maxPrio = dependencyNode.visit(maxPrio, dependencies);
        }
        
        dependencyNodes
    }
    
    // Visit helper function for topological sorting the dependency nodes.
    def private int visit(DependencyNode dependencyNode, int priority, List<Dependency> dependencies) {
        if (dependencyNode.getPriority == -1) {
            dependencyNode.setPriority(-2);
            var tmpPrio = priority;
            for (incomingDependency : dependencyNode.incomingDependencies(dependencies)) {
                val nextNode = incomingDependency.stateDepending // sourceNode;
                if (nextNode != dependencyNode) {
                        tmpPrio = nextNode.visit(tmpPrio, dependencies);
                }
            }
            dependencyNode.setPriority((tmpPrio + 1));
            var nextPrio = tmpPrio + 1
            // =============================
            // Optimization for dependencies
            // =============================
            // This implicitly forms (splitted-) "basic blocks" of the same priority
            if (dependencyNode.outgoingDependencies(dependencies).filter(typeof(DataDependency)).size == 0) {
                nextPrio = tmpPrio
            }
            return nextPrio;
        }
        else {
           return priority;
        }
    }
    

   //-------------------------------------------------------------------------
   //--           D E P E N D E N C Y   O P T I M I Z A T I O N             --
   //-------------------------------------------------------------------------
   
   // Dependencies between control flow ONLY does not need to be    
    
   // -------------------------------------------------------------------------   
}
