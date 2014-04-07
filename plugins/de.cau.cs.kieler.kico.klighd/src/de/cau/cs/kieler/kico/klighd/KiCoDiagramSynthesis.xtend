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
package de.cau.cs.kieler.kico.klighd

import com.google.inject.Injector
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.KDecoratorPlacementData
import de.cau.cs.kieler.core.krendering.KPolygon
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KRectangle
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.util.Pair
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.microlayout.PlacementUtil
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import java.util.List
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.serializer.ISerializer

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kico.KielerCompiler
import static de.cau.cs.kieler.kico.klighd.KiCoDiagramSynthesis.*
import de.cau.cs.kieler.kico.TransformationDummy
import java.util.LinkedList
import java.util.HashMap

/**
 * KLighD visualization for KIELER SCCharts (Sequentially Constructive Charts).
 * 
 * @author cmot ssm
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
class KiCoDiagramSynthesis extends AbstractDiagramSynthesis<List<TransformationDummy>> {

    // -------------------------------------------------------------------------
    // We need some extensions 
    @Inject
    extension KNodeExtensions

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
 
    // --------------------------------------------------------------------------
    // Some color and pattern constants
    private static val float TRANSITION_DASH_BLACK = 7;
    private static val float TRANSITION_DASH_WHITE = 3;
    private static val List<Float> TRANSITION_DASH_PATTERN = newArrayList(TRANSITION_DASH_BLACK, TRANSITION_DASH_WHITE);
    private static val KColor GRAY = RENDERING_FACTORY.createKColor() =>
        [it.red = 240; it.green = 240; it.blue = 240];
    private static val KColor KEYWORD = RENDERING_FACTORY.createKColor() => [it.red = 115; it.green = 0; it.blue = 65];
    public static val KColor DARKGRAY = RENDERING_FACTORY.createKColor() => [it.red = 140; it.green = 140; it.blue = 140];
    public static val KColor BLACK = RENDERING_FACTORY.createKColor() => [it.red = 0; it.green = 0; it.blue = 0];
    public static val KColor WHITE = RENDERING_FACTORY.createKColor() => [it.red = 255; it.green = 255; it.blue = 255];

    // Some self-defined colors 
    public static val KColor BLUE1 = RENDERING_FACTORY.createKColor() =>
        [it.red = 248; it.green = 249; it.blue = 253];
    public static val KColor BLUE2 = RENDERING_FACTORY.createKColor() =>
        [it.red = 205; it.green = 220; it.blue = 243];
    public static val KColor BLUE3 = RENDERING_FACTORY.createKColor() =>
        [it.red = 0; it.green = 0; it.blue = 255];
    public static val KColor BLUE4 = RENDERING_FACTORY.createKColor() =>
        [it.red = 00; it.green = 00; it.blue = 180];

    public static val KColor GRAY1 = RENDERING_FACTORY.createKColor() =>
        [it.red = 248; it.green = 248; it.blue = 248];
    public static val KColor GRAY2 = RENDERING_FACTORY.createKColor() =>
        [it.red = 210; it.green = 230; it.blue = 230];

    private static val String ANNOTATION_LABELBREAK = "break"

    // -------------------------------------------------------------------------
    def TransformationDummy container(TransformationDummy transformationDummy) {
        if (transformationDummy != null && transformationDummy.reverseDependencies != null &&
            transformationDummy.reverseDependencies.length > 0) {
            var TransformationDummy possibleContainer = null
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
    def TransformationDummy getHierarchicalSource(TransformationDummy source, TransformationDummy dest) {
        var returnPair = getHierarchicalSource(source, dest, 0)
        if (returnPair.first == -1) {
            return null
        }
        return (returnPair.last as TransformationDummy)
    }

    def Pair<Integer, TransformationDummy> getHierarchicalSource(TransformationDummy source, TransformationDummy dest,
        int cnt) {
        if (source == null || dest == null) {
            return new Pair(-1, null)
        }
        if (dest.container == source.container) {

            // if this is a group-internal transition
            return new Pair(cnt, source)
        } else {
            val left = getHierarchicalSource(source.container, dest, cnt + 1)
            val right = getHierarchicalSource(source, dest.container, cnt + 1)
            if (left.first != -1 && right.first != -1) {
                if (left.first < right.first) {
                    return left
                } else {
                    return right
                }
            } else if (left.first != -1) {
                return left
            } else if (right.first != -1) {
                return right
            }
        }
        return new Pair(-1, null)
    }

    def TransformationDummy getHierarchicalDest(TransformationDummy source, TransformationDummy dest) {
        var returnPair = getHierarchicalDest(source, dest, 0)
        if (returnPair.first == -1) {
            return null
        }

        return (returnPair.last as TransformationDummy)
    }

    def Pair<Integer, TransformationDummy> getHierarchicalDest(TransformationDummy source, TransformationDummy dest,
        int cnt) {
        if (source == null || dest == null) {
            return new Pair(-1, null)
        }
        if (dest.container == source.container) {

            // if this is a group-internal transition
            return new Pair(cnt, dest)
        } else {
            val left = getHierarchicalDest(source.container, dest, cnt + 1)
            val right = getHierarchicalDest(source, dest.container, cnt + 1)
            if (left.first != -1 && right.first != -1) {
                if (left.first < right.first) {
                    return left
                } else {
                    return right
                }
            } else if (left.first != -1) {
                return left
            } else if (right.first != -1) {
                return right
            }
        }
        return new Pair(-1, null)
    }

    // -------------------------------------------------------------------------
    // Remember which super states already are connected (render just a single connection)
    private HashMap<TransformationDummy, TransformationDummy> connected = new HashMap<TransformationDummy, TransformationDummy>();

    // The Main entry transform function   
    override transform(List<TransformationDummy> model) {
        connected.clear

        val knode = model.createNode();

        for (elem : model) {
            if (elem.container == null) {
                val kNode = elem.translate;
                knode.children.add(kNode);
            }
        }

        return knode;
    }

    def String getLabel(TransformationDummy s) {
        s.transformation.name
    }

    // -------------------------------------------------------------------------
    // Transform a state    
    def dispatch KNode translate(TransformationDummy transformationDummy) {

        val root = transformationDummy.createNode().putToLookUpWith(transformationDummy) => [ node |
            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);
            val cornerRadius = if(!transformationDummy.isGroup) 17 else 8;
            val lineWidth = 1;
            val figure = node.addRoundedRectangle(cornerRadius, cornerRadius, lineWidth).background = "white".color;
            //            figure.setProperty(KlighdProperties::, true);
            figure.addSingleClickAction(KiCoSelectionAction::ID);
            figure.lineWidth = lineWidth;
            figure.foreground = "gray".color;
            // shaddow
            figure.shadow = "black".color;
            figure.shadow.XOffset = 4;
            figure.shadow.YOffset = 4;
            (
               figure => [
                if (KiCoSelectionView.isSelectedTransformation(transformationDummy.id, KiCoSelectionView.activeEditorID)) {
                    it.setBackgroundGradient(BLUE3.copy, BLUE3.copy, 90);
                    it.setSelectionBackgroundGradient(BLUE3.copy, BLUE3.copy, 90);
                } else {
                    it.setBackgroundGradient(BLUE1.copy, BLUE2.copy, 90);
                    it.setSelectionBackgroundGradient(BLUE1.copy, BLUE2.copy, 90);
                }
            ]
             ) => [
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
                            val ktext = it.addText("   " + transformationDummy.label + " ").
                                putToLookUpWith(transformationDummy) => [
                                // WORKAROUND UNTIL WE KNOW HOW TO DISABLE SELECTION OF LABELS!
                                it.addSingleClickAction(KiCoSelectionAction::ID);
                                if (KiCoSelectionView.isSelectedTransformation(transformationDummy.id, KiCoSelectionView.activeEditorID)) {
                                    it.setForeground("white".color)
                                    it.setSelectionBackground("white".color)
                                } else {
                                    it.setForeground(DARKGRAY.copy)
                                    it.setSelectionBackground(BLUE3.copy)
                                }
                                //                                it.setCursorSelectable(false)
                                //                                it.setSelectionInvisible(true)
                                it.setFontBold(true);
                                it.fontSize = 11;
                            ];
                        ];
                } else {

                    // For simple states we want a larger area 
                    val ktext = it.addText(" " + transformationDummy.label).putToLookUpWith(transformationDummy) => [
                        // WORKAROUND UNTIL WE KNOW HOW TO DISABLE SELECTION OF LABELS!
                        it.addSingleClickAction(KiCoSelectionAction::ID);
                        it.fontSize = 11;
                        if (KiCoSelectionView.isSelectedTransformation(transformationDummy.id, KiCoSelectionView.activeEditorID)) {
                            it.setForeground("white".color)
                            it.setSelectionBackground("white".color)
                        } else {
                            it.setForeground(DARKGRAY.copy)
                            it.setSelectionBackground(BLUE3.copy)
                        }
                        //                        it.setCursorSelectable(false)
                        //                        it.setSelectionInvisible(true)
                        it.setFontBold(true);
                        it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
                    ];
                }
                if (transformationDummy.isGroup) {
                    it.addChildArea().setGridPlacementData() => [
                        from(LEFT, 3, 0, TOP, 3, 0).to(RIGHT, 3, 0, BOTTOM, 3, 0)
                        minCellHeight = 5;
                        minCellWidth = 5;
                    ];
                } else {

                    //                    System.out.println("FROM "+source.id+" TO "+dest.id)
                    for (dest : transformationDummy.dependencies) {

                        //                        System.out.println("FROM " + s.id + " TO " + dest.id)
                        var transSource = transformationDummy
                        var transDest = dest

                        //Calculate hierarchical source + destination (prevents inter level transitions)
                        transSource = transformationDummy.getHierarchicalSource(dest)
                        transDest = transformationDummy.getHierarchicalDest(dest)

                        if (transSource != null && transDest != null) {

                            //                            System.out.println(" CONT " + transSource.id + " TO " + transDest.id)
                            if (connected.get(transSource) != transDest) {
                                connected.put(transSource, transDest)
                                transSource.translateTransition(transDest)
                            }
                        }

                    }
                }
            ];
            if (transformationDummy.isGroup) {
                node.children += transformationDummy.translateGroup
            }
        ]

        return root
    }

    def dispatch KNode translateGroup(TransformationDummy transformationDummy) {
        return createNode() => [ node |
            if (transformationDummy.dependencies.size > 1) {
                //node.setLayoutOption(KlighdConstants::EXPAND, false);
            }
            for (child : transformationDummy.dependencies) {
                val childKNode = child.translate;
                node.children += childKNode;
            }
            node.addRectangle() => [
                it.setProperty(KlighdProperties::EXPANDED_RENDERING, true);
                it.setBackgroundGradient("white".color, GRAY, 90);
                it.setSelectionBackgroundGradient("white".color, GRAY, 90); // Selection KLighD trick
                it.setSurroundingSpace(2, 0);
                it.invisible = false;
                it.foreground = "gray".color
                it.lineWidth = 1;
                it.addText("[-]" + " " + transformationDummy.label) => [
                    it.foreground = "darkGray".color
                    it.fontSize = 10
                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                ];
                if (transformationDummy.dependencies.size > 1) {
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
                it.addText("[+]" + " " + transformationDummy.label) => [
                    it.foreground = "darkGray".color
                    it.fontSize = 10
                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                ];
                if (transformationDummy.dependencies.size > 1) {
                    it.addRectangle().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0).invisible = true;
                }
            ]
        ];
    }

    // -------------------------------------------------------------------------
    // Translate a transition
    def KEdge translateTransition(TransformationDummy source, TransformationDummy dest) {
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

//
//    // -------------------------------------------------------------------------
//    // Different renderings for different transition types
//    def KRendering addStrongAbortionDecorator(KPolyline line) {
//        return line.addEllipse() => [
//            it.lineWidth = 1;
//            it.background = "red".color
//            it.setDecoratorPlacementData(10, 10, 4, 0, false);
//        ];
//    }
//
//    def KRendering addDeferredDecorator(KContainerRendering line, float offset) {
//        return line.addEllipse() => [
//            it.lineWidth = 1;
//            it.background = "red".color
//            it.setDecoratorPlacementData(10, 10, -4 + offset, 1, false);
//        ];
//    }
//
//    def KPolygon addNormalTerminationDecorator(KPolyline line) {
//        return line.drawTriangle() => [
//            it.lineWidth = 1;
//            it.background = "green".color
//            it.setDecoratorPlacementData(11, 11, 5, 0, true);
//        ];
//    }
//
//    def KRendering addShallowHistoryDecorator(KContainerRendering line) {
//        return line.addEllipse() => [
//            it.lineWidth = 0;
//            it.setForeground(DARKGRAY.copy)
//            it.background = DARKGRAY.copy
//            it.setDecoratorPlacementData(16, 16, -6, 1, false);
//            it.addPolyline(1) => [
//                it.lineWidth = 2;
//                it.points += createKPosition(LEFT, 5, 0, TOP, 4, 0);
//                it.points += createKPosition(LEFT, 5, 0, BOTTOM, 4, 0);
//                it.points += createKPosition(LEFT, 5, 0, TOP, 0, 0.5f);
//                it.points += createKPosition(RIGHT, 5, 0, TOP, 0, 0.5f);
//                it.points += createKPosition(RIGHT, 5, 0, BOTTOM, 4, 0);
//                it.points += createKPosition(RIGHT, 5, 0, TOP, 4, 0);
//                it.setForeground("white".color);
//            ];
//        ];
//    }
//
//    def KRendering addDeepHistoryDecorator(KContainerRendering line) {
//        return line.addEllipse() => [
//            it.lineWidth = 0;
//            it.setForeground(DARKGRAY.copy)
//            it.background = DARKGRAY.copy
//            it.setDecoratorPlacementData(16, 16, -6, 1, false);
//            it.addPolyline(1) => [
//                it.lineWidth = 2;
//                it.points += createKPosition(LEFT, 3, 0, TOP, 4, 0);
//                it.points += createKPosition(LEFT, 3, 0, BOTTOM, 4, 0);
//                it.points += createKPosition(LEFT, 3, 0, TOP, 0, 0.5f);
//                it.points += createKPosition(RIGHT, 7, 0, TOP, 0, 0.5f);
//                it.points += createKPosition(RIGHT, 7, 0, BOTTOM, 4, 0);
//                it.points += createKPosition(RIGHT, 7, 0, TOP, 4, 0);
//                it.setForeground("white".color);
//            ];
//            it.addText("*") => [
//                it.setForeground("white".color)
//                it.setPointPlacementData(createKPosition(LEFT, 10, 0, TOP, 0, 0), H_LEFT, V_TOP, 6, 0, 0, 0)
//            ]
//        ];
//    }
// -------------------------------------------------------------------------
}
