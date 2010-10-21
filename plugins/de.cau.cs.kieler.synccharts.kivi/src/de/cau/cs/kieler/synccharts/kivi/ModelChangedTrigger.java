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
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.core.expressions.ExpressionsPackage;
import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.ITrigger;
import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.core.ui.util.MonitoredOperation;
import de.cau.cs.kieler.core.util.Maybe;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.listener.FireOnceTriggerListener;

/**
 * Listen to various types of model changes that require automatic layout.
 * 
 * @author mmu
 * 
 */
public class ModelChangedTrigger extends AbstractTrigger {

    private static ModelChangedTrigger instance;

    private static ModelChangedTrigger getInstance() {
        return instance;
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
     * Always listens to various model changed events. Could use some mechanism of dynamically
     * registering/unregistering trigger listeners.
     * 
     * @author mmu
     * 
     */
    public static class ModelChangedTriggerListener extends FireOnceTriggerListener {

        /**
         * Only listen to the following notifications.
         */
        public ModelChangedTriggerListener() {
            super(NotificationFilter
                    .createFeatureFilter(SyncchartsPackage.eINSTANCE.getScope_Label())
                    .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                            .getAction_Label()))
                    .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                            .getScope_SuspensionTrigger()))
                    .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                            .getScope_BodyText()))
                    .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                            .getScope_InnerActions()))
                    .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                            .getScope_ExitActions()))
                    .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                            .getScope_EntryActions()))
                    .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                            .getState_Regions()))
                    .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                            .getState_OutgoingTransitions()))
                    .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                            .getState_IncomingTransitions()))
                    .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                            .getRegion_States()))
                    .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                            .getScope_Signals()))
                    .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                            .getScope_Variables()))
                    .or(NotificationFilter.createFeatureFilter(ExpressionsPackage.eINSTANCE
                            .getValuedObject_Name()))
                    .or(NotificationFilter.createFeatureFilter(NotationPackage.eINSTANCE
                            .getDrawerStyle_Collapsed())));
        }

        @Override
        public Command transactionAboutToCommit(final ResourceSetChangeEvent event)
                throws RollbackException {
            EObject eObject = null;

            for (Notification notification : event.getNotifications()) {
                if (getFilter().matches(notification)
                        && notification.getNotifier() instanceof EObject) {
                    // avoid pointless layouts due to non-changing notifications
                    // ie label cleanups while loading the diagram
                    if (notification.getNewValue() != notification.getOldValue()
                            && (notification.getOldValue() == null || !notification.getOldValue()
                                    .equals(notification.getNewValue()))) {
                        eObject = (EObject) notification.getNotifier();
                        break;
                    }
                }
            }

            if (eObject != null) {
                if (getInstance() != null) {
                    // FIXME is there some way of finding out where the notification came from?
                    // FIXME this throws PartInitExceptions when loading a SyncCharts diagram
                    final Maybe<IEditorPart> maybe = new Maybe<IEditorPart>();
                    MonitoredOperation.runInUI(new Runnable() {
                        public void run() {
                            maybe.set(EditorUtils.getLastActiveEditor());
                        }
                    }, true);
                    if (maybe.get() instanceof DiagramEditor) {
                        getInstance().trigger(
                                new ModelChangedState((DiagramEditor) maybe.get(), eObject));
                    }
                }
            }

            return super.transactionAboutToCommit(event);
        }

        @Override
        protected Command trigger(final TransactionalEditingDomain domain,
                final Notification notification) {
            return null;
        }
    }

    /**
     * Contains the last EObject that was modified and the DiagramEditor where the change happened.
     * 
     * @author mmu
     * 
     */
    public static class ModelChangedState extends AbstractTriggerState {

        private EObject eObject;

        private DiagramEditor diagramEditor;

        /**
         * Default constructor.
         */
        public ModelChangedState() {
        }

        /**
         * Create a new model changed state for the given EObject in the given DiagramEditor.
         * 
         * @param editor
         *            the DiagramEditor
         * @param object
         *            the EObject
         */
        public ModelChangedState(final DiagramEditor editor, final EObject object) {
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
            return ModelChangedTrigger.class;
        }

    }

}
