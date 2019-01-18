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
package de.cau.cs.kieler.sccharts.processors.transformators

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransformationExtension
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import java.util.List

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kexpressions.Expression

/**
 * SCCharts Termination Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Termination extends SCChartsProcessor implements Traceable {

    public static val ANNOTATION_TERMINATION = "_termination"
    public static val ANNOTATION_TERMINATION_DELAYED = "_termination_delayed"
    public static val ANNOTATION_FINALSTATE = "_finalstate"

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.termination"
    }
    
    override getName() {
        "Termination"
    }
 
    override process() {
        setModel(model.transform)
    }
    
    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }


//    override getExpandsFeatureId() {
//        return SCChartsFeature::TERMINATION_ID
//    }
//
//    override getProducesFeatureIds() {
//
//        // TODO: Check
//        return Sets.newHashSet()
//    }
//
//    override getNotHandlesFeatureIds() {
//
//        // TODO: Check
//        return Sets.newHashSet(SCChartsFeatureGroup::EXPANSION_ID)
//    }

    // -------------------------------------------------------------------------
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsComplexCreateExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsTransformationExtension
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension AnnotationsExtensions

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_T"
    
    // -------------------------------------------------------------------------
    // --                       T E R M I N A T I O N                         --
    // -------------------------------------------------------------------------
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
        // Traverse all states
        rootState.getAllStates.toList.forEach [ targetState |
            targetState.transformTermination(rootState)
        ]
        rootState
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
        val terminationTransitions = state.outgoingTransitions.filter[preemption == PreemptionType::TERMINATION]      

        if (terminationTransitions.empty) {
            return
        }
        
        val termVariables = newArrayList
        // terminationTransition.setDefaultTrace

        // Walk thru all regions that must terminate and create one termination valuedObject per
        // region. For the weak abort create a conjunction of these valuedObjects as the trigger.
        for (region : state.regions.filter(ControlflowRegion)) {
            region.setDefaultTrace
            // Setup the auxiliary termination valuedObject indicating that a normal termination
            // should be taken.
            val termVar = state.parentRegion.parentState.createVariable(GENERATED_PREFIX + "term").
                setTypeBool.uniqueName
            voStore.update(termVar, SCCHARTS_GENERATED)
            val resetFinished = state.createEntryAction
            resetFinished.effects.add(termVar.createAssignment(FALSE))

            val finalStates = region.states.filter[isFinal]
            
            // Optimization (see below)
            var termTriggerDelayed = true;

            // For all final states add immeditae transition to Final
            for (finalState : finalStates.toList) {
                
                // Optimization: Remember that we can reach at least ONE final state immediately
                // => Term-Transition in watcher region MUST be immediate, otherwise (optimized) it 
                // can be delayed to help down stream compilation
                if (finalState.immediatelyReachable) {
                    termTriggerDelayed = false;
                }
                
                //Optimization: for more than one incoming transition make a connector!
                val connectorCase = (!finalState.incomingTransitions.nullOrEmpty) && finalState.incomingTransitions.size > 1;
                
                if (!connectorCase) {
                    for (transition : finalState.incomingTransitions) {
                        transition.effects.add(termVar.createAssignment(TRUE))
                    }
                } else {
                    //Optimization-case:
                    // in the connector case create just one transition with the assignment and
                    // re-route all incoming transitions to this connector
                    val connector = finalState.parentRegion.createState(GENERATED_PREFIX + "c").setTypeConnector
                    for (transition : finalState.incomingTransitions.toList.immutableCopy) {
                        //transition.effects.add(finishedValuedObject.assign(TRUE))
                        transition.setTargetState(connector)
                    }
                    val connectorTransition = connector.createTransitionTo(finalState).setImmediate
                    connectorTransition.effects.add(termVar.createAssignment(TRUE))
                    
                }
                finalState.addTagAnnotation(ANNOTATION_FINALSTATE)
            }
            

            // Optimization: see above            
            if (termTriggerDelayed) {
                termVar.addTagAnnotation(ANNOTATION_TERMINATION_DELAYED)
            }
            termVariables += termVar
        }

        for (terminationTransition : terminationTransitions) {
            terminationTransition.setDefaultTrace
            
            terminationTransition.preemption = PreemptionType::WEAKABORT
            
            // TODO: check if optimization is correct in all cases!
            // We should NOT do this for conditional terminations!
            if (terminationTransition.trigger === null) {
                terminationTransition.setImmediate(true);
            } else {
                // A normal termination should immediately be trigger-able! (test 145) 
                // if not a delayed-conditional termination!
                terminationTransition.setImmediate(terminationTransition.implicitlyImmediate)
            }

            terminationTransition.addTerminationCheck(termVariables)
        }
    }
    
    def addTerminationCheck(Transition termination, List<ValuedObject> termVariables) {
        if (!termVariables.empty) {
            termination.annotations += AnnotationsFactory::eINSTANCE.createStringAnnotation => [
                // Mark for special treatment in abort:
                // This abort should not abort regions also marked as with this annotation
                it.name = Termination.ANNOTATION_TERMINATION
                it.values.addAll(termVariables.map[name])
            ]
            if (termVariables.size > 1) {
                val vars = <Expression>newArrayList
                vars.addAll(termVariables.map[reference])
                if (termination.trigger !== null) {
                    vars.add(0, termination.trigger)
                }
                termination.setTrigger(vars.and)
            } else {
                termination.setTrigger(termination.trigger.and(termVariables.head.reference))
            }
        }
    }
    
    def setRegionTerm(Region region, ValuedObject term) {
        region.addStringAnnotation(ANNOTATION_TERMINATION, term.name)
    }
}
