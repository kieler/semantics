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
	
	     extension de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend.SCLHelper SCLHelper = 
         Guice::createInjector().getInstance(typeof(SCLHelper))
	
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
    private var HashMap<Goto, KNode>GotoMapping;
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
	    GotoMapping = new HashMap<Goto, KNode>;
	    ParallelExitMapping = new HashMap<InstructionList, KNode>;
		
        val rootNode = KimlUtil::createInitializedNode;
        rootNode.addLayoutParam(LayoutOptions::SPACING, Float::valueOf("25.0"));
        rootNode.addLayoutParam(LayoutOptions::DIRECTION, Direction::DOWN);
        rootNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
        rootNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot");
        
        rootNode.addLayoutParam(LayoutOptions::SPACING, Float::valueOf("25.0"));
        rootNode.addLayoutParam(LayoutOptions::DIRECTION, Direction::DOWN);
        rootNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
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





        createInstructionListFigure(iSet, rootNode, kEntryNode, kExitNode)
        
        for(goto : GotoMapping.keySet) {
            val sourceNode = GotoMapping.get(goto)
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
                createEdge() => [
                    it.source = sourceNode
                    it.target = targetNode
                    it.data += renderingFactory.createKPolyline() => [
                        it.setLineWidth(2);
                        it.addArrowDecorator();
                    ];          
                ]
            }
        }
        
    }

	
	def createInstructionListFigure(InstructionList iSet, KNode rootNode, KNode entryNode, KNode exitNode) {
	    
	    var Instruction lastInstruction = null
        var sourcePair = new Pair<KNode, KNode>(null, entryNode)
	    
	    for(instruction : iSet.instructions) {
            switch(instruction) {
                Assignment: (instruction as Assignment).createAssignmentFigure(rootNode)
                Parallel: (instruction as Parallel).createParallelFigure(rootNode)
                Pause: (instruction as Pause).createPauseFigure(rootNode)
                Conditional: (instruction as Conditional).createConditionalFigure(rootNode)
                Goto: {
                    if (lastInstruction != null) {
                        GotoMapping.put((instruction as Goto), 
                            InstructionMapping.get(lastInstruction as Instruction).second)
                    } else { 
                        GotoMapping.put((instruction as Goto), sourcePair.second)
                    }
                    lastInstruction = null
                } 
            }  
            
            if ((instruction instanceof Assignment) ||
                (instruction instanceof Parallel) ||
                (instruction instanceof Pause) ||
                (instruction instanceof Conditional)
            ) {
                
                if (lastInstruction!=null) {
                    sourcePair = InstructionMapping.get(lastInstruction as Instruction);
                }
                if (sourcePair.second != null) {
                    val targetPair = InstructionMapping.get(instruction as Instruction);
                    val sourceNode = sourcePair.second
                    createEdge() => [
                        it.source = sourceNode
                        it.target = targetPair.first
                        it.data += renderingFactory.createKPolyline() => [
                            it.setLineWidth(2);
                            it.addArrowDecorator();
                        ];          
                    ]
                }
            
                lastInstruction = instruction as Instruction
            }
        }
        
        if (exitNode != null) {
            sourcePair = InstructionMapping.get(lastInstruction as Instruction);
            val targetPair = new Pair<KNode, KNode>(exitNode, null)
            if (sourcePair.second != null) {
                val sourceNode = sourcePair.second
                createEdge() => [
                    it.source = sourceNode
                    it.target = targetPair.first
                    it.data += renderingFactory.createKPolyline() => [
                        it.setLineWidth(2);
                        it.addArrowDecorator();
                    ];          
                ]
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


                threads.createInstructionListFigure(kBackgroundNode, kEntryNode, kExitNode)

                ParallelExitMapping.put(threads, kExitNode);
            
                createEdge() => [
                    it.source = kForkNode
                    it.target = kBackgroundNode
                    it.data += renderingFactory.createKPolyline() => [
                        it.setLineWidth(2);
                        it.addArrowDecorator();
                    ];          
                ]
                createEdge() => [
                    it.source = kBackgroundNode
                    it.target = kJoinNode
                    it.data += renderingFactory.createKPolyline() => [
                        it.setLineWidth(2);
                        it.addArrowDecorator();
                    ];          
                ]
            
            }
            
            (instr as Instruction).addToMapping(kForkNode, kJoinNode)           
            return kForkNode
    }
    

    
    def createAssignmentFigure(Assignment instr, KNode rootNode) {
            val kNode = instr.createRoundedRectangulareNode(25, 85);
            kNode.KRendering.add(factory.createKLineWidth.of(2));
            
            kNode.KRendering.foreground = "gray".color;
          
            val nodeText = serializer.serialize(instr);            
            
            kNode.KRendering.add(factory.createKText.of(nodeText));
            rootNode.children.add(kNode)

            (instr as Instruction).addToMapping(kNode, kNode)           
            return kNode
    }

    def createPauseFigure(Pause instr, KNode rootNode) {
            val Object containerObj = new Object
            val Object depthObj = new Object
                
            val kContainerNode = containerObj.createRectangulareNode(70, 75);
//            kContainerNode.KRendering.add(factory.createKLineWidth.of(0));
            kContainerNode.KRendering.invisible = true;
            
            
            kContainerNode.addLayoutParam(LayoutOptions::SPACING, Float::valueOf("20.0"));
            kContainerNode.addLayoutParam(LayoutOptions::BORDER_SPACING, Float::valueOf("0.0"));
//            kContainerNode.addLayoutParam(LayoutOptions::EXPAND_NODES, true);
            kContainerNode.addLayoutParam(LayoutOptions::DIRECTION, Direction::DOWN);
            kContainerNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
            kContainerNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
           
            val kNode = instr.createSurfaceNode(30, 75);
            kNode.KRendering.add(factory.createKLineWidth.of(2));
            kNode.KRendering.add(factory.createKText.of("surface"));

            val kDepthNode = depthObj.createDepthNode(30, 75);
            kDepthNode.KRendering.add(factory.createKLineWidth.of(2));
            kDepthNode.KRendering.add(factory.createKText.of("depth"));
            
            rootNode.children.add(kContainerNode)
            kContainerNode.children.add(kNode)
            kContainerNode.children.add(kDepthNode)
            
                createEdge() => [
                    it.source = kNode
                    it.target = kDepthNode
                    it.data += renderingFactory.createKPolyline() => [
                        it.setLineWidth(2);
                        it.setLineStyle(LineStyle::DOT);
                    ];          
                ]
                
            (instr as Instruction).addToMapping(kContainerNode, kContainerNode)           
            return kNode
    }

    def createConditionalFigure(Conditional instr, KNode rootNode) {
            val kNode = instr.createDiamondNode(75, 75);
            kNode.KRendering.add(factory.createKLineWidth.of(2));
            
            val Expression exp = instr.expression
            val nodeText = serializer.serialize(exp);            
            kNode.KRendering.add(factory.createKText.of(nodeText));
            rootNode.children.add(kNode)
            
            instr.conditional.createInstructionListFigure(rootNode, kNode, null)

            (instr as Instruction).addToMapping(kNode, kNode)           
            return kNode
    }
	
}