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
package de.cau.cs.kieler.synccharts.kivi;

import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.AbstractTrigger;

/**
 * This trigger is informed whenever the button for the signal flow visualization is pushed.
 * 
 * @author mmu
 * 
 */
public class SignalFlowTrigger extends AbstractTrigger {

    private static SignalFlowTrigger instance;

    /**
     * Default constructor.
     */
    public SignalFlowTrigger() {
        instance = this;
    }

    /**
     * Get the faux-singleton instance.
     * 
     * @return the instance
     */
    public static SignalFlowTrigger getInstance() {
        return instance;
    }

    @Override
    public void register() {
        // showing/hiding of the button is done by the SyncChartsEditorTester
    }

    @Override
    public void unregister() {
        // see above
    }

    /**
     * Called by the signal flow handler when the button is pressed.
     * 
     * @param p
     *            true if the button is in the pushed state
     */
    public void button(final boolean p) {
        trigger(new SignalFlowActiveState(p));
    }

    /**
     * Contains the state for the signal flow mechanism.
     * 
     * @author mmu
     * 
     */
    public static final class SignalFlowActiveState extends AbstractTriggerState {

        private boolean active = false;

        /**
         * Default constructor.
         */
        public SignalFlowActiveState() {

        }

        /**
         * Create a new signal flow state.
         * 
         * @param pushed
         *            true if the button is pushed
         */
        private SignalFlowActiveState(final boolean pushed) {
            active = pushed;
        }

        /**
         * {@inheritDoc}
         */
        public Class<?> getTriggerClass() {
            return SignalFlowTrigger.class;
        }

        /**
         * Check whether the signal flow mode is active.
         * 
         * @return true if active
         */
        public boolean isActive() {
            return active;
        }

    }
}
