/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;

import java.util.HashMap;
import java.util.logging.Logger;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.statushandlers.IStatusAdapterConstants;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;

import com.google.inject.Guice;
import com.google.inject.Inject;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author cmot ssm
 * @kieler.design 2015-03-11 proposed
 * @kieler.rating 2015-03-11 proposed yellow
 */
public class KiCoPlugin extends Plugin {

    /** The logger. */
    @Inject
    public static Logger logger;

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.kico"; //$NON-NLS-1$

    /** The Constant PROCESSOR_EXTENSION_POINT_ID. */
    public static final String PROCESSOR_EXTENSION_POINT_ID = "de.cau.cs.kieler.kico.processor";

    /** The Constant FEATURE_EXTENSION_POINT_ID. */
    public static final String FEATURE_EXTENSION_POINT_ID = "de.cau.cs.kieler.kico.feature";

    /** The Constant TRANSFORMATION_EXTENSION_POINT_ID. */
    public static final String TRANSFORMATION_EXTENSION_POINT_ID =
            "de.cau.cs.kieler.kico.transformation";

    /** The Constant EXTENSION_POINT_ID. */
    public static final String CREEPER_EXTENSION_POINT_ID = "de.cau.cs.kieler.kico.hook";

    /** The Constant RESOURCEEXTENSION_EXTENSION_POINT_ID. */
    public static final String RESOURCEEXTENSION_EXTENSION_POINT_ID =
            "de.cau.cs.kieler.kico.extension";

    /** The Constant KICO_MSGDLG_TITLE. */
    public static final String KICO_MSGDLG_TITLE = "KIELER Compiler";

    /** The Constant DEBUG. */
    public static final boolean DEBUG = !System.getProperty("java.vm.info", "").contains("sharing");

    /** The shared instance. */
    private static KiCoPlugin plugin;

    /**
     * The parent shell iff a GUI is used. This shell may be used to prompt a save-dialog to save
     * execution files. UI's should listen to the KiemEvent CALL_FOR_SHELL and then call the method
     * setShell() of KiemPlugin.
     */
    private static Shell parentShell;

    /** The no error output. */
    private boolean forceNoErrorOutput = false;

    // -------------------------------------------------------------------------

    /* MAIN DATA CACHES */

    /** The cached registered processors. */
    private static HashMap<String, Processor> processorsCached = null;

    /** The cached registered features. */
    private static HashMap<String, Feature> featuresCached = null;

    /** The cached registered transformations. */
    private static HashMap<String, Transformation> transformationsCached = null;

    /** The cached registered hooks. */
    private static HashMap<String, IHook> hooksCached = null;

    /** The cached resource extensions. */
    private static HashMap<String, ResourceExtension> resourceExtensionsCached = null;

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * The constructor.
     */
    public KiCoPlugin() {
        plugin = this;
    }

    // -------------------------------------------------------------------------

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static KiCoPlugin getInstance() {
        return plugin;
    }

    // -------------------------------------------------------------------------

    // /**
    // * Checks if is e object.
    // *
    // * @param clazz
    // * the clazz
    // * @return true, if is e object
    // */
    // private static boolean isEObject(Class<?> clazz) {
    // if (EObject.class.isAssignableFrom(clazz)) {
    // return true;
    // }
    // return false;
    // }
    //
    // // -------------------------------------------------------------------------
    //
    // /**
    // * Checks if is isKielerCompilerContext.
    // *
    // * @param clazz
    // * the clazz
    // * @return true, if is e object
    // */
    // private static boolean isKielerCompilerContext(Class<?> clazz) {
    // if (KielerCompilerContext.class.isAssignableFrom(clazz)) {
    // return true;
    // }
    // return false;
    // }

    // -------------------------------------------------------------------------

    /**
     * Gets the guice instance.
     * 
     * @param object
     *            the object
     * @return the guice instance
     */
    public static Object getGuiceInstance(Object object) {
        Object guiceInstance = Guice.createInjector().getInstance(object.getClass());
        return guiceInstance;
    }

