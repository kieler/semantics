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
package de.cau.cs.kieler.sccharts.processors.transformators

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsUniqueNameExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor

/**
 * @author aas
 *
 */
class AlwaysTerminatedRegion extends SCChartsProcessor implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.alwaysTerminatedRegion"
    }
    
    override getName() {
        "Always Terminated Region"
    }
 
    override process() {
        setModel(model.transform)
    }

    //-------------------------------------------------------------------------
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsComplexCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsUniqueNameExtensions
    
    //-------------------------------------------------------------------------
    //--                       T R A N S F O R M A T I O N                   --
    //-------------------------------------------------------------------------
    public def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }
    
    private def State transform(State rootState) {
        for (state : rootState.allStates.toList) {
            state.terminateIfOthersTerminate(rootState)
        }
        rootState
    }
    
    private def void terminateIfOthersTerminate(State state, State targetRootState) {
        val regions = state.controlflowRegions
        if(regions.isNullOrEmpty) {
            return
        }
        // Check if all states are final
        // because the termination of this region depends then only on the termination of the concurrent regions.
        val regionsWithOnlyFinalStates = <ControlflowRegion>newArrayList
        val regionsWithNonFinalStates = <ControlflowRegion>newArrayList
        for(region : regions) {
            if(region.hasOnlyFinalStates) {
                regionsWithOnlyFinalStates.add(region)
            } else {
                regionsWithNonFinalStates.add(region)
            }
        }
        // Nothing to do. return.
        if(regionsWithOnlyFinalStates.isNullOrEmpty) {
            return
        }
        // Introduce flag that non-trivial region terminated
        val termFlags = <ValuedObject>newArrayList
        var i = 0
        for(region : regionsWithNonFinalStates) {
            // Create termination flag
            val termDecl = createBoolDeclaration
            state.declarations.add(termDecl)
            val termFlag = termDecl.createValuedObject("_TERM_"+region.name)
            termFlags.add(termFlag)
            // Set termination flat to true if a final state is entered, false if it is left
            val finalStates = region.states.filter[it.isFinal]
            for(finalState : finalStates) {
                for(incomingTransition : finalState.incomingTransitions) {
                    incomingTransition.addAssignment(termFlag.createAssignment(createBoolValue(true)))
                }
                for(outgoingTransitions : finalState.outgoingTransitions) {
                    outgoingTransitions.addAssignment(termFlag.createAssignment(createBoolValue(false)))
                }
            }
            i++
        }
        // Make termination of trivial regions depend on termination of non-trivial regions
        for(region : regionsWithOnlyFinalStates) {
            // Go to a new, central final state if the other regions terminated.
            val centralFinalState = region.createFinalState("centralFinalState")
            for(s : region.states.toList) {
                if(s !== centralFinalState) {
                    val trans = s.createImmediateTransitionTo(centralFinalState)
                    // Set condition that other regions terminated
                    for (termFlag : termFlags) {
                        trans.trigger = trans.trigger.and(termFlag.reference)
                    }
                    // This state is not final anymore
                    s.final = false    
                }
            }
        }
    }
    
    private def boolean hasOnlyFinalStates(ControlflowRegion region) {
        return !(region.states.exists[!it.isFinal])
    }
}