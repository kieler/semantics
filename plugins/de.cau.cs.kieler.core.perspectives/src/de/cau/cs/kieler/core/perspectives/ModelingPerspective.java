/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * A Perspective for the modeling SCCharts with KIELER. It shows the project explorer, the textual
 * editor and the graphical representation as well as KiCo for compiling.
 * Other views and UI elements are added using the org.eclipse.ui.perspectiveExtensions extension point.
 * 
 * @author nbw
 * 
 * @kieler.design 2015-07-02 nbw cmot ssm als ima rvh
 * @kieler.rating yellow 2015-07-03 cmot ssm als KI-87
 */
public class ModelingPerspective implements IPerspectiveFactory {

    public static final String PACKAGE_EXPLORER_ID = "org.eclipse.jdt.ui.PackageExplorer";
    
    /** {@inheritDoc} */
    public void createInitialLayout(final IPageLayout layout) {
        // Bottom Row - Left: Project Explorer, Right: KICO
        // Top Row - Left: Editor, Right: KLighD
        String editor = layout.getEditorArea();
        IFolderLayout bottomLeft =
                layout.createFolder("bottomLeft", IPageLayout.BOTTOM, PerspectiveHelper.BIG, editor);
        IFolderLayout bottomRight =
                layout.createFolder("bottomRight", IPageLayout.RIGHT, PerspectiveHelper.SMALL,
                        "bottomLeft");
        IFolderLayout topRight =
                layout.createFolder("topRight", IPageLayout.RIGHT, PerspectiveHelper.MEDIUM, editor);

        PerspectiveHelper.addViewIfExists(bottomRight, PerspectiveHelper.VIEW_KICOOL);
        PerspectiveHelper.addViewIfExists(topRight, PerspectiveHelper.VIEW_KLIGHD);
        PerspectiveHelper.addViewIfExists(bottomLeft, PACKAGE_EXPLORER_ID);

        // Activate editor
        layout.setEditorAreaVisible(true);
    }
}
