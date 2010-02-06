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

import java.util.LinkedList;

import org.eclipse.core.runtime.IProgressMonitor;

import de.cau.cs.kieler.krep.evalbench.program.IAssembler;

/**
 * Interface for communication protocol layers used between the common layer and connection
 * protocols.
 * 
 * @kieler.rating 2009-12-10 proposed yellow ctr
 * 
 * @author msp, ctr
 */
public interface ICommunicationProtocol {

    /** Identifier for the KEP protocol. */
    String P_KEP = "kep";
    /** Identifier for the KReP protocol. */
    String P_KREP = "krep";

    /**
     * Adds a communication listener that is notified of all transferred data.
     * 
     * @param listener
     *            listener to be added
     */
    void addCommunicationListener(ICommunicationListener listener);

    /**
     * Removes a communication listener from the list.
     * 
     * @param listener
     *            listener to be removed
     */
    void removeCommunicationListener(ICommunicationListener listener);

    /**
     * Verifies communication by sending a command and receiving a return string.
     * 
     * @return true if the correct return string can be received from the processor.
     * 
     * @throws CommunicationException
     *             when no return string could be read
     */
    boolean verifyCommunication() throws CommunicationException;

    /**
     * Requests target information from the target and translates the received return string.
     * 
     * @return readable target information
     * @throws CommunicationException
     *             when the return string is invalid
     */
    String getTargetInfo() throws CommunicationException;

    /**
     * Loads a program onto the connected target.
     * 
     * @param program
     *            array of hex encoded instructions
     * @param monitor
     *            progress-monitor, null if nothing shall be displayed
     * @return true iff loading was successful
     * @throws CommunicationException
     *             when the program string has an invalid length
     * @throws LoadException
     *             cannot execute this program
     */
    boolean loadProgram(IAssembler program, IProgressMonitor monitor)
            throws CommunicationException, LoadException;

    /**
     * Resets the current program on the target.
     * 
     * @throws CommunicationException
     *             when an invalid reply was received
     */
    void reset() throws CommunicationException;

    /**
     * Performs a program tick by sending the global input signal status, executing the tick command
     * and reading the global output signal status.
     * 
     * @param maxSignals
     *            number of signals in the current program. 
     * @param inputs
     *            input signals
     * @param outputs
     *            An empty list of output signals, the actual outputs are added by the tick function.
     * @return number of instruction cycles to compute the tick
     * @throws CommunicationException
     *             when an invalid reply was received
     */
    int tick(int maxSignals, LinkedList<Signal> inputs, LinkedList<Signal> outputs)
            throws CommunicationException;

    /**
     * Requests an execution trace for the last tick command.
     * 
     * @return list of addresses of executed instructions
     * @throws CommunicationException
     *             when the received trace is invalid
     */
    int[] getExecutionTrace() throws CommunicationException;

    /**
     * When executed the target is set to continuous mode. Only external inputs and outputs are used
     * in this mode.
     * 
     * @throws CommunicationException
     *             when an exception occurs while sending the command
     */
    void continuousRun() throws CommunicationException;

    /**
     * Stops continuous mode and returns to single tick mode.
     * 
     * @throws CommunicationException
     *             when an invalid reply was received
     */
    void stopContinuous() throws CommunicationException;

    /**
     * add a comment to the communication trace. This is useful, if an esi-File is automatically
     * generated
     * 
     * @param string
     *            comment to the next operation
     */
    //void comment(String string);

}
