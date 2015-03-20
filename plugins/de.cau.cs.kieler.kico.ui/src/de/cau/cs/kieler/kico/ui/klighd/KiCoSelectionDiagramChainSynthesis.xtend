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
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.kico.ui.KiCoSelectionDiagramModel
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klay.layered.p2layers.LayeringStrategy
import de.cau.cs.kieler.klay.layered.properties.Properties
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import javax.inject.Inject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * KLighD visualization for KIELER Compiler transformation dependencies (for selecting compilation).
 * 
 * @author cmot
 * @kieler.design 2015-03-19 proposed cmot
 * @kieler.rating 2015-03-19 proposed yellow
 */
class KiCoSelectionDiagramChainSynthesis extends KiCoSynthesis {

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
//    public static val KColor YELLOW = RENDERING_FACTORY.createKColor() =>
//        [it.red = 254; it.green = 255; it.blue = 172];
//    public static val KColor DARKYELLOW = RENDERING_FACTORY.createKColor() =>
//        [it.red = 130; it.green = 132; it.blue = 1];
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
//
//    // -------------------------------------------------------------------------
//    // Remember which super states already are connected (render just a single connection)
//    private static ArrayList<Integer> connected = new ArrayList<Integer>();

    // -------------------------------------------------------------------------
    // Translate a transition from feature to transition
    def KEdge translate(Transformation source, Transformation dest) {
        return createEdge() => [ edge |
            edge.source = source.node;
            edge.target = dest.node;
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
            //edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
            //edge.addSpline(2) => [
            //    it.setForeground(DARKGRAY.copy)
            //    it.addArrowDecorator()
            //]
            edge.addPolyline(2) => [
                it.setForeground(DARKGRAY.copy)
                it.addArrowDecorator()
            ]
        ];
    }

    // ----------------------------------------------------------------------------
    // The Main entry transform function   
    override transform(KiCoSelectionDiagramModel model) {

        connected.clear
        clearCache()

        val knode = model.createNode();

        knode.setLayoutOption(LayoutOptions::DIRECTION, Direction::DOWN)
        knode.setLayoutOption(LayoutOptions::SPACING, 25f);
        knode.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
        knode.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
        knode.setLayoutOption(Properties::THOROUGHNESS, 100)
        knode.setLayoutOption(LayoutOptions::SEPARATE_CC, false);
        knode.setLayoutOption(Properties::SAUSAGE_FOLDING, true)
        knode.setLayoutOption(Properties::NODE_LAYERING, LayeringStrategy::LONGEST_PATH)

        var Transformation lastNode = null;

        for (transformation : model.context.getTransformationChain(false)) {

            System.out.println("TRANSFORM " + transformation.id);

            val kNode = transformation.translate;
            knode.children.add(kNode);

            // connect if not the first
            if (lastNode != null) {
                lastNode.translate(transformation);
            }
            lastNode = transformation

        }

        if (model.context.getTransformationChain(false).size == 0) {
            knode.children.add("No Features Selected".translate)
        }

        return knode;
    }

    // -------------------------------------------------------------------------
    // Transform a feature    
    def KNode translate(Transformation transformation) {

        //System.out.print(">>> " + feature);
        //System.out.println(" >>> " + feature.getId);
        val root = transformation.createNode().putToLookUpWith(transformation) => [ node |
            val cornerRadius = 6;
            val lineWidth = 1;
            val figure = node.addRoundedRectangle(cornerRadius, cornerRadius, lineWidth).background = "white".color;
            //            figure.setProperty(KlighdProperties::, true);
            // DO NOT ALLOW SELECTION
            //figure.addDoubleClickAction(KiCoDisabledSelectionAction::ID);
            //figure.addSingleClickAction(KiCoSelectionAction::ID);
            figure.lineWidth = lineWidth;
            figure.foreground = "gray".color;
            // shaddow
            figure.shadow = "black".color;
            figure.shadow.XOffset = 4;
            figure.shadow.YOffset = 4;
            figure => [
                //it.putToLookUpWith(tansformation)
                it.setBackgroundGradient(BLUE1.copy, BLUE2.copy, 90);
                it.setSelectionBackgroundGradient(BLUE1.copy, BLUE2.copy, 90);
                node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);
                it.invisible = false;
                var label = transformation.label;
                it.setProperty(KlighdProperties::TOOLTIP, transformation.id);
                // For simple states we want a larger area 
                it.addText(" " + label).putToLookUpWith(transformation) => [
                    // WORKAROUND UNTIL WE KNOW HOW TO DISABLE SELECTION OF LABELS!
                    // DO NOT ALLOW SELECTION
                    //                    it.addDoubleClickAction(KiCoDisabledSelectionAction::ID);
                    //                    it.addSingleClickAction(KiCoSelectionAction::ID);
                    it.setSelectionBackground(BLUE2.copy)
                    it.fontSize = 11;
                    it.setForeground(BLACK.copy)
                    //                        it.setCursorSelectable(false)
                    //                        it.setSelectionInvisible(true)
                    it.setFontBold(true);
                    it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
                ];
            ];
        ]

        return root
    }

}
