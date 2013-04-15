package de.cau.cs.kieler.yakindu.sccharts.sim.scl.klighd.scg

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableSet
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.util.KimlUtil
import de.cau.cs.kieler.klighd.TransformationContext
import de.cau.cs.kieler.klighd.TransformationOption
import de.cau.cs.kieler.klighd.transformations.AbstractTransformation
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Assignment
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionList
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program
import javax.inject.Inject

import static de.cau.cs.kieler.yakindu.sccharts.sim.scl.klighd.scg.SCGDiagramSynthesis.*
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Pause
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional
import de.cau.cs.kieler.klighd.transformations.AbstractDiagramSynthesis

class SCGDiagramSynthesis extends AbstractDiagramSynthesis<Program> {

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
		
        val rootNode = KimlUtil::createInitializedNode;
        rootNode.addLayoutParam(LayoutOptions::SPACING, Float::valueOf("25.0"));
        rootNode.KShapeLayout.setProperty(LayoutOptions::DIRECTION, Direction::DOWN);
        rootNode.KShapeLayout.setProperty(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
        rootNode.KShapeLayout.setProperty(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot");


        program.program.createInstructionListFigure(rootNode);        		
        
        rootNode
	}
	
	def createInstructionListFigure(InstructionList iSet, KNode rootNode) {
	    for(instruction : iSet.instructions) {
            switch(instruction) {
                Assignment: (instruction as Assignment).createAssignmentFigure(rootNode)
                Parallel: (instruction as Parallel).createParallelFigure(rootNode)
                Pause: (instruction as Pause).createPauseFigure(rootNode)
                Conditional: (instruction as Conditional).createConditionalFigure(rootNode)
            }  
        }
	}

    def createParallelFigure(Parallel instr, KNode rootNode) {
            val Object ContainerObj = new Object
            val Object JoinObj = new Object
            
            val kContainerNode = ContainerObj.createRectangulareNode(150,100)
            kContainerNode.KRendering.add(factory.createKLineWidth.of(2));
            kContainerNode.KRendering.foreground = "gray".color;
            rootNode.children.add(kContainerNode)
            
            val kForkNode = instr.createRoundedRectangulareNode(25, 85);
            kForkNode.KRendering.add(factory.createKLineWidth.of(2));
            kForkNode.KRendering.foreground = "gray".color;
            val nodeTextFork = "FORK";
           
            kForkNode.KRendering.add(factory.createKText.of(nodeTextFork));
            kContainerNode.children.add(kForkNode)

            val kJoinNode = JoinObj.createRoundedRectangulareNode(25, 85);
            kJoinNode.KRendering.add(factory.createKLineWidth.of(2));
            kJoinNode.KRendering.foreground = "gray".color;
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


                val kEntryNode = EntryObj.createEllipseNode(25,50).putToLookUpWith(EntryObj)
                kEntryNode.KRendering.add(factory.createKLineWidth.of(2));
                kEntryNode.KRendering.foreground = "gray".color;
                kBackgroundNode.children.add(kEntryNode)
                
                
                threads.createInstructionListFigure(kBackgroundNode)
                
                
                val kExitNode = ExitObj.createEllipseNode(25,50)
                kExitNode.KRendering.add(factory.createKLineWidth.of(2));
                kExitNode.KRendering.foreground = "gray".color;
                kBackgroundNode.children.add(kExitNode)
            
                createEdge() => [
                    it.source = kForkNode
                    it.target = kBackgroundNode
                    it.data += renderingFactory.createKPolyline() => [
                        it.setLineWidth(2);
                    ];          
                ]
                createEdge() => [
                    it.source = kBackgroundNode
                    it.target = kJoinNode
                    it.data += renderingFactory.createKPolyline() => [
                        it.setLineWidth(2);
                    ];          
                ]
            
            }
           
            return kForkNode
    }
    
    def createAssignmentFigure(Assignment instr, KNode rootNode) {
            val kNode = instr.createRoundedRectangulareNode(25, 85);
            kNode.KRendering.add(factory.createKLineWidth.of(2));
            
//            kNode.KRendering.foreground = if (node.id.endsWith("_S")) "black".color else "gray".color;
            kNode.KRendering.foreground = "gray".color;
            
//            val nodeText = node.id.substring(0,node.id.length - 2);
            val nodeText = "ASSIGNMENT";
            
            kNode.KRendering.add(factory.createKText.of(nodeText));
            rootNode.children.add(kNode)
            return kNode
    }

    def createPauseFigure(Pause instr, KNode rootNode) {
            val kNode = instr.createRoundedRectangulareNode(25, 85);
            kNode.KRendering.add(factory.createKLineWidth.of(2));
            
            kNode.KRendering.foreground = "gray".color;
            val nodeText = "PAUSE";
            kNode.KRendering.add(factory.createKText.of(nodeText));
            rootNode.children.add(kNode)
            return kNode
    }

    def createConditionalFigure(Conditional instr, KNode rootNode) {
            val kNode = instr.createRoundedRectangulareNode(25, 85);
            kNode.KRendering.add(factory.createKLineWidth.of(2));
            
            kNode.KRendering.foreground = "gray".color;
            val nodeText = "CONDITIONAL";
            kNode.KRendering.add(factory.createKText.of(nodeText));
            rootNode.children.add(kNode)
            return kNode
    }
	
}