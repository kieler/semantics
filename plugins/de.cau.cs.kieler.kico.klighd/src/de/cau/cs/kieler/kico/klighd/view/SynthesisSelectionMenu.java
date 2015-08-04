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

    /**
     * Map of Synthesis independent from model
     * <p>
     * The initialization of this map is done by {@link ModelUpdateControllerManager}
     */
    private static final HashMap<String, ISelectableGeneralSynthesis> selectableGeneralSyntheses =
            new HashMap<String, ISelectableGeneralSynthesis>();

    /** The general fallback synthesis */
    private static final EcoreGeneralSynthesis fallbackSynthesis = new EcoreGeneralSynthesis();

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

    // -- Special Synthesis Items
    // -------------------------------------------------------------------------

    static void addGeneralSynthesis(String id, ISelectableGeneralSynthesis generalSynthesis) {
        if (id != null && !id.isEmpty() && generalSynthesis != null) {
            selectableGeneralSyntheses.put(id, generalSynthesis);
        } else {
            throw new IllegalArgumentException("Any argument is null or emptystring");
        }
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
                for (ISelectableGeneralSynthesis data : selectableGeneralSyntheses.values()) {
                    if (data.isApplicable(model)) {
                        actionMap.put(data.getID(), createAction(newModelClass, data.getID()));
                    }
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
                        actionMap.get(EcoreModelSynthesis.ID).setChecked(true);
                        selections.put(newModelClass, EcoreModelSynthesis.ID);
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

    private Action createAction(final Class<? extends Object> clazz, final String id) {
        // get name from id
        String name = id;
        if (id.contains(".") && !id.endsWith(".")) {
            name = id.substring(id.lastIndexOf('.') + 1);
        }
        Action action = new Action(name, IAction.AS_RADIO_BUTTON) {

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
     * Returns the synthesis which should be used for the given model. Additionally returns the
     * model. The return model may differ from the original model if the synthesis need the model
     * prepared (transformed) before the synthesis run.
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
            if (properties.getProperty(USE_FALLBACK_SYSTHESIS)) {
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
                String selectedID = selections.get(model.getClass());
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
