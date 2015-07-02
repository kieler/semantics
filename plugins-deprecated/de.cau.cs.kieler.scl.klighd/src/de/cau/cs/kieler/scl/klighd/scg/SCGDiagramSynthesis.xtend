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
package de.cau.cs.kieler.scl.klighd.scg

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableMap
import com.google.common.collect.ImmutableSet
import com.google.inject.Injector
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
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
import de.cau.cs.kieler.kiml.options.SizeConstraint
import de.cau.cs.kieler.kiml.util.KimlUtil
import de.cau.cs.kieler.klay.layered.p4nodes.NodePlacementStrategy
import de.cau.cs.kieler.klay.layered.properties.LayerConstraint
import de.cau.cs.kieler.klay.layered.properties.Properties
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.TransformationOption
import de.cau.cs.kieler.klighd.transformations.AbstractDiagramSynthesis
import de.cau.cs.kieler.scl.SCLStandaloneSetup
import de.cau.cs.kieler.scl.extensions.SCLBasicBlockExtensions
import de.cau.cs.kieler.scl.extensions.SCLDependencyExtensions
import de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions
import de.cau.cs.kieler.scl.extensions.SCLFactoryExtensions
import de.cau.cs.kieler.scl.extensions.SCLGotoExtensions
import de.cau.cs.kieler.scl.extensions.SCLStatementExtensions
import de.cau.cs.kieler.scl.extensions.SCLStatementSequenceExtensions
import de.cau.cs.kieler.scl.extensions.DependencyType
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.StatementSequence
import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import javax.inject.Inject
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.serializer.ISerializer
import org.yakindu.sct.model.stext.stext.Expression

import static de.cau.cs.kieler.scl.klighd.scg.SCGDiagramSynthesis.*

/*
 * This class extends the klighd diagram synthesis to draw scl program models in klighd.
 * It is linked to klighd via the de.cau.cs.kieler.klighd.modelTransformations extension.
 */
class SCGDiagramSynthesis extends AbstractDiagramSynthesis<Program> {
    
    /*
     * Injector and Serializer
     * Needed for SText expression serialization
     */
    private static val Injector i = SCLStandaloneSetup::doSetup();
    private static val ISerializer serializer = i.getInstance(typeof(ISerializer));

    // Inject all necessary KRendering extensions
    @Inject
    extension KRenderingUtil
	@Inject
	extension KNodeExtensions
	@Inject
	extension KEdgeExtensions
    @Inject
    extension KRenderingExtensions
    @Inject
    extension KPolylineExtensions
	@Inject
	extension KColorExtensions
	@Inject
	extension KPortExtensions
	@Inject
	extension KLabelExtensions
    private static val KRenderingFactory renderingFactory = KRenderingFactory::eINSTANCE
	@Inject
	extension SCLExpressionExtensions
	@Inject
	extension SCLStatementSequenceExtensions
    @Inject
    extension SCLGotoExtensions	
    @Inject
    extension SCLStatementExtensions
    @Inject
    extension SCLBasicBlockExtensions
    @Inject
    extension SCLDependencyExtensions
    @Inject
    extension SCLFactoryExtensions
	
	
    // Constants for the klighd content filter
    private static val SCGRAPH = "Draw SC Graph";
    private static val SCGRAPH_WO_HIERARCHY = "Draw SC Graph without hierarchy";
    private static val SCGRAPH_AND_DEPENDENCIES = "Draw SC Graph && dependencies";
    private static val SCGRAPH_AND_BASICBLOCKS = "Draw SC Graph && basic blocks"
    private static val SCGRAPH_DEPENDENCIES_AND_BASICBLOCKS = "Draw SC Graph, dependencies && basic blocks";
    
    private static val String SCG_FILTER_NAME = "SC Graph Filter";

    override getRecommendedLayoutOptions() {
        return ImmutableMap::<IProperty<?>, Collection<?>>of(
            LayoutOptions::SPACING, newArrayList(0, 200),
            Properties::NODE_PLACER, NodePlacementStrategy::values
        );
    }

    /**
     * The class filter option definition that allows the user to customize the class diagram.
     */
    private static val TransformationOption SCGRAPH_FILTER = TransformationOption::createChoiceOption(SCG_FILTER_NAME,
       ImmutableList::of(SCGRAPH, 
           SCGRAPH_WO_HIERARCHY, 
           SCGRAPH_AND_DEPENDENCIES, 
           SCGRAPH_AND_BASICBLOCKS,
           SCGRAPH_DEPENDENCIES_AND_BASICBLOCKS
       ), SCGRAPH_DEPENDENCIES_AND_BASICBLOCKS);
       
    private static val PARALLEL_HIERARCHY_EDGES = false
    private static val NODEPLACEMENT_LINEARSEGMENTS = false
    private static val PAUSEDEPTH_FIRST = true

    private static val DEPENDENCY_COLOR = "red"
    private static val DEPENDENCY_COLOR_WR = "darkOrange"
    
    private static val SCLANNOTATION_DEPTH_INLINE = 'inline'
    private static val SCLANNOTATION_CONDITIONAL_BRANCH = 'branch'
    private static val SCLANNOTATION_DEPENDENCY = 'dependency'

    /*
     * These maps link the scl program instructions to krendering nodes and ports.
     * Since the target of a goto instruction might not be known at the time the goto statement is
     * evaluated, all goto targets are saved and drawn once the whole program has been processed.
     */
    private var HashMap<Instruction, Pair<KNode, KNode>>InstructionMapping;
    private var HashMap<KNode, HashMap<String, KPort>>PortMapping;
    private var HashMap<Pair<Goto, Integer>, Pair<KNode, String>>GotoMapping;
    /* 
     * ParallelExitMap is used by the goto mapping to draw edges to the exit node.
     * Might be replaced by the edgeMapping in a later revision.
     */
    private var HashMap<StatementSequence, KNode>ParallelExitMapping;
    
