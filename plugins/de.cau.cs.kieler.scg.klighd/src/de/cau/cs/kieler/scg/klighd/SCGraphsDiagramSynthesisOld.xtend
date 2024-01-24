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

import com.google.common.collect.HashMultimap
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.keffects.ControlDependency
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kexpressions.keffects.DataDependencyType
import de.cau.cs.kieler.kexpressions.keffects.Dependency
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.ide.klighd.KiCoDiagramViewProperties
import de.cau.cs.kieler.klighd.IKlighdSelection
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.internal.macrolayout.KlighdDiagramLayoutConnector
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KColor
import de.cau.cs.kieler.klighd.krendering.KPolygon
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KRoundedBendsPolyline
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy
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
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.ExpressionDependency
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.GuardDependency
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.ScheduleDependency
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.TickBoundaryDependency
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import de.cau.cs.kieler.scg.extensions.SCGSerializeHRExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import de.cau.cs.kieler.scg.klighd.actions.NodePriorityActions
import de.cau.cs.kieler.scg.klighd.actions.OptNodePrioActions
import de.cau.cs.kieler.scg.klighd.actions.PrioStatementsActions
import de.cau.cs.kieler.scg.klighd.actions.SCCActions
import de.cau.cs.kieler.scg.klighd.actions.ThreadPriorityActions
import de.cau.cs.kieler.scg.processors.SCGAnnotations
import de.cau.cs.kieler.scg.processors.analyzer.LoopAnalyzerV2
import de.cau.cs.kieler.scg.processors.analyzer.LoopData
import de.cau.cs.kieler.scg.processors.priority.PriorityAuxiliaryData
import de.cau.cs.kieler.scg.processors.priority.PriorityProcessor
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import java.util.Set
import com.google.inject.Inject
import org.eclipse.elk.alg.layered.options.LayerConstraint
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.alg.layered.options.LayeringStrategy
import org.eclipse.elk.alg.layered.options.NodePlacementStrategy
import org.eclipse.elk.alg.layered.options.WrappingStrategy
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.core.options.PortAlignment
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortSide
import org.eclipse.elk.graph.properties.Property
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.xtext.serializer.ISerializer

import static de.cau.cs.kieler.scg.klighd.ColorStore.Color.*
import static de.cau.cs.kieler.scg.processors.SCGAnnotations.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/** 
 * SCCGraph KlighD synthesis class. It contains all method mandatory to handle the visualization of
 * all predefined types of SC graphs.
 * 
 * @author ssm
 * @kieler.design 2013-10-23 proposed 
 * @kieler.rating 2013-10-23 proposed yellow
 */
class SCGraphsDiagramSynthesisOld extends AbstractDiagramSynthesis<SCGraphs> {

    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KPortExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCGraphShapes
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGThreadExtensions
    @Inject extension SCGSerializeHRExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCGDependencyExtensions
    @Inject extension SCGMethodExtensions
    @Inject extension ColorStore

    extension KRenderingFactory = KRenderingFactory.eINSTANCE
    
    // -------------------------------------------------------------------------
    // -- KlighD Options
    // -------------------------------------------------------------------------
    /** Show caption */
    private static val SynthesisOption SHOW_CAPTION = SynthesisOption::createCheckOption("Captions", true);

    /** Show dependencies */
    private static val SynthesisOption SHOW_DEPENDENCIES = SynthesisOption::createCheckOption("Dependencies", true);
    /** Show selective dependencies */
    private static val SynthesisOption SELECTIVE_DEPENDENCIES = SynthesisOption::createCheckOption("Show only dependencies of selected elements", false);

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

