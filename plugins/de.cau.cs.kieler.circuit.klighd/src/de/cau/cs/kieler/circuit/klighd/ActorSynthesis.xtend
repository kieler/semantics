package de.cau.cs.kieler.circuit.klighd

import com.google.inject.Inject
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.SizeConstraint
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import java.util.EnumSet
import de.cau.cs.kieler.core.krendering.LineJoin

class ActorSynthesis extends AbstractDiagramSynthesis<Actor> {
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
	extension KColorExtensions

	@Inject extension KNodeExtensions
	@Inject extension KLabelExtensions
	@Inject extension KRenderingExtensions

	extension KRenderingFactory = KRenderingFactory.eINSTANCE

	override KNode transform(Actor actor) {

		val Boolean atomicActor = !(actor.innerActors.toList.length > 0)
		val hasType = !(actor.type == null)
		val hasName = !(actor.name == null)
		
		//create KNode for actor
		var actorNode = actor.node; // ///getNode nicht createNode()
		
		// if actor is a gate create it. otherwise draw a simple frame.
		if (atomicActor) {
			if (!hasType) {
				actorNode.addRoundedRectangle(4, 4, 2)
				actorNode.addLayoutParam(LayoutOptions.SIZE_CONSTRAINT,
					EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
			} else {
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
					default: {

						actorNode.setNodeSize(2, 2);

						actorNode.addRectangle => [

							it.shadow = "black".color
							it.selectionBackground = "blue".color;
							it.setBackground("white".color);
						]
						actorNode.addInsideBottomLeftNodeLabel(actor.type, KlighdConstants.DEFAULT_FONT_SIZE,
							KlighdConstants.DEFAULT_FONT_NAME)
						actorNode.addLayoutParam(LayoutOptions.SIZE_CONSTRAINT,
							EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
					}
				}

			}
		} else {
			// if actor is not a gate, draw a frame
			val lightGrey = createKColor.setColor(224, 216, 206);
			val orange = createKColor.setColor(209, 156, 100);
			if (actor.eContainer != null) {
			
				actorNode.addRoundedRectangle(4, 4, 1) => [
					
					it.addDoubleClickAction(KlighdConstants.ACTION_COLLAPSE_EXPAND);
					it.shadow = "black".color
					it.selectionBackground = orange;
					it.setBackground(lightGrey);
				]
			}

			actorNode.addLayoutParam(LayoutOptions.SIZE_CONSTRAINT,
				EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
		}

		if (hasName) {
			actorNode.addOutsideBottomLeftNodeLabel(actor.name, KlighdConstants.DEFAULT_FONT_SIZE,
				KlighdConstants.DEFAULT_FONT_NAME);
		}


		return actorNode;

	}
}