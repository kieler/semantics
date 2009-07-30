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

/**
 * The Class StepTextField. This is the GUI component that shows the
 * number of current steps during a running or paused execution.
 *
 * @author Christian Motika <cmot@informatik.uni-kiel.de>
 * 
 */
public class StepTextField extends ControlContribution {

	/** The SWT textfield component. */
	Text textfield;
	
	//-------------------------------------------------------------------------
		
	/**
	 * Instantiates a new step text field GUI ControlContribution.
	 */
	public StepTextField() {
		super("Step Text Field");
	}
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.ControlContribution#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createControl(Composite parent) {
		textfield = new Text(parent,SWT.BORDER);
		this.textfield.setEnabled(false);
		textfield.setToolTipText("Current Step Counter");
		//reserver some amount of space
		textfield.setText("            ");
		return textfield;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Update the contents (i.e., the # of steps) of the textfield.
	 * 
	 * @param text the text to display in the textfield
	 */
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
