/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.statebased

import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
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
 * Processor that reverses the conditional pattern from the normalization.
 *
 */
class DeConditionalize extends SCChartsProcessor implements Traceable {
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.deConditionalize"
    }
    
    override getName() {
        "De-Conditionalize"
    }
    
    var AnnotationModel<SCCharts> annotationModel 
    
    override process() {
        val sccharts = getModel
        annotationModel = sccharts.createAnnotationModel
            
        sccharts.rootStates.forEach[ it.transformSuperstate ]
    }
    
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsActionExtensions
    
    protected def void transformSuperstate(State state) {
        for (cfr : state.regions.filter(ControlflowRegion)) {
            cfr.transformControlflowRegion
        }
    }
    
    protected def void transformControlflowRegion(ControlflowRegion controlflowRegion) {
        val stateList = controlflowRegion.states.toList
        val condStates = <State> newLinkedList        
        
        for (state : stateList) {
            if (state.isSuperstate) state.transformSuperstate
            
            // Find all conditional pattern and mark them in the annotation model.
            // The pattern is identified as a state that has
            // - 2 outgoing transitions
            // - both are immediate
            // - the trigger of the first transition is not null
            // - the trigger of the second transition is null.
            // Additionally, if a final state is target of the second (else) transition, skip it, because the 
            // merger would form a complex final state.
            if (state.outgoingTransitions.size == 2) {
                val oT1 = state.outgoingTransitions.head
                val oT2 = state.outgoingTransitions.get(1)
                if (oT1.isImmediate && oT2.isImmediate) {
                    if (oT1.trigger !== null && oT2.trigger === null &&
                        !oT2.targetState.final // We don't want to get complex final states.
                    ) {
                        condStates += state 
                        annotationModel.addInfo(state, "Conditional Pattern")
                    }
                }
            }
        }
        
        for (state : condStates) {
            // oT2 is the transition without trigger (the second from the former search).
            val oT2 = state.outgoingTransitions.filter[ trigger === null ].head
            val tS = oT2.targetState
            
            // If all outgoing transitions of the target state are immediate, we can perform the merger.
            // To merge perform the following actions:
            // - add all outgoing transition that are not oT2 (the else transition) to the target state of oT2 in reverse order
            // - set their priority to one, because this immitates the order in which the previous state were checked.
            // - set all incoming transitions to the target state of oT2
            // - preserve the initial flag if necessary
            // - remove oT2
            // - remove the state.
            if (!tS.outgoingTransitions.exists[ !it.isImmediate ]) {
                for (t : state.outgoingTransitions.immutableCopy.filter[ it != oT2 ].toList.reverse) {
                    t.sourceState = oT2.targetState 
                    t.setSpecificPriority = 1
                }
                for (t : state.incomingTransitions.immutableCopy) {
                    t.targetState = oT2.targetState
                }
                
                oT2.targetState.initial = oT2.targetState.initial || state.initial
                
                oT2.sourceState = null
                oT2.remove
                state.remove
                snapshot
            } else {
                // If we cannot merge, because the outgoing transitions of the target state permit this,
                // we adjust the priority of oT2 (the else transition) to the lowest priority, because the actual 
                // state might have been the target of a previous merger. 
                oT2.setSpecificPriority = state.outgoingTransitions.size
            }
        }         
    }
    
}