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
import de.cau.cs.kieler.kico.Feature;
import de.cau.cs.kieler.kico.ui.klighd.KiCoSelectionDiagramSynthesis;
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
    private static HashMap<Feature, KRoundedRectangle> FeatureKRoundedRectangle =
            new HashMap<Feature, KRoundedRectangle>();
    private static HashMap<Feature, KText> Feature2KText = new HashMap<Feature, KText>();

    protected static final int NORMAL = 0;
    protected static final int SELECT = 1;
    protected static final int AUTOSELECT = 2;
    protected static final int DISABLE = 3;

    private static final KColor TEXTFG[] = { KiCoSelectionDiagramSynthesis.BLACK,
            KiCoSelectionDiagramSynthesis.WHITE, KiCoSelectionDiagramSynthesis.WHITE,
            KiCoSelectionDiagramSynthesis.DARKGRAY };
    private static final KColor TEXTBG[] = { KiCoSelectionDiagramSynthesis.BLUE1,
            KiCoSelectionDiagramSynthesis.BLUE3, KiCoSelectionDiagramSynthesis.BLUE3b,
            KiCoSelectionDiagramSynthesis.GRAY1 };
    private static final KColor STATE1[] = { KiCoSelectionDiagramSynthesis.BLUE1,
            KiCoSelectionDiagramSynthesis.BLUE3, KiCoSelectionDiagramSynthesis.BLUE3b,
            KiCoSelectionDiagramSynthesis.GRAY1 };
    private static final KColor STATE2[] = { KiCoSelectionDiagramSynthesis.BLUE2,
            KiCoSelectionDiagramSynthesis.BLUE4, KiCoSelectionDiagramSynthesis.BLUE3b,
            KiCoSelectionDiagramSynthesis.GRAY1 };

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Clear cached elements. Should be called if view context changes!
     */
    public static void clearCache() {
        Feature2KText.clear();
        FeatureKRoundedRectangle.clear();
    }

    // -------------------------------------------------------------------------

    /**
     * Colorize a state and its label color according to the following scheme: colorschema
     * 0=default, 1=select, 2=autoselect, 3=disabled.
     * 
     * @param feature
     *            the feature
     * @param viewContext
     *            the view context
     * @param COLORSCHEMA
     *            the colorschema 0=default, 1=select, 2=autoselect, 3=disabled
     */
    protected static void colorize(Feature feature, ViewContext context, int colorScheme) {
        setLabelColor(feature, context, TEXTFG[colorScheme], TEXTBG[colorScheme]);
        setStateColor(feature, context, STATE1[colorScheme], STATE2[colorScheme]);
    }

    // -------------------------------------------------------------------------
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
     * Gets the KText element for a Feature.
     * 
     * @param Feature
     *            the transformation dummy
     * @param context
     *            the context
     * @return the k text
     */
    public static KText getKText(final Feature Feature, final ViewContext context) {
        if (!Feature2KText.containsKey(Feature)) {
            KText kText = context.getTargetElement(Feature, KText.class);
            Feature2KText.put(Feature, kText);
        }

        return Feature2KText.get(Feature);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the KRoundedRectangle for a Feature.
     * 
     * @param Feature
     *            the transformation dummy
     * @param context
     *            the context
     * @return the k rounded rectangle
     */
    public static KRoundedRectangle getKRoundedRectangle(final Feature Feature,
            final ViewContext context) {
        if (!FeatureKRoundedRectangle.containsKey(Feature)) {
            // KNode kNode = context.getViewContext().getTargetElement(Feature,
            // KNode.class);
            KRoundedRectangle kRoundedRectangle =
                    context.getTargetElement(Feature, KRoundedRectangle.class);
            // KRoundedRectangle kRoundedRectangle = getRectangle(kNode);
            FeatureKRoundedRectangle.put(Feature, kRoundedRectangle);
        }
        return FeatureKRoundedRectangle.get(Feature);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the label foreground & background color for a Feature.
     * 
     * @param Feature
     *            the transformation dummy
     * @param context
     *            the context
     * @param foregroundColor
     *            the foreground color
     * @param backgroundColor
     *            the background color
     */
    public static void setLabelColor(final Feature Feature, final ViewContext context,
            KColor foregroundColor, KColor backgroundColor) {
        KText kText = getKText(Feature, context);
        if (kText != null) {
            kRenderingExtensions.setForeground(kText, copy(foregroundColor));
            kRenderingExtensions.setSelectionBackground(kText, copy(backgroundColor));
        }

    }

    // -------------------------------------------------------------------------

    /**
     * Sets the gradient color of a state for a Feature.
     * 
     * @param Feature
     *            the transformation dummy
     * @param context
     *            the context
     * @param color1
     *            the color1
     * @param color2
     *            the color2
     */
    public static void setStateColor(final Feature Feature, final ViewContext context,
            KColor color1, KColor color2) {
        KRoundedRectangle rect = getKRoundedRectangle(Feature, context);
        if (rect != null) {
            kRenderingExtensions.setBackgroundGradient(rect, copy(color1), copy(color2), 90);
            kRenderingExtensions.setSelectionBackgroundGradient(rect, copy(color1), copy(color2),
                    90);
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
