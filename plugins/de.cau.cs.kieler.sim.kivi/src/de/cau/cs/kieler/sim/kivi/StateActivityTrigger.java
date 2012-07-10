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

import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.ITrigger;

/**
 * A trigger notifying the view management about the active states during simulation.
 * 
 * @author mmu, cmot
 * 
 */
public class StateActivityTrigger extends AbstractTrigger {

    private static StateActivityTrigger instance;

    // ------------------------------------------------------------------------

    /**
     * Convenience method to get the current instance of this trigger.
     * 
     * @return instance of this trigger
     */
    public static StateActivityTrigger getInstance() {
        return instance;
    }

    // ------------------------------------------------------------------------

    /**
     * Give map of active states to the view management.
     *
     * @param aS map of active states
     * @param eS the e s
     * @param editor the diagram editor
     */
    public void step(final List<List<EObject>> aS, final List<List<EObject>> eS,
            final DiagramEditor editor) {
        trigger(new ActiveStates(aS, eS, editor));
    }

    // ------------------------------------------------------------------------

    /**
     * Give map of active states to the view management. Same as {@link #step(List, DiagramEditor)},
     * but the thread will block until all KiVi effects corresponding to this triggering have been
     * finished executing. So this can be used to create back pressure.
     *
     * @param aS the a s
     * @param eS map of error states
     * @param editor the diagram editor
     */
    public void synchronizedStep(final List<List<EObject>> aS, final List<List<EObject>> eS,
            final DiagramEditor editor) {
        try {
            synchronizedTrigger(new ActiveStates(aS, eS, editor));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // ------------------------------------------------------------------------

    @Override
    public void register() {
        instance = this;
    }

    // ------------------------------------------------------------------------

    @Override
    public void unregister() {
        instance = null;
    }

    // ------------------------------------------------------------------------

    /**
     * Contains the currently active states.
     * 
     * @author mmu
     * 
     */
    public static final class ActiveStates extends AbstractTriggerState {

        private List<List<EObject>> activeStates;

        private List<List<EObject>> errorStates;

        private DiagramEditor diagramEditor;

        // --------------------------------------------------------------------

        /**
         * Default Constructor.
         */
        public ActiveStates() {

        }

        // --------------------------------------------------------------------

        private ActiveStates(final List<List<EObject>> activeStates,
                final List<List<EObject>> errorStates, final DiagramEditor editor) {
            this.activeStates = activeStates;
            this.errorStates = errorStates;
            diagramEditor = editor;
        }

        // --------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public Class<? extends ITrigger> getTriggerClass() {
            return StateActivityTrigger.class;
        }

        // --------------------------------------------------------------------

        /**
         * Get the list of states that were erroneous in a specific step, i.e. a list of lists. The
         * outer list corresponds to the steps.
         * 
         * @return the list of lists of active states
         */
        public List<List<EObject>> getErrorStates() {
            if (errorStates != null) {
                return errorStates;
            } else {
                return new ArrayList<List<EObject>>();
            }
        }

        // --------------------------------------------------------------------

        /**
         * Get the list of states that were active in a specific step, i.e. a list of lists. The
         * outer list corresponds to the steps.
         * 
         * @return the list of lists of active states
         */
        public List<List<EObject>> getActiveStates() {
            if (activeStates != null) {
                return activeStates;
            } else {
                return new ArrayList<List<EObject>>();
            }
        }

        // --------------------------------------------------------------------

        /**
         * Get list of currently active states in this step.
         * 
         * @return list of active states
         */
        public List<EObject> getCurrentActiveStates() {
            List<List<EObject>> all = getActiveStates();
            if (!all.isEmpty()) {
                return all.get(0);
            } else {
                return new ArrayList<EObject>();
            }
        }

        // --------------------------------------------------------------------

        /**
         * Get list of currently error states in this step.
         * 
         * @return list of active states
         */
        public List<EObject> getCurrentErrorStates() {
            List<List<EObject>> all = getErrorStates();
            if (!all.isEmpty()) {
                return all.get(0);
            } else {
                return new ArrayList<EObject>();
            }
        }

        // --------------------------------------------------------------------

        /**
         * Get list of all states that are active or that have been active.
         * 
         * @return list of active and history states
         */
        public List<EObject> getHistoryStates() {
            List<List<EObject>> all = getActiveStates();
            List<EObject> history = Lists.newArrayList();
            for (List<EObject> list : all) {
                history.addAll(list);
            }
            return history;
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

    // --------------------------------------------------------------------
}
