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
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.sccharts.text.SCTXResource

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
//    @Inject extension SCChartsTransitionExtensions
    
    public static val ID = "de.cau.cs.kieler.sccharts.debug.DebugAnnotations"
    
    /**
     * Switch to determine whether annotations (or javadoc comments) should be used.
     */
    public static val USE_ANNOTATIONS = false
    
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
//        val sourceFile = environment.compilationContext.


        val source = tracing.tracingChain.models.head
        if (!(source instanceof SCCharts)) {
            environment.warnings.add("Source model is not an SCChart!")
            return model
        }

        val sourceFile = environment.findResource(source) as SCTXResource
        val sourcePath = ProjectInfrastructure.getProjectInfrastructure(environment).getProjectRelativeFile(sourceFile.underlyingFile)
        
        
        // Retrieve mapping information for each current model element
        val mapping = tracing.getMapping(model, source)
        model => [rootStates.forEach[transform(mapping)]]
        model => [rootStates.forEach[allContainedTransitions.forEach[transform(mapping)]]]
        
        
        model => [rootStates.forEach[addStringAnnotation("ORIGINAL_SCCHART", sourcePath.toString)]]
        return model
    }
    
    def State transform(State rootState, Multimap<Object, Object> mapping) {
        rootState.allStates.forEach[annotateModel(mapping)]
        rootState
    }
    
    /**
     * Find the original transition this transition originated from and annotate it on the transition.
     * If there is none (e.g. for transitions generated from actions), generate no annotation.
     */
    def void transform (Transition transition, Multimap<Object, Object> mapping) {
        // No transition should originate from more than one model element, therefore just use the first one
        val originalTransition = mapping.get(transition)?.filter([it instanceof Transition]).head as Transition
        
        if (originalTransition !== null) {
            val nameHash = originalTransition.fullNameHash
            val transitionLabel = "Transition " + originalTransition.sourceState.name + 
                " (Priority " + originalTransition.priority + ") -> " + 
                originalTransition.targetState.name + " (" + nameHash + ")"
            // TODO use USE_ANNOTATIONS
            transition.addCommentAnnotation("OriginalTransition", transitionLabel)
        }
    }
    
    def void annotateModel(State state, Multimap<Object, Object> mapping) {
        // No state should originate from more than one model element, therefore just use the first one
        val originalState = mapping.get(state)?.filter([it instanceof State]).head as State
        
        // If tracing info is available, annotate state with original state name and hash of full name
        if (originalState !== null) {
            val nameHash = originalState.fullNameHash
            val stateNameHashString = "State " + originalState.name + " (" + nameHash + ")"
            // For tracking of executing states
            if (USE_ANNOTATIONS) {
                state.addStringAnnotation("OriginalState", originalState.name)
                state.addIntAnnotation("OriginalNameHash", nameHash)
            } else {
                state.addCommentAnnotation("DebugAnnotation", stateNameHashString)
            }
            // For tracking of active states
            state.addStringAnnotation("SourceState", stateNameHashString)
        } else {
            environment.warnings.add("Cannot find original model element for " + state.name)
        }
    }
    
    static def int getFullNameHash(Transition transition) {
        transition.getFullName.hashCode
    }
    
    // TODO move to some utility
    static def int getFullNameHash(State state) {
        state.getFullName.hashCode
    }
    
    static def String getFullName(Transition transition) {
//        var name = "Transition " + transition.sourceState.fullName + " -> " + transition.targetState.fullName + "\n"
//        name += "Delay: " + transition.delay + ", Deferred: " transition.deferred + ", Trigger: " transition.trigger
//        name += ", Effects: [" transition.effects.map[toString].join("]")
        var name = "Transition " + transition.sourceState.fullName + " -> " + transition.targetState.fullName + "\n"
        name += "Priority: " + transition.priority
        name
    }
    
    static def String getFullName(State state) {
        val parentRegion = state.parentRegion
        if (parentRegion === null) {
            "State_" + state.name
        } else {
            parentRegion.parentState.getFullName + "_Region" + parentRegion.name + "_State" + state.name
        }
    }
    
    
    
    
    // TODO use from SCChartsTransitionExtensions and find a way to inject static members
    static def getPriority(Transition transition) {
        val state = transition.eContainer
        if (state === null) return 0
        if (state instanceof State) {
            return state.outgoingTransitions.indexOf(transition) + 1
        } 
        return 0
    }
    
}
