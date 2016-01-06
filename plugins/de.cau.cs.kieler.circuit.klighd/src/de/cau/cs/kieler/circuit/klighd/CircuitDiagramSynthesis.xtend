package de.cau.cs.kieler.circuit.klighd

import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.Port
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.LineJoin
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.PortConstraints
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import javax.inject.Inject
import de.cau.cs.kieler.circuit.Link

class ActorDiagramSynthesis extends AbstractDiagramSynthesis<Actor> {

	@Inject ActorSynthesis actorSynthesis

	@Inject extension KNodeExtensions
	@Inject extension KEdgeExtensions
	@Inject extension KPortExtensions
	@Inject extension KRenderingExtensions
	@Inject extension KPolylineExtensions
	@Inject extension KColorExtensions
	extension KRenderingFactory = KRenderingFactory.eINSTANCE

	override KNode transform(Actor model) {
		val root = createNode().associateWith(model);

		// transformActor(model, root);
		model.transformActor(root);

//		val links = model.eAllContents.filter(typeof(Link)).toIterable.toList;
//		for (link : links) {
//			link.transformLink(root);
//		}
		return root;
	}

	// create a KNode for an Actor
	def void transformActor(Actor actor, KNode parent) {

		// from tutorials of klighD snythesis to be sure actors already exist when links are created
		// private def create actorNode : actor.createNode() transformActor(Actor actor, KNode parent) {
		// actorNode.associateWith(actor);
		// draw actors and attach it to parent
		val actorNode = actorSynthesis.transform(actor) // actor.createNode().associateWith(actor)
		parent.children += actorNode

		// check if actor is a gate or an inner circuit
		val Boolean atomicActor = actor.innerActors.empty

		// rendering for edges and ports of actor
		actorNode.setLayoutOption(LayoutOptions.EDGE_ROUTING, EdgeRouting.ORTHOGONAL);
		actorNode.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);

		// add ports to actor
		for (port : actor.ports) {
			actorNode.ports += port.createPort => [

				it.setPortSize(5, 2);
				it.setLayoutOption(LayoutOptions.OFFSET, if(atomicActor) 0f else -3f)

				if (port.type.startsWith("In")) {
					it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.WEST)
				} else if (port.type.startsWith("Out")) {
					it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.EAST)
				} else if (port.type.startsWith("Sel")) {
					it.setPortSize(2, 5);
					it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.SOUTH)
				}

				it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;

			]
		}

		// create all the inner actors 
		actor.innerActors.forEach [
			it.transformActor(actorNode);
		]
		
		for (link : actor.innerLinks) {
			actorNode.allEdges += link.createEdge => [
				switch (link.source) {
					Actor:
						it.source = link.source.node
					Port: {
						it.source = link.source.eContainer.node;
						it.sourcePort = link.source.port
					}
				}

				switch (link.target) {
					Actor:
						it.target = link.target.node
					Port: {
						it.target = link.target.eContainer.node;
						it.targetPort = link.target.port
					}
				}
				it.addRoundedBendsPolyline(3).addJunctionPointDecorator;
				
			]
		}
////		draw the edges for each link
//		actor.innerLinks.forEach [ link |
//			createEdge().associateWith(link) => [
//				switch (link.source) {
//					Actor:
//						it.source = link.source.node
//					Port: {
//						it.source = link.source.eContainer.node;
//						it.sourcePort = link.source.port
//					}
//				}
//
//				switch (link.target) {
//					Actor:
//						it.target = link.target.node
//					Port: {
//						it.target = link.target.eContainer.node;
//						it.targetPort = link.target.port
//					}
//				}
//				it.addRoundedBendsPolyline(3).addJunctionPointDecorator;
//
//			]
//
//		]
	// actor.ports.forEach [ port |
//			port.outgoingLinks.forEach [ link |
//				val edge = link.createEdge().associateWith(link)
//				edge.addPolyline(2).addHeadArrowDecorator();
//
//				switch (link.source) {
//					Actor:
//						edge.source = link.source.node
//					Port: {
//						edge.source = link.source.eContainer.node;
//						edge.sourcePort = link.source.port
//					}
//				}
//
//				switch (link.target) {
//					Actor:
//						edge.target = link.target.node
//					Port: {
//						edge.target = link.target.eContainer.node;
//						edge.targetPort = link.target.port
//					}
//				}it.addRoundedBendsPolyline(3).addJunctionPointDecorator;
//			]
//		]
/////////////////////////////////////////////################################################
//}
//	def void transformLink(Link link, KNode parent) {
//
//		val edge = link.createEdge().associateWith(link)
//
//		switch (link.source) {
//			Actor:
//				edge.source = link.source.node
//			Port: {
//				edge.source = link.source.eContainer.node;
//				edge.sourcePort = link.source.port
//			}
//		}
//
//		switch (link.target) {
//			Actor:
//				edge.target = link.target.node
//			Port: {
//				edge.target = link.target.eContainer.node;
//				edge.targetPort = link.target.port
//			}
//		}
/////////////////////////////////////////////################################################
	}

}

