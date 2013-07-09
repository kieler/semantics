package de.cau.cs.kieler.scl.kaom.klighd

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableSet
import com.google.inject.Injector
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.Trigger
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.util.Pair
import de.cau.cs.kieler.kaom.Entity
import de.cau.cs.kieler.kaom.Link
import de.cau.cs.kieler.kaom.Port
import de.cau.cs.kieler.kaom.Relation
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.NodeLabelPlacement
import de.cau.cs.kieler.kiml.options.PortConstraints
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.kiml.util.KimlUtil
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.TransformationOption
import de.cau.cs.kieler.klighd.transformations.AbstractDiagramSynthesis
import de.cau.cs.kieler.scl.SCLStandaloneSetup
import java.util.ArrayList
import java.util.HashMap
import javax.inject.Inject
import org.eclipse.xtext.serializer.ISerializer

import static de.cau.cs.kieler.scl.kaom.klighd.KAOMNetlistDiagramSynthesis.*
import de.cau.cs.kieler.kiml.options.PortLabelPlacement
import de.cau.cs.kieler.kiml.options.SizeConstraint
import java.util.EnumSet
import de.cau.cs.kieler.klighd.util.ExpansionAwareProperty

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
//            kNode.addLayoutParam(LayoutOptions::NODE_LABEL_PLACEMENT,
//                NodeLabelPlacement::outsideBottomCenter
//            );
        
            kNode.setNodeSize(25,25);
            //kNode.setMinimalNodeSize(25,25);
            kNode.createLabel.configureOutsideCentralBottomNodeLabel(kaomEntity.name, 10, "Arial")
                .addLayoutParam(KlighdConstants::KLIGHD_SELECTION_UNPICKABLE, true);
            kNode.addLayoutParam(ExpansionAwareProperty::of(LayoutOptions::NODE_LABEL_PLACEMENT),
                Pair::create(NodeLabelPlacement::outsideBottomCenter, EnumSet::of( NodeLabelPlacement::INSIDE,  NodeLabelPlacement::V_CENTER,  NodeLabelPlacement::H_CENTER)));
            kNode.addRectangle.addText("[-]")=>[
                it.addAction(Trigger::DOUBLECLICK, KlighdConstants::ACTION_COLLAPSE_EXPAND);
                it.setPointPlacementData(createKPosition(RIGHT, 14, 0, TOP, 2, 0), H_LEFT, V_TOP, 0,0,0,0)
            ]

            //kNode.addRectangle.addAction(Trigger::DOUBLECLICK, KlighdConstants::ACTION_COLLAPSE_EXPAND);
            kNode.addLayoutParam(LayoutOptions::PORT_LABEL_PLACEMENT, PortLabelPlacement::INSIDE);
            kNode.addLayoutParam(LayoutOptions::SIZE_CONSTRAINT, EnumSet::of(SizeConstraint::PORTS, SizeConstraint::PORT_LABELS, SizeConstraint::NODE_LABELS, SizeConstraint::MINIMUM_SIZE));
        } else {
            kNode.addLayoutParam(LayoutOptions::PORT_LABEL_PLACEMENT, PortLabelPlacement::OUTSIDE);
            val rectangle = kNode.addRectangle
            
            switch (kaomEntity.name) {
                case "AND": {
                    kNode.setNodeSize(40,29);
                    rectangle.invisible = true
                    //rectangle.lineWidth.propagateToChildren = true
                    val line = rectangle.addPolyline;
                    line.lineWidth = 2
                    line.points += createKPosition(RIGHT, 0, 0.3f, TOP, 1,0)
                    line.points += createKPosition(LEFT, 0, 0, TOP, 1,0)
                    line.points += createKPosition(LEFT, 0, 0, BOTTOM, 1,0)
                    line.points += createKPosition(RIGHT, 0, 0.3f, BOTTOM, 1,0)
                    val arc = rectangle.addArc();
                    arc.lineWidth = 2
                    arc.setArcAngle(184);
                    arc.startAngle = -94;
                    arc.setAreaPlacementData(
                        createKPosition(RIGHT, 0, 0.7f, TOP, 0,0),
                        createKPosition(RIGHT, 0, -0.02f, BOTTOM, 0,0)
                    )
                }
                case "OR": {
                    kNode.setNodeSize(40,32);
                    rectangle.invisible = true
                    val arc1 = rectangle.addArc();
                    arc1.lineWidth = 2
                    arc1.setArcAngle(190);
                    arc1.startAngle = -98;
                    arc1.setAreaPlacementData(
                        createKPosition(RIGHT, 0, 1.3f, TOP, 0,0),
                        createKPosition(RIGHT, 0, 0.95f, BOTTOM, 0,0)
                    )
                    val arc2 = rectangle.addArc();
                    arc2.lineWidth = 2
                    arc2.setArcAngle(194);
                    arc2.startAngle = -98;
                    arc2.setAreaPlacementData(
                        createKPosition(RIGHT, 0, 2f, TOP, 0,0),
                        createKPosition(RIGHT, 0, -0.02f, BOTTOM, 0,0)
                    )
                }
                case "R": {
                    kNode.setNodeSize(32,30);
                    //rectangle.invisible = true
                    //rectangle.lineWidth.propagateToChildren = true
                    val line = rectangle.addPolyline;
                    line.lineWidth = 2
                    line.points += createKPosition(LEFT, 0, 0.2f, BOTTOM, 1.5f,0)
                    line.points += createKPosition(LEFT, 0, 0.5f, BOTTOM, 1.5f,0.3f)
                    line.points += createKPosition(RIGHT, 0, 0.2f, BOTTOM, 1.5f,0)
                }
                case "NOT": {
                    kNode.setNodeSize(32,34);
                    rectangle.invisible = true
                    //rectangle.lineWidth.propagateToChildren = true
                    val line = rectangle.addPolyline;
                    line.lineWidth = 2
                    line.points += createKPosition(LEFT, 0, 0, TOP, 0,0)
                    line.points += createKPosition(LEFT, 0, 0.68f, TOP, 0,0.5f)
                    line.points += createKPosition(LEFT, 0, 0, BOTTOM, 0,0)
                    line.points += createKPosition(LEFT, 0, 0, TOP, 0,0)
                    line.points += createKPosition(LEFT, 0, 0.68f, TOP, 0,0.5f)
                    val circle = rectangle.addEllipse;
                    circle.lineWidth = 2
                    circle.setAreaPlacementData(
                        createKPosition(RIGHT, 0, 0.32f, TOP, 0,0.33f),
                        createKPosition(RIGHT, 0, -0.02f, BOTTOM, 0,0.33f)
                    )
                }
                default: {
                    rectangle.addText(" " + kaomEntity.name + " ").setSurroundingSpace(8, 0)
                    kNode.addLayoutParam(LayoutOptions::PORT_LABEL_PLACEMENT, PortLabelPlacement::INSIDE);
                    kNode.addLayoutParam(LayoutOptions::SIZE_CONSTRAINT, EnumSet::of(SizeConstraint::PORTS, SizeConstraint::PORT_LABELS, SizeConstraint::NODE_LABELS, SizeConstraint::MINIMUM_SIZE));
               }
            }
        }
        
        kNode.addRectangle;
        
        // Put ports on fixed side
        kNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
        
        //val kNode = kaomEntity.createRoundedRectangulareNode(25, 85);
        kNode.KRendering.lineWidth = 2;
        //kNode.addNSPortsFixed
        rootNode.children.add(kNode)

        // Add this instruction to the instruction map and return a instruction list with this statement.
        //(kaomEntity as Entity).addToMapping(kNode, kNode);           
        val retList = new ArrayList<Entity>
        retList.add(kaomEntity as Entity);
        
        for (port : kaomEntity.childPorts) {
            kNode.ports += port.createPort=>[
                it.setPortSize(5,5);
                it.addLayoutParam(LayoutOptions::OFFSET, 0.0f);
                if (!port.name.equals("In") && !port.name.equals("Out")) {
                    it.createLabel.configureInsidePortLabel(port.name, 8, "Arial");
                }
                if (port.name.startsWith("In")) {it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::WEST)}
                if (port.name.startsWith("Go")) {it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::WEST)}
                if (port.name.startsWith("Res")) {it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::WEST)}
                if (port.name.startsWith("Kill")) {it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::WEST)}
                if (port.name.startsWith("Out")) {it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::EAST)}
                if (port.name.startsWith("Sel")) {it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::EAST)}
                if (port.name.startsWith("K0")) {it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::EAST)}
                if (port.name.startsWith("K1")) {it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::EAST)}
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
//        kNode.addPolygon.setBackground("black".color) => [
//            it.points += createKPosition(LEFT,0,0,TOP,0,0.5f)
//            it.points += createKPosition(LEFT,0,0.5f,TOP,0,0)
//            it.points += createKPosition(RIGHT,0,0,TOP,0,0.5f)
//            it.points += createKPosition(RIGHT,0,0.5f,BOTTOM,0,0)
//        ];
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
        
        //kEdge.addPolyline.addArrowDecorator;
        
    }
}