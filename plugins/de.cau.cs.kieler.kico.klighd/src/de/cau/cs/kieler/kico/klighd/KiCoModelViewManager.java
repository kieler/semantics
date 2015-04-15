/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd;

import java.util.Collections;
import java.util.HashMap;
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

import de.cau.cs.kieler.core.model.adapter.GlobalPartAdapter;
import de.cau.cs.kieler.core.model.util.XtextModelingUtil;
import de.cau.cs.kieler.kico.klighd.KiCoModelView.ChangeEvent;
import de.cau.cs.kieler.kico.ui.KiCoSelection;
import de.cau.cs.kieler.kico.ui.KiCoSelectionChangeEventManager.KiCoSelectionChangeEventListerner;
import de.cau.cs.kieler.kico.ui.KiCoSelectionView;
import de.cau.cs.kieler.klighd.KlighdDataManager;

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
    /** List of open model editors which contain valid models. */
    private LinkedList<IEditorPart> validEditors = new LinkedList<IEditorPart>();
    /** List of open KiCoSelectionViews. */
    private LinkedList<KiCoSelectionView> kicoSelections = new LinkedList<KiCoSelectionView>();
    /** List of open KiCoModelViews. */
    private LinkedList<KiCoModelView> modelViews = new LinkedList<KiCoModelView>();
    /** Map from edtors (hash) to selected transformations. */
    private HashMap<Integer, KiCoSelection> compilerSelection =
            new HashMap<Integer, KiCoSelection>();

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
    final IPartListener2 partListener = new IPartListener2() {

        public void partVisible(IWorkbenchPartReference partRef) {
            // Do nothing
        }

        public void partOpened(IWorkbenchPartReference partRef) {
            IWorkbenchPart part = partRef.getPart(false);
            if (part != null) {
                if (part instanceof IEditorPart && isModelEditor((IEditorPart) part)) {
                    editors.add((IEditorPart) part);
                } else if (part instanceof KiCoSelectionView) {
                    KiCoSelectionView selectionView = (KiCoSelectionView) part;
                    kicoSelections.add(selectionView);
                    // listen to transformation selection changes
                    selectionView.addSelectionChangeEventListener(instance);
                    // be kind an help selection view to initialize (because in some startup cases
                    // it activation of an editor)
                    selectionView.updateView(selectionView.getSite().getPage()
                            .getReference(selectionView.getSite().getPage().getActiveEditor()));
                } else if (part instanceof KiCoModelView) {
                    final KiCoModelView modelView = (KiCoModelView) part;
                    modelViews.add(modelView);
                    if (modelView.isPrimaryView()
                            && modelView.getSite().getPage().getActiveEditor() != null) {
                        // update to active editor (delayed to prevent klighd init errors)
                        new UIJob(jobName) {

                            @Override
                            public IStatus runInUIThread(IProgressMonitor monitor) {
                                IEditorPart activeEditor =
                                        modelView.getSite().getPage().getActiveEditor();
                                if (validEditors.contains(activeEditor)) {
                                    modelView.setActiveEditor(activeEditor);
                                }
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
                    editors.remove(part);
                    validEditors.remove(part);
                    part.removePropertyListener(undecidedValidityEditorDirtyPropertyListener);
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
                            if (modelView.isPrimaryView()) {
                                if (editors.isEmpty()) {
                                    modelView.setActiveEditor(null);
                                }
                            } else {
                                modelView.setActiveEditor(null);
                                modelView.getSite().getPage().hideView(modelView);
                            }
                        }
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
                int isValid = 0;
                if (!validEditors.contains(part)) {
                    // check if valid
                    isValid = isValidModelEditor(editor);
                    if (isValid == 0) {
                        editors.remove(part);
                        part.removePropertyListener(undecidedValidityEditorDirtyPropertyListener);
                    } else if (isValid == 1) {
                        validEditors.add(editor);
                        part.removePropertyListener(undecidedValidityEditorDirtyPropertyListener);
                    } else if (isValid == 2) {// wait until validity is decidable
                        part.addPropertyListener(undecidedValidityEditorDirtyPropertyListener);
                        return;
                    }
                } else {
                    isValid = 1;
                }
                // update if valid
                if (isValid == 1) {
                    // get related primary model view
                    KiCoModelView primaryView =
                            Iterables.getFirst(
                                    Iterables.filter(modelViews, new Predicate<KiCoModelView>() {

                                        public boolean apply(KiCoModelView view) {
                                            return view.getSite().getPage() == partRef.getPage()
                                                    && view.isPrimaryView();
                                        }
                                    }), null);
                    if (primaryView != null && primaryView.isDisposed()) {
                        modelViews.remove(primaryView);
                        primaryView = null;
                    }
                    // update or open new view
                    if (primaryView != null) {
                        primaryView.setActiveEditor(editor);
                    } else if (primaryView == null) {
                        try {
                            partRef.getPage().showView(KiCoModelView.ID);
                        } catch (PartInitException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    };

    /** PropertyChangeListener to get changes of selected transformations in KiCoSelectionView. */
    public void selectionChange(KiCoSelection newSelection) {
        if (newSelection != null
                && !newSelection.equals(compilerSelection.put(newSelection.getEditorID(),
                        newSelection))) {
            // update model views
            for (KiCoModelView modelView : modelViews) {
                modelView.updateModel(ChangeEvent.TRANSFORMATIONS);
            }

        }
    }

    /** PropertyListener to check if a editor with undecided validity was saved. */
    final IPropertyListener undecidedValidityEditorDirtyPropertyListener = new IPropertyListener() {

        public void propertyChanged(Object source, int propId) {
            IEditorPart editor = (IEditorPart) source;
            if (propId == IWorkbenchPartConstants.PROP_DIRTY && !editor.isDirty()) {
                // fire activation again to decide its valitidy
                partListener.partActivated(editor.getSite().getPage().getReference(editor));
            }
        }
    };

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
        return false;
    }

    /**
     * Checks if given editor part is a valid model editor thus contains a visualizable model
     * 
     * @param editor
     *            editor
     * @return 0 == NO, 1 == YES , 2 == MAYBE
     * 
     */
    private int isValidModelEditor(IEditorPart editor) {
        EObject model = getModelFromModelEditor(editor);
        if (model != null) {
//            if (!Iterables.isEmpty(KlighdDataManager.getInstance().getAvailableSyntheses(
//                    model.getClass()))) {
//                return 1;
//            } else {
//                return 0;
//            }
          return 1;
        }
        return 2;// Undecidable if model is null
    }

    /**
     * Returns compiler selection to given editor
     * 
     * @param editor
     */
    public KiCoSelection getSelection(final IEditorPart activeEditor) {
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
    public static EObject getModelFromModelEditor(final IEditorPart editor) {
        EObject model = null;
        if (editor instanceof XtextEditor) { // Get model from XTextEditor
            return XtextModelingUtil.getModelFromXtextEditor((XtextEditor) editor, true);
        } else if (editor instanceof IEditingDomainProvider) { // Get model from EMF TreeEditor
            IEditingDomainProvider provider = (IEditingDomainProvider) editor;

            List<Resource> resources = provider.getEditingDomain().getResourceSet().getResources();

            if (!resources.isEmpty() && !resources.get(0).getContents().isEmpty()) {
                model = EcoreUtil.getRootContainer(resources.get(0).getContents().get(0));
            }
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
            return Lists.newArrayList(Iterables.filter(modelViews, new Predicate<KiCoModelView>(){
                public boolean apply(KiCoModelView view) {
                    IEditorPart activeEditor = view.getActiveEditor();
                    return activeEditor != null && activeEditor.equals(editor);
                }
            }));
        }
        return Collections.emptyList();
    }

}
