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
package de.cau.cs.kieler.kico.klighd.view.controller;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IMemento;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.cau.cs.kieler.kico.klighd.view.ModelView;
import de.cau.cs.kieler.kico.klighd.view.util.EditorUtil;
import de.cau.cs.kieler.kico.klighd.view.util.ModelUtil;
import de.cau.cs.kieler.kico.klighd.view.util.XtextSelectionHighlighter;
import de.cau.cs.kieler.klighd.IViewer;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * Simple controller for XText and Ecore model editors which performs a diagram update when the
 * model is saved.
 * 
 * @author als
 * @kieler.design 2015-06-29 proposed
 * @kieler.rating 2015-06-29 proposed yellow
 *
 */
public class EcoreXtextSaveUpdateController extends AbstractModelUpdateController
        implements EditorSaveAdapter.EditorSafeListener {

    /** Controller ID. */
    private static final String ID =
            "de.cau.cs.kieler.kico.klighd.view.controller.EcoreXtextSaveUpdateController";

    /** The save adapter for the editor. */
    protected final EditorSaveAdapter saveAdapter;

    /**
     * Default Constructor.
     * 
     * @param modelView
     *            the ModelView this controller is associated with
     */
    public EcoreXtextSaveUpdateController(ModelView modelView) {
        super(modelView);
        saveAdapter = new EditorSaveAdapter(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getID() {
        return ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addContributions(IToolBarManager toolBar, IMenuManager menu) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbstractModelUpdateController clone(ModelView modelView) {
        return new EcoreXtextSaveUpdateController(modelView);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onActivate(IEditorPart editor) {
        updateModel(readModel(editor));
        saveAdapter.activate(editor);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onDeactivate() {
        saveAdapter.deactivate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveModel(Object model, IFile file, URI uri) throws Exception {
        if (model instanceof EObject) {
            ModelUtil.saveModel((EObject) model, uri);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getResourceName(IEditorPart editor, Object model) {
        if (editor != null && model != null) {
            return editor.getTitle();
        } else {
            return "";
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void selectionChanged(SelectionChangedEvent event) {
        if (getEditor() instanceof XtextEditor) {
            XtextSelectionHighlighter.highlightSelection((XtextEditor) getEditor(),
                    event.getSelection());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onDiagramUpdate(Object model, KlighdSynthesisProperties properties,
            IViewer viewer) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void reset() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveState(IMemento memento) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void loadState(IMemento memento) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onDispose() {
    }
    
    // -- Save Listener
    // -------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void onEditorSaved(IEditorPart editor) {
        updateModel(readModel(editor));
    }

    // -- Utility
    // -------------------------------------------------------------------------

    /**
     * Reads the model from given EdtorPart if it supports ecore models.
     * 
     * @param editor
     *            IEditorPart containing model
     * @return EObject model
     */
    protected static EObject readModel(final IEditorPart editor) {
        EObject model = null;
        if (editor instanceof XtextEditor) { // Get model from XTextEditor
            return EditorUtil.getModelFromXtextEditor((XtextEditor) editor, true);
        } else if (editor instanceof IEditingDomainProvider) { // Get model from EMF TreeEditor
            return EditorUtil.getModelFromEMFEditor((IEditingDomainProvider) editor);
        }
        return model;
    }

}
