package de.tu_berlin.cs.tfs.muvitorkit.ui.utils;

import de.tu_berlin.cs.tfs.muvitorkit.ui.MuvitorTreeEditor;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IPlaceholderFolderLayout;

/**
 * This the default definition of the perspective for the RON editor.
 * {@link MuvitorTreeEditor} can automatically activate this perspective if it
 * is declared in the plugin.xml. See {@link MuvitorTreeEditor} for details.
 * 
 * @author Tony Modica
 */
public class PerspectiveTemplate implements IPerspectiveFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui
	 * .IPageLayout)
	 */
	public void createInitialLayout(final IPageLayout layout) {
		defineActions(layout);
		defineLayout(layout);
	}

	/**
	 * Defines the initial actions for a page.
	 * 
	 * @param layout
	 *            The layout we are filling
	 */
	private void defineActions(final IPageLayout layout) {
		// insert the id of your creation wizard here
		layout.addNewWizardShortcut("roneditor.dialogs.RONFileCreationWizard"); //$NON-NLS-1$

		// Add "show views".
		layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
		layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
		layout.addShowViewShortcut("org.eclipse.pde.runtime.LogView");
		layout.addShowViewShortcut("MuvitorKit.CommonNavigator");
	}

	/**
	 * Defines the initial perspective layout.
	 * 
	 * @param layout
	 *            The layout we are filling
	 */
	private void defineLayout(final IPageLayout layout) {

		final String editorArea = layout.getEditorArea();

		final IFolderLayout bottomRight = layout.createFolder("bottomRight",
				IPageLayout.RIGHT, 0.2f, editorArea);
		bottomRight.addView(IPageLayout.ID_PROP_SHEET);
		bottomRight.addView("org.eclipse.pde.runtime.LogView");
		bottomRight.addView(IPageLayout.ID_PROBLEM_VIEW);

		final IFolderLayout bottomLeft = layout.createFolder("bottomLeft",
				IPageLayout.BOTTOM, 0.7f, editorArea);
		bottomLeft.addView("MuvitorKit.CommonNavigator");

		final IPlaceholderFolderLayout middleRight = layout
				.createPlaceholderFolder("middleRight", IPageLayout.TOP, 0.8f,
						"bottomRight");
		/*
		 * the suffix ":*" is needed for all MuvitorPageBookViews as a
		 * placeholder for the views' different secondary IDs
		 */
		// middleRight.addPlaceholder(RONTreeEditor.ronViewID + ":*");
		//
		// final IPlaceholderFolderLayout topRight = layout
		// .createPlaceholderFolder("topRight", IPageLayout.TOP, 0.5f,
		// "middleRight");
		// topRight.addPlaceholder(RONTreeEditor.objectNetViewID + ":*");
		// topRight.addPlaceholder(RONTreeEditor.ruleViewID + ":*");

	}
}
