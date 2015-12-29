package de.cau.cs.kieler.circuit.klighd

import de.cau.cs.kieler.circuit.klighd.IDrawableActor
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.core.kgraph.KGraphElement
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions

class ActorSynthesis {
	@Inject
    AndActorSynthesis andActorSynthesis
    
    @Inject
    NotActorSynthesis notActorSynthesis
    
    @Inject
    OrActorSynthesis orActorSynthesis
    
    @Inject
    RegisterActorSynthesis registerActorSynthesis
	
    
	def KNode transform(Actor actor){
		var KNode result 
		
		
		switch(actor.type){
			case "AND" : result = andActorSynthesis.draw(actor)
			case "NOT" : result = notActorSynthesis.draw(actor)
			case "OR" : result = orActorSynthesis.draw(actor)
			case "R" : result = registerActorSynthesis.draw(actor)
			
		}
		
		return result;
		
		}
		
		
	
	
}