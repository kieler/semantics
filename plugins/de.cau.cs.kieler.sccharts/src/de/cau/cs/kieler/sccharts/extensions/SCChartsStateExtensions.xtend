/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import java.util.List
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * @author ssm
 * @kieler.design 2017-06-28 proposed 
 * @kieler.rating 2017-06-28 proposed yellow 
 *
 */
class SCChartsStateExtensions {
    
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsScopeExtensions
    
    def State createState() {
        SCChartsFactory::eINSTANCE.createState
    }    
    
    def State createState(String id) {
        SCChartsFactory::eINSTANCE.createState => [
            setName(id)
        ]
    }

    def State createState(ControlflowRegion region, String id) {
        createState(id) => [ 
            region.states += it
        ]
    }
    
    def State createState(ControlflowRegion region, String id, String label) {
        region.createState(id) => [ 
            it.label = label
        ]
    }
    
    def boolean isRootState(State state) {
        state.parentRegion === null && state.eContainer !== null && state.eContainer instanceof SCCharts
    }    
    
    def boolean isHierarchical(State state) {
        state.regions.size > 0
    }    
    
    def boolean hasActions(State state) {
        state.actions.size > 0
    }
    
    def boolean isSimple(State state) {
        !state.isHierarchical && !state.hasActions
    }
    
    def boolean isSuperstate(State state) {
        state.isHierarchical || state.hasActions
    }
    
    def State setInitial(State state) {
        state => [ initial = true ] 
    }

    def State setNotInitial(State state) {
        state => [ initial = false ]
    }

    def State setFinal(State state) {
        state => [ final = true ]
    }

    def State setNotFinal(State state) {
        state => [ final = false ]
    } 
    
    def State createInitialState(String id) {
        createState(id).setInitial
    }

    def State createFinalState(String id) {
        createState(id).setFinal
    }

    def State createInitialState(ControlflowRegion region, String id) {
        region.createState(id).setInitial
    }

    def State createFinalState(ControlflowRegion region, String id) {
        region.createState(id).setFinal
    }

    def State getInitialState(ControlflowRegion region) {
        region.states.filter[ isInitial ].head
    }

    def getAllFinalStates(ControlflowRegion region) {
        region.states.filter[ isFinal ]
    }

    /**
     * Returns the direct initial child states of a given state.
     * 
     * @param rootState The state
     * @return the direct child states of the given root state that are initial states 
     */
    def List<State> getInitialStates(State rootState) {
        val states = <State> newArrayList
        for(region : rootState.regions) {
            if(region instanceof ControlflowRegion) {
                val initState = region.states.findFirst[it.isInitial]
                if(initState != null) {
                    states.add(initState)
                }
            }
        }
        return states
    }
    
    /**
     * Returns the direct final child states of a given state.
     * 
     * @param rootState The state
     * @return the direct child states of the given root state that are final states 
     */
    def List<State> getFinalStates(State rootState) {
        val states = <State> newArrayList
        for(region : rootState.regions) {
            if(region instanceof ControlflowRegion) {
                val initState = region.states.findFirst[it.isFinal]
                if(initState != null) {
                    states.add(initState)
                }
            }
        }
        return states
    }
    
    // was getFinalStates
    def getSimpleFinalStates(ControlflowRegion region) {
        region.allFinalStates.filter[ outgoingTransitions.empty && !controlflowRegionsContainStates && actions.empty ]
    }

    def getSimpleFinalState(ControlflowRegion region) {
        region.getSimpleFinalStates.head
    }

    // was retrieveFinalState
    def State getOrCreateSimpleFinalState(ControlflowRegion region, String id) {
        val finalState = region.getSimpleFinalState
        if (finalState !== null) { return finalState }
        region.createState(id).setFinal
    }

    def State setTypeConnector(State state) {
        state => [ connector = true ]
    }

    def State setTypeNormal(State state) {
        state => [ connector = false ]
    }

    def boolean isReferencedState(State state) {
        state.reference !== null
    }  
    
    def boolean hasBaseStates(State state) {
        !state.baseStates.nullOrEmpty
    }
    
    def State copyState(State state) {
        val newState = state.nontracingCopy

        // Fix valued object references
        state.valuedObjects.toList.forEach [
            val newValuedObject = newState.findValuedObjectByName(it.name)
            if (newValuedObject !== null) {
                newState.replaceAllOccurrences(it, newValuedObject)
            }
        ]
        newState
    }
    
    def boolean mayTerminate(State state) {
        for (cfr : state.controlflowRegions) {
            if (cfr.allFinalStates.empty) return false
        }
        return true
    }
    
    def State getEnclosingState(EObject eObject) {
        var enclosing = eObject.eContainer
        while (!(enclosing instanceof State) && enclosing !== null) {
            enclosing = enclosing.eContainer
        }    
        return if (enclosing !== null) enclosing as State else null 
    }
    
    def State getFirstState(EObject eObject) {
        if (eObject === null) 
            return null
        else if (eObject instanceof State) 
            return eObject as State
        else if (eObject.eContainer === null) 
            return null
        else 
            return eObject.eContainer.getFirstState
    }    
         
}