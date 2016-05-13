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
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions

/**
 * @author fry
 * Synthesis for Register gates
 */
 
class RegisterActorSynthesis implements IDrawableActor {
	@Inject
	extension KNodeExtensions
	
	@Inject
	extension KRenderingExtensions

	@Inject
	extension KColorExtensions

	override draw(Actor actor) {
		val KNode node = actor.node

		node.setNodeSize(40, 40);

		node.addRectangle =>
			[

				
				if(actor.name.startsWith("pre")){
					it.setBackground("gray".color)
				} else { 
					it.setBackground("white".color);
				}
				it.selectionBackground = "green".color;
			]
	return node;
	}
}

				
//				node.addInsideBottomCenteredNodeLabel("R", KlighdConstants.DEFAULT_FONT_SIZE,
//					KlighdConstants.DEFAULT_FONT_NAME);
					
