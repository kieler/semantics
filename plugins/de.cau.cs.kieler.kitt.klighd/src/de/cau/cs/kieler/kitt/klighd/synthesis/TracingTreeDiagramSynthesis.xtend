/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kitt.klighd.synthesis

import de.cau.cs.kieler.core.kgraph.KNode
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
import de.cau.cs.kieler.kitt.klighd.tracing.TracingProperties
import de.cau.cs.kieler.kitt.tracing.ModelTracingManager
import de.cau.cs.kieler.kitt.tracing.TracingTreeExtensions
import de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper
import de.cau.cs.kieler.kitt.tracingtree.ModelWrapper
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import java.util.List
import javax.inject.Inject

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kitt.klighd.tracing.TracingSynthesisOption

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
    // Some color and pattern constants taken from SCCharts
    private static val KColor SCCHARTSBLUE1 = RENDERING_FACTORY.createKColor() =>
        [it.red = 248; it.green = 249; it.blue = 253];
    private static val KColor SCCHARTSBLUE2 = RENDERING_FACTORY.createKColor() =>
        [it.red = 205; it.green = 220; it.blue = 243];

    // -------------------------------------------------------------------------
    // The Main entry transform function
    /**
     * Creates synthesis for ModelWrapper either a tree diagram or a collection of its EObjectWrappers.
     */
    override KNode transform(ModelWrapper model) {
        val rootNode = createNode();

        // add invisible surrounding rectangle to prevent implicit visible one
        rootNode.addInvisibleContainerRendering;

        //create knode with all succeeding nodes from model-root-node
        rootNode.children += model.createNode() => [ treeNode |
            // add invisible surrounding rectangle to prevent implicit visible one
            treeNode.addInvisibleContainerRendering;
            if (model.targetTransformations.empty) {

                //if no succeeding transformations exists transform only root-node
                model.transformModelWrapperAsChildNode(treeNode);
            } else {

                //iterate over all transformations and create nodes and edges
                model.succeedingTransformations.forEach [ trans |
                    trans.createEdge() => [
                        it.source = trans.source.transformModelWrapperAsChildNode(treeNode);
                        it.target = trans.target.transformModelWrapperAsChildNode(treeNode);
                        it.addPolyline.addArrowDecorator;
                        it.createLabel.configureCenterEdgeLabel(trans.transformationID,
                            KlighdConstants::DEFAULT_FONT_SIZE,
                            KlighdConstants::DEFAULT_FONT_NAME);
                    ]
                ];
            }
        ];

        //This is a special case where the model itself is its own tracing
        ModelTracingManager.activateTracing(model);
        return rootNode;
    }

    /**
	 * Creates a Node for given ModelWRapper (once) and add it to given root node.
	 */
    private def KNode create node : createNode() transformModelWrapperAsChildNode(ModelWrapper model, KNode root) {
        node.associateWith(model);

        //create and add colored rectangle for this node
        val figure = node.createFigure;

        //add textual name of model type, transient models will be shown italic
        figure.addText(model.modelTypeID).associateWith(model) => [
            it.fontSize = 11;
            it.setFontItalic(model.transient);
            it.setFontBold(!model.transient);
            it.setGridPlacementData().from(LEFT, 8, 0, TOP, 8, 0).to(RIGHT, 8, 0, BOTTOM, 4, 0);
            it.suppressSelectability;
        ];

        //Add regions for expanded/collapsed child area
        figure.setGridPlacement(1);
        figure.addChildArea();

        //node.setLayoutOption(LayoutOptions::EXPAND_NODES, false);
        node.children += createNode() => [
            it.associateWith(model);
            it.setLayoutOption(KlighdProperties::EXPAND, false);
            figure.setGridPlacement(1);
            //Collapse Rectangle
            it.addRectangle() => [
                it.setProperty(KlighdProperties::COLLAPSED_RENDERING, true);
                it.invisible = true;
                //This text is only for correct size estimation
                it.addText(model.modelTypeID) => [
                    it.fontSize = 11
                    it.setFontItalic(model.transient);
                    it.setFontBold(!model.transient);
                    it.invisible = true;
                    it.suppressSelectability;
                ];
                it.addText("[Show Model]") => [
                    it.foreground = "blue".color
                    it.fontSize = 9
                    it.addSingleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                    it.suppressSelectability;
                ];
            ]
            //Expanded Rectangle
            it.addRectangle() => [
                it.setProperty(KlighdProperties::EXPANDED_RENDERING, true);
                it.setBackground = "white".color;
                it.setSurroundingSpace(2, 0);
                it.invisible = false;
                it.foreground = "gray".color
                it.lineWidth = 1;
                it.addText("[Hide]") => [
                    it.foreground = "blue".color
                    it.fontSize = 9
                    //center
                    it.setPointPlacementData(createKPosition(LEFT, 0, 0.5f, TOP, 4, 0), H_CENTRAL, V_TOP, 0, 0, 0, 0);
                    it.addSingleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);                    
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                    it.suppressSelectability;
                ];
                it.addChildArea().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 10, 0);
            ];
            //Create subdiagram from referenced model synthesis or fallback to component synthesis
            var KNode subDiagramNode = null;
            if (!model.transient && SHOW_MODELS.booleanValue) {
                try {
                    subDiagramNode = LightDiagramServices::translateModel(model.rootObject.EObject, usedContext);
                } catch (Exception e) {
                    //fallback
                }
            }
            if (subDiagramNode == null) { //component synthesis
                subDiagramNode = createNode();
                subDiagramNode.children += model.modelObjects.map [
                    it.translateEObjectWrapper;
                ];
            } else {

                //only if submodel is synthesized with its own synthesis set this parameter to use this mapping
                node.setLayoutOption(TracingProperties.TRACED_MODEL_ROOT_NODE, true);
            }
            // prevent adding of rectangle by adding an invisible own one.
            subDiagramNode.addRectangle.invisible = true;
            //Add subdiagram to collapseable child area
            it.children += subDiagramNode;
        ]

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
        val figure = node.addRoundedRectangle(8, 8, 1).background = "white".color;
        figure.lineWidth = 1;
        figure.foreground = "gray".color;
        figure.setBackgroundGradient(SCCHARTSBLUE1.copy, SCCHARTSBLUE2.copy, 90);

        //add shadow if option is activated
        if (SHOW_SHADOW.booleanValue) {
            figure.shadow = "black".color;
            figure.shadow.XOffset = 4;
            figure.shadow.YOffset = 4;
        }

        //minimal node size is necessary if no text will be added
        node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);

        return figure;
    }

}
