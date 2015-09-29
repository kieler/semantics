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

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IMemento;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.cau.cs.kieler.core.model.util.ModelUtil;
import de.cau.cs.kieler.core.model.util.XtextModelingUtil;
import de.cau.cs.kieler.klighd.IViewer;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * Simple controller for XText and Ecore model editors.
 * 
 * @author als
 * @kieler.design 2015-06-29 proposed
 * @kieler.rating 2015-06-29 proposed yellow
 *
 */
public class DefaultEcoreXtextModelUpdateController extends AbstractModelUpdateController {

    /** Controller ID. */
    private static final String ID =
            "de.cau.cs.kieler.kico.klighd.view.DefaultEcoreXtextModelUpdateController";

    /**
     * Default Constructor.
     * 
     * @param modelView
     *            the ModelView this controller is associated with
     */
    public DefaultEcoreXtextModelUpdateController(ModelView modelView) {
        super(modelView);
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
        return new DefaultEcoreXtextModelUpdateController(modelView);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onEditorSaved(IEditorPart editor) {
        updateModel(readModel(editor));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onEditorChanged(IEditorPart editor) {
        updateModel(readModel(editor));
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
    public void onDiagramUpdate(Object model, KlighdSynthesisProperties properties, IViewer viewer) {
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
