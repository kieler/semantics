/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.sccharts.DeferredType
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.PolicyClassDeclaration
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.labels.TransitionLabelSerializer
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.ColorStore
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.TransitionStyles
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions

import static de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions.*
import static de.cau.cs.kieler.sccharts.ui.synthesis.styles.ColorStore.Color.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Transforms {@link Transition} into {@link KEdge} diagram elements.
 * 
 * @author als ssm
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class TransitionSynthesis extends SubSynthesis<Transition, KEdge> {
            
    /**
     * Immediate transition will be more likely drwn from left to right as long as there are no more than this threshold
     *  number of other edges to flip to break a cycle.
     */ 
    public static val IMMEDIATE_TRANSITION_DIRECTION_THRESHOLD = 6
    public static val MAIN_LABEL = new org.eclipse.elk.graph.properties.Property("de.cau.cs.kieler.klighd.syntheses.transition.main", false)

    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension TransitionLabelSerializer
    @Inject extension TransitionStyles
    @Inject extension ColorStore
    @Inject extension AdaptiveZoom

    override performTranformation(Transition transition) {
        val edge = transition.createEdge().associateWith(transition);
        edge.configureEdgeLOD(transition)

        if (USE_KLAY.booleanValue) {
            edge.setLayoutOption(LayeredOptions::SPACING_EDGE_LABEL, 3.0)
            if (transition.isImplicitlyImmediate) {
                edge.setLayoutOption(LayeredOptions::PRIORITY_DIRECTION, IMMEDIATE_TRANSITION_DIRECTION_THRESHOLD)
            }
        } else {
            edge.setLayoutOption(CoreOptions::SPACING_EDGE_LABEL, 2.0);
        }
        
        // Connect with states
        edge.source = transition.sourceState.node;
        edge.target = transition.targetState.node;

        // Basic spline
        edge.addTransitionSpline();

        // Modifiers
        if (transition.isImplicitlyImmediate) {
            edge.setImmediateStyle
        }
        if (transition.nondeterministic) {
            edge.setNondeterministicStyle
        }
        else if (transition.triggerProbability > 0) {
            edge.setProbabilityStyle
        }

        // User schedules
        val userSchedules = newLinkedList
        val policySchedules = newLinkedList
        if (transition.trigger !== null) {
            userSchedules += (transition.trigger.schedule + transition.effects.map[ schedule ].flatten) 
        } else  {
            userSchedules += transition.effects.map[ schedule ].flatten.toList
        }
        for (call : transition.eAllContents.filter(ReferenceCall).toList) {
            var MethodDeclaration method = null
            if (call.valuedObject.eContainer instanceof MethodDeclaration) {
                method = call.valuedObject.eContainer as MethodDeclaration
            }
            if (method === null) {
                var vor = call as ValuedObjectReference
                while (vor.subReference !== null && method === null) {
                    if (vor.subReference.valuedObject.eContainer instanceof MethodDeclaration) {
                        method = vor.subReference.valuedObject.eContainer as MethodDeclaration
                    }
                    vor = vor.subReference
                }
            }
            if (method !== null) {
                if (!method.schedule.nullOrEmpty) {
                    userSchedules += method.schedule
                }
                if (method.eContainer instanceof PolicyClassDeclaration) {
                    val classDecl = method.eContainer as PolicyClassDeclaration
                    if (classDecl.policy !== null && !classDecl.policy.name.nullOrEmpty) {
                        policySchedules += if (classDecl.policy.label.nullOrEmpty) classDecl.policy.label else classDecl.policy.name
                    }
                }
            }
        }
        if (!userSchedules.empty || !policySchedules.empty) {
            var label = userSchedules.serializeSchedule.toString
            if (!policySchedules.empty) {
                if (label.empty) {
                    label = policySchedules.join(", ")
                } else {
                    label = label + ", " + policySchedules.join(", ")
                }
            }
            edge.addTailLabel(label) => [
                associateWith(transition)
                configureLabelLOD(transition)
            ]
            edge.setUserScheduleStyle
        }
        
        switch (transition.history) {
            case SHALLOW: edge.addShallowHistoryDecorator
            case DEEP: edge.addDeepHistoryDecorator
            case transition.deferred == DeferredType::NONE: edge.addDefaultDecorator
        }

        if (transition.deferred !== DeferredType::NONE) {
            edge.addDeferredDecorator(transition.deferred == DeferredType::DEEP, 
                transition.history == HistoryType::DEEP || transition.history == HistoryType::SHALLOW);
        }

        switch (transition.preemption) {
            case STRONG: edge.addStrongAbortionDecorator
            case TERMINATION: edge.addNormalTerminationDecorator
            default: {
            }
        };
        
        if (SHOW_COMMENTS.booleanValue) {
            transition.getCommentAnnotations.forEach[
                edge.addLabel(it.values.head, COMMENT_BACKGROUND_GRADIENT_2.color) => [
                    configureLabelLOD(transition)
                ]
            ]
        }    
        
        //Configure selection style
        edge.setSelectionStyle

        // Add Label
        val label = transition.serializeLabel(SHOW_USER_LABELS.booleanValue)
        if (label.length != 0) {
            edge.addLabel(label.toString) => [
                associateWith(transition)
                configureLabelLOD(transition)
                setProperty(MAIN_LABEL, true)
            ]
        }
        
        return <KEdge> newArrayList(edge)
    }

}