package de.cau.cs.kieler.circuit.klighd

import de.cau.cs.kieler.circuit.Circuit
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.LineCap
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
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import javax.inject.Inject

class CircuitDiagramSynthesis extends AbstractDiagramSynthesis<Circuit> {

	@Inject
	extension KNodeExtensions

	@Inject
	extension KEdgeExtensions

	@Inject
	extension KPortExtensions

	@Inject
	extension KLabelExtensions

	@Inject
	extension KRenderingExtensions

	@Inject
	extension KContainerRenderingExtensions

	@Inject
	extension KPolylineExtensions

	@Inject
	extension KColorExtensions

	extension KRenderingFactory = KRenderingFactory.eINSTANCE

	override KNode transform(Circuit circuit) {
		val root = circuit.createNode().associateWith(circuit)

		// circuit.nodes.forEach[n|root.children += transformNodes(n)]
		circuit.transform(root)

		return root
	}

	def void transform(Circuit circuit, KNode parent) {

		val KNode circNode = circuit.createNode().associateWith(circuit)
		parent.children += circNode

		circNode.setLayoutOption(LayoutOptions.EDGE_ROUTING, EdgeRouting.ORTHOGONAL)

		// boolean to detect gates
		val isGate = circuit.innerCircuits.isEmpty

		// PORT SYNTHESIS
		circuit.ports.forEach [ port |
			port.createPort().associateWith(port) => [

				// add port to kNode
				circNode.ports += it

				it.setPortSize(5, 3)
				it.setLayoutOption(LayoutOptions.OFFSET, if(isGate) 0f else -3f)
				it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND
				it.addInsidePortLabel(port.name, 8, KlighdConstants.DEFAULT_FONT_NAME).associateWith(port)
				if (port.type.equals("IN")) {
					it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.EAST)
				}
				if (port.type.equals("OUT")) {
					it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.WEST)
				}
				if (port.type.equals("SELECT")) {
					it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.SOUTH)
				}
			]
		]

		// CIRCUIT/GATE SYNTHESIS
		switch (circuit.type) {
			case "AND":
				circNode.createAndGateRendering()
			case "OR":
				circNode.createOrGateRendering()
			case "NOT":
				circNode.createNotGateRendering()
//			case "NAND":
//				circNode.createNandGateRendering()
//			case "NOR":
//				circNode.createNorGateRendering()
//			case "ADD":
//				circNode.createAddGateRendering()
//			case "SUB":
//				circNode.createSubGateRendering()
//			case "MUX":
//				circNode.createMuxGateRendering()
//			case "FF":
//				circNode.createFfGateRendering()
//			case "REG":
//				circNode.createRegGateRendering()
			case isGate:
				circNode.createBasicGateRendering()
			default:
				circNode.setNodeSize(40, 40).setExpansionAwareLayoutOption(
					LayoutOptions.PORT_CONSTRAINTS,
					PortConstraints.FIXED_ORDER,
					PortConstraints.FREE
				).addRoundedRectangle(3, 5) => [

					it.shadow = "black".color
					it.selectionBackground = "gray".color
					it.addDoubleClickAction(KlighdConstants.ACTION_COLLAPSE_EXPAND);
				]
		}

		circuit.innerCircuits.forEach [
			it.transform(circNode);
		]

		// LINK SYNTHESIS
		circuit.innerLinks.forEach [ link |
			link.target.forEach [ port |
				createEdge().associateWith(link) => [
					it.source = link.source.parent.node
					it.sourcePort = link.source.port

					it.target = port.parent.node
					it.targetPort = port.port

					it.addRoundedBendsPolyline(3).addJunctionPointDecorator
				]
			]
		]

	}

	// DRAW GATES
	def KRendering createBasicGateRendering(KNode node) {
		node.setNodeSize(40, 40);

		node.addRectangle => [
			it.lineWidth = 2
			it.lineCap = LineCap.CAP_ROUND;
			it.lineJoin = LineJoin.JOIN_ROUND;
			it.background = "white".color;
			it.selectionBackground = "gray".color;
		];
	}

	private val customLightBlue = createKColor.setColor(226, 237, 255);

	def KRendering createNotGateRendering(KNode node) {
		node.setNodeSize(30, 30);
		node.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);

		node.ports.last => [

			it.data.removeAll(it.data.filter(typeof(KRendering)));

			it.addEllipse.setBackground("white".color).lineWidth = 1.5f;
		];

		node.addRectangle => [
			it.invisible = true
			it.addPolygon => [
				it.lineWidth = 2
				it.lineCap = LineCap.CAP_ROUND;
				it.lineJoin = LineJoin.JOIN_ROUND;
				it.background = customLightBlue;
				it.selectionBackground = "gray".color;
				it.addKPosition(LEFT, 0, 0, TOP, 1, 0)
				it.addKPosition(RIGHT, 0, 0, TOP, 0, 0.5f)
				it.addKPosition(LEFT, 0, 0, BOTTOM, 1, 0)
			];
		];
	}

	def KRendering createAndGateRendering(KNode node) {
		node.setNodeSize(40, 30);
		node.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);

		node.addRectangle => [
			it.invisible = true;

			it.addRectangle => [
				it.lineWidth = 0;
				it.background = customLightBlue;
				it.selectionBackground = "gray".color;
				it.setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 14f, 0, BOTTOM, 0, 0)
			];

			it.addPolyline => [
				it.lineWidth = 2
				it.lineCap = LineCap.CAP_ROUND;
				it.lineJoin = LineJoin.JOIN_ROUND;
				it.addKPosition(RIGHT, 14.5f, 0, TOP, 1, 0)
				it.addKPosition(LEFT, 0, 0, TOP, 1, 0)
				it.addKPosition(LEFT, 0, 0, BOTTOM, 1, 0)
				it.addKPosition(RIGHT, 14.5f, 0, BOTTOM, 1, 0)
			];

			it.addArc() => [
				it.lineWidth = 2
				it.lineCap = LineCap.CAP_ROUND;
				it.background = customLightBlue;
				it.selectionBackground = "gray".color;
				it.arcAngle = 180;
				it.startAngle = -90;
				it.setAreaPlacementData.from(LEFT, 10, 0, TOP, 0, 0);
			];
		];
	}

	def KRendering createOrGateRendering(KNode node) {
		node.setNodeSize(40, 30);
		node.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);

		node.addRectangle => [
			it.invisible = true;
			it.lineCap = LineCap.CAP_ROUND;
			it.lineCap.propagateToChildren = true

			it.addRectangle => [
				it.lineWidth = 0;
				it.background = customLightBlue;
				it.selectionBackground = "gray".color;
				it.setAreaPlacementData.from(LEFT, 0.1f, 0, TOP, 0, 0).to(RIGHT, 14f, 0, BOTTOM, 0, 0)
			];

			it.addPolyline => [
				it.lineWidth = 2;
				it.addKPosition(LEFT, 0, 0, TOP, 1, 0);
				it.addKPosition(RIGHT, 15, 0, TOP, 1, 0);
			];

			it.addPolyline => [
				it.lineWidth = 2;
				it.addKPosition(LEFT, 0, 0, BOTTOM, 1, 0);
				it.addKPosition(RIGHT, 15, 0, BOTTOM, 1, 0);
			];

			it.addArc() => [
				it.lineWidth = 2;
				it.arcAngle = 180;
				it.startAngle = -90;
				it.background = "white".color;
				it.setAreaPlacementData.from(LEFT, -10.1f, 0, TOP, 0, 0).to(LEFT, 10, 0, BOTTOM, 0, 0);
			];

			it.addArc() => [
				it.lineWidth = 2
				it.background = customLightBlue;
				it.selectionBackground = "gray".color;
				it.arcAngle = 180;
				it.startAngle = -90;
				it.setAreaPlacementData.from(LEFT, 10, 0, TOP, 0, 0);
			];
		];
	}

