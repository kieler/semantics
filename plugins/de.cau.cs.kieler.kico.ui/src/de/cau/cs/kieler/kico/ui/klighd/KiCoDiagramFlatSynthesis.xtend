/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
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
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kico.ui.KiCoDisabledSelectionAction
import de.cau.cs.kieler.kico.ui.KiCoSelectionAction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import java.util.List
import javax.inject.Inject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kico.FeatureDummy

/**
 * KLighD visualization for KIELER Compiler transformation dependencies (for selecting compilation).
 * 
 * @author cmot
 * @kieler.design 2014-04-08 proposed cmot
 * @kieler.rating 2014-04-08 proposed yellow
 */
class KiCoDiagramFlatSynthesis extends AbstractDiagramSynthesis<List<FeatureDummy>> {

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

    // --------------------------------------------------------------------------
    // Some color and pattern constants
    private static val float TRANSITION_DASH_BLACK = 7;
    private static val float TRANSITION_DASH_WHITE = 3;
    private static val List<Float> TRANSITION_DASH_PATTERN = newArrayList(TRANSITION_DASH_BLACK, TRANSITION_DASH_WHITE);
    public static val KColor DARKGRAY = RENDERING_FACTORY.createKColor() =>
        [it.red = 140; it.green = 140; it.blue = 140];
    public static val KColor BLACK = RENDERING_FACTORY.createKColor() => [it.red = 0; it.green = 0; it.blue = 0];
    public static val KColor WHITE = RENDERING_FACTORY.createKColor() => [it.red = 255; it.green = 255; it.blue = 255];

    // Some self-defined colors 
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
        [it.red = 210; it.green = 230; it.blue = 230];

    // -------------------------------------------------------------------------
    def FeatureDummy container(FeatureDummy transformationDummy) {
        if (transformationDummy != null && transformationDummy.reverseDependencies != null &&
            transformationDummy.reverseDependencies.length > 0) {
            var FeatureDummy possibleContainer = null
            for (reverseDependency : transformationDummy.reverseDependencies) {
                if (reverseDependency.group) {
                    if (possibleContainer != null && possibleContainer != reverseDependency) {
                        return null
                    }
                    possibleContainer = reverseDependency
                }
            }
            if (possibleContainer != null) {
                return possibleContainer
            }
            return null;
        }
        return null;
    }

    // -------------------------------------------------------------------------
//    def TransformationDummy getHierarchicalSource(TransformationDummy source, TransformationDummy dest) {
//        var returnPair = getHierarchicalSource(source, dest, 0)
//        if (returnPair.first == -1) {
//            return null
//        }
//        return (returnPair.last as TransformationDummy)
//    }
//
//    def Pair<Integer, TransformationDummy> getHierarchicalSource(TransformationDummy source, TransformationDummy dest,
//        int cnt) {
//        if (source == null || dest == null) {
//            return new Pair(-1, null)
//        }
//        if (dest.container == source.container) {
//
//            // if this is a group-internal transition
//            return new Pair(cnt, source)
//        } else {
//            val left = getHierarchicalSource(source.container, dest, cnt + 1)
//            val right = getHierarchicalSource(source, dest.container, cnt + 1)
//            if (left.first != -1 && right.first != -1) {
//                if (left.first < right.first) {
//                    return left
//                } else {
//                    return right
//                }
//            } else if (left.first != -1) {
//                return left
//            } else if (right.first != -1) {
//                return right
//            }
//        }
//        return new Pair(-1, null)
//    }
//
//    def TransformationDummy getHierarchicalDest(TransformationDummy source, TransformationDummy dest) {
//        var returnPair = getHierarchicalDest(source, dest, 0)
//        if (returnPair.first == -1) {
//            return null
//        }
//
//        return (returnPair.last as TransformationDummy)
//    }
//
//    def Pair<Integer, TransformationDummy> getHierarchicalDest(TransformationDummy source, TransformationDummy dest,
//        int cnt) {
//        if (source == null || dest == null) {
//            return new Pair(-1, null)
//        }
//        if (dest.container == source.container) {
//
//            // if this is a group-internal transition
//            return new Pair(cnt, dest)
//        } else {
//            val left = getHierarchicalDest(source.container, dest, cnt + 1)
//            val right = getHierarchicalDest(source, dest.container, cnt + 1)
//            if (left.first != -1 && right.first != -1) {
//                if (left.first < right.first) {
//                    return left
//                } else {
//                    return right
//                }
//            } else if (left.first != -1) {
//                return left
//            } else if (right.first != -1) {
//                return right
//            }
//        }
//        return new Pair(-1, null)
//    }

//    // -------------------------------------------------------------------------
//    // Remember which super states already are connected (render just a single connection)
//    private HashMap<TransformationDummy, TransformationDummy> connected = new HashMap<TransformationDummy, TransformationDummy>();