    // To keep the code clean all edges are reserved and drawn once the program evaluation is complete.  
    private var HashMap<KNode, HashMap<KPort, Pair<KNode, KPort>>>EdgeMapping;
    
    private var KNode ProgramRootNode;
    
    /**
     * {@inheritDoc}
     * <br><br>
     * Registers the content filter option.
     */
    override public getTransformationOptions() {
        return ImmutableSet::of(SCGRAPH_FILTER);
    }   

    /**
     * {@inheritDoc}
     * <br><br>
     * Transforms a scl program to visualize it in klighd
     */
	override KNode transform(Program program) {

        // Initialize all maps	    
	    InstructionMapping = new HashMap<Instruction, Pair<KNode, KNode>>;
	    PortMapping = new HashMap<KNode, HashMap<String, KPort>>;
	    GotoMapping = new HashMap<Pair<Goto, Integer>, Pair<KNode, String>>;
	    ParallelExitMapping = new HashMap<StatementSequence, KNode>;
	    EdgeMapping = new HashMap<KNode, HashMap<KPort, Pair<KNode, KPort>>>;
		
		// Initialize root node
        val rootNode = KimlUtil::createInitializedNode;

        // Set layout parameter        
        rootNode.addLayoutParam(LayoutOptions::SPACING, Float::valueOf("30.0"));
        rootNode.addLayoutParam(LayoutOptions::DIRECTION, Direction::DOWN);
        rootNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
        rootNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
        rootNode.addLayoutParam(Properties::THOROUGHNESS, 100)
        rootNode.addLayoutParam(LayoutOptions::SEPARATE_CC, false);
        if (NODEPLACEMENT_LINEARSEGMENTS || program.hasGlobalParameter('placement','linear')) 
            rootNode.addLayoutParam(Properties::NODE_PLACER, NodePlacementStrategy::LINEAR_SEGMENTS)

        // Evaluate the program beginning at the program root
        ProgramRootNode = rootNode
        program.createProgramFigure(rootNode);        		
        
        rootNode
	}

    /**
     * Creates the transformation for a scl program.
     * 
     * This method creates an entry and an exit node for a program and then executes the transformation
     * for the root instruction list of a scl program. 
     * Subsequently, all reserved goto statements are evaluated and finally all edges are drawn.    
     */
    def createProgramFigure(Program program, KNode rootNode) {
        
        // Create objects for the entry and exit nodes
        val EntryObj = new Object
        val ExitObj = new Object
            
        // Create the entry node
        val kEntryNode = EntryObj.createEllipseNode(30,75).putToLookUpWith(EntryObj)
        kEntryNode.KRendering.add(factory.createKLineWidth.of(2));
        kEntryNode.KRendering.foreground = "gray".color;
        kEntryNode.KRendering.add(factory.createKText.of('entry'));
        rootNode.children.add(kEntryNode)
        if (program.hasGlobalParameter('layer', 'separate'))
            kEntryNode.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::FIRST_SEPARATE)
        else
            kEntryNode.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::FIRST)
//        kEntryNode.addNSPortFixed;
                
        // Create the exit node
//        val kExitNode = ExitObj..createNode("exit").setNodeSize(30,75);
//        kExitNode.addEllipse;
        val kExitNode = ExitObj.createEllipseNode(30, 75);
        kExitNode.KRendering.lineWidth = 2;
        kExitNode.KRendering.foreground = "gray".color;
        kExitNode.KRendering.add(factory.createKText.of('exit'));
        rootNode.children.add(kExitNode)
        if (program.hasGlobalParameter('layer', 'separate'))
            kExitNode.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::LAST_SEPARATE)
        else
            kExitNode.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::LAST)
        kExitNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS)
        
        // Add incoming port for the exit node
