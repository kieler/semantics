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

import com.google.inject.Inject
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KLabel
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.KDecoratorPlacementData
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.KSpline
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import java.util.List

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Styles for {@link Transition}.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
class TransitionStyles {

    // -------------------------------------------------------------------------
    // Extensions 
    @Inject
    extension KEdgeExtensions

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

    private static val float TRANSITION_DASH_BLACK = 7;
    private static val float TRANSITION_DASH_WHITE = 3;
    private static val List<Float> TRANSITION_DASH_PATTERN = newArrayList(TRANSITION_DASH_BLACK, TRANSITION_DASH_WHITE);

    private static val KRenderingFactory RENDERING_FACTORY = KRenderingFactory.eINSTANCE;
    private static val KColor DARKGRAY = RENDERING_FACTORY.createKColor() => [it.red = 60; it.green = 60; it.blue = 60];

    /**
     * Adds a basic transition spline.
     */
    def KSpline addTransitionSpline(KEdge edge) {
        edge.addSpline => [
            lineWidth = 2;
        ]
    }
    
    /**
     * Sets the style of the line to immediate.
     */
    def setImmediateStyle(KEdge edge) {
        edge.line => [
            lineStyle = LineStyle::CUSTOM;
            lineStyle.dashPattern.clear;
            lineStyle.dashPattern += TRANSITION_DASH_PATTERN;
        ]
    }

    /**
     * Adds a history head arrow decorator.<br>
     * Incompatible with {@link addDeepHistoryDecorator}.
     */
    def addShallowHistoryDecorator(KEdge edge) {
        edge.line.addHeadArrowDecorator() => [
            (placementData as KDecoratorPlacementData).absolute = -17.0f;
        ]
        edge.line.addEllipse() => [
            setDecoratorPlacementData(16, 16, -6, 1, false);
            lineWidth = 0;
            foreground = DARKGRAY.copy;
            background = DARKGRAY.copy;
            addPolyline => [
                lineWidth = 2;
                points += createKPosition(LEFT, 5, 0, TOP, 4, 0);
                points += createKPosition(LEFT, 5, 0, BOTTOM, 4, 0);
                points += createKPosition(LEFT, 5, 0, TOP, 0, 0.5f);
                points += createKPosition(RIGHT, 5, 0, TOP, 0, 0.5f);
                points += createKPosition(RIGHT, 5, 0, BOTTOM, 4, 0);
                points += createKPosition(RIGHT, 5, 0, TOP, 4, 0);
                foreground = "white".color;
            ]
        ]
    }

    /**
     * Adds a deep history head arrow decorator.<br>
     * Incompatible with {@link addShallowHistoryDecorator}.
     */
    def addDeepHistoryDecorator(KEdge edge) {
        edge.line.addHeadArrowDecorator() => [
            (placementData as KDecoratorPlacementData).absolute = -17.0f;
        ]
        edge.line.addEllipse() => [
            setDecoratorPlacementData(16, 16, -6, 1, false);
            lineWidth = 0;
            foreground = DARKGRAY.copy;
            background = DARKGRAY.copy;
            addPolyline(1) => [
                lineWidth = 2;
                points += createKPosition(LEFT, 3, 0, TOP, 4, 0);
                points += createKPosition(LEFT, 3, 0, BOTTOM, 4, 0);
                points += createKPosition(LEFT, 3, 0, TOP, 0, 0.5f);
                points += createKPosition(RIGHT, 7, 0, TOP, 0, 0.5f);
                points += createKPosition(RIGHT, 7, 0, BOTTOM, 4, 0);
                points += createKPosition(RIGHT, 7, 0, TOP, 4, 0);
                foreground = "white".color;
            ]
            addText("*") => [
                setPointPlacementData(createKPosition(LEFT, 10, 0, TOP, 0, 0), H_LEFT, V_TOP, 6, 0, 0, 0);
                foreground = "white".color;
            ]
        ]
    }

    /**
     * Adds a deferred head arrow decorator.<br>
     * If used in combination with other head decorators set isAdditionalArrowHead to true.
     */
    def addDeferredDecorator(KEdge edge, boolean isAdditionalArrowHead) {
        if (isAdditionalArrowHead) {
            (edge.line.children.head.placementData as KDecoratorPlacementData).absolute = 26;
        } else {
            edge.line.addHeadArrowDecorator() => [
                (placementData as KDecoratorPlacementData).absolute = -11.0f;
            ]
        }
        edge.line.addEllipse() => [
            lineWidth = 1;
            background = "red".color; // PAPER_BW = gray
            if (isAdditionalArrowHead) {
                setDecoratorPlacementData(10, 10, -19, 1, false);
            } else {
                setDecoratorPlacementData(10, 10, -4, 1, false);
            }
        ];
    }
        
    /**
     * Adds a normal pointy head arrow decorator.
     */
    def addDefaultDecorator(KEdge edge) {
        edge.line.addHeadArrowDecorator();
    }
    
    /**
     * Adds a abort tail arrow decorator.<br>
     * Incompatible with {@link addNormalTerminationDecorator}.
     */
    def addStrongAbortionDecorator(KEdge edge) {
        edge.line.addEllipse() => [
            setDecoratorPlacementData(10, 10, 4, 0, false);
            lineWidth = 1;
            background = "red".color // PAPER_BW = gray
        ]
    }
    
    /**
     * Adds a termination tail arrow decorator.<br>
     * Incompatible with {@link addStrongAbortionDecorator}.
     */
    def addNormalTerminationDecorator(KEdge edge) {
        edge.line.drawTriangle() => [
            setDecoratorPlacementData(11, 11, 5, 0, true);
            lineWidth = 1;
            background = "green".color // PAPER_BW = gray
        ]
    }

    /** Add an edge label */
    def KLabel addLabel(KEdge edge, String text) {
        val label = edge.createLabel;
        label.configureCenterEdgeLabel(text); // Add text
        label.getKRendering => [ // Configure text
            fontSize = 11;
            fontBold = true;
        ]
        return label;
    }

    /** 
     * Returns the polyline rending of the edge.
     */
    private def line(KEdge edge) {
        return edge.getKContainerRendering as KPolyline;
    }

}