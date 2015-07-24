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
package de.cau.cs.kieler.sccharts.klighd

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.CombineOperator
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.FloatValue
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.KDecoratorPlacementData
import de.cau.cs.kieler.core.krendering.KPolygon
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KRectangle
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.util.Pair
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.NodeLabelPlacement
import de.cau.cs.kieler.kiml.options.PortConstraints
import de.cau.cs.kieler.kiml.options.PortLabelPlacement
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.klay.layered.p4nodes.NodePlacementStrategy
import de.cau.cs.kieler.klay.layered.properties.Properties
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.microlayout.PlacementUtil
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.CallNode
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.Equation
import de.cau.cs.kieler.sccharts.DefineNode
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.Node
import de.cau.cs.kieler.sccharts.ReferenceNode
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.StateType
import de.cau.cs.kieler.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeExtension
import de.cau.cs.kieler.sccharts.s.DataDependency
import de.cau.cs.kieler.sccharts.s.DependencyGraph
import de.cau.cs.kieler.sccharts.s.DependencyTransformation
import de.cau.cs.kieler.sccharts.text.actions.ActionsStandaloneSetup
import de.cau.cs.kieler.sccharts.text.actions.scoping.ActionsScopeProvider
import java.util.List
import javax.inject.Provider
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.serializer.ISerializer

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeExtension
import de.cau.cs.kieler.sccharts.LocalAction
import de.cau.cs.kieler.kitt.klighd.tracing.TracingVisualizationProperties
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.core.annotations.CommentAnnotation
import de.cau.cs.kieler.kico.internal.Timing

/**
 * KLighD visualization for KIELER SCCharts (Sequentially Constructive Charts)
 * 
 * @author cmot ssm
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
@ViewSynthesisShared
class SCChartsDiagramSynthesis extends AbstractDiagramSynthesis<Scope> {

    // -------------------------------------------------------------------------
    // Serialization of actions (state actions and transition labels)   
    private static val Injector i = ActionsStandaloneSetup::doSetup();
    private static val ActionsScopeProvider scopeProvider = i.getInstance(typeof(ActionsScopeProvider));
    private static val ISerializer serializer = i.getInstance(typeof(ISerializer));
    
    // -------------------------------------------------------------------------
    // We need some extensions 
    @Inject 
    extension KNodeExtensions

    @Inject
    extension KEdgeExtensions

    @Inject
    extension KLabelExtensions

    @Inject
    extension KPortExtensions

    @Inject
    extension KRenderingExtensions

    @Inject
    extension KContainerRenderingExtensions

    @Inject
    extension KPolylineExtensions

    @Inject
    extension KColorExtensions

    @Inject
    extension SCChartsExtension

    @Inject
    extension DependencyTransformation

    @Inject
    extension KExpressionsExtension
    
    @Inject
    extension SCChartsSerializeExtension
    
    @Inject
    extension de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
    
    @Inject 
    extension SCGDepExtension
    
    @Inject 
    extension SCGLoopExtension
    
    @Inject
    extension SCChartsDiagramSynthesisStates

    // -------------------------------------------------------------------------
    // Transformation options   
    // CORE TRANSFORMATIONS

    override public getDisplayedSynthesisOptions() {
        return newLinkedList(SCChartsDiagramSynthesisOptions::SHOW_SIGNAL_DECLARATIONS, 
        	SCChartsDiagramSynthesisOptions::SHOW_STATE_ACTIONS, 
        	SCChartsDiagramSynthesisOptions::SHOW_LABELS, 
        	SCChartsDiagramSynthesisOptions::SHOW_DEPENDENCIES, 
        	SCChartsDiagramSynthesisOptions::SHOW_ORDER,
            SCChartsDiagramSynthesisOptions::SHOW_REFERENCEEXPANSION, 
            SCChartsDiagramSynthesisOptions::USE_ADAPTIVEZOOM, 
            SCChartsDiagramSynthesisOptions::SHOW_SHADOW, 
            SCChartsDiagramSynthesisOptions::PAPER_BW, 
            SCChartsDiagramSynthesisOptions::SHOW_SCG_DEPENDENCIES, 
            SCChartsDiagramSynthesisOptions::SHOW_SCG_LOOPS);
    }

    override public getDisplayedLayoutOptions() {
        return newLinkedList(
        	new Pair<IProperty<?>, List<?>>(LayoutOptions::DIRECTION, Direction::values.drop(1).sortBy[it.name]),
            new Pair<IProperty<?>, List<?>>(LayoutOptions::SPACING, newArrayList(0, 150)));
    }

    // -------------------------------------------------------------------------
    // The Main entry transform function   
    override transform(Scope model) {
        usedContext.setProperty(KlighdProperties.EDGES_FIRST, true);	// WHY?
        
        val timing = new Timing()
        
        if (!(model instanceof State)) {
        	throw new Exception("The SCCharts synthesis expects a state as input. The given type was " + model.class.toString);
        } 
		val rootState = (model as State);
		
        val tracking = new SourceModelTrackingAdapter();				// WHY?
        val rootNode = createNode();
        
        rootNode.eAdapters.add(tracking);								// WHY?
        
        if (SCChartsDiagramSynthesisOptions::SHOW_ORDER.booleanValue || SCChartsDiagramSynthesisOptions::SHOW_DEPENDENCIES.booleanValue) {
            dependencyGraph = rootState.getDependencyGraph
        }        
        
        // ATTENTION: DO NOT use graphiz on outermost root node, this will result in suspicious layout bugs!!!
        rootNode.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES)
        rootNode.children += this.translate(rootState)
        
		val elapsedTime = timing.elapsed
        System.out.println("SCCharts synthesis finished (time elapsed: "+(elapsedTime / 1000)+"s).")
        
        if(SCChartsDiagramSynthesisOptions::SHOW_SCG_DEPENDENCIES.booleanValue){
            rootNode.addSCGDependcyEdges(model as State, tracking);
        }
        
        if(SCChartsDiagramSynthesisOptions::SHOW_SCG_LOOPS.booleanValue){
            rootNode.addSCGLoopHighlighting(model as State, tracking);
        }
        
        return rootNode
    }
    
    @Inject
    Provider<DelegateSCChartsDiagramSynthesis> delegate;

}

@ViewSynthesisShared
class DelegateSCChartsDiagramSynthesis extends SCChartsDiagramSynthesis {

}
