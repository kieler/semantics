/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.text.sctgenerator

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.kexpressions.keffects.Assignment
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import org.eclipse.emf.ecore.EObject
import com.google.inject.Singleton
import static de.cau.cs.kieler.sccharts.text.sctgenerator.SCTGenerator.*
import de.cau.cs.kieler.core.kexpressions.VariableDeclaration

/**
 * The Model Generator class
 * Usually, it is injected and called by the SCT Generator. 
 * The actual default model creation takes place in this class.
 * 
 * @author ssm
 * @kieler.rating 2016-06-10 yellow KI-125 als
 */
@Singleton
class ModelGenerator {

    /* Injections */
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsExtension
    @Inject extension SCTGenerator

    /* Private members */
    private static val STATE_PREFIX = "S"
    private static val REGION_PREFIX = "R"
    private static val INPUT_PREFIX = "I"
    private static val OUTPUT_PREFIX = "O"
    
    /** 
     * When creating a model, the model generator retrieves a list of classes which registered
     * with the extension point. This list is stored in {@code generatorExtensions} so that is 
     * must not be retrieved every time.
     */
    private val generatorExtensions = <ISCTGeneratorExtension> newLinkedList

    /**
     * Creates an SCT model.
     * 
     * @param id sets the id and the label of the model.
     * @returns the root state of the model.
     */
    def State createModel(String id) {
        // Retrieve the list of classes which use the extension point.
        generatorExtensions.clear
        generatorExtensions += registeredExtensions
        
        // Use the SCT Generator properties to define root model properties.
        var int statesLeft = NUMBER_OF_STATES.random
        val int inputs = NUMBER_OF_INPUTS.random
        val int outputs = NUMBER_OF_INPUTS.random

        // Create a basic SCCharts, set the id, label, and input and output declarations.
        val rootState = createSCChart => [
            it.id = id
            it.label = id
            it.declarations += createVariableDeclaration(ValueType.BOOL) => [ decl | 
                decl.input = true
                for (var int i = 0; i < inputs; i++) {
                    val j = i
                    decl.valuedObjects += createValuedObject => [it.name = INPUT_PREFIX + j]
                }
                generatorExtensions.forEach[ onDeclarationCreate(decl) ]
            ]
            it.declarations += createVariableDeclaration(ValueType.BOOL) => [ decl |
                decl.output = true
                for (var int i = 0; i < outputs; i++) {
                    val j = i
                    decl.valuedObjects += createValuedObject => [it.name = OUTPUT_PREFIX + j]
                }
                generatorExtensions.forEach[ onDeclarationCreate(decl) ]
            ]
        ]

        // Create the top level region plane.
        rootState.createRegions(0, statesLeft)
        
        // Call the model creation hooks.
        generatorExtensions.forEach[ onModelCreate(rootState) ]
        
        rootState
    }

    /**
     * Creates a level of regions.
     * 
     * @param state defines the state in which the regions will be created.
     * @param hierarchy gives the level of hierarchy.
     * @param statesLeft holds the number of states that may be used subsequent regions.
     * @returns void
     */
    protected def void createRegions(State state, int hierarchy, int statesLeft) {
        // Use the SCT Generator property to define a number of regions.
        val regionCount = 1 + CHANCE_FOR_CONCURRENCY.random

        // regionStateCounter defines how many states will be enclosed by this region. 
        var regionStateCounter = statesLeft
        for (var int i = 0; i < regionCount; i++) {
            // Calculate new regionStateCount for this region. The last region gets the remaining states.
            var regionStateCount = regionStateCounter
            if (i < regionCount - 1) {
                regionStateCount = random(2, regionStateCounter / regionCount)
            }

            // Create a new region and add the states.            
            val region = createControlflowRegion(state, REGION_PREFIX + i)
            region.createStates(hierarchy + 1, regionStateCount)

            /* State post processing
             * Retrieve all states that are not the final state. 
             * Create additional transitions depending on the SCT Generator properties.
             * Final states are excluded to avoid complex final states in default core models.
             */
            val states = region.states.filter[!final].toList
            for (s : states) {
                // Use the SCT Generator property to generate a specific number of transitions.
                val int transitions = 1 + CHANCE_FOR_TRANSITION.random
                for (var int t = 1; t < transitions; t++) {
                    // The target of the transition is a randomly chosen state. 
                    s.createCoreTransition(states.get(states.size.random)) => [
                        /* Also, check if the transition should be an immediate transition.
                         * Avoid creating instantaneous loops. Therefore, self-loops are forbidden.
                         * Furthermore, if the source state and the target state already possess 
                         * immediate transition, the immediate transition will not be created. */
                        if (CHANCE_FOR_IMMEDIATE.random != 0) {
                            if ((it.eContainer.asState != it.targetState) &&
                                !((it.eContainer.asState.incomingTransitions.filter[immediate].size > 0) &&
                                    (it.targetState.outgoingTransitions.filter[immediate].size > 0))) {
                                it.immediate = true
                            }
                        }
                    ]
                }
            }
            
            // Call the region creation hooks.            
            generatorExtensions.forEach[ onRegionCreate(region) ]
        }
    }