//        kExitNode.addNSPortsFixed;
        (ExitObj.createPort() => [
            kExitNode.ports += it
            it.setPortPos(37, 0)
            it.setPortSize(2,2)
            it.addRectangle.invisible = true;
            it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::NORTH);
        ]).addToPortMapping(kExitNode, 'incoming')
                    
        // Evaluate the root instruction list
        createInstructionListFigure(program.statements, rootNode, kEntryNode, kExitNode, '')
        ParallelExitMapping.put(program.statements.head.getThread, kExitNode);

        // Process all reserved goto statements
        for(gotoPair : GotoMapping.keySet) {
            val goto = gotoPair.first
            // Retrieve source node and port
            val sourceNode = GotoMapping.get(gotoPair).first
            val sourcePortID = GotoMapping.get(gotoPair).second.normalizeSource
            
            /*
             * Retrieve target information and find target instruction.
             * 
             * Since the target label specifies a label which is not a visible node in the klighd
             * graph, one has to iterate through the code to find the next valid instruction 
             * in the specified scope that follows the targeted label. 
             */
             var targetNode = InstructionMapping.get(goto.getTargetStatement?.getInstructionStatement?.instruction)?.first            
             if (targetNode == null) {
                /*
                 * If no follow up instruction was found, retrieve the label and search for an exit node
                 * in a higher hierarchy. 
                 */
                    targetNode = ParallelExitMapping.get(goto.getThread)
             }
            
             // Schedule an edge, if source and target are valid.
             if (targetNode != null) {
                 sourceNode.addEdge(sourcePortID, targetNode, 'incoming');
             }
        }
        
        // Create all edges
        for(sourceNode : EdgeMapping.keySet) {
            val sourceEdges = EdgeMapping.get(sourceNode)
            for (sourcePort : sourceEdges.keySet) {
                val destination = sourceEdges.get(sourcePort);
                createEdge(sourceNode, destination.first, sourcePort, destination.second, true);
            }
        }

        if (SCGRAPH_FILTER.optionValue == SCGRAPH_AND_BASICBLOCKS ||
            SCGRAPH_FILTER.optionValue == SCGRAPH_DEPENDENCIES_AND_BASICBLOCKS
        ) {
            kExitNode.KRendering => [ //data += renderingFactory.createKRoundedBendsPolyline() => [
                it.invisible = false;
                it.invisible.modifierId = "de.cau.cs.kieler.scl.klighd.scg.BasicBlockModifier"
            ];       
            val bbDataHolder = new BasicBlockDataHolder()
            bbDataHolder.SCLProgram = program
            bbDataHolder.NodeData = InstructionMapping.clone as HashMap<Instruction, Pair<KNode, KNode>>
            bbDataHolder.BasicBlockData.addAll(program.statements.head.getAllBasicBlocks)
            kExitNode.data += bbDataHolder        
        }

        if (SCGRAPH_FILTER.optionValue == SCGRAPH_AND_DEPENDENCIES ||
            SCGRAPH_FILTER.optionValue == SCGRAPH_DEPENDENCIES_AND_BASICBLOCKS
        ) {

        val markedEdges = new HashMap<KNode, KNode>
        val depInstrList = program.eAllContents.filter(typeof(Assignment)).toList
        for(instruction : depInstrList) {
            val sourceNode = InstructionMapping.get(instruction)?.first
            val depList = instruction.dependencyInstructions(program)
            for (targetInstruction : depList) {
                if (!instruction.isInSameThreadAs(targetInstruction.getInstruction) && !instruction.isInMainThread &&
                    !targetInstruction.isInMainThread /* && instruction.hasSameThreadParentAs(targetInstruction.getInstruction)*/
                    && instruction.getLeastCommonAncestorParallel(targetInstruction.getInstruction) != null
                ) {
                val targetNode = InstructionMapping.get(targetInstruction.getInstruction)?.first
                if (sourceNode != targetNode && sourceNode != null && targetNode != null &&
                    !((markedEdges.containsKey(targetNode) && markedEdges.get(targetNode) == sourceNode))) {
                        
                    val depType = instruction.dependencyType(targetInstruction.getInstruction)
//                    val depTypeString = depType.dependencyTypeToString
                        
                    if (depType != DependencyType::UNKNOWN) {
                    val edge = createEdge() => [
                        it.source = sourceNode
                        it.sourcePort = sourceNode.getPort('dependency')
                        it.target = targetNode
                        it.targetPort = targetNode.getPort('dependency')
                        it.data += renderingFactory.createKRoundedBendsPolyline() => [
                            it.bendRadius = 5;
                            it.setLineWidth(1.25f);
                            it.foreground = DEPENDENCY_COLOR.color
                            if (depType == DependencyType::WRITEINCREMENT) {
                                it.foreground = "blue".color
                                it.addArrowDecorator();                                
                            }
                            if (depType == DependencyType::WRITEREAD) {
                                it.setForegroundColor(0, 192, 0)
                                it.addArrowDecorator();                                
                            }
                            if (depType == DependencyType::READINCREMENT) {
                                it.setForegroundColor(0, 168, 168)
                                it.addArrowDecorator();                                
                            }
                            it.setLineStyle(LineStyle::DASH);
                        ];          
                    ]
//                    edge.createLabel.configureCenteralLabel(depTypeString, 9, KlighdConstants::DEFAULT_FONT_NAME)
                    edge.putToLookUpWith(targetInstruction.getInstruction)
                    Debug("Dependency found! Type: " + depType)
                    markedEdges.put(sourceNode, targetNode)
                    }
                }   
            }
            }
        }
        
        }
    }
	
    /**
     * Creates the transformation for a scl instruction list
     * 
     * This method evaluates a scl instruction list and calls more specific figure methods if 
     * necessary. Because instructions can include other instructions lists, it is possible this method
     * is called several times recursively.
     *  
     * A list of preceding instructions is stored in lastInstructions and used to schedule edges from 
     * the actual instruction to its predecessors.
     * 
     * alternativeOutgoingID specifies the outgoing port on the parent knode. One can alter the default
     * port to enable different outgoing ports on the parent node. (f.e. true and false at a conditional
     * node.)       
     */
	def createInstructionListFigure(EList<Statement> iList, KNode rootNode, KNode entryNode, KNode exitNode,
	    String alternativeOutgoingID) {
	    
	    // preceding instructions and returned instructions from other scl statements
	    var ArrayList<Instruction> lastInstructions = new ArrayList<Instruction>
        var ArrayList returnList 
	    
	    // prepare source nod information, set to default, if port is empty
        var sourceNode = entryNode
        var sourceNodeOutID = alternativeOutgoingID
        if (sourceNodeOutID.empty) { sourceNodeOutID = 'outgoing' }
        
        
        var Statement actualBasicBlockRoot = null
	    
	    // iterate through whole instruction list
	    for(statement : iList.filter(typeof(InstructionStatement))) {
	        val instruction = statement.instruction
	        /*
	         * For instructions with visual nodes, call their figure functions directly and retrieve 
	         * last instructions.
	         * 
	         * For non-visual instructions (goto), take the last valid instruction as edge source.
	         * If there is no preceding instruction, the goto is the first instruction in this hierarchy.
	         * Take the source node of this hierarchy instead. The goto mapping will handle the rest.
	         */
            switch(instruction) {
                Assignment: returnList = ((instruction as Assignment).createAssignmentFigure(rootNode)) 
                Parallel: returnList = ((instruction as Parallel).createParallelFigure(rootNode))
                Pause: returnList = ((instruction as Pause).createPauseFigure(rootNode))
                Conditional: { returnList = ((instruction as Conditional).createConditionalFigure(rootNode)) }
                Goto: {
                    if (!lastInstructions.empty) {
                        // Map last instruction in goto map
                        var i = 0
                        for(instr: lastInstructions) {
                            GotoMapping.put(new Pair<Goto, Integer>((instruction as Goto), new Integer(i)), 
                                new Pair<KNode, String>(InstructionMapping.get(instr as Instruction).second,
                                    sourceNodeOutID))
                            i = i + 1
                        }
                    } else { 
                        // Map preceding hierarchy node in goto map
                        GotoMapping.put(new Pair<Goto, Integer>((instruction as Goto), new Integer(0)), 
                            new Pair<KNode, String>(sourceNode, sourceNodeOutID)
                        )
                    }
                    /*
                     * Because succeeding instructions should not draw edges to gotos, 
                     * clear the instruction list. 
                     */
                    lastInstructions.clear;
                } 
            }  
            

//            if (actualBasicBlockRoot == null) {
//                actualBasicBlockRoot = instruction.getStatement
//            } else {
//                if (instruction instanceof Goto || 
//                    (!instruction.getStatement.isInBasicBlock(actualBasicBlockRoot.getBasicBlockByAnyStatement))
//                    )
//                     {
//                    (InstructionMapping.get(actualBasicBlockRoot.instruction).first as KNode).addBasicBlockModifier(actualBasicBlockRoot)
//                    if (instruction instanceof Goto) {
//                        actualBasicBlockRoot = null
//                    } else {
//                        actualBasicBlockRoot = instruction.getStatement
//                    }
//                }
//            }

            /*
             * If it is a visual instruction, check if an edge to a preceding instruction should be 
             * drawn. Meaning, check if there are preceding instructions or if a source node is present.
             */
            if ((instruction instanceof Assignment) ||
                (instruction instanceof Parallel) ||
                (instruction instanceof Pause) ||
                (instruction instanceof Conditional)) {
                if (!lastInstructions.empty) {
                    /* 
                     * Preceding instructions
                     * Schedule one edge for each instruction
                     */
                    for(instr : lastInstructions) {
                      instr.addEdge(sourceNodeOutID, instruction as Instruction, 'incoming')
                    }
                } else if (sourceNode != null) {
                    /* 
                     * Source node is present. 
                     * Schedule one edge to the source node. 
                     */
                    sourceNode.addEdge(sourceNodeOutID, instruction as Instruction, 'incoming')
                }
                /*
                 * Reset the source node. For following instructions the actual instruction will be used
                 * to draw edges to preceding nodes.
                 */ 
                sourceNode = null
                sourceNodeOutID = 'outgoing'
                /*
                 * Clear the actual instruction list, since all edges are scheduled and add the return
                 * list of the actual instruction to the list, so that the next instruction can use them.
                 * Subsequently, clear the return list. 
                 */
                lastInstructions.clear
                lastInstructions.addAll(returnList)
                returnList.clear
            }
            
        }
        
//        if (actualBasicBlockRoot != null) {
//            val bbInstructionNodePair = InstructionMapping.get(actualBasicBlockRoot.instruction)
//            if (bbInstructionNodePair != null) (bbInstructionNodePair.first as KNode).addBasicBlockModifier(actualBasicBlockRoot)                            
//        }


        /*
         * If there is an exit node present and there are still instructions in the instruction list,
         * draw edges to the exit node.
         */
        if ((exitNode != null) && (!lastInstructions.empty)) {
            for (instr : lastInstructions) {
                sourceNode = InstructionMapping.get(instr).second;
                if (sourceNode != null) {
                    sourceNode.addEdge(exitNode)
                }
            }
            lastInstructions.clear
        }
        
        //Return the instruction list. Maybe a higher hierarchy is waiting for it.
       return lastInstructions
	}

    /**
     * Creates the transformation for a scl parallel instruction.
     * 
     * This method evaluates a parallel instruction, creates the fork and join nodes and adds a container
     * for each thread. The threads then are evaluated via createInstructionListFigure again.
     * Each container possesses an entry and an exit node.
     * 
     * To enable goto statements to jump to the exit node, exit nodes are stored in the parallel exit 
     * map. The goto mapping will use them, if a goto statement jumps to the end of a thread, because
     * there will be no node linked to an instruction in the list of that scope.
     */
    def createParallelFigure(Parallel instr, KNode rootNode) {
        /*
         * Create an object for the join node. 
         * Because preceding statements will use the parallel statement as target for edges, we can use
         * the instruction object for the fork node.
         */          
        val Object JoinObj = new Object

        // Create fork node            
        val kForkNode = instr.createTriangleNode(37, 75).putToLookUpWith(instr);
        kForkNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
        kForkNode.KRendering.add(factory.createKLineWidth.of(2));
        val nodeTextFork = "fork";
        kForkNode.KRendering.add(factory.createKText.of(nodeTextFork)
            .setAreaPlacementData.from(LEFT, 0, 0, TOP, 15, 0).to(RIGHT, 0, 0, BOTTOM, 07, 0).putToLookUpWith(instr));
        kForkNode.addPort(unassignedObject, 'incoming', kForkNode.width / 2, 0, 2, PortSide::NORTH)
        rootNode.children.add(kForkNode)
        
        // Create join node
        val kJoinNode = JoinObj.createTriangleReversedNode(37, 75);
        kJoinNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
        kJoinNode.KRendering.add(factory.createKLineWidth.of(2));
        val nodeTextJoin = "join";
        kJoinNode.KRendering.add(factory.createKText.of(nodeTextJoin)
            .setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 15, 0).putToLookUpWith(instr));
        kJoinNode.addPort(unassignedObject, 'outgoing', kJoinNode.width / 2, kJoinNode.height, 2, PortSide::SOUTH)
        rootNode.children.add(kJoinNode)

        /* 
         * Create a compartment for every thread. Every thread possesses an entry and an exit node.
         */
        for(thread : instr.threads) {
            // Create objects for the nodes
            val ContainerObj = new Object
            val EntryObj = new Object
            val ExitObj = new Object
            
            // Create container
            var KNode kContainerNode = null
            if (SCGRAPH_FILTER.optionValue == SCGRAPH_WO_HIERARCHY) {
                kContainerNode = rootNode    
            } else {
                kContainerNode = ContainerObj.createRoundedRectangulareNode().putToLookUpWith(thread)
                kContainerNode.KRendering.add(factory.createKLineWidth.of(2));
                kContainerNode.KRendering.foreground = "black".color;
                kContainerNode.KRendering.foreground.alpha = 0;
                kContainerNode.KRendering.background = "gray".color;
                kContainerNode.KRendering.background.alpha = 100
                
//                kContainerNode.addLayoutParam(ExpansionAwareProperty::of(LayoutOptions::NODE_LABEL_PLACEMENT),
//                    Pair::create(NodeLabelPlacement::outsideBottomCenter, EnumSet::of( NodeLabelPlacement::INSIDE,  NodeLabelPlacement::V_CENTER,  NodeLabelPlacement::H_CENTER)));
//                kContainerNode.addRectangle.addText("[-]")=>[
//                    it.addAction(Trigger::DOUBLECLICK, KlighdConstants::ACTION_COLLAPSE_EXPAND);
//                    it.setPointPlacementData(createKPosition(RIGHT, 14, 0, TOP, 2, 0), H_LEFT, V_TOP, 0,0,0,0)
//                ]                
                
//            kContainerNode.KRendering.background.targetColor = "white".color;
//            kContainerNode.KRendering.background.gradientAngle = -90;
                rootNode.children.add(kContainerNode)
            }

            // Set layout parameter for this hierarchy
//            kContainerNode.addLayoutParam(LayoutOptions::DEBUG_MODE, true)
            kContainerNode.addLayoutParam(LayoutOptions::SPACING, 25.0f)
            kContainerNode.addLayoutParam(LayoutOptions::DIRECTION, Direction::DOWN)
            kContainerNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
            kContainerNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered")
            kContainerNode.addLayoutParam(LayoutOptions::SEPARATE_CC, false);
            if (NODEPLACEMENT_LINEARSEGMENTS) 
                kContainerNode.addLayoutParam(Properties::NODE_PLACER, NodePlacementStrategy::LINEAR_SEGMENTS)
            
            kContainerNode.addNSPortsFixed
            kContainerNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
            
            // Create entry node
            val kEntryNode = EntryObj.createEllipseNode(30,75).putToLookUpWith(EntryObj)
            kEntryNode.KRendering.add(factory.createKLineWidth.of(2))
            kEntryNode.KRendering.foreground = "gray".color
            kEntryNode.KRendering.background = "white".color
            kEntryNode.KRendering.add(factory.createKText.of('entry'))
            kContainerNode.children.add(kEntryNode)
            if (SCGRAPH_FILTER.optionValue != SCGRAPH_WO_HIERARCHY) {
                if (instr.getStatement.hasParameter('layer', 'separate'))
                    kEntryNode.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::FIRST_SEPARATE)
                else
                    kEntryNode.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::FIRST)
            }
            
            // Create exit node
            val kExitNode = ExitObj.createEllipseNode(30,75)
            kExitNode.KRendering.add(factory.createKLineWidth.of(2))
            kExitNode.KRendering.foreground = "gray".color
            kExitNode.KRendering.background = "white".color
            kExitNode.KRendering.add(factory.createKText.of('exit'))
            kContainerNode.children.add(kExitNode)
            if (SCGRAPH_FILTER.optionValue != SCGRAPH_WO_HIERARCHY) {
                if (instr.getStatement.hasParameter('layer', 'separate'))
                    kExitNode.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::LAST_SEPARATE)
                else
                    kExitNode.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::LAST)
            }

            // Create a fixed port at the entry node for outgoing edges.
            kEntryNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            kEntryNode.addNSPortsFixed;

            // Create a fixed port at the exit node for incoming edges.                
            kExitNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            kExitNode.addNSPortsFixed;

            /*
             * Call the transformation for the instruction list of this thread
             * and store the list of this thread in the parallel map for the goto mapping
             */
            thread.statements.createInstructionListFigure(kContainerNode, kEntryNode, kExitNode, '')
            ParallelExitMapping.put(thread, kExitNode);

            /*
             * Draw edges from the fork node to this container
             * and from this container to the join node.
             * 
             * Because the port mapping does not store multiple edges for one outgoing port, create the
             * fork edge directly.
             */
            if (SCGRAPH_FILTER.optionValue == SCGRAPH_WO_HIERARCHY) {
                createEdgeArrow(kForkNode, kEntryNode)
                kExitNode.addEdge(kJoinNode)         
            } else {
                if (!PARALLEL_HIERARCHY_EDGES) {
                    val fPort = unassignedObject.createPort() => [
                        it.setPortSize(2,2)
                        it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::SOUTH);
                        it.addRectangle.invisible = true;
                        kForkNode.ports += it
                    ]
                    fPort.addToPortMapping(kForkNode, 'outgoing' + thread.hashCode.toString)
                    
                    createEdgeArrow(kForkNode, kContainerNode, 'outgoing' + thread.hashCode.toString, 'incoming')
                    //kContainerNode.addEdge(kJoinNode)
                    
                    val jPort = unassignedObject.createPort() => [
                        it.setPortSize(2,2)
                        it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::NORTH);
                        it.addRectangle.invisible = true;
                        kJoinNode.ports += it
                    ]
                    jPort.addToPortMapping(kJoinNode, 'incoming' + thread.hashCode.toString)
                    
                    createEdgeArrow(kContainerNode, kJoinNode, 'outgoing', 'incoming' + thread.hashCode.toString)
                } else {
//                    createEdgeArrow(kExitNode, kJoinNode)         
//                    createEdgeArrow(kForkNode, kEntryNode)

      val sourcePort = kForkNode.getPort('outgoing')
      kContainerNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FREE);
      val targetPort = unassignedObject.createPort() => [
         it.setPortPos(0, 0)
         it.setPortSize(2, 2)
         it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::UNDEFINED);
      ]
      kContainerNode.ports += targetPort
      val Container = kContainerNode

      createEdge() => [
          it.source = kForkNode
          it.sourcePort = null
          it.target = Container
          it.targetPort = targetPort
          it.data += renderingFactory.createKRoundedBendsPolyline() => [
              it.bendRadius = 8;
              it.setLineWidth(2);
              it.addArrowDecorator(); 
          ];          
      ] 
      createEdge() => [
          it.source = Container
          it.sourcePort = targetPort
          it.target = kEntryNode
          it.targetPort = kEntryNode.getPort('incoming')
          it.data += renderingFactory.createKRoundedBendsPolyline() => [
              it.bendRadius = 8;
              it.setLineWidth(2);
              it.addArrowDecorator(); 
          ];          
      ] 
                
                
                
                }
            }   
        }
            
        // Add fork and join node to the instruction mapping
        (instr as Instruction).addToMapping(kForkNode, kJoinNode)
        
        // Create a instruction list with one instruction (the parallel) as return result
        val retList = new ArrayList<Instruction>
        retList.add(instr as Instruction);           
        return retList
    }
 
    /**
     * Creates the transformation for a scl assignment instruction.
     *
     * This method serializes the expression in a scl assignment instruction and creates the 
     * corresponding node.  
     */
    def createAssignmentFigure(Assignment instr, KNode rootNode) {
        // Use the injected serializer to serialize the expression in the assignment statement.
        val nodeText = serializer.serialize(instr).correctSerialization

        /* Create the knode.
         * 
         * addNSPortsFixed adds an incoming and an outgoing port to the node. See addNSPortsFixed for 
         * further information.
         */ 
        val kNode = instr.createRectangulareNode(25, 75).putToLookUpWith(instr);
        kNode.KRendering.add(factory.createKLineWidth.of(2));
        kNode.KRendering.background = "white".color
        kNode.addNSPortsFixed
        kNode.KRendering.add(factory.createKText.of(nodeText).putToLookUpWith(instr));
        rootNode.children.add(kNode)

        // Add this instruction to the instruction map and return a instruction list with this statement.
        (instr as Instruction).addToMapping(kNode, kNode)           
        val retList = new ArrayList<Instruction>
        retList.add(instr as Instruction);           
        return retList
    }

    /**
     * Creates the transformation for a scl pause instruction.
     *
     * This method creates the more complex pause node, consisting of two separate nodes.  
     * The top node represents the surface and the bottom node represents the depth.  
     */
    def createPauseFigure(Pause instr, KNode rootNode) {
        // Create new context objects
        val Object containerObj = new Object
        val Object depthObj = new Object

        // Create container for the two nodes and set layout parameter            
//        val kContainerNode = containerObj.createRectangulareNode(70, 75).putToLookUpWith(instr);
//        kContainerNode.KRendering.invisible = true;
//        kContainerNode.addLayoutParam(LayoutOptions::SPACING, 25.0f);
//        kContainerNode.addLayoutParam(LayoutOptions::BORDER_SPACING, 0.0f);
//        kContainerNode.addLayoutParam(LayoutOptions::DIRECTION, Direction::DOWN);
//        kContainerNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
//        kContainerNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");

        // Create surface node           
        val kNode = instr.createSurfaceNode(25, 75).putToLookUpWith(instr);
        kNode.KRendering.add(factory.createKLineWidth.of(2));
        kNode.KRendering.add(factory.createKText.of("surface").putToLookUpWith(instr));

        // Create depth node
        val kDepthNode = depthObj.createDepthNode(25, 75).putToLookUpWith(instr);
        kDepthNode.KRendering.add(factory.createKLineWidth.of(2));
        kDepthNode.KRendering.add(factory.createKText.of("depth").putToLookUpWith(instr));
        if (PAUSEDEPTH_FIRST)
        if (!instr.getStatement.getProgram.hasGlobalParameter('inline', 'depth') &&
            !instr.getStatement.hasAnnotation(SCLANNOTATION_DEPTH_INLINE))
            kDepthNode.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::FIRST)
            
        // Add all nodes to their parents 
