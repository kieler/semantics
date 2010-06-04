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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cau.cs.kieler.synccharts.ksbase.SyncchartsKsbasePlugin;
import de.cau.cs.kieler.synccharts.ksbase.util.OptimizeUtils;

/**
 * @author soh
 */
public class OptimizationPreferencePage extends FieldEditorPreferencePage
        implements IWorkbenchPreferencePage {

    /** The list of field editors. */
    private List<BooleanFieldEditor> editors = new LinkedList<BooleanFieldEditor>();

    /**
     * Creates a KIELER preference page.
     */
    public OptimizationPreferencePage() {
        super(GRID);
        setDescription("Preference page for the Optimizations");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void createFieldEditors() {
        try {
            List<String> keys = OptimizeUtils.getKeys();

            for (String key : keys) {
                Composite parent = getFieldEditorParent();
                BooleanFieldEditor enablementFE = new BooleanFieldEditor(key,
                        OptimizeUtils.getDisplay(key), parent);
                enablementFE.getDescriptionControl(parent).setToolTipText(
                        OptimizeUtils.getTooltip(key));
                super.addField(enablementFE);
                editors.add(enablementFE);
            }
        } catch (RuntimeException e0) {
            e0.printStackTrace();
            throw e0;
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
        OptimizeUtils.saveConfiguration();
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public void init(final IWorkbench workbench) {
        try {
            OptimizeUtils.loadConfiguration();
            setPreferenceStore(SyncchartsKsbasePlugin.getDefault()
                    .getPreferenceStore());
        } catch (RuntimeException e0) {
            e0.printStackTrace();
            throw e0;
        }
    }

}
