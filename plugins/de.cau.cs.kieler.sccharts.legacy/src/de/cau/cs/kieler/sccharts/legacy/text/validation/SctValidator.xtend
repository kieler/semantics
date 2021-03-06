/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.legacy.text.validation

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.legacy.kexpressions.CombineOperator
import de.cau.cs.kieler.sccharts.legacy.kexpressions.Declaration
import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.sccharts.legacy.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.Assignment
import de.cau.cs.kieler.sccharts.legacy.sccharts.Binding
import de.cau.cs.kieler.sccharts.legacy.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.legacy.sccharts.Region
import de.cau.cs.kieler.sccharts.legacy.sccharts.Scope
import de.cau.cs.kieler.sccharts.legacy.sccharts.StateType
import de.cau.cs.kieler.sccharts.legacy.sccharts.Transition
import de.cau.cs.kieler.sccharts.legacy.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.legacy.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.legacy.sccharts.impl.SCChartsPackageImpl
import de.cau.cs.kieler.sccharts.legacy.text.services.SctGrammarAccess
import java.util.Map
import java.util.Set
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.validation.Check

/**
 * @author ssm, cmot
 *
 */
class SctValidator extends SctJavaValidator {
    
    @Inject extension SCChartsExtension = sCChartExtension;
    @Inject var SctGrammarAccess grammar
    @Inject extension KExpressionsValuedObjectExtensions

    static val String ASSIGNMENT_TO_CONST = "You cannot assign a value to a const object.";
    static val String CANNOT_BIND_ARRAYCELL_TO_ARRAY = "You cannot bind a single array cell to an array."
    static val String CANNOT_BIND_LITERAL_TO_OUTPUT = "You cannot bind a literal to an output object."
    static val String DUPLICATE_VARIABLE = "The variable is declared multiple times in this scope."
    static val String NON_IMMEDIATE_CONNECTOR = "Outgoing transitions of connector states should be marked as immediate."
    static val String NO_DEFAULT_TRANSITION = "Connector states should have an outgoing transition without trigger."
    static val String NO_OUTGOING_TRANSITION = "Connector states must have an outgoing transition."
    static val String NON_REACHABLE_TRANSITION = "The transition is not reachable."
    static val String IMMEDIATE_LOOP = "There is an immediate loop. The model is not SASC."
    
    public static val String LEGACY = "You are using a deprecated textual version of SCCharts!\nThis language version ('.sct') is no longer supported by the KIELER tool.\nPlease convert the file into the new '.sctx' format by performing the 'Covert into SCTx' action in the file's context menu."

    /**
     * Deprecated info.
     */    
    @Check
    public def void checkNoImmediateLoops(de.cau.cs.kieler.sccharts.legacy.sccharts.State root) {
        if (root.eContainer === null) {
            val node = NodeModelUtils.findActualNodeFor(root)

            if (node !== null) {
                for (n : node.asTreeIterable) {
                    val ge = n.grammarElement
                    if (ge instanceof Keyword && ge == grammar.SCChartAccess.scchartKeyword_1) {
                        messageAcceptor.acceptWarning(
                            LEGACY,
                            root,
                            n.offset,
                            n.length,
                            LEGACY
                        )
                        return
                    }
                }
            }
        }
    }

    /**
     * Check that there are no immediate loops between states in a region.
     * 
     * @param region The region 
     */
    // Normal validation occurs when the xtext build is triggered. 
    @Check(NORMAL)
    public def void checkNoImmediateLoops(ControlflowRegion region) {
        // Perform depth first search on states,
        // where edges are the immediate transitions to find potentially immediate loops.
        val states = region.states
        // Map to remember which states have been visited already
        val Map<de.cau.cs.kieler.sccharts.legacy.sccharts.State, Integer> visited = newHashMap
        for(state : states) {
            val hasLoop = findImmediateLoop(state, visited)
            if(hasLoop) {
                // Loop detected, so add warning marker on all involved states
                val Set<de.cau.cs.kieler.sccharts.legacy.sccharts.State> statesWithLoop = newHashSet
                for(entry : visited.entrySet) {
                    if(entry.value == 1) {
                        statesWithLoop.add(entry.key)
                    }
                }
                val message = IMMEDIATE_LOOP + "\nInvolved states: " + statesWithLoop.map[it.id]
                for(s : statesWithLoop) {
                    // Highlight immediate transitions that lead to states, which are part of the loop.
                    // This is more helpful than highlighting the complete state.
                    for(t : s.outgoingTransitions) {
                        if(t.isImmediate2 && statesWithLoop.contains(t.targetState)) {
                            warning(message, t, null)
                        }
                    }
                }
                return;
            }
        }
    }
    
