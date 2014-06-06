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
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
//import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Inject;

import de.cau.cs.kieler.kico.KiCoPlugin;
import de.cau.cs.kieler.kico.KielerCompiler;

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

    /** The reg is necessary to find serializer or parser for Xtext models. */
    @Inject
    IResourceServiceProvider.Registry reg;

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

                    EObject eObject = parse(model);

                    KielerCompiler.setVerboseMode(verbose);
                    
                    // process the model
                    Object compiledModel =
                            KielerCompiler.compile(transformations, eObject, strict).getObject();

                    String serializedCompiledModel = compiledModel.toString();
                    if (compiledModel instanceof EObject) {
                        serializedCompiledModel = serialize((EObject) compiledModel);
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

    /**
     * Serialize the EObject (if the compilation result is not plain text (String)). This is
     * implemented by finding the first suitable XtextResourceProvider that is able to serialize the
     * model.
     * 
     * @param model
     *            the model
     * @return the string
     */
    private String serialize(EObject model) {
        String returnText = "";
        boolean done = false;
        try {

            for (String ext : reg.getExtensionToFactoryMap().keySet()) {
                URI uri = URI.createURI("dummy:/inmemory." + ext);
                IResourceServiceProvider provider = reg.getResourceServiceProvider(uri);
                XtextResourceSet resourceSet = provider.get(XtextResourceSet.class);
                Resource res = resourceSet.createResource(uri);

                done = false;
                try {
                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                    res.getContents().add(model);
                    res.save(outputStream, getSaveOptions());
                    returnText = outputStream.toString();
                    done = true;
                } catch (Exception e) {
                }

                if (done) {
                    break;
                }
            }

            if (!done) {
                XMIResourceImpl xmiResource = new XMIResourceImpl();
                try {
                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                    xmiResource.getContents().add(model);
                    xmiResource.save(outputStream, getSaveOptions());
                    returnText = outputStream.toString();
                    done = true;
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            String text2 = "";
            if (model != null) {
                text2 = model.getClass().getName();
            }
            KiCoPlugin.getInstance().showError("Could not serialize model '" + text2 + "'",
                    KiCoWebPlugin.PLUGIN_ID, e, true);
        }

        return returnText;
    }

    // -------------------------------------------------------------------------

    /**
     * You can alter the SaveOptions here.
     * 
     * @return Save options
     */
    protected Map<String, String> getSaveOptions() {
        Map<String, String> saveOptions = new HashMap<String, String>();
        saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
        saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
                Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
        return saveOptions;
    }

    // -------------------------------------------------------------------------

    /**
     * Parse the model provided as a serialized String. This is implemented by finding the first
     * suitable XtextResourceProvider that is able to parse the model to an EObject.
     * 
     * @param text
     *            the text
     * @return the e object
     */
    private EObject parse(String text) {
        EObject returnEObject = null;

        boolean done = false;
        try {

            for (String ext : reg.getExtensionToFactoryMap().keySet()) {
                URI uri = URI.createURI("dummy:/inmemory." + ext);
                IResourceServiceProvider provider = reg.getResourceServiceProvider(uri);
                XtextResourceSet resourceSet = provider.get(XtextResourceSet.class);
                resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
                Resource res = resourceSet.createResource(uri);

                done = false;
                try {
                    InputStream in = new ByteArrayInputStream(text.getBytes());// StandardCharsets.UTF_8));
                    res.load(in, resourceSet.getLoadOptions());
                    returnEObject = res.getContents().get(0);
                    done = true;
                } catch (Exception e) {
                }

                if (done) {
                    break;
                }
            }

            if (!done) {
                InputStream in = new ByteArrayInputStream(text.getBytes());// StandardCharsets.UTF_8));
                XMIResourceImpl inputResource = new XMIResourceImpl();
                try {
                    inputResource.load(in, new HashMap<Object, Object>());
                    returnEObject = inputResource.getContents().get(0);
                    done = true;
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
            String text2 = "";
            if (text != null) {
                if (text.length() > 20) {
                    text2 = text.substring(0, 20) + "...";
                } else {
                    text2 = text;
                }
            }
            KiCoPlugin.getInstance().showError("Could not parse model '" + text2 + "'",
                    KiCoWebPlugin.PLUGIN_ID, e, true);
        }

        return returnEObject;
    }

    // -------------------------------------------------------------------------

    /**
     * Test port whether it is ready to be used for the server socket.
     *
     * @param port the port
     * @return true, if successful
     */
    private boolean testPort(int port) {
        boolean out = false;
        Socket socket = null;
        try {
            socket = new Socket();
            socket.connect(new InetSocketAddress("localhost", port), 1000);

        } catch (IOException e) {
            out = true;
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                }
                out = true;
            }
        }
        return out;
    }

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
