/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.model

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
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import java.util.List
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Diagram synthesis of a KiCoModelChain.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 *
 */
class KiCoModelChainSynthesis extends AbstractDiagramSynthesis<KiCoModelChain> {

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

    // -------------------------------------------------------------------------
    // Some color and pattern constants taken from SCCharts
    private static val KColor SCCHARTSBLUE1 = RENDERING_FACTORY.createKColor() =>
        [it.red = 248; it.green = 249; it.blue = 253];
    private static val KColor SCCHARTSBLUE2 = RENDERING_FACTORY.createKColor() =>
        [it.red = 205; it.green = 220; it.blue = 243];

    override public getDisplayedLayoutOptions() {
        return newLinkedList(
            new Pair<IProperty<?>, List<?>>(LayoutOptions::ALGORITHM, emptyList),
            new Pair<IProperty<?>, List<?>>(LayoutOptions::DIRECTION, Direction::values.drop(1).sortBy[it.name]),
            new Pair<IProperty<?>, List<?>>(LayoutOptions::SPACING, newArrayList(0, 50))
        );
    }

    // -------------------------------------------------------------------------
    // The Main entry transform function
    override KNode transform(KiCoModelChain chainWrapper) {
        val chain = chainWrapper.models;
        val rootNode = createNode();
        rootNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
        rootNode.addLayoutParam(LayoutOptions::DIRECTION, Direction.RIGHT);

        if (!chain.empty) {

            //transform first
            var first = transformModel(chain.get(0));
            rootNode.children += first;

            //transform rest and add edges in between
            for (i : 1 ..< chain.size) {
                val currentModel = chain.get(i);
                val second = transformModel(currentModel);
                rootNode.children += second;
                val edge = createEdge => [
                    it.addPolyline => [
                        //if label name is null hide edge
                        it.addArrowDecorator.invisible = currentModel.edgeLabel == null;
                        it.invisible = currentModel.edgeLabel == null;
                    ]
                    //if available add label
                    if (currentModel.edgeLabel != null) {
                        it.createLabel.configureCenterEdgeLabel(currentModel.edgeLabel,
                            KlighdConstants::DEFAULT_FONT_SIZE,
                            KlighdConstants::DEFAULT_FONT_NAME);
                    }
                ]
                edge.source = first;
                edge.target = second;
                first = second;
            }
        }

        return rootNode;
    }

    private def KNode transformModel(KiCoModelWrapper model) {
        val node = createNode.associateWith(model);
        var subDiagramParentNode = node

        //if label is not null a parent node is created and model diagram is added in collapsed child area
        if (model.label != null) {
            val figure = node.createFigure;

            //title of parent node
            figure.addText(model.label).associateWith(model) => [
                it.fontSize = 11;
                it.setFontBold = true;
                it.setGridPlacementData().from(LEFT, 8, 0, TOP, 8, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
                it.suppressSelectability;
            ];

            //Add regions for expanded/collapsed child area
            figure.setGridPlacement(1);
            figure.addChildArea();

            subDiagramParentNode = createNode() => [
                it.associateWith(model);
                it.setLayoutOption(KlighdProperties::EXPAND, !model.collapsed);
                figure.setGridPlacement(1);
                //Collapse Rectangle
                it.addRectangle() => [
                    it.setProperty(KlighdProperties::COLLAPSED_RENDERING, true);
                    it.invisible = true;
                    //This text is only for correct size estimation
                    it.addText(model.label) => [
                        it.fontSize = 11;
                        it.setFontBold = true;
                        it.invisible = true;
                        it.suppressSelectability;
                    ];
                    it.addText("[Show Model]") => [
                        it.foreground = "blue".color
                        it.fontSize = 9
                        it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
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
                        it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                    ];
                    it.addChildArea().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 10, 0);
                ];
            ];
            node.children += subDiagramParentNode
        } else {
            node.addInvisibleContainerRendering;
        }

        //Create subdiagram from referenced model synthesis or fallback to component synthesis
        var KNode subDiagramNode = null;
        try {
            subDiagramNode = LightDiagramServices::translateModel(model.model, usedContext);
        } catch (Exception e) {
            //fallthrou
        }
        if (subDiagramNode == null && model.model instanceof EObject) { //component synthesis
            subDiagramNode = createNode();
            val modelObject = model.model as EObject;
            subDiagramNode.children += modelObject.eAllContents.map [
                it.translateEObject;
            ].toIterable;
        }
        if (subDiagramNode != null) {
            // prevent adding of rectangle by adding an invisible own one.
            subDiagramNode.addRectangle.invisible = true;

            //Add subdiagram to collapseable child area
            subDiagramParentNode.children += subDiagramNode;
        }
        return node;
    }

    private def KNode translateEObject(EObject object) {
        val node = object.createNode.associateWith(object);

        //create and add colored rectangle for this node
        val figure = node.createFigure;
        figure.background = "white".color;

        //align all text fields in a column.
        figure.setGridPlacement(1);

        //add name of object as text
        figure.addText(object.eClass.name).putToLookUpWith(object) => [
            it.fontSize = 11;
            it.setFontBold(true);
            it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
            it.suppressSelectability;
        ];

        //add all attributes as string representation
        object.eClass.EAllAttributes.filterNull.forEach [
            //add a text with name and value of the attribute
            figure.addText(it.name + ": " + String::valueOf(object.eGet(it))) => [
                it.fontSize = 9;
                it.setGridPlacementData().from(LEFT, 5, 0, TOP, 2, 0).to(RIGHT, 5, 0, BOTTOM, 2, 0);
                it.suppressSelectability;
            ];
        ]

        return node;
    }

    /**
     * Create and adds colored rectangle for given node.
     * Style is taken from SCCharts L&F.
     */
    private def createFigure(KNode node) {

        //Code taken from SCChartDiagramsynthesis
        //val figure = node.addRectangle.background = "gray20".color;
        val figure = node.addRoundedRectangle(8, 8, 1).background = "white".color;
        figure.lineWidth = 1;
        figure.foreground = "gray".color;

        figure.setBackgroundGradient(SCCHARTSBLUE1.copy, SCCHARTSBLUE2.copy, 90);

        //add shadow if option is activated
        figure.shadow = "black".color;
        figure.shadow.XOffset = 4;
        figure.shadow.YOffset = 4;

        //minimal node size is necessary if no text will be added
        node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);
        return figure;
    }
}
