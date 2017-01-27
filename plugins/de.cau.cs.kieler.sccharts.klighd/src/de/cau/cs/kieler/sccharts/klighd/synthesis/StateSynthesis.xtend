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
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.StateType
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtension
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.StateStyles
import org.eclipse.elk.alg.layered.properties.LayerConstraint
import org.eclipse.elk.alg.layered.properties.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.graph.KNode

import static de.cau.cs.kieler.sccharts.klighd.synthesis.GeneralSynthesisOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

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

    @Inject
    extension KNodeExtensions

    @Inject
    extension SCChartsExtension

    @Inject
    extension SCChartsSerializeHRExtension

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

        node.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.box");
        node.setLayoutOption(CoreOptions::EXPAND_NODES, true);
        node.setLayoutOption(CoreOptions::SPACING_BORDER, 2f);
        node.setLayoutOption(CoreOptions::SPACING_NODE, 1f);
//        node.setLayoutOption(SidebarOverrideLayoutConfig::FIXED_SPACING, 1f);

        //pre-evaluate type
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
            if (USE_KLAY.booleanValue) {
                node.setLayoutOption(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::FIRST);
            }
        }
        if (state.isFinal) {
            node.setFinalStyle
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
                            state.label + " @ " + (state.referencedScope as State).label ?: "UnresolvedReference").
                            associateWith(state)
                    case state.isMacroState:
                        node.addMacroStateLabel(state.label).associateWith(state)
                    default:
                        node.addSimpleStateLabel(state.label).associateWith(state)
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
            for (action : state.localActions) {
                node.addActionLabel(action.serializeHighlighted(true)) => [
                    setProperty(TracingVisualizationProperties.TRACING_NODE, true);
                    associateWith(action);
                    eAllContents.filter(KRendering).forEach[associateWith(action)];
                ]
            }

            // Add child area for regions
            if (state.hasInnerStatesOrControlflowRegions || state.hasDataflowRegions || state.isReferencedState) {
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

        return <KNode> newArrayList(node)
    }

    /** Checks if given state should be visualized as macro state */
    def boolean isMacroState(State state) {
        return state.hasInnerStatesOrControlflowRegions || state.hasDataflowRegions || !state.localActions.empty ||
            !state.declarations.empty || state.isReferencedState;
    }
    
}