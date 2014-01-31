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
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions
import de.cau.cs.kieler.ktm.klighd.resolve.EObjectSynthesisModelWrapperWrapper
import de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper
import de.cau.cs.kieler.ktm.transformationtree.ModelWrapper
import java.util.List
import javax.inject.Inject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * KLighD visualization for TransformationTrees and EObjectsCollections in ModelWrappers.
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

    override public getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_SHADOW, SHOW_MODELS, SHOW_ATTRIBUTES);
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
    // Some color and pattern constants taken from SCChart
    private static val KColor SCCHARTSBLUE1 = RENDERING_FACTORY.createKColor() =>
        [it.red = 248; it.green = 249; it.blue = 253];
    private static val KColor SCCHARTSBLUE2 = RENDERING_FACTORY.createKColor() =>
        [it.red = 205; it.green = 220; it.blue = 243];

    // -------------------------------------------------------------------------
    // Constants    
    private static val selectActionID = "de.cau.cs.kieler.ktm.klighd.actions.ModelSelectionAction";
    private static val resolveActionID = "de.cau.cs.kieler.ktm.klighd.actions.ModelResolveAction";

    // -------------------------------------------------------------------------
    // The Main entry transform function
    /**
     * Creates synthesis for ModelWrapper either a tree diagram or a collection of its EObjectWrappers.
     */
    override KNode transform(ModelWrapper model) {
        val rootNode = createNode();

        //special synthesis for ModelWrapper which contained EObjectWrapper should be generated
        if (model instanceof EObjectSynthesisModelWrapperWrapper) {

            //add EObjecWrapper diagrams
            rootNode.children += (model as EObjectSynthesisModelWrapperWrapper).modelWrapper.modelObjects.map [
                it.translateObject;
            ];

            //add surrounding rectangle
            rootNode.addRoundedRectangle(8, 8, 1) => [
                it.lineWidth = 2;
                it.foreground = "gray".color;
                if (SHOW_SHADOW.booleanValue) {
                    it.shadow = "black".color;
                    it.shadow.XOffset = 4;
                    it.shadow.YOffset = 4;
                }
                it.addChildArea;
            ];

        //synthesis for TransformationTree with given ModelWrapper as root node
        } else {

            //add invisible surrounding rectangle
            rootNode.addInvisibleContainerRendering.addSingleClickAction(selectActionID);

            //create knode with all succeeding node from model-root-node
            rootNode.children += model.createNode() => [ treeNode |
                treeNode.addInvisibleContainerRendering.addSingleClickAction(selectActionID);
                if (model.targetTransformations.empty) {

                    //if no succeeding transformations exists transform only root-node
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
        }

        return rootNode;
    }

    /**
	 * Creates a Node for given ModelWRapper (once) and add it to given root node.
	 */
    private def KNode create node : createNode() transformModelAsChildNode(ModelWrapper model, KNode root) {
        node.putToLookUpWith(model);

        //create and add colored rectangle for this node
        val figure = node.createFigure;

        //add textual name of model type, transient models will be shown italic
        figure.addText(model.modelTypeID).putToLookUpWith(model) => [
            it.fontSize = 11;
            it.setFontItalic(model.transient);
            it.setFontBold(!model.transient);
            it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
            it.setProperty(KlighdProperties::KLIGHD_SELECTION_UNPICKABLE, true);
        ];

        //Add selection actions for node in tree
        //TODO this should be an event on not pressed CTRL. chsch might fix this?
        figure.addSingleClickAction(selectActionID, false, true, false);

        //TODO this should be an event on pressed CTRL. chsch might fix this?
        figure.addSingleClickAction(resolveActionID, false, false, true);

        //add child to root once 
        root.children += node;
    }

    /**
     * When calling translateObject outside of a ModelWrapper synthesis no ViewContext is set.
     * This method allows to call translateObject with a given ViewContext which enables access to
     *  SynthesisOption to maintain a consistent L&F.
     */
    def KNode translateObject(EObjectWrapper object, ViewContext vc) {
        this.use(vc);
        translateObject(object);
    }

    /**
     * Creates a Node for given EObjectWrapper.
     */
    private def KNode translateObject(EObjectWrapper object) {
        val node = object.createNode.putToLookUpWith(object);

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
            it.setProperty(KlighdProperties::KLIGHD_SELECTION_UNPICKABLE, true);
        ];

        //if EObjectWrapper has a referenced eObject and attributes should be displayed list all attributes
        if (SHOW_ATTRIBUTES.booleanValue && object.EObject != null) {
            object.EObject.eClass.EAllAttributes.filterNull.forEach [ //get all attributes
                figure.addText(it.name + ": " + String::valueOf(object.EObject.eGet(it))) => [ //add a text with name and value of the attribute
                    it.fontSize = 9;
                    it.setGridPlacementData().from(LEFT, 5, 0, TOP, 2, 0).to(RIGHT, 5, 0, BOTTOM, 2, 0);
                    it.setProperty(KlighdProperties::KLIGHD_SELECTION_UNPICKABLE, true);
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
