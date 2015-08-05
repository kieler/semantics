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
package de.cau.cs.kieler.kico.klighd.view.model

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
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Diagram synthesis of a {@link EcoreModelWrapper}.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
class EcoreModelSynthesis extends AbstractDiagramSynthesis<EcoreModelWrapper> {

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
    // Constants
    public static val String ID = "de.cau.cs.kieler.kico.klighd.view.model.EcoreModelSynthesis";
    private static val KColor BACKGROUND_COLOR = RENDERING_FACTORY.createKColor() =>
        [red = 255; green = 202; blue = 119];
        private static val KColor SHADOW_COLOR = RENDERING_FACTORY.createKColor() => [it.color = Colors.BLACK];

        // -------------------------------------------------------------------------
        // Synthesis
        override KNode transform(EcoreModelWrapper wrapper) {
            val model = wrapper.model;
            val rootNode = createNode(wrapper);
            // transform root object
            rootNode.children += model.translateEObject
            // transform and connect all succeeding objects
            rootNode.children += model.eAllContents.map [
                val child = it.translateEObject;
                val container = it.eContainer;
                if (container != null) {
                    createEdge => [
                        it.source = container.translateEObject;
                        it.target = child;
                        it.addPolyline.addArrowDecorator;
                    ]
                }
                return child;
            ].toIterable;

            return rootNode;
        }

        private def create node : object.createNode translateEObject(EObject object) {
            node.associateWith(object);
            node.setLayoutOption(KlighdProperties::EXPAND, false);

            val eclass = object.eClass;
            val hasAttributes = !eclass.EAllAttributes.empty
            val hasSuperTypes = !eclass.EAllSuperTypes.empty
            // Expanded Rectangle
            node.createFigure() => [
                it.setProperty(KlighdProperties::EXPANDED_RENDERING, true);
                it.setGridPlacement(1);
                
                // add name of object as text
                it.addText(object.eClass.name).associateWith(object) => [
                    it.fontSize = 11;
                    it.setFontBold(true);
                    it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 4, 0);
                    it.suppressSelectability;
                ];
                
                //collapse button
                it.addText("[Hide]") => [
                    it.foreground = "blue".color
                    it.fontSize = 9
                    it.addSingleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                    it.setGridPlacementData().from(LEFT, 8, 0, TOP, 0, 0).to(RIGHT, 8, 0, BOTTOM, 0, 0);
                ];
                
                if (hasAttributes || hasSuperTypes) {
                    // Add Details
                    it.addRectangle => [
                        it.setGridPlacementData.from(LEFT, 8, 0, TOP, 0, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
                        it.setBackground = "white".color;
                        it.foreground = "gray".color
                        it.lineWidth = 1;
                        it.setGridPlacement(1);
                        
                        // Content
                        val container = it;
                        // add all super types as string representation
                        if (hasSuperTypes) {
                            it.addText("SuperTypes") => [
                                it.foreground = "gray".color;
                                it.fontSize = 8;
                                it.setGridPlacementData().from(LEFT, 5, 0, TOP, 2, 0).to(RIGHT, 5, 0, BOTTOM, 2, 0);
                                it.suppressSelectability;
                            ];
                            eclass.EAllSuperTypes.filterNull.forEach [
                                // add a text with name and value of the attribute
                                container.addText(it.name) => [
                                    it.fontSize = 9;
                                    it.setGridPlacementData().from(LEFT, 5, 0, TOP, 2, 0).to(RIGHT, 5, 0, BOTTOM, 2, 0);
                                    it.suppressSelectability;
                                ];
                            ]
                        }
                        // add all attributes as string representation
                        if (hasAttributes) {
                            if (hasSuperTypes) {
                                it.addHorizontalSeperatorLine(1, 1).foreground = "gray".color;
                            }
                            it.addText("Attributes") => [
                                it.foreground = "gray".color;
                                it.fontSize = 8;
                                it.setGridPlacementData().from(LEFT, 5, 0, TOP, 2, 0).to(RIGHT, 5, 0, BOTTOM, 2, 0);
                                it.suppressSelectability;
                            ];
                            eclass.EAllAttributes.filterNull.forEach [
                                // add a text with name and value of the attribute
                                container.addText(it.name + ": " + String::valueOf(object.eGet(it))) => [
                                    it.fontSize = 9;
                                    it.setGridPlacementData().from(LEFT, 5, 0, TOP, 2, 0).to(RIGHT, 5, 0, BOTTOM, 2, 0);
                                    it.suppressSelectability;
                                ];
                            ]
                        }
                    ];
                }
            ];

            // Collapse Rectangle
            node.createFigure() =>
                [
                    it.setProperty(KlighdProperties::COLLAPSED_RENDERING, true);
                    it.setGridPlacement(1);
                    // add name of object as text
                    it.addText(object.eClass.name).associateWith(object) =>
                        [
                            it.fontSize = 11;
                            it.setFontBold(true);
                            it.setGridPlacementData().from(LEFT, 8, 0, TOP, 8, 0).to(RIGHT, 8, 0, BOTTOM,
                                if(hasAttributes || hasSuperTypes) 4 else 8, 0);
                            it.suppressSelectability;
                        ];
                    if (hasAttributes || hasSuperTypes) {
                        // Add details button
                        it.addText("[Details]") => [
                            it.foreground = "blue".color
                            it.fontSize = 9
                            it.addSingleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                            it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                            it.setGridPlacementData().from(LEFT, 8, 0, TOP, 0, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
                        ];
                    }
                ];
        }

        private def createFigure(KNode node) {
            val figure = node.addRoundedRectangle(8, 8, 1);
            figure.lineWidth = 1;
            figure.foreground = Colors.GRAY;
            figure.background = BACKGROUND_COLOR;

            // add shadow
            // omit shadow to increase performance
            // figure.shadow = SHADOW_COLOR.copy;
            // figure.shadow.XOffset = 4;
            // figure.shadow.YOffset = 4;
            // minimal node size is necessary if no text will be added
            node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);
            figure.background = Colors.GRAY_95;
        }
    }
