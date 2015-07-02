/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.custom.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cau.cs.kieler.synccharts.custom.Messages;
import de.cau.cs.kieler.synccharts.custom.SyncChartsCustomPlugin;

/**
 * Main preference page for the KIELER SyncCharts project. All subprojects should put their
 * preference pages into this page.
 * 
 * @author msp, chsch (created by copying KielerPreferencePage)
 */
public class KielerSyncChartsPreferencePage extends FieldEditorPreferencePage
        implements IWorkbenchPreferencePage {

    /**
     * Creates a KIELER SyncCharts preference page.
     */
    public KielerSyncChartsPreferencePage() {
        super(GRID);
        setDescription(Messages.KielerSyncChartsPreferencePage_Text);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void createFieldEditors() {
        // FIXME no KIELER SyncCharts-wide preferences yet; empty pages are not allowed
        // according to Eclipse conventions
    }

    /**
     * {@inheritDoc}
     */
    public void init(final IWorkbench workbench) {
        setPreferenceStore(SyncChartsCustomPlugin.getDefault().getPreferenceStore());
    }

}
