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
package de.cau.cs.kieler.kico.ui.klighd

import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kico.features.Feature
import de.cau.cs.kieler.kico.features.FeatureGroup
import de.cau.cs.kieler.kico.internal.Transformation
import de.cau.cs.kieler.kico.ui.KiCoDisabledSelectionAction
import de.cau.cs.kieler.kico.ui.KiCoSelectionAction
import de.cau.cs.kieler.kico.ui.KiCoSelectionDiagramModel
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import javax.inject.Inject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * KLighD visualization for KIELER Compiler transformation dependencies (for selecting compilation).
 * 
 * @author cmot
 * @kieler.design 2015-03-19 proposed cmot
 * @kieler.rating 2015-03-19 proposed yellow
 */
class KiCoSelectionDiagramFlatSynthesis extends KiCoSynthesis {

    public static boolean IGNORE_INHERITED_DEPENDENCIES = false;

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
    // Translate a transition from feature to transition
    def KEdge translateNotHandledByTransition(Feature source, Transformation dest, boolean inheritColor) {
        return createEdge() => [ edge |
            edge.source = source.node;
            edge.target = dest.node;
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
            //edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
            //             edge.addPolyline(2) => [
            edge.addSpline(2) => [
                if (inheritColor) {
                    it.setForeground(GRAY.copy)
                } else {
                    it.setForeground(DARKGRAY.copy)
                }
                it.lineStyle = LineStyle::CUSTOM;
                it.lineStyle.dashPattern.clear;
                it.lineStyle.dashPattern += TRANSITION_DASH_PATTERN;
                it.addArrowDecorator()
            ]
        ];
    }

    // -------------------------------------------------------------------------
    // Translate a transition from transformation to feature (BELONG)
    def KEdge translateBelongTransition(Transformation source, Feature dest) {
        return createEdge() => [ edge |
            edge.source = source.node;
            edge.target = dest.node;
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
            //edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
            //             edge.addPolyline(2) => [
            edge.addSpline(2) => [
                it.setForeground(BLUE3.copy)
                // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                //                if (t.isImmediate2) {
                it.lineStyle = LineStyle::CUSTOM;
                it.lineStyle.dashPattern.clear;
                it.lineStyle.dashPattern += TRANSITION_DOT_PATTERN;
            //                }
            //it.addArrowDecorator()
            ]
        ];
    }

    // -------------------------------------------------------------------------
    // Translate a transition from transformation to feature (BELONG)
    def KEdge translateProduceTransition(Transformation source, Feature dest) {
        return createEdge() => [ edge |
            edge.source = source.node;
            edge.target = dest.node;
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
            //edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
            //             edge.addPolyline(2) => [
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

    // ----------------------------------------------------------------------------
    // The Main entry transform function   
    override transform(KiCoSelectionDiagramModel model) {

        connected.clear
        clearCache()

        val knode = model.createNode();

        knode.setLayoutOption(LayoutOptions::DIRECTION, Direction::RIGHT)
        knode.setLayoutOption(LayoutOptions::SPACING, 25f);

        //knode.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
        knode.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
        knode.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");

        //knode.setLayoutOption(Properties::THOROUGHNESS, 100)
        knode.setLayoutOption(LayoutOptions::SEPARATE_CC, false);

        //knode.setLayoutOption(Properties::SAUSAGE_FOLDING, true)
        //knode.setLayoutOption(Properties::NODE_LAYERING, LayeringStrategy::LONGEST_PATH)
        for (elem : model.visibleFeatures) {

            System.out.println("TRANSFORM " + elem.id);

            if (!(elem instanceof FeatureGroup)) {

                //            if (elem.visibleContainer(model.visibleFeatures) == null) {
                visibleFeatures.add(elem);
                val kNode = elem.translate;
                knode.children.add(kNode);

            }

            if (!(elem instanceof FeatureGroup)) {
                for (Transformation transformation : elem.expandingTransformations) {
                    val kNode2 = transformation.translate;
                    knode.children.add(kNode2)
                }
            }

        //            }
        }

        return knode;
    }

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
            //            if (feature.isGroup) {
            //                figure.lineStyle = LineStyle::CUSTOM;
            //                figure.lineStyle.dashPattern.clear;
            //                figure.lineStyle.dashPattern += TRANSITION_DASH_PATTERN;
            //            }
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
                //                if (feature.isGroup) {
                //                    label = "[" + label + "]"
                //                }
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
                    //                    for (dest : (feature as FeatureGroup).features) {
                    //                        var transSource = feature
                    //                        var transDest = dest
                    //                        if (transSource != null && transDest != null) {
                    //                            debug(" CHK  CONT '" + transSource.id + "' TO '" + transDest.id + "'")
                    //                            if (!(connected.contains(transSource.hashCode + transDest.hashCode))) {
                    //                                connected.add(transSource.hashCode + transDest.hashCode)
                    //                                transSource.translateBelongTransition(transDest)
                    //                            }
                    //                        }
                    //                    }
                } else {
                }
            ];
        ]

        return root
    }

    // -------------------------------------------------------------------------
    // Transform a feature    
    def KNode translate(Transformation transformation) {

        //System.out.print(">>> " + feature);
        //System.out.println(" >>> " + feature.getId);
        val root = transformation.createNode().putToLookUpWith(transformation) => [ node |
            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);
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
                it.setProperty(KlighdProperties::TOOLTIP, transformation.idLabel);
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
                var transSource = transformation
                var transDest = transformation.expandsFeature
                if (transSource != null && transDest != null) {
                    debug(" CHK  CONT '" + transSource.id + "' TO '" + transDest.id + "'")
                    if (!(connected.contains(transSource.hashCode + transDest.hashCode))) {
                        connected.add(transSource.hashCode + transDest.hashCode)
                        transSource.translateBelongTransition(transDest)
                    }
                }
                for (dest : transformation.producesFeatures) {
                    transSource = transformation
                    transDest = dest
                    if (transSource != null && transDest != null) {
                        debug(" CHK  CONT '" + transSource.id + "' TO '" + transDest.id + "'")
                        if (!(connected.contains(transSource.hashCode + transDest.hashCode))) {
                            connected.add(transSource.hashCode + transDest.hashCode)
                            transSource.translateProduceTransition(transDest)
                        }
                    }
                }
                val notHandlesNotInheritedFeatures = transformation.getNotHandlesFeatures(true)
                for (source : transformation.getNotHandlesFeatures(IGNORE_INHERITED_DEPENDENCIES)) {
                    var inheritColor = false;
                    if (!IGNORE_INHERITED_DEPENDENCIES) {
                        if (!(notHandlesNotInheritedFeatures.contains(source))) {
                            inheritColor = true;
                        }
                    }

                    var transSource2 = source
                    var transDest2 = transformation
                    if (transSource2 != null && transDest2 != null) {
                        debug(" CHK  CONT '" + transSource2.id + "' TO '" + transDest2.id + "'")
                        if (!(connected.contains(transSource2.hashCode + transDest2.hashCode))) {
                            connected.add(transSource2.hashCode + transDest2.hashCode)
                            transSource2.translateNotHandledByTransition(transDest2, inheritColor)
                        }
                    }
                }
            ];
        ]

        return root
    }

}
