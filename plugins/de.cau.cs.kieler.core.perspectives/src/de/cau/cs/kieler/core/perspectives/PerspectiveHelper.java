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
package de.cau.cs.kieler.core.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.PlatformUI;

/**
 * External definition of common constants and functions for perspective definitions.
 * 
 * @author nbw
 */
public class PerspectiveHelper {

    /** A small view. */
    static final float SMALL = 0.2f;
    /** A medium view, will take 50% space. */
    static final float MEDIUM = 0.5f;
    /** A big view. */
    static final float BIG = 0.7f;

    static final String VIEW_KLIGHD = "de.cau.cs.kieler.kico.klighd.view"; //$NON-NLS-1$
    static final String VIEW_KICO = "de.cau.cs.kieler.kico.selection"; //$NON-NLS-1$
    static final String VIEW_KIEM = "de.cau.cs.kieler.sim.kiem.view"; //$NON-NLS-1$
    static final String VIEW_KIEM_TABLE = "de.cau.cs.kieler.sim.table.view"; //$NON-NLS-1$
    static final String VIEW_KIEM_SIGNALS = "de.cau.cs.kieler.sim.signals.ui.view"; //$NON-NLS-1$
    
    /* IDs of New-Wizards */
    // private static final String WIZ_SYNCCHART =
    //          "de.cau.cs.kieler.synccharts.diagram.part.SyncchartsCreationWizardID"; //$NON-NLS-1$
    // private static final String WIZ_KAOM =
    //          "de.cau.cs.kieler.kaom.diagram.part.KaomCreationWizardID"; //$NON-NLS-1$
    // private static final String WIZ_GRAPHS =
    //          "de.cau.cs.kieler.keg.diagram.part.GraphsCreationWizardID"; //$NON-NLS-1$
    //  private static final String WIZ_GRAPHS_RANDOM = "de.cau.cs.kieler.keg.wizards.randomGraph"; //$NON-NLS-1$
    static final String WIZ_FILE = "org.eclipse.ui.wizards.new.file"; //$NON-NLS-1$
    static final String WIZ_PROJECT = "org.eclipse.ui.wizards.new.project"; //$NON-NLS-1$

    /**
     * Add a view to a folder only if the view exists. This method can be used to add views from
     * other plugins to get no exceptions if the plugin is not loaded.
     * 
     * @param folder
     *            a folder layout
     * @param id
     *            a view identifier
     */
    static void addViewIfExists(final IFolderLayout folder, final String id) {
        // first search the view and only add it, if it is available
        if (PlatformUI.getWorkbench().getViewRegistry().find(id) != null) {
            folder.addView(id);
        }
    }

}
