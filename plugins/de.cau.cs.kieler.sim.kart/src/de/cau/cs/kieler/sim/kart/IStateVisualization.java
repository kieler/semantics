/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kart;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

/**
 * Interface for the State Visualization extension point.
 * This can be used to visualize invalid states in a diagram, e. g.
 * using the DiffStateCombination.
 * 
 * @author Sebastian Schäfer - ssc AT informatik.uni-kiel.de
 * @kieler.rating 2012-01-24 red
 */
public interface IStateVisualization {
    /**
     * Visually mark a set of states as invalid and another set as valid using a specific DiagramEditor.
     * 
     * @param isStates states that were produced by the simulation but are in fact wrong
     * @param shallStates states the simulation should have produced but has not
     * @param editor the diagram editor displaying the model this simulation is based on
     */
    public void visualize(List<EObject> isStates, List<EObject> shallStates, DiagramEditor editor);
}
