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
package de.cau.cs.kieler.core.model.trigger;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;

import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.ITrigger;
import de.cau.cs.kieler.core.ui.util.CombinedWorkbenchListener;
import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.core.ui.util.MonitoredOperation;

/**
 * A view management Trigger that registered as a ResourceSetChangeListener onto any active Diagram
 * editor. It provides TriggerStates about any model changes. There are two different nested states
 * available, one for the semantic model, one for the GMF notation model.
 * 
 * @author haf
 * 
 */
public class ModelChangeTrigger extends AbstractTrigger implements IPartListener,
        ResourceSetListener {

    private NotificationFilter notationFilter = (NotificationFilter
            .createNotifierTypeFilter(NotationPackage.eINSTANCE.getView())
            .or(NotificationFilter.createNotifierTypeFilter(NotationPackage.eINSTANCE.getStyle()))
            .or(NotificationFilter.createNotifierTypeFilter(NotationPackage.eINSTANCE
                    .getLayoutConstraint()))
            .or(NotificationFilter.createNotifierTypeFilter(NotationPackage.eINSTANCE.getAnchor()))
            .or(NotificationFilter.createNotifierTypeFilter(NotationPackage.eINSTANCE
                    .getBendpoints())).or(NotificationFilter
            .createNotifierTypeFilter(NotationPackage.eINSTANCE.getGuide())));

    private DiagramEditor currentEditor;

    @Override
    public void register() {
        CombinedWorkbenchListener.addPartListener(this);
        final ResourceSetListener that = this;
        // register with the active editor
        // else the initially open editor will not send events until the editor changes
        MonitoredOperation.runInUI(new Runnable() {
            public void run() {
                IEditorPart part = EditorUtils.getLastActiveEditor();
                if (part instanceof DiagramEditor) {
                    currentEditor = (DiagramEditor) part;
                    currentEditor.getEditingDomain().addResourceSetListener(that);
                }
            }
        }, false);
    }

    @Override
    public void unregister() {
        CombinedWorkbenchListener.removePartListener(this);
        if (currentEditor != null) {
            currentEditor.getEditingDomain().removeResourceSetListener(this);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partActivated(final IWorkbenchPart part) {
        if (part instanceof DiagramEditor) {
            currentEditor = (DiagramEditor) part;
            currentEditor.getEditingDomain().addResourceSetListener(this);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partDeactivated(final IWorkbenchPart part) {
        if (part instanceof DiagramEditor) {
            ((DiagramEditor) part).getEditingDomain().removeResourceSetListener(this);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partBroughtToTop(final IWorkbenchPart part) {
    }

    /**
     * {@inheritDoc}
     */
    public void partClosed(final IWorkbenchPart part) {
    }

    /**
     * {@inheritDoc}
     */
    public void partOpened(final IWorkbenchPart part) {
    }

    /**
     * No filter set here. Doing filtering in the resourceSetChanged method. {@inheritDoc}
     */
    public NotificationFilter getFilter() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public Command transactionAboutToCommit(final ResourceSetChangeEvent event)
            throws RollbackException {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public void resourceSetChanged(final ResourceSetChangeEvent event) {
        boolean triggeredNotation = false;
        boolean triggeredSemantic = false;
        for (Notification notification : event.getNotifications()) {
            if (!triggeredNotation && notationFilter.matches(notification)) {
                trigger(new DiagramChangeState(event, currentEditor));
                triggeredNotation = true;
            }
            if (!triggeredSemantic && notationFilter.negated().matches(notification)) {
                trigger(new ModelChangeState(event, currentEditor));
                triggeredSemantic = true;
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean isAggregatePrecommitListener() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isPrecommitOnly() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isPostcommitOnly() {
        return true;
    }

    /**
     * A state about changes of the semantic model.
     * 
     * @author haf
     */
    public static class ModelChangeState extends ChangeState {
        /**
         * Default constructor.
         */
        public ModelChangeState() {
            super(null, null);
        }

        /**
         * Create a new change state with the given event.
         * 
         * @param changeEvent
         *            the event that caused the change
         * @param editor
         *            the diagram editor where the change happened
         */
        public ModelChangeState(final ResourceSetChangeEvent changeEvent, final DiagramEditor editor) {
            super(changeEvent, editor);
        }
    }

    /**
     * A state about changes of the diagram model (currently only the GMF notation model).
     * 
     * @author haf
     */
    public static class DiagramChangeState extends ChangeState {
        /**
         * Default constructor.
         */
        public DiagramChangeState() {
            super(null, null);
        }

        /**
         * Create a new change state with the given event.
         * 
         * @param changeEvent
         *            the event that caused the change
         * @param editor
         *            the diagram editor where the change happened
         */
        public DiagramChangeState(final ResourceSetChangeEvent changeEvent,
                final DiagramEditor editor) {
            super(changeEvent, editor);
        }
    }

    /**
     * A state about changes of the a model.
     * 
     * @author haf
     */
    private abstract static class ChangeState extends AbstractTriggerState {

        private ResourceSetChangeEvent event = null;

        private DiagramEditor diagramEditor = null;

        /**
         * Create a new change state with the given event.
         * 
         * @param changeEvent
         *            the event that caused the change
         * @param editor
         *            the diagram editor where the change happened
         */
        public ChangeState(final ResourceSetChangeEvent changeEvent, final DiagramEditor editor) {
            event = changeEvent;
            diagramEditor = editor;
        }

        /**
         * {@inheritDoc}
         */
        public Class<? extends ITrigger> getTriggerClass() {
            return ModelChangeTrigger.class;
        }

        /**
         * Get the event that caused the change.
         * 
         * @return the event
         */
        public ResourceSetChangeEvent getChange() {
            if (event != null) {
                return event;
            } else {
                return null; // FIXME sane default value
            }
        }

        /**
         * Get the editor where the change happened.
         * 
         * @return the diagram editor
         */
        public DiagramEditor getDiagramEditor() {
            if (diagramEditor != null) {
                return diagramEditor;
            } else {
                return null; // FIXME sane default value
            }
        }
    }

}
