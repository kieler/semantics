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
package de.cau.cs.kieler.sim.kiem.ui.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;

/**
 * Main preference page for the KIELER Simulation project. All Simulation subprojects should put their
 * preference pages into this page.
 * 
 * @author msp, cmot
 */
public class KielerSimPreferencePage extends FieldEditorPreferencePage
        implements IWorkbenchPreferencePage {

    /**
     * Creates a KIELER Simulation preference page.
     */
    public KielerSimPreferencePage() {
        super(GRID);
        setDescription("Select one of the KIELER Simulation preference categories to customize it.");
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
        setPreferenceStore(KiemPlugin.getDefault().getPreferenceStore());
    }

}
