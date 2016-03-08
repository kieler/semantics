/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sccharts.prom.ev3timing;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.ide.ResourceUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;


import com.google.common.base.Objects;

/**
 * @author dso
 *
 */
public class Ev3TimingLaunchShortcut implements ILaunchShortcut {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void launch(final IEditorPart editor, final String mode) {
		IEditorInput _editorInput = editor.getEditorInput();
		final IFile file = ResourceUtil.getFile(_editorInput);
		boolean _notEquals = (!Objects.equal(file, null));
		if (_notEquals) {
			this.launch(file, mode);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void launch(final ISelection selection, final String mode) {
		if ((selection instanceof IStructuredSelection)) {
			final IStructuredSelection structuredSelection = ((IStructuredSelection) selection);
			Object _firstElement = structuredSelection.getFirstElement();
			if ((_firstElement instanceof IFile)) {
				Object _firstElement_1 = structuredSelection.getFirstElement();
				this.launch(((IFile) _firstElement_1), mode);
			}
		}
	}

	/**
	 * 
	 *
	 * 
	 * 
	 * 
	 * @param file
	 *            The file to be launched
	 * @param mode
	 *            The mode the launch should be performed in (e.g. 'run' or
	 *            'debug')
	 */
	private void launch(final IFile file, final String mode) {
		
		
		
		String CONSOLE_NAME = "ev3Timing";

		findConsole(CONSOLE_NAME);
		MessageConsole myConsole = findConsole(CONSOLE_NAME);
		MessageConsoleStream out = myConsole.newMessageStream();

	
		String tickFileName = null;
		String folderPath = null;
		editAndCreateTickAndMainFiles eT = new editAndCreateTickAndMainFiles();
		ssh ssh = new ssh();
		try {
			file.getParent().getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
			folderPath = file.getParent().getLocation().toString() + "/";

			for (IResource e : file.getParent().members()) {

				if (e.getFileExtension().equals("c")) {

					if (!e.getLocation().equals(file.getLocation())) {

						tickFileName = e.getName();
						tickFileName = tickFileName.substring(0,
								tickFileName.lastIndexOf("."));

					}
				}
			}
			;

			
			eT.start(folderPath, tickFileName);

			try {
				ProcessBuilder builder = new ProcessBuilder();
				builder.redirectErrorStream(true);
				builder.command("arm-none-linux-gnueabi-gcc", "-o", folderPath
						+ tickFileName + ".out", folderPath + "main.c");

				Process process;

				process = builder.start();

				InputStream is = process.getInputStream();
				BufferedReader br = new BufferedReader((new InputStreamReader(
						is)));
				StringBuilder sb = new StringBuilder();
				String line;
				while ((line = br.readLine()) != null) {
					sb.append(line + "\n");
				}

				while (process.isAlive()) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			file.getParent().getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
			ssh.start(folderPath, tickFileName);
			file.getParent().getProject().refreshLocal(IResource.DEPTH_INFINITE, null);

			

			out.println("Finished\n");
		} catch (Throwable _e) {
			throw Exceptions.sneakyThrow(_e);
		}

	}

	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}
}
