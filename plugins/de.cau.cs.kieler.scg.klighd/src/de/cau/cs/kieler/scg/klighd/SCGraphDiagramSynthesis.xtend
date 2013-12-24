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
package de.cau.cs.kieler.scg.klighd

import com.google.inject.Guice
import com.google.inject.Injector
import de.cau.cs.kieler.core.annotations.StringAnnotation
import de.cau.cs.kieler.core.kexpressions.KExpressionsRuntimeModule
import de.cau.cs.kieler.core.kexpressions.KExpressionsStandaloneSetup
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.KPolygon
import de.cau.cs.kieler.core.krendering.KRoundedBendsPolyline
import de.cau.cs.kieler.core.krendering.KRoundedRectangle
import de.cau.cs.kieler.core.krendering.LineStyle
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
import de.cau.cs.kieler.kiml.options.PortConstraints
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.klay.layered.p4nodes.NodePlacementStrategy
import de.cau.cs.kieler.klay.layered.properties.LayerConstraint
import de.cau.cs.kieler.klay.layered.properties.Properties
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.scgbb.BasicBlock
import de.cau.cs.kieler.scgbb.SCGraphBB
import de.cau.cs.kieler.scgbb.SchedulingBlock
import de.cau.cs.kieler.scgdep.AbsoluteWrite_Read
import de.cau.cs.kieler.scgdep.AbsoluteWrite_RelativeWrite
import de.cau.cs.kieler.scgdep.Dependency
import de.cau.cs.kieler.scgdep.RelativeWrite_Read
import de.cau.cs.kieler.scgdep.SCGraphDep
import de.cau.cs.kieler.scgdep.Write_Write
import de.cau.cs.kieler.scgsched.SCGraphSched
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import javax.inject.Inject
import javax.inject.Singleton
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.serializer.ISerializer

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.extensions.SCGCopyExtensions
import de.cau.cs.kieler.scgsched.PotentialInstantaneousLoopProblem

/** 
 * SCCGraph KlighD synthesis 
 * 
 * @author ssm
 * @kieler.design 2013-10-23 proposed 
 * @kieler.rating 2013-10-23 proposed yellow
 */
 
 // Specialized SCG runtime module
 // This is necessary to override the default KExpression scope provider. 
 // IMPORTANT: The binding has to be a singleton!
class SCGRuntimeModule extends KExpressionsRuntimeModule {
    
    @Singleton
    override Class<? extends IScopeProvider> bindIScopeProvider() {
        return typeof(SCGKExpressionsScopeProvider);
    }    
}


// Main synthesis class
class SCGraphDiagramSynthesis extends AbstractDiagramSynthesis<SCGraph> {
        
    // -------------------------------------------------------------------------
    // -- GUICE 
    // -------------------------------------------------------------------------

    // Retrieve an injector and instances for serialization.
    private static var Injector guiceInjector;
    private static val KExpressionsStandaloneSetup setup = new KExpressionsStandaloneSetup() => [
        guiceInjector = Guice.createInjector(new SCGRuntimeModule);
        it.register(guiceInjector);        
    ]
//    private val Injector i = KExpressionsStandaloneSetup::createInjectorAndDoEMFRegistration();
    private static val SCGKExpressionsScopeProvider scopeProvider = guiceInjector.getInstance(typeof(SCGKExpressionsScopeProvider));
    private static val ISerializer serializer = guiceInjector.getInstance(typeof(ISerializer));
    
    
    // -------------------------------------------------------------------------
    // -- EXTENSIONS 
    // -------------------------------------------------------------------------
    
    @Inject
    extension KNodeExtensions
    
    @Inject
    extension KEdgeExtensions
    
    @Inject
    extension KLabelExtensions
    
    @Inject
    extension KRenderingExtensions

    @Inject
    extension KPortExtensions
    
    @Inject
    extension KContainerRenderingExtensions
    
    @Inject
    extension KPolylineExtensions
    
    @Inject
    extension KColorExtensions
    
    @Inject
    extension SCGraphShapes
    
    @Inject
    extension SCGExtensions
    
    @Inject
    extension SCGCopyExtensions

    // -------------------------------------------------------------------------
    // -- KLIGHD OPTIONS 
    // -------------------------------------------------------------------------
    
    private static val SynthesisOption SHOW_CAPTION
        = SynthesisOption::createCheckOption("Captions", true);
        
    private static val SynthesisOption SHOW_DEPENDENCIES
        = SynthesisOption::createCheckOption("Dependencies", true);

    private static val SynthesisOption LAYOUT_DEPENDENCIES
        = SynthesisOption::createCheckOption("Dependencies", false);

    private static val SynthesisOption SHOW_NONCONCURRENT
        = SynthesisOption::createCheckOption("Non-concurrent dependencies", false);

    private static val SynthesisOption SHOW_CONFLUENT
        = SynthesisOption::createCheckOption("Confluent dependencies", false);
        
    private static val SynthesisOption SHOW_BASICBLOCKS 
        = SynthesisOption::createCheckOption("Basic Blocks", false);

    private static val SynthesisOption SHOW_SCHEDULINGBLOCKS 
        = SynthesisOption::createCheckOption("Scheduling Blocks", true);

//    private static val TransformationOption SHOW_SINGLESCHEDULINGBLOCKS
//        = TransformationOption::createCheckOption("Show Single Scheduling Blocks", false);
        
    private static val SynthesisOption SHOW_SHADOW
        = SynthesisOption::createCheckOption("Shadow", true);
        
    private static val SynthesisOption ALIGN_TICK_START
        = SynthesisOption::createCheckOption("Tick start", true);

    private static val SynthesisOption ALIGN_ENTRYEXIT_NODES
        = SynthesisOption::createCheckOption("Entry & Exit nodes", true);
        
    private static val SynthesisOption SHOW_HIERARCHY
        = SynthesisOption::createCheckOption("Hierarchy", true);
        
    private static val SynthesisOption HIERARCHY_TRANSPARENCY 
        = SynthesisOption::createRangeOption("Hierarchy", 0f, 255f, 128f);

    private static val SynthesisOption CONTROLFLOW_THICKNESS 
        = SynthesisOption::createRangeOption("Controlflow thickness", 0.5f, 5f, 0.5f, 2f);
        
    private static val SynthesisOption ORIENTATION
        = SynthesisOption::createChoiceOption("Orientation", <String> newLinkedList("Top-Down", "Left-Right"), "Top-Down");