    /**
     * Creates the states of a region.
     * 
     * @param region defines the parent region.
     * @param hierarchy gives the level of hierarchy.
     * @param statesLeft holds the number of states that should be used.
     * @returns void
     */
    protected def createStates(ControlflowRegion region, int hierarchy, int statesLeft) {
        // Create an initial state and initialize the state counter. 
        var lastState = region.createState(STATE_PREFIX + "0") => [initial = true]
        var stateCounter = 1

        // Call the state creation hooks. 
        val lastStateFinal = lastState
        generatorExtensions.forEach[ onStateCreate(lastStateFinal) ]        

        // As long as we have states left, create a new one. Reserve a state for the final state.
        while (stateCounter + 1 < statesLeft) {
            var newState = region.createState(STATE_PREFIX + stateCounter)
            stateCounter++

            // Connect the states with a delayed transition.
            lastState.createCoreTransition(newState)

            /* Check if we should create a superstate.
             * There must be at least 2 more states left to create a valid superstate. */ 
            if (SCTGenerator.CHANCE_FOR_SUPERSTATE.random(hierarchy) && stateCounter + 2 < statesLeft) {
                /* If a superstate shall be created, calculate how many states the superstate should comprise.
                 * Create a new regions for the superstate and proceed recursively. 
                 * Add the calculated number of states to the overall count for the actual region. */
                val stateCost = random(1, statesLeft - 1)
                newState.createRegions(hierarchy, stateCost)
                stateCounter += stateCost
            }

            lastState = newState
            
            // Call the state creation hooks. 
            val newStateFinal = newState
            generatorExtensions.forEach[ onStateCreate(newStateFinal) ]
        }

        var newState = region.createState(STATE_PREFIX + stateCounter) => [final = true]
        lastState.createCoreTransition(newState)
        
        // Call the state creation hooks. 
        val newStateFinal = newState
        generatorExtensions.forEach[ onStateCreate(newStateFinal) ]           
    }

    /**
     * Creates a transition trigger.
     * 
     * @param transition gives the transition in question.
     * @returns the transition.
     */
    protected def Transition createTransitionTrigger(Transition transition) {
        // Calculate the trigger depth. Each level beyond 1 creates a new operator expression.
        val triggerDepth = CHANCE_FOR_EXPRESSION.random
        if (triggerDepth == 0) return transition

        // Create a new trigger for this transition.
        val rootState = (transition.eContainer as State).getRootState
        transition.trigger = createTriggerExpression(
            rootState.declarations.filter(VariableDeclaration).filter[input].head, triggerDepth
        )
        
        // Call the expression creation hooks. 
        generatorExtensions.forEach[ onExpressionCreate(transition.trigger) ]
        transition
    }
    
