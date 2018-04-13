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
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsActionExtensions
    
    
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
            
            if (state.outgoingTransitions.size == 1) {
                val oT = state.outgoingTransitions.head
                if (!oT.isImplicitlyImmediate) {
                    if (state.incomingTransitions.exists[ sourceState == oT.targetState ]) {
                        sdStates += state 
                        environment.infos.add(annotationModel.model, 
                           "Surface / Depth", 
                           annotationModel.get(state), null)
                    }
                }
            }
        }
        
        for (state : sdStates) {
            val oT = state.outgoingTransitions.head
            val tS = oT.targetState
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
            state.remove
        }
        
    }
    
}