    /** Show dead blocks */
    private static val SynthesisOption SHOW_DEAD_BLOCKS = SynthesisOption::createCheckOption("Dead Blocks",
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
        
    /** left or right conditionals */
    private static val SynthesisOption CONDITIONAL_LEFT_OR_RIGTH = SynthesisOption::createCheckOption("True branches always right",
        false);

    /** Show hierarchy */
    private static val SynthesisOption SHOW_HIERARCHY = SynthesisOption::createCheckOption("Hierarchy", true);

    /** Hierarchy transparency */
    private static val SynthesisOption HIERARCHY_TRANSPARENCY = SynthesisOption::createRangeOption("Hierarchy", 0f, 255f,
        128f);

    /** Control flow thickness */
    public static val SynthesisOption CONTROLFLOW_THICKNESS = SynthesisOption::createRangeOption(
        "Controlflow thickness", 0.5f, 5f, 0.5f, 2f);

    /** Graph orientation */
    private static val SynthesisOption ORIENTATION = SynthesisOption::createChoiceOption("Orientation",
        <String>newLinkedList("Top-Down", "Left-Right"), "Top-Down");
        
    public static val NODE_PRIO_PROPERTY = new Property<Boolean>("scgPriority.NodePriority", false)

    public static val OPT_PRIO_PROPERTY = new Property<Boolean>("scgPriority.OptNodePriority", false)
    
    public static val THREAD_PRIO_PROPERTY = new Property<Boolean>("scgPriority.ThreadPriority", false)
    
    public static val SCC_PROPERTY = new Property<Boolean>("scgPriority.SCCPriority", false)
    
    public static val PRIO_STATEMENTS_PROPERTY = new Property<Boolean>("scgPriority.PrioStatements", false)
    
    public static val GRAPH_DEPENDENCY = new Property<Dependency>("graph.dependency", null)
    
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
        
    private static val SynthesisOption SHOW_ANNOTATIONS = SynthesisOption::createCheckOption("Show Annotations", false);

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
            SELECTIVE_DEPENDENCIES,
            SHOW_NONCONCURRENT,
            SHOW_CONFLUENT,
            SHOW_BASICBLOCKS,
            SHOW_SCHEDULINGBLOCKS,
            SHOW_DEAD_BLOCKS,
            SHOW_SCHEDULINGPATH,
            SHOW_POTENTIALPROBLEMS,
            SHOW_ANNOTATIONS,
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
            CONDITIONAL_LEFT_OR_RIGTH,
            SynthesisOption::createSeparator("Layout"),
            LAYOUT_DEPENDENCIES,
            LAYOUT_SEPARATE_CC,
            ORIENTATION,
            SynthesisOption::createSeparator("Priority"),
            OptNodePrioActions.SHOW_OPT_PRIO_ID,
            NodePriorityActions.SHOW_NODE_PRIORITY,
            ThreadPriorityActions.SHOW_THREAD_PRIO,
            SCCActions.SHOW_SCC,
            PrioStatementsActions.SHOW_PRIO_STATEMENTS
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
            specifyLayoutOption(CoreOptions::SPACING_NODE_NODE, newArrayList(0, 255)),
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
    private static val KColor DEPENDENCY_TICKBOUNDARY = RENDERING_FACTORY.createKColor() =>
        [it.red = 128; it.green = 128; it.blue = 128;]
    private static val KColor SCHEDULING_NOTSCHEDULABLE = RENDERING_FACTORY.createKColor() =>
        [it.red = 255; it.green = 0; it.blue = 0;]
    public static val KColor STANDARD_CONTROLFLOWEDGE = RENDERING_FACTORY.createKColor() =>
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

    private static val KColor SCHIZO_COLOR = KRenderingFactory::eINSTANCE.createKColor() => 
        [it.red = 245; it.green = 96; it.blue = 33;]
    private static val KColor PASSIVE_REGION_COLOR = KRenderingFactory::eINSTANCE.createKColor() => 
        [it.red = 255; it.green = 101; it.blue = 127;]

    public static val KColor NODE_PRIORITY_COLOR = KRenderingFactory::eINSTANCE.createKColor() =>
        [it.red = 255; it.green = 30; it.blue = 30;]
    private static val KColor OPT_PRIORITY_COLOR = KRenderingFactory::eINSTANCE.createKColor() =>
        [it.red = 30; it.green = 30; it.blue = 255;]
    public static val KColor STRONGLY_CONNECTED_COMPONENT_COLOR = KRenderingFactory::eINSTANCE.createKColor() =>
        [it.red = 180; it.green = 50; it.blue = 180;]
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
    private static val int NODEGROUPING_SCC = 5

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
    // -- Static Helper Class 
    // -------------------------------------------------------------------------
    /**
     * Global selection listener which dependencies for element selection.
     */
    private static final ISelectionChangedListener SELECTION_LISTENER = new ISelectionChangedListener() {

        override void selectionChanged(SelectionChangedEvent event) {
            val selection = event.getSelection() as IKlighdSelection
            val viewContext = selection.getViewContext()
            val viewer = viewContext.viewer
            
            if(viewContext.getOptionValue(SHOW_DEPENDENCIES) as Boolean && viewContext.getOptionValue(SELECTIVE_DEPENDENCIES) as Boolean) {
                val selectedNodes = <KNode>newHashSet
                
                // All nodes
                selectedNodes.addAll(selection.diagramElementsIterator.filter(KNode).toIterable)
                // All nodes with selected text
                selectedNodes.addAll(selection.diagramElementsIterator.filter[
                    !selectedNodes.contains(it)
                ].map[
                    var container = it.eContainer
                    while (container !== null) {
                        if (container instanceof KNode) return container as KNode
                        container = container.eContainer
                    }
                    return null
                ].filterNull.toIterable)
                
    
                val rootNode = viewContext.viewModel
                // Hide all dependencies
                rootNode.eAllContentsOfType(KNode, KEdge).filter(KEdge).filter[
                    viewContext.getSourceElement(it) instanceof Dependency
                ].forEach[
                    viewer.hide(it)
                ]
                
                // BLACK MAGIC to fix klighd behavior
                val instance = new KlighdDiagramLayoutConnector
                val arranger = instance.class.getDeclaredMethod("handleExcludedEdge", KEdge)
                arranger.accessible = true
                
                // Show dependencies for selected nodes
                for (knode : selectedNodes ) {
                    val node = viewContext.getSourceElement(knode)
                    // Show edges
                    if (node instanceof Node) {
                        node.outgoingLinks.filter(Dependency).map[viewContext.getTargetElements(it)].forEach[
                            it.filter(KEdge).forEach[
                                viewer.show(it)
                                arranger.invoke(instance, it)
                            ]
                        ]
                        node.incomingLinks.filter(Dependency).map[viewContext.getTargetElements(it)].forEach[
                            it.filter(KEdge).forEach[
                                viewer.show(it)
                                arranger.invoke(instance, it)
                            ]
                        ]
                    }
                }
            }
        }
    }
    
    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
    /** The root node */
    private KNode rootNode;
    private String mainEntry
    
//    private CompilationResult compilationResult;
    private var Set<Node> pilNodes = <Node> newHashSet

    /** The selected orientation */
    private int orientation
    
    private int sequentializedSCGCounter = 0
    
    private SCGraph SCGraph
    protected boolean isSCPDG
    protected boolean isGuardSCG
    
    /** List of all strongly connected components of the SCG */
    private LinkedList<LinkedList<Node>> scc    
    
    protected val HashMultimap<KNode, KNode> hierarchyAttachment = HashMultimap.create  
    
    protected val Map<KNode, KNode> annotationNodeAttachments = <KNode, KNode> newHashMap

    // -------------------------------------------------------------------------
    // -- Main Entry Point 
    // -------------------------------------------------------------------------
    
    /**
     * This method is called by KlighD. Trigger your visualization here.
     * 
     * @param model
     *          the model in question
     * @return Returns the root KNode.
     */    
    override transform(SCGraphs model) {
        val node = createNode
        
        for(scg : model.scgs) {
           node.children += transformSCG(scg) => [
               addRectangle => [invisible = true]
           ]
        }
        
        node
    }
    
    /**
	 * This method is called by KlighD. Trigger your visualization here.
	 * 
	 * @param model
	 * 			the model in question
	 * @return Returns the root KNode.
	 */
    def transformSCG(SCGraph model) {

        val compilationContext = usedContext.getProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT)
        if (compilationContext !== null) {
            val scgs = model.eContainer
            if (scgs !== null) {
                val pilr = compilationContext.getResultForModel(scgs)?.getProperty(LoopAnalyzerV2.LOOP_DATA)
                if (pilr !== null) pilNodes += pilr.criticalNodes
            }
            val prioAuxData = compilationContext.result.getProperty(PriorityProcessor.PRIORITY_AUXILIARY_DATA)
            if(prioAuxData !== null) {
                scc = prioAuxData.stronglyConnectedComponents
            }
        }

        // Invoke the synthesis.
        SCGraph = model
        hierarchyAttachment.clear
        annotationNodeAttachments.clear
        
        // Start the synthesis.
        val timestamp = System.currentTimeMillis
        System.out.println("Started SCG synthesis...")
        
        val newModel = model.synthesize();
        
        // Activate or deactivate selective dependencies
        if (SHOW_DEPENDENCIES.booleanValue) {
            val contextViewer = usedContext.getViewer()?.getContextViewer()
            if (SELECTIVE_DEPENDENCIES.booleanValue) {
                contextViewer?.addSelectionChangedListener(SELECTION_LISTENER)
            } else {
                contextViewer?.removeSelectionChangedListener(SELECTION_LISTENER)
            }
        } else {
            val contextViewer = usedContext.getViewer()?.getContextViewer()
            contextViewer?.removeSelectionChangedListener(SELECTION_LISTENER)
        }
        
        
        // End notifiaction
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
            isGuardSCG = scg.hasAnnotation(SCGAnnotations.ANNOTATION_GUARDED) 
            mainEntry = scg.getStringAnnotationValue("main")
            if(ORIENTATION.objectValue == "Left-Right") orientation = ORIENTATION_LANDSCAPE else orientation = ORIENTATION_PORTRAIT
            if (topdown)
                node.setLayoutOption(CoreOptions::DIRECTION, Direction::DOWN)
            else
                node.setLayoutOption(CoreOptions::DIRECTION, Direction::RIGHT)
            node.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 25.0);
            node.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
            node.setLayoutOption(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID);
            node.setLayoutOption(LayeredOptions::THOROUGHNESS, 100)
            node.setLayoutOption(CoreOptions::SEPARATE_CONNECTED_COMPONENTS, false);
            if (scg.hasAnnotation(ANNOTATION_SEQUENTIALIZED)) {
                node.setLayoutOption(LayeredOptions::LAYERING_STRATEGY, LayeringStrategy::LONGEST_PATH)
                node.setLayoutOption(LayeredOptions::WRAPPING_STRATEGY, WrappingStrategy.SINGLE_EDGE)
            }
            
            
            // Sausage folding on/off
            if ((SHOW_SAUSAGE_FOLDING.booleanValue) && scg.hasAnnotation(SCGAnnotations.ANNOTATION_SEQUENTIALIZED)) {
                node.addLayoutParam(LayeredOptions::LAYERING_STRATEGY, LayeringStrategy::LONGEST_PATH)
                node.setLayoutOption(LayeredOptions::WRAPPING_STRATEGY, WrappingStrategy.SINGLE_EDGE)
            }
    
