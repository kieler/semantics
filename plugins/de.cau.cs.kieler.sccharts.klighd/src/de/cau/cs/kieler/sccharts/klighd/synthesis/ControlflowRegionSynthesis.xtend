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
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kitt.klighd.tracing.TracingVisualizationProperties
import de.cau.cs.kieler.klay.layered.properties.EdgeLabelSideSelection
import de.cau.cs.kieler.klay.layered.properties.FixedAlignment
import de.cau.cs.kieler.klay.layered.properties.Properties
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtension
import de.cau.cs.kieler.sccharts.klighd.actions.ReferenceExpandAction
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.ControlflowRegionStyles

import static de.cau.cs.kieler.sccharts.klighd.synthesis.GeneralSynthesisOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Transforms {@link ControlflowRegion} into {@link KNode} diagram elements.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class ControlflowRegionSynthesis extends SubSynthesis<ControlflowRegion, KNode> {

    @Inject
    extension KNodeExtensions

    @Inject
    extension KRenderingExtensions

    @Inject
    extension SCChartsSerializeHRExtension

    @Inject
    extension StateSynthesis

    @Inject
    extension ControlflowRegionStyles

    override performTranformation(ControlflowRegion region) {
        val node = region.createNode().associateWith(region);

        if (USE_KLAY.booleanValue) {
            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
            node.setLayoutOption(LayoutOptions::SPACING, 3f);
            node.setLayoutOption(LayoutOptions::BORDER_SPACING, 8f);
            node.setLayoutOption(Properties::FIXED_ALIGNMENT, FixedAlignment::BALANCED);
        } else {
            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot");
            node.setLayoutOption(LayoutOptions::SPACING, 40f);
        }
        node.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
        node.addLayoutParam(Properties::EDGE_LABEL_SIDE_SELECTION, EdgeLabelSideSelection.DIRECTION_UP);
        // Direction is set by the {@link LayoutHook}
        
        node.setLayoutOption(KlighdProperties::EXPAND, true);

        if (!region.states.empty) {

            val label = if(region.label.nullOrEmpty) "" else " " + region.label;

            // Expanded
            node.addRegionFigure => [
                setAsExpandedView
                associateWith(region)
                if (region.declarations.empty) {
                    addStatesArea(label.nullOrEmpty);
                } else {
                    addStatesAndDeclarationsArea();
                    // Add declarations
                    for (declaration : region.declarations) {
                        addDeclarationLabel(declaration.serializeComponents(true)) => [
                            setProperty(TracingVisualizationProperties.TRACING_NODE, true);
                            associateWith(declaration);
                            eAllContents.filter(typeof(KRendering)).forEach[associateWith(declaration)];
                        ]
                    }
                }
                // Add Button after area to assure correct overlapping
                addButton("[-]" + label).addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
            ]

            // Collapsed
            node.addRegionFigure => [
                setAsCollapsedView
                associateWith(region)
                addButton("[+]" + label).addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
            ]

            // Add inner states
            for (state : region.states) {
                node.children += state.transform;
            }

        } else {
            node.addRegionFigure;
        }

        return node;
    }

    /**
     * Create region area for reference states
     * 
     * @param state 
     *          the reference state
     */
    def KNode createReferenceRegion(State state) {
        val node = createNode().associateWith(state); // This association is important for the ReferenceExpandAction
        if (USE_KLAY.booleanValue) {
            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
            node.setLayoutOption(LayoutOptions::SPACING, 3f);
            node.setLayoutOption(LayoutOptions::BORDER_SPACING, 8f);
        } else {
            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot");
            node.setLayoutOption(LayoutOptions::SPACING, 40f);
        }
        node.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
        node.setLayoutOption(LayoutOptions::SPACING, 40f);

        // Set initially collapsed
        node.setLayoutOption(KlighdProperties::EXPAND, false);

        // Expanded
        node.addRegionFigure => [
            setAsExpandedView;
            addStatesArea(true);
            // Add Button after area to assure correct overlapping
            // Use special expand action to resolve references
            addButton("[-]").addDoubleClickAction(ReferenceExpandAction::ID);
        ]

        // Collapsed
        node.addRegionFigure => [
            setAsCollapsedView;
            addButton("[+]").addDoubleClickAction(ReferenceExpandAction::ID);
        ]

        return node;
    }

}