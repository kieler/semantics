/*  * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.ide.klighd.KiCoDiagramViewProperties
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsInheritanceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisHooks
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.TransitionStyles
import java.util.HashMap
import java.util.LinkedHashSet
import java.util.List
import org.eclipse.elk.alg.force.options.StressOptions
import org.eclipse.elk.alg.layered.InteractiveLayeredGraphVisitor
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.alg.rectpacking.InteractiveRectPackingGraphVisitor
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.service.util.CompoundGraphElementVisitor
import org.eclipse.elk.core.util.IGraphElementVisitor
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

import static de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions.*
import de.cau.cs.kieler.klighd.filtering.SemanticFilterRule
import de.cau.cs.kieler.klighd.filtering.SemanticFilterTag
import de.cau.cs.kieler.klighd.KlighdOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.filtering.SCChartsSemanticFilterRules

/**
 * Main diagram synthesis for SCCharts.
 * 
 * @author als
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
@ViewSynthesisShared
class SCChartsSynthesis extends AbstractDiagramSynthesis<SCCharts> {

    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension SCChartsInheritanceExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension PragmaExtensions
    @Inject extension TransitionStyles
    @Inject extension KPolylineExtensions
    @Inject StateSynthesis stateSynthesis
    @Inject ControlflowRegionSynthesis controlflowSynthesis    
    @Inject DataflowRegionSynthesis dataflowSynthesis  
    @Inject TransitionSynthesis transitionSynthesis
    @Inject CommentSynthesis commentSynthesis
    @Inject MethodSynthesis methodSynthesis
    @Inject PolicySynthesis policySynthesis
        
    @Inject package SynthesisHooks hooks  
    
    public static final IProperty<String> SKINPATH = new Property<String>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.skinPath", "");

    static val PRAGMA_SYMBOLS = "symbols"       
    static val PRAGMA_SYMBOL = "symbol"       
    static val PRAGMA_SYMBOLS_GREEK = "greek"
    static val PRAGMA_SYMBOLS_SUBSCRIPT = "subscript"       
    static val PRAGMA_SYMBOLS_MATH_SCRIPT = "math script"       
    static val PRAGMA_SYMBOLS_MATH_FRAKTUR = "math fraktur"       
    static val PRAGMA_SYMBOLS_MATH_DOUBLESTRUCK = "math doublestruck"
    static val PRAGMA_FONT = "font"        
    static val PRAGMA_SKINPATH = "skinpath"
    
    static val PRAGMA_HIDE_IMPORTED_SCCHARTS = "HideImportedSCCharts"
          
    public static val ID = "de.cau.cs.kieler.sccharts.ui.synthesis.SCChartsSynthesis"
    
    override getDisplayedActions() {
        return newLinkedList => [ list |
            hooks.allHooks.forEach[list.addAll(getDisplayedActions)];
        ]
    }
       
    override getDisplayedSynthesisOptions() {
        val options = new LinkedHashSet()
        
        // Add categories options
        options.addAll(APPEARANCE, NAVIGATION, DATAFLOW, OO, DEBUGGING, LAYOUT)
        
        // General options
        options.addAll(
            USE_KLAY,
            SHOW_ALL_SCCHARTS,
            SHOW_INHERITANCE,
            SHOW_INHERITANCE_EDGES,
            SHOW_AGGREGATION_EDGES,
            SHOW_BINDINGS,
            SHOW_METHOD_BODY,
            SHOW_COMMENTS,
            SHOW_USER_LABELS,
            SHOW_CAUSAL_DATAFLOW
        )

        // Adaptive Zoom
        options.add(AdaptiveZoom.USE_ADAPTIVEZOOM)
        
        // Subsynthesis options
        options.addAll(stateSynthesis.displayedSynthesisOptions)
        options.addAll(transitionSynthesis.displayedSynthesisOptions)
        options.addAll(controlflowSynthesis.displayedSynthesisOptions)
        options.addAll(dataflowSynthesis.displayedSynthesisOptions)
        options.addAll(commentSynthesis.displayedSynthesisOptions)
        options.addAll(methodSynthesis.displayedSynthesisOptions)
        options.addAll(policySynthesis.displayedSynthesisOptions)
        
        // Add options of hooks
        hooks.allHooks.forEach[
            if (displayedSynthesisOptions !== null) options.addAll(displayedSynthesisOptions)
        ]
        
        return options.toList
    }

    override transform(SCCharts sccharts) {
        val startTime = System.currentTimeMillis
        
        val scc = 
            if (SHOW_CAUSAL_DATAFLOW.booleanValue) {
                val compilationContext = Compile.createCompilationContext(sccharts, 
                    #[ "de.cau.cs.kieler.sccharts.processors.controlDependencies" ]
                )
                compilationContext.compile
//                val originalContext = this.usedContext.getProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT)
//                originalContext.result.setProperty(RegionDependencies.REGION_DEPENDENCIES, 
//                    compilationContext.result.getProperty(RegionDependencies.REGION_DEPENDENCIES))
//                originalContext.result.setProperty(RegionDependencies.REGION_LCAF_MAP, 
//                    compilationContext.result.getProperty(RegionDependencies.REGION_LCAF_MAP))
                this.usedContext.setProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT, compilationContext)
                compilationContext.result.model as SCCharts
            } else sccharts
        
        val rootNode = createNode
        
        // Set semantic filter rules
        rootNode.setProperty(KlighdProperties.SEMANTIC_FILTER_RULES, SCChartsSemanticFilterRules.allFilters)
                
        // If dot is used draw edges first to prevent overlapping with states when layout is bad
        usedContext.setProperty(KlighdProperties.EDGES_FIRST, !USE_KLAY.booleanValue)
        
        clearSymbols
        for(symbolTable : scc.getStringPragmas(PRAGMA_SYMBOLS)) {  
            var prefix = ""
            if (symbolTable.values.size > 1) prefix = symbolTable.values.get(1)
            if (symbolTable.values.head.equals(PRAGMA_SYMBOLS_GREEK)) { defineGreekSymbols(prefix) }
            if (symbolTable.values.head.equals(PRAGMA_SYMBOLS_SUBSCRIPT)) { defineSubscriptSymbols(prefix) }
            if (symbolTable.values.head.equals(PRAGMA_SYMBOLS_MATH_SCRIPT)) { defineMathScriptSymbols(prefix) }
            if (symbolTable.values.head.equals(PRAGMA_SYMBOLS_MATH_FRAKTUR)) { defineMathFrakturSymbols(prefix) }
            if (symbolTable.values.head.equals(PRAGMA_SYMBOLS_MATH_DOUBLESTRUCK)) { defineMathDoubleStruckSymbols(prefix) }
        }             
        for(symbol : scc.getStringPragmas(PRAGMA_SYMBOL)) {
            symbol.values.head.defineSymbol(symbol.values.get(1))
        }
        if (scc.hasPragma(PRAGMA_SKINPATH)) {
            setSkinPath(scc.getStringPragmas(PRAGMA_SKINPATH).head.values.head, usedContext)
        }

        if (SHOW_ALL_SCCHARTS.booleanValue) {
            val rootStateNodes = <State, KNode> newHashMap
            val rootStates = newLinkedHashSet
            rootStates += scc.rootStates
            if (!sccharts.hasPragma(PRAGMA_HIDE_IMPORTED_SCCHARTS)) {
                val rs = sccharts.eResource?.resourceSet
                if (rs !== null) {
                    for (res : rs.resources.filterNull) {
                        for (impored : res.contents.filter(SCCharts)) {
                            rootStates += impored.rootStates
                        }
                    }
                }
            }
            for(rootState : rootStates) {
                hooks.invokeStart(rootState, rootNode)
                val synthesizedState = if (SHOW_INHERITANCE.booleanValue && rootStates.size > 1) {
                    // This is necessary to allow multiple visualizations of the same region in extending states
                    val properties = new KlighdSynthesisProperties()
                    properties.copyProperties(usedContext)
                    properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS, ScopeSynthesis.ID);
                    LightDiagramServices.translateModel2(rootState, usedContext, properties).viewModel?.children.head
                } else {
                    stateSynthesis.transform(rootState).head
                }
                rootStateNodes.put(rootState, synthesizedState)
                rootNode.children += rootStateNodes.get(rootState)
                
                // Add tracking adapter to allow access to source model associations
                val trackingAdapter = new SourceModelTrackingAdapter();
                rootNode.setLayoutOption(SCChartsDiagramProperties::MODEL_TRACKER, trackingAdapter);
                // Since the root node will node use to display the diagram (SimpleUpdateStrategy) the tracker must be set on the children.
                rootNode.children.forEach[eAdapters.add(trackingAdapter)]
                
                hooks.invokeFinish(rootState, rootNode)
            }
            rootNode.children.addAll(rootStateNodes.values)
            if (scc.rootStates.size > 1) {
//                rootNode.configureInterChartCommunication(scc, rootStateNodes)
            }
            if (SHOW_INHERITANCE_EDGES.booleanValue) {
                rootNode.setLayoutOption(CoreOptions::DIRECTION, Direction.UP)
                rootNode.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 20.0)
                rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE_BETWEEN_LAYERS, 28.0)
                rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE_BETWEEN_LAYERS, 28.0)
                for(state : rootStates) {
                    for (base : state.baseStates) {
                        val edge = createEdge
                        edge.source = rootStateNodes.get(state)
                        edge.target = rootStateNodes.get(base)
                        edge.addPolyline => [
                            lineWidth = 1
                            addInheritanceTriangleArrowDecorator
                        ]
                    }
                }
            }
            if (SHOW_AGGREGATION_EDGES.booleanValue) {
                rootNode.setLayoutOption(CoreOptions::DIRECTION, Direction.UP)
                rootNode.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 20.0)
                rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE_BETWEEN_LAYERS, 28.0)
                rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE_BETWEEN_LAYERS, 28.0)
                for(state : rootStates) {
                    val aggregation = newHashSet
                    for (ref : state.declarations.filter(ReferenceDeclaration)) {
                        if (ref.reference instanceof State) {
                            aggregation += ref.reference as State
                        }
                    }
                    for (inner : state.allScopes.toIterable) {
                        if (inner !== state) {
                            if (inner instanceof State) {
                                if (!inner.baseStateReferences.nullOrEmpty) {
                                    aggregation += inner.baseStates
                                }
                                if (inner.isReferencing && inner.reference.target instanceof State) {
                                    aggregation += inner.reference.target as State
                                }
                            }
                            for (ref : state.declarations.filter(ReferenceDeclaration)) {
                                if (ref.reference instanceof State) {
                                    aggregation += ref.reference as State
                                }
                            }
                        }
                    }
                    for (agg : aggregation) {
                        val edge = createEdge
                        edge.source = rootStateNodes.get(state)
                        edge.target = rootStateNodes.get(agg)
                        edge.addPolyline => [
                            lineWidth = 1
                            addAggregationArrowDecorator
                        ]
                    }
                }
            }
        } else {
            hooks.invokeStart(scc.rootStates.head, rootNode)
            rootNode.children += stateSynthesis.transform(scc.rootStates.head)
            
            // Add tracking adapter to allow access to source model associations
            val trackingAdapter = new SourceModelTrackingAdapter();
            rootNode.setLayoutOption(SCChartsDiagramProperties::MODEL_TRACKER, trackingAdapter);
            // Since the root node will node use to display the diagram (SimpleUpdateStrategy) the tracker must be set on the children.
            rootNode.children.forEach[eAdapters.add(trackingAdapter)]
            
            hooks.invokeFinish(scc.rootStates.head, rootNode) 
        }
        
        val pragmaFont = scc.getStringPragmas(PRAGMA_FONT).last
        if (pragmaFont !== null) {
            rootNode.eAllContents.filter(KText).forEach[ fontName = pragmaFont.values.head ]
        }
        
        // Report elapsed time
        usedContext?.setProperty(KiCoDiagramViewProperties.SYNTHESIS_TIME, System.currentTimeMillis - startTime)
		
        return rootNode
    }
    
    protected def void configureInterChartCommunication(KNode rootNode, SCCharts scc, HashMap<State, KNode> rootStateNodes) {
        // Bugged in the stress version we're working with.
        rootNode.setLayoutOption(CoreOptions::ALGORITHM, "org.eclipse.elk.stress")
        rootNode.setLayoutOption(StressOptions.DESIRED_EDGE_LENGTH, 300d)
        val HashMultimap<String, State> inputMessages = HashMultimap.create
        scc.rootStates.forEach[ rootState | rootState.declarations.filter(VariableDeclaration).filter[ input ].map[ valuedObjects ].flatten.forEach[ vo | inputMessages.put(vo.name, rootState) ] ]
        for (rootState : scc.rootStates) {
            val sourceNode = rootStateNodes.get(rootState)
            for (outputMessage : rootState.declarations.filter(VariableDeclaration).filter[ output ].map[ valuedObjects ].flatten) {
                for (target : inputMessages.get(outputMessage.name)) {
                    val targetNode = rootStateNodes.get(target)
                    
                    val edge = createEdge.associateWith(outputMessage)
                    edge.addPolyline(3) => [ foreground = Colors.DARK_SLATE_BLUE ]
                    edge.addDefaultDecorator
                    edge.source = sourceNode
                    edge.target = targetNode
                }                 
            }
        }
    }
    
    def String getSkinPath(ViewContext context) {
        val rootNode = context.viewModel
        var sp = rootNode.getProperty(SKINPATH)
        if (sp.nullOrEmpty) {
            sp = context.getProperty(SKINPATH)
            if (!sp.nullOrEmpty) {
                sp.setSkinPath(context)
            }
        } 
        return sp 
    }
    
    def void setSkinPath(String sp, ViewContext context) {
        val rootNode = context.viewModel
        rootNode.setProperty(SKINPATH, sp) 
    }
    
    override List<? extends IGraphElementVisitor> getAdditionalLayoutConfigs(KNode viewModel) {
        val List<IGraphElementVisitor> additionalLayoutRuns = newArrayList
        // Add interactive Layout run.
        if (!viewModel.getChildren().isEmpty() && (viewModel.getChildren().get(0)
                        .getProperty(CoreOptions.INTERACTIVE_LAYOUT) || isChildInteractive(viewModel))) {
            additionalLayoutRuns.add(new CompoundGraphElementVisitor(
                    new InteractiveRectPackingGraphVisitor(),
                    new InteractiveLayeredGraphVisitor()));
        }
        return additionalLayoutRuns;
    }
    
    private def isChildInteractive(KNode node) {
        val children = node.getChildren.get(0).getChildren()
        for (n : children) {
            if (n.getProperty(CoreOptions.INTERACTIVE_LAYOUT)) {
                return true
            }
        }
        return false
    }
   
}
