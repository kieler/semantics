/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
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

package de.cau.cs.kieler.kev.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.wizard.WizardDialog;

import de.cau.cs.kieler.kev.Activator;
import de.cau.cs.kieler.kev.Messages;
import de.cau.cs.kieler.kev.ui.OpenWizard;

/**
 * Implements the action for the OpenWizard window. 
 * 
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 *
 */

public class OpenWizardAction extends Action {
    
    /**
     * The constructor.
     */
    public OpenWizardAction() {
        this.setText(Messages.ActionOpenFileWizard);
        this.setToolTipText(Messages.ActionHintOpenFileWizard);
        this.setImageDescriptor(Activator.getDefault()
                .getImageDescriptor("icons/view/fileopen.png"));
    }

    @Override
    public void run() {
        OpenWizard wizard = new OpenWizard();
        WizardDialog dialog = new WizardDialog(null, wizard);
        wizard.setParentDialog(dialog);
        dialog.open();
    }

}
