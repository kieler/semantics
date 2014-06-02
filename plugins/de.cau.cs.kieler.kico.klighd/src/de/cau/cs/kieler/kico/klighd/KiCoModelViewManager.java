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
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.model.xtext.util.XtextModelingUtil;
import de.cau.cs.kieler.kico.klighd.KiCoModelView.ChangeEvent;
import de.cau.cs.kieler.kico.klighd.listener.GlobalPartAdapter;
import de.cau.cs.kieler.kico.ui.KiCoSelectionView;
import de.cau.cs.kieler.klighd.KlighdDataManager;

/**
 * Observes Workspace and manages KiCoModelViews
 * 
 * @author als
 * 
 */
public class KiCoModelViewManager extends UIJob implements IStartup {

    // -- PSEUDO SINGLETON
    // -------------------------------------------------------------------------

    /** Singleton instance */
    private static KiCoModelViewManager instance;

    /**
     * Standard Constructor
     */
    public KiCoModelViewManager() {
        super(KiCoModelViewManager.class.getName());
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

    /** Global Listener Adapter */
    private GlobalPartAdapter adapter;
    /** List of open model editors. */
    private LinkedList<IEditorPart> editors = new LinkedList<IEditorPart>();
    /** List of open KiCoSelectionViews. */
    private LinkedList<KiCoSelectionView> kicoSelections = new LinkedList<KiCoSelectionView>();
    /** List of open KiCoModelViews. */
    private LinkedList<KiCoModelView> modelViews = new LinkedList<KiCoModelView>();
    /** Map from edtors (hash) to selected transformations. */
    private HashMap<String, String> tranformations = new HashMap<String, String>();

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
                    selectionView.addPartPropertyListener(tranformationsPropertyListener);
                    // be kind an help selection view to initialize (because in some startup cases
                    // it activation of an editor)
                    selectionView.updateView(selectionView.getSite().getPage()
                            .getReference(selectionView.getSite().getPage().getActiveEditor()));
                } else if (part instanceof KiCoModelView) {
                    final KiCoModelView modelView = (KiCoModelView) part;
                    modelViews.add(modelView);
                    if (modelView.isPrimaryView()
                            && modelView.getSite().getPage().getActiveEditor() != null) {
                        //update to active editor (delayed to prevent klighd init errors)
                        new UIJob("Init" + KiCoModelView.class.getName()) {

                            @Override
                            public IStatus runInUIThread(IProgressMonitor monitor) {
                                IEditorPart activeEditor = modelView.getSite().getPage().getActiveEditor();
                                if(editors.contains(activeEditor)){
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
                    // close related model views
                    for (KiCoModelView modelView : Lists.newLinkedList(Iterables.filter(modelViews,
                            new Predicate<KiCoModelView>() {

                                public boolean apply(KiCoModelView view) {
                                    return view.getActiveEditor() == ((IEditorPart) part)
                                            && !view.isPrimaryView();
                                }
                            }))) {
                        // close view if eclipse is not shutting down
                        // Thus open model views will be restored after restart
                        if (!PlatformUI.getWorkbench().isClosing()) {
                            modelView.setActiveEditor(null);
                            modelView.getSite().getPage().hideView(modelView);
                        }
                    }
                } else if (kicoSelections.contains(part)) {
                    kicoSelections.remove(part);
                    ((KiCoSelectionView) part)
                            .removePartPropertyListener(tranformationsPropertyListener);
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
                // get related primary model view
                KiCoModelView primaryView =
                        Iterables.getFirst(
                                Iterables.filter(modelViews, new Predicate<KiCoModelView>() {

                                    public boolean apply(KiCoModelView view) {
                                        return view.getSite().getPage() == partRef.getPage()
                                                && view.isPrimaryView();
                                    }
                                }), null);
                // update or open new view
                if (primaryView != null) {
                    primaryView.setActiveEditor((IEditorPart) part);
                } else if (primaryView == null) {
                    try {
                        partRef.getPage().showView(KiCoModelView.ID);
                    } catch (PartInitException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    };

    /** PropertyChangeListener to get changes of selected transformations in KiCoSelectionView. */
    final IPropertyChangeListener tranformationsPropertyListener = new IPropertyChangeListener() {

        public void propertyChange(PropertyChangeEvent event) {
            if (event.getProperty() == KiCoSelectionView.ACTIVE_TRANSFORMATIONS_PROPERTY_KEY) {
                final KiCoSelectionView selectionView = (KiCoSelectionView) event.getSource();
                String editorHash =
                        selectionView.getPartProperty(KiCoSelectionView.ACTIVE_EDITOR_PROPERTY_KEY);
                // if value changed
                if (event.getNewValue() != null
                        && !event.getNewValue().equals(
                                tranformations.put(editorHash, (String) event.getNewValue()))) {
                    // update related model views
                    for (KiCoModelView modelView : Iterables.filter(modelViews,
                            new Predicate<KiCoModelView>() {

                                public boolean apply(KiCoModelView view) {
                                    return view.getSite().getPage() == selectionView.getSite()
                                            .getPage();
                                }
                            })) {
                        modelView.updateModel(ChangeEvent.TRANSFORMATIONS);
                    }

                }
            }
        }
    };

    // -- HELPER
    // -------------------------------------------------------------------------
    /**
     * Checks if given editor part is a valid model editor visualizable with a ModelView
     * 
     * @param part
     *            editor
     * @return true if editor is model editor
     */
    private boolean isModelEditor(IEditorPart part) {
        EObject model = getModelFromModelEditor(part);
        if (model != null
                && !Iterables.isEmpty(KlighdDataManager.getInstance().getAvailableSyntheses(
                        model.getClass()))) {
            return true;
        }
        return false;
    }

    /**
     * Return a string containing the current compiler selection to given editor
     * 
     * @param activeEditor
     */
    public String getTransformations(final IEditorPart activeEditor) {
        String editorHash = Long.toString(activeEditor.hashCode());
        if (tranformations.containsKey(editorHash)) {
            String trans = tranformations.get(editorHash);
            if (trans != null && !trans.trim().isEmpty()) {
                return trans;
            }
        }
        return null;
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

}
