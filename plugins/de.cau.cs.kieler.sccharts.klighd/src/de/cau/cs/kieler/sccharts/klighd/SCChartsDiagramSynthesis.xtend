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
import de.cau.cs.kieler.core.util.Pair
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.microlayout.PlacementUtil
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.StateType
import de.cau.cs.kieler.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.s.DataDependency
import de.cau.cs.kieler.sccharts.s.DependencyGraph
import de.cau.cs.kieler.sccharts.s.DependencyTransformation
import de.cau.cs.kieler.sccharts.text.actions.ActionsStandaloneSetup
import de.cau.cs.kieler.sccharts.text.actions.scoping.ActionsScopeProvider
import java.util.List
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.serializer.ISerializer

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * KLighD visualization for KIELER SCCharts (Sequentially Constructive Charts).
 * 
 * @author cmot ssm
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
class SCChartsDiagramSynthesis extends AbstractDiagramSynthesis<Region> {

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

    // -------------------------------------------------------------------------
    // Transformation options   
    private static val SynthesisOption SHOW_SIGNAL_DECLARATIONS = SynthesisOption::
        createCheckOption("Declarations", true);

    private static val SynthesisOption SHOW_STATE_ACTIONS = SynthesisOption::createCheckOption("State actions",
        true);

    private static val SynthesisOption SHOW_LABELS = SynthesisOption::createCheckOption("Transition labels",
        true);

    private static val SynthesisOption SHOW_DEPENDENCIES = SynthesisOption::createCheckOption(
        "Dependencies && optimized priorities", false);

    private static val SynthesisOption SHOW_ORDER = SynthesisOption::createCheckOption(
        "Dependencies && priorities", false);

    DependencyGraph dependencyGraph = null

    private static val SynthesisOption SHOW_SHADOW = SynthesisOption::createCheckOption("Shadow", true);

