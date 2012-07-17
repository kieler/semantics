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
package de.cau.cs.kieler.core.model.preferences;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cau.cs.kieler.core.model.CoreModelPlugin;
import de.cau.cs.kieler.core.model.validation.ValidationManager;

/**
 * The preference page for configuring which CheckFile should be used to
 * validate the different diagrams.
 * 
 * @author soh
 */
public class ValidationManagerPreferencePage extends FieldEditorPreferencePage
        implements IWorkbenchPreferencePage {

    /** The list of field editors. */
    private List<BooleanFieldEditor> editors = new LinkedList<BooleanFieldEditor>();

    /**
     * Creates a preference page.
     */
    public ValidationManagerPreferencePage() {
        super(GRID);
        setDescription("Preference page for the Validation Manager");
    }

    /**
     * Create a field editor for each of the available checkfiles.
     */
    @Override
    protected void createFieldEditors() {
        Set<String> files = ValidationManager.getRegisteredFiles();

        for (String file : files) {
            Composite parent = getFieldEditorParent();
            BooleanFieldEditor enablementFE = new BooleanFieldEditor(
                    ValidationManager.PREFERENCE_PREFIX + file,
                    ValidationManager.getDisplay(file), parent);
            super.addField(enablementFE);
            editors.add(enablementFE);

            // set the tool tip
            String tooltip = ValidationManager.getTooltip(file);
            enablementFE.getDescriptionControl(parent).setToolTipText(tooltip);
        }
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public boolean performOk() {
        if (!super.performOk()) {
            return false;
        }

        // write the values back to the validation manager
        for (BooleanFieldEditor bfe : editors) {
            String key = bfe.getLabelText();
            Boolean value = bfe.getBooleanValue();
            ValidationManager.setEnabled(key, value);
        }
        // update the enabled/disabled checks
        ValidationManager.refreshChecks();
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public void init(final IWorkbench workbench) {
        setPreferenceStore(CoreModelPlugin.getDefault().getPreferenceStore());
        Set<String> files = ValidationManager.getRegisteredFiles();
        IPreferenceStore store = getPreferenceStore();

        // synchronize the preference store and the values in the manager
        for (String file : files) {
            String key = ValidationManager.PREFERENCE_PREFIX + file;
            Boolean value = ValidationManager.isEnabled(file);
            if (store.contains(key)) {
                Boolean storeValue = store.getBoolean(key);
                if (value != storeValue) {
                    ValidationManager.setEnabled(file, storeValue);
                }
            } else {
                store.setValue(key, value);
            }
        }
    }
}
