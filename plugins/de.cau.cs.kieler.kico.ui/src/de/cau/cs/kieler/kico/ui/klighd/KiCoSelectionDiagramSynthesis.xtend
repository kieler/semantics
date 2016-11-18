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

import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.features.Feature
import de.cau.cs.kieler.kico.features.FeatureGroup
import de.cau.cs.kieler.kico.ui.KiCoDisabledSelectionAction
import de.cau.cs.kieler.kico.ui.KiCoSelectionAction
import de.cau.cs.kieler.kico.ui.KiCoSelectionDiagramModel
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import java.util.ArrayList
import java.util.HashSet
import java.util.Set
import javax.inject.Inject
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.core.util.Pair

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * KLighD visualization for KIELER Compiler transformation dependencies (for selecting compilation).
 * 
 * @author cmot
 * @kieler.design 2015-03-19 proposed cmot
 * @kieler.rating 2015-03-19 proposed yellow
 */
class KiCoSelectionDiagramSynthesis extends KiCoSynthesis {

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
    // Gets the hierarchical source for from one feature to another feature
    def Feature getHierarchicalSource(Feature source, Feature dest) {
        var returnPair = getHierarchicalSource(source, dest, 0)
        if (returnPair.first == -1) {
            return null
        }
        return (returnPair.last as Feature)
    }