    override public getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_SIGNAL_DECLARATIONS, SHOW_STATE_ACTIONS, SHOW_LABELS, SHOW_DEPENDENCIES, SHOW_ORDER,
            SHOW_SHADOW);
    }

    override public getDisplayedLayoutOptions() {
        return newLinkedList(
            new Pair<IProperty<?>, List<?>>(LayoutOptions::ALGORITHM, emptyList),
            new Pair<IProperty<?>, List<?>>(LayoutOptions::DIRECTION, Direction::values.drop(1).sortBy[it.name]), 
            new Pair<IProperty<?>, List<?>>(LayoutOptions::SPACING, newArrayList(0, 50))
        );
    }

    // -------------------------------------------------------------------------
    // Some color and pattern constants
    private static val float TRANSITION_DASH_BLACK = 7;
    private static val float TRANSITION_DASH_WHITE = 3;
    private static val List<Float> TRANSITION_DASH_PATTERN = newArrayList(TRANSITION_DASH_BLACK, TRANSITION_DASH_WHITE);
    private static val KColor SCCHARTSGRAY = RENDERING_FACTORY.createKColor() =>
        [it.red = 240; it.green = 240; it.blue = 240];
    private static val KColor SCCHARTSBLUE1 = RENDERING_FACTORY.createKColor() =>
        [it.red = 248; it.green = 249; it.blue = 253];
    private static val KColor SCCHARTSBLUE2 = RENDERING_FACTORY.createKColor() =>
        [it.red = 205; it.green = 220; it.blue = 243];
    private static val KColor KEYWORD = RENDERING_FACTORY.createKColor() => [it.red = 115; it.green = 0; it.blue = 65];
    private static val KColor DARKGRAY = RENDERING_FACTORY.createKColor() => [it.red = 60; it.green = 60; it.blue = 60];
    
    private static val String ANNOTATION_LABELBREAK = "break"

    // -------------------------------------------------------------------------
    // The Main entry transform function   
    override transform(Region model) {
        return model.translate();
    }

    // -------------------------------------------------------------------------
    // Transform a region
    def dispatch KNode translate(Region r) {
        return r.createNode().putToLookUpWith(r) => [ node |
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
                it.setSurroundingSpace(2, 0);
                it.invisible = false;
                it.foreground = "gray".color
                it.lineWidth = 1;
                it.addText("[-]" + if(r.label.nullOrEmpty) "" else " " + r.label).putToLookUpWith(r) => [
                    it.foreground = "gray".color
                    it.fontSize = 8
                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                ];
                if (!r.allContainedStates.nullOrEmpty) {
                    it.addChildArea().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
                }
            ];
            node.addRectangle() => [
                it.setProperty(KlighdProperties::COLLAPSED_RENDERING, true);
                it.setBackgroundGradient("white".color, SCCHARTSGRAY, 90);
                it.setSurroundingSpace(4, 0);
                it.invisible = false;
                it.foreground = "gray".color
                it.lineWidth = 1;
                it.addText("[+]" + if(r.label.nullOrEmpty) "" else " " + r.label).putToLookUpWith(r) => [
                    it.foreground = "gray".color
                    it.fontSize = 8
                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                ];
                if (!r.allContainedStates.nullOrEmpty) {
                    it.addRectangle().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0).invisible = true;
                }
            ]
        ];
    }

    // -------------------------------------------------------------------------
    // Helper functions
    // Returns true if the state has no regions that contain any further states.
    def boolean hasNoRegionsWithStates(State state) {
        return (state.regions == null || state.regions.size == 0 || state.eAllContents.filter(typeof(State)).size == 0)
    }

    // Tells if the state needs a macro state rendering because of regions or declarations.
    def boolean hasRegionsOrDeclarations(State state) {
        val returnValue = (!state.hasNoRegionsWithStates ||
            (!state.localActions.nullOrEmpty && SHOW_STATE_ACTIONS.booleanValue) ||
            (!state.valuedObjects.nullOrEmpty && SHOW_SIGNAL_DECLARATIONS.booleanValue))
        return returnValue
    }

    // Return the action name entry.
    def dispatch String getActionName(EntryAction action) {
        "entry"
    }

    // Return the action name during.
    def dispatch String getActionName(DuringAction action) {
        "during"
    }

    // Return the action name exit.
    def dispatch String getActionName(ExitAction action) {
        "exit"
    }

    // Return the action name suspend.
    def dispatch String getActionName(SuspendAction action) {
        "suspend"
    }

    // -------------------------------------------------------------------------
    // Keyword highlighting in declarations
    // Returns true if the text is a keyword.
    def boolean isKeyword(String text) {
        return (text == "scchart") || (text == "entry") || (text == "during") || (text == "suspend") || (text == "weak") ||
            (text == "exit") || (text == "signal") || (text == "int") || (text == "bool") ||
            (text == "float") || (text == "unsigned") || (text == "immediate") || (text == "input") ||
            (text == "output") || (text == "pre") || (text == "val") || (text == "combine") || (text == "static")
    }

    // Get a list of words of a text String parsed by a regular expression.
    def List<String> getWords(String text) {
        text.split("\\W+")
    }

    // Print the highlighted text into a parent and link it to a lookup EObject.
    def KRectangle printHighlightedText(KRectangle parent, String text, EObject lookup) {
        var remainingText = text
        var split = ""
        val words = text.getWords
        parent.setGridPlacement(words.length + 1)
        for (word : words) {
            val index = remainingText.indexOf(word)
            split = remainingText.substring(0, index)
            remainingText = remainingText.substring(index + word.length, remainingText.length)
            parent.addText(split + word) => [
                if (word.keyword) {
                    it.setForeground(KEYWORD.copy)
                    it.setFontBold(true)
                }
                it.putToLookUpWith(lookup)
                it.setGridPlacementData()
            ]
        }
        val remainingText2 = remainingText
        if (remainingText2.length > 0) {
            parent.addText(remainingText2) => [
                if (remainingText2.keyword) {
                    it.setForeground(KEYWORD.copy)
                    it.setFontBold(true)
                }
                it.putToLookUpWith(lookup)
                it.setGridPlacementData()
            ]
        }
         parent
    }

    // -------------------------------------------------------------------------
    // Transform a state    
    def dispatch KNode translate(State s) {
        if (SHOW_ORDER.booleanValue || SHOW_DEPENDENCIES.booleanValue) {
            if (dependencyGraph == null) {

                // Calculate only once
                dependencyGraph = s.rootRegion.getDependencyGraph
            }
        }

        return s.createNode().putToLookUpWith(s) => [ node |
            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);
            if (s.isInitial) {
                node.setParent(node.parent)
            }
            val connector = s.type == StateType::CONNECTOR;
            val cornerRadius = if(connector) 7 else if(!s.hasRegionsOrDeclarations) 17 else 8;
            val lineWidth = if(s.isInitial) 3 else 1;
            val figure = node.addRoundedRectangle(cornerRadius, cornerRadius, lineWidth).background = "white".color;
            figure.lineWidth = lineWidth;
            figure.foreground = if(s.isInitial || s.isFinal) "black".color else "gray".color
            if (SHOW_SHADOW.booleanValue && !connector) {
                figure.shadow = "black".color;
                figure.shadow.XOffset = 4;
                figure.shadow.YOffset = 4;
            }
            (
                if (connector)
                figure => [
                    it.background = "black".color
                    figure.lineWidth = 3
                    it.foreground = "white".color
//                    it.addArc => [
//                        it.foreground = "white".color;
//                        it.startAngle = 45;
//                        it.arcAngle = 270;
//                        it.lineWidth = 2;
//                        it.setSurroundingSpace(0, 0.3f);
//                    ];
                    node.setNodeSize(7, 7);
                ]
            else if (s.isFinal)
                figure.addRoundedRectangle(cornerRadius, cornerRadius) => [
                    // re-configure the outer rounded rectangle
                    val offset = figure.lineWidthValue + if(s.isInitial) 1 else 2;
                    figure.setCornerSize(offset + cornerRadius, offset + cornerRadius)
                    figure.lineWidth = if(s.isInitial) 3 else 1;
                    // configure the inner one
                    it.background = "white".color;
                    it.styleRef = figure;
                    it.shadow = null
                    it.lineWidth = if(s.isInitial) 1 else 1;
                    it.setAreaPlacementData().from(LEFT, offset, 0, TOP, offset, 0).to(RIGHT, offset, 0, BOTTOM, offset,
                        0);
                ]
            else
                figure
                
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
                var priority = ""
                if (SHOW_ORDER.booleanValue || SHOW_DEPENDENCIES.booleanValue) {
                    if (!dependencyGraph.dependencyNodes.filter(e|e.getState == s && !e.getIsJoin).nullOrEmpty) {
                        val dependencyNode = dependencyGraph.dependencyNodes.filter(e|e.getState == s && !e.getIsJoin).
                            get(0)
                        priority = if (SHOW_DEPENDENCIES.booleanValue)
                            dependencyNode.getPriority + ""
                        else
                            (dependencyNode.getOrder) + ""
                        if (s.hierarchical) {
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
                if (s.hasRegionsOrDeclarations) {

                    // Get a smaller window-title-bare if this a macro state 
                    if (!s.label.empty)
                        it.addRectangle => [
                            it.invisible = true
                            it.fontSize = 11;
                            it.fontSize.propagateToChildren = true
                            it.setFontBold(true);
                            it.setGridPlacementData().from(LEFT, 0, 0, TOP, 8f, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
                            val ktext = it.addText("   " + s.label + prioritySpace + " ").putToLookUpWith(s) => [
                                it.fontSize = 11;
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

                    // For simple states we want a larger area 
                    val ktext = it.addText(" " + s.label + prioritySpace).putToLookUpWith(s) => [
                        it.fontSize = 11;
                        it.setFontBold(true);
                        it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
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
                    for (sig : s.valuedObjects) {
                        it.addRectangle => [
                            it.invisible = true;
                            it.addRectangle => [
                                it.invisible = true;
                                it.setPointPlacementData(createKPosition(LEFT, 8, 0, TOP, 0, 0), H_LEFT, V_TOP, 8, 0, 0, 0);
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
                                it.printHighlightedText(declaration + type + sig.name + init + combine, sig)
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
                                it.invisible = true;
                                it.setPointPlacementData(createKPosition(LEFT, 8, 0, TOP, 0, 0), H_LEFT, V_TOP, 8, 0, 0, 0);
                                var text = serializer.serialize(action.copy);
                                text = text.replace("'", "")
                                if (text.length > 1 && text.substring(text.length - 1, text.length).equals(";")) {
                                    text = text.substring(0, text.length - 1)
                                }
                                it.printHighlightedText(text, action)
                            ]
                            //it.addRectangle().invisible = true;
                        ];
                    }
                    for (bodyText : s.bodyText) {
                        it.addRectangle => [
                            it.invisible = true;
                            val text = bodyText.text;
                            it.addText(text) => [
                                it.setPointPlacementData(createKPosition(LEFT, 8, 0, TOP, 0, 0), H_LEFT, V_TOP, 6, 0, 0,
                                    0);
                                it.putToLookUpWith(bodyText);
                            ]
                            it.addRectangle().invisible = true;
                        ];
                    }
                }
                if (s.hasRegionsOrDeclarations) {
                    it.addChildArea().setGridPlacementData() => [
                        from(LEFT, 3, 0, TOP, 3, 0).to(RIGHT, 3, 0, BOTTOM, 3, 0)
                        minCellHeight = 5;
                        minCellWidth = 5;
                    ];
                }
            ];
            if (!s.hasNoRegionsWithStates) {
                for (r : s.regions)
                    node.children += r.translate;
            }
            for (t : s.outgoingTransitions)
                t.translateTransition();
        ];
    }

    // -------------------------------------------------------------------------
    // Translate a transition
    def KEdge translateTransition(Transition t) {
        return t.createEdge().putToLookUpWith(t) => [ edge |
            edge.source = t.sourceState.node;
            edge.target = t.targetState.node;
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
            edge.addSpline(2) => [
                // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                if (t.isImmediate2) {
                    it.lineStyle = LineStyle::CUSTOM;
                    it.lineStyle.dashPattern.clear;
                    it.lineStyle.dashPattern += TRANSITION_DASH_PATTERN;
                }
                it.addArrowDecorator() => [
                    var offset = 0
                    if (t.history == HistoryType::SHALLOW) {
                        it.parent.addShallowHistoryDecorator();
                        (it.placementData as KDecoratorPlacementData).absolute = -17.0f;
                        offset = -15
                    }
                    if (t.history == HistoryType::DEEP) {
                        it.parent.addDeepHistoryDecorator();
                        (it.placementData as KDecoratorPlacementData).absolute = -17.0f;
                        offset = -15
                    }
                    if (t.deferred) {
                        it.parent.addDeferredDecorator(offset);
                        (it.placementData as KDecoratorPlacementData).absolute = -11.0f + offset;
                    } 
                ];
                // it.lineCap = LineCap::CAP_ROUND;
                switch (t.type) {
                    case TransitionType::STRONGABORT:
                        it.addStrongAbortionDecorator
                    case TransitionType::TERMINATION:
                        it.addNormalTerminationDecorator()
                };
            ];
            if (SHOW_LABELS.booleanValue) {
                scopeProvider.parent = t.sourceState;
                // For serialization set these flags to false to ommit them in the transition label
                val tCopy = t.copy
                tCopy.setDeferred(false)
                tCopy.setHistory(HistoryType::RESET)
                tCopy.setImmediate(false)
                tCopy.annotations.clear                           // do not serialize copied annotations
                var String label = serializer.serialize(tCopy)
                label = label.replace("'", "")
                // break labels if they are annotated
                if (t.getAnnotation(ANNOTATION_LABELBREAK)!=null) {
                    label = label.replace(";", ";\n")
                }

                // Override if a Label is set for a transition
                if (!t.label.nullOrEmpty) {
                    label = t.label
                }
                if (t.sourceState.outgoingTransitions.size > 1) {
                    label = t.sourceState.outgoingTransitions.indexOf(t) + 1 + ": " + label.trim.replace("'", "");
                }
                if (!label.nullOrEmpty) {
                    t.createLabel(edge).putToLookUpWith(t).configureCenteralLabel(
                        " " + label,
                        11,
                        KlighdConstants::DEFAULT_FONT_NAME
                    ) => [
                        it.setLayoutOption(LayoutOptions.FONT_SIZE, 13);
                        it.KRendering.setFontBold(true)
                    ]
                }
            }
        ];
    }

    // -------------------------------------------------------------------------
    // Different renderings for different transition types
    def KRendering addStrongAbortionDecorator(KPolyline line) {
        return line.addEllipse() => [
            it.lineWidth = 1;
            it.background = "red".color
            it.setDecoratorPlacementData(10, 10, 4, 0, false);
        ];
    }

    def KRendering addDeferredDecorator(KContainerRendering line, float offset) {
        return line.addEllipse() => [
            it.lineWidth = 1;
            it.background = "red".color
            it.setDecoratorPlacementData(10, 10, -4 + offset, 1, false);
        ];
    }

    def KPolygon addNormalTerminationDecorator(KPolyline line) {
        return line.drawTriangle() => [
            it.lineWidth = 1;
            it.background = "green".color
            it.setDecoratorPlacementData(11, 11, 5, 0, true);
        ];
    }

    def KRendering addShallowHistoryDecorator(KContainerRendering line) {
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

    def KRendering addDeepHistoryDecorator(KContainerRendering line) {
        return line.addEllipse() => [
            it.lineWidth = 0;
            it.setForeground(DARKGRAY.copy)
            it.background = DARKGRAY.copy
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

// -------------------------------------------------------------------------
}
