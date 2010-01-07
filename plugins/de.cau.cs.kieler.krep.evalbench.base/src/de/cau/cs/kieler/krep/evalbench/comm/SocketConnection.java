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

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;

/**
 * Connection that uses sockets from <code>java.net</code>.
 * 
 * @author msp, ctr
 */
public class SocketConnection extends ConnectionProtocol {

    /** The socket used for connection. */
    private Socket socket;
    private InputStreamReader reader=null;

    /**
     * Initializes connection.
     * 
     * @param device
     *            serial port name
     * @param port
     *            port number
     * @throws CommunicationException
     *             when an error occurred during initialization
     */
    public SocketConnection(final String device, final int port) throws CommunicationException {
        try {
            socket = new Socket(device, port);
        } catch (IOException e) {
            throw new CommunicationException("Error during initialization of host " + device
                    + " on port " + port + ": " + e.getMessage());
        }
    }

    /**
     * {@inheritDoc}
     * 
     */
    public void dispose() {
        try {
            socket.close();
        } catch (IOException e) {
            // Ignore silently
            // tatus myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
            // "Error closing socket", e);
            // StatusManager.getManager().handle(myStatus, StatusManager.LOG);
        }
    }

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    protected InputStreamReader getInput() {
        if (reader != null) {
            return reader;
        } else {
            try {
                return new InputStreamReader(socket.getInputStream());
            } catch (IOException e) {
                return null;
            }
        }
    }

    @Override
    protected OutputStream getOutput() {
        try {
            return socket.getOutputStream();
        } catch (IOException e) {
            return null;
        }
    }

}
