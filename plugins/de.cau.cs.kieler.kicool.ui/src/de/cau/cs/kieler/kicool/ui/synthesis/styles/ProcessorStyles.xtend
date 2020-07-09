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
package de.cau.cs.kieler.kicool.ui.synthesis.styles

import com.google.inject.Binder
import com.google.inject.Guice
import com.google.inject.Inject
import com.google.inject.Injector
import com.google.inject.Module
import com.google.inject.Scopes
import de.cau.cs.kieler.kicool.ui.synthesis.KNodeProperties
import de.cau.cs.kieler.kicool.ui.synthesis.ProcessorSynthesis
import de.cau.cs.kieler.kicool.ui.synthesis.actions.IntermediateData
import de.cau.cs.kieler.kicool.ui.synthesis.actions.SelectAdditionalIntermediateAction
import de.cau.cs.kieler.kicool.ui.synthesis.actions.SelectIntermediateAction
import de.cau.cs.kieler.klighd.actions.CollapseExpandAction
import de.cau.cs.kieler.klighd.kgraph.KEdge
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
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
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
import de.cau.cs.kieler.klighd.krendering.KDecoratorPlacementData
import de.cau.cs.kieler.klighd.krendering.Underline
import org.eclipse.core.internal.resources.AliasManager.AddToCollectionDoit
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.kicool.ui.KiCoolUiModule
import de.cau.cs.kieler.klighd.krendering.KImage

/**
 * User-defined KiCool synthesis styles
 * 
 * @author ssm
 * @kieler.design 2016-10-20 proposed 
 * @kieler.rating 2016-10-20 proposed yellow
 */
@ViewSynthesisShared
class ProcessorStyles {
    
    @Inject Injector injector
    @Inject extension KRenderingExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KContainerRenderingExtensions
    extension KRenderingFactory = KRenderingFactory::eINSTANCE
    
    public static val COMPATIBILITY_ERROR_ICON = "lightning.png"
    public static val INTERMEDIATE_INSPECTION_ICON = "eye.png"
    static val IProperty<Boolean> SELECTED = new Property<Boolean>("de.cau.cs.kieler.kicool.ui.intermediateSelected", false)
    static val IProperty<KBackground> BACKGROUND = new Property<KBackground>("de.cau.cs.kieler.kicool.ui.intermediateBackground", null)
    
    new(){
        if (injector === null) {
            Guice.createInjector(new Module() {
                // This Module is created to satisfy ViewSynthesisShared scope of used synthesis-extensions
                override configure(Binder binder) {
                    binder.bindScope(ViewSynthesisShared, Scopes.SINGLETON);
                }
            }).injectMembers(this)
        }
    }

    def setDefaultProcessorSize(KNode node) {
        node.width = 50
        node.height = 16.5f
    }
    
    def adjustSize(KNode processorNode) {
        val container = processorNode.getProperty(KNodeProperties.PROCESSOR_INTERMEDIATE_CONTAINER)
        var width = processorNode.eAllContents.filter(KText).head.estimateTextSize.width + 8
        processorNode.height = processorNode.eAllContents.filter(KText).head.estimateTextSize.height + 8
        if ((width - 3) % 6 != 0) {
            width += 6 - (width-3) % 6
        }
        val placement = container.childPlacement;
        val numColumns = Math.max(11, container.children.size)
        width = Math.max((numColumns) * 6 + 3, width)
        (placement as KGridPlacement).numColumns = ((width - 3) / 6) as int
    }
    
    def addSourceRendering(KNode node) {
        node.addRoundedRectangle(10, 10) => [
            foreground = PROCESSOR_FOREGROUND.color
            setBackgroundGradient(PROCESSOR_BACKGROUND.color, 255, PROCESSOR_BACKGROUND_TARGET.color, 243, 90)
            defaultSelectionStyle
        ]
        node
    }
    

