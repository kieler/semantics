/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.gmf.triggers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.ITrigger;

/**
 * Provides a Trigger to KIVi to visualize validation errors in the form of a "graphical difff".
 * This trigger contains an "original" EObject and a "new" EObject. Both of them will be colorized
 * in the diagram.
 * 
 * @author ssc
 */
public class DiffStateTrigger extends AbstractTrigger {
    
    /** The shared instance. */
    private static DiffStateTrigger instance;

    /**
     * Convenience method to get the current instance of this trigger.
     * 
     * @return instance of this trigger
     */
    public static DiffStateTrigger getInstance() {
        return instance;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void register() {
        instance = this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void unregister() {
        instance = null;
    }

    /**
     * Give original and new objects to the view management.
     * 
     * @param is
     *            the new object
     * @param shall
     *            the original object
     * @param editor
     *            the diagram editor
     */
    public void step(final List<EObject> is, final List<EObject> shall, final DiagramEditor editor) {
        trigger(new DiffStates(is, shall, editor));
    }

    /**
     * Give original and new objects to the view management. Same as
     * {@link #step(List, List, DiagramEditor)}, but the thread will block until all KiVi effects
     * corresponding to this triggering have been finished executing. So this can be used to create
     * back pressure.
     * 
     * @param is
     *            the new object
     * @param shall
     *            the original object
     * @param editor
     *            the diagram editor
     */
    public void synchronizedStep(final List<EObject> is, final List<EObject> shall,
            final DiagramEditor editor) {
        try {
            synchronizedTrigger(new DiffStates(is, shall, editor));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Diff states class.
     */
    public static class DiffStates extends AbstractTriggerState {
        
        /** List of the actually currently active states. */
        private List<EObject> isStates;

        /** List of the states that should be active in the current step. */
        private List<EObject> shallStates;

        /** The editor in which the states shall be colorized. */
        private DiagramEditor diagramEditor;

        /**
         * Constructor.
         */
        public DiffStates() {
            super();
        }
        
        /**
         * Constructor.
         * 
         * @param is the is state
         * @param shall the shall state
         * @param editor the editor
         */
        public DiffStates(final List<EObject> is, final List<EObject> shall,
                final DiagramEditor editor) {
            isStates = is;
            shallStates = shall;
            diagramEditor = editor;
        }

        /**
         * {@inheritDoc}
         */
        public Class<? extends ITrigger> getTriggerClass() {
            return DiffStateTrigger.class;
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

        /**
         * Return the is states.
         * 
         * @return the is states
         */
        public List<EObject> getIsStates() {
            if (isStates != null) {
                return isStates;
            } else {
                return new ArrayList<EObject>();
            }
        }

        /**
         * Return the shall states.
         * 
         * @return the shall states
         */
        public List<EObject> getShallStates() {
            if (shallStates != null) {
                return shallStates;
            } else {
                return new ArrayList<EObject>();
            }
        }
    }
}
