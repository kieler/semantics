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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cau.cs.kieler.kico.klighd.KiCoModelView.ChangeEvent;
import de.cau.cs.kieler.kico.klighd.listener.GlobalPartAdapter;
import de.cau.cs.kieler.kico.ui.KiCoSelectionView;

/**
 * Observes Workspace and manages KiCoModelViews
 * 
 * @author als
 * 
 */
public class KiCoModelViewManager implements IStartup {

    // -- PSEUDO SINGLETON
    // -------------------------------------------------------------------------

    /** Singleton instance */
    private static KiCoModelViewManager instance;

    /**
     * Standard Constructor
     */
    public KiCoModelViewManager() {
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

    private GlobalPartAdapter adapter;
    private LinkedList<IEditorPart> editors = new LinkedList<IEditorPart>();
    private LinkedList<KiCoSelectionView> kicoSelections = new LinkedList<KiCoSelectionView>();
    private LinkedList<KiCoModelView> modelViews = new LinkedList<KiCoModelView>();
    private HashMap<String, String> tranformations = new HashMap<String, String>();

    // -- STARTUP
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void earlyStartup() {
        // just register global part listener
        adapter = new GlobalPartAdapter(partListener, true);

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
                    kicoSelections.add((KiCoSelectionView) part);
                    // listen for transformation changes
                    ((KiCoSelectionView) part)
                            .addPartPropertyListener(tranformationsPropertyListener);
                } else if (part instanceof KiCoModelView) {
                    KiCoModelView modelView = (KiCoModelView) part;
                    modelViews.add(modelView);
                    if (modelView.isPrimaryView()) {
                        modelView.setActiveEditor(partRef.getPage().getActiveEditor());
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
                        modelView.getSite().getPage().hideView(modelView);
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
                } else {
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
    private boolean isModelEditor(IEditorPart part) {
        if (part instanceof XtextEditor || part instanceof IEditingDomainProvider) {
            // TODO check if model has synthesis
            return true;
        }
        return false;
    }

    /**
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

}
