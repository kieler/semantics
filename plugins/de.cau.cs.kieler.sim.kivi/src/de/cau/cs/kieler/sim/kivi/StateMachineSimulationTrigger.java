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
import de.cau.cs.kieler.core.kivi.ITrigger;

/**
 * A trigger notifying the view management about the internal model states and simulation state
 * during simulation.
 * 
 * @author haf, cmot
 * 
 */
public class StateMachineSimulationTrigger extends AbstractTrigger {

    /** The instance. */
    private static StateMachineSimulationTrigger instance;

    /** The last state. */
    private StateMachineSimulationState lastState;

    // ------------------------------------------------------------------------

    /**
     * Convenience method to get the current instance of this trigger.
     * 
     * @return instance of this trigger
     */
    public static StateMachineSimulationTrigger getInstance() {
        return instance;
    }

    // ------------------------------------------------------------------------

    /**
     * Give map of active states to the view management.
     * 
     * @param editor
     *            the diagram editor
     */
    public void commitStep(final DiagramEditor editor) {
        if (lastState != null) {
            trigger(lastState);
        }

    }

    // ------------------------------------------------------------------------

    /**
     * Gets the current simulation state.
     * 
     * @param editor
     *            the editor
     * @param createNew
     *            the create new
     * @return the current simulation state
     */
    public StateMachineSimulationState getCurrentSimulationState(final DiagramEditor editor,
            final boolean createNew) {
        if (createNew) {
            lastState = new StateMachineSimulationState(true, editor);
        }
        return lastState;
    }

    // ------------------------------------------------------------------------

    /**
     * Stop simulation state.
     * 
     * @param editor
     *            the editor
     */
    public void stopSimulationState(final DiagramEditor editor) {
        trigger(new StateMachineSimulationState(false, editor));
    }

    // ------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void register() {
        instance = this;
    }

    // ------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void unregister() {
        instance = null;
    }

    // ------------------------------------------------------------------------

    /**
     * A TriggerState for a KIEM simulation of a State Machine, e.g. a SyncChart. It contains
     * categorized lists of objects that are semantically relevant in a simulation step. These are
     * for example the active states, transitions that have been taken in that step, signals that
     * are present and values of signals and variables.
     */
    public static final class StateMachineSimulationState extends AbstractTriggerState {

        /** The active states. */
        private List<EObject> activeStates;

// cmot: yet unused member variables        
//        /** The taken transitions. */
//        private List<EObject> takenTransitions;
//
//        /** The present signals. */
//        private List<EObject> presentSignals;
//
//        /** The signal values. */
//        private List<Object> signalValues;
//
//        /** The variable values. */
//        private List<Object> variableValues;

        /** The is simulating. */
        private boolean isSimulating = false;

        /** The diagram editor. */
        private DiagramEditor diagramEditor;

        // --------------------------------------------------------------------

        /**
         * Instantiates a new state machine simulation state.
         * 
         * @param isSimulating
         *            the is simulating
         * @param editor
         *            the editor
         */
        public StateMachineSimulationState(final boolean isSimulating, final DiagramEditor editor) {
            this.isSimulating = isSimulating;
            this.diagramEditor = editor;
        }

        // --------------------------------------------------------------------

        /**
         * Gets the active states.
         * 
         * @param stepsAgo
         *            the steps ago
         * @return the active states
         */
        public List<EObject> getActiveStates(final int stepsAgo) {
            if (activeStates == null) {
                activeStates = new ArrayList<EObject>();
            }
            return activeStates;
        }

        // --------------------------------------------------------------------

        /**
         * Default Constructor.
         */
        public StateMachineSimulationState() {

        }

        // --------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public Class<? extends ITrigger> getTriggerClass() {
            return StateMachineSimulationTrigger.class;
        }

        // --------------------------------------------------------------------

        /**
         * Get the list of active states.
         * 
         * @return the list of active states
         */
        public boolean isSimulating() {
            return isSimulating;
        }

        // --------------------------------------------------------------------

        /**
         * Get the diagram editor where the simulation is running.
         * 
         * @return the diagram editor
         */
        public DiagramEditor getDiagramEditor() {
            // no useful default value
            return diagramEditor;
        }

        // --------------------------------------------------------------------
    }

    // ---------------------------------------------------------------------------
}
