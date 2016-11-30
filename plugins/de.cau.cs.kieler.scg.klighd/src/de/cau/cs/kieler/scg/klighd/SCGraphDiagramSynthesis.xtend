/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
package de.cau.cs.kieler.scg.klighd

import com.google.inject.Injector
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kico.CompilationResult
import de.cau.cs.kieler.kico.KiCoProperties
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.krendering.KColor
import de.cau.cs.kieler.klighd.krendering.KPolygon
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KRoundedBendsPolyline
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlDependency
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.DataDependencyType
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.ExpressionDependency
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.GuardDependency
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScheduleDependency
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGSerializeHRExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.processors.analyzer.PotentialInstantaneousLoopResult
import de.cau.cs.kieler.scg.transformations.guardExpressions.AbstractGuardExpressions
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Properties
import java.util.Set
import javax.inject.Inject
import org.eclipse.elk.alg.layered.p2layers.LayeringStrategy
import org.eclipse.elk.alg.layered.p4nodes.NodePlacementStrategy
import org.eclipse.elk.alg.layered.properties.LayerConstraint
import org.eclipse.elk.alg.layered.properties.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.core.options.PortAlignment
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortSide
import org.eclipse.elk.graph.KEdge
import org.eclipse.elk.graph.KNode
import org.eclipse.elk.graph.KPort
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.serializer.ISerializer

import static de.cau.cs.kieler.scg.SCGAnnotations.*

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.SCGAnnotations
import static extension de.cau.cs.kieler.scg.SCGAnnotations.*
import com.google.common.collect.Multimap

/** 
 * SCCGraph KlighD synthesis class. It contains all method mandatory to handle the visualization of
 * all predefined types of SC graphs.
 * 
 * @author ssm
 * @kieler.design 2013-10-23 proposed 
 * @kieler.rating 2013-10-23 proposed yellow
 */
class SCGraphDiagramSynthesis extends AbstractDiagramSynthesis<SCGraph> {

    // -------------------------------------------------------------------------
    // -- Extensions 
    // -------------------------------------------------------------------------
    //    extension KRenderingFactory = KRenderingFactory.eINSTANCE
    /** Inject node extensions. */
    @Inject
    extension KNodeExtensions

    /** Inject edge extensions. */
    @Inject
    extension KEdgeExtensions

    /** Inject label extensions. */
    @Inject
    extension KLabelExtensions

    /** Inject rendering extensions. */
    @Inject
    extension KRenderingExtensions

    /** Inject port extensions. */
    @Inject
    extension KPortExtensions

    /** Inject container rendering extensions. */
    @Inject
    extension KContainerRenderingExtensions

    /** Inject polyline extensions. */
    @Inject
    extension KPolylineExtensions

    /** Inject color extensions. */
    @Inject
    extension KColorExtensions

    /** Inject SCGraph shapes extensions. */
    @Inject
    extension AnnotationsExtensions

    /** Inject SCG shapes extensions. */
    @Inject
    extension SCGraphShapes

    /** Inject SCG extensions. */
    @Inject
    extension SCGCoreExtensions
    
    @Inject
    extension SCGControlFlowExtensions

    @Inject
    extension SCGThreadExtensions
    
    @Inject
    extension SCGSerializeHRExtensions

    // -------------------------------------------------------------------------
    // -- KlighD Options
    // -------------------------------------------------------------------------
    /** Show caption */
    private static val SynthesisOption SHOW_CAPTION = SynthesisOption::createCheckOption("Captions", true);

    /** Show dependencies */
    private static val SynthesisOption SHOW_DEPENDENCIES = SynthesisOption::createCheckOption("Dependencies", true);

    /** Layout dependencies */
    private static val SynthesisOption LAYOUT_DEPENDENCIES = SynthesisOption::createCheckOption("Dependencies", false);

    /** Layout separate cc */
    private static val SynthesisOption LAYOUT_SEPARATE_CC = SynthesisOption::createCheckOption("Separate CC", false);

    /** Show non concurrent dependencies */
    private static val SynthesisOption SHOW_NONCONCURRENT = SynthesisOption::createCheckOption(
        "Non-concurrent dependencies", false);

    /** Show confluent dependencies */
    private static val SynthesisOption SHOW_CONFLUENT = SynthesisOption::createCheckOption("Confluent dependencies",
        false);

    /** Show basic blocks */
    private static val SynthesisOption SHOW_BASICBLOCKS = SynthesisOption::createCheckOption("Basic Blocks", false);

    /** Show scheduling blocks */
    private static val SynthesisOption SHOW_SCHEDULINGBLOCKS = SynthesisOption::createCheckOption("Scheduling Blocks",
        true);

    /** Show scheduling path */
    private static val SynthesisOption SHOW_SCHEDULINGPATH = SynthesisOption::createCheckOption("Scheduling path", true);

    /** Show potential problems */
    private static val SynthesisOption SHOW_POTENTIALPROBLEMS = SynthesisOption::createCheckOption("Potential problems",
        true);
        
    private static val SynthesisOption USE_ADAPTIVEZOOM = SynthesisOption::createCheckOption("Adaptive Zoom", false);

    /** Show shadow */
    private static val SynthesisOption SHOW_SHADOW = SynthesisOption::createCheckOption("Shadow", true);

    /** Align tick start */
    private static val SynthesisOption ALIGN_TICK_START = SynthesisOption::createCheckOption("Tick start", true);

    /** Align entry/exit */
    private static val SynthesisOption ALIGN_ENTRYEXIT_NODES = SynthesisOption::createCheckOption("Entry & Exit nodes",
        true);

    /** Show hierarchy */
    private static val SynthesisOption SHOW_HIERARCHY = SynthesisOption::createCheckOption("Hierarchy", true);

    /** Hierarchy transparency */
    private static val SynthesisOption HIERARCHY_TRANSPARENCY = SynthesisOption::createRangeOption("Hierarchy", 0f, 255f,
        128f);

    /** Control flow thickness */
    private static val SynthesisOption CONTROLFLOW_THICKNESS = SynthesisOption::createRangeOption(
        "Controlflow thickness", 0.5f, 5f, 0.5f, 2f);

    /** Graph orientation */
    private static val SynthesisOption ORIENTATION = SynthesisOption::createChoiceOption("Orientation",
        <String>newLinkedList("Top-Down", "Left-Right"), "Top-Down");

    // Text constants for the dependency types filter
    private static val DEPENDENCYFILTERSTRING_WRITE_WRITE = "write - write"
    private static val DEPENDENCYFILTERSTRING_ABSWRITE_RELWRITE = "abs. write - rel. write"
    private static val DEPENDENCYFILTERSTRING_WRITE_READ = "write - read"
    private static val DEPENDENCYFILTERSTRING_RELWRITE_READ = "rel. write - read"

    /** Show write-write dependencies */
    private static val SynthesisOption SHOW_DEPENDENCY_WRITE_WRITE = SynthesisOption::createCheckOption(
        DEPENDENCYFILTERSTRING_WRITE_WRITE, true);

    /** Show sausage folding */
    private static val SynthesisOption SHOW_SAUSAGE_FOLDING = SynthesisOption::createCheckOption(
        "Sausage Folding", true);

    /** Show absolute write-relative write dependencies */
    private static val SynthesisOption SHOW_DEPENDENCY_ABSWRITE_RELWRITE = SynthesisOption::
        createCheckOption(DEPENDENCYFILTERSTRING_ABSWRITE_RELWRITE, true);

    /** Show write-read dependencies */
    private static val SynthesisOption SHOW_DEPENDENCY_WRITE_READ = SynthesisOption::createCheckOption(
        DEPENDENCYFILTERSTRING_WRITE_READ, true);

    /** Show relative write-read dependencies */
    private static val SynthesisOption SHOW_DEPENDENCY_RELWRITE_READ = SynthesisOption::
        createCheckOption(DEPENDENCYFILTERSTRING_RELWRITE_READ, true);

