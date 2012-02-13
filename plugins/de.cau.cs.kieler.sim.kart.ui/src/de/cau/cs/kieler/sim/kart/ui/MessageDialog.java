/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kart.ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import de.cau.cs.kieler.sim.kart.IMessageDialog;

/**
 * @author ssc
 * 
 */
public class MessageDialog implements IMessageDialog {

    /**
     * Display a Yes/No question dialog.
     * If the dialog cannot be displayed {@code false} is returned.
     * 
     * @param title the title of the question dialog
     * @param message the message that will be displayed. Should be a question.
     * @return {@code} true if the user answered with Yes, false if he answered with No or the dialog
     *         could not be displayed.
     */
    public boolean question(String title, String message) {
        /* Displaying a question dialog does not currently work, because the following
         * code would be executed in a non-UI thread. SWT is single-threaded only and can only
         * be displayed in the UI thread.
         */
        //Shell shell = Display.getCurrent().getShells()[0];
        //if (shell != null) {
        //    return org.eclipse.jface.dialogs.MessageDialog.openQuestion(null, title, message);
        //} else {
        //    return false;
        //}
        return false;
    }

}
