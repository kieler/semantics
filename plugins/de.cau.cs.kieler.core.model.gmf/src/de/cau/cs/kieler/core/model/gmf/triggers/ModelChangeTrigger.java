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
package de.cau.cs.kieler.core.model.gmf.triggers;

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
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;

import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.ITrigger;
import de.cau.cs.kieler.core.kivi.ITriggerState;
import de.cau.cs.kieler.core.model.GraphicalFrameworkService;
import de.cau.cs.kieler.core.model.IGraphicalFrameworkBridge;
import de.cau.cs.kieler.core.ui.UnsupportedPartException;
import de.cau.cs.kieler.core.ui.util.CombinedWorkbenchListener;
import de.cau.cs.kieler.core.ui.util.EditorUtils;

/**
 * A view management Trigger that registered as a ResourceSetChangeListener onto any active Diagram
 * editor. It provides TriggerStates about any model changes. There are two different nested states
 * available, one for the semantic model, one for the GMF notation model.
 * 
 * @author haf
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
        IEditorPart part = EditorUtils.getLastActiveEditor();
        currentEditor = part;
        if (isDiagram(part)) {
            getEditingDomain(currentEditor).addResourceSetListener(that);
        }
        trigger(new ActiveEditorState(part, part, null));
    }

    @Override
    public void unregister() {
        CombinedWorkbenchListener.removePartListener(this);
        // cmot: Fixed null pointer exception when trying to disable KIVi
        if (currentEditor != null) {
            TransactionalEditingDomain transactionalEditingDomain = getEditingDomain(currentEditor);
            if (transactionalEditingDomain != null) {
                transactionalEditingDomain.removeResourceSetListener(this);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partActivated(final IWorkbenchPart part) {
        if (!part.equals(currentEditor)) {
            currentEditor = part;
            if (isDiagram(part)) {
                getEditingDomain(currentEditor).addResourceSetListener(this);
            }
            trigger(new ActiveEditorState(currentEditor, currentEditor, null));
        }
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
            if (triggeredNotation && triggeredSemantic) {
                break;
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
     *            part to check
     * @return true if part is supported by the {@link GraphicalFrameworkService}
     */
    protected static boolean isDiagram(final IWorkbenchPart part) {
        try {
            EditPart ep = GraphicalFrameworkService.getInstance().getBridge(part).getEditPart(part);
            if (ep != null) {
                return true;
            }
        } catch (UnsupportedPartException e) {
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
        } catch (UnsupportedPartException e) {
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
            return event;
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
     * <p>
     * A state about the model viewers currently visible, e.g. the current active editor or active
     * view. It contains lists of all active {@link IWorkbenchPart}s and a list of all such parts
     * that contain a diagram, i.e. are compatible with the {@link GraphicalFrameworkService}. Note
     * that the parts can be either {@link IViewPart}s or {@link IEditorPart}s.
     * </p>
     * <p>
     * A scenario is to use the last opened editor or view of a specific kind. You can obtain the
     * lists of currently open parts or diagram parts by
     * {@link ActiveEditorState#getOpenWorkbenchParts()} resp.
     * {@link ActiveEditorState#getOpenDiagrams()}. As the lists are ordered by the order in which
     * the parts were activated (freshest part is the first), they can be iterated with choosing the
     * first part that matches the right ID, e.g. by comparing their string IDs with
     * {@link IWorkbenchPart#getSite()} and {@link IWorkbenchPartSite#getID()}. This ensures to (1)
     * avoid doing something on a not supported editor or view and (2) to also be able to do
     * something when some other editor or view is in the focus. Note that this might also do
     * something on an editor that is not on top, i.e. not actually visible.
     * </p>
     * 
     * <pre>
     *  String relevantID = "my.editor.id";
     *  IWorkbenchPart myPart = null;
     *  for(IWorkbenchPart part : activeEditorState.getOpenDiagrams()){
     *     if(relevantID.equals(part.getSite().getID()){
     *          myPart = part;
     *          break;
     *     }
     *  }
     *  if(myPart != null){
     *  ...
     *  }
     * </pre>
     * 
     * @author haf
     */
    public static class ActiveEditorState extends AbstractTriggerState {
        private IWorkbenchPart lastActiveEditor;
        private IWorkbenchPart lastActiveDiagramEditor;
        private IWorkbenchPart closedEditor;

        // only diagram editors/views
        private List<IWorkbenchPart> openDiagramEditors = new ArrayList<IWorkbenchPart>();
        // any view or editor
        private List<IWorkbenchPart> openWorkbenchParts = new ArrayList<IWorkbenchPart>();

        /** Default Constructor that can be used as a default state. */
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
            this.openWorkbenchParts.add(focused);
        }

        /**
         * Get the most recently opened editor or view. Maybe null if there is no such.
         * 
         * @return editor or view
         */
        public IWorkbenchPart getLastActiveWorkbenchPart() {
            return lastActiveEditor;
        }

        /**
         * Get the most recently opened editor or view that contains a diagram supported by the
         * {@link GraphicalFrameworkService}. Maybe null if there is no such.
         * 
         * @return the last active diagram editor or view
         */
        public IWorkbenchPart getLastActiveDiagram() {
            return lastActiveDiagramEditor;
        }

        /**
         * Get a list of all IWorkbenchParts (editors and views) that contain a diagram supported by
         * the {@link GraphicalFrameworkService}. The order in the list is starting with the last
         * activated part. It will include all currently active parts.
         * 
         * @return the open diagrams {@link IViewPart} or {@link IEditorPart}
         */
        public List<IWorkbenchPart> getOpenDiagrams() {
            return openDiagramEditors;
        }

        /**
         * Get a list of any active IWorkbenchParts. This may include views and editors. The order
         * in the list is starting with the last activated part. It will include all currently
         * active parts.
         * 
         * @return list of currently active IWorkbenchParts, i.e. {@link IViewPart} or
         *         {@link IEditorPart}
         */
        public List<IWorkbenchPart> getOpenWorkbenchParts() {
            return openWorkbenchParts;
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
         * Update the list of open diagram editors and views. {@inheritDoc}
         */
        @Override
        public void merge(final ITriggerState previous) {
            if (previous instanceof ActiveEditorState) {
                IWorkbenchPart lastOpenWorkbenchPart = null;
                if (!this.openWorkbenchParts.isEmpty()) {
                    lastOpenWorkbenchPart = this.openWorkbenchParts.get(0);
                }
                this.openDiagramEditors.addAll(((ActiveEditorState) previous).openDiagramEditors);
                this.openWorkbenchParts.addAll(((ActiveEditorState) previous).openWorkbenchParts);
                // remove any closed editor
                if (this.closedEditor != null) {
                    this.openDiagramEditors.remove(this.closedEditor);
                    this.openWorkbenchParts.remove(this.closedEditor);
                }
                // make sure the currently focused editor is the first in the list
                if (this.lastActiveDiagramEditor != null) {
                    // note that initially the editor might be in the list twice
                    this.openDiagramEditors.remove(lastActiveDiagramEditor);
                    this.openDiagramEditors.remove(lastActiveDiagramEditor);
                    this.openDiagramEditors.add(0, this.lastActiveDiagramEditor);
                }
                // make sure the currently focused view is the first in the list
                if (lastOpenWorkbenchPart != null) {
                    // note that initially the view might be in the list twice
                    this.openWorkbenchParts.remove(lastOpenWorkbenchPart);
                    this.openWorkbenchParts.remove(lastOpenWorkbenchPart);
                    this.openWorkbenchParts.add(0, lastOpenWorkbenchPart);
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
