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
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.UIJob;

import de.cau.cs.kieler.kico.klighd.view.util.GlobalPartAdapter;

/**
 * Listens to the workspace and manages the editor for the associated {@link ModelView}.
 * 
 * @author als
 * @kieler.design 2015-09-29 proposed
 * @kieler.rating 2015-09-29 proposed yellow
 * 
 */
class ModelViewEditorAdapter extends GlobalPartAdapter {

    private static final String INIT_JOB_NAME = "Initializing " + ModelView.VIEW_TITLE;
    private final ModelView modelView;

    /**
     * Create a new listener handling events for the given {@link ModelView}.
     * 
     * @param modelView
     *            The associated ModelView
     */
    public ModelViewEditorAdapter(ModelView modelView) {
        super(null, false);
        this.modelView = modelView;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void partOpened(IWorkbenchPartReference partRef) {
        IWorkbenchPart part = partRef.getPart(false);
        // Initialize primary view with current active editor
        if (part != null && part == modelView) {
            if (modelView.isPrimaryView()) {
                // update to active editor (delayed to prevent klighd init errors)
                new UIJob(INIT_JOB_NAME) {

                    @Override
                    public IStatus runInUIThread(IProgressMonitor monitor) {
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
    public void partClosed(IWorkbenchPartReference partRef) {
        final IWorkbenchPart part = partRef.getPart(false);
        // If part is editor of the model view
        if (part != null && part == modelView.getEditor()) {
            modelView.setEditor(null);
            if (!modelView.isPrimaryView()) {
                // Close ModelView only if eclipse is not shutting down
                // because open model views should be restored after restart
                if (!PlatformUI.getWorkbench().isClosing()) {
                    // Close view
                    modelView.getSite().getPage().hideView(modelView);
                    // Stop listening
                    this.unregister();
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void partActivated(final IWorkbenchPartReference partRef) {
        IWorkbenchPart part = partRef.getPart(false);
        if (modelView.isPrimaryView() && part instanceof IEditorPart) {
            modelView.setEditor((IEditorPart) part);
        }
    }
}