    // -------------------------------------------------------------------------
    
    // /**
    // * Gets the invokable method.
    // *
    // * @param object
    // * the object
    // * @param method
    // * the method
    // * @return the invokable method
    // */
    // private Method getInvokableMethod(Object object, String method) {
    // for (Method providedMethod : object.getClass().getMethods()) {
    // String providedMethodName = providedMethod.getName();
    // Class<?>[] parameterTypes = providedMethod.getParameterTypes();
    // if (providedMethodName.equals(method)) {
    // // Case where signature is 'method(EObject eObject)'
    // if (parameterTypes.length == 1) {
    // Class<?> parameterType = parameterTypes[0];
    // if (isEObject(parameterType)) {
    // return providedMethod;
    // }
    // }
    // // Case where signature is 'method(EObject eObject, KielerCompilerContext
    // // kielerCompilerContext)'
    // if (parameterTypes.length == 2) {
    // Class<?> parameterType1 = parameterTypes[0];
    // Class<?> parameterType2 = parameterTypes[1];
    // if (isEObject(parameterType1) && isKielerCompilerContext(parameterType2)) {
    // return providedMethod;
    // }
    // }
    // }
    // }
    // return null;
    // }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    // ██████╗.███████╗.██████╗.██╗███████╗████████╗██████╗..█████╗.████████╗██╗.██████╗.███╗...██╗
    // ██╔══██╗██╔════╝██╔════╝.██║██╔════╝╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝██║██╔═══██╗████╗..██║
    // ██████╔╝█████╗..██║..███╗██║███████╗...██║...██████╔╝███████║...██║...██║██║...██║██╔██╗.██║
    // ██╔══██╗██╔══╝..██║...██║██║╚════██║...██║...██╔══██╗██╔══██║...██║...██║██║...██║██║╚██╗██║
    // ██║..██║███████╗╚██████╔╝██║███████║...██║...██║..██║██║..██║...██║...██║╚██████╔╝██║.╚████║
    // ╚═╝..╚═╝╚══════╝.╚═════╝.╚═╝╚══════╝...╚═╝...╚═╝..╚═╝╚═╝..╚═╝...╚═╝...╚═╝.╚═════╝.╚═╝..╚═══╝
    // -------------------------------------------------------------------------
    // http://patorjk.com/software/taag/#p=display&f=ANSI%20Shadow&t=registration

    /**
     * Gets the registered processors or the cached version.
     * 
     * @return the registered processors
     */
    public static HashMap<String, Processor> getRegisteredProcessors(boolean forceReload) {
        // Return the cache if there is any and not forced to reload
        if (processorsCached != null && !forceReload) {
            return processorsCached;
        }
        // Otherwise inspect the extensions
        IConfigurationElement[] extensions =
                Platform.getExtensionRegistry().getConfigurationElementsFor(
                        PROCESSOR_EXTENSION_POINT_ID);
        // Clear the cache
        processorsCached = new HashMap<String, Processor>();
        // Walk thru every extension and instantiate the declared class, then put it into the cache
        for (IConfigurationElement extension : extensions) {
            String className = extension.getName();
            try {
                Processor instance = (Processor) extension.createExecutableExtension("class");
                // Handle the case that wee need Google Guice for instantiation
                instance = (Processor) getGuiceInstance(instance);
                String id = instance.getId();
                className += " (" + id + ")";
                if (processorsCached.containsKey(id)) {
                    KiCoUtil.logError(KiCoPlugin.PLUGIN_ID, "KiCo failed to register processor: "
                            + extension + " for class " + className
                            + " because this ID is already taken.", null);
                } else {
                    processorsCached.put(id, instance);
                    logInfo("KiCo register processor: " + extension + " for class " + className);
                }
            } catch (CoreException e) {
                KiCoUtil.logError(KiCoPlugin.PLUGIN_ID, "KiCo failed to register processor: "
                        + extension + " for class " + className, e);
            }
        }
        return processorsCached;

    }