            // Added as suggested by uru (mail to cmot, 11.11.2016)            
            node.addLayoutParam(LayeredOptions::NODE_PLACEMENT_STRATEGY, NodePlacementStrategy.NETWORK_SIMPLEX);
            
            
            val threadTypes = <Entry, ThreadPathType> newHashMap
            
            // Synthesize all children             
            for (n : scg.nodes) { 
                if (n instanceof Entry) { 
                    if (n.hasAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE)) {
                        threadTypes.put((n as Entry), n.getStringAnnotationValue(ANNOTATION_CONTROLFLOWTHREADPATHTYPE).fromString2)
                    }
                }

                val aNode = n.synthesize
                node.children += aNode
                
                if (n.schizophrenic) {
                    aNode.KRendering.foreground = SCHIZO_COLOR.copy
                    if (n instanceof Assignment) {
                        if (n.next === null) {
                            node.children += aNode.createDeadend(SCGPORTID_OUTGOING)
                        }
                    }
                    else if (n instanceof Conditional) {
                        if (n.then === null) {
                            node.children += aNode.createDeadend(SCGPORTID_OUTGOING_THEN)
                        }
                        if (n.^else === null) {
                            node.children += aNode.createDeadend(SCGPORTID_OUTGOING_ELSE)
                        }
                    }
                }                 
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
                it.synthesizeAnnotations
                
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
                        if (entry !== null) {
                            var label = ""
                            if (entry.hasAnnotation(ANNOTATION_LABEL)) {
                                label = entry.getStringAnnotationValue(ANNOTATION_LABEL)
                            } else {
                                label = entry.getStringAnnotationValue(ANNOTATION_REGIONNAME)
                            }
                            val regionLabel = label
                            entry.getThreadNodes.createHierarchy(NODEGROUPING_HIERARCHY, null) => [
                            	var text = ""
                            	if (!regionLabel.nullOrEmpty) text = regionLabel
                                val threadPathType = threadTypes.get(entry)
                                if (threadPathType !== null) {
                                    if (!regionLabel.nullOrEmpty) text = text + " - "
                                    text = text + threadPathType.toString2
                                }
                                
                                var threadSegmentIDText = ""
                                if(entry.hasAnnotation(PriorityAuxiliaryData.THREAD_SEGMENT_ANNOTATION)) {
                                    threadSegmentIDText = "ThreadID: " + 
                                        (entry.getAnnotation(PriorityAuxiliaryData.THREAD_SEGMENT_ANNOTATION) 
                                                                as IntAnnotation).value.toString  
                                    val labelTR = addOutsideTopLeftNodeLabel(threadSegmentIDText, 10, 
                                                                        KlighdConstants::DEFAULT_FONT_NAME) => [
                                        it.KRendering.setForeground(REGIONLABEL.copy)
                                    ]
                                    labelTR.KRendering.setProperty(THREAD_PRIO_PROPERTY, true)
                                }
                                                                
                                if (SHOW_POTENTIALPROBLEMS.booleanValue) {
                                    // Workaround for fixing the massive whitespace: using centered labels
                                    addInsideTopCenteredNodeLabel(text, 10, KlighdConstants::DEFAULT_FONT_NAME) => [
                                        it.KRendering.setForeground(REGIONLABEL.copy);
                                        if (USE_ADAPTIVEZOOM.booleanValue) it.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70)
                                    ]
                                } 
                                    
                            ]
                        }
                    ]]
            }
            // Draw basic blocks if present.
            if (scg.basicBlocks.size>0) scg.synthesizeBasicBlocks
            
            // If dependency edge are drawn plain (without layout), draw them after the hierarchy management.
            if (SHOW_DEPENDENCIES.booleanValue && !(LAYOUT_DEPENDENCIES.booleanValue || isSCPDG)) {
                scg.nodes.forEach[
                    it.dependenciesView.forEach[ synthesizeDependency ]
                ]
            }
            
            if (isGuardSCG) {
                scg.synthesizeSCCInGuardSCG
            }
            
            // Draw strongly connected components
            if(scc !== null) {
                for(component : scc) {
                    if(component.size > 1) {
                        for(n : component) { 
                            for(n2CF : n.allNext) {
                                val n2 = n2CF.target
                                if(component.contains(n2)) {
                                    val edges = n2CF.allEdges
                                    for(edge : edges) {
                                        val edgeRendering = edge.getData(typeof(KRoundedBendsPolyline))
                                        edgeRendering.setProperty(SCC_PROPERTY, true)
                                        val style = createKForeground().setColor2(STRONGLY_CONNECTED_COMPONENT_COLOR.copy)
                                        style.properties.put(SCCActions.P, true)
                                        style.propagateToChildren = true
                                        edgeRendering.styles += style
                                    }
                                    n2CF.thickenControlFlow(4)
                                    
                                } 
                            }
                            for(n2Dep : n.dependenciesView) {
                                val n2 = n2Dep.target
                                if(component.contains(n2)) {
                                    val edges = n2Dep.allEdges
                                    for(edge : edges) {
                                        if(edge !== null) {
                                            val edgeRendering = edge.getData(typeof(KRoundedBendsPolyline))
                                            edgeRendering.setProperty(SCC_PROPERTY, true)
                                            val style = createKForeground().setColor2(STRONGLY_CONNECTED_COMPONENT_COLOR.copy)
                                            style.properties.put(SCCActions.P, true)
                                            style.propagateToChildren = true
                                            edgeRendering.styles += style
                                        }                                        
                                    }
                                    n2Dep.thickenDependency(4)
//                                    n2Dep.colorDependency(STRONGLY_CONNECTED_COMPONENT_COLOR.copy)                                   
                                }
                            }
                        }
                    }
                }
            }
                        
            // Draw analysis visualization if present.
            scg.synthesizeAnalyses
            scg.synthesizeSchedule
            scg.synthesizeScheduleGroups
            
            if (SHOW_HIERARCHY.booleanValue) {
                scg.nodes.filter(Node).filter[ dependencies.filter(GuardDependency).size > 0].forEach[
                	val allNodes = it.dependencies.filter(GuardDependency).map[ targetNode ].toList
                	val kContainer = allNodes.createHierarchy(NODEGROUPING_GUARDBLOCK, null)
                	
                	for(edge : kContainer.outgoingEdges.filter[ getProperty(GRAPH_DEPENDENCY) instanceof GuardDependency ].toList) {
                		edge.targetPort.remove
                		edge.remove
                	}
                	while(kContainer.incomingEdges.filter[ getProperty(GRAPH_DEPENDENCY) instanceof GuardDependency ].size > 1) {
                		val edge = kContainer.incomingEdges.filter[ getProperty(GRAPH_DEPENDENCY) instanceof GuardDependency ].get(1)
                		edge.targetPort.remove
                		kContainer.incomingEdges -= edge
                		edge.remove
                	}
                	kContainer.incomingEdges.filter[ getProperty(GRAPH_DEPENDENCY) instanceof GuardDependency ].head?.getData(typeof(KRoundedBendsPolyline)).addArrowDecorator
                	
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
            val figure = node.addRoundedRectangle(CORNERRADIUS, CORNERRADIUS, LINEWIDTH)
            var isSCGRef = false
            if (assignment.expression instanceof ReferenceCall) {
                val call = assignment.expression as ReferenceCall
                val decl = call.valuedObject?.eContainer
                if (decl instanceof ReferenceDeclaration) {
                    isSCGRef = decl.reference instanceof SCGraph
                }
            }
            if (isSCGRef) {
                figure.setBackgroundGradient("#fcf7fc".color , "#e6cbf2".color, 90.0f)
            } else {
                figure.background = "white".color;
            }
            (figure) => [
                associateWith(assignment)
                node.setMinimalNodeSize(MINIMALWIDTH, MINIMALHEIGHT)
                if(SHOW_SHADOW.booleanValue) it.shadow = "black".color
                var assignmentStr = ""
                if (assignment.hasAnnotation(ANNOTATION_LABEL)) {
                    assignmentStr = assignment.getStringAnnotationValue(ANNOTATION_LABEL)
                } else if (assignment.hasAnnotation(ANNOTATION_RETURN_NODE)) {
                    assignmentStr = "return " + serializeHR(assignment.expression)
                } else {
                    assignmentStr = serializeHR(assignment) as String
                }
                        
                it.addText(assignmentStr).associateWith(assignment).setSurroundingSpace(4, 0.1f, 2, 0) => [
                    if (USE_ADAPTIVEZOOM.booleanValue) it.setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
                ]
            ]
            
            // Add ports for control-flow and dependency routing.
            if (isGuardSCG) {
            	node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE)
            } else {
	            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER)
            }
            
            if (isGuardSCG) {
                if (assignment.incomingLinks.empty || assignment.incomingLinks.forall[ it instanceof TickBoundaryDependency ]) {
                    node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::FIRST)
                }
            }
            
            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER)
            node.addLayoutParam(CoreOptions::PORT_ALIGNMENT_DEFAULT, PortAlignment::CENTER)
            node.addLayoutParam(CoreOptions::SPACING_PORT_PORT, 10.0)
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
                    node.addPort(SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST).setLayoutOption(CoreOptions::PORT_INDEX, 1)
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
            
                        // Draw the node priorities
            var nodePrio    = -1
            var optNodePrio = -1
            if(assignment.hasAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION)) {
                nodePrio = (assignment.getAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION) as IntAnnotation).value
                
                var container = node.KContainerRendering
                val txt = container.addText(nodePrio.toString)
                txt.setProperty(NODE_PRIO_PROPERTY, true)
                txt.setAreaPlacementData.from(LEFT,0,-0.9f,TOP,0,0).to(RIGHT,0,0,BOTTOM,0,0)
                txt.setForeground(NODE_PRIORITY_COLOR.copy)
                txt.setFontBold(true)
                txt.setFontSize(7)
            }
            
            // Draw the optimized node priority IDs
            if(assignment.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
                optNodePrio = (assignment.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                            as IntAnnotation).value
                
                val container = node.KContainerRendering
                val txt = container.addText(optNodePrio.toString)
                txt.setProperty(OPT_PRIO_PROPERTY, true)
                txt.setAreaPlacementData.from(LEFT,0,0.9f,TOP,0,0.3f).to(RIGHT,0,0.9f,BOTTOM,0,0)
                txt.setForeground(OPT_PRIORITY_COLOR.copy)
                txt.setFontBold(true)
                txt.setFontSize(7)
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
                if (conditional.condition !== null)
                    node.KContainerRendering.addText(
//                        serializer.serialize(conditional.condition.copy.fix).removeParenthesis).setAreaPlacementData.
                        conditionalStr).setAreaPlacementData.
                        from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 1, 0, BOTTOM, 1, 0).associateWith(conditional) => [
                            if (USE_ADAPTIVEZOOM.booleanValue) it.setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
                            it.background = "white".color
                            it.background.alpha = 196
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
            node.addLayoutParam(CoreOptions::PORT_ALIGNMENT_DEFAULT, PortAlignment::CENTER)
            node.addLayoutParam(CoreOptions::SPACING_PORT_PORT, 10.0)
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
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -1.5)
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
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.0)
            }
            // Removed as suggested by uru (mail to cmot, 11.11.2016)  
            if (!SCGraph.hasAnnotation(SCGAnnotations.ANNOTATION_SEQUENTIALIZED) && !CONDITIONAL_LEFT_OR_RIGTH.booleanValue) {          
                port.addLayoutParam(LayeredOptions.ALLOW_NON_FLOW_PORTS_TO_SWITCH_SIDES, Boolean.TRUE)
            }
           
            // Added as suggested by uru (mail to cmot, 11.11.2016)            
            port.addLayoutParam(LayeredOptions::NODE_PLACEMENT_STRATEGY, NodePlacementStrategy.NETWORK_SIMPLEX);

            // Draw the node priorities
            var nodePrio    = -1
            var optNodePrio = -1
            if(conditional.hasAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION)) {
                nodePrio = (conditional.getAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION) as IntAnnotation).value
                
                val container = node.KContainerRendering
                val txt = container.addText(nodePrio.toString)
                txt.setProperty(NODE_PRIO_PROPERTY, true)
                txt.setAreaPlacementData.from(LEFT,0,0,TOP,0,0).to(RIGHT,0,0,BOTTOM,0,0.6f)
                txt.setForeground(NODE_PRIORITY_COLOR.copy)
                txt.setFontBold(true)
                txt.setFontSize(7)
                
            }
            
            // Draw the optimized node priority IDs
            if(conditional.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
                optNodePrio = (conditional.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                            as IntAnnotation).value
                val container = node.KContainerRendering

                val txt = container.addText(optNodePrio.toString)
                txt.setProperty(OPT_PRIO_PROPERTY, true)
                txt.setAreaPlacementData.from(LEFT,0,0,TOP,0,0.6f).to(RIGHT,0,0,BOTTOM,0,0)
                txt.setForeground(OPT_PRIORITY_COLOR.copy)
                txt.setFontBold(true)
                txt.setFontSize(7)
            }
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
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5)
            } else {
                val port = node.addPort(SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST)
                node.addPort(SCGPORTID_OUTGOING, 75, 12.5f, 0, PortSide::EAST)
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5)
            }
            
            // Draw the node priorities
            var nodePrio    = -1
            var optNodePrio = -1
            if(surface.hasAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION)) {
                nodePrio = (surface.getAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION) as IntAnnotation).value
                val container = node.KContainerRendering
                
                val txt = container.addText(nodePrio.toString)
                txt.setProperty(NODE_PRIO_PROPERTY, true)
                txt.setAreaPlacementData.from(LEFT,0,-0.8f,TOP,0,0.6f)//.to(RIGHT,0,0,BOTTOM,0,0.1f)
                txt.setForeground(NODE_PRIORITY_COLOR.copy)
                txt.setFontBold(true)
                txt.setFontSize(7)
                
            }
            
            // Draw the optimized node priority IDs
            if(surface.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
                optNodePrio = (surface.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                        as IntAnnotation).value
                val container = node.KContainerRendering

                val txt = container.addText(optNodePrio.toString)
                txt.setProperty(OPT_PRIO_PROPERTY, true)
                txt.setAreaPlacementData.from(LEFT,0,0.8f,TOP,0,0.6f)//.to(RIGHT,0,0,BOTTOM,0,0.1f)
                txt.setForeground(OPT_PRIORITY_COLOR.copy)
                txt.setFontBold(true)
                txt.setFontSize(7)
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
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5)
            } else {
                node.addPort(SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST)
                val port = node.addPort(SCGPORTID_OUTGOING, 75, 12.5f, 0, PortSide::EAST)
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5)
            }
            
            // Draw the node priorities
            var nodePrio    = -1
            var optNodePrio = -1
            if(depth.hasAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION)) {
                nodePrio = (depth.getAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION) as IntAnnotation).value
                val container = node.KContainerRendering

                val txt = container.addText(nodePrio.toString)
                txt.setProperty(NODE_PRIO_PROPERTY, true)
                txt.setAreaPlacementData.from(LEFT,0,-0.8f,TOP,0,-0.3f).to(RIGHT,0,0,BOTTOM,0,0)
                txt.setForeground(NODE_PRIORITY_COLOR.copy)
                txt.setFontBold(true)
                txt.setFontSize(7)
                
            }
            
            // Draw the optimized node priority IDs
            if(depth.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
                optNodePrio = (depth.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                    as IntAnnotation).value
                val container = node.KContainerRendering

                val txt = container.addText(optNodePrio.toString)
                txt.setProperty(OPT_PRIO_PROPERTY, true)
                txt.setAreaPlacementData.from(LEFT,0,0.8f,TOP,0,-0.3f).to(RIGHT,0,0,BOTTOM,0,0)
                txt.setForeground(OPT_PRIORITY_COLOR.copy)
                txt.setFontBold(true)
                txt.setFontSize(7)
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
            val scg = entry.eContainer as SCGraph
            if (USE_ADAPTIVEZOOM.booleanValue) node.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.50)
            // If the corresponding option is set to true, exit nodes are placed in the first layer;
            if (ALIGN_ENTRYEXIT_NODES.booleanValue)
                node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::FIRST)
            // Draw an ellipse figure for exit nodes...
            val figure = node.addEllipse().background = "white".color;
            figure => [
                node.setMinimalNodeSize(MINIMALWIDTH, MINIMALHEIGHT)
                if (SHOW_CAPTION.booleanValue) {
                    val text = if (entry.hasAnnotation("label")) entry.getStringAnnotationValue("label") else "entry"
                    node.KContainerRendering.addText(text).setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT,
                        0, 0, BOTTOM, 1, 0).associateWith(entry) => [
                            if (USE_ADAPTIVEZOOM.booleanValue) it.setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
                        ]
                }
                if(SHOW_SHADOW.booleanValue) it.shadow = "black".color
                if (scg.method) {
                    val method = scg.methodDeclaration
                    node.addOutsideTopCenteredNodeLabel(
                        (method.returnType !== ValueType.PURE ? method.returnType.literal : "void") + " " +
                        method.valuedObjects.head.name +
                        "(" +
                        method.parameterDeclarations.filter(VariableDeclaration).map[type.literal].join(", ") +
                        ")"
                    )
                }
            ]
            
            // Add ports for control-flow routing.
            if (isGuardSCG) {
                node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE)
            } else {
                node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER)
            }
            node.addLayoutParam(CoreOptions::PORT_ALIGNMENT_DEFAULT, PortAlignment::CENTER)
            node.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 10d)
            if (topdown) {
                node.addPort(SCGPORTID_INCOMING, 37, 0, 1, PortSide::NORTH)
                node.addPort(SCGPORTID_OUTGOING, 37, 25, 0, PortSide::SOUTH)
            } else {
                node.addPort(SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST)
                node.addPort(SCGPORTID_OUTGOING, 75, 12.5f, 0, PortSide::EAST)
            }
            
            // If there is an reset SCG, add it to the diagram
            if (entry.resetSCG !== null) {
                val properties = new KlighdSynthesisProperties
                properties.setProperty(KlighdSynthesisProperties.REQUESTED_UPDATE_STRATEGY, SimpleUpdateStrategy.ID)
                val subDiagramViewContext = LightDiagramServices::translateModel2(entry.resetSCG, usedContext, properties)
                usedContext.addChildViewContext(subDiagramViewContext)
                val subDiagramNode = subDiagramViewContext.viewModel
//                subDiagramNode.addRectangle => [invisible = true]
                val subDiagramChildrenNodes = subDiagramNode.children.immutableCopy 
                rootNode.children.addAll(subDiagramChildrenNodes)      
                createResetTickEdge(subDiagramChildrenNodes.last, node)     
                node.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::NONE)
                subDiagramChildrenNodes.last.addLayoutParam(LayeredOptions::LAYERING_LAYER_CONSTRAINT, LayerConstraint::NONE)     
            }

            
            // Draw the node priorities
            var nodePrio    = -1
            var optNodePrio = -1

            if(entry.hasAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION)) {

                nodePrio = (entry.getAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION) as IntAnnotation).value
                val container = node.KContainerRendering

                val txt = container.addText(nodePrio.toString)
                txt.setProperty(NODE_PRIO_PROPERTY, true)
                txt.setAreaPlacementData.from(LEFT,0,-0.8f,TOP,0,0.1f)//.to(RIGHT,0,0,BOTTOM,0,0.6f)
                txt.setForeground(NODE_PRIORITY_COLOR.copy)
                txt.setFontBold(true)
                txt.setFontSize(7)
                
            }
            
            // Draw the optimized node priority IDs
            if(entry.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
                optNodePrio = (entry.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                    as IntAnnotation).value
                val container = node.KContainerRendering

                val txt = container.addText(optNodePrio.toString)
                txt.setProperty(OPT_PRIO_PROPERTY, true)
                txt.setAreaPlacementData.from(LEFT,0,0.8f,TOP,0,0.1f)//.to(RIGHT,0,0,BOTTOM,0,0.6f)
                txt.setForeground(OPT_PRIORITY_COLOR.copy)
                txt.setFontBold(true)
                txt.setFontSize(7)
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
            val figure = node.addEllipse().background = "white".color;
            figure => [
                node.setMinimalNodeSize(MINIMALWIDTH, MINIMALHEIGHT)
                if (SHOW_CAPTION.booleanValue)
                    node.KContainerRendering.addText("exit").setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT,
                        0, 0, BOTTOM, 1, 0).associateWith(exit) => [
                            if (USE_ADAPTIVEZOOM.booleanValue) it.setProperty(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
                        ]
                if(SHOW_SHADOW.booleanValue) it.shadow = "black".color
            ]
            
            if (exit.final) {
                figure.background = PASSIVE_REGION_COLOR.copy
            }
            
            // Add ports for control-flow routing.
            if (isGuardSCG) {
                node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE)
            } else {
                node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER)
            }
            node.addLayoutParam(CoreOptions::PORT_ALIGNMENT_DEFAULT, PortAlignment::CENTER)
            node.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 10d)
            if (topdown) {
                node.addPort(SCGPORTID_INCOMING, 37, 0, 1, PortSide::NORTH)
                node.addPort(SCGPORTID_OUTGOING, 37, 25, 0, PortSide::SOUTH)
            } else {
                node.addPort(SCGPORTID_INCOMING, 0, 12.5f, 1, PortSide::WEST)
                node.addPort(SCGPORTID_OUTGOING, 75, 12.5f, 0, PortSide::EAST)
            }
            
            // Draw the node priorities
            var nodePrio    = -1
            var optNodePrio = -1
            if(exit.hasAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION)) {
                nodePrio = (exit.getAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION) as IntAnnotation).value
                val container = node.KContainerRendering

                val txt = container.addText(nodePrio.toString)
                txt.setProperty(NODE_PRIO_PROPERTY, true)
                txt.setAreaPlacementData.from(LEFT,0,-0.8f,TOP,0,0.1f)//.to(RIGHT,0,0,BOTTOM,0,0.6f)
                txt.setForeground(NODE_PRIORITY_COLOR.copy)
                txt.setFontBold(true)
                txt.setFontSize(7)
                
            }
            
            // Draw the optimized node priority IDs
            if(exit.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
                optNodePrio = (exit.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                    as IntAnnotation).value
                val container = node.KContainerRendering

                val txt = container.addText(optNodePrio.toString)
                txt.setProperty(OPT_PRIO_PROPERTY, true)
                txt.setAreaPlacementData.from(LEFT,0,0.8f,TOP,0,0.1f)//.to(RIGHT,0,0,BOTTOM,0,0.6f)
                txt.setForeground(OPT_PRIORITY_COLOR.copy)
                txt.setFontBold(true)
                txt.setFontSize(7)
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
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5)
            } else {
                val port = node.addPort(SCGPORTID_INCOMING, 0, 37.5f, 1, PortSide::WEST)
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, 0.5)
            }
            
            // Draw the node priorities
            var nodePrio    = -1
            var optNodePrio = -1
            if(fork.hasAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION)) {
                nodePrio = (fork.getAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION) as IntAnnotation).value
                val container = node.KContainerRendering

                val txt = container.addText(nodePrio.toString)
                txt.setProperty(NODE_PRIO_PROPERTY, true)
                txt.setAreaPlacementData.from(LEFT,0,-0.6f,TOP,0,0.6f)//.to(RIGHT,0,0,BOTTOM,0,0.6f)
                txt.setForeground(NODE_PRIORITY_COLOR.copy)
                txt.setFontBold(true)
                txt.setFontSize(7)
                
            }
            
            // Draw the optimized node priority IDs
            if(fork.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
                optNodePrio = (fork.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                    as IntAnnotation).value
                val container = node.KContainerRendering

                val txt = container.addText(optNodePrio.toString)
                txt.setProperty(OPT_PRIO_PROPERTY, true)
                txt.setAreaPlacementData.from(LEFT,0,0.6f,TOP,0,0.6f)//.to(RIGHT,0,0,BOTTOM,0,0.6f)
                txt.setForeground(OPT_PRIORITY_COLOR.copy)
                txt.setFontBold(true)
                txt.setFontSize(7)
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
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -0.5)
            } else {
                val port = node.addPort(SCGPORTID_OUTGOING, 0, 37.5f, 0, PortSide::EAST)
                port.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -0.5)
            }
            
            // Draw the node priorities
            var nodePrio    = -1
            var optNodePrio = -1
            if(join.hasAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION)) {
                nodePrio = (join.getAnnotation(PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION) as IntAnnotation).value
                val container = node.KContainerRendering

                val txt = container.addText(nodePrio.toString)
                txt.setProperty(NODE_PRIO_PROPERTY, true)
                txt.setAreaPlacementData.from(LEFT,0,-0.6f,TOP,0,0).to(RIGHT,0,0,BOTTOM,0,0.6f)
                txt.setForeground(NODE_PRIORITY_COLOR.copy)
                txt.setFontBold(true)
                txt.setFontSize(7)
                
            }
            
            // Draw the optimized node priority IDs
            if(join.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
                optNodePrio = (join.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                    as IntAnnotation).value
                val container = node.KContainerRendering

                val txt = container.addText(optNodePrio.toString)
                txt.setProperty(OPT_PRIO_PROPERTY, true)
                txt.setAreaPlacementData.from(LEFT,0,0.6f,TOP,0,0).to(RIGHT,0,0,BOTTOM,0,0.6f)
                txt.setForeground(OPT_PRIORITY_COLOR.copy)
                txt.setFontBold(true)
                txt.setFontSize(7)
            }
        ]
    }
    
    private def synthesizeAnnotations(Node node) {
        if (!SHOW_ANNOTATIONS.booleanValue) return; 
        if (node.annotations.empty) return;
        
        var commentText = "Annotations:\n"
        
        for (a : node.annotations) {
            commentText += "\n"
            commentText += a.name
            switch(a) {
                StringAnnotation: commentText += ": " + a.values
                IntAnnotation: commentText += ": " + a.value
            }  
        }
        
        val aNode = createNode()
        aNode.addLayoutParam(CoreOptions.COMMENT_BOX, true)
    
        aNode.setMinimalNodeSize(16, 16)
        aNode.addRoundedRectangle(1, 1, 1) => [
            setBackgroundGradient(COMMENT_BACKGROUND_GRADIENT_1.color2, COMMENT_BACKGROUND_GRADIENT_2.color2, 90);
            foreground = COMMENT_FOREGROND.color2;
        ]
        aNode.getKContainerRendering.addText(commentText) => [
            fontSize = 8;
            setGridPlacementData().from(LEFT, 4, 0, TOP, 4, 0).to(RIGHT, 4, 0, BOTTOM, 4, 0);
        ]
        
        val edge = createEdge()
        edge.source = node.getNode
        edge.target = aNode
        edge.addPolyline => [
            lineWidth = 1;
            foreground = COMMENT_EDGE.color
        ]
        
        node.getNode.parent.children += aNode
        annotationNodeAttachments.put(node.getNode, aNode)
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
            edge.addRoundedBendsPolyline(8, CONTROLFLOW_THICKNESS.floatValue) => [
                it.lineStyle = LineStyle::DOT;
            ]
            if (USE_ADAPTIVEZOOM.booleanValue) edge.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
        ]
    }
    
    private def KEdge createResetTickEdge(KNode resetExit, KNode entry) {
        entry.addHelperPort("resettick", PortSide::NORTH)
        resetExit.addHelperPort("resettick2", PortSide::SOUTH)
        entry.addHelperPort("resettick2", PortSide::NORTH)
        resetExit.addHelperPort("resettick", PortSide::SOUTH)
//        entry.addPort("resettick2", 42, 0, 1, PortSide::NORTH)
//        resetExit.addPort("resettick2", 38, 0, 1, PortSide::SOUTH)
        
        val resetTickEdge = createNewEdge() => [ edge |
            edge.source = resetExit
            edge.target = entry
            edge.sourcePort = resetExit.getPort("resettick")
            edge.targetPort = entry.getPort("resettick")
            edge.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
            edge.addLayoutParam(LayeredOptions::PRIORITY, 0);
            edge.addRoundedBendsPolyline(8, CONTROLFLOW_THICKNESS.floatValue) => [
                it.lineStyle = LineStyle::DOT;
                it.foreground = Colors.RED
            ]
            if (USE_ADAPTIVEZOOM.booleanValue) edge.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.70);
        ]
        
        return resetTickEdge
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
        if(controlFlow.target === null || controlFlow.eContainer === null) return null;

        return controlFlow.createNewEdge().associateWith(controlFlow) => [ edge |
            // Get and set source and target information.
            val sourceObj = controlFlow.eContainer
            val targetObj = controlFlow.target
            var sourceNode = sourceObj.node
            var targetNode = targetObj.node
            edge.source = sourceNode
            edge.target = targetNode
            edge.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
            edge.addLayoutParam(LayeredOptions::PRIORITY, 1);

            if (USE_ADAPTIVEZOOM.booleanValue) edge.setLayoutOption(KlighdProperties.VISIBILITY_SCALE_LOWER_BOUND, 0.50);
            // If the source is a fork node, create a new port for this control flow and attach it.
            // Otherwise, use the outgoing port identified by the given parameter.
            if (sourceObj instanceof Fork) {
                sourceObj.node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints.FIXED_ORDER)
                edge.sourcePort = sourceObj.node.createPort("fork" + targetObj.hashCode()) => [
                    if (topdown())
                        it.addLayoutParam(CoreOptions::PORT_SIDE, PortSide::SOUTH)
                    else
                        it.addLayoutParam(CoreOptions::PORT_SIDE, PortSide::EAST)
                    it.setPortSize(3, 3)
                    it.addRectangle.invisible = true;
                    it.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -3.0)
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
                sourceObj.node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints.FIXED_ORDER)
                edge.targetPort = targetObj.node.createPort("join" + sourceObj.hashCode()) => [
                    if (topdown())
                        it.addLayoutParam(CoreOptions::PORT_SIDE, PortSide::NORTH)
                    else
                        it.addLayoutParam(CoreOptions::PORT_SIDE, PortSide::WEST)
                    it.setPortSize(3, 3)
                    it.addRectangle.invisible = true;
                    it.addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -1.5)
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
            edge.addRoundedBendsPolyline(8, CONTROLFLOW_THICKNESS.floatValue) => [
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
            
            if (controlFlow.targetNode.schizophrenic) {
                edge.KRendering.foreground = SCHIZO_COLOR.copy
            }
            
            
            //Visualize the prio-statements of the priority-based approach
            if(!(sourceObj instanceof Fork) && !(sourceObj instanceof Depth) && !(targetObj instanceof Join)){
                val srcNode = sourceObj as Node
                val tgtNode = targetObj as Node
                if(srcNode.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                    && tgtNode.hasAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)) {
                    val srcPrio = srcNode.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                            as IntAnnotation
                    val tgtPrio = tgtNode.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                            as IntAnnotation
                    if(srcPrio.value != tgtPrio.value) {
                        edge.sourcePort => [
                            it.setPortSize(50, 20)
                            it.KContainerRendering.setProperty(PRIO_STATEMENTS_PROPERTY, true)
                            var rec = it.KContainerRendering.addRoundedRectangle(CORNERRADIUS, CORNERRADIUS, LINEWIDTH)
                            rec.background = "white".color
                            var txt = rec.addText("prio(" + tgtPrio.value + ")")
                            txt.fontSize = 7
                            var x = txt.setAreaPlacementData
                            x.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 1, 0, BOTTOM, 1, 0)
                        ]
                    }
                }
            }            
        ]
    }
    
    private def KNode createDeadend(KNode node, String outgoingPortId) {
        val deadend = createNode() => [ n |
            val figure = n.addEllipse()
            figure => [
                n.setMinimalNodeSize(8, 8)
                foreground = SCHIZO_COLOR.copy
                background = SCHIZO_COLOR.copy
            ]
        ]

        createNewEdge() => [ edge |
            // Get and set source and target information.
            var sourceNode = node
            var targetNode = deadend
            edge.source = sourceNode
            edge.target = targetNode
            edge.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
            edge.sourcePort = sourceNode.getPort(outgoingPortId)
            edge.addRoundedBendsPolyline(8, CONTROLFLOW_THICKNESS.floatValue) => [
                it.lineStyle = LineStyle::SOLID
//                it.addArrowDecorator
                it.foreground = SCHIZO_COLOR.copy
            ]
        ]
        hierarchyAttachment.put(node, deadend)

        deadend
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
            	edge.setProperty(GRAPH_DEPENDENCY, dependency);         	
            }
            else if (dependency instanceof TickBoundaryDependency) {
                edge.addRoundedBendsPolyline(8, 2) => [
                    // ... and use the predefined color for the different dependency types.    
                    it.foreground = DEPENDENCY_TICKBOUNDARY.copy
                    it.lineStyle = LineStyle::DOT
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
            		sourceNode.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
            	} else {
                	edge.sourcePort = sourceNode.getPort(SCGPORTID_OUTGOINGDEPENDENCY)
                	edge.targetPort = targetNode.getPort(SCGPORTID_INCOMINGDEPENDENCY)
                }
            } else {
                // Otherwise, add NO_LAYOUT as layout option to trigger node-to-node hierarchy-crossover
                // drawing.
                edge.setLayoutOption(CoreOptions::NO_LAYOUT, true)
            }
            
            // hide if only selected elements should be shown
            if (SELECTIVE_DEPENDENCIES.booleanValue) {
                edge.initiallyHide
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
        nodes.forEach[e|
            kNodeList.add(e.node)
            val attachments = hierarchyAttachment.get(e.node)
            if (!attachments.empty) {
                attachments.forEach[ kNodeList += it]
            }
            val annotationNode = annotationNodeAttachments.get(e.node)
            if (annotationNode !== null) {
                kNodeList += annotationNode
            }
        ]

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
        kContainer.addLayoutParam(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID)
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
            kContainer.addRoundedRectangle(1, 1, 2) => [
                lineStyle = LineStyle::SOLID
                associateWith(contextObject)
            ]
            kContainer.KRendering.foreground = SCHEDULEBORDER.copy;
            kContainer.KRendering.foreground.alpha = Math.round(196f)
            kContainer.KRendering.background = SCCHARTSBLUE.copy;
            kContainer.KRendering.background.alpha = Math.round(0f)
        }
        if (nodeGrouping == NODEGROUPING_SCC) {
            kContainer.addRoundedRectangle(1, 1, 2) => [
                lineStyle = LineStyle::SOLID
                associateWith(contextObject)
            ]
            kContainer.KRendering.foreground = SCHEDULINGBLOCKBORDER.copy;
            kContainer.KRendering.foreground.alpha = Math.round(196f)
            kContainer.KRendering.background = SCCHARTSBLUE.copy;
            kContainer.KRendering.background.alpha = Math.round(0f)
        }
        
        // Add the nodes to the container.
        // They will be removed from the original parent!
        for (tn : kNodeList) {
            kContainer.children += tn

// FIXME: this doesnt work properly. See KIPRA-1788.
// The boxed first layer feature should be implemented in the new synthesis.
//            if (nodeGrouping != NODEGROUPING_HIERARCHY)
//                if (tn.node.getData(typeof(KShapeLayout)).getProperty(Properties::LAYER_CONSTRAINT) ==
//                    LayerConstraint::FIRST) {
//                        kContainer.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::FIRST)
//                    }
        }

        // Add the container to the original parent.
        if (kParent !== null) kParent.children += kContainer

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
            newEdge.addRoundedBendsPolyline(8, CONTROLFLOW_THICKNESS.floatValue) => [
                it.lineStyle = ne.KRendering.lineStyleValue
                it.foreground = ne.KRendering.foreground
            ]
            newEdge.labels.addAll(ne.labels)
            
            // Save edge properties
            if (ne.getProperty(GRAPH_DEPENDENCY) !== null) {
                newEdge.setProperty(GRAPH_DEPENDENCY, ne.getProperty(GRAPH_DEPENDENCY))
            }
            
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
                    if (basicBlock.deadBlock && (guard === null || guard.expression === null)) {
                        expText = "<null>"
                    } else {
                        val exp = guard.expression.copy
                    	expText = serializeHR(exp) as String
                    }
					bbName = bbName + "\n" + expText                	
                }
                
    			bbName = bbName.replaceAll("_g", "g")                	
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
                     if (schedulingBlock.guards.head !== null) { 
                         if (schedulingBlock.guards.head.valuedObject.name != schedulingBlock.label) {
                            sbName = sbName + "(" + schedulingBlock.guards.head.valuedObject.name + ")"//reference.valuedObject.name
                         }
                     }

	                if (scg.hasAnnotation(ANNOTATION_GUARDCREATOR)) {
	                    var expText = "<null>"
	                    if (schedulingBlock.guards.head !== null /* && !schedulingBlock.basicBlock.deadBlock */) {
        	            	expText = serializeHR(schedulingBlock.guards.head.expression) as String
    	            	}	
						sbName = sbName + "\n" + expText       
					}
            	    
            	    if (!SHOW_BASICBLOCKS.booleanValue || basicBlock.schedulingBlocks.size > 1) {
            	        sbName = sbName.replaceAll("_g", "g")
                	    sbName.createLabel(sbContainer).associateWith(schedulingBlock).configureOutsideTopLeftNodeLabel(sbName, 9, KlighdConstants::DEFAULT_FONT_NAME).KRendering.foreground = SCHEDULINGBLOCKBORDER.copy
               	    }
                	
                    if (basicBlock.deadBlock) {
                        sbContainer.getData(typeof(KRoundedRectangle)) => [
                            it.lineStyle = LineStyle::SOLID
                            it.foreground = SCHEDULING_DEADCODE.copy
                        ]
                        sbContainer.KRendering.background = SCHEDULING_DEADCODE.copy
                        sbContainer.KRendering.background.alpha = 128
                        
                        if (!SHOW_DEAD_BLOCKS.booleanValue) {
                            sbContainer.children.clear
                            sbContainer.remove
                        }
                    } else if (basicBlock.termBlock) {
                        sbContainer.getData(KRoundedRectangle) => [
                            it.lineWidth = 2.0f
                        ]
                    }
                    
                    if (schedulingBlock.basicBlock.finalBlock && schedulingBlock.basicBlock.schedulingBlocks.head == schedulingBlock) {
                        sbContainer.KRendering.lineStyle = LineStyle::DASH
                        sbContainer.KRendering.foreground = PASSIVE_REGION_COLOR.copy
                        sbContainer.KRendering.background = PASSIVE_REGION_COLOR.copy
                        sbContainer.KRendering.background.alpha = 96
                    }
                }
        }

        
    }
    
    private def void synthesizeSchedule(SCGraph scg) {
        if (!(scg.hasSchedulingData && SHOW_SCHEDULINGPATH.booleanValue)) return;
        
    	for(node : scg.nodes) {
    	    if (!node.dependencies.filter(ScheduleDependency).empty) { 
      		    val sourceKNode = node.node 
      			val targetNode = node.dependencies.filter(ScheduleDependency).head.target
       			val targetKNode = targetNode.node
				val nonScheduleDependencies = node.dependenciesView.filter[ !(it instanceof ScheduleDependency) ].
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

        for (node : scg.nodes.filter[ incomingLinks.filter(ScheduleDependency).empty && incomingLinks.filter(GuardDependency).empty ]) {
            val newSchedule = <Node> newArrayList => [ s | 
                s += node
                node.dependencies.filter(GuardDependency).forEach[ s += it.targetNode ]
            ]
            var next = node.dependencies.filter(ScheduleDependency).head?.targetNode
            while (next !== null) {
                newSchedule += next
                next.dependencies.filter(GuardDependency).forEach[ newSchedule += it.targetNode ]
                next = next.dependencies.filter(ScheduleDependency).head?.targetNode
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

        if (pilNodes.empty) return;
        if (isGuardSCG) return;
        
        for (n : pilNodes.filter[ it !== null]) {
            val nextFlows = n.allNext
            var hasFlows = false
            for (flow : nextFlows) {
                if (pilNodes.contains(flow.target)) {
                    flow.colorControlFlow(PROBLEM_COLOR.copy)
                    flow.thickenControlFlow(PROBLEM_WIDTH)
                    hasFlows = true
                } 
            }
            
            if (!hasFlows) {
                val nextDeps = n.eContents.filter(DataDependency).filter[ concurrent && !confluent ].toList
                for (flow : nextDeps) {
                    if (pilNodes.contains(flow.target)) {
                        flow.colorDependency(PROBLEM_COLOR.copy)
                        flow.thickenDependency(PROBLEM_WIDTH)
                    } 
                }
            }            
        }
    }
    
    
    private def void synthesizeSCCInGuardSCG(SCGraph scg) {
        val rootModel = scg.eContainer
        var LoopData ld = null;
        
        val compilationContext = usedContext.getProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT)
        if (compilationContext !== null) {
            val scgs = scg.eContainer
            if (scgs !== null) {
                ld = compilationContext.getResultForModel(scgs)?.getProperty(LoopAnalyzerV2.LOOP_DATA, rootModel)
            }
        }        
        
        if (ld === null) return;
        
        for (l : ld.loops) {
            val guardedNodes = <Node> newHashSet
            for (n : l.criticalNodes.filter[ it !== null ]) {
                for (gd : n.dependencies.filter(GuardDependency)) {
                    guardedNodes += gd.target as Node
                }
            }

            createHierarchy((l.criticalNodes + guardedNodes).toList, NODEGROUPING_SCC, scg)
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
