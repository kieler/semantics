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
 * Interface to log the status and the actions of a SJProgram. This is necessary because some
 * embedded api's do not have the package java.util.logging which is typically used for this.
 * 
 * @author mhei
 * 
 */
public interface SJLogger {

    /**
     * The different Levels which can be used for logging.
     * 
     */
    public enum LogMsgTyp {
        /**
         * Used if the logged information is about execution an instruction.
         */
        INSTRUCTION,
        /**
         * Used if the logged information includes information about the current tick.
         */
        TICK_INFO,
        /**
         * Used if the logged information is about signals and their status. 
         */
        SIGNALS, 
        /**
         * Used if the logged information is a general info about the execution SJ program. 
         */
        PROGRAM_INFO
    }

    /**
     * Logs an information.
     * 
     * @param msgTyp
     *            The type of the message to log.
     * @param msg
     *            The message for the logger to interact with.
     */
    void log(LogMsgTyp msgTyp, String msg);
}
