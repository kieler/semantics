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

import java.util.concurrent.Exchanger;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import de.cau.cs.kieler.sim.kart.IMessageDialog;

/**
 * Provide an easy to use interface to KART to display message dialogs using an extension point.
 * 
 * @author ssc
 * @kieler.rating 2012-02-23 red
 */
public class MessageDialog implements IMessageDialog {

    /**
     * Display a Yes/No question dialog. If the dialog cannot be displayed {@code false} is
     * returned.
     * 
     * @param title
     *            the title of the question dialog
     * @param message
     *            the message that will be displayed. Should be a question.
     * @return {@code true} if the user answered with Yes, {@code false} if he answered with No or
     *         the dialog could not be displayed.
     */
    public boolean question(final String title, final String message) {
        Exchanger<Boolean> ex = new Exchanger<Boolean>();
        Display.getDefault().asyncExec(new DialogRunnable(ex, title, message));

        try {
            boolean b = ex.exchange(false); // Doesn't matter what we send
            return b;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * DialogRunnable concurrently displays the dialog in the current shell.
     */
    private class DialogRunnable implements Runnable {
        private Exchanger<Boolean> ex;
        private String title;
        private String message;

        public DialogRunnable(final Exchanger<Boolean> ex, final String title, final String message) {
            this.ex = ex;
            this.title = title;
            this.message = message;
        }

        public void run() {
            Shell shell = Display.getCurrent().getShells()[0];
            try {
                if (shell != null) {
                    ex.exchange(org.eclipse.jface.dialogs.MessageDialog.openQuestion(null, title,
                            message));
                } else {
                    ex.exchange(false);
                }
            } catch (InterruptedException e) {
                // Blast...
                e.printStackTrace();
            }
        }
    }

    // -------------------------------------------------------------------------

}
