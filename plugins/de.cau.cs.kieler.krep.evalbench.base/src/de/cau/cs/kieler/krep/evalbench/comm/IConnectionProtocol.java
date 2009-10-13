/******************************************************************************
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
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.comm;

import java.util.LinkedList;

import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;

/**
 * Interface for connection protocol layers like TCP/IP and RS-232.
 * 
 * @author msp
 */
public interface IConnectionProtocol {

	/**
	 * Initializes connection.
	 * 
	 * @param device
	 *            device to connect with, e.g. serial port name
	 * @param port
	 *            port number, e.g. for socket connections
	 * @return message describing initialization results
	 * @throws CommunicationException
	 *             when an error occurred during initialization
	 */
	public String initialize(String device, int port)
			throws CommunicationException;

	/**
	 * Closes connection and removes locks on the involved device.
	 */
	public void dispose();

	/**
	 * Sends data to the target.
	 * 
	 * @param data
	 *            data to be sent
	 * @throws CommunicationException
	 *             when an exception occurs while sending data
	 */
	public void send(String data) throws CommunicationException;

	/**
	 * Sends data to the target.
	 * 
	 * @param data
	 *            data to be sent
	 * @throws CommunicationException
	 *             when an exception occurs while sending data
	 */
	public void send(byte data) throws CommunicationException;

	/**
	 * Sends data to the target.
	 * 
	 * @param data
	 *            data to be sent
	 * @throws CommunicationException
	 *             when an exception occurs while sending data
	 */
	public void send(byte[] data) throws CommunicationException;

	/**
	 * Tries to receive a sequence of characters until an exit character is
	 * read. The exit character is included in the returned string.
	 * 
	 * @param exit
	 *            the exit character
	 * @return received data
	 * @throws CommunicationException
	 *             when a timeout is reached before the exit character is read
	 */
	public String receive(char exit) throws CommunicationException;

	/**
	 * Tries to receive a fixed number of characters.
	 * 
	 * @param n
	 *            the number of characters to be fetched
	 * @return received data
	 * @throws CommunicationException
	 *             when a timeout is reached before the exit character is read
	 */
	public String receive(int n) throws CommunicationException;

	/**
	 * Tries to receive a fixed number of characters.
	 * 
	 * @param n
	 *            the number of characters to be fetched
	 * @return received data
	 * @throws CommunicationException
	 *             when a timeout is reached before the exit character is read
	 */
	public LinkedList<Integer> receiveByte(int n) throws CommunicationException;

	/**
	 * Harks to incoming data.
	 * 
	 * @param n
	 *            maximal number of characters to receive
	 * @return characters received in a specific time range
	 * @throws CommunicationException
	 *             when an exception occurs while receiving data
	 */
	public String hark(int n) throws CommunicationException;

	public void comment(String comment);

}
