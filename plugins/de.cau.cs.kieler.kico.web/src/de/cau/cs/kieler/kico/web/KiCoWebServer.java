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

import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KiCoPlugin;
import de.cau.cs.kieler.kico.KiCoUtil;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;

/**
 * This class implements to KIELER Compiler TCP Web Server that runs as an Eclipse Job. Typically it
 * uses the port 5555 but it can be called to use any other TCP port. It tries to compile the
 * received model and returns the compilation result with error messages if present.
 * 
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

    /** The debug. */
    private boolean debug = false;

    // -------------------------------------------------------------------------

    /**
     * Output debug text.
     * 
     * @param text
     *            the text
     */
    private void debug(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

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
        debug("Server created");
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
        abort();
    }

    // -------------------------------------------------------------------------

    /**
     * Abort the web server. Be sure to clear all references to it in KiCoWebPlugin.setServer().
     */
    public void abort() {
        debug("Abort server");

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
        debug("Server started");

        // when started, invalidate the socket and set aborted to false
        aborted = false;
        socket = null;

        debug("Server enabled: " + KiCoWebPlugin.loadEnabled());

        // continuously while enabled provide the service
        while (KiCoWebPlugin.loadEnabled() && !aborted) {
            debug("Server enabled");

            // if no socket then create a new listening server socket
            if (socket == null) {
                debug("No socket. Creating socket.");
                socket = listenPort(KiCoWebPlugin.loadPort());
                debug("Server listen socket established");
            }

            try {
                if (socket != null) {
                    debug("Server listen socket present");
                    Socket connectionSocket;
                    // accept incoming compilation requests
                    connectionSocket = socket.accept();
                    debug("Socket accepted");
                    BufferedReader inFromClient =
                            new BufferedReader(new InputStreamReader(
                                    connectionSocket.getInputStream()));

                    OutputStreamWriter out =
                            new OutputStreamWriter(connectionSocket.getOutputStream());
                    PrintWriter printWriter = new PrintWriter(out);

                    debug("Socket input and output streams established");
                    String transformationIDs = inFromClient.readLine();

                    boolean verbose = false;
                    boolean strict = false;
                    debug("Transformations read");

                    // length of the following model
                    String lengthAndOptionsLine = inFromClient.readLine();
                    debug("Length and options read");
                    if (lengthAndOptionsLine.contains("v")) {
                        verbose = true;
                        lengthAndOptionsLine = lengthAndOptionsLine.replace("v", "");
                    }
                    if (lengthAndOptionsLine.contains("s")) {
                        strict = true;
                        lengthAndOptionsLine = lengthAndOptionsLine.replace("s", "");
                    }
                    
                    
                    ArrayList<String> models = new ArrayList<String>();
                    ArrayList<Integer> lines = new ArrayList<Integer>();
                    
                    String[] linesArray = lengthAndOptionsLine.split(":");
                    for (String lineString : linesArray) {
                        int line = Integer.parseInt(lineString);
                        lines.add(line);
                    }
                    
                    for (Integer line : lines) {
                        debug("Reading model (" + line +")");
                        int countDown = line;
                        String model = "";
                        String s;
                        while (countDown > 0) {
                            s = inFromClient.readLine();
                            countDown--;
                            if (!model.equals("")) {
                                model += "\n";
                            }
                            model += s;
                        }
                        models.add(model);
                        debug("Model read");
                    }

                    // System.out.println("transformations: " + transformations);
                    // System.out.println("model: " + model);
                    
                    EObject mainModel = null;
                    KielerCompilerContext context = new KielerCompilerContext(transformationIDs, mainModel);
                    
                    for (int i = models.size()-1; i >= 0; i--) {
                        boolean isMainModel = (i == 0);
                        String model = models.get(i);
                        EObject eObject = KiCoUtil.parse(model, context, isMainModel);
                        if (isMainModel) {
                            mainModel = eObject;
                        }
                    }
                    debug("Model parsed");
                    //EcoreUtil.resolveAll(context.getModelResourceSet());

                    // String fileExt = KiCoUIUtil.getFileExtension(eObject);
                    

                    context.setVerboseMode(verbose);
                    context.setPrerequirements(!strict);

                    KiCoPlugin.resetLastError();

                    // process the model
                    CompilationResult compilationResult =
                            KielerCompiler.compile(context);
                    debug("Model compiled");


                    boolean majorError = (compilationResult.getIntermediateResults().size() <= 1);
                    Object compiledModel = compilationResult.getObject();

                    String serializedCompiledModel = "";
                    if (compiledModel != null) {
                        serializedCompiledModel = compiledModel.toString();
                        if (compiledModel instanceof EObject) {
                            serializedCompiledModel = KiCoUtil.serialize((EObject) compiledModel, context);
                        }
                        debug("Model serialized");
                    }
                    if (majorError) {
                        serializedCompiledModel = "";
                    }

                    // answer with compiled & serialized model
                    String lastError = KiCoPlugin.getLastError();
                    if (lastError != null) {
                        debug("Errors serialized");
                    } else {
                        lastError = "";
                        debug("No errors to serialize");
                    }
                    String header = serializedCompiledModel.split("\n").length + ":"
                            + lastError.split("\n").length + "\n";
                    printWriter.print(header);
                    printWriter.print(serializedCompiledModel + "\n");
                    printWriter.print(lastError + "\n");
                    debug("Compiled model sent to client");
                    printWriter.flush();
                } else {
                    debug("No server listen socket present!");
                }
            } catch (IOException e) {
                debug("Server IO error");
                if (debug) {
                    e.printStackTrace();
                }
            }

        }
        debug("Server aborted");
        abort();

        return Status.OK_STATUS;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    // /**
    // * Test port whether it is ready to be used for the server socket.
    // *
    // * @param port the port
    // * @return true, if successful
    // */
    // private boolean testPort(int port) {
    // boolean out = false;
    // Socket socket = null;
    // try {
    // socket = new Socket();
    // socket.connect(new InetSocketAddress("localhost", port), 1000);
    //
    // } catch (IOException e) {
    // out = true;
    // } finally {
    // if (socket != null) {
    // try {
    // socket.close();
    // } catch (IOException e) {
    // }
    // out = true;
    // }
    // }
    // return out;
    // }

    // -------------------------------------------------------------------------

    /**
     * Open a server listening port.
     * 
     * @param port
     *            the port
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
