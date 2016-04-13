/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.internal.model

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.Colors
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.util.Pair
import de.cau.cs.kieler.kico.klighd.internal.model.action.RemovedCollapsedDiagramsAction
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kitt.klighd.tracing.TracingSynthesisOption
import de.cau.cs.kieler.kitt.klighd.tracing.TracingVisualizationProperties
import de.cau.cs.kieler.klighd.DisplayedActionData
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.ui.view.DiagramView
import de.cau.cs.kieler.klighd.ui.view.model.MessageModel
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import java.util.List
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Diagram synthesis for a ModelChain.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
class ModelChainSynthesis extends AbstractDiagramSynthesis<ModelChain> {

    @Inject
    extension KNodeExtensions

    @Inject
    extension KEdgeExtensions

    @Inject
    extension KLabelExtensions

    @Inject
    extension KRenderingExtensions

    @Inject
    extension KContainerRenderingExtensions

    @Inject
    extension KPolylineExtensions

    @Inject
    extension KColorExtensions

    // -------------------------------------------------------------------------
    override public getDisplayedSynthesisOptions() {
        return newLinkedList(TracingSynthesisOption.synthesisOption);
    }
    
    override public getDisplayedActions() {
        return newLinkedList(DisplayedActionData.create(RemovedCollapsedDiagramsAction.ID, "Remove collapsed models in model chain"));
    }

    override public getDisplayedLayoutOptions() {
        return newLinkedList(
            new Pair<IProperty<?>, List<?>>(LayoutOptions::DIRECTION,
                newImmutableList(Direction::DOWN, Direction::RIGHT)),
            new Pair<IProperty<?>, List<?>>(LayoutOptions::SPACING, newArrayList(0, 150))
        );
    }

    public static val String ID = "de.cau.cs.kieler.kico.klighd.internal.model.ModelChainSynthesis";
    private static val KColor BG_COLOR = RENDERING_FACTORY.createKColor() => [red = 255; green = 202; blue = 119];
    private static val KColor SHADOW_COLOR = RENDERING_FACTORY.createKColor() => [it.color = Colors.BLACK];

    // -------------------------------------------------------------------------
    // Synthesis
    override KNode transform(ModelChain chainWrapper) {
        val chain = chainWrapper.getModels;
        val rootNode = createNode();
        rootNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
        rootNode.addLayoutParam(LayoutOptions::DIRECTION, Direction.RIGHT);

        if (!chain.empty) {

            // transform first
            var first = chainWrapper.transformModel(chain.get(0));
            rootNode.children += first;

            // transform rest and add edges in between
            for (i : 1 ..< chain.size) {
                val second = chainWrapper.transformModel(chain.get(i));
                rootNode.children += second;
                val edge = createEdge =>
                    [
                        it.addPolyline => [
                            // if label name is null hide edge
                            it.invisible = chainWrapper.isBlankMode;
                            it.addArrowDecorator.invisible = chainWrapper.isBlankMode;
                        ]
                        // if available add label
                        if (!chainWrapper.isBlankMode && i - 1 < chainWrapper.getTranformations.size) {
                            it.createLabel.configureCenterEdgeLabel(chainWrapper.getTranformations.get(i - 1),
                                KlighdConstants::DEFAULT_FONT_SIZE, KlighdConstants::DEFAULT_FONT_NAME);
                        }
                    ]
                edge.source = first;
                edge.target = second;
                first = second;
            }
        }
        return rootNode;
    }

    private def KNode transformModel(ModelChain chain, Object model) {
        val node = createNode.associateWith(model);

        // if label is not null a parent node is created and model diagram is added in collapsed child area
        if (!chain.isBlankMode) {

            node.setLayoutOption(KlighdProperties::EXPAND, !chain.getCollapse.get(model));

            // Expanded Rectangle
            node.createFigure() => [
                it.setProperty(KlighdProperties::EXPANDED_RENDERING, true);
                it.setGridPlacement(1);
                it.addText("[Hide]") => [
                    it.foreground = "blue".color
                    it.fontSize = 9
                    // center
                    it.setSurroundingSpaceGrid(5, 0);
                    it.addSingleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                ];
                it.addRectangle => [
                    it.setGridPlacementData.from(LEFT, 8, 0, TOP, 0, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
                    it.setBackground = "white".color;
                    it.foreground = "gray".color
                    it.lineWidth = 1;
                    it.addChildArea()
                ];
            ];

            // Collapse Rectangle
            node.createFigure() => [
                it.setProperty(KlighdProperties::COLLAPSED_RENDERING, true);
                it.addText("[Show Model]") => [
                    it.foreground = "blue".color
                    it.fontSize = 9
                    it.addSingleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                    it.setSurroundingSpace(5, 0);
                ];
            ];
        } else {
            node.addInvisibleContainerRendering;
        }

        // Create subdiagram from referenced model synthesis or fallback to component synthesis
        var KNode subDiagramNode = null;
        try {
            val properties = new KlighdSynthesisProperties();
            properties.setProperty(KlighdSynthesisProperties.REQUESTED_UPDATE_STRATEGY, SimpleUpdateStrategy.ID);
            val viewpart = usedContext.diagramWorkbenchPart;
            if (viewpart instanceof DiagramView) {
                val synthesisID = (viewpart as DiagramView).synthesisSelectionMenu.getSynthesis(model);
                properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS, synthesisID);
                val subDiagramViewContext = LightDiagramServices::translateModel2(model, usedContext, properties);
                usedContext.addChildViewContext(subDiagramViewContext)
                subDiagramNode = subDiagramViewContext.viewModel;
            } else {
                val subDiagramViewContext = LightDiagramServices::translateModel2(model, usedContext, properties);
                usedContext.addChildViewContext(subDiagramViewContext)
                subDiagramNode = subDiagramViewContext.viewModel;
            }
        } catch (Exception e) {
            // fallthrou
        }
        // If normal synthesis failed create message
        if ((subDiagramNode == null || subDiagramNode.children.isEmpty) && model instanceof EObject) { // component synthesis
            val properties = new KlighdSynthesisProperties();
            properties.setProperty(KlighdSynthesisProperties.REQUESTED_UPDATE_STRATEGY, SimpleUpdateStrategy.ID);
            subDiagramNode = LightDiagramServices::translateModel(new MessageModel("Cannot create sub-diagram"),
                usedContext, properties);
        }
        // Add subdiagram
        if (subDiagramNode != null && !subDiagramNode.children.isEmpty) {

            // prevent adding of rectangle by adding an invisible own one.
            subDiagramNode.addRectangle.invisible = true;

            // Add subdiagram to collapseable child area
            node.children += subDiagramNode;
            node.setLayoutOption(TracingVisualizationProperties.TRACED_MODEL_ROOT_NODE, true);
        }
        return node;
    }

    private def createFigure(KNode node) {
        val figure = node.addRoundedRectangle(8, 8, 1);
        figure.lineWidth = 1;
        figure.foreground = Colors.GRAY;
        figure.background = BG_COLOR;

        // add shadow
        figure.shadow = SHADOW_COLOR.copy;
        figure.shadow.XOffset = 4;
        figure.shadow.YOffset = 4;

        // minimal node size is necessary if no text will be added
        node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);
        return figure;
    }

}
