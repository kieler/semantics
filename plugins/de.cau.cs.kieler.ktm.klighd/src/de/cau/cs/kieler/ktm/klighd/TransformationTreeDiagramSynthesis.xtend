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
package de.cau.cs.kieler.ktm.klighd

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
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions
import de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper
import de.cau.cs.kieler.ktm.transformationtree.ModelWrapper
import java.util.List
import javax.inject.Inject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * KLighD visualization for Transformation Mapping Graphs.
 * 
 * @author als
 */
class TransformationTreeDiagramSynthesis extends AbstractDiagramSynthesis<ModelWrapper> {

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
    extension TransformationTreeExtensions

    // -------------------------------------------------------------------------
    // Display options
    public static val SynthesisOption SHOW_SHADOW = SynthesisOption::createCheckOption("Shadows", true);
    public static val SynthesisOption SHOW_MODELS = SynthesisOption::createCheckOption("Model visualization", true);
    public static val SynthesisOption SHOW_ATTRIBUTES = SynthesisOption::createCheckOption("EObject attributes", false);
    public static val SynthesisOption SELECTIVE_MAPPING_VISUALISATION = SynthesisOption::
        createCheckOption("Selective mapping visualization", true);

    override public getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_SHADOW, SHOW_MODELS, SHOW_ATTRIBUTES, SELECTIVE_MAPPING_VISUALISATION);
    }

    override public getDisplayedLayoutOptions() {
        return newLinkedList(
            new Pair<IProperty<?>, List<?>>(LayoutOptions::ALGORITHM, emptyList),
            new Pair<IProperty<?>, List<?>>(LayoutOptions::DIRECTION,
                newImmutableList(Direction::DOWN, Direction::RIGHT)),
            new Pair<IProperty<?>, List<?>>(LayoutOptions::SPACING, newArrayList(0, 255))
        );
    }

    // -------------------------------------------------------------------------
    // Internal Display options
    public static val SynthesisOption SYNTHESIZE_TREE = SynthesisOption::createCheckOption("[synthesize tree]", true);

    //
    //    // -------------------------------------------------------------------------
    //    // Register own layouter for advanced edge placement
    //    //  - Priority must be greater than other layout out configurations e.g. StateLayoutConfig
    //    //    - Otherwise layout will fail
    //    private VolatileLayoutConfig postLayoutConfig = new VolatileLayoutConfig(200) => [
    //        it.setValue(LayoutOptions.ALGORITHM, TransformationTreeLayoutProvider.ID);
    //        it.setValue(LayoutOptions.SIZE_CONSTRAINT, SizeConstraint.fixed);
    //    ];
    //
    //    override List<? extends ILayoutConfig> getAdditionalLayoutConfigs() {
    //        newArrayList(postLayoutConfig);
    //    }
    // -------------------------------------------------------------------------
    // Some color and pattern constants
    private static val KColor SCCHARTSBLUE1 = RENDERING_FACTORY.createKColor() =>
        [it.red = 248; it.green = 249; it.blue = 253];
    private static val KColor SCCHARTSBLUE2 = RENDERING_FACTORY.createKColor() =>
        [it.red = 205; it.green = 220; it.blue = 243];

    // -------------------------------------------------------------------------
    // The Main entry transform function
    /**
     * Each Model is a element in a tree.
     * Creates synthesis for tree with given model as root element
     */
    override KNode transform(ModelWrapper model) {
        val rootNode = createNode();

        //TODO access parent viewContext
        //if(parentVC.getOptionValue(SYNTHESIZE_TREE)){
        if (true) {
            rootNode.addInvisibleContainerRendering.addSingleClickAction(
                "de.cau.cs.kieler.ktm.klighd.actions.SelectionDisplayAction");

            //create Tree
            rootNode.children += model.createNode() => [ treeNode |
                treeNode.addInvisibleContainerRendering;
                if (model.targetTransformations.empty) { //no transformations
                    model.transformModelAsChildNode(treeNode);
                } else {

                    //iterate over all transformations and create nodes and edges
                    model.succeedingTransformations.forEach [ trans |
                        trans.createEdge() => [
                            it.source = trans.source.transformModelAsChildNode(treeNode);
                            it.target = trans.target.transformModelAsChildNode(treeNode);
                            it.addPolyline.addArrowDecorator;
                            it.createLabel.configureCenteralEdgeLabel(trans.transformationID,
                                KlighdConstants::DEFAULT_FONT_SIZE,
                                KlighdConstants::DEFAULT_FONT_NAME);
                        ]
                    ];
                }
            ];
        } else {
            rootNode.children += model.modelObjects.map [
                //TODO access parent viewContext
                it.translateObject(SHOW_ATTRIBUTES.booleanValue, SHOW_SHADOW.booleanValue);
            ];
        }

        return rootNode;
    }

    /**
	 * creates a Node for given model (once) and adds it to given root node.
	 */
    private def KNode create node : createNode() transformModelAsChildNode(ModelWrapper model, KNode root) {
        node.putToLookUpWith(model);

        //Model's visualization like States in SCCharts
        val figure = node.createFigure(SHOW_SHADOW.booleanValue);

        figure.addText(model.modelTypeID).putToLookUpWith(model) => [
            it.fontSize = 11;
            it.setFontItalic(model.transient);
            it.setFontBold(!model.transient);
            it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
            it.setProperty(KlighdProperties::KLIGHD_SELECTION_UNPICKABLE, true);
        ];

        //TODO this should be a event on not pressed Ctrl. chsch might fix this
        figure.addSingleClickAction("de.cau.cs.kieler.ktm.klighd.actions.SelectionDisplayAction", false, true, false);

        //TODO this should be a event on pressed Ctrl. chsch might fix this
        figure.addSingleClickAction("de.cau.cs.kieler.ktm.klighd.actions.MultiSelectionDisplayAction", false, false,
            true);

        //add child once to root
        root.children += node;
    }

    /**
     * creates a Node for given model object.
     */
    def KNode translateObject(EObjectWrapper object, boolean showAttributes, boolean showShadows) {
        val node = object.createNode.putToLookUpWith(object);

        val figure = node.createFigure(showShadows);

        figure.setGridPlacement(1);

        val text = if (object.EObject == null) {
                object.displayName;
            } else {
                object.EObject.eClass.name;
            }

        figure.addText(text).putToLookUpWith(object) => [
            it.fontSize = 11;
            it.setFontBold(true);
            it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
            it.setProperty(KlighdProperties::KLIGHD_SELECTION_UNPICKABLE, true);
        ];

        if (showAttributes && object.EObject != null) {
            object.EObject.eClass.EAllAttributes.filterNull.forEach [
                figure.addText(it.name + ": " + String::valueOf(object.EObject.eGet(it))) => [
                    it.fontSize = 9;
                    it.setGridPlacementData().from(LEFT, 5, 0, TOP, 2, 0).to(RIGHT, 5, 0, BOTTOM, 2, 0);
                    it.setProperty(KlighdProperties::KLIGHD_SELECTION_UNPICKABLE, true);
                ];
            ]
        }

        return node;
    }

    def createFigure(KNode node, boolean showShadow) {
        val figure = node.addRoundedRectangle(8, 8, 1).background = "white".color;
        figure.lineWidth = 1;
        figure.foreground = "gray".color;
        figure.setBackgroundGradient(SCCHARTSBLUE1.copy, SCCHARTSBLUE2.copy, 90);

        if (showShadow) {
            figure.shadow = "black".color;
            figure.shadow.XOffset = 4;
            figure.shadow.YOffset = 4;
        }

        node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);

        return figure
    }

}
