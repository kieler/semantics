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
import de.cau.cs.kieler.core.kexpressions.CombineOperator
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
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
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
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
import javax.inject.Provider
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.serializer.ISerializer

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.Dataflow
import de.cau.cs.kieler.sccharts.Node
import de.cau.cs.kieler.kiml.options.PortConstraints
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.sccharts.InputNode
import de.cau.cs.kieler.kiml.options.NodeLabelPlacement
import de.cau.cs.kieler.kiml.options.PortLabelPlacement
import de.cau.cs.kieler.sccharts.OutputNode
import de.cau.cs.kieler.sccharts.ReferencedNode
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.sccharts.Sender
import de.cau.cs.kieler.sccharts.Receiver

import de.cau.cs.kieler.klay.layered.p4nodes.NodePlacementStrategy
import de.cau.cs.kieler.klay.layered.properties.LayerConstraint
import de.cau.cs.kieler.klay.layered.properties.Properties
//import de.cau.cs.kieler.klay.layered.properties.Properties
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import javax.imageio.ImageIO
import org.eclipse.core.internal.resources.File
import org.eclipse.core.runtime.URIUtil
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsSerializeExtension
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeExtension
import de.cau.cs.kieler.sccharts.TestReferenceNode
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.sccharts.CallNode
import de.cau.cs.kieler.sccharts.DefineNode
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.FloatValue
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.sccharts.DataflowFeature

