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
package de.cau.cs.kieler.kico.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
//import java.nio.charset.StandardCharsets;



import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;

import de.cau.cs.kieler.kico.KiCoPlugin;
import de.cau.cs.kieler.kico.KiCoUtil;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.ui.KiCoUIUtil;

/**
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 * 
 */
public class KiCoWebServer extends Job {

    /** The socket for communicating with the client. */
    private ServerSocket socket = null;

    /** The aborted flag internally used for aborting a running server. */
    private boolean aborted = false;

    // -------------------------------------------------------------------------


    /**
     * Instantiates a new KiCo web server. Note that the name is automatically set to include also
     * the listening port.
     * 
     * @param name
     *            the name
     */
    @Inject
    public KiCoWebServer(String name) {
        super("KIELER Compiler TCP Server (" + KiCoWebPlugin.loadPort() + ")");
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    protected void canceling() {
        abort();
    }

    // -------------------------------------------------------------------------

    /**
     * Abort the web server. Be sure to clear all references to it in KiCoWebPlugin.setServer().
     */
    public void abort() {
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
     * {@inheritDoc}
     */
    @Override
    protected IStatus run(IProgressMonitor monitor) {

        // when started, invalidate the socket and set aborted to false
        aborted = false;
        socket = null;

        // continuously while enabled provide the service
        while (KiCoWebPlugin.loadEnabled() && !aborted) {

            // if no socket then create a new listening server socket
            if (socket == null) {
                socket = listenPort(KiCoWebPlugin.loadPort());
            }

            try {
                if (socket != null) {
                    Socket connectionSocket;
                    // accept incoming compilation requests
                    connectionSocket = socket.accept();
                    BufferedReader inFromClient =
                            new BufferedReader(new InputStreamReader(
                                    connectionSocket.getInputStream()));

                    OutputStreamWriter out =
                            new OutputStreamWriter(connectionSocket.getOutputStream());
                    PrintWriter printWriter = new PrintWriter(out);

                    String transformations = inFromClient.readLine();
                    
                    boolean verbose = false;
                    boolean strict = false;

                    // length of the following model
                    String lengthAndOptionsLine = inFromClient.readLine();
                    if (lengthAndOptionsLine.contains("v")) {
                        verbose = true;
                        lengthAndOptionsLine = lengthAndOptionsLine.replace("v", "");
                    }
                    if (lengthAndOptionsLine.contains("s")) {
                        strict = true;
                        lengthAndOptionsLine = lengthAndOptionsLine.replace("s", "");
                    }
                    int lines = Integer.parseInt(lengthAndOptionsLine);

                    String model = "";
                    String s;
                    while (lines > 0) {
                        s = inFromClient.readLine();
                        lines--;
                        if (!model.equals("")) {
                            model += "\n";
                        }
                        model += s;
                    }

                    // System.out.println("transformations: " + transformations);
                    // System.out.println("model: " + model);

                    EObject eObject = KiCoUtil.parse(model);

                    //String fileExt = KiCoUIUtil.getFileExtension(eObject);
                    
                    KielerCompiler.setVerboseMode(verbose);
                    
                    KiCoPlugin.resetLastError();
                    
                    // process the model
                    Object compiledModel =
                            KielerCompiler.compile(transformations, eObject, !strict).getObject();

                    String serializedCompiledModel = "";
                    if (KiCoPlugin.getLastError() != null) {
                        serializedCompiledModel = KiCoPlugin.getLastError();
                    } else if (compiledModel != null) {
                        serializedCompiledModel = compiledModel.toString();
                        if (compiledModel instanceof EObject) {
                            serializedCompiledModel = KiCoUtil.serialize((EObject) compiledModel);
                        }
                    }

                    // answer with compiled & serialized model
                    printWriter.print(serializedCompiledModel.split("\n").length + "\n");
                    printWriter.print(serializedCompiledModel + "\n");
                    printWriter.flush();
                }
            } catch (IOException e) {
            }

        }
        abort();

        return Status.OK_STATUS;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

//    /**
//     * Test port whether it is ready to be used for the server socket.
//     *
//     * @param port the port
//     * @return true, if successful
//     */
//    private boolean testPort(int port) {
//        boolean out = false;
//        Socket socket = null;
//        try {
//            socket = new Socket();
//            socket.connect(new InetSocketAddress("localhost", port), 1000);
//
//        } catch (IOException e) {
//            out = true;
//        } finally {
//            if (socket != null) {
//                try {
//                    socket.close();
//                } catch (IOException e) {
//                }
//                out = true;
//            }
//        }
//        return out;
//    }

    // -------------------------------------------------------------------------

    /**
     * Open a server listening port.
     *
     * @param port the port
     * @return the server socket
     */
    private ServerSocket listenPort(int port) {
        ServerSocket socket = null;
        try {
            socket = new ServerSocket(port);
            return socket;
        } catch (Exception e) {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e1) {
                }
            }
            return null;
        }
    }

    // -------------------------------------------------------------------------
}
