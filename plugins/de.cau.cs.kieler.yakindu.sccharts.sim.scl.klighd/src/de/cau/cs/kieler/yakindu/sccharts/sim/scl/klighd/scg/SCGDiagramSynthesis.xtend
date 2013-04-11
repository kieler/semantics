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

class SCGDiagramSynthesis extends AbstractTransformation<Program, KNode> {

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
	override KNode transform(Program program, TransformationContext<Program, KNode> transformationContext) {
	    use(transformationContext);
		
        val rootNode = KimlUtil::createInitializedNode;
        rootNode.KShapeLayout.setProperty(LayoutOptions::SPACING, Float::valueOf("25.0"));
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
            }  
        }
	}

    def createAssignmentFigure(Assignment instr, KNode rootNode) {
            val kNode = instr.createRoundedRectangulareNode(25, 85);
            kNode.KRendering.add(factory.createKLineWidth.of(2));
            
//            kNode.KRendering.foreground = if (node.id.endsWith("_S")) "black".color else "gray".color;
            kNode.KRendering.foreground = "gray".color;
            
//            val nodeText = node.id.substring(0,node.id.length - 2);
            val nodeText = "1";
            
            kNode.KRendering.add(factory.createKText.of(nodeText));
            rootNode.children.add(kNode)
            return kNode
    }

    def createParallelFigure(Parallel instr, KNode rootNode) {
            val kNode = instr.createRoundedRectangulareNode(25, 85);
            kNode.KRendering.add(factory.createKLineWidth.of(2));
            
//            kNode.KRendering.foreground = if (node.id.endsWith("_S")) "black".color else "gray".color;
            kNode.KRendering.foreground = "gray".color;
            
//            val nodeText = node.id.substring(0,node.id.length - 2);
            val nodeText = "1";
            
            kNode.KRendering.add(factory.createKText.of(nodeText));
            rootNode.children.add(kNode)
            return kNode
    }
	
}