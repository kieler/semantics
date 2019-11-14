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
package de.cau.cs.kieler.sccharts.processors.statebased

import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kicool.kitt.tracing.Tracing
import com.google.common.collect.Multimap
import de.cau.cs.kieler.sccharts.State
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions

/**
 * This processor annotates every state in the current model 
 * with the name of the original model element it was created from.
 * If tracing is unavailable in the current compilation system, a warning is generated.
 * 
 * @author stu121235
 */
class DebugAnnotations extends SCChartsProcessor implements Traceable {
    
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsScopeExtensions
    
    public static val ID = "de.cau.cs.kieler.sccharts.debug.DebugAnnotations"
    
    override getId() {
        ID
    }
    
    override getName() {
        "Debug Annotations"
    }
    
    override process() {
        model = model.transform
    }
    
    def SCCharts transform(SCCharts model) {
        if (!isTracingActive) {
            environment.warnings.add("Cannot add debug annotations without enabled tracing.")
            return model
        }
        
        val tracing = environment.getProperty(Tracing.TRACING_DATA)
        val source = tracing.tracingChain.models.head
        if (!(source instanceof SCCharts)) {
            environment.warnings.add("Source model is not an SCChart!")
            return model
        }
        
        // Retrieve mapping information for each current model element
        val mapping = tracing.getMapping(model, source)
        model => [rootStates.forEach[transform(mapping)]]
        return model
    }
    
    def State transform(State rootState, Multimap<Object, Object> mapping) {
        rootState.allStates.forEach[annotateModel(mapping)]
        rootState
    }
    
    def void annotateModel(State state, Multimap<Object, Object> mapping) {
        // No state should originate from more than one model element, therefore just use the first one
        val originalState = mapping.get(state).filter([it instanceof State]).head as State
        
        // If tracing info is available, annotate state with original state name
        if (originalState !== null) {
            val name = originalState.name + "(" + originalState.getFullNameHash + ")"
            println("State " + state.name + " comes from " + name)
            state.addCommentAnnotation("DebugStateNameComment" + "_" + name, "State " + name)
        } else {
            environment.warnings.add("Cannot find original model element for " + state.name)
        }
        
        
    }
    
    // TODO move to some utility
    static def int getFullNameHash(State state) {
        state.getFullName.hashCode
    }
    
    static def String getFullName(State state) {
        val parentRegion = state.parentRegion
        if (parentRegion === null) {
            state.name
        } else {
            parentRegion.parentState.getFullName + "_" + parentRegion.name + "_" + state.name
        }
    }
}
