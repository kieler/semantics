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
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.kicool.environments.AnnotationModel
import de.cau.cs.kieler.sccharts.ControlflowRegion
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.Transition
import org.eclipse.emf.ecore.EObject

/**
 * @author ssm
 * @kieler.design 2018-04-13 proposed 
 * @kieler.rating 2018-04-13 proposed yellow
 * 
 * Processor that reverses the surface / depth transformation (without considering DTO).
 *
 */
class SuperfluousSuperstateRemover extends SCChartsProcessor implements Traceable {
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.superfluousSuperstateRemover"
    }
    
    override getName() {
        "Superfluous Superstate Remover"
    }
    
    var AnnotationModel<SCCharts> annotationModel 
    
    override process() {
        val sccharts = getModel
        annotationModel = sccharts.createAnnotationModel
            
        sccharts.rootStates.forEach[ it.transformSuperstate ]
    }
    
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    
    protected def void transformSuperstate(State state) {
        if (state.initial) {
            var canNotTerminate =
                state.outgoingTransitions.forall[ isTermination ]
                &&
                state.regions.filter(ControlflowRegion).exists[
                    states.forall[ !final ]
                ]
            
            if (canNotTerminate) {
                // This superstate is the initial state and cannot terminate. Move its contents up one level and remove the
                // dead code.
                state.removeSuperfluousSuperstate
            }
        }
        
        for (cfr : state.regions.filter(ControlflowRegion).toList) {
            cfr.transformControlflowRegion
        }
    }
    
    protected def void transformControlflowRegion(ControlflowRegion controlflowRegion) {
        val stateList = controlflowRegion.states.toList
        
        for (state : stateList.immutableCopy) {
            // state can be null if located inside of dead code and removed by a dead transition path.
            if (state !== null && state.isSuperstate) state.transformSuperstate
        }
    }
    
    protected def void removeSuperfluousSuperstate(State state) {
        val parentRegion = state.eContainer as ControlflowRegion
        val parentState = parentRegion.eContainer as State
        
        for (cfr : state.regions.immutableCopy) {
            parentState.regions += cfr
        }
        
        for (t : state.outgoingTransitions.immutableCopy) {
            t.removeTransitionPath
        }
        
        state.remove
        parentRegion.remove
    }
    
    protected def void removeTransitionPath(Transition transition) {
        val removes = <EObject> newHashSet
        val transitions = <Transition> newLinkedList => [ it.push(transition) ]
        while (!transitions.empty) {
            val t = transitions.pop
            
            if (t.targetState !== null) {
                removes += t.targetState
                for (t2 : t.targetState.outgoingTransitions) {
                    if (!removes.contains(t2)) {
                        transitions.push(t2)
                    }
                }
            }
            
            removes += t
        }
        
        removes.forEach[ it.remove ]
    }
    
}