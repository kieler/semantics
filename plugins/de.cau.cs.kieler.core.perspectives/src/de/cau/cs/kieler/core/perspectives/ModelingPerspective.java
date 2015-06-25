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
package de.cau.cs.kieler.core.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * A Perspective for the modeling SCCharts with KIELER. It shows the project explorer, the textual
 * editor and the graphical representation as well as KiCo for compiling.
 * 
 * @author haf
 * @author nbw
 */
public class ModelingPerspective implements IPerspectiveFactory {

    /** {@inheritDoc} */
    public void createInitialLayout(final IPageLayout layout) {

        /* Add shortcuts to the New-Dialog to relevant wizards. */
//        layout.addNewWizardShortcut(PerspectiveHelper.WIZ_PROJECT);
        layout.addNewWizardShortcut(PerspectiveHelper.WIZ_FILE);

        // Bottom Row - Left: Project Explorer, Right: KICO
        // Top Row - Left: Editor, Right: KLighD
        String editor = layout.getEditorArea();
        IFolderLayout bottomLeft =
                layout.createFolder("bottomLeft", IPageLayout.BOTTOM, PerspectiveHelper.BIG, editor);
        IFolderLayout bottomRight =
                layout.createFolder("bottomRight", IPageLayout.RIGHT, PerspectiveHelper.SMALL, "bottomLeft");
        IFolderLayout topRight =
                layout.createFolder("topRight", IPageLayout.RIGHT, PerspectiveHelper.MEDIUM, editor);

        PerspectiveHelper.addViewIfExists(bottomRight, PerspectiveHelper.VIEW_KICO);
        PerspectiveHelper.addViewIfExists(topRight, PerspectiveHelper.VIEW_KLIGHD);
        PerspectiveHelper.addViewIfExists(bottomLeft, IPageLayout.ID_PROJECT_EXPLORER);

        // Activate editor
        layout.setEditorAreaVisible(true);

        /* Add relevant views as shortcuts into the View menu. */
        layout.addShowViewShortcut(PerspectiveHelper.VIEW_KICO);
        layout.addShowViewShortcut(PerspectiveHelper.VIEW_KLIGHD);
        layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);

    }
}
