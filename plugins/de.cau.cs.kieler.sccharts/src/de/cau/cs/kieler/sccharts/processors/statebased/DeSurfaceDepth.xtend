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
import de.cau.cs.kieler.kicool.environments.AnnotationModel
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor

import static extension de.cau.cs.kieler.sccharts.processors.statebased.StatebasedUtil.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author ssm
 * @kieler.design 2018-04-13 proposed 
 * @kieler.rating 2018-04-13 proposed yellow
 * 
 * Processor that reverses the surface / depth transformation (without considering DTO).
 *
 */
class DeSurfaceDepth extends SCChartsProcessor implements Traceable {
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.deSurfaceDepth"
    }
    
    override getName() {
        "De-Surface / Depth"
    }
    
    var AnnotationModel<SCCharts> annotationModel 
    
    override process() {
        val sccharts = getModel
        annotationModel = sccharts.createAnnotationModel
            
        sccharts.rootStates.forEach[ it.transformSuperstate ]
    }
    
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsTransitionExtensions
    
    
    protected def void transformSuperstate(State state) {
        for (cfr : state.regions.filter(ControlflowRegion)) {
            cfr.transformControlflowRegion
        }
    }
    
    protected def void transformControlflowRegion(ControlflowRegion controlflowRegion) {
        val stateList = controlflowRegion.states.toList
        val sdStates = <State> newLinkedList        
        
        for (state : stateList) {
            if (state.isSuperstate) state.transformSuperstate

            // Find all surface / depth pattern and mark them in the annotation model.
            // The pattern is identified as a state that has
            // - only one outgoing not-immediate transition
            //   - The target state of that transition also has an immediate transition back to the state without trigger
            //     or effects that is not a normal termination
            //   OR
            //   - The target state is not initial or final 
            //   - The target state's transition are all immediate and do not directly lead back to the source state.  
            if (state.outgoingTransitions.size == 1) {
                val oT = state.outgoingTransitions.head
                if (!oT.isImmediate) {
                    if (state.incomingTransitions.exists[ 
                        sourceState == oT.targetState &&
                        !isTermination && 
                        trigger === null && // We don't want to lose trigger.
                        effects.empty // We don't want to lose effects.
                    ] 
//                    || 
//                    (!oT.targetState.initial && !oT.targetState.final &&  
//                        oT.targetState.outgoingTransitions.forall[
//                            immediate && targetState != state 
//                        ])
                    ) {
                        sdStates += state 
                        annotationModel.addInfo(state, "Surface / Depth")
                    }
                }
            }
        }
        
        for (state : sdStates) {
            val oT = state.outgoingTransitions.head
            val tS = oT.targetState
            
            // If the target state is also the source state, we can simply delete the transition.
            // Otherwise, the merge is performed by the following steps:
            // - All incoming transition's target state is set to oT's target state
            //   - Resulting self loops are removed
            // - All outgoing transitions of the target state are set to delayed.  
            // - Remove the transition
            // - Preserve the initial flag if necessary
            // - Remove the state.
            if (tS == state) {
                oT.targetState = null
                oT.remove
                snapshot
            } else {
                for (iT : state.incomingTransitions.immutableCopy) {
                    if (iT.sourceState != oT.targetState) {
                        iT.targetState = oT.targetState
                    } else {
                        iT.targetState = null
                        iT.remove
                    }
                }
                
                for (t : tS.outgoingTransitions) {
                    t.setNotImmediate
                }
                
                oT.targetState = null
                oT.remove
                
                tS.initial = tS.initial || state.initial 
                tS.adaptName(state)
                tS.saveNodePriority(state)
                
                state.remove
                snapshot
            }
        }
        
    }
    
}