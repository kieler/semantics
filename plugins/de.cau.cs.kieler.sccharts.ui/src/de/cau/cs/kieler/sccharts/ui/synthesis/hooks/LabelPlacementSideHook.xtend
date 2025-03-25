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
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.labels.decoration.DirectionalArrowsDecorator
import de.cau.cs.kieler.klighd.labels.decoration.LabelDecorationConfigurator
import de.cau.cs.kieler.klighd.labels.decoration.LinesDecorator
import de.cau.cs.kieler.klighd.labels.decoration.RectangleDecorator
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.ColorStore
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.TransitionStyles
import java.awt.Color
import org.eclipse.elk.alg.layered.options.EdgeLabelSideSelection
import org.eclipse.elk.alg.layered.options.LayeredOptions

import static de.cau.cs.kieler.sccharts.ui.synthesis.styles.ColorStore.Color.*

/**
 * Allows users to choose a label side. They may also switch to on-edge labels, either with or without
 * directional indicators.
 * 
 * @author cds
 */
@ViewSynthesisShared
class LabelPlacementSideHook extends SynthesisHook {

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.LabelPlacementSideHook";
    
    /** The sub category for label placement side selection. */
    public static final SynthesisOption LABEL_SIDE_CATEGORY = GeneralSynthesisOptions::LAYOUT
    
    private static final String STRATEGY_CONSISTENT = "Always above";
    private static final String STRATEGY_SMART = "Smart";
    private static final String STRATEGY_DIRECTIONAL = "Direction-dependent";
    private static final String STRATEGY_ON_EDGE = "On edge";
    private static final boolean ON_EDGE_ARROWS = true;
    
    /** The synthesis option to switch between different side selection strategies. */
    public static final SynthesisOption LABEL_SIDE_SELECTION_STRATEGY = SynthesisOption.createChoiceOption(
        LabelPlacementSideHook,
        "Label Side",
        newLinkedList(
            STRATEGY_CONSISTENT,
            STRATEGY_SMART,
//            STRATEGY_DIRECTIONAL,
            STRATEGY_ON_EDGE),
        STRATEGY_ON_EDGE).setCategory(LABEL_SIDE_CATEGORY);
    
    @Inject
    extension TransitionStyles;
    @Inject
    extension ColorStore
    
    
    override getDisplayedSynthesisOptions() {
        return newLinkedList(LABEL_SIDE_SELECTION_STRATEGY);
    }
    
    override finish(Scope scope, KNode node) {
        // If inline labels are enabled, we need to style them appropriately
        val strategy = LABEL_SIDE_SELECTION_STRATEGY.objectValue;
        if (strategy != STRATEGY_ON_EDGE) {
            // Next-to-edge strategies don't need any further processing
            return;
        }
        
        // Colors we shall use
        val foregroundKColor = REGION_FOREGROUND.color
        val foreground = new Color(foregroundKColor.red, foregroundKColor.green, foregroundKColor.blue);
        val background = new Color(255, 255, 255, 220);
        
        // Create and properly configure an inline label configurator that will do most of our work for us
        val inlineLabelConfigurator = LabelDecorationConfigurator.create.withInlineLabels(true)
            .withLabelTextRenderingProvider([ container, label | createTextRendering(container, label) ])
            .addDecoratorRenderingProvider(
                RectangleDecorator.create()
                    .withBackground(background))
            .addDecoratorRenderingProvider(
                LinesDecorator.create()
                    .withColor(foreground))
        
        if (ON_EDGE_ARROWS) {
            inlineLabelConfigurator.addDecoratorRenderingProvider(
                DirectionalArrowsDecoratorHotFixed.create()
                    .withColor(foreground))
        }
        
        inlineLabelConfigurator.applyToAll(node, true);
    }
    
    override processRegion(Region region, KNode node) {
        // Each region is told about the selected label side selection strategy, provided that the selected strategy
        // places labels next to their respective edge
        switch (LABEL_SIDE_SELECTION_STRATEGY.objectValue) {
            case STRATEGY_CONSISTENT:
                node.setProperty(LayeredOptions.EDGE_LABELS_SIDE_SELECTION, EdgeLabelSideSelection.ALWAYS_UP)
            case STRATEGY_SMART:
                node.setProperty(LayeredOptions.EDGE_LABELS_SIDE_SELECTION, EdgeLabelSideSelection.SMART_UP)
            case STRATEGY_DIRECTIONAL:
                node.setProperty(LayeredOptions.EDGE_LABELS_SIDE_SELECTION, EdgeLabelSideSelection.DIRECTION_UP)
            default:
                node.setProperty(LayeredOptions.EDGE_LABELS_SIDE_SELECTION, null)
        }
    }
    
    /**
     * The method that will create text renderings for the inline label configurator.
     */
    private def KRendering createTextRendering(KContainerRendering container, KLabel label) {
        val rendering = KRenderingFactory.eINSTANCE.createKText();
        rendering.configureTransitionLabelRendering();
        
        container.children += rendering;
        
        return rendering;
    }
    
}
