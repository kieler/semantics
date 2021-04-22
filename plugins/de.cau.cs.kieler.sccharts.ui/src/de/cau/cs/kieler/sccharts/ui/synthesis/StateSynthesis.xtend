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
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.ControlDependency
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kexpressions.keffects.DataDependencyType
import de.cau.cs.kieler.kexpressions.keffects.Dependency
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.ide.klighd.KiCoDiagramViewProperties
import de.cau.cs.kieler.kicool.ui.kitt.tracing.TracingEdgeNode
import de.cau.cs.kieler.kicool.ui.kitt.tracing.TracingVisualizationProperties
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KPolyline
import de.cau.cs.kieler.klighd.krendering.KRectangle
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.Trigger
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.PolicyClassDeclaration
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsInheritanceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsSearchExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.TextFormat
import de.cau.cs.kieler.sccharts.processors.dataflow.ControlDependencies
import de.cau.cs.kieler.sccharts.processors.dataflow.RegionDependencies
import de.cau.cs.kieler.sccharts.processors.dataflow.RegionLCAFMap
import de.cau.cs.kieler.sccharts.processors.dataflow.StateDependencies
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.ToggleDependencyAction
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.StateStyles
import de.cau.cs.kieler.scl.MethodImplementationDeclaration
import java.util.ArrayList
import java.util.EnumSet
import java.util.List
import java.util.Map
import org.eclipse.elk.alg.layered.options.LayerConstraint
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.alg.layered.options.OrderingStrategy
import org.eclipse.elk.alg.rectpacking.options.RectPackingOptions
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.emf.ecore.EObject

import static de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions.*

