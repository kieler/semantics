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
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import java.util.ArrayList
import java.util.List
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import java.util.HashMap
import java.util.Collections
import java.util.Comparator
import de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl
import de.cau.cs.kieler.sccharts.Emission

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
    HashMap<State, DependencyState> states2DependencyStates
    HashMap<State, DependencyState> statesJoin2DependencyStates
//    List<DependencyState> dependencyStates
//    List<Dependency> dependencies
    
    //-------------------------------------------------------------------------
    //--      T R A N S F O R M      T O      D E P E N D E N C I E S        --
    //-------------------------------------------------------------------------
    
    // Get a dependency representation for a state. For hierarchical states also a
    // join-representation can be retrieved.
    def private DependencyState getDependencyState(State state) {
       states2DependencyStates.get(state)
    }

    // Get a  join dependency representation for a hierarchical state.
    def private DependencyState getJoinDependencyState(State state) {
      statesJoin2DependencyStates.get(state)
    }
    
    // Map a new dependency representation of a state to a state.
    def private DependencyState map(DependencyState dependencyState, State state, boolean isJoin) {
        if (!isJoin) {
            states2DependencyStates.put(state, dependencyState)
        } else {
            statesJoin2DependencyStates.put(state, dependencyState)
        }
        dependencyState
    }

    // Calculate all dependencies and retrieve them as a list.
    def public List<Dependency> getAllDependencies(Region rootRegion) {
        // Clear dependencies
        val dependencies = new ArrayList<Dependency>
        states2DependencyStates = new HashMap<State, DependencyState>
        statesJoin2DependencyStates = new HashMap<State, DependencyState>
        val dependencyStates = new ArrayList<DependencyState>
        
        // Go thru all states and create a dependency representation for it (DepenedencyState)
        for (state : rootRegion.allContainedStates) {
            val dependencyState = (new DependencyState(state)).map(state, false)
            dependencyStates.add(dependencyState)
            if (state.hierarchical) {
                // For hierarchical states additionally create a join-representation
                val joinDependencyState = (new DependencyState(state)).map(state, true)
                joinDependencyState.setIsJoin(true)
                dependencyStates.add(joinDependencyState)
            }
        }
        
        // Go thru all regions and states recursively and build up dependencies
        for (region : rootRegion.rootState.regions) {
           region.transformDependencies(dependencies)
        }

        dependencies
    }    
           
    // Calculate all dependencies and retrieve the dependency priorities.            
    def public List<DependencyState>  getAllDependencyStates(Region rootRegion) {
        rootRegion.getAllDependencyStates(rootRegion.getAllDependencies)
    }

    // Retrieve the dependency priorities where the dependencies have been computed before.            
    def public List<DependencyState> getAllDependencyStates(Region rootRegion, List<Dependency> dependencies) {
        val dependencyStates = new ArrayList<DependencyState>
        
        // Re-build dependencyState list
        for (dependency : dependencies) {
            val dependencyState = dependency.stateDepending
            if (!dependencyStates.contains(dependencyState)) {
                dependencyStates.add(dependencyState)
            }
            val dependencyState2 = dependency.stateDepending
            if (!dependencyStates.contains(dependencyState2)) {
                dependencyStates.add(dependencyState2)
            }
        }
        
        // Topological Sort
        dependencyStates.topologicalSort(dependencies)
    }
    
   // -------------------------------------------------------------------------   
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
               val newDataDependency = new DataDependency(state.dependencyState, stateToDependOn.dependencyState)
               dependencies.add(newDataDependency)
            } 
        }
        // Control Flow dependencies
        for (transition : state.incomingTransitions) {
            if (state.hierarchical) {
                for (region : state.regions) {
                    for (initialState : region.states.filter[isInitial]) {
                        val newControlFlowDependency = new ControlflowDependency(initialState.dependencyState, state.dependencyState)
                        dependencies.add(newControlFlowDependency)
                    }
                    for (finalState : region.states.filter[isFinal]) {
                        val newControlFlowDependency = new ControlflowDependency(state.joinDependencyState, finalState.dependencyState)
                        dependencies.add(newControlFlowDependency)
                    }
                }
            } else {
                if (transition.sourceState.hierarchical) {
                    val newControlFlowDependency = new ControlflowDependency(state.dependencyState, transition.sourceState.joinDependencyState)
                    dependencies.add(newControlFlowDependency)
                } else {
                    val newControlFlowDependency = new ControlflowDependency(state.dependencyState, transition.sourceState.dependencyState)
                    dependencies.add(newControlFlowDependency)
                }
            }
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
           
   // -------------------------------------------------------------------------   

   //-------------------------------------------------------------------------
   //--                  A C C E S S    F U N C T I O N S                   --
   //-------------------------------------------------------------------------
   
   // Get a list of states sorted by their priority with highest priority first.
   def public List<DependencyState> getPioritySortedStates(List<DependencyState> dependencyStates) {
        dependencyStates.sort(e1, e2 | comparePriorities(e1,e2));
   }
   
   def private int comparePriorities(DependencyState e1, DependencyState e2) {
        if (e1.priority > e2.priority) {-1} else {1}    
   }
   
   
   def private List<Dependency> outgoingDependencies(DependencyState dependencyState, List<Dependency> dependencies) {
       dependencies.filter[stateDepending == dependencyState.state].toList 
   }

   def private List<Dependency> incomingDependencies(DependencyState dependencyState, List<Dependency> dependencies) {
       dependencies.filter[stateToDependOn == dependencyState.state].toList 
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
   def private List<DependencyState> topologicalSort(List<DependencyState> dependencyStates, List<Dependency> dependencies) {
        val allDependencyStates = dependencyStates
       
        // Reset dependencies and initialize with default priority -1
        for (dependencyState : allDependencyStates) {
            dependencyState.setPriority(-1)
        }
        
        val dependencyStatesWithNoEdges = allDependencyStates.filter(e | 
                                                e.outgoingDependencies(dependencies).nullOrEmpty 
                                             && e.incomingDependencies(dependencies).nullOrEmpty
        )

        // pre-visit these nodes with some max-priority,
        // because we can always LOWER a priority (to a possible weak abort representation) but not ENLARGE a prio within a tick.
        // -1 because we reserve the MAXIMAL priority for the (connected) root node, we will re-arrange the root node's prio                                                 
        var tmpPrio = allDependencyStates.size - dependencyStatesWithNoEdges.size - 1;
        for (dependencyState : dependencyStatesWithNoEdges) {
            //node.setPriority(-1);
            tmpPrio = dependencyState.visit(tmpPrio, dependencies);
        }
        //TODO: possible optimization: delete all unconnected strong-representations and in the S code generation, use
        //skip the prio statement.
        
        // calculate priorities for all connected nodes (including the root)
        // now start with priority 0                                              
        tmpPrio = 0;
        val dependencyStatesWithoutOutgoingEdges = allDependencyStates.filter(e | 
                                                    e.outgoingDependencies(dependencies).nullOrEmpty 
                                                && !e.incomingDependencies(dependencies).nullOrEmpty
        )
            
        for (dependencyState : dependencyStatesWithoutOutgoingEdges) {
            tmpPrio = dependencyState.visit(tmpPrio, dependencies);
        }
        
        // re-set the root node's priority to be the maximal priority (above all unconnected nodesWithNoEdges
        val rootDependencyStates = allDependencyStates.filter(e | 
                                                (e.priority == (allDependencyStates.size - dependencyStatesWithNoEdges.size)) 
                                             && !e.incomingDependencies(dependencies).nullOrEmpty)

        if (rootDependencyStates.head != null) {
            rootDependencyStates.head.setPriority(allDependencyStates.size);
        }
        
        dependencyStates
    }
    
    // Visit helper function for topological sorting the dependency nodes.
    def private int visit(DependencyState dependencyState, int priority, List<Dependency> dependencies) {
        if (dependencyState.priority == -1) {
//            System::out.println(node.id + "("+node.incomingDependencies.size +  ") ... ");
            dependencyState.setPriority(-2);
            var tmpPrio = priority;
            for (incomingDependency : dependencyState.incomingDependencies(dependencies)) {
                val nextNode = incomingDependency.stateDepending // sourceNode;
                if (nextNode != dependencyState) {
                        tmpPrio = nextNode.visit(tmpPrio, dependencies);
                }
            }
//            node.setPriority(1 + (node.eContainer as Dependencies).nodes.size - (tmpPrio + 1)); // REVERSE ORDERING
//            System::out.println(node.id + "("+node.incomingDependencies.size +  ")" +  ": " + (tmpPrio + 1));
            dependencyState.setPriority((tmpPrio + 1));
            return tmpPrio + 1;
        }
        else {
           return priority;
        }
    }
    
    // ======================================================================================================
   
}
