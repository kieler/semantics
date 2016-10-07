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
package de.cau.cs.kieler.sccharts.transformations

import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import de.cau.cs.kieler.sccharts.features.SCChartsFeature
import java.util.List
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*

/**
 * SCCharts Deferred Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Deferred extends AbstractExpansionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::DEFERRED_ID
    }

    override getName() {
        return SCChartsTransformation::DEFERRED_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::DEFERRED_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::DURING_ID, SCChartsFeature::INITIALIZATION_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCChartsFeatureGroup::EXPANSION_ID)
    }

    //-------------------------------------------------------------------------
    @Inject
    extension KExpressionsCreateExtensions

    @Inject
    extension KExpressionsComplexCreateExtensions
    
    @Inject
    extension KExpressionsDeclarationExtensions
    
    @Inject
    extension KExpressionsValuedObjectExtensions

    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--             D E F E R R E D     T R A N S I T I O N                 --
    //-------------------------------------------------------------------------
    // Add a new deferVariable to the outer state, set it initially to false and
    // add a during action in the state to reset it to FALSE.
    // For all incoming deferred transitions, reset the defer flag and add an assignment
    // setting the deferVariable to true when entering the state. 
    // Prevent any immediate internal behavior of the state and any immediate outgoing
    // transition in case deferVariable is set to TRUE, i.e., the state was entered
    // by a deferred transition.
    def State transform(State rootState) {
        var targetRootState = rootState.fixAllPriorities;

        // Traverse all states
        targetRootState.allStates.forEach [ targetTransition |
            targetTransition.transformDeferredState;
        ]
        targetRootState.fixAllTextualOrdersByPriorities;
    }

    def void transformDeferredState(State state) {
        val incomingDeferredTransitions = state.incomingTransitions.filter[deferred];
        val incomingNonDeferredTransitions = state.incomingTransitions.filter[!deferred];

        // If there are any such transitions 
        if (!incomingDeferredTransitions.nullOrEmpty) {
            if(isTracingActive){
                val List<EObject> sources = newLinkedList()
                sources.addAll(state.incomingTransitions.filter[deferred])
                sources.add(state)
                sources.setDefaultTrace
            }
            // Add a new deferVariable to the outer state, set it initially to FALSE and
            // add a during action in the state to reset it to FALSE
            val deferVariable = state.parentRegion.parentState.createValuedObject(GENERATED_PREFIX + "deferred", createBoolDeclaration).
                uniqueName
            deferVariable.setInitialValue(FALSE)
            val resetDeferSignalAction = state.createDuringAction
            resetDeferSignalAction.addEffect(deferVariable.assign(FALSE))

            // For all incoming deferred transitions, reset the defer flag and add an assignment
            // setting the deferVariable to true when entering the state 
            for (transition : incomingDeferredTransitions) {
                transition.setDeferred(false)
                transition.addEffect(deferVariable.assign(TRUE)).trace(state, transition)
            }
            // Set all others to false explicitly (just to make sure in case the superstate was strongly immediate aborted)
            for (transition : incomingNonDeferredTransitions) {
                transition.addEffect(deferVariable.assign(FALSE)).trace(state, transition)
            }

            // Prevent any immediate internal behavior of the state and any immediate outgoing
            // transition in case deferVariable is set to TRUE, i.e., the state was entered
            // by a deferred transition
            //            val allInternalImmediateActions = state.allContainedActions.filter(
            //                  e|e.immediate || e instanceof EntryAction).toList
            //            for (action : allInternalImmediateActions) {
            //                val deferTest = not(deferVariable.reference)
            //                if (action.trigger != null) {
            //                    action.setTrigger(deferTest.and(action.trigger))
            //                } else {
            //                    action.setTrigger(deferTest)
            //                 }
            //            }
            
            // Only do this for outgoing immediate transitions!
            for (transition : state.outgoingTransitions) {
                if (transition.immediate) {
                    if (transition.trigger == null) {
                        val deferTest = not(deferVariable.reference)
                        transition.setTrigger(deferTest)
                    } else {
                        val deferTest = not(deferVariable.reference)
                        transition.setTrigger(deferTest.and(transition.trigger.copy))
                    }
                }
            }
        }
    }

//       
// -- FORMER IMPLEMENTATION --
// 
// For all deferred transitions T from S1 to S2, create a new State _S
// create a new transition _T from _S to S2 and change T's target to _S.
// Remove the deferred flag from T.
//
//     def void transformDeferred(Transition transition) {
//         if (transition.deferred) {
//             // Create a new state _S
//             val _S = transition.targetState.parentRegion.createState(transition.id("_S"))
//             // Create a new transition _T
//             _S.createTransitionTo(transition.targetState)
//             // Re-target transition T
//             transition.setTargetState(_S)
//             // Remove deferred flag
//             transition.setDeferred(false)
//         }
//     }
}
