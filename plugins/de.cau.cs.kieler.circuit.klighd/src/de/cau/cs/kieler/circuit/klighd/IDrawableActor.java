package de.cau.cs.kieler.circuit.klighd;


import de.cau.cs.kieler.circuit.Actor;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis;


public interface IDrawableActor {

    
	public abstract KNode draw(Actor a);

}
