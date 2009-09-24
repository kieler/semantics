package de.cau.cs.kieler.krep.evalbench.application.editors;

import java.io.File;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.AbstractTextEditor;
import org.eclipse.ui.texteditor.IDocumentProvider;

import de.cau.cs.kieler.krep.evalbench.application.Activator;

/**
 * A simple text editor for unknown file types.
 * 
 * @see org.eclipse.ui.examples.rcp.texteditor.editors.SimpleDocumentProvider
 * @since 3.0
 */
public class TextEditor extends AbstractTextEditor {

	/**
	 * Creates a new simple text editor.
	 */
	public TextEditor() {
		super();
		// make sure we inherit all the text editing commands (delete line etc).
		setKeyBindingScopes(new String[] { "org.eclipse.ui.textEditorScope" });  //$NON-NLS-1$
		configureInsertMode(SMART_INSERT, false);
		setDocumentProvider(new TextDocumentProvider());
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.texteditor.AbstractTextEditor#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.texteditor.AbstractTextEditor#doSaveAs()
	 */
	@Override
	public void doSaveAs() {
		Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		FileDialog fileDialog = new FileDialog(shell, SWT.SAVE);
		fileDialog.setText("Save File");
		fileDialog.setFilterPath(Activator.userFolder);
		final String path = fileDialog.open();
		if (path != null && path.length() > 0) {
			final File file = new File(path);
			if (file.exists()) {
				// ask whether the existing file should be overwritten
				boolean answer = MessageDialog.openQuestion(shell, "File exists",
						"The selected File already exists. Should it be overwritten?");
				// cancel the save process if the answer is "No"
				if (!answer)
					return;
			}
			try {
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().run(false, false, new IRunnableWithProgress() {
					public void run(IProgressMonitor monitor) {
						try {
							// create editor input
							Activator.userFolder = file.getParent();
							IEditorInput input = new PathEditorInput(new Path(file.getAbsolutePath()));
							IDocumentProvider documentProvider = getDocumentProvider();
							// save the document
							documentProvider.saveDocument(monitor, input, documentProvider.getDocument(getEditorInput()), true);
							// set the new editor input
							setInputWithNotify(input);
							setPartName(file.getName());
						} catch (CoreException e) {
							IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, 1, e.getMessage(), e); 
							ErrorDialog.openError(PlatformUI.getWorkbench().getDisplay().getActiveShell(),
									"Error saving file", "Could not save to the selected file.", status);
						}
					}
				});
			} catch (Exception e) {
				// silently ignore exception
			}
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.texteditor.AbstractTextEditor#doSetInput(org.eclipse.ui.IEditorInput)
	 */
	@Override
	protected void doSetInput(IEditorInput input) throws CoreException {
		super.doSetInput(input);
		// extract the file name from the path name
		File file = new File(input.getName());
		setPartName(file.getName());
	}
	
}
