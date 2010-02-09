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

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
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
     * Get the currently active editor.
     * 
     * @return the currently active editor, or null
     */
    public IEditorSite getActiveEditor() {
        IEditorSite editorSite = null;

        IWorkbench workbench = getDefault().getWorkbench();
        if (workbench != null) {
            IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
            if (window != null) {
                IWorkbenchPage page = window.getActivePage();
                if (page != null) {
                    IEditorPart editor = page.getActiveEditor();
                    if (editor != null) {
                        editorSite = editor.getEditorSite();
                    }
                }
            }
        }

        return editorSite;
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
        plugin = null;
        super.stop(context);
    }

    // --------------------------------------------------------------------------

}
