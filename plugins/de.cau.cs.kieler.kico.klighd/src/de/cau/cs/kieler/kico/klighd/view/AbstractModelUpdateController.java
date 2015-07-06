/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.view;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IMemento;

import de.cau.cs.kieler.kiml.config.ILayoutConfig;
import de.cau.cs.kieler.klighd.IViewer;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * 
 * Abstract controller for the ModelView.
 * <p>
 * The controller handles the update of the displayed model.
 * 
 * @author als
 * @kieler.design 2015-06-29 proposed
 * @kieler.rating 2015-06-29 proposed yellow
 *
 */
public abstract class AbstractModelUpdateController {

    /** Indicated if this controller is active and should update the ModelView */
    private boolean active = false;
    /** The related ModelView */
    private final ModelView modelView;

    /**
     * Default Constructor.
     * 
     * @param modelView
     *            the ModelView this controller is associated with
     */
    public AbstractModelUpdateController(ModelView modelView) {
        this.modelView = modelView;
    }

    /**
     * Returns the ID of this controller.
     * <p>
     * This must be consistent to the ID used in the registration in the extension point.
     * 
     * @return the ID
     */
    abstract public String getID();

    // -- Initialization
    // -------------------------------------------------------------------------

    /**
     * Creates a new ModelUpdateController with the same logic and preferences as the current one.
     * 
     * @param modelView
     *            modelView to associate the new controller with
     * @return the new controller instance
     */
    abstract public AbstractModelUpdateController clone(ModelView modelView);

    /**
     * Resets all properties to default values.
     */
    abstract public void reset();

    /**
     * Saves configuration into a memento.
     * 
     * @param memento
     *            configuration store
     */
    abstract public void saveState(IMemento memento);

    /**
     * Loads saved configuration form a memento.
     * 
     * @param memento
     *            saved configuration
     */
    abstract public void loadState(IMemento memento);

    // -- Activation
    // -------------------------------------------------------------------------

    /**
     * Sets the active state of this controller.
     * 
     * @param active
     *            state
     */
    final void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Returns is this controller is currently active and can update die ModelView.
     * 
     * @return active state
     */
    public final boolean isActive() {
        return active;
    }

    // -- Update
    // -------------------------------------------------------------------------

    /**
     * Updates the model and diagram of the model view.
     * 
     * @param model
     *            model to display
     * @param properties
     *            configuration
     */
    protected final void updateModel(Object model, KlighdSynthesisProperties properties) {
        if (active) {
            modelView.setModel(model);
            modelView.updateDiagram(properties);
        }
    }

    /**
     * Updates the model and diagram of the model view.
     * 
     * @param model
     *            model to display
     */
    protected final void updateModel(Object model) {
        if (active) {
            modelView.setModel(model);
            modelView.updateDiagram();
        }
    }

    /**
     * Returns the layout configuration for the diagram.
     * 
     * @return configuration or null
     */
    public ILayoutConfig getLayoutConfig() {
        return null;
    }

    // -- Events
    // -------------------------------------------------------------------------

    /**
     * Invoked when the related editor is saved.
     * <p>
     * Normally the controller should read the new model form the editor.
     * 
     * @param editor
     *            saved editor
     */
    abstract public void onEditorSaved(IEditorPart editor);

    /**
     * Invoked when the related editor changed.
     * <p>
     * Normally the controller should read the model form the new editor.
     * 
     * @param editor
     *            new editor
     */
    abstract public void onEditorChanged(IEditorPart editor);

    /**
     * Invoked when the ModelView finished updating the displayed diagram.
     * 
     * @param model
     *            displayed model
     * @param properties
     *            used properties
     */
    abstract public void onDiagramUpdate(Object model, KlighdSynthesisProperties properties,
            IViewer viewer);

    /**
     * Invoked when the ModelView of this controller is disposed.
     */
    abstract public void onDispose();

    // -- Model
    // -------------------------------------------------------------------------

    /**
     * Saved the given model into given file.
     * 
     * @param model
     *            model to save
     * @param file
     *            target file
     * @param uri
     *            location of the file
     * @throws Exception
     */
    abstract public void saveModel(Object model, IFile file, URI uri) throws Exception;

    /**
     * Returns the name of the file or resource including a proper file extension of the model.
     * 
     * @param editor
     *            the editor this model is related to
     * @param model
     *            the model
     * @return String not null.
     */
    abstract public String getResourceName(IEditorPart editor, Object model);

    // -- View
    // -------------------------------------------------------------------------

    /**
     * Added the controller related actions to the menu and toolbar.
     * 
     * @param toolBar
     * @param menu
     */
    abstract public void addContributions(IToolBarManager toolBar, IMenuManager menu);

    // -- ModelView Getter
    // -------------------------------------------------------------------------

    /**
     * Returns the related editor of the ModelView.
     * 
     * @return The related editor or null
     */
    public IEditorPart getEditor() {
        return modelView.getEditor();
    }

    /**
     * Returns the ModelView of this controller.
     * 
     * @return The related ModelView
     */
    public final ModelView getModelView() {
        return modelView;
    }

}
