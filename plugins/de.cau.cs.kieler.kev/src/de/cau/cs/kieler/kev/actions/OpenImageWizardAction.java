package de.cau.cs.kieler.kev.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.wizard.WizardDialog;

import de.cau.cs.kieler.kev.ui.OpenImageWizard;



public class OpenImageWizardAction extends Action {

	public OpenImageWizardAction() {
		this.setText("Open Wizard");
		this.setToolTipText("Load Image Wizard");
		this.setImageDescriptor(de.cau.cs.kieler.kev.KevPlugin.getImageDescriptor("icons/fileopen.png"));	
	}
	
	@Override
	public void run() {
		System.out.println("OpenImageWizardAction");
		OpenImageWizard wizard = new OpenImageWizard();
		WizardDialog dialog = new WizardDialog(null, wizard);
		wizard.setParentDialog(dialog);
		dialog.open();
	}
	
}
