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

//import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * KLighD visualization for KIELER Compiler transformation dependencies (for selecting compilation).
 * 
 * @author cmot
 * @kieler.design 2014-04-08 proposed cmot
 * @kieler.rating 2014-04-08 proposed yellow
 */
class KiCoDiagramSynthesis extends AbstractDiagramSynthesis<List<Feature>> {

    static final boolean DEBUG = false;

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
    private static val KColor GRAY = RENDERING_FACTORY.createKColor() =>
        [it.red = 240; it.green = 240; it.blue = 240];
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


//    // -------------------------------------------------------------------------
//    def FeatureDummy container(FeatureDummy transformationDummy) {
//        if (transformationDummy != null && transformationDummy.reverseDependencies != null &&
//            transformationDummy.reverseDependencies.length > 0) {
//            var FeatureDummy possibleContainer = null
//            for (reverseDependency : transformationDummy.reverseDependencies) {
//                if (reverseDependency.group) {
//                    if (possibleContainer != null && possibleContainer != reverseDependency) {
//                        return null
//                    }
//                    possibleContainer = reverseDependency
//                }
//            }
//            if (possibleContainer != null) {
//                return possibleContainer
//            }
//            return null;
//        }
//        return null;
//    }
//
//    // -------------------------------------------------------------------------
//    def FeatureDummy getHierarchicalSource(FeatureDummy source, FeatureDummy dest) {
//        var returnPair = getHierarchicalSource(source, dest, 0)
//        if (returnPair.first == -1) {
//            return null
//        }
//        return (returnPair.last as FeatureDummy)
//    }
//
//    def Pair<Integer, FeatureDummy> getHierarchicalSource(FeatureDummy source, FeatureDummy dest,
//        int cnt) {
//        if (source == null || dest == null) {
//            return new Pair(-1, null)
//        }
//        if (dest.container == source.container) {
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
//    def FeatureDummy getHierarchicalDest(FeatureDummy source, FeatureDummy dest) {
//        var returnPair = getHierarchicalDest(source, dest, 0)
//        if (returnPair.first == -1) {
//            return null
//        }
//
//        return (returnPair.last as FeatureDummy)
//    }
//
//    def Pair<Integer, FeatureDummy> getHierarchicalDest(FeatureDummy source, FeatureDummy dest,
//        int cnt) {
//        if (source == null || dest == null) {
//            return new Pair(-1, null)
//        }
//        if (dest.container == source.container) {
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
//
//    // -------------------------------------------------------------------------
//    // Remember which super states already are connected (render just a single connection)
//    private static ArrayList<Integer> connected = new ArrayList<Integer>();
//    
//    // The Main entry transform function   
//    override transform(List<FeatureDummy> model) {
//        connected.clear
//
//        val knode = model.createNode();
//
//        for (elem : model) {
//            if (elem.container == null) {
//                val kNode = elem.translate;
//                knode.children.add(kNode);
//            }
//        }
//
//
//        return knode;
//    }
//
//    def String getLabel(FeatureDummy s) {
//        s.transformation.name
//    }
//
//    // -------------------------------------------------------------------------
//    // Transform a state    
//    def  KNode translate(FeatureDummy transformationDummy) {
//
//        val root = transformationDummy.createNode().putToLookUpWith(transformationDummy) => [ node |
//            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);
//            val cornerRadius = if(!transformationDummy.isGroup) 17 else 8;
//            val lineWidth = 1;
//            val figure = node.addRoundedRectangle(cornerRadius, cornerRadius, lineWidth).background = "white".color;
//            //            figure.setProperty(KlighdProperties::, true);
//            figure.addDoubleClickAction(KiCoDisabledSelectionAction::ID);
//            figure.addSingleClickAction(KiCoSelectionAction::ID);
//            figure.lineWidth = lineWidth;
//            figure.foreground = "gray".color;
//            // shaddow
//            figure.shadow = "black".color;
//            figure.shadow.XOffset = 4;
//            figure.shadow.YOffset = 4;
//            figure => [
//                it.putToLookUpWith(transformationDummy)
//                    it.setBackgroundGradient(BLUE1.copy, BLUE2.copy, 90);
//                    it.setSelectionBackgroundGradient(BLUE1.copy, BLUE2.copy, 90);
//                node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);
//                it.invisible = false;
//                if (transformationDummy.group) {
//                    it.setGridPlacement(1);
//                }
//                if (transformationDummy.isGroup) {
//                    it.setProperty(KlighdProperties::TOOLTIP, transformationDummy.id);
//
//                    // Get a smaller window-title-bare if this a macro state 
//                    if (!transformationDummy.label.empty)
//                        it.addRectangle => [
//                            it.invisible = true
//                            it.fontSize = 11;
//                            it.fontSize.propagateToChildren = true
//                            it.setForeground(DARKGRAY.copy)
//                            it.setFontBold(true);
//                            it.setGridPlacementData().from(LEFT, 0, 0, TOP, 8f, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
//                            it.addText("   " + transformationDummy.label + " ").
//                                putToLookUpWith(transformationDummy) => [
//                                // WORKAROUND UNTIL WE KNOW HOW TO DISABLE SELECTION OF LABELS!
//                                it.addDoubleClickAction(KiCoDisabledSelectionAction::ID);
//                                it.addSingleClickAction(KiCoSelectionAction::ID);
//                                it.setForeground(BLACK.copy);
//                                it.setSelectionBackground(BLUE3.copy)
//                                //                                it.setCursorSelectable(false)
//                                //                                it.setSelectionInvisible(true)
//                                it.setFontBold(true);
//                                it.fontSize = 11;
//                            ];
//                        ];
//                } else {
//                    it.setProperty(KlighdProperties::TOOLTIP, transformationDummy.id);
//
//                    // For simple states we want a larger area 
//                    it.addText(" " + transformationDummy.label).putToLookUpWith(transformationDummy) => [
//                        // WORKAROUND UNTIL WE KNOW HOW TO DISABLE SELECTION OF LABELS!
//                        it.addDoubleClickAction(KiCoDisabledSelectionAction::ID);
//                        it.addSingleClickAction(KiCoSelectionAction::ID);
//                        it.fontSize = 11;
//                        it.setForeground(BLACK.copy)
//                        it.setSelectionBackground(BLUE3.copy)
//                        //                        it.setCursorSelectable(false)
//                        //                        it.setSelectionInvisible(true)
//                        it.setFontBold(true);
//                        it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
//                    ];
//                }
//                if (transformationDummy.isGroup) {
//                    it.addChildArea().setGridPlacementData() => [
//                        from(LEFT, 3, 0, TOP, 3, 0).to(RIGHT, 3, 0, BOTTOM, 3, 0)
//                        minCellHeight = 5;
//                        minCellWidth = 5;
//                    ];
//                } else {
//
//                    //                    System.out.println("FROM "+source.id+" TO "+dest.id)
//                    for (dest : transformationDummy.dependencies) {
//
//                        //                        System.out.println("FROM " + s.id + " TO " + dest.id)
//                        var transSource = transformationDummy
//                        var transDest = dest
//
//                        //Calculate hierarchical source + destination (prevents inter level transitions)
//                        transSource = transformationDummy.getHierarchicalSource(dest)
//                        transDest = transformationDummy.getHierarchicalDest(dest)
//
//                        if (transSource != null && transDest != null) {
//
//                            debug(" CHK  CONT '" + transSource.id + "' TO '" + transDest.id + "'" )
//                            if (!(connected.contains(transSource.hashCode + transDest.hashCode))) {
//                                //System.out.println(" DO   CONT '" + transSource.id + "' TO '" + transDest.id + "'  ::: " + connected.toString);
//                                connected.add(transSource.hashCode + transDest.hashCode)
//                                //System.out.println(" DONE  CONT '" + transSource.id + "' TO '" + transDest.id + "'  ::: " + connected.toString);
//                                transSource.translateTransition(transDest)
//                            }
//                        }
//
//                    }
//                }
//            ];
//            if (transformationDummy.isGroup) {
//                node.children += transformationDummy.translateGroup
//            }
//        ]
//
//        return root
//    }
//
//    // -------------------------------------------------------------------------
//    // Create a string of spaces with the length of the original text
//    def String getSpacedOut(int num) {
//        if (num > 0) {
//            return " " + getSpacedOut(num-1);
//        }
//        return ""
//    }
//
//    // Create a string of spaces with the length of the original text
//    def String getSpacedOut(String originalText, int factor) {
//        return getSpacedOut(originalText.length * factor)
//    }
//
//    // -------------------------------------------------------------------------
//    // Translate a Group
//    def KNode translateGroup(FeatureDummy transformationDummy) {
//        return createNode() => [ node |
//            if (transformationDummy.group) {
//                node.setLayoutOption(KlighdProperties::EXPAND, false);
//            }
//            for (child : transformationDummy.dependencies) {
//                val childKNode = child.translate;
//                node.children += childKNode;
//            }
//            
//            // credits to SSM :-)
//            if (transformationDummy.alternative) {
//                node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered")
//                node.addLayoutParam(LayoutOptions::SEPARATE_CC, false);
//                node.setLayoutOption(LayoutOptions::DIRECTION, Direction::RIGHT);            
//            }
//
//            node.addRectangle() => [
//                it.setProperty(KlighdProperties::EXPANDED_RENDERING, true);
//                it.setBackgroundGradient("white".color, GRAY, 90);
//                it.setSelectionBackgroundGradient("white".color, GRAY, 90); // Selection KLighD trick
//                it.setSurroundingSpace(2, 0);
//                it.invisible = false;
//                it.foreground = "gray".color
//                it.lineWidth = 1;
//                //FIXME: hacky workaround
//                it.addText("[-]" + getSpacedOut(transformationDummy.label, 2) + " ") => [
//                    it.foreground = "dimGray".color
////                    it.foreground = "white".color
//                    it.fontSize = 10
//                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
//                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
//                ];
//                if (transformationDummy.dependencies.size > 1) {
//                    it.addChildArea().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
//                }
//            ];
//            node.addRectangle() => [
//                it.setProperty(KlighdProperties::COLLAPSED_RENDERING, true);
//                it.setBackgroundGradient("white".color, GRAY, 90);
//                it.setSelectionBackgroundGradient("white".color, GRAY, 90); // Selection KLighD trick
//                it.setSurroundingSpace(4, 0);
//                it.invisible = false;
//                it.foreground = "gray".color
//                it.lineWidth = 1;
//                //FIXME: hacky workaround
//                it.addText("[+]" + getSpacedOut(transformationDummy.label, 2) + " ") => [
//                    it.foreground = "dimGray".color
////                    it.foreground = "white".color
//                    it.fontSize = 10
//                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
//                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
//                ];
//                if (transformationDummy.dependencies.size > 1) {
//                    it.addRectangle().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0).invisible = true;
//                }
//            ]
//        ];
//    }
//
//    // -------------------------------------------------------------------------
//    // Translate a transition
//    def KEdge translateTransition(FeatureDummy source, FeatureDummy dest) {
//        return createEdge() => [ edge |
//            edge.source = source.node;
//            edge.target = dest.node;
//            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
//            edge.addSpline(2) => [
//                it.setForeground(DARKGRAY.copy)
//                // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
//                //                if (t.isImmediate2) {
//                //                    it.lineStyle = LineStyle::CUSTOM;
//                //                    it.lineStyle.dashPattern.clear;
//                //                    it.lineStyle.dashPattern += TRANSITION_DASH_PATTERN;
//                //                }
//                it.addArrowDecorator()
//            ]
//        ];
//    }
//
//    // -------------------------------------------------------------------------

