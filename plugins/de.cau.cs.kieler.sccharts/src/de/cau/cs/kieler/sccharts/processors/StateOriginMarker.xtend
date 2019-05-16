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
package de.cau.cs.kieler.sccharts.processors

import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.kicool.kitt.tracing.Tracing
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import javax.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import java.util.Collection
import org.eclipse.emf.ecore.EObject

/**
 * @author Wechselberg
 *
 */
class StateOriginMarker extends SCChartsProcessor implements Traceable {
    
    @Inject extension SCChartsScopeExtensions
    @Inject extension AnnotationsExtensions
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.stateOrigin"
    }
    
    override getName() {
        "State Origin"
    }
    
    override process() {
        setModel(model.transform)
    }
    
    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }
    
    def State transform(State rootState) {
        val tracingData = environment.getProperty(Tracing.TRACING_DATA)
        val firstModel = tracingData.tracingChain.models.head
        val lastModel = tracingData.tracingChain.models.last
        val mapping = tracingData.getMapping(lastModel, firstModel)
        rootState.allStates.forEach[ state |
            state.addStringAnnotation("SourceState", getState(mapping.get(state)))
        ]
        return rootState
    }

    def String getState(Collection<Object> objects) {
        var source = objects.head
        while (source instanceof EObject) {
            if (source instanceof State) {
                return source.name
            } else {
                source = source.eContainer
            }
        }
        return null
    }
}