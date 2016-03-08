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
package de.cau.cs.kieler.sccharts.klighd.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtension
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.TransitionStyles

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import de.cau.cs.kieler.sccharts.klighd.SCChartsDiagramProperties

/**
 * Transforms {@link Transition} into {@link KEdge} diagram elements.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class TransitionSynthesis extends SubSynthesis<Transition, KEdge> {

    @Inject
    extension KNodeExtensions

    @Inject
    extension KEdgeExtensions

    @Inject
    extension SCChartsExtension

    @Inject
    extension SCChartsSerializeHRExtension

    @Inject
    extension TransitionStyles

    override performTranformation(Transition transition) {
        val edge = transition.createEdge().associateWith(transition);

        edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
        edge.setLayoutOption(LayoutOptions::LABEL_SPACING, 3.0f);
        
        // Connect with states
        edge.source = transition.sourceState.node;
        edge.target = transition.targetState.node;

        // Basic spline
        edge.addTransitionSpline();

        // Modifiers
        if (transition.isImmediate2) {
            edge.setImmediateStyle
        }

        switch (transition.history) {
            case SHALLOW: edge.addShallowHistoryDecorator
            case DEEP: edge.addDeepHistoryDecorator
            case !transition.deferred: edge.addDefaultDecorator
        }

        if (transition.deferred) {
            edge.addDeferredDecorator(transition.history == HistoryType::DEEP ||
                transition.history == HistoryType::SHALLOW);
        }

        switch (transition.type) {
            case STRONGABORT: edge.addStrongAbortionDecorator
            case TERMINATION: edge.addNormalTerminationDecorator
        };

        // Add Label
        var String priority = null;
        var String trigger = null;
        var String effect = null;
        
        val label = new StringBuilder();
        if (transition.label.nullOrEmpty) {
            label.append(transition.serializeHR);
            
            // Remember trigger and effect(s)
            if (transition.trigger != null) {
                trigger = transition.trigger.serializeHR.toString;
            } else {
                trigger = "";
            }
    
            if (!transition.effects.empty) {
                effect = transition.effects.serializeHR.toString;
            } else {
                effect = "";
            }
        } else {
            label.append(transition.label);
        }
        
        if (transition.sourceState.outgoingTransitions.size > 1) {
            priority = String.valueOf(
                transition.sourceState.outgoingTransitions.indexOf(transition) + 1);
            
            label.insert(0, ": ");
            label.insert(0, priority);
        }
        
        if (label.length != 0) {
            val klabel = edge.addLabel(label.toString).associateWith(transition);
            
            // We remember priority, trigger, and effect parts of transition labels because the label
            // managers cannot distinguish between them without major parsing. That's because the / sign
            // is used both as a separator between trigger and effect as well as the division operator 
            if (trigger != null) {
                klabel.setLayoutOption(SCChartsDiagramProperties.TRANSITION_PRIORITY, priority);
                klabel.setLayoutOption(SCChartsDiagramProperties.TRANSITION_TRIGGER, trigger);
                klabel.setLayoutOption(SCChartsDiagramProperties.TRANSITION_EFFECT, effect);
            }
        }

        return edge;
    }

}