//        rootNode.children.add(kContainerNode)
//        kContainerNode.children.add(kNode)
//        kContainerNode.children.add(kDepthNode)
        rootNode.children.add(kNode)
        rootNode.children.add(kDepthNode)

        // Create default north/south ports
        //kContainerNode.addNSPortsFixed
        kNode.addNSPortsFixed
        kDepthNode.addNSPortsFixed            
      
        // Create a dotted edge between the to nodes 
        createEdge() => [
            it.source = kNode
            it.sourcePort = kNode.getPort('outgoing') 
            it.target = kDepthNode
            it.targetPort = kDepthNode.getPort('incoming')
            it.data += renderingFactory.createKPolyline() => [
                it.setLineWidth(2);
                it.setLineStyle(LineStyle::DOT);
            ];          
        ]

        // Add this instruction to the instruction mapping and return this instruction as list                
//        (instr as Instruction).addToMapping(kContainerNode, kContainerNode)
        (instr as Instruction).addToMapping(kNode, kDepthNode)           
        val retList = new ArrayList<Instruction>
        retList.add(instr as Instruction);           
        return retList
    }

    /**
     * Creates the transformation for a scl conditional instruction.
     *
     * This method serializes the expression of a conditional statement and creates a conditional node.
     * Because a conditional node can have two ports for outgoing edges, a second port is created and 
     * because it is possible for a deeper hierarchy to also jump back to the actual instruction list, 
     * it is necessary to pass that result to the caller of this function.   
     */
    def createConditionalFigure(Conditional instr, KNode rootNode) {
        // Create our result list
        val retList = new ArrayList<Instruction>
        
        // Serialize the expression in the conditional statement
        val Expression exp = instr.expression
        var nodeText = serializer.serialize(exp);   
        
        // Create conditional node
        val kNode = instr.createDiamondNode(50, 75).putToLookUpWith(instr);
        kNode.KRendering.add(factory.createKLineWidth.of(2));
        kNode.KRendering.add(factory.createKText.of(nodeText).putToLookUpWith(instr));
        rootNode.children.add(kNode)
        
        // Add default ports and one extra port expressions evaluated to true
        kNode.addNSPortsFixed;            
        (unassignedObject.createPort() => [
            kNode.ports += it
            if (instr.getStatement.hasParameter(SCLANNOTATION_CONDITIONAL_BRANCH, 'left')) {
                it.setPortPos(0, 24)
                it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::WEST);
            } else { 
                it.setPortPos(75, 24)
                it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::EAST);
            }
            it.setPortSize(2,2)
        ]).addToPortMapping(kNode, 'conditional')
        kNode.addLayoutParam(LayoutOptions::SIZE_CONSTRAINT, SizeConstraint::fixed);
        
        // Evaluate the true condition and add the result to the result list.    
        val lastInstructions = instr.statements.createInstructionListFigure(rootNode, kNode, null, 
            'conditional')
        retList.addAll(lastInstructions);

        // Add this instruction t0 the instruction mapping and return the result list
        (instr as Instruction).addToMapping(kNode, kNode)
        
        if (instr.elseStatements.size>0) {
            val lastElseInstructions = instr.elseStatements.createInstructionListFigure(rootNode, kNode, null,
                'outgoing')
            retList.addAll(lastElseInstructions)
        } else {
            retList.add(instr as Instruction)    
        }
                   
        return retList
    }
    
    
