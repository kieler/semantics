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
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kitt.klighd.tracing.TracingVisualizationProperties
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.StateType
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeExtension
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.StateStyles

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class StateSynthesis extends SubSynthesis<State, KNode> {

    // -------------------------------------------------------------------------
    // Extensions 
    @Inject
    extension KNodeExtensions

    @Inject
    extension SCChartsExtension

    @Inject
    extension SCChartsSerializeExtension

    @Inject
    extension TransitionSynthesis

    @Inject
    extension ControlflowRegionSynthesis

    @Inject
    extension DataflowRegionSynthesis

    @Inject
    extension StateStyles

    override performTranformation(State state) {
        val node = state.createNode().associateWith(state);
        node.associateWith(state);

        node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box");
        node.setLayoutOption(LayoutOptions::BORDER_SPACING, 2f);
        node.setLayoutOption(LayoutOptions::SPACING, 1f);
        node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);

        val isConnector = state.type == StateType::CONNECTOR

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
        }
        if (state.isFinal) {
            node.setFinalStyle
        }

        // Optional Shadow
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
                            state.label + " @ " + (state.referencedScope as State).label ?: "UnresolvedReference").
                            associateWith(state)
                    case state.isMacroState:
                        node.addMacroStateLabel(state.label).associateWith(state)
                    default:
                        node.addSimpleStateLabel(state.label).associateWith(state)
                }
            }

            // Add declarations
            for (declaration : state.declarations) {
                node.addDeclarationLabel(declaration.serializeComponents) => [
                    setProperty(TracingVisualizationProperties.TRACING_NODE, true);
                    associateWith(declaration);
                    children.forEach[associateWith(declaration)];
                ]
            }

            // Add actions
            for (action : state.localActions) {
                // TODO Maybe improve string representation
//                text = text.replace("'", "")
//                if (text.length > 1 && text.substring(text.length - 1, text.length).equals(";")) {
//                    text = text.substring(0, text.length - 1)
//                }
                node.addActionLabel(action.serializeComponents) => [
                    setProperty(TracingVisualizationProperties.TRACING_NODE, true);
                    associateWith(action);
                    children.forEach[associateWith(action)];
                ]
            }

            // Add child area for regions
            if (state.hasInnerStatesOrControlflowRegions || state.isReferencedState) {
                node.addRegionsArea;
            }
        }

        // Transform all outgoing transitions
        for (transition : state.outgoingTransitions) {
            transition.transform;
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

        return node;
    }

    def boolean isMacroState(State state) {
        return state.hasInnerStatesOrControlflowRegions || state.hasDataflowRegions || !state.localActions.empty ||
            !state.declarations.empty || state.isReferencedState;
    }

}