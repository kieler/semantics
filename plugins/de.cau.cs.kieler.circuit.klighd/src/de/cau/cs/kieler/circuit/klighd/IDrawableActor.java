package de.cau.cs.kieler.circuit.klighd;

import de.cau.cs.kieler.circuit.Actor;
import de.cau.cs.kieler.core.kgraph.KNode;

/**
 * 
 * Each gate of the circuit should have one draw method holding the design information.
 *  
 * Notice: for simulation mark highlightable parts of your shape with id = "highlightable"  
 */
public interface IDrawableActor  {

	public abstract KNode draw(Actor a);

}