    /**
     * Helper method to find immediate loops.
     * 
     * @param state The state that is checked for loops
     * @param visited Data structure with the information whether states have been visited before.
     * @return true if a loop was detected. In this case the involved states will have a visited value of 1 in the map.
     */
    private def boolean findImmediateLoop(de.cau.cs.kieler.sccharts.legacy.sccharts.State state, Map<de.cau.cs.kieler.sccharts.legacy.sccharts.State, Integer> visited) {
        val visitedCode = visited.getOrDefault(state, 0)
        if(visitedCode == 2) {
            // Finished before without cycle
            return false    
        } else if(visitedCode == 1) {
            // Found cycle
            return true
        }
        // Now visited
        visited.put(state, 1)
        // Find loops in outgoing immediate transitions.
        for(t : state.outgoingTransitions) {
            if(t.isImmediate2) {
                val target = t.targetState
                if(findImmediateLoop(target, visited)) {
                    return true
                }
            }
        }
        // Now finished without cycle
        visited.put(state, 2)
        return false
    }

    /**
     * Check that there are no transitions that are not reachable, i.e.,
     * no transitions after a transition without guard.
     * 
     * @param state The state 
     */
    @Check
    public def void checkTransitionsAreReachable(de.cau.cs.kieler.sccharts.legacy.sccharts.State state) {
        var boolean delayedTransitionWithoutTrigger = false
        var boolean immediateTransitionWithoutTrigger = false
        for(trans : state.outgoingTransitions) {
            if(trans.isImmediate2) { 
                // An immediate transition may follow after a delayed transition without trigger, and still be reachable.
                if(immediateTransitionWithoutTrigger) {
                    warning(NON_REACHABLE_TRANSITION, trans, null)
                }
                if(!immediateTransitionWithoutTrigger && trans.trigger === null) {
                    immediateTransitionWithoutTrigger = true
                }
            } else {
                // An delayed transition after a delayed transition without trigger is not reachable.
                // Neither is a delayed transition after an immediate transition without trigger.
                if(delayedTransitionWithoutTrigger || immediateTransitionWithoutTrigger) {
                    warning(NON_REACHABLE_TRANSITION, trans, null)
                }
                if(!delayedTransitionWithoutTrigger && trans.trigger === null) {
                    delayedTransitionWithoutTrigger = true
                }
            }
        }
    }

    /**
     * Check that connector states have only immediate transitions and have a default transition.
     * 
     * @param state The state 
     */
    @Check
    public def void checkConnectorTransitions(de.cau.cs.kieler.sccharts.legacy.sccharts.State state) {
        if(state.type == StateType.CONNECTOR) {
            var Transition lastTransition
            var boolean transitionWithoutTrigger = false
            for(trans : state.outgoingTransitions) {
                if(!trans.isImmediate) {
                    warning(NON_IMMEDIATE_CONNECTOR, trans, null)
                }
                if(trans.trigger === null) {
                    transitionWithoutTrigger = true
                }
                lastTransition = trans
            }
            if(!transitionWithoutTrigger) {
                warning(NO_DEFAULT_TRANSITION, lastTransition, null)
            }
            if(lastTransition === null) {
                error(NO_OUTGOING_TRANSITION, state, null)
            }
        }
    }

    /**
     * Check that names of variables are unique within a scope.
     * 
     * @param scope The scope 
     */
    @Check
    public def void checkDuplicateVariable(Scope scope) {
        val Set<String> variableNames = newHashSet()
        for(decl : scope.declarations) { 
            for(valuedObject : decl.valuedObjects) {
                val name = valuedObject.name
                if(variableNames.contains(name)) {
                    warning(DUPLICATE_VARIABLE, valuedObject, null)
                } else {
                    variableNames.add(name)
                }
            }
        }
    }

