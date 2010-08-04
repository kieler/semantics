package de.tu_berlin.cs.tfs.muvitorkit.ui.wizards.template;

import de.tu_berlin.cs.tfs.muvitorkit.ui.MuvitorActivator;
import de.tu_berlin.cs.tfs.muvitorkit.ui.MuvitorTreeEditor;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;

/**
 * The "New" wizard page is used in the {@link MuvitorFileCreationWizard} and
 * allows setting the container for the new file as well as the file name. The
 * page will only accept file name without the extension OR with the extension
 * that matches the one specified in plugin.xml.
 * 
 * @author Tony Modica
 */
public class MuvitorFileCreationPage extends WizardNewFileCreationPage {

	final private IWorkbench workbench;

	private static int eCount = 1;

	public MuvitorFileCreationPage(final IWorkbench workbench,
			final IStructuredSelection selection) {
		super(MuvitorTreeEditor.fileExtension.toUpperCase()
				+ " File Creation Wizard", selection);
		final String editorName = MuvitorActivator
				.getUniqueExtensionAttributeValue("org.eclipse.ui.editors",
						"name");
		setTitle(editorName + " File");
		setDescription("This wizard creates a new file with extension '"
				+ MuvitorTreeEditor.fileExtension
				+ "' that can be opened by the " + editorName);
		this.workbench = workbench;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets
	 * .Composite)
	 */
	@Override
	public void createControl(final Composite parent) {
		super.createControl(parent);
		setFileName(MuvitorTreeEditor.fileExtension.toUpperCase() + eCount
				+ "." + MuvitorTreeEditor.fileExtension);
		setPageComplete(validatePage());
	}

	public boolean finish() {
		final IFile newFile = createNewFile();
		if (newFile == null) {
			return false; // ie.- creation was unsuccessful
		}

		// the file resource has been created, open it for editing
		try {
			final IWorkbenchPage page = workbench.getActiveWorkbenchWindow()
					.getActivePage();
			if (page != null) {
				final String editorID = MuvitorActivator
						.getUniqueExtensionAttributeValue(
								"org.eclipse.ui.editors", "id");
				page.openEditor(new FileEditorInput(newFile), editorID, true);
				// IDE.openEditor(page, newFile, true);
			}
		} catch (final PartInitException e) {
			e.printStackTrace();
			return false;
		}
		eCount++;
		return true;
	}
}