    /**
     * Create an expression using a declaration depending on the trigger depth.
     * 
     * @param declaration gives a declaration that is used for valued objects.
     * @param triggerDepth defines the actual expression depth.
     * @returns a newly generated expression.
     */
    public def Expression createTriggerExpression(Declaration declaration, int triggerDepth) {
        if (triggerDepth > 1) {
            // As long as the triggerDepth is greater than 1, create new operator expressions.
            createOperatorExpression => [
                it.operator = if(Math.random < 0.5) OperatorType.LOGICAL_AND else OperatorType.LOGICAL_OR
                it.subExpressions += createTriggerExpression(declaration, triggerDepth - 1)
                it.subExpressions += createTriggerExpression(declaration, triggerDepth - 1)
            ]
        } else {
            /* Randomly choose a valued object from the declaration and create a reference
             * if the trigger depth becomes 1. */ 
            declaration.valuedObjects.get(declaration.valuedObjects.size.random).reference
        }
    }

    /**
     * Creates a specific number of effects and attaches them to a transition.
     * 
     * @param transition defines the transition in question.
     * @returns the transition.
     */
    protected def createTransitionEffects(Transition transition) {
        // Calculate the number of effects.
        var effectCount = CHANCE_FOR_EXPRESSION.random
        if(effectCount == 0) return transition

        // Create the effects.
        val rootState = (transition.eContainer as State).getRootState
        for (var int i = 0; i < effectCount; i++) {
            transition.effects += createAssignmentEffect(
                rootState.declarations.filter(VariableDeclaration).filter[output].head
            )
            
            // Call the expression creation hooks. 
            generatorExtensions.forEach[ onExpressionCreate(transition.effects.last.asAssignment.expression) ]
        }
        transition
    }

    /**
     * Creates a new assignment effect. 
     * In the default core variant, the assignment is always true. Use a hook to create a more sophisticated effect.
     * 
     * @param declaration gives a declaration that is used as valued object source.
     * @returns a newly created assignment.
     */
    public def Assignment createAssignmentEffect(Declaration declaration) {
        createAssignment(
            declaration.valuedObjects.get(declaration.valuedObjects.size.random),
            TRUE
        )
    }

    /**
     * Creates a transition from source to target state.
     * 
     * @param sourceState defines the source state.
     * @param targetstate defines the target state.
     * @returns the transition.
     */
    protected def Transition createTransition(State sourceState, State targetState) {
        SCChartsFactory::eINSTANCE.createTransition() => [
            it.targetState = targetState
            sourceState.outgoingTransitions += it
        ]
    }
    
    /**
     * Creates a transition from source to target state w.r.t. the default core models, 
     * meaning it may be contain trigger and effects. 
     * Also, if the transition originates from a superstate, it is ensured that its type 
     * it set to {@code TERMINATION}.
     * Furthermore, a newly created transition calls every transition creation hook.
     * 
     * @param sourceState defines the source state.
     * @param targetState defines the target state.
     * @returns the transition.
     */
    protected def createCoreTransition(State sourceState, State targetState) {
        createTransition(sourceState, targetState) => [ transition | 
            transition.createTransitionTrigger
            transition.createTransitionEffects
            if (transition.sourceState.isSuperstate)
                transition.type = TransitionType.TERMINATION
                
            // Call the transition creation hooks.
            generatorExtensions.forEach[ onTransitionCreate(transition) ]        
        ]
    }

    
    /* Static helper functions */

    /**
     * Checks whether or not a state is a superstate depending on its region count.
     * 
     * @param state defines the state in question.
     * @returns true if the state is a superstate.
     */
    public static def isSuperstate(State state) {
        state.regions.size > 0
    }

    /**
     * Shortcut for state casts.
     * 
     * @param eObject gives an arbitrary {@code EObject}.
     * @returns the object as state.
     */
    private static def State asState(EObject eObject) {
        eObject as State
    }
    
    /**
     * Shortcut for assignment casts.
     * 
     * @param eObject gives an arbitrary {@code EObject}.
     * @returns the object as assignment.
     */    
    private static def Assignment asAssignment(EObject obj) {
        obj as Assignment
    }

}
