/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.circuit.klighd

import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.Link
import de.cau.cs.kieler.circuit.Port
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.LineCap
import de.cau.cs.kieler.klighd.krendering.LineJoin
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import javax.inject.Inject
import org.eclipse.elk.alg.layered.p4nodes.NodePlacementStrategy
import org.eclipse.elk.alg.layered.properties.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.HierarchyHandling
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortLabelPlacement
import org.eclipse.elk.core.options.PortSide

/** 
 * @author fry
 * 
 * Synthesis transforms Circuit metamodel components into KGraph metamodel components for visualization.
 * 
 */

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
	
	//TODO: 
//	/** Show Assignment Regions */
//	private static val SynthesisOption SHOW_ASSIGNMENT = SynthesisOption::createCheckOption("Show Assignment Regions",
//		false);
//	/** Show Not-Gates */
//	private static val SynthesisOption SHOW_NOT = SynthesisOption::createCheckOption("Not-Gates", true);

	/** Show Tick */
	private static val SynthesisOption SHOW_TICK = SynthesisOption::createCheckOption("Tick Wires", false);

	/** Show Reset */
	private static val SynthesisOption SHOW_RESET = SynthesisOption::createCheckOption("Reset Wires", false);

	/** Show Circuit */
	private static val SynthesisOption SHOW_ALL_REGIONS = SynthesisOption::createCheckOption("Show Entire Circuit",
		false);
	
	/** DIAGRAM LAYOUT */
    private static val SynthesisOption LAYOUT = SynthesisOption::createChoiceOption("Node Placement",
        <String>newLinkedList("Brandes Koepf", "Linear Segments", "Network Simplex", "Simple" ), "Top-Down");	
	
	/**  
	 * Returns a list of KlighD visualization options. Called by KlighD.
	 * 
	 */
	override public getDisplayedSynthesisOptions() {
		return newLinkedList(
			SynthesisOption::createSeparator("Visibility"),
//			SHOW_ASSIGNMENT,
//			SHOW_NOT,
			SHOW_TICK,
			SHOW_RESET,
			SHOW_ALL_REGIONS,
			SynthesisOption::createSeparator("Layout"),
			LAYOUT
		)
	}

	override KNode transform(Actor model) {

		if (SHOW_ALL_REGIONS.booleanValue) {
			val root = createNode().associateWith(model);
			root.setLayoutOption(LayeredOptions.HIERARCHY_HANDLING, HierarchyHandling.INCLUDE_CHILDREN);
			model.transformActor(root);
			return root;
		} else {
			val logic = model.eAllContents.filter(Actor).filter[name == "Program Logic"].head
			val rootLogic = createNode().associateWith(logic)
			rootLogic.setLayoutOption(LayeredOptions.HIERARCHY_HANDLING, HierarchyHandling.INCLUDE_CHILDREN);
			logic.transformActor(rootLogic);
			return rootLogic;
			}
	}	

	// -------------------------------------------------------------------------
	// --                     Transform Actor to KNode                        --
	// -------------------------------------------------------------------------

	def void transformActor(Actor actor, KNode parent) {
		
		// draw KNode gates and attach them to parent
		val actorNode = actorSynthesis.transform(actor) 
		actorNode.associateWith(actor)
		parent.children += actorNode

		// check if actor is a gate or an inner circuit
		val Boolean atomicActor = actor.innerActors.empty

		// rendering for edges and ports of actor
        actorNode.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.layered");
		actorNode.setLayoutOption(LayeredOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);
		actorNode.setLayoutOption(LayeredOptions.PORT_LABELS_PLACEMENT, PortLabelPlacement.OUTSIDE);
		actorNode.setLayoutOption(LayeredOptions.SPACING_PORT_PORT, 20.0)
		actorNode.addLayoutParam(LayeredOptions.INSIDE_SELF_LOOPS_ACTIVATE, true);
		actorNode.setLayoutOption(LayeredOptions.DIRECTION, Direction.RIGHT);
				
		if(LAYOUT.objectValue == "Brandes Koepf"){ actorNode.addLayoutParam(LayeredOptions.NODE_PLACEMENT_STRATEGY, NodePlacementStrategy.BRANDES_KOEPF);}
		if(LAYOUT.objectValue == "Linear Segments"){ actorNode.addLayoutParam(LayeredOptions.NODE_PLACEMENT_STRATEGY, NodePlacementStrategy.LINEAR_SEGMENTS);}
		if(LAYOUT.objectValue == "Network Simplex"){ actorNode.addLayoutParam(LayeredOptions.NODE_PLACEMENT_STRATEGY, NodePlacementStrategy.NETWORK_SIMPLEX);}
		if(LAYOUT.objectValue == "Simple"){ actorNode.addLayoutParam(LayeredOptions.NODE_PLACEMENT_STRATEGY, NodePlacementStrategy.SIMPLE);}
		
		
		// ------------------------------------------------------------------------
		// --                     Add KPorts to KNode                            --
		// ------------------------------------------------------------------------
		//Layout options for ports
		
		
		for (port : actor.ports) {
			val kPort = port.port.associateWith(port)
			actorNode.ports += kPort => [
				it.associateWith(port)
				if (!atomicActor) {
				//TODO: FIX THIS _GO, g0 stuff...!
					if(port.name == "g0"){it.addInsidePortLabel("_GO", 8, KlighdConstants.DEFAULT_FONT_NAME)}//.associateWith(port)
					else{it.addInsidePortLabel(port.name, 8, KlighdConstants.DEFAULT_FONT_NAME)}//.associateWith(port)
				}
				
				// --------------------------------------------------------------
				// --   Input ports: are placed on the left side of actors     --
				// --------------------------------------------------------------
				if (port.type.startsWith("In")) {
					
					// ports for the tick function are marked with triangle 
					if (port.name == "Tick") { // /TODO: still not working ... place Tick ports at fixed position
						it.setPortSize(0, 0)
						it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.WEST)
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
					} 
					// all other input ports have no special design
					else {
						it.setPortSize(5, 2);
						it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.WEST)
						it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;
						it.setLayoutOption(LayeredOptions.PORT_BORDER_OFFSET, if(atomicActor) 0.0 else -3.0)
					}
					
					// "In_1" and "In_0" are MUX input ports. They have a specified order to ensure the flap in simulation working correctly.
					if (port.type == "In_1") {
						actorNode.setLayoutOption(LayeredOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_ORDER);
						it.setLayoutOption(LayeredOptions.PORT_INDEX, 1)
					} else if (port.type == "In_0") {
						actorNode.setLayoutOption(LayeredOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_ORDER);
						it.setLayoutOption(LayeredOptions.PORT_INDEX, 0)
					}

				} 
				// --------------------------------------------------------------
				// --  Output ports: are placed on the right side of actors    --
				// --------------------------------------------------------------
				else if (port.type.startsWith("Out")) {
					it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.EAST)
					it.setLayoutOption(LayeredOptions.PORT_BORDER_OFFSET, if(atomicActor) 0.0 else -3.0) 
					if (port.outgoingLinks.length == 0) {// mark unnecessary nodes in circuit...
						it.addEllipse.setBackground("red".color).lineWidth = 0; 
						it.setPortSize(6, 6);
					} else {
						it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;
						it.setPortSize(5, 2);
					}

				} 
				// --------------------------------------------------------------
				// --   Selection ports: are placed at the bottom of actors    --
				// --------------------------------------------------------------	
				else if (port.type.startsWith("Sel")) {
					it.setPortSize(2, 5);
					it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.SOUTH)
					it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;
					it.setLayoutOption(LayeredOptions.PORT_BORDER_OFFSET, if(atomicActor) 0.0 else -3.0)

				} 
				
