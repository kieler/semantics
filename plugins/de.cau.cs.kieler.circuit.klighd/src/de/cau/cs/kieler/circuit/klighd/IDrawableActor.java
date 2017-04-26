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
package de.cau.cs.kieler.circuit.klighd;


import de.cau.cs.kieler.circuit.Actor;
import de.cau.cs.kieler.klighd.kgraph.KNode;

/**
 * @author fry
 * 
 * Interface each gate of the actor needs to implement. 
 * The draw method holds design information for each specific gate.
 *
 * Note: for simulation mark highlightable parts of your shape with id = "highlightable"  
 */
public interface IDrawableActor  {

	public abstract KNode draw(Actor a);

}