    /**
     * Check if valued signal has a combine functions
     *
     * @param valuedObject the valuedObject
     */
    @Check
    public def void checkCombineFunction(ValuedObject valuedObject) {
        // Check if actually a valued signal
        if(valuedObject.isSignal && !valuedObject.isPureSignal) {
            // Check if there is a combine operator
            if(valuedObject.combineOperator === null) {
                warning(NOCOMBINE, valuedObject, null)
            }
        }
    } 


    /**
     * Check if max or min is used which is currently not supported
     *
     * @param valuedObject the valuedObject
     */
    @Check
    public def void checkMinMaxUsedCombinationFunction(ValuedObject valuedObject) {
        // Check if actually a valued signal
        if(valuedObject.isSignal && !valuedObject.isPureSignal) {
            // Check if there is a combine operator
            if(valuedObject.combineOperator !== null) {
                if (valuedObject.combineOperator.equals(CombineOperator.MIN) || valuedObject.combineOperator.equals(CombineOperator.MAX))
                warning(MINMAX_COMBINE, valuedObject, null)
            }
        }
    } 
    
    /**
     * Check if there is exactly ONE initial state per region.
     *
     * @param region the region
     */
    @Check
    public def void checkInitialState(ControlflowRegion region) {
        // Do not consider the root region == SCChart
        if (region.getParentState() !== null) {
            // check if parent state has declared any REAL region not only a
            // dummy region for entry/during/exit actions or suspends
            val parentState = region.getParentState
            var int foundInitial = 0;
            if ((parentState.getLocalActions().size() > 0) && (parentState.getRegions().size() == 1)
                    && parentState.getRegions().filter(typeof(ControlflowRegion)).head.getStates().size() == 0
                    && ( parentState.getRegions().head.getId() === null
                        || parentState.getRegions().head.id.equals(""))) {
                foundInitial = 1;
            }
            for (de.cau.cs.kieler.sccharts.legacy.sccharts.State state : region.getStates()) {
                if (state.isInitial()) {
                    foundInitial = foundInitial + 1;
                }
            }
            if (foundInitial == 0) {
                error(REGION_NO_INITIAL_STATE, region, null, -1);
            } else if (foundInitial > 1) {
                error(REGION_TWO_MANY_INITIAL_STATES, region, null, -1);
            }
        }
    }
    
    /**
     * A state with a termination transition should have final states in all its
     * inner regions. 
     * A simple state with a termination transition must have inner behaviour or no termination transition at all.
     * 
     * @param state the state
     */
    @Check
    public def void checkFinalStates(de.cau.cs.kieler.sccharts.legacy.sccharts.State state) {
        // Check if state has termination transition
        val foundTermination = !state.outgoingTransitions.filter[ type == TransitionType.TERMINATION ].empty
        if (foundTermination) {
            // Assert inner behaviour
            val regions = state.regions.filter(ControlflowRegion)
            if(regions.isEmpty && state.referencedScope === null) {
                error(NO_REGION, state, null, -1);
            }

            // Now test for every region
            if (state.localActions.nullOrEmpty) {
                for (region : regions) {
                    val foundFinal = !region.states.filter[ isFinal ].empty
                    if (!foundFinal) {
                        warning(REGION_NO_FINAL_STATE, region, null, -1);
                    }
                }
            }
        }
    }
    
    /**
     * Checks if the given state has any strong abort transitions with lower priority than non-strong-abort transitions-
     */
    @Check
    public def void checkLowPriorityStrongAbort(de.cau.cs.kieler.sccharts.legacy.sccharts.State state) {
        var onlyStrongAbortsBefore = true;
        // Checking priority by order
        for (transition : state.outgoingTransitions) {
            if (onlyStrongAbortsBefore && transition.type != TransitionType.STRONGABORT) {
                onlyStrongAbortsBefore = false;
            } else if (!onlyStrongAbortsBefore && transition.type == TransitionType.STRONGABORT) {
                error(STRONG_ABORT_WITH_LOW_PRIORITY, transition, null, -1);
            }
        }
    } 

    /**
     * Checks if the given state has abort transitions without trigger and adds a warning.
     * In most cases an abort without trigger is meant to be a termination transition.
     */
    @Check
    public def void checkAbortHasTrigger(de.cau.cs.kieler.sccharts.legacy.sccharts.State state) {
        if(state.isHierarchical) {
            for (transition : state.outgoingTransitions) {
                if ((transition.type == TransitionType.STRONGABORT || transition.type == TransitionType.WEAKABORT)
                    && transition.trigger === null) {
                    warning(ABORT_WITHOUT_TRIGGER, transition, null, -1);
                }
            }
        }
    } 
    
