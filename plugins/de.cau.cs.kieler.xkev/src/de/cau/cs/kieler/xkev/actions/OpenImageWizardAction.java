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

package de.cau.cs.kieler.xkev.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.wizard.WizardDialog;

import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.Messages;
import de.cau.cs.kieler.xkev.ui.OpenImageWizard;

public class OpenImageWizardAction extends Action {

    public OpenImageWizardAction() {
        this.setText(Messages.ActionOpenFileWizard);
        this.setToolTipText(Messages.ActionHintOpenFileWizard);
        this.setImageDescriptor(Activator.getDefault()
                .getImageDescriptor("icons/view/fileopen.png"));
    }

    @Override
    public void run() {
        OpenImageWizard wizard = new OpenImageWizard();
        WizardDialog dialog = new WizardDialog(null, wizard);
        wizard.setParentDialog(dialog);
        dialog.open();
    }

}
