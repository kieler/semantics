/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.transformators

import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.kicool.environments.AnnotationModel
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * @author ssm
 * @kieler.design 2018-04-13 proposed 
 * @kieler.rating 2018-04-13 proposed yellow
 * 
 * Processor that merges trigger and effects, reversing parts of the normalization during the process.
 *
 */
class DeTriggerEffect extends SCChartsProcessor implements Traceable {
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.deTriggerEffect"
    }
    
    override getName() {
        "De-Trigger / Effect"
    }
    
    var AnnotationModel<SCCharts> annotationModel 
    
    override process() {
        val sccharts = getModel
        annotationModel = sccharts.createAnnotationModel
            
        sccharts.rootStates.forEach[ it.transformSuperstate ]
    }
    
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    
    protected def void transformSuperstate(State state) {
        for (cfr : state.regions.filter(ControlflowRegion)) {
            cfr.transformControlflowRegion
        }
    }
    
    protected def void transformControlflowRegion(ControlflowRegion controlflowRegion) {
        val stateList = controlflowRegion.states.toList
        val mergeStates = <State> newLinkedList        
        
        for (state : stateList) {
            if (state.isSuperstate) state.transformSuperstate
            
            // Find all trigger / effect pattern and mark them in the annotation model.
            // The pattern is identified as a state that has
            // - 1 incoming transition
            // - 1 outgoing transition
            // - all outgoing transitions are immediate
            // - is not a superstate
            // - and is not the initial state (because the state will be merged with its predecessor).
            if (state.incomingTransitions.size == 1 && state.outgoingTransitions.size == 1 && 
                state.outgoingTransitions.forall[ 
                    immediate &&
                    trigger === null // We don't want to lose triggers.
                ] && 
                !state.isSuperstate &&
                !state.initial // We don't want to (re-)move the initial state.
            ) {
                mergeStates += state 
                annotationModel.addInfo(state, "Mergeable Trigger / Effect")
            }
        }
        
        for (state : mergeStates) {
            val inT = state.incomingTransitions.head
            val outT = state.outgoingTransitions.head
            
            // Perform the following actions to merge trigger and effects:
            // - Add all effects from the outgoing transition to the incoming transition.
            // - Re-route the target state from the incoming transition to the target state of the outgoing transitions
            // - Remove the outgoing transition
            // - Remove the state.
            for (e : outT.effects.immutableCopy) {
                inT.effects.add(e)
            }
            
            inT.targetState = outT.targetState
            
            outT.sourceState = null
            outT.targetState = null
            outT.remove
            state.remove
            
            snapshot
        }
    }
    
}