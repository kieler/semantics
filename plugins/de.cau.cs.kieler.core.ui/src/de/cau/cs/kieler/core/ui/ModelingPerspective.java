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
package de.cau.cs.kieler.core.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.PlatformUI;
import org.eclipse.debug.ui.IDebugUIConstants;;

/**
 * A Perspective for the KIELER modeling application. It loads all available
 * KIELER views and sets some New-Wizards as shortcuts into the New-Menu.
 * 
 * @author haf
 */
public class ModelingPerspective implements IPerspectiveFactory {

    /** A small view. */
    public static final float SMALL = 0.2f;
    /** A medium view, will take 50% space. */
    public static final float MEDIUM = 0.5f;
    /** A big view. */
    public static final float BIG = 0.7f;

    // CHECKSTYLEOFF LineLength

    /* To find view IDs, see cookbook in project trac */
    /* IDs of views */
    private static final String VIEW_KEV = "de.cau.cs.kieler.kev.views.KevView"; //$NON-NLS-1$
    private static final String VIEW_KIML_LAYOUT = "de.cau.cs.kieler.kiml.views.layout"; //$NON-NLS-1$
    private static final String VIEW_KIEM = "de.cau.cs.kieler.sim.kiem.view"; //$NON-NLS-1$
    private static final String VIEW_KIEM_TABLE = "de.cau.cs.kieler.sim.table.view"; //$NON-NLS-1$
    private static final String VIEW_KITS = "de.cau.cs.kieler.synccharts.synchronizer.kitsView"; //$NON-NLS-1$

    /* IDs of New-Wizards */
    private static final String WIZ_SYNCCHART = "de.cau.cs.kieler.synccharts.diagram.part.SyncchartsCreationWizardID"; //$NON-NLS-1$
    private static final String WIZ_KAOM = "de.cau.cs.kieler.kaom.diagram.part.KaomCreationWizardID"; //$NON-NLS-1$
    private static final String WIZ_GRAPHS = "de.cau.cs.kieler.keg.diagram.part.GraphsCreationWizardID"; //$NON-NLS-1$
    private static final String WIZ_GRAPHS_RANDOM = "de.cau.cs.kieler.keg.wizards.randomGraph"; //$NON-NLS-1$
    private static final String WIZ_FILE = "org.eclipse.ui.wizards.new.file"; //$NON-NLS-1$
    private static final String WIZ_PROJECT = "org.eclipse.ui.wizards.new.project"; //$NON-NLS-1$

    // CHECKSTYLEON LineLength

    /** {@inheritDoc} */
    public void createInitialLayout(final IPageLayout layout) {
//        IFolderLayout consoleFolder = layout.createFolder(
//                IInternalDebugUIConstants.ID_CONSOLE_FOLDER_VIEW,
//                IPageLayout.BOTTOM,
//                (float)0.75,
//                layout.getEditorArea());
//        consoleFolder.addView(IConsoleConstants.ID_CONSOLE_VIEW);
//        consoleFolder.addView(IPageLayout.ID_TASK_LIST);
//        consoleFolder.addPlaceholder(IPageLayout.ID_BOOKMARKS);
//        consoleFolder.addPlaceholder(IPageLayout.ID_PROP_SHEET);

        // Add RUN and DEBUG buttons in tool bar
        layout.addActionSet(IDebugUIConstants.LAUNCH_ACTION_SET);
        layout.addActionSet(IDebugUIConstants.DEBUG_ACTION_SET);

        createNewWizardShortcuts(layout);
        createViewLayout(layout);
        createViewShortcuts(layout);
    }

    /**
     * Add KIELER Views (and some important Eclipse views) as shortcuts into the
     * View menu.
     * 
     * @param layout
     *            the page layout
     */
    protected void createViewShortcuts(final IPageLayout layout) {
        layout.addShowViewShortcut(VIEW_KEV);
        layout.addShowViewShortcut(VIEW_KIML_LAYOUT);
        layout.addShowViewShortcut(VIEW_KIEM);
        layout.addShowViewShortcut(VIEW_KIEM_TABLE);
        layout.addShowViewShortcut(VIEW_KITS);
        layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
        layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
        layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
        // layout.addShowViewShortcut(IPageLayout.ID_RES_NAV);
        layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);

    }

    /**
     * Add the KIELER views to the layout.
     * 
     * @param layout
     *            the page layout
     */
    protected void createViewLayout(final IPageLayout layout) {
        String editor = layout.getEditorArea();

        // TOP LEFT ==============================================
        IFolderLayout topLeft = layout.createFolder(
                "topLeft", IPageLayout.LEFT, //$NON-NLS-1$
                SMALL, editor);
        // addViewIfExists(topLeft, IPageLayout.ID_RES_NAV);
        // project explorer does not show the new wizard shortcuts...
        addViewIfExists(topLeft, IPageLayout.ID_PROJECT_EXPLORER);

        // BOTTOM LEFT ==============================================
        IFolderLayout bottomLeft = layout.createFolder(
                "bottomLeft", IPageLayout.BOTTOM, //$NON-NLS-1$
                MEDIUM, "topLeft"); //$NON-NLS-1$
        addViewIfExists(bottomLeft, IPageLayout.ID_OUTLINE);

        // add Kieler views to bottom left folder
        addViewIfExists(bottomLeft, VIEW_KIEM_TABLE);

        // BOTTOM =================================================
        IFolderLayout bottom = layout.createFolder(
                "bottom", IPageLayout.BOTTOM, //$NON-NLS-1$
                BIG, editor);
        addViewIfExists(bottom, IPageLayout.ID_PROP_SHEET);
        addViewIfExists(bottom, IPageLayout.ID_PROBLEM_VIEW);
        addViewIfExists(bottom, "org.eclipse.ui.console.ConsoleView"); //$NON-NLS-1$

        // add Kieler views to bottom folder
        addViewIfExists(bottom, VIEW_KEV);
        addViewIfExists(bottom, VIEW_KIML_LAYOUT);
        addViewIfExists(bottom, VIEW_KIEM);
        addViewIfExists(bottom, VIEW_KITS);

        layout.setEditorAreaVisible(true);
    }

    /**
     * Add shortcuts to the New-Dialog to the KIELER wizards.
     * 
     * @param layout
     *            the page layout
     */
    protected void createNewWizardShortcuts(final IPageLayout layout) {
        layout.addNewWizardShortcut(WIZ_PROJECT);
        layout.addNewWizardShortcut(WIZ_FILE);
        layout.addNewWizardShortcut(WIZ_SYNCCHART);
        layout.addNewWizardShortcut(WIZ_KAOM);
        layout.addNewWizardShortcut(WIZ_GRAPHS);
        layout.addNewWizardShortcut(WIZ_GRAPHS_RANDOM);
    }

    /**
     * Add a view to a folder only if the view exists. This method can be used
     * to add views from other plugins to get no exceptions if the plugin is not
     * loaded.
     * 
     * @param folder
     *            a folder layout
     * @param id
     *            a view identifier
     */
    protected void addViewIfExists(final IFolderLayout folder, final String id) {
        // first search the view and only add it, if it is available
        if (PlatformUI.getWorkbench().getViewRegistry().find(id) != null) {
            folder.addView(id);
        }
    }

}
