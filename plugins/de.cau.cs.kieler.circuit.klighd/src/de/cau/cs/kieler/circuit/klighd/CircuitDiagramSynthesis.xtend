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
import de.cau.cs.kieler.klay.layered.properties.Properties
import de.cau.cs.kieler.klay.layered.properties.EdgeLabelSideSelection
import de.cau.cs.kieler.kiml.options.PortLabelPlacement
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.kiml.options.SizeConstraint
import java.util.EnumSet
import de.cau.cs.kieler.circuit.Link
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.klay.layered.p4nodes.NodePlacementStrategy

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

	// -------------------------------------------------------------------------
	// -- KlighD Options
	// -------------------------------------------------------------------------
	/** Show Not-Gates */
	private static val SynthesisOption SHOW_NOT = SynthesisOption::createCheckOption("Not-Gates", true);

	/** Show Tick */
	private static val SynthesisOption SHOW_TICK = SynthesisOption::createCheckOption("Tick Wires", false);

	/** Show Reset */
	private static val SynthesisOption SHOW_RESET = SynthesisOption::createCheckOption("Reset Wires", false);

	/** Show Circuit */
	private static val SynthesisOption SHOW_ALL_REGIONS = SynthesisOption::createCheckOption("Show Entire Circuit",
		false);
	
	/** Diargram */
	private static val SynthesisOption BRANDES_KOEPF = SynthesisOption::createCheckOption("Brandes Koepf",
		true);
	
	/** Show Circuit */
	private static val SynthesisOption INTERACTIVE = SynthesisOption::createCheckOption("Interactive",
		false);
	
	/** Show Circuit */
	private static val SynthesisOption LINEAR_SEGMENTS = SynthesisOption::createCheckOption("Linear Segments",
		false);
	
	/** Show Circuit */
	private static val SynthesisOption NETWORK_SIMPLEX = SynthesisOption::createCheckOption("Network Simplex",
		false);
	
	/** Show Circuit */
	private static val SynthesisOption SIMPLE = SynthesisOption::createCheckOption("Simple",
		false);

