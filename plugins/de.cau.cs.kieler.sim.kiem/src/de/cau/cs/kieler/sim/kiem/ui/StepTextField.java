/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/

package de.cau.cs.kieler.sim.kiem.ui;


import org.eclipse.jface.action.ControlContribution;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;

public class StepTextField extends ControlContribution {

	Text textfield;
		
	public StepTextField(KiemPlugin KIEM) {
		super("Step Text Field");
	}
	
	@Override
	protected Control createControl(Composite parent) {
		textfield = new Text(parent,SWT.BORDER);
		this.textfield.setEnabled(false);
		//this.textfield.setVisible(false);
		textfield.setToolTipText("Current Step Counter");
		textfield.setText("            ");
		return textfield;
	}
	
	public void updateTextfield(String text) {
		if (text == null) {
			//this.textfield.setVisible(false);
			this.textfield.setText("");
		}
		else {
			this.textfield.setText(text);
			//this.textfield.setVisible(true);
		}
	}
	
}
