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
import de.cau.cs.kieler.kicool.ui.kitt.tracing.TracingVisualizationProperties
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.StateStyles
import org.eclipse.elk.alg.layered.options.LayerConstraint
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.CoreOptions
import de.cau.cs.kieler.core.model.Pair

import static de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import java.util.List
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.klighd.SynthesisOption
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.core.options.Direction
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kexpressions.keffects.DataDependencyType
import de.cau.cs.kieler.sccharts.processors.dataflow.RegionDependencies
import de.cau.cs.kieler.kicool.ui.klighd.KiCoDiagramViewProperties
import de.cau.cs.kieler.sccharts.processors.dataflow.RegionLCAFMap
import de.cau.cs.kieler.sccharts.processors.dataflow.StateDependencies
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.klighd.kgraph.KEdge
import java.util.Map
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.kicool.ui.kitt.tracing.TracingEdgeNode
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KCustomRendering
import de.cau.cs.kieler.klighd.krendering.KPolyline
import de.cau.cs.kieler.klighd.krendering.KDecoratorPlacementData
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.Trigger
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.ToggleDependencyAction

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

    extension KRenderingFactory = KRenderingFactory.eINSTANCE
    
    @Inject extension KNodeExtensionsReplacement
    @Inject extension KEdgeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension PragmaExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension TransitionSynthesis
    @Inject extension ControlflowRegionSynthesis
    @Inject extension DataflowRegionSynthesis
    @Inject extension StateStyles
    @Inject extension CommentSynthesis
    
    /** Scope call parameters synthesis option */
    public static final SynthesisOption SHOW_BINDINGS = SynthesisOption.createCheckOption("Binding Parameters", true).setCategory(GeneralSynthesisOptions::APPEARANCE)
    
    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_BINDINGS)
    }

    override List<KNode> performTranformation(State state) {
        val node = state.createNode().associateWith(state);

        // Set KIdentifier for use with incremental update
        if (!state.name.nullOrEmpty) {
            node.data.add(KGraphFactory::eINSTANCE.createKIdentifier => [it.id = state.name])
        }
        
        // configure region dependency layout config if an appropriate result is present.
        val compilationContext = this.usedContext.getProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT)
        val regionDependencies = (compilationContext !== null) && (compilationContext.result !== null) &&
            compilationContext.result.getProperty(RegionDependencies.REGION_DEPENDENCIES) !== null &&
            compilationContext.result.getProperty(RegionDependencies.REGION_DEPENDENCIES).object == state.SCCharts
        if (regionDependencies && !compilationContext.result.getProperty(StateDependencies.STATE_DEPENDENCIES)) {
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
                switch state {
                    case state.isReferencedState:
                        node.addMacroStateLabel(
                            state.serializeHR + " @ "
                            + (if (state.reference.scope !== null) (state.reference.scope as State).serializeHR else "UnresolvedReference")
                            + (if (SHOW_BINDINGS.booleanValue) state.reference.parameters.serializeHRParameters else "")
                            ).associateWith(state)
                    case state.isMacroState:
                        node.addMacroStateLabel(state.serializeHR.toString).associateWith(state)
                    default:
                        node.addSimpleStateLabel(state.serializeHR.toString).associateWith(state)
                }
            } else {
                node.addEmptyStateLabel
            }

            // Add declarations
            for (declaration : state.declarations) {
                node.addDeclarationLabel(declaration.serializeHighlighted(true)) => [
                    setProperty(TracingVisualizationProperties.TRACING_NODE, true);
                    associateWith(declaration);
                    eAllContents.filter(KRendering).forEach[associateWith(declaration)];
                ]
            }           

            // Add actions
            for (action : state.actions) {
                node.addActionLabel(action.serializeHighlighted(true)) => [
                    setProperty(TracingVisualizationProperties.TRACING_NODE, true);
                    associateWith(action);
                    eAllContents.filter(KRendering).forEach[associateWith(action)];
                ]
            }

            // Add child area for regions
            if (state.controlflowRegionsContainStates || state.containsDataflowRegions || state.isReferencedState) {
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
        for (region : state.regions) {
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
            !state.declarations.empty || state.isReferencedState;
    }
    
    private val dependencyEdges = <Pair<EObject, EObject>, KEdge> newHashMap
    
    /** Draw all region dependencies that are present in this state. */
    private def drawRegionDependencies(State state) {
        val compilationContext = this.usedContext.getProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT)
        if (compilationContext === null) return;
        
        val result = compilationContext.getResultForModel(state.SCCharts)
        if (result === null) return;
        
        // Fetch the least common ancestor fork (lcaf) data from the compilation environment. 
        val lcafMap = result.getProperty(RegionDependencies.REGION_LCAF_MAP) 
        val dependencies = state.regions.map[ outgoingLinks ].flatten.filter(DataDependency).toList
        if (dependencies.empty) {
            val simpleStates = state.regions.filter(ControlflowRegion).map[ states ].flatten.filter[ !isHierarchical ].toList
            for (simpleState : simpleStates) {
                dependencies += simpleState.eAllContents.filter(DataDependency).toList
            }
        }
        
        dependencyEdges.clear
        for (dependency : dependencies.filter(DataDependency)) {
            dependency.synthesizeDataDependency(lcafMap, state)
        }
    }
    
    /** Synthesize one dependency using the least common ancestor fork (lcaf) data. */
    private def void synthesizeDataDependency(DataDependency dependency, RegionLCAFMap regionLCAFMap, State state) {
        // Don't show confluent dependencies.
        if (dependency.type == DataDependencyType.WRITE_WRITE && dependency.confluent) return;
        if (!dependency.concurrent) return;
        
        val regionDependency = dependency.eContainer instanceof ControlflowRegion && dependency.target instanceof ControlflowRegion
        
        // Elevate the control flow regions to the same hierarchy level. Use the lcaf data for this. 
        val cfrs = if (regionDependency) regionLCAFMap.levelRegions(dependency) else new Pair<EObject, EObject>(dependency.eContainer, dependency.target)
        val sourceNode = cfrs.first.node
        val targetNode = cfrs.second.node


        println(dependency.eContainer + " " + dependency.target)
        
        if (regionDependency) {
            dependency.createDependencyEdge(sourceNode, targetNode).associateWith(dependency) 
        } else {
            val source = cfrs.first.getEdgeableParent
            val target = cfrs.second.getEdgeableParent
            val edge = createLooseDependencyEdge(dependencyEdges, source.node, source, target, dependency, false)
            edge.source = source.node
            edge.target = target.node
            edge.associateWith(dependency)
        }
    }
    
    
    
    private def KEdge createLooseDependencyEdge(Map<Pair<EObject, EObject>, KEdge> edges, KNode attachNode,
        EObject source, EObject target, DataDependency dependency, boolean ignoreFirstCollapsibleParent) {
        val sourceTargetPair = new Pair(source, target);
        val targetSourcePair = new Pair(target, source);
        var opposite = false;
        var KEdge edge;
        // If the is a mutual dependency use the already crested edge
        if (edges.containsKey(sourceTargetPair)) {
            edge = edges.get(sourceTargetPair);
        } else if (edges.containsKey(targetSourcePair)) {
            edge = edges.get(targetSourcePair);
            opposite = true;
        } else {
            // Create edge
            dependency.annotations += createTagAnnotation("nolayout")
            edge = dependency.createDependencyEdge(source.node, target.node)
            edges.put(sourceTargetPair, edge);
            edge.setProperty(CoreOptions.NO_LAYOUT, true);
            
            edge.getContainer.addAction(Trigger::SINGLECLICK, ToggleDependencyAction.ID)
            edge.setProperty(ToggleDependencyAction.DATA_DEPENDENCY, dependency)
        }
        edge
    }    
    
    
   
    protected def EObject getEdgeableParent(EObject eObject) {
        if (eObject instanceof ControlflowRegion) 
            return eObject as ControlflowRegion
        if (eObject instanceof State) 
            return eObject as State
//        if (eObject instanceof Transition) 
//            return eObject as Transition
        else if (eObject.eContainer === null) 
            return null
        else 
            return eObject.eContainer.getEdgeableParent
    }            

    static def getContainer(KEdge edge) {
        edge.getData(KContainerRendering) as KContainerRendering
    }
        
}