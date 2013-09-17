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
package de.cau.cs.kieler.synccharts.ksbase.preferences;

import java.util.List;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cau.cs.kieler.synccharts.ksbase.SyncchartsKsbasePlugin;
import de.cau.cs.kieler.synccharts.ksbase.util.FixSyncChartUtils;

/**
 * @author soh
 * @kieler.ignore (excluded from review process)
 */
public class FixSyncChartPreferencePage extends FieldEditorPreferencePage
        implements IWorkbenchPreferencePage {

    /**
     * Creates a KIELER preference page.
     */
    public FixSyncChartPreferencePage() {
        super(GRID);
        setDescription("Preference page for the Optimizations");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void createFieldEditors() {
        List<String> keys = FixSyncChartUtils.getKeys();

        for (String key : keys) {
            Composite parent = getFieldEditorParent();
            BooleanFieldEditor enablementFE = new BooleanFieldEditor(key,
                    FixSyncChartUtils.getDisplay(key), parent);
            enablementFE.getDescriptionControl(parent).setToolTipText(
                    FixSyncChartUtils.getTooltip(key));
            super.addField(enablementFE);
        }

        List<String> choiceKeys = FixSyncChartUtils.getChoiceKeys();

        for (String key : choiceKeys) {
            Composite parent2 = getFieldEditorParent();
            String label = FixSyncChartUtils.getDisplay(key);
            int cols = 1;
            String[][] input = getInput(key);
            RadioGroupFieldEditor choiceFE = new RadioGroupFieldEditor(key,
                    label, cols, input, parent2, true);
            super.addField(choiceFE);
        }
    }

    private String[][] getInput(final String key) {
        List<String> options = FixSyncChartUtils.getChoices(key);

        String[][] input = new String[options.size()][2];
        for (int i = 0; i < options.size(); i++) {
            input[i][0] = FixSyncChartUtils.getDisplay(options.get(i));
            input[i][1] = options.get(i);
        }
        return input;
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
        FixSyncChartUtils.saveConfiguration();
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public void init(final IWorkbench workbench) {
        FixSyncChartUtils.loadConfiguration();
        setPreferenceStore(SyncchartsKsbasePlugin.getDefault()
                .getPreferenceStore());
    }

}
