/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.ui.klighd

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kico.features.Feature
import de.cau.cs.kieler.kico.features.FeatureGroup
import de.cau.cs.kieler.kico.internal.Transformation
import de.cau.cs.kieler.kico.ui.KiCoSelectionDiagramModel
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Set
import javax.inject.Inject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Common parts for KLighD visualization for KIELER Compiler transformation dependencies (for selecting compilation).
 * 
 * @author cmot
 * @kieler.design 2015-03-20 proposed cmot
 * @kieler.rating 2015-03-20 proposed yellow
 */
abstract class KiCoSynthesis extends AbstractDiagramSynthesis<KiCoSelectionDiagramModel> {

    static final boolean DEBUG = false;

    public static boolean IGNORE_INHERITED_DEPENDENCIES = false;

    protected static HashMap<Transformation, TransformationFeature> transformationFeatureMap = new HashMap<Transformation, TransformationFeature>();

    protected static HashSet<Feature> visibleFeatures = new HashSet<Feature>()

    protected static val float TRANSITION_DASH_BLACK = 7;
    protected static val float TRANSITION_DASH_WHITE = 3;
    protected static val List<Float> TRANSITION_DASH_PATTERN = newArrayList(TRANSITION_DASH_BLACK, TRANSITION_DASH_WHITE);
    protected static val float TRANSITION_DOT_BLACK = 2;
    protected static val float TRANSITION_DOT_WHITE = 1;
    protected static val List<Float> TRANSITION_DOT_PATTERN = newArrayList(TRANSITION_DOT_BLACK, TRANSITION_DOT_WHITE);
    
    // -------------------------------------------------------------------------
    // We need some extensions 
    @Inject
    extension KNodeExtensions

    @Inject
    extension KEdgeExtensions

    @Inject
    extension KRenderingExtensions

    @Inject
    extension KContainerRenderingExtensions

    @Inject
    extension KPolylineExtensions

    @Inject
    extension KColorExtensions

    // -------------------------------------------------------------------------
    // debug outputs
    def static void debug(String debugText) {
        debug(debugText, true);
    }

    def static void debug(String debugText, boolean lineBreak) {
        if (DEBUG) {
            if (lineBreak) {
                System.out.println(debugText);
            } else {
                System.out.print(debugText);
            }
        }
    }

    // -------------------------------------------------------------------------
    // Considers just visible features as valid container
    def Feature visibleContainer(Feature feature, Set<Feature> visibleFeatures) {

        // Only consider the visible features here!
        for (Feature other : visibleFeatures) {
            if (other.isGroup && (other instanceof FeatureGroup)) {
                if ((other as FeatureGroup).features.contains(feature)) {
                    return other;
                }
            }
        }
        return null;
    }

    // The currnt diagram model to display
    protected KiCoSelectionDiagramModel currentModel = null;

    // -------------------------------------------------------------------------
    // True if this feature is visible as declared by the kico.ui extension
    def isVisible(Feature feature) {
        if (currentModel.visibleFeatures.contains(feature)) {
            return true;
        }
        return false
    }
    
    // True if this transformation is visible as declared by the kico.ui extension
    // based on its id
    def isVisible(Transformation transformation) {
        if (currentModel.visibleTransformations.contains(transformation)) {
            return true;
        }
        return false
    }
    

    // -------------------------------------------------------------------------
    // access methods to get auxiliary TransformationFeatures
    def public static getTransformationFeature(Transformation transformation) {
        transformationFeatureMap.get(transformation)
    }

    // -------------------------------------------------------------------------
    // Gets all displayed features
    def public static getVisibleFeatures() {
        return visibleFeatures;
    }

    // -------------------------------------------------------------------------
    // Clear cache
    def public static clearCache() {
        transformationFeatureMap.clear
        visibleFeatures.clear
    }

    // --------------------------------------------------------------------------
    // Some color and pattern constants
    public static val KColor GRAY = RENDERING_FACTORY.createKColor() =>
        [it.red = 240; it.green = 240; it.blue = 240];
    public static val KColor DARKGRAY = RENDERING_FACTORY.createKColor() =>
        [it.red = 140; it.green = 140; it.blue = 140];
    public static val KColor BLACK = RENDERING_FACTORY.createKColor() => [it.red = 0; it.green = 0; it.blue = 0];
    public static val KColor WHITE = RENDERING_FACTORY.createKColor() => [it.red = 255; it.green = 255; it.blue = 255];

