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
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import de.cau.cs.kieler.sccharts.features.SCChartsFeature

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions

/**
 * SCCharts Termination Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Termination extends AbstractExpansionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::TERMINATION_ID
    }

    override getName() {
        return SCChartsTransformation::TERMINATION_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::TERMINATION_ID
    }

    override getProducesFeatureIds() {

        // TODO: Check
        return Sets.newHashSet()
    }

    override getNotHandlesFeatureIds() {

        // TODO: Check
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
        targetRootState.getAllStates.forEach [ targetState |
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
            terminationTransition.setDefaultTrace
            val otherTransitions = state.outgoingTransitions.filter(e|e.type != TransitionType::TERMINATION);

            terminationTransition.setType(TransitionType::WEAKABORT);
            val triggerExpression = createLogicalAndExpression

            // Setup the auxiliary terminated valuedObject indicating that a normal termination
            // has been taken in the same synchronous tick and must not be taken again.
            val rootState = state.getRootState
            val terminatedValuedObject = rootState.createValuedObject(GENERATED_PREFIX + "terminated",
            	createDeclaration => [ signal = true ]
            ).uniqueName;

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
            for (region : state.regions.filter(ControlflowRegion)) {

                // Setup the auxiliary termination valuedObject indicating that a normal termination
                // should be taken.
                val finishedValuedObject = targetRootState.getRootState.createValuedObject(GENERATED_PREFIX + "finished",
                	createDeclaration => [ signal = true ]
                ).uniqueName

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
                terminationTransition.setTrigger(triggerExpression);
            }
        } // end if normal termination present

    }

}
