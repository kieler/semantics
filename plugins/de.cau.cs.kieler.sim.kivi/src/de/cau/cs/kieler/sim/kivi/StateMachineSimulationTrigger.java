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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.ITrigger;

/**
 * A trigger notifying the view management about the internal model states and
 * simulation state during simulation.
 * 
 * @author haf
 * 
 */
public class StateMachineSimulationTrigger extends AbstractTrigger {

    private static StateMachineSimulationTrigger instance;

    private StateMachineSimulationState lastState;
    
    /**
     * Convenience method to get the current instance of this trigger.
     * 
     * @return instance of this trigger
     */
    public static StateMachineSimulationTrigger getInstance() {
        return instance;
    }

    /**
     * Give map of active states to the view management.
     * 
     * @param activeStates
     *            map of active states
     * @param editor
     *            the diagram editor
     */
    public void commitStep(final DiagramEditor editor) {
        if(lastState != null){
            trigger(lastState);
        }
        
    }
    
    public StateMachineSimulationState getCurrentSimulationState(final DiagramEditor editor,boolean createNew){
        if(createNew){
            lastState = new StateMachineSimulationState(true,editor);
        }
        return lastState;
    }
    
    public void stopSimulationState(final DiagramEditor editor){
        trigger(new StateMachineSimulationState(false,editor));
    }
    
    @Override
    public void register() {
        instance = this;
    }

    @Override
    public void unregister() {
        instance = null;
    }

    /**
     * A TriggerState for a KIEM simulation of a State Machine, e.g. a SyncChart. It
     * contains categorized lists of objects that are semantically relevant in a 
     * simulation step. These are for example the active states, transitions that have been
     * taken in that step, signals that are present and values of signals and variables.
     */
    public static final class StateMachineSimulationState extends AbstractTriggerState {

        List<EObject> activeStates;
        List<EObject> takenTransitions;
        List<EObject> presentSignals;
        List<Object>  signalValues;
        List<Object>  variableValues;
        
        private boolean isSimulating = false;

        private DiagramEditor diagramEditor;

        public StateMachineSimulationState(boolean isSimulating,DiagramEditor editor) {
            this.isSimulating = isSimulating;
            this.diagramEditor = editor;
        }

        public List<EObject> getActiveStates(int stepsAgo){
            if(activeStates == null){
                activeStates = new ArrayList<EObject>();
            }
            return activeStates;
        }
        
        
        
        
        
        /**
         * Default Constructor.
         */
        public StateMachineSimulationState() {

        }

        /**
         * {@inheritDoc}
         */
        public Class<? extends ITrigger> getTriggerClass() {
            return StateMachineSimulationTrigger.class;
        }

        /**
         * Get the list of active states.
         * 
         * @return the list of active states
         */
        public boolean isSimulating() {
            return isSimulating;
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
