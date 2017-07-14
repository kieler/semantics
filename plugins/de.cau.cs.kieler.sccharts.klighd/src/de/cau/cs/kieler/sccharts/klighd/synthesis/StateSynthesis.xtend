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
import de.cau.cs.kieler.kitt.klighd.tracing.TracingVisualizationProperties
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.StateStyles
import org.eclipse.elk.alg.layered.properties.LayerConstraint
import org.eclipse.elk.alg.layered.properties.LayeredOptions
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.CoreOptions

import static de.cau.cs.kieler.sccharts.klighd.synthesis.GeneralSynthesisOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import java.util.List
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions

/**
 * Transforms {@link State} into {@link KNode} diagram elements.
 * 
 * @author als ssm
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class StateSynthesis extends SubSynthesis<State, KNode> {

    @Inject extension KNodeExtensionsReplacement
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension TransitionSynthesis
    @Inject extension ControlflowRegionSynthesis
    @Inject extension DataflowRegionSynthesis
    @Inject extension StateStyles
    @Inject extension CommentSynthesis

    override List<KNode> performTranformation(State state) {
        val node = state.createNode().associateWith(state);

        // Set KIdentifier for use with incremental update
        if (!state.id.nullOrEmpty) {
            node.data.add(KGraphFactory::eINSTANCE.createKIdentifier => [it.id = state.id])
        }
        
        node.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.box");
        node.setLayoutOption(CoreOptions::EXPAND_NODES, true);
        node.setLayoutOption(CoreOptions::PADDING, new ElkPadding(0));
        node.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 1.0);

        //pre-evaluate type
        val isConnector = state.isConnector

        // Basic state style
        switch state {
            case isConnector:
                node.addConnectorFigure
            case state.isMacroState:
                node.addMacroFigure
            default:
                node.addDefaultFigure
        }

        // Styles from modifiers
        if (state.isReferencedState) {
            node.setReferencedStyle
        }
        if (state.isInitial) {
            node.setInitialStyle
            if (USE_KLAY.booleanValue) {
                node.setLayoutOption(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::FIRST);
            }
        }
        if (state.isFinal) {
            node.setFinalStyle
        }
        if (state.isViolation) {
            val isHaltState = state.outgoingTransitions.size == 0 
                || !state.outgoingTransitions.exists[ targetState != state ]
            node.setViolationStyle(isHaltState)
        }

        // Shadow
        if (!isConnector) {
            node.setShadowStyle
        }

        // Add content
        if (!isConnector) {
            // Add label
            if (!state.label.nullOrEmpty) {
                switch state {
                    case state.isReferencedState:
                        node.addMacroStateLabel(
                            state.serializeHR + " @ " + ((state.reference.scope as State).serializeHR ?: "UnresolvedReference") +
                            state.reference.parameters.serializeHRParameters).associateWith(state)
                    case state.isMacroState:
                        node.addMacroStateLabel(state.serializeHR.toString).associateWith(state)
                    default:
                        node.addSimpleStateLabel(state.serializeHR.toString).associateWith(state)
                }
            } else {
                node.addEmptyStateLabel
            }

            // Add declarations
            for (declaration : state.declarations) {
                node.addDeclarationLabel(declaration.serializeHighlighted(true)) => [
                    setProperty(TracingVisualizationProperties.TRACING_NODE, true);
                    associateWith(declaration);
                    eAllContents.filter(KRendering).forEach[associateWith(declaration)];
                ]
            }           

            // Add actions
            for (action : state.actions) {
                node.addActionLabel(action.serializeHighlighted(true)) => [
                    setProperty(TracingVisualizationProperties.TRACING_NODE, true);
                    associateWith(action);
                    eAllContents.filter(KRendering).forEach[associateWith(action)];
                ]
            }

            // Add child area for regions
            if (state.controlflowRegionsContainStates || state.containsDataflowRegions || state.isReferencedState) {
                node.addRegionsArea;
            }
        }

        // Transform all outgoing transitions
        // Also set KIdentifier for use with incremental update
        val groupedTransitions = state.outgoingTransitions.groupBy[it.targetState]
        for (transition : state.outgoingTransitions) {
            transition.transform => [ edge |
                val target = transition.targetState;
                if (!target.id.nullOrEmpty) {
                    val counter = groupedTransitions.get(target).indexOf(transition)
                    edge.head.data += KGraphFactory::eINSTANCE.createKIdentifier => [it.id = target.id + counter]
                }
            ];
        }

        // Transform regions
        for (region : state.regions) {
            switch region {
                ControlflowRegion: node.children += region.transform
                DataflowRegion: node.children += region.transform
            }
        }

        // Add reference region
        if (state.isReferencedState) {
            node.children += state.createReferenceRegion
        }
        
        val returnNodes = <KNode> newArrayList(node)
        
        state.getCommentAnnotations.forEach[
            returnNodes += it.transform                
        ]                        

        return returnNodes
    }

    /** Checks if given state should be visualized as macro state */
    def boolean isMacroState(State state) {
        return state.controlflowRegionsContainStates || state.containsDataflowRegions || !state.actions.empty ||
            !state.declarations.empty || state.isReferencedState;
    }
    
}