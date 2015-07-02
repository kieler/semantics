/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kitt.klighd.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.Colors
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.util.Pair
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kitt.klighd.tracing.TracingSynthesisOption
import de.cau.cs.kieler.kitt.tracing.TracingTreeExtensions
import de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper
import de.cau.cs.kieler.kitt.tracingtree.ModelWrapper
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import java.util.List
import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kitt.klighd.tracing.TracingVisualizationProperties

/**
 * KLighD visualization for TraingTrees and EObjectsCollections in ModelWrappers.
 * 
 * @author als
 * @kieler.design 2014-08-19 proposed
 * @kieler.rating 2014-08-19 proposed yellow
 */
class TracingTreeDiagramSynthesis extends AbstractDiagramSynthesis<ModelWrapper> {

    @Inject
    extension KNodeExtensions

    @Inject
    extension KEdgeExtensions

    @Inject
    extension KPortExtensions

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

    @Inject
    extension TracingTreeExtensions

    // -------------------------------------------------------------------------
    // Colors
    private static val KColor BG_COLOR_1 = RENDERING_FACTORY.createKColor() => [it.color = Colors.CHOCOLATE_1];
    private static val KColor BG_COLOR_2 = RENDERING_FACTORY.createKColor() => [it.color = Colors.CHOCOLATE_3];
    private static val KColor SHADOW_COLOR = RENDERING_FACTORY.createKColor() => [it.color = Colors.BLACK];

    // -------------------------------------------------------------------------
    // Display options
    public static val SynthesisOption SHOW_SHADOW = SynthesisOption.createCheckOption("Shadows", true);
    public static val SynthesisOption SHOW_MODELS = SynthesisOption.createCheckOption("Model visualization", true);
    public static val SynthesisOption SHOW_ATTRIBUTES = SynthesisOption.createCheckOption("EObject attributes", false);

