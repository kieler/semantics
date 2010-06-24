package de.cau.cs.kieler.synccharts.text.kits.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.xtext.ui.editor.XtextEditor;

public class CustomizedXtextEditor extends XtextEditor {

	public void doSave(IProgressMonitor progressMonitor) {
		super.doSave(progressMonitor);
	}
	
	public void doSetInput(IEditorInput input) throws CoreException {
		super.doSetInput(input);
	}
}