    /**  
     * Returns a list of KlighD visualization options. Called by KlighD.
     * 
     * @return Returns a list of KlighD visualization options.
     */
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
            SHOW_SCHEDULINGPATH,
            SHOW_POTENTIALPROBLEMS,
            USE_ADAPTIVEZOOM,
            SHOW_SHADOW,
            HIERARCHY_TRANSPARENCY,
            CONTROLFLOW_THICKNESS,
            SynthesisOption::createSeparator("Dependency Filter"),
            SHOW_DEPENDENCY_WRITE_WRITE,
            SHOW_SAUSAGE_FOLDING,
            SHOW_DEPENDENCY_ABSWRITE_RELWRITE,
            SHOW_DEPENDENCY_WRITE_READ,
            SHOW_DEPENDENCY_RELWRITE_READ,
            SynthesisOption::createSeparator("Alignment"),
            ALIGN_TICK_START,
            ALIGN_ENTRYEXIT_NODES,
            SynthesisOption::createSeparator("Layout"),
            LAYOUT_DEPENDENCIES,
            LAYOUT_SEPARATE_CC,
            ORIENTATION
        );
    }

    /**
     * Returns a list of layout options. Called by KlighD.<br>
     * SCG Synthesis uses the predefined SPACING and NODE_PLACER options. 
     * 
     * @return Returns a list of layout options.
     */
    override public getDisplayedLayoutOptions() {
        return newLinkedList(
            specifyLayoutOption(CoreOptions::SPACING_NODE, newArrayList(0, 255)),
            specifyLayoutOption(LayeredOptions::NODE_PLACEMENT_STRATEGY, NodePlacementStrategy::values)
        );
    }
    

    // -------------------------------------------------------------------------
    // -- Constants
    // -------------------------------------------------------------------------

    /** Color codes */
    private static val KColor SCCHARTSBLUE = RENDERING_FACTORY.createKColor() =>
        [it.red = 205; it.green = 220; it.blue = 243];
    private static val KColor REGIONLABEL = RENDERING_FACTORY.createKColor() =>
        [it.red = 64; it.green = 80; it.blue = 128];
    private static val KColor BASICBLOCKBORDER = RENDERING_FACTORY.createKColor() =>
        [it.red = 248; it.green = 0; it.blue = 253];
    private static val KColor SCHEDULINGBLOCKBORDER = RENDERING_FACTORY.createKColor() =>
        [it.red = 128; it.green = 0; it.blue = 243];
    private static val KColor DEPENDENCY_ABSWRITEREAD = RENDERING_FACTORY.createKColor() =>
        [it.red = 0; it.green = 192; it.blue = 0;]
    private static val KColor DEPENDENCY_RELWRITEREAD = RENDERING_FACTORY.createKColor() =>
        [it.red = 0; it.green = 192; it.blue = 192;]
    private static val KColor DEPENDENCY_ABSWRITERELWRITE = RENDERING_FACTORY.createKColor() =>
        [it.red = 0; it.green = 0; it.blue = 255;]
    private static val KColor DEPENDENCY_ABSWRITEABSWRITE = RENDERING_FACTORY.createKColor() =>
        [it.red = 255; it.green = 0; it.blue = 0;]
    private static val KColor DEPENDENCY_CONTROL = RENDERING_FACTORY.createKColor() =>
        [it.red = 0; it.green = 192; it.blue = 192;]
    private static val KColor DEPENDENCY_EXPRESSION = RENDERING_FACTORY.createKColor() =>
        [it.red = 168; it.green = 128; it.blue = 96;]
    private static val KColor DEPENDENCY_GUARD = RENDERING_FACTORY.createKColor() =>
        [it.red = 240; it.green = 128; it.blue = 128;]
    private static val KColor SCHEDULING_NOTSCHEDULABLE = RENDERING_FACTORY.createKColor() =>
        [it.red = 255; it.green = 0; it.blue = 0;]
    private static val KColor STANDARD_CONTROLFLOWEDGE = RENDERING_FACTORY.createKColor() =>
        [it.red = 0; it.green = 0; it.blue = 0;]
