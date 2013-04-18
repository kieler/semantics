package de.cau.cs.kieler.yakindu.sccharts.sim.scl.klighd.scg

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableSet
import com.google.inject.Guice
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
import de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend.SCLHelper
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Assignment
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionList
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Pause
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scoping.SCLScopeProvider
import java.util.HashMap
import javax.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.serializer.ISerializer
import org.yakindu.sct.model.stext.stext.Expression


import static de.cau.cs.kieler.yakindu.sccharts.sim.scl.klighd.scg.SCGDiagramSynthesis.*
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.SCLStandaloneSetup
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.kiml.klayoutdata.KEdgeLayout
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.KlighdConstants

class SCGDiagramSynthesis extends AbstractDiagramSynthesis<Program> {
    
    private static val Injector i = SCLStandaloneSetup::doSetup();
    private static val SCLScopeProvider scopeProvider = i.getInstance(typeof(SCLScopeProvider));
    private static val ISerializer serializer = i.getInstance(typeof(ISerializer));
    private static val Resource TMP_RES = i.getInstance(typeof(ResourceSet))
            .createResource(URI::createFileURI("dummy.action.scg"));    

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
	
	@Inject
	extension SCLHelper
	
    private static val KRenderingFactory renderingFactory = KRenderingFactory::eINSTANCE

    private static val CHOSEN = "Chosen classes";
    private static val CHOSEN_AND_RELATED = "Chosen (highlighted) & related classes";
    private static val ALL = "All classes, selection highlighted";
    
    private static val String CLASS_FILTER_NAME = "Class filter";

    /**
     * The class filter option definition that allows the user to customize the class diagram.
     */
    private static val TransformationOption CLASS_FILTER = TransformationOption::createChoiceOption(CLASS_FILTER_NAME,
       ImmutableList::of(CHOSEN, CHOSEN_AND_RELATED, ALL), CHOSEN_AND_RELATED);

    private var HashMap<Instruction, Pair<KNode, KNode>>InstructionMapping;
    private var HashMap<KNode, HashMap<String, KPort>>PortMapping;
    private var HashMap<Goto, Pair<KNode, String>>GotoMapping;
    private var HashMap<InstructionList, KNode>ParallelExitMapping;
    
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
     */
	override KNode transform(Program program) {
	    
	    InstructionMapping = new HashMap<Instruction, Pair<KNode, KNode>>;
	    PortMapping = new HashMap<KNode, HashMap<String, KPort>>;
	    GotoMapping = new HashMap<Goto, Pair<KNode, String>>;
	    ParallelExitMapping = new HashMap<InstructionList, KNode>;
		
        val rootNode = KimlUtil::createInitializedNode;
//        rootNode.addLayoutParam(LayoutOptions::SPACING, Float::valueOf("25.0"));
//        rootNode.addLayoutParam(LayoutOptions::DIRECTION, Direction::DOWN);
//        rootNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
//        rootNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot");
        
        rootNode.addLayoutParam(LayoutOptions::SPACING, Float::valueOf("25.0"));
        rootNode.addLayoutParam(LayoutOptions::DIRECTION, Direction::DOWN);
        rootNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
//        rootNode.addLayoutParam(LayoutOptions::LAYOUT_HIERARCHY, true);
        rootNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");

        program.program.createInstructionListFigure(rootNode);        		
        
        rootNode
	}
	
	def void addToMapping(Instruction instruction, KNode entry, KNode exit) {
	    if (!InstructionMapping.containsKey(instruction)) {
            val mappingPair = new Pair<KNode, KNode>
            InstructionMapping.put(instruction as Instruction, mappingPair)
        }
	    var mappingPair = InstructionMapping.get(instruction)
	    mappingPair.setFirst(entry)
	    mappingPair.setSecond(exit)
	}
	
	def void addToPortMapping(KNode node, String ID, KPort port) {
	    if (!PortMapping.containsKey(node)) {
	        val mappingHash = new HashMap<String, KPort>
	        PortMapping.put(node, mappingHash)
	    }
	    var mappingHash = PortMapping.get(node);
	    mappingHash.put(ID, port)
	}
	
	def KPort getPort(KNode node, String ID) {
        if (PortMapping.containsKey(node)) {
            val mappingHash = PortMapping.get(node)
            return mappingHash.get(ID)
        }
	    return null
	}

