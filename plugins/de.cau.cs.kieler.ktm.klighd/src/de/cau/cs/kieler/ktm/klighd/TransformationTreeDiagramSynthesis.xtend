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
    private static val SynthesisOption SHOW_SHADOW = SynthesisOption::createCheckOption("Shadow", true);

    override public getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_SHADOW);
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

        //create Tree
        rootNode.children += model.createNode() => [ treeNode |
            treeNode.addRectangle => [
                it.invisible = true;
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
            ]
        ];

        //create detail views for element transformations
        rootNode.children += model.succeedingTransformations.map [ trans |
            createNode => [ transNode |
                transNode.putToLookUpWith(trans);
                //add element transformations
                trans.objectTransformations.forEach [ elemTrans |
                    elemTrans.createEdge() => [
                        it.putToLookUpWith(elemTrans);
                        it.source = elemTrans.source.transformElementAsChildNode(transNode);
                        it.target = elemTrans.target.transformElementAsChildNode(transNode);
                        it.addPolyline.addArrowDecorator;
                    ]
                ];
                transNode.addRoundedRectangle(8, 8, 1) => [
                    it.background = "white".color;
                    it.lineWidth = 1;
                    it.foreground = "gray".color;
                    if (SHOW_SHADOW.booleanValue) {
                        it.shadow = "black".color;
                        it.shadow.XOffset = 4;
                        it.shadow.YOffset = 4;
                    }
                    it.setGridPlacement(1);
                    it.addText(trans.transformationID).putToLookUpWith(trans).setSurroundingSpace(5, 0).
                        setFontBold(true);
                    it.addHorizontalLine(1); //separator
                    it.addChildArea();
                ];
            ];
        ];
        return rootNode;
    }

    /**
	 * creates a Node for given model (once) and adds it to given root node.
	 */
    def KNode create node : createNode() transformModelAsChildNode(ModelWrapper model, KNode root) {
        node.putToLookUpWith(model);

        //Model's visualization like States in SCCharts
        val figure = node.addRoundedRectangle(8, 8, 1).background = "white".color;
        figure.lineWidth = 1;
        figure.foreground = "gray".color;
        figure.setBackgroundGradient(SCCHARTSBLUE1.copy, SCCHARTSBLUE2.copy, 90);

        if (SHOW_SHADOW.booleanValue) {
            figure.shadow = "black".color;
            figure.shadow.XOffset = 4;
            figure.shadow.YOffset = 4;
        }

        node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);

        figure.addText(model.modelTypeID).putToLookUpWith(model) => [
            it.fontSize = 11;
            it.setFontItalic(model.transient);
            it.setFontBold(!model.transient);
            it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
        ];

        //add child once to root
        root.children += node;
    }

    /**
     * creates a Node for given model (once) and adds it to given root node.
     */
    def KNode create node : createNode() transformElementAsChildNode(EObjectWrapper object, KNode root) {
        node.putToLookUpWith(object);

        //Model's visualization like States in SCCharts
        val figure = node.addRoundedRectangle(8, 8, 1).background = "white".color;
        figure.lineWidth = 1;
        figure.foreground = "gray".color;
        figure.setBackgroundGradient(SCCHARTSBLUE1.copy, SCCHARTSBLUE2.copy, 90);

        if (SHOW_SHADOW.booleanValue) {
            figure.shadow = "black".color;
            figure.shadow.XOffset = 4;
            figure.shadow.YOffset = 4;
        }

        node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);

        figure.addText(object.displayName).putToLookUpWith(object) => [
            it.fontSize = 11;
            it.setFontBold(object == object.model.rootObject);
            it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
        ];

        //add child once to root
        root.children += node;
    }

}
