/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.ksbase.gmf.kivi;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.ITrigger;
import de.cau.cs.kieler.ksbase.ui.TransformationUIManager;
import de.cau.cs.kieler.ksbase.ui.listener.ITransformationEventListener;
import de.cau.cs.kieler.ksbase.ui.utils.TransformationUtils;

/**
 * A Trigger that listens to KSBasE transformations.
 * 
 * @author mmu
 * 
 */
public class KSBasETrigger extends AbstractTrigger implements ITransformationEventListener {

    @Override
    public void register() {
        TransformationUIManager.INSTANCE.addTransformationListener(this);
    }

    @Override
    public void unregister() {
        TransformationUIManager.INSTANCE.removeTransformationListener(this);
    }

    /**
     * {@inheritDoc}
     */
    public void transformationExecuted(final Object[] args) {
        // post-transformation arguments are [EObject, EditorPart]
        if (args.length == 2 && args[0] instanceof EObject && args[1] instanceof DiagramEditor) {
            EObject eObject = TransformationUtils.getPostTransformationSelection();
            if (eObject == null) {
                eObject = (EObject) args[0];
            }
            trigger(new KSBasEState(eObject, (DiagramEditor) args[1]));
        }
    }

    /**
     * {@inheritDoc}
     */
    public void transformationAboutToExecute(final Object[] args) {
        // pre-transformation is ignored
    }

    /**
     * Contains the state of the KSBasE trigger: The selected EObject after the transformation and
     * its DiagramEditor.
     * 
     * @author mmu
     * 
     */
    public static final class KSBasEState extends AbstractTriggerState {

        private EObject newObject;

        private DiagramEditor diagramEditor;

        /**
         * Default constructor.
         */
        public KSBasEState() {

        }

        private KSBasEState(final EObject object, final DiagramEditor editor) {
            newObject = object;
            diagramEditor = editor;
        }

        /**
         * Get the EObject selected after the transformation.
         * 
         * @return the EObject
         */
        public EObject getEObject() {
            return newObject;
        }

        /**
         * Get the DiagramEditor where the transformation happened.
         * 
         * @return the diagram editor
         */
        public DiagramEditor getDiagramEditor() {
            return diagramEditor;
        }

        /**
         * {@inheritDoc}
         */
        public Class<? extends ITrigger> getTriggerClass() {
            return KSBasETrigger.class;
        }
    }

}
