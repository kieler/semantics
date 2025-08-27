/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kex.ui.actions;

import java.util.Properties;

import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.intro.impl.IntroPlugin;
import org.eclipse.ui.intro.IIntroSite;
import org.eclipse.ui.intro.config.IIntroAction;

import de.cau.cs.kieler.kex.ui.wizards.importing.ExampleImportWizard;

/**
 * This class extends the {@code IIntroAction}. That class can headless execute the importwizard of
 * kex.
 * 
 * @author pkl
 */
public class ImportWizardAction implements IIntroAction {

    /**
     * closes the Introscreen and starts the ExampleImportWizard.
     * 
     * @param params
     *            , Properties
     * @param site
     *            , IIntrosite
     */
    @SuppressWarnings("restriction")
    public final void run(final IIntroSite site, final Properties params) {
        IntroPlugin.closeIntro();
        IWorkbench wb = PlatformUI.getWorkbench();
        IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
        ExampleImportWizard wizard = new ExampleImportWizard();
        wizard.init(wb, StructuredSelection.EMPTY);
        WizardDialog dialog = new WizardDialog(win.getShell(), wizard);
        dialog.create();
        dialog.getShell().pack();
        dialog.open();
    }
}
