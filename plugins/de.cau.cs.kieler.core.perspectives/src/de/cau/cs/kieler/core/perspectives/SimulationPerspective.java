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
 * A perspective for simulation of KIELER SCCharts. It shows the components of
 * {@link ModelingPerspective} but is extended by the data table, the signals view and the execution
 * manager.
 * 
 * @author nbw
 * 
 * @kieler.design 2015-07-02 nbw cmot ssm als ima rvh
 * @kieler.rating yellow 2015-07-03 cmot ssm als KI-87
 */
public class SimulationPerspective implements IPerspectiveFactory {

    /** {@inheritDoc} */
    public void createInitialLayout(IPageLayout layout) {
        /* Add the KIELER views to the layout. */
        String editor = layout.getEditorArea();

        // Bottom Row - Left: Project Explorer, Right: KiCo/KIEM
        // Top Row - Left: Editor, Center: KLighD, Right: Signals and Table
        IFolderLayout bottomLeft =
                layout.createFolder("bottomLeft", IPageLayout.BOTTOM, PerspectiveHelper.BIG, editor);
        IFolderLayout bottomRight =
                layout.createFolder("bottomRight", IPageLayout.RIGHT, PerspectiveHelper.SMALL,
                        "bottomLeft");
        IFolderLayout topRightTop =
                layout.createFolder("topRightTop", IPageLayout.RIGHT,
                        1.0f - PerspectiveHelper.SMALL, editor);
        IFolderLayout topRightBottom =
                layout.createFolder("topRightBottom", IPageLayout.BOTTOM, PerspectiveHelper.MEDIUM,
                        "topRightTop");
        IFolderLayout topCenter =
                layout.createFolder("topCenter", IPageLayout.RIGHT, PerspectiveHelper.MEDIUM,
                        editor);
        PerspectiveHelper.addViewIfExists(bottomRight, PerspectiveHelper.VIEW_KICOOL);
        PerspectiveHelper.addViewIfExists(topCenter, PerspectiveHelper.VIEW_KLIGHD);
        PerspectiveHelper.addViewIfExists(bottomLeft, IPageLayout.ID_PROJECT_EXPLORER);

        // Activate editor
        layout.setEditorAreaVisible(true);
    }
}