//				else if (port.type.startsWith("Not")) {
//					if (actor.type == "NOT") {
//						it.setPortSize(5, 2);
//						it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.WEST)
//						it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;
//						it.setLayoutOption(LayeredOptions.OFFSET, if(atomicActor) 0f else -3f)
//					} else {
//						it.setLayoutOption(LayeredOptions.OFFSET, 0f);
//						it.setPortSize(6, 6);
//						it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.WEST)
//						it.addEllipse.setBackground("white".color).lineWidth = 1;
//					}
//
//				}
			]
		}

		// ------------------------------------------------------------------------
		// --              Create all inner actors of circuit                    --
		// ------------------------------------------------------------------------
		actor.innerActors.forEach [
			it.transformActor(actorNode);
		]

		// ------------------------------------------------------------------------
		// --              Create KEdges for Links                               --
		// ------------------------------------------------------------------------
		actor.innerLinks.forEach [ l |
			if ((SHOW_TICK.booleanValue) && (SHOW_RESET.booleanValue)) {
				createLink(l)
			} else if (!(SHOW_TICK.booleanValue) && !(SHOW_RESET.booleanValue)) {
				val s = l.source as Port
				if (!(s.name == "Tick") &&  !(s.name == "Reset_pre")) {
					createLink(l)
				}
			} else if (!SHOW_TICK.booleanValue) {
				val s = l.source as Port
				if (!(s.name == "Tick")) {
					createLink(l)
				}
			} else if (!SHOW_RESET.booleanValue) {
				val s = l.source as Port
				if (!(s.name == "Reset_pre")) {
					createLink(l)
				}
			}
		]
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
			it.addRoundedBendsPolyline(3,1).addJunctionPointDecorator;
			
			// this is necessary because otherwise ports are not placed correctly
			// e.g. A in ABO.. 
			if (it.sourcePort.node == it.targetPort.node) {
				it.addLayoutParam(LayeredOptions.INSIDE_SELF_LOOPS_ACTIVATE, true);
			}
			
			]

	}

}