    def createInstructionListFigure(InstructionList iSet, KNode rootNode) {

                val Object EntryObj = new Object
                val Object ExitObj = new Object
            
                val kEntryNode = EntryObj.createEllipseNode(30,75).putToLookUpWith(EntryObj)
                kEntryNode.KRendering.add(factory.createKLineWidth.of(2));
                kEntryNode.KRendering.foreground = "gray".color;
                kEntryNode.KRendering.add(factory.createKText.of('entry'));
                rootNode.children.add(kEntryNode)
                
                val kExitNode = ExitObj.createEllipseNode(30,75)
                kExitNode.KRendering.add(factory.createKLineWidth.of(2));
                kExitNode.KRendering.foreground = "gray".color;
                kExitNode.KRendering.add(factory.createKText.of('exit'));
                rootNode.children.add(kExitNode)





        createInstructionListFigure(iSet, rootNode, kEntryNode, kExitNode, '')
        
        for(goto : GotoMapping.keySet) {
            val sourceNode = GotoMapping.get(goto).first
            val sourcePortID = GotoMapping.get(goto).second
            var targetPair = InstructionMapping.get(goto.gotoLookUp(iSet))
            
            if (targetPair == null) {
                val targetLabel = goto.gotoGetLabel(iSet)
                if (targetLabel != null) {
                    val labelThreadList = targetLabel.getAncestorThreadList
                    targetPair = new Pair<KNode, KNode>(ParallelExitMapping.get(labelThreadList), null)
                }
            }
            
            if ((targetPair != null) && (sourceNode != null) && (targetPair.first != null)
            ) {
                val targetNode = targetPair.first
                if (sourcePortID.empty) {
                    createEdgeArrow(sourceNode, targetNode)
                } else {
                    createEdgeArrow(sourceNode, targetNode, sourcePortID, 'incoming')
                }
            }
        }
        
    }

	
	def createInstructionListFigure(InstructionList iSet, KNode rootNode, KNode entryNode, KNode exitNode,
	    String alternativeOutgoingID
	) {
	    
	    var Instruction lastInstruction = null
        var sourcePair = new Pair<KNode, KNode>(null, entryNode)
        var alternativeOutID = alternativeOutgoingID
	    
	    for(instruction : iSet.instructions) {
	        var noGoto = true
            switch(instruction) {
                Assignment: (instruction as Assignment).createAssignmentFigure(rootNode)
                Parallel: (instruction as Parallel).createParallelFigure(rootNode)
                Pause: (instruction as Pause).createPauseFigure(rootNode)
                Conditional: {
                    val li = (instruction as Conditional).createConditionalFigure(rootNode)
                    if (li instanceof Goto) {
//                        lastInstruction = null
//                        noGoto = false
                    }
                    }
                Goto: {
                    if (lastInstruction != null) {
                        GotoMapping.put((instruction as Goto), 
                            new Pair<KNode, String>(InstructionMapping.get(lastInstruction as Instruction).second,
                                alternativeOutID))
                    } else { 
                        GotoMapping.put((instruction as Goto), 
                            new Pair<KNode, String>(sourcePair.second, alternativeOutID)
                        )
                    }
                    lastInstruction = null
                } 
            }  
            
            if ((instruction instanceof Assignment) ||
                (instruction instanceof Parallel) ||
                (instruction instanceof Pause) ||
                ((instruction instanceof Conditional) && (noGoto))
            ) {
                
                if ((lastInstruction!=null) && (!(lastInstruction instanceof Goto))) {
                    sourcePair = InstructionMapping.get(lastInstruction as Instruction);
                }
                if ((sourcePair != null) && (sourcePair.second != null)) {
                    val targetPair = InstructionMapping.get(instruction as Instruction);
                    val sourceNode = sourcePair.second
                    if (alternativeOutID.empty) {
                        createEdgeArrow(sourceNode, targetPair.first)
                    } else {
                        createEdgeArrow(sourceNode, targetPair.first, alternativeOutID, 'incoming')
                        alternativeOutID = ''
                    }
                    sourcePair = null
                }
            
                if (noGoto) { lastInstruction = instruction as Instruction }
                else { lastInstruction = null }
            }
            if (!noGoto) { lastInstruction = null }
        }
        
        if ((exitNode != null) && (lastInstruction != null)) {
            sourcePair = InstructionMapping.get(lastInstruction as Instruction);
            val targetPair = new Pair<KNode, KNode>(exitNode, null)
            if (sourcePair.second != null) {
                val sourceNode = sourcePair.second
                createEdgeArrow(sourceNode, targetPair.first)
            }
        }
        
        return lastInstruction
	}

