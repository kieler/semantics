/*  * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
import de.cau.cs.kieler.sccharts.Dataflow
import de.cau.cs.kieler.sccharts.Equation
import de.cau.cs.kieler.sccharts.DefineNode
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.ExitAction
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
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsSerializeExtension
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeExtension
import de.cau.cs.kieler.sccharts.LocalAction


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
    
    // a global diagram option "@BlackWhite"
    private boolean globalBWOption = false;
    private final String GLOBALBWOPTION = "BlackWhite";

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

    // -------------------------------------------------------------------------
    // Transformation options   
    // CORE TRANSFORMATIONS
    private static val SynthesisOption PAPER_BW = SynthesisOption::createCheckOption("Black/White (Paper)",
        false);
        
    private static val SynthesisOption SHOW_SIGNAL_DECLARATIONS = SynthesisOption::createCheckOption("Declarations",
        true);

    private static val SynthesisOption SHOW_STATE_ACTIONS = SynthesisOption::createCheckOption("State actions",
        true);

    private static val SynthesisOption SHOW_LABELS = SynthesisOption::createCheckOption("Transition labels",
        true);

    private static val SynthesisOption SHOW_DEPENDENCIES = SynthesisOption::createCheckOption(
        "Dependencies && optimized priorities", false);

    private static val SynthesisOption SHOW_ORDER = SynthesisOption::createCheckOption(
        "Dependencies && priorities", false);

    private static val SynthesisOption SHOW_REFERENCEEXPANSION = SynthesisOption::createCheckOption(
        "Reference Expansion", true);
        
    private static val SynthesisOption USE_ADAPTIVEZOOM = SynthesisOption::createCheckOption(
        "Adaptive Zoom", false);        

    DependencyGraph dependencyGraph = null

    private static val SynthesisOption SHOW_SHADOW = SynthesisOption::createCheckOption("Shadow", true);
    
    //new option for showing port labels
//    private static val SynthesisOption SHOW_PORT_LABELS = SynthesisOption::createCheckOption("Port labels", true)

    override public getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_SIGNAL_DECLARATIONS, SHOW_STATE_ACTIONS, SHOW_LABELS, SHOW_DEPENDENCIES, SHOW_ORDER,
            SHOW_REFERENCEEXPANSION, USE_ADAPTIVEZOOM, SHOW_SHADOW, PAPER_BW) //SHOW_PORT_LABELS);
    }

    override public getDisplayedLayoutOptions() {
        return newLinkedList(
            //new Pair<IProperty<?>, List<?>>(LayoutOptions::ALGORITHM, emptyList), //not supported by klighd
            new Pair<IProperty<?>, List<?>>(LayoutOptions::DIRECTION, Direction::values.drop(1).sortBy[it.name])
            ,new Pair<IProperty<?>, List<?>>(LayoutOptions::SPACING, newArrayList(0, 150))
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
    private static val KColor SCCHARTSRED1 = RENDERING_FACTORY.createKColor() =>
        [it.red = 253; it.green = 249; it.blue = 248];
    private static val KColor SCCHARTSRED2 = RENDERING_FACTORY.createKColor() =>
        [it.red = 243; it.green = 220; it.blue = 205];
    private static val KColor SCCHARTSGREEN1 = RENDERING_FACTORY.createKColor() =>
        [it.red = 248; it.green = 253; it.blue = 248];
    private static val KColor SCCHARTSGREEN2 = RENDERING_FACTORY.createKColor() =>
        [it.red = 180; it.green = 243; it.blue = 180];
    private static val KColor KEYWORD = RENDERING_FACTORY.createKColor() => [it.red = 115; it.green = 0; it.blue = 65];
    private static val KColor DARKGRAY = RENDERING_FACTORY.createKColor() => [it.red = 60; it.green = 60; it.blue = 60];

    private static val String ANNOTATION_LABELBREAK = "break"
    
    private static val int MINIMALNODEWIDTH = 40
    private static val int MINIMALNODEHEIGHT = 40
    private var regionCounter = 0
    private static val int PORTFONTSIZE = 10
    private static val int LABELFONTSIZE = 10
    // color for signals (same as state header color, but not used/implemented)    
    private static val KColor SIGNAL_COLOR = RENDERING_FACTORY.createKColor() => [
        it.red = 255; it.green = 231; it.blue = 214;
    ]

    // -------------------------------------------------------------------------
    // The Main entry transform function   
    override transform(Scope model) {
        usedContext.setProperty(KlighdProperties.EDGES_FIRST, true);
        
//        var transformed = model;

        // Visualization of compiled SCCharts with kico.klighd not here
        //        val transformations = KiCoSelectionView.getSelectedTransformations(KiCoSelectionView.activeEditorID);
        //        // ---------
        //        // Just one final compiler call of KielerCompiler
        //        transformed = KielerCompiler.compile(transformations, transformed, KiCoSelectionView.advancedMode) as Region
        //        // ---------
//        return transformed.translate();
		
        val timestamp = System.currentTimeMillis
        System.out.println("Started SCCharts synthesis...")
        
		val rootState = (model as State);
		
		
		// Search for global diagram options
		for (de.cau.cs.kieler.core.annotations.Annotation a : rootState.annotations) {
		    if (a.name.equals(GLOBALBWOPTION)) {
		        globalBWOption = true;
		    }
		}
		
		
        if (model instanceof Region) {
            val region = (model as Region).translate(false)
            var time = (System.currentTimeMillis - timestamp) as float
            System.out.println("SCCharts synthesis (regions) finished (time elapsed: "+(time / 1000)+"s).")
            return region
        }
        
        
		
		
        val rootNode = createNode() => [
              // ATTENTION: DO NOT use graphiz on outermost root node, this will result in suspicious layout bugs!!!
//            addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot") 
            addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES)
            children += rootState.translate
        ] 
        var time = (System.currentTimeMillis - timestamp) as float
        System.out.println("SCCharts synthesis finished (time elapsed: "+(time / 1000)+"s).")
        
        return rootNode
    }

    // -------------------------------------------------------------------------
    // Transform a region
    public def KNode translate(Region r, boolean loadLazy) {
    	regionCounter = regionCounter + 1
    	if (regionCounter % 100 == 0) System.out.print("r")
    	if (regionCounter % 2000 == 0) System.out.println("")
        val regionNode = r.createNode() => [ node |
            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot")
            node.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES)
            node.setLayoutOption(LayoutOptions::SPACING, 40f);
            if (loadLazy) {
                node.setLayoutOption(KlighdProperties::EXPAND, false);       
                     
            } else {
                for (s : r.states) {
                    node.children += s.translate;
                }
            }
            var regionLabelVar = r.label
            if (r.^for != null) {
                scopeProvider.parent = r.parentState;
                //val forCopy = r.^for.copy
                val forCopy = r.^for.valuedObject.copy
                //forCopy.annotations.clear // do not serialize copied annotations
                var String forLabel = "[" + r.^for.valuedObject.name + "=" +  r.^for.from + ".." + r.^for.to + "]"//serializer.serialize(forCopy)
                regionLabelVar = regionLabelVar + " " + forLabel
            }
            val regionLabel = regionLabelVar
//            if (r.eContainer == null) {
//                return;
//            }
            node.addRectangle() => [
                it.setAsExpandedView;
                it.setBackgroundGradient("white".color, SCCHARTSGRAY, 90);
                it.setSurroundingSpace(2, 0);
                it.invisible = false;
                it.foreground = "gray".color
                it.lineWidth = 1;
                it.addText("[-]" + if(r.label.nullOrEmpty) "" else " " + regionLabel).putToLookUpWith(r) => [
                    if (USE_ADAPTIVEZOOM.booleanValue) it.lowerVisibilityScaleBound = 0.40f;
                    it.foreground = "dimGray".color
                    it.fontSize = 10
                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                    it.suppressSelectability
                ];
                if (r.empty || !r.label.nullOrEmpty) {
//                if (!r.allContainedStates.nullOrEmpty) {
                    it.addChildArea().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
                }
            ];
            node.addRectangle() => [
                it.setAsCollapsedView;
                it.setBackgroundGradient("white".color, SCCHARTSGRAY, 90);
                it.setSurroundingSpace(4, 0);
                it.invisible = false;
                it.foreground = "gray".color
                it.lineWidth = 1;
                it.addText("[+]" + if(r.label.nullOrEmpty) "" else " " + regionLabel).putToLookUpWith(r) => [
                    if (USE_ADAPTIVEZOOM.booleanValue) it.lowerVisibilityScaleBound = 0.40f;
                    it.foreground = "dimGray".color
                    it.fontSize = 10
                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                    if (loadLazy) {
                        it.addDoubleClickAction(SCChartsReferenceExpandAction.ID);
                    } else {
                        it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                    }
                    it.suppressSelectability
                ];
                if (r.empty) {
                    it.addRectangle().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0).invisible = true;
                }
            ]
        ]
        
        if (loadLazy) {
            regionNode.suppressSelectability
        }
        regionNode.putToLookUpWith(r)
        
        return regionNode
    }

    // -------------------------------------------------------------------------
    // Helper functions
    // Returns true if the state has no regions that contain any further states.
    def boolean hasNoRegionsWithStates(State state) {
        return (state.regions == null || state.regions.size == 0 || !state.regionsNotEmpty)
    }
    
    def boolean hasNoDataflows(State state) {
    	return (state.dataflows == null || state.dataflows.size == 0)
    }

    // Tells if the state needs a macro state rendering because of regions or declarations.
    def boolean hasRegionsOrDeclarations(State state, List<ValuedObject> valuedObjectCache) {
        val returnValue = (!state.hasNoRegionsWithStates || !state.hasNoDataflows || 
            (!state.localActions.nullOrEmpty && SHOW_STATE_ACTIONS.booleanValue) ||
            (!valuedObjectCache.nullOrEmpty && SHOW_SIGNAL_DECLARATIONS.booleanValue))
        return returnValue
    }

//    // Return the action name entry.
//    def dispatch String getActionName(EntryAction action) {
//        "entry"
//    }
//
//    // Return the action name during.
//    def dispatch String getActionName(DuringAction action) {
//        "during"
//    }
//
//    // Return the action name exit.
//    def dispatch String getActionName(ExitAction action) {
//        "exit"
//    }

    // Return the action name exit.
    def dispatch String getActionName(LocalAction action) {
        // will be serialized automatically from grammar (iff not suspend action!)
        return ""
    }

    // Return the action name suspend.
    def dispatch String getActionName(SuspendAction action) {
        if (!(action as SuspendAction).weak) {
        "suspend "
        } else {
        "weak suspend "
        }
    }

    // -------------------------------------------------------------------------
    // Keyword highlighting in declarations
    // Returns true if the text is a keyword.
    def boolean isKeyword(String text) {
        return (text == "scchart") || (text == "entry") || (text == "during") || (text == "suspend") || (text == "weak") ||
            (text == "exit") || (text == "signal") || (text == "int") || (text == "bool") ||
            (text == "float") || (text == "unsigned") || (text == "immediate") || (text == "input") ||
            (text == "output") || (text == "pre") || (text == "val") || (text == "combine") || (text == "static") || 
            (text == "const") || (text == "extern")
    }

    // Get a list of words of a text String parsed by a regular expression.
    def List<String> getWords(String text) {
        text.split("\\W+")
    }

    // Print the highlighted text into a parent and link it to a lookup EObject.
    def KRectangle printHighlightedText(KRectangle parent, String text, EObject lookup) {
        if (USE_ADAPTIVEZOOM.booleanValue) parent.lowerVisibilityScaleBound = 0.5f;
        var remainingText = text
        var split = ""
        val words = text.getWords
        parent.setGridPlacement(words.length + 1)
        for (word : words) {
            val index = remainingText.indexOf(word)
            split = remainingText.substring(0, index)
            remainingText = remainingText.substring(index + word.length, remainingText.length)
            parent.addText(split + word) => [
                if (USE_ADAPTIVEZOOM.booleanValue) it.lowerVisibilityScaleBound = 0.5f;
                if (word.keyword) {
                    it.setForeground(KEYWORD.copy)
                    if (PAPER_BW.booleanValue || globalBWOption) {
                        it.setForeground("black".color)    
                    }
                    it.setFontBold(true)
                }
                it.putToLookUpWith(lookup)
                it.setGridPlacementData()
            ]
        }
        val remainingText2 = remainingText
        if (remainingText2.length > 0) {
            parent.addText(remainingText2) => [
                if (USE_ADAPTIVEZOOM.booleanValue) it.lowerVisibilityScaleBound = 0.5f;
                if (remainingText2.keyword) {
                    it.setForeground(KEYWORD.copy)
                    if (PAPER_BW.booleanValue || globalBWOption) {
                        it.setForeground("black".color)    
                    }
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
    public def KNode translate(State s) {
        if (SHOW_ORDER.booleanValue || SHOW_DEPENDENCIES.booleanValue) {
            if (dependencyGraph == null) {

                // Calculate only once
                dependencyGraph = s.getRootState.getDependencyGraph
            }
        }
        
        val valuedObjectCache = s.getAllValuedObjects

        return s.createNode().putToLookUpWith(s) => [ node |
            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.box")
            node.setLayoutOption(LayoutOptions::BORDER_SPACING, 2f);
            node.setLayoutOption(LayoutOptions::SPACING, 1f);
            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);
            if (s.isInitial) {
                node.setParent(node.parent)
            }
            val connector = s.type == StateType::CONNECTOR;
            val cornerRadius = if(connector) 7 else if(!s.hasRegionsOrDeclarations(valuedObjectCache) && !s.referencedState) 17 else 8;
            var lineWidth = if(s.isInitial) 3 else 1;
            if (PAPER_BW.booleanValue || globalBWOption) {
                lineWidth = lineWidth + 1;
            }
            val figure = node.addRoundedRectangle(cornerRadius, cornerRadius, lineWidth).background = "white".color;
            figure.lineWidth = lineWidth;
            figure.foreground = if(s.isInitial || s.isFinal || PAPER_BW.booleanValue || globalBWOption) "black".color else "gray".color
            if (!(PAPER_BW.booleanValue || globalBWOption) && SHOW_SHADOW.booleanValue && !connector) {
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
                    if (USE_ADAPTIVEZOOM.booleanValue) it.lowerVisibilityScaleBound = 0.30f;
                    // re-configure the outer rounded rectangle
                    val offset = figure.lineWidthValue + if(s.isInitial) 1 else 2;
                    figure.setCornerSize(offset + cornerRadius, offset + cornerRadius)
                    figure.lineWidth = if(s.isInitial) 3 else 1;
                    // configure the inner one
                    //                    it.background = "white".color;
                    it.styleRef = figure;
                    if (s.referencedState) 
                        it.background.alpha = 0
                    else {
                        if (!(PAPER_BW.booleanValue || globalBWOption)) {
                            it.setBackgroundGradient(SCCHARTSBLUE1.copy, SCCHARTSBLUE2.copy, 90);
                        }
                    }
                    it.shadow = null
                    it.lineWidth = if(s.isInitial) 1 else 1;
                    it.setAreaPlacementData().from(LEFT, offset, 0, TOP, offset, 0).to(RIGHT, offset, 0, BOTTOM, offset,
                        0);
                ]
            else
                figure => [
                    if (!(PAPER_BW.booleanValue || globalBWOption)) {
                        it.setBackgroundGradient(SCCHARTSBLUE1.copy, SCCHARTSBLUE2.copy, 90);
                    } else {
                        if (s.hasInnerStatesOrRegions) {
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
                        if (s.hasInnerStatesOrRegions || s.hasInnerActions) {
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
                    
                    if (s.hasNoRegionsWithStates) 
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
            if (!s.hasNoRegionsWithStates) {
                for (r : s.regions)
                    node.children += r.translate(false);
            }
            if (!s.hasNoDataflows) {
                for (d : s.dataflows)
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
                for (r : (s.referencedScope as State).regions) {
                    val synthesis = delegate.get();
                    synthesis.use(usedContext)
                    node.children += synthesis.translate(r, true)
                }
            }
            for (t : s.outgoingTransitions)
                t.translateTransition();
        ]
    }
    
    @Inject
    Provider<DelegateSCChartsDiagramSynthesis> delegate;

    // -------------------------------------------------------------------------
    // Translate a transition
    def KEdge translateTransition(Transition t) {
        return t.createEdge().putToLookUpWith(t) => [ edge |
            edge.source = t.sourceState.node;
            edge.target = t.targetState.node;
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
            if (USE_ADAPTIVEZOOM.booleanValue) edge.lowerVisibilityScaleBound = 0.11f;
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
                tCopy.annotations.clear // do not serialize copied annotations
                var label = tCopy.serialize as String
//                 label = label + tCopy.trigger.serialize as String//serializer.serialize(tCopy)

                label = label.replace("'", "")

                // break labels if they are annotated
                if (t.getAnnotation(ANNOTATION_LABELBREAK) != null) {
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
                    t.createLabel(edge).putToLookUpWith(t).configureCenterEdgeLabel(
                        " " + label,
                        11,
                        KlighdConstants::DEFAULT_FONT_NAME
                    ) => [
                        it.setLayoutOption(LayoutOptions.FONT_SIZE, 13);
                        if (USE_ADAPTIVEZOOM.booleanValue) it.lowerVisibilityScaleBound = 0.5f;
                        it.KRendering.setFontBold(true)
                    ]
                }
            }
        ]
    }

    // -------------------------------------------------------------------------
    // Different renderings for different transition types
    def KRendering addStrongAbortionDecorator(KPolyline line) {
        return line.addEllipse() => [
            it.lineWidth = 1;
            it.background = "red".color
            if (PAPER_BW.booleanValue || globalBWOption) {
                it.background = "gray".color
            }
            it.setDecoratorPlacementData(10, 10, 4, 0, false);
        ];
    }

    def KRendering addDeferredDecorator(KContainerRendering line, float offset) {
        return line.addEllipse() => [
            it.lineWidth = 1;
            it.background = "red".color
            if (PAPER_BW.booleanValue || globalBWOption) {
                it.background = "gray".color
            }
            it.setDecoratorPlacementData(10, 10, -4 + offset, 1, false);
        ];
    }

    def KPolygon addNormalTerminationDecorator(KPolyline line) {
        return line.drawTriangle() => [
            it.lineWidth = 1;
            it.background = "green".color
            if (PAPER_BW.booleanValue || globalBWOption) {
                it.background = "gray".color
            }
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


    // -------------------------------------------------------------------------
    // Transform a dataflow region
    public def dispatch KNode translate(Dataflow d, boolean loadLazy) {
        val dNode = d.createNode().putToLookUpWith(d) => [ node |
            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered")
            node.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
            node.addLayoutParam(LayoutOptions::DIRECTION, Direction::RIGHT)
            node.addLayoutParam(Properties::THOROUGHNESS, 100)
            node.addLayoutParam(Properties::NODE_PLACER, NodePlacementStrategy::BRANDES_KOEPF)
            for (n : d.nodes) {
                if (n instanceof DefineNode) {
                    //skip
                } else {
                    // translate reference/call nodes
                    node.children += n.translate;
                }
            }
            // translate all direct dataflow equations
            for (eq: d.equations) {
                val vo = eq.valuedObject
                // create output node and shape for every valued object (output variable) described
                node.children += vo.createNode(node) => [
                    it.addPolygon.createOutputNodeShape
                    it.setMinimalNodeSize(MINIMALNODEWIDTH * 1.5f, MINIMALNODEHEIGHT / 2)
                    it.addDefaultLayoutParameter
                    //add Port
                    it.addPort(vo.reference, PortSide::WEST) => [
                        it.addLayoutParam(LayoutOptions::OFFSET, -2.0f)
                    ]
                    it.createLabel(it).configureInsideTopCenteredNodeLabel(
                        vo.reference.serialize as String,
                        LABELFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                    // translate the expression which belongs to the valued object
                    val expr = eq.expression
                    node.children += expr.translate(d.equations.indexOf(eq), node, d)
                ]
            }
            node.addCollapseExpand(d.label)
        ]
        return dNode
    }

    // -------------------------------------------------------------------------
    // create collapse and expand functionality
    private def KNode addCollapseExpand(KNode n, String label) { // Dataflow d
        var regionLabelVar = label //d.label
        val regionLabel = regionLabelVar
        n.addRectangle() => [
                it.setProperty(KlighdProperties::EXPANDED_RENDERING, true);
                it.setBackgroundGradient("#fff".color, "#fff".color, 90);
                it.setSurroundingSpace(2, 0);
                it.invisible = false;
                it.foreground = "gray".color
                it.lineWidth = 1
                it.addText("[-]" + if(regionLabel.nullOrEmpty) "" else " " + regionLabel) => [
                    it.foreground = "dimGray".color
                    it.fontSize = 10
                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                ];
                if (true) {
                    it.addChildArea().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
                }
            ];
            n.addRectangle() => [
                it.setProperty(KlighdProperties::COLLAPSED_RENDERING, true);
                it.setBackgroundGradient("white".color, SCCHARTSGRAY, 90);
                it.setSurroundingSpace(2, 0) //(4, 0);
                it.invisible = false;
                it.foreground = "gray".color
                it.lineWidth = 1
                it.addText("[+]" + if(regionLabel.nullOrEmpty) "" else " " + regionLabel) => [
                    it.foreground = "dimGray".color
                    it.fontSize = 10
                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                ];
                if (true) {
                    it.addRectangle().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0).invisible = true;
                }
            ]
        return n
    }
    
    // list of commutative operators to reduce port constraints (just fixed side, not fixed order)
    val commutativeOps = newArrayList("+", "*", "&", "|", "==", "<>")
    
    private def dispatch KNode translate(Expression expr, int index, KNode parentNode, Dataflow d) {
        val nNode = expr.createNode(parentNode).putToLookUpWith(expr)
        // translate the expression according to it's type
        switch(expr) {
            OperatorExpression: {
                val op = expr.operator
                nNode.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT)
                nNode.createDefaultNodeShape
                nNode.addDefaultLayoutParameter
                // in case of a commutative operator reduce port constraint to fixed side
                if (commutativeOps.contains(op.toString)) {
                    nNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE)
                }
                nNode.createLabel(nNode).configureInsideTopCenteredNodeLabel(
                    op.toString(), LABELFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME 
                )
                // traverse all subexpressions
                expr.subExpressions.forEach[ se|
                    nNode.addPort(se, PortSide::WEST)
                    // if it's a ValuedObjectReference, it's just another variable
                    if (se instanceof ValuedObjectReference) {
                        val subVo = (se as ValuedObjectReference).valuedObject
                        val decl = (subVo.eContainer as Declaration)
                        // differ between input/output type of variable
                        if (decl.isInput) {
                            // create input node and shape
                            val inputNode = subVo.createNode(parentNode) => [
                                it.addPolygon.createInputNodeShape
                                it.addDefaultLayoutParameter
                                it.setMinimalNodeSize(MINIMALNODEWIDTH * 1.5f, MINIMALNODEHEIGHT / 2)
                                it.addPort(subVo, PortSide::EAST)
                                  .addLayoutParam(LayoutOptions::OFFSET, -2.0f)
                                it.createLabel(it).configureInsideTopCenteredNodeLabel(
                                    subVo.serialize as String,
                                    LABELFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                                // create edge
                                it.createEdge(se) => [
                                    it.source = subVo.getNode(parentNode)
                                    it.target = nNode
                                    it.sourcePort = subVo.getNode(parentNode).getPort(subVo.reference.portMap)
                                    it.targetPort = nNode.getPort(se.portMap)
                                    it.createEdgeStyle
                                ]
                            ]
                            parentNode.children += inputNode
                        } else if (decl.isOutput) {
                            // get the index of the dataflow equation which is the cource of the output 
                            var eqIndex = 0
                            for (eq: d.equations) {
                                if (eq.valuedObject.equals(subVo)) {
                                    eqIndex = d.equations.indexOf(eq)
                                }
                            }
                            // get the source node and port of the output node
                            // (should only be one incoming edge, so take this one)
                            // and create edge
                            val refVo = d.equations.get(eqIndex).valuedObject
                            nNode.createEdge(se) => [
                                it.source = refVo.getNode(parentNode).incomingEdges.get(0).source 
                                it.target = nNode
                                it.sourcePort = refVo.getNode(parentNode).incomingEdges.get(0).sourcePort
                                it.targetPort = nNode.getPort(se.portMap)
                                it.createEdgeStyle
                            ]
                        } else {
                            // the current subVo is ValuedObjectReference,
                            // but not an input or output (maybe "nothing" or both)
                            var eqIndex = 0
                            for (eq: d.equations) {
                                if (eq.valuedObject.equals(subVo)) {
                                    eqIndex = d.equations.indexOf(eq)
                                }
                            }
                            // get input node
                            val inputNode = subVo.createNode(parentNode) => [
                                it.addPolygon.createInputNodeShape
                                it.addDefaultLayoutParameter
                                it.setMinimalNodeSize(MINIMALNODEWIDTH * 1.5f, MINIMALNODEHEIGHT / 2)
                                it.addPort(subVo, PortSide::EAST)
                                  .addLayoutParam(LayoutOptions::OFFSET, -2.0f)
                                it.createLabel(it).configureInsideTopCenteredNodeLabel(
                                    subVo.serialize as String,
                                    LABELFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                                // and create edge
                                it.createEdge(se) => [
                                    it.source = subVo.getNode(parentNode)
                                    it.target = nNode
                                    it.sourcePort = subVo.getNode(parentNode).getPort(subVo.reference.portMap)
                                    it.targetPort = nNode.getPort(se.portMap)
                                    it.createEdgeStyle
                                ]
                            ]
                            parentNode.children += inputNode
                        }
                    // handle subexpressions which are not a ValuedObjectReference in else case
                    // => more subexpressions are (internally) modeled
                    } else {
                        parentNode.children += se.translate(index, parentNode, d)
                    }
                ]
                // if it's an operator expression, but there are no subexpressions
                // get the corresponding nodes and create edges
                if (expr.eContainer instanceof Equation) {
                    val vo = d.equations.get(index).valuedObject
                    nNode.addPort(vo, PortSide::EAST)
                    nNode.createEdge(parentNode) => [
                        it.source = nNode
                        it.target = vo.getNode(parentNode)
                        it.sourcePort = nNode.getPort(vo.reference.portMap)
                        it.targetPort = vo.getNode(parentNode).getPort(vo.reference.portMap)
                        it.createEdgeStyle
                    ]
                } else {
                    nNode.addPort(expr, PortSide::EAST)
                    nNode.createEdge(parentNode) => [
                        it.source = nNode
                        it.target = (expr.eContainer).getNode(parentNode)
                        it.sourcePort = nNode.getPort(expr.portMap)
                        it.targetPort = (expr.eContainer).getNode(parentNode).getPort(expr.portMap) 
                        it.createEdgeStyle
                    ]
                }
            }
            // translate constant values
            IntValue: {
                nNode.translateConstExpression(expr, parentNode)
            }
            FloatValue: {
                nNode.translateConstExpression(expr, parentNode)
            }
            BoolValue: {
                nNode.translateConstExpression(expr, parentNode)
            }
            // translate direct ValuedObjectReferences, that means the equation is of type:
            // outputVariable = inputVariable
            ValuedObjectReference: {
                // expr = ValuedObjectReference: it.valuedObject = current input
                val vo = expr.valuedObject
                val voRef = d.equations.get(index).valuedObject
                val equation = d.equations.get(index)
                // current equation (expression) is not attached to a call/reference node
                if (equation.node == null) {
                    // get the input node and create edge
                    val inputNode = vo.createNode(parentNode) => [
                        it.addPolygon.createInputNodeShape
                        it.addDefaultLayoutParameter
                        it.setMinimalNodeSize(MINIMALNODEWIDTH * 1.5f, MINIMALNODEHEIGHT / 2)
                        it.addPort(vo, PortSide::EAST)
                            .addLayoutParam(LayoutOptions::OFFSET, -2.0f)
                        it.createLabel(it).configureInsideTopCenteredNodeLabel(
                            vo.serialize as String, LABELFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                        it.createEdge(vo) => [
                            it.source = vo.getNode(parentNode)
                            it.target = voRef.getNode(parentNode)
                            it.sourcePort = vo.getNode(parentNode).getPort(vo.reference.portMap)
                            it.targetPort = voRef.getNode(parentNode).getPort(voRef.reference.portMap)
                            it.createEdgeStyle
                        ]
                    ]
                    parentNode.children += inputNode
                    return inputNode
                // current equation is attached to a call/reference node
                } else {
                    // get the corresponding call/reference node
                    val eqNode = d.equations.get(index).node
                    var KNode node = null
                    if (eqNode instanceof CallNode) {
                        node = (eqNode as CallNode).getNode()
                    } else if (eqNode instanceof ReferenceNode) {
                        node = (eqNode as ReferenceNode).getNode()
                    }
                    // correct rendering style, because nodes where already transformed, and inputs now
                    // have to get an output node shape
                    val KNode srcNode = node 
                    voRef.getNode(parentNode).KRendering.remove
                    voRef.getNode(parentNode).addPolygon.createOutputNodeShape
                    voRef.getNode(parentNode).addDefaultLayoutParameter
                    // and create edge
                    srcNode.createEdge(expr) => [
                        it.source = srcNode//.getNode()
                        it.target = voRef.getNode(parentNode)
                        it.sourcePort = srcNode.getPort(expr.valuedObject.reference.portMap)
                        it.targetPort = voRef.getNode(parentNode).getPort(voRef.reference.portMap)
                        it.createEdgeStyle
                    ]
                    // return eqNode instead of nNode, because it is not used and would create
                    // needles whitespace in klighd
                    return eqNode.node
                }
            }
            // there should be nothing missing, but just in case....
            default: {
                println("default case ...missing expr: " + expr)
            }
        }
        return nNode
    }
    
    // -------------------------------------------------------------------------
    private def dispatch KNode translate(Expression expr, int voIndex, Node callNode) {
        val nNode = expr.createNode(callNode).putToLookUpWith(expr)
        // translate the expressions the call node gets from it's define node
        switch(expr) {
            OperatorExpression: {
                val op = expr.operator
                nNode.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT)
                nNode.createDefaultNodeShape
                nNode.addDefaultLayoutParameter
                // in case of a commutative operator reduce port constraint to fixed side
                if (commutativeOps.contains(op.toString)) {
                    nNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE)
                }
                nNode.createLabel(nNode)
                     .configureInsideTopCenteredNodeLabel(op.toString(),
                                                          LABELFONTSIZE,
                                                          KlighdConstants::DEFAULT_FONT_NAME
                )
                // get the valuedObject (expression output) of the current expression
                val dNode = (callNode as CallNode).callReference as DefineNode
                val vo = dNode.valuedObjects.get(voIndex)
                
                expr.subExpressions.forEach[ se|
                    // add input ports
                    nNode.addPort(se, PortSide::WEST)
                    if (se instanceof ValuedObjectReference) {
                        //check for edges between subExpressions
                        val subVo = (se as ValuedObjectReference).valuedObject
                        if (dNode.valuedObjects.contains(subVo)) {
                            val refVo = dNode.valuedObjects.get(dNode.valuedObjects.indexOf(subVo))
                            val callExpr = dNode.expressions.get(dNode.valuedObjects.indexOf(subVo))
                            //create Edge
                            nNode.createEdge() => [
                                it.source = callExpr.getNode(callNode)
                                it.target = nNode
                                it.sourcePort = callExpr.getNode(callNode).getPort(refVo.reference.portMap)
                                it.targetPort = nNode.getPort(se.portMap)
                                it.createEdgeStyle
                            ]
                            // else: input edges!!!!
                        } else {
                            nNode.createEdge(se) => [
                                it.source = getNode(callNode)
                                it.target = nNode
                                it.sourcePort = getNode(callNode).getPort(se.portMap)
                                it.targetPort = nNode.getPort(se.portMap)
                                it.createEdgeStyle
                            ]
                        }
                    } else {
                        // recursive call to transform subExpressions
                        (callNode as CallNode).node.children += se.translate(voIndex, callNode)
                    }
                ]
                // eContainer is the define node, but not fpr subexpressions
                if (expr.eContainer instanceof DefineNode) {
                    // port for expression output, create edge
                    nNode.addPort(vo, PortSide::EAST)
                    nNode.createEdge(callNode) => [
                        it.source = nNode
                        it.target = getNode(callNode)
                        it.sourcePort = nNode.getPort(vo.reference.portMap)
                        it.targetPort = getNode(callNode).getPort(vo.reference.portMap)
                        it.createEdgeStyle
                    ]
                } else {
                    // port for another subExpression output
                    nNode.addPort(expr, PortSide::EAST)
                    // create edge
                    nNode.createEdge(callNode) => [
                        it.source = nNode
                        it.target = (expr.eContainer).getNode(callNode)
                        it.sourcePort = nNode.getPort(expr.portMap)
                        it.targetPort = (expr.eContainer).getNode(callNode).getPort(expr.portMap) 
                        it.createEdgeStyle
                    ]
                }
            }
            // translate constant values
            IntValue: {
                nNode.translateConstExpression(expr, callNode)
            }
            FloatValue: {
                nNode.translateConstExpression(expr, callNode)
            }
            BoolValue: {
                nNode.translateConstExpression(expr, callNode)
            }
            ValuedObjectReference: {
                // expr = ValuedObjectReference: it.valuedObject = current input
                val vo = expr.valuedObject
                val voRef = (callNode as CallNode).callReference.valuedObjects.get(voIndex)
                /*  add ports to dummy node (nNode) to create an edge from input to output
                 * inside(!) the call node
                 * (klighd would draw the edge around the call node, if the dummy node is not used)
                 */
                nNode.addPort(vo, PortSide::EAST, 1)
                nNode.addPort(voRef, PortSide::WEST, 1)
                // first part of the edge
                nNode.createEdge(nNode) => [
                    it.source = getNode(callNode)
                    it.target = nNode
                    it.sourcePort = getNode(callNode).getPort(vo.reference.portMap)
                    it.targetPort = nNode.getNode(callNode).getPort(vo.reference.portMap)
                    it.addRoundedBendsPolyline(4, 1) 
                ]
                // second part of the edge
                nNode.createEdge(callNode) => [
                    it.source = nNode
                    it.target = getNode(callNode)
                    it.sourcePort = nNode.getNode(callNode).getPort(voRef.reference.portMap)
                    it.targetPort = getNode(callNode).getPort(voRef.reference.portMap)
                    it.createEdgeStyle
                ]
            }
            default: {
                println("default case...missing expression: " + expr)
            }
        }
        return nNode
    }
    // translate a constant expression: just create input node an edge
    public def dispatch KNode translateConstExpression(KNode n, Expression expr, KNode parentNode) {
        n.addPolygon.createInputNodeShape
        n.setMinimalNodeSize(MINIMALNODEWIDTH * 1.5f, MINIMALNODEHEIGHT / 2)
        n.addDefaultLayoutParameter
        n.addPort(expr, PortSide::EAST) => [
            addLayoutParam(LayoutOptions::OFFSET, -2.0f)
        ]
        n.createLabel(n).configureInsideTopCenteredNodeLabel(expr.serialize as String, LABELFONTSIZE,
                                                             KlighdConstants::DEFAULT_FONT_NAME)
        
        n.createEdge(parentNode) => [
            it.source = n
            it.sourcePort = n.getPort(expr.portMap)
            // getting the target node/port depends on
            // if the eContainer is the dataflow or another operator expression
            if (expr.eContainer instanceof Equation) {
                val eq = (expr.eContainer as Equation)
                val voRef = eq.valuedObject
                it.target = voRef.getNode(parentNode)
                it.targetPort = voRef.getNode(parentNode).getPort(voRef.reference.portMap)
            } else {
                it.target = (expr.eContainer).getNode(parentNode)
                it.targetPort = (expr.eContainer).getNode(parentNode).getPort(expr.portMap)
            }
            it.createEdgeStyle
        ]
        return n
    }
    // translate a const expression: just create input node an edge
    public def dispatch KNode translateConstExpression(KNode n, Expression expr, Node callNode) {
        n.addPolygon.createInputNodeShape
        n.setMinimalNodeSize(MINIMALNODEWIDTH * 1.5f, MINIMALNODEHEIGHT / 2)
        n.addDefaultLayoutParameter
        n.addPort(expr, PortSide::EAST) => [
            addLayoutParam(LayoutOptions::OFFSET, -2.0f)
        ]
        n.createLabel(n).configureInsideTopCenteredNodeLabel(expr.serialize as String, LABELFONTSIZE,
                                                             KlighdConstants::DEFAULT_FONT_NAME)
        // there's only the call node, so there's no need to differ like before
        n.createEdge(callNode) => [
            it.source = n
            it.target = (expr.eContainer).getNode(callNode)
            it.sourcePort = n.getPort(expr.portMap)
            it.targetPort = (expr.eContainer).getNode(callNode).getPort(expr.portMap) 
            it.createEdgeStyle
        ]
        return n
    }
    
    // Transform a Node
    public def dispatch KNode translate(Node n) {
        val nNode = n.createNode().putToLookUpWith(n)
        // translate specific ReferenceNode elements
        if (n instanceof ReferenceNode) {
            nNode.setMinimalNodeSize(MINIMALNODEWIDTH * 2, MINIMALNODEHEIGHT * 1.5f)
            nNode.createDefaultNodeShape
            // create label and ports according to input/output variables of the reference
            val refNode = (n as ReferenceNode)
            val refedScope = refNode.referencedScope as State
            nNode.createLabel(nNode).configureInsideTopCenteredNodeLabel(
                if(n.label.nullOrEmpty) refedScope.id else " " + n.label,
                LABELFONTSIZE,
                KlighdConstants::DEFAULT_FONT_NAME
            )
            refedScope.declarations.filter[it.input].forEach[valuedObjects.forEach[ vo|
                nNode.addPort(vo.reference, PortSide::WEST) => [
                    it.createLabel(it).configureInsideCenteredNodeLabel(
                       vo.name, PORTFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                ]
            ]]
            refedScope.declarations.filter[it.output].forEach[valuedObjects.forEach[ vo|
                nNode.addPort(vo.reference, PortSide::EAST) => [
                    it.createLabel(it).configureInsideCenteredNodeLabel(
                       vo.name, PORTFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                ]
            ]]
            // create input nodes for call parameters
            // dNode is the dataflow KNode containing the reference node
            val dNode = refNode.eContainer.node
            val refInputs = <ValuedObject>newArrayList
            refedScope.declarations.filter[it.input].forEach[
                refInputs += valuedObjects
            ]
            val refInputSize = refInputs.size
            refNode.parameters.forEach[ p|
                if (refNode.parameters.indexOf(p) < refInputSize) {
                    // create child nodes only if the parameter count is less then
                    // the referred input count size 
                    if (p instanceof ValuedObjectReference) {
                        val param = (p as ValuedObjectReference).valuedObject 
                        dNode.children += param.createNode(dNode) => [ inNode|
                            inNode.addPolygon.createInputNodeShape
                            inNode.setMinimalNodeSize(MINIMALNODEWIDTH * 1.5f, MINIMALNODEHEIGHT / 2)
                            inNode.addDefaultLayoutParameter
                            inNode.addPort(param.reference, PortSide::EAST) => [
                                it.addLayoutParam(LayoutOptions::OFFSET, -2.0f)
                            ]
                            inNode.createLabel(inNode).configureInsideTopCenteredNodeLabel(param.serialize as String,
                                LABELFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                            //create Edge
                            inNode.createEdge(refNode) => [
                                it.source = inNode
                                it.target = nNode
                                it.sourcePort = inNode.getPort(param.reference.portMap)
                                it.targetPort = nNode.ports.get(refNode.parameters.indexOf(p))
                                it.createEdgeStyle
                            ]
                        ]
                    }
                }
            ]
        // translate specific CallNode elements
        } else if (n instanceof CallNode) {
            val call = n as CallNode
            val refID = call.callReference.id
            nNode.setMinimalNodeSize(MINIMALNODEWIDTH * 2, MINIMALNODEHEIGHT * 2)
            nNode.createCallNodeShape(refID)
            
            //set up orthogonal edge routing inside call nodes
            nNode.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
            
            if (call.callReference instanceof DefineNode) {
                val ref = call.callReference as DefineNode
                // add ChildNodes for called Reference
                for (expr : ref.expressions) {
                    val index = ref.expressions.indexOf(expr)
                    nNode.children +=  expr.translate(index, call)
                }
                //create input and output ports for callReference
                ref.inputs.forEach[valuedObjects.forEach[ vo|
                    nNode.addPort(vo.reference, PortSide::WEST) => [
                        it.addLayoutParam(LayoutOptions::OFFSET, -3.0f)
                        it.createLabel(it).configureInsideCenteredNodeLabel(
                            vo.reference.serialize as String,
                            PORTFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                    ]
                ]]
                ref.outputs.forEach[valuedObjects.forEach[ vo|
                    nNode.addPort(vo.reference, PortSide::EAST) => [
                        it.addLayoutParam(LayoutOptions::OFFSET, -3.0f)
                        it.createLabel(it).configureInsideCenteredNodeLabel(
                            vo.reference.serialize as String,
                            PORTFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                    ]
                ]]
                // translate states if control flow is defined instead of dataflow
                if (!ref.states.nullOrEmpty) {
                    // use delegate method so if the define node is called more then once,
                    // all elements where displayed another time (instead of only reference the old ones)
                    val synthesis = delegate.get()
                    synthesis.use(usedContext)
                    for (s: ref.states) {
                        // translate states using the already existing method
                        nNode.children += synthesis.translate(s)
                    }
                }
            }
            
            // create input nodes for call parameters
            val dNode = call.eContainer.node
            val refInputs = <ValuedObject>newArrayList
            val callRef = call.callReference as DefineNode
            callRef.inputs.forEach[
                refInputs += valuedObjects
            ]
            val refInputSize = refInputs.size
            call.parameters.forEach[ p|
                if (call.parameters.indexOf(p) < refInputSize) {
                    /* add child nodes and edges if not already craeted
                     * only if the index of the parameter 
                     * is less then the number of inputs of the define node 
                     */
                    if (p instanceof ValuedObjectReference) {
                        val param = (p as ValuedObjectReference).valuedObject 
                        dNode.children += param.createNode(dNode) => [ inNode|
                            inNode.addPolygon.createInputNodeShape
                            inNode.setMinimalNodeSize(MINIMALNODEWIDTH * 1.5f, MINIMALNODEHEIGHT / 2)
                            inNode.addDefaultLayoutParameter
                            inNode.addPort(param.reference, PortSide::EAST) => [
                                it.addLayoutParam(LayoutOptions::OFFSET, -2.0f)
                            ]
                            inNode.createLabel(inNode).configureInsideTopCenteredNodeLabel(param.serialize as String,
                                LABELFONTSIZE, KlighdConstants::DEFAULT_FONT_NAME)
                            //create Edge
                            inNode.createEdge(call) => [
                                it.source = inNode
                                it.target = nNode
                                it.sourcePort = inNode.getPort(param.reference.portMap)
                                it.targetPort = nNode.ports.get(call.parameters.indexOf(p))
                                it.createEdgeStyle
                            ]
                        ]
                    }
                }
            ]
            // set call nodes to initially collapsed
            nNode.initiallyCollapse
            if (SHOW_SHADOW.booleanValue) {
                nNode.KRendering.shadow = "black".color;
                nNode.KRendering.shadow.XOffset = 4;
                nNode.KRendering.shadow.YOffset = 4;
            }
        }
         // the "default" else, in case something is missing
        else {
            nNode.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT)
            nNode.createDefaultNodeShape
            nNode.createLabel(nNode).configureInsideTopCenteredNodeLabel(
                if(n.label.nullOrEmpty) "" else " " + n.label,
                LABELFONTSIZE,
                KlighdConstants::DEFAULT_FONT_NAME
            )
        }
        // set up some default layout parameters
        nNode.addDefaultLayoutParameter
        return nNode
    }
    
    // -------------------------------------------------------------------------
    // -- Helper: Ports 
    // -------------------------------------------------------------------------
    def KPort addPort(KNode node, String text, float x, float y, int size, PortSide side) {
        node.createPort() => [
            it.addLayoutParam(LayoutOptions::PORT_SIDE, side);
            it.setPortSize(size, size)
            node.ports += it
        ]
    }
        
    def KPort addPort(KNode node, Expression expression, float x, float y, int size, PortSide side) {
    	var text = ""
    	var Object obj = null
    	if (expression instanceof ValuedObjectReference) {
    		text = (expression as ValuedObjectReference).valuedObject.name
    		obj = (expression as ValuedObjectReference).valuedObject
        } else {
    		text = expression.serialize as String
    		obj = expression
  		}
        node.createPort(obj) => [
            it.addLayoutParam(LayoutOptions::PORT_SIDE, side);
            it.setPortSize(size, size)
            node.ports += it
        ]    
    }    

    def KPort addPort(KNode node, Expression expression, PortSide side) {
    	node.addPort(expression, 0, 0, 2, side) => [
    	]
    }
    // new helper for valuedObject instead of Expression
    def KPort addPort(KNode node, ValuedObject vo, PortSide side) {
        node.createPort(vo) => [
            it.addLayoutParam(LayoutOptions::PORT_SIDE, side)
            it.setPortSize(2, 2)
            node.ports += it
        ]
    }
    def KPort addPort(KNode node, ValuedObject vo, PortSide side, int size) {
        node.createPort(vo) => [
            it.addLayoutParam(LayoutOptions::PORT_SIDE, side)
            it.setPortSize(size, size)
            node.ports += it
        ]
    }
    def KPort addPort(KNode node, Expression expr, PortSide side, int size) {
        node.createPort(expr) => [
            it.addLayoutParam(LayoutOptions::PORT_SIDE, side)
            it.setPortSize(size, size)
            node.ports += it
        ]
    }
    
    def Object portMap(Expression expression) {
		var Object obj = null
  		if (expression instanceof ValuedObjectReference) {
    		obj = (expression as ValuedObjectReference).valuedObject
        } else {
    		obj = expression
  		}
  		obj
	}
	/*
	 * some helper methods for node shapes and layout
	 */
	private def KNode createDefaultNodeShape(KNode n) {
        n.addRoundedRectangle(3, 3) => [
            it.setBackgroundGradient("#ff8".color, "#ff8".color, 90)
            it.setSurroundingSpace(0, 0)
            it.invisible = false
            it.foreground = "black".color
            it.lineWidth = 1
        ]
        return n
    }
    private def KNode createCallNodeShape(KNode n, String label){
        n.addRoundedRectangle(3, 3) => [
            it.setProperty(KlighdProperties::EXPANDED_RENDERING, true)
            it.setBackgroundGradient("#fff".color, "#fff".color, 90)
            it.setSurroundingSpace(2, 0)
            it.invisible = false
            it.foreground = "black".color
            it.lineWidth = 1
            it.addText("[-] " + label) => [
                it.foreground = "dimGray".color
                it.fontSize = 10
                it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
            ]
            if (true) {
               it.addChildArea().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
            }
        ]
        n.addDefaultLayoutParameter
        n.addRoundedRectangle(3, 3) => [
            it.setProperty(KlighdProperties::COLLAPSED_RENDERING, true)
            it.setBackgroundGradient("white".color, SCCHARTSGRAY, 90)
            it.setSurroundingSpace(2, 0)
            it.invisible = false
            it.lineWidth = 1
            it.addText("[+] " + label) => [
                it.foreground = "dimGray".color
                it.fontSize = 10
                it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
            ];
            if (true) {
                it.addRectangle().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0).invisible = true;
            }
        ]
        n.addDefaultLayoutParameter
        return n
    }
    
    private def KNode addDefaultLayoutParameter(KNode n) {
        n.addLayoutParam(LayoutOptions::NODE_LABEL_PLACEMENT, NodeLabelPlacement::insideTopCenter)
        n.addLayoutParam(LayoutOptions::PORT_LABEL_PLACEMENT, PortLabelPlacement::INSIDE)
        n.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER);
        
        // add shadow if option is checked
        if (SHOW_SHADOW.booleanValue) {
            n.KRendering.shadow = "black".color;
            n.KRendering.shadow.XOffset = 4;
            n.KRendering.shadow.YOffset = 4;
        }
        return n
    }
    
    def KPolygon createInputNodeShape(KPolygon poly) {
        poly => [
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0.0f);
            it.points += createKPosition(LEFT,  0, 0.75f, TOP,  0, 0.0f);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 0.5f);
            it.points += createKPosition(LEFT,  0, 0.75f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0.0f);
            it.background = "white".color
        ];
    }  

    def KPolygon createOutputNodeShape(KPolygon poly) {
        poly => [
            it.points += createKPosition(LEFT,  0, 0.25f, TOP,  0, 0);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 0);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.25f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0.5f);
            it.points += createKPosition(LEFT,  0, 0.25f, TOP,  0, 0);
            it.background = "white".color
        ];
    }
    // Edgestyle
    def KEdge createEdgeStyle(KEdge edge) {
        edge.addRoundedBendsPolyline(4, 1) => [
            it.addArrowDecorator
            it.addJunctionPointDecorator
        ]
        return edge
    }
}

@ViewSynthesisShared
class DelegateSCChartsDiagramSynthesis extends SCChartsDiagramSynthesis {

}
