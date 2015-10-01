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
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IMemento;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.cau.cs.kieler.kico.klighd.view.ModelView;
import de.cau.cs.kieler.kico.klighd.view.util.EditorUtil;
import de.cau.cs.kieler.kico.klighd.view.util.ModelUtil;
import de.cau.cs.kieler.kico.klighd.view.util.XtextSelectionHighlighter;
import de.cau.cs.kieler.klighd.IViewer;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * Simple controller for XText editors which performs a diagram update when the model is changed.
 * 
 * @author als
 * @kieler.design 2015-09-30 proposed
 * @kieler.rating 2015-09-30 proposed yellow
 *
 */
public class XtextChangeUpdateController extends AbstractModelUpdateController
        implements XtextEditorModelChangeAdapter.XtextChangeListener {

    /** Controller ID. */
    private static final String ID =
            "de.cau.cs.kieler.kico.klighd.view.controller.XtextChangeUpdateController";

    /** The safe listener for the editor. */
    private final XtextEditorModelChangeAdapter changeAdapter;

    /**
     * Default Constructor.
     * 
     * @param modelView
     *            the ModelView this controller is associated with
     */
    public XtextChangeUpdateController(ModelView modelView) {
        super(modelView);
        changeAdapter = new XtextEditorModelChangeAdapter(this);
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
        return new XtextChangeUpdateController(modelView);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onActivate(IEditorPart editor) {
        if (editor instanceof XtextEditor) {
            updateModel(EditorUtil.getModelFromXtextEditor((XtextEditor) editor, true));
            changeAdapter.activate((XtextEditor) editor);
        } else {
            throw new IllegalArgumentException(XtextChangeUpdateController.class.getName()
                    + "cannot handle editro inputs other than XtextEditor");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onDeactivate() {
        changeAdapter.deactivate();
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
        XtextSelectionHighlighter.highlightSelection((XtextEditor) getEditor(),
                event.getSelection());
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

    // -- Model change Listener
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void onModelChanged(XtextEditor editor, XtextResource resource) {
        updateModel(EditorUtil.getModelFromXtextEditor(editor, true));
    }

}
