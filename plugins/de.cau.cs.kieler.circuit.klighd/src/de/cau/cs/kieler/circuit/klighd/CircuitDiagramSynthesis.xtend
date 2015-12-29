package de.cau.cs.kieler.circuit.klighd

import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.Link
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.LineJoin
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.PortConstraints
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.kiml.options.SizeConstraint
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import java.util.EnumSet
import javax.inject.Inject

class CircuitDiagramSynthesis extends AbstractDiagramSynthesis<Actor> {

	@Inject
	ActorSynthesis actorSynthesis

	@Inject extension KNodeExtensions
	@Inject extension KEdgeExtensions
	@Inject extension KPortExtensions
	@Inject extension KLabelExtensions
	@Inject extension KRenderingExtensions
	@Inject extension KContainerRenderingExtensions
	@Inject extension KPolylineExtensions
	@Inject extension KColorExtensions
	extension KRenderingFactory = KRenderingFactory.eINSTANCE

	override KNode transform(Actor model) {
		val rootNode = createNode().associateWith(model);

		// Set layout parameter        
		rootNode.addLayoutParam(LayoutOptions::SPACING, 20f);
		rootNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
		rootNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");

		model.transformActor(rootNode)

		val links = model.eAllContents.filter(typeof(Link)).toIterable.toList;
		for (link : links) {
			link.createLink(rootNode);
		}

//        //checks if actor is a simple gate or a frame for other actors
//        val atomicActor = model.innerActors.empty;
//        
//        //if it is a frame: just create one, if not: create the special actor
//        if(!atomicActor){
//        	model.transformSimpleFrame(rootNode);
//        } else {
//        	rootNode.children += actorSynthesis.transform(model);
//        }
		return rootNode;
	}



	def void transformActor(Actor actor, KNode parent) {
		val KNode actorNode = createNode().associateWith(actor)
		// parent.children += actorNode;

		val atomicActor = actor.innerActors.empty;

		// if it is an atomic actor (like a gate) draw this special actor
		if (atomicActor) {
			parent.children += actorSynthesis.transform(actor);
		} else { // if it is a simple Frame just draw it
			parent.children += actorNode;
			actorNode.addRoundedRectangle(4, 4, 2);

			// dont know why actor.getName is not working.. nevertheless type works as well at this point..
			actorNode.addInsideBottomLeftNodeLabel(actor.type, KlighdConstants.DEFAULT_FONT_SIZE,
				KlighdConstants.DEFAULT_FONT_NAME);
			actorNode.addLayoutParam(LayoutOptions.SIZE_CONSTRAINT,
				EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
		}
		// transform child actors and use this actor as parent
		actor.innerActors.forEach [
			it.transformActor(actorNode); 
		]
		
		actorNode.addLayoutParam(LayoutOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
		
		for (port : actor.ports) {
            actorNode.ports += port.createPort=>[
                
                it.setPortSize(5,2);
                it.setLayoutOption(LayoutOptions.OFFSET, if (atomicActor) 0f else -3f);
                it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND;
//                if (!port.name.equals("In") && !port.name.equals("Out")) {
//                    it.createLabel.configureInsidePortLabel(port.name, 8, "Arial");
//                }
                if (port.type.startsWith("In")) {it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::WEST)}
                if (port.type.startsWith("Out")) {it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::EAST)}
                if (port.type.startsWith("Sel")) {it.addLayoutParam(LayoutOptions::PORT_SIDE,PortSide::SOUTH)}
             
            ]
        }

	}
	
		def void createLink(Link link, KNode node) {
		//val KEdge circLink = link.createEdge().associateWith(link);
		
		link.target.forEach[ target |
			val KEdge edge = link.createEdge().associateWith(link);
			if(target instanceof Actor){
				edge.target = link.target.getNode()
			} else {
				edge.targetPort = link.target.getPort()
				edge.target = link.target.getNode()
			}
			
		]
	}

}
