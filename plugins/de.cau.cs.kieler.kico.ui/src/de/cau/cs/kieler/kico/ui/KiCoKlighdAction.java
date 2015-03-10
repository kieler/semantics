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
package de.cau.cs.kieler.kico.ui;

import java.util.HashMap;

import org.eclipse.xtext.EcoreUtil2;

import de.cau.cs.kieler.core.kgraph.KGraphData;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.KColor;
import de.cau.cs.kieler.core.krendering.KContainerRendering;
import de.cau.cs.kieler.core.krendering.KRendering;
import de.cau.cs.kieler.core.krendering.KRoundedRectangle;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.kico.FeatureDummy;
import de.cau.cs.kieler.klighd.ViewContext;

/**
 * This is the base abstract class for a KiCo KLighD action for selecting, unselecting
 * transformations in the internal KLighD View. It provides access methods to color the shapes and
 * text.
 * 
 * @author cmot
 * @kieler.design 2014-04-08 proposed
 * @kieler.rating 2014-04-08 proposed yellow
 * 
 */
public abstract class KiCoKlighdAction {

    /** The instance of k rendering extensions for reuse Xtend code here (coloring). */
    public static KRenderingExtensions kRenderingExtensions = new KRenderingExtensions();

    /** The transformation dummy2 k node. */
    private static HashMap<FeatureDummy, KRoundedRectangle> transformationDummyKRoundedRectangle =
            new HashMap<FeatureDummy, KRoundedRectangle>();
    private static HashMap<FeatureDummy, KText> transformationDummy2KText =
            new HashMap<FeatureDummy, KText>();

    // -------------------------------------------------------------------------

    /**
     * Helper method to get the rectangle for coloring.
     * 
     * @param data
     *            the data
     * @return the rectangle
     */
    public static KRoundedRectangle getRectangle(KGraphData data) {
        if (data instanceof KRoundedRectangle) {
            return (KRoundedRectangle) data;
        }
        if (data instanceof KContainerRendering) {
            KContainerRendering container = (KContainerRendering) data;
            for (KRendering child : container.getChildren()) {
                KRoundedRectangle returnValue = getRectangle(child);
                if (returnValue != null) {
                    return returnValue;
                }
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Helper method to get the rectangle for coloring.
     * 
     * @param kNode
     *            the k node
     * @return the rectangle
     */
    public static KRoundedRectangle getRectangle(KNode kNode) {
        for (KGraphData data : kNode.getData()) {
            if (data instanceof KRoundedRectangle) {
                return (KRoundedRectangle) data;
            }
            KRoundedRectangle returnValue = getRectangle(data);
            if (returnValue != null) {
                return returnValue;
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the KText element for a transformationDummy.
     * 
     * @param transformationDummy
     *            the transformation dummy
     * @param context
     *            the context
     * @return the k text
     */
    public static KText getKText(final FeatureDummy transformationDummy,
            final ViewContext context) {
        if (!transformationDummy2KText.containsKey(transformationDummy)) {
            KText kText = context.getTargetElement(transformationDummy, KText.class);
            transformationDummy2KText.put(transformationDummy, kText);
        }

        return transformationDummy2KText.get(transformationDummy);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the KRoundedRectangle for a transformationDummy.
     * 
     * @param transformationDummy
     *            the transformation dummy
     * @param context
     *            the context
     * @return the k rounded rectangle
     */
    public static KRoundedRectangle getKRoundedRectangle(
            final FeatureDummy transformationDummy, final ViewContext context) {
        if (!transformationDummyKRoundedRectangle.containsKey(transformationDummy)) {
            // KNode kNode = context.getViewContext().getTargetElement(transformationDummy,
            // KNode.class);
            KRoundedRectangle kRoundedRectangle =
                    context.getTargetElement(transformationDummy, KRoundedRectangle.class);
            // KRoundedRectangle kRoundedRectangle = getRectangle(kNode);
            transformationDummyKRoundedRectangle.put(transformationDummy, kRoundedRectangle);
        }
        return transformationDummyKRoundedRectangle.get(transformationDummy);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the label foreground & background color for a transformationDummy.
     * 
     * @param transformationDummy
     *            the transformation dummy
     * @param context
     *            the context
     * @param foregroundColor
     *            the foreground color
     * @param backgroundColor
     *            the background color
     */
    public static void setLabelColor(final FeatureDummy transformationDummy,
            final ViewContext context, KColor foregroundColor, KColor backgroundColor) {
        KText kText = getKText(transformationDummy, context);
        if (kText != null) {
            kRenderingExtensions.setForeground(kText, copy(foregroundColor));
            kRenderingExtensions.setSelectionBackground(kText, copy(backgroundColor));
        }

    }

    // -------------------------------------------------------------------------

    /**
     * Sets the gradient color of a state for a transformationDummy.
     * 
     * @param transformationDummy
     *            the transformation dummy
     * @param context
     *            the context
     * @param color1
     *            the color1
     * @param color2
     *            the color2
     */
    public static void setStateColor(final FeatureDummy transformationDummy,
            final ViewContext context, KColor color1, KColor color2) {
        KRoundedRectangle rect = getKRoundedRectangle(transformationDummy, context);
        if (rect != null) {
            kRenderingExtensions.setBackgroundGradient(rect, copy(color1), copy(color2), 90);
            kRenderingExtensions.setSelectionBackgroundGradient(rect, copy(color1), copy(color2), 90);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Helper method to copy a color when coloring a selection.
     * 
     * @param color
     *            the color
     * @return the k color
     */
    public static KColor copy(KColor color) {
        return EcoreUtil2.copy(color);
    }

    // -------------------------------------------------------------------------

}
