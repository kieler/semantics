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
package de.cau.cs.kieler.kico;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Guice;
import com.google.inject.Inject;

import de.cau.cs.kieler.core.util.Pair;

/**
 * This class is a collection of utility methods for handling models in/with KiCo.
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 * 
 */
public class KiCoUtil {

    /** The reg is necessary to find serializer or parser for Xtext models. */
    @Inject
    IResourceServiceProvider.Registry regXtext;

    private static KiCoUtil instance = null;

    // -------------------------------------------------------------------------

    @Inject
    public KiCoUtil() {
        // no code
    }

    // -------------------------------------------------------------------------

    public static IResourceServiceProvider.Registry getRegXtext() {
        if (instance == null) {
            instance = Guice.createInjector().getInstance(KiCoUtil.class);
        }
        return instance.regXtext;
    }

    // -------------------------------------------------------------------------

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
    public static String serialize(EObject model, KielerCompilerContext context, boolean updateMainResource) {
        String num = (model.hashCode() + "").replace("-", "");

        String returnText = "";
        boolean done = false;
        
        // ssm, 11.08.2014:
        // Since the testing of all possible extensions may take excessive time when working with large models,
        // a plugin can register a specific resource extension via extension point. The function will test
        // the eClass for the registered extensions and will skip the general approach if a corresponding
        // extension was found.
        List<String> extensionKeyList = new LinkedList<String>(getRegXtext().getExtensionToFactoryMap().keySet());
        HashMap<String, ResourceExtension> resourceExtensionMap = KiCoPlugin.getInstance().getRegisteredResourceExtensions(false);
        if (KiCoPlugin.DEBUG) {
            System.out.println("MODEL eCLASS: " + model.eClass().getName());
        }
        ResourceExtension specificExtension = resourceExtensionMap.get(model.eClass().getName());
        if (specificExtension != null) {
            extensionKeyList.clear();
            if (!specificExtension.isXMI()) {
                extensionKeyList.add(0, specificExtension.getExtension());
            }
        }
        
        try {

            for (String ext : extensionKeyList) {
                URI uri = URI.createURI("dummy:/inmemory." + num + "." + ext);

                ResourceSet resourceSet = null;
                if (context != null) {
                    resourceSet = context.getModelResourceSet();
                }
                if (resourceSet == null) {
                    IResourceServiceProvider provider =
                            getRegXtext().getResourceServiceProvider(uri);
                    XtextResourceSet newResourceSet = provider.get(XtextResourceSet.class);
                    // newResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
                    resourceSet = newResourceSet;
                    if (context != null) {
                        // save the resource set for possibly next resources
                        context.setModelResourceSet(resourceSet);
                   }
                }

                Resource res = resourceSet.getResource(uri, false);
                if (res == null) {
                    res = resourceSet.createResource(uri);                    
                }

                done = false;
                try {
                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                    res.getContents().add(model);
                    res.save(outputStream, getSaveOptions());
                    returnText = outputStream.toString();
                    done = true;
                    if (updateMainResource) {
                          context.setMainResource(res);
                    }
                } catch (Exception e) {
                    // e.printStackTrace();
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
                    KiCoPlugin.PLUGIN_ID, e, true);
        }

        return returnText;
    }

    // -------------------------------------------------------------------------

    /**
     * You can alter the SaveOptions here.
     * 
     * @return Save options
     */
    public static Map<String, String> getSaveOptions() {
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
     * @param text the text
     * @param context the context may be null, otherwise the resource is added to the context
     * @param mainModel the main model
     * @param extension the extension may be null if unknown
     * @return the e object
     */
    public static EObject parse(String text, KielerCompilerContext context, boolean mainModel, String extension) {
        EObject returnEObject = null;

        boolean done = false;

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

        if (!done) {
            try {

                for (String ext : getRegXtext().getExtensionToFactoryMap().keySet()) {
                    System.out.println("Testing extension ''"+ext+"''");
                    if (extension != null && !extension.equals(ext)) {
                        // if an extension is given, then continue if this is not the right extension!
                        continue;
                    }

                    String num = Math.random()*1000 + System.nanoTime() + (text.hashCode() + "").replace("-", "");

                    URI uri = URI.createURI("dummy:/inmemory." + num + "." + ext);

                    ResourceSet resourceSet = null;
                    if (context != null) {
                        resourceSet = context.getModelResourceSet();
                    }
                    if (resourceSet == null) {
                        IResourceServiceProvider provider =
                                getRegXtext().getResourceServiceProvider(uri);
                        XtextResourceSet newResourceSet = provider.get(XtextResourceSet.class);
                        newResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
                                Boolean.FALSE);
                        resourceSet = newResourceSet;
                    }

                    Resource res = resourceSet.createResource(uri);

                    done = false;
                    try {
                        InputStream in = new ByteArrayInputStream(text.getBytes());// StandardCharsets.UTF_8));
                        res.load(in, resourceSet.getLoadOptions());
                        returnEObject = res.getContents().get(0);
                        if (context != null) {
                            if (!mainModel) {
                                context.addIncludedModel(returnEObject);
                            } else {
                                context.setTransformationObject(returnEObject);
                            }
                            // save the resource set for possibly next resources
                            context.setModelResourceSet(resourceSet);
                        }
                        done = true;
                    } catch (Exception e) {
                        // e.printStackTrace();
                    }

                    if (done) {
                        break;
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
                        KiCoPlugin.PLUGIN_ID, e, true);
            }
        }

        return returnEObject;
    }

    // -------------------------------------------------------------------------
    
    /**
     * Gets the stack trace of an exception as a string.
     * 
     * @param t
     *            the t
     * @return the error stack trace
     */
    public static String getStackTraceString(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString(); // stack trace as a string
    }

    // -------------------------------------------------------------------------
    
    /**
     * Gets the model hash.
     *
     * @param eObject the e object
     * @return the model hash
     */
    public int getModelHash(EObject eObject) {
        int hashValue = 0;
        TreeIterator<?> treeIterator = eObject.eAllContents();
        while (treeIterator.hasNext()) {
            Object obj = treeIterator.next();
            hashValue += obj.toString().hashCode();
        }
        return hashValue;
    }

    // -------------------------------------------------------------------------

}
