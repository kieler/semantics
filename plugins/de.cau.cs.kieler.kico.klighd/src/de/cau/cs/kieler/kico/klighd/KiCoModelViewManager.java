/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
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
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Guice;

import de.cau.cs.kieler.c.sccharts.CDTProcessor;
import de.cau.cs.kieler.core.model.adapter.GlobalPartAdapter;
import de.cau.cs.kieler.core.model.util.XtextModelingUtil;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.kico.KielerCompilerSelection;
import de.cau.cs.kieler.kico.klighd.KiCoModelView.ChangeEvent;
import de.cau.cs.kieler.kico.ui.KiCoSelectionChangeEventManager.KiCoSelectionChangeEventListerner;
import de.cau.cs.kieler.kico.ui.KiCoSelectionView;

/**
 * Observes workspace and manages KiCoModelViews
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
public class KiCoModelViewManager extends UIJob implements IStartup,
        KiCoSelectionChangeEventListerner {

    // -- PSEUDO SINGLETON
    // -------------------------------------------------------------------------

    /** Singleton instance */
    private static KiCoModelViewManager instance;

    /**
     * Standard Constructor
     */
    public KiCoModelViewManager() {
        super(jobName);
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("KiCoModelViewManager can only be instanciated once");
        }
    }

    /**
     * @return Singleton instance of KiCoModelViewManager or null if not yet instantiated by startup
     */
    public static KiCoModelViewManager getInstance() {
        return instance;
    }

    // -- ATTRIBUTES
    // -------------------------------------------------------------------------

    /** Name of this class used for Jobs */
    private static final String jobName = "KIELER ModelView Manager";

    /** Global Listener Adapter */
    private GlobalPartAdapter adapter;
    /** List of open model editors which MAY contain valid models. */
    private LinkedList<IEditorPart> editors = new LinkedList<IEditorPart>();
    /** List of open KiCoSelectionViews. */
    private LinkedList<KiCoSelectionView> kicoSelections = new LinkedList<KiCoSelectionView>();
    /** List of open KiCoModelViews. */
    private LinkedList<KiCoModelView> modelViews = new LinkedList<KiCoModelView>();
    /** Map from editors (hash) to selected transformations. */
    private HashMap<Integer, Pair<KielerCompilerSelection, Boolean>> compilerSelection =
            new HashMap<Integer, Pair<KielerCompilerSelection, Boolean>>();
    /** Active editor the primary model view is listening to */
    private IEditorPart activeEditor = null;
    /** List of registered listeners */
    private HashSet<IActiveEditorListener> listeners = new HashSet<IActiveEditorListener>();

    /** Indicated that earlyStartup has not finished yet */

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

    /** PartListener to react on opened/closed/activated Editors and KiCoSelectionView. */
    private final IPartListener2 partListener = new IPartListener2() {

        public void partVisible(IWorkbenchPartReference partRef) {
            // Do nothing
        }

        public void partOpened(IWorkbenchPartReference partRef) {
            IWorkbenchPart part = partRef.getPart(false);
            if (part != null) {
                if (part instanceof IEditorPart && isModelEditor((IEditorPart) part)) {
                    IEditorPart editor = (IEditorPart) part;
                    editors.add(editor);
                    editor.addPropertyListener(dirtyPropertyListener);
                } else if (part instanceof KiCoSelectionView) {
                    KiCoSelectionView selectionView = (KiCoSelectionView) part;
                    kicoSelections.add(selectionView);
                    // listen to transformation selection changes
                    selectionView.addSelectionChangeEventListener(instance);
                } else if (part instanceof KiCoModelView) {
                    final KiCoModelView modelView = (KiCoModelView) part;
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
                    for (KiCoModelView modelView : Lists.newLinkedList(Iterables.filter(modelViews,
                            new Predicate<KiCoModelView>() {

                                public boolean apply(KiCoModelView view) {
                                    return view.getActiveEditor() == ((IEditorPart) part);
                                }
                            }))) {
                        // close view if eclipse is not shutting down
                        // Thus open model views will be restored after restart
                        if (!PlatformUI.getWorkbench().isClosing()) {
                            if (!modelView.isPrimaryView()) {
                                modelView.setActiveEditor(null);
                                modelView.getSite().getPage().hideView(modelView);
                            } // Primary is notified via set active editor
                        }
                    }
                    if (editor == activeEditor) {
                        setActiveEditor(null);
                    }
                } else if (kicoSelections.contains(part)) {
                    kicoSelections.remove(part);
                    ((KiCoSelectionView) part).removeSelectionChangeEventListener(instance);
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
                KiCoModelView primaryView =
                        Iterables.find(modelViews, new Predicate<KiCoModelView>() {

                            public boolean apply(KiCoModelView view) {
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
                        partRef.getPage().showView(KiCoModelView.ID);
                    } catch (PartInitException e) {
                        e.printStackTrace();
                    }
                } else {
                    setActiveEditor(editor);
                }
            }
        }
    };

    /** PropertyListener to check if a editor was saved. */
    final IPropertyListener dirtyPropertyListener = new IPropertyListener() {

        public void propertyChanged(Object source, int propId) {
            IEditorPart editor = (IEditorPart) source;
            if (propId == IWorkbenchPartConstants.PROP_DIRTY && !editor.isDirty()) {
                // dirty flag changed and editor is not dirty -> saved
                // Notify all related model views
                for (KiCoModelView modelView : getModelViews(editor)) {
                    modelView.updateModel(ChangeEvent.SAVED);
                }
                // Notify listeners is active editor
                if (editor == activeEditor) {
                    for (IActiveEditorListener listener : listeners) {
                        listener.activeEditorSaved(editor);
                    }
                }
            }
        }
    };

    /** PropertyChangeListener to get changes of selected transformations in KiCoSelectionView. */
    public void selectionChange(int editorID, Pair<KielerCompilerSelection, Boolean> selection) {
        Pair<KielerCompilerSelection, Boolean> newSelection =
                selection == null ? null : new Pair<KielerCompilerSelection, Boolean>(selection
                        .getFirst().clone(), selection.getSecond());
        Pair<KielerCompilerSelection, Boolean> previouseSelection =
                compilerSelection.put(editorID, newSelection);
        if (newSelection != null && !newSelection.equals(previouseSelection)) {
            // update model views
            for (KiCoModelView modelView : modelViews) {
                modelView.updateModel(ChangeEvent.SELECTION);
            }
        } else if (newSelection != previouseSelection) { // Selection changed to null
            // update model views
            for (KiCoModelView modelView : modelViews) {
                modelView.updateModel(ChangeEvent.SELECTION);
            }
        }
    }

    // -- HELPER
    // -------------------------------------------------------------------------
    /**
     * Checks if given editor part can contain visualizable models
     * 
     * @param part
     *            editor
     * @return true if editor is model editor
     */
    private boolean isModelEditor(IEditorPart part) {
        // If XTextEditor of EMF Tree Editor
        if (part instanceof XtextEditor || part instanceof IEditingDomainProvider) {
            return true;
        }
        return true;
//        return false;
    }

    /**
     * Sets the active editor and notifies all listeners.
     */
    private void setActiveEditor(IEditorPart editor) {
        KiCoModelView primaryView = Iterables.find(modelViews, new Predicate<KiCoModelView>() {

            public boolean apply(KiCoModelView view) {
                return view.isPrimaryView();
            }
        }, null);
        if (primaryView != null) {
            primaryView.setActiveEditor(editor);
        }
        // Notify listeners is active editor
        if (editor != activeEditor) {
            for (IActiveEditorListener listener : listeners) {
                listener.activeEditorChanged(editor);
            }
        }
        activeEditor = editor;
    }

    /**
     * Returns compiler selection to given editor
     * 
     * @param editor
     */
    Pair<KielerCompilerSelection, Boolean> getSelection(final IEditorPart activeEditor) {
        return compilerSelection.get(activeEditor.hashCode());
    }

    // -- Utility
    // -------------------------------------------------------------------------

    /**
     * Extracts an ecore model from given EdtorPart in it supports ecore models.
     * 
     * @param editor
     *            IEditorPart containing model
     * @return EObject model
     */
    static EObject getModelFromModelEditor(final IEditorPart editor) {
        EObject model = null;
        if (editor instanceof XtextEditor) { // Get model from XTextEditor
            return XtextModelingUtil.getModelFromXtextEditor((XtextEditor) editor, true);
        } else if (editor instanceof IEditingDomainProvider) { // Get model from EMF TreeEditor
            IEditingDomainProvider provider = (IEditingDomainProvider) editor;

            List<Resource> resources = provider.getEditingDomain().getResourceSet().getResources();

            if (!resources.isEmpty() && !resources.get(0).getContents().isEmpty()) {
                model = EcoreUtil.getRootContainer(resources.get(0).getContents().get(0));
            }
// TODO: What to do with non ecore models?
        } else {
            CDTProcessor CDTProcessor = Guice.createInjector().getInstance(CDTProcessor.class);
            model = CDTProcessor.createFromEditor(editor);
        }
        return model;
    }

    // -- ModelView Access
    // -------------------------------------------------------------------------

    /**
     * Returns the list of model views currently displaying the content of the given editor.
     * 
     * @param editor
     *            the editor to filter for
     * @return List of KiCoModelView associated with editor
     */
    public List<KiCoModelView> getModelViews(final IEditorPart editor) {
        if (editor != null) {
            return Lists.newArrayList(Iterables.filter(modelViews, new Predicate<KiCoModelView>() {
                public boolean apply(KiCoModelView view) {
                    IEditorPart activeEditor = view.getActiveEditor();
                    return activeEditor != null && activeEditor.equals(editor);
                }
            }));
        }
        return Collections.emptyList();
    }

    // -- ActiveEditorListener registration
    // -------------------------------------------------------------------------

    /**
     * Adds a listener for changes of the active editor. Has no effect if an identical listener is
     * already registered.
     * 
     * @param listener
     *            listener to add
     */
    public static void addActiveEditorListener(IActiveEditorListener listener) {
        getInstance().listeners.add(listener);
    }

    /**
     * Removes the given listener from the ModelViewManager. Has no effect if an identical listener
     * is not registered.
     * 
     * @param listener
     *            listener to remove
     */
    public static void removeActiveEditorListener(IActiveEditorListener listener) {
        getInstance().listeners.remove(listener);
    }

}
