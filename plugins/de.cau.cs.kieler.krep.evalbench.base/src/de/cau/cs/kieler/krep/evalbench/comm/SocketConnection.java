package de.cau.cs.kieler.krep.evalbench.comm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;


/**
 * Connection that uses sockets from <code>java.net</code>.
 * 
 * @author msp
 */
public class SocketConnection extends ConnectionProtocol {

    /** The socket used for connection */
    private Socket socket;

    /*
     * (non-Javadoc)
     * 
     * @see krep.evalbench.comm.IConnectionProtocol#initialize(java.lang.String)
     */
    public String initialize(String device, int port)
	    throws CommunicationException {
	try {
	    socket = new Socket(device, port);
	    return "Connected to host " + device + ", port " + port + ".";
	} catch (Exception e) {
	    throw new CommunicationException(
		    "Error during initialization of host " + device
			    + " on port " + port + ": " + e.getMessage());
	}
    }

    /*
     * (non-Javadoc)
     * 
     * @see krep.evalbench.comm.IConnectionProtocol#dispose()
     */
    public void dispose() {
	try {
	    socket.close();
	} catch (IOException e) {
	    // Ignore silently
	}
    }

    /*
     * (non-Javadoc)
     * 
     * @see krep.evalbench.comm.ConnectionProtocol#getInputStream()
     */
    @Override
    protected InputStream getInputStream() {
	try {
	    return socket.getInputStream();
	} catch (IOException e) {
	    return null;
	}
    }

    /*
     * (non-Javadoc)
     * 
     * @see krep.evalbench.comm.ConnectionProtocol#getOutputStream()
     */
    @Override
    protected OutputStream getOutputStream() {
	try {
	    return socket.getOutputStream();
	} catch (IOException e) {
	    return null;
	}
    }

    public void comment(String comment) {
	//Nothing to do
	
    }

}
