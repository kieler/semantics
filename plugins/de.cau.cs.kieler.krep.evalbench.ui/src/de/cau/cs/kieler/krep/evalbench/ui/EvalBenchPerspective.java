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

import de.cau.cs.kieler.core.ui.ModelingPerspective;
import de.cau.cs.kieler.krep.evalbench.ui.views.AssemblerView;
import de.cau.cs.kieler.krep.evalbench.ui.views.ConnectionView;

/**
 * Perspective related to the evaluation bench. This extends the KIELER modeling perspective by the
 * assembler view and the connection log.
 * 
 * @author msp, ctr
 * 
 * @kieler.rating 2010-03-09 yellow 
 *   review by msp, soh
 * 
 */
public class EvalBenchPerspective extends ModelingPerspective implements IPerspectiveFactory {

    /** Identifier string for this perspective. */
    public static final String PERSPECTIVE_ID = "de.cau.cs.kieler.krep.evalbench.ui.perspective";

    /* To find view IDs, see cookbook in project trac */
    /* IDs of views */

    /** A small view. */
    // public static final float SMALL = 0.2f;
    /** A medium view, will take 50% space. */
    // public static final float MEDIUM = 0.5f;
    /** A big view. */
    // public static final float BIG = 0.7f;

    // CHECKSTYLEOFF LineLength

    /* To find view IDs, see cookbook in project trac */
    /* IDs of views */
    private static final String VIEW_KREP = ConnectionView.ID;
    private static final String VIEW_ASM = AssemblerView.ID;

    private static final String VIEW_KEV = "de.cau.cs.kieler.kev.views.EnvironmentView";
    private static final String VIEW_KIML_EXECUTION = "de.cau.cs.kieler.kiml.viewer.execution";
    private static final String VIEW_KIML_LAYOUTGRAPH = "de.cau.cs.kieler.kiml.viewer.layoutGraph";
    private static final String VIEW_KIML_LAYOUT = "de.cau.cs.kieler.kiml.views.layout";
    private static final String VIEW_KIEM = "de.cau.cs.kieler.sim.kiem.view";
    private static final String VIEW_KIEM_TABLE = "de.cau.cs.kieler.sim.table.views.KiemTable";
    private static final String VIEW_VIEWMANAGEMENT = "de.cau.cs.kieler.viewmanagement.VMControl";

    // CHECKSTYLEON LineLength

    /**
     * {@inheritDoc}
     */
    @Override
    protected void createViewShortcuts(final IPageLayout layout) {
        super.createViewShortcuts(layout);

        // EvalBench specific
        layout.addShowViewShortcut(VIEW_KREP);
        layout.addShowViewShortcut(VIEW_ASM);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void createViewLayout(final IPageLayout layout) {
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

        // EvalBench specific
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
}
