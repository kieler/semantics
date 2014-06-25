/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

/**
 * The abstract HttpServer allows to easily create simple http servers that only implement the
 * handleRequest method and respond in this method with some HttpResponse output to some HttpRequest
 * input.
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 */
public abstract class HttpServer extends Job {

    /** The listening port. */
    protected int listenPort;

    /** The provider socket. */
    protected ServerSocket socket;

    /** The aborted flag internally used for aborting a running server. */
    protected boolean aborted = false;

    /** The debug flag. */
    protected boolean debug = false;
    
    /** The server name. */
    protected String serverName = "";

    // -------------------------------------------------------------------------

    /**
     * Handle a HTTP request. This main method must be implemented by the derived HttpServer.
     * 
     * @param request
     *            the request
     * @return the byte[]
     */
    abstract protected HttpResponse handleRequest(HttpRequest request);

    // -------------------------------------------------------------------------

    /**
     * This method must be implemented to return true whenever the server is generally enabled.
     * 
     * @return true, if is enabled
     */
    abstract protected boolean isEnabled();

    // ----------------------------------------------------------------------

    /**
     * Instantiates a new http server that listens to a given port.
     * 
     * @param listenPort
     *            the port to wich the server listens
     * @param serverName
     *            the server name
     */
    public HttpServer(int listenPort, String serverName) {
        super(serverName);
        this.listenPort = listenPort;
        this.serverName = serverName;
        debug("Server created");
    }


    // ----------------------------------------------------------------------
    
    /**
     * Gets the server name.
     *
     * @return the server name
     */
    public String getServerName() {
        return serverName;
    }
    
    // -------------------------------------------------------------------------

    /**
     * Sets the server name.
     *
     * @param serverName the new server name
     */
    public void setServerName(String serverName) {
        debug("Server name set:" + serverName);
        this.serverName = serverName;
    }
    
    // -------------------------------------------------------------------------
    
    /**
     * Output debug text.
     *
     * @param text
     *            the text
     */
    protected void debug(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the debug.
     *
     * @param debug
     *            the new debug
     */
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    protected void canceling() {
        debug("Server canceling called");
        abort();
    }

    // -------------------------------------------------------------------------

    /**
     * Abort the server. Be sure to clear all references to it in KiCoPlugin.setServer().
     */
    public void abort() {
        debug("Server abort called");
        aborted = true;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
            }
        }
        socket = null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the error stack trace.
     *
     * @param t the t
     * @return the error message
     */
    protected final String getErrorMessage(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString(); // stack trace as a string
    }

    // -------------------------------------------------------------------------

    /**
     * Start is called to start the server. It establishes a server socket at the provided port and
     * creates threads of HandleConnection for each incoming connection. Those connections are then
     * handled concurrently.
     * 
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    /**
     * {@inheritDoc}
     */
    @Override
    protected IStatus run(IProgressMonitor monitor) { // establish server socket

        debug("Server started");

        socket = null;
        aborted = false;
        
        debug("Server enabled: " + isEnabled());


        while (isEnabled() && !aborted) {
            debug("Server loop");
            try {
                
                // if no socket then create a new listening server socket
                if (socket == null) {
                    debug("No socket. Creating socket.");
                    try {
                        socket = new ServerSocket(this.listenPort, 10);
                        debug("Server listen socket established");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                
                if (socket != null) {
                    debug("Server listen socket present");
                    // wait for a connection
                    Socket connection = null;
                    connection = socket.accept();
                    debug("Socket accepted from " + connection.getInetAddress().getHostName());

                    // handle connection concurrently
                    (new Thread(new HandleConnection(connection, this))).start();
                    debug("Server async handling started");
                }

            } catch (Exception e) {
                debug("Server IO error: " + getErrorMessage(e));
            }
        }// end while loop forever
        debug("Server aborted");
        abort();
        return Status.OK_STATUS;
    }

    // ======================================================================
    // ========================================================================

    private class HandleConnection  implements Runnable {

        Socket connection; // !< connection of this instant
        InputStream from_client; // !< stream to read input from
        HttpParser httpParser; // !< parser for input stream
        BufferedWriter to_client; // !< stream to write output to
        HttpServer httpServer;

        // ----------------------------------------------------------------------

        /**
         * Instantiates a new handle connection.
         * 
         * @param connection
         *            the socket as the connection-endpoint to the requesting socket as the
         *            connection-endpoint to the requesting
         * @param HttpServer
         *            the parent THttpServer instant
         * @throws IOException
         *             Signals that an I/O exception has occurred.
         */
        public HandleConnection(Socket connection, HttpServer httpServer) throws IOException {
            this.connection = connection;
            this.httpServer = httpServer;

            // create stream to communicate (output)
            this.to_client =
                    new BufferedWriter(new OutputStreamWriter(this.connection.getOutputStream()));

            this.from_client = this.connection.getInputStream();
            this.httpParser = new HttpParser(this.from_client);
        }

        // ----------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public void run() {
            // now read http requests from client until it disconnects
            // while (true) {
            try {
                //System.out.println("Parsing ...");

                // parse next request from client
                this.httpParser.parseRequestResponse();

                //System.out.println("Generating Response ...");

                HttpRequest request = new HttpRequest();
                request.header = this.httpParser.getHeader();
                request.body = this.httpParser.body;
                if (request.body == null) {
                    request.body = "".getBytes();
                }

                // Main work is done in the derived HttpServer.handleRequest() method
                HttpResponse response = this.httpServer.handleRequest(request);

                if (response != null) {
                    // "In HTTP, it SHOULD be sent whenever the message's length
                    // can be determined prior to being transferred" rfc2616
                    
                    // Set body length automatically
                    int Length = response.body.length;
                    response.header.setContentLength(Length);

                    // Set server name automatically
                    response.header.setServerName(serverName);
                    
                    //System.out.println("Writing Response ...");
                    // output this response to client
                    
                    //System.out.println(response.header.toString());
                    
                    this.to_client.write(response.header.toString());
                    this.to_client.flush();
                    this.connection.getOutputStream().write(response.body);
                }
                
                this.to_client.flush();
                this.to_client.close();
                this.connection.close();

                //System.out.println("Connection Closed.");

            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
            // }
        }// end run

    }

    // ========================================================================
    // ========================================================================

}