import static extension de.cau.cs.kieler.annotations.ide.klighd.CommonSynthesisUtil.*
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

    extension KRenderingFactory = KRenderingFactory.eINSTANCE
    
    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension PragmaExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsInheritanceExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsSearchExtensions
    @Inject extension TransitionSynthesis
    @Inject extension ControlflowRegionSynthesis
    @Inject extension DataflowRegionSynthesis
    @Inject extension PolicySynthesis
    @Inject extension MethodSynthesis
    @Inject extension StateStyles
    @Inject extension CommentSynthesis
    @Inject extension AdaptiveZoom

    // als magic: this should never reach the master (11.09.2018)! ;-)
    // but probably will. (10.10.2018) ;-)
    val actionRectangleMap = <Action, KRectangle> newHashMap 
    
    override getDisplayedSynthesisOptions() {
        val options = newArrayList()
        
        return options
    }     

    override List<KNode> performTranformation(State state) {
        val node = state.createNode().associateWith(state)

        // Set KIdentifier for use with incremental update
        if (!state.name.nullOrEmpty) {
            node.KID = state.name
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
        
        node.configureNodeLOD(state)

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
        if (state.isReferencing) {
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
        
        node.setSelectionStyle

        // Shadow
        if (!isConnector) {
            node.setShadowStyle
        }

        // Add content
        if (!isConnector) {
            // Add label
            if (!state.label.nullOrEmpty) {
                (if (state.isMacroState) {
                    val label = <Pair<? extends CharSequence, TextFormat>>newArrayList
                    label += new Pair(state.serializeHR, TextFormat.TEXT)
                    if (!state.genericParameterDeclarations.nullOrEmpty) {
                        label += state.genericParameterDeclarations.serializeGenericParametersHighlighted
                    }
                    if (state.reference !== null) {
                        label += new Pair("@", TextFormat.KEYWORD)
                        if (state.isReferencing) {
                            label += new Pair(state.reference.target.name, TextFormat.TEXT)
                        } else {
                            label += new Pair("UnresolvedReference", TextFormat.HIGHLIGHT)
                        }
                        if (SHOW_BINDINGS.booleanValue) {
                            label += new Pair(state.reference.parameters.serializeHRParameters, TextFormat.TEXT)
                        }
                    } else if (!state.baseStateReferences.nullOrEmpty) {
                        label += new Pair("extends", TextFormat.KEYWORD)
                        for (baseState : state.baseStateReferences.indexed) {
                            val baseRef = baseState.value
                            if (baseRef.target !== null) {
                                label += new Pair(baseRef.target.serializeHR, TextFormat.TEXT)
                            } else {
                                label += new Pair("UnresolvedReference", TextFormat.HIGHLIGHT)
                            }
                            if (SHOW_BINDINGS.booleanValue) {
                                if (!baseRef.genericParameters.nullOrEmpty) {
                                    label += new Pair(baseRef.genericParameters.serializeHRParameters("<", ">"), TextFormat.TEXT)
                                }
                                if (!baseRef.parameters.nullOrEmpty) {
                                    label += new Pair(baseRef.parameters.serializeHRParameters, TextFormat.TEXT)
                                }
                            }
                            if (baseState.key < state.baseStates.length - 1) {
                                label += new Pair(",", TextFormat.TEXT)
                            }
                        }
                    }
                    node.addMacroStateLabel(label)
                } else {
                    node.addSimpleStateLabel(state.serializeHR.toString)
                }) => [
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
            
            // Add declarations
            val declarations = new ArrayList<Declaration>(state.declarations)
            if (SHOW_INHERITANCE.booleanValue) declarations.addAll(0, state.allVisibleInheritedDeclarations.toList)
            for (declaration : declarations.filter[!(it instanceof MethodImplementationDeclaration) || !SHOW_METHOD_BODY.booleanValue]) {
                if (declaration instanceof ClassDeclaration) {
                    node.addStructDeclarations(declaration, 0)
                } else {
                    node.addDeclarationLabel(declaration.serializeHighlighted(true)) => [
                        setProperty(TracingVisualizationProperties.TRACING_NODE, true)
                        associateWith(declaration)
                        eAllContents.filter(KRendering).toList.forEach[
                            associateWith(declaration)
                            if (it instanceof KText) configureTextLOD(declaration)
                        ]
                    ]
                }
            }           

            // Add actions
            val actions = new ArrayList<Action>(state.actions)
            if (SHOW_INHERITANCE.booleanValue) actions.addAll(0, state.allVisibleInheritedActions.toList)
            for (action : actions) {
                node.addActionLabel(action.serializeHighlighted(true, SHOW_USER_LABELS.booleanValue)) => [
                    setProperty(TracingVisualizationProperties.TRACING_NODE, true)
                    associateWith(action)
                    eAllContents.filter(KRendering).toList.forEach[
                        associateWith(action)
                        if (it instanceof KText) configureTextLOD(action)
                    ]
                    actionRectangleMap.put(action, it)
                ]
            }

            // Add child area for regions
            if (state.controlflowRegionsContainStates
                || state.containsDataflowRegions
                || state.isReferencing
                || (SHOW_INHERITANCE.booleanValue && !state.allVisibleInheritedRegions.empty)
                || !state.declarations.filter(MethodImplementationDeclaration).empty
            ) {
                node.addRegionsArea
                node.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
            }
        }

        // Transform all outgoing transitions
        // Also set KIdentifier for use with incremental update
        val groupedTransitions = state.outgoingTransitions.groupBy[it.targetState]
        for (transition : state.outgoingTransitions) {
            transition.transform => [ edge |
                val target = transition.targetState;
                if (!target?.name.nullOrEmpty) {
                    val counter = groupedTransitions.get(target).indexOf(transition)
                    edge.head.KID = target.name + counter
                }
            ];
        }

        // Transform methods
        if (SHOW_METHOD_BODY.booleanValue) {
            for (method : state.declarations.filter(MethodImplementationDeclaration)) {
                node.children += method.transform
            }
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
        
        if(PolicySynthesis.SHOW_POLICIES.booleanValue) {
            val policies = newArrayList
            policies += state.declarations.filter(PolicyClassDeclaration).map[policy].filterNull
            policies += state.regions.map[declarations].flatten.filter(PolicyClassDeclaration).map[policy].filterNull
            for (policy : policies.reverseView) {
                node.children.addAll(0, policy.transform)
            }
        }
        
        if (regionDependencies) {
            state.drawRegionDependencies
        }

        // Add reference region
        if (state.isReferencing) {
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
    
    private def void addStructDeclarations(KNode node, ClassDeclaration struct, int indent) {
        val segments = struct.serializeHighlighted(true)
        val head = segments.takeWhile[value !== TextFormat.CONTENT_PLACEHOLDER].toList;
        val tail = segments.dropWhile[value !== TextFormat.CONTENT_PLACEHOLDER].drop(1).toList;
        node.addDeclarationLabel(head, indent) => [
            setProperty(TracingVisualizationProperties.TRACING_NODE, true)
            associateWith(struct)
            eAllContents.filter(KRendering).forEach[associateWith(struct)]
        ]
        if (struct instanceof PolicyClassDeclaration) {
            if (struct.policy !== null && !struct.policy.name.nullOrEmpty) {
                val components = <Pair<? extends CharSequence, TextFormat>> newArrayList
                components += new Pair("policy", TextFormat.KEYWORD)
                components += new Pair(if (struct.policy.label.nullOrEmpty) struct.policy.label else struct.policy.name, TextFormat.TEXT)
                node.addDeclarationLabel(components, indent + 1)
            }
        }
        for (declaration : struct.declarations) {
            if (declaration instanceof ClassDeclaration) {
                node.addStructDeclarations(declaration, indent + 1)
            } else {
                val serialized = if (declaration instanceof MethodDeclaration) {
                    declaration.serializeMethodHighlighted(true, SHOW_METHOD_BODY.booleanValue)
                } else {
                    declaration.serializeHighlighted(true)
                }
                node.addDeclarationLabel(serialized, indent + 1) => [
                    setProperty(TracingVisualizationProperties.TRACING_NODE, true)
                    associateWith(declaration)
                    eAllContents.filter(KRendering).forEach[associateWith(declaration)]
                ]
            }
        }
        node.addDeclarationLabel(tail, indent);
    }
    
    
    /** Configures the default layout of children (regions in the state) */
    def static void configureLayout(KNode node) {
        node.setLayoutOption(CoreOptions::ALGORITHM, RectPackingOptions.ALGORITHM_ID)
        node.setLayoutOption(CoreOptions::EXPAND_NODES, true)
        node.setLayoutOption(CoreOptions::PADDING, new ElkPadding(0))
        node.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 1.0)
    }
    
    def static void configureLayoutRegionDependencies(KNode node) {
        node.setLayoutOption(CoreOptions::PADDING, new ElkPadding(5))
//        node.setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, SizeConstraint.free)
        node.setLayoutOption(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID)
        node.setLayoutOption(LayeredOptions.CONSIDER_MODEL_ORDER, OrderingStrategy.PREFER_EDGES)
        node.setLayoutOption(CoreOptions::DIRECTION, Direction.RIGHT)
        node.setLayoutOption(LayeredOptions::FEEDBACK_EDGES, true)
        node.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 10.0)
        node.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE_BETWEEN_LAYERS, 10.0)
    }    

    /** Checks if given state should be visualized as macro state */
    def boolean isMacroState(State state) {
        return state.controlflowRegionsContainStates || state.containsDataflowRegions || !state.actions.empty ||
            !state.declarations.empty || state.isReferencing || state.hasBaseStates;
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
        val dependencies = state.regions.map[ outgoingLinks ].flatten.filter(Dependency).toList
        if (dependencies.empty) {
            val simpleStates = state.regions.filter(ControlflowRegion).map[ states ].flatten.filter[ !isHierarchical ].toList
            for (simpleState : simpleStates) {
                dependencies += simpleState.eAllContents.filter(DataDependency).toList
            }
        }
        
        dependencyEdges.clear
        for (dependency : dependencies) {
            switch(dependency) {
                DataDependency: dependency.synthesizeDataDependency(lcafMap, state, result)
                ControlDependency: dependency.synthesizeControlDependency(lcafMap, state)
            }
        }
    }
    
    /** Synthesize one dependency using the least common ancestor fork (lcaf) data. */
    private def void synthesizeDataDependency(DataDependency dependency, RegionLCAFMap regionLCAFMap, State state, Environment environment) {
        // Don't show confluent dependencies.
        if (dependency.type == DataDependencyType.WRITE_WRITE && dependency.confluent) return;
        if (!dependency.concurrent) return;
        
        val regionDependency = dependency.eContainer instanceof ControlflowRegion && dependency.target instanceof ControlflowRegion
        
        // Elevate the control flow regions to the same hierarchy level. Use the lcaf data for this. 
        val cfrs = if (regionDependency) regionLCAFMap.levelRegions(dependency) else new Pair<EObject, EObject>(dependency.eContainer, dependency.target)
        val sourceNode = cfrs.key.node
        val targetNode = cfrs.value.node
        
        if (regionDependency) {
            if (isOnCausalLoop(dependency, environment)) {
                dependency.createDependencyEdge(sourceNode, targetNode, "#f00".color).associateWith(dependency)
            } else {
                dependency.createDependencyEdge(sourceNode, targetNode).associateWith(dependency)    
            }
        } else {
            val source = cfrs.key.getEdgeableParent
            val target = cfrs.value.getEdgeableParent
            val edge = createLooseDependencyEdge(dependencyEdges, source.node, source, target, dependency, false)
//            edge.source = source.node
//            edge.target = target.node
            edge.associateWith(dependency)
        }
    }
    
    private def void synthesizeControlDependency(ControlDependency dependency, RegionLCAFMap regionLCAFMap, State state) {

        val regionDependency = dependency.eContainer instanceof ControlflowRegion && dependency.target instanceof ControlflowRegion
        
        // Elevate the control flow regions to the same hierarchy level. Use the lcaf data for this. 
        val cfrs = if (regionDependency) regionLCAFMap.levelRegions(dependency) else new Pair<EObject, EObject>(dependency.eContainer, dependency.target)
        val sourceNode = cfrs.key.node
        val targetNode = cfrs.value.node
        if (regionDependency) {
            dependency.createDependencyEdge(sourceNode, targetNode).associateWith(dependency) 
        } else {
            val source = cfrs.key.getEdgeableParent
            val target = cfrs.value.getEdgeableParent
            val edge = createLooseDependencyEdge(dependencyEdges, source.node, source, target, dependency, false)
            edge.associateWith(dependency)
        }
    }    
    
    private def KEdge createLooseDependencyEdge(Map<Pair<EObject, EObject>, KEdge> edges, KNode attachNode,
        EObject source, EObject target, Dependency dependency, boolean ignoreFirstCollapsibleParent) {
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
            if (source instanceof State && target instanceof State) {
                edge = dependency.createDependencyEdge(source.node, target.node)
            }
            
            if (source instanceof Action && target instanceof Action) {
                edge = dependency.createDependencyEdge((source.eContainer as State).getRootState.node, (source.eContainer as State).getRootState.node)
                val kedge = edge
                
                edge.data += createKCustomRendering => [
                    val tenSource = if (source instanceof Transition) source.edge else actionRectangleMap.get(source) 
                    val tenTarget = if (target instanceof Transition) target.edge else actionRectangleMap.get(target)
                    
                    val edgeNode = new TracingEdgeNode(tenSource, tenTarget, (source.eContainer as State).getRootState.node);
                    
                    edgeNode.setIgnoreFirstCollapsibleParent(ignoreFirstCollapsibleParent, ignoreFirstCollapsibleParent)
                    it.figureObject = edgeNode
                    val poly = it.addChild(kedge.data.findFirst[it instanceof KPolyline] as KPolyline)
                    poly.addAction(Trigger::SINGLECLICK, ToggleDependencyAction.ID)
                ];
                
            }
            
            edges.put(sourceTargetPair, edge);
            edge.setProperty(CoreOptions.NO_LAYOUT, true);

            if (dependency instanceof DataDependency) {            
                edge.setProperty(ToggleDependencyAction.DATA_DEPENDENCY, dependency)
            }
        }
        edge
    }    
    
    protected def EObject getEdgeableParent(EObject eObject) {
        if (eObject instanceof ControlflowRegion) 
            return eObject as ControlflowRegion
        if (eObject instanceof State) 
            return eObject as State
        if (eObject instanceof Action) 
            return eObject as Action
        if (eObject instanceof Transition) 
            return eObject as Transition
        else if (eObject.eContainer === null) 
            return null
        else 
            return eObject.eContainer.getEdgeableParent
    }            

    static def getContainer(KEdge edge) {
        edge.getData(KContainerRendering) as KContainerRendering
    }
        
    protected def boolean isOnCausalLoop(Dependency dependency, Environment environment) {
        if (dependency === null || dependency.reference === null || !(dependency.reference instanceof ValuedObject)) 
            return false
            
        val loopData = environment.getProperty(ControlDependencies.LOOP_DATA) 
        if (loopData === null) 
            return false

        return loopData.criticalNodes.filter(State).exists[
            incomingTransitions.map[ effects ].flatten.filter(Assignment).exists[
                it.reference.valuedObject == dependency.reference                
            ]
        ]
    }         
     
}