    def createParallelFigure(Parallel instr, KNode rootNode) {
            val Object ContainerObj = new Object
            val Object JoinObj = new Object
            
            
            
            val kContainerNode = rootNode
//            val kContainerNode = ContainerObj.createRectangulareNode(150,100)
//            kContainerNode.KRendering.add(factory.createKLineWidth.of(2));
//            kContainerNode.KRendering.foreground = "lightBlue".color;
//            rootNode.children.add(kContainerNode)

//        kContainerNode.addLayoutParam(LayoutOptions::SPACING, Float::valueOf("25.0"));
//        kContainerNode.addLayoutParam(LayoutOptions::DIRECTION, Direction::DOWN);
//        kContainerNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
//        kContainerNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot");            
            
            val kForkNode = instr.createTriangleNode(50, 100);
            kForkNode.KRendering.add(factory.createKLineWidth.of(2));
            val nodeTextFork = "FORK";
           
            kForkNode.KRendering.add(factory.createKText.of(nodeTextFork));
            kContainerNode.children.add(kForkNode)

            val kJoinNode = JoinObj.createTriangleReversedNode(50, 100);
            kJoinNode.KRendering.add(factory.createKLineWidth.of(2));
            val nodeTextJoin = "JOIN";
            kJoinNode.KRendering.add(factory.createKText.of(nodeTextJoin));
            kContainerNode.children.add(kJoinNode)


            for(threads : instr.threads) {
                val Object BackgroundObj = new Object
                val Object EntryObj = new Object
                val Object ExitObj = new Object
            
                val kBackgroundNode = BackgroundObj.createRectangulareNode(150,100)
                kBackgroundNode.KRendering.add(factory.createKLineWidth.of(2));
                kBackgroundNode.KRendering.foreground = "gray".color;
                kContainerNode.children.add(kBackgroundNode)

           kBackgroundNode.addLayoutParam(LayoutOptions::SPACING, Float::valueOf("25.0"));
           kBackgroundNode.addLayoutParam(LayoutOptions::DIRECTION, Direction::DOWN);
           kBackgroundNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
           kBackgroundNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
//           kBackgroundNode.addLayoutParam(LayoutOptions::LAYOUT_HIERARCHY, true);


                val kEntryNode = EntryObj.createEllipseNode(30,75).putToLookUpWith(EntryObj)
                kEntryNode.KRendering.add(factory.createKLineWidth.of(2));
                kEntryNode.KRendering.foreground = "gray".color;
                kEntryNode.KRendering.add(factory.createKText.of('entry'));
                kBackgroundNode.children.add(kEntryNode)
                
                
                
                
                val kExitNode = ExitObj.createEllipseNode(30,75)
                kExitNode.KRendering.add(factory.createKLineWidth.of(2));
                kExitNode.KRendering.foreground = "gray".color;
                kExitNode.KRendering.add(factory.createKText.of('exit'));
                kBackgroundNode.children.add(kExitNode)
                
            kExitNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            val kPortIncoming = ExitObj.createPort() => [
                it.setPortPos(36, 0)
                it.setPortSize(2,2)
                it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::NORTH);
            ]
            kExitNode.ports += kPortIncoming;
            kExitNode.addToPortMapping('incoming', kPortIncoming)


                threads.createInstructionListFigure(kBackgroundNode, kEntryNode, kExitNode, '')

                ParallelExitMapping.put(threads, kExitNode);
            
                createEdgeArrow(kForkNode, kBackgroundNode)
                createEdgeArrow(kBackgroundNode, kJoinNode)
//                createEdgeArrow(kForkNode, kEntryNode)
//                createEdgeArrow(kExitNode, kJoinNode) => [
//                    val layout = it.getData(typeof(KEdgeLayout));
//                    layout.sourcePoint.x = 10;
//                    layout.sourcePoint.y = 10;
//                    layout.targetPoint.x = 100;
//                    layout.targetPoint.y = 100;
//                ]
//            
            }
            
