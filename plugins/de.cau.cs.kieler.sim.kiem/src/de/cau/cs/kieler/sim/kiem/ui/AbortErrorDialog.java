package de.cau.cs.kieler.sim.kiem.ui;


import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;


public class AbortErrorDialog extends ErrorDialog implements SelectionListener{

	boolean abortable = false;
	
	public AbortErrorDialog(Shell parentShell, String dialogTitle,
			String message, IStatus status, int displayMask, boolean abortable) {
		super(parentShell, dialogTitle, message, status, displayMask);
		this.abortable = abortable;
		
	}

	public static void openError(String message, IStatus status, boolean abortable){
		int displayMask = IStatus.OK | IStatus.INFO | IStatus.WARNING | IStatus.ERROR;
		AbortErrorDialog dialog = new AbortErrorDialog(null, "Error", message, status, displayMask, abortable);
		dialog.open();
	}
	
	protected void createButtonsForButtonBar(Composite parent){
		// create OK and Details buttons
		createButton(parent, IDialogConstants.OK_ID, "Continue",true);
		createAbortButton(parent);
		createDetailsButton(parent);
	}
	
	private void createAbortButton(Composite parent){
		if(abortable){
			createButton(parent, IDialogConstants.CANCEL_ID, "Pause Sim", false);
			Button b = this.getButton(IDialogConstants.CANCEL_ID);
			if(b != null)
				b.addSelectionListener(this);
			//AnimationManager.getInstance().
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {


	}

	public void widgetDefaultSelected(SelectionEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Callback function for abort button
	 */
	public void widgetSelected(SelectionEvent e) {
		try{
		if(e.getSource().getClass() == Button.class){
			System.out.println("abort");
			// we perform a step which means afterwards the system is paused... hopefully...
			//FIXME//AnimationManager.getInstance().error();
		}
		} catch(Exception exc){/*nothing, because animation cannot be stopped*/}
	}

}
