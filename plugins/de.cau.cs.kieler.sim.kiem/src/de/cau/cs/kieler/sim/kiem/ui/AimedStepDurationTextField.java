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
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.Messages;

/**
 * The Class AimedStepDurationTextField. This is the GUI component that shows the currently set
 * aimed step duration for the execution. It can also be used to edit this duration.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 proposed yellow
 * 
 */
public class AimedStepDurationTextField extends ControlContribution implements KeyListener,
        FocusListener {

    /** The SWT text field. */
    private Text textfield;

    /** A reference to to the KIEM plug-in for triggering refreshes. */
    private KiemPlugin kIEM;

    /** Indicates if the text field is currently enabled. */
    private boolean enabled;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new aimed step duration text field.
     * 
     * @param kIEMParam
     *            a reference to to the KIEM plug-in
     */
    public AimedStepDurationTextField(final KiemPlugin kIEMParam) {
        super(Messages.mDurationTextFieldName);
        this.kIEM = kIEMParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Enables or disables the text field. Only sets the status if there already is a text field
     * created by the GUI createControl.
     * 
     * @param enabledParam
     *            the new status of the enableness
     */
    public void setEnabled(final boolean enabledParam) {
        this.enabled = enabledParam;
        if (textfield == null) {
            return;
        }
        if (enabled) {
            Display.getDefault().asyncExec(new Runnable() {
                public void run() {
                    textfield.setEnabled(true);
                }
            });
        } else {
            Display.getDefault().asyncExec(new Runnable() {
                public void run() {
                    textfield.setEnabled(false);
                }
            });
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Returns whether the text field is currently enabled or not.
     * 
     * @return true, if text field is enabled
     */
    @Override
    public boolean isEnabled() {
        return this.enabled;
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
        this.updateDuration();
        textfield = new Text(parent, SWT.BORDER);
        // per default enable it
        this.textfield.setEnabled(this.enabled);
        textfield.setToolTipText(Messages.mDurationTextFieldHint);
        this.update();
        // add some listeners
        textfield.addKeyListener(this);
        textfield.addFocusListener(this);
        return textfield;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void keyPressed(final KeyEvent e) {
        if (e.character == '\r') {
            updateDuration();
            KiemPlugin.getDefault().setViewFocus();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void keyReleased(final KeyEvent e) {
        /* nothing */
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void focusLost(final FocusEvent e) {
        updateDuration();
        textfield.setText("" + kIEM.getAimedStepDuration() + Messages.mDurationTextFieldSuffix);
    }

    // -------------------------------------------------------------------------

    /**
     * Updates the step duration. This methods also checks the bounds and it checks if a valid
     * integer has been entered. In case the bounds are not met or the user entered an invalid
     * integer number, the duration is not updated and the text field is set back to the initial
     * value.
     */
    private void updateDuration() {
        if (textfield == null) {
            return;
        }
        try {
            int aimedStepDuration = Integer.parseInt(textfield.getText().trim());
            if (aimedStepDuration < KiemPlugin.AIMED_STEP_DURATION_MIN) {
                throw (new NumberFormatException(Messages.mWarningDurationTooSmall
                        + KiemPlugin.AIMED_STEP_DURATION_MIN + Messages.mDurationTextFieldSuffix
                        + "!"));
            }
            if (aimedStepDuration > KiemPlugin.AIMED_STEP_DURATION_MAX) {
                throw (new NumberFormatException(Messages.mWarningDurationTooLarge
                        + KiemPlugin.AIMED_STEP_DURATION_MAX + Messages.mDurationTextFieldSuffix
                        + "!"));
            }
            kIEM.setAimedStepDuration(aimedStepDuration);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    // -------------------------------------------------------------------------
    
    @Override
    public void update() {
        // reserve some amount of space and declare default value
        textfield.setText(KiemPlugin.getDefault().getAimedStepDuration()
                + Messages.mDurationTextFieldSuffix + Messages.mDurationTextFieldReserveSpace);
        super.update();
    }
    
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void focusGained(final FocusEvent e) {
        // if the text field gets the focus, set the current duration
        textfield.setText("" + kIEM.getAimedStepDuration());
    }

}
