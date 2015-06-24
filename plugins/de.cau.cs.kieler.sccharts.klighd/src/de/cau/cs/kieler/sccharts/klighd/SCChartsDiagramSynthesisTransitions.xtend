package de.cau.cs.kieler.sccharts.klighd

import com.google.inject.Inject
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.KDecoratorPlacementData
import de.cau.cs.kieler.core.krendering.KPolygon
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

class SCChartsDiagramSynthesisTransitions {
    
    @Inject 
    extension KNodeExtensions
    
    @Inject
    extension KEdgeExtensions   

    @Inject
    extension KLabelExtensions   
    
    @Inject
    extension KRenderingExtensions

    @Inject
    extension KContainerRenderingExtensions    
    
    @Inject
    extension KColorExtensions       
    
    @Inject
    extension KPolylineExtensions    
    
    @Inject
    extension SCChartsExtension
        
    
    def KEdge translate(AbstractDiagramSynthesis<Scope> synthesis, Transition transition) {
        val transitionEdge = transition.createEdge()
        synthesis.associateWith(transitionEdge, transition)
        
        transitionEdge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);

        transitionEdge.source = transition.sourceState.node
        transitionEdge.target = transition.targetState.node
           
        if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::USE_ADAPTIVEZOOM)) {
            transitionEdge.lowerVisibilityScaleBound = 0.11f;
        }
            
        val transitionFigure = transitionEdge.addSpline(2)
        
                // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
        if (transition.isImmediate2) {
            transitionFigure.lineStyle = LineStyle::CUSTOM;
            transitionFigure.lineStyle.dashPattern.clear;
            transitionFigure.lineStyle.dashPattern += SCChartsDiagramSynthesisTransitionStyles::TRANSITION_DASH_PATTERN
        }
        
        val transitionArrow = transitionFigure.addArrowDecorator
        var arrowOffset = 0
        if (transition.history == HistoryType::SHALLOW) {
            transitionArrow.parent.addShallowHistoryDecorator(synthesis)
            (transitionArrow.placementData as KDecoratorPlacementData).absolute = -17.0f
            arrowOffset = -15
        } else
        if (transition.history == HistoryType::DEEP) {
            transitionArrow.parent.addDeepHistoryDecorator(synthesis)
            (transitionArrow.placementData as KDecoratorPlacementData).absolute = -17.0f
            arrowOffset = -15
        } else
        if (transition.deferred) {
            transitionArrow.parent.addDeferredDecorator(arrowOffset, synthesis)
            (transitionArrow.placementData as KDecoratorPlacementData).absolute = -11.0f + arrowOffset
        }

        switch (transition.type) {
            case TransitionType::STRONGABORT:
                transitionFigure.addStrongAbortionDecorator(synthesis)
            case TransitionType::TERMINATION:
                transitionFigure.addNormalTerminationDecorator(synthesis)
        };

        if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::SHOW_LABELS)) {
//            scopeProvider.parent = t.sourceState;           // WHY?

            var transitionString = ""
            if (!transition.label.nullOrEmpty) {
                transitionString = transition.label
            } else {
                
            }
            if (transition.sourceState.outgoingTransitions.size > 1) {
                transitionString = (transition.sourceState.outgoingTransitions.indexOf(transition) + 1) + 
                ": " + transitionString
            }
            
            if (!transitionString.nullOrEmpty) {
                val transitionLabel = transition.createLabel(transitionEdge)
                synthesis.associateWith(transitionLabel, transition)
                transitionLabel.configureCenterEdgeLabel(transitionString, 11, KlighdConstants::DEFAULT_FONT_NAME)
                
                transitionLabel.setLayoutOption(LayoutOptions.FONT_SIZE, 13);
                if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::USE_ADAPTIVEZOOM)) {
                    transitionLabel.lowerVisibilityScaleBound = 0.11f;
                }
                transitionLabel.KRendering.setFontBold(true)
            }
        }
        
        return transitionEdge
    }

    // -------------------------------------------------------------------------
    // Different renderings for different transition types
    def KRendering addStrongAbortionDecorator(KPolyline line, AbstractDiagramSynthesis<Scope> synthesis) {
        return line.addEllipse() => [
            it.lineWidth = 1;
            it.background = "red".color
            if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::PAPER_BW)) {
                it.background = "gray".color
            }
            it.setDecoratorPlacementData(10, 10, 4, 0, false);
        ];
    }

    def KRendering addDeferredDecorator(KContainerRendering line, float offset, AbstractDiagramSynthesis<Scope> synthesis) {
        return line.addEllipse() => [
            it.lineWidth = 1;
            it.background = "red".color
            if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::PAPER_BW)) {
                it.background = "gray".color
            }
            it.setDecoratorPlacementData(10, 10, -4 + offset, 1, false);
        ];
    }

    def KPolygon addNormalTerminationDecorator(KPolyline line, AbstractDiagramSynthesis<Scope> synthesis) {
        return line.drawTriangle() => [
            it.lineWidth = 1;
            it.background = "green".color
            if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::PAPER_BW)) {
                it.background = "gray".color
            }
            it.setDecoratorPlacementData(11, 11, 5, 0, true);
        ];
    }

    def KRendering addShallowHistoryDecorator(KContainerRendering line, AbstractDiagramSynthesis<Scope> synthesis) {
        return line.addEllipse() => [
            it.lineWidth = 0;
            it.setForeground(SCChartsDiagramSynthesisTransitionStyles::HISTORYDECORATORCOLOR.copy)
            it.background = SCChartsDiagramSynthesisTransitionStyles::HISTORYDECORATORCOLOR.copy
            it.setDecoratorPlacementData(16, 16, -6, 1, false);
            it.addPolyline(1) => [
                it.lineWidth = 2;
                it.points += createKPosition(LEFT, 5, 0, TOP, 4, 0);
                it.points += createKPosition(LEFT, 5, 0, BOTTOM, 4, 0);
                it.points += createKPosition(LEFT, 5, 0, TOP, 0, 0.5f);
                it.points += createKPosition(RIGHT, 5, 0, TOP, 0, 0.5f);
                it.points += createKPosition(RIGHT, 5, 0, BOTTOM, 4, 0);
                it.points += createKPosition(RIGHT, 5, 0, TOP, 4, 0);
                it.setForeground("white".color);
            ];
        ];
    }

    def KRendering addDeepHistoryDecorator(KContainerRendering line, AbstractDiagramSynthesis<Scope> synthesis) {
        return line.addEllipse() => [
            it.lineWidth = 0;
            it.setForeground(SCChartsDiagramSynthesisTransitionStyles::HISTORYDECORATORCOLOR.copy)
            it.background = SCChartsDiagramSynthesisTransitionStyles::HISTORYDECORATORCOLOR.copy
            it.setDecoratorPlacementData(16, 16, -6, 1, false);
            it.addPolyline(1) => [
                it.lineWidth = 2;
                it.points += createKPosition(LEFT, 3, 0, TOP, 4, 0);
                it.points += createKPosition(LEFT, 3, 0, BOTTOM, 4, 0);
                it.points += createKPosition(LEFT, 3, 0, TOP, 0, 0.5f);
                it.points += createKPosition(RIGHT, 7, 0, TOP, 0, 0.5f);
                it.points += createKPosition(RIGHT, 7, 0, BOTTOM, 4, 0);
                it.points += createKPosition(RIGHT, 7, 0, TOP, 4, 0);
                it.setForeground("white".color);
            ];
            it.addText("*") => [
                it.setForeground("white".color)
                it.setPointPlacementData(createKPosition(LEFT, 10, 0, TOP, 0, 0), H_LEFT, V_TOP, 6, 0, 0, 0)
            ]
        ];
    }

}