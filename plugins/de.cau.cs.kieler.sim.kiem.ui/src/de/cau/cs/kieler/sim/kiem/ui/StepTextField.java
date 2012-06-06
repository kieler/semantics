/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
 */

package de.cau.cs.kieler.sim.kiem.ui;

import org.eclipse.jface.action.ControlContribution;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

import de.cau.cs.kieler.sim.kiem.Messages;

/**
 * The Class StepTextField. This is the GUI component that shows the number of current steps during
 * a running or paused execution.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 proposed yellow
 * 
 */
public class StepTextField extends ControlContribution {

    /** The SWT text field component. */
    private Text textfield;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new step text field GUI ControlContribution.
     */
    public StepTextField() {
        super(Messages.mStepTextFieldName);
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.jface.action.ControlContribution#createControl(org.eclipse.swt.widgets.Composite)
     */
    @Override
    protected Control createControl(final Composite parent) {
        textfield = new Text(parent, SWT.BORDER);
        this.textfield.setEnabled(false);
        textfield.setToolTipText(Messages.mStepTextFieldHint);
        // reserver some amount of space
        textfield.setText(Messages.mStepTextFieldReserveSpace);
        return textfield;
    }

    // -------------------------------------------------------------------------

    /**
     * Update the contents (i.e., the # of steps) of the text field.
     * 
     * @param text
     *            the text to display in the text field
     */
    public void updateTextfield(final String text) {
        if (textfield.isDisposed()) {
            return;
        }
        if (text == null) {
            // this.textfield.setVisible(false);
            this.textfield.setText(Messages.mStepTextFieldNoStep);
        } else {
            this.textfield.setText(text);
            // this.textfield.setVisible(true);
        }
    }

}
