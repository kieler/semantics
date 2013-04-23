package de.cau.cs.kieler.scl.kaom.klighd

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
import de.cau.cs.kieler.kiml.options.NodeLabelPlacement
import de.cau.cs.kieler.kiml.options.PortConstraints
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.kiml.util.KimlUtil
import de.cau.cs.kieler.klighd.TransformationOption
import de.cau.cs.kieler.klighd.transformations.AbstractDiagramSynthesis
//import de.cau.cs.kieler.scl.SCLHelper
//import de.cau.cs.kieler.scl.scl.Assignment
//import de.cau.cs.kieler.scl.scl.Conditional
//import de.cau.cs.kieler.scl.scl.Goto
//import de.cau.cs.kieler.scl.scl.Instruction
//import de.cau.cs.kieler.scl.scl.InstructionList
//import de.cau.cs.kieler.scl.scl.Parallel
//import de.cau.cs.kieler.scl.scl.Pause
//import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.kaom.Entity
import de.cau.cs.kieler.kaom.KaomFactory

import java.util.HashMap
import javax.inject.Inject
import org.eclipse.xtext.serializer.ISerializer
import org.yakindu.sct.model.stext.stext.Expression


import static de.cau.cs.kieler.scl.kaom.klighd.KAOMNetlistDiagramSynthesis.*
import de.cau.cs.kieler.scl.SCLStandaloneSetup
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.KlighdConstants
import java.util.ArrayList
import de.cau.cs.kieler.klay.layered.properties.Properties
import de.cau.cs.kieler.klay.layered.properties.LayerConstraint
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.kaom.Link
import de.cau.cs.kieler.kaom.Port
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import java.util.EnumSet
import de.cau.cs.kieler.kiml.options.NodeLabelPlacement
import de.cau.cs.kieler.kaom.Relation
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.KColoring

/*
 * This class extends the klighd diagram synthesis to draw scl program models in klighd.
 * It is linked to klighd via the de.cau.cs.kieler.klighd.modelTransformations extension.
 */
class KAOMNetlistDiagramSynthesis extends AbstractDiagramSynthesis<Entity> {
    
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
    extension KContainerRenderingExtensions
    
    @Inject
    extension KPolylineExtensions
    
	@Inject
	extension KColorExtensions
	
	@Inject
	extension KPortExtensions
	
	@Inject
	extension KLabelExtensions
	
    private static val KRenderingFactory renderingFactory = KRenderingFactory::eINSTANCE
    
	
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
    private var HashMap<Entity, KNode>EntityMapping;
    private var HashMap<KNode, HashMap<String, KPort>>PortMapping;
    
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
	override KNode transform(Entity kaomEntity) {

        // Initialize all maps	    
	    EntityMapping = new HashMap<Entity, KNode>;
	    PortMapping = new HashMap<KNode, HashMap<String, KPort>>;
	    EdgeMapping = new HashMap<KNode, HashMap<KPort, Pair<KNode, KPort>>>;
		
		// Initialize root node
        val rootNode = KimlUtil::createInitializedNode;

        // Set layout parameter        
        rootNode.addLayoutParam(LayoutOptions::SPACING, 20f);
        rootNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
        rootNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
        //rootNode.addLayoutParam(LayoutOptions::DIRECTION, Direction::RIGHT);
        //rootNode.addLayoutParam(LayoutOptions::NO_LAYOUT, true);

        // Evaluate the program beginning at the program root
        for (kaomChildEntity : kaomEntity.childEntities) {
            kaomChildEntity.createEntityFigure(rootNode);    
        }
                		
        val links = kaomEntity.eAllContents.filter(typeof(Link)).toIterable.toList;
        for (kaomLink : links) {
            kaomLink.createLinkFigure(rootNode);
        }
        
        rootNode
	}

	
	
    def createEntityFigure(Entity kaomEntity, KNode rootNode) {
        // Use the injected serializer to serialize the expression in the assignment statement.
        //val nodeText = serializer.serialize(instr);

        /* Create the knode.
         * 
         * addNSPortsFixed adds an incoming and an outgoing port to the node. See addNSPortsFixed for 
         * further information.
         */ 
        val kNode = kaomEntity.createNode;
        
        if (kaomEntity.childEntities.size > 0) {
            kNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
            kNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
            kNode.addLayoutParam(LayoutOptions::NODE_LABEL_PLACEMENT,
                NodeLabelPlacement::outsideBottomCenter
            );
        
            kNode.setNodeSize(25,25);
            kNode.createLabel.configureOutsideCentralBottomNodeLabel(kaomEntity.name, 10, "Arial");
        } else {
            kNode.addRectangle.addText(" " + kaomEntity.name + " ").setSurroundingSpace(8, 0);
        }
        
        kNode.addRectangle;
        
        //val kNode = kaomEntity.createRoundedRectangulareNode(25, 85);
        kNode.KRendering.lineWidth = 2;
        //kNode.addNSPortsFixed
        rootNode.children.add(kNode)

        // Add this instruction to the instruction map and return a instruction list with this statement.
        //(kaomEntity as Entity).addToMapping(kNode, kNode);           
        val retList = new ArrayList<Entity>
        retList.add(kaomEntity as Entity);
        
        kNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
        for (port : kaomEntity.childPorts) {
            kNode.ports += port.createPort=>[
                it.setPortSize(7,7);
                if (!port.name.equals("In") && !port.name.equals("Out")) {
                    it.createLabel.configureInsidePortLabel(port.name, 10, "Arial");
                }
                switch(port.name) {
                    case "In": it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::WEST)
                    case "Go": it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::WEST)
                    case "Res": it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::WEST)
                    case "Kill": it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::WEST)
                    case "Out": it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::EAST)
                    case "Sel": it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::EAST)
                    case "K0": it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::EAST)
                    case "K1": it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::EAST)
                }
            ]
        }
        
        // Add all relations
        for (kaomChildRelation: kaomEntity.childRelations) {
            kaomChildRelation.createRelationFigure(kNode);
        }

        // Recursion for inner entities
        for (kaomChildEntity : kaomEntity.childEntities) {
            kaomChildEntity.createEntityFigure(kNode);    
        }
        
        return retList
    }


    def createRelationFigure(Relation kaomRelation, KNode rootNode) {
        val kNode = kaomRelation.createNode;
        kNode.addRectangle.setBackground("black".color);
        kNode.setNodeSize(5,5);
        rootNode.children.add(kNode);
    }

    def createLinkFigure(Link kaomLink, KNode rootNode) {
        val kEdge = kaomLink.createEdge;
        
        switch(kaomLink.source) {
            Entity: kEdge.source = kaomLink.source.node
            Relation: kEdge.source = kaomLink.source.node
            Port: {
                 kEdge.source = kaomLink.source.eContainer.node; 
                 kEdge.sourcePort = kaomLink.source.port;
            }
        }

        switch(kaomLink.target) {
            Entity: kEdge.target = kaomLink.target.node
            Relation: kEdge.target = kaomLink.target.node
            Port: {
                 kEdge.target = kaomLink.target.eContainer.node; 
                 kEdge.targetPort = kaomLink.target.port;
            }
        }
        
        kEdge.addPolyline.addArrowDecorator;
        
    }
}