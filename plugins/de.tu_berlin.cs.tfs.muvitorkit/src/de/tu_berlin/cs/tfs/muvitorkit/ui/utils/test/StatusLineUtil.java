/******************************************************************************
 * Copyright (c) 2004, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package de.tu_berlin.cs.tfs.muvitorkit.ui.utils.test;

import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorActionBarContributor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorActionBarContributor;

/**
 * Utility class for outputting text to the status line
 * 
 * @author myee
 */
public class StatusLineUtil {

	private StatusLineUtil() {
		/* private constructor */
	}

	/**
	 * Outputs an error message to the part's status line. Does nothing if the
	 * status line manager cannot be determined from the <code>part</code>.
	 * <P>
	 * Can be invoked from a non-UI thread.
	 * 
	 * @param part
	 *            the part
	 * @param errorMessage
	 *            the error message
	 */
	public static void outputErrorMessage(final IWorkbenchPart part,
			final String errorMessage) {

		final IStatusLineManager statusLineManager = getStatusLineManager(part);

		if (statusLineManager == null) {
			// can't find the status line manager
			return;
		}

		final Display workbenchDisplay = PlatformUI.getWorkbench().getDisplay();

		if (workbenchDisplay.getThread() == Thread.currentThread()) {
			// we're already on the UI thread
			statusLineManager.setErrorMessage(errorMessage);
		} else {
			// we're not on the UI thread
			workbenchDisplay.asyncExec(new Runnable() {

				public void run() {
					statusLineManager.setErrorMessage(errorMessage);
				}
			});
		}
	}

	private static IStatusLineManager getStatusLineManager(
			final IWorkbenchPart part) {

		IStatusLineManager result = null;

		if (part instanceof IViewPart) {
			final IViewPart viewPart = (IViewPart) part;
			result = viewPart.getViewSite().getActionBars()
					.getStatusLineManager();

		} else if (part instanceof IEditorPart) {
			final IEditorPart editorPart = (IEditorPart) part;

			final IEditorActionBarContributor contributor = editorPart
					.getEditorSite().getActionBarContributor();

			if (contributor instanceof EditorActionBarContributor) {
				result = ((EditorActionBarContributor) contributor)
						.getActionBars().getStatusLineManager();
			}
		}
		return result;
	}

}
