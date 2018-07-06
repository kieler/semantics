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

import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.SCChartsFactory

/**
 * @author ssm
 * @kieler.design 2017-06-28 proposed 
 * @kieler.rating 2017-06-28 proposed yellow 
 *
 */
class SCChartsDataflowRegionExtensions {
    
    def getDataflowRegions(State state) {
        state.regions.filter(DataflowRegion)
    }
    
    def boolean containsDataflowRegions(State state) {
        !state.regions.filter(DataflowRegion).empty
    }    

    def DataflowRegion createDataflowRegion(String id, String label) {
        SCChartsFactory::eINSTANCE.createDataflowRegion => [
            setName(id)
            setLabel(label)
        ]
    }

    def DataflowRegion createDataflowRegion(String id) {
        createDataflowRegion(id, "")
    }
    
    def DataflowRegion createDataflowRegion(State state, String id) {
        createDataflowRegion(id, "") => [ state.regions += it ]
    }
    
}