    // The Main entry transform function   
    override transform(List<FeatureDummy> model) {
        val knode = model.createNode();

        for (elem : model) {
//            if (elem.container == null) {
                val kNode = elem.translate;
                knode.children.add(kNode);
 //           }
        }


        return knode;
    }

    def String getLabel(FeatureDummy s) {
        s.transformation.name
    }

    // -------------------------------------------------------------------------
    // Transform a state    
    def KNode translate(FeatureDummy transformationDummy) {

        val root = transformationDummy.createNode().putToLookUpWith(transformationDummy) => [ node |
            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);
            val cornerRadius = if(!transformationDummy.isGroup) 17 else 8;
            val lineWidth = 1;
            val figure = node.addRoundedRectangle(cornerRadius, cornerRadius, lineWidth).background = "white".color;
            //            figure.setProperty(KlighdProperties::, true);
            figure.addDoubleClickAction(KiCoDisabledSelectionAction::ID);
            figure.addSingleClickAction(KiCoSelectionAction::ID);
            figure.lineWidth = lineWidth;
            figure.foreground = "gray".color;
            // shaddow
            figure.shadow = "black".color;
            figure.shadow.XOffset = 4;
            figure.shadow.YOffset = 4;
            figure => [
                it.putToLookUpWith(transformationDummy)
                    it.setBackgroundGradient(BLUE1.copy, BLUE2.copy, 90);
                    it.setSelectionBackgroundGradient(BLUE1.copy, BLUE2.copy, 90);
                node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);
                it.invisible = false;
                if (transformationDummy.group) {
                    it.setGridPlacement(1);
                }
                if (transformationDummy.isGroup) {

                    // Get a smaller window-title-bare if this a macro state 
                    if (!transformationDummy.label.empty)
                        it.addRectangle => [
                            it.invisible = true
                            it.fontSize = 11;
                            it.fontSize.propagateToChildren = true
                            it.setForeground(DARKGRAY.copy)
                            it.setFontBold(true);
                            it.setGridPlacementData().from(LEFT, 0, 0, TOP, 8f, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
                            it.addText("   " + transformationDummy.label + " ").
                                putToLookUpWith(transformationDummy) => [
                                // WORKAROUND UNTIL WE KNOW HOW TO DISABLE SELECTION OF LABELS!
                                it.addDoubleClickAction(KiCoDisabledSelectionAction::ID);
                                it.addSingleClickAction(KiCoSelectionAction::ID);
                                it.setForeground(BLACK.copy);
                                it.setSelectionBackground(BLUE3.copy)
                                //                                it.setCursorSelectable(false)
                                //                                it.setSelectionInvisible(true)
                                it.setFontBold(true);
                                it.fontSize = 11;
                            ];
                        ];
                } else {

                    // For simple states we want a larger area 
                    it.addText(" " + transformationDummy.label).putToLookUpWith(transformationDummy) => [
                        // WORKAROUND UNTIL WE KNOW HOW TO DISABLE SELECTION OF LABELS!
                        it.addDoubleClickAction(KiCoDisabledSelectionAction::ID);
                        it.addSingleClickAction(KiCoSelectionAction::ID);
                        it.fontSize = 11;
                        it.setForeground(BLACK.copy)
                        it.setSelectionBackground(BLUE3.copy)
                        it.setFontBold(true);
                        it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
                    ];
                }
                if (transformationDummy.isGroup) {
                    for (dest : transformationDummy.dependencies) {
                        var transSource = transformationDummy
                        var transDest = dest
                        if (transSource != null && transDest != null) {
                            transSource.translateTransition(transDest, true)
                        }

                    }
                } else {
                    for (dest : transformationDummy.dependencies) {
                        var transSource = transformationDummy
                        var transDest = dest
                        if (transSource != null && transDest != null) {
                            transSource.translateTransition(transDest, false)
                        }
                    }
                }
            ];
        ]

        return root
    }

    // -------------------------------------------------------------------------
    // Translate a transition
    def KEdge translateTransition(FeatureDummy source, FeatureDummy dest, boolean dashed) {
        return createEdge() => [ edge |
            edge.source = source.node;
            edge.target = dest.node;
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
            edge.addSpline(2) => [
                it.setForeground(DARKGRAY.copy)
                if (dashed) {
                          it.lineStyle = LineStyle::CUSTOM;
                          it.lineStyle.dashPattern.clear;
                          it.lineStyle.dashPattern += TRANSITION_DASH_PATTERN;
                }
                it.addArrowDecorator()
            ]
        ];
    }

    // -------------------------------------------------------------------------
}