    private static val DEPENDENCYFILTERSTRING_WRITE_WRITE       = "write - write"
    private static val DEPENDENCYFILTERSTRING_ABSWRITE_RELWRITE = "abs. write - rel. write"
    private static val DEPENDENCYFILTERSTRING_WRITE_READ        = "write - read"
    private static val DEPENDENCYFILTERSTRING_RELWRITE_READ     = "rel. write - read"
    
    private static val SynthesisOption SHOW_DEPENDENCY_WRITE_WRITE 
        = SynthesisOption::createCheckOption(DEPENDENCYFILTERSTRING_WRITE_WRITE, true);

    private static val SynthesisOption SHOW_DEPENDENCY_ABSWRITE_RELWRITE 
        = SynthesisOption::createCheckOption(DEPENDENCYFILTERSTRING_ABSWRITE_RELWRITE, true);

    private static val SynthesisOption SHOW_DEPENDENCY_WRITE_READ 
        = SynthesisOption::createCheckOption(DEPENDENCYFILTERSTRING_WRITE_READ, true);

    private static val SynthesisOption SHOW_DEPENDENCY_RELWRITE_READ 
        = SynthesisOption::createCheckOption(DEPENDENCYFILTERSTRING_RELWRITE_READ, true);
        
    override public getDisplayedSynthesisOptions() {
        return newLinkedList(
            SynthesisOption::createSeparator("Visibility"),
            SHOW_CAPTION, 
            SHOW_HIERARCHY, 
            SHOW_DEPENDENCIES, 
            SHOW_NONCONCURRENT, 
            SHOW_CONFLUENT,
            SHOW_BASICBLOCKS, 
            SHOW_SCHEDULINGBLOCKS, 
//            SHOW_SINGLESCHEDULINGBLOCKS,
            SHOW_SHADOW,
            HIERARCHY_TRANSPARENCY,
            CONTROLFLOW_THICKNESS,            
            SynthesisOption::createSeparator("Dependency Filter"),
            SHOW_DEPENDENCY_WRITE_WRITE,
            SHOW_DEPENDENCY_ABSWRITE_RELWRITE,
            SHOW_DEPENDENCY_WRITE_READ,
            SHOW_DEPENDENCY_RELWRITE_READ,
            SynthesisOption::createSeparator("Alignment"),
            ALIGN_TICK_START, 
            ALIGN_ENTRYEXIT_NODES, 
            SynthesisOption::createSeparator("Layout"),
            LAYOUT_DEPENDENCIES, 
            ORIENTATION 
        );
    }
    
    override public getDisplayedLayoutOptions() {
        return newLinkedList(
            new Pair<IProperty<?>, List<?>>(LayoutOptions::SPACING, newArrayList(0, 255)),
            new Pair<IProperty<?>, List<?>>(Properties::NODE_PLACER, NodePlacementStrategy::values)
        );
    }
    

    // -------------------------------------------------------------------------
    // -- STATIC DECLARATIONS 
    // -------------------------------------------------------------------------#
    
    private static val byte KLIGHDSPACERCHARCODE = 255 as byte
    private static val String KLIGHDSPACERCHAR = "" + KLIGHDSPACERCHARCODE as char
    private static val String KLIGHDSPACER = KLIGHDSPACERCHAR + KLIGHDSPACERCHAR + KLIGHDSPACERCHAR + KLIGHDSPACERCHAR 
    
    private static val KColor SCCHARTSGRAY = RENDERING_FACTORY.createKColor()=>[it.red=240;it.green=240;it.blue=240];
    private static val KColor SCCHARTSBLUE1 = RENDERING_FACTORY.createKColor()=>[it.red=248;it.green=249;it.blue=253];
    private static val KColor SCCHARTSBLUE2 = RENDERING_FACTORY.createKColor()=>[it.red=205;it.green=220;it.blue=243];
    private static val KColor KEYWORD = RENDERING_FACTORY.createKColor()=>[it.red=115;it.green=0;it.blue=65];
    private static val KColor DARKGRAY = RENDERING_FACTORY.createKColor()=>[it.red=60;it.green=60;it.blue=60];
    private static val KColor BASICBLOCKBORDER = RENDERING_FACTORY.createKColor()=>[it.red=248;it.green=0;it.blue=253];
    private static val KColor SCHEDULINGBLOCKBORDER = RENDERING_FACTORY.createKColor()=>[it.red=128;it.green=0;it.blue=243];
    
    private static val KColor DEPENDENCY_ABSWRITEREAD = RENDERING_FACTORY.createKColor()=>[it.red = 0; it.green = 192; it.blue = 0;]
    private static val KColor DEPENDENCY_RELWRITEREAD = RENDERING_FACTORY.createKColor()=>[it.red = 0; it.green = 192; it.blue = 192;]
    private static val KColor DEPENDENCY_ABSWRITERELWRITE = RENDERING_FACTORY.createKColor()=>[it.red = 0; it.green = 0; it.blue = 255;]
    private static val KColor DEPENDENCY_ABSWRITEABSWRITE = RENDERING_FACTORY.createKColor()=>[it.red = 255; it.green = 0; it.blue = 0;]
    
    private static val KColor SCHEDULING_NOTSCHEDULABLE = RENDERING_FACTORY.createKColor()=>[it.red = 255; it.green = 0; it.blue = 0;]
    private static val KColor STANDARD_CONTROLFLOWEDGE = RENDERING_FACTORY.createKColor()=>[it.red = 0; it.green = 0; it.blue = 0;]
    private static val KColor SCHEDULING_CONTROLFLOWEDGE = RENDERING_FACTORY.createKColor()=>[it.red = 144; it.green = 144; it.blue = 144;]

    private static val KColor PROBLEM_POTENTIALLOOP_COLOR = RENDERING_FACTORY.createKColor()=>[it.red = 255; it.green = 0; it.blue = 0;]
    
    private static val String SCGPORTID_INCOMING = "incoming"
    private static val String SCGPORTID_OUTGOING = "outgoing"
    private static val String SCGPORTID_OUTGOING_THEN = "outgoingThen"
    private static val String SCGPORTID_OUTGOING_ELSE = "outgoingElse"
    private static val String SCGPORTID_HIERARCHY = "hierarchy"
    private static val String SCGPORTID_HIERARCHYEDGE = "hierarchyEdge"
    private static val String SCGPORTID_HIERARCHYPORTS = "hierarchyPorts"
    private static val String SCGPORTID_INCOMINGDEPENDENCY = "incomingDependency"
    private static val String SCGPORTID_OUTGOINGDEPENDENCY = "outgoingDependency"
    
