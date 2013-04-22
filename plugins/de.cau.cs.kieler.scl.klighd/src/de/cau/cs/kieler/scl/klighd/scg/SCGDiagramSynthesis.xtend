package de.cau.cs.kieler.scl.klighd.scg

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableSet
import com.google.inject.Injector
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.util.Pair
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.PortConstraints
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.kiml.util.KimlUtil
import de.cau.cs.kieler.klighd.TransformationOption
import de.cau.cs.kieler.klighd.transformations.AbstractDiagramSynthesis
import de.cau.cs.kieler.scl.SCLHelper
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.InstructionList
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.Program
import java.util.HashMap
import javax.inject.Inject
import org.eclipse.xtext.serializer.ISerializer
import org.yakindu.sct.model.stext.stext.Expression


import static de.cau.cs.kieler.scl.klighd.scg.SCGDiagramSynthesis.*
import de.cau.cs.kieler.scl.SCLStandaloneSetup
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.KlighdConstants
import java.util.ArrayList
import de.cau.cs.kieler.klay.layered.properties.Properties
import de.cau.cs.kieler.klay.layered.properties.LayerConstraint


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
    
	// Inject scl helper
	@Inject
	extension SCLHelper
	
    // Constants for the klighd content filter
    private static val CHOSEN = "Chosen classes";
    private static val CHOSEN_AND_RELATED = "Chosen (highlighted) & related classes";
    private static val ALL = "All classes, selection highlighted";
    
    private static val String CLASS_FILTER_NAME = "Class filter";

    /**
     * The class filter option definition that allows the user to customize the class diagram.
     */
    private static val TransformationOption CLASS_FILTER = TransformationOption::createChoiceOption(CLASS_FILTER_NAME,
       ImmutableList::of(CHOSEN, CHOSEN_AND_RELATED, ALL), CHOSEN_AND_RELATED);

    /*
     * These maps link the scl program instructions to krendering nodes and ports.
     * Since the target of a goto instruction might not be known at the time the goto statement is
     * evaluated, all goto targets are saved and drawn once the whole program has been processed.
     */
    private var HashMap<Instruction, Pair<KNode, KNode>>InstructionMapping;
    private var HashMap<KNode, HashMap<String, KPort>>PortMapping;
    private var HashMap<Goto, Pair<KNode, String>>GotoMapping;
    /* 
     * ParallelExitMap is used by the goto mapping to draw edges to the exit node.
     * Might be replaced by the edgeMapping in a later revision.
     */
    private var HashMap<InstructionList, KNode>ParallelExitMapping;
    
    // To keep the code clean all edges are reserved and drawn once the program evaluation is complete.  
    private var HashMap<KNode, HashMap<KPort, Pair<KNode, KPort>>>EdgeMapping;
    
    /**
     * {@inheritDoc}
     * <br><br>
     * Registers the content filter option.
     */
    override public getTransformationOptions() {
        return ImmutableSet::of(CLASS_FILTER);
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
	    GotoMapping = new HashMap<Goto, Pair<KNode, String>>;
	    ParallelExitMapping = new HashMap<InstructionList, KNode>;
	    EdgeMapping = new HashMap<KNode, HashMap<KPort, Pair<KNode, KPort>>>;
		
		// Initialize root node
        val rootNode = KimlUtil::createInitializedNode;

        // Set layout parameter        
        rootNode.addLayoutParam(LayoutOptions::SPACING, Float::valueOf("25.0"));
        rootNode.addLayoutParam(LayoutOptions::DIRECTION, Direction::DOWN);
        rootNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
        rootNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");

        // Evaluate the program beginning at the program root
        program.program.createProgramFigure(rootNode);        		
        
        rootNode
	}

    /**
     * Creates the transformation for a scl program.
     * 
     * This method creates an entry and an exit node for a program and then executes the transformation
     * for the root instruction list of a scl program. 
     * Subsequently, all reserved goto statements are evaluated and finally all edges are drawn.    
     */
    def createProgramFigure(InstructionList iSet, KNode rootNode) {
        
        // Create objects for the entry and exit nodes
        val EntryObj = new Object
        val ExitObj = new Object
            
        // Create the entry node
        val kEntryNode = EntryObj.createEllipseNode(30,75).putToLookUpWith(EntryObj)
        kEntryNode.KRendering.add(factory.createKLineWidth.of(2));
        kEntryNode.KRendering.foreground = "gray".color;
        kEntryNode.KRendering.add(factory.createKText.of('entry'));
        rootNode.children.add(kEntryNode)
        kEntryNode.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::FIRST_SEPARATE)
                
        // Create the exit node
        val kExitNode = ExitObj.createEllipseNode(30,75)
        kExitNode.KRendering.add(factory.createKLineWidth.of(2));
        kExitNode.KRendering.foreground = "gray".color;
        kExitNode.KRendering.add(factory.createKText.of('exit'));
        rootNode.children.add(kExitNode)
        kExitNode.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::LAST_SEPARATE)
        
        // Add incoming port for the exit node
        (ExitObj.createPort() => [
            kExitNode.ports += it
            it.setPortPos(37, 0)
            it.setPortSize(2,2)
            it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::NORTH);
        ]).addToPortMapping(kExitNode, 'incoming')
            
        // Evaluate the root instruction list
        createInstructionListFigure(iSet, rootNode, kEntryNode, kExitNode, '')
        ParallelExitMapping.put(iSet, kExitNode);
        
        // Process all reserved goto statements
        for(goto : GotoMapping.keySet) {
            // Retrieve source node and port
            val sourceNode = GotoMapping.get(goto).first
            val sourcePortID = GotoMapping.get(goto).second.normalizeSource
            
            /*
             * Retrieve target information and find target instruction.
             * 
             * Since the target label specifies a label which is not a visible node in the klighd
             * graph, one has to iterate through the code to find the next valid instruction 
             * in the specified scope that follows the targeted label. 
             */
            var targetPair = InstructionMapping.get(goto.gotoLookUp(iSet))            
            if (targetPair == null) {
                /*
                 * If no follow up instruction was found, retrieve the label and search for an exit node
                 * in a higher hierarchy. 
                 */
                val targetLabel = goto.gotoGetLabel(iSet)
                if (targetLabel != null) {
                    val labelThreadList = targetLabel.getAncestorThreadList
                    targetPair = new Pair<KNode, KNode>(ParallelExitMapping.get(labelThreadList), null)
                }
            }
            
            // Schedule an edge, if source and target are valid.
            if (targetPair != null) {
                sourceNode.addEdge(sourcePortID, targetPair.first, 'incoming');
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
	def createInstructionListFigure(InstructionList iSet, KNode rootNode, KNode entryNode, KNode exitNode,
	    String alternativeOutgoingID) {
	    
	    // preceding instructions and returned instructions from other scl statements
	    var ArrayList<Instruction> lastInstructions = new ArrayList<Instruction>
        var ArrayList returnList 
	    
	    // prepare source nod information, set to default, if port is empty
        var sourceNode = entryNode
        var sourceNodeOutID = alternativeOutgoingID
        if (sourceNodeOutID.empty) { sourceNodeOutID = 'outgoing' }
	    
	    // iterate through whole instruction list
	    for(instruction : iSet.instructions) {
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
                        GotoMapping.put((instruction as Goto), 
                            new Pair<KNode, String>(InstructionMapping.get(lastInstructions.last as Instruction).second,
                                sourceNodeOutID))
                    } else { 
                        // Map preceding hierarchy node in goto map
                        GotoMapping.put((instruction as Goto), 
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
        val kForkNode = instr.createTriangleNode(50, 100);
        kForkNode.KRendering.add(factory.createKLineWidth.of(2));
        val nodeTextFork = "FORK";
        kForkNode.KRendering.add(factory.createKText.of(nodeTextFork)
            .setAreaPlacementData.from(LEFT, 0, 0, TOP, 20, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0));
        rootNode.children.add(kForkNode)

        // Create join node
        val kJoinNode = JoinObj.createTriangleReversedNode(50, 100);
        kJoinNode.KRendering.add(factory.createKLineWidth.of(2));
        val nodeTextJoin = "JOIN";
        kJoinNode.KRendering.add(factory.createKText.of(nodeTextJoin)
            .setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 20, 0));
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
            val kContainerNode = ContainerObj.createRoundedRectangulareNode()
            kContainerNode.KRendering.add(factory.createKLineWidth.of(2));
            kContainerNode.KRendering.foreground = "black".color;
            kContainerNode.KRendering.foreground.alpha = 0;
            kContainerNode.KRendering.background = "gray".color;
            kContainerNode.KRendering.background.alpha = 50
            rootNode.children.add(kContainerNode)

            // Set layout parameter for this hierarchy
            kContainerNode.addLayoutParam(LayoutOptions::SPACING, 25.0f);
            kContainerNode.addLayoutParam(LayoutOptions::DIRECTION, Direction::DOWN);
            kContainerNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
            kContainerNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
            
            // Create entry node
            val kEntryNode = EntryObj.createEllipseNode(30,75).putToLookUpWith(EntryObj)
            kEntryNode.KRendering.add(factory.createKLineWidth.of(2));
            kEntryNode.KRendering.foreground = "gray".color;
            kEntryNode.KRendering.add(factory.createKText.of('entry'));
            kContainerNode.children.add(kEntryNode)
            kEntryNode.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::FIRST_SEPARATE)
            
            // Create exit node
            val kExitNode = ExitObj.createEllipseNode(30,75)
            kExitNode.KRendering.add(factory.createKLineWidth.of(2));
            kExitNode.KRendering.foreground = "gray".color;
            kExitNode.KRendering.add(factory.createKText.of('exit'));
            kContainerNode.children.add(kExitNode)
            kExitNode.addLayoutParam(Properties::LAYER_CONSTRAINT, LayerConstraint::LAST_SEPARATE)

            // Create a fixed port at the entry node for outgoing edges.
            kEntryNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            (unassignedObject.createPort() => [
                kEntryNode.ports += it
                it.setPortPos(37, 30)
                it.setPortSize(2,2)
                it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::SOUTH);
            ]).addToPortMapping(kEntryNode, 'outgoing')

            // Create a fixed port at the exit node for incoming edges.                
            kExitNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            (ExitObj.createPort() => [
                kExitNode.ports += it
                it.setPortPos(37, 0)
                it.setPortSize(2,2)
                it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::NORTH);
            ]).addToPortMapping(kExitNode, 'incoming')

            /*
             * Call the transformation for the instruction list of this thread
             * and store the list of this thread in the parallel map for the goto mapping
             */
            thread.createInstructionListFigure(kContainerNode, kEntryNode, kExitNode, '')
            ParallelExitMapping.put(thread, kExitNode);

            /*
             * Draw edges from the fork node to this container
             * and from this container to the join node.
             * 
             * Because the port mapping does not store multiple edges for one outgoing port, create the
             * fork edge directly.
             */
            createEdgeArrow(kForkNode, kContainerNode)
            kContainerNode.addEdge(kJoinNode)            
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
        val nodeText = serializer.serialize(instr);

        /* Create the knode.
         * 
         * addNSPortsFixed adds an incoming and an outgoing port to the node. See addNSPortsFixed for 
         * further information.
         */ 
        val kNode = instr.createRoundedRectangulareNode(25, 85);
        kNode.KRendering.add(factory.createKLineWidth.of(2));
        kNode.addNSPortsFixed
        kNode.KRendering.add(factory.createKText.of(nodeText));
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
        val kContainerNode = containerObj.createRectangulareNode(70, 75);
        kContainerNode.KRendering.invisible = true;
        kContainerNode.addLayoutParam(LayoutOptions::SPACING, 20.0f);
        kContainerNode.addLayoutParam(LayoutOptions::BORDER_SPACING, 0.0f);
        kContainerNode.addLayoutParam(LayoutOptions::DIRECTION, Direction::DOWN);
        kContainerNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
        kContainerNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");

        // Create surface node           
        val kNode = instr.createSurfaceNode(30, 75);
        kNode.KRendering.add(factory.createKLineWidth.of(2));
        kNode.KRendering.add(factory.createKText.of("surface"));

        // Create depth node
        val kDepthNode = depthObj.createDepthNode(30, 75);
        kDepthNode.KRendering.add(factory.createKLineWidth.of(2));
        kDepthNode.KRendering.add(factory.createKText.of("depth"));
            
        // Add all nodes to their parents 
        rootNode.children.add(kContainerNode)
        kContainerNode.children.add(kNode)
        kContainerNode.children.add(kDepthNode)

        // Create default north/south ports
        kContainerNode.addNSPortsFixed            
      
        // Create a dotted edge between the to nodes 
        createEdge() => [
            it.source = kNode
            it.target = kDepthNode
            it.data += renderingFactory.createKPolyline() => [
                it.setLineWidth(2);
                it.setLineStyle(LineStyle::DOT);
            ];          
        ]

        // Add this instruction to the instruction mapping and return this instruction as list                
        (instr as Instruction).addToMapping(kContainerNode, kContainerNode)           
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
        val nodeText = serializer.serialize(exp);            
        
        // Create conditional node
        val kNode = instr.createDiamondNode(75, 75);
        kNode.KRendering.add(factory.createKLineWidth.of(2));
        kNode.KRendering.add(factory.createKText.of(nodeText));
        rootNode.children.add(kNode)
        
        // Add default ports and one extra port expressions evaluated to true
        kNode.addNSPortsFixed;            
        (unassignedObject.createPort() => [
            kNode.ports += it
            it.setPortPos(75, 36)
            it.setPortSize(2,2)
            it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::EAST);
        ]).addToPortMapping(kNode, 'conditional')
        
        // Evaluate the true condition and add the result to the result list.    
        val lastInstructions = instr.conditional.createInstructionListFigure(rootNode, kNode, null, 
            'conditional')
        retList.addAll(lastInstructions)

        // Add this instruction ti the instruction mapping and return the result list
        (instr as Instruction).addToMapping(kNode, kNode)
        retList.add(instr as Instruction)           
        return retList
    }
    
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
        node.addPort(unassignedObject, 'outgoing', node.width / 2 - 1, node.height, 2, PortSide::SOUTH)
    }   

    def KPort addPort(KNode node, Object obj, String mapping, float x, float y, int size, PortSide side) {
      (obj.createPort() => [
         it.setPortPos(x, y)
         it.setPortSize(size,size)
         it.addLayoutParam(LayoutOptions::PORT_SIDE, side);
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

    def KEdge createEdge(KNode sourceNode, KNode targetNode, String IDout, String IDin, boolean addArrow) {
        var KPort sPort = null
        var KPort tPort = null
        if (PortMapping.containsKey(sourceNode)) {
            sPort = getPort(sourceNode, IDout)
        }
        if (PortMapping.containsKey(targetNode)) {
            tPort = getPort(targetNode, IDin)
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
                        it.bendRadius = 5;
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