/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.styles

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KForeground
import de.cau.cs.kieler.klighd.krendering.KGridPlacement
import de.cau.cs.kieler.klighd.krendering.KRectangle
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.Underline
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.extensions.TextFormat
import java.util.List
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

import static de.cau.cs.kieler.sccharts.ui.synthesis.styles.ColorStore.Color.*

import static extension de.cau.cs.kieler.klighd.microlayout.PlacementUtil.*
import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Styles for {@link ControlflowRegion}.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class ControlflowRegionStyles {

    @Inject extension KNodeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension StateStyles
    @Inject extension ColorStore

    /** This property is set on the expanded rendering and points to the container holding the declaration labels */
    public static final IProperty<KContainerRendering> DECLARATIONS_CONTAINER = new Property<KContainerRendering>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.style.region.declarations", null);
    /** This property is set on the expanded rendering and points to the container holding the action labels */
    public static final IProperty<KContainerRendering> ACTIONS_CONTAINER = new Property<KContainerRendering>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.style.region.actions", null);
        
    /**
     * Adds a region figure.
     */
    def KRectangle addRegionFigure(KNode node) {
        node.addRectangle() => [
            background = REGION_BACKGROUND.color;
            foreground = REGION_FOREGROUND.color;
            lineWidth = 1;
            setSurroundingSpace(2, 0);
        ]
    }
    
    def KRectangle addOverrideRegionStyle(KRectangle rect) {
        return rect => [
            background = REGION_OVERRIDE_BACKGROUND.color
            foreground = REGION_OVERRIDE_FOREGROUND.color
            lineWidth = 1.3f;
        ]
    }
       
    def KRectangle addAbortRegionStyle(KRectangle rect) {
        return rect => [
            background = REGION_ABORT_BACKGROUND.color
            foreground = REGION_ABORT_FOREGROUND.color
            lineWidth = 1.3f;
        ]
    }
    
    def KRectangle addFinalRegionStyle(KRectangle rect) {
        return rect.addRectangle => [
            background = rect.background.copy
            foreground = rect.foreground.copy
            lineWidth = rect.lineWidthValue;
            setSurroundingSpace(3, 0);
        ]
    }
    
    def KRectangle addPolicyRegionStyle(KRectangle rect) {
        return rect => [
            background = REGION_BACKGROUND.color
            foreground = USER_SCHEDULE_COLOR.color
            lineWidth = 1.3f;
        ]
    }
    
    def KRectangle addMethodFigure(KNode node) {
        return node.addRegionFigure => [
            background = METHOD_BACKGROUND.color
            foreground = METHOD_FOREGROUND.color
            //lineStyle = LineStyle.DASH
        ]
    }
    
    /**
     * Sets the selection style of the region.
     */
    def setSelectionStyle(KNode node) {
        node.data.filter(KRendering).forEach[
            selectionLineWidth = 1.8f;
            selectionForeground = SELECTION.color;
        ]
    }
    
    /**
     * Adds a button with text.
     */
    private def KRendering addRegionButton(KContainerRendering container, String text, List<Pair<? extends CharSequence, TextFormat>> label) {
        val button = container.addPolygon => [
            lineWidth = 0
            background = container.foreground.color.copy
            selectionBackground = SELECTION.color
            addKPosition(LEFT, 0.5f, 0, TOP, 0.5f, 0)
            addKPosition(LEFT, 0.5f, 0, TOP, 19, 0)
            addKPosition(LEFT, 18, 0, TOP, 0.5f, 0)
        ]
        button.addText(text) => [
            suppressSelectability
            foreground = REGION_BUTTON_FOREGROUND.color
            selectionForeground = REGION_BUTTON_FOREGROUND.color
            fontSize = 8;
            fontBold = true
            val size = estimateTextSize;
            setPointPlacementData(LEFT, if (text.equals("-")) 3f else 2f, 0, TOP, 0, 0, H_LEFT, V_TOP, 0, 0, size.width, size.height);
        ]
        if (!label.nullOrEmpty) {
            if (label.size == 1 && label.head.value == TextFormat.TEXT) {
                container.addText(label.head.key.toString) => [
                    suppressSelectability
                    foreground = REGION_LABEL.color;
                    fontSize = 10;
                    selectionTextUnderline = Underline.NONE // prevents default selection style
                    val size = estimateTextSize;
                    setPointPlacementData(LEFT, 14, 0, TOP, 1, 0, H_LEFT, V_TOP, 0, 0, size.width + 5, size.height)
                    setProperty(KlighdProperties.IS_NODE_TITLE, true)
                ]
            } else {
                container.addKeywordLabel(label, 0) => [
                    foreground = REGION_LABEL.color
                    fontSize = 10
                    setPointPlacementData(LEFT, 14, 0, TOP, 1, 0, H_LEFT, V_TOP, 0, 0, 0, 0)
                    setProperty(KlighdProperties.IS_NODE_TITLE, true)
                    (children.last as KContainerRendering) => [ // Just for spacing at the end
                        val grid = it?.getChildPlacement()
                        if (grid instanceof KGridPlacement) {
                            grid.numColumns = grid.numColumns + 1
                            addRectangle => [
                                setGridPlacementData(5,5)
                                invisible = true
                            ]
                        }
                    ]
                    eAllContents.filter(KText).forEach[
                        suppressSelectability
                        selectionTextUnderline = Underline.NONE // prevents default selection style
                        if (!styles.exists[it instanceof KForeground]) {
                            foreground = REGION_LABEL.color
                        }
                    ]
                ]
            }
        }
        return button
    }
    
    /**
     * Adds a region figure similar to {@link addExpandButton()} and {@link addCollapseButton()} but without
     * the button symbol and therefore without the text offset - since proxies for regions shouldn't be expandable
     * or collapsable.
     */
    def KRendering addProxyRegion(KContainerRendering container, List<Pair<? extends CharSequence, TextFormat>> label) {
        if (!label.nullOrEmpty) {
            if (label.size == 1 && label.head.value == TextFormat.TEXT) {
                container.addText(label.head.key.toString) => [
                    suppressSelectability
                    foreground = REGION_LABEL.color;
                    fontSize = 10;
                    selectionTextUnderline = Underline.NONE // prevents default selection style
                    val size = estimateTextSize;
                    setPointPlacementData(LEFT, 1, 0, TOP, 1, 0, H_LEFT, V_TOP, 0, 0, size.width + 5, size.height)
                    setProperty(KlighdProperties.IS_NODE_TITLE, true)
                ]
            } else {
                container.addKeywordLabel(label, 0) => [
                    foreground = REGION_LABEL.color
                    fontSize = 10
                    setPointPlacementData(LEFT, 1, 0, TOP, 1, 0, H_LEFT, V_TOP, 0, 0, 0, 0)
                    setProperty(KlighdProperties.IS_NODE_TITLE, true)
                    (children.last as KContainerRendering) => [ // Just for spacing at the end
                        val grid = it?.getChildPlacement()
                        if (grid instanceof KGridPlacement) {
                            grid.numColumns = grid.numColumns + 1
                            addRectangle => [
                                setGridPlacementData(5,5)
                                invisible = true
                            ]
                        }
                    ]
                    eAllContents.filter(KText).forEach[
                        suppressSelectability
                        selectionTextUnderline = Underline.NONE // prevents default selection style
                        if (!styles.exists[it instanceof KForeground]) {
                            foreground = REGION_LABEL.color
                        }
                    ]
                ]
            }
        }
    }
    
    /**
     * Adds the corresponding region figure to the node,
     * taking its supposed style into account.
     */
    def void addCorrespondingRegionFigure(KRectangle rect, ControlflowRegion region) {
        if (region.override) rect.addOverrideRegionStyle
        if (region.abort) rect.addAbortRegionStyle
        if (region.final) rect.addFinalRegionStyle
    }
    
    /**
     * Adds an expand region button with label.
     */
    def KRendering addExpandButton(KContainerRendering container) {
        return container.addRegionButton("+", null)
    }
    def KRendering addExpandButton(KContainerRendering container, List<Pair<? extends CharSequence, TextFormat>> label) {
        return container.addRegionButton("+", label)
    }
    def KRendering addExpandButton(KContainerRendering container, String label) {
        return container.addRegionButton("+", newArrayList(new Pair(label, TextFormat.TEXT)))
    }
    
    /**
     * Adds a collapse region button with label.
     */
    def KRendering addCollapseButton(KContainerRendering container) {
        return container.addRegionButton("-", null)
    }
    def KRendering addCollapseButton(KContainerRendering container, List<Pair<? extends CharSequence, TextFormat>> label) {
        return container.addRegionButton("-", label)
    }
    def KRendering addCollapseButton(KContainerRendering container, String label) {
        return container.addRegionButton("-", newArrayList(new Pair(label, TextFormat.TEXT)))
    }

    /**
     * Adds an area for inner states.<br>
     * Incompatible with {@link addStatesAndDeclarationsArea}.
     */
    def addStatesArea(KContainerRendering container, boolean useHeaderSpace) {
        container.addChildArea() => [
            // SubGraph padding
            container.containerNode.addLayoutParam(CoreOptions.PADDING, 
                new ElkPadding(if (useHeaderSpace) 20 else 10, 10, 10, 10))
        ]
    }

    /**
     * Adds an area for inner states and a container for declarations.<br>
     * Incompatible with {@link addStatesArea}.
     */
    def addStatesAndDeclarationsAndActionsArea(KContainerRendering container, boolean useHeaderSpace, boolean horizontal) {
        container.addRectangle => [
            invisible = true
            setGridPlacement(if (horizontal) 2 else 1)
            // Declarations Area
            addRectangle => [
                setGridPlacementData().from(LEFT, 3, 0, TOP, 20, 0).to(RIGHT, 8, 0, BOTTOM, 0, 0)
                invisible = true
                addRectangle => [
                    gridPlacement = 1
                    invisible = true
                    addRectangle => [
                        setPointPlacementData(createKPosition(LEFT, 0, 0, TOP, 0, 0), H_LEFT, V_TOP, 0, 0, 0, 0);
                        invisible = true
                        setGridPlacement(1)
                        container.setProperty(DECLARATIONS_CONTAINER, it)
                    ]
                    addRectangle => [
                        setPointPlacementData(createKPosition(LEFT, 0, 0, TOP, 0, 0), H_LEFT, V_TOP, 0, 0, 0, 0);
                        invisible = true
                        setGridPlacement(1)
                        container.setProperty(ACTIONS_CONTAINER, it)
                    ]
                ]
            ]
            // States Area
            addChildArea()
            // SubGraph padding
            container.containerNode.addLayoutParam(CoreOptions.PADDING, 
                new ElkPadding(if (useHeaderSpace && horizontal) 20 else 10, 10, 10, 10))
        ]
    }

    /**
     * Adds a label in declaration style with the given components.<br>
     * The first part will be highlighted as keywords.
     */
    def KRectangle addDeclarationLabel(KContainerRendering container, List<Pair<? extends CharSequence, TextFormat>> components) {
        container.getProperty(DECLARATIONS_CONTAINER)?.addKeywordLabel(components, 0);
    }
    
    /**
     * Adds a label in declaration style with the given components.<br>
     * The first part will be highlighted as keywords.
     */
    def KRectangle addActionLabel(KContainerRendering container, List<Pair<? extends CharSequence, TextFormat>> components) {
        container.getProperty(ACTIONS_CONTAINER)?.addKeywordLabel(components, 0);
    }
    
    /** 
     * Retrieves the extended container for the region.
     */
    def getRegionExtendedContainer(KNode node) {
        return node.data.filter(KContainerRendering).filter [
            getProperty(KlighdProperties.EXPANDED_RENDERING)
        ].head;
    }
    
    /**
     * Finds the eContainer KNode
     */
    private def KNode getContainerNode(KRendering rendering) {
        var container = rendering.eContainer
        while (container !== null) {
            if (container instanceof KNode) {
                return container
            }
        }
        return null
    }
    
    def KRectangle setUserScheduleStyle(KRectangle krendering) {
        krendering.foreground = USER_SCHEDULE_COLOR.color
    }
}