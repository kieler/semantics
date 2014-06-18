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
package de.cau.cs.kieler.klighd.server;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.ServerSocket;
import java.net.Socket;
//import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Display;

import com.google.inject.Inject;

import de.cau.cs.kieler.kico.KiCoPlugin;
import de.cau.cs.kieler.kico.KiCoUtil;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.klighd.LightDiagramServices;

/**
 * This class implements to KIELER KLighD TCP Server that runs as an Eclipse Job. Typically it
 * uses the port 5555 but it can be called to use any other TCP port. It tries to render the
 * received model and returns the rendered result with error messages if present.
 *
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 *
 */
public class KlighdServer extends Job {

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
     * Instantiates a new KiCo server. Note that the name is automatically set to include also
     * the listening port.
     *
     * @param name
     *            the name
     */
    @Inject
    public KlighdServer(String name) {
        super("KIELER KLighD TCP Server (" + KlighdServerPlugin.loadPort() + ")");
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
     * Abort the server. Be sure to clear all references to it in KiCoPlugin.setServer().
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
    
    private String getErrorMessage(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString(); // stack trace as a string
    }

    // -------------------------------------------------------------------------
    
    /** The async done flag. */
    boolean renderingDone = false;
    
    IStatus renderingResult = null;
    

    /**
     * {@inheritDoc}
     */
    @Override
    protected IStatus run(IProgressMonitor monitor) {
        debug("Server started");

        // when started, invalidate the socket and set aborted to false
        aborted = false;
        socket = null;

        debug("Server enabled: " + KlighdServerPlugin.loadEnabled());

        // continuously while enabled provide the service
        while (KlighdServerPlugin.loadEnabled() && !aborted) {
            debug("Server enabled");

            // if no socket then create a new listening server socket
            if (socket == null) {
                debug("No socket. Creating socket.");
                socket = listenPort(KlighdServerPlugin.loadPort());
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

                    OutputStream out =
                            connectionSocket.getOutputStream();
                    //PrintWriter printWriter = new PrintWriter(out);

                    debug("Socket input and output streams established");
                    
                    String render = "png";
                    String scale = "1";
                    int scaleInteger = 1;

                    debug("Transformations read");

                    // length of the following model
                    String optionsLine = inFromClient.readLine();
                    String[] optionsArray = optionsLine.split(":");
                    if (optionsArray.length > 1) {
                        render = optionsArray[0];
                        scale = optionsArray[1];
                    }
                    try {
                        scaleInteger = Integer.parseInt(scale);
                    }catch (Exception e) {
                    }
                    
                    String lengthLine = inFromClient.readLine();
                    debug("Length and options read");

                    ArrayList<String> models = new ArrayList<String>();
                    ArrayList<Integer> lines = new ArrayList<Integer>();

                    String[] linesArray = lengthLine.split(":");
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
                    KielerCompilerContext context = new KielerCompilerContext("", mainModel);

                    for (int i = models.size()-1; i >= 0; i--) {
                        boolean isMainModel = (i == 0);
                        String model = models.get(i);
                        EObject eObject = KiCoUtil.parse(model, context, isMainModel);
                        if (isMainModel) {
                            mainModel = eObject;
                        }
                    }
                    debug("Model parsed");

                    // currently do NOT resolve the resource set yet
                    //EcoreUtil.resolveAll(context.getModelResourceSet());

                    KiCoPlugin.resetLastError();

                    //TODO: render the model
                    //mainModel
                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                    
                    final EObject mainModelParam = mainModel;
                    final String renderParam = render;
                    final ByteArrayOutputStream outputStreamParam = outputStream;
                    
                    renderingDone = false;
                    Display defaultDisplay = Display.getDefault();
                    
                    defaultDisplay.asyncExec (new Runnable () {
                        public void run () {
                            renderingResult = LightDiagramServices.renderOffScreen(mainModelParam, renderParam, "d:\\model.png");
                            renderingResult = LightDiagramServices.renderOffScreen(mainModelParam, renderParam, outputStreamParam);
                            renderingDone = true;
                        }
                     });
                    
                    while (!renderingDone) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                        }
                    }
                    
                    debug("Model rendered");
                    

                    byte[] serializedRenderedModel;

                    if (renderingResult != null && renderingResult.getCode() == IStatus.OK) {
                        // everything ok, return output stream
                        serializedRenderedModel = outputStream.toByteArray();
                    } else {
                        String serializedRenderedModelString = "Generation of diagram failed: ";
                        if (renderingResult != null && renderingResult.getException() != null) {
                            serializedRenderedModelString += getErrorMessage(renderingResult.getException());
                        }
                        serializedRenderedModel = serializedRenderedModelString.getBytes();
                    }
                    debug("Model rendered");
                    

                    int len = serializedRenderedModel.length;
                    
                    //out.write(len);
                    out.write(serializedRenderedModel);
                    debug("Rendered model sent to client");
                    out.flush();
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
