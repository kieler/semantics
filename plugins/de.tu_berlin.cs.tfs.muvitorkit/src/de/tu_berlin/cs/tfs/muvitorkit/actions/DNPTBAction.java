/**
 *
 */
package de.tu_berlin.cs.tfs.muvitorkit.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;

/**
 * Strange Action...
 * 
 * @author Tony Modica
 */
public class DNPTBAction extends Action {

	public static final String ID = "Do not press this button!";

	private final static ImageDescriptor imageDesc = ImageDescriptor
			.createFromImage(Display.getDefault().getSystemImage(
					SWT.ICON_WARNING));

	public DNPTBAction() {
		super("Toggle Animation", AS_PUSH_BUTTON);
		setEnabled(true);
		setImageDescriptor(imageDesc);
		setToolTipText(ID);
		setId(ID);
	}

	@Override
	public void run() {
		// MessageBox dialog = new MessageBox(new Shell(), SWT.ICON_WARNING);
		// dialog.setText("You pushed the button!");
		// dialog.setMessage("Please don't push the button again!");

		final MessageDialog dialog = new MessageDialog(Display.getDefault()
				.getActiveShell(), "You pushed the button!", null,
				"Please don't push the button again!", MessageDialog.WARNING,
				new String[] { "I promise..." }, 0);
		dialog.open();
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public void runWithEvent(final Event event) {
		run();
	}
}
