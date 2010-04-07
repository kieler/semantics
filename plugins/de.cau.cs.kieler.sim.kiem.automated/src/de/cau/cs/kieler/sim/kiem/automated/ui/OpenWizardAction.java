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
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.automated.KiemAutomatedPlugin;
import de.cau.cs.kieler.sim.kiem.automated.execution.AutomationManager;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * The action that opens the execution wizard and starts the automated execution
 * with the data obtained from the wizard.
 * 
 * @author soh
 * @kieler.rating 2010-01-29 proposed yellow
 */
public class OpenWizardAction extends Action implements IViewActionDelegate {

    // --------------------------------------------------------------------------

    @Override
    public void run() {
        if (!AutomationManager.getInstance().isRunning()) {
            AutomatedExecutionWizard newWizard = new AutomatedExecutionWizard();

            WizardDialog dlg = new WizardDialog(KiemAutomatedPlugin.getShell(),
                    newWizard);

            if (dlg.open() == WizardDialog.OK) {
                // gather data from wizard
                IPath[] executionFiles = newWizard.getExecutionFiles();
                List<IPath> modelFiles = newWizard.getModelFiles();
                List<KiemProperty> properties = newWizard.getProperties();

                try {
                    // save the editor if it is dirty to prevent constant popups
                    if (KiemPlugin.getDefault().isDirty()) {
                        KiemPlugin.getDefault().doSave(null, null);
                    }
                } catch (NullPointerException e0) {
                    // view not opened
                }

                // start the execution
                AutomationManager.getInstance().executeAsync(executionFiles,
                        modelFiles, properties, false);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageDescriptor getImageDescriptor() {
        return KiemAutomatedPlugin.getAutoImageDescriptor();
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public String getToolTipText() {
        return "Launch an Automated Execution.";
    }

    /**
     * {@inheritDoc}
     */
    public void init(final IViewPart view) {
    }

    /**
     * {@inheritDoc}
     */
    public void run(final IAction action) {
        try {
            run();
        } catch (RuntimeException e0) {
            e0.printStackTrace();
        }
    }

    /**
     * {@inheritDoc}
     */
    public void selectionChanged(final IAction action,
            final ISelection selection) {
    }

    // --------------------------------------------------------------------------

}
