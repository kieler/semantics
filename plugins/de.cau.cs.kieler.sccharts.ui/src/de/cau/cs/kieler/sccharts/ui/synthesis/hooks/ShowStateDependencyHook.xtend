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
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisHook
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.KNodeExtensionsReplacement
import org.eclipse.elk.core.options.CoreOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.CommentStyles
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.kicool.ui.klighd.KiCoDiagramViewProperties
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.processors.dataflow.RegionDependencies
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.sccharts.processors.dataflow.RegionLCAFMap
import de.cau.cs.kieler.kexpressions.keffects.DataDependencyType
import de.cau.cs.kieler.core.model.Pair
import java.util.Map
import de.cau.cs.kieler.kicool.ui.kitt.tracing.TracingEdgeNode
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KCustomRendering
import de.cau.cs.kieler.klighd.krendering.KPolyline
import de.cau.cs.kieler.klighd.krendering.KDecoratorPlacementData
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.StateStyles
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.klighd.krendering.Trigger
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.ToggleDependencyAction
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

/**
 * Display/Hides annotations on states.
 * 
 * @author ssm
 * @kieler.design 2018-07-30 proposed
 * @kieler.rating 2018-07-30 proposed yellow
 * 
 */
@ViewSynthesisShared
class ShowStateDependencyHook extends SynthesisHook {

    extension KRenderingFactory = KRenderingFactory.eINSTANCE

    @Inject extension KRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KNodeExtensionsReplacement
    @Inject extension CommentStyles
    @Inject extension StateStyles
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension AnnotationsExtensions
    
    public static val IProperty<DataDependency> DATA_DEPENDENCY =
        new Property<DataDependency>("de.cau.cs.kieler.sccharts.ui.synthesis.hools.dataDependency", null)
        
    public static val IProperty<ShowStateDependencyHook> STATE_DEPENDENCY_HOOK =
        new Property<ShowStateDependencyHook>("de.cau.cs.kieler.sccharts.ui.synthesis.hools.stateDependencyHook", null)    
            
    
    /** The related synthesis option */
    public static final SynthesisOption SHOW_STATE_DEPENDENCIES_HOOK = SynthesisOption.createCheckOption("Show State Dependencies",
            false).setCategory(GeneralSynthesisOptions::DEBUGGING);

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_STATE_DEPENDENCIES_HOOK)
    }
    
//    override processState(State state, KNode node) {
//        if (!SHOW_STATE_DEPENDENCIES_HOOK.booleanValue) return; 
//
//        drawRegionDependencies(state)
//    }
    
    override finish(Scope model, KNode rootNode) {
        val sdh = rootNode.getProperty(STATE_DEPENDENCY_HOOK)
        
        if (sdh === null)
        if (!SHOW_STATE_DEPENDENCIES_HOOK.booleanValue) return; 

        rootNode.setProperty(STATE_DEPENDENCY_HOOK, this)

        drawRegionDependencies(model)
    }
    
    private val dependencyEdges = <Pair<EObject, EObject>, KEdge> newHashMap
    
    /** Draw all region dependencies that are present in this state. */
    private def drawRegionDependencies(EObject eObject) {
        val compilationContext = this.usedContext.getProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT)
        if (compilationContext === null) return;
        
        val result = compilationContext.getResultForModel(eObject.SCCharts)
        if (result === null) return;
        
        // Fetch the least common ancestor fork (lcaf) data from the compilation environment. 
        val lcafMap = result.getProperty(RegionDependencies.REGION_LCAF_MAP) 
        val dependencies = eObject.eAllContents.filter(DataDependency).
            filter[ !(it.eContainer instanceof ControlflowRegion) ].toList
        
        dependencyEdges.clear
        for (dependency : dependencies.filter(DataDependency)) {
            val attachState = dependency.eContainer.getEdgeableParent as State
            dependency.synthesizeDataDependency(lcafMap, attachState)
        }
    }
    
    /** Synthesize one dependency using the least common ancestor fork (lcaf) data. */
    private def void synthesizeDataDependency(DataDependency dependency, RegionLCAFMap regionLCAFMap, State state) {
        // Don't show confluent dependencies.
        if (dependency.type == DataDependencyType.WRITE_WRITE && dependency.confluent) return;
        
        val regionDependency = dependency.eContainer instanceof ControlflowRegion && dependency.target instanceof ControlflowRegion
        
        // Elevate the control flow regions to the same hierarchy level. Use the lcaf data for this. 
        val cfrs = if (regionDependency) regionLCAFMap.levelRegions(dependency) else new Pair<EObject, EObject>(dependency.eContainer, dependency.target)
        val sourceNode = cfrs.first.node
        val targetNode = cfrs.second.node

        if (!regionDependency) {
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
            edge.setProperty(DATA_DEPENDENCY, dependency)
        }
        edge
    }    
    
    
    private def KEdge createLooseDependencyEdge2(Map<Pair<EObject, EObject>, KEdge> edges, KNode attachNode,
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
            edge = createEdge(source, target);
            edges.put(sourceTargetPair, edge);
            edge.setProperty(CoreOptions.NO_LAYOUT, true);
            edge.data += createKCustomRendering => [
                val edgeNode = new TracingEdgeNode(source, target, attachNode);
                edgeNode.setIgnoreFirstCollapsibleParent(ignoreFirstCollapsibleParent, ignoreFirstCollapsibleParent)
                it.figureObject = edgeNode
                it.setProperty(KlighdProperties.NOT_SELECTABLE, true);
                it.addPolyline => [
                    it.lineWidth = 2
                    it.lineStyle = LineStyle::DASH
                    // Default arrow head
                    it.addHeadArrowDecorator
                    // Default green color
                    it.foreground = Colors.GREEN;
                    it.foreground.propagateToChildren = true;
                ];
            ];
        }
        val line = edge.getData(KCustomRendering).children.filter(KPolyline).head;
        // Configure mutual dependency with additional arrow
        if (dependency instanceof DataDependency) {
            if (dependency.type == DataDependencyType.WRITE_WRITE) {
                line.foreground = Colors.RED
                line.foreground.propagateToChildren = true;
            }
        }
        if (opposite) {
            line.addTailArrowDecorator.placementData as KDecoratorPlacementData => [
                // This fixes a weird bug in the KPolylineExtension
                it.setXOffset(-6f);
                it.setYOffset(-5f);
            ];
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