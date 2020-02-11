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
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions

/**
 * SCCharts Region Actions Transformation.
 * 
 * @author als
 * @kieler.design 2018-04-05 proposed 
 * @kieler.rating 2018-04-05 proposed yellow
 */
class RegionActionsAndDeclarations extends SCChartsProcessor implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.regionactions"
    }

    override getName() {
        "Region Actions"
    }

    override process() {
        setModel(model.transform)
    }

    // -------------------------------------------------------------------------
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension ComplexFinalState
    @Inject extension AnnotationsExtensions
    
    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"
   
    def SCCharts transform(SCCharts sccharts) {
        sccharts => [rootStates.forEach[transform]]
    }

    def void transform(State rootState) {
        for (region : rootState.allContainedControlflowRegions.filter[!actions.empty || !declarations.empty].toList) {
            if (region.actions.empty) {
                val regionId = GENERATED_PREFIX + "region" + region.parentState.regions.indexOf(region) + GENERATED_PREFIX + region.name
                
                for (valuedObject : region.declarations.map[valuedObjects].flatten.filter[ !hasAnnotation("uniqueName") ]) {
                    valuedObject.setName(regionId + GENERATED_PREFIX +
                        valuedObject.name)
                    voStore.update(valuedObject)
                }
                
                region.parentState.declarations.addAll(region.declarations)
                
            } else {
                val newState = createInitialState(region.name)
                newState.label = ""
                val newRegion = newState.createControlflowRegion(region.name)
                newRegion.label = region.label
                region.label = ""
                
                // move content     
                newRegion.states.addAll(region.states)
                newState.actions.addAll(region.actions)
                newState.declarations.addAll(region.declarations)
                
                // Add new State
                region.states += newState
                
                // Fix termination
                if (newRegion.states.exists[final]) {
                    for (s : newRegion.states.filter[isComplexFinalState]) {
                        environment.errors.add("Cannot handle complex final states.", s, true)
                    }
                    val newFinalState = region.createFinalState("_Done")
                    newState.createTransitionTo(newFinalState).setTypeTermination
                }
            }
        }
    }

}
