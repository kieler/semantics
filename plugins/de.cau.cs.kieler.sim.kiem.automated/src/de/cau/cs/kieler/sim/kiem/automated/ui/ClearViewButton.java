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
package de.cau.cs.kieler.sim.kiem.automated.ui;

import org.eclipse.jface.action.ControlContribution;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import de.cau.cs.kieler.sim.kiem.automated.KiemAutomatedPlugin;
import de.cau.cs.kieler.sim.kiem.automated.execution.ExecutionManager;

/**
 * This button is responsible for clearing the results view.
 * 
 * @author soh
 * @kieler.rating 2010-02-01 proposed yellow
 */
public class ClearViewButton extends ControlContribution implements
        SelectionListener {

    /** The actual button. */
    private Button button;

    // --------------------------------------------------------------------------

    /**
     * Creates a new ClearViewButton.
     * 
     * @param id
     *            the id of this button
     */
    public ClearViewButton(final String id) {
        super(id);
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Control createControl(final Composite parent) {
        button = new Button(parent, SWT.BORDER);
        button.setText("Clear");
        button.setToolTipText("Clear the view of all tables.");
        button.addSelectionListener(this);

        return button;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void widgetDefaultSelected(final SelectionEvent e) {
    }

    /**
     * {@inheritDoc}
     */
    public void widgetSelected(final SelectionEvent e) {
        if (e.widget == button && !ExecutionManager.getInstance().isRunning()) {
            KiemAutomatedPlugin.getAutomatedEvalView().clear();
        }
    }

}