    // Some self-defined colors 
    public static val KColor YELLOW = RENDERING_FACTORY.createKColor() =>
        [it.red = 254; it.green = 255; it.blue = 172];
    public static val KColor DARKYELLOW = RENDERING_FACTORY.createKColor() =>
        [it.red = 130; it.green = 132; it.blue = 1];
    public static val KColor BLUE1 = RENDERING_FACTORY.createKColor() =>
        [it.red = 248; it.green = 249; it.blue = 253];
    public static val KColor BLUE2 = RENDERING_FACTORY.createKColor() =>
        [it.red = 205; it.green = 220; it.blue = 243];
    public static val KColor BLUE3 = RENDERING_FACTORY.createKColor() =>
        [it.red = 0; it.green = 0; it.blue = 255];
    public static val KColor BLUE3b = RENDERING_FACTORY.createKColor() =>
        [it.red = 150; it.green = 150; it.blue = 255];
    public static val KColor BLUE4 = RENDERING_FACTORY.createKColor() =>
        [it.red = 00; it.green = 00; it.blue = 180];
    public static val KColor BLUE4b = RENDERING_FACTORY.createKColor() =>
        [it.red = 150 it.green = 150; it.blue = 180];

    public static val KColor GRAY1 = RENDERING_FACTORY.createKColor() =>
        [it.red = 248; it.green = 248; it.blue = 248];
    public static val KColor GRAY2 = RENDERING_FACTORY.createKColor() =>
        [it.red = 210; it.green = 210; it.blue = 210];

    // -------------------------------------------------------------------------
    // Remember which super states already are connected (render just a single connection)
    protected static ArrayList<Integer> connected = new ArrayList<Integer>();


    // -------------------------------------------------------------------------
    // Get the display name for the transformation
    def String getLabel(Transformation s) {
        "T_" + s.name
    }
    
    // -------------------------------------------------------------------------
    // Get the display name for the feature
    def String getLabel(Feature s) {
        s.name
    }

    // Display a feature as a group, if it has several handling transformations (alternative) or if it really is a feature group!
    def isGroupOrAlternative(Feature feature) {
        (feature instanceof FeatureGroup || feature.isAlternative);
    }

    // -------------------------------------------------------------------------
    // Create a string of spaces with the length of the original text
    def String getSpacedOut(int num) {
        if (num > 0) {
            return " " + getSpacedOut(num - 1);
        }
        return ""
    }

    // Create a string of spaces with the length of the original text
    def String getSpacedOut(String originalText, int factor) {
        return getSpacedOut(originalText.length * factor)
    }

    //--------------------------------------------------------------------------
    // Creates a message to the user
    def KNode translate(String message) {
        val root = message.createNode() => [ node |
            val cornerRadius = 0;
            val lineWidth = 2;
            val figure = node.addRoundedRectangle(cornerRadius, cornerRadius, lineWidth).background = "white".color;
            //            figure.setProperty(KlighdProperties::, true);
            // DO NOT ALLOW SELECTION
            //figure.addDoubleClickAction(KiCoDisabledSelectionAction::ID);
            //figure.addSingleClickAction(KiCoSelectionAction::ID);
            figure.lineWidth = 0;
            figure.foreground = WHITE;
            // shaddow
            //figure.shadow = "black".color;
            //figure.shadow.XOffset = 4;
            //figure.shadow.YOffset = 4;
            figure => [
                //it.putToLookUpWith(tansformation)
                it.setBackgroundGradient(WHITE.copy, WHITE.copy, 90);
                it.setSelectionBackgroundGradient(WHITE.copy, WHITE.copy, 90);
                node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);
                it.invisible = false;
                var label = message;
                // For simple states we want a larger area 
                it.addText(" " + label) => [
                    it.setSelectionBackground(WHITE.copy)
                    it.fontSize = 11;
                    it.setForeground(DARKGRAY.copy)
                    it.setFontBold(true);
                    it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
                ];
            ];
        ]
        return root
    }

}
