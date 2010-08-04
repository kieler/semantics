package de.tu_berlin.cs.tfs.muvitorkit.actions;

import de.tu_berlin.cs.tfs.muvitorkit.ui.MuvitorTreeEditor;

import org.eclipse.gef.ui.actions.EditorPartAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.actions.ActionFactory;

/**
 * An action which reverts to the last saved version of the
 * {@link MuvitorTreeEditor}'s model.
 * 
 * @author "Tony Modica"
 */
public class RevertAction extends EditorPartAction {

	public static final String ID = ActionFactory.REVERT.getId();

	/**
	 * Constructor
	 */
	public RevertAction(final MuvitorTreeEditor part) {
		super(part);
		setText("Revert");
		setToolTipText("Revert to last saved version");
		setId(ID);
	}

	/**
	 * 
	 */
	@Override
	public void run() {
		final MessageBox box = new MessageBox(getEditorPart().getSite()
				.getShell(), SWT.OK | SWT.CANCEL | SWT.ICON_WARNING);
		box.setText("Confirm revert");
		box
				.setMessage("Do you really want to discard all changes to the model and restore the state of when it has been saved the last time?");
		final int result = box.open();
		if (result == SWT.OK) {
			((MuvitorTreeEditor) getEditorPart()).revertToLastSaved();
		}
	}

	@Override
	protected boolean calculateEnabled() {
		return getEditorPart().isDirty();
	}
}
