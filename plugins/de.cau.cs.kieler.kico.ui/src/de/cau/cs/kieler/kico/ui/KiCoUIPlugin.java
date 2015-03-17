package de.cau.cs.kieler.kico.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.statushandlers.IStatusAdapterConstants;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.core.model.util.XtextModelingUtil;
import de.cau.cs.kieler.kico.Feature;
import de.cau.cs.kieler.kico.KiCoPlugin;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.Transformation;
import de.cau.cs.kieler.kico.ui.CompileChains.CompileChain;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author cmot
 * @kieler.design 2014-04-08 proposed
 * @kieler.rating 2014-04-08 proposed yellow
 */
public class KiCoUIPlugin extends AbstractUIPlugin {

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.kico.ui"; //$NON-NLS-1$

    /** The Constant EXTENSION_POINT_ID. */
    public static final String EXTENSION_POINT_ID = "de.cau.cs.kieler.kico.ui.transformation";

    /** The shared instance. */
    private static KiCoUIPlugin plugin;

    // -------------------------------------------------------------------------

    /**
     * The constructor
     */
    public KiCoUIPlugin() {
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // -------------------------------------------------------------------------

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static KiCoUIPlugin getInstance() {
        return plugin;
    }

    // -------------------------------------------------------------------------

    /**
     * This returns a hash map of registered editors with a list of transformation IDs that should
     * be visualized by KiCo.UI View if such an editor is active.
     * 
     * @return the returnHashMap
     */
    public HashMap<String, CompileChains> getRegisteredEditors() {
        IConfigurationElement[] editors =
                Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID);

        HashMap<String, CompileChains> returnHashMap =
                new HashMap<String, CompileChains>(editors.length);

        for (int i = 0; i < editors.length; i++) {
            try {

                String editorID = editors[i].getAttribute("editor").trim();
                String label = "No label defined";
                try {
                    label = editors[i].getAttribute("label").trim();
                } catch (Exception e) {
                    //ignore
                }
                String priority = "0";
                try {
                    priority = editors[i].getAttribute("priority").trim();
                } catch (Exception e) {
                    //ignore
                }
                String transformationIDs = editors[i].getAttribute("transformations");
                
                ArrayList<String> features = new ArrayList<String>();
                // The special case where we want to add ALL registered transformations 
                if (transformationIDs.equals("ALL")) {
                   for (Feature feature :  KielerCompiler.getFeatures()) {
                       features.add(feature.getId());
                   }
                } else {
                    String[] transformationIDsArray = transformationIDs.split(",");
                    for (String transformationID : transformationIDsArray) {
                        features.add(transformationID.trim());
                    }
                }


                // The case for ANY editor
                if (editorID == null || editorID.equals("*") || editorID.equals("")) {
                    editorID = "*";
                }
                
                
                CompileChains compileChains = returnHashMap.get(editorID);
                if (compileChains == null) {
                    compileChains = new CompileChains(editorID);
                    returnHashMap.put(editorID, compileChains);
                }
                CompileChain item = new CompileChain();
                item.setPriority(priority);
                item.label = label;
                item.transformations = features;
                compileChains.insertItem(item);

                
            } catch (Exception e) {
                this.showWarning(editors[i].getContributor().getName() + " could not be loaded.",
                        null, e, true);
            }
        }
        return returnHashMap;
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

        if (textMessage != null) {
            message = textMessage + message;
            // exception = null;
        } else if (exception != null) {
            message = exception.getMessage() + message;
            // exception = null;
        }

        // do not post the same message twice
        if ((exception != null) && (textMessage != null)
                && (exception.getMessage().startsWith(textMessage))) {
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
     * Gets the currently active model.
     *
     * @return the active model
     */
    public static EObject getActiveModel() {
        // The following is WRONG! We don't want a (possibly) compiled model here but the plain model from the editor!
//        final IPath modelViewPath = new Path("de.cau.cs.kieler.kico.klighd.view");
//        // TODO: There should be a better mechanism to get the currently active model!
//        EObject model = KiemPlugin.getOpenedModelRootObjects().get(modelViewPath);
        XtextEditor xtextEditor = EditorUtils.getActiveXtextEditor();
        EObject model = XtextModelingUtil.getModelFromXtextEditor(xtextEditor, true);
        return model;
    }                                                     
    
    // -------------------------------------------------------------------------
    
}
