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

import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.ControlContribution;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.automated.execution.AutomationManager;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * The button that opens the execution wizard and starts the automated execution
 * with the data obtained from the wizard.
 * 
 * @author soh
 * @kieler.rating 2010-01-29 proposed yellow
 */
public class AutomatedExecutionButton extends ControlContribution {

    /** The actual button. */
    private Button button;

    /** The parent component. */
    private Composite parentComponent;

    // --------------------------------------------------------------------------

    /**
     * Creates a new AutomatedExecutionButton.
     * 
     * @param id
     *            the identifier for this button
     */
    public AutomatedExecutionButton(final String id) {
        super(id);
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Control createControl(final Composite parent) {
        parentComponent = parent;
        button = new Button(parent, SWT.BORDER);
        button.setText("Automated...");
        SelectionListener listener = new SelectionListener();
        button.addListener(SWT.Selection, listener);
        return button;
    }

    // --------------------------------------------------------------------------

    /**
     * Open the wizard and start the execution.
     */
    private void openExecutionWizard() {
        AutomatedExecutionWizard newWizard = new AutomatedExecutionWizard();

        WizardDialog dlg = new WizardDialog(parentComponent.getShell(),
                newWizard);

        if (dlg.open() == WizardDialog.OK) {
            // gather data from wizard
            IPath[] executionFiles = newWizard.getExecutionFiles();
            List<IPath> modelFiles = newWizard.getModelFiles();
            List<KiemProperty> properties = newWizard.getProperties();

            try {
                // save the editor if it is dirty to prevent constant popups
                if (KiemPlugin.getDefault().getKIEMViewInstance().isDirty()) {
                    KiemPlugin.getDefault().getKIEMViewInstance().doSave(null);
                }
            } catch (NullPointerException e0) {
                // view not opened
            }

            // start the execution
            AutomationManager.getInstance().executeAsync(executionFiles,
                    modelFiles, properties);
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * The listener that listens for button clicks.
     * 
     * @author soh
     * @kieler.rating 2010-01-29 proposed yellow
     */
    private class SelectionListener implements Listener {

        /**
         * {@inheritDoc}
         */
        public void handleEvent(final Event event) {
            if (event.widget == button
                    && !AutomationManager.getInstance().isRunning()) {
                try {
                    openExecutionWizard();
                } catch (RuntimeException e0) {
                    e0.printStackTrace();
                }
            }
        }

    }
}
