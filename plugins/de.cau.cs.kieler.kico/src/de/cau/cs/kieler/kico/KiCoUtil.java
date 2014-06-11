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
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
//import org.eclipse.xtext.resource.XtextResource;
//import org.eclipse.xtext.resource.XtextResourceSet;


import com.google.inject.Guice;
import com.google.inject.Inject;


/**
 * This class is a collection of utility methods for handling models in/with KiCo.
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 * 
 */
public class KiCoUtil {

    
//    /** The reg is necessary to find serializer or parser for Xtext models. */
    @Inject
    IResourceServiceProvider.Registry regXtext;
    
//    final static Resource.Factory.Registry regXMI = Resource.Factory.Registry.INSTANCE;//getExtensionToFactoryMap();
    
//    final static IResourceServiceProvider.Registry regXtext = IResourceServiceProvider.Registry.INSTANCE; //.getResourceServiceProvider(

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
    public static String serialize(EObject model) {
        String returnText = "";
        boolean done = false;
        try {

            for (String ext :  getRegXtext().getExtensionToFactoryMap().keySet()) {
                URI uri = URI.createURI("dummy:/inmemory." + ext);
//                Factory provider = regXMI.getFactory(uri);
//                Resource res = provider.createResource(uri);
                
                IResourceServiceProvider provider =  getRegXtext().getResourceServiceProvider(uri);
                XtextResourceSet resourceSet = provider.get(XtextResourceSet.class);
                Resource res = resourceSet.createResource(uri);

                done = false;
                try {
//                    returnText = getSerializer().serialize(model);
//                    returnText = getSerializer().serialize(model.get(0), new OutputStreamWriter(outputStream, getEncoding()), saveOptions);
                    
                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                    res.getContents().add(model);
                    res.save(outputStream, getSaveOptions());
                    returnText = outputStream.toString();
                    done = true;
                } catch (Exception e) {
                    //e.printStackTrace();
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
    protected static Map<String, String> getSaveOptions() {
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
    public static EObject parse(String text) {
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
                    URI uri = URI.createURI("dummy:/inmemory." + ext);
//                  Factory provider = regXMI.getFactory(uri);
//                  Resource res = provider.createResource(uri);

                    IResourceServiceProvider provider = getRegXtext().getResourceServiceProvider(uri);
                    XtextResourceSet resourceSet = provider.get(XtextResourceSet.class);
                    resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
                    Resource res = resourceSet.createResource(uri);

                    done = false;
                    try {
                        InputStream in = new ByteArrayInputStream(text.getBytes());// StandardCharsets.UTF_8));
//                      res.load(in, null);
                        res.load(in, resourceSet.getLoadOptions());
                        returnEObject = res.getContents().get(0);
                        done = true;
                    } catch (Exception e) {
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

}