//    def void addBasicBlockModifier(KNode node, Statement basicBlockStatement) {
//        if (SCGRAPH_FILTER.optionValue != SCGRAPH_AND_BASICBLOCKS) { return }
//        if (node == null) { return }
//        node.data += renderingFactory.createKRoundedBendsPolyline() => [
//            it.invisible = true
//            it.invisible.modifierId = "de.cau.cs.kieler.scl.klighd.scg.BasicBlockModifier"
//        ];       
//        val bbDataHolder = new BasicBlockDataHolder(basicBlockStatement.getBasicBlockByAnyStatement)
//        val bbStatements = basicBlockStatement.getBasicBlockStatements
//        for(stmt : bbStatements) {
//            val stmtNode = InstructionMapping.get(stmt.asInstructionStatement.getInstruction).first
//            if (stmtNode != null) bbDataHolder.addNode(stmtNode, stmt)
//        }   
//        node.data += bbDataHolder
//    }    
//    
    // ======================================================================================================
    // ==                       M A P P I N G   H E L P E R   F U N C T I O N S                            ==
    // ======================================================================================================
    
    def void addToMapping(Instruction instruction, KNode entry, KNode exit) {
        if (!InstructionMapping.containsKey(instruction)) {
            val mappingPair = new Pair<KNode, KNode>
            InstructionMapping.put(instruction as Instruction, mappingPair)
        }
        var mappingPair = InstructionMapping.get(instruction)
        mappingPair.setFirst(entry)
        mappingPair.setSecond(exit)
    }
    
    def KPort addToPortMapping(KNode node, String ID, KPort port) {
        if (!PortMapping.containsKey(node)) {
            val mappingHash = new HashMap<String, KPort>
            PortMapping.put(node, mappingHash)
        }
        var mappingHash = PortMapping.get(node);
        mappingHash.put(ID, port)
        port
    }
    
    def KPort addToPortMapping(KPort port, KNode node, String ID) {
        node.addToPortMapping(ID, port);
    }
    
    def KPort getPort(KNode node, String ID) {
        if (PortMapping.containsKey(node)) {
            val mappingHash = PortMapping.get(node)
            return mappingHash.get(ID)
        }
        return null
    }
    
    def String getPortID(KNode node, KPort port) {
        if (!PortMapping.containsKey(node)) { return '' }
        val mapping = PortMapping.get(node)
        for (id : mapping.keySet) {
            if (mapping.get(id) == port) { return id }
        }
        return ''
    }
    
    def void addNSPortsFixed(KNode node) {
        node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
        node.addPort(unassignedObject, 'incoming', node.width / 2 - 1, 0, 2, PortSide::NORTH)
        node.addPort(unassignedObject, 'outgoing', node.width / 2 - 1, node.height - 2, 2, PortSide::SOUTH)
        node.addPort(unassignedObject, 'dependency', node.width / 2 - 1, node.height / 2 -1, 2, PortSide::UNDEFINED)
    }   

    def KPort addPort(KNode node, Object obj, String mapping, float x, float y, int size, PortSide side) {
      (obj.createPort() => [
         it.setPortPos(x, y)
         it.setPortSize(size,size)
         it.addLayoutParam(LayoutOptions::PORT_SIDE, side);
         it.addRectangle.invisible = true;
         node.ports += it
      ]).addToPortMapping(node, mapping)
    } 
    
    
    def void addEdge(Instruction sourceInstruction, Instruction targetInstruction) {
        sourceInstruction.addEdge('outgoing', targetInstruction, 'incoming')
    }
    
    def void addEdge(Instruction sourceInstruction, String sourcePortID, Instruction targetInstruction, String targetPortID) {
        addEdge(InstructionMapping.get(sourceInstruction).second, 
            sourcePortID, 
            InstructionMapping.get(targetInstruction).first,
            targetPortID
        )
    }
    
    def void addEdge(KNode sourceNode, Instruction targetInstruction) {
        sourceNode.addEdge('outgoing', targetInstruction, 'incoming')
    }
    
    def void addEdge(KNode sourceNode, String sourcePortID, Instruction targetInstruction, String targetPortID) {
        sourceNode.addEdge(sourcePortID, InstructionMapping.get(targetInstruction).first, targetPortID)
    }
    
    def void addEdge(KNode sourceNode, KNode targetNode) {
        sourceNode.addEdge('outgoing', targetNode, 'incoming')
    }
    
    def void addEdge(KNode sourceNode, String sourcePortID, KNode targetNode, String targetPortID) {
        sourceNode.addEdge(sourceNode.getPort(sourcePortID), 
            targetNode,
            targetNode.getPort(targetPortID)
        )
    }
    
    def void addEdge(KNode sourceNode, KPort sourcePort, KNode targetNode, KPort targetPort) {
        if ((sourceNode == null) || (targetNode == null)) { return }
        if (!EdgeMapping.containsKey(sourceNode)) {
            val instructionMap = new HashMap<KPort, Pair<KNode, KPort>>
            EdgeMapping.put(sourceNode, instructionMap);
        }
        var edgeMap = EdgeMapping.get(sourceNode)
        edgeMap.put(sourcePort, new Pair<KNode, KPort>(targetNode, targetPort))
    }
    
    
    def String normalizeSource(String sourceID) {
        if (sourceID!='') { sourceID } else { 'outgoing' }
    }

    def String normalizeTarget(String targetID) {
        if (targetID!='') { targetID } else { 'incoming' }
    }
    
    // ======================================================================================================
    // ==                           E D G E   H E L P E R   F U N C T I O N S                              ==
    // ======================================================================================================
    // (Should probably be moved to kRenderingUtils)
    
    def KEdge createEdgeArrow(KNode sourceNode, KNode targetNode) {
        createEdge(sourceNode, targetNode, 'outgoing', 'incoming', true)
    }
    
    def KEdge createEdge(KNode sourceNode, KNode targetNode, boolean addArrow) {
        createEdge(sourceNode, targetNode, 'outgoing', 'incoming', addArrow)
    }

    def KEdge createEdgeArrow(KNode sourceNode, KNode targetNode, String IDout, String IDin) {
        createEdge(sourceNode, targetNode, IDout, IDin, true)
    }
    
    def int hierarchyDepth(KNode node) {
        var depth = 0
        var parent = node.parent
        while(parent!=ProgramRootNode) {
            depth = depth + 1
            parent = parent.parent
        }
        depth
    }
    
    def KPort addAuxPort(KNode node) {
      node.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FREE);
      val port = unassignedObject.createPort() => [
//         it.addRectangle.invisible = true;
         it.setPortPos(80, 0)
         it.setPortSize(2, 2)
         it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::UNDEFINED);
         node.ports += it
      ]
      port
    }

    def KEdge createEdge(KNode sourceNode, KNode targetNode, String IDout, String IDin, boolean addArrow) {
        var KPort sPort = null
        var KPort tPort = null
        if (PortMapping.containsKey(sourceNode)) {
            sPort = getPort(sourceNode, IDout)
        }
        if (PortMapping.containsKey(targetNode)) {
            tPort = getPort(targetNode, IDin)
        }
        
        // Check if one of the nodes is in a hierarchy
        // For hierarchical nodes create a port and a second edge to route through the hierarchy
        if (sourceNode.parent != targetNode.parent) {
            var sNode = sourceNode
            var tNode = targetNode
            var sAPort = sPort
            var tAPort = tPort
            var tArrow = addArrow
            if (sNode.hierarchyDepth > tNode.hierarchyDepth) {
               sAPort = addAuxPort(sNode.parent)
//               createEdge(sourceNode, sNode.parent, sPort, sAPort, false)
               sNode = sNode.parent 
            }
            if (sNode.hierarchyDepth < tNode.hierarchyDepth) {
                tAPort = addAuxPort(tNode.parent)
                createEdge(tNode.parent, targetNode, tAPort, tPort, tArrow)
                tArrow = false
                tNode = tNode.parent
            }
            return createEdge(sNode, tNode, sAPort, tAPort, tArrow)
        }
        
        val edge = createEdge(sourceNode, targetNode, sPort, tPort, addArrow);
        
        edge
    }
        
    def KEdge createEdge(KNode sourceNode, KNode targetNode, KPort portOut, KPort portIn, boolean addArrow) {
        val edge = createEdge() => [
                    it.source = sourceNode
                    it.sourcePort = portOut
                    it.target = targetNode
                    it.targetPort = portIn
                    it.data += renderingFactory.createKRoundedBendsPolyline() => [
                        it.bendRadius = 8;
                        it.setLineWidth(2);
                        if (addArrow == true) { it.addArrowDecorator(); }
                    ];          
                ]  
        if (sourceNode.getPortID(portOut) == 'conditional') {
            edge.createLabel.configureTailLabel('true', 9, KlighdConstants::DEFAULT_FONT_NAME)
        }
                
        edge
    }
 
    def Object unassignedObject() {
        return new Object
    }   
	
}