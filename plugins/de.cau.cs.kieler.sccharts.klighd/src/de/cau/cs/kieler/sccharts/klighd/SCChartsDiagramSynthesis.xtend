/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.klighd

import com.google.common.collect.ImmutableMap
import com.google.common.collect.ImmutableSet
import com.google.inject.Injector
import de.cau.cs.kieler.core.kexpressions.CombineOperator
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.KDecoratorPlacementData
import de.cau.cs.kieler.core.krendering.KPolygon
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KRectangle
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.TransformationOption
import de.cau.cs.kieler.klighd.microlayout.PlacementUtil
import de.cau.cs.kieler.klighd.transformations.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.StateType
import de.cau.cs.kieler.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.text.actions.ActionsStandaloneSetup
import de.cau.cs.kieler.sccharts.text.actions.scoping.ActionsScopeProvider
import java.util.Collection
import java.util.List
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.serializer.ISerializer

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

class SCChartsDiagramSynthesis extends AbstractDiagramSynthesis<Region> {
    
    private static val Injector i = ActionsStandaloneSetup::doSetup();
    private static val ActionsScopeProvider scopeProvider = i.getInstance(typeof(ActionsScopeProvider));
    private static val ISerializer serializer = i.getInstance(typeof(ISerializer));
//    private static val Resource TMP_RES = i.getInstance(typeof(ResourceSet))
//            .createResource(URI::createFileURI("dummy.action"));
    
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
    extension KPolylineExtensions
    
    @Inject
    extension KColorExtensions
    
    private static val TransformationOption SHOW_SIGNAL_DECLARATIONS
        = TransformationOption::createCheckOption("Declarations", true);

    private static val TransformationOption SHOW_STATE_ACTIONS
        = TransformationOption::createCheckOption("State actions", true);

    private static val TransformationOption SHOW_LABELS
        = TransformationOption::createCheckOption("Transition labels", true);
        
    private static val TransformationOption SHOW_SHADOW
        = TransformationOption::createCheckOption("Shadow", true);

    override public getTransformationOptions() {
        return ImmutableSet::of(SHOW_SIGNAL_DECLARATIONS, SHOW_STATE_ACTIONS, SHOW_LABELS, SHOW_SHADOW);
    }
    
    override public getRecommendedLayoutOptions() {
        return ImmutableMap::<IProperty<?>, Collection<?>>of(
            LayoutOptions::ALGORITHM, emptyList,
            LayoutOptions::DIRECTION, Direction::values.drop(1).sortBy[ it.name ],
            LayoutOptions::SPACING, newArrayList(0, 255)
        );
    }
    
    override transform(Region model) {
        return model.translate();
    }
    
    
//    private static val float REGION_DASH_BLACK = 10;
//    private static val float REGION_DASH_WHITE = 5;
//    private static val List<Float> REGION_DASH_PATTERN = newArrayList(REGION_DASH_BLACK, REGION_DASH_WHITE); 
    private static val float TRANSITION_DASH_BLACK = 7;
    private static val float TRANSITION_DASH_WHITE = 3;
    private static val List<Float> TRANSITION_DASH_PATTERN = newArrayList(TRANSITION_DASH_BLACK, TRANSITION_DASH_WHITE); 

    private static val KColor SCCHARTSGRAY = RENDERING_FACTORY.createKColor()=>[it.red=240;it.green=240;it.blue=240];
    private static val KColor SCCHARTSBLUE1 = RENDERING_FACTORY.createKColor()=>[it.red=248;it.green=249;it.blue=253];
    private static val KColor SCCHARTSBLUE2 = RENDERING_FACTORY.createKColor()=>[it.red=205;it.green=220;it.blue=243];
    private static val KColor KEYWORD = RENDERING_FACTORY.createKColor()=>[it.red=115;it.green=0;it.blue=65];
    private static val KColor DARKGRAY = RENDERING_FACTORY.createKColor()=>[it.red=60;it.green=60;it.blue=60];
    
    