    private static val String ANNOTATION_BRANCH = "branch"

    private static val int NODEGROUPING_HIERARCHY = 0
    private static val int NODEGROUPING_BASICBLOCK = 1
    private static val int NODEGROUPING_SCHEDULINGBLOCK = 2
    
    private static val int ORIENTATION_PORTRAIT = 0
    private static val int ORIENTATION_LANDSCAPE = 1
    
    private static val int CONTROLFLOW_SCHEDULINGEDGE_WIDTH = 4
    private static val int PROBLEM_POTENTIALLOOP_WIDTH = 4
    
    private KNode rootNode;
    private int orientation;


    // -------------------------------------------------------------------------
    // -- MAIN ENTRY POINT 
    // -------------------------------------------------------------------------

    override transform(SCGraph model) {
        scopeProvider.parent = model;
        return model.translate();
    }
    
    
    // -------------------------------------------------------------------------
    // -- TRANSFORM SCGraph 
    // -------------------------------------------------------------------------
    
    def dispatch KNode translate(SCGraph r) {
        return r.createNode().putToLookUpWith(r) => [ node |
            
            // Set root node and layout options.
            rootNode = node
            if (ORIENTATION.objectValue == "Left-Right") orientation = ORIENTATION_LANDSCAPE
                else orientation = ORIENTATION_PORTRAIT
            
            if (topdown()) node.setLayoutOption(LayoutOptions::DIRECTION, Direction::DOWN)
                else node.setLayoutOption(LayoutOptions::DIRECTION, Direction::RIGHT)
            node.setLayoutOption(LayoutOptions::SPACING, 25f);
            node.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
            node.addLayoutParam(Properties::THOROUGHNESS, 100)
            node.addLayoutParam(LayoutOptions::SEPARATE_CC, false);
            
            // Transform all children             
            for (s : r.nodes) {
                node.children += s.translate;
            }
        
            // For each node transform the control flow edges.
            // This must be done after all nodes have been created.
            for (s : r.nodes) {
                if (s instanceof Surface)    (s as Surface).depth?.translateTickEdge
                if (s instanceof Assignment) (s as Assignment).next?.translateControlFlow(SCGPORTID_OUTGOING)
                if (s instanceof Entry)      (s as Entry).next?.translateControlFlow(SCGPORTID_OUTGOING)
                if (s instanceof Exit)       (s as Exit).next?.translateControlFlow(SCGPORTID_OUTGOING)
                if (s instanceof Join)       (s as Join).next?.translateControlFlow(SCGPORTID_OUTGOING)
                if (s instanceof Depth)      (s as Depth).next?.translateControlFlow(SCGPORTID_OUTGOING)
                
                if (s instanceof Fork) {
                    (s as Fork).getNext().forEach[e | e.translateControlFlow(""); ]   
                } 
                
                if (s instanceof Conditional) {
                    (s as Conditional).then?.translateControlFlow(SCGPORTID_OUTGOING_THEN)
                    (s as Conditional).getElse()?.translateControlFlow(SCGPORTID_OUTGOING_ELSE)
                }
            }

            // If the dependency edges shall be layouted as well, they must be drawn before any 
            // hierarchy management. The hierarchy methods break edges in half and connect them via a port.
            if (r instanceof SCGraphDep && SHOW_DEPENDENCIES.booleanValue &&
                LAYOUT_DEPENDENCIES.booleanValue
            ) {
                r.eAllContents.filter(Dependency).forEach[ it.drawDependency ]
            }
            
            // Apply any hierarchy if the corresponding option is set. Since layout of edges between nodes
            // in different hierarchies is not supported, the synthesis splits these edges at the hierarchy
            // border and connects them via a port. Thus, a kind of pseudo hierarchical edge layout is archived. 
            if (SHOW_HIERARCHY.booleanValue) {    
                for (s : r.nodes.filter(typeof(Fork))) {
                    val threadEntries = s.getAllNext
                    for(t : threadEntries) {
                        if (t.target instanceof Entry) 
                            (t.target as Entry).getThreadNodes.createHierarchy(NODEGROUPING_HIERARCHY)
                    }
                }            
            }
            
            if (r instanceof SCGraphBB 
                /* && (SHOW_BASICBLOCKS.booleanValue || SHOW_SCHEDULINGBLOCKS.booleanValue)*/
            ) {
                (r as SCGraphBB).drawBasicBlocks            
            }
            
            if (r instanceof SCGraphSched) {
            	(r as SCGraphSched).drawProblems
            }
            
            // If dependency edge are drawn plain (without layout), draw them after the hierarchy management.
            if (r instanceof SCGraphDep  && 
                SHOW_DEPENDENCIES.booleanValue &&
                !LAYOUT_DEPENDENCIES.booleanValue
            ) {
                r.eAllContents.filter(Dependency).forEach[ it.drawDependency ]
            }     
        ]
    }
    

    // -------------------------------------------------------------------------
    // -- TRANSFORM Assignment 
    // -------------------------------------------------------------------------
    
    def dispatch KNode translate(Assignment s) {
        return s.createNode().putToLookUpWith(s) => [ node |
            // pre-defined values for assignments
            val cornerRadius = 2;
            val lineWidth = 1.0f;

            // straightforward rectangle drawing...
            val figure = node.addRoundedRectangle(cornerRadius, cornerRadius, lineWidth)
                .background = "white".color;

            (figure) => [
                node.setMinimalNodeSize(75, 25);
                if (SHOW_SHADOW.booleanValue) {
                    it.shadow = "black".color;
                }
//                it.setGridPlacement(1);
                if (s.valuedObject != null && s.assignment != null) {
                    var assignmentStr = s.valuedObject.name + " = " + serializer.serialize(s.assignment.copy.splitOperatorExpression).removeParenthesis
                    if (assignmentStr.contains("&") && assignmentStr.indexOf("&") != assignmentStr.lastIndexOf("&")) {
                        assignmentStr = assignmentStr.replaceAll("=", "=\n" + KLIGHDSPACER)
                        assignmentStr = assignmentStr.replaceAll("&", "&\n" + KLIGHDSPACER)
                                            
                    }
                    it.addText(assignmentStr).putToLookUpWith(s).setSurroundingSpace(4, 0, 2, 0)
                }
            ]
            
            // Add ports for control-flow and dependency routing.
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            if (topdown()) {
                node.addPort(SCGPORTID_INCOMING, 37, 0, 1, PortSide::NORTH)
                node.addPort(SCGPORTID_OUTGOING, 37, 24, 0, PortSide::SOUTH)          
                node.addPort(SCGPORTID_INCOMINGDEPENDENCY, 47, 0, 1, PortSide::NORTH)
                node.addPort(SCGPORTID_OUTGOINGDEPENDENCY, 47, 24, 0, PortSide::SOUTH)
            } else {
                node.addPort(SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST)
                node.addPort(SCGPORTID_OUTGOING, 75, 12.5f, 1, PortSide::EAST)          
                node.addPort(SCGPORTID_INCOMINGDEPENDENCY, 0, 19, 1, PortSide::WEST)
                node.addPort(SCGPORTID_OUTGOINGDEPENDENCY, 75, 19, 1, PortSide::EAST)
            }                      
        ]
    }
    

