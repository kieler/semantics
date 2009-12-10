/*
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
 */
package de.cau.cs.kieler.krep.evalbench.comm;

/**
 * Generic interface for the processors when connected via JNI.
 * 
 * @kieler.rating 2009-12-10 proposed yellow msp
 * 
 * @author ctr
 * 
 */
public interface IKrepWrapper {

    /**
     * Close the connection.
     */
    void terminate();

    /**
     * @return true if new outputs are available
     */
    boolean hasOutput();

    /**
     * @return the next output
     */
    byte getOutput();

    /**
     * perform one tick.
     */
    void step();

    /**
     * @param b
     *            byte to send to the processor
     */
    void send(byte b);

    /**
     * Tell the processor to log the communication into a log-File in esi Format.
     * 
     * @param esiFile
     *            name of the log File
     */
    void saveEsi(String esiFile);

    /**
     * @param comment
     *            comment to send to the processor (used for logging)
     */
    void comment(String comment);

    /**
     * @return retrieve the name of the connected processor
     */
    String getName();
}
