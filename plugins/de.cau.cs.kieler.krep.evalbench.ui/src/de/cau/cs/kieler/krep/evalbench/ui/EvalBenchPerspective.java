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


import de.cau.cs.kieler.krep.evalbench.ui.views.AssemblerView;
import de.cau.cs.kieler.krep.evalbench.ui.views.ConnectionView;
/**
 * Perspective related to the evaluation bench.
 * 
 * @author msp, ctr
 */
public class EvalBenchPerspective implements IPerspectiveFactory {

    /** Identifier string for this perspective. */
    public static final String PERSPECTIVE_ID = "de.cau.cs.kieler.krep.evalbench.ui.perspective";
    /** Identifier string for the connection view. */
   // private static final String ID_CONNECTION = ConnectionView.VIEW_ID;

    /** Identifier string for the message view. */
   // private static final String ID_MESSAGE = MessageView.VIEW_ID;
    /** Identifier string for the target view. */
    private static final String ID_KREP = ConnectionView.VIEW_ID;
 /** Identifier string for the trace view. */
   // private static final String ID_TRACE = TraceView.VIEW_ID;

    /**
     * {@inheritDoc}
     * 
     */
    public void createInitialLayout(final IPageLayout layout) {

        final float ratioBottom = 0.7f;
        final float ratioOutput = 0.7f;
        final float ratioInput = 0.57f;

        // get the editor area.
        String editorArea = layout.getEditorArea();

        //top: Assembler View
        IFolderLayout top = layout.createFolder("top", IPageLayout.TOP, ratioBottom,
                editorArea);
        
        top.addView(AssemblerView.VIEW_ID);
        
        // bottom: Target view and Execution Manager
        IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, ratioBottom,
                editorArea);
        bottom.addView(ID_KREP);
        bottom.addView("de.cau.cs.kieler.sim.kiem.view");
        //bottom.addView(ID_MESSAGE);
        

        // right 2: Output view
        //IFolderLayout right = layout.createFolder("right2", IPageLayout.RIGHT, ratioOutput,
         //       editorArea);
        //right.addView(ID_OUTPUT);

        // right 1: Input view
        IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, ratioInput,
                editorArea);
        left.addView("de.cau.cs.kieler.sim.table.views.KiemTable");
        // left.addView(ID_TRACE);


        // add all shown views as shortcuts
        //layout.addShowViewShortcut(ID_INPUT);
        //layout.addShowViewShortcut(ID_TRACE);
        //layout.addShowViewShortcut(ID_CONNECTION);
        //layout.addShowViewShortcut(ID_MESSAGE);
        //layout.addShowViewShortcut(ID_TARGET);
        //layout.addShowViewShortcut(ID_OUTPUT);
        //layout.addShowViewShortcut(ID_TRACE);

        // add this perspective as shortcut
        layout.addPerspectiveShortcut(EvalBenchPerspective.PERSPECTIVE_ID);
    }
}
