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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.IMemento;

import com.google.common.collect.Iterables;

import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.core.properties.Property;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.klighd.KlighdDataManager;
import de.cau.cs.kieler.klighd.internal.ISynthesis;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * This sub-menu handles different available synthesis for models including special one for EMF and
 * Xtext models.
 * 
 * @author als
 * @kieler.design 2015-06-22 proposed
 * @kieler.rating 2015-06-22 proposed yellow
 *
 */
public class SynthesisSelectionMenu extends MenuManager {

    /** Property to indicate the use of a fallback synthesis. */
    public static final IProperty<Boolean> USE_FALLBACK_SYSTHESIS = new Property<Boolean>(
            "de.cau.cs.kieler.kico.klighd.systhesis.fallback", false);

    /** Special synthesis IDs. */
    private static final String ECORE_SYNTHESIS = "EMF";// EcoreSynthesis.ID;
    private static final String XTEXT_SYNTHESIS = "XTEXT";// XtextSynthesis.ID;

    /** Map of all selections made until now. */
    private final HashMap<Class<? extends Object>, String> selections =
            new HashMap<Class<? extends Object>, String>();

    /** Class of the model currently associated with the menu configuration. */
    private Class<? extends Object> modelClass;

    /** The related ModelView. */
    private final ModelView modelView;

    // -- Constructor
    // -------------------------------------------------------------------------

    /**
     * Default Constructor.
     * 
     * @param modelView
     *            The parent model view of this menu.
     */
    public SynthesisSelectionMenu(ModelView modelView) {
        this.modelView = modelView;
        this.setMenuText("Synthesis");
    }

    // -- State
    // -------------------------------------------------------------------------

    /**
     * Copies the internal state of another SynthesisSelectionMenu.
     * 
     * @param source
     *            the SynthesisSelectionMenu to copy from
     */
    public void copy(SynthesisSelectionMenu source) {
        selections.putAll(source.selections);
    }

    /**
     * Clears all made selections.
     */
    public void clear() {
        selections.clear();
    }

    /**
     * Saves the current state into a memento.
     * 
     * @param memento
     */
    public void saveState(IMemento memento) {
        for (Entry<Class<? extends Object>, String> entry : selections.entrySet()) {
            memento.putString(entry.getKey().getName(), entry.getValue());
        }
    }

    /**
     * Loads saved state form a memento.
     * 
     * @param memento
     */
    public void loadState(IMemento memento) {
        for (String key : memento.getAttributeKeys()) {
            String value = memento.getString(key);
            try {
                Class<? extends Object> clazz = Class.forName(key);
                selections.put(clazz, value);
            } catch (ClassNotFoundException e) {
                // Do nothing, just fail
            }
        }
    }

    // -- Menu Update
    // -------------------------------------------------------------------------

    /**
     * Updates this menu according to given model.
     * 
     * @param model
     *            The model
     */
    public void update(Object model) {
        if (model != null) {
            KlighdDataManager kdm = KlighdDataManager.getInstance();
            Class<? extends Object> newModelClass = model.getClass();
            if (!newModelClass.equals(modelClass)) {
                // If model type changed
                removeAll();

                HashMap<String, Action> actionMap = new HashMap<String, Action>();
                ISynthesis[] availableSynthesis =
                        Iterables.toArray(kdm.getAvailableSyntheses(newModelClass),
                                ISynthesis.class);

                // Add model specific synthesis
                for (ISynthesis synthesis : availableSynthesis) {
                    String id = kdm.getSynthesisID(synthesis);
                    actionMap.put(id, createAction(newModelClass, id));
                }

                // Add general EObject synthesis
                if (model instanceof EObject) {
                    actionMap.put(ECORE_SYNTHESIS, createAction(newModelClass, ECORE_SYNTHESIS));
                    actionMap.put(XTEXT_SYNTHESIS, createAction(newModelClass, XTEXT_SYNTHESIS));
                }

                // Set selected synthesis item checked
                if (getItems().length > 0) {
                    String selectedID = selections.get(newModelClass);
                    if (selectedID != null) {
                        actionMap.get(selections.get(newModelClass)).setChecked(true);
                    } else if (availableSynthesis.length > 0) {
                        String id =
                                kdm.getSynthesisID(availableSynthesis[availableSynthesis.length - 1]);
                        actionMap.get(id).setChecked(true);
                        selections.put(newModelClass, id);
                    } else if (model instanceof EObject) {
                        actionMap.get(ECORE_SYNTHESIS).setChecked(true);
                        selections.put(newModelClass, ECORE_SYNTHESIS);
                    }
                }
            }
            modelClass = newModelClass;
        } else {
            removeAll();
            modelClass = null;
        }
    }

