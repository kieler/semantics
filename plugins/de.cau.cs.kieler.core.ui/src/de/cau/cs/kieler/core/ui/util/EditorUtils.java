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

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PlatformUI;

/**
 * Static utility class for working with editors.
 * 
 * @author haf
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
     * @return the last open active editor, maybe null if there is no open
     *         editor or called from non-UI thread
     */
    public static IEditorPart getLastActiveEditor() {
        IEditorPart editor = null;
        try {
            editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                    .getActiveEditor();
            if (editor == null) {
                IEditorReference[] editors = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                        .getActivePage().getEditorReferences();
                editor = editors[0].getEditor(true);
            }
        } catch (NullPointerException e) {
            /* nothing */
        } catch (ArrayIndexOutOfBoundsException e1) {
            /* nothing */
        }
        return editor;
    }

}
