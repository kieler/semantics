/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.synthesis

import de.cau.cs.kieler.kicool.ui.synthesis.actions.IntermediateData
import de.cau.cs.kieler.kicool.ui.synthesis.actions.SelectAdditionalIntermediateAction
import de.cau.cs.kieler.kicool.ui.synthesis.actions.SelectIntermediateAction
import de.cau.cs.kieler.klighd.actions.CollapseExpandAction
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.HorizontalAlignment
import de.cau.cs.kieler.klighd.krendering.KBackground
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KGridPlacement
import de.cau.cs.kieler.klighd.krendering.KPolygon
import de.cau.cs.kieler.klighd.krendering.KPolyline
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.LineCap
import de.cau.cs.kieler.klighd.krendering.LineJoin
import de.cau.cs.kieler.klighd.krendering.Trigger
import de.cau.cs.kieler.klighd.krendering.VerticalAlignment
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.PositionReferenceX
import de.cau.cs.kieler.klighd.krendering.extensions.PositionReferenceY
import de.cau.cs.kieler.klighd.util.KlighdProperties
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

import static de.cau.cs.kieler.kicool.ui.synthesis.styles.ColorStore.Color.*

import static extension de.cau.cs.kieler.kicool.ui.synthesis.styles.ColorStore.*
import static extension de.cau.cs.kieler.klighd.microlayout.PlacementUtil.*
import org.eclipse.elk.core.math.KVector

/**
 * User-defined KiCool synthesis styles
 * 
 * @author ssm
 * @kieler.design 2016-10-20 proposed 
 * @kieler.rating 2016-10-20 proposed yellow
 */
@ViewSynthesisShared
class ProcessorStyles {

    extension KRenderingExtensions = new KRenderingExtensions

    extension KRenderingFactory = KRenderingFactory::eINSTANCE
    
    static val IProperty<Boolean> SELECTED = new Property<Boolean>("de.cau.cs.kieler.kicool.ui.intermediateSelected", false);
    static val IProperty<KBackground> BACKGROUND = new Property<KBackground>("de.cau.cs.kieler.kicool.ui.intermediateBackground", null);

    def adjustSize(KNode processorNode) {
        val container = processorNode.getProperty(KNodeProperties.PROCESSOR_INTERMEDIATE_CONTAINER)
        var width = processorNode.eAllContents.filter(KText).head.estimateTextSize.width + 8
        processorNode.height = processorNode.eAllContents.filter(KText).head.estimateTextSize.height + 8
        if ((width - 3) %6 != 0) {
            width += 6 - (width-3) % 6
        }
        val placement = container.childPlacement;
        val numColumns = Math.max(11, container.children.size)
        width = Math.max((numColumns) * 6 + 3, width)
        (placement as KGridPlacement).numColumns = ((width - 3) / 6) as int
        //processorNode.width = width - 1
        //processorNode.setProperty(CoreOptions::NODE_SIZE_MINIMUM, new KVector(width - 1, processorNode.height))
    }
    
    def KNode addGroupFigure(KNode node) {
        node.addRoundedRectangle(1.5f, 1.5f) => [
            id = "collapsed"
            setProperty(KlighdProperties::COLLAPSED_RENDERING, true)
            setProperty(KlighdProperties::EXPANDED_RENDERING, false)
            lineWidth = 1.5f
            foreground = Colors.GRAY
            setBackgroundGradient(Colors.GRAY, 255, Colors.GRAY_57, 243, 90)
            addAction(Trigger::DOUBLECLICK, CollapseExpandAction.ID)
            children += createKText => [
                setPointPlacementData.referencePoint = createKPosition(PositionReferenceX.LEFT, 2, 0,
                    PositionReferenceY.TOP, 1, 0)
                fontSize = 3
                foreground = Colors.BLACK
                setBackground(Colors.WHITE, 0)
                text = "ID"
                addAction(Trigger::DOUBLECLICK, CollapseExpandAction.ID)
            ]
        ]
        node.addRoundedRectangle(1.5f, 1.5f) => [
            id = "expanded"
            setProperty(KlighdProperties::COLLAPSED_RENDERING, false)
            setProperty(KlighdProperties::EXPANDED_RENDERING, true)
            lineWidth = 1f
            foreground = Colors.GRAY
            setBackgroundGradient(Colors.GRAY, 255, Colors.GRAY_57, 243, 90)
            addAction(Trigger::DOUBLECLICK, CollapseExpandAction.ID)
            children += createKText => [
                setPointPlacementData.referencePoint = createKPosition(PositionReferenceX.LEFT, 2, 0,
                    PositionReferenceY.TOP, 1, 0)
                fontSize = 3
                foreground = Colors.BLACK
                setBackground(Colors.WHITE, 0)
                text = "ID"
                addAction(Trigger::DOUBLECLICK, CollapseExpandAction.ID)
            ]
        ]
        node
    }