//	/** Show PreRegister Region */
//	private static val SynthesisOption SHOW_PRE_REGION = SynthesisOption::createCheckOption("PreRegion", false);
//
//	/** Show Initialization Region */
//	private static val SynthesisOption SHOW_INIT_REGION = SynthesisOption::createCheckOption("Initialization", false);
//
//	/** Show Program Logic Region */
//	private static val SynthesisOption SHOW_LOGIC_REGION = SynthesisOption::createCheckOption("Program Logic", true);

	/**  
	 * Returns a list of KlighD visualization options. Called by KlighD.
	 * 
	 * @return Returns a list of KlighD visualization options.
	 */
	override public getDisplayedSynthesisOptions() {
		return newLinkedList(
			SynthesisOption::createSeparator("Visibility"),
			SHOW_NOT,
			SHOW_TICK,
			SHOW_RESET,
			SHOW_ALL_REGIONS,
			SynthesisOption::createSeparator("Node Placement"),
			BRANDES_KOEPF,
			INTERACTIVE,
			LINEAR_SEGMENTS,
			NETWORK_SIMPLEX,
			SIMPLE
		)
	}

	override KNode transform(Actor model) {

		if (SHOW_ALL_REGIONS.booleanValue) {
			val root = createNode().associateWith(model);
			model.transformActor(root);
			return root;
		} else {
			val logic = model.eAllContents.filter(Actor).filter[name == "Program Logic"].head
			val rootLogic = createNode().associateWith(logic)
			logic.transformActor(rootLogic);
			return rootLogic;
			
			}
		
	}

	// create a KNode for an Actor
	def void transformActor(Actor actor, KNode parent) {

		// draw actors and attach them to parent
		val actorNode = actorSynthesis.transform(actor) // actor.createNode().associateWith(actor)
		actorNode.associateWith(actor)
		parent.children += actorNode

		// check if actor is a gate or an inner circuit
		val Boolean atomicActor = actor.innerActors.empty

		// rendering for edges and ports of actor
//		actorNode.setLayoutOption(LayoutOptions.EDGE_ROUTING, EdgeRouting.ORTHOGONAL);
		actorNode.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);
		actorNode.setLayoutOption(LayoutOptions.PORT_LABEL_PLACEMENT, PortLabelPlacement.INSIDE);
		actorNode.setLayoutOption(LayoutOptions.DIRECTION, Direction.RIGHT);
		
		if(BRANDES_KOEPF.booleanValue){ actorNode.addLayoutParam(Properties.NODE_PLACER, NodePlacementStrategy.BRANDES_KOEPF);}
		if(INTERACTIVE.booleanValue){ actorNode.addLayoutParam(Properties.NODE_PLACER, NodePlacementStrategy.INTERACTIVE);}
		if(LINEAR_SEGMENTS.booleanValue){ actorNode.addLayoutParam(Properties.NODE_PLACER, NodePlacementStrategy.LINEAR_SEGMENTS);}
		if(NETWORK_SIMPLEX.booleanValue){ actorNode.addLayoutParam(Properties.NODE_PLACER, NodePlacementStrategy.NETWORK_SIMPLEX);}
		if(SIMPLE.booleanValue){ actorNode.addLayoutParam(Properties.NODE_PLACER, NodePlacementStrategy.SIMPLE);}
		
		
		
		
		// add ports to actor
		for (port : actor.ports) {
			val isAtomic = (actor.innerActors.length == 0)
			val isNotGate = (actor.type == "NOT")
			val kPort = port.port.associateWith(port)
			actorNode.ports += kPort => [
				it.associateWith(port)
				// it.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_RATIO)
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
						it.setPortSize(5, 2);
						it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.WEST)
						it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;
						it.setLayoutOption(LayoutOptions.OFFSET, if(atomicActor) 0f else -3f)
					}

					if (port.type == "In_1") {
						actorNode.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_ORDER);
						it.addInsidePortLabel("Sel(1)", 5, KlighdConstants.DEFAULT_FONT_NAME).associateWith(port)
						it.setLayoutOption(LayoutOptions.PORT_INDEX, 1)
					} else if (port.type == "In_0") {
						actorNode.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_ORDER);
						it.addInsidePortLabel("Sel(0)", 5, KlighdConstants.DEFAULT_FONT_NAME).associateWith(port)
						it.setLayoutOption(LayoutOptions.PORT_INDEX, 0)
					}

				} else if (port.type.startsWith("Out")) {
					it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.EAST)
					it.setLayoutOption(LayoutOptions.OFFSET, if(atomicActor) 0f else -3f)
					if (port.outgoingLinks.length == 0) {
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
		actor.innerLinks.forEach [ l |
			if ((SHOW_TICK.booleanValue) && (SHOW_RESET.booleanValue)) {
				createLink(l)
			} else if (!(SHOW_TICK.booleanValue) && !(SHOW_RESET.booleanValue)) {
				val s = l.source as Port
				if (!(s.name == "Tick") && !(s.name == "Reset")) {
					createLink(l)
				}
			} else if (!SHOW_TICK.booleanValue) {
				val s = l.source as Port
				if (!(s.name == "Tick")) {
					createLink(l)
				}

			} else if (!SHOW_RESET.booleanValue) {
				val s = l.source as Port
				if (!(s.name == "Reset")) {
					createLink(l)
				}

			}

		]

		for (p : actor.ports) {
			if (p.outgoingLinks == null) {
				actorNode.addEllipse => [
					it.setBackground("red".color).lineWidth = 1.5f;
					it.setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 6, 0, BOTTOM, 11, 0);

				]

			}
		}

//		if (!(SHOW_INIT_REGION.booleanValue)) {
		if (actor.name == "Circuit Initialization") {
			actorNode.setLayoutOption(KlighdProperties::EXPAND, false)
		}
//		}
//		if (!(SHOW_PRE_REGION.booleanValue)) {
		if (actor.name == "Pre Registers") {
			actorNode.setLayoutOption(KlighdProperties::EXPAND, false)
//			}
		}

		if (!(SHOW_ALL_REGIONS.booleanValue)) {
			if (actor.name == "Program Logic") {
				actorNode.setLayoutOption(LayoutOptions.PORT_LABEL_PLACEMENT, PortLabelPlacement.OUTSIDE);

			}
		}

	}

	def createLink(Link link) {

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

	}

}



