/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.prio.dependencies.xtend

import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
//import de.cau.cs.kieler.sccharts.Emission
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.ControlflowDependency
import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.Dependencies
import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.Dependency
import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.DependencyFactory
import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.Node
import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.NodeType
import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.TransitionDependency
import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.ValuedObjectDependency
import java.util.ArrayList
import java.util.List
import de.cau.cs.kieler.sccharts.Assignment
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension

/**
 * Build a dependency graph for a SynChart. Consider control flow dependencies (immediate transitions),
 * transition dependencies (transition priorities), hierarchy dependencies (hierarchical states) and
 * valuedObject dependencies (emitters and triggers).
 * 
 * 03.09.2012
 * Necessary optimization because of nondeterministic (sometimes WRONG) choices for priorities:
 * > If there are NO outgoing weak-aborts, then delete the weak abort representation
 * > Else
 * >   If there are NO outgoing strong-aborts, then delete the strong abort representation
 * This ensures a default-strong representation, in case there are no outgoing transitions at all
 * AND it ensures both types of representation in case there are strong AND weak outgoing transitions.
 * 10.09.2012
 * If there is NO outgoing transition at all (final state) that keep the strong abort representation.
 *
 * This code was last redesigned for SCCharts by cmot on 2014-10-14.
 * 
 * @author cmot
 * @kieler.design 2014-10-14 proposed cmot
 * @kieler.rating 2014-10-14 proposed yellow cmot
 * 
 */
 class SCCharts2Dependencies {
       
    @Inject
    extension SCChartsExtension
           
    // ================================================================================================
    //==                               T R A V E R S E    S Y N C C H A R T                         ==
    // ================================================================================================

    // Main transform method as create extension.
    def create dependencies : DependencyFactory::eINSTANCE.createDependencies() transform (State root) {
        dependencies.transform(root);
    }        
    
    // Main transform method for a given dependencies object.
    def Dependencies transform( Dependencies dependencies, State rootState) {

        var allStates = rootState.eAllContents.toIterable().filter(typeof(State)).toList;

        // Create nodes for all states 
        for (state : allStates) {
            if (state.needsDependencyRepresentation) {
               if (!state.hasOutgoingTransitions) {
                  // Dummy dependency node for a NULL transition
                  // this representation is for hierarchical states that have no outgoing transition.
                  // Note that simple states w/o outgoing transitions need no dependency representation
                  // at all.
                  // For a simple state only create a strong dependency node.
                  // For a hierarchical state create an additional weak dependency node only iff it has outgoing
                  // weak abort transitions; getWeakNode() takes care of creating this representation only
                  // if it is needed.                 
                  dependencies.getStrongNode(state);
                  dependencies.getWeakNode(state);
               } else {
                  // For states with outgoing transitions, create dependency nodes for
                  // every outgoing transition
                  // For a simple state only create a strong dependency node.
                  // For a hierarchical state create an additional weak dependency node only iff it has outgoing
                  // weak abort transitions; getWeakNode() takes care of creating this representation only
                  // if it is needed.                 
                  for (transition : state.outgoingTransitions) {
                        dependencies.getStrongNode(state, transition);
                        dependencies.getWeakNode(state, transition);
                  }
               }
            }
        }
        
        
        // ValuedObject dependencies
        
        // ValuedObject dependencies are necessary for control flow dependency optimization
        // because only relevant control flow dependencies should be added to prevent unnecessary 
        // cycles in the dependency graph. It is necessary to add the valuedObject dependencies BEFORE
        // calculating control flow dependencies.
        var allTransitions = rootState.eAllContents.toIterable().filter(typeof(Transition)).toList;
        for (transition : allTransitions) {
              dependencies.handleValuedObjectDependency(transition, rootState);
        }        

        // Create dependencies between nodes
        //
        // Test 100 reveals that if state S has outgoing immediate transitions then all states An from 
        // which S can be entered, S needs to have a control flow dependency to. 
        //
        // Test 102 reveals internal actions of S that may possibly be executed immediately
        // after S is entered by an immediate action. Therefore if S is hierarchical and
        // S has incoming transitions from An then S has to depend on these
        // An states too.
        // Therefore we introduce control flow dependencies for outgoing transitions
        // to hierarchical states. If S is hierarchical then there might be a dependency necessary
        // for the strong AND the weak representation of S.
        for (state : rootState.regions.head.getAllStatesAndHandleHiearchyDependency(dependencies)) {
            dependencies.handleTransitionDependency(state);
            
            var immediateOutgoingTransitions = state.outgoingTransitions.filter(e|e.isImmediate);
            var outgoingTransitions = state.outgoingTransitions;
            
            // If there are any outgoing immediate transitions of this state S
            for (immediateTransition : immediateOutgoingTransitions) {
                // Then add a control flow dependency for every incoming normal transition
                for (transition : state.incomingTransitions) {
                    var dependencyTargetNode  = dependencies.getStrongNode(transition.sourceState, transition);
                    if (transition.sourceState.hierarchical) {
                          dependencyTargetNode  = dependencies.getWeakNode(transition.sourceState, transition);
                    }
                 
                    dependencies.handleControlFlowDependency(dependencyTargetNode, state, immediateTransition);
//                    if (transition.targetState.outgoingTransitions.size == 0) {
//                        dependencies.handleControlFlowDependency(dependencyTargetNode, state, immediateTransition, null);
//                    }
//                    for (targetTransition: state.outgoingTransitions) {
//                        dependencies.handleControlFlowDependency(dependencyTargetNode, state, immediateTransition, targetTransition);
//                    }
                }
            }

            for (outgoingTransition : outgoingTransitions) {
                
                val targetState = outgoingTransition.targetState;
                
                if (targetState.hierarchical) {
                    var dependencyNode  = dependencies.getStrongNode(state, outgoingTransition);
                    // if S is hierarchical, then we might need ONLY a dependency to the weak form (example 110, weak representation of A)
                    if (state.needsWeakRepresentation) {
                        dependencyNode = dependencies.getWeakNode(state, outgoingTransition);
                    }
                    dependencies.handleControlFlowDependency(dependencyNode, targetState, outgoingTransition);
                } 
            }
            
            // If S in an initial state
            
//            // If S is hierarchical
//                for (transition :  immediateIncomingTransitions) {
//                    var dependencyTargetNode  = dependencies.getStrongNode(transition.sourceState, transition);
//                    if (transition.sourceState.hierarchical) {
//                        dependencyTargetNode  = dependencies.getWeakNode(transition.sourceState, transition);
//                    }
//                 
//                    if (transition.targetState.outgoingTransitions.size == 0) {
//                        dependencies.handleControlFlowDependency(dependencyTargetNode, state, transition, null);
//                    }
//                    for (targetTransition: state.outgoingTransitions) {
//                        dependencies.handleControlFlowDependency(dependencyTargetNode, state, transition, targetTransition);
//                    }
//                }
                        
        }



// 10.11.2012
// The following optimization is not necessary any more because
// getWeakNode and getStrongNode already consider the cases when such (weak or strong) representation is not needed
// and in this case return the other (strong or weak) representation.
//        
//        // necessary optimization to remove nondeterministic choices that are ruled out by the fact
//        // that there are no transitions of type strong (weak). In this case we do not need to consider
//        // the strong (weak) representation of the node.
//        for (state : allStates) {
//            // consider normal terminations also as weak aborts
//            val outgoingWeakTransitions = state.outgoingTransitions.filter(e | e.type != TransitionType::STRONGABORT);
//            val outgoingStrongTransitions = state.outgoingTransitions.filter(e | e.type == TransitionType::STRONGABORT);
//            // ".. && outgoingStrongTransitions != 0" for (macro) states without any outgoing transition, leave the
//            // weak representation in!
//            if (outgoingWeakTransitions.size == 0 && outgoingStrongTransitions.size > 0) {
//                // now we can proceed and delete all dependencies to the weak representation of state
//                val nodesToDelete = dependencies.nodes.filter(e | e.id.startsWith(state.id) && e.id.endsWith("_W")).toList();
//                for (node : nodesToDelete) {
//                    val dependenciesToDelete = dependencies.dependencies.filter(e | e.targetNode == node || e.sourceNode == node).toList();
//                    for (dependency : dependenciesToDelete) {
//                         // not only delete the nodes but also all dependencies (transitions) to an from the nodes
//                         dependency.targetNode.incomingDependencies.remove(dependency);
//                         dependency.sourceNode.outgoingDependencies.remove(dependency);
//                         dependencies.dependencies.remove(dependency);
//                    }
//                    // the following deletion is optional, code generation should skip/optimize
//                    // PRIO statements away, iff their nodes are NULL
//                    dependencies.nodes.remove(node);
//                }
//            }
//            else if (outgoingWeakTransitions.size > 0 && outgoingStrongTransitions.size == 0) {
//                // in this case there are weak-outgoing transitions
//                // we can now check if we can get rid of the strong abort representation 
//                // BUT this only holds for macro states
//                if (state.isHierarchical) {
//                    // now we can proceed and delete all dependencies to the strong representation of state
//                    val nodesToDelete = dependencies.nodes.filter(e | e.id.startsWith(state.id + "_") && e.id.endsWith("_S") && e.state.regions.size > 0).toList();
//                    for (node : nodesToDelete) {
//                          val dependenciesToDelete = dependencies.dependencies.filter(e | e.targetNode == node || e.sourceNode == node).toList();
//                        for (dependency : dependenciesToDelete) {
//                             // not only delete the nodes but also all dependencies (transitions) to an from the nodes
//                             dependency.targetNode.incomingDependencies.remove(dependency);
//                             dependency.sourceNode.outgoingDependencies.remove(dependency);
//                             dependencies.dependencies.remove(dependency);
//                        }
//                        // the following deletion is optional, code generation should skip/optimize
//                        // PRIO statements away, iff their nodes are NULL
//                        dependencies.nodes.remove(node);
//                    }
//                }
//            }
//        }
        
        // topological sort
        dependencies.topologicalSort();

        return dependencies;
    }
    
    // -----------------------------------------------------------------------------------------------------


    // Retrieve all states of a region and create hierarchy dependencies.
    def List<State> getAllStatesAndHandleHiearchyDependency(Region region, Dependencies dependencies) {
        var List<State> stateList = new ArrayList()
        for (state : region.states) {
            stateList.add(state)
            for (regionsOfState : state.regions) {
                var childStates = regionsOfState.getAllStatesAndHandleHiearchyDependency(dependencies);
                for (childState : childStates) {
                    dependencies.handleHierarchyDependency(childState, state);
                }
                stateList.addAll(childStates)
            }  
        }
        stateList
    }

    // Retrieve all states of a region.
    def List<State> getAllStatesOfRegion (Region region) {
        region.states
    }

    // Retrieve all region of a state.
    def List<Region> getAllRegionsOfState (State state) {
        state.regions
    }
    
    
    // ======================================================================================================
    // ==                                 H A N D L E    D E P E N D E N C Y                               ==
    // ======================================================================================================
    
    // HIERARCHY DEPENDENCY //

    // Helper function for creating hierarchy dependencies.
    def handleHierarchyDependencyHelperPS(Dependencies dependencies, State childState, Node parent, Transition childStateTransition) {
            if (childState.needsStrongRepresentation) {
               val CS = dependencies.getStrongNode(childState, childStateTransition);
               dependencies.getHierarchyDependency(CS, parent);
            }
            if (childState.needsWeakRepresentation) {
               val CW = dependencies.getWeakNode(childState, childStateTransition);
               dependencies.getHierarchyDependency(CW, parent);
            }
    }
    // Helper function for creating hierarchy dependencies.
    def handleHierarchyDependencyHelperPW(Dependencies dependencies, State childState, Node parent, Transition childStateTransition) {
            if (childState.needsStrongRepresentation) {
               val CS = dependencies.getStrongNode(childState, childStateTransition);
               dependencies.getHierarchyDependency(parent, CS);
            }
            if (childState.needsWeakRepresentation) {
               val CW = dependencies.getWeakNode(childState, childStateTransition);
               dependencies.getHierarchyDependency(parent, CW);
            }
    }
    
    // Helper function for creating hierarchy dependencies.
    def handleHierarchyDependencyHelper(Dependencies dependencies, State childState, State state, Transition stateTransition) {
        val PS = dependencies.getStrongNode(state, stateTransition);
        // Parent state is hierarchical and has weak aborting transitions (otherwise this will be the strong representation automatically)
        var PW = dependencies.getWeakNode(state, stateTransition);
            // By default ALWAYS connect weak with strong representation 
            if (state.needsStrongRepresentation && state.needsWeakRepresentation) {
                dependencies.getHierarchyDependency(PW, PS);
            }        
        
        // If state has no outgoing transitions, do with dummy self-transition
        if (!childState.hasOutgoingTransitions) { 
            if (state.needsStrongRepresentation) { 
                dependencies.handleHierarchyDependencyHelperPS(childState, PS, null);
            }
            else if (state.needsWeakRepresentation) {
                dependencies.handleHierarchyDependencyHelperPW(childState, PW, null);
            }
        }
        else {
            if (state.needsStrongRepresentation) { 
                dependencies.handleHierarchyDependencyHelperPS(childState, PS, null);
            }
            if (state.needsWeakRepresentation) {
                dependencies.handleHierarchyDependencyHelperPW(childState, PW, null);
            }
//            for (childStateTransition : childState.outgoingTransitions) {
//                if (state.needsStrongRepresentation) {
//                    dependencies.handleHierarchyDependencyHelperPS(childState, PS, childStateTransition);
//                }
//                if (state.needsWeakRepresentation) {
//                    dependencies.handleHierarchyDependencyHelperPW(childState, PW, childStateTransition);
//                }
//            }
        }
    }
    
    // Create hierarchy dependencies:
    // parent weak -> child strong -> parent strong
    // parent weak -> child weak   -> parent strong (if child is hierarchical)
    def handleHierarchyDependency(Dependencies dependencies, State childState, State state) {
        if (!state.hasOutgoingTransitions) {
            // if state has no outgoing transitions, do with dummy self-transition
            dependencies.handleHierarchyDependencyHelper(childState, state, null);
        }
        else {
            for (stateTransition : state.outgoingTransitions) {
                dependencies.handleHierarchyDependencyHelper(childState, state, stateTransition);
            }
        }
        
    }
 
    
    // TRANSITION DEPENDENCY //

    // Create transition dependencies for prioritized transitions in the order of their priority.
    def handleTransitionDependency(Dependencies dependencies, State state) {
       if (state.needsDependencyRepresentation) {
         var orderedTransitions = state.outgoingTransitions.filter(e|true).sort(e1, e2 | compareTransitionPriority(e1, e2));
         var i = 1;
         for (transition : orderedTransitions) {
                 if (i < orderedTransitions.size) {
                    var nextTransition = orderedTransitions.get(i);
                    if (nextTransition != null) {
                        if (state.needsStrongRepresentation) {
                           var sourceNode = dependencies.getStrongNode(state, transition);
                           var targetNode = dependencies.getStrongNode(state, nextTransition);
                           dependencies.getTransitionDependency(sourceNode, targetNode);
                        }
                        if (state.needsWeakRepresentation) {
                           var sourceNodeW = dependencies.getWeakNode(state, transition);
                           var targetNodeW = dependencies.getWeakNode(state, nextTransition);
                           dependencies.getTransitionDependency(sourceNodeW, targetNodeW);
                        }
                    }
                    i=i+1;
                }
          } // next transition
       }
    }
    
    
    // CONTROL FLOW DEPENDENCY //
    
    def getInnerInitialStates(State state) {
        val List<State> innerInitialStates = <State> newLinkedList;
        if (state.hierarchical) {
            for (region : state.regions) {
                innerInitialStates.addAll(region.states.filter(e | e.isInitial));
            }
        }
        return innerInitialStates;
    }
    
    def getImmediateTargets(State state) {
        val List<State> allImmediateTargets = <State> newLinkedList;
        val innerInititialStates = state.getInnerInitialStates;
        // Only start with inner initial states because these may lead to
        // dependency inheritance (like test 102)
        for (State innerInitialState : innerInititialStates) {
          innerInitialState.getImmediateTargetsHelper(allImmediateTargets);
        }
        return allImmediateTargets;
    }
    def getImmediateTargetsHelper(State state, List<State> allImmediateTargets) {
        // Consider each state just once
        if (!allImmediateTargets.contains(state)) {
            allImmediateTargets.add(state);
            // Consider immediate transitions
            val immediateTransitions = state.outgoingTransitions.filter(e | e.isImmediate);
            for (Transition transition : immediateTransitions) {
               // Recursive closure
               transition.targetState.getImmediateTargetsHelper(allImmediateTargets);
            }
            // Also consider inner initial states (these can be reachable also immediately)
            val innerInititialStates = state.getInnerInitialStates;
            for (State innerInitialState : innerInititialStates) {
               // Recursive closure
               innerInitialState.getImmediateTargetsHelper(allImmediateTargets);
            }
        }
        return allImmediateTargets;
    }
    
    def targetHasImmediateReaction(Transition transition, Dependencies dependencies) {
        val immediateTargets = transition.targetState.getImmediateTargets;
        if (immediateTargets.filter(e | e.needsDependencyRepresentation).size > 0) {
            
            // if there are immediate transitions reachable with effects
            // that result in other valuedObject dependencies to the dependency representation 
            // of this state then return true
            
            // Do not add any such dependencies for test 133
            // but add control flow dependencies for test 102
            for (immediateTarget : immediateTargets) {
               if (immediateTarget.needsDependencyRepresentation) {
                   var dependendNodeS = dependencies.getStrongNode(immediateTarget);
                   if (dependendNodeS.incomingDependencies.filter(e | e instanceof ValuedObjectDependency).size > 0) {
                       return true;
                   }   
               }
               if (immediateTarget.needsWeakRepresentation) {
                  var dependendNodeW  = dependencies.getWeakNode(immediateTarget);
                   if (dependendNodeW.incomingDependencies.filter(e | e instanceof ValuedObjectDependency).size > 0) {
                       return true;
                   }   
              }
            }
            return false;
        }
        return false;
    }
    
    // Create control flow dependencies for immediate transitions AND non immediate ones 
    // test 102 => also consider non-immediate ones!
    def handleControlFlowDependency(Dependencies dependencies, Node dependencyTargetNode, State state, Transition transition) {
            // transition == incoming transition from A to S responsible for the dependency
            // targetTransition 
            
           //133-tokenring-excerpt-defect.kids => transition.isImmediate 
           if (transition.isImmediate || transition.targetHasImmediateReaction(dependencies)) {
             if (state.needsDependencyRepresentation) {
               var dependendNodeS = dependencies.getStrongNode(state);
               if (state.needsWeakRepresentation) {
                  var dependendNodeW  = dependencies.getWeakNode(state);
                  // No dependency self loops AND no dependencies from strong to weak representation of same state
                     // Only if there are strong outgoing transitions from state (== transition is strong)
                  if (dependencyTargetNode.state != dependendNodeW.state && !transition.strong) {
                      dependencies.getControlFlowDependency(dependencyTargetNode, dependendNodeW, transition.isImmediate)
                  }
               }
               // No dependency self loops AND no dependencies from strong to weak representation of same state
               // Only if there are weak or normal termination outgoing transitions from state (== transition is not strong)
               // test 100 reveals that we need this dependency for simple states (these have only strong representations)
               // also when the transition is weak. ...|| (!state.needsWeakRepresentation)
               if (dependencyTargetNode.state != dependendNodeS.state  && (transition.strong || (!state.needsWeakRepresentation))) {
                   dependencies.getControlFlowDependency(dependencyTargetNode, dependendNodeS, transition.isImmediate)
               }
              }
           } 
            

// FIXME: Do we need that?!               
//                    if (transition.sourceState.hierarchical) {
//                        var firstNodeW  = dependencies.getNode(transition.sourceState, transition, NodeType::WEAK);
//                        if (transition.isImmediate) {
//                            dependencies.getControlFlowDependency(firstNodeW, secondNode, transition.isImmediate)  //TODO: necessary or correct???
//
//                            if (transition.targetState.hierarchical) {
//                                var secondNodeW = dependencies.getNode(transition.targetState, targetTransition, NodeType::WEAK);
//                                dependencies.getControlFlowDependency(firstNodeW, secondNodeW, transition.isImmediate)
//                                dependencies.getControlFlowDependency(firstNode, secondNodeW, transition.isImmediate)  //TODO: necessary or correct???
//                            }
//                        }
//                        
//                    }
    }

    
    // SIGNAL DEPENDENCY //
    
    // For a state get all outer states until reaching a non-initial state that contains it
    // Attention: Take into account ALSO all incoming transitions to the last state,
    // because when taking such a transition, this may result in following the initial
    // immediate chain (like in test 50-initial-states-valuedObject-dependencies3).
    // The stopAtParent state ensures that we stop at the common parent state, e.g.
    // test case 07-ABO.
    // Test 74-concurrent-and-hierarchical-write-dependency-weak-aborted reveals that
    // the stopAtCommonParent should NOT be added itself to the list if it is the rootState!
//    def List<State> getOuterStatesUntilNonInitial(State state, State stopAtCommonParent, State rootState) {
//        var List<State> states = <State> newLinkedList;
//        if (state.parentRegion != null && state.parentRegion.parentState != null &&
//            state.parentRegion.parentState != stopAtCommonParent) {
//
//            var outerState = state.parentRegion.parentState;
//            if (outerState != rootState) {
//                    // tested by 74-concurrent-and-hierarchical-write-dependency-weak-aborted
//                    states.add(outerState);
//            }
//            if (outerState.isInitial) {
//               var listFromOutSide = outerState.getOuterStatesUntilNonInitial(stopAtCommonParent, rootState);
//               states.addAll(listFromOutSide);
//            }
//            else {
//                // because of 50-initial-states-valuedObject-dependencies3
//                for (transition : outerState.incomingTransitions) {
//                   states.add(transition.sourceState);
//                }
//           }
//        }
//        return states;
//    }
    
    
    // For the state in question try to find a possible sequence of immediate transitions from
    // the initial state of the same region. If there is such a route, return TRUE. Return FALSE
    // otherwise.
//    def boolean isImmediatelyReachableFromInitialState(State state) {
//        // The following MUST exist if there is an initial state defined in each region!
//        var initialState = state.parentRegion.states.filter(e | e.isInitial).head as State;
//        return initialState.isImmediatelyReachableFromInitialState(state); 
//    }
    // The following helper function tries to follow immediate transitions from the current
    // state until it reached the target state. If it does it will return TRUE, otherwise
    // it will return FALSE with OR-combined return values for all outgoing immediate
    // transitions.
//    def boolean isImmediatelyReachableFromInitialState(State currentState, State finalTargetState) {
//        var immediateTransitions = currentState.outgoingTransitions.filter(e | e.isImmediate);
//        
//        var hasReachedFinalTargetState = false;
//        for (immediateTransition : immediateTransitions) {
//            val nextState = immediateTransition.targetState;
//            if (nextState == currentState) {
//                // Do not follow self loops
//                hasReachedFinalTargetState = hasReachedFinalTargetState || false;
//            }
//            else if (nextState == finalTargetState) {
//                // Declare success, because the target state is reachable over a
//                // possible sequence of immediate transitions.
//                hasReachedFinalTargetState =  hasReachedFinalTargetState || true;
//            }
//            else {
//                hasReachedFinalTargetState =  hasReachedFinalTargetState || 
//                                nextState.isImmediatelyReachableFromInitialState(finalTargetState);
//            }
//            return hasReachedFinalTargetState;
//        }
//        return true;
//    }

    // Create valuedObject dependencies for states emitting valuedObjects and other states testing for these valuedObjects in triggers of
    // their outgoing transitions.
    def handleValuedObjectDependency(Dependencies dependencies, Transition transition, State rootState) {
                for (assignment : transition.eAllContents().toIterable().filter(typeof(Assignment))) {
                    
                    // get other states that test for this valuedObject in out going transition triggers
                    // (the scope of the valuedObject should be respected because we are
                    // not searching for the NAME but for the object to appear in transition
                    // triggers)
                    //
                    // (effect as Emission).valuedObject; == emitted valuedObject
                    //
                    // Addition: rule out referenced within a PRE operator (done by triggerContainingValuedObject)
                    // Addition: immediate emissions of valuedObjects hiearchically inside our state must be
                    //           considered. (innerImmediateEmitterStates)
                    //           Example: 43-initial-states-valuedObject-dependencies.kixs, dep Set->init!
                    //
                    var allTransitions = rootState.eAllContents().toIterable().filter(typeof(Transition)).toList;
                    var triggeredTransitions =  allTransitions.filter (e |
                             e.trigger != null &&
                            e.trigger.triggerContainingValuedObject((assignment as Assignment).valuedObject)); 
                        
                    for (triggeredTransition : triggeredTransitions) {
                        var triggerState = (triggeredTransition as Transition).sourceState;
                        val assignerState = transition.sourceState;
                        // Do not consider self-loops
                        if (triggerState != assignerState) {
                            // The normal case
                            dependencies.handleValuedObjectDependencyHelper(assignerState, triggerState, triggeredTransition, transition, rootState);
                        }

//                        // Test case 43-initial-states-valuedObject-dependencies.kixs
//                        // Test case 44-initial-states-with-hierarchy.kixs
//                        // Test case 49-initial-states-valuedObject-dependencies2.kixs                        
//                        var List<State> immediateEmitterStates = <State> newLinkedList;
//                        // From a higher hierarchy we may also find this emitter (as immediate deep inside)
//                        if (transition.sourceState.isImmediatelyReachableFromInitialState) {
//                            val commonParentStateToStop = triggerState.parentRegion.parentState;
//                            val additionalStates = transition.sourceState.getOuterStatesUntilNonInitial(commonParentStateToStop, rootState);
//                            for (additionalState : additionalStates) {
//                                // If not already in the list
//                                if (!immediateEmitterStates.contains(additionalState)) {
////                                    immediateEmitterStates.add(additionalState);
//                                }
//                            }
//                        }
//                        for (immediateEmitterState : immediateEmitterStates) {
//                               if (immediateEmitterState.outgoingTransitions.size == 0) {
//                                   // States that do not have any outgoing transitions, are represented
//                                   // by a NULL transition for the dependency node
//                                   dependencies.handleValuedObjectDependencyHelper(immediateEmitterState, 
//                                                                             triggerState, 
//                                                                             triggeredTransition, 
//                                                                             null, rootState);
//                               } else {
//                                   // For all others take their first transition (ordered by priority, most prio first)
//                                   var orderedTransitions = immediateEmitterState.outgoingTransitions.filter(e|true).sort(e1, e2 | if (e1.priority > e2.priority) {-1} else {1});
//                                   dependencies.handleValuedObjectDependencyHelper(immediateEmitterState, 
//                                                                             triggerState, 
//                                                                             triggeredTransition, 
//                                                                             orderedTransitions.head, 
//                                                                             rootState);                               
//                               }    
//                        }
                    }                                        
                }
    }
                           
    def handleValuedObjectDependencyHelper(Dependencies dependencies, State assignerState, State triggerState, Transition triggeredTransition,
                                     Transition transition, State rootState) {
                           val emitterNode = dependencies.getStrongNode(assignerState, transition);
                           val triggerNode = dependencies.getStrongNode(triggerState, triggeredTransition);
                           
                           // The following cases must exclude each other (test 148) 
                           // test148 implies: dependency from strong dependency node of a state aborted via strong triggered transition ( && triggeredTransition.strong)
                           // only! Otherwise this could result in false dependency cycles!
                           //
                           // Special care must be taken for transitions out of simple (non hierarchical) states because these states only have a strong representation in the dependency graph.
                           // =>  && (triggeredTransition.strong || !triggerState.hierarchical)
                           
                           if (assignerState.needsWeakRepresentation && triggerState.needsStrongRepresentation && (triggeredTransition.strong || !triggerState.hierarchical)) {
                               // Do not allow iff emitter/assigner is child of trigger (test 111)
                               // Dependency from E2-weak (abort) to C-strong is WRONG
                               // because the weak abort can only happen if C's last wish is executed
                               // there should ONLY be a dependency from E2-weak to C-weak!
                               if (!assignerState.isChildOf(triggerState)) {
                                   var emitterNodeW = dependencies.getWeakNode(assignerState, transition);
                                   dependencies.getValuedObjectDependency(emitterNodeW, triggerNode);
                               }
                           }
                           else if (assignerState.needsStrongRepresentation() && (transition.strong || !assignerState.hierarchical) && triggerState.needsStrongRepresentation && (triggeredTransition.strong|| !triggerState.hierarchical)) {
                               // Do not allow iff emitter is child of trigger (test 111)
                               if (!assignerState.isChildOf(triggerState)) {
                                   dependencies.getValuedObjectDependency(emitterNode, triggerNode);
                               }
                           }
                           else if (assignerState.needsStrongRepresentation()  && (transition.strong || !assignerState.hierarchical) && triggerState.needsWeakRepresentation) {
                                   var triggerNodeW = dependencies.getWeakNode(triggerState, triggeredTransition);
                                   dependencies.getValuedObjectDependency(emitterNode, triggerNodeW);
                           }
                           else if (assignerState.needsWeakRepresentation && triggerState.needsWeakRepresentation) {
                                var emitterNodeW = dependencies.getWeakNode(assignerState, transition);
                                var triggerNodeW = dependencies.getWeakNode(triggerState, triggeredTransition);
                                dependencies.getValuedObjectDependency(emitterNodeW, triggerNodeW);
                           }
    }
    
   

    // ======================================================================================================
    // ==                      R E T R I E V E    C R E A T E D    D E P E N D E N C Y                     ==
    // ======================================================================================================
    
    // Create a new valuedObject dependency.
    def Dependency getValuedObjectDependency(Dependencies dependencies, Node emitterNode, Node triggerNode) {
        var newDependency = DependencyFactory::eINSTANCE.createValuedObjectDependency();
        dependencies.getDependency(triggerNode, emitterNode, newDependency);
    }

    // Create a new control flow dependency.
    def Dependency getControlFlowDependency(Dependencies dependencies, Node firstNode, Node secondNode, boolean isImmediate) {
        var newDependency = DependencyFactory::eINSTANCE.createControlflowDependency();
        newDependency.setImmediate(isImmediate);
        dependencies.getDependency(secondNode, firstNode, newDependency);
    }

    // Create a new hierarchy dependency.
    def Dependency getHierarchyDependency(Dependencies dependencies, Node parentNode, Node childNode) {
        var newDependency = DependencyFactory::eINSTANCE.createHierarchyDependency();
        dependencies.getDependency(parentNode, childNode, newDependency);
    }

    // Create a new transition dependency.
    def Dependency getTransitionDependency(Dependencies dependencies, Node sourceNode, Node targetNode) {
        var newDependency = DependencyFactory::eINSTANCE.createTransitionDependency();
        dependencies.getDependency(targetNode, sourceNode, newDependency);
    }
    
    
    // ======================================================================================================
    // ==                                  N O D E   C R E A T I O N                                       ==
    // ======================================================================================================

    // Create a new dependency transition only if this does not exist yet and add it to dependencies.
    def Dependency getDependency(Dependencies dependencies, Node sourceNode, Node targetNode, Dependency newDependency) {
        var dependency = dependencies.dependencies.filter(e|
               e.eClass.toString.equalsIgnoreCase(newDependency.eClass.toString())
            && e.sourceNode == sourceNode
            && e.targetNode == targetNode);
        
        if (dependency.size > 0) {
            return dependency.head;
        }
        
        // Debuggung possibility
        var dependencyType = "H";
        if (newDependency instanceof TransitionDependency) {
            dependencyType = "T";
        } else if (newDependency instanceof ControlflowDependency) {
            dependencyType = "C";
        } else if (newDependency instanceof ValuedObjectDependency) {
            dependencyType = "S";
        }
//        System::out.println(sourceNode.id + " --[" + dependencyType + "]--> " + targetNode.id);
        // not yet found newDependency => add it
        newDependency.setSourceNode(sourceNode);
        newDependency.setTargetNode(targetNode);
        dependencies.dependencies.add(newDependency);
        return newDependency;
    }
    
    
    
    // ======================================================================================================
    // ==                          D E P E N D E N C Y    C R E A T I O N                                  ==
    // ======================================================================================================

    // Return the strong representation for a state.
    // For states without any outgoing transitions this returns the dummy dependency.
    // For states with outgoing transitions it returns the one with the highest priroity.
    def Node getStrongNode(Dependencies dependencies, State state) {
        if (!state.hasOutgoingTransitions) {
            dependencies.getStrongNode(state, null);
        }
        else {
            val highestPrioTransition = state.outgoingTransitions.sort(e1, e2 | compareTransitionPriority(e1, e2)).head;
            dependencies.getStrongNode(state, highestPrioTransition);
        }
    }

    // Return the weak representation for a state.
    // In case there is a weak representation needed for the state return it, otherwise
    // return the strong one.
    // For states without any outgoing transitions this returns the dummy dependency.
    // For states with outgoing transitions it returns the one with the lowest priority.
    def Node getWeakNode(Dependencies dependencies, State state) {
        if (!state.hasOutgoingTransitions) {
            dependencies.getWeakNode(state, null);
        }
        else {
            val lowestPrioTransition = state.outgoingTransitions.sort(e1, e2 | compareTransitionPriority(e2, e1)).head;
            dependencies.getWeakNode(state, lowestPrioTransition);
        }
    }
    
    // Return the strong representation needed for all simple states with outgoing transitions
    // and all hierarchical states with strong abort transitions or without weak outgoing transitions 
    // (maybe without any outgoing transtions = fallback).
    // In case there is a strong representation needed for the state return it, otherwise
    // return the weak one. This implicitly optimizes the dependency graph (see 03.09.2012 comment).
    def Node getStrongNode(Dependencies dependencies, State state, Transition transition) {
        if (!state.needsStrongRepresentation) {
            dependencies.getWeakNode(state, transition);
        } else {
            dependencies.getNodeXXX(state, transition, NodeType::STRONG)
        }
    }
    
    // Return the weak representation needed for all hierarchical states with weak abort transitions.
    // In case there is a weak representation needed for the state return it, otherwise
    // return the strong one. This implicitly optimizes the dependency graph (see 03.09.2012 comment).
    def Node getWeakNode(Dependencies dependencies, State state, Transition transition) {
        if (!state.needsWeakRepresentation) {
            dependencies.getStrongNode(state, transition);
        } else {
            dependencies.getNodeXXX(state, transition, NodeType::WEAK);
        }
    }

    // Retrieve a dependency node according to the dependency tuple (weak or strong), if this node cannot
    // be found than create it and add it.
    // This method should not be used directly. Use getNodeWeak, getNodeStrong instead!
    def Node getNodeXXX(Dependencies dependencies, State state, Transition transition, NodeType type) {
        // transition == null case for control flow dependencies
        var node = dependencies.nodes.filter(e|(e.type == type) && (e.state == state));
        if (transition != null) {
            node = dependencies.nodes.filter(e|(e.type == type) && (e.state == state) && (e.transition == transition));
        }
        if (node.size > 0) {
            return node.head;
        }
        // not yet found newNode => add it
        var newNode = DependencyFactory::eINSTANCE.createNode();
        newNode.setState(state);
        var stateId = state.getHierarchicalName("L");
//        System::out.println(stateId);
        if (transition != null) {
            stateId = stateId + "_" + transition.priority;
        }
        if (type == NodeType::WEAK) {
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
    
    // Returns true if transition is a strong abort
    def Boolean isStrong(Transition transition) {
        transition.type == TransitionType::STRONGABORT;
    }
    
    // Returns true if transition is a weak abort
    def Boolean isWeak(Transition transition) {
        transition.type == TransitionType::WEAKABORT;
    }    
        
    // Returns true iff the state has at least one outgoing transition
    def boolean hasOutgoingTransitions(State state) {
        !state.outgoingTransitions.nullOrEmpty;
    }
    
    // Returns true iff the state has an outgoing strong abort transitions 
    def boolean hasStrongAborts(State state) {
        !state.outgoingTransitions.filter(e | e.type == TransitionType::STRONGABORT).nullOrEmpty;
    }
    
    // Returns true iff the state has an outgoing weak abort transitions 
    def boolean hasWeakAborts(State state) {
        !state.outgoingTransitions.filter(e | e.type != TransitionType::STRONGABORT).nullOrEmpty;
    }

    // Returns true iff state is the parent of the child    
    def boolean isParentOf(State state, State child) {
        return (!state.eAllContents.filter(e | e == child).nullOrEmpty);
    }

    // Returns true iff state is the child of the parent    
    def boolean isChildOf(State state, State parent) {
        return (parent.isParentOf(state));
    }
    
    // Returns true iff state needs a dependency representation at all AND
    // the state is hierarchical and has outgoing weak abort transitions.
    // Note that the root state cannot be aborted but always gets a weak representation.
    def boolean needsWeakRepresentation(State state) {
        state.isRootState || state.needsDependencyRepresentation && (state.hierarchical && state.hasWeakAborts);
    }
    
    // Returns true iff the state needs a dependency representation at all AND
    // - the state is simple (and has outgoing transitions) or 
    // - it has outgoing strong aborts or 
    // - it has no outgoing weak aborts (maybe without any outgoing transitions = fallback)
    // Note that the root state cannot be aborted but always gets a strong representation.
    def boolean needsStrongRepresentation(State state) {
        // see example 43 why hierarchical states always need a strong representation
        state.isRootState || state.needsDependencyRepresentation;// && (!state.hierarchical || state.hasStrongAborts || !state.hasWeakAborts);
    }    
    
    // Returns true if the state is hierarchical or has outgoing transitions.
    // Thus rules out states that are simple and have no further outgoing transitions.
    def boolean needsDependencyRepresentation(State state) {
        state.hierarchical || state.hasOutgoingTransitions
    }

    // Compare two transitions by their priority.
    def int compareTransitionPriority(Transition e1, Transition e2) {
        if (e1.priority < e2.priority) {-1} else {1}    
    }
    
    // Returns true iff the expression is referencing the valuedObject.
    def dispatch Boolean triggerContainingValuedObject(Expression trigger, ValuedObject valuedObject) {
        return false;
    }
    
    // Returns true iff the operator expression is referencing the valuedObject and it is NOT a
    // PRE operator type.
    def dispatch Boolean triggerContainingValuedObject(OperatorExpression trigger, ValuedObject valuedObject) {
        var returnValue = false;
        if (trigger.operator == OperatorType::PRE) {
            // Early return if subexpression are within a PRE => not considering the current tick
            return false;
        }
        for (expression : trigger.subExpressions) {
            returnValue = returnValue || expression.triggerContainingValuedObject(valuedObject);
        }
        return returnValue;
    }
    
    // Returns true iff the object reference is referencing the valuedObject. Rule out references
    // witin a PRE operator. 
    def dispatch Boolean triggerContainingValuedObject(ValuedObjectReference trigger, ValuedObject valuedObject) {
        var returnValue = trigger.valuedObject == valuedObject;
        return returnValue;
    }
    
    // For C variables it is necessary to remove special characters, this may lead
    // to name clashes in unlikely cases. 
    def String removeSpecialCharacters(String string) {
        if (string == null) {
            return null;
        }
        return string.replace("-","").replace("_","").replace(" ","").replace("+","")
               .replace("#","").replace("$","").replace("?","")
               .replace("!","").replace("%","").replace("&","")
               .replace("[","").replace("]","").replace("<","")
               .replace(">","").replace(".","").replace(",","")
               .replace(":","").replace(";","").replace("=","");
    }
    
//    // This helper method returns the hierarchical name of a state considering all hierarchical
//    // higher states. A string is formed by the traversed state IDs.
//    def String getHierarchicalName(State state, String StartSymbol) {
//        if (state.parentRegion != null) {
//            if (state.parentRegion.parentState != null) {
//                var higherHierarchyReturnedName = state.parentRegion.parentState.getHierarchicalName(StartSymbol);
//                var regionId = state.parentRegion.id.removeSpecialCharacters;
//                var stateId = state.id.removeSpecialCharacters;
//                // Region IDs can be empty, state IDs normally aren't but the code generation handles 
//                // also this case. 
//                if (stateId.nullOrEmpty) {
//                    stateId = state.hashCode + "";
//                }
//                if (regionId.nullOrEmpty) {
//                    regionId = state.parentRegion.hashCode + "";
//                }
//                if (!higherHierarchyReturnedName.nullOrEmpty) {
//                    higherHierarchyReturnedName = higherHierarchyReturnedName + "_";
//                }
//                if (state.parentRegion.parentState.regions.size > 1) {
//                    return higherHierarchyReturnedName 
//                           + regionId  + "_" +  state.id.removeSpecialCharacters;
//                }
//                else {
//                    // this is the simplified case, where there is just one region and we can
//                    // omit the region id
//                    return higherHierarchyReturnedName  
//                           + state.id.removeSpecialCharacters;
//                }
//            }
//        }
//        return StartSymbol + "_";
//    }    
    
    
    
    // ======================================================================================================
    // ==                                   T O P O L O G I C A L    S O R T                               ==
    // ======================================================================================================
    
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
    def topologicalSort(Dependencies dependencies) {
        // reset dependencies
        for (node : dependencies.nodes) {
            node.setPriority(-1);
        }
        
        val nodesWithNoEdges = dependencies.nodes.filter(e | (e.outgoingDependencies == null || e.outgoingDependencies.size == 0)
                                                     && (e.incomingDependencies == null || e.incomingDependencies.size == 0));
        // pre-visit these nodes with some max-priority,
        // because we can always LOWER a priority (to a possible weak abort representation) but not ENLARGE a prio within a tick.
        // -1 because we reserve the MAXIMAL priority for the (connected) root node, we will re-arrange the root node's prio                                                 
        var tmpPrio = dependencies.nodes.size - nodesWithNoEdges.size - 1;
        for (node : nodesWithNoEdges) {
            //node.setPriority(-1);
            tmpPrio = node.visit(tmpPrio);
        }
        //TODO: possible optimization: delete all unconnected strong-representations and in the S code generation, use
        //skip the prio statement.
        
        // calculate priorities for all connected nodes (including the root)
        // now start with priority 0                                              
        tmpPrio = 0;
        var nodesWithoutOutgoingEdges = dependencies.nodes.filter(e | (e.outgoingDependencies == null || e.outgoingDependencies.size == 0)
            && (e.incomingDependencies != null && e.incomingDependencies.size > 0));
            
        for (node : nodesWithoutOutgoingEdges) {
            tmpPrio = node.visit(tmpPrio);
        }
        
        // re-set the root node's priority to be the maximal priority (above all unconnected nodesWithNoEdges
        val rootNode = dependencies.nodes.filter(e | (e.priority == dependencies.nodes.size - nodesWithNoEdges.size)
                                                     && e.incomingDependencies != null && e.incomingDependencies.size > 0);
        if (rootNode.head != null) {
            rootNode.head.setPriority(dependencies.nodes.size);
        }
    }
    
    // Visit helper function for topological sorting the dependency nodes.
    def int visit(Node node, int priority) {
        if (node.priority == -1) {
//            System::out.println(node.id + "("+node.incomingDependencies.size +  ") ... ");
            node.setPriority(-2);
            var tmpPrio = priority;
            for (incomingDependency : node.incomingDependencies) {
                val nextNode = incomingDependency.sourceNode;
                if (nextNode != node) {
                        tmpPrio = nextNode.visit(tmpPrio);
                }
            }
//            node.setPriority(1 + (node.eContainer as Dependencies).nodes.size - (tmpPrio + 1)); // REVERSE ORDERING
//            System::out.println(node.id + "("+node.incomingDependencies.size +  ")" +  ": " + (tmpPrio + 1));
            node.setPriority((tmpPrio + 1));
            return tmpPrio + 1;
        }
        else {
           return priority;
        }
    }
    
    // ======================================================================================================
}