            (instr as Instruction).addToMapping(kForkNode, kJoinNode)           
            return (instr as Instruction)
    }
    

    
    def createAssignmentFigure(Assignment instr, KNode rootNode) {
            val kNode = instr.createRoundedRectangulareNode(25, 85);
            kNode.KRendering.add(factory.createKLineWidth.of(2));
            
            kNode.KRendering.foreground = "gray".color;
          
            val nodeText = serializer.serialize(instr);            
            
            kNode.KRendering.add(factory.createKText.of(nodeText));
            rootNode.children.add(kNode)

            (instr as Instruction).addToMapping(kNode, kNode)           
            return (instr as Instruction)
    }

    def createPauseFigure(Pause instr, KNode rootNode) {
            val Object containerObj = new Object
            val Object depthObj = new Object
            
                
            val kContainerNode = containerObj.createRectangulareNode(70, 75);
//            kContainerNode.KRendering.add(factory.createKLineWidth.of(0));-
            kContainerNode.KRendering.invisible = true;
            
            
            kContainerNode.addLayoutParam(LayoutOptions::SPACING, Float::valueOf("20.0"));
            kContainerNode.addLayoutParam(LayoutOptions::BORDER_SPACING, Float::valueOf("0.0"));
//            kContainerNode.addLayoutParam(LayoutOptions::EXPAND_NODES, true);
            kContainerNode.addLayoutParam(LayoutOptions::DIRECTION, Direction::DOWN);
            kContainerNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
            kContainerNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
            kContainerNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
           
            val kNode = instr.createSurfaceNode(30, 75);
            kNode.KRendering.add(factory.createKLineWidth.of(2));
            kNode.KRendering.add(factory.createKText.of("surface"));

            val kDepthNode = depthObj.createDepthNode(30, 75);
            kDepthNode.KRendering.add(factory.createKLineWidth.of(2));
            kDepthNode.KRendering.add(factory.createKText.of("depth"));
            
            rootNode.children.add(kContainerNode)
            kContainerNode.children.add(kNode)
            kContainerNode.children.add(kDepthNode)
            
      
            val kPortIncoming = instr.createPort() => [
                it.setPortPos(36, -2)
                it.setPortSize(2,2)
                it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::NORTH);
            ]
            val kPortOutgoing = containerObj.createPort() => [
                it.setPortPos(36, 68)
                it.setPortSize(2,2)
                it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::SOUTH);
            ]
            kContainerNode.ports += kPortIncoming
            kContainerNode.ports += kPortOutgoing;
            kContainerNode.addToPortMapping('incoming', kPortIncoming)
            kContainerNode.addToPortMapping('outgoing', kPortOutgoing)


                createEdge() => [
                    it.source = kNode
                    it.target = kDepthNode
                    it.data += renderingFactory.createKPolyline() => [
                        it.setLineWidth(2);
                        it.setLineStyle(LineStyle::DOT);
                    ];          
                ]

                
            (instr as Instruction).addToMapping(kContainerNode, kContainerNode)           
            return (instr as Instruction)
    }

    def createConditionalFigure(Conditional instr, KNode rootNode) {
            val Object falseTree = new Object
            val Object trueTree  = new Object
            
            val kNode = instr.createDiamondNode(75, 75);
            kNode.KRendering.add(factory.createKLineWidth.of(2));
            kNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_POS);
            
            val Expression exp = instr.expression
            val nodeText = serializer.serialize(exp);            
            kNode.KRendering.add(factory.createKText.of(nodeText));
            rootNode.children.add(kNode)
            
            val kPortIncoming = instr.createPort() => [
                it.setPortPos(36, -2)
                it.setPortSize(2,2)
                it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::NORTH);
            ]
            val kPortOutgoing = falseTree.createPort() => [
                it.setPortPos(36, 75)
                it.setPortSize(2,2)
                it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::SOUTH);
            ]
            val kPortTrueTree = trueTree.createPort() => [
                it.setPortPos(75, 36)
                it.setPortSize(2,2)
                it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::EAST);
            ]
            kNode.ports += kPortIncoming
            kNode.ports += kPortOutgoing
            kNode.ports += kPortTrueTree;
            kNode.addToPortMapping('incoming', kPortIncoming)
            kNode.addToPortMapping('outgoing', kPortOutgoing)
            kNode.addToPortMapping('conditional', kPortTrueTree)
            
            
            val lastInstruction = instr.conditional.createInstructionListFigure(rootNode, kNode, null, 
                'conditional'
            )

            (instr as Instruction).addToMapping(kNode, kNode)           
            return lastInstruction
    }
    
    def KEdge createEdgeArrow(KNode sourceNode, KNode targetNode) {
        createEdgeArrow(sourceNode, targetNode, 'outgoing', 'incoming')
    }

    def KEdge createEdgeArrow(KNode sourceNode, KNode targetNode, String IDout, String IDin) {
        var KPort sPort = null
        var KPort tPort = null
        if (PortMapping.containsKey(sourceNode)) {
            sPort = getPort(sourceNode, IDout)
        }
        if (PortMapping.containsKey(targetNode)) {
            tPort = getPort(targetNode, IDin)
        }
        
        val sourcePort = sPort
        val targetPort = tPort
        val edge = createEdge() => [
                    it.source = sourceNode
                    it.sourcePort = sourcePort
                    it.target = targetNode
                    it.targetPort = targetPort
//                    it.createLabel.configureTailLabel('test', 8, KlighdConstants::DEFAULT_FONT_NAME)
                    it.data += renderingFactory.createKPolyline() => [
                        it.setLineWidth(2);
                        it.addArrowDecorator();
                    ];          
                ]  
        if (IDout == 'conditional') {
            edge.createLabel.configureTailLabel('_true', 9, KlighdConstants::DEFAULT_FONT_NAME)
        }        
        edge
    }
    
	
}