    override public getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_SHADOW, SHOW_MODELS, SHOW_ATTRIBUTES, TracingSynthesisOption.synthesisOption);
    }

    override public getDisplayedLayoutOptions() {
        return newLinkedList(
            new Pair<IProperty<?>, List<?>>(LayoutOptions::DIRECTION,
                newImmutableList(Direction::DOWN, Direction::RIGHT)),
            new Pair<IProperty<?>, List<?>>(LayoutOptions::SPACING, newArrayList(0, 150))
        );
    }

    // -------------------------------------------------------------------------
    // The Main entry transform function
    /**
     * Creates synthesis for ModelWrapper either a tree diagram or a collection of its EObjectWrappers.
     */
    override KNode transform(ModelWrapper model) {
        val rootNode = createNode();

        // add invisible surrounding rectangle to prevent implicit visible one
        rootNode.addInvisibleContainerRendering;

        if (model.targetTransformations.empty) {

            //if no succeeding transformations exists transform only root-node
            model.transformModelWrapperAsChildNode(rootNode);
        } else {

            //iterate over all transformations and create nodes and edges
            model.succeedingTransformations.forEach [ trans |
                trans.createEdge() => [
                    it.source = trans.source.transformModelWrapperAsChildNode(rootNode);
                    it.target = trans.target.transformModelWrapperAsChildNode(rootNode);
                    it.addPolyline.addArrowDecorator;
                    it.createLabel.configureCenterEdgeLabel(trans.transformationID,
                        KlighdConstants::DEFAULT_FONT_SIZE,
                        KlighdConstants::DEFAULT_FONT_NAME);
                ]
            ];
        }

        return rootNode;
    }

    /**
	 * Creates a Node for given ModelWRapper (once) and add it to given root node.
	 */
    private def KNode create node : createNode() transformModelWrapperAsChildNode(ModelWrapper model, KNode root) {
        node.associateWith(model);

        node.setLayoutOption(KlighdProperties::EXPAND, model.sourceTransformation == null || model.targetTransformations.empty);

        //Expanded Rectangle
        node.createFigure() => [
            it.setProperty(KlighdProperties::EXPANDED_RENDERING, true);
            it.setGridPlacement(1);
            //add textual name of model type, transient models will be shown italic
            if (model.modelTypeID != null && !model.modelTypeID.empty) {
                it.addText(model.modelTypeID).associateWith(model) => [
                    it.fontSize = 11;
                    it.setFontItalic(model.transient);
                    it.setFontBold(!model.transient);
                    it.setGridPlacementData().from(LEFT, 8, 0, TOP, 8, 0).to(RIGHT, 8, 0, BOTTOM, 4, 0);
                    it.suppressSelectability;
                ];
            }
            it.addText("[Hide]") => [
                it.foreground = "blue".color
                it.fontSize = 9
                //center
                it.setSurroundingSpaceGrid(4, 0);
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

        //Collapse Rectangle
        node.createFigure() => [
            it.setProperty(KlighdProperties::COLLAPSED_RENDERING, true);
            it.setGridPlacement(1);
            //add textual name of model type, transient models will be shown italic
            if (model.modelTypeID != null && !model.modelTypeID.empty) {
                it.addText(model.modelTypeID).associateWith(model) => [
                    it.fontSize = 11;
                    it.setFontItalic(model.transient);
                    it.setFontBold(!model.transient);
                    it.setGridPlacementData().from(LEFT, 8, 0, TOP, 8, 0).to(RIGHT, 8, 0, BOTTOM, 2, 0);
                    it.suppressSelectability;
                ];
            }
            it.addText("[Show Model]") => [
                it.foreground = "blue".color
                it.fontSize = 9
                it.addSingleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                it.setSurroundingSpaceGrid(5, 0);
            ];
        ];

        //Create subdiagram from referenced model synthesis or fallback to component synthesis
        var KNode subDiagramNode = null;
        if (!model.transient && SHOW_MODELS.booleanValue && model.rootObject.EObject != null) {
            try {
                val properties = new KlighdSynthesisProperties();
                properties.setProperty(KlighdSynthesisProperties.REQUESTED_UPDATE_STRATEGY, SimpleUpdateStrategy.ID);
                subDiagramNode = LightDiagramServices.translateModel(model.rootObject.EObject, usedContext,
                    properties);
            } catch (Exception e) {
                //fallback
            }
        }
        if (subDiagramNode == null) { //component synthesis
            subDiagramNode = createNode();
            subDiagramNode.children += model.modelObjects.map [
                it.translateEObjectWrapper;
            ];
        }

        // prevent adding of rectangle by adding an invisible own one.
        subDiagramNode.addRectangle.invisible = true;

        //Add subdiagram to collapseable child area
        node.children += subDiagramNode;
        node.setLayoutOption(TracingVisualizationProperties.TRACED_MODEL_ROOT_NODE, true);

        //add child to root once 
        root.children += node;
    }

    /**
     * Creates a Node for given EObjectWrapper.
     */
    private def KNode translateEObjectWrapper(EObjectWrapper object) {
        val node = object.createNode.associateWith(object);

        //create and add colored rectangle for this node
        val figure = node.createFigure;
        figure.background = Colors.GRAY_95;

        //align all text fields in a column.
        figure.setGridPlacement(1);

        //if EObjectWrapper has a referenced eObject resolve and take its name or use standard display name of object
        val name = if (object.EObject == null) {
                object.displayName;
            } else {
                object.EObject.eClass.name;
            }

        //add name of object as text
        figure.addText(name).putToLookUpWith(object) => [
            it.fontSize = 11;
            it.setFontBold(true);
            it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
            it.suppressSelectability;
        ];

        //if EObjectWrapper has a referenced eObject and attributes should be displayed list all attributes
        if (SHOW_ATTRIBUTES.booleanValue && object.EObject != null) {
            object.EObject.eClass.EAllAttributes.filterNull.forEach [ //get all attributes
                figure.addText(it.name + ": " + String::valueOf(object.EObject.eGet(it))) => [ //add a text with name and value of the attribute
                    it.fontSize = 9;
                    it.setGridPlacementData().from(LEFT, 5, 0, TOP, 2, 0).to(RIGHT, 5, 0, BOTTOM, 2, 0);
                    it.suppressSelectability;
                ];
            ]
        }

        return node;
    }

    /**
     * Create and adds colored rectangle for given node.
     * Style is taken from SCCharts L&F.
     */
    private def createFigure(KNode node) {

        //Code taken from SCChartDiagramsynthesis
        val figure = node.addRoundedRectangle(8, 8, 1)
        figure.lineWidth = 1;
        figure.foreground = Colors.GRAY;
        figure.setBackgroundGradient(BG_COLOR_1.copy, BG_COLOR_2.copy, 90);

        //add shadow if option is activated
        if (SHOW_SHADOW.booleanValue) {
            figure.shadow = SHADOW_COLOR.copy;
            figure.shadow.XOffset = 4;
            figure.shadow.YOffset = 4;
        }

        //minimal node size is necessary if no text will be added
        node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);
        return figure;
    }

}