    // -------------------------------------------------------------------------

    /**
     * Gets the registered features and feature groups or the cached version.
     * 
     * @return the registered features and feature groups
     */
    public static HashMap<String, Feature> getRegisteredFeatures(boolean forceReload) {
        // Return the cache if there is any and not forced to reload
        if (featuresCached != null && !forceReload) {
            return featuresCached;
        }
        // Otherwise inspect the extensions
        IConfigurationElement[] extensions =
                Platform.getExtensionRegistry().getConfigurationElementsFor(
                        FEATURE_EXTENSION_POINT_ID);
        // Clear the cache
        featuresCached = new HashMap<String, Feature>();
        // Walk thru every extension and instantiate the declared class, then put it into the cache
        for (IConfigurationElement extension : extensions) {
            String className = extension.getName();
            try {
                Feature instance = (Feature) extension.createExecutableExtension("class");
                // Handle the case that wee need Google Guice for instantiation
                instance = (Feature) getGuiceInstance(instance);                
                String id = instance.getId();
                className += " (" + id + ")";
                if (featuresCached.containsKey(id)) {
                    KiCoUtil.logError(KiCoPlugin.PLUGIN_ID, "KiCo failed to register feature: "
                            + extension + " for class " + className
                            + " because this ID is already taken.", null);
                } else {
                    featuresCached.put(id, instance);
                    logInfo("KiCo register feature: " + extension + " for class " + className);
                }
            } catch (CoreException e) {
                KiCoUtil.logError(KiCoPlugin.PLUGIN_ID, "KiCo failed to register feature: "
                        + extension + " for class " + className, e);
            }
        }
        return featuresCached;

    }

    // -------------------------------------------------------------------------

    /**
     * Gets the registered transformations or the cached version.
     * 
     * @return the registered transformations
     */
    public static HashMap<String, Transformation> getRegisteredTransformations(boolean forceReload) {
        // Return the cache if there is any and not forced to reload
        if (transformationsCached != null && !forceReload) {
            return transformationsCached;
        }
        // Otherwise inspect the extensions
        IConfigurationElement[] extensions =
                Platform.getExtensionRegistry().getConfigurationElementsFor(
                        TRANSFORMATION_EXTENSION_POINT_ID);
        // Clear the cache
        transformationsCached = new HashMap<String, Transformation>();
        // Walk thru every extension and instantiate the declared class, then put it into the cache
        for (IConfigurationElement extension : extensions) {
            String className = extension.getName();
            try {
                Transformation instance =
                        (Transformation) extension.createExecutableExtension("class");
                // Handle the case that wee need Google Guice for instantiation
                instance = (Transformation) getGuiceInstance(instance);                
                String id = instance.getId();
                className += " (" + id + ")";
                if (transformationsCached.containsKey(id)) {
                    KiCoUtil.logError(KiCoPlugin.PLUGIN_ID,
                            "KiCo failed to register transformation: " + extension + " for class "
                                    + className + " because this ID is already taken.", null);
                } else {
                    transformationsCached.put(id, instance);
                    logInfo("KiCo register transformation: " + extension + " for class "
                            + className);
                }
            } catch (Exception e) {
                KiCoUtil.logError(KiCoPlugin.PLUGIN_ID, "KiCo failed to register transformation: "
                        + extension + " for class " + className, e);
            }
        }
        return transformationsCached;

    }

    // -------------------------------------------------------------------------