/**
 * KLighD visualization for KIELER SCCharts (Sequentially Constructive Charts).
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
    private static val SynthesisOption SHOW_PORT_LABELS = SynthesisOption::createCheckOption("Port labels", true)

    override public getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_SIGNAL_DECLARATIONS, SHOW_STATE_ACTIONS, SHOW_LABELS, SHOW_DEPENDENCIES, SHOW_ORDER,
            SHOW_REFERENCEEXPANSION, USE_ADAPTIVEZOOM, SHOW_SHADOW, PAPER_BW, SHOW_PORT_LABELS);
    }

    override public getDisplayedLayoutOptions() {
        return newLinkedList(
            //new Pair<IProperty<?>, List<?>>(LayoutOptions::ALGORITHM, emptyList), //not supported by klighd
            new Pair<IProperty<?>, List<?>>(LayoutOptions::DIRECTION, Direction::values.drop(1).sortBy[it.name]),
            new Pair<IProperty<?>, List<?>>(LayoutOptions::SPACING, newArrayList(0, 150))
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

    // -------------------------------------------------------------------------
    // The Main entry transform function   
    override transform(Scope model) {
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
            children += (model as State).translate
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
                    if (PAPER_BW.booleanValue) {
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
                    if (PAPER_BW.booleanValue) {
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
            node.setLayoutOption(LayoutOptions::EXPAND_NODES, true);
            if (s.isInitial) {
                node.setParent(node.parent)
            }
            val connector = s.type == StateType::CONNECTOR;
            val cornerRadius = if(connector) 7 else if(!s.hasRegionsOrDeclarations(valuedObjectCache) && !s.referencedState) 17 else 8;
            var lineWidth = if(s.isInitial) 3 else 1;
            if (PAPER_BW.booleanValue) {
                lineWidth = lineWidth + 1;
            }
            val figure = node.addRoundedRectangle(cornerRadius, cornerRadius, lineWidth).background = "white".color;
            figure.lineWidth = lineWidth;
            figure.foreground = if(s.isInitial || s.isFinal || PAPER_BW.booleanValue) "black".color else "gray".color
            if (!PAPER_BW.booleanValue && SHOW_SHADOW.booleanValue && !connector) {
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
                        if (!PAPER_BW.booleanValue) {
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
                    if (!PAPER_BW.booleanValue) {
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
                        if (PAPER_BW.booleanValue) {
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
                if (!PAPER_BW.booleanValue) {
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
            if (PAPER_BW.booleanValue) {
                it.background = "gray".color
            }
            it.setDecoratorPlacementData(10, 10, 4, 0, false);
        ];
    }

    def KRendering addDeferredDecorator(KContainerRendering line, float offset) {
        return line.addEllipse() => [
            it.lineWidth = 1;
            it.background = "red".color
            if (PAPER_BW.booleanValue) {
                it.background = "gray".color
            }
            it.setDecoratorPlacementData(10, 10, -4 + offset, 1, false);
        ];
    }

    def KPolygon addNormalTerminationDecorator(KPolyline line) {
        return line.drawTriangle() => [
            it.lineWidth = 1;
            it.background = "green".color
            if (PAPER_BW.booleanValue) {
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
    // Transform a region
    public def dispatch KNode translate(Dataflow d, boolean loadLazy) {
        val dNode = d.createNode().putToLookUpWith(d) => [ node |
            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered")
            node.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
            node.addLayoutParam(LayoutOptions::DIRECTION, Direction::RIGHT)
            node.addLayoutParam(Properties::THOROUGHNESS, 100)
            node.addLayoutParam(Properties::NODE_PLACER, NodePlacementStrategy::BRANDES_KOEPF)
            
            val senders = <Sender> newArrayList
            
            for (n : d.nodes) {
                if (n instanceof DefineNode) {
                    //skip
                } else {
                    // translate input/output/reference/testReference/call nodes
                    node.children += n.translate;
                    senders += n.senders
                }
            }
//            for (v: d.valuedObjects) {
//                //create node for valuedObject (output)
//                node.children += v.createNode(node) => [
//                    it.addPolygon.createOutputNodeShape
//                    it.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT / 3)
//                    it.addDefaultLayoutParameter
//                    //add port
//                    it.addPort(v.reference, PortSide::WEST) => [
//                        it.addLayoutParam(LayoutOptions::OFFSET, -2.0f)
//                    ]
//                    it.createLabel(it).configureInsideCenteredNodeLabel(
//                        v.reference.serialize as String, 6, KlighdConstants::DEFAULT_FONT_NAME)
//                    // translate expression
//                    val expr = d.expressions.get(d.valuedObjects.indexOf(v))
//                    node.children += expr.translate(d.valuedObjects.indexOf(v), node, d)
//                ]
//            }
            
            for (f: d.features) {
                val vo = f.valuedObject
                node.children += vo.createNode(node) => [
                    it.addPolygon.createOutputNodeShape
                    it.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT / 3)
                    it.addDefaultLayoutParameter
                    //add Port
                    it.addPort(vo.reference, PortSide::WEST) => [
                        it.addLayoutParam(LayoutOptions::OFFSET, -2.0f)
                    ]
                    it.createLabel(it).configureInsideCenteredNodeLabel(
                        vo.reference.serialize as String, 6, KlighdConstants::DEFAULT_FONT_NAME)
                    val expr = f.expression
                    node.children += expr.translate(d.features.indexOf(f), node, d)    
                ]
            }
            
            for (s : senders) {
            	s.translateSender
            }
            
            node.addCollapseExpand(d.label)
        ]
        return dNode
    }

    // -------------------------------------------------------------------------
    private def KNode addCollapseExpand(KNode n, String label) { // Dataflow d
        var regionLabelVar = label //d.label
        val regionLabel = regionLabelVar
        n.addRectangle() => [
                it.setProperty(KlighdProperties::EXPANDED_RENDERING, true);
                it.setBackgroundGradient("#fff".color, "#fff".color, 90);
                it.setSurroundingSpace(2, 0);
                it.invisible = false;
                it.foreground = "gray".color
                it.lineWidth = 2 //1;
                //it.addText("[-]" + if(d.label.nullOrEmpty) "" else " " + regionLabel).putToLookUpWith(d) => [
                it.addText("[-]" + if(regionLabel.nullOrEmpty) "" else " " + regionLabel) => [//.putToLookUpWith(d) => [
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
                it.lineWidth = 2 //1;
                //it.addText("[+]" + if(d.label.nullOrEmpty) "" else " " + regionLabel).putToLookUpWith(d) => [
                it.addText("[+]" + if(regionLabel.nullOrEmpty) "" else " " + regionLabel) => [//.putToLookUpWith(d) => [
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
    
    private def dispatch KNode translate(Expression expr, int index, KNode parentNode, Dataflow d) {
        val nNode = expr.createNode(parentNode).putToLookUpWith(expr)
        switch(expr) {
            OperatorExpression: {
                val op = expr.operator
                val commutativeOps = newArrayList("+", "*", "&", "|")
                nNode.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT)
                nNode.createDefaultNodeShape
                nNode.addDefaultLayoutParameter
                // in case of a commutative operator reduce port constraint to fixed side
                if (commutativeOps.contains(op.toString)) {
                    nNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE)
                }
                nNode.createLabel(nNode).configureInsideTopCenteredNodeLabel(
                    op.toString(), 6, KlighdConstants::DEFAULT_FONT_NAME 
                )
                //println("op: " + op + ", expr: " + expr)
                expr.subExpressions.forEach[ se|
                    //println("se: " + se)
                    nNode.addPort(se, PortSide::WEST)
                    if (se instanceof ValuedObjectReference) {
                        
                        val subVo = (se as ValuedObjectReference).valuedObject
                        val decl = (subVo.eContainer as Declaration)
                        //println("se.vor.vo: " + subVo)
                        //println("decl: " + decl)
                        
                        // case: vor is of type input
                        if (decl.isInput) {
                            val inputNode = subVo.createNode(parentNode) => [
                                it.addPolygon.createInputNodeShape
                                it.addDefaultLayoutParameter
                                it.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT / 3)
                                it.addPort(subVo, PortSide::EAST)
                                  .addLayoutParam(LayoutOptions::OFFSET, -2.0f)
                                it.createLabel(it).configureInsideTopCenteredNodeLabel(
                                    subVo.serialize as String, 6, KlighdConstants::DEFAULT_FONT_NAME)
                                
                                it.createEdge(se) => [
                                    it.source = subVo.getNode(parentNode)
                                    it.target = nNode
//                                    println("sn: " + subVo.getNode(parentNode))
//                                    println("tn: " + nNode)
                                    it.sourcePort = subVo.getNode(parentNode).getPort(subVo.reference.portMap)
                                    it.targetPort = nNode.getPort(se.portMap)
                                        it.addRoundedBendsPolyline(4, 1) => [
                                        // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                                        it.addArrowDecorator() => [
                                        ]
                                    ]
                                ]
                            ]
                            parentNode.children += inputNode
                        } else if (decl.isOutput) {
                            // case vor is output
                            var fIndex = 0
                            for (f: d.features) {
                                if (f.valuedObject.equals(subVo)) {
                                    fIndex = d.features.indexOf(f)
                                }
                            }
                            
                            // kante vom temporären wert, sollte nur eine geben
                            // davon brauch ich die source
                            val refVo = d.features.get(fIndex).valuedObject
                            nNode.createEdge(se) => [
                                //it.source = refVo.getNode(parentNode)
                                it.source = refVo.getNode(parentNode).incomingEdges.get(0).source 
                                it.target = nNode
                                //it.sourcePort = refVo.getNode(parentNode).getPort(refVo.reference.portMap)
                                it.sourcePort = refVo.getNode(parentNode).incomingEdges.get(0).sourcePort
                                it.targetPort = nNode.getPort(se.portMap)
                                it.addRoundedBendsPolyline(4, 1) => [
                                    // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                                    it.addArrowDecorator() => [
                                    ]
                                ]
                            ]
                            
                            
                        } else {
                            // the subVo is not an input (maybe output or both)
                            // whats still to do here?
                            // re: trennen zwischen df und opExpr!!!!
                            //re2: statt df casten einfach d mit uebergeben und verwenden
                            //val df = expr.eContainer as Dataflow
                            var findex = 0
                            for (f: d.features) {
                                //println("f: " + f)
                                if (f.valuedObject.equals(subVo)) {
                                    findex = d.features.indexOf(f)
                                }
                            }
                            //println("subVo.eC: " + subVo.eContainer)
                            
                            val refVo = d.features.get(findex).valuedObject//d.valuedObjects.get(d.valuedObjects.indexOf(subVo))
                            val refExpr = d.features.get(findex).expression//d.expressions.get(d.valuedObjects.indexOf(subVo))
                            //println("refVO: " + refVo + ", refExpr: " + refExpr)
                            
                            nNode.createEdge(se) => [
                                //it.source = refExpr.getNode(parentNode)
                                it.source = refVo.getNode(parentNode) 
                                it.target = nNode
                                //println("src: " + it.source + ", tar: " + it.target)
                                //println("(nd)sn: " + refExpr.getNode(parentNode))
                                //println("(nd)tn: " + nNode)
                                //it.sourcePort = getNode(callNode).getPort(se.portMap)
                                it.sourcePort = refVo.getNode(parentNode).getPort(refVo.reference.portMap)
                                it.targetPort = nNode.getPort(se.portMap)
                                it.addRoundedBendsPolyline(4, 1) => [
                                    // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                                    it.addArrowDecorator() => [
                                    ]
                                ]
                            ]
                        }
                        // handle subExpressions in else case
                    } else {
                        parentNode.children += se.translate(index, parentNode, d)
                    }
                ]
                //println("ecpr.eC: " + expr.eContainer)
                if (expr.eContainer instanceof DataflowFeature) {
                //if (expr.eContainer instanceof Dataflow) { // <-- alte Variante, jetzt DF-Feature
                    //val df = expr.eContainer as Dataflow // <-- dataflow d is already a parameter?!
                    //val vo = df.valuedObjects.get(index) // <-- alte Variante, jetzt DF-Feature
                    val vo = d.features.get(index).valuedObject
                    nNode.addPort(vo, PortSide::EAST)
                    nNode.createEdge(parentNode) => [
                        it.source = nNode
                        //it.target = vo.getNode
                        it.target = vo.getNode(parentNode)
                        //println("(ec=df)sn: " + nNode)
                        //println("(ec=df)tn: " + vo.getNode(parentNode))
                        it.sourcePort = nNode.getPort(vo.reference.portMap)
                        //it.targetPort = vo.getNode().getPort(vo.reference.portMap)
                        it.targetPort = vo.getNode(parentNode).getPort(vo.reference.portMap)
                        it.addRoundedBendsPolyline(4, 1) => [
                            // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                            it.addArrowDecorator() => [
                            ]
                        ]
                    ]
                } else {
                    nNode.addPort(expr, PortSide::EAST)
                    
                    nNode.createEdge(parentNode) => [
                        it.source = nNode
                        it.target = (expr.eContainer).getNode(parentNode) // das ist auch die aufrufende Expr. + node
                        it.sourcePort = nNode.getPort(expr.portMap)
                        it.targetPort = (expr.eContainer).getNode(parentNode).getPort(expr.portMap) 
                        //it.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
                        it.addRoundedBendsPolyline(4, 1) => [
                            // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                            it.addArrowDecorator() => [
                            ]
                        ]
                    ]
                }
            }
            IntValue: {
                nNode.translateConstExpression(expr, parentNode)
            }
            FloatValue: {
                nNode.translateConstExpression(expr, parentNode)
            }
            BoolValue: {
                nNode.translateConstExpression(expr, parentNode)
            }
            ValuedObjectReference: {
                // expr = ValuedObjectReference: it.valuedObject = current input
                val vo = expr.valuedObject
                val voRef = d.features.get(index).valuedObject
                //val voRef = d.valuedObjects.get(index) // <-- alte Variante
                val feature = d.features.get(index)
                
                // current features (expr) is not attached to a call/reference node
                if (feature.node == null) {
                    val inputNode = vo.createNode(parentNode) => [
                        it.addPolygon.createInputNodeShape
                        it.addDefaultLayoutParameter
                        it.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT / 3)
                        it.addPort(vo, PortSide::EAST)
                            .addLayoutParam(LayoutOptions::OFFSET, -2.0f)
                        it.createLabel(it).configureInsideTopCenteredNodeLabel(
                            vo.serialize as String, 6, KlighdConstants::DEFAULT_FONT_NAME)

                        it.createEdge(vo) => [
                            it.source = vo.getNode(parentNode)
                            //it.target = nNode
                            it.target = voRef.getNode(parentNode)
//                            println("sn: " + vo.getNode(parentNode))
//                            println("tn: " + voRef.getNode(parentNode))
                            it.sourcePort = vo.getNode(parentNode).getPort(vo.reference.portMap)
                            //it.targetPort = nNode.getPort(voRef.reference.portMap)
                            it.targetPort = voRef.getNode(parentNode).getPort(voRef.reference.portMap)
                            
                            //println("src: " + vo.getNode(parentNode) + ", tar: " + voRef.getNode(parentNode))
                            
                            it.addRoundedBendsPolyline(4, 1) => [
                                // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                                it.addArrowDecorator() => [
                                ]
                            ]
                        ]
                    ]
                    
                    parentNode.children += inputNode
                    //println("vor.... expr: " + expr)
                    return inputNode
                } else {
                    val fNode = d.features.get(index).node
                    if (fNode instanceof CallNode) {
                        val cNode = d.features.get(index).node as CallNode
                        val dNode = cNode.referencedScope as DefineNode
//                        dNode.outputs.forEach[valuedObjects.forEach[
//                        println("outputs.vo: " + it)
//                        ]]
//                        println("current expr: " + expr + ", expr.vo: " + expr.valuedObject)
                          //println("expr.vo: " + expr.valuedObject)
                          //println("cNode.ports: " + cNode.getNode().ports)
                        cNode.getNode().createEdge(vo) => [
                            it.source = cNode.getNode()
                            it.target = voRef.getNode(parentNode)
                            it.sourcePort = cNode.getNode().getPort(expr.valuedObject.reference.portMap)
                            it.targetPort = voRef.getNode(parentNode).getPort(voRef.reference.portMap)
                        ]
                    }
                    if (fNode instanceof TestReferenceNode) {
                        //println("trn node: " + trn.getNode())
                        val trn_node = (fNode as TestReferenceNode).getNode()//trn.getNode()
                        //val trn_vo = refVo
                        trn_node.createEdge(vo) => [ //trn.getNode().createEdge(vo) => [
                            it.source = trn_node
                            it.target = voRef.getNode(parentNode)
                            it.sourcePort = trn_node.getPort(expr.valuedObject.reference.portMap) //trn_vo.reference.portMap)
                            it.targetPort = voRef.getNode(parentNode).getPort(voRef.reference.portMap)
                        ]
                    }
                }
            }
            default: {
                println("default... expr: " + expr)
            }
        }
        return nNode
    }
    
    private def KNode createDefaultNodeShape(KNode n) {
//        n.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT)
        n.addRoundedRectangle(3, 3) => [
            it.setBackgroundGradient("#ff8".color, "#ff8".color, 90)
            it.setSurroundingSpace(0, 0)
            it.invisible = false
            it.foreground = "black".color
            it.lineWidth = 1
        ]
        
        return n
    }
    
    // -------------------------------------------------------------------------
    private def dispatch KNode translate(Expression expr, int voIndex, Node callNode) {
        val nNode = expr.createNode(callNode).putToLookUpWith(expr)
        
        switch(expr) {
            OperatorExpression: {
                val op = expr.operator
                val commutativeOps = newArrayList("+", "*", "&", "|")
                nNode.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT)
                nNode.createDefaultNodeShape
                nNode.addDefaultLayoutParameter
                // in case of a commutative operator reduce port constraint to fixed side
                if (commutativeOps.contains(op.toString)) {
                    nNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE)
                }
                nNode.createLabel(nNode)
                     .configureInsideTopCenteredNodeLabel(op.toString(),
                                                          6,
                                                          KlighdConstants::DEFAULT_FONT_NAME
                )
                
                // vo's sind die outputs, aktueller index wird mit uebergeben
                
                // get the valuedObject (expression output) of the current expression
                val dNode = (callNode as CallNode).callReference as DefineNode
                val vo = dNode.valuedObjects.get(voIndex)
                
                expr.subExpressions.forEach[ se|
                    // add input ports
                    nNode.addPort(se, PortSide::WEST)
                    if (se instanceof ValuedObjectReference) {
                        // nothing more to do so far?
                        // pre abfangen! und val? signal?
                        
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
                                it.addRoundedBendsPolyline(4, 1) => [
                                    // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                                    it.addArrowDecorator() => [
                                    ]
                                ]
                            ]
                            // else: input edges!!!!
                        } else {
                        nNode.createEdge(se) => [
                            it.source = getNode(callNode)
                            it.target = nNode
                            it.sourcePort = getNode(callNode).getPort(se.portMap)
                            it.targetPort = nNode.getPort(se.portMap)
                            it.addRoundedBendsPolyline(4, 1) => [
                                    // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                                    it.addArrowDecorator() => [
                                    ]
                                ]
                        ]                            
                        }
                    } else {
                        // recursive call to transform subExpressions
                        (callNode as CallNode).node.children += se.translate(voIndex, callNode)
                    }
                    // weitere else Fälle: function call und text expression ?!
                ]
                
                // eContainer ist die DefineNde, aber nicht für subExpressions
                if (expr.eContainer instanceof DefineNode) {
                    // port for expression output
                    nNode.addPort(vo, PortSide::EAST)
                    // TODO: create edge from output ports to callNode ports
                    // done
                    nNode.createEdge(callNode) => [
                        it.source = nNode
                        it.target = getNode(callNode)
                        it.sourcePort = nNode.getPort(vo.reference.portMap)
                        it.targetPort = getNode(callNode).getPort(vo.reference.portMap)
                        it.addRoundedBendsPolyline(4, 1) => [
                            // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                            it.addArrowDecorator() => [
                            ]
                        ]
                    ]
                    
                } else {
                    // port for another subExpression output
                    nNode.addPort(expr, PortSide::EAST)
                    // create edge
                    nNode.createEdge(callNode) => [
                        it.source = nNode
                        it.target = (expr.eContainer).getNode(callNode) // das ist auch die aufrufende Expr. + node
                        it.sourcePort = nNode.getPort(expr.portMap)
                        it.targetPort = (expr.eContainer).getNode(callNode).getPort(expr.portMap) 
                        //it.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
                        it.addRoundedBendsPolyline(4, 1) => [
                            // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                            it.addArrowDecorator() => [
                            ]
                        ]
                    ]
                }
                return nNode
            }
            IntValue: {
                nNode.translateConstExpression(expr, callNode)
                return nNode
            }
            FloatValue: {
                nNode.translateConstExpression(expr, callNode)
                return nNode
            }
            BoolValue: {
                nNode.translateConstExpression(expr, callNode)
                return nNode
            }
            default: {
                println("default: " + expr)
                return nNode
            }
        }
    }
    // translate a const expression: just create input node an edge
    public def dispatch KNode translateConstExpression(KNode n, Expression expr, KNode parentNode) {
        n.addPolygon.createInputNodeShape
        n.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT / 3)
        n.addDefaultLayoutParameter
        n.addPort(expr, PortSide::EAST) => [
            addLayoutParam(LayoutOptions::OFFSET, -2.0f)
        ]
        n.createLabel(n).configureInsideCenteredNodeLabel(expr.serialize as String,
                                                          6, KlighdConstants::DEFAULT_FONT_NAME)
        
        //trennen zwischen Dataflow als eC und opExp!!
        //println("expr.eC: " + expr.eContainer)
        //println("voRef: " + voRef)
        n.createEdge(parentNode) => [
            it.source = n
            it.sourcePort = n.getPort(expr.portMap)
            if (expr.eContainer instanceof Dataflow) {
                val voRef = (expr.eContainer as Dataflow).valuedObjects.get((expr.eContainer as Dataflow).expressions.indexOf(expr))
                it.target = voRef.getNode(parentNode)
                it.targetPort = voRef.getNode(parentNode).getPort(voRef.reference.portMap)
            } else {
                it.target = (expr.eContainer).getNode(parentNode) // das ist auch die aufrufende Expr. + node
                it.targetPort = (expr.eContainer).getNode(parentNode).getPort(expr.portMap)
            }
//            println("sn: " + n)
//            println("tn: " + (expr.eContainer).getNode(parentNode))
            
            it.addRoundedBendsPolyline(4, 1) => [
                // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                it.addArrowDecorator() => [
                ]
            ]
        ]
        return n
    }
    // translate a const expression: just create input node an edge
    public def dispatch KNode translateConstExpression(KNode n, Expression expr, Node callNode) {
        n.addPolygon.createInputNodeShape
        n.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT / 3)
        n.addDefaultLayoutParameter
        n.addPort(expr, PortSide::EAST) => [
            addLayoutParam(LayoutOptions::OFFSET, -2.0f)
        ]
        n.createLabel(n).configureInsideCenteredNodeLabel(expr.serialize as String,
                                                          6, KlighdConstants::DEFAULT_FONT_NAME)
        
        n.createEdge(callNode) => [
            it.source = n
            it.target = (expr.eContainer).getNode(callNode) // das ist auch die aufrufende Expr. + node
            it.sourcePort = n.getPort(expr.portMap)
            it.targetPort = (expr.eContainer).getNode(callNode).getPort(expr.portMap) 
            //it.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
            it.addRoundedBendsPolyline(4, 1) => [
                // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                it.addArrowDecorator() => [
                ]
            ]
        ]
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
    
    // Transform a Node
    public def dispatch KNode translate(Node n) {
        val nNode = n.createNode().putToLookUpWith(n)
        
        //create specific node shape
        if (n instanceof InputNode) {
        	nNode.addPolygon.createInputNodeShape
        	nNode.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT / 3)
      	} 
        else if (n instanceof OutputNode) {
        	nNode.addPolygon.createOutputNodeShape
        	nNode.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT / 3)
        }
        else if (n instanceof CallNode) {
            nNode.setMinimalNodeSize(MINIMALNODEWIDTH * 2, MINIMALNODEHEIGHT * 2)
            nNode.createDefaultNodeShape
        }
        else {
        	nNode.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT)
            nNode.createDefaultNodeShape
		}
        
        // set up some default layout parameters
        nNode.addDefaultLayoutParameter

        // add node ports
        if (n instanceof InputNode) {
        	val in = (n as InputNode)
        	nNode.addPort(in.senders.head.expression, PortSide::EAST) => [
        		addLayoutParam(LayoutOptions::OFFSET, -2.0f)
        	]
            // if port label check option is used, we need a node label here
            // create label regardless of check option atm
            //if (!SHOW_PORT_LABELS.booleanValue) {
                nNode.createLabel.configureInsideTopCenteredNodeLabel(
                      in.senders.head.expression.serialize as String,
                      6,
                      KlighdConstants::DEFAULT_FONT_NAME)
            //}
        }
        else if (n instanceof OutputNode) {
        	val out = (n as OutputNode)
        	var text = ""
        	if (!out.senders.nullOrEmpty) {
        	    nNode.addPort(out.senders.head.expression, PortSide::WEST) => [
                //nNode.addPort(out.valuedObject.reference, PortSide::WEST) => [
                    addLayoutParam(LayoutOptions::OFFSET, -2.0f)
                ]
                text = out.senders.head.expression.serialize as String
        	} else {
        	    //nNode.addPort(out.senders.head.expression, PortSide::WEST) => [
                nNode.addPort(out.valuedObject.reference, PortSide::WEST) => [
                    addLayoutParam(LayoutOptions::OFFSET, -2.0f)
                ]
                text = out.valuedObject.reference.serialize as String
        	}
        	// if port label check option is used, we need a node label here
        	// create label regardless of check option atm
            //if (!SHOW_PORT_LABELS.booleanValue) {
                nNode.createLabel.configureInsideTopCenteredNodeLabel(
                      text,
                      6,
                      KlighdConstants::DEFAULT_FONT_NAME)
            //}
        }
        else if (n instanceof ReferencedNode) {
 			nNode.createLabel(nNode).configureInsideTopCenteredNodeLabel(
                        if(n.label.nullOrEmpty) "" else " " + n.label,
                        6,
                        KlighdConstants::DEFAULT_FONT_NAME
                    )
                          
        	val ref = (n as ReferencedNode)
        	ref.referencedScope.declarations.filter[it.input].forEach[valuedObjects.forEach[
        		nNode.addPort(it.reference, PortSide::WEST)
        	]]
        	ref.referencedScope.declarations.filter[it.output].forEach[valuedObjects.forEach[
        		nNode.addPort(it.reference, PortSide::EAST)
        	]]
        } 
        else if (n instanceof TestReferenceNode) {
            val ref = (n as TestReferenceNode)
            nNode.createLabel(nNode).configureInsideTopCenteredNodeLabel(
                if(n.label.nullOrEmpty) ref.id else " " + n.label,
                6,
                KlighdConstants::DEFAULT_FONT_NAME
            )
            ref.referencedScope.declarations.filter[it.input].forEach[valuedObjects.forEach[ vo|
                nNode.addPort(vo.reference, PortSide::WEST) => [
                    if (SHOW_PORT_LABELS.booleanValue) {
                        it.createLabel(it).configureInsideCenteredNodeLabel(
                            vo.name, 6, KlighdConstants::DEFAULT_FONT_NAME)
                    }
                ]
            ]]
            ref.referencedScope.declarations.filter[it.output].forEach[valuedObjects.forEach[ vo|
                nNode.addPort(vo.reference, PortSide::EAST) => [
                    if (SHOW_PORT_LABELS.booleanValue) {
                        it.createLabel(it).configureInsideCenteredNodeLabel(
                            vo.name, 6, KlighdConstants::DEFAULT_FONT_NAME)
                    }
                ]
            ]]
            // create input nodes for call parameters
            // need to be improved if parameter is not an global/local input
            val dNode = ref.eContainer.node
            val refInputs = <ValuedObject>newArrayList
            ref.referencedScope.declarations.filter[it.input].forEach[
                refInputs += valuedObjects
            ]
            val refInputSize = refInputs.size
            ref.parameters.forEach[ p|
                if (ref.parameters.indexOf(p) >= refInputSize) {
                    // if a call has more parameters than the referenced node: skip 
                } else {
                    // else: add child nodes and edges if not already created
                    if (p instanceof ValuedObjectReference) {
                        val param = (p as ValuedObjectReference).valuedObject 
                        dNode.children += param.createNode(dNode) => [ inNode|
                            inNode.addPolygon.createInputNodeShape
                            inNode.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT / 3)
                            inNode.addDefaultLayoutParameter
                            inNode.addPort(param.reference, PortSide::EAST) => [
                                it.addLayoutParam(LayoutOptions::OFFSET, -2.0f)
                            ]
                            inNode.createLabel(inNode).configureInsideCenteredNodeLabel(param.serialize as String,
                                6, KlighdConstants::DEFAULT_FONT_NAME)
                            //create Edge
                            inNode.createEdge(ref) => [
                                it.source = inNode
                                it.target = nNode
                                it.sourcePort = inNode.getPort(param.reference.portMap)
                                it.targetPort = nNode.ports.get(ref.parameters.indexOf(p))
                                it.addRoundedBendsPolyline(4, 1) => [
                                    // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                                    it.addArrowDecorator() => [
                                    ]
                                ]
                            ]
                        ]
                    } else {
                        println("p is: " + p)
                    }
                }
            ]            
        } // really need to set invisible here? better skip defineNodes when traversing all df nodes
        // already skipped when traversing all nodes of current df
//        else if (n instanceof DefineNode) {
//            nNode.KRendering.invisible = true
//        }
        else if (n instanceof CallNode) {
            val call = n as CallNode
            val refID = call.callReference.id
            nNode.createLabel(nNode).configureInsideTopCenteredNodeLabel(
                if(n.label.nullOrEmpty) refID else " " + n.label,
                                        6,
                                        KlighdConstants::DEFAULT_FONT_NAME)
            
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
                        if (SHOW_PORT_LABELS.booleanValue) {
                            it.createLabel(it).configureInsideCenteredNodeLabel(
                                vo.reference.serialize as String,
                                6, KlighdConstants::DEFAULT_FONT_NAME)
                        }
                    ]
                ]]
                ref.outputs.forEach[valuedObjects.forEach[ vo|
                    nNode.addPort(vo.reference, PortSide::EAST) => [
                        it.addLayoutParam(LayoutOptions::OFFSET, -3.0f)
                        if (SHOW_PORT_LABELS.booleanValue) {
                        it.createLabel(it).configureInsideCenteredNodeLabel(
                            vo.reference.serialize as String,
                            6, KlighdConstants::DEFAULT_FONT_NAME)
                        }
                    ]
                ]]
                
                //create output node  // not used for the moment
//                val pNode = call.eContainer.node
//                pNode.children += call.createNode(pNode) => [ node|
//                    node.addPolygon.createOutputNodeShape
//                    node.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT / 3)
//                    node.addDefaultLayoutParameter
//                    node.addPort("", 0f, 0f, 2, PortSide::WEST)
//                    println("port: " + node.addPort("", 0f, 0f, 2, PortSide::WEST))
//                    node.createLabel(node).configureInsideCenteredNodeLabel(
//                         call.id, 6, KlighdConstants::DEFAULT_FONT_NAME)
//                    
//                    //create Edge
//                    pNode.createEdge(call) => [
//                        it.source = nNode
//                        it.target = node
//                        it.sourcePort = nNode.getPort(ref.outputs.get(0).valuedObjects.get(0).reference.portMap)
//                        it.targetPort = node.ports.get(0)
//                        it.addRoundedBendsPolyline(4, 1) => [
//                            // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
//                            it.addArrowDecorator() => [
//                            ]
//                        ]
//                    ]
//                    //println("pNode.child: " + node)
//                ]
                
                // translate states
//                ref.states.forEach[ s|
//                    nNode.children += s.translate
//                ]
                if (!ref.states.nullOrEmpty) {
                    val synthesis = delegate.get()
                    synthesis.use(usedContext)
                    for (s: ref.states) {
                        nNode.children += synthesis.translate(s)
                    }
                }
                
            // what is still to do herre?
            } else if (call.callReference instanceof CallNode) {
                val ref = call.callReference as CallNode
                val dNode = call.eContainer.node
                
                // create output node if neccessary and edge
                
            }
            
            // create input nodes for call parameters
            // need to be improved if parameter is not an global/local input
            val dNode = call.eContainer.node
            val refInputs = <ValuedObject>newArrayList
            val callRef = call.callReference as DefineNode
            callRef.inputs.forEach[
                refInputs += valuedObjects
            ]
            val refInputSize = refInputs.size
            call.parameters.forEach[ p|
                if (call.parameters.indexOf(p) >= refInputSize) {
                    // if a call has more parameters than the called node: skip 
                } else {
                    // else: add child nodes and edges if not already created
                    if (p instanceof ValuedObjectReference) {
                        val param = (p as ValuedObjectReference).valuedObject 
                        dNode.children += param.createNode(dNode) => [ inNode|
                            inNode.addPolygon.createInputNodeShape
                            inNode.setMinimalNodeSize(MINIMALNODEWIDTH, MINIMALNODEHEIGHT / 3)
                            inNode.addDefaultLayoutParameter
                            inNode.addPort(param.reference, PortSide::EAST) => [
                                it.addLayoutParam(LayoutOptions::OFFSET, -2.0f)
                            ]
                            inNode.createLabel(inNode).configureInsideCenteredNodeLabel(param.serialize as String,
                                6, KlighdConstants::DEFAULT_FONT_NAME)
                            //create Edge
                            inNode.createEdge(call) => [
                                it.source = inNode
                                it.target = nNode
                                it.sourcePort = inNode.getPort(param.reference.portMap)
                                it.targetPort = nNode.ports.get(call.parameters.indexOf(p))
                                it.addRoundedBendsPolyline(4, 1) => [
                                    // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                                    it.addArrowDecorator() => [
                                    ]
                                ]
                            ]
                        ]
                    } else {
                        println("p is: " + p)
                    }
                }
            ]
            
            // set call nodes to initially collapsed
            nNode.addCollapseExpand(" "/*if(ref.label.nullOrEmpty) " " + ref.id else " " + ref.label*/)
            if (SHOW_SHADOW.booleanValue) {
                nNode.KRendering.shadow = "black".color;
                nNode.KRendering.shadow.XOffset = 4;
                nNode.KRendering.shadow.YOffset = 4;
            }
            nNode.initiallyCollapse
        }
        /*
         * the "default" else, in case something is missing
         */
        else {
            nNode.createLabel(nNode).configureInsideTopCenteredNodeLabel(
                if(n.label.nullOrEmpty) "" else " " + n.label,
                6,
                KlighdConstants::DEFAULT_FONT_NAME
            )
        }
        return nNode
    }
    
    // -------------------------------------------------------------------------
    // -- Helper: Ports 
    // -------------------------------------------------------------------------
    def KPort addPort(KNode node, String text, float x, float y, int size, PortSide side) {
        // alt: node.createPort(text) => [
        node.createPort() => [
            it.addLayoutParam(LayoutOptions::PORT_SIDE, side);
//            it.setPortPos(x, y)
            it.setPortSize(size, size)
//            it.addRectangle.invisible = true;
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
    	val textf = text
        node.createPort(obj) => [
            it.addLayoutParam(LayoutOptions::PORT_SIDE, side);
            it.setPortSize(size, size)
//            if (SHOW_PORT_LABELS.booleanValue) {
//                it.createLabel(it).configureOutsideBottomLeftNodeLabel(
//                        textf,
//                        6,
//                        KlighdConstants::DEFAULT_FONT_NAME
//                    )
//            }
            
            node.ports += it
        ]    
    }    

    def KPort addPort(KNode node, Expression expression, PortSide side) {
    	node.addPort(expression, 0, 0, 2, side) => [
//    	    if (!SHOW_PORT_LABELS.booleanValue) {
//                node.createLabel(node).configureInsideTopCenteredNodeLabel(
//                      "test",
//                      6,
//                      KlighdConstants::DEFAULT_FONT_NAME)
//            }
    	]
    }
    // new helper for valuedObject instead of Expression
    def KPort addPort(KNode node, ValuedObject vo, PortSide side) {
        node.createPort(vo) => [
            it.addLayoutParam(LayoutOptions::PORT_SIDE, side)
            it.setPortSize(2, 2)
//            if (SHOW_PORT_LABELS.booleanValue) {
//                it.createLabel(it).configureOutsideBottomLeftNodeLabel(
//                    vo.name, 6, KlighdConstants::DEFAULT_FONT_NAME
//                )
//            }
            node.ports += it
        ]
    }
    
    def translateSender(Sender s) {
    	val nNode = s.eContainer as Node
    	for(r : s.receivers) {
    		s.translateReceiver(r, nNode)
    	}
  	}
  	
    def KEdge translateReceiver(Sender s, Receiver r, Node n) {
    	val sNode = s.eContainer as Node
    	val rNode = r.node
    	val sPort = sNode.node.getPort(s.expression.portMap)
    	var Object recPort = null
    	if (r.node instanceof OutputNode) {
    		recPort = (r.node as OutputNode).valuedObject.reference.portMap
    		//recPort = r.valuedObject.reference.portMap
    	} else {
    		recPort = r.valuedObject.reference.portMap
   		}
    	val rPort = rNode.node.getPort(recPort) 
        val sEdge = s.createEdge(r).putToLookUpWith(s) => [ edge |
            edge.source = sNode.node;
            edge.target = rNode.node;
            edge.sourcePort = sPort;
            edge.targetPort = rPort;
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
            edge.addRoundedBendsPolyline(4, 1) => [
                // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                it.addArrowDecorator() => [
                ];
            ];
        ];
        
        return sEdge
    }
    
