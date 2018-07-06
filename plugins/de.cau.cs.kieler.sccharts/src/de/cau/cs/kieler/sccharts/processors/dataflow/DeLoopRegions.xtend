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
package de.cau.cs.kieler.sccharts.processors.dataflow

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.environments.AnnotationModel
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author ssm
 * @kieler.design 2018-05-28 proposed
 * @kieler.rating 2018-05-28 proposed yellow  
 */
class DeLoopRegions extends SCChartsProcessor {
    
    @Inject extension SCChartsActionExtensions
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.DeLoopRegions"
    }
    
    override getName() {
        "DeLoop"
    }
    
    var AnnotationModel<SCCharts> annotationModel 
    
    override process() {
        val model = getModel
        annotationModel = model.createAnnotationModel
        
        for (subModel : model.rootStates.immutableCopy) {
            subModel.processSuperState(model)
        }
    }
    
    def processSuperState(State state, SCCharts scc) {
        val cfrs = state.regions.filter(ControlflowRegion).toList
         
        for (cfr : cfrs.immutableCopy) {
            val initialState = cfr.states.filter[ initial ].head
            
            val incomingDelayed = initialState.incomingTransitions.filter[ delayed ].toList
            
            if (incomingDelayed.size > 1) {
                annotationModel.addWarning(initialState, "The initial state has more than one incoming delayed transition.")
            }              
            
            for (id : incomingDelayed) {
                id.remove
            }
            
            for (d : cfr.states.map[ outgoingTransitions ].flatten.filter[ delayed ]) {
                annotationModel.addWarning(d.eContainer, "Non-initial delay detected.")
            }
                        
            snapshot
        }
    }
    
}
