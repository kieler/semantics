/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * SCCharts Termination Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Termination {

    @Inject
    extension KExpressionsExtension

    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--                       T E R M I N A T I O N                         --
    //-------------------------------------------------------------------------
    // @requires: during actions
    // Edit: 30.11.2012: Normal Terminations are considered to be immediate
    // This means that e.g. test10 with a normal termination self loop can
    // be executed as long as the body not immediately.
    // For this reason ANOTHER valuedObject terminated is introduced not per region
    // but per normal termination, indicating a taken normal termination
    // and preventing the same to be taken again within a tick.
    // Like adding a pause in Esterel to
    // loop
    // [ p || pause ]
    // end loop
    // when p may or may not be instantaneous.
    // Edit: 08.01.2013: Normal Terminations must not be taken after a self
    // loop returns to the macro state that is left by the normal termination
    // like in test147.
    // Therefore a transformed transition must explicitly negate all triggers
    // of other outgoing transitions.
    // Transforming Normal Termination. 
    def State transform(State rootState) {
        val targetRootState = rootState.fixAllPriorities;

        // Traverse all states
        targetRootState.getAllStates.forEach[ targetState |
            targetState.transformTermination(targetRootState);
        ]
        targetRootState.fixAllTextualOrdersByPriorities;
    }

    // Traverse all states and transform outgoing normal termination transitions into weak aborts
    def void transformTermination(State state, State targetRootState) {

        // NORMAL TERMINATION : For every state with normal termination transitions transform these into
        // weak abort transitions. Create a trigger for these new transitions that contains a conjunction
        // of a new termValuedObject, one for every contained region.
        // For every region add an immediate during action to all final state emitting this termValuedObject
        // (belonging to the region).
        // Explicitly negate triggers of other outgoing transitions (see test147)
        // This is the special case where we must taken care of a normal termination 
        val terminationTransition = state.getTerminationTransitions;
        if (terminationTransition != null) {
            val otherTransitions = state.outgoingTransitions.filter(e|e.type != TransitionType::TERMINATION);

            terminationTransition.setType(TransitionType::WEAKABORT);
            val triggerExpression = createAndExpression

            // Setup the auxiliary terminated valuedObject indicating that a normal termination
            // has been taken in the same synchronous tick and must not be taken again.
            val rootState = state.getRootState
            val terminatedValuedObject = rootState.createSignal(GENERATED_PREFIX + "terminated").setTypePure.uniqueName;

            val terminatedEmission = terminatedValuedObject.emit

            // Add the prevention of re-run of normal termination within the same tick
            triggerExpression.add(not(terminatedValuedObject.reference));

            // Explicitly prevent that a normal termination is taken when another transition
            // has been taken before (e.g., a weak abort self loop like in test 147)
            for (otherTransition : otherTransitions) {
                if (otherTransition.trigger != null) {
                    triggerExpression.add(not(otherTransition.trigger.copy));
                }
            }

            // Prevent the normal termination to be taken again by emitting this helper valuedObject (test10)
            terminationTransition.addEmission(terminatedEmission);

            // Walk thru all regions that must terminate and create one termination valuedObject per
            // region. For the weak abort create a conjunction of these valuedObjects as the trigger.
            for (region : state.regions) {

                // Setup the auxiliary termination valuedObject indicating that a normal termination
                // should be taken.
                val finishedValuedObject = targetRootState.getRootState.createSignal(GENERATED_PREFIX + "finished").
                    setTypePure.uniqueName

                val finalStates = region.states.filter(e|e.isFinal == true);

                // For all final states add a during action that emits the termination valuedObject
                for (finalState : finalStates) {
                    finalState.createImmediateDuringAction.addEmission(finishedValuedObject.emit);

                    // Set the final state flag to false
                    finalState.setFinal(false);
                }

                triggerExpression.add(finishedValuedObject.reference);
            }

            // A normal termination should immediately be trigger-able! (test 145) 
            terminationTransition.setImmediate(true);

            // if there is just one valuedObject, we do not need an AND!
            if (triggerExpression != null) {
                terminationTransition.setTrigger(triggerExpression.fixForOperatorExpressionLists.trim);
            }
        } // end if normal termination present

    }

}
