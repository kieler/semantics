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

import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.sccharts.SCChartsFactory

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsFixExtensions
import de.cau.cs.kieler.sccharts.State
import java.util.Deque
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.ValuedObjectMapping
import java.util.List
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import de.cau.cs.kieler.core.model.Pair
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.kicool.environments.AnnotationModel
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions

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
            
            if (state.outgoingTransitions.size == 2) {
                val oT1 = state.outgoingTransitions.head
                val oT2 = state.outgoingTransitions.get(1)
                if (oT1.isImmediate && oT2.isImmediate) {
                    if (oT1.trigger !== null && oT2.trigger === null &&
                        !oT2.targetState.final // We don't want to get complex final states.
                    ) {
                        condStates += state 
                        environment.infos.add(annotationModel.model, 
                           "Conditional Pattern", 
                           annotationModel.get(state), null)
                    }
                }
            }
        }
        
        snapshot
        for (state : condStates) {
            val oT2 = state.outgoingTransitions.filter[ trigger === null ].head
            val tS = oT2.targetState
            
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
                oT2.setSpecificPriority = state.outgoingTransitions.size
            }
        }         
    }
    
}