//    private static val KColor SCHEDULING_CONTROLFLOWEDGE = RENDERING_FACTORY.createKColor() =>
//        [it.red = 144; it.green = 144; it.blue = 144;]
    private static val KColor SCHEDULING_SCHEDULINGEDGE = RENDERING_FACTORY.createKColor() =>
        [it.red = 128; it.green = 0; it.blue = 253;]
    private static val KColor SCHEDULING_DEADCODE = RENDERING_FACTORY.createKColor() =>
        [it.red = 128; it.green = 128; it.blue = 128;]
    private static val int SCHEDULING_SCHEDULINGEDGE_ALPHA = 96
    private static val KColor SCHEDULEBORDER = RENDERING_FACTORY.createKColor() =>
        [it.red = 0; it.green = 0; it.blue = 128;]

    private static val KColor PROBLEM_COLOR = KRenderingFactory::eINSTANCE.createKColor() => 
        [it.red = 255; it.green = 0; it.blue = 0;]
    private static val int PROBLEM_WIDTH = 4    

    /** Constants for semantic object mapping */
    private static val String SCGPORTID_INCOMING = "incoming"
    private static val String SCGPORTID_OUTGOING = "outgoing"
    private static val String SCGPORTID_OUTGOING_THEN = "outgoingThen"
    private static val String SCGPORTID_OUTGOING_ELSE = "outgoingElse"
    private static val String SCGPORTID_HIERARCHYPORTS = "hierarchyPorts"
    private static val String SCGPORTID_INCOMINGDEPENDENCY = "incomingDependency"
    private static val String SCGPORTID_OUTGOINGDEPENDENCY = "outgoingDependency"
    private static val String ANNOTATIONRECTANGLE = "caRectangle"

    /** 
	 * Constants for hierarchical node groups
	 * Since hierarchy, basic blocks and scheduling blocks use the same mechanism to group nodes and draw hierarchical edges, 
	 * use this constants to define the desired kind of group. 
	 */
    private static val int NODEGROUPING_HIERARCHY = 0
    private static val int NODEGROUPING_BASICBLOCK = 1
    private static val int NODEGROUPING_SCHEDULINGBLOCK = 2
    private static val int NODEGROUPING_GUARDBLOCK = 3
    private static val int NODEGROUPING_SCHEDULE = 4

    /** Constants for the graph orientation */
    private static val int ORIENTATION_PORTRAIT = 0
    private static val int ORIENTATION_LANDSCAPE = 1

    /** Thickness of an highlighted scheduling edge */
    private static val int CONTROLFLOW_SCHEDULINGEDGE_WIDTH = 4

    /** Figure constants */
    private static val int MINIMALWIDTH = 75
    private static val int MINIMALHEIGHT = 25
    private static val float CORNERRADIUS = 2.0f
    private static val float LINEWIDTH = 1.0f

    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
    /** The root node */
    private KNode rootNode;
    
    private CompilationResult compilationResult;
    private var Set<Node> PIL_Nodes = <Node> newHashSet

    /** The selected orientation */
    private int orientation
    
    private int sequentializedSCGCounter = 0
    
    private SCGraph SCGraph
    protected boolean isSCPDG
    protected boolean isGuardSCG

    // -------------------------------------------------------------------------
    // -- Main Entry Point 
    // -------------------------------------------------------------------------
    /**
	 * This method is called by KlighD. Trigger your visualization here.
	 * 
	 * @param model
	 * 			the model in question
	 * @return Returns the root KNode.
	 */
    override transform(SCGraph model) {

        compilationResult = this.usedContext.getProperty(KiCoProperties.COMPILATION_RESULT)
        if (compilationResult != null) {
            val PILR = compilationResult.getAuxiliaryData(PotentialInstantaneousLoopResult).head
            if (PILR != null) PIL_Nodes += PILR.criticalNodes
        }

        // Invoke the synthesis.
        SCGraph = model
        val timestamp = System.currentTimeMillis
        System.out.println("Started SCG synthesis...")
        val newModel = model.synthesize();
        var time = (System.currentTimeMillis - timestamp) as float
        System.out.println("SCG synthesis finished (time elapsed: "+(time / 1000)+"s).")  
        
        return newModel
    }

    // -------------------------------------------------------------------------
    // -- Synthesis 
    // -------------------------------------------------------------------------
    /**
     * Is triggered when a SCGrpah must be synthesized.
     * 
     * @param scg
     * 			the SCG in question
     * @return Returns the top level KNode.
     */
    private def dispatch KNode synthesize(SCGraph scg) {
        return scg.createNode().associateWith(scg) => [ node |
            // Set root node and layout options.
            rootNode = node
            isSCPDG = scg.hasAnnotation(ANNOTATION_SCPDGTRANSFORMATION)
            isGuardSCG = scg.hasAnnotation(SCGFeatures::GUARDS_ID) 
            if(ORIENTATION.objectValue == "Left-Right") orientation = ORIENTATION_LANDSCAPE else orientation = ORIENTATION_PORTRAIT
            if (topdown)
                node.setLayoutOption(CoreOptions::DIRECTION, Direction::DOWN)
            else
                node.setLayoutOption(CoreOptions::DIRECTION, Direction::RIGHT)
            node.setLayoutOption(CoreOptions::SPACING_NODE, 25f);
            node.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
            node.setLayoutOption(CoreOptions::ALGORITHM, "org.eclipse.elk.layered");
            node.setLayoutOption(LayeredOptions::THOROUGHNESS, 100)
            node.setLayoutOption(CoreOptions::SEPARATE_CONNECTED_COMPONENTS, false);
            if (scg.hasAnnotation(ANNOTATION_SEQUENTIALIZED)) {
                node.setLayoutOption(LayeredOptions::SAUSAGE_FOLDING, true)
                node.setLayoutOption(LayeredOptions::LAYERING_STRATEGY, LayeringStrategy::LONGEST_PATH)
            }
            
            
            // Sausage folding on/off
            if ((SHOW_SAUSAGE_FOLDING.booleanValue) && scg.hasAnnotation(SCGFeatures::SEQUENTIALIZE_ID)) {
                node.addLayoutParam(LayeredOptions::LAYERING_STRATEGY, LayeringStrategy::LONGEST_PATH);
                node.addLayoutParam(LayeredOptions::SAUSAGE_FOLDING, true);
            }
    
            // Added as suggested by uru (mail to cmot, 11.11.2016)            
            node.addLayoutParam(LayeredOptions::NODE_PLACEMENT_STRATEGY, NodePlacementStrategy.NETWORK_SIMPLEX);
            
            
            val threadTypes = <Entry, ThreadPathType> newHashMap
            
            // Synthesize all children             
            for (n : scg.nodes) { 
                if (n instanceof Surface) { node.children += n.synthesize }
                if (n instanceof Assignment) { 
                    val aNode = n.synthesize
                    node.children += aNode
//                    if ((n as Assignment).hasAnnotation(AbstractSequentializer::ANNOTATION_CONDITIONALASSIGNMENT)) {
//                        val bNode = (n as Assignment).synthesizeConditionalAssignmentAnnotation
//                        node.children += bNode
//                        aNode.synthesizeConditionalAssignmentLink(bNode)
//                    }                    
                }
                if (n instanceof Entry) { 
                    if (n.hasAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE)) {
                        threadTypes.put((n as Entry), n.getStringAnnotationValue(ANNOTATION_CONTROLFLOWTHREADPATHTYPE).fromString2)
                    }
                	node.children += n.synthesize
                }
                if (n instanceof Exit) { 
                	node.children += n.synthesize
                }
                if (n instanceof Join) { node.children += n.synthesize }
                if (n instanceof Depth) { node.children += n.synthesize }
                if (n instanceof Fork) { node.children += n.synthesize }
                if (n instanceof Conditional) { node.children += n.synthesize }
            }
            // For each node transform the control flow edges.
            // This must be done after all nodes have been created.
            scg.nodes.forEach [
                if(it instanceof Surface) (it as Surface).depth?.synthesizeTickEdge
                if(it instanceof Assignment) (it as Assignment).next?.synthesizeControlFlow(SCGPORTID_OUTGOING)
                if(it instanceof Entry) (it as Entry).next?.synthesizeControlFlow(SCGPORTID_OUTGOING)
                if(it instanceof Exit) (it as Exit).next?.synthesizeControlFlow(SCGPORTID_OUTGOING)
                if(it instanceof Join) (it as Join).next?.synthesizeControlFlow(SCGPORTID_OUTGOING)
                if(it instanceof Depth) (it as Depth).next?.synthesizeControlFlow(SCGPORTID_OUTGOING)
                if(it instanceof Fork) (it as Fork).getNext().forEach[synthesizeControlFlow("")]
                if (it instanceof Conditional) {
                    (it as Conditional).then?.synthesizeControlFlow(SCGPORTID_OUTGOING_THEN)
                    (it as Conditional).^else?.synthesizeControlFlow(SCGPORTID_OUTGOING_ELSE)
                }
                
                // If the dependency edges shall be layouted as well, they must be drawn before any 
                // hierarchy management. The hierarchy methods break edges in half and connect them via a port.
                if (scg instanceof SCGraph && SHOW_DEPENDENCIES.booleanValue && 
                	(LAYOUT_DEPENDENCIES.booleanValue || isSCPDG)
                ) {
//                    if (it instanceof Assignment) {
//                        (it as Assignment).
                        it.dependencies.forEach[ (it as Dependency).synthesizeDependency ]
//                    }
                }
            ]
            
            if (scg.hasAnnotation(ANNOTATION_SEQUENTIALIZED)) {
            	sequentializedSCGCounter = 0
            	val controlFlows = <ControlFlow> newArrayList => [ it += (scg.nodes.head as Entry).next ]
            	while(!controlFlows.empty) {
            		val nextNode = controlFlows.head.target
            		controlFlows.remove(0)
            		
            		if (nextNode instanceof Assignment) {
		            	sequentializedSCGCounter = sequentializedSCGCounter + 1
        		    	if (sequentializedSCGCounter > 10) {
            				sequentializedSCGCounter = 0
//            				nextNode.getNode.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::FIRST)
            			}
            			controlFlows += (nextNode as Assignment).next
            		}
             		else if (nextNode instanceof Conditional) {
             			controlFlows += (nextNode as Conditional).^else
             		}
             		else if (nextNode instanceof Exit) {
             			controlFlows.clear;
             		}
            	}
            }
            
            // Apply any hierarchy if the corresponding option is set. Since layout of edges between nodes
            // in different hierarchies is not supported, the synthesis splits these edges at the hierarchy
            // border and connects them via a port. Thus, a kind of pseudo hierarchical edge layout is archived. 
            if (SHOW_HIERARCHY.booleanValue) {
                scg.nodes.filter(typeof(Fork)).forEach[
                    allNext.map[target].filter(typeof(Entry)).forEach [ entry |
                        if (entry != null) {
                            var label = ""
                            if (entry.hasAnnotation(ANNOTATION_LABEL)) {
                                label = entry.getStringAnnotationValue(ANNOTATION_LABEL)
                            } else {
                                label = entry.getStringAnnotationValue(ANNOTATION_REGIONNAME)
                            }
                            val regionLabel = label
                            entry.getThreadNodes.createHierarchy(NODEGROUPING_HIERARCHY, null) => [
                            	var text = ""
                                val threadPathType = threadTypes.get(entry)
                                if (threadPathType != null) {
                                    if (!regionLabel.nullOrEmpty) text = regionLabel + " - "
                                    text = text + threadPathType.toString2
                                }
                                
                                    addInsideTopLeftNodeLabel(text, 10, KlighdConstants::DEFAULT_FONT_NAME) => [
                                        it.KRendering.setForeground(REGIONLABEL.copy);
                                        if (USE_ADAPTIVEZOOM.booleanValue) it.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70)
                                    ]
                                    
                                    
                            ]
                        }
                    ]]
            }
            // Draw basic blocks if present.
            if (scg.basicBlocks.size>0) scg.synthesizeBasicBlocks
            
            // If dependency edge are drawn plain (without layout), draw them after the hierarchy management.
            if (SHOW_DEPENDENCIES.booleanValue && !(LAYOUT_DEPENDENCIES.booleanValue || isSCPDG)) {
                scg.nodes.filter(Assignment).forEach[
                    it.dependencies.forEach[ synthesizeDependency ]
                ]
            }
            // Draw analysis visualization if present.
            scg.synthesizeAnalyses
            scg.synthesizeSchedule
            scg.synthesizeScheduleGroups
            
            if (SHOW_HIERARCHY.booleanValue) {
                scg.nodes.filter(Assignment).filter[ dependencies.filter(GuardDependency).size > 0].forEach[
                	val allNodes = it.dependencies.filter(GuardDependency).map[ target ].toList
                	val kContainer = allNodes.createHierarchy(NODEGROUPING_GUARDBLOCK, null)
                	for(edge : kContainer.outgoingEdges.immutableCopy) {
                		edge.targetPort.remove
                		edge.remove
                	}
                	while(kContainer.incomingEdges.size > 1) {
                		val edge = kContainer.incomingEdges.get(1)
                		edge.targetPort.remove
                		kContainer.incomingEdges -= edge
                		edge.remove
                	}
                	kContainer.incomingEdges.head.getData(typeof(KRoundedBendsPolyline)).addArrowDecorator
                ]
            }
        ]
    }

    /**
	 * This dispatch method is triggered when an assignment must be synthesized.
	 * 
	 * @param assignment
	 * 			the assignment in question.
	 * @return Returns the top level KNode. 
	 */
    private def dispatch KNode synthesize(Assignment assignment) {
        return assignment.createNode().associateWith(assignment) => [ node |
            if (USE_ADAPTIVEZOOM.booleanValue) node.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.50)
            // Straightforward rectangle drawing
            val figure = node.addRoundedRectangle(CORNERRADIUS, CORNERRADIUS, LINEWIDTH).background = "white".color;
            (figure) => [
                associateWith(assignment)
                node.setMinimalNodeSize(MINIMALWIDTH, MINIMALHEIGHT)
                if(SHOW_SHADOW.booleanValue) it.shadow = "black".color
                var assignmentStr = ""
                if (assignment.hasAnnotation(ANNOTATION_LABEL)) {
                    assignmentStr = assignment.getStringAnnotationValue(ANNOTATION_LABEL)
                } else {
                    assignmentStr = serializeHR(assignment) as String
                }
                        
                it.addText(assignmentStr).associateWith(assignment).setSurroundingSpace(4, 0, 2, 0) => [
                    if (USE_ADAPTIVEZOOM.booleanValue) it.setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
                ]
            ]
            // Add ports for control-flow and dependency routing.
            if (isGuardSCG) {
            	node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE)
            } else {
	            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER)
            }
            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER)
            node.addLayoutParam(CoreOptions::PORT_ALIGNMENT_BASIC, PortAlignment::CENTER)
            node.addLayoutParam(CoreOptions::SPACING_PORT, 10f)
            if (!isGuardSCG) {            
                if (topdown()) {
                    node.addPort("dummyN", 27, 0, 1, PortSide::NORTH).setLayoutOption(CoreOptions::PORT_INDEX, 0)                
                    node.addPort(SCGPORTID_INCOMING, 37, 0, 1, PortSide::NORTH).setLayoutOption(CoreOptions::PORT_INDEX, 1)
                    node.addPort("dummyS", 27, 0, 1, PortSide::SOUTH).setLayoutOption(CoreOptions::PORT_INDEX, 2)
                    node.addPort(SCGPORTID_OUTGOING, 37, 24, 0, PortSide::SOUTH).setLayoutOption(CoreOptions::PORT_INDEX, 1)
                    node.addPort(SCGPORTID_INCOMINGDEPENDENCY, 47, 0, 1, PortSide::NORTH).setLayoutOption(CoreOptions::PORT_INDEX, 2)
                    node.addPort(SCGPORTID_OUTGOINGDEPENDENCY, 47, 24, 0, PortSide::SOUTH).setLayoutOption(CoreOptions::PORT_INDEX, 0)
    //                node.addPort("DEBUGPORT", MINIMALWIDTH, MINIMALHEIGHT / 2, 1, PortSide::SOUTH)
                } else {
                    node.addPort("dummyN", 27, 0, 1, PortSide::WEST).setLayoutOption(CoreOptions::PORT_INDEX, 0)
                    node.addPort(SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST).setLayoutOption(CoreOptions::PORT_INDEX, 2)
                    node.addPort("dummyS", 27, 0, 1, PortSide::EAST).setLayoutOption(CoreOptions::PORT_INDEX, 2)
                    node.addPort(SCGPORTID_OUTGOING, 75, 12.5f, 1, PortSide::EAST).setLayoutOption(CoreOptions::PORT_INDEX, 1)
                    node.addPort(SCGPORTID_INCOMINGDEPENDENCY, 0, 19, 1, PortSide::WEST).setLayoutOption(CoreOptions::PORT_INDEX, 2)
                    node.addPort(SCGPORTID_OUTGOINGDEPENDENCY, 75, 19, 1, PortSide::EAST).setLayoutOption(CoreOptions::PORT_INDEX, 0)
	                node.addPort(SCGPORTID_OUTGOINGDEPENDENCY, 75, 19, 1, PortSide::EAST).setLayoutOption(CoreOptions::PORT_INDEX, 0)
	            }
	        } else {
                if (assignment.hasAnnotation(SCGAnnotations.ANNOTATION_HEADNODE)) {
                    var sbHeadNodeName = assignment.getStringAnnotationValue(SCGAnnotations.ANNOTATION_HEADNODE)
                	sbHeadNodeName.createLabel(node).associateWith(assignment).configureOutsideTopLeftNodeLabel(sbHeadNodeName, 9, KlighdConstants::DEFAULT_FONT_NAME).KRendering.foreground = "black".color
 				}
            }
        ]
    }
    
    /**
	 * This dispatch method is triggered when a conditional must be synthesized.
	 * 
	 * @param conditional
	 * 			the conditional in question.
	 * @return Returns the top level KNode. 
	 */
    private def dispatch KNode synthesize(Conditional conditional) {
        return conditional.createNode().associateWith(conditional) => [ node |
            if (USE_ADAPTIVEZOOM.booleanValue) node.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.50)
            // Draw a diamond figure for conditionals.
            val figure = node.addPolygon.createDiamondShape
            figure => [
                associateWith(conditional)
                node.setMinimalNodeSize(MINIMALWIDTH, MINIMALHEIGHT)
                // Serialize the condition in the conditional
                var conditionalStr = ""
                if (conditional.hasAnnotation(ANNOTATION_LABEL)) {
                    conditionalStr = conditional.getStringAnnotationValue(ANNOTATION_LABEL)
                } else {
                    conditionalStr = serializeHR(conditional.condition) as String
                }
                if (conditional.condition != null)
                    node.KContainerRendering.addText(
//                        serializer.serialize(conditional.condition.copy.fix).removeParenthesis).setAreaPlacementData.
                        conditionalStr).setAreaPlacementData.
                        from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 1, 0, BOTTOM, 1, 0).associateWith(conditional) => [
                            if (USE_ADAPTIVEZOOM.booleanValue) it.setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
                        ]
                if(SHOW_SHADOW.booleanValue) it.shadow = "black".color
            ]
            // Add ports for control-flow and dependency routing.
            var switchBranch = false
            val branchAnnotation = conditional.getAnnotation(ANNOTATION_BRANCH)
            if (branchAnnotation instanceof StringAnnotation) {
                val annotationValue = (branchAnnotation as StringAnnotation).getValues.head
                if (annotationValue == "switch") {
                    switchBranch = true
                }
            }
            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER)
            node.addLayoutParam(CoreOptions::PORT_ALIGNMENT_BASIC, PortAlignment::CENTER)
            node.addLayoutParam(CoreOptions::SPACING_PORT, 10f)
            var KPort port
            if (topdown) {
                node.addPort("dummyN", 27, 0, 1, PortSide::NORTH).setLayoutOption(CoreOptions::PORT_INDEX, 0)
                node.addPort(SCGPORTID_INCOMING, 37, 0, 1, PortSide::NORTH).setLayoutOption(CoreOptions::PORT_INDEX, 1)
                node.addPort("dummyS", 27, 0, 1, PortSide::SOUTH).setLayoutOption(CoreOptions::PORT_INDEX, 2)
                node.addPort(SCGPORTID_OUTGOING_ELSE, 37.5f, 24, 0, PortSide::SOUTH).setLayoutOption(CoreOptions::PORT_INDEX, 1)
                if (switchBranch)
                    port = node.addPort(SCGPORTID_OUTGOING_THEN, 7, 12.5f, 0, PortSide::WEST)
                else {
                    port = node.addPort(SCGPORTID_OUTGOING_THEN, 68, 12.5f, 0, PortSide::EAST)
                }
                node.addPort(SCGPORTID_INCOMINGDEPENDENCY, 47, 0, 1, PortSide::NORTH).setLayoutOption(CoreOptions::PORT_INDEX, 2)
                node.addPort(SCGPORTID_OUTGOINGDEPENDENCY, 47, 21, 1, PortSide::SOUTH).setLayoutOption(CoreOptions::PORT_INDEX, 0)
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -1.5f)
            } else {
                node.addPort("dummyW", 27, 0, 1, PortSide::WEST).setLayoutOption(CoreOptions::PORT_INDEX, 0)
                node.addPort(SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST).setLayoutOption(CoreOptions::PORT_INDEX, 1)
                node.addPort("dummyE", 27, 0, 1, PortSide::EAST).setLayoutOption(CoreOptions::PORT_INDEX, 2)
                node.addPort(SCGPORTID_OUTGOING_ELSE, 75, 12.5f, 0, PortSide::EAST).setLayoutOption(CoreOptions::PORT_INDEX, 1)
                if (switchBranch)
                    port = node.addPort(SCGPORTID_OUTGOING_THEN, 37.5f, 0, 0, PortSide::NORTH)
                else {
                    port = node.addPort(SCGPORTID_OUTGOING_THEN, 37.5f, 20, 0, PortSide::SOUTH)
//                    // Added as suggested by uru (mail to cmot, 11.11.2016)            
//                    port.addLayoutParam(LayeredOptions::PRIORITY, -10);
//                    for (edge : port.allEdges) {
//                        edge.addLayoutParam(LayeredOptions::PRIORITY, -10);
//                    }
                }
                node.addPort(SCGPORTID_INCOMINGDEPENDENCY, 0, 19, 1, PortSide::WEST).setLayoutOption(CoreOptions::PORT_INDEX, 2)
                node.addPort(SCGPORTID_OUTGOINGDEPENDENCY, 75, 19, 1, PortSide::EAST).setLayoutOption(CoreOptions::PORT_INDEX, 0)
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0f)
            }
            // Removed as suggested by uru (mail to cmot, 11.11.2016)            
            //            port.addLayoutParam(LayeredOptions.NORTH_OR_SOUTH_PORT, Boolean.TRUE);
           
            // Added as suggested by uru (mail to cmot, 11.11.2016)            
            port.addLayoutParam(LayeredOptions::NODE_PLACEMENT_STRATEGY, NodePlacementStrategy.NETWORK_SIMPLEX);

        ]
    }

    /**
	 * This dispatch method is triggered when a surface must be synthesized.
	 * 
	 * @param surface
	 * 			the surface in question.
	 * @return Returns the top level KNode. 
	 */
    private def dispatch KNode synthesize(Surface surface) {
        return surface.createNode().associateWith(surface) => [ node |
            if (USE_ADAPTIVEZOOM.booleanValue) node.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.50)
            // Draw a surface node...
            var KPolygon figure
            if (topdown) {
                figure = node.addPolygon().createSurfaceShape()
                figure => [
                    node.setMinimalNodeSize(MINIMALWIDTH, MINIMALHEIGHT)
                    if (SHOW_CAPTION.booleanValue)
                        node.KContainerRendering.addText("surface").associateWith(surface) => [
                            if (USE_ADAPTIVEZOOM.booleanValue) it.setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
                        ]
                    if(SHOW_SHADOW.booleanValue) it.shadow = "black".color
                ]
            } else {
                figure = node.addPolygon().createSurfaceLandscapeShape()
                figure => [
                    node.setMinimalNodeSize(75, 25)
                    if (SHOW_CAPTION.booleanValue)
                        node.KContainerRendering.addText("surface").setAreaPlacementData.from(LEFT, 10, 0, TOP, 0, 0).
                            to(RIGHT, 0, 0, BOTTOM, 3, 0).associateWith(surface)
                    if(SHOW_SHADOW.booleanValue) it.shadow = "black".color
                ]
            }
            // Add ports for control-flow/tick edge routing.
            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            if (topdown) {
                val port = node.addPort(SCGPORTID_INCOMING, 37, 0, 1, PortSide::NORTH)
                node.addPort(SCGPORTID_OUTGOING, 37, 25, 0, PortSide::SOUTH)
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5f)
            } else {
                val port = node.addPort(SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST)
                node.addPort(SCGPORTID_OUTGOING, 75, 12.5f, 0, PortSide::EAST)
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5f)
            }
        ]
    }

    /**
	 * This dispatch method is triggered when a depth must be synthesized.
	 * 
	 * @param depth
	 * 			the depth in question.
	 * @return Returns the top level KNode. 
	 */
    private def dispatch KNode synthesize(Depth depth) {
        return depth.createNode().associateWith(depth) => [ node |
            if (USE_ADAPTIVEZOOM.booleanValue) node.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.50)
            // If the corresponding option is set to true, depth nodes are placed in the first layer.
            if(ALIGN_TICK_START.booleanValue) node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::FIRST)
            // Draw a depth figure;
            var KPolygon figure
            if (topdown) {
                figure = node.addPolygon().createDepthShape()
                figure => [
                    node.setMinimalNodeSize(75, 25)
                    if (SHOW_CAPTION.booleanValue)
                        node.KContainerRendering.addText("depth").setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(
                            RIGHT, 0, 0, BOTTOM, 4, 0).associateWith(depth) => [
                                if (USE_ADAPTIVEZOOM.booleanValue) it.setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
                            ]
                    if(SHOW_SHADOW.booleanValue) it.shadow = "black".color
                ]
            } else {
                figure = node.addPolygon().createDepthLandscapeShape()
                figure => [
                    node.setMinimalNodeSize(75, 25)
                    if (SHOW_CAPTION.booleanValue)
                        node.KContainerRendering.addText("depth").setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(
                            RIGHT, 10, 0, BOTTOM, 2, 0).associateWith(depth)
                    if(SHOW_SHADOW.booleanValue) it.shadow = "black".color
                ]
            }
            // Add ports for control-flow/tick edge routing.
            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            if (topdown) {
                node.addPort(SCGPORTID_INCOMING, 37, 0, 1, PortSide::NORTH)
                val port = node.addPort(SCGPORTID_OUTGOING, 37.5f, 25, 0, PortSide::SOUTH)
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5f)
            } else {
                node.addPort(SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST)
                val port = node.addPort(SCGPORTID_OUTGOING, 75, 12.5f, 0, PortSide::EAST)
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5f)
            }
        ]
    }

    /**
	 * This dispatch method is triggered when an entry must be synthesized.
	 * 
	 * @param entry
	 * 			the entry node in question.
	 * @return Returns the top level KNode. 
	 */
    private def dispatch KNode synthesize(Entry entry) {
        return entry.createNode().associateWith(entry) => [ node |
            if (USE_ADAPTIVEZOOM.booleanValue) node.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.50)
            // If the corresponding option is set to true, exit nodes are placed in the first layer;
            if (ALIGN_ENTRYEXIT_NODES.booleanValue)
                node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::FIRST)
            // Draw an ellipse figure for exit nodes...
            val figure = node.addEllipse()
            figure => [
                node.setMinimalNodeSize(MINIMALWIDTH, MINIMALHEIGHT)
                if (SHOW_CAPTION.booleanValue)
                    node.KContainerRendering.addText("entry").setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT,
                        0, 0, BOTTOM, 1, 0).associateWith(entry) => [
                            if (USE_ADAPTIVEZOOM.booleanValue) it.setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
                        ]
                if(SHOW_SHADOW.booleanValue) it.shadow = "black".color
            ]
            // Add ports for control-flow routing.
            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            if (topdown) {
                node.addPort(SCGPORTID_INCOMING, 37, 0, 1, PortSide::NORTH)
                node.addPort(SCGPORTID_OUTGOING, 37, 25, 0, PortSide::SOUTH)
            } else {
                node.addPort(SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST)
                node.addPort(SCGPORTID_OUTGOING, 75, 12.5f, 0, PortSide::EAST)
            }
        ]
    }

    /**
	 * This dispatch method is triggered when an exit must be synthesized.
	 * 
	 * @param exit
	 * 			the exit node in question.
	 * @return Returns the top level KNode. 
	 */
    private def dispatch KNode synthesize(Exit exit) {
        return exit.createNode().associateWith(exit) => [ node |
            if (USE_ADAPTIVEZOOM.booleanValue) node.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.50)
            // If the corresponding option is set to true, exit nodes are placed in the last layer.
            if (ALIGN_ENTRYEXIT_NODES.booleanValue)
                node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::LAST)
            // Draw an ellipse for an exit node...
            val figure = node.addEllipse()
            figure => [
                node.setMinimalNodeSize(MINIMALWIDTH, MINIMALHEIGHT)
                if (SHOW_CAPTION.booleanValue)
                    node.KContainerRendering.addText("exit").setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT,
                        0, 0, BOTTOM, 1, 0).associateWith(exit) => [
                            if (USE_ADAPTIVEZOOM.booleanValue) it.setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
                        ]
                if(SHOW_SHADOW.booleanValue) it.shadow = "black".color
            ]
            // Add ports for control-flow routing.
            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS)
            if (topdown) {
                node.addPort(SCGPORTID_INCOMING, 37, 0, 1, PortSide::NORTH)
                node.addPort(SCGPORTID_OUTGOING, 37, 25, 0, PortSide::SOUTH)
            } else {
                node.addPort(SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST)
                node.addPort(SCGPORTID_OUTGOING, 75, 12.5f, 0, PortSide::EAST)
            }
        ]
    }

    /**
	 * This dispatch method is triggered when a fork must be synthesized.
	 * 
	 * @param fork
	 * 			the fork node in question.
	 * @return Returns the top level KNode. 
	 */
    private def dispatch KNode synthesize(Fork fork) {
        return fork.createNode().associateWith(fork) => [ node |
            if (USE_ADAPTIVEZOOM.booleanValue) node.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.50)
            // Draw a fork triangle...
            var KPolygon figure
            if (topdown) {
                figure = node.addPolygon().createTriangleShape()
                figure => [
                    node.setMinimalNodeSize(MINIMALWIDTH, MINIMALHEIGHT)
                    if (SHOW_CAPTION.booleanValue)
                        node.KContainerRendering.addText("fork").setAreaPlacementData.from(LEFT, 0, 0, TOP, 4, 0).to(
                            RIGHT, 0, 0, BOTTOM, 0, 0).associateWith(fork) => [
                                if (USE_ADAPTIVEZOOM.booleanValue) it.setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
                            ]
                    if(SHOW_SHADOW.booleanValue) it.shadow = "black".color
                ]
            } else {
                figure = node.addPolygon().createTriangleLandscapeShape();
                figure => [
                    node.setMinimalNodeSize(MINIMALHEIGHT, MINIMALWIDTH);
                    if (SHOW_CAPTION.booleanValue)
                        node.KContainerRendering.addText("fork").setAreaPlacementData.from(LEFT, 2, 0, TOP, 0, 0).to(
                            RIGHT, 0, 0, BOTTOM, 2, 0).associateWith(fork) => [
                                if (USE_ADAPTIVEZOOM.booleanValue) it.setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
                            ]
                    if(SHOW_SHADOW.booleanValue) it.shadow = "black".color
                ]
            }
            // Only add one port for incoming control flow edges.
            // Outgoing ports are added by the control flows.
            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
            if (topdown) {
                val port = node.addPort(SCGPORTID_INCOMING, 36, 0, 1, PortSide::NORTH)
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5f)
            } else {
                val port = node.addPort(SCGPORTID_INCOMING, 0, 37.5f, 1, PortSide::WEST)
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5f)
            }
        ]
    }

    /**
	 * This dispatch method is triggered when a join must be synthesized.
	 * 
	 * @param join
	 * 			the join node in question.
	 * @return Returns the top level KNode. 
	 */
    private def dispatch KNode synthesize(Join join) {
        return join.createNode().associateWith(join) => [ node |
            if (USE_ADAPTIVEZOOM.booleanValue) node.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.50)
            // Draw a join triangle...
            var KPolygon figure
            if (topdown) {
                figure = node.addPolygon().createTriangleShapeReversed()
                figure => [
                    node.setMinimalNodeSize(MINIMALWIDTH, MINIMALHEIGHT)
                    if (SHOW_CAPTION.booleanValue)
                        node.KContainerRendering.addText("join").setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(
                            RIGHT, 0, 0, BOTTOM, 10, 0).associateWith(join) => [
                                if (USE_ADAPTIVEZOOM.booleanValue) it.setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
                            ]
                    if(SHOW_SHADOW.booleanValue) it.shadow = "black".color
                ]
            } else {
                figure = node.addPolygon().createTriangleLandscapeShapeReversed()
                figure => [
                    node.setMinimalNodeSize(MINIMALHEIGHT, MINIMALWIDTH)
                    if (SHOW_CAPTION.booleanValue)
                        node.KContainerRendering.addText("join").setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(
                            RIGHT, 0, 0, BOTTOM, 4, 0).associateWith(join) => [
                                if (USE_ADAPTIVEZOOM.booleanValue) it.setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
                            ]
                    if (SHOW_SHADOW.booleanValue) {
                        it.shadow = "black".color;
                    }
                ]
            }
            // Only add one port for an outgoing control flow edge.
            // Incoming ports are added by the control flows.
            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
            if (topdown) {
                val port = node.addPort(SCGPORTID_OUTGOING, 36, 25, 0, PortSide::SOUTH)
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -0.5f)
            } else {
                val port = node.addPort(SCGPORTID_OUTGOING, 0, 37.5f, 0, PortSide::EAST)
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -0.5f)
            }
        ]
    }

    /**
	 * Draw a dotted line from the corresponding surface node to the given depth node.
	 * 
	 * @param depth
	 * 			the depth (target= node of the tick edge
	 * @return Returns the KEdge.
	 */
    private def KEdge synthesizeTickEdge(Depth depth) {
        return depth.createNewEdge().associateWith(depth) => [ edge |
            edge.source = depth.surface?.node;
            edge.target = depth.node;
            edge.sourcePort = depth.surface?.node.getPort(SCGPORTID_OUTGOING)
            edge.targetPort = depth.node.getPort(SCGPORTID_INCOMING)
            edge.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
            edge.addRoundedBendsPolyline(8, CONTROLFLOW_THICKNESS.intValue) => [
                it.lineStyle = LineStyle::DOT;
            ]
            if (USE_ADAPTIVEZOOM.booleanValue) edge.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
        ]
    }

    /**
	 * Draw a control flow edge from one node to another.
	 * Use the outgoing port description as port identifier.
	 * 
	 * @param controlFlow
	 * 			the control flow in question
	 * @param outgoingPortId
	 * 			the identifier for the outgoing port
	 * @return Returns the KEdge. 
	 */
    private def KEdge synthesizeControlFlow(ControlFlow controlFlow, String outgoingPortId) {
        if(controlFlow.target == null || controlFlow.eContainer == null) return null;

        return controlFlow.createNewEdge().associateWith(controlFlow) => [ edge |
            // Get and set source and target information.
            val sourceObj = controlFlow.eContainer
            val targetObj = controlFlow.target
            var sourceNode = sourceObj.node
            var targetNode = targetObj.node
            edge.source = sourceNode
            edge.target = targetNode
            edge.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)

            if (USE_ADAPTIVEZOOM.booleanValue) edge.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.50);
            // If the source is a fork node, create a new port for this control flow and attach it.
            // Otherwise, use the outgoing port identified by the given parameter.
            if (sourceObj instanceof Fork) {
                edge.sourcePort = sourceObj.node.createPort("fork" + targetObj.hashCode()) => [
                    if (topdown())
                        it.addLayoutParam(CoreOptions::PORT_SIDE, PortSide::SOUTH)
                    else
                        it.addLayoutParam(CoreOptions::PORT_SIDE, PortSide::EAST)
                    it.setPortSize(3, 3)
                    it.addRectangle.invisible = true;
                    it.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -3f)
                    sourceObj.node.ports += it
                ]
            } else {
            	if (isGuardSCG) {
    				edge.sourcePort = sourceNode.addHelperPort(edge.hashCode.toString, PortSide::SOUTH)        		
            	} else {
	                edge.sourcePort = sourceNode.getPort(outgoingPortId)
                    if (outgoingPortId.equals(SCGPORTID_OUTGOING_ELSE)) {
                        // Added as suggested by uru (mail to cmot, 11.11.2016)            
                        edge.addLayoutParam(LayeredOptions::PRIORITY, 10);
                    }
                }
            }
            // If the target is a join node, create a new port for this control flow and attach it.
            // Otherwise, use the default incoming port.
            if (targetObj instanceof Join) {
                edge.targetPort = targetObj.node.createPort("join" + sourceObj.hashCode()) => [
                    if (topdown())
                        it.addLayoutParam(CoreOptions::PORT_SIDE, PortSide::NORTH)
                    else
                        it.addLayoutParam(CoreOptions::PORT_SIDE, PortSide::WEST)
                    it.setPortSize(3, 3)
                    it.addRectangle.invisible = true;
                    it.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -1.5f)
                    targetObj.node.ports += it
                ]
            } else {
            	if (isGuardSCG) {
    				edge.targetPort = targetNode.addHelperPort(edge.hashCode.toString, PortSide::NORTH)        		
            	} else {
            		edge.targetPort = targetNode.getPort(SCGPORTID_INCOMING)
                    if (outgoingPortId.equals(SCGPORTID_OUTGOING_ELSE)) {
                        // Added as suggested by uru (mail to cmot, 11.11.2016)            
                        edge.addLayoutParam(LayeredOptions::PRIORITY, 10);
                    }
          		}
            }
            // Finally, draw the solid edge and add a decorator.
            edge.addRoundedBendsPolyline(8, CONTROLFLOW_THICKNESS.intValue) => [
                it.lineStyle = LineStyle::SOLID
                it.addArrowDecorator
//                if ((controlFlow.eContainer as Node).graph instanceof SCGraphSched && SHOW_SCHEDULINGPATH.booleanValue)
//                    it.foreground = SCHEDULING_CONTROLFLOWEDGE.copy
//                else
                    it.foreground = STANDARD_CONTROLFLOWEDGE.copy
                it.foreground.propagateToChildren = true
            ]
            // If the outgoing identifier indicates a 'then branch', add a 'then label'.
            if (outgoingPortId == SCGPORTID_OUTGOING_THEN) {
                edge.createLabel.configureTailEdgeLabel('true', 9, KlighdConstants::DEFAULT_FONT_NAME)
            }
        ]
    }

    /**
	 * Synthesize a (single) dependency.
	 * 
	 * @param dependency
	 * 			the dependency in question
	 * @return Returns the dependency. 
	 */
    private def Dependency synthesizeDependency(Dependency dependency) {

        // If non concurrent dependency are hidden and the given dependency is not concurrent, exit at once.
        if (dependency instanceof DataDependency) {
            if((!isSCPDG) && ((!SHOW_NONCONCURRENT.booleanValue && !dependency.isConcurrent))) return dependency;
            if(!SHOW_CONFLUENT.booleanValue && dependency.confluent) return dependency;    
        }
        if (dependency instanceof ScheduleDependency) return dependency;
		
		if (dependency instanceof DataDependency) {
	        if(!SHOW_DEPENDENCY_WRITE_WRITE.booleanValue && dependency.type == DataDependencyType.WRITE_WRITE) return dependency;
	        if(!SHOW_DEPENDENCY_ABSWRITE_RELWRITE.booleanValue && dependency.type == DataDependencyType.WRITE_RELATIVEWRITE) return dependency;
	        if(!SHOW_DEPENDENCY_WRITE_READ.booleanValue && dependency.type == DataDependencyType.WRITE_READ) return dependency;
        }

        // Retrieve node information.
        val sourceNode = (dependency.eContainer as Node).node
        val targetNode = dependency.target.node

        // Draw the dashed dependency edge....
        dependency.createNewEdge().associateWith(dependency) => [ edge |
            if (USE_ADAPTIVEZOOM.booleanValue) edge.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.40);
            edge.source = sourceNode
            edge.target = targetNode
            if (dependency instanceof DataDependency) {
	            edge.addRoundedBendsPolyline(8, 2) => [
    	            // ... and use the predefined color for the different dependency types.    
            	    if (dependency.type == DataDependencyType.WRITE_READ) {
            	    	it.foreground = DEPENDENCY_ABSWRITEREAD.copy
            	    } else 	if (dependency.type == DataDependencyType.WRITE_RELATIVEWRITE) { 
                		it.foreground = DEPENDENCY_ABSWRITERELWRITE.copy
               		} else if (dependency.type == DataDependencyType.WRITE_WRITE) {
                		it.foreground = DEPENDENCY_ABSWRITEABSWRITE.copy
               		}
                	it.lineStyle = LineStyle::DASH
                	it.addArrowDecorator
            	]
            }
            else if (dependency instanceof ControlDependency) {
	            edge.addRoundedBendsPolyline(8, 2) => [
    	            // ... and use the predefined color for the different dependency types.    
        	        it.foreground = DEPENDENCY_CONTROL.copy
                	it.lineStyle = LineStyle::DOT
                	it.addArrowDecorator
            	]
            }
            else if (dependency instanceof ExpressionDependency) {
	            edge.addRoundedBendsPolyline(8, 2) => [
    	            // ... and use the predefined color for the different dependency types.    
        	        it.foreground = DEPENDENCY_EXPRESSION.copy
                	it.lineStyle = LineStyle::SOLID
                	it.addArrowDecorator
            	]            	
            }
            else if (dependency instanceof GuardDependency) {
	            edge.addRoundedBendsPolyline(8, 2) => [
    	            // ... and use the predefined color for the different dependency types.    
        	        it.foreground = DEPENDENCY_GUARD.copy
                	it.lineStyle = LineStyle::DASHDOTDOT
                	it.addArrowDecorator
            	]            	
            }
            // If dependency edges are layouted, use the dependency ports to attach the edges.
            if ((LAYOUT_DEPENDENCIES.booleanValue) || (isSCPDG) || (isGuardSCG)) {
            	if (isGuardSCG) {
            		edge.sourcePort = sourceNode.addHelperPort(edge.hashCode.toString, PortSide::SOUTH)
            		edge.targetPort = targetNode.addHelperPort(edge.hashCode.toString, PortSide::NORTH)
            		if (dependency instanceof GuardDependency) {
	            		targetNode => [
	            			val polyline = it.getData(typeof(KRoundedRectangle)).foreground = DEPENDENCY_GUARD.copy
	                		polyline.foreground.propagateToChildren = true
	            		]
            		}
            	} else {
                	edge.sourcePort = sourceNode.getPort(SCGPORTID_OUTGOINGDEPENDENCY)
                	edge.targetPort = targetNode.getPort(SCGPORTID_INCOMINGDEPENDENCY)
                }
            } else {
                // Otherwise, add NO_LAYOUT as layout option to trigger node-to-node hierarchy-crossover
                // drawing.
                edge.setLayoutOption(CoreOptions::NO_LAYOUT, true)
            }
        ]

        dependency
    }

    /**
     * This method takes a list of nodes and creates a new container around them. 
     * All edges between nodes inside this container and nodes on the outside of the container a split up
     * and connected via ports on the container border. 
     * At the moment the new container is always a SCG thread hierarchy container, but this will probably
     * change when basic blocks are re-introduced.
     * 
     * @param nodes
     * 			the list of nodes that should be includes in the hierarchy
     * @param
     * 			the kindof grouping that should be applied.
     * @return Returns the container KNode.
     */
    private def KNode createHierarchy(List<Node> nodes, int nodeGrouping, EObject contextObject) {

        // Gather mandatory information.
        val firstNode = nodes.head
        val kParent = firstNode.node.eContainer as KNode
        val kContainer = firstNode.createNode("hierarchy" + nodeGrouping.toString)
        val kNodeList = new ArrayList<KNode>
        nodes.forEach[e|kNodeList.add(e.node)]

        // Determine all interleaving edges...        
        val iSecEdges = new ArrayList<KEdge>
        for (rc : kNodeList) {
            iSecEdges.addAll(rc.outgoingEdges.filter[!kNodeList.contains(it.target)])
            iSecEdges.addAll(rc.incomingEdges.filter[!kNodeList.contains(it.source)])
        }

        // Set options for the container.
//        kContainer.addLayoutParam(CoreOptions::SPACING, 10.0f)
        if (topdown())
            kContainer.addLayoutParam(CoreOptions::DIRECTION, Direction::DOWN)
        else
            kContainer.addLayoutParam(CoreOptions::DIRECTION, Direction::RIGHT)
        kContainer.addLayoutParam(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
        kContainer.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
        kContainer.addLayoutParam(CoreOptions::SEPARATE_CONNECTED_COMPONENTS, LAYOUT_SEPARATE_CC.booleanValue);
        kContainer.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FREE);
        if (USE_ADAPTIVEZOOM.booleanValue) kContainer.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.10);

        if (nodeGrouping == NODEGROUPING_HIERARCHY) {
//            kContainer.addLayoutParam(CoreOptions::SPACING, 25.0f)
            kContainer.addRoundedRectangle(5, 5, 0)
            kContainer.KRendering.foreground = SCCHARTSBLUE.copy;
            kContainer.KRendering.foreground.alpha = Math.round(HIERARCHY_TRANSPARENCY.objectValue as Float)
            kContainer.KRendering.background = SCCHARTSBLUE.copy;
            kContainer.KRendering.background.alpha = Math.round(HIERARCHY_TRANSPARENCY.objectValue as Float)
        }
        if (nodeGrouping == NODEGROUPING_BASICBLOCK) {
//            kContainer.addLayoutParam(CoreOptions::SPACING, 5.0f)
            kContainer.addRoundedRectangle(1, 1, 1) => [
                lineStyle = LineStyle::SOLID
                associateWith(contextObject)
            ]
            kContainer.KRendering.foreground = BASICBLOCKBORDER.copy;
            kContainer.KRendering.foreground.alpha = Math.round(255f)
            kContainer.KRendering.background = SCCHARTSBLUE.copy;
            kContainer.KRendering.background.alpha = Math.round(0f)
        }
        if (nodeGrouping == NODEGROUPING_SCHEDULINGBLOCK) {
//            kContainer.addLayoutParam(CoreOptions::SPACING, 5.0f)
            kContainer.addRoundedRectangle(1, 1, 1) => [
                lineStyle = LineStyle::SOLID
                associateWith(contextObject)
            ]
            kContainer.KRendering.foreground = SCHEDULINGBLOCKBORDER.copy;
            kContainer.KRendering.foreground.alpha = Math.round(255f)
            kContainer.KRendering.background = SCCHARTSBLUE.copy;
            kContainer.KRendering.background.alpha = Math.round(0f)
        }
        if (nodeGrouping == NODEGROUPING_GUARDBLOCK) {
            kContainer.addRoundedRectangle(1, 1, 1) => [
                lineStyle = LineStyle::SOLID
                associateWith(contextObject)
            ]
            kContainer.KRendering.foreground = DEPENDENCY_GUARD.copy;
            kContainer.KRendering.foreground.alpha = Math.round(255f)
            kContainer.KRendering.background = DEPENDENCY_GUARD.copy;
            kContainer.KRendering.background.alpha = Math.round(80f)
        }
        if (nodeGrouping == NODEGROUPING_SCHEDULE) {
            kContainer.addRoundedRectangle(1, 1, 7) => [
                lineStyle = LineStyle::SOLID
                associateWith(contextObject)
            ]
            kContainer.KRendering.foreground = SCHEDULEBORDER.copy;
            kContainer.KRendering.foreground.alpha = Math.round(196f)
            kContainer.KRendering.background = SCCHARTSBLUE.copy;
            kContainer.KRendering.background.alpha = Math.round(0f)
        }
        
        // Add the nodes to the container.
        // They will be removed from the original parent!
        for (tn : nodes) {
            kContainer.children += tn.node

// FIXME: this doesnt work properly. See KIPRA-1788.
// The boxed first layer feature should be implemented in the new synthesis.
//            if (nodeGrouping != NODEGROUPING_HIERARCHY)
//                if (tn.node.getData(typeof(KShapeLayout)).getProperty(Properties::LAYER_CONSTRAINT) ==
//                    LayerConstraint::FIRST) {
//                        kContainer.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::FIRST)
//                    }
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
        for (ne : iSecEdges) {
            val portName = SCGPORTID_HIERARCHYPORTS + ne.hashCode.toString + nodeGrouping.toString +
                ne.source.hashCode.toString + kContainer.hashCode.toString

//                        System.out.println("Creating helper port: " + portName)
            val hPort = kContainer.addHelperPort(portName)
            val origSource = ne.source
            val origSourcePort = ne.sourcePort
            ne.source = kContainer
            ne.sourcePort = hPort
            val newEdge = ne.semanticObject.createNewEdge()
            newEdge.source = origSource
            newEdge.sourcePort = origSourcePort
            newEdge.target = kContainer
            newEdge.targetPort = kContainer.getPort(portName)
            newEdge.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
            if (USE_ADAPTIVEZOOM.booleanValue) newEdge.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.50)
            newEdge.addRoundedBendsPolyline(8, CONTROLFLOW_THICKNESS.intValue) => [
                it.lineStyle = ne.KRendering.lineStyleValue
                it.foreground = ne.KRendering.foreground
            ]
            newEdge.labels.addAll(ne.labels)
        }
        kContainer
    }

    /**
     * Synthesizes the basic blocks.
     * 
     * @param scg
     * 			the SCG containing the basic block information
     * @return Returns nothing.
     */
    private def void synthesizeBasicBlocks(SCGraph scg) {

        val schedulingBlockMapping = new HashMap<SchedulingBlock, KNode>

        val bbContainerList = new HashMap<BasicBlock, KNode>()
        for (basicBlock : scg.basicBlocks) {
            if (SHOW_BASICBLOCKS.booleanValue) {
                val bbNodes = <Node>newLinkedList
                basicBlock.schedulingBlocks.forEach[bbNodes.addAll(it.nodes)]
                val bbContainer = bbNodes.createHierarchy(NODEGROUPING_BASICBLOCK, basicBlock).associateWith(basicBlock)
                bbContainerList.put(basicBlock, bbContainer)
                var bbName = basicBlock.schedulingBlocks.head.guards.head.valuedObject.name 
                
                if (scg.hasAnnotation(ANNOTATION_GUARDCREATOR)) {
                    val guard = basicBlock.schedulingBlocks.head.guards.head
                    var String expText
                    if (basicBlock.deadBlock && (guard == null || guard.expression == null)) {
                        expText = "<null>"
                    } else {
                        val exp = guard.expression.copy
                    	expText = serializeHR(exp) as String
                    }
					bbName = bbName + "\n" + expText                	
                }
                
                bbName.createLabel(bbContainer).configureOutsideTopLeftNodeLabel(bbName, 9, KlighdConstants::DEFAULT_FONT_NAME).KRendering.foreground = BASICBLOCKBORDER.copy
            }
            if (SHOW_SCHEDULINGBLOCKS.booleanValue)
                for (schedulingBlock : basicBlock.schedulingBlocks) {
                    val sbContainer = schedulingBlock.nodes.createHierarchy(NODEGROUPING_SCHEDULINGBLOCK, schedulingBlock).associateWith(schedulingBlock)
                    schedulingBlockMapping.put(schedulingBlock, sbContainer)
                     var sbName = "<null>"
                     if (!schedulingBlock.label.nullOrEmpty) {
                         sbName = schedulingBlock.label + " "
                     }
                     if (schedulingBlock.guards.head != null) { 
                         if (schedulingBlock.guards.head.valuedObject.name != schedulingBlock.label) {
                            sbName = sbName + "(" + schedulingBlock.guards.head.valuedObject.name + ")"//reference.valuedObject.name
                         }
                     }

	                if (scg.hasAnnotation(ANNOTATION_GUARDCREATOR)) {
	                    var expText = "<null>"
	                    if (schedulingBlock.guards.head != null /* && !schedulingBlock.basicBlock.deadBlock */) {
        	            	expText = serializeHR(schedulingBlock.guards.head.expression) as String
    	            	}	
						sbName = sbName + "\n" + expText       
					}
            	    
            	    if (!SHOW_BASICBLOCKS.booleanValue) {
                	   sbName.createLabel(sbContainer).associateWith(schedulingBlock).configureOutsideTopLeftNodeLabel(sbName, 9, KlighdConstants::DEFAULT_FONT_NAME).KRendering.foreground = SCHEDULINGBLOCKBORDER.copy
               	    }
                	
                    if (basicBlock.deadBlock) {
                        sbContainer.getData(typeof(KRoundedRectangle)) => [
                            it.lineStyle = LineStyle::SOLID
                            it.foreground = SCHEDULING_DEADCODE.copy
                        ]
                        sbContainer.KRendering.background = SCHEDULING_DEADCODE.copy
                        sbContainer.KRendering.background.alpha = 128
                    }
                }
        }

        
    }
    
    private def void synthesizeSchedule(SCGraph scg) {
        if (!(scg.hasSchedulingData && SHOW_SCHEDULINGPATH.booleanValue)) return;
        
    	for(node : scg.nodes) {
    	    // filter[ !dependencies.filter(ScheduleDependency).empty ]
    	    if (!node.dependencies.filter(ScheduleDependency).empty) { 
      		    val sourceKNode = node.node 
      			val targetNode = node.dependencies.filter(ScheduleDependency).head.target
       			val targetKNode = targetNode.node
				val nonScheduleDependencies = node.dependencies.filter[ !(it instanceof ScheduleDependency) ].
					filter[ target == targetNode ]
		        		
                if (!nonScheduleDependencies.empty) {
                    nonScheduleDependencies.forEach[
                    	colorDependency(SCHEDULING_SCHEDULINGEDGE)
                    	thickenDependency(CONTROLFLOW_SCHEDULINGEDGE_WIDTH)
                    	dependencyAlpha(SCHEDULING_SCHEDULINGEDGE_ALPHA)
                    ]
                } else {				        		
	        		node.createEdge => [
	        			it.source = sourceKNode
	        			it.target = targetKNode
						it.addRoundedBendsPolyline(8, CONTROLFLOW_SCHEDULINGEDGE_WIDTH) => [
	                        it.foreground = SCHEDULING_SCHEDULINGEDGE.copy
	                        it.foreground.alpha = SCHEDULING_SCHEDULINGEDGE_ALPHA
	                        it.addArrowDecorator
	                    ]
	                    if (!isGuardSCG) {
	                    	it.setLayoutOption(CoreOptions::NO_LAYOUT, true)
                    	} else {
		            		it.sourcePort = sourceKNode.addHelperPort(it.hashCode.toString, PortSide::SOUTH)
        		    		it.targetPort = targetKNode.addHelperPort(it.hashCode.toString, PortSide::NORTH)                    		
                    	}        			
	        		]
        		}
            }
        }
    }
    
    private def void synthesizeScheduleGroups(SCGraph scg) {
        if (!(scg.hasSchedulingData && SHOW_SCHEDULINGPATH.booleanValue)) return;
        
        val schedules = <List<Node>> newArrayList

        for(node : scg.nodes.filter[ incoming.filter(ScheduleDependency).empty && incoming.filter(GuardDependency).empty ]) {
            val newSchedule = <Node> newArrayList => [ s | 
                s += node
                node.dependencies.filter(GuardDependency).forEach[ s += it.target ]
            ]
            var next = node.dependencies.filter(ScheduleDependency).head?.target
            while(next!=null) {
                newSchedule += next
                next.dependencies.filter(GuardDependency).forEach[ newSchedule += it.target ]
                next = next.dependencies.filter(ScheduleDependency).head?.target
            }            
            
            schedules += newSchedule
        }        
        
        System.out.println("Schedules " + schedules.size)
        for(schedule : schedules) {
            System.out.println(schedule)
            schedule.createHierarchy(NODEGROUPING_SCHEDULE, null)
        }        
    }

    /**
     * Calls the analyses visualization class. 
     * Each additional analysis stored by the scheduler can hook they visualization in the visualization class.
     * 
     * @param scg
     * 			the scg containing additional visualization data
     * @return Returns nothing.
     */
    private def void synthesizeAnalyses(SCGraph scg) {

        // val AnalysesVisualization analysesVisualization = Guice.createInjector().getInstance(typeof(AnalysesVisualization))
        if(!SHOW_POTENTIALPROBLEMS.booleanValue) return;
//        scg.analyses.forEach[visualize(it, this)]

        if (PIL_Nodes.empty) return;
        
        for (n : PIL_Nodes) {
            val nextFlows = n.allNext
            var hasFlows = false
            for (flow : nextFlows) {
                if (PIL_Nodes.contains(flow.target)) {
                    flow.colorControlFlow(PROBLEM_COLOR.copy)
                    flow.thickenControlFlow(PROBLEM_WIDTH)
                    hasFlows = true
                } 
            }
            
            if (!hasFlows) {
                val nextDeps = n.eContents.filter(DataDependency).filter[ concurrent == true && confluent == false].toList
                for (flow : nextDeps) {
                    if (PIL_Nodes.contains(flow.target)) {
                        flow.colorDependency(PROBLEM_COLOR.copy)
                        flow.thickenDependency(PROBLEM_WIDTH)
                    } 
                }
            }            
        }
    }

    // -------------------------------------------------------------------------
    // -- Helper: Edges 
    // -------------------------------------------------------------------------
    /**
	 * Re-color an existing control flow. All edges, even split up ones, are colored.
	 * 
	 * @param controlFlow
	 * 			the control flow in question
	 * @param color
	 * 			the desired color
	 * @return Returns the control flow 
	 */
    def ControlFlow colorControlFlow(ControlFlow controlFlow, KColor color) {
        controlFlow => [
            allEdges.forEach [
                val polyline = it.getData(typeof(KRoundedBendsPolyline)).foreground = color.copy
                polyline.foreground.propagateToChildren = true
            ]]
    }

    /**
	 * Re-alpha an existing control flow. All alpha values, even on split up edges, are changed.
	 * 
	 * @param controlFlow
	 * 			the control flow in question
	 * @param alpha 
	 * 			the desired alpha value
	 * @return Returns the control flow 
	 */
    def ControlFlow controlFlowAlpha(ControlFlow controlFlow, int alpha) {
        controlFlow => [
            allEdges.forEach [
                val polyline = it.getData(typeof(KRoundedBendsPolyline)) => [getForeground.alpha = alpha];
                polyline.foreground.propagateToChildren = true
            ]]
    }

    /**
	 * Re-thicken an existing control flow. All edges, even split up ones, are thicken.
	 * 
	 * @param controlFlow
	 * 			the control flow in question
	 * @param width
	 * 			the desired edge width
	 * @return Returns the control flow 
	 */
    def ControlFlow thickenControlFlow(ControlFlow controlFlow, int width) {
        controlFlow => [
            allEdges.forEach [
                val polyline = it.getData(typeof(KRoundedBendsPolyline)).lineWidth = width
                polyline.lineWidth.propagateToChildren = true
            ]]
    }

    /**
	 * Re-color an existing tick edge.
	 * 
	 * @param depth
	 * 			the depth (target) node of the tick edge in question
	 * @param color
	 * 			the desired color
	 * @return Returns the depth. 
	 */
    def Depth colorTickEdge(Depth depth, KColor color) {
        depth => [
            allEdges.forEach [
                val polyline = it.getData(typeof(KRoundedBendsPolyline)).foreground = color.copy
                polyline.foreground.propagateToChildren = true
            ]]
    }

    /**
	 * Re-thicken an existing tick edge.
	 * 
	 * @param depth
	 * 			the depth (target) node of the tick edge in question
	 * @param width
	 * 			the desired edge width
	 * @return Returns the depth. 
	 */
    def Depth thickenTickEdge(Depth depth, int width) {
        depth => [
            allEdges.forEach [
                val polyline = it.getData(typeof(KRoundedBendsPolyline)).lineWidth = width
                polyline.lineWidth.propagateToChildren = true
            ]]
    }

    /**
	 * Re-color an existing dependency. All edges, even split up ones, are colored.
	 * 
	 * @param dependency
	 * 			the dependency in question
	 * @param color
	 * 			the desired color
	 * @return Returns the dependency 
	 */
    def Dependency colorDependency(Dependency dependency, KColor color) {
        dependency => [
            allEdges.forEach [
                val polyline = it.getData(typeof(KRoundedBendsPolyline)).foreground = color.copy
                polyline.foreground.propagateToChildren = true
            ]]
    }

    /**
	 * Re-thicken an existing dependency. 
	 * 
	 * @param dependency
	 * 			the dependency in question
	 * @param width
	 * 			the desired edge width
	 * @return Returns the dependency 
	 */
    def Dependency thickenDependency(Dependency dependency, int width) {
        dependency => [
            allEdges.forEach [
                val polyline = it.getData(typeof(KRoundedBendsPolyline)).lineWidth = width
                polyline.lineWidth.propagateToChildren = true
            ]]
    }
    
    def Dependency dependencyAlpha(Dependency dependency, int alpha) {
        dependency => [
            allEdges.forEach [
                val polyline = it.getData(typeof(KRoundedBendsPolyline)) => [getForeground.alpha = alpha];
                polyline.foreground.propagateToChildren = true
            ]]
    }    
    
    def Node colorNode(Node node, KColor color) {
        node => [
            getNode => [
                val polyline = it.getData(typeof(KRoundedRectangle)).foreground = color.copy
                polyline.foreground.propagateToChildren = true
            ]]
    }

    // -------------------------------------------------------------------------
    // -- Helper: Ports 
    // -------------------------------------------------------------------------
    def KPort addPort(KNode node, String mapping, float x, float y, int size, PortSide side) {
        node.createPort(mapping) => [
            it.addLayoutParam(CoreOptions::PORT_SIDE, side);
            it.setPortPos(x, y)
            it.setPortSize(size, size)
            it.addRectangle.invisible = true;
            node.ports += it
        ]
    }

    def KPort addPortFixedSide(KNode node, String mapping, PortSide side) {
        node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
        node.addPort(mapping, 37, 0, 3, side)
    }

    def KPort addHelperPort(KNode node, String mapping) {
        node.createPort(mapping) => [
            node.ports += it
        ]
    }
    
    def KPort addHelperPort(KNode node, String mapping, PortSide side) {
        node.createPort(mapping) => [
        	it.addLayoutParam(CoreOptions::PORT_SIDE, side);
            node.ports += it
        ]
    }

    // -------------------------------------------------------------------------
    // -- Helper: Serialization Strings 
    // -------------------------------------------------------------------------
    def String removeParenthesis(String str) {
        if (str.contains("&")) {
            return str.replaceAll("\\(\\(", "(").replaceAll("\\)\\)", ")");
        }
        return str
    }
    
    def String serializeIndices(ISerializer serializer, List<Expression> indices) {
        var String indicesStr = ""
        for(index : indices) {
            indicesStr = indicesStr + "[" + 
                serializer.serialize(index.copy)
                + "]"          
        }
        indicesStr
    }

    def boolean topdown() {
        orientation == ORIENTATION_PORTRAIT
    }

    def boolean leftright() {
        orientation == ORIENTATION_LANDSCAPE
    }

    def RenderingFactory() {
        KRenderingFactory.eINSTANCE
    }
}
