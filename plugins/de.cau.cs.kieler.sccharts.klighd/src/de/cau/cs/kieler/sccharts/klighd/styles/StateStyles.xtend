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
package de.cau.cs.kieler.sccharts.klighd.styles

import com.google.common.base.Joiner
import com.google.inject.Inject
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.KRectangle
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.KRoundedRectangle
import de.cau.cs.kieler.core.krendering.KText
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import java.util.List

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
class StateStyles {

    // -------------------------------------------------------------------------
    // Extensions 
    @Inject
    extension KNodeExtensions

    @Inject
    extension KRenderingExtensions

    @Inject
    extension KContainerRenderingExtensions

    @Inject
    extension KColorExtensions

    private static final IProperty<Boolean> IS_CONTENT_CONTAINER = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.state.content", false);
    private static final IProperty<KContainerRendering> ACTIONS_CONTAINER = new Property<KContainerRendering>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.state.actions", null);
    private static final IProperty<KContainerRendering> DECLARATIONS_CONTAINER = new Property<KContainerRendering>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.state.declarations", null);

    val baseLineWidth = 1; // TODO PAPER BW +1
    private static val KRenderingFactory RENDERING_FACTORY = KRenderingFactory.eINSTANCE;

    private static val KColor SCCHARTSBLUE1 = RENDERING_FACTORY.createKColor() => [
        it.red = 248;
        it.green = 249;
        it.blue = 253
    ];
    private static val KColor SCCHARTSBLUE2 = RENDERING_FACTORY.createKColor() => [
        it.red = 205;
        it.green = 220;
        it.blue = 243
    ];

    private static val KColor KEYWORD = RENDERING_FACTORY.createKColor() => [it.red = 115; it.green = 0; it.blue = 65];

    def KRoundedRectangle addConnectorFigure(KNode node) {
        node.setNodeSize(7, 7);
        node.addRoundedRectangle(7, 7, baseLineWidth) => [
            background = "black".color;
            foreground = "black".color; // white ???
            // lineWidth = baseLineWidth + 2; ????
        ]
    }

    def KRoundedRectangle addDefaultFigure(KNode node) {
        node.setMinimalNodeSize(34, 34); // 2 x corner radius
        node.addRoundedRectangle(17, 17, baseLineWidth) => [
            // Mark this figure as container for further content
            setProperty(IS_CONTENT_CONTAINER, true);
            setBackgroundGradient(SCCHARTSBLUE1.copy, SCCHARTSBLUE2.copy, 90);
            foreground = "gray".color;
        ]
    }

    def KRoundedRectangle addMacroFigure(KNode node) {
        node.setMinimalNodeSize(34, 34); // same as default figure
        node.addRoundedRectangle(8, 8, baseLineWidth) => [
            // Mark this figure as container for further content
            setProperty(IS_CONTENT_CONTAINER, true);
            setBackgroundGradient(SCCHARTSBLUE1.copy, SCCHARTSBLUE2.copy, 90);
            foreground = "gray".color;
            setGridPlacement(1);
        ]
    }

    def setInitialStyle(KNode node) {
        node.KContainerRendering => [
            lineWidth = baseLineWidth + 2;
            foreground = "black".color;
        ]
    }

    def setFinalStyle(KNode node) {
        // Add an additional rectangle to achieve the double line
        val outer = node.KContainerRendering as KRoundedRectangle;
        val inner = outer.copy;
        val offset = outer.lineWidthValue + if(outer.lineWidthValue == baseLineWidth) 2 else 1;
        outer => [
            // This figure is no longer the container for content
            setProperty(IS_CONTENT_CONTAINER, false);
            setCornerSize(offset + cornerWidth, offset + cornerHeight);
            // Update minimal node size according to new corner radius (corner radius x 2)
            node.setMinimalNodeSize(cornerWidth * 2, cornerHeight * 2);
            background = "white".color;
            foreground = "black".color;
            // Add grid placement to correctly use offsets
            setGridPlacement(1);
            children += inner
        ]
        inner => [
            // styleRef = outer; //Why ? overrides other styles
            lineWidth = baseLineWidth;
            foreground = "black".color;
            // WHY ?
            // if (s.referencedState)
            // it.background.alpha = 0
            // Add surrounding space (white border)
            setGridPlacementData().from(LEFT, offset, 0, TOP, offset, 0).to(RIGHT, offset, 0, BOTTOM, offset, 0);
        ]
    }

    def setReferencedStyle(KNode node) {
        return node.contentContainer => [
            setBackgroundGradient("#fefef0".color, "#e0b0099".color, 90.0f);
        ]
    }

    def setShadowStyle(KNode node) {
        node.KContainerRendering.setShadow("black".color, 4, 4);
    }

    def KText addStateLabel(KNode node, String text) {
        node.contentContainer.addText(text) => [
            fontSize = 11;
            fontBold = true;
            // Add surrounding space
            setGridPlacementData().from(LEFT, 8, 0, TOP, 8, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
        ]
    }

    def KRectangle addActionLabel(KNode node, Pair<List<String>, List<String>> components) {
        node.actionsContainer.addKeywordLabel(components);
    }

    def KRectangle addDeclarationLabel(KNode node, Pair<List<String>, List<String>> components) {
        node.declarationsContainer.addKeywordLabel(components);
    }

    package def addKeywordLabel(KContainerRendering container, Pair<List<String>, List<String>> components) {
        container.addRectangle() => [
            // This additional rectangle allows left align in grid placement
            invisible = true
            addRectangle() => [
                invisible = true;
                // Add left alignment
                setPointPlacementData(createKPosition(LEFT, 0, 0, TOP, 0, 0), H_LEFT, V_TOP, 0, 0, 0, 0);
                setGridPlacement(2);
                val joiner = Joiner.on(" ");
                addText(joiner.join(components.key) + " ") => [
                    foreground = KEYWORD.copy;
                    fontBold = true;
                ]
                addText(joiner.join(components.value));
            ]
        ]
    }

    def addRegionsArea(KNode node) {
        node.contentContainer.addChildArea().setGridPlacementData() => [
            from(LEFT, 5, 0, TOP, -4, 0).to(RIGHT, 5, 0, BOTTOM, 5, 0)
            minCellHeight = 5;
            minCellWidth = 5;
        ]
    }

    def getContentContainer(KNode node) {
        var KContainerRendering figure = node.KContainerRendering;
        while (figure != null) {
            if (figure.getProperty(IS_CONTENT_CONTAINER)) {
                return figure;
            } else {
                figure = figure.children.findFirst[it instanceof KContainerRendering] as KContainerRendering;
            }
        }
        return null
    }

    def getActionsContainer(KNode node) {
        val content = node.contentContainer;
        var container = content.getProperty(ACTIONS_CONTAINER);
        if (container == null) {
            container = content.addInvisibleContainer;
            content.setProperty(ACTIONS_CONTAINER, container);
        }
        return container;
    }

    def getDeclarationsContainer(KNode node) {
        val content = node.contentContainer;
        var container = content.getProperty(DECLARATIONS_CONTAINER);
        if (container == null) {
            container = content.addInvisibleContainer;
            content.setProperty(DECLARATIONS_CONTAINER, container);
        }
        return container;
    }

    private def addInvisibleContainer(KContainerRendering container) {
        container.addRectangle => [
            invisible = true;
            setGridPlacement(1);
            setGridPlacementData().from(LEFT, 8, 0, TOP, -4, 0).to(RIGHT, 8, 0, BOTTOM, 6, 0);
        ]
    }
}