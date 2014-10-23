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

import java.lang.reflect.Method;
import java.util.HashMap;

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

import de.cau.cs.kieler.core.util.Pair;

// TODO: Auto-generated Javadoc
/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author cmot ssm
 * @kieler.design 2014-03-11 proposed
 * @kieler.rating 2014-03-11 proposed yellow
 */
public class KiCoPlugin extends Plugin {

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.kico"; //$NON-NLS-1$

    /** The Constant EXTENSION_POINT_ID. */
    public static final String TRANSFORMATION_EXTENSION_POINT_ID = "de.cau.cs.kieler.kico.transformation";
    
    /** The Constant EXTENSION_EXTENSION_POINT_ID. */
    public static final String EXTENSION_EXTENSION_POINT_ID = "de.cau.cs.kieler.kico.extension";

    /** The Constant KICO_MSGDLG_TITLE. */
    public static final String KICO_MSGDLG_TITLE = "KIELER Compiler";

    /** The Constant DEBUG. */
    public static final boolean DEBUG = !System.getProperty("java.vm.info", "").contains("sharing");

    /** The shared instance. */
    private static KiCoPlugin plugin;
    
    /** The resource extension cached. */
    private static HashMap<String, ResourceExtension> resourceExtensionCached = null;

    /**
     * The parent shell iff a GUI is used. This shell may be used to prompt a save-dialog to save
     * execution files. UI's should listen to the KiemEvent CALL_FOR_SHELL and then call the method
     * setShell() of KiemPlugin.
     */
    private static Shell parentShell;

    /** The no error output. */
    private boolean forceNoErrorOutput = false;

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

