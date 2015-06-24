package de.cau.cs.kieler.sccharts.klighd

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.s.DependencyGraph
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.sccharts.StateType
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.sccharts.s.DataDependency
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.microlayout.PlacementUtil
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.kitt.klighd.tracing.TracingVisualizationProperties
import de.cau.cs.kieler.core.kexpressions.CombineOperator
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeExtension
import de.cau.cs.kieler.sccharts.ControlflowRegion
import com.google.inject.Provider
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import java.util.List

class SCChartsDiagramSynthesisStates {
	
    @Inject 
    extension KNodeExtensions
    
    @Inject
    extension KEdgeExtensions
    
    @Inject
    extension KRenderingExtensions

    @Inject
    extension KContainerRenderingExtensions    
    
    @Inject
    extension KColorExtensions    
	
    @Inject
    extension SCChartsExtension
    
    @Inject
    extension SCChartsSerializeExtension    
    
    @Inject
    extension SCChartsDiagramSynthesisControlflowRegions
    
    @Inject 
    extension SCChartsDiagramSynthesisTransitions
    
    @Inject
    extension SCChartsDiagramSynthesisHelper
    
	protected DependencyGraph dependencyGraph = null
	
    public def KNode translate(AbstractDiagramSynthesis<Scope> synthesis, State state) {

        val valuedObjectCache = state.getAllValuedObjects
        
        val stateNode = state.createNode
        synthesis.associateWith(stateNode, state);

        stateNode.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box")
        stateNode.setLayoutOption(LayoutOptions::BORDER_SPACING, 2f);
        stateNode.setLayoutOption(LayoutOptions::SPACING, 1f);
        stateNode.setLayoutOption(LayoutOptions::EXPAND_NODES, true);
        
        if (state.isInitial) {	// WHY?
            stateNode.setParent(stateNode.parent)
        }
        
        val connector = state.type == StateType::CONNECTOR;
        
        var cornerRadius = 8;
        var lineWidth = 1
        
        if (connector) {
        	cornerRadius = 7;
      	} else {
        	if (!synthesis.regionsOrDeclarationsVisible(state, valuedObjectCache) && !state.referencedState) {
        		cornerRadius = 17;
        	}
        }
        
        if (state.isInitial) {
        	lineWidth = 3
        }
        
        if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::PAPER_BW)) {
            lineWidth = lineWidth + 1;
        }
        
        
        val stateFigure = stateNode.addRoundedRectangle(cornerRadius, cornerRadius, lineWidth)
        stateFigure.background = "white".color
        stateFigure.lineWidth = lineWidth;
        
        if (state.isInitial || state.isFinal || synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::PAPER_BW)) {
        	stateFigure.foreground = "black".color
        } else {
        	stateFigure.foreground = "gray".color
        }
        
        if (!synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::PAPER_BW) && 
            synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::SHOW_SHADOW) && 
            !connector
        ) {
            stateFigure.shadow = "black".color;
            stateFigure.shadow.XOffset = 4;
            stateFigure.shadow.YOffset = 4;
        }

        if (connector) {
        	stateFigure.background = "black".color
        	stateFigure.lineWidth = 3
        	stateFigure.foreground = "white".color
			stateNode.setNodeSize(7, 7);
        }
        
        if (state.isFinal) {
			val stateRectangle = stateFigure.addRoundedRectangle(cornerRadius, cornerRadius)        	
			if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::USE_ADAPTIVEZOOM)) {
				stateFigure.lowerVisibilityScaleBound = 0.30f;
			}
				
			var offset = stateFigure.lineWidthValue + 2
			if (state.isInitial) {
				offset = offset - 1
	            stateFigure.lineWidth = 3
			} else {
	            stateFigure.lineWidth = 1
			}
            stateFigure.setCornerSize(offset + cornerRadius, offset + cornerRadius)
            stateRectangle.styleRef = stateFigure // WHY?
            
            if (state.referencedState) {
            	stateFigure.background.alpha = 0
            } else {
            	if (!synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::PAPER_BW)) {
            		stateFigure.setBackgroundGradient(SCChartsDiagramSynthesisStateStyles::STATE_STARTGRADIENTCOLOR.copy, 
            			SCChartsDiagramSynthesisStateStyles::STATE_ENDGRADIENTCOLOR.copy, 90
            		);
            	}
            }
            
            stateFigure.shadow = null as KColor
            stateFigure.lineWidth = 1;
            stateFigure.setAreaPlacementData().from(LEFT, offset, 0, TOP, offset, 0).to(RIGHT, offset, 0, BOTTOM, offset, 0);
        
        
        } else {
	        // State is not final.
        	
        	if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::PAPER_BW)) {
                stateFigure.setBackgroundGradient(SCChartsDiagramSynthesisStateStyles::STATE_STARTGRADIENTCOLOR.copy, 
                    SCChartsDiagramSynthesisStateStyles::STATE_ENDGRADIENTCOLOR.copy, 90);
        	} else {
        	    if (state.hasInnerStatesOrControlflowRegions) {
        	        stateFigure.setBackground(SCChartsDiagramSynthesisStateStyles::STATE_SUPERSTATEBACKGROUND.copy)
        	    }
        	}
        	
        	stateNode.setMinimalNodeSize(2 * stateFigure.cornerWidth, 2 * stateFigure.cornerHeight);
        	stateFigure.invisible = false
        	
        	if (connector) {
        	    return stateNode
        	}
        	
            if (synthesis.regionsOrDeclarationsVisible(state, valuedObjectCache) || state.isReferencedState) {
                stateFigure.setGridPlacement(1);
            }
            
            
            var priority = ""
            if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::SHOW_ORDER) || 
                synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::SHOW_DEPENDENCIES)
            ) {
                if (!dependencyGraph.dependencyNodes.filter[ it.state == state && !it.isJoin].nullOrEmpty) {
                    val dependencyNode = dependencyGraph.dependencyNodes.filter[ it.state == state && !it.isJoin].head
                    if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::SHOW_DEPENDENCIES)) {
                        priority = dependencyNode.getPriority.toString
                    }  else {
                        priority = dependencyNode.getOrder.toString
                    }
                    
                }
                if (state.hasInnerStatesOrControlflowRegions || state.hasInnerActions) {
                    if (!dependencyGraph.dependencyNodes.filter[ it.state == state && it.isJoin].nullOrEmpty) {
                        val dependencyNode = dependencyGraph.dependencyNodes.filter[ it.state == state && it.isJoin].head
                        if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::SHOW_DEPENDENCIES)) {
                            priority = priority + ", " + dependencyNode.getPriority.toString
                        }  else {
                            priority = priority + ", " + dependencyNode.getOrder.toString
                        }
                    }
                }
                
                for (dependency : dependencyGraph.dependencies.filter[ stateToDependOn.getState == state ]) {
                    if (dependency instanceof DataDependency) {
                        createEdge() => [ edge |
                            edge.target = dependency.stateDepending.getState.node;
                            edge.source = dependency.stateToDependOn.getState.node;
                            edge.setLayoutOption(LayoutOptions::NO_LAYOUT, false);
                            edge.addPolyline(3) => [
                                setForeground("blue".color)
//                                it.addArrowDecorator()        FIX!
                            ];
                        ];
                    }
                }
            } // Priorities
            
            val priorityToShow = priority
            if (synthesis.regionsOrDeclarationsVisible(state, valuedObjectCache) || state.referencedState) {
                if (state.hasNoControlflowRegionsWithStates) {
                    if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::USE_ADAPTIVEZOOM)) {
                        stateFigure.lowerVisibilityScaleBound = 0.075f;
                    }
                }
                
                if (!state.label.empty) {
                    val stateRectangle = stateFigure.addRectangle
                    stateRectangle.invisible = false
                    stateRectangle.fontSize = 11
                    stateRectangle.fontSize.propagateToChildren = true
                    stateRectangle.fontBold = true
                    stateRectangle.setGridPlacementData().from(LEFT, 0, 0, TOP, 8f, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
                    
                    var text = state.label
                    if (state.referencedState) {
                        text = text + "@" + (state.referencedScope as State).label
                    } 
                    
                    val stateText = stateRectangle.addText("    " + text)
                    stateText.fontSize = 11
                    if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::USE_ADAPTIVEZOOM)) {
                        stateText.lowerVisibilityScaleBound = 0.49f;
                    }
                    
                    if (priorityToShow.length > 0) {
                        val estimatedWidth = PlacementUtil.estimateTextSize(stateText).width
                        val stateDependencyText = stateRectangle.addText(priorityToShow)
                        stateDependencyText.fontSize = 9
                        stateDependencyText.fontBold = true
                        
                        if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::SHOW_DEPENDENCIES)) {
                            stateDependencyText.setForeground("blue".color)
                        } else {
                            stateDependencyText.setForeground("red".color)
                        }
                        
                        stateRectangle.setGridPlacementData().from(LEFT, estimatedWidth + 12, 0, TOP, 15f, 0).to(RIGHT,
                                        8, 0, BOTTOM, 8, 0);
                    }
                    
                }
                
            } // super states
            else {
                
                // For simple states we want a larger area 
                val stateText = stateFigure.addText(" " + state.label)
                stateText.fontSize = 11
                stateText.fontBold = true
                if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::PAPER_BW)) {
                    stateText.setGridPlacementData().from(LEFT, 10, 0, TOP, 9f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
                } else {
                    stateText.setGridPlacementData().from(LEFT, 9, 0, TOP, 9f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
                }
                if (priorityToShow.length > 0) {
                    val estimatedWidth = PlacementUtil.estimateTextSize(stateText).width
                    val statePriorityText = stateFigure.addText(priorityToShow)
                    statePriorityText.fontSize = 9
                    statePriorityText.fontBold = true
                    if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::SHOW_DEPENDENCIES)) {
                        statePriorityText.setForeground("blue".color)
                    } else {
                        statePriorityText.setForeground("red".color)
                    }
                    statePriorityText.setGridPlacementData().from(LEFT, estimatedWidth + 6, 0, TOP, 15f, 0).to(RIGHT, 8, 0,
                                BOTTOM, 8, 0);
                }
                if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::USE_ADAPTIVEZOOM)) {
                    stateFigure.lowerVisibilityScaleBound = 0.20f
                    stateText.lowerVisibilityScaleBound = 0.40f
                }
            } // simple states
        }
        
        if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::SHOW_SIGNAL_DECLARATIONS)) {
            for (declaration : state.declarations) {
                val declarationRectangle = stateFigure.addRectangle
                declarationRectangle.invisible = true
                val keywordRectangle = declarationRectangle.addRectangle
                
                keywordRectangle.setProperty(TracingVisualizationProperties.TRACING_NODE, true)
                keywordRectangle.invisible = true
                keywordRectangle.setPointPlacementData(createKPosition(LEFT, 8, 0, TOP, 0, 0), H_LEFT, V_TOP, 8, 0, 0, 0);
//                scopeProvider.parent = state        WHY?

                var declarationText = "";
                var typeText = "";
                if (declaration.type != ValueType::PURE) {
                    typeText = declaration.type.literal.toLowerCase + " "
                }
                if (declaration.isExtern) {
                    declarationText = declarationText + "extern ";
                }
                if (declaration.isStatic) {
                    declarationText = declarationText + "static ";
                }
                if (declaration.isConst) {
                    declarationText = declarationText + "const ";
                }
                if (declaration.isInput) {
                    declarationText = declarationText + "input ";
                }
                if (declaration.isOutput) {
                    declarationText = declarationText + "output "
                }
                if (declaration.isSignal) {
                    declarationText = declarationText + "signal ";
                }
                if (!declarationText.equals("")) {
                    declarationText = declarationText.trim + " "
                }
                
                var valuedObjectsText = ""
                for (valuedObject : declaration.valuedObjects) {
                    var combineText = ""
                    if (valuedObject.combineOperator != null && valuedObject.combineOperator != CombineOperator::NONE) {
                        combineText = " combine " + valuedObject.combineOperator.literal.toLowerCase
                    }
                    
                    var initialValueText = ""
                    if (valuedObject.initialValue != null) {
                        initialValueText = " = " + valuedObject.initialValue.serialize 
                    }
                    
                    var cardinalityText = ""
                    if (valuedObject.cardinalities.size > 0) {
                        for (cardinality : valuedObject.cardinalities) {
                            cardinalityText = cardinalityText + "[" + cardinality.toString + "]"
                        }
                    }
                    
                    valuedObjectsText = valuedObjectsText + valuedObject.name + initialValueText + combineText + cardinalityText + ","
                }
                valuedObjectsText = valuedObjectsText.substring(0, valuedObjectsText.length - 1)
                
                declarationRectangle.printHighlightedText(declarationText + typeText + valuedObjectsText, declaration)
            }

        }
        
        if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::SHOW_STATE_ACTIONS)) {
//            scopeProvider.parent = s;         WHY?
            for (action : state.localActions) {
                val actionRectangle = stateFigure.addRectangle
                actionRectangle.invisible = true
                
                val actionRectangle2 = actionRectangle.addRectangle     // WHY?
                actionRectangle2.invisible = true
                actionRectangle2.setProperty(TracingVisualizationProperties.TRACING_NODE, true);
                actionRectangle2.setPointPlacementData(createKPosition(LEFT, 8, 0, TOP, 0, 0), H_LEFT, V_TOP, 8, 0, 0, 0);
                var actionText = action.serialize as String
//                actionText = action.actionName +  actionText          // FIX
//                text = text.replace("'", "")          WHY?
                if (actionText.length > 1 && actionText.substring(actionText.length - 1, actionText.length).equals(";")) {
                    actionText = actionText.substring(0, actionText.length - 1)
                }
                actionRectangle2.printHighlightedText(actionText, action)
                if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::USE_ADAPTIVEZOOM)) {
                    actionRectangle2.lowerVisibilityScaleBound = 0.40f
                }
            }
        }
        
        if (synthesis.regionsOrDeclarationsVisible(state, valuedObjectCache) || state.referencedState) {
            val childArea = stateFigure.addChildArea()
            childArea.setGridPlacementData() => [
                from(LEFT, 3, 0, TOP, 3, 0).to(RIGHT, 3, 0, BOTTOM, 3, 0) 
                minCellHeight = 5;
                minCellWidth = 5;
             ];
        }
        
        
        if (!state.hasNoControlflowRegionsWithStates) {
            for (region : state.regions.filter(ControlflowRegion))
                stateNode.children += synthesis.translate(region, false);
        }
        
