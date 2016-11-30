/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;


/**
 * Main preference page for the KIELER SCCharts project. All SCCharts related projects should put their
 * preference pages into this page.
 * 
 * @author cmot
 */
public class KielerSCChartsPreferencePage extends FieldEditorPreferencePage
        implements IWorkbenchPreferencePage {

    /**
     * Creates a KIELER Simulation preference page.
     */
    public KielerSCChartsPreferencePage() {
        super(GRID);
        setDescription("Select one of the KIELER SCCharts preference categories to customize it.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void createFieldEditors() {
        // FIXME no KIELER-wide preferences yet; empty pages are not allowed
        // according to Eclipse conventions
    }

    /**
     * {@inheritDoc}
     */
    public void init(final IWorkbench workbench) {
        setPreferenceStore(SCChartsPreferencesPlugin.getDefault().getPreferenceStore());
    }

}
