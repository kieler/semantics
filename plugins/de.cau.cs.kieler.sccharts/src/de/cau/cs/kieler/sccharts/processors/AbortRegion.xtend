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
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransformationExtension
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

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
    @Inject extension SCChartsTransformationExtension
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
                        // not a single outgoing simple termination
                       !(state.outgoingTransitions.size === 1 
                        && state.outgoingTransitions.head.isTermination
                        && state.outgoingTransitions.head.delay !== DelayType.DELAYED
                        && state.outgoingTransitions.head.trigger === null)) {
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
    
    def void transformMacroState(State state) {
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
        
        // Handle delayed and conditional termination
        var Pair<State, State> terminationHandler = null
        if (state.outgoingTransitions.exists[ isTermination && (delay === DelayType.DELAYED || trigger !== null) ]) {
            // Special termination region
            val lastNonAbortRegion = state.controlflowRegions.toList.reverseView.dropWhile[abort].head
            val region = createControlflowRegion(GENERATED_PREFIX + "termination").uniqueName
            region.label = region.name
            
            val start = region.createInitialState(GENERATED_PREFIX + "wait")
            val term = region.createState(GENERATED_PREFIX + "term")
            val end = region.createFinalState(GENERATED_PREFIX + "trig")
            
            val termTrans = start.createTransitionTo(term)
            termTrans.immediate = state.controlflowRegions.filter[!abort].forall[canImmediateTerminate]
            termTrans.trigger = and(termVOs.map[reference])
            
            state.regions.add(state.regions.indexOf(lastNonAbortRegion) + 1, region)
            
            terminationHandler = new Pair(term, end)
        } else if (!state.outgoingTransitions.exists[isTermination] && state.controlflowRegions.forall[states.exists[isFinal && !incomingTransitions.empty]]) {
            // If all regions can terminat but state has no termination, add idle state to prevent preemtion of abort regions and unidentifiable termination
            val region = createControlflowRegion(GENERATED_PREFIX + "idle").uniqueName
            region.label = region.name
            region.createInitialState(GENERATED_PREFIX + "idle").label = "Prevent Normal Termination"
        }
        
        // Handle leaving state
        val State dispatcher = if (state.outgoingTransitions.size > 1) {
            state.parentRegion.createState(GENERATED_PREFIX + "dispatch").uniqueName.setTypeConnector
        }
        var strongAbortPos = 0
        // Transform transitions
        if (dispatcher === null) { // single outgoing transition
            val trans = state.outgoingTransitions.head
            if (trans.isStrongAbort || trans.isWeakAbort) {
                val r = createAbortRegion(trans, null)
                if (trans.isStrongAbort) {
                    state.regions.add(0, r)
                } else {
                    state.regions.add(r)
                }
            } else if (trans.isTermination) {
                // In this case termination is either delayed or has a trigger because otherwide it would not beed transformed at all
                if (terminationHandler !== null) {
                    if (trans.trigger !== null) {
                        val termTrans = terminationHandler.key.createTransitionTo(terminationHandler.value)
                        // react immediately if termination is immediate or delay is already present in transition to term state because no region can terminate instantaneously 
                        termTrans.immediate = trans.implicitlyImmediate || terminationHandler.key.incomingTransitions.head.delayed
                        termTrans.trigger = trans.trigger
                    } else if (trans.delay === DelayType.DELAYED) {
                        terminationHandler.value.remove
                        terminationHandler.key.setFinal
                        terminationHandler.key.incomingTransitions.head.immediate = false // always delay termination
                    } else {
                        throw new IllegalStateException()
                    }
                } else {
                    throw new IllegalStateException()
                }
            } else {
                throw new IllegalStateException("Cannot handle UNDEFINED preemtion state")
            }
            
            // turn into single outgoing termination
            trans.setTypeTermination // idle state will prevent termination without abort triggered
            trans.immediate = true
        } else { // use dispatcher
            for (trans : state.outgoingTransitions.immutableCopy) {
                if (trans.isStrongAbort || trans.isWeakAbort) {
                    val trigVO = createValuedObject(flagsDecl, GENERATED_PREFIX + "trig").uniqueName
                    trigVO.initialValue = FALSE
                    
                    val r = createAbortRegion(trans, trigVO)
                    if (trans.isStrongAbort) {
                        state.regions.add(strongAbortPos, r)
                        strongAbortPos++
                    } else {
                        state.regions.add(r)
                    }
                    
                    trans.trigger = trigVO.reference
                } else if (trans.isTermination) {
                    if (terminationHandler !== null) {
                        val trigVO = createValuedObject(flagsDecl, GENERATED_PREFIX + "termTrig").uniqueName
                        trigVO.initialValue = FALSE
                        
                        val termTrans = terminationHandler.key.createTransitionTo(terminationHandler.value)
                        // react immediately if termination is immediate or delay is already present in transition to term state because no region can terminate instantaneously 
                        termTrans.immediate = trans.implicitlyImmediate || terminationHandler.key.incomingTransitions.head.delayed
                        termTrans.trigger = trans.trigger
                        termTrans.addEffect(trigVO.createAssignment(TRUE))
                        
                        trans.trigger = trigVO.reference
                    } else { // only immediate termination without trigger or delay
                        trans.trigger = and(termVOs.map[reference])
                    }
                } else {
                    throw new IllegalStateException("Cannot handle UNDEFINED preemtion state")
                }
                
                trans.sourceState = dispatcher
                trans.setTypeWeakAbort
                trans.immediate = true
            }
        }
        
        // connect dispatch (after all transitions are processed)
        if (dispatcher !== null) {
            state.createTransitionTo(dispatcher).setTypeTermination
        }
        
        // Add flags
        if (!flagsDecl.valuedObjects.empty) {
            state.declarations += flagsDecl
        }
    }
    
    def ControlflowRegion createAbortRegion(Transition transition, ValuedObject indicator) {
        val region = createControlflowRegion(GENERATED_PREFIX + "transition").uniqueName
        region.label = region.name
        region.abort = true
        
        val start = region.createInitialState(GENERATED_PREFIX + "wait")
        val end = region.createFinalState(GENERATED_PREFIX + "trig")
        val abortTrans = start.createTransitionTo(end)
        
        abortTrans.immediate = transition.immediate
        abortTrans.trigger = transition.trigger
        if (indicator !== null) {
            abortTrans.addEffect(indicator.createAssignment(TRUE))
        }
        
        return region
    }

}