    /**
     * Checks if the given valued signal has a combination function.
     * This check can be removed if there is a transformation
     * that handles valued signals without combination function (see KISEMA-1071).   
     */
    // TODO: (KISEMA-1071) Remove this check when there is a transformation that handles valued signals without combination function.
    @Check
    public def void checkValuedSignalHasCombinationFunction(ValuedObject valuedObject) {
        // Check if actually a valued signal
        if(valuedObject.isSignal && !valuedObject.isPureSignal) {
            // Check if there is a combine operator
            if(valuedObject.combineOperator === null || valuedObject.combineOperator.equals(CombineOperator.NONE)) {
                warning(VALUED_SIGNAL_NEED_COMBINE, valuedObject, null)
            }
        }
    } 
    
    /**
     * Checks that static variables are initialized.
     * If it is not initialized the static modifier is useless from a modeling perspective.   
     */
    @Check
    public def void checkStaticVariableIsInitialized(ValuedObject valuedObject) {
        if(valuedObject.isStatic && valuedObject.initialValue === null) {
            warning(STATIC_VARIABLE_WITHOUT_INITIALIZATION, valuedObject, null)
        }
    } 
    
    /**
     * Checks binding for reference states.
     */
    @Check
    public def void checkReferenceBinding(de.cau.cs.kieler.sccharts.legacy.sccharts.State state) {
    	if(state.referencedState) {
    		val variables = newHashSet()
    		var scope = state as Scope
    		// Collect all accessible variables
    		while (scope !== null) {
	    		for ( delc : scope.declarations) {
	    			for (vo : delc.valuedObjects) {
	    				variables.add(vo.name)
	    			}
	    		}
    			scope = scope.eContainer as Scope
    		}
    		// Added binding to accessable variables
    		for (bind : state.bindings) {
    			variables.add(bind.formal.name)
    		}
    		for ( delc : state.referencedScope.declarations.filter[input || output]) {
    			for (vo : delc.valuedObjects) {
    				if (!variables.contains(vo.name)) {
    					error(MISSING_BINDING_FOR+vo.name, state, (state.eClass.EPackage as SCChartsPackageImpl).scope_ReferencedScope, -1);
    				}
    			}
    		}
    	}
    }
    
    
    /**
     * Checks scope of valued objects of transition triggers are correct.
     */
    @Check
    public def void checkScopeOfOutgoingTransitionVarRefs(ValuedObject testValuedObject) {
        val stateOrRegion = testValuedObject.eContainer.eContainer
        var de.cau.cs.kieler.sccharts.legacy.sccharts.State state
        if (stateOrRegion instanceof de.cau.cs.kieler.sccharts.legacy.sccharts.State) {
            state = (stateOrRegion as de.cau.cs.kieler.sccharts.legacy.sccharts.State)
        } else {
            val region = (stateOrRegion as Region)
            state = region.parentState
        }
        
        for (transition : state.outgoingTransitions) {
            val valuedObjectRefs = transition.eAllContents.filter(typeof(ValuedObjectReference))
            if (valuedObjectRefs.filter[valuedObject == testValuedObject].size > 0) {
                error(VALUEDOBJECT_TRANSITION_SCOPE_WRONG, testValuedObject, null, -1);
            }
        }
    }
    
    /**
     *
     * @param state the state
     */
    @Check
    def void checkAssignmentToConst(Assignment assignment) {
        if (assignment.getValuedObject() !== null) {
            val declaration =  assignment.getValuedObject.eContainer as Declaration
            if (declaration.isConst()) {
                error(ASSIGNMENT_TO_CONST, assignment, null, -1);
            }
        }
    }    
    
    @Check
    def void checkArrayCellToArrayBinding(Binding binding) {
        if (binding.indices.size > 0) {
            if (binding.formal.cardinalities.size > 0) {
                error(CANNOT_BIND_ARRAYCELL_TO_ARRAY, binding, null, -1)
            }
        }
    }
    
    @Check
    def void checkLiteralToOutputBinding(Binding binding) {
        if (binding.value !== null) {
            if (binding.formal.declaration.output) {
                error(CANNOT_BIND_LITERAL_TO_OUTPUT, binding, null, -1);
            }
        }
    }
}
			