    // -------------------------------------------------------------------------
    // -- TRANSFORM Conditional 
    // -------------------------------------------------------------------------
    
    def dispatch KNode translate(Conditional s) {
        return s.createNode().putToLookUpWith(s) => [ node |
            
            // Draw a diamond figure for conditionals.
            val figure = node.addPolygon().createDiamondShape();

            figure => [ node.setMinimalNodeSize(75, 25);
                if (s.condition != null)  
                    node.KRendering.add(factory.createKText.of(serializer.serialize(s.condition.copy.splitOperatorExpression).removeParenthesis)
                        .setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 1, 0, BOTTOM, 1, 0)
                        .putToLookUpWith(s)
                    );
                if (SHOW_SHADOW.booleanValue) {
                    it.shadow = "black".color;
                }
            ]

            // Add ports for control-flow and dependency routing.
            var switchBranch = false
            val branchAnnotation = s.getAnnotation(ANNOTATION_BRANCH)
            if (branchAnnotation instanceof StringAnnotation) {
                val annotationValue = (branchAnnotation as StringAnnotation).getValue
                if (annotationValue == "switch") { switchBranch = true }
            }
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS)
            var KPort port
            if (topdown()) {
                node.addPort(SCGPORTID_INCOMING, 37, 0, 1, PortSide::NORTH)
                node.addPort(SCGPORTID_OUTGOING_ELSE, 37.5f, 24, 0, PortSide::SOUTH)
                if (switchBranch) 
                    port = node.addPort(SCGPORTID_OUTGOING_THEN, 7, 12.5f, 0, PortSide::WEST)
                else 
                    port = node.addPort(SCGPORTID_OUTGOING_THEN, 68, 12.5f, 0, PortSide::EAST)
                node.addPort(SCGPORTID_INCOMINGDEPENDENCY, 47, 0, 1, PortSide::NORTH)
                node.addPort(SCGPORTID_OUTGOINGDEPENDENCY, 47, 21, 1, PortSide::SOUTH)                      
                port.addLayoutParam(LayoutOptions::OFFSET, -1.5f)
            } else {
                node.addPort(SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST)
                node.addPort(SCGPORTID_OUTGOING_ELSE, 75, 12.5f, 0, PortSide::EAST)
                if (switchBranch) 
                    port = node.addPort(SCGPORTID_OUTGOING_THEN, 37.5f, 0, 0, PortSide::NORTH)
                else 
                    port = node.addPort(SCGPORTID_OUTGOING_THEN, 37.5f, 20, 0, PortSide::SOUTH)
                node.addPort(SCGPORTID_INCOMINGDEPENDENCY, 0, 19, 1, PortSide::WEST)
                node.addPort(SCGPORTID_OUTGOINGDEPENDENCY, 75, 19, 1, PortSide::EAST)                      
                port.addLayoutParam(LayoutOptions::OFFSET, 0f)
            }
        ]
    }


    // -------------------------------------------------------------------------
    // -- TRANSFORM Surface 
    // -------------------------------------------------------------------------

    def dispatch KNode translate(Surface s) {
        return s.createNode().putToLookUpWith(s) => [ node |

            // Draw a surface node...
            var KPolygon figure; 
            if (topdown()) { 
                figure = node.addPolygon().createSurfaceShape() 
                figure => [ node.setMinimalNodeSize(75, 25); 
                    if (SHOW_CAPTION.booleanValue)
                        node.KRendering.add(factory.createKText.of("surface").putToLookUpWith(s));
                    if (SHOW_SHADOW.booleanValue) {
                        it.shadow = "black".color;
                    }
                ]
            } else { 
                figure = node.addPolygon().createSurfaceLandscapeShape()
                figure => [ node.setMinimalNodeSize(75, 25); 
                    if (SHOW_CAPTION.booleanValue)
                        node.KRendering.add(factory.createKText.of("surface")
                            .setAreaPlacementData.from(LEFT, 10, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 3, 0)
                            .putToLookUpWith(s)
                        );
                    if (SHOW_SHADOW.booleanValue) {
                        it.shadow = "black".color;
                    }
                ]
            }
            
            // Add ports for control-flow/tick edge routing.
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            if (topdown()) {
                val port = node.addPort(SCGPORTID_INCOMING, 37, 0, 1, PortSide::NORTH)
                node.addPort(SCGPORTID_OUTGOING, 37, 25, 0, PortSide::SOUTH)          
                port.addLayoutParam(LayoutOptions::OFFSET, 0.5f)
            } else {
                val port = node.addPort(SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST)
                node.addPort(SCGPORTID_OUTGOING, 75, 12.5f, 0, PortSide::EAST)          
                port.addLayoutParam(LayoutOptions::OFFSET, 0.5f)
            }           
        ]
    }


    // -------------------------------------------------------------------------
    // -- TRANSFORM Depth 
    // -------------------------------------------------------------------------
    
    def dispatch KNode translate(Depth s) {
        return s.createNode().putToLookUpWith(s) => [ node |

            // If the corresponding option is set to true, depth nodes are placed in the first layer.
            if (ALIGN_TICK_START.booleanValue) {
                node.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::FIRST)
            }

            // Draw a depth figure;
            var KPolygon figure;
            if (topdown()) {            
                figure = node.addPolygon().createDepthShape();
                figure => [ node.setMinimalNodeSize(75, 25); 
                    if (SHOW_CAPTION.booleanValue)
                        node.KRendering.add(factory.createKText.of("depth")
                            .setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 4, 0)
                            .putToLookUpWith(s)
                        );
                    if (SHOW_SHADOW.booleanValue) {
                        it.shadow = "black".color;
                    }
                ]
            } else {
                figure = node.addPolygon().createDepthLandscapeShape();
                figure => [ node.setMinimalNodeSize(75, 25); 
                    if (SHOW_CAPTION.booleanValue)
                        node.KRendering.add(factory.createKText.of("depth")
                            .setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 10, 0, BOTTOM, 2, 0)
                            .putToLookUpWith(s)
                        );
                    if (SHOW_SHADOW.booleanValue) {
                        it.shadow = "black".color;
                    }
                ]
            }
            
            // Add ports for control-flow/tick edge routing.
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            if (topdown()) {
                node.addPort(SCGPORTID_INCOMING, 37,  0, 1, PortSide::NORTH)
                val port = node.addPort(SCGPORTID_OUTGOING, 37.5f, 25, 0, PortSide::SOUTH)          
                port.addLayoutParam(LayoutOptions::OFFSET, 0.5f)
            } else {
                node.addPort(SCGPORTID_INCOMING, 0,  12.5f, 1, PortSide::WEST)
                val port = node.addPort(SCGPORTID_OUTGOING, 75, 12.5f, 0, PortSide::EAST)          
                port.addLayoutParam(LayoutOptions::OFFSET, 0.5f)
            }
        ]
    }
    
    
    // -------------------------------------------------------------------------
    // -- TRANSFORM Entry 
    // -------------------------------------------------------------------------
    
    def dispatch KNode translate(Entry s) {
        return s.createNode().putToLookUpWith(s) => [ node |
            
            // If the corresponding option is set to true, exit nodes are placed in the first layer;
            if (ALIGN_ENTRYEXIT_NODES.booleanValue)
                node.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::FIRST)

            // Draw an ellipse figure for exit nodes...
            val figure = node.addEllipse();

            figure => [ node.setMinimalNodeSize(75, 25); 
                if (SHOW_CAPTION.booleanValue)
                    node.KRendering.add(factory.createKText.of("entry")
                        .setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 1, 0)
                        .putToLookUpWith(s)
                    );
                if (SHOW_SHADOW.booleanValue) {
                    it.shadow = "black".color;
                }
            ]

            // Add ports for control-flow routing.
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            if (topdown()) {
                node.addPort(SCGPORTID_INCOMING, 37,  0, 1, PortSide::NORTH)
                node.addPort(SCGPORTID_OUTGOING, 37, 25, 0, PortSide::SOUTH)
            } else {
                node.addPort(SCGPORTID_INCOMING, 0,  12.5f, 1, PortSide::WEST)
                node.addPort(SCGPORTID_OUTGOING, 75, 12.5f, 0, PortSide::EAST)
            }          
        ]
    }    
 

    // -------------------------------------------------------------------------
    // -- TRANSFORM Exit 
    // -------------------------------------------------------------------------
    
    def dispatch KNode translate(Exit s) {
        return s.createNode().putToLookUpWith(s) => [ node |
            
            // If the corresponding option is set to true, exit nodes are placed in the last layer.
            if (ALIGN_ENTRYEXIT_NODES.booleanValue)
                node.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::LAST)

            // Draw an ellipse for an exit node...
            val figure = node.addEllipse();

            figure => [ node.setMinimalNodeSize(75, 25);
                if (SHOW_CAPTION.booleanValue) 
                    node.KRendering.add(factory.createKText.of("exit")
                        .setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 1, 0)
                        .putToLookUpWith(s)
                    );
                if (SHOW_SHADOW.booleanValue) {
                    it.shadow = "black".color;
                }
            ]
            
            // Add ports for control-flow routing.
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            if (topdown()) {
                node.addPort(SCGPORTID_INCOMING, 37,  0, 1, PortSide::NORTH)
                node.addPort(SCGPORTID_OUTGOING, 37, 25, 0, PortSide::SOUTH)
            } else {
                node.addPort(SCGPORTID_INCOMING, 0,  12.5f, 1, PortSide::WEST)
                node.addPort(SCGPORTID_OUTGOING, 75, 12.5f, 0, PortSide::EAST)
            }          
        ]
    }


    // -------------------------------------------------------------------------
    // -- TRANSFORM Fork 
    // -------------------------------------------------------------------------
    
    def dispatch KNode translate(Fork s) {
        return s.createNode().putToLookUpWith(s) => [ node |

            // Draw a fork triangle...
            var KPolygon figure;
            if (topdown()) {
                figure = node.addPolygon().createTriangleShape();
                figure => [ node.setMinimalNodeSize(75, 25);
                    if (SHOW_CAPTION.booleanValue) 
                        node.KRendering.add(factory.createKText.of("fork")
                            .setAreaPlacementData.from(LEFT, 0, 0, TOP, 4, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0)
                            .putToLookUpWith(s)
                        );
                    if (SHOW_SHADOW.booleanValue) {
                        it.shadow = "black".color;
                    }
                ]
            } else {
                figure = node.addPolygon().createTriangleLandscapeShape();
                figure => [ node.setMinimalNodeSize(25, 75);
                    if (SHOW_CAPTION.booleanValue) 
                        node.KRendering.add(factory.createKText.of("fork")
                            .setAreaPlacementData.from(LEFT, 2, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 2, 0)
                            .putToLookUpWith(s)
                        );
                    if (SHOW_SHADOW.booleanValue) {
                        it.shadow = "black".color;
                    }
                ]
            }
            
            // Only add one port for incoming control flow edges.
            // Outgoing ports are added by the control flows.
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
            if (topdown()) {
                val port = node.addPort(SCGPORTID_INCOMING, 36, 0, 1, PortSide::NORTH)
                port.addLayoutParam(LayoutOptions::OFFSET, 0.5f)
            } else {
                val port = node.addPort(SCGPORTID_INCOMING, 0, 37.5f, 1, PortSide::WEST)
                port.addLayoutParam(LayoutOptions::OFFSET, 0.5f)
            }
        ]
    }


    // -------------------------------------------------------------------------
    // -- TRANSFORM Join 
    // -------------------------------------------------------------------------
    
    def dispatch KNode translate(Join s) {
        return s.createNode().putToLookUpWith(s) => [ node |

            // Draw a join triangle...
            var KPolygon figure
            if (topdown()) {
                figure = node.addPolygon().createTriangleShapeReversed();
                figure => [ node.setMinimalNodeSize(75, 25);
                    if (SHOW_CAPTION.booleanValue) 
                        node.KRendering.add(factory.createKText.of("join")
                            .setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 10, 0)
                            .putToLookUpWith(s)
                        );
                    if (SHOW_SHADOW.booleanValue) {
                        it.shadow = "black".color;
                    }
                ]
            } else {
                figure = node.addPolygon().createTriangleLandscapeShapeReversed();
                figure => [ node.setMinimalNodeSize(25, 75);
                    if (SHOW_CAPTION.booleanValue) 
                        node.KRendering.add(factory.createKText.of("join")
                            .setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 4, 0)
                            .putToLookUpWith(s)
                        );
                    if (SHOW_SHADOW.booleanValue) {
                        it.shadow = "black".color;
                    }
                ]
            }
            
            // Only add one port for an outgoing control flow edge.
            // Incoming ports are added by the control flows.
            node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
            if (topdown()) {
                val port = node.addPort(SCGPORTID_OUTGOING, 36, 25, 0, PortSide::SOUTH)
                port.addLayoutParam(LayoutOptions::OFFSET, -0.5f)
            } else {
                val port = node.addPort(SCGPORTID_OUTGOING, 0, 37.5f, 0, PortSide::EAST)
                port.addLayoutParam(LayoutOptions::OFFSET, -0.5f)
            }
        ]
    }


    // -------------------------------------------------------------------------
    // -- TRANSFORM Tick edge 
    // -------------------------------------------------------------------------
    
    // Draw a dotted line from the corresponding surface node to the given depth node.
    def KEdge translateTickEdge(Depth t) {
        return t.createNewEdge().putToLookUpWith(t) => [ edge |
            edge.source = t.surface?.node;
            edge.target = t.node;
            edge.sourcePort = t.surface?.node.getPort(SCGPORTID_OUTGOING)
            edge.targetPort = t.node.getPort(SCGPORTID_INCOMING)
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
      
            edge.addRoundedBendsPolyline(8, CONTROLFLOW_THICKNESS.intValue) => [
                    it.lineStyle = LineStyle::DOT;
            ]
        ]
    }
    
    // -------------------------------------------------------------------------
    // -- TRANSFORM Control flow 
    // -------------------------------------------------------------------------
    
    // Draw a control flow edge from one node to another.
    // Use the outgoing port description as port identifier. 
    def KEdge translateControlFlow(ControlFlow t, String outgoing) {
        if (t.target == null || t.eContainer == null) return null;
        
        return t.createNewEdge().putToLookUpWith(t) => [ edge |
            // Get and set source and target information.
            val sourceObj = t.eContainer
            val targetObj = t.target
            var sourceNode = sourceObj.node
            var targetNode = targetObj.node
            
            edge.source = sourceNode
            edge.target = targetNode
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)

            // If the source is a fork node, create a new port for this control flow and attach it.
            // Otherwise, use the outgoing port identified by the given parameter.
            if (sourceObj instanceof Fork) {
                edge.sourcePort = sourceObj.node.createPort("fork" + targetObj.hashCode()) => [
                    if (topdown()) it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::SOUTH)
                        else it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::EAST)
                    it.setPortSize(3,3)
                    it.addRectangle.invisible = true;
                    it.addLayoutParam(LayoutOptions::OFFSET, -3f)
                    sourceObj.node.ports += it
                ]
            } else {
                edge.sourcePort = sourceNode.getPort(outgoing)
            }
            
            // If the target is a join node, create a new port for this control flow and attach it.
            // Otherwise, use the default incoming port.
            if (targetObj instanceof Join) {
                edge.targetPort = targetObj.node.createPort("join" + sourceObj.hashCode()) => [
                    if (topdown()) it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::NORTH)
                        else it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::WEST)
                    it.setPortSize(3,3)
                    it.addRectangle.invisible = true;
                    it.addLayoutParam(LayoutOptions::OFFSET, -1.5f)
                    targetObj.node.ports += it
                ]
            } else {
                edge.targetPort = targetNode.getPort(SCGPORTID_INCOMING)
            }
      
            // Finally, draw the solid edge and add a decorator.
            edge.addRoundedBendsPolyline(8, CONTROLFLOW_THICKNESS.intValue) => [
                    it.lineStyle = LineStyle::SOLID
                    it.addArrowDecorator
                    if ((t.eContainer as Node).graph instanceof SCGraphSched) 
                        it.foreground = SCHEDULING_CONTROLFLOWEDGE.copy 
                        else it.foreground = STANDARD_CONTROLFLOWEDGE.copy
                    it.foreground.propagateToChildren = true
            ]
            
            // If the outgoing identifier indicates a 'then branch', add a 'then label'.
            if (outgoing == SCGPORTID_OUTGOING_THEN) {
                edge.createLabel.configureTailLabel('true', 9, KlighdConstants::DEFAULT_FONT_NAME)
            }               
        ]
    }    
    
    // -- Re-color an existing control flow
    def ControlFlow colorizeControlFlow(ControlFlow t, KColor color) {
        t.getAllEdges.forEach[
            val polyline = it.getData(typeof(KRoundedBendsPolyline)).foreground = color.copy
            polyline.foreground.propagateToChildren = true  
        ]        
        t
    }
    
    def ControlFlow thickenControlFlow(ControlFlow t, int width) {
        t.getAllEdges.forEach[
            val polyline = it.getData(typeof(KRoundedBendsPolyline)).lineWidth = width
            polyline.lineWidth.propagateToChildren = true  
        ]        
        t
    } 
     
    
    def Depth coloizeTickEdge(Depth t, KColor color) {
        t.getAllEdges.forEach[
            val polyline = it.getData(typeof(KRoundedBendsPolyline)).foreground = color.copy
            polyline.foreground.propagateToChildren = true  
        ]
        t
    }

    def Depth thickenTickEdge(Depth t, int width) {
        t.getAllEdges.forEach[
            val polyline = it.getData(typeof(KRoundedBendsPolyline)).lineWidth = width
            polyline.lineWidth.propagateToChildren = true  
        ]        
        t
    } 

    // -------------------------------------------------------------------------
    // -- TRANSFORM Dependency (edge) 
    // -------------------------------------------------------------------------

    // Draw a single dependency (edge).    
    def Dependency drawDependency(Dependency dependency) {
        
        // If non concurrent dependency are hidden and the given dependency is not concurrent, exit at once.
        if (!SHOW_NONCONCURRENT.booleanValue && !dependency.isConcurrent) return dependency;
        if (!SHOW_CONFLUENT.booleanValue && dependency.confluent) return dependency;
        
        if (!SHOW_DEPENDENCY_WRITE_WRITE.booleanValue && dependency instanceof Write_Write) return dependency; 
        if (!SHOW_DEPENDENCY_ABSWRITE_RELWRITE.booleanValue && dependency instanceof AbsoluteWrite_RelativeWrite) return dependency; 
        if (!SHOW_DEPENDENCY_WRITE_READ.booleanValue && dependency instanceof AbsoluteWrite_Read) return dependency; 
        if (!SHOW_DEPENDENCY_RELWRITE_READ.booleanValue && dependency instanceof RelativeWrite_Read) return dependency; 
        
        // Retrieve node information.
        val sourceNode = (dependency.eContainer as Node).node
        val targetNode = dependency.target.node
        
        // Draw the dashed dependency edge....
        sourceNode.createEdge("dependency " + sourceNode.toString + targetNode.toString) => [ edge |
            edge.source = sourceNode
            edge.target = targetNode
            edge.addRoundedBendsPolyline(8,2) => [
                // ... and use the predefined color for the different dependency types.    
                if (dependency instanceof AbsoluteWrite_Read) it.foreground = DEPENDENCY_ABSWRITEREAD.copy
                if (dependency instanceof RelativeWrite_Read) it.foreground = DEPENDENCY_RELWRITEREAD.copy
                if (dependency instanceof AbsoluteWrite_RelativeWrite) it.foreground = DEPENDENCY_ABSWRITERELWRITE.copy
                if (dependency instanceof Write_Write) it.foreground = DEPENDENCY_ABSWRITEABSWRITE.copy
                it.lineStyle = LineStyle::DASH
                it.addArrowDecorator
            ]  
            
            // If dependency edges are layouted, use the dependency ports to attach the edges.
            if (LAYOUT_DEPENDENCIES.booleanValue) {
                edge.sourcePort = sourceNode.getPort(SCGPORTID_OUTGOINGDEPENDENCY)
                edge.targetPort = targetNode.getPort(SCGPORTID_INCOMINGDEPENDENCY)
            } else {
                // Otherwise, add NO_LAYOUT as layout option to trigger node-to-node hierarchy-crossover
                // drawing.
                edge.setLayoutOption(LayoutOptions::NO_LAYOUT, true)
            }          
        ]
        
        dependency
    }


    // -------------------------------------------------------------------------
    // -- CREATE Hierarchy 
    // -------------------------------------------------------------------------

    // This method takes a list of nodes and creates a new container around them. 
    // All edges between nodes inside this container and nodes on the outside of the container a split up
    // and connected via ports on the container border. 
    // At the moment the new container is always a scg thread hierarchy container, but this will probably
    // change when basic blocks are re-introduced. 
    def createHierarchy(List<Node> nodes, int nodeGrouping) {
        // Gather mandatory information.
        val firstNode = nodes.head
        val kParent = firstNode.node.eContainer as KNode
        val kContainer = firstNode.createNode("hierarchy" + nodeGrouping.toString)
        val kNodeList = new ArrayList<KNode>
        nodes.forEach[e|kNodeList.add(e.node)]
        // Determine all interleaving edges...        
        val iSecEdges = new ArrayList<KEdge>
        for(rc : kNodeList) {
            iSecEdges.addAll(rc.outgoingEdges.filter[!kNodeList.contains(it.target)])
            iSecEdges.addAll(rc.incomingEdges.filter[!kNodeList.contains(it.source)])
        }
        
        // Set options for the container.
        kContainer.addLayoutParam(LayoutOptions::SPACING, 10.0f)
        if (topdown()) kContainer.addLayoutParam(LayoutOptions::DIRECTION, Direction::DOWN)
            else kContainer.addLayoutParam(LayoutOptions::DIRECTION, Direction::RIGHT)
        kContainer.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
        kContainer.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered")
        kContainer.addLayoutParam(LayoutOptions::SEPARATE_CC, false);      
        kContainer.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FREE);
        
        if (nodeGrouping == NODEGROUPING_HIERARCHY) {
            kContainer.addLayoutParam(LayoutOptions::SPACING, 25.0f)
            kContainer.addRoundedRectangle(5, 5, 0)
            kContainer.KRendering.foreground = SCCHARTSBLUE2.copy;
            kContainer.KRendering.foreground.alpha = Math.round(HIERARCHY_TRANSPARENCY.objectValue as Float)
            kContainer.KRendering.background = SCCHARTSBLUE2.copy;
            kContainer.KRendering.background.alpha = Math.round(HIERARCHY_TRANSPARENCY.objectValue as Float)
        }
        if (nodeGrouping == NODEGROUPING_BASICBLOCK) {
            kContainer.addLayoutParam(LayoutOptions::SPACING, 5.0f)
            kContainer.addRoundedRectangle(1, 1, 1) => [
                it.lineStyle = LineStyle::SOLID
            ]
            kContainer.KRendering.foreground = BASICBLOCKBORDER.copy;
            kContainer.KRendering.foreground.alpha = Math.round(255f)
            kContainer.KRendering.background = SCCHARTSBLUE2.copy;
            kContainer.KRendering.background.alpha = Math.round(0f)
        }
        if (nodeGrouping == NODEGROUPING_SCHEDULINGBLOCK) {
            kContainer.addLayoutParam(LayoutOptions::SPACING, 5.0f)
            kContainer.addRoundedRectangle(1, 1, 1) => [
                it.lineStyle = LineStyle::SOLID
            ]
            kContainer.KRendering.foreground = SCHEDULINGBLOCKBORDER.copy;
            kContainer.KRendering.foreground.alpha = Math.round(255f)
            kContainer.KRendering.background = SCCHARTSBLUE2.copy;
            kContainer.KRendering.background.alpha = Math.round(0f)
        }
                    
        // Add the nodes to the container.
        // They will be removed from the original parent!
        for(tn : nodes) {
            kContainer.children += tn.node
        }
        // Add the container to the original parent.
        kParent.children += kContainer

        // Determine all interleaving edges...        
