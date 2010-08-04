package de.tu_berlin.cs.tfs.muvitorkit.ui.wizards.template;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

/**
 * This is a wizard to create a file resource for a Muvitor implementation. By
 * default, it is registered in the plugin.xml as creation wizard for the
 * editor.
 * 
 * <p>
 * The wizard uses a MuvitorFileCreationPage which creates one file with the
 * file extension that has been specified in plugin.xml.
 * 
 * @author Tony Modica
 */
public class MuvitorFileCreationWizard extends Wizard implements INewWizard {

	private MuvitorFileCreationPage page;

	private IStructuredSelection selection;

	private IWorkbench workbench;

	/**
	 * Adding the RONFileCreationPage to the wizard.
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.IWizard#addPages()
	 */
	@Override
	public void addPages() {
		page = new MuvitorFileCreationPage(workbench, selection);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.IWizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		return page.finish();
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 * org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(final IWorkbench aWorkbench, final IStructuredSelection sel) {
		workbench = aWorkbench;
		selection = sel;
	}
}
