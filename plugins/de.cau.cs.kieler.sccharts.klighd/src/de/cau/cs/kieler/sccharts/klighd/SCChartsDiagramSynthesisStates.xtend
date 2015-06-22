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

abstract class SCChartsDiagramSynthesisStates extends AbstractDiagramSynthesis<Scope> {
	
    @Inject 
    extension KNodeExtensions
    
    @Inject
    extension KRenderingExtensions

    @Inject
    extension KContainerRenderingExtensions    
    
    @Inject
    extension KColorExtensions    
	
    @Inject
    extension SCChartsExtension
    
    @Inject
    extension SCChartsDiagramSynthesisHelper
    
	protected DependencyGraph dependencyGraph = null
	
    public def KNode translate(State state) {

        val valuedObjectCache = state.getAllValuedObjects
        
        val stateNode = state.createNode
        stateNode.associateWith(state);

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
        	if (!state.hasRegionsOrDeclarations(valuedObjectCache) && !state.referencedState) {
        		cornerRadius = 17;
        	}
        }
        
        if (state.isInitial) {
        	lineWidth = 3
        }
        
        if (SCChartsDiagramSynthesisOptions::PAPER_BW.booleanValue) {
            lineWidth = lineWidth + 1;
        }
        
        
        val stateFigure = node.addRoundedRectangle(cornerRadius, cornerRadius, lineWidth)
        stateFigure.background = "white".color
        stateFigure.lineWidth = lineWidth;
        
        if (state.isInitial || state.isFinal || SCChartsDiagramSynthesisOptions::PAPER_BW.booleanValue) {
        	stateFigure.foreground = "black".color
        } else {
        	stateFigure.foreground = "gray".color
        }
        