//        val iSecEdges = new ArrayList<KEdge>
//        for(rc : kParent.children) {
//            iSecEdges.addAll(rc.outgoingEdges.filter[edge | kNodeList.contains(edge.target)])
//            iSecEdges.addAll(rc.incomingEdges.filter[edge | kNodeList.contains(edge.source)])
//        }
        // ... and split them up. This is done by re-routing the edge. The source of the edge is now the
        // container. A new edge is then created to attach the original source with the corresponding 
        // port on the border of the container.
        for(ne : iSecEdges) {
            val portName = SCGPORTID_HIERARCHYPORTS + ne.hashCode.toString + nodeGrouping.toString + 
              ne.source.hashCode.toString + kContainer.hashCode.toString
//            System.out.println("Creating helper port: " + portName)
            val hPort = kContainer.addHelperPort(portName)
            val origSource = ne.source
            val origSourcePort = ne.sourcePort            
            ne.source = kContainer
            ne.sourcePort = hPort 
            ne.semanticObject.createNewEdge() => [ 
                it.source = origSource
                it.sourcePort = origSourcePort
                it.target = kContainer
                it.targetPort = kContainer.getPort(portName)
                it.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
                it.addRoundedBendsPolyline(8, CONTROLFLOW_THICKNESS.intValue) => [
                    it.lineStyle = ne.KRendering.lineStyleValue
                    it.foreground = ne.KRendering.foreground
                ]
                it.labels.addAll(ne.labels)
            ]
            
        }     
        kContainer          
    }   
    
    def drawBasicBlocks(SCGraphBB r) {
        
        val schedulingBlockMapping = new HashMap<SchedulingBlock, KNode>  
        
        val bbContainerList = new HashMap<BasicBlock, KNode>()
        for (s : (r as SCGraphBB).basicBlocks) {
            if (SHOW_BASICBLOCKS.booleanValue) {
                val bbNodes = <Node> newLinkedList
                s.schedulingBlocks.forEach[bbNodes.addAll(it.nodes)]
                val bbContainer = bbNodes.createHierarchy(NODEGROUPING_BASICBLOCK)
                bbContainerList.put(s, bbContainer)
                val bbName = serializer.serialize(s.guards.head.reference)
              	bbContainer.addOutsideTopLeftNodeLabel(bbName, 9, KlighdConstants::DEFAULT_FONT_NAME).foreground = 
              		BASICBLOCKBORDER
            }
            if (SHOW_SCHEDULINGBLOCKS.booleanValue)
                for(schedulingBlock : s.schedulingBlocks) {
                    val sbContainer = schedulingBlock.nodes.createHierarchy(NODEGROUPING_SCHEDULINGBLOCK)
                    schedulingBlockMapping.put(schedulingBlock, sbContainer)
	                val sbName = serializer.serialize(schedulingBlock.guard.reference)
    	          	sbContainer.addOutsideTopLeftNodeLabel(sbName, 9, KlighdConstants::DEFAULT_FONT_NAME).foreground = 
        	      		SCHEDULINGBLOCKBORDER
                }                    
        }
        
        if (/*SHOW_SCHEDULINGBLOCKS.booleanValue && */r instanceof SCGraphSched) {
            var Node source = null
            var Node target = null 
            for(node : (r as SCGraphSched).getSchedules.head.scheduleNodes) {
                target = node 
                if (target != null && source != null) {
                    
                    val controlFlows = source.getControlFlows(target)
                    if (controlFlows.size>0) {
                        controlFlows.forEach[it.colorizeControlFlow(SCHEDULINGBLOCKBORDER)]    
                        controlFlows.forEach[it.thickenControlFlow(CONTROLFLOW_SCHEDULINGEDGE_WIDTH)]
                    } else if (target instanceof Depth) {
                        (target as Depth).coloizeTickEdge(SCHEDULINGBLOCKBORDER)                    
                        (target as Depth).thickenTickEdge(CONTROLFLOW_SCHEDULINGEDGE_WIDTH)                    
                    } else {
                        val sourceF = source.node
                        val targetF = target.node
                        source.createEdge("schedule " + source.toString + target.toString) => [ edge |
                            edge.source = sourceF
                            edge.target = targetF
                            edge.addRoundedBendsPolyline(8, CONTROLFLOW_SCHEDULINGEDGE_WIDTH) => [
                                it.foreground = SCHEDULINGBLOCKBORDER.copy
//                                it.foreground.alpha = 144
                                it.addArrowDecorator
                            ]  
                            edge.setLayoutOption(LayoutOptions::NO_LAYOUT, true)
                        ]
                    }
                }
                source = target
            }

            
            // not schedulable blocks!
            if (SHOW_SCHEDULINGBLOCKS.booleanValue && (r as SCGraphSched).unschedulable) {
                val usBlocks = r.allSchedulingBlocks()
                (r as SCGraphSched).getSchedules.head.getSchedulingBlocks.forEach[usBlocks.remove(it)]
                usBlocks.forEach[
                    val node = schedulingBlockMapping.get(it)
                    node.getData(typeof(KRoundedRectangle)) => [
                        it.lineStyle = LineStyle::SOLID
                        it.foreground = SCHEDULING_NOTSCHEDULABLE.copy
                    ]
                    node.KRendering.background = SCHEDULING_NOTSCHEDULABLE.copy
                    node.KRendering.background.alpha = 128
                ]
            }
        }
    }
    
    def drawProblems(SCGraphSched scg) {
    	scg.problems.filter(typeof(PotentialInstantaneousLoopProblem)).forEach[
    		it.controlFlows.forEach[
    			it.colorizeControlFlow(PROBLEM_POTENTIALLOOP_COLOR)
    			it.thickenControlFlow(PROBLEM_POTENTIALLOOP_WIDTH)
    		]
    	]
    }
   

    // -------------------------------------------------------------------------
    // -- HELPER: Add ports 
    // -------------------------------------------------------------------------

    def KPort addPort(KNode node, String mapping, float x, float y, int size, PortSide side) {
      node.createPort(mapping) => [
         it.addLayoutParam(LayoutOptions::PORT_SIDE, side);
         it.setPortPos(x, y)
         it.setPortSize(size,size)
         it.addRectangle.invisible = true;
         node.ports += it
      ]
    }
    
    def KPort addPortFixedSide(KNode node, String mapping, PortSide side) {
        node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
        node.addPort(mapping, 37, 0, 3, side)
    }  
    
    def KPort addHelperPort(KNode node, String mapping) {
      node.createPort(mapping) => [
         node.ports += it
      ]
    }  
   

    // -------------------------------------------------------------------------
    // -- HELPER: Remove parenthesis 
    // -------------------------------------------------------------------------
    
    def String removeParenthesis(String str) {
        var String s = "";
        if (str.contains("&")) {
          return str.replaceAll("\\(\\(", "(").replaceAll("\\)\\)", ")");  
        } 
        if (str.startsWith("(") && str.endsWith(")")) {
            s = str.substring(1)
            s = s.substring(0, s.length - 1);
        } else {
  	 		s = str
        }
        return s;
    }
   
    def boolean topdown() {
        orientation == ORIENTATION_PORTRAIT
    }
   
    def boolean leftright() {
        orientation == ORIENTATION_LANDSCAPE
    }
}
