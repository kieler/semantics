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
package de.cau.cs.kieler.sccharts.debug.codegen.processors

import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kicool.kitt.tracing.Tracing
import com.google.common.collect.Multimap
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.sccharts.State
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import org.eclipse.xtext.service.AllRulesCache.AllRulesCacheAdapter
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions

/**
 * @author stu121235
 *
 */
class DebugAnnotationsProcessor extends SCChartsProcessor implements Traceable {
    
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsScopeExtensions
    
    public static val ID = "de.cau.cs.kieler.sccharts.debug.DebugAnnotationsProcessor"
    
    override getId() {
        ID
    }
    
    override getName() {
        "Debug Annotations Processor"
    }
    
    override process() {
        model = model.transform
    }
    
    def SCCharts transform(SCCharts model) {
        
        if (!isTracingActive) {
            environment.errors.add("Cannot add debug annotations without enabled tracing.")
            return model
        }
        
        val tracing = environment.getProperty(Tracing.TRACING_DATA)
        val source = tracing.tracingChain.models.head
        
        if (!(source instanceof SCCharts)) {
            environment.errors.add("Source model is not an SCChart!")
            return model
        }
        
        val mapping = tracing.getMapping(model, source)
        
        model => [rootStates.forEach[transform(mapping)]]
        
        return model
        
    }
    
    def State transform(State rootState, Multimap<Object, Object> mapping) {
        rootState.allStates.forEach[annotateModel(mapping)]
        rootState
    }
    
    def void annotateModel(State state, Multimap<Object, Object> mapping) {
        val originalState = mapping.get(state).filter([it instanceof State]).head as State
        val name = originalState.name + "(" + originalState.hashCode + ")"
        state.addCommentAnnotation("DebugStateNameComment" + "_" + name, "State " + name)
    }
    
    
}