    def Feature container(Feature feature) {
        for (Feature other : KielerCompiler.getFeatures) {
            if (other.isGroup) {
                if ((other as FeatureGroup).features.contains(feature)) {
                    return other;
                }
            }
        }
        return null;
    }

    
    // The Main entry transform function   
    override transform(List<Feature> model) {
        //connected.clear

        val knode = model.createNode();

        for (elem : model) {
            if (elem.container == null) {
                val kNode = elem.translate;
                knode.children.add(kNode);
            }
        }


        return knode;
    }

    // -------------------------------------------------------------------------

    // Get the display name for the feature
    def String getLabel(Feature s) {
        s.name
    }

    // If more than one handling transformation, then this is an alternative   
    def isAlternative(Feature feature) {
        feature.handlingTransformations.size > 1;
    }
 
    // Display a feature as a group, if it has several handling transformations (alternative) or if it really is a feature group!
    def isGroup(Feature feature) {
        (feature.isAlternative || feature instanceof FeatureGroup);
    }

    // -------------------------------------------------------------------------
    // Create a string of spaces with the length of the original text
    def String getSpacedOut(int num) {
        if (num > 0) {
            return " " + getSpacedOut(num-1);
        }
        return ""
    }

    // Create a string of spaces with the length of the original text
    def String getSpacedOut(String originalText, int factor) {
        return getSpacedOut(originalText.length * factor)
    }

    
    