    def dispatch KNode translate(Region r) {
        return r.createNode().putToLookUpWith(r) => [ node |
            // node.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot");
            // node.setLayoutOption(LayoutOptions::DIRECTION, Direction::RIGHT);
            // node.setLayoutOption(LayoutOptions::SPACING, 40f);
            if (r.states.size > 1) {
                //node.setLayoutOption(KlighdConstants::EXPAND, false);
            }

            for (s : r.states) {
                node.children += s.translate;
            }

            if (r.eContainer == null) {
                return;
            }
            
            node.addRectangle() => [
                it.setProperty(KlighdProperties::EXPANDED_RENDERING, true);
                it.setBackgroundGradient("white".color, SCCHARTSGRAY, 90);
                it.setSurroundingSpace(4,0);
                it.invisible = false;
                it.foreground = "gray".color
                it.lineWidth = 1;
                it.addText("[-]" + if (r.label.nullOrEmpty) "" else " "+r.label).putToLookUpWith(r) => [
                    it.foreground = "gray".color
                    it.fontSize = 8                  
                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                ];
//                it.addVerticalLine(LEFT, 1, 1) => [
//                    it.lineStyle = LineStyle::CUSTOM;
//                    it.lineStyle.dashPattern.clear;
//                    it.lineStyle.dashPattern += REGION_DASH_PATTERN;
//                    it.invisible = true;
//                    it.invisible.modifierId = "de.cau.cs.kieler.sccharts.klighd.regionLineModifier";
//                ];
//                it.addHorizontalLine(TOP, 1, 1) => [
//                    it.lineStyle = LineStyle::CUSTOM;
//                    it.lineStyle.dashPattern.clear;
//                    it.lineStyle.dashPattern += REGION_DASH_PATTERN;
//                    it.invisible = true;
//                    it.invisible.modifierId = "de.cau.cs.kieler.sccharts.klighd.regionLineModifier";
//                ];
                it.addChildArea().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
            ];
            node.addRectangle() => [
                it.setProperty(KlighdProperties::COLLAPSED_RENDERING, true);
                it.setBackgroundGradient("white".color, SCCHARTSGRAY, 90);
                it.setSurroundingSpace(4,0);
                it.invisible = false;
                it.foreground = "gray".color
                it.lineWidth = 1;
                it.addText("[+]" + if (r.label.nullOrEmpty) "" else " "+r.label).putToLookUpWith(r) => [
                    it.foreground = "gray".color
                    it.fontSize = 8                  
                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                ];
                it.addRectangle().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0).invisible = true;
            ]
        ];
    }
    
    
    def boolean hasNoRegionsWithStates(State state) {
        return (state.regions == null || state.regions.size == 0 || state.eAllContents.filter(typeof(State)).size == 0)
    }
    
    // Tells if the state needs a macro state rendering because of regions or declarations
    def boolean hasRegionsOrDeclarations(State state) {
        val returnValue =  
            (!state.hasNoRegionsWithStates
            ||
            (!state.localActions.nullOrEmpty && SHOW_STATE_ACTIONS.optionBooleanValue)
            ||
            (!state.valuedObjects.nullOrEmpty && SHOW_SIGNAL_DECLARATIONS.optionBooleanValue)) 
        return returnValue 
    }
    
    def dispatch String getActionName(EntryAction action) {
        "entry"
    }
    def dispatch String getActionName(DuringAction action) {
        "during"
    }
    def dispatch String getActionName(ExitAction action) {
        "exit"
    }
    def dispatch String getActionName(SuspendAction action) {
        "suspend"
    }
    
    
    def boolean isKeyword(String text) {
        return (text == "scchart")||
               (text == "entry")||
               (text == "during")||
               (text == "suspend")||
               (text == "exit")||
               (text == "signal")||
               (text == "int")||
               (text == "bool")||
               (text == "float")||
               (text == "unsigned")||
               (text == "immediate")||
               (text == "input")||
               (text == "output")||
               (text == "pre")||
               (text == "val")||
               (text == "combine")
    }
    
    def List<String> getWords(String text) {
        text.split("\\W+")
    }
    
    def KRectangle printHighlightedText(KRectangle parent, String text, EObject lookup) {
            var offset = 8f
            var remainingText = text;
            var split = "";
            for (word : text.getWords) {
              val index = remainingText.indexOf(word);
              split = remainingText.substring(0, index);
              remainingText = remainingText.substring(index + word.length, remainingText.length);
              val currentOffset = offset
              val ktext = parent.addText(split + word) => [
                     if (word.keyword) {
                        it.setForeground(KEYWORD.copy)
                        it.setFontBold(true)
                     }
                     it.putToLookUpWith(lookup);
                     it.setPointPlacementData(createKPosition(LEFT, currentOffset, 0, TOP, 0, 0), H_LEFT, V_TOP, 6, 0, 0, 0);
              ]
              offset = offset + PlacementUtil.estimateTextSize(ktext).width
            }
            if (remainingText != "") {
              val word = remainingText
              val currentOffset = offset
              val ktext = parent.addText(word) => [
                     if (word.keyword) {
                        it.setForeground(KEYWORD.copy)
                        it.setFontBold(true)
                     }
                     it.putToLookUpWith(lookup);
                     it.setPointPlacementData(createKPosition(LEFT, currentOffset, 0, TOP, 0, 0), H_LEFT, V_TOP, 6, 0, 0, 0);
              ]
            }    
        parent
    }
    
    
    
    def dispatch KNode translate(State s) {
        return s.createNode().putToLookUpWith(s) => [ node |
//            node.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box");
//            node.setLayoutOption(LayoutOptions::BORDER_SPACING, 2f);
//            node.setLayoutOption(LayoutOptions::SPACING, 0f);
            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);
            
            if (s.isInitial) {
                node.setParent(node.parent)
            }

            val connector = s.type == StateType::CONNECTOR;
            val cornerRadius = if (connector) 10 else if (!s.hasRegionsOrDeclarations) 17 else 8;
            val lineWidth = if (s.isInitial) 4 else 1;

            val figure = node.addRoundedRectangle(cornerRadius, cornerRadius, lineWidth)
                .background = "white".color;
                figure.lineWidth = lineWidth;
                figure.foreground = if (s.isInitial || s.isFinal) "black".color else "gray".color
                if (SHOW_SHADOW.optionBooleanValue) {
                    figure.shadow = "black".color;
//                    figure.shadow.XOffset = 4;
//                    figure.shadow.YOffset = 4;
                }
                
            (
                if (connector) figure => [
                    it.background = "black".color;
                    it.addArc => [
                        it.foreground = "white".color;
                        it.startAngle = 45;
                        it.arcAngle = 270;
                        it.lineWidth = 2;
                        it.setSurroundingSpace(0, 0.3f);
                    ];
                    node.setNodeSize(20,20);
                ] else if (s.isFinal) figure.addRoundedRectangle(cornerRadius, cornerRadius) => [
                    // re-configure the outer rounded rectangle
                    val offset = figure.lineWidthValue + if (s.isInitial) 1 else 2;
                    figure.setCornerSize(offset + cornerRadius, offset + cornerRadius)
                    figure.lineWidth = if (s.isInitial) 3 else 1;

                    // configure the inner one
                    it.background = "white".color;
                    it.styleRef = figure;
                    it.shadow = null
                    it.lineWidth = if (s.isInitial) 1 else 1;
                    it.setAreaPlacementData().from(LEFT, offset, 0, TOP, offset, 0).to(RIGHT, offset, 0, BOTTOM, offset, 0);
                ] else figure
                
             ) => [
                node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);
                //figure.setSurroundingSpace(5,0);
                it.invisible = false;

                if (connector) {
                    return;
                }

                it.setBackgroundGradient(SCCHARTSBLUE1.copy, SCCHARTSBLUE2.copy, 90);
                
                if (s.hasRegionsOrDeclarations) {
                    it.setGridPlacement(1);
                } 
                
                
                 if (s.hasRegionsOrDeclarations) {
                    // Get a smaller window-title-bare if this a macro state 
                    it.addText(" " + s.label).putToLookUpWith(s) => [
                        it.fontSize = 11;
                        it.setFontBold(true);
                        it.setGridPlacementData().setMaxCellHeightEx(40)
                            .from(LEFT, 0, 0, TOP, 0f, 0)
                            .to(RIGHT, 10, 0, BOTTOM, 0, 0);
                    ];
                 }
                 else {
                    // For simple states we want a larger area 
                    it.addText(s.label).putToLookUpWith(s) => [
                        it.fontSize = 11;
                        it.setFontBold(true);
                        it.setGridPlacementData().setMaxCellHeightEx(40)
                            .from(LEFT, 9, 0, TOP, 8f, 0)
                            .to(RIGHT, 8, 0, BOTTOM, 8, 0);
                    ];
                 }
                
                
                if (SHOW_SIGNAL_DECLARATIONS.optionBooleanValue) {
                        for (sig : s.valuedObjects) {
                    it.addRectangle => [
                        it.invisible = true;
                        scopeProvider.parent = s;
                            var declaration = "";
                            var type = "";
                            var init = "";
                            var combine = "";
                            if (sig.type != ValueType::PURE) {
                                type = sig.type.literal.toLowerCase + " "
                            }
                            if (sig.combineOperator != null && sig.combineOperator != CombineOperator::NONE) {
                                combine = " combine " + sig.combineOperator.literal.toLowerCase
                            }
                            if (sig.initialValue != null) {
                                init = " = " + serializer.serialize(sig.initialValue.copy)
                            }
                            
                            if (sig.isInput) {
                                declaration = declaration + "input ";
                            }
                            if (sig.isOutput) {
                                declaration = declaration + "output "
                            }
                            if (sig.isSignal) {
                                declaration = declaration + "signal ";
                            }
                            if (sig.isStatic) {
                                declaration = declaration + "static ";
                            }
                            if (!declaration.equals("")) {
                                declaration = declaration.trim + " "
                            }

                              it.printHighlightedText(declaration + type + sig.name + init +  combine, sig) => [
                                it.setPointPlacementData(createKPosition(LEFT, 8, 0, TOP, 0, 0), H_LEFT, V_TOP, 6, 0, 0, 0);
                              ]
//                            it.addText(declaration + type + sig.name + init +  combine + ";") => [
//                                    it.setForeground(KEYWORD.copy)
//                                    it.setFontBold(true)
//                                    it.setPointPlacementData(createKPosition(LEFT, 8, 0, TOP, 0, 0), H_LEFT, V_TOP, 6, 0, 0, 0);
//                                    it.putToLookUpWith(sig);
//                            ]
                            it.addRectangle().invisible = true;
                            ];
                        }
                        
                }
                        
                if (SHOW_STATE_ACTIONS.optionBooleanValue) {
                        scopeProvider.parent = s;
                        for (action : s.localActions) {
                            it.addRectangle => [
                                it.invisible = true;
                                val text = serializer.serialize(action.copy);
                                it.printHighlightedText(text, action)
//                                it.addText(text) => [
//                                    it.setPointPlacementData(createKPosition(LEFT, 8, 0, TOP, 0, 0), H_LEFT, V_TOP, 6, 0, 0, 0);
//                                    it.putToLookUpWith(action);
//                                ]
                                it.addRectangle().invisible = true;
                            ];
                        }
                        for (bodyText : s.bodyText) {
                            it.addRectangle => [
                                it.invisible = true;
                                val text = bodyText.text;
//                                it.printHighlightedText(text, action)
                                it.addText(text) => [
                                    it.setPointPlacementData(createKPosition(LEFT, 8, 0, TOP, 0, 0), H_LEFT, V_TOP, 6, 0, 0, 0);
                                    it.putToLookUpWith(bodyText);
                                ]
                                it.addRectangle().invisible = true;
                            ];
                        }
                }
                
                if (s.hasRegionsOrDeclarations) {
//                    it.addHorizontalLine(1, 1)
//                        .setGridPlacementData() //.from(LEFT, 0, 0, TOP, 30, 0).to(RIGHT, 0, 0, TOP, 30, 0)
//                        .maxCellHeight = 1;                        
                    
                    it.addChildArea().setGridPlacementData() => [
                        from(LEFT, 3, 0, TOP, 3, 0).to(RIGHT, 3, 0, BOTTOM, 3, 0)
                        minCellHeight = 36;
                        minCellWidth = 36;
                    ];
                }
            ];

            if (!s.hasNoRegionsWithStates) {
                    for (r : s.regions) node.children += r.translate;
            }
            
            for (t : s.outgoingTransitions) t.translateTransition();
        ];
    }
    
    def KEdge translateTransition(Transition t) {
        return t.createEdge().putToLookUpWith(t) => [ edge |
            edge.source = t.sourceState.node;
            edge.target = t.targetState.node;
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
            
            edge.addSpline(2) => [
                if (t.isImmediate || t.type == TransitionType::NORMALTERMINATION) {
                    it.lineStyle = LineStyle::CUSTOM;
                    it.lineStyle.dashPattern.clear;
                    it.lineStyle.dashPattern += TRANSITION_DASH_PATTERN;
                }
                it.addArrowDecorator() => [
                    if (t.isHistory) {
                        it.parent.addHistoryDecorator();
                        (it.placementData as KDecoratorPlacementData).absolute = -15.0f;
                    }
                ];
                // it.lineCap = LineCap::CAP_ROUND;
                switch (t.type) {
                    case TransitionType::STRONGABORT:
                        it.addStrongAbortionDecorator 
                    case TransitionType::NORMALTERMINATION:
                        it.addNormalTerminationDecorator() 
                };
            ];

            if (SHOW_LABELS.optionBooleanValue) {
                scopeProvider.parent = t.sourceState;
                var String label = serializer.serialize(t.copy)
                label = label.replace("immediate", "")
                // Override if a Label is set for a transition
                if (!t.label.nullOrEmpty) {
                    label = t.label
                }
                if (t.sourceState.outgoingTransitions.size > 1) {
                    label =  t.sourceState.outgoingTransitions.indexOf(t) + 1 + ": " + label.trim.replace("'", "");
                }
                if (!label.nullOrEmpty) {
                    t.createLabel(edge).putToLookUpWith(t).configureCenteralLabel(
                        label, 10, KlighdConstants::DEFAULT_FONT_NAME
                    ) => [
                        it.setLayoutOption(LayoutOptions.FONT_SIZE, 13) ;
                        it.KRendering.setFontBold(true)
                    ]
                }
            }
//            if (SHOW_PRIORITY_LABELS.optionBooleanValue) {
//                t.createLabel("prio", edge).putToLookUpWith(t).configureTailLabel(String::valueOf(
//                    if (t.priority != 0) t.priority else t.sourceState.outgoingTransitions.indexOf(t)
//                ), 11, KlighdConstants::DEFAULT_FONT_NAME);
//            }
        ];
    }
    
    def KRendering addStrongAbortionDecorator(KPolyline line) {
        return line.addEllipse() => [
            it.lineWidth = 1;
            it.background = "red".color
            it.setDecoratorPlacementData(10, 10, 4, 0, false);
        ];
    }
    
    def KPolygon addNormalTerminationDecorator(KPolyline line) {
        return line.drawTriangle() => [
            it.lineWidth = 1;
            it.background = "green".color
            it.setDecoratorPlacementData(11, 11, 5, 0, true);
        ];
    }
    
    def KRendering addHistoryDecorator(KContainerRendering line) {
        return line.addEllipse() => [
            it.lineWidth = 0;
            it.setForeground(DARKGRAY.copy)
            it.background = DARKGRAY.copy
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
}
