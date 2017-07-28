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
package de.cau.cs.kieler.sccharts.ui.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kitt.klighd.tracing.TracingVisualizationProperties
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.actions.ReferenceExpandAction
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.DataflowRegionStyles
import org.eclipse.elk.alg.layered.p4nodes.NodePlacementStrategy
import org.eclipse.elk.alg.layered.properties.GreedySwitchType
import org.eclipse.elk.alg.layered.properties.LayeredOptions
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * @author ssm
 *
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Transforms {@link DataflowRegion} into {@link KNode} diagram elements.
 * 
 * @author als ssm
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class DataflowRegionSynthesis extends SubSynthesis<DataflowRegion, KNode> {
    
    public static val SynthesisOption CIRCUIT = SynthesisOption.createCheckOption("Circuit layout", false).
        setCategory(GeneralSynthesisOptions::DATAFLOW)
    public static val SynthesisOption AUTOMATIC_INLINE = SynthesisOption.createCheckOption("Automatic inline", false).
        setCategory(GeneralSynthesisOptions::DATAFLOW)
    
    @Inject 
    extension KNodeExtensionsReplacement

    @Inject
    extension KRenderingExtensions

    @Inject
    extension KExpressionsDeclarationExtensions
    
    @Inject
    extension DataflowRegionStyles
    
    @Inject
    extension SCChartsSerializeHRExtensions
    
    @Inject
    extension EquationSynthesis 
    
    override getDisplayedSynthesisOptions() {
        return newArrayList(CIRCUIT, AUTOMATIC_INLINE)
    }   
    
    override performTranformation(DataflowRegion region) {
        val node = region.createNode().associateWith(region)

        node.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
        node.addLayoutParam(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
        node.addLayoutParam(CoreOptions::DIRECTION, Direction::RIGHT)
        node.addLayoutParam(LayeredOptions::THOROUGHNESS, 100)
        node.addLayoutParam(LayeredOptions::NODE_PLACEMENT_STRATEGY, NodePlacementStrategy::NETWORK_SIMPLEX)
        node.addLayoutParam(CoreOptions::SEPARATE_CONNECTED_COMPONENTS, false)
        
        if (CIRCUIT.booleanValue) {
            node.addLayoutParam(LayeredOptions::CROSSING_MINIMIZATION_SEMI_INTERACTIVE, true)
          node.addLayoutParam(LayeredOptions::CROSSING_MINIMIZATION_GREEDY_SWITCH_TYPE, GreedySwitchType::TWO_SIDED)
            
            node.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 10d); //10.5 // 8f
            node.setLayoutOption(CoreOptions::PADDING, new ElkPadding(4d));
//            node.setLayoutOption(LayeredOptions::SPACING_EDGE_SPACING_FACTOR, 0.8f); // 0.7
//            node.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE_SPACING_FACTOR, 0.75f); //1 //0.5
//            node.setLayoutOption(LayeredOptions::SPACING_IN_LAYER_SPACING_FACTOR, 0.25f); //0.2 // 0.5
        }
            
        node.setLayoutOption(KlighdProperties::EXPAND, true)

        val label = if(region.label.nullOrEmpty) "" else " " + region.label

        // Expanded
        node.addRegionFigure => [
            setAsExpandedView
            if (region.declarations.empty) {
                addStatesArea(label.nullOrEmpty);
            } else {
                addStatesAndDeclarationsArea(false, false);
                // Add declarations
                for (declaration : region.variableDeclarations) {
                    addDeclarationLabel(declaration.serializeHighlighted(true)) => [
                        setProperty(TracingVisualizationProperties.TRACING_NODE, true);
                        associateWith(declaration);
                        children.forEach[associateWith(declaration)];
                    ]
                }
            }
            // Add Button after area to assure correct overlapping
            if (!CIRCUIT.booleanValue)
                addButton("[-]" + label).addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
        ]

        // Collapsed
        node.addRegionFigure => [
            setAsCollapsedView
            if (CIRCUIT.booleanValue)
                addButton("[+]" + label).addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
        ]
        

        // translate all direct dataflow equations
        for (equation: region.equations) {
            node.children += equation.transform;
        }
        

        return <KNode> newArrayList(node)
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
            node.addLayoutParam(CoreOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
            node.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 10d); //10.5 // 8f
            node.setLayoutOption(CoreOptions::PADDING, new ElkPadding(4d));
//        } else {
//            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot");
//            node.setLayoutOption(LayoutOptions::SPACING, 40f);
//        }
//        node.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
//        node.setLayoutOption(LayoutOptions::SPACING, 40f);

        // Set initially collapsed
        node.setLayoutOption(KlighdProperties::EXPAND, false);

        if (!CIRCUIT.booleanValue) {
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
        }

        return node;
    }    
    
}