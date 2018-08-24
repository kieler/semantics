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

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions
import de.cau.cs.kieler.kicool.environments.AnnotationModel
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import static extension de.cau.cs.kieler.sccharts.processors.statebased.StatebasedUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * @author ssm
 * @kieler.design 2018-04-13 proposed 
 * @kieler.rating 2018-04-13 proposed yellow
 * 
 * Processor that merges transient state with its successors if the transitions match.
 * This reverses parts of the normalization.
 *
 */
class DeImmediateDelay extends SCChartsProcessor implements Traceable {
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.deImmediateDelay"
    }
    
    override getName() {
        "De-ImmediateDelay"
    }
    
    var AnnotationModel<SCCharts> annotationModel 
    
    override process() {
        val sccharts = getModel
        annotationModel = sccharts.createAnnotationModel
            
        sccharts.rootStates.forEach[ it.transformSuperstate ]
    }
    
    @Inject extension KExpressionsCompareExtensions
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
            
            // Find all transient immediate check state pattern and mark them in the annotation model.
            // The pattern is identified as a state that has
            // - more than one transitions
            // - all transitions are immediate
            // - at least one transition trigger is null (def transition), with also no effects
            // - all transitions that are not the def transition have a non-delayed transition variant with the same trigger
            //   at the target state of the def transition.
            if (state.outgoingTransitions.size > 1 && 
                state.outgoingTransitions.forall[ immediate ] &&
                state.outgoingTransitions.exists[ trigger === null && effects.empty ]
            ) {
                val oTDef = state.outgoingTransitions.filter[ trigger === null ].head
                val tS = oTDef.targetState
                var mergeable = true
                for (t : state.outgoingTransitions.filter[ it != oTDef ]) {
                    mergeable =  mergeable && 
                        tS.outgoingTransitions.exists[ !immediate && trigger !== null && trigger.equals2(t.trigger) ]
                }
                
                if (mergeable) {
                    mergeStates += state 
                    annotationModel.addInfo(state, "Mergeable Immediate State")
                }
            }
        }
        
        for (state : mergeStates) {
            val oTDef = state.outgoingTransitions.filter[ trigger === null ].head
            val tS = oTDef.targetState

            // Perform the following actions:
            // - Re-route all incoming transitions to the def transitions target
            // - For all outgoing transitions that are not the def transition, find the replacement at the target state
            //   and set it to immediate
            // - Afterwards remove the transition (including the def transition)
            // - Preserve the initial flag if necessary
            // - Remove the state.
            for (t : state.incomingTransitions.immutableCopy) {
                t.targetState = tS
            }            
            for (t : state.outgoingTransitions.immutableCopy) {
                if (t !== oTDef) {
                    val replT = tS.outgoingTransitions.filter[ trigger.equals2(t.trigger)].head
                    replT.setImmediate
                }
                
                t.sourceState = null
                t.remove
            }
            
            tS.initial = tS.initial || state.initial
            tS.adaptName(state)
            
            state.remove
        }
    }
    
}