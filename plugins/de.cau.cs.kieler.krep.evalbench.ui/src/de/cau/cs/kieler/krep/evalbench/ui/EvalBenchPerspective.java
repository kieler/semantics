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
package de.cau.cs.kieler.krep.evalbench.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.krep.evalbench.ui.views.AssemblerView;
import de.cau.cs.kieler.krep.evalbench.ui.views.ConnectionView;

/**
 * Perspective related to the evaluation bench. This extends the KIELER perspective by the assembler
 * view and the connection log.
 * 
 * @author msp, ctr
 */
public class EvalBenchPerspective implements IPerspectiveFactory {

    /** Identifier string for this perspective. */
    public static final String PERSPECTIVE_ID = "de.cau.cs.kieler.krep.evalbench.ui.perspective";

    /* To find view IDs, see cookbook in project trac */
    /* IDs of views */
    

    /** A small view. */
    public static final float SMALL = 0.2f;
    /** A medium view, will take 50% space. */
    public static final float MEDIUM = 0.5f;
    /** A big view. */
    public static final float BIG = 0.7f;

    // CHECKSTYLEOFF LineLength

    /* To find view IDs, see cookbook in project trac */
    /* IDs of views */
    private static final String VIEW_KREP = ConnectionView.VIEW_ID;
    private static final String VIEW_ASM = AssemblerView.VIEW_ID;
        
    private static final String VIEW_KEV = "de.cau.cs.kieler.kev.views.EnvironmentView";
    private static final String VIEW_KIML_EXECUTION = "de.cau.cs.kieler.kiml.viewer.execution";
    private static final String VIEW_KIML_LAYOUTGRAPH = "de.cau.cs.kieler.kiml.viewer.layoutGraph";
    private static final String VIEW_KIML_LAYOUT = "de.cau.cs.kieler.kiml.views.layout";
    private static final String VIEW_KIEM = "de.cau.cs.kieler.sim.kiem.view";
    private static final String VIEW_KIEM_TABLE = "de.cau.cs.kieler.sim.table.views.KiemTable";
    private static final String VIEW_VIEWMANAGEMENT = "de.cau.cs.kieler.viewmanagement.VMControl";

    /* IDs of New-Wizards */
    private static final String WIZ_SYNCCHART = "de.cau.cs.kieler.synccharts.diagram.part.SyncchartsCreationWizardID";
    private static final String WIZ_DATAFLOW = "de.cau.cs.kieler.dataflow.diagram.part.DataflowCreationWizardID";
    private static final String WIZ_DATAFLOW_RANDOM = "de.cau.cs.kieler.dataflow.ui.wizards.CreateRandomModelWizard";
    private static final String WIZ_FILE = "org.eclipse.ui.wizards.new.file";
    private static final String WIZ_PROJECT = "org.eclipse.ui.wizards.new.project";

    // CHECKSTYLEON LineLength
    
    /** {@inheritDoc} */
    public void createInitialLayout(final IPageLayout layout) {
        createNewWizardShortcuts(layout);
        createViewLayout(layout);
        createViewShortcuts(layout);
    }

    /**
     * Add KIELER Views (and some important Eclipse views) as shortcuts into the View menu.
     * 
     * @param layout
     */
    private void createViewShortcuts(final IPageLayout layout) {
        layout.addShowViewShortcut(VIEW_KEV);
        layout.addShowViewShortcut(VIEW_KIML_EXECUTION);
        layout.addShowViewShortcut(VIEW_KIML_LAYOUTGRAPH);
        layout.addShowViewShortcut(VIEW_KIML_LAYOUT);
        layout.addShowViewShortcut(VIEW_KIEM);
        layout.addShowViewShortcut(VIEW_KIEM_TABLE);
        layout.addShowViewShortcut(VIEW_VIEWMANAGEMENT);
        layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
        layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
        // layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
        layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
        layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);

        
        // EvalBench specific
        layout.addShowViewShortcut(VIEW_KREP);
        layout.addShowViewShortcut(VIEW_ASM);        
    }

    /**
     * Add the KIELER views to the layout.
     * 
     * @param layout
     */
    private void createViewLayout(final IPageLayout layout) {
        String editor = layout.getEditorArea();

        // TOP LEFT ==============================================
        IFolderLayout topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, SMALL, editor);
        addViewIfExists(topLeft, IPageLayout.ID_PROJECT_EXPLORER);
        addViewIfExists(topLeft, VIEW_KREP);
        // project explorer does not show the new wizard shortcuts...
        // addViewIfExists(topLeft, IPageLayout.ID_PROJECT_EXPLORER);

        // BOTTOM LEFT ==============================================
        IFolderLayout bottomLeft = layout.createFolder("bottomLeft", IPageLayout.BOTTOM, MEDIUM,
                "topLeft");
        addViewIfExists(bottomLeft, IPageLayout.ID_OUTLINE);

        // add Kieler views to bottom left folder
        addViewIfExists(bottomLeft, VIEW_KIEM_TABLE);

        //      EvalBench specific
        IFolderLayout topRight = layout.createFolder("topRight", IPageLayout.RIGHT, MEDIUM, editor);
        addViewIfExists(topRight, VIEW_ASM);
        
        // BOTTOM =================================================
        IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, BIG, editor);
        addViewIfExists(bottom, IPageLayout.ID_PROP_SHEET);
        addViewIfExists(bottom, IPageLayout.ID_PROBLEM_VIEW);
        addViewIfExists(bottom, "org.eclipse.ui.console.ConsoleView");

        // add Kieler views to bottom folder
        addViewIfExists(bottom, VIEW_KEV);
        addViewIfExists(bottom, VIEW_KIML_EXECUTION);
        addViewIfExists(bottom, VIEW_KIML_LAYOUTGRAPH);
        addViewIfExists(bottom, VIEW_KIML_LAYOUT);
        addViewIfExists(bottom, VIEW_KIEM);
        addViewIfExists(bottom, VIEW_VIEWMANAGEMENT);

        layout.setEditorAreaVisible(true);
    }

    /**
     * Add shortcuts to the New-Dialog to the KIELER wizards.
     * 
     * @param layout
     */
    private void createNewWizardShortcuts(final IPageLayout layout) {
        layout.addNewWizardShortcut(WIZ_PROJECT);
        layout.addNewWizardShortcut(WIZ_FILE);
        layout.addNewWizardShortcut(WIZ_SYNCCHART);
        layout.addNewWizardShortcut(WIZ_DATAFLOW);
        layout.addNewWizardShortcut(WIZ_DATAFLOW_RANDOM);
    }

    /**
     * Add a view to a folder only if the view exists. This method can be used to add views from
     * other plugins to get no exceptions if the plugin is not loaded.
     */
    private void addViewIfExists(final IFolderLayout folder, final String id) {
        // first search the view and only add it, if it is available
        if (PlatformUI.getWorkbench().getViewRegistry().find(id) != null) {
            folder.addView(id);
        }
    }
}
