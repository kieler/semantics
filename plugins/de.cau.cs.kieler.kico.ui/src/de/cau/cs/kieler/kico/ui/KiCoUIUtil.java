/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.ui;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Guice;
import com.google.inject.Inject;

import de.cau.cs.kieler.kico.KiCoPlugin;

/**
 * This class is a collection of utility methods for handling models in/with KiCo.
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 * 
 */
public class KiCoUIUtil {

    /** The reg is necessary to find serializer or parser for Xtext models. */
    @Inject
    IResourceServiceProvider.Registry regXtext;
    
    final static Resource.Factory.Registry regXMI = Resource.Factory.Registry.INSTANCE;//getExtensionToFactoryMap();

    private static KiCoUIUtil instance = null;

    // -------------------------------------------------------------------------

    @Inject
    public KiCoUIUtil() {
        // no code
    }

    // -------------------------------------------------------------------------

    public static IResourceServiceProvider.Registry getRegXtext() {
        if (instance == null) {
            instance = Guice.createInjector().getInstance(KiCoUIUtil.class);
        }
        return instance.regXtext;
    }

    // -------------------------------------------------------------------------

    /**
     * xxx
     * 
     * @param model
     *            the model
     * @return the string
     */
    public static String getFileExtension(EObject model) {
        
//        String modelText = KiCoUtil.serialize(model);
//        InputStream inputStream = new ByteArrayInputStream(modelText.getBytes());
//        try {
//            IContentType contentType = Platform.getContentTypeManager().findContentTypeFor(
//                    inputStream, null);
//            System.out.println(contentType.getClass().getName());
//            
//        } catch (IOException e1) {
//            e1.printStackTrace();
//        }        
//        
//        IFileEditorMapping[] editorMappings = PlatformUI.getWorkbench().getEditorRegistry().getFileEditorMappings();
//        for (IFileEditorMapping editorMapping : editorMappings) {
//            IEditorDescriptor defaultEditor = editorMapping.getDefaultEditor();
//            if (defaultEditor != null) {
//                System.out.println(defaultEditor.getId());
//                int i = 3;
//            }
//        }
                
//                
//                .getDefaultEditor("default." + fileExtension);
        
        String returnText = null;
        boolean done = false;
        String modelClass = model.getClass().getName();

        if (!done) {
            XMIResourceImpl xmiResource = new XMIResourceImpl();
            try {
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                xmiResource.getContents().add(model);
                xmiResource.save(outputStream, getSaveOptions());
                
                for (String ext : regXMI.getExtensionToFactoryMap().keySet()) {
                    System.out.println(ext);
                    if (ext.equals("*") || ext.equals("xmi")) {
                        continue;
                    }
                    URI uri = URI.createURI("dummy:/inmemory." + ext);
                    Factory factory = regXMI.getFactory(uri);
                    Resource res = factory.createResource(uri);
                    
                    if (res instanceof XMIResourceImpl) {
                        XMIResourceImpl resXMI = (XMIResourceImpl) res;
                        
                        System.out.println(resXMI.toString() + " contains " + modelClass + "?");
                        
                        if (resXMI.toString().contains(modelClass)) {
                            returnText = ext;
                            done = true;
                        }
//                        int i = resXMI.hashCode();
//
//                        done = false;
//                        try {
//                            res.getContents().add(model);
//                            res.save(outputStream, getSaveOptions());
//                            returnText = ext;
//                            done = true;
//                        } catch (Exception e) {
//                        }
                    }
                    

                    if (done) {
                        break;
                    }
                }
            } catch (Exception e) {
            }
        }

        if (!done) {
            try {

                for (String ext : getRegXtext().getExtensionToFactoryMap().keySet()) {
                    URI uri = URI.createURI("dummy:/inmemory." + ext);
                    IResourceServiceProvider provider = getRegXtext().getResourceServiceProvider(uri);
                    XtextResourceSet resourceSet = provider.get(XtextResourceSet.class);
                    Resource res = resourceSet.createResource(uri);

                    done = false;
                    try {
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        res.getContents().add(model);
                        res.save(outputStream, getSaveOptions());
                        returnText = ext;
                        done = true;
                    } catch (Exception e) {
                    }

                    if (done) {
                        break;
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

}
