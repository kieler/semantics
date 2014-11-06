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
package de.cau.cs.kieler.sccharts.prio.dependencies.klighd;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.cau.cs.kieler.core.model.adapter.GlobalPartAdapter;
import de.cau.cs.kieler.core.model.util.XtextModelingUtil;
import de.cau.cs.kieler.sccharts.State;

/**
 * Observes the active editor and updates the SCCharts prio dependency view
 * 
 * @author cmot
 * @kieler.design 2014-10-14 proposed
 * @kieler.rating 2014-10-14 proposed yellow
 * 
 */
public class EditorListener implements IStartup {

    /** Singleton instance */
    private static EditorListener instance;
    
    /** Global Listener Adapter */
    @SuppressWarnings("unused")
    private GlobalPartAdapter adapter;
    
    /** The current valid editor part. */
    private IEditorPart currentEditorPart;
    
    // -------------------------------------------------------------------------

    /**
     * Constructor
     */
    public EditorListener() {
        super();
        instance = this;
    }

    // -------------------------------------------------------------------------

    /**
     * @return Singleton instance of KiCoModelViewManager or null if not yet instantiated by startup
     */
    public static EditorListener getInstance() {
        return instance;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void earlyStartup() {
        // just register global part listener
        adapter = new GlobalPartAdapter(partListener, true);
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /** PartListener to react on opened/closed/activated Editors and KiCoSelectionView. */
    final IPartListener2 partListener = new IPartListener2() {

        public void partVisible(IWorkbenchPartReference partRef) {
            // Do nothing
        }

        public void partOpened(IWorkbenchPartReference partRef) {
            IWorkbenchPart part = partRef.getPart(false);
            if (part != null) {
                if (part instanceof IEditorPart && isValidModelEditor((IEditorPart) part)) {
                    currentEditorPart = (IEditorPart) part;
                    SCChartsPrioDependencyView view = SCChartsPrioDependencyView.getInstance();
                    if (view != null) {
                        view.updateActiveEditor(currentEditorPart);
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
                if (currentEditorPart == part) {
                    currentEditorPart = null;
                    SCChartsPrioDependencyView view = SCChartsPrioDependencyView.getInstance();
                    if (view != null) {
                        view.updateActiveEditor(currentEditorPart);
                    }
                }
            }
        }

        public void partBroughtToTop(IWorkbenchPartReference partRef) {
            // Do nothing
        }

        public void partActivated(final IWorkbenchPartReference partRef) {
            IWorkbenchPart part = partRef.getPart(false);
            if (part != null) {
                if (part instanceof IEditorPart && isValidModelEditor((IEditorPart) part)) {
                    currentEditorPart = (IEditorPart) part;
                    SCChartsPrioDependencyView view = SCChartsPrioDependencyView.getInstance();
                    if (view != null) {
                        view.updateActiveEditor(currentEditorPart);
                    }
                }
            }
        }
    };
    
    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    
    /**
     * Checks if given editor part is a valid model for this view.
     * 
     * @param part
     *            editor
     * @return true if editor is model editor
     */
    private boolean isValidModelEditor(IEditorPart part) {
        EObject model = getModelFromModelEditor(part);
        if (model != null && model instanceof State) {
            return true;
        }
        return false;
    }

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

    // -------------------------------------------------------------------------

}
