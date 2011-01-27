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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;

import de.cau.cs.kieler.core.KielerNotSupportedException;
import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.ITrigger;
import de.cau.cs.kieler.core.kivi.ITriggerState;
import de.cau.cs.kieler.core.ui.GraphicalFrameworkService;
import de.cau.cs.kieler.core.ui.IGraphicalFrameworkBridge;
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

    private IWorkbenchPart currentEditor;

    @Override
    public void register() {
        CombinedWorkbenchListener.addPartListener(this);
        final ResourceSetListener that = this;
        // register with the active editor
        // else the initially open editor will not send events until the editor changes
        MonitoredOperation.runInUI(new Runnable() {
            public void run() {
                IEditorPart part = EditorUtils.getLastActiveEditor();
                if (isDiagram(part)) {
                    currentEditor = (DiagramEditor) part;
                    GraphicalFrameworkService.getInstance().getBridge(currentEditor)
                            .getEditingDomain(currentEditor);
                    getEditingDomain(currentEditor).addResourceSetListener(that);
                }
                trigger(new ActiveEditorState(part, part, null));
            }
        }, false);
    }

    @Override
    public void unregister() {
        CombinedWorkbenchListener.removePartListener(this);
        if (currentEditor != null) {
            getEditingDomain(currentEditor).removeResourceSetListener(this);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partActivated(final IWorkbenchPart part) {
        if (isDiagram(part)) {
            currentEditor = part;
            getEditingDomain(currentEditor).addResourceSetListener(this);
        }
        trigger(new ActiveEditorState(currentEditor, currentEditor, null));
    }

    /**
     * {@inheritDoc}
     */
    public void partDeactivated(final IWorkbenchPart part) {
        if (isDiagram(part)) {
            TransactionalEditingDomain domain = getEditingDomain(part);
            domain.removeResourceSetListener(this);
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
        trigger(new ActiveEditorState(null, null, part));
    }

    /**
     * {@inheritDoc}
     */
    public void partOpened(final IWorkbenchPart part) {
        trigger(new ActiveEditorState(null, part, null));
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
        boolean triggeredNotation = false;
        boolean triggeredSemantic = false;
        for (Notification notification : event.getNotifications()) {
            if (!triggeredNotation && notationFilter.matches(notification)) {
                triggeredNotation = true;
            }
            if (!triggeredSemantic && notationFilter.negated().matches(notification)) {
                triggeredSemantic = true;
            }
        }
        if (triggeredNotation) {
            trigger(new DiagramChangeState(event, currentEditor));
        }
        if (triggeredSemantic) {
            trigger(new ModelChangeState(event, currentEditor));
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public void resourceSetChanged(final ResourceSetChangeEvent event) {

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
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isPostcommitOnly() {
        return false;
    }

    /**
     * Test if the given WorkbenchPart (Editor/View) contains a Model supported by this Trigger.
     * Uses the GraphicalFrameworkService to test if there can be a root EditPart obtained.
     * 
     * @param part
     * @return
     */
    protected static boolean isDiagram(final IWorkbenchPart part) {
        try {
            EditPart ep = GraphicalFrameworkService.getInstance().getBridge(part).getEditPart(part);
            if (ep != null) {
                return true;
            }
        } catch (KielerNotSupportedException e) {
            /* nothing, fallthrough. */
        }
        return false;
    }

    /**
     * Get the EditingDomain to a model that is currently opened in the given WorkbenchPart.
     * 
     * @param part
     *            the given WorkbenchPart
     * @return the corresponding editing domain or null if not applicable
     */
    protected static TransactionalEditingDomain getEditingDomain(final IWorkbenchPart part) {
        try {
            EditPart ep = GraphicalFrameworkService.getInstance().getBridge(part).getEditPart(part);
            if (ep != null) {
                EditingDomain d = GraphicalFrameworkService.getInstance().getBridge(part)
                        .getEditingDomain(ep);
                if (d instanceof TransactionalEditingDomain) {
                    return (TransactionalEditingDomain) d;
                }
            }
        } catch (KielerNotSupportedException e) {
            /* nothing, fallthrough */
        }
        return null;
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
        public ModelChangeState(final ResourceSetChangeEvent changeEvent,
                final IWorkbenchPart editor) {
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
                final IWorkbenchPart editor) {
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

        private IWorkbenchPart diagramEditor = null;

        /**
         * Create a new change state with the given event.
         * 
         * @param changeEvent
         *            the event that caused the change
         * @param editor
         *            the diagram editor where the change happened
         */
        public ChangeState(final ResourceSetChangeEvent changeEvent, final IWorkbenchPart editor) {
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
         * @deprecated this only works for GMF editors. Use getWorkbenchPart instead
         * @return the diagram editor
         */
        public DiagramEditor getDiagramEditor() {
            if (diagramEditor != null && diagramEditor instanceof DiagramEditor) {
                return (DiagramEditor) diagramEditor;
            } else {
                return null; // FIXME sane default value
            }
        }

        /**
         * Get the WorkbenchPart (Editor/View) where the change happened. Could be a GMF Diagram
         * editor for example but might be different type for other Diagram frameworks.
         * 
         * @return the workbench part where the change happens
         */
        public IWorkbenchPart getWorkbenchPart() {
            return diagramEditor;
        }
    }

    /**
     * A state about the model viewers currently visible, e.g. the current active editor
     * 
     * @author haf
     */
    public static class ActiveEditorState extends AbstractTriggerState {
        private IWorkbenchPart lastActiveEditor;
        private IWorkbenchPart lastActiveDiagramEditor;
        private IWorkbenchPart closedEditor;

        private List<IWorkbenchPart> openDiagramEditors = new ArrayList<IWorkbenchPart>();

        /** Default Constructor that can be used as a default state */
        public ActiveEditorState() {
        }

        /**
         * Constructor.
         * 
         * @param focused
         *            an editor just focused
         * @param opened
         *            a newly opened editor
         * @param closed
         *            an editor just closed
         */
        public ActiveEditorState(final IWorkbenchPart focused, final IWorkbenchPart opened,
                final IWorkbenchPart closed) {
            this.lastActiveEditor = focused;
            this.closedEditor = closed;
            if (ModelChangeTrigger.isDiagram(focused)) {
                // now we know this is an editor with a diagram view of a model (e.g. GMF or
                // Graphiti)
                this.lastActiveDiagramEditor = focused;
                this.openDiagramEditors.add(focused);
            }
        }

        /**
         * @return the lastActiveEditor
         */
        public IWorkbenchPart getLastActiveEditor() {
            return lastActiveEditor;
        }

        /**
         * @return the lastActiveDiagramEditor
         */
        public IWorkbenchPart getLastActiveDiagramEditor() {
            return lastActiveDiagramEditor;
        }

        /**
         * @return the openDiagramEditors
         */
        public List<IWorkbenchPart> getOpenDiagramEditors() {
            return openDiagramEditors;
        }

        /**
         * Get the semantic model in shape of the root EObject that corresponds to the diagram or
         * other editor that was last active.
         * 
         * @return last active EObject model
         */
        public EObject getLastActiveSemanticModel() {
            try {
                IGraphicalFrameworkBridge bridge = GraphicalFrameworkService.getInstance()
                        .getBridge(lastActiveEditor);
                EditPart rootEditPart = bridge.getEditPart(lastActiveEditor);
                return bridge.getElement(rootEditPart);
            } catch (NullPointerException e) {
                return null;
            }
        }

        /**
         * Update the list of open diagram editors. {@inheritDoc}
         */
        @Override
        public void merge(ITriggerState previous) {
            if (previous instanceof ActiveEditorState) {
                this.openDiagramEditors.addAll(((ActiveEditorState) previous).openDiagramEditors);
                // remove any closed editor
                if (this.closedEditor != null) {
                    this.openDiagramEditors.remove(this.closedEditor);
                }
                // make sure the currently focused editor is the first in the list
                if (this.lastActiveDiagramEditor != null) {
                    // note that initially the editor might be in the list twice
                    this.openDiagramEditors.remove(lastActiveDiagramEditor);
                    this.openDiagramEditors.remove(lastActiveDiagramEditor);
                    this.openDiagramEditors.add(0, this.lastActiveDiagramEditor);
                }
            }
        }

        /**
         * {@inheritDoc}
         */
        public Class<? extends ITrigger> getTriggerClass() {
            return ModelChangeTrigger.class;
        }
    }

}
