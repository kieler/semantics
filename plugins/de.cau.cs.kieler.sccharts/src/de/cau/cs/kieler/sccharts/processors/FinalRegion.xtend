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

import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.core.properties.Property

/**
 * SCCharts Final Region Transformation.
 * 
 * @author ssm
 * @kieler.design 2018-01-31 proposed 
 * @kieler.rating 2018-01-31 proposed yellow
 */
class FinalRegion extends SCChartsProcessor implements Traceable {
    
    @Inject extension SCChartsScopeExtensions
    
    /** Downstream compilation supports final regions. */
    public static val COMPILATION_SUPPORTS_FINAL_REGIONS = 
       new Property<Boolean>("de.cau.cs.kieler.sccharts.finalRegion.supported", false)
       
    /** Activate the final regions transformation. */
    public static val FINAL_REGIONS_ENABLED = 
       new Property<Boolean>("de.cau.cs.kieler.sccharts.finalRegion.enabled", false)    
           
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.finalRegion"
    }
    
    override getName() {
        "Final Region"
    }
    
    override process() {
        if (getProperty(COMPILATION_SUPPORTS_FINAL_REGIONS)) return;
        
        for (rootState : getModel.rootStates) {
            rootState.transformFinalRegion
        }
    }
    
    def transformFinalRegion(State rootState) {
        for (finalRegion : rootState.getAllContainedControlflowRegions.toIterable.filter[ final ].toList) {
            for (state : finalRegion.states) {
                state.final = true
            }
            finalRegion.final = false
        }
    }
    
}