//    def KEdge translateTestReceiver(TestReceiver tr) {
//        val sNode = tr.sender
//        val rNode = tr.node
//        
//        var Object recPort = null
//        var Object srcPort = null
//        if (tr.node instanceof OutputNode) {
//            recPort = (tr.node as OutputNode).valuedObject.reference.portMap
//        } else {
//            recPort = tr.valuedObject.reference.portMap
//        }
//        if (tr.sender instanceof InputNode) {
//            srcPort = (tr.sender as InputNode).senders.head.expression.portMap
//        } else if (tr.sender instanceof TestReferenceNode) {
//            srcPort = tr.valuedObject.reference.portMap
//        } else if (tr.sender instanceof CallNode) {
//            srcPort = tr.valuedObject.reference.portMap
//        }
//        val sPort = sNode.node.getPort(srcPort)
//        val rPort = rNode.node.getPort(recPort)
//        val sEdge = tr.createEdge(tr.sender).putToLookUpWith(tr) => [ edge |
//            edge.source = sNode.node
//            edge.target = rNode.node
//            edge.sourcePort = sPort
//            edge.targetPort = rPort
//            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
//            edge.addRoundedBendsPolyline(4, 1) => [
//                it.addArrowDecorator() => [
//                ]
//            ]
//        ]
//        return sEdge
//    }
    
    def Object portMap(Expression expression) {
		var Object obj = null
  		if (expression instanceof ValuedObjectReference) {
    		obj = (expression as ValuedObjectReference).valuedObject
        } else {
    		obj = expression
  		}
  		obj
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
}

@ViewSynthesisShared
class DelegateSCChartsDiagramSynthesis extends SCChartsDiagramSynthesis {

}



