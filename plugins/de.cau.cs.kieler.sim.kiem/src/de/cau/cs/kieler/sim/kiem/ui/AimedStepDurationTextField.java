package de.cau.cs.kieler.sim.kiem.ui;


import org.eclipse.jface.action.ControlContribution;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;

public class AimedStepDurationTextField extends ControlContribution implements KeyListener,
																   FocusListener{

	Text textfield;
	private KiemPlugin KIEM;
	boolean enabled;

		
	public AimedStepDurationTextField(KiemPlugin KIEM) {
		super("Aimed Step Duration Text Field");
		this.KIEM = KIEM;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
		if (textfield == null) return;
		this.textfield.setEnabled(enabled);
	}
	
	@Override
	protected Control createControl(Composite parent) {
		this.updateDuration();
		textfield = new Text(parent,SWT.BORDER);
		this.textfield.setEnabled(this.enabled);
		textfield.setToolTipText("Aimed Duration of Steps in Run Mode (ms)");
		textfield.setText(KiemPlugin.AIMED_STEP_DURATION_DEFAULT+"ms   ");
		textfield.addKeyListener(this);
		textfield.addFocusListener(this);
		return textfield;
	}

	public void keyPressed(KeyEvent e) {
		if(e.character=='\r'){
			updateDuration();
		}			
	}
	public void keyReleased(KeyEvent e) {
		/* nothing */
	}
	
	public void focusLost(FocusEvent e) {
		updateDuration();
		textfield.setText(""+KIEM.getAimedStepDuration()+"ms");
	}
	
	public int getAimedStepDuration() {
		int aimedStepDuration = Integer.parseInt(textfield.getText().trim());
		if (aimedStepDuration < KiemPlugin.AIMED_STEP_DURATION_MIN) 
			throw(new NumberFormatException("Duration must be >= "
					+KiemPlugin.AIMED_STEP_DURATION_MIN+"ms!"));
		if (aimedStepDuration > KiemPlugin.AIMED_STEP_DURATION_MAX) 
			throw(new NumberFormatException("Duration must be <= "
					+KiemPlugin.AIMED_STEP_DURATION_MAX+"ms!"));
		return aimedStepDuration;
	}
	public void setStepDuration(int aimedStepDuration) {
		try{
			if (aimedStepDuration < KiemPlugin.AIMED_STEP_DURATION_MIN) 
				throw(new NumberFormatException("Duration must be >= "
						+KiemPlugin.AIMED_STEP_DURATION_MIN+"ms!"));
			if (aimedStepDuration > KiemPlugin.AIMED_STEP_DURATION_MAX) 
				throw(new NumberFormatException("Duration must be <= "
						+KiemPlugin.AIMED_STEP_DURATION_MAX+"ms!"));
			KIEM.setAimedStepDuration(aimedStepDuration);
		}catch(NumberFormatException exc){
		}
		textfield.setText(""+KIEM.getAimedStepDuration()+"ms");
	}
	
	private void updateDuration(){
		if (textfield == null) return;
		try{
			int aimedStepDuration = Integer.parseInt(textfield.getText().trim());
			if (aimedStepDuration < KiemPlugin.AIMED_STEP_DURATION_MIN)
				throw(new NumberFormatException("Duration must be >= "
						+KiemPlugin.AIMED_STEP_DURATION_MIN+"ms!"));
			if (aimedStepDuration > KiemPlugin.AIMED_STEP_DURATION_MAX) 
				throw(new NumberFormatException("Duration must be <= "
						+KiemPlugin.AIMED_STEP_DURATION_MAX+"ms!"));
			KIEM.setAimedStepDuration(aimedStepDuration);
		}catch(NumberFormatException exc){
		}
	}

	public void focusGained(FocusEvent e) {
		textfield.setText(""+KIEM.getAimedStepDuration());
	}
}