    def KNode addProcessorFigure(KNode node, boolean onOffButton) {
        node.addRoundedRectangle(2.5f, 2.5f) => [
            foreground = Colors.GRAY
            setBackgroundGradient(createKColor => [
                red = 205
                green = 220
                blue = 222
            ], 243, createKColor => [
                red = 224
                green = 225
                blue = 234
            ], 255, 90)
            children += createKText => [
                setPointPlacementData.referencePoint = createKPosition(PositionReferenceX.LEFT, 2, 0, PositionReferenceY.TOP, 1, 0)
                setProperty(CoreOptions::NO_LAYOUT, true)
                setProperty(KlighdProperties::NOT_SELECTABLE, true)
                fontName = "Arial"
                fontSize = 5
                verticalAlignment = VerticalAlignment.TOP
                horizontalAlignment = HorizontalAlignment.LEFT
            ]
            children += createKRectangle => [
                invisible = true
                childPlacement = createKGridPlacement => [
                    topLeft = createKPosition(PositionReferenceX.LEFT, 2, 0, PositionReferenceY.BOTTOM, 7f, 0)
                    bottomRight = createKPosition(PositionReferenceX.RIGHT, 2, 0, PositionReferenceY.BOTTOM, 2, 0)
                ]
                children += createKRectangle => [
                    node.setProperty(KNodeProperties.PROCESSOR_INTERMEDIATE_CONTAINER, it)
                    lineWidth = 0.33f
                    foreground = Colors.GRAY
                    setBackgroundGradient(createKColor => [
                        red = 205
                        green = 220
                        blue = 222
                    ], 243, createKColor => [
                        red = 224
                        green = 225
                        blue = 234
                    ], 255, 90)
                    childPlacement = createKGridPlacement => [
                        numColumns = 11
                        topLeft = createKPosition(PositionReferenceX.LEFT, 0.33f, 0, PositionReferenceY.TOP, 0.33f, 0)
                        bottomRight = createKPosition(PositionReferenceX.RIGHT, 0.33f, 0, PositionReferenceY.BOTTOM,
                            0.33f, 0)
                    ]
                ]
            ]
            if (onOffButton) {
                children += createKRectangle => [
                    invisible = true
                    childPlacement = createKGridPlacement => [
                        topLeft = createKPosition(PositionReferenceX.RIGHT, 6, 0, PositionReferenceY.TOP, 2, 0)
                        bottomRight = createKPosition(PositionReferenceX.RIGHT, 2, 0, PositionReferenceY.TOP, 6, 0)
                    ]
                    children += createKRoundedRectangle => [
                        cornerWidth = 0.5f;
                        cornerHeight = 0.5f;
                        node.setProperty(KNodeProperties.PROCESSOR_ON_OFF_BUTTON, it)
                        lineWidth = 0.22f
                        foreground = Colors.GRAY
                        setBackgroundGradient(createKColor => [
                            red = 205
                            green = 220
                            blue = 222
                        ], 243, createKColor => [
                            red = 224
                            green = 225
                            blue = 234
                        ], 255, 90)
                        childPlacement = createKGridPlacement => [
                            topLeft = createKPosition(PositionReferenceX.LEFT, 0, 0.2f, PositionReferenceY.TOP, 0, 0.2f)
                            bottomRight = createKPosition(PositionReferenceX.RIGHT, 0, 0.2f, PositionReferenceY.BOTTOM,
                                0, 0.2f)
                        ]
                        children += createKEllipse => [
                            lineWidth = 0.22f
                            foreground = Colors.GREEN
                            background = Colors.GREEN
                        ]
                    ]
                ]
            }
        ]
        node
    }