    // -------------------------------------------------------------------------
    // Translate a Group
    def KNode translateGroup(Feature feature) {
        return createNode() => [ node |
            if (feature.group) {
                node.setLayoutOption(KlighdProperties::EXPAND, false);
            }
            for (child : (feature as FeatureGroup).features) {
                val childKNode = child.translate;
                node.children += childKNode;
            }
            
            // credits to SSM :-)
            if (feature.alternative) {
                node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered")
                node.addLayoutParam(LayoutOptions::SEPARATE_CC, false);
                node.setLayoutOption(LayoutOptions::DIRECTION, Direction::RIGHT);            
            }

            node.addRectangle() => [
                it.setProperty(KlighdProperties::EXPANDED_RENDERING, true);
                it.setBackgroundGradient("white".color, GRAY, 90);
                it.setSelectionBackgroundGradient("white".color, GRAY, 90); // Selection KLighD trick
                it.setSurroundingSpace(2, 0);
                it.invisible = false;
                it.foreground = "gray".color
                it.lineWidth = 1;
                //FIXME: hacky workaround
                it.addText("[-]" + getSpacedOut(feature.label, 2) + " ") => [
                    it.foreground = "dimGray".color
//                    it.foreground = "white".color
                    it.fontSize = 10
                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                ];
                if (feature.group) {
                    it.addChildArea().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
                }
            ];
            node.addRectangle() => [
                it.setProperty(KlighdProperties::COLLAPSED_RENDERING, true);
                it.setBackgroundGradient("white".color, GRAY, 90);
                it.setSelectionBackgroundGradient("white".color, GRAY, 90); // Selection KLighD trick
                it.setSurroundingSpace(4, 0);
                it.invisible = false;
                it.foreground = "gray".color
                it.lineWidth = 1;
                //FIXME: hacky workaround
                it.addText("[+]" + getSpacedOut(feature.label, 2) + " ") => [
                    it.foreground = "dimGray".color
//                    it.foreground = "white".color
                    it.fontSize = 10
                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                ];
                if (feature.group) {
                    it.addRectangle().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0).invisible = true;
                }
            ]
        ];
    }


    // -------------------------------------------------------------------------
    // Transform a state    
    def  KNode translate(Feature feature) {

        val root = feature.createNode().putToLookUpWith(feature) => [ node |
            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);
            val cornerRadius = if(!feature.isGroup) 17 else 8;
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
                it.putToLookUpWith(feature)
                    it.setBackgroundGradient(BLUE1.copy, BLUE2.copy, 90);
                    it.setSelectionBackgroundGradient(BLUE1.copy, BLUE2.copy, 90);
                node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);
                it.invisible = false;
                if (feature.group) {
                    it.setGridPlacement(1);
                }
                if (feature.isGroup) {
                    it.setProperty(KlighdProperties::TOOLTIP, feature.id);

                    // Get a smaller window-title-bare if this a macro state 
                    if (!feature.label.empty)
                        it.addRectangle => [
                            it.invisible = true
                            it.fontSize = 11;
                            it.fontSize.propagateToChildren = true
                            it.setForeground(DARKGRAY.copy)
                            it.setFontBold(true);
                            it.setGridPlacementData().from(LEFT, 0, 0, TOP, 8f, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
                            it.addText("   " + feature.label + " ").
                                putToLookUpWith(feature) => [
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
                    it.setProperty(KlighdProperties::TOOLTIP, feature.id);

                    // For simple states we want a larger area 
                    it.addText(" " + feature.label).putToLookUpWith(feature) => [
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
                }
                if (feature.isGroup) {
                    it.addChildArea().setGridPlacementData() => [
                        from(LEFT, 3, 0, TOP, 3, 0).to(RIGHT, 3, 0, BOTTOM, 3, 0)
                        minCellHeight = 5;
                        minCellWidth = 5;
                    ];
                } else {

//                    //                    System.out.println("FROM "+source.id+" TO "+dest.id)
//                    for (dest : feature.dependencies) {
//
//                        //                        System.out.println("FROM " + s.id + " TO " + dest.id)
//                        var transSource = transformationDummy
//                        var transDest = dest
//
//                        //Calculate hierarchical source + destination (prevents inter level transitions)
//                        transSource = transformationDummy.getHierarchicalSource(dest)
//                        transDest = transformationDummy.getHierarchicalDest(dest)
//
//                        if (transSource != null && transDest != null) {
//
//                            debug(" CHK  CONT '" + transSource.id + "' TO '" + transDest.id + "'" )
//                            if (!(connected.contains(transSource.hashCode + transDest.hashCode))) {
//                                //System.out.println(" DO   CONT '" + transSource.id + "' TO '" + transDest.id + "'  ::: " + connected.toString);
//                                connected.add(transSource.hashCode + transDest.hashCode)
//                                //System.out.println(" DONE  CONT '" + transSource.id + "' TO '" + transDest.id + "'  ::: " + connected.toString);
//                                transSource.translateTransition(transDest)
//                            }
//                        }
//                    }
                }
            ];
            if (feature.isGroup) {
                node.children += feature.translateGroup
            }
        ]

        return root
    }


}
