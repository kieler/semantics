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

import de.cau.cs.kieler.krep.evalbench.ui.views.ConnectionView;
import de.cau.cs.kieler.krep.evalbench.ui.views.InputView;
import de.cau.cs.kieler.krep.evalbench.ui.views.MessageView;
import de.cau.cs.kieler.krep.evalbench.ui.views.OutputView;
import de.cau.cs.kieler.krep.evalbench.ui.views.TargetView;
import de.cau.cs.kieler.krep.evalbench.ui.views.TraceView;

/**
 * Perspective related to the evaluation bench.
 * 
 * @author msp
 */
public class EvalBenchPerspective implements IPerspectiveFactory {

    /** Identifier string for this perspective. */
    public static final String PERSPECTIVE_ID = "de.cau.cs.kieler.krep.evalbench.ui.perspective";
    /** Identifier string for the connection view. */
    private static final String ID_CONNECTION = ConnectionView.VIEW_ID;

    /** Identifier string for the message view. */
    private static final String ID_MESSAGE = MessageView.VIEW_ID;
    /** Identifier string for the target view. */
    private static final String ID_TARGET = TargetView.VIEW_ID;
    /** Identifier string for the input view. */
    private static final String ID_INPUT = InputView.VIEW_ID;

    /** Identifier string for the trace view. */
    private static final String ID_TRACE = TraceView.VIEW_ID;
    /** Identifier string for the output view. */
    private static final String ID_OUTPUT = OutputView.VIEW_ID;

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui .IPageLayout)
     */
    public void createInitialLayout(final IPageLayout layout) {

        final float ratioBottom = 0.7f;
        final float ratioOutput = 0.7f;
        final float ratioInput = 0.57f;

        // get the editor area.
        String editorArea = layout.getEditorArea();

        // bottom: Connection and Target view
        IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, ratioBottom,
                editorArea);
        bottom.addView(ID_CONNECTION);
        bottom.addView(ID_TARGET);
        bottom.addView(ID_MESSAGE);

        // right 2: Output view
        IFolderLayout right = layout.createFolder("right2", IPageLayout.RIGHT, ratioOutput,
                editorArea);
        right.addView(ID_OUTPUT);

        // right 1: Input view
        IFolderLayout left = layout.createFolder("right1", IPageLayout.RIGHT, ratioInput,
                editorArea);
        left.addView(ID_INPUT);
        // left.addView(ID_TRACE);

        // haf: try to add the KIEL Environment Visualization View if the KEV
        // plugin is available
        // if (Platform.getBundle("edu.unikiel.rtsys.kieler.kev") != null) {
        // IFolderLayout rightBottom = layout.createFolder("rightBottom",
        // IPageLayout.BOTTOM, 0.5f, "right");
        // rightBottom.addView("edu.unikiel.rtsys.kieler.kev.views.EnvironmentView");
        // }

        // add all shown views as shortcuts
        layout.addShowViewShortcut(ID_INPUT);
        layout.addShowViewShortcut(ID_TRACE);
        layout.addShowViewShortcut(ID_CONNECTION);
        layout.addShowViewShortcut(ID_MESSAGE);
        layout.addShowViewShortcut(ID_TARGET);
        layout.addShowViewShortcut(ID_OUTPUT);
        layout.addShowViewShortcut(ID_TRACE);

        // add this perspective as shortcut
        layout.addPerspectiveShortcut(EvalBenchPerspective.PERSPECTIVE_ID);
        layout.addPerspectiveShortcut(TracePerspective.PERSPECTIVE_ID);
        layout.addPerspectiveShortcut(VerifyPerspective.PERSPECTIVE_ID);
    }
}
