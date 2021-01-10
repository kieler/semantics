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
package de.cau.cs.kieler.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.DelayType

/**
 * SCCharts Abort transformation with abort Regions
 * 
 * @author als
 */
class AbortRegion extends SCChartsProcessor implements Traceable {

    public static val COMPILATION_SUPPORTS_ABORT_REGIONS = 
       new Property<Boolean>("de.cau.cs.kieler.sccharts.abort.abortRegions.supported", false) // ID must be the same as in SCG plugin!!
    public static val USE_ABORT_REGIONS = 
       new Property<Boolean>("de.cau.cs.kieler.sccharts.abort.abortRegions", false)

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.abortRegions"
    }
    
    override getName() {
        "Abort Regions"
    }
    
    override process() {
        if (!getProperty(COMPILATION_SUPPORTS_ABORT_REGIONS)) {
            if (model.rootStates.exists[getAllContainedRegions.exists[abort]]) {
                environment.errors.add("Support for abort regions is not enabled in this compilation chain!")
            }
            return;
        } 
        
        if (!getProperty(USE_ABORT_REGIONS)) {
            return;
        }
        
        for (root : model.rootStates) {
            root.transform
        }
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsComplexCreateExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsDeclarationExtensions

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_A"

    def void transform(State rootState) {
        // Traverse all states
        val simpleToProcess = newArrayList
        val complexToProcess = newArrayList
        for (state : rootState.allContainedStates.toIterable) {
            if (state.controlflowRegionsContainStates) {
                if (!state.outgoingTransitions.empty &&
                        // not a single outgoing termination
                       !(state.outgoingTransitions.size === 1 
                        && state.outgoingTransitions.head.isTermination
                        && state.outgoingTransitions.head.trigger === null)) {
                    if (state.outgoingTransitions.exists[ isTermination && trigger !== null ]) {
                        environment.warnings.add("AbortRegion transformatio currently does not support conditional termination", state ,true)
                        return
                    }
                    if (state.outgoingTransitions.exists[ isTermination && delay === DelayType.DELAYED ]) {
                        environment.warnings.add("AbortRegion transformatio currently does not support delayed termination", state ,true)
                        return
                    }
                    complexToProcess += state
                }
            } else {
                if (!state.outgoingTransitions.empty && state.outgoingTransitions.exists[!isWeakAbort]) { // simple
                    simpleToProcess += state
                }
            }
        }
        
        // Handle simple ones
        for (state : simpleToProcess) {
            for (transition : state.outgoingTransitions) {
                transition.setTypeWeakAbort
            }
        }
        // Handle complex ones
        for (state : complexToProcess) {
            state.transformMacroState
        }
        
        rootState.addTagAnnotation(Abort.ANNOTATION_SKIP) // Mark for skipping in normal abort
    }
    
    def boolean transformMacroState(State state) {
        val flagsDecl = createVariableDeclaration(ValueType.BOOL)
        
        // Add normal termination indicators
        val termVOs = newArrayList
        if (state.outgoingTransitions.exists[isTermination]) {
            for (r : state.controlflowRegions.filter[!abort]) {
                val termVO = createValuedObject(flagsDecl, GENERATED_PREFIX + "term").uniqueName
                termVO.initialValue = FALSE
                termVOs += termVO
                
                for (finalState : r.states.filter[final]) {
                    for (in : finalState.incomingTransitions) {
                        in.addEffect(termVO.createAssignment(TRUE))
                    }
                }
            }
        }
        
        // Handle leaving state
        val dispatcher = state.parentRegion.createState(GENERATED_PREFIX + "dispatch").uniqueName.setTypeConnector
        var strongAbortPos = 0
        for (trans : state.outgoingTransitions.immutableCopy) {
            val trigVO = createValuedObject(flagsDecl, GENERATED_PREFIX + "trig").uniqueName
            trigVO.initialValue = FALSE
            
            switch (trans.preemption) {
                case STRONG,
                case WEAK: {
                    val r = createAbortRegion(trans, trigVO)
                    
                    if (trans.isStrongAbort) {
                        state.regions.add(strongAbortPos, r)
                        strongAbortPos++
                    } else {
                        state.regions.add(r)
                    }
                    trans.trigger = trigVO.reference
                }
                case TERMINATION: {
                    // TODO support triggers and delay!
                    trans.trigger = and(termVOs.map[reference])
                }
                case UNDEFINED: {
                    throw new IllegalStateException("Cannot handle UNDEFINED preemtion state")
                }
            }
            
            trans.sourceState = dispatcher
            trans.setTypeWeakAbort
            trans.immediate = true
        }
        
        // connect dispatch
        state.createTransitionTo(dispatcher).setTypeTermination
        
        // Add flags
        if (!flagsDecl.valuedObjects.empty) {
            state.declarations += flagsDecl
        }
    }
    
    def ControlflowRegion createAbortRegion(Transition transition, ValuedObject indicator) {
        val region = createControlflowRegion(GENERATED_PREFIX + "transition").uniqueName
        region.label = region.name
        region.abort = true
        
        val end = region.createFinalState(GENERATED_PREFIX + "trig")
        val start = region.createInitialState(GENERATED_PREFIX + "wait")
        val abortTrans = start.createTransitionTo(end)
        
        abortTrans.immediate = transition.immediate
        abortTrans.trigger = transition.trigger
        abortTrans.addEffect(indicator.createAssignment(TRUE))
        
        return region
    }

}
