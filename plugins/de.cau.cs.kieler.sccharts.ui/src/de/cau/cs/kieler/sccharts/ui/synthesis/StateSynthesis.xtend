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
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kexpressions.keffects.DataDependencyType
import de.cau.cs.kieler.kicool.ui.kitt.tracing.TracingVisualizationProperties
import de.cau.cs.kieler.kicool.ui.klighd.KiCoDiagramViewProperties
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsInheritanceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.TextFormat
import de.cau.cs.kieler.sccharts.processors.dataflow.RegionDependencies
import de.cau.cs.kieler.sccharts.processors.dataflow.RegionLCAFMap
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.StateStyles
import java.util.ArrayList
import java.util.List
import org.eclipse.elk.alg.layered.options.LayerConstraint
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.SizeConstraint

import static de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Transforms {@link State} into {@link KNode} diagram elements.
 * 
 * @author als ssm
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class StateSynthesis extends SubSynthesis<State, KNode> {

    @Inject extension KNodeExtensionsReplacement
    @Inject extension AnnotationsExtensions
    @Inject extension PragmaExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsInheritanceExtensions
    @Inject extension TransitionSynthesis
    @Inject extension ControlflowRegionSynthesis
    @Inject extension DataflowRegionSynthesis
    @Inject extension StateStyles
    @Inject extension CommentSynthesis
    
    /** Scope call parameters synthesis option */
    public static final SynthesisOption SHOW_BINDINGS = SynthesisOption.createCheckOption("Binding Parameters", true).setCategory(GeneralSynthesisOptions::APPEARANCE)
    /** inherited declarations and regions synthesis option */
    public static final SynthesisOption SHOW_INHERITANCE = SynthesisOption.createCheckOption("Inherited Parts", true).setCategory(GeneralSynthesisOptions::APPEARANCE)
    
    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_INHERITANCE, SHOW_BINDINGS)
    }

    override List<KNode> performTranformation(State state) {
        val node = state.createNode().associateWith(state)

        // Set KIdentifier for use with incremental update
        if (!state.name.nullOrEmpty) {
            node.data.add(KGraphFactory::eINSTANCE.createKIdentifier => [it.id = state.name])
        }
        
        // configure region dependency layout config if an appropriate result is present.
        val compilationContext = this.usedContext.getProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT)
        val regionDependencies = (compilationContext !== null) && (compilationContext.result !== null) &&
            compilationContext.result.getProperty(RegionDependencies.REGION_DEPENDENCIES) !== null &&
            compilationContext.result.getProperty(RegionDependencies.REGION_DEPENDENCIES).object == state.SCCharts
        if (regionDependencies) {
            configureLayoutRegionDependencies(node)
        } else {
            configureLayout(node)
        }

        //pre-evaluate type
        val isConnector = state.isConnector

        // Basic state style
        switch state {
            case isConnector:
                node.addConnectorFigure
            case state.isMacroState:
                node.addMacroFigure
            default:
                node.addDefaultFigure
        }

        // Styles from modifiers
        if (state.isReferencedState) {
            node.setReferencedStyle
        }
        if (state.isInitial) {
            node.setInitialStyle
            if (USE_KLAY.booleanValue) {
                node.setLayoutOption(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::FIRST);
            }
        }
        if (state.isFinal) {
            node.setFinalStyle
        }
        if (state.isViolation) {
            val isHaltState = state.outgoingTransitions.size == 0 
                || !state.outgoingTransitions.exists[ targetState != state ]
            node.setViolationStyle(isHaltState)
        }

        // Shadow
        if (!isConnector) {
            node.setShadowStyle
        }

        // Add content
        if (!isConnector) {
            // Add label
            if (!state.label.nullOrEmpty) {
                if (state.isMacroState) {
                    val label = <Pair<? extends CharSequence, TextFormat>>newArrayList
                    label += new Pair(state.serializeHR, TextFormat.TEXT)
                    if (state.isReferencedState) {
                        label += new Pair("@", TextFormat.KEYWORD)
                        if (state.reference.scope !== null) {
                            label += new Pair((state.reference.scope as State).serializeHR, TextFormat.TEXT)
                        } else {
                            label += new Pair("UnresolvedReference", TextFormat.HIGHLIGHT)
                        }
                        if (SHOW_BINDINGS.booleanValue) {
                            label += new Pair(state.reference.parameters.serializeHRParameters, TextFormat.TEXT)
                        }
                    } else if (!state.baseStates.nullOrEmpty) {
                        label += new Pair("extends", TextFormat.KEYWORD)
                        for (baseState : state.baseStates.indexed) {
                            if (baseState.key == state.baseStates.length - 1) {
                                label += new Pair(baseState.value.serializeHR, TextFormat.TEXT)
                            } else {
                                label += new Pair(baseState.value.serializeHR + ",", TextFormat.TEXT)
                            }
                        }
                    }
                    node.addMacroStateLabel(label)
                } else {
                    node.addSimpleStateLabel(state.serializeHR.toString)
                } => [
                    setProperty(TracingVisualizationProperties.TRACING_NODE, true)
                    associateWith(state)
                    eAllContents.filter(KRendering).forEach[associateWith(state)]
                ]
            } else {
                node.addEmptyStateLabel
            }
            
            // Add declarations
            val declarations = new ArrayList<Declaration>(state.declarations)
            if (SHOW_INHERITANCE.booleanValue) declarations.addAll(0, state.allVisibleInheritedDeclarations.toList)
            for (declaration : declarations) {
                node.addDeclarationLabel(declaration.serializeHighlighted(true)) => [
                    setProperty(TracingVisualizationProperties.TRACING_NODE, true)
                    associateWith(declaration)
                    eAllContents.filter(KRendering).forEach[associateWith(declaration)]
                ]
            }           

            // Add actions
            val actions = new ArrayList<Action>(state.actions)
            if (SHOW_INHERITANCE.booleanValue) actions.addAll(0, state.allVisibleInheritedActions.toList)
            for (action : actions) {
                node.addActionLabel(action.serializeHighlighted(true)) => [
                    setProperty(TracingVisualizationProperties.TRACING_NODE, true)
                    associateWith(action)
                    eAllContents.filter(KRendering).forEach[associateWith(action)]
                ]
            }

            // Add child area for regions
            if (state.controlflowRegionsContainStates
                || state.containsDataflowRegions
                || state.isReferencedState
                || (SHOW_INHERITANCE.booleanValue && !state.allVisibleInheritedRegions.empty)
            ) {
                node.addRegionsArea;
            }
        }

        // Transform all outgoing transitions
        // Also set KIdentifier for use with incremental update
        val groupedTransitions = state.outgoingTransitions.groupBy[it.targetState]
        for (transition : state.outgoingTransitions.reverseView) {
            transition.transform => [ edge |
                val target = transition.targetState;
                if (!target.name.nullOrEmpty) {
                    val counter = groupedTransitions.get(target).indexOf(transition)
                    edge.head.data += KGraphFactory::eINSTANCE.createKIdentifier => [it.id = target.name + counter]
                }
            ];
        }

        // Transform regions
        val regions = new ArrayList<Region>(state.regions)
        if (SHOW_INHERITANCE.booleanValue) regions.addAll(0, state.allVisibleInheritedRegions.toList)
        for (region : regions) {
            switch region {
                ControlflowRegion: node.children += region.transform
                DataflowRegion: node.children += region.transform
            }
        }
        
        if (regionDependencies) {
            state.drawRegionDependencies
        }

        // Add reference region
        if (state.isReferencedState) {
            node.children += state.createReferenceRegion
        }
        
        val returnNodes = <KNode> newArrayList(node)
        
        if (SHOW_COMMENTS.booleanValue) {
            state.getCommentAnnotations.forEach[
                returnNodes += it.transform                
            ] 
        }                       

        return returnNodes
    }
    
    
    /** Configures the default layout of children (regions in the state) */
    private def static void configureLayout(KNode node) {
        node.setLayoutOption(CoreOptions::ALGORITHM, "org.eclipse.elk.box");
        node.setLayoutOption(CoreOptions::EXPAND_NODES, true);
        node.setLayoutOption(CoreOptions::PADDING, new ElkPadding(0));
        node.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 1.0)
    }
    
    private def static void configureLayoutRegionDependencies(KNode node) {
        node.setLayoutOption(CoreOptions::PADDING, new ElkPadding(10));
        node.setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, SizeConstraint.free)
        node.setLayoutOption(CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
        node.setLayoutOption(CoreOptions::DIRECTION, Direction.RIGHT)
        node.setLayoutOption(LayeredOptions::FEEDBACK_EDGES, true);
        node.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 20.0);
        node.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE_BETWEEN_LAYERS, 20.0);
    }    

    /** Checks if given state should be visualized as macro state */
    def boolean isMacroState(State state) {
        return state.controlflowRegionsContainStates || state.containsDataflowRegions || !state.actions.empty ||
            !state.declarations.empty || state.isReferencedState || state.hasBaseStates;
    }
    
    /** Draw all region dependencies that are present in this state. */
    private def drawRegionDependencies(State state) {
        val compilationContext = this.usedContext.getProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT)
        if (compilationContext === null) return;
        
        val result = compilationContext.getResultForModel(state.SCCharts)
        if (result === null) return;
        
        // Fetch the least common ancestor fork (lcaf) data from the compilation environment. 
        val lcafMap = result.getProperty(RegionDependencies.REGION_LCAF_MAP) 
        val dependencies = state.regions.map[ outgoingLinks ].flatten.filter(DataDependency).toList
        
        for (dependency : dependencies.filter(DataDependency)) {
            dependency.synthesizeDataDependency(lcafMap)
        }
    }
    
    /** Synthesize one dependency using the least common ancestor fork (lcaf) data. */
    private def void synthesizeDataDependency(DataDependency dependency, RegionLCAFMap regionLCAFMap) {
        // Don't show confluent dependencies.
        if (dependency.type == DataDependencyType.WRITE_WRITE && dependency.confluent) return;
        
        // Elevate the control flow regions to the same hierarchy level. Use the lcaf data for this. 
        val cfrs = regionLCAFMap.levelRegions(dependency)
        val sourceNode = cfrs.first.node
        val targetNode = cfrs.second.node

        dependency.createDependencyEdge(sourceNode, targetNode).associateWith(dependency) 
    }
    
    
}