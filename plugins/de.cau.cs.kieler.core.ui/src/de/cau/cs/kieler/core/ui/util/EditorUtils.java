/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.core.ui.util;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.core.ui.CoreUIPlugin;
import de.cau.cs.kieler.core.util.Maybe;

/**
 * Static utility class for working with editors.
 *
 * @author haf, chsch
 *
 */
public final class EditorUtils {

    private EditorUtils() {
    }

    /**
     * Return the last active editor. Returns the active editor of the current
     * page if it is not null. This might happen when you maximize a view and
     * minimize it again. Returns the first editor of any open editors if the
     * active editor is null.
     *
     * @author haf
     *
     * @return the last open active editor, which may be {@code null} if there is no open editor
     * @deprecated Using such a static method is a cheap way to get around the problem of
     *     finding the right context for an operation. This may fail in some situations. Therefore,
     *     a more generic and reliable solution for managing the context of things that happen
     *     in view management must be found.
     */
    public static IEditorPart getLastActiveEditor() {
        final Maybe<IEditorPart> editor = Maybe.create();
        MonitoredOperation.runInUI(new Runnable() {
            public void run() {
                IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                if (window == null) {
                    return;
                }
                IWorkbenchPage page = window.getActivePage();
                if (page == null) {
                    return;
                }
                editor.set(page.getActiveEditor());
                if (editor.get() == null) {
                    IEditorReference[] editors = page.getEditorReferences();
                    if (editors.length > 0) {
                        editor.set(editors[0].getEditor(true));
                    }
                }
            }
        }, true);
        return editor.get();
    }


    /**
     * Convenience method for dropping log infos.
     *
     * @author chsch
     *
     * @param status a status to be logged
     */
    public static void log(final IStatus status) {
        if (CoreUIPlugin.getDefault() != null) {
            CoreUIPlugin.getDefault().getLog().log(status);
        }
    }

}
