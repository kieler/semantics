/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import de.cau.cs.kieler.krep.evalbench.ui.views.ConnectionView;
import de.cau.cs.kieler.krep.evalbench.ui.views.MessageView;
import de.cau.cs.kieler.krep.evalbench.ui.views.TargetView;
import de.cau.cs.kieler.krep.evalbench.ui.views.VerifyView;

/**
 * Perspective related to the evaluation bench.
 * 
 * @author ctr
 */
public class VerifyPerspective implements IPerspectiveFactory {

	/** Identifier string for this perspective */
	public final static String PERSPECTIVE_ID = "de.cau.cs.kieler.krep.evalbench.ui.verifyperspective";

	/** Identifier string for the connection view */
	private final static String ID_CONNECTION = ConnectionView.VIEW_ID; // "de.cau.cs.kieler.krep.evalbench.ui.views.connection";

	/** Identifier string for the target view */
	private final static String ID_TARGET = TargetView.VIEW_ID;// "de.cau.cs.kieler.krep.evalbench.ui.views.target";

	/** Identifier string for the target view */
	private final static String ID_MESSAGE = MessageView.VIEW_ID; // "de.cau.cs.kieler.krep.evalbench.ui.views.message";

	/** Identifier string for the output view */
	private final static String ID_VERIFY = VerifyView.VIEW_ID; // "de.cau.cs.kieler.krep.evalbench.ui.views.verify";

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui
	 * .IPageLayout)
	 */
	public void createInitialLayout(IPageLayout layout) {
		// get the editor area.
		String editorArea = layout.getEditorArea();

		// bottom: Connection and Target view
		IFolderLayout bottom = layout.createFolder("bottom",
				IPageLayout.BOTTOM, 0.7f, editorArea);
		bottom.addView(ID_CONNECTION);
		bottom.addView(ID_TARGET);
		bottom.addView(ID_MESSAGE);
		layout.setEditorAreaVisible(false);

		// right 1: Input view
		IFolderLayout left = layout.createFolder("right1", IPageLayout.RIGHT,
				0.57f, editorArea);
		left.addView(ID_VERIFY);

		// add all shown views as shortcuts
		// layout.addShowViewShortcut(ID_TRACE);
		layout.addShowViewShortcut(ID_CONNECTION);
		layout.addShowViewShortcut(ID_TARGET);
		layout.addShowViewShortcut(ID_MESSAGE);
		layout.addShowViewShortcut(ID_VERIFY);

		// add this perspective as shortcut
		layout.addPerspectiveShortcut(EvalBenchPerspective.PERSPECTIVE_ID);
		layout.addPerspectiveShortcut(TracePerspective.PERSPECTIVE_ID);
		layout.addPerspectiveShortcut(VerifyPerspective.PERSPECTIVE_ID);
	}
}
