package de.cau.cs.kieler.kev.actions;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.ControlContribution;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.kev.KevPlugin;
import de.cau.cs.kieler.kev.animation.AnimationManager;


public class DelayTextField extends ControlContribution implements KeyListener{

	Text textfield;
		
	public DelayTextField() {
		super("KEV Delay Text Field");
	}

	@Override
	protected Control createControl(Composite parent) {
		textfield = new Text(parent,SWT.BORDER);
		textfield.setToolTipText("Delay of steps in run mode (ms)");
		textfield.setText("    500");
		textfield.addKeyListener(this);
		this.updateDelay();
		return textfield;
	}

	public void keyPressed(KeyEvent e) {
		if(e.character=='\r'){
			updateDelay();
		}			
	}
	public void keyReleased(KeyEvent e) {
		/* nothing */
	}
	
	private void updateDelay(){
		try{
			int delay = Integer.parseInt(textfield.getText().trim());
			AnimationManager.getInstance().setDelay(delay);			
		}catch(NumberFormatException exc){
			Status s = new Status(Status.ERROR,KevPlugin.PLUGIN_ID,0,"Please enter only integer numbers!",exc);
			ErrorDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),"Error",exc.getMessage(),s,IStatus.ERROR);	
		}
	}
}
