/*
 * SJ - Synchronous Java.
 *
 * http://www.informatik.uni-kiel.de/rtsys/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package sj.exceptions;

/**
 * Runtime exception which is thrown if something is wrong with a SJThread. This Exception is often
 * thrown if there is a problem with the currently running thread.
 * 
 * A Typical occurrence of this exception is if you forget a <code>break;</code> command in the
 * program.
 * 
 * @author mhei
 * @see sj.SJThread
 * 
 */
public class ThreadException extends RuntimeException {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Creates a new thread exception.
     */
    public ThreadException() {
        super();
    }

    /**
     * Creates a new thread exception with a given error message.
     * 
     * @param errMessage
     *            The error message for the exception.
     */
    public ThreadException(final String errMessage) {
        super(errMessage);
    }
}
