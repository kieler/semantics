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
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kicool.ui.kitt.tracing.TracingVisualizationProperties
import de.cau.cs.kieler.kicool.ui.synthesis.updates.MessageObjectReferencesManager
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.PolicyRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.MemorizingExpandCollapseAction
import de.cau.cs.kieler.sccharts.ui.synthesis.labels.TransitionLabelSerializer
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.ColorStore
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.ControlflowRegionStyles
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.StateStyles
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.TransitionStyles
import org.eclipse.elk.alg.layered.options.CenterEdgeLabelPlacementStrategy
import org.eclipse.elk.alg.layered.options.FixedAlignment
import org.eclipse.elk.alg.layered.options.LayerConstraint
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.EdgeRouting

import static de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.ColorStore.Color

/**
 * Transforms {@link ControlflowRegion} into {@link KNode} diagram elements.
 * 
 * @author als ssm
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class PolicySynthesis extends SubSynthesis<PolicyRegion, KNode> {

    @Inject extension KNodeExtensionsReplacement
    @Inject extension KRenderingExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension KExpressionsDeclarationExtensions    
    @Inject extension ControlflowRegionStyles regionStyle
    @Inject extension StateStyles stateStyle
    @Inject extension CommentSynthesis
    @Inject extension ColorStore
    @Inject extension AdaptiveZoom
    @Inject extension KEdgeExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension TransitionLabelSerializer
    @Inject extension TransitionStyles
    
    public static final SynthesisOption SHOW_POLICIES =
            SynthesisOption.createCheckOption("sccharts.policy.showPolicies", "Policies", true).setCategory(OO)
            
    override getDisplayedSynthesisOptions() {
        return newArrayList(SHOW_POLICIES)
    }

    override performTranformation(PolicyRegion region) {
        val node = region.createNode().associateWith(region);
        
        node.configureNodeLOD(region)

        // Set KIdentifier for use with incremental update
        if (!region.name.nullOrEmpty) {
            node.data += KGraphFactory::eINSTANCE.createKIdentifier => [it.id = region.name]
        }
        
        if (USE_KLAY.booleanValue) {
            node.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.layered");
            node.setLayoutOption(LayeredOptions::NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment::BALANCED);
            node.setLayoutOption(LayeredOptions::EDGE_LABELS_CENTER_LABEL_PLACEMENT_STRATEGY,
                CenterEdgeLabelPlacementStrategy::TAIL_LAYER);
        } else {
            node.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.graphviz.dot");
            node.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 40.0);
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
                addPolicyRegionStyle
                addDoubleClickAction(MemorizingExpandCollapseAction.ID)
                if (region.declarations.empty) {
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
                }
                // Add Button after area to assure correct overlapping
                addCollapseButton(label) => [
                    addSingleClickAction(MemorizingExpandCollapseAction.ID)
                    addDoubleClickAction(MemorizingExpandCollapseAction.ID)
                ]
                if (!label.nullOrEmpty) eAllContents.filter(KText).toList.forEach[
                    if (foreground?.color?.equals(Color.KEYWORD.color)) {
                        foreground = Color.USER_SCHEDULE_COLOR.color
                    }
                    configureTextLOD(region)
                ]
            ]

            // Collapsed
            node.addRegionFigure => [
                setAsCollapsedView
                associateWith(region)
                addPolicyRegionStyle
                addDoubleClickAction(MemorizingExpandCollapseAction.ID)
                addExpandButton(label) => [
                    addSingleClickAction(MemorizingExpandCollapseAction.ID)
                    addDoubleClickAction(MemorizingExpandCollapseAction.ID)
                ]
                if (!label.nullOrEmpty) eAllContents.filter(KText).toList.forEach[
                    if (foreground?.color?.equals(Color.KEYWORD.color)) {
                        foreground = Color.USER_SCHEDULE_COLOR.color
                    }
                    configureTextLOD(region)
                ]
            ]
            
            regionStyle.setSelectionStyle(node)

            // Add inner states
            for (state : region.states) {
                node.children += state.transformPolicyState;
            }

        } else {
            node.addRegionFigure => [
                addPolicyRegionStyle
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
    
    private def transformPolicyState(State state) {
        val node = state.createNode().associateWith(state)

        // Set KIdentifier for use with incremental update
        if (!state.name.nullOrEmpty) {
            node.data.add(KGraphFactory::eINSTANCE.createKIdentifier => [it.id = state.name])
        }
        
        StateSynthesis.configureLayout(node)
        
        node.configureNodeLOD(state)
        node.addDefaultFigure

        // Styles from modifiers
        if (state.isInitial) {
            node.setInitialStyle
            if (USE_KLAY.booleanValue) {
                node.setLayoutOption(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::FIRST);
            }
        }
        
        stateStyle.setSelectionStyle(node)

        // Shadow
        node.setShadowStyle

        // Add content
        if (!state.label.nullOrEmpty) {
            node.addSimpleStateLabel(state.serializeHR.toString) => [
                setProperty(TracingVisualizationProperties.TRACING_NODE, true)
                associateWith(state)
                if (it instanceof KText) configureTextLOD(state)
                eAllContents.filter(KRendering).toList.forEach[
                    associateWith(state)
                    if (it instanceof KText) configureTextLOD(state)
                ]
            ]
        } else {
            node.addEmptyStateLabel
        }
        
        // Transform all outgoing transitions
        // Also set KIdentifier for use with incremental update
        val groupedTransitions = state.outgoingTransitions.groupBy[it.targetState]
        for (transition : state.outgoingTransitions.reverseView) {
            transition.transformPolicyTransition => [ edge |
                val target = transition.targetState;
                if (!target.name.nullOrEmpty) {
                    val counter = groupedTransitions.get(target).indexOf(transition)
                    edge.head.data += KGraphFactory::eINSTANCE.createKIdentifier => [it.id = target.name + counter]
                }
            ];
        }

        val returnNodes = <KNode> newArrayList(node)
        
        if (SHOW_COMMENTS.booleanValue) {
            state.getCommentAnnotations.forEach[
                returnNodes += it.transform                
            ] 
        }                       

        return returnNodes
    }
    
    private def transformPolicyTransition(Transition transition) {
        val edge = transition.createEdge().associateWith(transition);
        edge.configureEdgeLOD(transition)

        if (USE_KLAY.booleanValue) {
            edge.setLayoutOption(LayeredOptions::SPACING_EDGE_LABEL, 3.0)
            if (transition.isImplicitlyImmediate) {
                edge.setLayoutOption(LayeredOptions::PRIORITY_DIRECTION, TransitionSynthesis.IMMEDIATE_TRANSITION_DIRECTION_THRESHOLD)
            }
        } else {
            edge.setLayoutOption(CoreOptions::SPACING_EDGE_LABEL, 2.0);
        }
        
        // Connect with states
        edge.source = transition.sourceState.node;
        edge.target = transition.targetState.node;

        // Basic spline
        edge.addTransitionSpline

        // Modifiers
        if (transition.trigger !== null) {
            edge.setImmediateStyle
        }
        
        edge.addDefaultDecorator
        
        if (SHOW_COMMENTS.booleanValue) {
            transition.getCommentAnnotations.forEach[
                edge.addLabel(it.values.head, ColorStore.Color.COMMENT_BACKGROUND_GRADIENT_2.color) => [
                    configureLabelLOD(transition)
                ]
            ]
        }     
        
        //Configure selection style
        edge.setSelectionStyle

        // Add Label
        val label = if (SHOW_USER_LABELS.booleanValue && !transition.label.nullOrEmpty) {
            transition.label
        } else if (transition.trigger !== null) {
            transition.trigger.serializeHR + if (transition.effects.nullOrEmpty) ": ∅" else transition.effects.join(": {", ", ", "}", [serializeHR])
        } else {
            "σ tick"
        }
        if (label.length != 0) {
            edge.addLabel(label.toString) => [
                associateWith(transition)
                configureLabelLOD(transition)
            ]
        }
        
        return <KEdge> newArrayList(edge)
    }

}
