/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.server.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * KiCoServerButtonHandler implements the button handler for starting the dialog window in order to
 * start or stop the server and to modify the listening port.
 *
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 */
public class KiCoServerButtonHandler extends AbstractHandler {

	/**
	 * Instantiates a new KiCoButtonHandler handler.
	 */
	public KiCoServerButtonHandler() {
	}

	//---------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		KiCoServerDialog dialog = new KiCoServerDialog(window.getShell(), 0);
		dialog.open();
		return null;
	}

	//---------------------------------------------------------------------
}
