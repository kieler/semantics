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

package de.cau.cs.kieler.sim.mobile.tablemaster;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import de.cau.cs.kieler.sim.kiem.extension.DataComponent;

/**
 * This class implements a TCP server component that waits for mobile table clients in loop. If
 * there is a connection request the initialization is triggered by either the master or the
 * observer component. After that we read command (lines) until the connection breaks down or is
 * terminated. <BR>
 * <BR>
 * The following commands are processed:<BR>
 * S - Step<BR>
 * R - Run<BR>
 * P - Pause<BR>
 * T - Stop (Terminate)<BR>
 * <BR>
 * <BR>
 * These commands are processed if the line starts with a "C" for commands, followed by either S, R,
 * P or T. Otherwise the received line contains (modified) JSON data in a string starting with "{"
 * that is processed by the producer component's setDataToSend method.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class TCPServer implements Runnable {

    /** The server socket. */
    private ServerSocket serverSocket;

    /** The client socket. */
    private Socket clientSocket;

    /** The writer for outputs of data to send. */
    private PrintWriter writer;

    /** The reader for inputs of data to receive. */
    private BufferedReader reader;

    /** The terminate flag. */
    private boolean terminate;

    /** The port of the server. */
    private int port;

    /**
     * Try to get the socket SOCKET_RETRIES times with a waiting delay of one second between each
     * tries.
     */
    private static final int SOCKET_RETRIES = 10;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new TCPServer that listens to the given port.
     * 
     * @param port
     *            the port
     */
    public TCPServer(int port) {
        this.port = port;
    }

    // -------------------------------------------------------------------------

    /**
     * Terminates the TCPServer setting the {@link #terminate}. flag to true which will end the
     * while loop and the run method also.
     */
    public void terminate() {
        synchronized (DataComponentMaster.getInstance()) {
            // DEBUG//System.out.println(this.hashCode()+" TERMINATE()");
            try {
                this.clientSocket.close();
            } catch (Exception e) {
            }
            terminate = true;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Print prints the text to the output stream and flushes the latter.
     * 
     * @param text
     *            the text
     */
    public void print(String text) {
        if (writer != null) {
            this.writer.print(text);
            this.writer.flush();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Println prints the text as a line to the output stream and flushes the latter. . *
     * 
     * @param text
     *            the text
     */
    public void println(String text) {
        if (writer != null) {
            this.writer.println(text);
            this.writer.flush();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if the server is already terminated or the terminate flag is set so that the server
     * will terminate soon.
     * 
     * @return true, if is terminate
     */
    public boolean isTerminate() {
        return this.terminate;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {
        // sleep to wait for potentially blocked port
        boolean gotSocket = false;
        for (int retry = 0; retry < SOCKET_RETRIES; retry++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            synchronized (DataComponentMaster.getInstance()) {
                try {
                    serverSocket = new ServerSocket(this.port);
                    serverSocket.setSoTimeout(500);
                    gotSocket = true;
                } catch (Exception e) {
                    gotSocket = false;
                }
            }
            // if we got the socket - do no more retries
            if (gotSocket)
                break;
        }
        if (!gotSocket) {
            // if we still did not get the socket after SOCKET_RETRIES
            // retries we must stop the server
            terminate = true;
            return;
        }

        terminate = false;

        while (!terminate) {
            try {
                // connection accepted
                clientSocket = serverSocket.accept();
                if (terminate) {
                    break;
                }

                clientSocket.setKeepAlive(true);
                writer = new PrintWriter(clientSocket.getOutputStream(), true);
                reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                // send master value
                if (!DataComponentMaster.getInstance().isEnabled()) {
                    // send disabled flag to remot unit
                    this.println("D");
                }
                // if master is enabled, get data from master
                // otherwise from the observer
                if (DataComponentMaster.getInstance().isExecuting()) {
                    // send initialize
                    DataComponentMaster.getInstance().initialize();
                } else if (DataComponentObserver.getInstance().isExecuting()) {
                    // send initialize
                    DataComponentObserver.getInstance().initialize();
                }

                while (true) {
                    String line = null;
                    try {
                        line = reader.readLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // check if DataComponent is still available
                    if (DataComponentMaster.getInstance() == null) {
                        // otherwise stop server
                        clientSocket.close();
                        // terminate = true;
                        break;
                    }
                    if ((line == null) || (!clientSocket.isConnected())) {
                        // STOP execution if necessary
                        try {
                            if (DataComponentMaster.getInstance().isEnabled())
                                DataComponentMaster.getInstance().masterCommand(
                                        DataComponent.MASTER_CMD_STOP);
                        } catch (Exception e) {
                        }
                        break;
                    }

                    try {
                        if ((line != null) && (line.length() > 0)) {
                            if (line.startsWith("C")) {
                                String command = line.substring(1, 2);

                                if (command.matches("S")) {
                                    // STEP
                                    DataComponentMaster.getInstance().masterCommand(
                                            DataComponent.MASTER_CMD_STOP);
                                } else if (command.matches("R")) {
                                    // RUN
                                    DataComponentMaster.getInstance().masterCommand(
                                            DataComponent.MASTER_CMD_RUN);
                                } else if (command.matches("P")) {
                                    // PAUSE
                                    DataComponentMaster.getInstance().masterCommand(
                                            DataComponent.MASTER_CMD_PAUSE);
                                } else if (command.matches("T")) {
                                    // STOP
                                    DataComponentMaster.getInstance().masterCommand(
                                            DataComponent.MASTER_CMD_STOP);
                                }
                            }// end if command
                            else {
                                DataComponentProducer.setDataToSend(line);
                            }
                        }// end if
                    } catch (Exception e) {
                        // STOP execution if necessary
                        try {
                            if (DataComponentMaster.getInstance().isEnabled())
                                DataComponentMaster.getInstance().masterCommand(
                                        DataComponent.MASTER_CMD_STOP);
                        } catch (Exception ee) {
                        }
                        break;
                    }
                }// end while connected

            } catch (java.net.SocketException e) {
                e.printStackTrace();
                // here we can have a socket close on a connect
                // which should free the port so that we can
                // reuse it
                if (DataComponentMaster.getInstance() != null) {
                    try {
                        DataComponentMaster.getInstance().masterCommand(
                                DataComponent.MASTER_CMD_STOP);
                    } catch (Exception ee) {
                    }
                }
                try {
                    clientSocket.close();
                } catch (Exception ee) {
                }
            } catch (java.net.SocketTimeoutException e) {
                // do nothing
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    clientSocket.close();
                } catch (Exception ee) {
                }
            }
        }// end while accepting (server running)

    }// end run
}