    // -------------------------------------------------------------------------
    // Gets the hierarchical source for from one feature to another feature - HELPER
    def Pair<Integer, Feature> getHierarchicalSource(Feature source, Feature dest, int cnt) {
        if (source == null || dest == null) {
            return new Pair(-1, null)
        }
        if (dest.container == source.container || !source.container.isVisible) {

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

    // -------------------------------------------------------------------------
    // Gets the hierarchical destination for from one feature to another feature 
    def Feature getHierarchicalDest(Feature source, Feature dest) {
        var returnPair = getHierarchicalDest(source, dest, 0)
        if (returnPair.first == -1) {
            return null
        }

        return (returnPair.last as Feature)
    }

    // -------------------------------------------------------------------------
    // Gets the hierarchical destination for from one feature to another feature - HELPER
    def Pair<Integer, Feature> getHierarchicalDest(Feature source, Feature dest, int cnt) {
        if (source == null || dest == null) {
            return new Pair(-1, null)
        }
        if (dest.container == source.container || !dest.container.isVisible) {

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
    private static ArrayList<Integer> connected = new ArrayList<Integer>();

    // -------------------------------------------------------------------------
    // Translate a transition
    def KEdge translateTransition(Feature source, Feature dest) {
        return createEdge() => [ edge |
            edge.source = source.node;
            edge.target = dest.node;
            edge.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
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
    // Consider ALL registered features as valid container
    def Feature container(Feature feature) {

        // Only consider the visible features here!
        for (Feature other : KielerCompiler.getFeatures) {
            if (other.isGroupOrAlternative) {

                // if this is a typical FeatureGroup
                if (other instanceof FeatureGroup) {
                    if ((other as FeatureGroup).features.contains(feature)) {

                        //System.out.println("CONTAINER for Feature " + feature.id + " is " + other.id)
                        return other;
                    }
                }

                // if this is a feature that consists of alternatives
                else if (other.isAlternative && feature instanceof TransformationFeature) {
                    val transformationToSearchFor = (feature as TransformationFeature).transformation;
                    val otherHandlingTransformations = other.expandingTransformations;
                    if (transformationToSearchFor != null) {
                        if (otherHandlingTransformations.contains(transformationToSearchFor)) {

                            //System.out.println("CONTAINER for ALTERNATIVE TransformationFeature " + feature.id + " is " + other.id)
                            return other;
                        }
                    }
                }
            }
        }

        //System.out.println("CONTAINER for Feature " + feature.id + " not found")
        return null;
    }

    // -------------------------------------------------------------------------
    //   The Main entry transform function   
    override transform(KiCoSelectionDiagramModel model) {

        currentModel = model;

        connected.clear
        clearCache()

        val knode = model.createNode();
        
        // Apply spline edge routing on root level
        knode.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::SPLINES);

        for (elem : model.visibleFeatures) {
            if (elem.visibleContainer(model.visibleFeatures) == null) {
                visibleFeatures.add(elem);
                val kNode = elem.translate;
                knode.children.add(kNode);
            }
        }

        return knode;
    }

    // -------------------------------------------------------------------------
    // Must produce a list of features that can be (A) produced by the transformations and features that
    // (B) cannot handle the feature that our feature transforms 
    def Set<Feature> dependencies(Feature feature) {
        var returnList = new HashSet<Feature>();
        debug("Feature " + feature.id + " produces: ")

        // (A)
        for (transformation : feature.expandingTransformations) {
            debug("   Transformation " + transformation.id + " produces: ")
            for (producedFeature : transformation.producesFeatures) {
                debug("     - Feature " + producedFeature.id)
            }

            returnList.addAll(transformation.producesFeatures);
        }

        // (B)
        var transformations = feature.getNotHandlingTransformations(false);
        for (transformation : transformations) {
            returnList.add(transformation.expandsFeature);
        }
        returnList;
    }

    // -------------------------------------------------------------------------
    // Translate a Group
    def KNode translateGroup(Feature feature) {
        return createNode() => [ node |
            if (feature.isGroupOrAlternative) {
                node.setLayoutOption(KlighdProperties::EXPAND, false);
            }
            //node.setLayoutOption(CoreOptions::SPACING, 0f);
            if (feature.alternative) {

                for (transformation : feature.expandingTransformations) {
                    if (transformation.isVisible) {
                        val child = new TransformationFeature(transformation)
                        transformationFeatureMap.put(transformation, child)
                        visibleFeatures.add(child)
                        val childKNode = child.translate;
                        node.children += childKNode;
                    }
                }
            } else {

                // Only proceed with features that should be visible!!!
                if (feature.isVisible) {
                    visibleFeatures.add(feature)
                    val featureGroup = (feature as FeatureGroup);
                    val features = featureGroup.features;
                    for (child : features) {
                        visibleFeatures.add(child)
                        val childKNode = child.translate;
                        node.children += childKNode;
                    }
                }
            }
            // credits to SSM :-)
            if (feature.alternative) {
                node.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
                node.addLayoutParam(CoreOptions::SEPARATE_CONNECTED_COMPONENTS, false);
                node.setLayoutOption(CoreOptions::DIRECTION, Direction::RIGHT);
            }
            
            // Adjust edge routing of hierarchical node
            node.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
            
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
                if (feature.isGroupOrAlternative) {
                    it.addRectangle().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0).invisible = true;
                }
            ]
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
                if (feature.isGroupOrAlternative) {
                    it.addChildArea().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
                }
            ];
        ];
    }

    // -------------------------------------------------------------------------
    // Transform a state    
    def KNode translate(Feature feature) {

        //System.out.print(">>> " + feature);
        //System.out.println(" >>> " + feature.getId);
        val root = feature.createNode().putToLookUpWith(feature) => [ node |
            node.setLayoutOption(CoreOptions::EXPAND_NODES, true);
            val cornerRadius = if(!feature.isGroupOrAlternative) 17 else 8;
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
                if (feature.isGroupOrAlternative) {
                    it.setGridPlacement(1);
                }
                if (feature.isGroupOrAlternative) {
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
                            it.addText("   " + feature.label + " ").putToLookUpWith(feature) => [
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
                if (feature.isGroupOrAlternative) {
                    it.addChildArea().setGridPlacementData() => [
                        from(LEFT, -6, 0, TOP, -6, 0).to(RIGHT, -6, 0, BOTTOM, -6, 0)
                        minCellHeight = 5;
                        minCellWidth = 5;
                    ];
                } else {

                    for (dest : feature.dependencies) {

                        //System.out.println("FROM " + feature.id + " TO " + dest.id)
                        var transSource = feature
                        var transDest = dest

                        //Calculate hierarchical source + destination (prevents inter level transitions)
                        transSource = feature.getHierarchicalSource(dest)
                        transDest = transSource.getHierarchicalDest(dest)

                        //System.out.println("== HIERACHICALLY FROM " + transSource.id + " TO " + transDest.id)
                        if (transSource != null && transDest != null) {

                            debug(" CHK  CONT '" + transSource.id + "' TO '" + transDest.id + "'")
                            if (!(connected.contains(transSource.hashCode + transDest.hashCode))) {

                                //System.out.println(" DO   CONT '" + transSource.id + "' TO '" + transDest.id + "'  ::: " + connected.toString);
                                connected.add(transSource.hashCode + transDest.hashCode)

                                //System.out.println(" DONE  CONT '" + transSource.id + "' TO '" + transDest.id + "'  ::: " + connected.toString);
                                transSource.translateTransition(transDest)
                            }
                        }
                    }
                }
            ];
            if (feature.isGroupOrAlternative) {
                node.children += feature.translateGroup
            }
        ]

        return root
    }

// -------------------------------------------------------------------------
}
