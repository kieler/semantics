/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.klighd.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kitt.klighd.tracing.TracingVisualizationProperties
import de.cau.cs.kieler.klay.layered.p4nodes.NodePlacementStrategy
import de.cau.cs.kieler.klay.layered.properties.Properties
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtension
import de.cau.cs.kieler.sccharts.klighd.actions.ReferenceExpandAction
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.DataflowRegionStyles

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * @author ssm
 *
 */
@ViewSynthesisShared
class DataflowRegionSynthesis extends SubSynthesis<DataflowRegion, KNode> {
    
    @Inject 
    extension KNodeExtensions

    @Inject
    extension KRenderingExtensions

    @Inject
    extension KExpressionsDeclarationExtensions
    
    @Inject
    extension DataflowRegionStyles
    
    @Inject
    extension SCChartsSerializeHRExtension
    
    @Inject
    extension EquationSynthesis    
    
    override performTranformation(DataflowRegion region) {
        val node = region.createNode().associateWith(region);

        node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
        node.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
        node.addLayoutParam(LayoutOptions::DIRECTION, Direction::RIGHT);
//        node.addLayoutParam(Properties::THOROUGHNESS, 100);
        node.addLayoutParam(Properties::NODE_PLACER, NodePlacementStrategy::BRANDES_KOEPF);
        node.setLayoutOption(LayoutOptions::SPACING, 20f);
        node.setLayoutOption(LayoutOptions::BORDER_SPACING, 8f);

        node.setLayoutOption(KlighdProperties::EXPAND, true);

        if (!region.equations.empty) {

            val label = if(region.label.nullOrEmpty) "" else " " + region.label;
    
            // Expanded
            node.addRegionFigure => [
                setAsExpandedView
                if (region.declarations.empty) {
                    addStatesArea(label.nullOrEmpty);
                } else {
                    addStatesAndDeclarationsArea();
                    // Add declarations
                    for (declaration : region.variableDeclarations) {
                        addDeclarationLabel(declaration.serializeComponents(true)) => [
                            setProperty(TracingVisualizationProperties.TRACING_NODE, true);
                            associateWith(declaration);
                            children.forEach[associateWith(declaration)];
                        ]
                    }
                }
                // Add Button after area to assure correct overlapping
                addButton("[-]" + label).addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
            ]
    
            // Collapsed
            node.addRegionFigure => [
                setAsCollapsedView
                addButton("[+]" + label).addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
            ]
            
    
            // translate all direct dataflow equations
            for (equation: region.equations) {
                node.children += equation.transformToSet;
            }
        
        }

        return node;
    }
    
    /**
     * Create region area for reference states
     * 
     * @param state 
     *          the reference state
     */
    def KNode createReferenceDataflowRegion(ValuedObject valuedObject) {
        val node = createNode().associateWith(valuedObject); // This association is important for the ReferenceExpandAction
//        if (USE_KLAY.booleanValue) {
            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
            node.setLayoutOption(LayoutOptions::SPACING, 3f);
            node.setLayoutOption(LayoutOptions::BORDER_SPACING, 8f);
//        } else {
//            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot");
//            node.setLayoutOption(LayoutOptions::SPACING, 40f);
//        }
//        node.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
//        node.setLayoutOption(LayoutOptions::SPACING, 40f);

        // Set initially collapsed
        node.setLayoutOption(KlighdProperties::EXPAND, false);

        // Expanded
        node.addRegionFigure => [
            setAsExpandedView;
            addStatesArea(true);
            // Add Button after area to assure correct overlapping
            // Use special expand action to resolve references
            addButton("[-]").addDoubleClickAction(ReferenceExpandAction::ID);
        ]

        // Collapsed
        node.addRegionFigure => [
            setAsCollapsedView;
            addButton("[+]").addDoubleClickAction(ReferenceExpandAction::ID);
        ]

        return node;
    }    
    
}