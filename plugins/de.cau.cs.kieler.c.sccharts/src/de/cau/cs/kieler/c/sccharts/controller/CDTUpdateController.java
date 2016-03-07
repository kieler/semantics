/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.c.sccharts.controller;

import org.eclipse.cdt.internal.ui.editor.CEditor;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IMemento;

import com.google.inject.Guice;

import de.cau.cs.kieler.c.sccharts.CDTProcessor;
import de.cau.cs.kieler.klighd.ui.view.controller.AbstractViewUpdateController;
import de.cau.cs.kieler.klighd.ui.view.controllers.EditorSaveAdapter;
import de.cau.cs.kieler.klighd.ui.view.controllers.EditorSaveAdapter.EditorSafeListener;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * @author leo
 *
 */
public class CDTUpdateController extends AbstractViewUpdateController implements EditorSafeListener  {
    
    /** Controller ID. */
    private static final String ID =
            "de.cau.cs.kieler.c.sccharts.controller.CDTUpdateController";

    // CHECKSTYLEOFF VisibilityModifier NEXT
    /** The save adapter for the editor. */
    protected final EditorSaveAdapter saveAdapter;

    /**
     * Default Constructor.
     */
    public CDTUpdateController() {
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
    public void onActivate(final IEditorPart editor) {
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
    public void selectionChanged(final SelectionChangedEvent event) {
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void copy(AbstractViewUpdateController source) {

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
    public void onDiagramUpdate(Object model, KlighdSynthesisProperties properties) {        
    }
    
    // -- Save Listener
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void onEditorSaved(final IEditorPart editor) {
        updateModel(readModel(editor));
    }

    // -- Utility
    // -------------------------------------------------------------------------

    /**
     * Reads the model from given CDT editor.
     * 
     * @param editor
     *            IEditorPart containing model
     * @return  Object model
     */
    protected static Object readModel(final IEditorPart editor) {
        if (editor instanceof CEditor) {
            CDTProcessor CDTProcessor = Guice.createInjector().getInstance(CDTProcessor.class);
            return CDTProcessor.createFromEditor(editor);
        }
        return null;
    }
}
