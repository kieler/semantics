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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.ITrigger;
import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.listener.FireOnceTriggerListener;

/**
 * Listen to scope and action labels changing.
 * 
 * @author mmu
 * 
 */
public class LabelChangedTrigger extends AbstractTrigger {

    private static LabelChangedTrigger instance;

    private static LabelChangedTrigger getInstance() {
        return instance;
    }

    /**
     * Default constructor.
     */
    public LabelChangedTrigger() {
        instance = this;
    }

    @Override
    public void register() {
    }

    @Override
    public void unregister() {
    }

    /**
     * Always listens to label changed events. Could use some mechanism of dynamically
     * registerung/unregistering trigger listeners.
     * 
     * @author mmu
     * 
     */
    public static class LabelChangedTriggerListener extends FireOnceTriggerListener {

        /**
         * Only listen to notifications for scope labels and action labels.
         */
        public LabelChangedTriggerListener() {
            super(NotificationFilter.createFeatureFilter(
                    SyncchartsPackage.eINSTANCE.getScope_Label()).or(
                    NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                            .getAction_Label())));
        }

        @Override
        protected Command trigger(final TransactionalEditingDomain domain,
                final Notification notification) {
            Object notifier = notification.getNotifier();
            if (notifier instanceof EObject) {
                if (getInstance() != null) {
                    // FIXME is there some way of finding out where the notification came from?
                    IEditorPart editor = EditorUtils.getLastActiveEditor();
                    if (editor instanceof DiagramEditor) {
                        getInstance().trigger(
                                new LabelChangedState((DiagramEditor) editor, (EObject) notifier));
                    }
                }
            }
            return null;
        }
    }

    /**
     * Contains the last EObject that had its label changed and the DiagramEditor where the change
     * happened.
     * 
     * @author mmu
     * 
     */
    public static class LabelChangedState extends AbstractTriggerState {

        private EObject eObject;

        private DiagramEditor diagramEditor;

        /**
         * Default constructor.
         */
        public LabelChangedState() {
        }

        /**
         * Create a new label changed state for the given EObject in the given DiagramEditor.
         * 
         * @param editor
         *            the DiagramEditor
         * @param object
         *            the EObject
         */
        public LabelChangedState(final DiagramEditor editor, final EObject object) {
            diagramEditor = editor;
            eObject = object;
        }

        /**
         * Get the EObject that changed.
         * 
         * @return the EObject
         */
        public EObject getEObject() {
            return eObject;
        }

        /**
         * Get the DiagramEditor that contains the change.
         * 
         * @return the DiagramEditor
         */
        public DiagramEditor getDiagramEditor() {
            return diagramEditor;
        }

        /**
         * {@inheritDoc}
         */
        public Class<? extends ITrigger> getTriggerClass() {
            return LabelChangedTrigger.class;
        }

    }

}
