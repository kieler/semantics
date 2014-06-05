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
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.xtext.internal.ResourceServiceProviderDescriptor;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.impl.DefaultResourceServiceProvider;
import org.eclipse.xtext.serializer.impl.Serializer;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import de.cau.cs.kieler.kico.KiCoPlugin;
import de.cau.cs.kieler.kico.KielerCompiler;

/**
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 * 
 */
public class KiCoWebServer extends Job {

    ServerSocket socket = null;
    
    boolean aborted = false;

    /**
     * @param name
     */
    @Inject
    IResourceServiceProvider.Registry reg;

    @Inject
    public KiCoWebServer(String name) {
        super(name);
    }

    protected void canceling() {
        abort();
    }    
    
    public void abort() {
        if (socket != null) {
            try {
                socket.close();
                socket = null;
            } catch (IOException e) {
            }
        }
        aborted = true;
    }

    // public static JSONClient client;

    @Override
    protected IStatus run(IProgressMonitor monitor) {

        while (KiCoWebPlugin.loadEnabled() && !aborted) {

            if (socket == null) {
                socket = listenPort(KiCoWebPlugin.loadPort());
            }

            try {
                if (socket != null) {
                    Socket connectionSocket;
                    connectionSocket = socket.accept();
                    BufferedReader inFromClient =
                            new BufferedReader(new InputStreamReader(
                                    connectionSocket.getInputStream()));

                    OutputStreamWriter out =
                            new OutputStreamWriter(connectionSocket.getOutputStream());
                    PrintWriter printWriter = new PrintWriter(out);

                    String transformations = inFromClient.readLine();

                    int lines = Integer.parseInt(inFromClient.readLine());

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

                    System.out.println("transformations: " + transformations);
                    System.out.println("model: " + model);

                    EObject eObject = parse(model);
                    
                    Object compiledModel = KielerCompiler.compile(transformations, eObject, true).getObject();
                    
                    String serializedCompiledModel = compiledModel.toString();
                    if (compiledModel instanceof EObject) {
                        serializedCompiledModel = serialize((EObject)compiledModel);
                    }

                    printWriter.print(serializedCompiledModel.split("\n").length + "\n");
                    printWriter.print(serializedCompiledModel + "\n");
                    printWriter.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        abort();

        // if (client == null || client.socket.isClosed()) {
        // try {
        // client = new JSONClient(KiCoWebPlugin.loadPort());
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        // }
        // }
        // try {
        // if (client != null) {
        // client.close();
        // client = null;
        // }
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        return Status.OK_STATUS;
    }

    // -------------------------------------------------------------------------

    private String serialize(EObject model) {
        String returnText = "";
        boolean done = false;
        try {
          
            for (String ext : reg.getExtensionToFactoryMap().keySet()) {
                URI uri = URI.createURI("dummy:/inmemory." + ext);
                IResourceServiceProvider provider = reg.getResourceServiceProvider(uri);
                XtextResourceSet resourceSet = provider.get(XtextResourceSet.class);
                Resource res = resourceSet.createResource(uri);
                
                System.out.println(ext + " : " + res.getClass().getName());
                
                done = false;
                try {
                    //XtextResource xtextRes = (XtextResource) res;
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
            
//          IResourceServiceProvider provider = reg.getResourceServiceProvider(uri);
//          XtextResourceSet resourceSet = provider.get(XtextResourceSet.class);
//          
//          
//          Resource res = model.eResource(); //resourceSet.createResource(uri);
//          if (res instanceof XtextResource) {
//              XtextResource xtextRes = (XtextResource) res;
//              ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//              xtextRes.getContents().add(model);
//              xtextRes.save(outputStream, getSaveOptions());
//              returnText = outputStream.toString();
//          }
                    
//
//            resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
//            Resource resource =
//                    resourceSet.createResource(URI.createURI("dummy:/inmemory." + fileExtension));
//            //InputStream in = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
//            model.r
//            returnEObject = resource.getContents().get(0);

        } catch (Exception e) {
            e.printStackTrace();
            
            
            // Copies the root to avoid modifying it
//            final EObject copyRoot = EcoreUtil.copy(root);
//            attachResource(URI.createFileURI("resource.xml"), copyRoot); //$NON-NLS-1$
//            final StringWriter writer = new StringWriter();
//            final Map<String, String> options = new EMFCompareMap<String, String>();
//            options.put(XMLResource.OPTION_ENCODING, System.getProperty(ENCODING_PROPERTY));
//            // Should not throw ClassCast since uri calls for an xml resource
//            ((XMLResource)copyRoot.eResource()).save(writer, options);
//            final String result = writer.toString();            

            
            
            
            
            
//            InputStream in = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
//            // Try to load SCCharts model
//            XMIResourceImpl inputResource = new XMIResourceImpl();
//            // Load SCCharts model
//            try {
//                inputResource.load(in, new HashMap<Object,Object>());
//                returnEObject = inputResource.getContents().get(0);
//            } catch (Exception e2) {
//                String text2 = "";
//                if (text != null) {
//                    if (text.length() > 20) {
//                        text2 = text.substring(0, 20) + "...";
//                    } else {
//                        text2 = text;
//                    }
//                }
//                KiCoPlugin.getInstance().showError("Could not parse model '"+text2+"'", KiCoWebPlugin.PLUGIN_ID, e2, true);
//            }
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
                    InputStream in = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
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
                InputStream in = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
                XMIResourceImpl inputResource = new XMIResourceImpl();
                try {
                    inputResource.load(in, new HashMap<Object,Object>());
                    returnEObject = inputResource.getContents().get(0);
                    done = true;
                } catch (Exception e) {
                }
            }
        
//        
//        try {
//            URI uri = URI.createURI("dummy:/inmemory." + fileExtension);
//            // Object object = reg.getExtensionToFactoryMap().get(fileExtension);
//
//            IResourceServiceProvider provider = reg.getResourceServiceProvider(uri);
//            XtextResourceSet resourceSet = provider.get(XtextResourceSet.class);
//
//            resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
//            Resource resource =
//                    resourceSet.createResource(URI.createURI("dummy:/inmemory." + fileExtension));
//            InputStream in = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
//            resource.load(in, resourceSet.getLoadOptions());
//            returnEObject = resource.getContents().get(0);
//
        } catch (Exception e) {
//
//            InputStream in = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
//            // Try to load SCCharts model
//            XMIResourceImpl inputResource = new XMIResourceImpl();
//            // Load SCCharts model
//            try {
//                inputResource.load(in, new HashMap<Object,Object>());
//                returnEObject = inputResource.getContents().get(0);
//            } catch (Exception e2) {
                String text2 = "";
                if (text != null) {
                    if (text.length() > 20) {
                        text2 = text.substring(0, 20) + "...";
                    } else {
                        text2 = text;
                    }
                }
                KiCoPlugin.getInstance().showError("Could not parse model '"+text2+"'", KiCoWebPlugin.PLUGIN_ID, e, true);
//            }

        }

        return returnEObject;
    }

    // -------------------------------------------------------------------------
    //
    // public EObject parse(InputStream in) throws IOException {
    // }
    //
    // protected EObject parse(final String modelAsText) {
    //
    // // Create URIs and load the instance with our resource injector
    // URI input = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
    // URI output = URI.createURI("");
    // EObject model;
    // Injector rInjector = createResourceInjector();
    // if (rInjector != null) {
    // ResourceSet resourceSet = rInjector.getInstance(ResourceSet.class);
    // Resource resourceLoad = resourceSet.getResource(input, true);
    // model = resourceLoad.getContents().get(0);
    // }
    // else {
    // // Try to load SCCharts model
    // XMIResourceImpl inputResource = new XMIResourceImpl(input);
    // // Load SCCharts model
    // try {
    // inputResource.load(null);
    // model = inputResource.getContents().get(0);
    // } catch (IOException e) {
    // throw new ExecutionException("Could not load SCChart as an XMIResource.", e);
    // }
    // }
    //
    // // Transform the model and unload the resource
    // Object transformedObject = transform(model, event, selection);
    // model.eResource().unload();
    //
    // // Set destination uri
    // output = URI.createURI(input.toString());
    // output = output.trimFragment();
    // output = output.trimFileExtension().appendFileExtension(getTargetExtension(model, event,
    // selection));
    //
    // try {
    // ResourceSet resSet = new ResourceSetImpl();
    // Resource saveRes = resSet.createResource(output);
    //
    // if (transformedObject instanceof EObject) {
    // EObject transformedModel = (EObject) transformedObject;
    //
    // // Create Diagram, if necessary
    // // Note: Diagrams created this way are empty
    // Diagram diagram = null;
    // if (doCreateDiagram(transformedModel, event, selection)) {
    // diagram = ViewService.createDiagram(transformedModel, getDiagramEditorID(),
    // getPreferencesHint());
    //
    // saveRes.getContents().add(transformedModel);
    // if (diagram != null) {
    // diagram.setElement(transformedModel);
    // // Save both the model and the diagram in one resource
    // saveRes.getContents().add(diagram);
    // }
    //
    // } else {
    // // Save only the model
    // saveRes.getContents().add(transformedModel);
    // }
    // saveRes.save(getSaveOptions());
    // setCharset(WorkspaceSynchronizer.getFile(saveRes));
    // }
    //
    // // Save text
    // if (transformedObject instanceof CharSequence) {
    // IPath txtOutputPath = new Path(output.toPlatformString(false).replace("%20", " "));
    // // IFile txtOutputFile = ModelUtil.convertIPathToIFile(txtOutputPath);
    // // String txtOutputString = ModelUtil.getAbsoluteFilePath(txtOutputFile);
    //
    // CharSequence charSequenceContent = (CharSequence) transformedObject;
    // String stringContent = charSequenceContent.toString();
    //
    // // Write out model/program
    // FileWriter fileWriter = new FileWriter(txtOutputString);
    // if (fileWriter != null) {
    // BufferedWriter out = new BufferedWriter(fileWriter);
    // if (out != null) {
    // out.write(stringContent);
    // out.close();
    // }
    // }
    //
    // }
    //
    // } catch (IOException e) {
    // throw new ExecutionException("Cannot write output SCChart file: " + e.getMessage());
    // }
    //
    //
    // }
    //

    // -------------------------------------------------------------------------

    public boolean testPort(int port) {
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

    public ServerSocket listenPort(int port) {
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
