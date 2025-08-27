/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.core.model.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.elk.core.util.Maybe;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.cau.cs.kieler.core.model.CoreModelPlugin;

/**
 * Static utility class for working with editors.
 * 
 * @author haf, chsch
 * @deprecated Using such a static method is a cheap way to get around the problem of finding
 *             the right context for an operation. This may fail in some situations. Therefore,
 *             a more generic and reliable solution for managing the context of things that
 *             happen in view management must be found.<br>
 *             <br>
 *             Be careful cause this method blocks waiting for the UI thread, this could cause a
 *             deadlock if other depending code also waits for the UI thread.
 * @kieler.ignore Ignored since the class is deprecated anyway.
 */
public final class EditorUtils {

    /** The done flag for finding the last active editor. */
    private static boolean doneGetLastActiveEditor = true;

    /** The Constant WAIT_SLEEP_TIME for finding the last active editor. */
    private static final int WAIT_SLEEP_TIME = 10;

    /** The last found editor. */
    private static Maybe<IEditorPart> editor = Maybe.create();

    /**
     * Private constructor to prevent instantiation.
     */
    private EditorUtils() {
    }

    /**
     * Return the last active editor. Returns the active editor of the current page if it is not
     * null. This might happen when you maximize a view and minimize it again. Returns the first
     * editor of any open editors if the active editor is null.
     * 
     * @author haf
     * 
     * @return the last open active editor, which may be {@code null} if there is no open editor
     * @deprecated 
     */
    public static IEditorPart getLastActiveEditor() {
        if (!doneGetLastActiveEditor) {
            // If we are still searching concurrently for the last active editor then exit
            // here with the last one found!
            return editor.get();
        }
        doneGetLastActiveEditor = false;

        Runnable runnable = new Runnable() {
            public void run() {
                IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                if (window == null) {
                    doneGetLastActiveEditor = true;
                    return;
                }
                IWorkbenchPage page = window.getActivePage();
                if (page == null) {
                    doneGetLastActiveEditor = true;
                    return;
                }
                editor.set(page.getActiveEditor());
                if (editor.get() == null) {
                    IEditorReference[] editors = page.getEditorReferences();
                    if (editors.length > 0) {
                        editor.set(editors[0].getEditor(true));
                    }
                }
                doneGetLastActiveEditor = true;
            }
        };
        
        Display display = Display.getCurrent();
        if (display == null) {
            display = PlatformUI.getWorkbench().getDisplay();
            display.asyncExec(runnable);
            while (!doneGetLastActiveEditor) {
                // blocking wait until UI thread got the last active editor
                try {
                    Thread.sleep(WAIT_SLEEP_TIME);
                } catch (InterruptedException e) {
                    // ignore the interrupt
                }
            }
        } else {
            // we are currently in the UI thread, so just execute the code
            runnable.run();
        }
        
        return editor.get();
    }

    /**
     * Convenience method for dropping log infos.
     * 
     * @author chsch
     * 
     * @param status
     *            a status to be logged
     */
    public static void log(final IStatus status) {
        if (CoreModelPlugin.getDefault() != null) {
            CoreModelPlugin.getDefault().getLog().log(status);
        }
    }



}
