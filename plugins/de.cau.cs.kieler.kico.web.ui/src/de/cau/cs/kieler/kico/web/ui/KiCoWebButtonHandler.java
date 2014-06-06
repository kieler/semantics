package de.cau.cs.kieler.kico.web.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;

/**
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 */
public class KiCoWebButtonHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public KiCoWebButtonHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
//		MessageDialog.openInformation(
//				window.getShell(),
//				"KIELER Compiler Web Interface",
//				"Define Port");
		KiCoWebDialog dialog = new KiCoWebDialog(window.getShell(), 0);
		dialog.open();
		return null;
	}
}
