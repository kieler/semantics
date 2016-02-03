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
import de.cau.cs.kieler.core.krendering.LineCap
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.KlighdConstants

class CircuitDiagramSynthesis extends AbstractDiagramSynthesis<Actor> {

	@Inject ActorSynthesis actorSynthesis

	@Inject extension KNodeExtensions
	@Inject extension KEdgeExtensions
	@Inject extension KPortExtensions
	@Inject extension KRenderingExtensions
	@Inject extension KPolylineExtensions
	@Inject extension KColorExtensions
	@Inject extension KLabelExtensions
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
		actorSynthesis.colorReset
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
//		actorNode.setLayoutOption(LayoutOptions.EDGE_ROUTING, EdgeRouting.ORTHOGONAL);
		actorNode.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);

		// add ports to actor
		for (port : actor.ports) {
			val isAtomic = (actor.innerActors.length == 0)
			val isNotGate = (actor.type == "NOT")
			val kPort = port.port.associateWith(port)
			actorNode.ports += kPort => [
				//it.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_RATIO)
				if (!isAtomic) {
					it.addInsidePortLabel(port.name, 8, KlighdConstants.DEFAULT_FONT_NAME).associateWith(port)
				}

				if (port.type.startsWith("In")) {

					if (port.name == "Tick") { // /TODO: still not working ... place Tick ports at fixed position
						it.setPortSize(0, 0)
						it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.WEST)
						it.addPolygon => [
							it.lineWidth = 1
							it.lineCap = LineCap.CAP_ROUND;
							it.lineJoin = LineJoin.JOIN_ROUND;
							it.background = "white".color;
							it.selectionBackground = "gray".color;
							it.addKPosition(LEFT, 0.5f, 0, TOP, 4, 0)
							it.addKPosition(RIGHT, -5, 0, TOP, 0, 0.5f)
							it.addKPosition(LEFT, 0.5f, 0, BOTTOM, 4, 0)
						]
					} else {
						if (port.name.startsWith("const")) {
							it.addInsidePortLabel("Sel(1)", 8, KlighdConstants.DEFAULT_FONT_NAME).associateWith(port)

						}
						
						it.setPortSize(5, 2);
						it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.WEST)
						it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;
						it.setLayoutOption(LayoutOptions.OFFSET, if(atomicActor) 0f else -3f)
					}

				} else if (port.type.startsWith("Out")) {
					it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.EAST)
					it.setLayoutOption(LayoutOptions.OFFSET, if(atomicActor) 0f else -3f)
					if (port.outgoingLinks.length == 0) {
//						System.out.println("HBDAFIHBSDK")
						it.addEllipse.setBackground("red".color).lineWidth = 0;
						it.setPortSize(6, 6);
					} else {
						it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;
						it.setPortSize(5, 2);
					}

				} else if (port.type.startsWith("Sel")) {
					it.setPortSize(2, 5);
					it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.SOUTH)
					it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;
					it.setLayoutOption(LayoutOptions.OFFSET, if(atomicActor) 0f else -3f)

				} else if (port.type.startsWith("Not")) {
					if (isNotGate) {
						it.setPortSize(5, 2);
						it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.WEST)
						it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;
						it.setLayoutOption(LayoutOptions.OFFSET, if(atomicActor) 0f else -3f)
					} else {
						it.setLayoutOption(LayoutOptions.OFFSET, 0f);
						it.setPortSize(6, 6);
						it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.WEST)
						it.addEllipse.setBackground("white".color).lineWidth = 1;

					}

				}

			]
		}

		// create all inner actors 
		actor.innerActors.forEach [
			it.transformActor(actorNode);
		]

		// draw edges for links
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

		for (p : actor.ports) {
			if (p.outgoingLinks == null) {
				System.out.println("NO EDGE")
				actorNode.addEllipse => [
					it.setBackground("red".color).lineWidth = 1.5f;
					it.setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 6, 0, BOTTOM, 11, 0);

				]

			}
		}

	}
}



