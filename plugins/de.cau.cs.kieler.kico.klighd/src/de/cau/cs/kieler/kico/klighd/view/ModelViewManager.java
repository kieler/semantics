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

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.UIJob;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.model.adapter.GlobalPartAdapter;

/**
 * Observes the workspace and manages handles updating the ModelViews on part change events.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
public class ModelViewManager extends UIJob implements IStartup {

    // -- PSEUDO SINGLETON
    // -------------------------------------------------------------------------

    /** Singleton instance. */
    private static ModelViewManager instance;

    /**
     * Standard Constructor.
     */
    public ModelViewManager() {
        super(jobName);
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("ModelViewManager can only be instanciated once");
        }
    }

    /**
     * @return Singleton instance of {@link ModelViewManager} or null if not yet instantiated by startup
     */
    public static ModelViewManager getInstance() {
        return instance;
    }

    // -- ATTRIBUTES
    // -------------------------------------------------------------------------

    /** Name of this class used for jobs. */
    private static final String jobName = "KIELER ModelView Manager Startup";

    /** Global Listener Adapter. */
    private GlobalPartAdapter adapter;
    /** List of open model editors which MAY contain valid models. */
    private LinkedList<IEditorPart> editors = new LinkedList<IEditorPart>();
    /** List of open KiCoModelViews. */
    private LinkedList<ModelView> modelViews = new LinkedList<ModelView>();
    /** Active editor the primary model view is listening to. */
    private IEditorPart activeEditor = null;

    // -- STARTUP
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void earlyStartup() {
        // now run in UI thread
        this.schedule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IStatus runInUIThread(IProgressMonitor monitor) {
        // just register global part listener
        adapter = new GlobalPartAdapter(partListener, true);
        return Status.OK_STATUS;
    }

    // -- LISTENER
    // -------------------------------------------------------------------------

    /** PartListener to react on opened/closed/activated Editors and SelectionView. */
    private final IPartListener2 partListener = new IPartListener2() {

        public void partVisible(IWorkbenchPartReference partRef) {
            // Do nothing
        }

        public void partOpened(IWorkbenchPartReference partRef) {
            IWorkbenchPart part = partRef.getPart(false);
            if (part != null) {
                if (part instanceof IEditorPart
                        && ModelUpdateControllerFactory.isHandledEditor((IEditorPart) part)) {
                    IEditorPart editor = (IEditorPart) part;
                    editors.add(editor);
                    editor.addPropertyListener(dirtyPropertyListener);
                } else if (part instanceof ModelView) {
                    final ModelView modelView = (ModelView) part;
                    modelViews.add(modelView);
                    if (modelView.isPrimaryView()) {
                        // update to active editor (delayed to prevent klighd init errors)
                        new UIJob(jobName) {

                            @Override
                            public IStatus runInUIThread(IProgressMonitor monitor) {
                                setActiveEditor(modelView.getSite().getPage().getActiveEditor());
                                return Status.OK_STATUS;
                            }
                        }.schedule(2);
                    }
                }
            }
        }

        public void partInputChanged(IWorkbenchPartReference partRef) {
            // Do nothing
        }

        public void partHidden(IWorkbenchPartReference partRef) {
            // Do nothing
        }

        public void partDeactivated(IWorkbenchPartReference partRef) {
            // Do nothing
        }

        public void partClosed(IWorkbenchPartReference partRef) {
            final IWorkbenchPart part = partRef.getPart(false);
            if (part != null) {
                if (editors.contains(part)) {
                    IEditorPart editor = (IEditorPart) part;
                    editors.remove(editor);
                    editor.removePropertyListener(dirtyPropertyListener);
                    // close related model views
                    for (ModelView modelView : Lists.newLinkedList(Iterables.filter(modelViews,
                            new Predicate<ModelView>() {

                                public boolean apply(ModelView view) {
                                    return view.getEditor() == ((IEditorPart) part);
                                }
                            }))) {
                        // close view if eclipse is not shutting down
                        // Thus open model views will be restored after restart
                        if (!PlatformUI.getWorkbench().isClosing()) {
                            if (!modelView.isPrimaryView()) {
                                modelView.setEditor(null);
                                modelView.getSite().getPage().hideView(modelView);
                            } // Primary is notified via set active editor
                        }
                    }
                    if (editor == activeEditor) {
                        setActiveEditor(null);
                    }
                } else if (modelViews.contains(part)) {
                    modelViews.remove(part);
                }
            }
        }

        public void partBroughtToTop(IWorkbenchPartReference partRef) {
            // Do nothing
        }

        public void partActivated(final IWorkbenchPartReference partRef) {
            IWorkbenchPart part = partRef.getPart(false);
            if (editors.contains(part)) {
                IEditorPart editor = (IEditorPart) part;
                // get related primary model view
                ModelView primaryView = Iterables.find(modelViews, new Predicate<ModelView>() {

                    public boolean apply(ModelView view) {
                        return view.isPrimaryView();
                    }
                }, null);
                if (primaryView != null && primaryView.isDisposed()) {
                    modelViews.remove(primaryView);
                    primaryView = null;
                }
                // update or open new view
                if (primaryView == null) {
                    try {
                        partRef.getPage().showView(ModelView.ID);
                    } catch (PartInitException e) {
                        e.printStackTrace();
                    }
                } else {
                    setActiveEditor(editor);
                }
            }
        }
    };

    /**
     * PropertyListener to check if a editor was saved.
     */
    final IPropertyListener dirtyPropertyListener = new IPropertyListener() {

        public void propertyChanged(Object source, int propId) {
            IEditorPart editor = (IEditorPart) source;
            if (propId == IWorkbenchPartConstants.PROP_DIRTY && !editor.isDirty()) {
                // dirty flag changed and editor is not dirty -> saved
                // Notify all related model views
                for (ModelView modelView : getModelViews(editor)) {
                    modelView.notifyEditorSaved();
                    ;
                }
            }
        }
    };

    // -- HELPER
    // -------------------------------------------------------------------------

    /**
     * Sets the active editor and notifies all listeners.
     * 
     * @param editor
     *            new active editor
     */
    private void setActiveEditor(IEditorPart editor) {
        ModelView primaryView = Iterables.find(modelViews, new Predicate<ModelView>() {

            public boolean apply(ModelView view) {
                return view.isPrimaryView();
            }
        }, null);
        if (primaryView != null) {
            primaryView.setEditor(editor);
        }
        activeEditor = editor;
    }

    // -- ModelView Access
    // -------------------------------------------------------------------------

    /**
     * Returns the list of model views currently displaying the content of the given editor.
     * 
     * @param editor
     *            the editor to filter for
     * @return List of ModelView associated with editor
     */
    public List<ModelView> getModelViews(final IEditorPart editor) {
        if (editor != null) {
            return Lists.newArrayList(Iterables.filter(modelViews, new Predicate<ModelView>() {
                public boolean apply(ModelView view) {
                    IEditorPart viewEditor = view.getEditor();
                    return viewEditor != null && viewEditor.equals(editor);
                }
            }));
        }
        return Collections.emptyList();
    }

}
