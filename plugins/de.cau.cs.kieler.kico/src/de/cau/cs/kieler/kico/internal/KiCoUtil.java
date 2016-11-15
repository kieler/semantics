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
package de.cau.cs.kieler.kico.internal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Guice;
import com.google.inject.Inject;

import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.kico.KiCoPlugin;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.features.Feature;
import de.cau.cs.kieler.kico.features.FeatureGroup;
import de.cau.cs.kieler.kico.transformation.ITransformation;
import de.cau.cs.kieler.kico.transformation.Processor;

/**
 * This class is a collection of utility methods for handling models in/with KiCo.
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 * 
 */
public class KiCoUtil {

    // default list of extensions for serialization and parsing
    static String[] defaultPreferredExtensions = {"sct","scg","s","circuit","kgx","kgt"};
    

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
    public static String serialize(EObject model, KielerCompilerContext context,
            boolean updateMainResource) {
        return serialize(model, context,
                updateMainResource, defaultPreferredExtensions);
    }
    public static String serialize(EObject model, KielerCompilerContext context,
            boolean updateMainResource, boolean raiseError){
        return serialize(model, context,
                updateMainResource, defaultPreferredExtensions, false);
    }    

    /**
     * Serialize the EObject (if the compilation result is not plain text (String)). This is
     * implemented by finding the first suitable XtextResourceProvider that is able to serialize the
     * model.
     * 
     * @param model
     *            the model
     * @param preferredExtensions
     *            a list of extensions to test
     * @return the string
     */
    public static String serialize(EObject model, KielerCompilerContext context,
            boolean updateMainResource, String[] preferredExtensions) {
        return serialize(model, context,
                updateMainResource, preferredExtensions, false);
    }
    public static String serialize(EObject model, KielerCompilerContext context,
            boolean updateMainResource, String[] preferredExtensions, boolean raiseError) {
        String num = (model.hashCode() + "").replace("-", "");

        String returnText = "";
        boolean done = false;

        // ssm, 11.08.2014:
        // Since the testing of all possible extensions may take excessive time when working with
        // large models,
        // a plugin can register a specific resource extension via extension point. The function
        // will test
        // the eClass for the registered extensions and will skip the general approach if a
        // corresponding
        // extension was found.
        List<String> extensionKeyList =
                new LinkedList<String>(getRegXtext().getExtensionToFactoryMap().keySet());
        KiCoPlugin.getInstance();
        HashMap<String, ResourceExtension> resourceExtensionMap =
                KiCoPlugin.getRegisteredResourceExtensions(false);
        if (KiCoPlugin.DEBUG) {
            System.out.println("MODEL eCLASS: " + model.eClass().getName() + " in ePackage: " + model.eClass().getEPackage().getName());
        }
        ResourceExtension specificExtension = resourceExtensionMap.get(model.eClass().getEPackage().getName());
        if (specificExtension != null) {
            extensionKeyList.clear();
            extensionKeyList.add(0, specificExtension.getExtension());
        } else {
            for (int i = preferredExtensions.length -1; i >= 0; i--) {
                extensionKeyList.add(0, preferredExtensions[i]);
            }
        }

        
        try {
            for (String ext : extensionKeyList) {
                URI uri = URI.createURI("dummy:/inmemory." + num + "." + ext);
                
                if (KiCoPlugin.DEBUG) {
                    System.out.print("Trying to serialize as extension '" + ext + "' ... ");
                }
                
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
                    if (KiCoPlugin.DEBUG) {
                        System.out.println("success.");
                    }
                    if (updateMainResource) {
                        context.setMainResource(res);
                    }
                } catch (Exception e) {
                    if (KiCoPlugin.DEBUG) {
                        System.out.println("failed.");
                    }
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
            if (raiseError) {
                throw e;
            } else {
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
     * @param text
     *            the text
     * @param context
     *            the context may be null, otherwise the resource is added to the context
     * @param mainModel
     *            the main model
     * @param extension
     *            the extension may be null if unknown
     * @return the e object
     */
    public static EObject parse(String text, KielerCompilerContext context, boolean mainModel,
            String extension) {
        return parse( text, context , mainModel,
                 extension, defaultPreferredExtensions); 
    }
    
    /**
     * Parse the model provided as a serialized String. This is implemented by finding the first
     * suitable XtextResourceProvider that is able to parse the model to an EObject.
     * 
     * @param text
     *            the text
     * @param context
     *            the context may be null, otherwise the resource is added to the context
     * @param mainModel
     *            the main model
     * @param extension
     *            the extension may be null if unknown
     * @param extensionPreferences
     *            the order in which extensions (if existing) are tested
     * @return the e object
     */
    public static EObject parse(String text, KielerCompilerContext context, boolean mainModel,
            String extension, String[] preferredExtensions) {
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

                // build a list respecting the preferred extension list
                ArrayList<String> extensionList = new ArrayList<String>();
                for (String ext : preferredExtensions) {
                    extensionList.add(ext);
                }
                for (String ext : getRegXtext().getExtensionToFactoryMap().keySet()) {
                    boolean exists = false;
                    for (String otherExt : extensionList) {
                        if (otherExt.equals(ext)) {
                            exists = true;
                            break;
                        }
                    }
                    if (!exists) {
                        extensionList.add(ext);
                    }
                }
                
                for (String ext : extensionList) {
                    System.out.println("Testing extension ''" + ext + "''");
                    if (extension != null && !extension.equals(ext)) {
                        // if an extension is given, then continue if this is not the right
                        // extension!
                        continue;
                    }

                    String num =
                            Math.random() * 1000 + System.nanoTime()
                                    + (text.hashCode() + "").replace("-", "");

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
                        // Diagnostic result = Diagnostician.INSTANCE.validate(returnEObject);
                        // int problems = result.getSeverity();
                        List<EObject> contents = returnEObject.eContents();
                        int count = 0;
                        for (EObject content : contents) {
                            if (!(content instanceof Annotation)) {
                                count++;
                            }
                        }
                        if (count == 0) {
                            // Assume this is not a correct model if only Annotations are in it!
                            throw new Exception(
                                    "Model only contains Annotations and is assumed not to be correctly parsed. Trying a different language parser.");
                        }
                        // String test = KiCoUtil.serialize(returnEObject, context, false);
                        if (context != null && returnEObject != null) {
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
     * @param eObject
     *            the e object
     * @return the model hash
     */
    public static int getModelHash(EObject eObject) {
        int hashValue = 0;
        for (Object obj : eObject.eContents()) {
            if (obj instanceof EObject) {
                EObject innerEObject = (EObject) obj;
                hashValue += getModelHash(innerEObject);
            }
            hashValue += obj.toString().hashCode();
        }
        return Math.abs(hashValue) + 1;
    }

    // -------------------------------------------------------------------------

    public static HashMap<EObject, Integer> cachedHashes = new HashMap<EObject, Integer>();
    public static HashMap<EObject, Set<Feature>> cachedFeatures =
            new HashMap<EObject, Set<Feature>>();

    /**
     * Retrieves a list of features of a model. This is an automatically cached method which will
     * use cache results if the model does not change and forceUpdate is false. If forceUpdate is
     * true then the features are definitely calculated new, even if there is a cached feature list
     * already. If contrary forceFastCached is true then this will just return the cached version if
     * there exists one or null otherwise. ForceFastCached should ONLY be used if it is sure that
     * the model has not changed. ForceFastCached will also prevent a recalculation if the model
     * hash. If ForceFastCached is true the caller must be sure that the model has not changed and
     * was previously been processed. The default is forceUpdate == false and forceFastCached ==
     * false.
     * 
     * @param model
     *            the model
     * @param forceUpdate
     *            the force update
     * @param forceNoUpdate
     *            the force no update
     * @return the transformation object features
     */
    public static Set<Feature> getModelFeatures(EObject model, boolean forceUpdate,
            boolean forceFastCached) {
        if (forceFastCached) {
            // The quick lookup in our cache, the caller must be sure that the model has not changed
            // and was previously been processed.
            if (cachedFeatures.containsKey(model)) {
                return cachedFeatures.get(model);
            }
            return null;
        }
        int currentHash = getModelHash(model);
        if (!forceUpdate) {
            // Try to find previous results
            if (cachedFeatures.containsKey(model) && cachedHashes.containsKey(model)) {
                // Compare hashes
                int previousHash = cachedHashes.get(model);
                if (previousHash == currentHash) {
                    // No updates are required, just return the cached feature list
                    return cachedFeatures.get(model);
                }
            }
        }
        // At this point:
        // 1. forceUpdate == true, or
        // 2. the model was not processed earlier, or
        // 3. the model has changed

        // Calculate the features, go thru all features and request isContained
        Set<Feature> featureList = new HashSet<Feature>();
        for (Feature feature : KielerCompiler.getFeatures()) {
//            //check if a feature is contained and can be expanded xor if it is requested to be produced
//            if ((!(feature instanceof FeatureGroup)) && (feature.doIsContained(model) ^ feature.isProduction())) {
//                    featureList.add(feature);
//            }
            // Check if a feature is contained 
            if (!(feature instanceof FeatureGroup) && (feature.doIsContained(model))) {
                    featureList.add(feature);
            }
        }

        // Cache the result
        cachedFeatures.put(model, featureList);
        // Cache the hash
        cachedHashes.put(model, currentHash);

        // Return updated or freshly computed feature list
        return featureList;
    }

    // -------------------------------------------------------------------------

    /**
     * Log error.
     * 
     * @param pluginId
     *            the plugin id
     * @param msg
     *            the msg
     * @param e
     *            the e
     */
    public static void logError(String pluginId, String msg, Exception e) {
        StatusManager.getManager().handle(new Status(IStatus.ERROR, pluginId, msg, e),
                StatusManager.LOG);
    }

    // -------------------------------------------------------------------------

    /**
     * Log warning.
     * 
     * @param pluginId
     *            the plugin id
     * @param msg
     *            the msg
     * @param e
     *            the e
     */
    public static void logWarning(String pluginId, String msg, Exception e) {
        StatusManager.getManager().handle(new Status(IStatus.WARNING, pluginId, msg, e),
                StatusManager.LOG);
    }

    // -------------------------------------------------------------------------

    /**
     * Log info.
     * 
     * @param pluginId
     *            the plugin id
     * @param msg
     *            the msg
     * @param e
     *            the e
     */
    public static void logInfo(String pluginId, String msg, Exception e) {
        StatusManager.getManager().handle(new Status(IStatus.INFO, pluginId, msg, e),
                StatusManager.LOG);
    }

    // ------------------------------------------------------------------------

    /**
     * For a transformation, gets the specific transformation method with parameter more specific
     * than EObject but will fall back to the EObject case if not found.
     * 
     * @param object
     *            the object
     * @param transformationId
     *            the transformation id
     * @return the specific transformation method or fall back
     */
    public static Method getSpecificTransformationMethodOrFallBack(ITransformation transformation,
            String transformationId) {
        Method transformMethod = null;
        Method fallbackMethod = null; // is the EObject method
        try {
            Method[] methods = transformation.getClass().getMethods();
            for (Method m : methods) {
                if (m.getName().equals("transform")) {
                    // now look if the second parameter is EObject or more specific
                    Class<?>[] parameters = m.getParameterTypes();
                    if (parameters != null && parameters.length > 0) {
                        Class<?> parameter = parameters[0];
                        if (!parameter.getName().equals("org.eclipse.emf.ecore.EObject")) {
                            // System.out.println(m.getName() + " (" + parameter.getName() + ")");
                            // not an EObject - more specific
                            transformMethod = m;
                        } else {
                            // System.out.println(m.getName() + " (org.eclipse.emf.ecore.EObject)");
                            // an EOBject - fallBack
                            fallbackMethod = m;
                        }
                    }
                }
            }
            if (transformMethod == null && fallbackMethod != null) {
                transformMethod = fallbackMethod;
            }
            // transformMethod =
            // ((Transformation) object).getClass().getMethod("transform", EObject.class,
            // KielerCompilerContext.class);
        } catch (Exception e) {
            return null;
        }
        if (transformMethod == null) {
            throw (new RuntimeException("The transformation method of transformation '"
                    + transformationId + "' was not found."));
        }
        return transformMethod;
    }

    // ------------------------------------------------------------------------

    /**
     * For a processor, gets the specific process method with parameter more specific than EObject
     * but will fall back to the EObject case if not found.
     * 
     * @param object
     *            the object
     * @param processId
     *            the process id
     * @return the specific transformation method or fall back
     */
    public static Method getSpecificProcessMethodOrFallBack(Object object, String processId) {
        Method transformMethod = null;
        Method fallbackMethod = null; // is the EObject method
        try {
            Method[] methods = ((Processor) object).getClass().getMethods();
            for (Method m : methods) {
                if (m.getName().equals("process")) {
                    Class<?>[] parameters = m.getParameterTypes();
                    if (parameters != null && parameters.length > 0) {
                        Class<?> parameter = parameters[0];
                        if (!parameter.getName().equals("org.eclipse.emf.ecore.EObject")) {
                            // System.out.println(m.getName() + " (" + parameter.getName() + ")");
                            // not an EObject - more specific
                            transformMethod = m;
                        } else {
                            // System.out.println(m.getName() + " (org.eclipse.emf.ecore.EObject)");
                            // an EOBject - fallBack
                            fallbackMethod = m;
                        }
                    }
                }
            }
            if (transformMethod == null && fallbackMethod != null) {
                transformMethod = fallbackMethod;
            }
            // transformMethod =
            // ((Processor) object).getClass().getMethod("process", EObject.class,
            // KielerCompilerContext.class);
        } catch (Exception e) {
            return null;
        }
        if (transformMethod == null) {
            throw (new RuntimeException("The process method of processor '" + processId
                    + "' was not found."));
        }
        return transformMethod;
    }

    // ------------------------------------------------------------------------

    /**
     * For a feature, gets the specific is contained method with parameter more specific than
     * EObject but will fall back to the EObject case if not found.
     * 
     * @param object
     *            the object
     * @param featureId
     *            the feature id
     * @return the specific transformation method or fall back
     */
    public static Method getSpecificIsContainedMethodOrFallBack(Object object, String featureId) {
        Method transformMethod = null;
        Method fallbackMethod = null; // is the EObject method
        try {
            Method[] methods = ((Feature) object).getClass().getMethods();
            for (Method m : methods) {
                if (m.getName().equals("isContained")) {
                    Class<?>[] parameters = m.getParameterTypes();
                    if (parameters != null && parameters.length > 0) {
                        Class<?> parameter = parameters[0];
                        String compareName = parameter.getName();
                        if (!compareName.equals("org.eclipse.emf.ecore.EObject")) {
                            // System.out.println(m.getName() + " (" + parameter.getName() + ")");
                            // not an EObject - more specific
                            transformMethod = m;
                        } else {
                            // System.out.println(m.getName() + " (org.eclipse.emf.ecore.EObject)");
                            // an EOBject - fallBack
                            fallbackMethod = m;
                        }
                    }
                }
            }
            if (transformMethod == null && fallbackMethod != null) {
                transformMethod = fallbackMethod;
            }
            // transformMethod =
            // ((Processor) object).getClass().getMethod("process", EObject.class,
            // KielerCompilerContext.class);
        } catch (Exception e) {
            return null;
        }
        if (transformMethod == null) {
            throw (new RuntimeException("The isContained method of feature '" + featureId
                    + "' was not found."));
        }
        return transformMethod;
    }

    // ------------------------------------------------------------------------

}
