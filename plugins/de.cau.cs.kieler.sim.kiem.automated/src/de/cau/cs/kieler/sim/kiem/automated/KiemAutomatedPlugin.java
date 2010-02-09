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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.internal.statushandlers.StatusHandlerDescriptor;
import org.eclipse.ui.internal.statushandlers.StatusHandlerRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.statushandlers.AbstractStatusHandler;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.core.ui.errorhandler.GenericErrorHandler;
import de.cau.cs.kieler.core.ui.errorhandler.GenericErrorHandler.StatusListener;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.automated.views.AutomatedEvalView;
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

    /** path to the icon for active schedules and default editor. */
    private static final String TRUE_IMAGE_PATH = "icons/happy.jpeg";
    /** path to the icon for locked schedules and editors. */
    private static final String FALSE_IMAGE_PATH = "icons/sad.jpeg";
    /** The plug-in id. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.kiem.automated";

    /** the id of the view for displaying results. */
    public static final String VIEW_ID = "de.cau.cs.kieler.sim.kiem"
            + ".automated.aebView";

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
     * Getter for the currently active page.
     * 
     * @return the currently active page.
     */
    public static IWorkbenchPage getActivePage() {
        return getDefault().getWorkbench().getActiveWorkbenchWindow()
                .getActivePage();
    }

    /**
     * Getter for the AutomatedEvalView.
     * 
     * @return the view
     */
    public static AutomatedEvalView getAutomatedEvalView() {
        AutomatedEvalView result = null;

        try {

            result = (AutomatedEvalView) getDefault().getWorkbench()
                    .getActiveWorkbenchWindow().getActivePage().showView(
                            VIEW_ID, VIEW_ID, IWorkbenchPage.VIEW_CREATE);

        } catch (PartInitException e0) {
            e0.printStackTrace();
        } catch (NullPointerException e0) {
            // the view is not open
            e0.printStackTrace();
        }

        return result;
    }

    /**
     * Getter for the display of the active workbench.
     * 
     * @return the display
     */
    public static Display getDisplay() {
        return getDefault().getWorkbench().getDisplay();
    }

    /**
     * Getter for the execution inside the KIEM.
     * 
     * @return the execution or null
     */
    public static Execution getKiemExecution() {
        return KiemPlugin.getDefault().getExecution();
    }

    /**
     * Getter for the main shell of the active workbench.
     * 
     * @return the active shell
     */
    public static Shell getShell() {
        return getDefault().getWorkbench().getActiveWorkbenchWindow()
                .getShell();
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the image for the image for displaying a true state.
     * 
     * @return the image
     */
    public static Image getTrueImage() {
        return imageDescriptorFromPlugin(KiemAutomatedPlugin.PLUGIN_ID,
                TRUE_IMAGE_PATH).createImage();
    }

    /**
     * Getter for the image for the image for displaying a false state.
     * 
     * @return the image
     */
    public static Image getFalseImage() {
        return imageDescriptorFromPlugin(KiemAutomatedPlugin.PLUGIN_ID,
                FALSE_IMAGE_PATH).createImage();
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
        IEclipsePreferences pref = new InstanceScope()
                .getNode(KiemConfigurationPlugin.PLUGIN_ID);

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
        IEclipsePreferences pref = new InstanceScope()
                .getNode(KiemConfigurationPlugin.PLUGIN_ID);

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
        IEclipsePreferences pref = new InstanceScope()
                .getNode(KiemConfigurationPlugin.PLUGIN_ID);

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

}
