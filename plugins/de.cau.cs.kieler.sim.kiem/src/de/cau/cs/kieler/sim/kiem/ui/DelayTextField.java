package de.cau.cs.kieler.sim.kiem.ui;

import java.awt.Color;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.ControlContribution;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;

public class DelayTextField extends ControlContribution implements KeyListener,
																   FocusListener{

	Text textfield;
	private KiemPlugin KIEM;

		
	public DelayTextField(KiemPlugin KIEM) {
		super("KIEM Delay Text Field");
		this.KIEM = KIEM;
	}
	
	public void setEnabled(boolean enabled) {
		if (textfield == null) return;
		this.textfield.setEnabled(enabled);
	}
	
	@Override
	protected Control createControl(Composite parent) {
		this.updateDelay();
		textfield = new Text(parent,SWT.BORDER);
		textfield.setToolTipText("Delay of steps in run mode (ms)");
		textfield.setText(KIEM.DELAY_DEFAULT+"    ");
		textfield.addKeyListener(this);
		textfield.addFocusListener(this);
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
	
	public void focusLost(FocusEvent e) {
		updateDelay();
	}
	
	private void updateDelay(){
		if (textfield == null) return;
		try{
			int delay = Integer.parseInt(textfield.getText().trim());
			if (delay < KIEM.DELAY_MIN) throw(new NumberFormatException("Delay must be >= "+KIEM.DELAY_MIN+"ms!"));
			if (delay > KIEM.DELAY_MAX) throw(new NumberFormatException("Delay must be <= "+KIEM.DELAY_MAX+"ms!"));
			KIEM.setDelay(delay);
		}catch(NumberFormatException exc){
			textfield.setText(""+KIEM.getDelay());
			//Status s = new Status(0,"Error","Please enter only integer numbers!",exc);
			//ErrorDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),"Error",exc.getMessage(),s,IStatus.ERROR);	
		}
	}

	public void focusGained(FocusEvent e) {
		textfield.setText(""+KIEM.getDelay());
	}
}
