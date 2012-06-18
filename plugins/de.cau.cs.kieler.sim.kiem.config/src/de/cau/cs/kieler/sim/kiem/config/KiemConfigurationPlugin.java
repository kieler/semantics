/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kiem.config;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.internal.statushandlers.StatusHandlerDescriptor;
import org.eclipse.ui.internal.statushandlers.StatusHandlerRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.statushandlers.AbstractStatusHandler;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.core.ui.errorhandler.GenericErrorHandler;
import de.cau.cs.kieler.core.ui.errorhandler.GenericErrorHandler.StatusListener;
import de.cau.cs.kieler.sim.kiem.config.managers.AbstractManager;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author soh, cmot
 * @kieler.rating 2010-01-27 proposed yellow
 * 
 */
@SuppressWarnings("restriction")
public class KiemConfigurationPlugin extends AbstractUIPlugin {

    /** path to the icon for active schedules and default editor. */
    private static final String ACTIVE_IMAGE_PATH = "icons/active.gif";
    /** path to the icon for locked schedules and editors. */
    private static final String LOCKED_IMAGE_PATH = "icons/locked.gif";
    /** The plugin id. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.kiem.config";

    /** The shared instance. */
    private static KiemConfigurationPlugin plugin;

    // --------------------------------------------------------------------------

    /**
     * The constructor.
     */
    public KiemConfigurationPlugin() {

    }

    // --------------------------------------------------------------------------

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static KiemConfigurationPlugin getDefault() {
        return plugin;
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the image for active schedules and default editors.
     * 
     * @return the image
     */
    public static Image getActiveImage() {
        return imageDescriptorFromPlugin(KiemConfigurationPlugin.PLUGIN_ID,
                ACTIVE_IMAGE_PATH).createImage();
    }

    /**
     * Getter for the image for the locked schedules and editors.
     * 
     * @return the image
     */
    public static Image getLockedImage() {
        return imageDescriptorFromPlugin(KiemConfigurationPlugin.PLUGIN_ID,
                LOCKED_IMAGE_PATH).createImage();
    }

    // --------------------------------------------------------------------------

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
     * {@inheritDoc}
     */
    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void stop(final BundleContext context) throws Exception {
        AbstractManager.saveAll();
        plugin = null;
        super.stop(context);
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
