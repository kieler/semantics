/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.helpers;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;

//import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.PlatformUI;

/**
 * @author haf
 * 
 */
public class Tools {

	private static long time;

	/**
	 * Runs a runnable with progress in the UI Thread of the active workbench
	 * window.
	 * 
	 * @param runnable
	 *            runnable to run
	 */
	public static void runWithProgress(IRunnableWithProgress runnable) {
		try {
			// IRunnableContext context =
			PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			PlatformUI.getWorkbench().getProgressService().run(true, false,
					runnable);// .runInUI(context, runnable, null);
		} catch (InvocationTargetException e) {
			// silently ignore exception
		} catch (InterruptedException e) {
			// silently ignore exception
		}
	}

	/**
	 * Very simple dialog.
	 * 
	 * @param msg
	 * @author haf
	 */
	/*
	 * public static void showDialog(String msg) { showDialog(msg, null); }
	 */

	/**
	 * Very simple exception dialog.
	 * 
	 * @param exc
	 * @author haf
	 */
	/*
	 * public static void showDialog(Exception exc) { showDialog(null, exc); }
	 */

	/**
	 * Error Dialog displaying a message and a details field. In the details
	 * field is printed the stack trace.
	 * 
	 * @param msg
	 * @param exc
	 */
	/*
	 * public static void showDialog(String msg, Exception exc) {
	 * PlatformUI.getWorkbench().getDisplay().syncExec( new DiagramRunnable(msg,
	 * exc)); }
	 */

	/**
	 * for time measurement purposes Should be called at start of measuring
	 */
	public static void tic() {
		time = System.currentTimeMillis();
	}

	/**
	 * for time measurement purposes
	 * 
	 * @return elapsed time since calling tic() in milliseconds
	 */
	public static long tac() {
		return System.currentTimeMillis() - time;
	}

	/**
	 * for time measurement purposes
	 * 
	 * @return elapsed time since calling tic() in human readable form
	 */
	public static String showTime() {
		long time = tac();
		long sec = 1000;
		long min = 60 * sec;
		long hour = 60 * min;

		String res = "";
		if (time > hour) {
			res += time / hour + "h ";
			time = time % hour;
		}
		if (time > min) {
			res += time / min + "m ";
			time = time % min;
		}
		if (time > sec) {
			res += time / sec + ".";
			time = time % sec;
		}
		String ms = String.valueOf(time);
		while (ms.length() < 3) {
			ms = "0" + ms;
		}
		res += ms + "s";

		return res;
	}

	/**
	 * Takes a URI and exchanges the extension in the path segment with a new
	 * one.
	 * 
	 * @param uri
	 * @param extension
	 * @return uri with replaced extension
	 * @throws URISyntaxException
	 */
	public static URI exchangeExtension(URI uri, String extension)
			throws URISyntaxException {
		String path = uri.getPath();
		int index = path.lastIndexOf('.');
		String pathWithoutExtension = path.substring(0, index);
		String newPath = pathWithoutExtension + '.' + extension;
		// clone uri with adapted path segment
		URI newUri = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(),
				uri.getPort(), newPath, uri.getQuery(), uri.getFragment());
		return newUri;
	}

	/**
	 * @param i
	 *            integer containing a byte
	 * @return Hex String for this integer value
	 */
	public static String toHex(final int i) {
		String res = Integer.toHexString(i);
		if (res.length() == 1) {
			res = "0" + res;
		}
		return res;
	}

	/**
	 * @param name
	 *            the name of a file
	 * @return the suffix of file, containing its type
	 */
	public static String getSuffix(final String name) {
		int pos = name.lastIndexOf('.');
		if (pos == -1) {
			return "";
		} else {
			String res = name.substring(pos);
			return res;
		}
	}

}
/**
 * A simple runnable that will display an Error dialog with a message and the
 * stack-trace of the Exception in a details pane. This can be called by the
 * current Display thread. Necessary because of SWT's multi-threading
 * principles.
 * 
 * e.g. call: PlatformUI.getWorkbench().getDisplay().syncExec(new
 * DiagramRunnable(msg,exc));
 * 
 * @author haf
 * 
 */
/*
 * class DiagramRunnable implements Runnable { String msg;
 * 
 * Exception exc;
 * 
 * DiagramRunnable(String msg, Exception exc) { this.msg = msg; if (this.msg ==
 * null) this.msg = "An Exception was thrown."; this.exc = exc; if (this.exc ==
 * null) { this.exc = new Exception("not specified"); } }
 * 
 * @Override public void run() { Exception alibiException = new
 * Exception(exc.toString()); Status s = new Status(IStatus.ERROR, null,
 * exc.getMessage(), alibiException); //
 * ErrorDialog.openError(null,"Error",msg,s); //
 * AbortErrorDialog.openError(msg,s,true); }
 * 
 * }
 */