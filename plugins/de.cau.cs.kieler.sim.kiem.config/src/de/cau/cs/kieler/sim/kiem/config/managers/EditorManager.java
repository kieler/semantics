/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kiem.config.managers;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.sim.kiem.config.data.ConfigDataComponent;
import de.cau.cs.kieler.sim.kiem.config.data.EditorDefinition;
import de.cau.cs.kieler.sim.kiem.config.data.EditorIdWrapper;
import de.cau.cs.kieler.sim.kiem.config.data.KiemConfigEvent;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.data.Tools;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;

/**
 * Manages the editors including editor names and editor ids.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public final class EditorManager extends AbstractManager {

    /** the default editor id. */
    public static final String CODED_DEFAULT_EDITOR_ID = "de.cau.cs.kieler."
            + "synccharts.diagram.part.SyncchartsDiagramEditorID";

    /** the default editor name. */
    public static final String DEFAULT_EDITOR_NAME = "Synccharts Diagram Editing";

    /** The singleton instance of this manager. */
    private static EditorManager instance = null;

    /** The list of editors. */
    private List<EditorDefinition> editors = null;

    // --------------------------------------------------------------------------

    /**
     * Singleton pattern.
     */
    private EditorManager() {
        super();
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the singleton instance.
     * 
     * @return the instance
     */
    public static synchronized EditorManager getInstance() {
        if (instance == null) {
            instance = new EditorManager();
        }
        return instance;
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Add a new editor to the list.
     * <p>
     * If a definition with the same name is already present the method returns
     * that definition instead of the one passed to it.
     * 
     * @param newDefinition
     *            the definition to add.
     * @return the added definition
     */
    public EditorDefinition addEditor(final EditorDefinition newDefinition) {
        EditorDefinition result = null;

        if (newDefinition != null) {
            // check to see if editor exists
            for (EditorDefinition editor : getEditors()) {
                if (editor != null) {
                    if (editor.getEditorId()
                            .equals(newDefinition.getEditorId())) {
                        result = editor;
                        break;
                    }
                }
            }

            if (result == null) {
                // editor doesn't exist, create it
                result = newDefinition;
                editors.add(newDefinition);
            }
        }
        return result;
    }

    // --------------------------------------------------------------------------

    /**
     * Get the matching editor definition containing the specified editorId.
     * 
     * @param editorId
     *            the id to look for
     * @return the matching editor, or null if none was found.
     */
    public EditorDefinition findEditorById(final EditorIdWrapper editorId) {
        EditorDefinition result = null;

        if (editorId != null) {
            for (EditorDefinition editor : getEditors()) {
                if (editor != null && editor.supports(editorId)) {
                    result = editor;
                    break;
                }
            }
        }

        return result;
    }

    /**
     * Find an editor based on the editors name.
     * 
     * @param name
     *            the name of the editor to look for
     * @return the editor that was found or null
     */
    public EditorDefinition findEditorByName(final String name) {
        EditorDefinition result = null;

        for (EditorDefinition editor : getEditors()) {
            if (editor != null && editor.getName().equals(name)) {
                result = editor;
                break;
            }
        }

        return result;
    }

    // --------------------------------------------------------------------------

    /**
     * Remove an editor from the list.
     * <p>
     * Removes the editor support from all schedules as well.
     * 
     * @param editor
     *            the editor to remove
     */
    public void removeEditor(final EditorDefinition editor) {
        if (editor != null) {
            getEditors().remove(editor);

            // remove the editor from all schedules
            for (ScheduleData data : ScheduleManager.getInstance()
                    .getAllSchedules()) {
                data.removeEditor(editor.getEditorId());
            }

            if (editor.getEditorId().equals(getDefaultEditorId())) {
                if (!editors.isEmpty()) {
                    setDefaultEditor(editors.get(0));
                } else {
                    ConfigurationManager.getInstance()
                            .restoreDefaultEditorDefaults();
                    notifyListeners(new KiemConfigEvent(
                            KiemConfigEvent.DEACTIVATED));
                }
            }
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Get the default editor id.
     * 
     * @return the default editors id
     */
    public EditorIdWrapper getDefaultEditorId() {
        EditorIdWrapper result = null;
        String id = CODED_DEFAULT_EDITOR_ID;

        try {
            id = ConfigurationManager.getInstance().findPropertyValue(
                    Tools.DEFAULT_EDITOR_KEY, CODED_DEFAULT_EDITOR_ID);
            result = new EditorIdWrapper(id);
        } catch (KiemPropertyException e0) {
            // can't happen, do nothing
        }
        if (result == null) {
            result = new EditorIdWrapper(CODED_DEFAULT_EDITOR_ID);
        }
        return result;
    }

    /**
     * Get the default editor name.
     * 
     * @return the default editors name
     */
    public String getDefaultEditorName() {
        String result = DEFAULT_EDITOR_NAME;
        try {
            result = ConfigurationManager.getInstance().findPropertyValue(
                    Tools.DEFAULT_EDITOR_NAME_KEY, DEFAULT_EDITOR_NAME);
        } catch (KiemPropertyException e0) {
            // can't happen, do nothing
        }
        return result;
    }

    /**
     * Get the default editor.
     * 
     * @return the default editor.
     */
    public EditorDefinition getDefaultEditor() {
        EditorDefinition result = null;
        for (EditorDefinition editor : getEditors()) {
            if (editor.getEditorId().equals(getDefaultEditorId())) {
                result = editor;
                break;
            }
        }
        if (result == null) {
            result = new EditorDefinition(getDefaultEditorName(),
                    getDefaultEditorId());
            editors.add(result);
        }
        return result;
    }

    /**
     * Set the default editor.
     * 
     * @param defaultEditor
     *            the new default editor.
     */
    public void setDefaultEditor(final EditorDefinition defaultEditor) {
        if (defaultEditor != null) {
            ConfigDataComponent manager = ConfigurationManager.getInstance()
                    .getDefaultConfig();

            manager.updateProperty(Tools.DEFAULT_EDITOR_KEY, defaultEditor
                    .getEditorId().getString());
            manager.updateProperty(Tools.DEFAULT_EDITOR_NAME_KEY, defaultEditor
                    .getName());
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the list of all editors.
     * 
     * @return The list of all editors.
     */
    public List<EditorDefinition> getEditors() {
        load();
        Iterator<EditorDefinition> iter = editors.iterator();
        while (iter.hasNext()) {
            if (iter.next() == null) {
                iter.remove();
            }
        }
        return editors;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void load() {
        if (editors == null) {
            editors = new LinkedList<EditorDefinition>();

            String input = super.load(Tools.EDITOR_IDS_KEY, null);

            if (input != null) {
                String[] array = Tools.getValueList(Tools.EDITOR_NAME, input);

                if (array != null) {
                    for (String s : array) {
                        if (s != null) {
                            editors.add(EditorDefinition.fromString(s));
                        }
                    }
                }
            }
            // add the default editor if not in advanced user mode
            if (editors.isEmpty()
                    && !ContributionManager.getInstance().isInAdvancedMode()) {

                EditorDefinition defaultEditor = new EditorDefinition(
                        DEFAULT_EDITOR_NAME, new EditorIdWrapper(
                                CODED_DEFAULT_EDITOR_ID));
                editors.add(defaultEditor);

            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save() {
        if (!getEditors().isEmpty()) {

            StringBuilder builder = new StringBuilder();
            for (EditorDefinition e : editors) {
                if (e != null) {
                    builder.append(Tools.putValue(Tools.EDITOR_NAME, e
                            .toSerialString()));
                }
            }

            super.save(Tools.EDITOR_IDS_KEY, builder.toString());
        } else {
            super.remove(Tools.EDITOR_IDS_KEY);
        }
    }
}