//	private def KNode transformNodes(Node node) {
//		val circNode = node.createNode().associateWith(node);
//		circNode.addRoundedRectangle(4, 4, 2);
//		circNode.addInsideBottomCenteredNodeLabel(node.getName(), KlighdConstants.DEFAULT_FONT_SIZE,
//			KlighdConstants.DEFAULT_FONT_NAME);
//		circNode.addOutsideBottomLeftNodeLabel(node.getName() + "_" + node.nodeID);
//		circNode.addLayoutParam(LayoutOptions.SIZE_CONSTRAINT,
//			EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
//
//		
//
//		for (port : node.ports) {
//			circNode.ports += port.createPort => [
//				it.setPortSize(5, 5);
//				it.addLayoutParam(LayoutOptions::OFFSET, 0.0f);
//				if(port.type.equals("IN")){
//					it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::EAST)
//					}
//				if(port.type.equals("OUT")){
//					it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::WEST)
//				}
//				if(port.type.equals("SELECT")){
//					it.addLayoutParam(LayoutOptions::PORT_SIDE, PortSide::SOUTH)
//				}
//			]
//		}
//		circNode.ports.getEdges.addAll
//		
//		return circNode;
//	}
//	private def KPort transformPorts(Port port){
//		val circPort = port.createPort.associateWith(port)
//		val kNode = port.getNode().createNode().associateWith(port.getNode())
//		
//		if (port.type.equals("IN")) {kNode.}
//		
//		
//		
//		return circPort
//		
//	}
//	private def KEdge transformLinks(Link link) {
//
//		val circLink = link.createEdge.associateWith(link)
//		val label = KimlUtil.createInitializedLabel(circLink);
//		// val labelText = link.name;
//		val labelText = link.source.name;
//		label.configureCenterEdgeLabel(labelText, KlighdConstants.DEFAULT_FONT_SIZE, KlighdConstants.DEFAULT_FONT_NAME);
//
//		77circLink.targetPort = transformNodes(link.target.getNode());
//
//		
//	
//	
//		return circLink
//	}
}
