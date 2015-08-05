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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IMemento;

import com.google.common.collect.Iterables;

import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.core.properties.Property;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.kico.klighd.view.model.EcoreGeneralSynthesis;
import de.cau.cs.kieler.kico.klighd.view.model.EcoreModelSynthesis;
import de.cau.cs.kieler.klighd.KlighdDataManager;
import de.cau.cs.kieler.klighd.internal.ISynthesis;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * This sub-menu handles different available synthesis for models including general syntheses
 * implementing {@link ISelectableGeneralSynthesis}.
 * 
 * @author als
 * @kieler.design 2015-06-22 proposed
 * @kieler.rating 2015-06-22 proposed yellow
 *
 */
public class SynthesisSelectionMenu extends MenuManager {

    /**
     * Map of Synthesis independent from model.
     * <p>
     * The initialization of this map is done by {@link ModelUpdateControllerFactory}
     */
    private static final HashMap<String, ISelectableGeneralSynthesis> selectableGeneralSyntheses =
            new HashMap<String, ISelectableGeneralSynthesis>();

    /** The general fallback synthesis. */
    private static final EcoreGeneralSynthesis fallbackSynthesis = new EcoreGeneralSynthesis();

    /**
     * Map of all selections made until now.
     * <p>
     * The model classes are saved as classname because this menu should be saved in a memento.
     */
    private final HashMap<String, String> selections = new HashMap<String, String>();

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

    // -- Special Synthesis Items
    // -------------------------------------------------------------------------

    /**
     * Adds an {@link ISelectableGeneralSynthesis} to be available for selection.
     * 
     * @param id
     *            the id
     * @param generalSynthesis
     *            the general synthesis
     */
    public static void addGeneralSynthesis(String id, ISelectableGeneralSynthesis generalSynthesis) {
        if (id != null && !id.isEmpty() && generalSynthesis != null) {
            selectableGeneralSyntheses.put(id, generalSynthesis);
        } else {
            throw new IllegalArgumentException("Any argument is null or emptystring");
        }
    }

    // -- State
    // -------------------------------------------------------------------------

    /**
     * Copies the internal state of another {@link SynthesisSelectionMenu}.
     * 
     * @param source
     *            the {@link SynthesisSelectionMenu} to copy from
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
        for (Entry<String, String> entry : selections.entrySet()) {
            memento.putString(entry.getKey(), entry.getValue());
        }
    }

    /**
     * Loads saved state form a memento.
     * 
     * @param memento
     */
    public void loadState(IMemento memento) {
        for (String key : memento.getAttributeKeys()) {
            selections.put(key, memento.getString(key));
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
            String newModelClassName = newModelClass.getCanonicalName();
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
                    actionMap.put(id, createAction(newModelClassName, id));
                }

                // Add general EObject synthesis
                for (ISelectableGeneralSynthesis data : selectableGeneralSyntheses.values()) {
                    if (data.isApplicable(model)) {
                        actionMap.put(data.getID(), createAction(newModelClassName, data.getID()));
                    }
                }

                // Set selected synthesis item checked
                if (getItems().length > 0) {
                    String selectedID = selections.get(newModelClassName);
                    if (selectedID != null) {
                        actionMap.get(selections.get(newModelClassName)).setChecked(true);
                    } else if (availableSynthesis.length > 0) {
                        String id =
                                kdm.getSynthesisID(availableSynthesis[availableSynthesis.length - 1]);
                        actionMap.get(id).setChecked(true);
                        selections.put(newModelClassName, id);
                    } else if (model instanceof EObject) {
                        actionMap.get(EcoreModelSynthesis.ID).setChecked(true);
                        selections.put(newModelClassName, EcoreModelSynthesis.ID);
                    }
                }
                this.updateAll(false);
            }
            modelClass = newModelClass;
        } else {
            removeAll();
            modelClass = null;
        }
    }

    /**
     * Creates a new action item and adds it to this menu.
     * <p>
     * The action selects the given is as synthesis for the given class.
     * 
     * @param className
     *            the class name this item chooses for
     * @param id
     *            the synthsis id to set
     * @return the created action
     */
    private Action createAction(final String className, final String id) {
        // Parse name from id
        String name = id;
        if (id.contains(".") && !id.endsWith(".")) {
            name = id.substring(id.lastIndexOf('.') + 1);
        }
        // create item
        Action action = new Action(name, IAction.AS_RADIO_BUTTON) {

            @Override
            public void run() {
                if (isChecked()) {
                    selections.put(className, id);
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
     * Returns the synthesis which should be used for the given model and the model. The return
     * model may differ from the original model if the synthesis needs the model prepared
     * (transformed) before the synthesis run.
     * 
     * @param model
     *            the model
     * @param properties
     *            current configuration
     * @return A pair of the synthesis and the prepared model. Returns (null, model) is no synthesis
     *         is found.
     */
    public Pair<ISynthesis, Object> getSynthesis(Object model, IEditorPart editor,
            KlighdSynthesisProperties properties) {
        KlighdDataManager kdm = KlighdDataManager.getInstance();
        if (model != null) {
            if (properties.getProperty(ModelViewProperties.USE_FALLBACK_SYSTHESIS)) {
                // In this case the first synthesis failed
                String synthesisID =
                        properties
                                .getProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS);

                if ((synthesisID == null || !synthesisID.equals(fallbackSynthesis.getSynthesisID()))
                        && fallbackSynthesis.isApplicable(model)) {
                    return new Pair<ISynthesis, Object>(
                            kdm.getDiagramSynthesisById(fallbackSynthesis.getSynthesisID()),
                            fallbackSynthesis.prepare(model, editor, properties));
                }
            } else {
                String selectedID = selections.get(model.getClass().getCanonicalName());
                if (selectedID != null) {
                    // Return selected synthesis
                    if (selectableGeneralSyntheses.containsKey(selectedID)) {
                        ISelectableGeneralSynthesis generalSynthesis =
                                selectableGeneralSyntheses.get(selectedID);
                        // Prepare only if special synthesis is selected
                        return new Pair<ISynthesis, Object>(
                                kdm.getDiagramSynthesisById(generalSynthesis.getSynthesisID()),
                                generalSynthesis.prepare(model, editor, properties));
                    } else {
                        return new Pair<ISynthesis, Object>(
                                kdm.getDiagramSynthesisById(selectedID), model);
                    }
                } else {
                    // In case of no selection take first available synthesis
                    Iterable<ISynthesis> availableSyntheses =
                            kdm.getAvailableSyntheses(model.getClass());
                    if (availableSyntheses != null) {
                        Iterator<ISynthesis> iterator = availableSyntheses.iterator();
                        if (iterator.hasNext()) {
                            return new Pair<ISynthesis, Object>(iterator.next(), model);
                        }
                    }
                }
            }
        }
        return new Pair<ISynthesis, Object>(null, null);
    }

}
