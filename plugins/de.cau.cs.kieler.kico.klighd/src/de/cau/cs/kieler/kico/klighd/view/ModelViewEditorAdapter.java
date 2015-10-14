/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.view;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.UIJob;

/**
 * Listens to the workspace and manages the editor for the associated {@link ModelView}.
 * 
 * @author als
 * @kieler.design 2015-09-29 proposed
 * @kieler.rating 2015-09-29 proposed yellow
 * 
 */
class ModelViewEditorAdapter implements IPartListener2 {

    private static final String INIT_JOB_NAME = "Initializing " + ModelView.VIEW_TITLE + " View";
    /** The related model view. */
    private final ModelView modelView;

    /**
     * Create a new listener handling events for the given {@link ModelView}.
     * <p>
     *
     * The model view must be already created because the adapter will register itself immediately
     * on the views page.
     * 
     * @param modelView
     *            The associated ModelView
     */
    ModelViewEditorAdapter(final ModelView modelView) {
        this.modelView = modelView;
    }
    
    /**
     * Activated this adapter.
     */
    public void activate() {
        modelView.getSite().getPage().addPartListener(this);
    }
    
    /**
     * Deactivated this adapter.
     */
    public void deactivate() {
        modelView.getSite().getPage().removePartListener(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void partOpened(final IWorkbenchPartReference partRef) {
        IWorkbenchPart part = partRef.getPart(false);
        // Initialize primary view with current active editor
        if (part != null && part == modelView) {
            if (modelView.isLinkedWithActiveEditor()) {
                // update to active editor (delayed to prevent klighd init errors)
                new UIJob(INIT_JOB_NAME) {

                    @Override
                    public IStatus runInUIThread(final IProgressMonitor monitor) {
                        modelView.setEditor(modelView.getSite().getPage().getActiveEditor());
                        return Status.OK_STATUS;
                    }
                }.schedule(2);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void partClosed(final IWorkbenchPartReference partRef) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void partActivated(final IWorkbenchPartReference partRef) {
        IWorkbenchPart part = partRef.getPart(false);
        if (modelView.isLinkedWithActiveEditor() && part instanceof IEditorPart) {
            modelView.setEditor((IEditorPart) part);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void partBroughtToTop(final IWorkbenchPartReference partRef) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void partDeactivated(final IWorkbenchPartReference partRef) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void partHidden(final IWorkbenchPartReference partRef) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void partVisible(final IWorkbenchPartReference partRef) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void partInputChanged(final IWorkbenchPartReference partRef) {
    }
}
