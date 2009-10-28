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

/**
 * Perspective related to the evaluation bench.
 * 
 * @author msp, ctr
 */
public class TracePerspective implements IPerspectiveFactory {

    /** Identifier string for this perspective. */
    public static final String PERSPECTIVE_ID = "de.cau.cs.kieler.krep.evalbench.ui.traceperspective";

    /** Identifier string for the connection view. */
    private static final String ID_CONNECTION = "de.cau.cs.kieler.krep.evalbench.ui.views.connection";

    /** Identifier string for the message view. */
    private static final String ID_MESSAGE = "de.cau.cs.kieler.krep.evalbench.ui.views.message";

    /** Identifier string for the target view. */
    private static final String ID_TARGET = "de.cau.cs.kieler.krep.evalbench.ui.views.target";

    /** Identifier string for the trace view. */
    private static final String ID_TRACE = "de.cau.cs.kieler.krep.evalbench.ui.views.trace";

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui .IPageLayout)
     */
    public void createInitialLayout(final IPageLayout layout) {

        // get the editor area.
        String editorArea = layout.getEditorArea();

        // bottom: Connection and Target view
        IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, 0.7f, editorArea);
        bottom.addView(ID_CONNECTION);
        bottom.addView(ID_TARGET);
        bottom.addView(ID_MESSAGE);

        // right 1: trace view view
        // layout.addStandaloneView(ID_TRACE, true, IPageLayout.RIGHT, 0.57f,
        // editorArea);

        IFolderLayout left = layout.createFolder("left", IPageLayout.RIGHT, 0.57f, editorArea);

        left.addView(ID_TRACE);

        // haf: try to add the KIEL Environment Visualization View if the KEV
        // plugin is available
        // if (Platform.getBundle("edu.unikiel.rtsys.kieler.kev") != null) {
        // IFolderLayout rightBottom = layout.createFolder("rightBottom",
        // IPageLayout.BOTTOM, 0.5f, "right");
        // / rightBottom
        // .addView("edu.unikiel.rtsys.kieler.kev.views.EnvironmentView");
        // }

        // add all shown views as shortcuts
        layout.addShowViewShortcut(ID_TRACE);
        layout.addShowViewShortcut(ID_CONNECTION);
        layout.addShowViewShortcut(ID_TARGET);

        // add this perspective as shortcut
        layout.addPerspectiveShortcut(EvalBenchPerspective.PERSPECTIVE_ID);
        layout.addPerspectiveShortcut(TracePerspective.PERSPECTIVE_ID);
        layout.addPerspectiveShortcut(VerifyPerspective.PERSPECTIVE_ID);

    }
}