    def KRendering addIntermediateModel(KNode node, IntermediateData data, Object model) {
        val container = node.getProperty(KNodeProperties.PROCESSOR_INTERMEDIATE_CONTAINER)
        // Work around for a klighd bug
        //container.setProperty(GridPlacementUtil.ESTIMATED_GRID_DATA, null);
        val wrongKlighdProperty = container.properties.filter[it.key.id == "klighd.grid.estimatedGridData"].head
        if (wrongKlighdProperty !== null) {
            wrongKlighdProperty.value = null;
        }
        // Work around end
        container.children += createKRectangle => [
            setGridPlacementData(5, 4) => [
                if (container.children.size > 0) {
                    from(PositionReferenceX.LEFT, 1, 0, PositionReferenceY.TOP, 0, 0)
                    minCellWidth = 6
                }
                flexibleWidth = false
                flexibleHeight = false
            ]
            lineWidth = 0
            setForeground(createKColor => [
                red = 255
                green = 255
                blue = 255
            ], 255)
            setBackgroundGradient(createKColor => [
                red = 100
                green = 100
                blue = 255
            ], 255, createKColor => [
                red = 128
                green = 128
                blue = 255
            ], 255, 45)
            addAction(Trigger::SINGLECLICK, SelectAdditionalIntermediateAction.ID, false, true, false)
            addAction(Trigger::SINGLECLICK, SelectAdditionalIntermediateAction.ID, false, false, true)
            addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID, false, false, false)
            setProperty(KNodeProperties.INTERMEDIATE_DATA, new IntermediateData(
                data.processor,
                data.compilationContext,
                model,
                data.view,
                container.children.size + 1,
                data.parentNode
            ))
        ]
        node.adjustSize
        container.children.last
    }

    def setSelected(KRendering rendering, boolean selected) {
        if (rendering.getProperty(SELECTED) == selected) {
            return
        }
        rendering.setProperty(SELECTED, selected)
        rendering.lineWidth = if(selected) 0.4f else 0
        if (selected) {
            rendering.setProperty(BACKGROUND, rendering.background)
            rendering.setBackgroundGradient(createKColor => [
                red = Math.min(255, rendering.background.color.red + 30)
                green = Math.min(255, rendering.background.color.green + 30)
                blue = Math.min(255, rendering.background.color.blue + 30)
            ], 255, createKColor => [
                red = Math.min(255, rendering.background.targetColor.red + 30)
                green = Math.min(255, rendering.background.targetColor.green + 30)
                blue = Math.min(255, rendering.background.targetColor.blue + 30)
            ], 255, 45)
        } else {
            rendering.background = rendering.getProperty(BACKGROUND)
        }
    }

    def addProcessorGroupFigure(KNode node) {
        node.addRoundedRectangle(7, 7, 2) => [
            background = PROCESSORGROUP_BACKGROUND.color;
            foreground = PROCESSORGROUP_FOREGROUND.color;
        ]
        node
    }

    def KRendering addOwnHeadArrowDecorator(KPolyline pl) {
        internalAddArrowDecorator(pl, true)
    }

    def KRendering internalAddArrowDecorator(KPolyline pl, boolean head) {
        pl.lineCap = LineCap::CAP_FLAT
        return pl.drawArrow() => [
            it.placementData = createKDecoratorPlacementData => [
                it.rotateWithLine = true;
                it.relative = if(head) 1f else 0f;
                it.absolute = if(head) -2f else 2f;
                it.width = 6;
                it.height = 4;
                it.setXOffset(if(head) -4f else 6f); // chsch: used the regular way here and below, as the alias 
                it.setYOffset(if(head) -2f else 3f); // name translation convention changed from Xtext 2.3 to 2.4.
            ];
            if(!head) it.rotation = 180f
        ];
    }

    def KPolygon drawArrow(KContainerRendering cr) {
        return createKPolygon => [
            cr.addChild(it).withCopyOf(cr.lineWidth).withCopyOf(cr.foreground).setBackground(cr.foreground).setLineJoin(
                LineJoin::JOIN_ROUND);
            it.points += createKPosition(PositionReferenceX::LEFT, 0, 0, PositionReferenceY::TOP, 0, 0);
            it.points += createKPosition(PositionReferenceX::LEFT, 0, 0.66f, PositionReferenceY::TOP, 0, 0.5f);
            it.points += createKPosition(PositionReferenceX::LEFT, 0, 0, PositionReferenceY::BOTTOM, 0, 0);
            it.points += createKPosition(PositionReferenceX::RIGHT, 0, 0, PositionReferenceY::BOTTOM, 0, 0.5f);
        ];
    }

    def <T extends KRendering> T addChild(KContainerRendering parent, T child) {
        return child => [
            parent.children.add(it);
        ];
    }
}