    /**
     * Gets the registered processors or the cached version.
     * 
     * @return the registered processors
     */
    public static HashMap<String, IHook> getRegisteredHooks(boolean forceReload) {
        // Return the cache if there is any and not forced to reload
        if (hooksCached != null && !forceReload) {
            return hooksCached;
        }
        // Otherwise inspect the extensions
        IConfigurationElement[] extensions =
                Platform.getExtensionRegistry().getConfigurationElementsFor(
                        CREEPER_EXTENSION_POINT_ID);
        // Clear the cache
        hooksCached = new HashMap<String, IHook>();
        // Walk thru every extension and instantiate the declared class, then put it into the cache
        for (IConfigurationElement extension : extensions) {
            String className = extension.getName();
            try {
                IHook instance = (IHook) extension.createExecutableExtension("class");
                // Handle the case that wee need Google Guice for instantiation
                instance = (IHook) getGuiceInstance(instance);                
                String id = instance.getId();
                className += " (" + id + ")";
                if (hooksCached.containsKey(id)) {
                    KiCoUtil.logError(KiCoPlugin.PLUGIN_ID, "KiCo failed to register hook: "
                            + extension + " for class " + className
                            + " because this ID is already taken.", null);
                } else {
                    hooksCached.put(id, instance);
                    logInfo("KiCo register hook: " + extension + " for class " + className);
                }
            } catch (CoreException e) {
                KiCoUtil.logError(KiCoPlugin.PLUGIN_ID, "KiCo failed to register hook: "
                        + extension + " for class " + className, e);
            }
        }
        return hooksCached;

    }

    // -------------------------------------------------------------------------

