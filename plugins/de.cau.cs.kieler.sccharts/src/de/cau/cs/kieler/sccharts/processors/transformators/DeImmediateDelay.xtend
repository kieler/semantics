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

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author ssm
 * @kieler.design 2018-04-13 proposed 
 * @kieler.rating 2018-04-13 proposed yellow
 * 
 * Processor that merges transient state with its successors if the transitions match.
 * This revereses parts of the normalization.
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
            
            if (state.outgoingTransitions.size > 1 && state.outgoingTransitions.forall[ immediate ]) {
                val oTDef = state.outgoingTransitions.filter[ trigger === null ].head
                val tS = oTDef.targetState
                var mergeable = true
                for (t : state.outgoingTransitions.filter[ it != oTDef ]) {
                    mergeable =  mergeable && tS.outgoingTransitions.exists[ trigger.equals2(t.trigger)]
                }
                
                if (mergeable) {
                    mergeStates += state 
                    environment.infos.add(annotationModel.model, 
                       "Mergeable Immediate State", 
                       annotationModel.get(state), null)
                }
            }
        }
        
        for (state : mergeStates) {
            val oTDef = state.outgoingTransitions.filter[ trigger === null ].head
            val tS = oTDef.targetState

            for (t : state.incomingTransitions.immutableCopy) {
                t.sourceState = tS
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
            
            state.remove
        }
    }
    
}