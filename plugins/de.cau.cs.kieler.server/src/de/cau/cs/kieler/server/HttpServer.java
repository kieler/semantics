// Internet Communication, WS 2007/08, Serie 3 Aufgabe 2
// Maximilian Gravert #589482, Christian Motika, #702133
//
//-------------------------------------------------------------------------------

/**
 * Aufgabe 2
 * =========
 *
 * Das Programm besteht aus der Klasse THttpServer. Dieser nimmt die
 * Anfragen in seiner Start()-Methode wie �blich innerhalb einer nicht
 * terminierenden while-Schleife entgegen und beantwortet sie nebenl�ufig
 * durch entsprechend neue Instanzen von THandleConnection.
 * 
 * THandleConnection erzeugt nun einen neuen THttpParser der den Request-
 * Header parsen soll. Der Parsevorgang wird in der Run()-Methode durch
 * den Aufruf von parseRequest() durchgef�hrt. 
 * 
 * Nach dem Parsen wird die Template-Datei eingelesen (die in einem
 * systemweit verf�gbaren Verzeichnis liegen mu� (z.B. "c:\", bzw eines
 * das im PFAD steht).
 * 
 * Beim Einlesen der Template-Datei werden bereits die entsprechenden TAGS
 * in jener durch die geparsten Werte aus der Hashtable ersetzt.
 * 
 * Schlie�lich wird der generierte Inhalt mit einem eigenen Response-Header
 * versehen und an den z.B. Browser zur�ckgesendet. 
 * 
 */

// ACHTUNG: "TemplateDoc"- und "TemplateRow"-Konstanten anpassen an absolutes
// Verzeichnis wo sich "template_document.htm" und "template_tablerow.htm" 
// befinden.

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

    private class HandleConnection implements Runnable {

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
                System.out.println("Parsing ...");

                // parse next request from client
                this.httpParser.parseRequestResponse();

                System.out.println("Generating Response ...");

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
                    int Length = response.body.length;

                    System.out.println("Writing Response ...");
                    // output this response to client

                    this.to_client.write(response.header.toString());
                    this.to_client.flush();
                    this.connection.getOutputStream().write(response.body);
                }
                
                this.to_client.flush();
                this.to_client.close();
                this.connection.close();

                System.out.println("Connection Closed.");

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
