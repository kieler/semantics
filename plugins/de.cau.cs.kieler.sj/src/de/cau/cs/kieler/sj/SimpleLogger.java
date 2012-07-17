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
 */
package de.cau.cs.kieler.sj;

/**
 * A very simple logger for a SJ program. If this logger is used all messages logged by the SJ
 * program will printed via <code>System.out.println()</code>
 * 
 * @author mhei
 * 
 */
public class SimpleLogger implements SJLogger {

    /**
     * Prints all logged messages to the terminal.
     * 
     * @param msgTyp
     *            The type of the given message.
     * @param message
     *            The message to log at the terminal.
     */
    public void log(final LogMsgTyp msgTyp, final String message) {

        System.out.println(message);

    }

}
