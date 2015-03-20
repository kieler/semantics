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

import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.util.Pair
import de.cau.cs.kieler.kico.ui.KiCoDisabledSelectionAction
import de.cau.cs.kieler.kico.ui.KiCoSelectionAction
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import java.util.ArrayList
import java.util.List
import javax.inject.Inject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kico.ui.KiCoSelectionDiagramModel
import de.cau.cs.kieler.kico.Feature
import de.cau.cs.kieler.kico.FeatureGroup
import de.cau.cs.kieler.kico.KielerCompiler
import java.util.Set
import java.util.HashSet
import java.util.HashMap
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.core.krendering.LineStyle

/**
 * KLighD visualization for KIELER Compiler transformation dependencies (for selecting compilation).
 * 
 * @author cmot
 * @kieler.design 2015-03-19 proposed cmot
 * @kieler.rating 2015-03-19 proposed yellow
 */
class KiCoSelectionDiagramFlatGroupsSynthesis extends KiCoSynthesis {

//    static final boolean DEBUG = false;
//
//    static private HashMap<Transformation, TransformationFeature> transformationFeatureMap = new HashMap<Transformation, TransformationFeature>();
//    static private HashSet<Feature> visibleFeatures = new HashSet<Feature>()
//
//    private static val float TRANSITION_DASH_BLACK = 7;
//    private static val float TRANSITION_DASH_WHITE = 3;
//    private static val List<Float> TRANSITION_DASH_PATTERN = newArrayList(TRANSITION_DASH_BLACK, TRANSITION_DASH_WHITE);

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

//    // -------------------------------------------------------------------------
//    // debug outputs
//    def static void debug(String debugText) {
//        debug(debugText, true);
//    }
//
//    def static void debug(String debugText, boolean lineBreak) {
//        if (DEBUG) {
//            if (lineBreak) {
//                System.out.println(debugText);
//            } else {
//                System.out.print(debugText);
//            }
//        }
//    }
//
//    // -------------------------------------------------------------------------
//    // access methods to get auxiliary TransformationFeatures
//    def public static getTransformationFeature(Transformation transformation) {
//        transformationFeatureMap.get(transformation)
//    }
//
//    // -------------------------------------------------------------------------
//    // Gets all displayed features
//    def public static getVisibleFeatures() {
//        return visibleFeatures;
//    }
//
//    // -------------------------------------------------------------------------
//    // Clear cache
//    def public static clearCache() {
//        transformationFeatureMap.clear
//        visibleFeatures.clear
//    }
//    
//    // --------------------------------------------------------------------------
//    // Some color and pattern constants
//    private static val KColor GRAY = RENDERING_FACTORY.createKColor() =>
//        [it.red = 240; it.green = 240; it.blue = 240];
//    public static val KColor DARKGRAY = RENDERING_FACTORY.createKColor() =>
//        [it.red = 140; it.green = 140; it.blue = 140];
//    public static val KColor BLACK = RENDERING_FACTORY.createKColor() => [it.red = 0; it.green = 0; it.blue = 0];
//    public static val KColor WHITE = RENDERING_FACTORY.createKColor() => [it.red = 255; it.green = 255; it.blue = 255];
//
//    // Some self-defined colors 
//    public static val KColor BLUE1 = RENDERING_FACTORY.createKColor() =>
//        [it.red = 248; it.green = 249; it.blue = 253];
//    public static val KColor BLUE2 = RENDERING_FACTORY.createKColor() =>
//        [it.red = 205; it.green = 220; it.blue = 243];
//    public static val KColor BLUE3 = RENDERING_FACTORY.createKColor() =>
//        [it.red = 0; it.green = 0; it.blue = 255];
//    public static val KColor BLUE3b = RENDERING_FACTORY.createKColor() =>
//        [it.red = 150; it.green = 150; it.blue = 255];
//    public static val KColor BLUE4 = RENDERING_FACTORY.createKColor() =>
//        [it.red = 00; it.green = 00; it.blue = 180];
//    public static val KColor BLUE4b = RENDERING_FACTORY.createKColor() =>
//        [it.red = 150 it.green = 150; it.blue = 180];
//
//    public static val KColor GRAY1 = RENDERING_FACTORY.createKColor() =>
//        [it.red = 248; it.green = 248; it.blue = 248];
//    public static val KColor GRAY2 = RENDERING_FACTORY.createKColor() =>
//        [it.red = 210; it.green = 210; it.blue = 210];

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    // Translate a transition from feature group to feature (BELONG)
    def KEdge translateBelongTransition(Feature source, Feature dest) {
        return createEdge() => [ edge |
            edge.source = source.node;
            edge.target = dest.node;
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
            edge.addSpline(2) => [
                it.setForeground(DARKGRAY.copy)
            // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
            //                if (t.isImmediate2) {
            //                    it.lineStyle = LineStyle::CUSTOM;
            //                    it.lineStyle.dashPattern.clear;
            //                    it.lineStyle.dashPattern += TRANSITION_DASH_PATTERN;
            //                }
            it.addArrowDecorator()
            ]
        ];
    }

