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
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * A perspective for simulation of KIELER SCCharts. It shows the components of
 * {@link ModelingPerspective} but is extended by the data table, the signals view and the execution
 * manager.
 * 
 * @author nbw
 */
public class SimulationPerspective implements IPerspectiveFactory {

    /** {@inheritDoc} */
    public void createInitialLayout(IPageLayout layout) {
        /* Add the KIELER views to the layout. */
        String editor = layout.getEditorArea();

        // Bottom Row - Left: KICO/KIEM, Right: Data Table
        // Top Row - Left: Explorer/Signals, Center: Editor, Right: KLighD
        IFolderLayout bottomLeft =
                layout.createFolder("bottomLeft", IPageLayout.BOTTOM, PerspectiveHelper.BIG, editor);
        IFolderLayout bottomRight =
                layout.createFolder("bottomRight", IPageLayout.RIGHT, PerspectiveHelper.BIG,
                        "bottomLeft");
        IFolderLayout topLeftTop =
                layout.createFolder("topLeftTop", IPageLayout.LEFT, PerspectiveHelper.SMALL, editor);
        IFolderLayout topLeftBottom =
                layout.createFolder("topLeftBottom", IPageLayout.BOTTOM, PerspectiveHelper.MEDIUM,
                        "topLeftTop");
        IFolderLayout topRight =
                layout.createFolder("topRight", IPageLayout.RIGHT, PerspectiveHelper.MEDIUM, editor);
        PerspectiveHelper.addViewIfExists(bottomLeft, PerspectiveHelper.VIEW_KIEM);
        PerspectiveHelper.addViewIfExists(bottomLeft, PerspectiveHelper.VIEW_KICO);
        PerspectiveHelper.addViewIfExists(bottomRight, PerspectiveHelper.VIEW_KIEM_TABLE);
        PerspectiveHelper.addViewIfExists(topLeftTop, IPageLayout.ID_PROJECT_EXPLORER);
        PerspectiveHelper.addViewIfExists(topLeftBottom, PerspectiveHelper.VIEW_KIEM_SIGNALS);
        PerspectiveHelper.addViewIfExists(topRight, PerspectiveHelper.VIEW_KLIGHD);

        // Activate editor
        layout.setEditorAreaVisible(true);

        /* Add relevant views as shortcuts into the View menu. */
        layout.addShowViewShortcut(PerspectiveHelper.VIEW_KIEM);
        layout.addShowViewShortcut(PerspectiveHelper.VIEW_KICO);
        layout.addShowViewShortcut(PerspectiveHelper.VIEW_KIEM_TABLE);
        layout.addShowViewShortcut(PerspectiveHelper.VIEW_KIEM_SIGNALS);
        layout.addShowViewShortcut(PerspectiveHelper.VIEW_KLIGHD);
        layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
    }
}