    /**
     * Checks if is e object.
     * 
     * @param clazz
     *            the clazz
     * @return true, if is e object
     */
    private static boolean isEObject(Class<?> clazz) {
        if (EObject.class.isAssignableFrom(clazz)) {
            return true;
        }
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is isKielerCompilerContext.
     * 
     * @param clazz
     *            the clazz
     * @return true, if is e object
     */
    private static boolean isKielerCompilerContext(Class<?> clazz) {
        if (KielerCompilerContext.class.isAssignableFrom(clazz)) {
            return true;
        }
        return false;
    }

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

    /**
     * Gets the invokable method.
     * 
     * @param object
     *            the object
     * @param method
     *            the method
     * @return the invokable method
     */
    private Method getInvokableMethod(Object object, String method) {
        for (Method providedMethod : object.getClass().getMethods()) {
            String providedMethodName = providedMethod.getName();
            Class<?>[] parameterTypes = providedMethod.getParameterTypes();
            if (providedMethodName.equals(method)) {
                // Case where signature is 'method(EObject eObject)'
                if (parameterTypes.length == 1) {
                    Class<?> parameterType = parameterTypes[0];
                    if (isEObject(parameterType)) {
                        return providedMethod;
                    }
                }
                // Case where signature is 'method(EObject eObject, KielerCompilerContext
                // kielerCompilerContext)'
                if (parameterTypes.length == 2) {
                    Class<?> parameterType1 = parameterTypes[0];
                    Class<?> parameterType2 = parameterTypes[1];
                    if (isEObject(parameterType1) && isKielerCompilerContext(parameterType2)) {
                        return providedMethod;
                    }
                }
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * This returns a new the TransformationMap with all registered and loaded plug-ins that extend
     * the KiCo extension point.
     *
     * @return the TransformationList
     */
    public HashMap<String, Transformation> getRegisteredTransformations() {
        // if (transformationMap != null && !forceUpdate) {
        // // return a cached version of the list
        // // it is only built the first time
        // return transformationMap;
        // }
        // // suggest calling the garbage collector: this may
        // // remove any DataComponent threads still running (but not
        // // linked==needed any more)
        // System.gc();
        // get the available interfaces and initialize them
        IConfigurationElement[] transformations =
                Platform.getExtensionRegistry().getConfigurationElementsFor(TRANSFORMATION_EXTENSION_POINT_ID);

        HashMap<String, Transformation> transformationMap =
                new HashMap<String, Transformation>(transformations.length);

        for (int i = 0; i < transformations.length; i++) {
            try {

                String transformationClass = transformations[i].getAttribute("class");
                Object transformationInstance = null;
                if (transformationClass != null) {
                    transformationInstance = transformations[i].createExecutableExtension("class");
                }
                String id = transformations[i].getAttribute("id");
                String name = transformations[i].getAttribute("name");
                String method = transformations[i].getAttribute("method");
                String dependenciesString = transformations[i].getAttribute("dependencies");
                String transformationsString = transformations[i].getAttribute("transformations");
                String alternativesString = transformations[i].getAttribute("alternatives");

                if (DEBUG) {
                    // System.out.println("KiCo loading component: "
                    // + transformations[i].getContributor().getName() + "::" + id);
                }

                Transformation transformation;
                if (transformationInstance == null) {
                    // The Transformation is defined as a GROUP by its dependencies
                    transformation = new TransformationGroup();

                    // Internally transformations of groups are represented as dependencies!
                    if (transformationsString != null) {
                        String[] dependenciesArray = transformationsString.split(",");
                        for (String dependency : dependenciesArray) {
                            transformation.getDependencies().add(dependency.trim());
                        }
                    }

                    if (alternativesString != null) {
                        if (alternativesString.equals("true")) {
                            ((TransformationGroup) transformation).setAlternatives(true);
                        }
                    }

                } else if (transformationInstance instanceof Transformation
                        && (method == null || method.trim().length() == 0)) {
                    // The specified class is a Transformation, use it directly
                    transformation =
                            (Transformation) transformations[i].createExecutableExtension("class");
                    // Handle the case that wee need Google Guice for instantiation
                    transformation.setTransformationInstance(getGuiceInstance(transformation));
                } else {
                    // The specified class is not a Transformation, use a new Transformation
                    // instance as a wrapper
                    transformation = new TransformationWrapper();
                    // Handle the case that wee need Google Guice for instantiation
                    transformation
                            .setTransformationInstance(getGuiceInstance(transformationInstance));
                    // Find the correct method and save it in the wrapper for later reflection calls
                    Method transformationMethod =
                            getInvokableMethod(transformationInstance, method);
                    transformation.setTransformationMethod(transformationMethod);
                }

                transformation.setConfigurationElemenet(transformations[i]);

                if (id != null) {
                    transformation.setId(id);
                    // Check if ID is already taken
                    if (transformationMap.containsKey(id)) {
                        showWarning("Extension '" + id + "' from component: "
                                + transformations[i].getContributor().getName()
                                + " cannot be loaded because this ID is already taken.",
                                KiCoPlugin.PLUGIN_ID, null, true);
                    } else {
                        transformationMap.put(id, transformation);
                    }
                } else {
                    showWarning("Extension id not configured for component: "
                            + transformations[i].getContributor().getName(), KiCoPlugin.PLUGIN_ID,
                            null, true);
                }

                if (name != null) {
                    transformation.setName(name);
                }

                if (method != null) {
                    transformation.setMethod(method);
                }

                if (dependenciesString != null) {
                    String[] dependenciesArray = dependenciesString.split(",");
                    for (String dependency : dependenciesArray) {
                        transformation.getDependencies().add(dependency.trim());
                    }
                }

            } catch (Exception e) {
                this.showWarning(transformations[i].getContributor().getName()
                        + " could not be loaded.", null, e, true);
            }
        }
        return transformationMap;
    }

    // -------------------------------------------------------------------------


    /**
     * Gets the registered resource extensions.
     *
     * @param forceReload the force reload
     * @return the registered resource extensions
     */
    public HashMap<String, ResourceExtension> getRegisteredResourceExtensions(boolean forceReload) {
        
        if (resourceExtensionCached != null && !forceReload) {
            return resourceExtensionCached;
        }
        
        IConfigurationElement[] resourceExtensions =
                Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_EXTENSION_POINT_ID);

        resourceExtensionCached = new HashMap<String, ResourceExtension>();

        for (int i = 0; i < resourceExtensions.length; i++) {
            try {

                String className = resourceExtensions[i].getAttribute("className");
                String extension = resourceExtensions[i].getAttribute("extensionName");
                String isXMI = resourceExtensions[i].getAttribute("isXMI");
                String editorID = resourceExtensions[i].getAttribute("editor_id");
                resourceExtensionCached.put(className, new ResourceExtension(className, extension, isXMI.toLowerCase().equals("true"), editorID));

                if (DEBUG) {
                     System.out.println("KiCo register resource extension: "
                       + extension + " for class " + className);
                }
            } 
            finally {
            
            }
        }

        return resourceExtensionCached;
    }
    
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
        HashMap<String, ResourceExtension> resourceExtensionMap =
                KiCoPlugin.getInstance().getRegisteredResourceExtensions(false);
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

    /**
     * Gets the last error.
     *
     * @return the last error
     * @deprecated Use the method getAllErrors()  of the compilation result, this method will only return null.
     */
    public static String getLastError() {
        // TODO:
        return "";// lastError;
    }

    // -------------------------------------------------------------------------

    /**
     * Resets the last error.
     * 
     * @deprecated Use the method getAllErrors()  of the compilation result, this method will do nothing.
     * 
     */
    public static void resetLastError() {
        // TODO:
        // KiCoPlugin.lastError = null;
    }

    // -------------------------------------------------------------------------

}
