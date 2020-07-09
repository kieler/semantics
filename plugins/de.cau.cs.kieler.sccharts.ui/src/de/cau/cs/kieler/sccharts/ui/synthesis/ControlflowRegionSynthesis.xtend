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
package de.cau.cs.kieler.sccharts.ui.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kicool.ui.kitt.tracing.TracingVisualizationProperties
import de.cau.cs.kieler.kicool.ui.synthesis.updates.MessageObjectReferencesManager
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRectangle
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.actions.ReferenceExpandAction
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.MemorizingExpandCollapseAction
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.ColorStore
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.ControlflowRegionStyles
import java.util.EnumSet
import org.eclipse.elk.alg.layered.options.CenterEdgeLabelPlacementStrategy
import org.eclipse.elk.alg.layered.options.ContentAlignment
import org.eclipse.elk.alg.layered.options.FixedAlignment
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.core.options.SizeConstraint

import static de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*
import static extension de.cau.cs.kieler.annotations.ide.klighd.CommonSynthesisUtil.*

/**
 * Transforms {@link ControlflowRegion} into {@link KNode} diagram elements.
 * 
 * @author als ssm
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class ControlflowRegionSynthesis extends SubSynthesis<ControlflowRegion, KNode> {

    @Inject extension KNodeExtensionsReplacement
    @Inject extension KRenderingExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension KExpressionsDeclarationExtensions    
    @Inject extension StateSynthesis
    @Inject extension ControlflowRegionStyles
    @Inject extension CommentSynthesis
    @Inject extension ColorStore
    @Inject extension AdaptiveZoom

    override performTranformation(ControlflowRegion region) {
        val node = region.createNode().associateWith(region);
        
        node.configureNodeLOD(region)

        // Set KIdentifier for use with incremental update
        if (!region.name.nullOrEmpty) {
            node.KID = region.name
        }
        
        if (USE_KLAY.booleanValue) {
            node.addLayoutParam(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID)
            node.setLayoutOption(LayeredOptions::NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment::BALANCED)
            node.setLayoutOption(LayeredOptions::EDGE_LABELS_CENTER_LABEL_PLACEMENT_STRATEGY, CenterEdgeLabelPlacementStrategy::TAIL_LAYER)
            node.setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
        } else {
            node.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.graphviz.dot")
            node.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 40.0)
        }
        node.addLayoutParam(CoreOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
        node.addLayoutParam(CoreOptions::SEPARATE_CONNECTED_COMPONENTS, false)
        // Direction is set by the {@link LayoutHook}
        
        // Do not set! This is handled by the ExpandCollapseHook
        // node.initiallyExpand
        
        // This node does not support comment boxes on the same layer, because regions are layouted by the box layouter.
        node.setProperty(MessageObjectReferencesManager.SUPPORTS_COMMENT_BOXES, false)

        if (!region.states.empty) {
            val label = region.serializeHighlighted(true)

            // Expanded
            node.addRegionFigure => [
                setAsExpandedView
                associateWith(region)
                addDoubleClickAction(MemorizingExpandCollapseAction::ID)
                if (region.override) addOverrideRegionStyle
                if (region.final) addFinalRegionStyle
                if (region.declarations.empty && region.actions.empty) {
                    addStatesArea(!label.nullOrEmpty);
                } else {
                    addStatesAndDeclarationsAndActionsArea(!label.nullOrEmpty, region.declarations.size > 3);
                    // Add declarations
                    for (declaration : region.variableDeclarations) {
                        addDeclarationLabel(declaration.serializeHighlighted(true)) => [
                            setProperty(TracingVisualizationProperties.TRACING_NODE, true);
                            associateWith(declaration)
                            eAllContentsOfType2(KRendering).forEach[
                                associateWith(declaration)
                                if (it instanceof KText) configureTextLOD(declaration)
                            ]
                        ]
                    }
                    // Add actions
                    for (action : region.actions) {
                        addActionLabel(action.serializeHighlighted(true, SHOW_USER_LABELS.booleanValue)) => [
                            setProperty(TracingVisualizationProperties.TRACING_NODE, true);
                            associateWith(action);
                            eAllContentsOfType2(KRendering).forEach[
                                associateWith(action)
                                if (it instanceof KText) configureTextLOD(action)
                            ]
                        ]
                    }
                }
                if (region.schedule.size > 0) it.setUserScheduleStyle
                // Add Button after area to assure correct overlapping
                addCollapseButton(label) => [
                    addSingleClickAction(MemorizingExpandCollapseAction.ID)
                    addDoubleClickAction(MemorizingExpandCollapseAction.ID)
                ]
                if (!label.nullOrEmpty) children.filter(KText).forEach[configureTextLOD(region)]
            ]

            // Collapsed
            node.addRegionFigure => [
                setAsCollapsedView
                associateWith(region)
                if (region.schedule.size > 0) it.setUserScheduleStyle
                addDoubleClickAction(MemorizingExpandCollapseAction::ID)
                if (region.override) addOverrideRegionStyle
                if (region.final) addFinalRegionStyle
                addExpandButton(label) => [
                    addSingleClickAction(MemorizingExpandCollapseAction.ID)
                    addDoubleClickAction(MemorizingExpandCollapseAction.ID)
                ] 
                if (!label.nullOrEmpty) children.filter(KText).forEach[configureTextLOD(region)]
            ]
            
            node.setSelectionStyle

            // Add inner states
            for (state : region.states) {
                node.children += state.transform;
            }

        } else if (region.reference !== null) {
            val newName = if(region.label.nullOrEmpty) "" else region.serializeHR.toString
            val refRegion = region.reference.scope !== null ? (region.reference.scope as Region).serializeHR : "UnresolvedReference"
            val refSCC = region.reference.scope !== null ? (region.reference.scope as Region).eContainer.serializeHR : "UnresolvedReference"
            var label = refSCC + "::" + refRegion
            if (!newName.equals(refRegion)) {
                label = newName + "@" + label
            }
            if (SHOW_BINDINGS.booleanValue) {
                label += region.reference.parameters.serializeHRParameters
            }
            
            node.createReferenceRegionFigures(label, region) => [
                node.data.filter(KRectangle).forEach[
                    it.foreground = ColorStore.Color.STATE_REFERENCED_BACKGROUND_GRADIENT_2.color
                    it.lineWidth = it.lineWidth.lineWidth + 1
                ]
            ]
        } else {
            node.addRegionFigure => [
                if (region.override) addOverrideRegionStyle
                if (region.final) addFinalRegionStyle
            ]
        }

        val returnNodes = <KNode> newArrayList(node)
        
        if (SHOW_COMMENTS.booleanValue) {
            region.getCommentAnnotations.forEach[
                node.children += it.transform                
            ]
        }   
        
        return returnNodes
    }

    /**
     * Create region area for reference states
     * 
     * @param state 
     *          the reference state
     */
    def KNode createReferenceRegion(State state) {
        val node = createNode().associateWith(state); // This association is important for the ReferenceExpandAction
        if (USE_KLAY.booleanValue) {
            node.addLayoutParam(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID);
        } else {
            node.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.graphviz.dot");
            node.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 40.0);
        }
        node.addLayoutParam(CoreOptions::EDGE_ROUTING, EdgeRouting::SPLINES);

        node.createReferenceRegionFigures(null, null)

        return node;
    }
    
    protected def KNode createReferenceRegionFigures(KNode node, String label, Region region) {
        // Set initially collapsed
        node.setLayoutOption(KlighdProperties::EXPAND, false);

        // Expanded
        node.addRegionFigure => [
            setAsExpandedView
            addStatesArea(label !== null)
            addDoubleClickAction(ReferenceExpandAction::ID)
            // Add Button after area to assure correct overlapping
            // Use special expand action to resolve references
            addCollapseButton(label?:"") => [
                addSingleClickAction(ReferenceExpandAction.ID)
                addDoubleClickAction(ReferenceExpandAction.ID)
            ]
            if (!label.nullOrEmpty) children.filter(KText).forEach[configureTextLOD(region)]
        ]

        // Collapsed
        node.addRegionFigure => [
            setAsCollapsedView
            addDoubleClickAction(ReferenceExpandAction::ID)
            addExpandButton(label?:"") => [
                addSingleClickAction(ReferenceExpandAction.ID)
                addDoubleClickAction(ReferenceExpandAction.ID)
            ]
            if (!label.nullOrEmpty) children.filter(KText).forEach[configureTextLOD(region)]
        ]

        return node;
    }

}
