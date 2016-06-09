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
package de.cau.cs.kieler.sccharts.klighd.synthesis.styles

import com.google.common.base.Joiner
import com.google.inject.Inject
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.KRectangle
import de.cau.cs.kieler.core.krendering.KRoundedRectangle
import de.cau.cs.kieler.core.krendering.KText
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.sccharts.State
import java.util.List

import static de.cau.cs.kieler.sccharts.klighd.synthesis.styles.ColorStore.Color.*

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Styles for {@link State}.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class StateStyles {

    @Inject
    extension KNodeExtensions

    @Inject
    extension KRenderingExtensions

    @Inject
    extension KContainerRenderingExtensions

    @Inject
    extension ColorStore
    
    /** This property is set a rendering and indicates the content container */
    public static final IProperty<Boolean> IS_CONTENT_CONTAINER = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.style.state.content", false);
    /** This property is set a rendering and indicates the redering is not visible and only present for layout purpose */
    public static final IProperty<Boolean> IS_LAYOUT_ELEMENT = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.style.layout", false);
    /** This property is set on the content container rendering and points to the container holding the action labels */
    public static final IProperty<KContainerRendering> ACTIONS_CONTAINER = new Property<KContainerRendering>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.style.state.actions", null);
    /** This property is set on the content container rendering and points to the container holding the declaration labels */
    public static final IProperty<KContainerRendering> DECLARATIONS_CONTAINER = new Property<KContainerRendering>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.style.state.declarations", null);

    private var baseLineWidth = 1;
    
    /**
     * Adds a connector figure.
     */
    def KRoundedRectangle addConnectorFigure(KNode node) {
        node.setNodeSize(7, 7);
        node.addRoundedRectangle(7, 7, baseLineWidth) => [
            background = STATE_CONNECTOR.color;
            foreground = STATE_CONNECTOR.color;
        ]
    }

    /**
     * Adds a small state figure.
     */
    def KRoundedRectangle addDefaultFigure(KNode node) {
        node.setMinimalNodeSize(34, 34); // 2 x corner radius
        node.addRoundedRectangle(17, 17, baseLineWidth) => [
            // Mark this figure as container for further content
            setProperty(IS_CONTENT_CONTAINER, true);
            setBackgroundGradient(STATE_BACKGROUND_GRADIENT_1.color, STATE_BACKGROUND_GRADIENT_2.color, 90);
            foreground = STATE_FOREGROND.color;
        ]
    }

    /**
     * Adds a macro state figure.
     */
    def KRoundedRectangle addMacroFigure(KNode node) {
        node.setMinimalNodeSize(34, 34); // same as default figure
        node.addRoundedRectangle(8, 8, baseLineWidth) => [
            // Mark this figure as container for further content
            setProperty(IS_CONTENT_CONTAINER, true);
            setBackgroundGradient(STATE_BACKGROUND_GRADIENT_1.color, STATE_BACKGROUND_GRADIENT_2.color, 90);
            foreground = STATE_FOREGROND.color;
            setGridPlacement(1);
        ]
    }

    /**
     * Sets the style of an existing figure to immediate.
     */
    def setInitialStyle(KNode node) {
        node.getKContainerRendering => [
            lineWidth = baseLineWidth + 2;
            foreground = STATE_INITIAL_FOREGROND.color;
        ]
    }

    /**
     * Sets the style of an existing figure to final.
     */
    def setFinalStyle(KNode node) {
        // Add an additional rectangle to achieve the double line
        val outer = node.getKContainerRendering as KRoundedRectangle;
        val inner = outer.copy;
        val offset = outer.lineWidthValue + if(outer.lineWidthValue == baseLineWidth) 2 else 1;
        outer => [
            // This figure is no longer the container for content
            setProperty(IS_CONTENT_CONTAINER, false);
            setCornerSize(offset + cornerWidth, offset + cornerHeight);
            // Update minimal node size according to new corner radius (corner radius x 2)
            node.setMinimalNodeSize(cornerWidth * 2, cornerHeight * 2);
            background = STATE_FINAL_FOREGROND_BACKGROUND.color;
            foreground = STATE_FIANL_FOREGROND.color;
            // Add grid placement to correctly use offsets
            setGridPlacement(1);
            children += inner
        ]
        inner => [
            lineWidth = baseLineWidth;
            foreground = STATE_FIANL_FOREGROND.color;
            // Add surrounding space (white border)
            setGridPlacementData().from(LEFT, offset, 0, TOP, offset, 0).to(RIGHT, offset, 0, BOTTOM, offset, 0);
        ]
    }

    /**
     * Sets the style of an existing figure to referenced.
     */
    def setReferencedStyle(KNode node) {
        return node.contentContainer => [
            setBackgroundGradient(STATE_REFERENCED_BACKGROUND_GRADIENT_1.color, STATE_REFERENCED_BACKGROUND_GRADIENT_2.color, 90.0f);
        ]
    }

    /**
     * Add a shadow to an existing figure.
     */
    def setShadowStyle(KNode node) {
        node.getKContainerRendering.setShadow(STATE_SHADOW.color, 4, 4);
    }

    /**
     * Adds a title label to a simple state figure.
     */
    def KText addSimpleStateLabel(KNode node, String text) {
        node.addMacroStateLabel(text) => [
            fontBold = true;
        ]
    }

    /**
     * Adds a title label to a macro state figure.
     */
    def KText addMacroStateLabel(KNode node, String text) {
        node.contentContainer.addText(text) => [
            fontSize = 11;
            // Add surrounding space
            setGridPlacementData().from(LEFT, 10, 0, TOP, 8, 0).to(RIGHT, 10, 0, BOTTOM, 8, 0);
        ]
    }

    /**
     * Adds a label in declaration style with the given components to a macro state.<br>
     * The first part will be highlighted as keywords.
     */
    def KRectangle addActionLabel(KNode node, Pair<List<String>, List<String>> components) {
        node.actionsContainer.addKeywordLabel(components);
    }

    /**
     * Adds a label in action style with the given components to a macro state.<br>
     * The first part will be highlighted as keywords.
     */
    def KRectangle addDeclarationLabel(KNode node, Pair<List<String>, List<String>> components) {
        return node.declarationsContainer.addKeywordLabel(components);
    }

    /**
     * Creates a text with highlighted keywords.
     */
    package def addKeywordLabel(KContainerRendering container, Pair<List<String>, List<String>> components) {
        return container.addRectangle() => [
            // This additional rectangle allows left align in grid placement
            invisible = true
            setProperty(IS_LAYOUT_ELEMENT, true)
            addRectangle() => [
                invisible = true;
                // Add left alignment
                setPointPlacementData(createKPosition(LEFT, 0, 0, TOP, 0, 0), H_LEFT, V_TOP, 0, 0, 0, 0);
                setGridPlacement(2);
                val joiner = Joiner.on(" ");
                addText(joiner.join(components.key) + " ") => [
                    foreground = KEYWORD.color;
                    fontBold = true;
                ]
                addText(joiner.join(components.value));
            ]
        ]
    }

    /**
     * Add a child area to a macro state
     */
    def addRegionsArea(KNode node) {
        node.contentContainer.addChildArea().setGridPlacementData() => [
            from(LEFT, 5, 0, TOP, -4, 0).to(RIGHT, 5, 0, BOTTOM, 5, 0)
            minCellHeight = 5;
            minCellWidth = 5;
        ]
    }

    /**
     * Returns the content container of a state figure.
     */
    def getContentContainer(KNode node) {
        var KContainerRendering figure = node.getKContainerRendering;
        while (figure != null) {
            if (figure.getProperty(IS_CONTENT_CONTAINER)) {
                return figure;
            } else {
                figure = figure.children.findFirst[it instanceof KContainerRendering] as KContainerRendering;
            }
        }
        return null
    }

    /**
     * Returns the actions container of a state figure.<br>
     * Creates the container if it does not exist!
     */
    private def getActionsContainer(KNode node) {
        val content = node.contentContainer;
        var container = content.getProperty(ACTIONS_CONTAINER);
        if (container == null) {
            container = content.addInvisibleContainer;
            content.setProperty(ACTIONS_CONTAINER, container);
        }
        return container;
    }

    /**
     * Returns the declarations container of a state figure.<br>
     * Creates the container if it does not exist!
     */
    private def getDeclarationsContainer(KNode node) {
        val content = node.contentContainer;
        var container = content.getProperty(DECLARATIONS_CONTAINER);
        if (container == null) {
            container = content.addInvisibleContainer;
            content.setProperty(DECLARATIONS_CONTAINER, container);
        }
        return container;
    }

    /**
     * Adds an invisible container to the given parent container, assuming grid layout.
     */
    private def addInvisibleContainer(KContainerRendering container) {
        container.addRectangle => [
            invisible = true;
            setGridPlacement(1);
            setGridPlacementData().from(LEFT, 8, 0, TOP, -4, 0).to(RIGHT, 8, 0, BOTTOM, 6, 0);
        ]
    }
    
    /**
     * Sets the base line width
     */
     def setBaseLineWidth(int width) {
         baseLineWidth = width;
     }
}