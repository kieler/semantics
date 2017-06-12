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

import com.google.inject.Inject
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.Trigger
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import java.util.EnumSet
import org.eclipse.elk.alg.layered.properties.EdgeLabelSideSelection
import org.eclipse.elk.alg.layered.properties.LayeredOptions
import org.eclipse.elk.core.options.SizeConstraint

/**
 * @author fry
 * 
 * Synthesis for Actors in circuits. 
 * Actors are transformed to KNodes.
 * 
 */
class ActorSynthesis extends AbstractDiagramSynthesis<Actor> {
	
	// -------------------------------------------------------------------------
	// --      Injections for all selectable gates of the circuit             --
	// -------------------------------------------------------------------------
	@Inject
	AndActorSynthesis andActorSynthesis

	@Inject
	NotActorSynthesis notActorSynthesis

	@Inject
	OrActorSynthesis orActorSynthesis

	@Inject
	MuxActorSynthesis muxActorSynthesis

	@Inject
	RegisterActorSynthesis registerActorSynthesis

	@Inject
	FlipFlopActorSynthesis flipflopActorSynthesis
	
	// -------------------------------------------------------------------------
	// --                      Injections for KExtensions                     --
	// -------------------------------------------------------------------------
	/** Rendering factory used to instantiate KRendering instances. */
	val renderingFactory = KRenderingFactory::eINSTANCE
	@Inject extension KNodeExtensions
	@Inject extension KLabelExtensions
	@Inject extension KRenderingExtensions
	@Inject extension KColorExtensions
	extension KRenderingFactory = KRenderingFactory.eINSTANCE

	override KNode transform(Actor actor) {

		val atomicActor = !(actor.innerActors.toList.length > 0)
		val hasType = !(actor.type == null)
		val hasName = !(actor.name == null)

	// -------------------------------------------------------------------------
	// --                     Create KNode for Actor                          --
	// --    this can either be a gate(1) or a frame(2) for a region          --
	// -------------------------------------------------------------------------
		var KNode actorNode = actor.node;    //getNode, NICHT createNode()!
		if (hasName) {
				actorNode.addOutsideTopLeftNodeLabel(actor.name, KlighdConstants.DEFAULT_FONT_SIZE,
					KlighdConstants.DEFAULT_FONT_NAME);
		}
		// -------------------------------------------------
		// --             (1) Create circuit gates        --
		// -------------------------------------------------
		if (atomicActor) {
			if (!hasType) { // without a type no specified gate can be created.
				actorNode.addRoundedRectangle(4, 4, 2)
				actorNode.addLayoutParam(LayeredOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
			} else {
				//check for type and call synthesis for the gate
				switch (actor.type) {
					case "AND":
						actorNode = andActorSynthesis.draw(actor)
					case "OR": 
						actorNode = orActorSynthesis.draw(actor)
					case "NOT":
						actorNode = notActorSynthesis.draw(actor)
					case "REG":
						actorNode = registerActorSynthesis.draw(actor)
					case "MUX":
						actorNode = muxActorSynthesis.draw(actor)
					case "FF":
						actorNode = flipflopActorSynthesis.draw(actor)
					default: {
						actorNode.setNodeSize(2, 2);
						actorNode.addRectangle => [
							it.setBackground("white".color);
							it.selectionBackground = "red".color;
						]
						actorNode.addInsideBottomLeftNodeLabel(actor.type, KlighdConstants.DEFAULT_FONT_SIZE, KlighdConstants.DEFAULT_FONT_NAME)
						actorNode.addLayoutParam(LayeredOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
					}
				}
			}
		} 
		// -------------------------------------------------
		// --           (2) Create circuit regions        --
		// -------------------------------------------------
		else {
				// Add a rendering for the collapsed version of this region
				val collapsedRendering = createRegion(actorNode, actor)
				collapsedRendering.addAction(Trigger::DOUBLECLICK, KlighdConstants::ACTION_COLLAPSE_EXPAND)
				collapsedRendering.setAreaPlacementData(createKPosition(LEFT, 0, 0, TOP, 0, 0),createKPosition(LEFT, 80, 0, TOP, 50, 0));
				collapsedRendering.setBackgroundColor(100, 140, 200)
				collapsedRendering.setProperty(KlighdProperties::COLLAPSED_RENDERING, true)

				actorNode.data += collapsedRendering

				// Create the rendering for the expanded version of this region
				val expandedRendering = createRegion(actorNode, actor)
				expandedRendering.setProperty(KlighdProperties::EXPANDED_RENDERING, true)
				expandedRendering.setProperty(LayeredOptions.EDGE_LABEL_SIDE_SELECTION, EdgeLabelSideSelection.SMART)
				expandedRendering.setProperty(LayeredOptions.INSIDE_SELF_LOOPS_ACTIVATE, true);
				expandedRendering.addAction(Trigger::DOUBLECLICK, KlighdConstants::ACTION_COLLAPSE_EXPAND)
				expandedRendering.setProperty(LayeredOptions.NODE_SIZE_CONSTRAINTS, SizeConstraint.free)
				
				actorNode.data += expandedRendering
		}
		
		// default for initialization region	
		if (actor.name == "Circuit Initialization") {
			actorNode.setLayoutOption(KlighdProperties::EXPAND, false)
		}
		
		return actorNode;

	}
	
	// ------------------------------------------------------------------  
	// --           Create frames for gate groups expressing guards.   --  
	// --           Or create circuit region backgrounds               --
	// ------------------------------------------------------------------
	def createRegion(KNode actorNode, Actor actor) {	
		val darkBlue = createKColor.setColor(240, 247, 253);
		val red = createKColor.setColor(222, 100, 100);
		val frame = renderingFactory.createKRoundedRectangle() => [ rect |
			rect.lineWidth = 0
			if (actor.name.startsWith("g") && !actor.innerActors.empty) {
				rect.lineWidth = 1;
				rect.setForeground(red);
			} else {
				if(actor.eContainer != null ){
				rect.setBackground(darkBlue)} else {
					rect.lineWidth = 1;
					rect.setForeground = "black".color
				}
			}
		]
	return frame
	}
}