/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kivi;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;

/**
 * A trigger notifying the view management about the active states during simulation.
 * 
 * @author mmu
 * 
 */
public class StateActivityTrigger extends AbstractTrigger {

    private static StateActivityTrigger instance;

    /**
     * Default constructor.
     */
    public StateActivityTrigger() {
        instance = this;
    }

    /**
     * Convenience method to get the current instance of this trigger.
     * 
     * @return instance of this trigger
     */
    public static StateActivityTrigger getInstance() {
        return instance;
    }

    /**
     * Give map of active states to the view management.
     * 
     * @param aS
     *            map of active states
     * @param editor
     *            the diagram editor
     */
    public void step(final List<List<EObject>> aS, final DiagramEditor editor) {
        trigger(new ActiveStates(aS, editor));
    }

    @Override
    public void register() {
    }

    @Override
    public void unregister() {
    }

    /**
     * Contains the currently active states.
     * 
     * @author mmu
     * 
     */
    public static final class ActiveStates extends AbstractTriggerState {

        private List<List<EObject>> activeStates;

        private DiagramEditor diagramEditor;

        /**
         * Default Constructor.
         */
        public ActiveStates() {

        }

        private ActiveStates(final List<List<EObject>> states, final DiagramEditor editor) {
            activeStates = states;
            diagramEditor = editor;
        }

        /**
         * {@inheritDoc}
         */
        public Class<?> getTriggerClass() {
            return StateActivityTrigger.class;
        }

        /**
         * Get the list of active states.
         * 
         * @return the list of active states
         */
        public List<List<EObject>> getActiveStates() {
            if (activeStates != null) {
                return activeStates;
            } else {
                return new ArrayList<List<EObject>>();
            }
        }

        /**
         * Get the diagram editor where the simulation is running.
         * 
         * @return the diagram editor
         */
        public DiagramEditor getDiagramEditor() {
            // no useful default value
            return diagramEditor;
        }

    }

}
