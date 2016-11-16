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
package de.cau.cs.kieler.sccharts.s

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.FloatValue
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.s.extensions.SExtension
import de.cau.cs.kieler.s.s.Instruction
import de.cau.cs.kieler.s.s.SFactory
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import java.util.HashMap
import java.util.List

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.s.s.Fork
import de.cau.cs.kieler.s.s.Trans
import de.cau.cs.kieler.s.s.Prio
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.core.kexpressions.keffects.Emission
import de.cau.cs.kieler.core.kexpressions.keffects.Assignment
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.Declaration
import org.eclipse.emf.ecore.EObject

/**
 * Converts a SyncChart into an S program.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
class SCCharts2STransformation {

    // -------------------------------------------------------------------------
    // Other extensions necessary
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension KExpressionsDeclarationExtensions

    @Inject
    extension KExpressionsCreateExtensions


    @Inject
    extension SExtension
    
    @Inject
    extension SCChartsExtension 

    @Inject
    extension DependencyTransformation

    // -------------------------------------------------------------------------

    //-------------------------------------------------------------------------
    //--                M A P P I N G    F U N C T I O N S                   --
    //-------------------------------------------------------------------------

    // Dependency graph    
    DependencyGraph dependencyGraph;

    // Get the priority of the representation of an SCCharts state.
    def priority (State state) {
        state.priority(false)
    }
    // Get the priority of the Join representation of a hierarchical SCCharts state.
    def priorityJoin (State state) {
        state.priority(true)
    }
    // Get the priority of the normal and the Join representation of an SCCharts state.
    def priority (State state, boolean isJoin) {
        val dependencyNodes = dependencyGraph.dependencyNodes.filter(e | e.state == state && e.isJoin == isJoin)
        if (dependencyNodes.size != 1) {
            return -1
        }
        dependencyNodes.get(0).priority 
    }
    
    // Get the order of the representation of an SCCharts state.
    def order (State state) {
        state.order(false)
    }
    // Get the order of the Join representation of a hierarchical SCCharts state.
    def orderJoin (State state) {
        state.order(true)
    }
    // Get the order of the normal and the Join representation of an SCCharts state.
    def order (State state, boolean isJoin) {
        val dependencyNodes = dependencyGraph.dependencyNodes.filter(e | e.state == state && e.isJoin == isJoin)
        if (dependencyNodes.size != 1) {
            return -1
        }
        dependencyNodes.get(0).order
    }
    

    HashMap<State, de.cau.cs.kieler.s.s.State> STATES_SCCharts2S  = new HashMap<State, de.cau.cs.kieler.s.s.State>()
//    static HashMap<de.cau.cs.kieler.s.s.State, State> STATES_S2SCCharts  = new HashMap<de.cau.cs.kieler.s.s.State, State>()
    HashMap<State, de.cau.cs.kieler.s.s.State> STATES_JOIN_SCCharts2S  = new HashMap<State, de.cau.cs.kieler.s.s.State>()
    
    // Map from an S state to an SCCharts state.
    def map(de.cau.cs.kieler.s.s.State sState, State state) {
        STATES_SCCharts2S.put(state, sState)
//        STATES_S2SCCharts.put(sState, state)
    }
    // Map from an S join state to a (hierarchical) SCCharts state.
    def mapJoin(de.cau.cs.kieler.s.s.State sState, State state) {
        STATES_JOIN_SCCharts2S.put(state, sState)
    }
    // Clear the states mappings.
    def clearStatesMapping() {
        STATES_SCCharts2S.clear
//        STATES_S2SCCharts.clear
        STATES_JOIN_SCCharts2S.clear
    }
    // Gets an S state from an SCCharts state.
    def sState(State state) {
        STATES_SCCharts2S.get(state)
    }
    // Gets an S join state from a (hierarchical) SCCharts state.
    def sJoinState(State state) {
        STATES_JOIN_SCCharts2S.get(state)
    }
//    // Gets the SCCharts state from an S state
//    def state(de.cau.cs.kieler.s.s.State sState) {
//        STATES_S2SCCharts.get(sState)
//    }
    
    static HashMap<ValuedObject, ValuedObject> VALUEDOBJECTS_SCCharts2S  = new HashMap<ValuedObject, ValuedObject>()
//    static HashMap<ValuedObject, ValuedObject> VALUEDOBJECTS_S2SCCharts  = new HashMap<ValuedObject, ValuedObject>()

    // Map from an S valued object to an SCCharts valued object.
    def map(ValuedObject sValuedObject, ValuedObject valuedObject) {
        VALUEDOBJECTS_SCCharts2S.put(valuedObject, sValuedObject)
//        VALUEDOBJECTS_S2SCCharts.put(sValuedObject, valuedObject)
    }
    // Clear the valued object mapping.
    def clearValuedObjectMapping() {
        VALUEDOBJECTS_SCCharts2S.clear
//        VALUEDOBJECTS_S2SCCharts.clear
    }
    // Get the S valued object for an SCCharts valued object.
    def sValuedObject(ValuedObject valuedObject) {
        VALUEDOBJECTS_SCCharts2S.get(valuedObject)
    }
//    def valuedObject(ValuedObject sValuedObject) {
//        VALUEDOBJECTS_S2SCCharts.get(sValuedObject)
//    }
    
    //-------------------------------------------------------------------------
    //--              M A I N   T R A N S F O R M A T I O N                  --
    //-------------------------------------------------------------------------

    def create target : SFactory::eINSTANCE.createProgram() transformS (State rootState) {
        // Clear traces
        clearStatesMapping
        clearValuedObjectMapping
        
        // Dependency analysis
        dependencyGraph = rootState.dependencyGraph
        val dependencyStates = dependencyGraph.dependencyNodes
        
        val sortedDependencyStates = dependencyStates.orderSortedStates

        // Set highest possible priority (necessary for SC runtime)
        target.setPriority(sortedDependencyStates.get(0).priority);
        
        // Set s program name (as the root state's name)
        target.setName(rootState.id)
        
        target.declarations += rootState.copyToSDeclarations

//        SCChartsSPlugin.log("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX "); 

        // Create all states and a mapping
        for (dependencyState : sortedDependencyStates) {
//            SCChartsSPlugin.log("XXX " + dependencyState.state.hierarchicalName + " > d" + dependencyState.priority + ", o" + dependencyState.order); 
            if (!dependencyState.getIsJoin) {
                target.createSState(dependencyState.getState.getHierarchicalName("")).map(dependencyState.getState)
            }
            else {
                target.createSState(dependencyState.getState.getHierarchicalName("") + "_JOIN").mapJoin(dependencyState.getState)
            }
        }
        
        // Now traverse all states again and fill them
        for (dependencyState : sortedDependencyStates.filter[!isJoin]) {
            dependencyState.handleState 
        }
        
     }


//        
//        // add all local signals also to s program (as the root state's signals)
//        for (region : rootState.regions) {
//            val localSignals = region.eAllContents().toIterable().filter(typeof(ValuedObject)).toList();
//            for (localSignal : localSignals) {
//                val ssignal = localSignal.copy;
//                val ssignalName = (localSignal.eContainer as State).getHierarchicalName(LocalSignalSymbol) + "_" + localSignal.name;
//                ssignal.setName(ssignalName);
//                target.valuedObjects.add(ssignal);
//            }
//        }


    //-------------------------------------------------------------------------
    //--                    H A N D L E    S T A T E                         --
    //-------------------------------------------------------------------------

    def void handleState(DependencyNode dependencyState) {
        
        val state = dependencyState.getState
        val sState = state.sState
        
        if (state.hasInnerStatesOrControlflowRegions) {
            /////////////////////////
            // Handle macro states //
            /////////////////////////
            val sJoinState = state.sJoinState

            if (state.outgoingTransitions.length > 0) {
                val transition = state.outgoingTransitions.get(0)

                if (transition.type == TransitionType::TERMINATION) {
                    // if not joined yet - continue at state depth
                    val sjoin = joinElseContinueAt(transition.sourceState.sJoinState)
                    sJoinState.addInstruction(sjoin);
                    sJoinState.transitionTo(transition.targetState.sState)
                }
            } else {
                sJoinState.addInstruction(createHalt)
            }
            
            for (region : state.regions.filter(ControlflowRegion)) {
                val initialState = region.states.filter[isInitial].get(0)
                sState.forkTo(initialState.sState, initialState.priority)
            }
            //As the LAST Fork, fork to the JOIN state
            sState.forkTo(sJoinState, state.priorityJoin)
            
        } else {
            ///////////////////////////
            // Handle simples states //
            ///////////////////////////
            // Consider immediate transitions
            for (transition : state.outgoingTransitions.filter[isImmediate]) {
               state.handleTransition(transition)
            }
            // Consider delayed transitions, if any
            val delayedTransitions = state.outgoingTransitions.filter[!isImmediate]
            if (!delayedTransitions.nullOrEmpty) {
                for (transition : delayedTransitions) {
                   state.handleTransition(transition)
                }
            }
            
            // Final states imply a TERM instructions, non-final-states a IMPLICIT SELF LOOP
            if (state.isFinal) {
                sState.addInstruction(createTerm)
            } else {
                // Optimization: Do not put a halt if the instruction before is a transition,
                // or a fork or a prio.
                if (!(sState.instructions.length > 0 && 
                       (sState.instructions.get(sState.instructions.length-1) instanceof Trans || 
                       sState.instructions.get(sState.instructions.length-1) instanceof Fork || 
                       sState.instructions.get(sState.instructions.length-1) instanceof Prio))) {
                   sState.addInstruction(createPause)
                   sState.transitionTo(sState)
                }
            }
            
            
        }
        
        
    }



    //-------------------------------------------------------------------------
    //--                H A N D L E    T R A N S I T I O N                   --
    //-------------------------------------------------------------------------

    def void handleTransition(State state, Transition transition) {
        if (transition.trigger != null) {
            val sIf = createIf(transition.trigger.convertToSExpression);
            state.sState.addInstruction(sIf)
            if (!transition.effects.nullOrEmpty) {
               for (effect : transition.effects) {
                   effect.convertToSEffect(sIf.instructions);
               }
            }
            sIf.transitionTo(transition.targetState.sState)
        } else {
            if (!transition.effects.nullOrEmpty) {
                for (effect : transition.effects) {
                    effect.convertToSEffect(state.sState.instructions);
                }
            }

            // If necessary, insert a prio statement
            var sourcePriority = state.priority(state.hasInnerStatesOrControlflowRegions)
            var targetPriority = transition.targetState.priority
            if (sourcePriority != targetPriority) {
                // Change priority
                state.sState.addInstruction(createPrio(targetPriority));
            }

            // If there are delayed transitions create a pause
            if (!transition.isImmediate) {
                state.sState.addInstruction(createPause)
            }

            // Transition to target state
            state.sState.transitionTo(transition.targetState.sState)
        }
    }



    //-------------------------------------------------------------------------
    //--              C O N V E R T   E X P R E S S I O N S                  --
    //-------------------------------------------------------------------------

    // Create a new reference Expression to the corresponding sValuedObject of the expression
    def dispatch Expression convertToSExpression(ValuedObjectReference expression) {
        expression.valuedObject.sValuedObject.reference
    }

    // Apply conversion to operator expressions like and, equals, not, greater, val, pre, add, etc.
    def dispatch Expression convertToSExpression(OperatorExpression expression) {
        val newExpression = createOperatorExpression(expression.operator)
        for (subExpression : expression.subExpressions) {
            newExpression.subExpressions.add(subExpression.convertToSExpression)
        }
        return newExpression;
    }

    // Apply conversion to integer values
    def dispatch Expression convertToSExpression(IntValue expression) {
        createIntValue(expression.value)
    }

    // Apply conversion to float values
    def dispatch Expression convertToSExpression(FloatValue expression) {
        createFloatValue(expression.value)
    }

    // Apply conversion to boolean values
    def dispatch Expression convertToSExpression(BoolValue expression) {
        createBoolValue(expression.value)
    }    

    // Apply conversion to textual host code 
    def dispatch Expression convertToSExpression(TextExpression expression) {
        createTextExpression(expression.text)
    }    
    
    // Apply conversion to the default case
    def dispatch Expression convertToSExpression(Expression expression) {
        createExpression
    }



    //-------------------------------------------------------------------------
    //--                   C O N V E R T    E F F E C T S                    --
    //-------------------------------------------------------------------------

    // Convert SyncChart transition effects and add them to an instructions list.
    def dispatch void convertToSEffect(Emission effect, List<Instruction> instructions) {
        val sSignal = effect.valuedObject.sValuedObject
        val sEmit = sSignal.createEmit
        if (effect.newValue != null) {
            val sSignalValue = effect.newValue.convertToSExpression;
            sEmit.setValue(sSignalValue);
        }
        sEmit.setSignal(sSignal);
        instructions.add(sEmit);
    }
    
    // Convert SyncChart variable assignments and add them to an instructions list.
    def dispatch void convertToSEffect(Assignment effect, List<Instruction> instructions) {
        val sValuedObject = effect.valuedObject.sValuedObject
        val sAssignment = sValuedObject.createAssignment(effect.expression);
        instructions.add(sAssignment);
    }

    // Convert SyncChart text effects and add them to an instructions list.
// FIXME!
//    def dispatch void convertToSEffect(TextEffect effect, List<Instruction> instructions) {
//        val sHostCode = SFactory::eINSTANCE.createHostCodeInstruction;
//        sHostCode.setHostCode("'" + effect.text + ";'");
//        instructions.add(sHostCode);
//    }



    // ======================================================================================================
    // ======================================================================================================
    // ======================================================================================================

//        // add interface variables to s program (as the global host code)
//        target.setGlobalHostCodeInstruction(rootState.getStateVariables);
        
//        // order SyncChart states according to their dependency priority  (strong nodes)
//        // w.r.t. this order, the root state should be the one to start with (the priority assignment has to ensure that
//        // it has the maximal priority, followed by priorities of unconnected nodes, followed by other connected nodes.
//        val dependencyPrioritySortedStates = rootRegion.getAllStates.sortBy[this.];
//        
//        // create all states and their mapping
//        for (state : dependencyPrioritySortedStates) {
//            val sStateSurface = state.createSStateSurface(state.isRootState);
//            val sStateDepth   = state.createSStateDepth(state.isRootState);
//            val sStateJoin = state.createSStateJoin(state.isRootState);
//            val sStateExtraSurface = state.createSStateExtraSurface(state.isRootState);
//
//            // possibly normal termination (for parallel regions)
//            if (state.needsJoinSState) {
//                // create traces for all created join states
//                TraceComponent::createTrace(state, sStateJoin, "Join" );
//                TraceComponent::createTrace(sStateJoin, state, "JoinBack" );
//            }
//            // possibly weak immediate transition (for hierarchical states with inner actions)
//            if (state.needsExtraSurfaceSState) {
//                    // create traces for all created extra surface states (weak immediate transitions out of a macro state)
//                    TraceComponent::createTrace(state, sStateExtraSurface, "ExtraSurface" );
//                    TraceComponent::createTrace(sStateExtraSurface, state, "ExtraSurfaceBack" );
//            }
//            // create traces for all created surface and depth s states
//            TraceComponent::createTrace(state, sStateSurface, "Surface" );
//            TraceComponent::createTrace(sStateSurface, state, "SurfaceBack" );
//            TraceComponent::createTrace(state, sStateDepth, "Depth" );
//            TraceComponent::createTrace(sStateDepth, state, "DepthBack" );
//            // add new s states to program in the order surface -> [surface2] -> [join] -> depth
//            target.states.add(sStateSurface);
//            if (state.needsExtraSurfaceSState) {
//                target.states.add(sStateExtraSurface);
//            }
//            if (state.needsJoinSState) {
//                target.states.add(sStateJoin);
//            }
//            target.states.add(sStateDepth);
//        }
//        
//        // handle transitions (as states are created now and gotos can be mapped)
//        for (state : rootRegion.getAllStates) {
//            val sStateSurface = state.surfaceSState
//            val sStateDepth = state.depthSState
//            state.fillSStateSurface(sStateSurface); 
//            if (state.needsExtraSurfaceSState) {
//                val sStateExtraSurface = state.extraSurfaceSState;
//                state.fillSStateExtraSurface(sStateExtraSurface);
//            } 
//            if (state.needsJoinSState) {
//                val sStateJoin = state.joinSState
//                state.fillSStateJoin(sStateJoin);
//            } 
//            state.fillSStateDepth(sStateDepth);
//        }
//         
//        


//    // ======================================================================================================
//    // ==                   T R A V E R S E   A L L   S T A T E S   A N D   R E G I O N S                  ==
//    // ======================================================================================================
//
//    def List<State> getAllStates(Region region) {
//        var List<State> stateList = new ArrayList()
//        for (state : region.states) {
//            stateList.add(state)
//            for (regionsOfState : state.regions) {
//                stateList.addAll(regionsOfState.getAllStates)
//            }  
//        }
//        stateList
//    }
//
//    def List<State> getAllStatesOfRegion (Region region) {
//        region.states
//    }
//
//    def List<Region> getAllRegionsOfState (State state) {
//        state.regions
//    }
//    
//    // ======================================================================================================
//    // ==                             H A N D L E   S   S T A T E   S U R F A C E                          ==
//    // ======================================================================================================
//    
//    def fillSStateSurface (State state, de.cau.cs.kieler.s.s.State sState) {
//        val regardedTransitionListStrong = state.strongTransitionsOrdered.filter(e|e.isImmediate);
//        val regardedTransitionListWeak = state.weakTransitionsOrdered.filter(e|e.isImmediate);
//        
//        if (!state.rootState) {
//          // first reset possible defined local (output) signals here
//          for (signal : state.signals.filter(e | !e.isInput)) {
//              val ssignal = SFactory::eINSTANCE.createLocalSignal();
//              val sSignal = TraceComponent::getSingleTraceTarget(signal, "Signal") as de.cau.cs.kieler.core.kexpressions.Signal;
//              ssignal.setSignal(sSignal);
//              sState.instructions.add(ssignal);
//          }
//        }
//
//        // first handle all strong preemptions
//        for (transition : regardedTransitionListStrong) {
//            sState.addStrongPrio(state, transition);
//            transition.handleTransition(sState);
//        }
//        
//        // parallel regions
//        if (state.hierarchical) {
//            // fork inner regions
//            for (region : state.regions) {
//                val initialState = region.initialState;
//                val sfork = SFactory::eINSTANCE.createFork();
//                sfork.setThread(initialState.surfaceSState)
//                sfork.setPriority(initialState.getHighestDependencyStrong);
//                sState.instructions.add(sfork);
//            }
//            // if there is no immediate weak transition, we do not need an extra surface!
//            if (!state.needsExtraSurfaceSState) {
//                // fork join thread with same priority as current thread or proceed with depth
//                val sfork = SFactory::eINSTANCE.createFork();
//                if (state.needsJoinSState) {
//                    sfork.setThread(state.joinSState)
//                }
//                else {
//                    sfork.setThread(state.depthSState)
//                }
//                sfork.setPriority(state.highestDependencyStrong);
//                sState.instructions.add(sfork);
//            }
//            else {
//                // fork extra surface thread (instead of join/depth thread!) with same priority as current thread
//                val sfork = SFactory::eINSTANCE.createFork();
//                sfork.setThread(state.extraSurfaceSState);
//                sfork.setPriority(state.highestDependencyStrong);
//                sState.instructions.add(sfork);
//            }
//        }
//
//        if (!state.hierarchical) {
//            // lower priority (to allow a possible body to be executed)
//            sState.addHighestWeakPrio(state);
//        
//            //     then handle all immediate weak preemptions
//            for (transition : regardedTransitionListWeak) {
//                sState.addWeakPrio(state, transition);
//                transition.handleTransition(sState);
//            }
//
//            // continue with depth (only if not a hierarchical state!)
//            val scontinuation = state.depthSState
//            val strans = SFactory::eINSTANCE.createTrans();
//            strans.setContinuation(scontinuation);
//            sState.instructions.add(strans);
//        }
//        
//    }    
//    
//    
//    // ======================================================================================================
//    // ==                      H A N D L E   S   S T A T E   E X T R A    S U R F A C E                    ==
//    // ======================================================================================================
//    
//    def fillSStateExtraSurface (State state, de.cau.cs.kieler.s.s.State sState) {
//            // we have a hierarchical state with an outgoing immediate transition
//            // which means that it must be allowed to execute all internal immediate
//            // behavior. Because of this we need a second surface state_surface2.
//            
//            val regardedTransitionListWeak = state.weakTransitionsOrdered.filter(e|e.isImmediate);
//            
//            // Put code for weak immediate transitions inside this second extra surface
//            val extraSurfaceSState = state.extraSurfaceSState
//            
//            // lower priority (to allow a possible body to be executed)
//            extraSurfaceSState.addHighestWeakPrio(state);
//            
//            // then handle all immediate weak preemptions 
//            // (strong transitions were handled before any FORK in the surface already)
//            for (transition : regardedTransitionListWeak) {
//                    extraSurfaceSState.addWeakPrio(state, transition);
//                    transition.handleTransition(extraSurfaceSState);
//            }
//            
//            // Transition from extra surface to normal join or depth node
//            val sTrans = SFactory::eINSTANCE.createTrans
//            if (state.needsJoinSState) {
//                sTrans.setContinuation(state.joinSState);
//            }
//            else {
//                sTrans.setContinuation(state.depthSState);
//            }
//            extraSurfaceSState.instructions.add(sTrans);
//
//    }
//    
//    
//    // ======================================================================================================
//    // ==                               H A N D L E   S   S T A T E   J O I N                              ==
//    // ======================================================================================================
//    
//    def fillSStateJoin (State state, de.cau.cs.kieler.s.s.State sState) {
//        val regardedTransitionTermination = state.terminationTransition
//
//        // lower priority (to allow a possible body to be executed)
//        sState.addLowestWeakPrio(state);
//        
//        // then handle possible normal termination
//        if (regardedTransitionTermination != null) {
//            regardedTransitionTermination.handleTransition(sState);
//        }
//        else {
//            // continue with depth (only if not a hierarchical state!)
//           val scontinuation = state.depthSState
//           val strans = SFactory::eINSTANCE.createTrans();
//           strans.setContinuation(scontinuation);
//           sState.instructions.add(strans);
//        }
//            
//        
//    }    
//    
//    // ======================================================================================================
//    // ==                              H A N D L E   S   S T A T E   D E P T H                             ==
//    // ======================================================================================================
//    
//    def fillSStateDepth (State state, de.cau.cs.kieler.s.s.State sState) {
//        val regardedTransitionListStrong = state.strongTransitionsOrdered
//        val regardedTransitionListWeak = state.weakTransitionsOrdered
//
//        // is a join instruction present? if this is the case do not generate a pause here!
//        val joinInstruction = (state.getJoinSState != null && state.joinSState.instructions.filter(typeof(Join)).toList.size > 0)
//                
//        // if not a final state then process normally otherwise add halt or term 
//        if (!state.finalState) {
//
//// The following is NOT correct, see test 82. The priority must be ensured to be strong (hight)
//// to be enable to take preemptive outgoing transitions after awaking from pause            
////              // before the pause statement possibly raise priority
////              if (state.highestDependencyWeakNode != null) {
////                // optimization: do this only if the priority might be lowered (weak prio exist)
////                sState.addHighestStrongPrio(state);
////              } 
//
//            // create a pause instruction only iff no HALT or TERM instruction
//            // halt == no outgoing transition
//            // term == final state
//            if (!state.finalState && !joinInstruction) {
//                // Before pausing, ensure the correct priority for possible preemption after wake up
//                sState.addHighestStrongPrio(state);
//                // Now insert the Pause
//                sState.instructions.add(SFactory::eINSTANCE.createPause());
//            }
//
//            // first handle all strong preemptions
//            for (transition : regardedTransitionListStrong) {
//                sState.addStrongPrio(state, transition);
//                transition.handleTransition(sState);
//            }
//        
//            // lower priority (to allow a possible body to be executed)
//            sState.addHighestWeakPrio(state);
//        
//            // then handle all weak preemptions
//            for (transition : regardedTransitionListWeak) {
//                sState.addWeakPrio(state, transition);
//                transition.handleTransition(sState);
//            }
//        
//            // if this a final state wait for join otherwise continue 
//            // in the next tick to possibly handle strong and weak transitions
//            // again in the depth of this sState
//
//            var strans = SFactory::eINSTANCE.createTrans();
//            // if state is hierarchical instead of the depth continue with join (if join state is needed
//            // that is the state has an outgoing normal termination)
//            // for handling possible normal terminations
//            if (state.needsJoinSState) {
//                val sStateJoin = state.joinSState;
//                strans.setContinuation(sStateJoin);
//            }
//            else {
//                strans.setContinuation(sState);
//            }
//            sState.instructions.add(strans);
//
//        } else {
//            // add halt or term because this is a final state
//            if (state.isFinal) {
//                sState.instructions.add(SFactory::eINSTANCE.createTerm)
//            } 
//            else if (!state.isFinal) {
//                sState.instructions.add(SFactory::eINSTANCE.createHalt)
//            }
//        }
//        
//    }    
//    
//    // ======================================================================================================
//    // ==                                   H A N D L E   T R A N S I T I O N                              ==
//    // ======================================================================================================
//    
//    def void handleTransition(Transition transition, de.cau.cs.kieler.s.s.State sState) {
//            val sif = SFactory::eINSTANCE.createIf();
//            val strans = SFactory::eINSTANCE.createTrans();
//            val sabort = SFactory::eINSTANCE.createAbort();
//            
//            // handle transition trigger - convert to s-expression
//            if (transition.type == TransitionType::NORMALTERMINATION) {
//                val sjoin = SFactory::eINSTANCE.createJoin();
//                // if not joined yet - continue at state depth
//                sjoin.setContinuation(transition.sourceState.depthSState);
//                sState.instructions.add(sjoin);
//            }
//            
//            if (transition.trigger != null) {
//                sif.setExpression(transition.trigger.convertToSExpression);
//            }
//            else {
//                sif.setExpression(getTrueBooleanValue());
//            }
//            
//            // handle transition effect - convert to s-effect
//            if (!transition.effects.nullOrEmpty) {
//                for (effect : transition.effects) {
//                    effect.convertToSEffect(sif.instructions);
//                }
//            }
//            
//            // if leaving a macro state, first abort it
//            // for weak abortions we know because of the lowered priority that
//            // all internal behavior (of this tick!) has already executed and
//            // we can safely abort the state.
//            if (transition.sourceState.hierarchical) {
//                sif.instructions.add(sabort);
//            }    
//
//            // add transition to if-branch and add if-branch to sState
//            strans.setContinuation(transition.targetState.surfaceSState);
//            sif.instructions.add(strans);
//            sState.instructions.add(sif);
//    }    
//
//    // ======================================================================================================
//    // ==                          H A N D L E   S   S  T A T E   C R E A T I O N                          ==
//    // ======================================================================================================
//
//    def de.cau.cs.kieler.s.s.State createSStateJoin (State state, Boolean root) {
//        val target = SFactory::eINSTANCE.createState(); 
//        target.name = state.getHierarchicalName(LabelSymbol);
//        if (root) {
//            target.name = LabelSymbol + "_root";
//        }
//        target.name = target.name + "_join";
//        target;
//    }    
//    
//    def de.cau.cs.kieler.s.s.State createSStateSurface (State state, Boolean root) {
//        val target = SFactory::eINSTANCE.createState(); 
//        target.name = state.getHierarchicalName(LabelSymbol);
//        if (root) {
//            target.name = LabelSymbol + "_root";
//        }
//        target.name = target.name + "_surface";
//
//        target;
//    }    
//    
//    def de.cau.cs.kieler.s.s.State createSStateExtraSurface (State state, Boolean root) {
//        val target = SFactory::eINSTANCE.createState(); 
//        target.name = state.getHierarchicalName(LabelSymbol);
//        if (root) {
//            target.name = LabelSymbol + "_root";
//        }
//        target.name = target.name + "_surface2";
//
//        target;
//    }    
//
//    def de.cau.cs.kieler.s.s.State createSStateDepth (State state, Boolean root) {
//        val target = SFactory::eINSTANCE.createState(); 
//        target.name = state.getHierarchicalName(LabelSymbol);
//        if (root) {
//            target.name = LabelSymbol + "_root";
//        }
//        target.name = target.name + "_depth";
//        
//
//        target;
//    }
//
//    // ======================================================================================================
    
    
    // Copy declarations but also build the mapping
    public def List<Declaration> copyToSDeclarations(EObject source) {
        <Declaration> newArrayList => [ targetList | 
            for (declaration : source.eContents.filter(typeof(Declaration))) {
                // @als: is this trace necessary?
                targetList += createDeclaration(declaration) => [ newDec |
                    declaration.valuedObjects.forEach[ copyValuedObject(newDec) ]
                ]
            }
        ]
    }
    
    private def void copyValuedObject(ValuedObject sourceObject, Declaration targetDeclaration) {
        val newValuedObject = sourceObject.copy
        newValuedObject.map(sourceObject)
        targetDeclaration.valuedObjects += newValuedObject
    }  
    
    
}