    private Action createAction(final Class<? extends Object> clazz, final String id) {
        Action action = new Action(id, IAction.AS_RADIO_BUTTON) {

            @Override
            public void run() {
                if (isChecked()) {
                    selections.put(clazz, id);
                    modelView.updateDiagram();
                }
            }
        };
        action.setToolTipText(id);
        // Add action to this menu
        add(action);
        return action;
    }

    // -- Synthesis
    // -------------------------------------------------------------------------

    /**
     * Returns the synthesis which should be used for the given model. Additionally a flag is return
     * to indicate if the model must be prepared (transformed) before the synthesis.
     * 
     * @param model
     *            the model
     * @param properties
     *            current configuration
     * @return A pair of the synthesis and the indicator flag for preparation. Returns (null, false)
     *         is no synthesis is found.
     */
    public Pair<ISynthesis, Boolean> getSynthesis(Object model, KlighdSynthesisProperties properties) {
        KlighdDataManager kdm = KlighdDataManager.getInstance();
        if (model != null) {
            if (properties.getProperty(USE_FALLBACK_SYSTHESIS)) {
                // In this case the first synthesis failed
                String synthesisID =
                        properties
                                .getProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS);
                if (synthesisID == null
                        || !(synthesisID.equals(ECORE_SYNTHESIS) || synthesisID
                                .equals(XTEXT_SYNTHESIS)) && model instanceof EObject) {
                    return new Pair<ISynthesis, Boolean>(
                            kdm.getDiagramSynthesisById(ECORE_SYNTHESIS), true);
                }
            } else {
                String selectedID = selections.get(model.getClass());
                if (selectedID != null) {
                    // Return selected synthesis
                    if (selectedID.equals(ECORE_SYNTHESIS) || selectedID.equals(XTEXT_SYNTHESIS)) {
                        return new Pair<ISynthesis, Boolean>(
                                kdm.getDiagramSynthesisById(selectedID), true);
                    } else {
                        return new Pair<ISynthesis, Boolean>(
                                kdm.getDiagramSynthesisById(selectedID), false);
                    }
                } else {
                    // In case of no selection take first available synthesis
                    Iterable<ISynthesis> availableSyntheses =
                            kdm.getAvailableSyntheses(model.getClass());
                    if (availableSyntheses != null) {
                        Iterator<ISynthesis> iterator = availableSyntheses.iterator();
                        if (iterator.hasNext()) {
                            return new Pair<ISynthesis, Boolean>(iterator.next(), false);
                        }
                    }
                }
            }
        }
        return new Pair<ISynthesis, Boolean>(null, false);
    }

    /**
     * Prepares the model for the specific synthesis.
     * 
     * @param model
     *            the model
     * @param synthesis
     *            the synthesis
     * @param properties
     *            synthesis configuration
     * @return The prepared model
     * @throws Exception
     *             if model cannot be prepared
     */
    public Object prepareModel(Object model, ISynthesis synthesis,
            KlighdSynthesisProperties properties) throws Exception {
        String synthesisID = KlighdDataManager.getInstance().getSynthesisID(synthesis);
        // Only the special EObject syntheses need a wrap up in special models
        if (synthesisID != null && model instanceof EObject) {
            if (synthesisID.equals(ECORE_SYNTHESIS)) {
                // TODO return new EcoreSynthesisModel((EObject) model);
            } else if (synthesisID.equals(XTEXT_SYNTHESIS)) {
                // TODO return new XtextSynthesisModel((EObject) model);
            }
        }
        // else
        throw new Exception("Cannot prepare model for given synthsis");
        //
        // if (model instanceof EObject && !(model instanceof CodePlaceHolder) && controller !=
        // null) {
        //
        // String editorID = null;
        // // Adding file extension
        // ResourceExtension resourceExtension =
        // KiCoPlugin.getInstance().getResourceExtension(model);
        // String resourceExtensionString = "txt";
        // if (resourceExtension != null) {
        // resourceExtensionString = resourceExtension.getExtension();
        // }
        // // TODO Cannot open xtext editor because it fails to create a resource for
        // // the special StringEditorInput because it has no path
        // ResourceExtension ext = KiCoPlugin.getInstance().getResourceExtension(model);
        // if (ext != null) {
        // editorID = ext.getEditorID();
        // }
        // updateDiagram(new CodePlaceHolder(controller.getResourceName(activeEditor, model),
        // KiCoUtil.serialize((EObject) model, null, false), editorID,
        // resourceExtensionString), properties);
        // }
    }
}
