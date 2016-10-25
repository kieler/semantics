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

import de.cau.cs.kieler.kico.internal.Transformation
import de.cau.cs.kieler.kico.ui.KiCoSelectionDiagramModel
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import java.util.Properties
import javax.inject.Inject
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.graph.KEdge
import org.eclipse.elk.graph.KNode

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import org.eclipse.elk.alg.layered.properties.LayeredOptions
import org.eclipse.elk.alg.layered.p2layers.LayeringStrategy

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


    // -------------------------------------------------------------------------
    // Translate a transition from feature to transition
    def KEdge translate(Transformation source, Transformation dest) {
        return createEdge() => [ edge |
            edge.source = source.node;
            edge.target = dest.node;
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

        knode.setLayoutOption(CoreOptions::DIRECTION, Direction::DOWN)
        knode.setLayoutOption(CoreOptions::SPACING_NODE, 25f);
        knode.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
        knode.setLayoutOption(LayeredOptions::THOROUGHNESS, 100)
        knode.setLayoutOption(CoreOptions::SEPARATE_CONNECTED_COMPONENTS, false);
        knode.setLayoutOption(LayeredOptions::SAUSAGE_FOLDING, true)
        knode.setLayoutOption(LayeredOptions::LAYERING_STRATEGY, LayeringStrategy::LONGEST_PATH)

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
            ];
        ]

        return root
    }

}
