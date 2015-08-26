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
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.util.Pair
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.klighd.subsystheses.ControlflowRegionSynthesis
import de.cau.cs.kieler.sccharts.klighd.subsystheses.DataflowRegionSynthesis
import de.cau.cs.kieler.sccharts.klighd.subsystheses.StateSynthesis
import de.cau.cs.kieler.sccharts.klighd.subsystheses.TransitionSynthesis
import de.cau.cs.kieler.sccharts.s.DependencyGraph
import de.cau.cs.kieler.sccharts.text.actions.ActionsStandaloneSetup
import de.cau.cs.kieler.sccharts.text.actions.scoping.ActionsScopeProvider
import java.util.LinkedHashSet
import java.util.List
import java.util.logging.Logger
import org.eclipse.xtext.serializer.ISerializer

/**
 * Main diagram synthesis for SCCharts.
 * 
 * @author als
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
@ViewSynthesisShared
class SCChartsSynthesis extends AbstractDiagramSynthesis<Scope> implements GeneralSysthesisOptions {
    
    // -------------------------------------------------------------------------
    // Extensions 
    @Inject 
    extension KNodeExtensions
    
    // -------------------------------------------------------------------------
    // SubSyntheses
    @Inject
    StateSynthesis stateSynthesis
    
    @Inject
    ControlflowRegionSynthesis controlflowSynthesis    
    
    @Inject
    DataflowRegionSynthesis dataflowSynthesis  
      
    @Inject
    TransitionSynthesis transitionSynthesis
    
    // -------------------------------------------------------------------------
    // Hooks
    @Inject
    SCChartsSynthesisHooks hooks  
    
    // -------------------------------------------------------------------------
    // Fields
    val logger = Logger.getLogger(this.class.name);
       
    // -------------------------------------------------------------------------
    // Sidebar Options

    override public getDisplayedSynthesisOptions() {
        val options = new LinkedHashSet();
        // Add general options
        options.addAll(USE_KLAY);//USE_ADAPTIVEZOOM
        // Add options of subsyntheses
        options.addAll(stateSynthesis.displayedSynthesisOptions);
        options.addAll(transitionSynthesis.displayedSynthesisOptions);
        options.addAll(controlflowSynthesis.displayedSynthesisOptions);
        options.addAll(dataflowSynthesis.displayedSynthesisOptions);
        // Add options of hooks
        hooks.allHooks.forEach[options.addAll(displayedSynthesisOptions)];
        return options.toList;
    }

    override public getDisplayedLayoutOptions() {
        return newLinkedList(
            new Pair<IProperty<?>, List<?>>(LayoutOptions::DIRECTION, Direction::values.drop(1).sortBy[it.name])
            ,new Pair<IProperty<?>, List<?>>(LayoutOptions::SPACING, newArrayList(0, 150))
        );
    }
        
    // -------------------------------------------------------------------------
    // The main entry transform function   
    override transform(Scope root) {
        val startTime = System.currentTimeMillis;
        
        val rootNode = createNode();
        
        // usedContext.setProperty(KlighdProperties.EDGES_FIRST, true); //Why?
        
        // Configure synthesis options via annotation
        // TODO Check avaliable synthesis option and activate, requires id in options
//                for (Annotation a : root.annotations) {
//                    if (a.name.equals(GLOBALBWOPTION)) {
//                        globalBWOption = true;
//                    }
//                }

        // FIXME: ONLY for Debug
        val properties = new KlighdSynthesisProperties();
        properties.copyProperties(usedContext);
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS, "de.cau.cs.kieler.sccharts.klighd.DeprecatedSCChartsSynthesis");
        rootNode.children += LightDiagramServices::translateModel(root, usedContext, properties).children;
        
        hooks.invokeStart(root);

        if (root instanceof State) {
            rootNode.children += stateSynthesis.transform(root);
        } else if (root instanceof ControlflowRegion) {
            //Adding all children to the root node will hide the graphical representation of the region itself.
            rootNode.children += controlflowSynthesis.transform(root).children;
        }
        
        hooks.invokeFinish(rootNode);

        // Log elapsed time
        logger.info(
            "SCCharts synthesis transformed model " + (root.label ?: root.id) + " in " +
                ((System.currentTimeMillis - startTime) as float / 1000) + "s.");

        return rootNode;
    }

    // -------------------------------------------------------------------------
    // Increase Visibility of needed protected inherited methods
    
    override getUsedContext() {
        return super.usedContext;
    }
    
    // -------------------------------------------------------------------------
    // Serialization of actions (state actions and transition labels)   
    private static val Injector i = ActionsStandaloneSetup::doSetup();
    private static val ActionsScopeProvider scopeProvider = i.getInstance(typeof(ActionsScopeProvider));
    private static val ISerializer serializer = i.getInstance(typeof(ISerializer));
    
    // a global diagram option "@BlackWhite"
    private boolean globalBWOption = false;
    private final String GLOBALBWOPTION = "BlackWhite";



    // -------------------------------------------------------------------------
    // Transformation options   
    // CORE TRANSFORMATIONS


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


//        val tracking = new SourceModelTrackingAdapter();
//        val rootNode = createNode() => [
//            it.eAdapters.add(tracking);
//            // ATTENTION: DO NOT use graphiz on outermost root node, this will result in suspicious layout bugs!!!
////            addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot") 
//            addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES)
//            children += rootState.translate
//        ] 
//        var time = (System.currentTimeMillis - timestamp) as float
//        System.out.println("SCCharts synthesis finished (time elapsed: "+(time / 1000)+"s).")
//        
//        if(SHOW_SCG_DEPENDENCIES.booleanValue){
//            rootNode.addSCGDependcyEdges(model as State, tracking);
//        }
//        
//        if(SHOW_SCG_LOOPS.booleanValue){
//            rootNode.addSCGLoopHighlighting(model as State, tracking);
//        }
//        
////        rootNode.eAdapters.remove(tracking)
//        
//        return rootNode
//    }

    // -------------------------------------------------------------------------
//    // Transform a region
//    public def KNode translate(ControlflowRegion r, boolean loadLazy) {
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//    }
//
//    // -------------------------------------------------------------------------
//    // Helper functions
//    // Returns true if the state has no regions that contain any further states.
//    def boolean hasNoControlflowRegionsWithStates(State state) {
//        return (state.controlflowRegions == null || state.controlflowRegions.size == 0 || !state.controlflowRegionsNotEmpty)
//    }
//    
//    def boolean hasNoDataflowRegions(State state) {
//    	val df = state.dataflowRegions
//    	return (df == null || df.size == 0)
//    }
//
//    // Tells if the state needs a macro state rendering because of regions or declarations.
//    def boolean hasRegionsOrDeclarations(State state, List<ValuedObject> valuedObjectCache) {
//        val returnValue = (!state.hasNoControlflowRegionsWithStates || !state.hasNoDataflowRegions || 
//            (!state.localActions.nullOrEmpty && SHOW_STATE_ACTIONS.booleanValue) ||
//            (!valuedObjectCache.nullOrEmpty && SHOW_SIGNAL_DECLARATIONS.booleanValue))
//        return returnValue
//    }
//
////    // Return the action name entry.
////    def dispatch String getActionName(EntryAction action) {
////        "entry"
////    }
////
////    // Return the action name during.
////    def dispatch String getActionName(DuringAction action) {
////        "during"
////    }
////
////    // Return the action name exit.
////    def dispatch String getActionName(ExitAction action) {
////        "exit"
////    }
//
//    // Return the action name exit.
//    def dispatch String getActionName(LocalAction action) {
//        // will be serialized automatically from grammar (iff not suspend action!)
//        return ""
//    }
//
//    // Return the action name suspend.
//    def dispatch String getActionName(SuspendAction action) {
//        if (!(action as SuspendAction).weak) {
//        "suspend "
//        } else {
//        "weak suspend "
//        }
//    }
//
//    // -------------------------------------------------------------------------
//    // Keyword highlighting in declarations
//    // Returns true if the text is a keyword.
//    def boolean isKeyword(String text) {
//        return (text == "scchart") || (text == "entry") || (text == "during") || (text == "suspend") || (text == "weak") ||
//            (text == "exit") || (text == "signal") || (text == "int") || (text == "bool") ||
//            (text == "float") || (text == "unsigned") || (text == "immediate") || (text == "input") ||
//            (text == "output") || (text == "pre") || (text == "val") || (text == "combine") || (text == "static") || 
//            (text == "const") || (text == "extern") || (text == "iterate")
//    }
//
//    // Get a list of words of a text String parsed by a regular expression.
//    def List<String> getWords(String text) {
//        text.split("\\W+")
//    }
//
//    // Print the highlighted text into a parent and link it to a lookup EObject.
//    def KRectangle printHighlightedText(KRectangle parent, String text, EObject lookup) {
//        if (USE_ADAPTIVEZOOM.booleanValue) parent.lowerVisibilityScaleBound = 0.5f;
//        var remainingText = text
//        var split = ""
//        val words = text.getWords
//        parent.setGridPlacement(words.length + 1)
//        for (word : words) {
//            val index = remainingText.indexOf(word)
//            split = remainingText.substring(0, index)
//            remainingText = remainingText.substring(index + word.length, remainingText.length)
//            parent.addText(split + word) => [
//                if (USE_ADAPTIVEZOOM.booleanValue) it.lowerVisibilityScaleBound = 0.5f;
//                if (word.keyword) {
//                    it.setForeground(KEYWORD.copy)
//                    if (PAPER_BW.booleanValue || globalBWOption) {
//                        it.setForeground("black".color)    
//                    }
//                    it.setFontBold(true)
//                }
//                it.putToLookUpWith(lookup)
//                it.setGridPlacementData()
//            ]
//        }
//        val remainingText2 = remainingText
//        if (remainingText2.length > 0) {
//            parent.addText(remainingText2) => [
//                if (USE_ADAPTIVEZOOM.booleanValue) it.lowerVisibilityScaleBound = 0.5f;
//                if (remainingText2.keyword) {
//                    it.setForeground(KEYWORD.copy)
//                    if (PAPER_BW.booleanValue || globalBWOption) {
//                        it.setForeground("black".color)    
//                    }
//                    it.setFontBold(true)
//                }
//                it.putToLookUpWith(lookup)
//                it.setGridPlacementData()
//            ]
//        }
//        parent
//    }
//
//    // -------------------------------------------------------------------------
//    // Transform a state    
//    public def KNode translate(State s) {
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//    }
//    
//    @Inject
//    Provider<DelegateSCChartsDiagramSynthesis> delegate;
//
//    // -------------------------------------------------------------------------
//    // Translate a transition
//    def KEdge translateTransition(Transition t) {
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//    }
//
//    // -------------------------------------------------------------------------
//    // Different renderings for different transition types
//    def KRendering addStrongAbortionDecorator(KPolyline line) {
//        return line.addEllipse() => [
//            it.lineWidth = 1;
//            it.background = "red".color
//            if (PAPER_BW.booleanValue || globalBWOption) {
//                it.background = "gray".color
//            }
//            it.setDecoratorPlacementData(10, 10, 4, 0, false);
//        ];
//    }
//
//    def KRendering addDeferredDecorator(KContainerRendering line, float offset) {
//        return line.addEllipse() => [
//            it.lineWidth = 1;
//            it.background = "red".color
//            if (PAPER_BW.booleanValue || globalBWOption) {
//                it.background = "gray".color
//            }
//            it.setDecoratorPlacementData(10, 10, -4 + offset, 1, false);
//        ];
//    }
//
//    def KPolygon addNormalTerminationDecorator(KPolyline line) {
//        return line.drawTriangle() => [
//            it.lineWidth = 1;
//            it.background = "green".color
//            if (PAPER_BW.booleanValue || globalBWOption) {
//                it.background = "gray".color
//            }
//            it.setDecoratorPlacementData(11, 11, 5, 0, true);
//        ];
//    }
//
//    def KRendering addShallowHistoryDecorator(KContainerRendering line) {
//        return line.addEllipse() => [
//            it.lineWidth = 0;
//            it.setForeground(DARKGRAY.copy)
//            it.background = DARKGRAY.copy
//            it.setDecoratorPlacementData(16, 16, -6, 1, false);
//            it.addPolyline(1) => [
//                it.lineWidth = 2;
//                it.points += createKPosition(LEFT, 5, 0, TOP, 4, 0);
//                it.points += createKPosition(LEFT, 5, 0, BOTTOM, 4, 0);
//                it.points += createKPosition(LEFT, 5, 0, TOP, 0, 0.5f);
//                it.points += createKPosition(RIGHT, 5, 0, TOP, 0, 0.5f);
//                it.points += createKPosition(RIGHT, 5, 0, BOTTOM, 4, 0);
//                it.points += createKPosition(RIGHT, 5, 0, TOP, 4, 0);
//                it.setForeground("white".color);
//            ];
//        ];
//    }
//
//    def KRendering addDeepHistoryDecorator(KContainerRendering line) {
//        return line.addEllipse() => [
//            it.lineWidth = 0;
//            it.setForeground(DARKGRAY.copy)
//            it.background = DARKGRAY.copy
//            it.setDecoratorPlacementData(16, 16, -6, 1, false);
//            it.addPolyline(1) => [
//                it.lineWidth = 2;
//                it.points += createKPosition(LEFT, 3, 0, TOP, 4, 0);
//                it.points += createKPosition(LEFT, 3, 0, BOTTOM, 4, 0);
//                it.points += createKPosition(LEFT, 3, 0, TOP, 0, 0.5f);
//                it.points += createKPosition(RIGHT, 7, 0, TOP, 0, 0.5f);
//                it.points += createKPosition(RIGHT, 7, 0, BOTTOM, 4, 0);
//                it.points += createKPosition(RIGHT, 7, 0, TOP, 4, 0);
//                it.setForeground("white".color);
//            ];
//            it.addText("*") => [
//                it.setForeground("white".color)
//                it.setPointPlacementData(createKPosition(LEFT, 10, 0, TOP, 0, 0), H_LEFT, V_TOP, 6, 0, 0, 0)
//            ]
//        ];
//    }
//
//// -------------------------------------------------------------------------
//
//
}
