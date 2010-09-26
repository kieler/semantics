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
package de.cau.cs.kieler.esterel.transformation.kivi;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;

/**
 * @author uru
 * 
 */
public class TransformationTrigger extends AbstractTrigger {

    private static TransformationTrigger instance;

    public TransformationTrigger() {
        instance = this;
    }

    public static TransformationTrigger getInstance() {
        return instance;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void register() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void unregister() {
    }

    /**
     * performs autolayout.
     * 
     * @param element
     *            root element for which to apply the layout
     * @param editor
     *            current editor
     */
    public void step(final EObject element, final DiagramEditor editor) {
        trigger(new TransformingState(element, editor));
    }

    /**
     * Contains the transforming state.
     * 
     * @author uru
     * 
     */
    public static final class TransformingState extends AbstractTriggerState {

        private EObject rootState;

        private DiagramEditor diagramEditor;

        /**
         * Default Constructor.
         */
        public TransformingState() {

        }

        private TransformingState(final EObject state, final DiagramEditor editor) {
            rootState = state;
            diagramEditor = editor;
        }

        /**
         * {@inheritDoc}
         */
        public Class<?> getTriggerClass() {
            return TransformationTrigger.class;
        }

        /**
         * @return the rootState
         */
        public EObject getRootState() {
            return rootState;
        }

        /**
         * Get the diagram editor where the transformation is running.
         * 
         * @return the diagram editor
         */
        public DiagramEditor getDiagramEditor() {
            return diagramEditor;
        }

    }
}