    /**
     * Gets the registered resource extensions.
     * 
     * @param forceReload
     *            the force reload
     * @return the registered resource extensions
     */
    public static HashMap<String, ResourceExtension> getRegisteredResourceExtensions(
            boolean forceReload) {
        if (resourceExtensionsCached != null && !forceReload) {
            return resourceExtensionsCached;
        }
        IConfigurationElement[] resourceExtensions =
                Platform.getExtensionRegistry().getConfigurationElementsFor(
                        RESOURCEEXTENSION_EXTENSION_POINT_ID);
        resourceExtensionsCached = new HashMap<String, ResourceExtension>();
        for (int i = 0; i < resourceExtensions.length; i++) {
            try {
                String className = resourceExtensions[i].getAttribute("className");
                String extension = resourceExtensions[i].getAttribute("extensionName");
                String isXMI = resourceExtensions[i].getAttribute("isXMI");
                String editorID = resourceExtensions[i].getAttribute("editor_id");
                resourceExtensionsCached.put(className, new ResourceExtension(className, extension,
                        isXMI.toLowerCase().equals("true"), editorID));

                logInfo("KiCo register resource extension: " + extension + " for class "
                        + className);
            } finally {
                // do nothing
            }
        }
        return resourceExtensionsCached;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    // .....█████╗..██████╗.██████╗███████╗███████╗███████╗
    // ....██╔══██╗██╔════╝██╔════╝██╔════╝██╔════╝██╔════╝
    // ....███████║██║.....██║.....█████╗..███████╗███████╗
    // ....██╔══██║██║.....██║.....██╔══╝..╚════██║╚════██║
    // ....██║..██║╚██████╗╚██████╗███████╗███████║███████║
    // ....╚═╝..╚═╝.╚═════╝.╚═════╝╚══════╝╚══════╝╚══════╝.
    // -------------------------------------------------------------------------

    /**
     * Gets the processor by its id, if it is registered.
     * 
     * @param id
     *            the id
     * @param forceReload
     *            the force reload flag
     * @return the processor
     */
    public static Processor getProcessor(String id, boolean forceReload) {
        HashMap<String, Processor> cache = getRegisteredProcessors(forceReload);
        if (!cache.containsKey(id)) {
            KiCoUtil.logError(KiCoPlugin.PLUGIN_ID, "KiCo cannot find the processor with ID '" + id
                    + "'", null);
            return null;
        }
        return cache.get(id);
    }

    /**
     * Gets the processor by its id, if it is registered.
     * 
     * @param id
     *            the id
     * @return the processor
     */
    public static Processor getProcessor(String id) {
        return getProcessor(id, false);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the feature by its id, if it is registered.
     * 
     * @param id
     *            the id
     * @param forceReload
     *            the force reload flag
     * @return the feature
     */
    public static Feature getFeature(String id, boolean forceReload) {
        HashMap<String, Feature> cache = getRegisteredFeatures(forceReload);
        if (!cache.containsKey(id)) {
            KiCoUtil.logWarning(KiCoPlugin.PLUGIN_ID, "KiCo cannot find the feature with ID '" + id
                    + "'", null);
            return null;
        }
        return cache.get(id);
    }

    /**
     * Gets the feature by its id, if it is registered.
     * 
     * @param id
     *            the id
     * @return the feature
     */
    public static Feature getFeature(String id) {
        return getFeature(id, false);
    }

    // -------------------------------------------------------------------------
    /**
     * Gets the transformation by its id, if it is registered.
     * 
     * @param id
     *            the id
     * @param forceReload
     *            the force reload flag
     * @return the transformation
     */
    public static Transformation getTransformation(String id, boolean forceReload) {
        HashMap<String, Transformation> cache = getRegisteredTransformations(forceReload);
        if (!cache.containsKey(id)) {
            KiCoUtil.logWarning(KiCoPlugin.PLUGIN_ID, "KiCo cannot find the transformation with ID '"
                    + id + "'", null);
            return null;
        }
        return cache.get(id);
    }

    /**
     * Gets the transformation by its id, if it is registered.
     * 
     * @param id
     *            the id
     * @return the transformation
     */
    public static Transformation getTransformation(String id) {
        return getTransformation(id, false);
    }

    // -------------------------------------------------------------------------
    /**
     * Gets the hook by its id, if it is registered.
     * 
     * @param id
     *            the id
     * @param forceReload
     *            the force reload flag
     * @return the hook
     */
    public static IHook getHook(String id, boolean forceReload) {
        HashMap<String, IHook> cache = getRegisteredHooks(forceReload);
        if (!cache.containsKey(id)) {
            KiCoUtil.logWarning(KiCoPlugin.PLUGIN_ID, "KiCo cannot find the hook with ID '" + id
                    + "'", null);
            return null;
        }
        return cache.get(id);
    }

    /**
     * Gets the hook by its id, if it is registered.
     * 
     * @param id
     *            the id
     * @return the hook
     */
    public static IHook getHook(String id) {
        return getHook(id, false);
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Gets the resource extension for an model. Note that for this method to work there must be a
     * plugin that uses the extension point de.cau.cs.kieler.kico.extension to register a
     * resource/file extension for a specific class name that is the (intermediate) result of one or
     * several performed transformations. If no resource extension is registered for the class name
     * of the intermediateResult given, then null is returned.
     * 
     * @param model
     *            the intermediate result
     * @return the resource extension
     */
    public ResourceExtension getResourceExtension(Object model) {
        KiCoPlugin.getInstance();
        HashMap<String, ResourceExtension> resourceExtensionMap =
                KiCoPlugin.getRegisteredResourceExtensions(false);
        ResourceExtension specificExtension = null;
        if (model instanceof EObject) {
            specificExtension = resourceExtensionMap.get(((EObject) model).eClass().getName());
        } else {
            specificExtension = resourceExtensionMap.get(model.getClass().getSimpleName());
        }
        if (specificExtension != null) {
            return specificExtension;
        }
        return null;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    // ....██████╗..███████╗███╗...██╗███████╗██████╗..█████╗.██╗.....
    // ....██╔════╝.██╔════╝████╗..██║██╔════╝██╔══██╗██╔══██╗██║.....
    // ....██║..███╗█████╗..██╔██╗.██║█████╗..██████╔╝███████║██║.....
    // ....██║...██║██╔══╝..██║╚██╗██║██╔══╝..██╔══██╗██╔══██║██║.....
    // ....╚██████╔╝███████╗██║.╚████║███████╗██║..██║██║..██║███████╗
    // .....╚═════╝.╚══════╝╚═╝..╚═══╝╚══════╝╚═╝..╚═╝╚═╝..╚═╝╚══════╝
    // -------------------------------------------------------------------------

    /**
     * Sets the parent shell that KIEM should use to display user dialogs.
     * 
     * @param parentShellParam
     *            the new shell
     */
    public void setShell(final Shell parentShellParam) {
        if (parentShellParam != null) {
            KiCoPlugin.parentShell = parentShellParam;
        }
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    // ....███████╗██████╗.██████╗..██████╗.██████╗.███████╗
    // ....██╔════╝██╔══██╗██╔══██╗██╔═══██╗██╔══██╗██╔════╝
    // ....█████╗..██████╔╝██████╔╝██║...██║██████╔╝███████╗
    // ....██╔══╝..██╔══██╗██╔══██╗██║...██║██╔══██╗╚════██║
    // ....███████╗██║..██║██║..██║╚██████╔╝██║..██║███████║
    // ....╚══════╝╚═╝..╚═╝╚═╝..╚═╝.╚═════╝.╚═╝..╚═╝╚══════╝
    // -------------------------------------------------------------------------

    /**
     * Log an info.
     * 
     * @param msg
     *            the msg
     */
    public static void logInfo(String msg) {
        if (logger != null) {
            logger.info(msg);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the error warning message.
     * 
     * @param textMessage
     *            the text message
     * @param pluginID
     *            the plugin id
     * @param exception
     *            the exception
     * @return the error warning message
     */
    private String getErrorWarningMessage(final String textMessage, final String pluginID,
            final Exception exception) {
        String message = "";
        String exceptionMessage = "";
        if (exception != null && exception.getMessage() != null) {
            exceptionMessage = exception.getMessage();
        }

        if (textMessage != null) {
            message = textMessage + message;
            // exception = null;
        } else if (exception != null) {
            message = exceptionMessage + message;
            // exception = null;
        }

        // do not post the same message twice
        if ((exception != null) && (textMessage != null)
                && (exceptionMessage.startsWith(textMessage))) {
            message = "" + pluginID + "";
        } else {
            message += " (" + pluginID + ")";
        }
        return message;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the plugin id.
     * 
     * @param textMessage
     *            the text message
     * @param pluginID
     *            the plugin id
     * @param exception
     *            the exception
     * @return the plugin id
     */
    private String getPluginID(final String textMessage, final String pluginID,
            final Exception exception) {
        String pluginID2 = null;
        if (pluginID == null) {
            pluginID2 = KiCoPlugin.PLUGIN_ID;
        } else {
            pluginID2 = pluginID;
        }
        return pluginID2;
    }

    // -------------------------------------------------------------------------

    /**
     * Show warning dialog with the message.
     * 
     * @param message
     *            the message to present
     */
    public void showWarning(final String message) {
        if (parentShell != null) {
            MessageDialog.openWarning(parentShell, KICO_MSGDLG_TITLE, message);
        } else {
            showWarning(message, KiCoPlugin.PLUGIN_ID, null, true);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Show error dialog with the message.
     * 
     * @param message
     *            the message to present
     */
    public void showError(final String message) {
        if (parentShell != null) {
            MessageDialog.openError(parentShell, KICO_MSGDLG_TITLE, message);
        } else {
            showError(message, KiCoPlugin.PLUGIN_ID, null, true);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Shows a warning dialog using the StatusAdapter. This dialog will *NOT* be modal, so that the
     * user is notified but the current work is not interrupted. <BR>
     * Additionally the information will be logged in the error log so that the user has the
     * opportunity to e.g., access the error stack trace. The plug-in id is required, textMessage
     * and exception are optional.
     * 
     * @param textMessage
     *            the text message
     * @param pluginID
     *            the plug-in id
     * @param exception
     *            the exception
     * @param silent
     *            the silent tag indicates that only logging occurs, no message dialog is displayed
     */
    public void showWarning(final String textMessage, final String pluginID,
            final Exception exception, final boolean silent) {
        if (forceNoErrorOutput) {
            return;
        }
        try {
            String message = getErrorWarningMessage(textMessage, pluginID, exception);
            String pluginID2 = getPluginID(textMessage, pluginID, exception);

            IStatus status;
            if ((exception == null) || (exception instanceof RuntimeException)) {
                status =
                        new Status(IStatus.WARNING, pluginID2, IStatus.WARNING, message, exception);
            } else {
                try {
                    status =
                            new Status(IStatus.WARNING, pluginID2, IStatus.WARNING, message,
                                    exception.getCause());
                } catch (Exception e) {
                    status =
                            new Status(IStatus.WARNING, pluginID2, IStatus.WARNING, message,
                                    exception);
                }
            }

            StatusAdapter statusAdapter = new StatusAdapter(status);
            statusAdapter.setProperty(IStatusAdapterConstants.TIMESTAMP_PROPERTY,
                    System.currentTimeMillis());

            // use status manager (log and (optionally) show)
            if (!silent) {
                StatusManager.getManager().handle(statusAdapter,
                        StatusManager.LOG | StatusManager.SHOW);
            } else {
                StatusManager.getManager().handle(statusAdapter, StatusManager.LOG);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Shows an error dialog using the StatusAdapter. This dialog will be modal, so that the user
     * has to click OK to end it. Additionally the information will be logged in the error log so
     * that the user has the opportunity to e.g., access the error stack trace. The plug-in id is
     * required, textMessage and exception are optional.
     * 
     * @param textMessage
     *            the optional text message
     * @param pluginID
     *            the plug-in id
     * @param exception
     *            the exception if any, null otherwise
     * @param silent
     *            the silent tag indicates that only logging occurs, no message dialog is displayed
     */
    public void showError(final String textMessage, final String pluginID,
            final Exception exception, final boolean silent) {
        if (isForceNoErrorOutput()) {
            return;
        }
        try {
            String message = getErrorWarningMessage(textMessage, pluginID, exception);
            String pluginID2 = getPluginID(textMessage, pluginID, exception);

            IStatus status;
            if ((exception == null) || (exception instanceof RuntimeException)) {
                status = new Status(IStatus.ERROR, pluginID2, IStatus.ERROR, message, exception);
            } else {
                try {
                    status =
                            new Status(IStatus.ERROR, pluginID2, IStatus.ERROR, message,
                                    exception.getCause());
                } catch (Exception e) {
                    status =
                            new Status(IStatus.ERROR, pluginID2, IStatus.ERROR, message, exception);
                }
            }

            StatusAdapter statusAdapter = new StatusAdapter(status);
            statusAdapter.setProperty(IStatusAdapterConstants.TIMESTAMP_PROPERTY,
                    System.currentTimeMillis());

            // use status manager (log and show)
            // BLOCK = modal window, force the user to act!
            // use status manager (log and (optionally) show)
            if (!silent) {
                // Display.getDefault().asyncExec(new Runnable() {
                // public void run() {
                StatusManager.getManager().handle(statusAdapter,
                        StatusManager.BLOCK | StatusManager.LOG | StatusManager.SHOW);
                // }
                // });
            } else {
                StatusManager.getManager().handle(statusAdapter, StatusManager.LOG);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is force no error output.
     * 
     * @return true, if is force no error output
     */
    public boolean isForceNoErrorOutput() {
        return forceNoErrorOutput;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the force no error output.
     * 
     * @param forceNoErrorOutput
     *            the new force no error output
     */
    public void setForceNoErrorOutput(final boolean forceNoErrorOutput) {
        this.forceNoErrorOutput = forceNoErrorOutput;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    
}
