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
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
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
 * Processor that merges trigger and effects, reversing parts of the normalization during the process.
 *
 */
class DeTriggerEffect extends SCChartsProcessor implements Traceable {
    
    /** Merge Trigger / Effect only on same annotation. */
    public static val IProperty<String> MERGE_ON_SAME_ANNOTATION_NAME = 
       new Property<String>("de.cau.cs.kieler.sccharts.processors.deTriggerEffect.mergeOnSameAnnotationName", "")
    
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
    
    @Inject extension AnnotationsExtensions
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
            
            var merge = true
            
            val mergeOnSameAnnotationName = environment.getProperty(MERGE_ON_SAME_ANNOTATION_NAME)
            if (!mergeOnSameAnnotationName.nullOrEmpty) {
                if (!state.hasEqualAnnotationValue(mergeOnSameAnnotationName, inT.sourceState)) merge = false
            }
            
            if (merge) {
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
    
}