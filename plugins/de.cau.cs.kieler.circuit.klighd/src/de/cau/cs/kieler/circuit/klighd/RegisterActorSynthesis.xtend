package de.cau.cs.kieler.circuit.klighd

import com.google.inject.Inject
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.KlighdConstants

class RegisterActorSynthesis implements IDrawableActor  {
	@Inject
    extension KNodeExtensions
	@Inject extension KLabelExtensions
    
    
    
    
	
	override draw(Actor actor) {
		val KNode regNode = actor.node;
		
		regNode.setNodeSize(40, 40);
		regNode.addInsideBottomCenteredNodeLabel("R", KlighdConstants.DEFAULT_FONT_SIZE,
				KlighdConstants.DEFAULT_FONT_NAME);

		
		return regNode;
	}
	
}