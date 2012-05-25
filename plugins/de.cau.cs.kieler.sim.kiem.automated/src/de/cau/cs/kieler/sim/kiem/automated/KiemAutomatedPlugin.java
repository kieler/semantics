/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kiem.automated;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.ui.internal.statushandlers.StatusHandlerDescriptor;
import org.eclipse.ui.internal.statushandlers.StatusHandlerRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.statushandlers.AbstractStatusHandler;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.core.ui.errorhandler.GenericErrorHandler;
import de.cau.cs.kieler.core.ui.errorhandler.GenericErrorHandler.StatusListener;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.config.KiemConfigurationPlugin;
import de.cau.cs.kieler.sim.kiem.execution.Execution;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author soh
 * @kieler.rating 2010-01-29 proposed yellow
 */
@SuppressWarnings("restriction")
public class KiemAutomatedPlugin extends AbstractUIPlugin {

    /** The plug-in id. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.kiem.automated";

    /** the id of the view for displaying results. */
    public static final String VIEW_ID = "de.cau.cs.kieler.sim.kiem" + ".automated.aebView";

    /** the timeout for the automation. */
    public static final String AUTO_TIMEOUT_ID = "AUTO_TIMEOUT";
    /** the default value for the automation timeout. */
    public static final int AUTO_TIMEOUT_DEFAULT = 600000;

    /** The shared instance. */
    private static KiemAutomatedPlugin plugin;

    // --------------------------------------------------------------------------

    /**
     * The constructor.
     */
    public KiemAutomatedPlugin() {

    }

    // --------------------------------------------------------------------------

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance.
     */
    public static KiemAutomatedPlugin getDefault() {
        return plugin;
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Getter for the execution inside the KIEM.
     * 
     * @return the execution or null
     */
    public static Execution getKiemExecution() {
        return KiemPlugin.getDefault().getExecution();
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Load a value from the Eclipse Preference Store.
     * 
     * @param key
     *            the key of the value to load
     * @param defaultValue
     *            the default value for the property
     * @return the value loaded value if any
     */
    public String load(final String key, final String defaultValue) {
        IEclipsePreferences pref = new InstanceScope().getNode(KiemConfigurationPlugin.PLUGIN_ID);

        String result = pref.get(key, defaultValue);

        return result;
    }

    /**
     * Remove everything saved under this node.
     * 
     * @param key
     *            the key to remove
     */
    public void remove(final String key) {
        IEclipsePreferences pref = new InstanceScope().getNode(KiemConfigurationPlugin.PLUGIN_ID);

        pref.remove(key);
    }

    /**
     * Save a key,value pair to the Eclipse Preference Store.
     * 
     * @param key
     *            the key under which to save
     * @param value
     *            the value to save
     */
    public void save(final String key, final String value) {
        IEclipsePreferences pref = new InstanceScope().getNode(KiemConfigurationPlugin.PLUGIN_ID);

        if (value != null) {
            pref.put(key, value);
        } else {
            pref.remove(key);
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Getter for KIELERs generic error handler.
     * 
     * @return the error handler or null
     */
    public static GenericErrorHandler getErrorHandler() {
        try {
            StatusHandlerDescriptor desc = StatusHandlerRegistry.getDefault()
                    .getDefaultHandlerDescriptor();
            if (desc != null) {
                AbstractStatusHandler handler = desc.getStatusHandler();
                if (handler instanceof GenericErrorHandler) {
                    return (GenericErrorHandler) handler;
                }
            }
        } catch (CoreException e0) {
            e0.printStackTrace();
        }
        return null;
    }

    /**
     * Add a new listener to the generic error handler.
     * 
     * @param listener
     *            the new listener
     */
    public static void addErrorListener(final StatusListener listener) {
        GenericErrorHandler handler = getErrorHandler();
        if (handler != null) {
            handler.addListener(listener);
        }
    }

    /**
     * Remove a listener from the generic error handler.
     * 
     * @param listener
     *            the new listener
     */
    public static void removeErrorListener(final StatusListener listener) {
        GenericErrorHandler handler = getErrorHandler();
        if (handler != null) {
            handler.removeListener(listener);
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Get the list of listeners on the extension point.
     * 
     * @return the list of listeners
     */
    public static List<IAutomationListener> getListeners() {
        List<IAutomationListener> result = new LinkedList<IAutomationListener>();

        IConfigurationElement[] contributors = Platform.getExtensionRegistry()
                .getConfigurationElementsFor(
                        "de.cau.cs.kieler.sim.kiem.automated.AutomationListener");

        for (IConfigurationElement element : contributors) {

            if (element.isValid()) {
                try {
                    Object obj = element.createExecutableExtension("class");
                    if (obj != null && obj instanceof IAutomationListener) {
                        result.add((IAutomationListener) obj);
                    }
                } catch (CoreException e0) {
                    e0.printStackTrace();
                }
            }
        }
        return result;
    }
}