    def KNode addProcessorFigure(KNode node, boolean onOffButton) {
        node.addRoundedRectangle(2.5f, 2.5f) => [
            foreground = PROCESSOR_FOREGROUND.color
            setBackgroundGradient(PROCESSOR_BACKGROUND.color, 255, PROCESSOR_BACKGROUND_TARGET.color, 243, 90)
            defaultSelectionStyle
            children += createKText => [
                setPointPlacementData.referencePoint = createKPosition(PositionReferenceX.LEFT, 1, 0, PositionReferenceY.TOP, 1, 0)
                setSurroundingSpace(3, 0, 1, 0)
                noSelectionStyle
                setProperty(CoreOptions::NO_LAYOUT, true)
                setProperty(KlighdProperties::NOT_SELECTABLE, true)
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
                    foreground = PROCESSOR_FOREGROUND.color
                    setBackgroundGradient(PROCESSOR_BACKGROUND.color, 243, PROCESSOR_BACKGROUND_TARGET.color, 255, 90)
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
                        foreground = PROCESSOR_FOREGROUND.color
                        setBackgroundGradient(PROCESSOR_BACKGROUND.color, 243, PROCESSOR_BACKGROUND_TARGET.color, 255, 90)
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
    
    def KNode addGroupFigure(KNode node) {
        node.addRoundedRectangle(1.5f, 1.5f) => [
            id = ProcessorSynthesis.COLLAPSED_ID
            setProperty(KlighdProperties::COLLAPSED_RENDERING, true)
            setProperty(KlighdProperties::EXPANDED_RENDERING, false)
            lineWidth = 1.5f
            foreground = PROCESSORGROUP_FOREGROUND.color
            setBackgroundGradient(PROCESSORGROUP_BACKGROUND.color, 135, PROCESSORGROUP_BACKGROUND_TARGET.color, 123, 90)
            noSelectionStyle
            addAction(Trigger::DOUBLECLICK, CollapseExpandAction.ID)
            children += createKText => [
                setSurroundingSpace(4, 0, 2, 0)
                noSelectionStyle
                fontSize = 4
                fontItalic = true
                text = "ID"
                addAction(Trigger::DOUBLECLICK, CollapseExpandAction.ID)
            ]
        ]
        node.addRoundedRectangle(1.5f, 1.5f) => [
            id = ProcessorSynthesis.EXPANDED_ID
            setProperty(KlighdProperties::COLLAPSED_RENDERING, false)
            setProperty(KlighdProperties::EXPANDED_RENDERING, true)
            lineWidth = 1f
            foreground = PROCESSORGROUP_FOREGROUND.color
            setBackgroundGradient(PROCESSORGROUP_BACKGROUND.color, 135, PROCESSORGROUP_BACKGROUND_TARGET.color, 123, 90)
            noSelectionStyle
            addAction(Trigger::DOUBLECLICK, CollapseExpandAction.ID)
            
            gridPlacement = 1
            children += createKText => [
                setGridPlacementData().from(LEFT, 4, 0, TOP, 2, 0).to(RIGHT, 4, 0, BOTTOM, 2, 0)
                noSelectionStyle
                fontSize = 4
                fontItalic = true
                text = "ID"
                addAction(Trigger::DOUBLECLICK, CollapseExpandAction.ID)
            ]
            addChildArea => [
                setGridPlacementData().from(LEFT, 4, 0, TOP, 0, 0).to(RIGHT, 4, 0, BOTTOM, 4, 0)
            ]
        ]
        node
    }
    
    def addConnectionFigure(KEdge edge) {
        edge.addRoundedBendsPolyline(2.55f) => [
            foreground = PROCESSOR_FOREGROUND.color
            noSelectionStyle
            addHeadArrowDecorator() => [
                foreground = PROCESSOR_FOREGROUND.color;
                (placementData as KDecoratorPlacementData) => [
                    width = 4
                    absolute = -4
                    height = 3
                    XOffset = 0f
                    YOffset = -1.5f
                ]
            ]
        ]
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
        rendering.lineWidth = if(selected) 0.5f else 0
        rendering.foreground = SELECTION.color
        if (selected) {
            rendering.setProperty(BACKGROUND, rendering.background)
//            rendering.setBackgroundGradient(createKColor => [
//                red = Math.min(255, rendering.background.color.red + 30)
//                green = Math.min(255, rendering.background.color.green + 30)
//                blue = Math.min(255, rendering.background.color.blue + 30)
//            ], 255, createKColor => [
//                red = Math.min(255, rendering.background.targetColor.red + 30)
//                green = Math.min(255, rendering.background.targetColor.green + 30)
//                blue = Math.min(255, rendering.background.targetColor.blue + 30)
//            ], 255, 45)
            if (rendering instanceof KContainerRendering) {
                rendering.addImage(KiCoolUiModule.BUNDLE_ID, KiCoolUiModule.ICON_PATH + INTERMEDIATE_INSPECTION_ICON) => [
                    setAreaPlacementData(
                        createKPosition(LEFT, 0.5f, 0, TOP, 0.7f, 0),
                        createKPosition(RIGHT, 0.5f, 0, BOTTOM, 0.5f, 0)
                    )
                    noSelectionStyle
                ]
            }
        } else {
            rendering.background = rendering.getProperty(BACKGROUND)
            if (rendering instanceof KContainerRendering) {
                rendering.children.removeIf[it instanceof KImage]
            }
        }
    }

    def addProcessorGroupFigure(KNode node) {
        node.addRoundedRectangle(7, 7, 2) => [
            background = PROCESSORGROUP_BACKGROUND.color;
            foreground = PROCESSORGROUP_FOREGROUND.color;
        ]
        node
    }
    
    def void addIncompatibilityEdgeDecorator(KContainerRendering rendering) {
        rendering.addImage(KiCoolUiModule.BUNDLE_ID, KiCoolUiModule.ICON_PATH + COMPATIBILITY_ERROR_ICON) => [
            placementData = createKDecoratorPlacementData => [
                rotateWithLine = false
                relative = 0.5f
                width = 6
                height = 10
                setXOffset = -2
                setYOffset = -5
            ]              
        ]
    }

    def <T extends KRendering> T addChild(KContainerRendering parent, T child) {
        return child => [
            parent.children.add(it);
        ];
    }
    
    def noSelectionStyle(KRendering r) {
        r.selectionTextStrikeout = false // prevents default selection style
    }
    
    def defaultSelectionStyle(KRendering r) {
        r.selectionLineWidth = 1.1f
        r.selectionForeground = SELECTION.color
    }
        
    def underlineSelectionStyle(KRendering r) {
        r.selectionTextUnderline = Underline.SINGLE
    }
}
