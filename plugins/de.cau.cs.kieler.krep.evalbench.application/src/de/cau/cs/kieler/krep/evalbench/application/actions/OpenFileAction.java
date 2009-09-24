/**********************************************************************
Copyright (c) 2000, 2003 IBM Corp. and others.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Common Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/cpl-v10.html

Contributors:
	IBM Corporation - Initial implementation
**********************************************************************/
package de.cau.cs.kieler.krep.evalbench.application.actions;

import java.io.File;


import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;

import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.krep.evalbench.application.Activator;
import de.cau.cs.kieler.krep.evalbench.application.editors.PathEditorInput;

/**
 * Action that opens a file and the corresponding editor.
 * 
 * @see org.eclipse.ui.examples.rcp.texteditor.actions.OpenFileAction
 * @since 3.0
 */
public class OpenFileAction extends Action implements IWorkbenchWindowActionDelegate {

	/** the default editor used for unknown file types */
	private static final String DEFAULT_EDITOR = "de.cau.cs.kieler.krep.evalbench.application.textEditor"; 
	
	// the workbench window that was used to initialize this action
	private IWorkbenchWindow fWindow;

	/**
	 * Creates a new open file action.
	 */
	public OpenFileAction() {
		setEnabled(true);
	}

	/*
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#dispose()
	 */
	public void dispose() {
		fWindow = null;
	}

	/*
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#init(org.eclipse.ui.IWorkbenchWindow)
	 */
	public void init(IWorkbenchWindow window) {
		fWindow = window;
	}

	/*
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		run();
	}

	/*
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	    // Nothing to do
	}

	/*
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		// open file dialog to open file
		FileDialog dialog = new FileDialog(fWindow.getShell(), SWT.OPEN);
		dialog.setText("Open File");
		dialog.setFilterPath(Activator.userFolder);
		final String path = dialog.open();
		if (path != null && path.length() > 0) {
			try {
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().run(false, false, new IRunnableWithProgress() {
					public void run(IProgressMonitor monitor) {
						monitor.beginTask("Open file", IProgressMonitor.UNKNOWN);
						// open editor with given file
						File file = new File(path);
						Activator.userFolder = file.getParent();
						IEditorInput input = new PathEditorInput(new Path(file.getAbsolutePath()));
						IEditorDescriptor descriptor = fWindow.getWorkbench().getEditorRegistry()
							.getDefaultEditor(file.getName());
						String editorId;
						if (descriptor != null) {
							editorId = descriptor.getId();
						} else {
							editorId = DEFAULT_EDITOR;
						}
						IWorkbenchPage page = fWindow.getActivePage();
						try {
							page.openEditor(input, editorId);
						} catch (PartInitException e) {
							e.printStackTrace();
						}
						monitor.done();
					}
				});
			} catch (Exception e) {
				// silently ignore exception
			}
		}
	}

}
