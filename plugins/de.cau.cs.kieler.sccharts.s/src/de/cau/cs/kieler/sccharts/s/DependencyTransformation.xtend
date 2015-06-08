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
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.core.kexpressions.keffects.Emission
import de.cau.cs.kieler.core.kexpressions.keffects.Assignment

/** 
 * SCCharts DependencyTransformation Extension builds up a sorted list of dependencies between states
 * of an SCG normalized SCChart.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class DependencyTransformation {

    // -------------------------------------------------------------------------
    // SCCharts extensions are necessary   
    @Inject
    extension SCChartsExtension

    //-------------------------------------------------------------------------
    //--      T R A N S F O R M      T O      D E P E N D E N C I E S        --
    //-------------------------------------------------------------------------
    // Calculate all dependencies and retrieve them as a list.
    def public DependencyGraph getDependencyGraph(State rootState) {

        // Clear dependencies
        val dependencyGraph = new DependencyGraph()
        val dependencies = dependencyGraph.dependencies
        val dependencyNodes = dependencyGraph.dependencyNodes
        states2DependencyNodes = new HashMap<State, DependencyNode>
        statesJoin2DependencyNodes = new HashMap<State, DependencyNode>

        // Go thru all states and create a dependency representation for it (DepenedencyState)
        for (state : rootState.getAllStates.toIterable) {

            //if (state != rootState.getRootState) {
            if (!states2DependencyNodes.containsKey(state)) {
//                System.out.println("XXX " + state.id);

                val dependencyNode = (new DependencyNode(state)).map(state, false)
                dependencyNodes.add(dependencyNode)
                if (state.hasInnerStatesOrControlflowRegions) {

                    // For hierarchical states additionally create a join-representation
                    val joinDependencyState = (new DependencyNode(state)).map(state, true)
                    joinDependencyState.setIsJoin(true)
                    dependencyNodes.add(joinDependencyState)
                }
            }

        //}
        }

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX "); 

        // Go thru all regions and states recursively and build up dependencies
        rootState.transformDependencies(dependencies);

//                for (region : rootState.regions) {
//                    region.transformDependencies(dependencies)
//                }


        for (dependency : dependencies) {
           System.out.println("XXXX dependency " + dependency.stateDepending.state.id + " -> " +  dependency.stateToDependOn.state.id);
        }


        // Topological Sort
        dependencyNodes.topologicalSort(dependencies)

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX "); 
        for (dependencyNode : dependencyNodes) {
            System.out.println("XXXX dependencyNode for " + dependencyNode.state.id + " : p=" + dependencyNode.priority + ", o=" + dependencyNode.order + ", join=" + dependencyNode.isJoin);
        }

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
            } else {
                valuedObjectReferences = transition.trigger.eAllContents.filter(typeof(ValuedObjectReference)).toList
            }

            for (valuedObjectReference : valuedObjectReferences) {

                // The valuedObject we search for
                val valuedObject = valuedObjectReference.valuedObject

                // Search ALL actions of the node
                val allActions = transition.sourceState.getRootState.eAllContents.filter(typeof(Action)).toList

                for (action : allActions) {
                    for (effect : action.effects) {
                        if ((effect instanceof Emission && ((effect as Emission).valuedObject == valuedObject))
                         || effect instanceof Assignment && ((effect as Assignment).valuedObject == valuedObject)) {

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
    // This method returns true if two states have a common fork/macro state but are in
    // a different thread.
    ArrayList<State> visited = new ArrayList<State>

    def private boolean canReach(State state, State state2) {

        // Clear visited hash map
        visited.clear

        // Start with state and try to reach state2
        return state.canReach(state2, state)
    }

    def private boolean canReach(State state, State state2, State tmpState) {

        // Test if visited
        if (visited.contains(tmpState)) {
            return false
        }

        // Mark as visited
        visited.add(tmpState)

        // This is a HIT
        if (state2 == tmpState) {
            return true
        }

        // Follow control flow
        for (transition : tmpState.outgoingTransitions) {
            if (state.canReach(state2, transition.targetState)) {
                return true
            }

            // Hierarchical extension FORK
            if (transition.targetState.hasInnerStatesOrControlflowRegions) {
                for (region : transition.targetState.regions.filter(ControlflowRegion)) {
                    for (initialState : region.states.filter[isInitial]) {
                        if (state.canReach(state2, initialState)) {
                            return true
                        }
                    }
                }
            }
        }

        // Hierarchical extension JOIN
        if (tmpState.isFinal && tmpState.parentRegion != null) {
            val tmpStateParent = tmpState.parentRegion.parentState
            if (tmpStateParent != null) {

                // We know that tmpStateParent must be hierarchical because tmpState is IN one of its
                // regions.
                if (!tmpStateParent.outgoingTransitions.nullOrEmpty) {
                    val normalTerminationTransition = tmpStateParent.outgoingTransitions.get(0)
                    if (state.canReach(state2, normalTerminationTransition.targetState)) {
                        return true
                    }
                }
            }
        }
        return false
    }

    static HashMap<Integer, Boolean> differentThreadCache = new HashMap<Integer, Boolean>

    // This is a complex operation that should be cached iff possible
    def private boolean isDifferentThread(State state, State state2) {
        val stateAndState2Hash = state.hashCode + state2.hashCode
        var returnValue = differentThreadCache.get(stateAndState2Hash)
        if (returnValue == null) {
            returnValue = !(state.canReach(state2) || state2.canReach(state))
            differentThreadCache.put(stateAndState2Hash, returnValue)
        }
        return returnValue
    }

    // -------------------------------------------------------------------------   
    def private void transformDependencies(State state, List<Dependency> dependencies) {

        // Data dependencies
        for (transition : state.outgoingTransitions) {
            
            // It is important to consider only those states, that are in a different thread
            for (stateToDependOn : transition.statesToDependOn.filter(e|e.isDifferentThread(state))) {
                val newDataDependency = new DataDependency(state.dependencyNode, stateToDependOn.dependencyNode)
//                System.out.println("newDataDependency " + newDataDependency.stateDepending.state.id + "->" + newDataDependency.stateToDependOn.state.id); 
                dependencies.add(newDataDependency)
            }
        }

//        System.out.println("Consider incoming transitions of state: " + state.id + " (" + state.incomingTransitions.size + ")")  ;

        // Control Flow dependencies
        for (transition : state.incomingTransitions) {
//            System.out.println("State: " + state.id + " <- " + transition.sourceState.id);
            if (state.hasInnerStatesOrControlflowRegions) {
                for (region : state.regions.filter(ControlflowRegion)) {
                    for (initialState : region.states.filter[isInitial]) {
                        val newControlFlowDependency = new ControlflowDependency(initialState.dependencyNode,
                            state.dependencyNode)
//                        System.out.println("newControlFlowDependency1 " + newControlFlowDependency.stateDepending.state.id + "->" + newControlFlowDependency.stateToDependOn.state.id); 
                        dependencies.add(newControlFlowDependency)
                    }
                    for (finalState : region.states.filter[isFinal]) {
                        val newControlFlowDependency = new ControlflowDependency(state.joinDependencyState,
                            finalState.dependencyNode)
//                        System.out.println("newControlFlowDependency2 " + newControlFlowDependency.stateDepending.state.id + "->" + newControlFlowDependency.stateToDependOn.state.id); 
                        dependencies.add(newControlFlowDependency)
                    }
                }
            } // else {
            if (transition.sourceState.hasInnerStatesOrControlflowRegions) {
                val newControlFlowDependency = new ControlflowDependency(state.dependencyNode,
                    transition.sourceState.joinDependencyState)
                dependencies.add(newControlFlowDependency)
//                System.out.println("newControlFlowDependency3 " + newControlFlowDependency.stateDepending.state.id + "->" + newControlFlowDependency.stateToDependOn.state.id); 
            } else {
                if (transition.isImmediate) {
                    val newControlFlowDependency = new ControlflowDependency(state.dependencyNode,
                        transition.sourceState.dependencyNode)
                    dependencies.add(newControlFlowDependency)
//                System.out.println("newControlFlowDependency4 " + newControlFlowDependency.stateDepending.state.id + "->" + newControlFlowDependency.stateToDependOn.state.id); 
                }
            }

        //}
        }

        // Go thru all regions and states recursively and build up dependencies
        for (region : state.regions.filter(ControlflowRegion)) {
            region.transformDependencies(dependencies)
        }
    }

    // -------------------------------------------------------------------------   
    def private void transformDependencies(ControlflowRegion region, List<Dependency> dependencies) {

        // Go thru all states and states recursively and build up dependencies
        for (state : region.states) {
            state.transformDependencies(dependencies)
        }
    }

    //-------------------------------------------------------------------------
    //--                M A P P I N G    F U N C T I O N S                   --
    //-------------------------------------------------------------------------
    // Create an empty dependency list
    HashMap<State, DependencyNode> states2DependencyNodes
    HashMap<State, DependencyNode> statesJoin2DependencyNodes

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
        dependencyNodes.sort(e1, e2|comparePriorities(e1, e2));
    }

    // Get a list of states sorted by their order with highest order first.
    def public List<DependencyNode> getOrderSortedStates(List<DependencyNode> dependencyNodes) {
        dependencyNodes.sort(e1, e2|compareOrdersRespectingRoot(e1, e2));
    }

    // Compare two priorities.
    def private int comparePriorities(DependencyNode e1, DependencyNode e2) {
        if (e1.getPriority > e2.getPriority) {
            -1
        } else {
            1
        }
    }

    // Compare two orders.
    def private int compareOrders(DependencyNode e1, DependencyNode e2) {
        if (e1.getOrder > e2.getOrder) {
            -1
        } else {
            1
        }
    }


    // Compare two orders but respect a root before all other nodes
    def private int compareOrdersRespectingRoot(DependencyNode e1, DependencyNode e2) {
        if (!e1.isJoin && e1.state.isRootState) {
            return -1;
        }
        if (!e2.isJoin && e2.state.isRootState) {
            return 1
        }
        if (e1.getOrder > e2.getOrder) {
            return  -1
        } else {
           return  1
        }
    }

    // Gets a list of outgoing dependencies for a dependency node.
    def private List<Dependency> outgoingDependencies(DependencyNode dependencyNode, List<Dependency> dependencies) {
        dependencies.filter[stateDepending == dependencyNode].toList
    }

    // Gets a list of incoming dependencies for a dependency node.
    def private List<Dependency> incomingDependencies(DependencyNode dependencyNode, List<Dependency> dependencies) {
        dependencies.filter[stateToDependOn == dependencyNode].toList
    }

    //-------------------------------------------------------------------------
    //--                  T O P O L O G I C A L    S O R T                   --
    //-------------------------------------------------------------------------
    // This implementation sets the priority as well as the order of the dependency nodes representing
    // SCCharts states. The priority is optimized in contrast to the order. 
    // The implementatiation
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

        val dependencyNodesWithNoEdges = allDependencyStates.filter(
            e|
                e.outgoingDependencies(dependencies).nullOrEmpty && e.incomingDependencies(dependencies).nullOrEmpty
        )

        // Calculate priorities for all connected nodes (including the root)
        // now start with priority 0                                   
        // It is necessary that this is the only instance           
        var PriorityAndOrder tmpPrioAndOrder = new PriorityAndOrder(0, 0);
        val dependencyNodesWithoutOutgoingEdges = allDependencyStates.filter(
            e|
                e.outgoingDependencies(dependencies).nullOrEmpty && !e.incomingDependencies(dependencies).nullOrEmpty
        )

        for (dependencyNode : dependencyNodesWithoutOutgoingEdges) {
            dependencyNode.visit(tmpPrioAndOrder, dependencies);
        }
 
        // Visit these unconnected nodes (these have prio -1) with the max-priority
        var maxPrioOrder = tmpPrioAndOrder
        for (dependencyNode : dependencyNodesWithNoEdges) {
            dependencyNode.visit(maxPrioOrder, dependencies);
        }

        dependencyNodes
    }

    // Visit helper function for topological sorting the dependency nodes.
    def private void visit(DependencyNode dependencyNode, PriorityAndOrder prioAndOrder,
        List<Dependency> dependencies) {
        if (dependencyNode.getPriority == -1) {
            dependencyNode.setPriority(-2);
            var tmpPrioAndOrder = prioAndOrder;
            for (incomingDependency : dependencyNode.incomingDependencies(dependencies)) {
                val nextNode = incomingDependency.stateDepending
                if (nextNode != dependencyNode) {
                    nextNode.visit(tmpPrioAndOrder, dependencies);
                }
            }
            dependencyNode.setPriority((tmpPrioAndOrder.priority + 1));
            dependencyNode.setOrder((tmpPrioAndOrder.order + 1));
            tmpPrioAndOrder.incrementOrder

            // =============================
            // Optimization for dependencies
            // =============================
            // This implicitly forms (splitted-) "basic blocks" of the same priority
            if (dependencyNode.outgoingDependencies(dependencies).filter(typeof(DataDependency)).size != 0 ||
                dependencyNode.state.isFinal || dependencyNode.state.isInitial ||
                dependencyNode.state.hasInnerStatesOrControlflowRegions) {
                tmpPrioAndOrder.incrementPriority
            }
            return // tmpPrioOrder;
        } else {

            //            prioOrder.setOrder(dependencyNode.order)
            //            prioOrder.setPriority(dependencyNode.priority)
            return //prioOrder; // new PriorityAndOrder(dependencyNode.priority, dependencyNode.order);
        }
    }

// -------------------------------------------------------------------------   
}