     // -------------------------------------------------------------------------
    // Remember which super states already are connected (render just a single connection)
    private static ArrayList<Integer> connected = new ArrayList<Integer>();
    

    // ----------------------------------------------------------------------------
    // The Main entry transform function   
    override transform(KiCoSelectionDiagramModel model) {

        connected.clear
        clearCache()

        val knode = model.createNode();

        for (elem : model.visibleFeatures) {

            System.out.println("TRANSFORM " + elem.id);

            //            if (elem.visibleContainer(model.visibleFeatures) == null) {
            visibleFeatures.add(elem);
            val kNode = elem.translate;
            knode.children.add(kNode);


        //            }
        }

        return knode;
    }

//    // -------------------------------------------------------------------------
//    // Get the display name for the feature
//    def String getLabel(Feature s) {
//        s.name
//    }


    // -------------------------------------------------------------------------
    // Transform a feature    
    def KNode translate(Feature feature) {

        //System.out.print(">>> " + feature);
        //System.out.println(" >>> " + feature.getId);
        val root = feature.createNode().putToLookUpWith(feature) => [ node |
            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);
            val cornerRadius = 17; //if(!feature.isGroup) 17 else 8;
            val lineWidth = 1;
            val figure = node.addRoundedRectangle(cornerRadius, cornerRadius, lineWidth).background = "white".color;
            //            figure.setProperty(KlighdProperties::, true);
            figure.addDoubleClickAction(KiCoDisabledSelectionAction::ID);
            figure.addSingleClickAction(KiCoSelectionAction::ID);
            if (feature instanceof FeatureGroup) {
                figure.lineStyle = LineStyle::CUSTOM;
                figure.lineStyle.dashPattern.clear;
                figure.lineStyle.dashPattern += TRANSITION_DASH_PATTERN;
            }
            figure.lineWidth = lineWidth;
            figure.foreground = "gray".color;
            // shaddow
            figure.shadow = "black".color;
            figure.shadow.XOffset = 4;
            figure.shadow.YOffset = 4;
            figure => [
                it.putToLookUpWith(feature)
                it.setBackgroundGradient(BLUE1.copy, BLUE2.copy, 90);
                it.setSelectionBackgroundGradient(BLUE1.copy, BLUE2.copy, 90);
                node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);
                it.invisible = false;
                var label = feature.label;
                it.setProperty(KlighdProperties::TOOLTIP, feature.id);
                // For simple states we want a larger area 
                it.addText(" " + label).putToLookUpWith(feature) => [
                    // WORKAROUND UNTIL WE KNOW HOW TO DISABLE SELECTION OF LABELS!
                    it.addDoubleClickAction(KiCoDisabledSelectionAction::ID);
                    it.addSingleClickAction(KiCoSelectionAction::ID);
                    it.fontSize = 11;
                    it.setForeground(BLACK.copy)
                    it.setSelectionBackground(BLUE3.copy)
                    //                        it.setCursorSelectable(false)
                    //                        it.setSelectionInvisible(true)
                    it.setFontBold(true);
                    it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
                ];
                if (feature instanceof FeatureGroup) {
                    for (dest : (feature as FeatureGroup).features) {
                        var transSource = feature
                        var transDest = dest
                        if (transSource != null && transDest != null) {
                            debug(" CHK  CONT '" + transSource.id + "' TO '" + transDest.id + "'")
                            if (!(connected.contains(transSource.hashCode + transDest.hashCode))) {
                                connected.add(transSource.hashCode + transDest.hashCode)
                                transSource.translateBelongTransition(transDest)
                            }
                        }
                    }

                } else {
                }
            ];
        ]

        return root
    }


}