        if (!SCChartsDiagramSynthesisOptions::PAPER_BW.booleanValue && SCChartsDiagramSynthesisOptions::SHOW_SHADOW.booleanValue && !connector) {
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
			if (SCChartsDiagramSynthesisOptions::USE_ADAPTIVEZOOM.booleanValue) {
//				stateRectangle.lowerVisibilityScaleBound = 0.30f;
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
            	if (!SCChartsDiagramSynthesisOptions::PAPER_BW.booleanValue) {
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
        	
        	
        }
                    figure => [
                    if (!(PAPER_BW.booleanValue || globalBWOption)) {
                        it.setBackgroundGradient(SCCHARTSBLUE1.copy, SCCHARTSBLUE2.copy, 90);
                    } else {
                        if (s.hasInnerStatesOrControlflowRegions) {
                            it.setBackground(SCCHARTSGRAY.copy);
                        }
                    }
                ]
                
             ) => [
                node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);
                //figure.setSurroundingSpace(5,0);
                it.invisible = false;
                if (connector) {
                    return;
                }
                //                it.setBackgroundGradient(SCCHARTSBLUE1.copy, SCCHARTSBLUE2.copy, 90);
                if (s.hasRegionsOrDeclarations(valuedObjectCache) || s.isReferencedState) {
                    it.setGridPlacement(1);
                }
                var priority = ""
                if (SHOW_ORDER.booleanValue || SHOW_DEPENDENCIES.booleanValue) {
                    if (!dependencyGraph.dependencyNodes.filter(e|e.getState == s && !e.getIsJoin).nullOrEmpty) {
                        val dependencyNode = dependencyGraph.dependencyNodes.filter(e|e.getState == s && !e.getIsJoin).
                            get(0)
                        priority = if (SHOW_DEPENDENCIES.booleanValue)
                            dependencyNode.getPriority + ""
                        else
                            (dependencyNode.getOrder) + ""
                        if (s.hasInnerStatesOrControlflowRegions || s.hasInnerActions) {
                            if (!dependencyGraph.dependencyNodes.filter(e|e.getState == s && e.getIsJoin).nullOrEmpty) {
                                val dependencyNodeJoin = dependencyGraph.dependencyNodes.filter(
                                    e|e.getState == s && e.getIsJoin).get(0)
                                priority = priority + ", " + if (SHOW_DEPENDENCIES.booleanValue)
                                    dependencyNodeJoin.getPriority + ""
                                else
                                    (dependencyNodeJoin.getOrder) + ""

                            //priority = priority + ", " + dependencyGraph.dependencyNodes.filter(e|e.getState == s && e.getIsJoin).get(0).getPriority
                            }
                        } 
                        priority = priority + ""
                    }

                    for (dependency : dependencyGraph.dependencies.filter[stateToDependOn.getState == s].toList) {
                        if (dependency instanceof DataDependency) {

                            //                        val join1 = if (dependency.stateDepending.getIsJoin) "j" else ""
                            //                        val join2 = if (dependency.stateToDependOn.getIsJoin) "j" else ""
                            //                        System.out.println("Dependency: " + dependency.stateDepending.getState.id + join1 + "-->" + dependency.stateToDependOn.getState.id + join2)
                            s.createEdge() => [ edge |
                                edge.target = dependency.stateDepending.getState.node;
                                edge.source = dependency.stateToDependOn.getState.node;
                                //edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
                                edge.setLayoutOption(LayoutOptions::NO_LAYOUT, false);
                                edge.addPolyline(3) => [
                                    it.setForeground("blue".color)
                                    it.addArrowDecorator()
                                ];
                            ];
                        }
                    }

                }
                val priorityToShow = priority
                val prioritySpace = if(priorityToShow.length > 0) "  " else " "
                if (s.hasRegionsOrDeclarations(valuedObjectCache) || s.referencedState) {
                    
                    if (s.hasNoControlflowRegionsWithStates) 
                        if (USE_ADAPTIVEZOOM.booleanValue) figure.lowerVisibilityScaleBound = 0.075f;
                    // Get a smaller window-title-bare if this a macro state 
                    if (!s.label.empty)
                        it.addRectangle => [
                            it.invisible = true
                            it.fontSize = 11;
                            it.fontSize.propagateToChildren = true
                            it.setFontBold(true);
                            it.setGridPlacementData().from(LEFT, 0, 0, TOP, 8f, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
                            var text = s.label
                            if (s.referencedState) 
                                text = text + ' @ ' + (s.referencedScope as State).label
                            val ktext = it.addText("   " + text + prioritySpace + " ").putToLookUpWith(s) => [
                                it.fontSize = 11;
                                if (USE_ADAPTIVEZOOM.booleanValue) it.lowerVisibilityScaleBound = 0.49f;
                               ];
                            if (priorityToShow.length > 0) {
                                val estimatedWidth = PlacementUtil.estimateTextSize(ktext).width
                                it.addText(priorityToShow) => [
                                    it.fontSize = 9;
                                    it.setFontBold(true);
                                    if (SHOW_DEPENDENCIES.booleanValue) {
                                        it.setForeground("blue".color)
                                    } else {
                                        it.setForeground("red".color)
                                    }
                                    it.setGridPlacementData().from(LEFT, estimatedWidth + 12, 0, TOP, 15f, 0).to(RIGHT,
                                        8, 0, BOTTOM, 8, 0);
                                ];
                            }
                        ];
                } else {
                    if (USE_ADAPTIVEZOOM.booleanValue) figure.lowerVisibilityScaleBound = 0.20f;
                    // For simple states we want a larger area 
                    val ktext = it.addText(" " + s.label + prioritySpace).putToLookUpWith(s) => [
                        if (USE_ADAPTIVEZOOM.booleanValue) it.lowerVisibilityScaleBound = 0.40f;
                        it.fontSize = 11;
                        it.setFontBold(true);
                        if (PAPER_BW.booleanValue || globalBWOption) {
                            it.setGridPlacementData().from(LEFT, 10, 0, TOP, 9f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
                        } else {
                            it.setGridPlacementData().from(LEFT, 9, 0, TOP, 9f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
                        }
                    ];
                    if (priorityToShow.length > 0) {
                        val estimatedWidth = PlacementUtil.estimateTextSize(ktext).width
                        it.addText(priorityToShow) => [
                            it.fontSize = 9;
                            it.setFontBold(true);
                            if (SHOW_DEPENDENCIES.booleanValue) {
                                it.setForeground("blue".color)
                            } else {
                                it.setForeground("red".color)
                            }
                            it.setGridPlacementData().from(LEFT, estimatedWidth + 6, 0, TOP, 15f, 0).to(RIGHT, 8, 0,
                                BOTTOM, 8, 0);
                        ]
                    }
                }
                if (SHOW_SIGNAL_DECLARATIONS.booleanValue) {
                    for (tg : s.declarations) {
                        it.addRectangle => [
                            it.invisible = true;
                            it.addRectangle => [
                                it.associateWith(tg);
                                it.setProperty(TracingVisualizationProperties.TRACING_NODE, true);
                                it.invisible = true;
                                it.setPointPlacementData(createKPosition(LEFT, 8, 0, TOP, 0, 0), H_LEFT, V_TOP, 8, 0, 0,
                                    0);
                                scopeProvider.parent = s;
                                var declaration = "";
                                var type = "";
                                if (tg.type != ValueType::PURE) {
                                    type = tg.type.literal.toLowerCase + " "
                                }
                                if (tg.isExtern) {
                                    declaration = declaration + "extern ";
                                }
                                if (tg.isStatic) {
                                    declaration = declaration + "static ";
                                }
                                if (tg.isConst) {
                                    declaration = declaration + "const ";
                                }
                                if (tg.isInput) {
                                    declaration = declaration + "input ";
                                }
                                if (tg.isOutput) {
                                    declaration = declaration + "output "
                                }
                                if (tg.isSignal) {
                                    declaration = declaration + "signal ";
                                }
                                if (!declaration.equals("")) {
                                    declaration = declaration.trim + " "
                                }
                                var sigs = ""
                                var c = 0
                                for (sig : tg.valuedObjects) {
                                    var combine = ""
                                    if (sig.combineOperator != null && sig.combineOperator != CombineOperator::NONE) {
                                        combine = " combine " + sig.combineOperator.literal.toLowerCase
                                    }
                                    var init = ""
                                    if (sig.initialValue != null) {
                                        init = " = " + sig.initialValue.serialize //serializer.serialize(sig.initialValue.copy)
                                    }
                                    var card = ""
                                    if (sig.cardinalities.size > 0) {
                                        for (ca : sig.cardinalities) {
                                            card = card + "[" + ca.toString + "]"
                                        }
                                    }
                                    sigs = sigs + sig.name + init + combine + card
                                    c = c + 1
                                    if(c < tg.valuedObjects.size) sigs = sigs + ","
                                }
                                it.printHighlightedText(declaration + type + sigs, tg)
                            ];
                        ];
                    }

                }
                if (SHOW_STATE_ACTIONS.booleanValue) {
                    scopeProvider.parent = s;
                    for (action : s.localActions) {
                        it.addRectangle => [
                            it.invisible = true;
                            it.addRectangle => [
                                it.associateWith(action);
                                it.setProperty(TracingVisualizationProperties.TRACING_NODE, true);
                                if (USE_ADAPTIVEZOOM.booleanValue) it.lowerVisibilityScaleBound = 0.5f;
                                it.invisible = true;
                                it.setPointPlacementData(createKPosition(LEFT, 8, 0, TOP, 0, 0), H_LEFT, V_TOP, 8, 0, 0,
                                    0);
                                var text = action.serialize as String//serializer.serialize(action.copy);
                                text = action.actionName +  text
                                text = text.replace("'", "")
                                if (text.length > 1 && text.substring(text.length - 1, text.length).equals(";")) {
                                    text = text.substring(0, text.length - 1)
                                }
                                it.printHighlightedText(text, action)
                            ]
                        //it.addRectangle().invisible = true;
                        ];
                    }
// FIXME: What is bodyText used for?
//                    for (bodyText : s.bodyText) {
//                        it.addRectangle => [
//                            it.invisible = true;
//                            val text = bodyText.text;
//                            it.addText(text) => [
//                                it.setPointPlacementData(createKPosition(LEFT, 8, 0, TOP, 0, 0), H_LEFT, V_TOP, 6, 0, 0,
//                                    0);
//                                it.putToLookUpWith(bodyText);
//                            ]
//                            it.addRectangle().invisible = true;
//                        ];
//                    }
                }
                if (s.hasRegionsOrDeclarations(valuedObjectCache) || s.referencedState) {
                    it.addChildArea().setGridPlacementData() => [
                        from(LEFT, 3, 0, TOP, 3, 0).to(RIGHT, 3, 0, BOTTOM, 3, 0)
                        minCellHeight = 5;
                        minCellWidth = 5;
                    ];
                }
            ];
            if (!s.hasNoControlflowRegionsWithStates) {
                for (r : s.regions.filter(ControlflowRegion))
                    node.children += r.translate(false);
            }
            if (!s.hasNoDataflowRegions) {
                for (d : s.dataflowRegions)
                	node.children += d.translate(false)
            }
            if (s.isReferencedState) {
                if (!(PAPER_BW.booleanValue || globalBWOption)) {
                    figure.setBackgroundGradient("#fefef0".color, "#e0b0099".color, 90.0f);
                } else {
                    figure.setBackground("#fefef0".color)
                }
            } 
            if (s.referencedState && SHOW_REFERENCEEXPANSION.booleanValue) {
                for (r : (s.referencedScope as State).regions.filter(ControlflowRegion)) {
                    val synthesis = delegate.get();
                    synthesis.use(usedContext)
                    node.children += synthesis.translate(r, true)
                }
            }
            for (t : s.outgoingTransitions)
                t.translateTransition();
        ]
    }
	
}