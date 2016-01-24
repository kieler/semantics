package de.cau.cs.kieler.circuit.klighd

import de.cau.cs.kieler.circuit.Actor
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
import de.cau.cs.kieler.circuit.Port
import de.cau.cs.kieler.circuit.CircuitFactory

class CircuitDiagramSynthesis extends AbstractDiagramSynthesis<Actor> {

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
		model.transformActor(root); // choose this if solution with two big frames is not optimal
//		val circActor = CircuitFactory::eINSTANCE.createActor;
//		val ca = createNode().associateWith(circActor)
//		root.children += ca
//		// transformActor(model, root);
//		model.transformActor(ca);
//		val links = model.eAllContents.filter(typeof(Link)).toIterable.toList;
//		for (link : links) {
//			link.transformLink(root);
//		}
		return root;
	}

	// create a KNode for an Actor
	def void transformActor(Actor actor, KNode parent) {

		// draw actors and attach them to parent
		val actorNode = actorSynthesis.transform(actor) // actor.createNode().associateWith(actor)
		parent.children += actorNode

		// check if actor is a gate or an inner circuit
		val Boolean atomicActor = actor.innerActors.empty

		// rendering for edges and ports of actor
		actorNode.setLayoutOption(LayoutOptions.EDGE_ROUTING, EdgeRouting.ORTHOGONAL);
		actorNode.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);

		// add ports to actor
		for (port : actor.ports) {
			val kPort = port.port.associateWith(port)
			actorNode.ports += kPort => [

				if (port.type.startsWith("In")) {
					it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.WEST)
					it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;
					it.setPortSize(5, 2);
					it.setLayoutOption(LayoutOptions.OFFSET, if(atomicActor) 0f else -3f)

				} else if (port.type.startsWith("Out")) {
					it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.EAST)
					it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;
					it.setPortSize(5, 2);
					it.setLayoutOption(LayoutOptions.OFFSET, if(atomicActor) 0f else -3f)

				} else if (port.type.startsWith("Sel")) {
					it.setPortSize(2, 5);
					it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.SOUTH)
					it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;
					it.setLayoutOption(LayoutOptions.OFFSET, if(atomicActor) 0f else -3f)

				} else if (port.type.startsWith("Not")) {
					// it.setPortSize(2, 5);
					it.setLayoutOption(LayoutOptions.OFFSET, 0f);
					it.setPortSize(6, 6);
					it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.WEST)
					it.addEllipse.setBackground("white".color).lineWidth = 1.5f;
				}
						]
		}

		// create all inner actors 
		actor.innerActors.forEach [
			it.transformActor(actorNode);
		]

//		draw the edges for each link
		actor.innerLinks.forEach [ link |
			createEdge().associateWith(link) => [
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

		]

	}
}



