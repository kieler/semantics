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
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IMemento;

import de.cau.cs.kieler.kico.klighd.view.ModelView;
import de.cau.cs.kieler.kiml.config.ILayoutConfig;
import de.cau.cs.kieler.klighd.IViewer;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * 
 * Abstract controller for the {@link ModelView}.
 * <p>
 * The controller handles the update of the displayed model.
 * 
 * @author als
 * @kieler.design 2015-06-29 proposed
 * @kieler.rating 2015-06-29 proposed yellow
 *
 */
public abstract class AbstractModelUpdateController implements ISelectionChangedListener {

    /** Indicated if this controller is active and should update the ModelView. */
    private IEditorPart editor;
    /** The related ModelView. */
    protected final ModelView modelView;
    /** The current model. */
    private Object model;
    /** The current properties. */
    private KlighdSynthesisProperties properties;

    /**
     * Default Constructor.
     * <p>
     * All extending classes need a Constructor with this one Attribute to be instantiated.
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
     * Activates this controller for the given {@link IEditorPart}.
     * 
     * @param editor
     *            the associated editor
     */
    public final void activate(IEditorPart editor) {
        if (editor != null) {
            this.editor = editor;
            onActivate(editor);
        } else {
            throw new NullPointerException("Cannot activate UpdateController without editor");
        }
    }

    /**
     * Deactivates this controller.
     */
    public final void deactivate() {
        onDeactivate();
        this.editor = null;
    }

    /**
     * Invoked when the controller is activated for as specific {@link IEditorPart}. A controller
     * will not be activated twice without a deactivation in between.
     * <p>
     * Usually the controller should read the model form the new editor.
     * 
     * @param editor
     *            new editor
     */
    abstract public void onActivate(IEditorPart editor);

    /**
     * Invoked when the controller is deactivated. This method may be invoked multiple times without
     * activation in between.
     * <p>
     * Usually the controller should stop listening to the editor and free all related resources.
     */
    abstract public void onDeactivate();

    /**
     * Returns is this controller is currently active and can update die ModelView.
     * 
     * @return active state
     */
    public final boolean isActive() {
        return editor != null;
    }

    // -- Update
    // -------------------------------------------------------------------------

    /**
     * Perform an update of the {@link ModelView} with the update model and properties.
     * 
     * @param model
     *            the model may be null to show no model
     * @param properties
     *            the properties for the synthesis of the model, may be to use standard
     *            configuration
     */
    protected final void updateModel(Object model, KlighdSynthesisProperties properties) {
        this.model = model;
        this.properties = properties;
        modelView.updateDiagram();
    }

    /**
     * @see updateModel(Object model, KlighdSynthesisProperties properties)
     * 
     * @param model
     *            the model may be null to show no model
     */
    protected final void updateModel(Object model) {
        updateModel(model, properties);
    }

    /**
     * The updated model.
     * 
     * @return the model or null if no model available
     */
    public final Object getModel() {
        return model;
    }

    /**
     * The synthesis properties to use when displaying the model. Returns never null.
     * 
     * @return the properties
     */
    public final KlighdSynthesisProperties getProperties() {
        if (properties != null) {
            return properties;
        } else {
            return new KlighdSynthesisProperties();
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
     * Saves the given model into given file.
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
     * Returns the related editor.
     * 
     * @return The related editor or null if this controller is not active
     */
    public IEditorPart getEditor() {
        return editor;
    }

}