//            if (!s.hasNoDataflowRegions) {            FIX
//                for (d : s.dataflowRegions)
//                	node.children += d.translate(false)
//            }
            
            if (state.isReferencedState) {
                if (!synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::PAPER_BW)) {
                    stateFigure.setBackgroundGradient("#fefef0".color, "#e0b0099".color, 90.0f);
                } else {
                    stateFigure.setBackground("#fefef0".color)
                }
            } 
            
            if (state.referencedState && synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::SHOW_REFERENCEEXPANSION)) {
                for (region : (state.referencedScope as State).regions.filter(ControlflowRegion)) {
//                    val referenceSynthesis = delegate.get();      FIX!
//                    synthesis.use(synthesis.usedContext)        WHY?
                    stateNode.children += synthesis.translate(region, true)
                }
            }
            
            for (transition : state.outgoingTransitions) {
                synthesis.translate(transition)
            }
        
        return stateNode
    }
    
    @Inject
    Provider<DelegateSCChartsDiagramSynthesis> delegate;    
    
    
    
    def boolean regionsOrDeclarationsVisible(AbstractDiagramSynthesis<Scope> synthesis, State state, List<ValuedObject> valuedObjectCache) {
        val returnValue = (!state.hasNoControlflowRegionsWithStates || !state.hasNoDataflowRegions || 
            (!state.localActions.nullOrEmpty && synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::SHOW_STATE_ACTIONS)) ||
            (!valuedObjectCache.nullOrEmpty && synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::SHOW_SIGNAL_DECLARATIONS)))
        return returnValue
    }    
                    
}