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
package de.cau.cs.kieler.sim.kiem.automated.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.sim.kiem.automated.ui.views.AutomatedEvalView;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author soh
 * @kieler.rating 2010-04-12 proposed yellow
 */
public class KiemAutoUIPlugin extends AbstractUIPlugin {

    /** path to the icon for kiem automated. */
    private static final String AUTO_IMAGE_PATH = "icons/kiemAutomated.png";
    /** path to the icon showing a green dot. */
    private static final String TRUE_IMAGE_PATH = "icons/true.gif";
    /** path to the icon showing a red dot. */
    private static final String FALSE_IMAGE_PATH = "icons/false.gif";
    /** path to the icon for created iterations. */
    private static final String CREATED_IMAGE_PATH = "icons/created.gif";
    /** path to the icon for running iterations. */
    private static final String RUNNING_IMAGE_PATH = "icons/running.gif";
    /** path to the icon for warnings. */
    private static final String WARNING_IMAGE_PATH = "icons/warning.gif";

    /** the id of the view for displaying results. */
    public static final String VIEW_ID = AutomatedEvalView.VIEW_ID;

    /** The plug-in ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.kiem.automated.ui";

    /** the shared instance. */
    private static KiemAutoUIPlugin plugin;

    /**
     * The constructor.
     */
    public KiemAutoUIPlugin() {
    }

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

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static KiemAutoUIPlugin getDefault() {
        return plugin;
    }

    /**
     * Getter for the currently active page.
     * 
     * @return the currently active page.
     */
    public static IWorkbenchPage getActivePage() {
        IWorkbench bench = PlatformUI.getWorkbench();
        if (bench != null) {
            IWorkbenchWindow window = bench.getActiveWorkbenchWindow();
            if (window != null) {
                return window.getActivePage();
            }
        }
        return null;
    }

    /**
     * Getter for the AutomatedEvalView.
     * 
     * @return the view
     */
    public static AutomatedEvalView getAutomatedEvalView() {
        AutomatedEvalView result = null;
        IWorkbenchPage page = getActivePage();
        if (page != null) {
            try {
                result = (AutomatedEvalView) page.showView(VIEW_ID, VIEW_ID,
                        IWorkbenchPage.VIEW_CREATE);
            } catch (PartInitException e0) {
                e0.printStackTrace();
            } catch (NullPointerException e0) {
                // the view is not open
                e0.printStackTrace();
            }
        }

        return result;
    }

    /**
     * Getter for the display of the active workbench.
     * 
     * @return the display
     */
    public static Display getDisplay() {
        return PlatformUI.getWorkbench().getDisplay();
    }

    /**
     * Getter for the main shell of the active workbench.
     * 
     * @return the active shell
     */
    public static Shell getShell() {
        return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the imageDescriptor for this plug-in.
     * 
     * @return the image
     */
    public static ImageDescriptor getAutoImageDescriptor() {
        return imageDescriptorFromPlugin(PLUGIN_ID, AUTO_IMAGE_PATH);
    }

    /**
     * Getter for the image for this plug-in.
     * 
     * @return the image
     */
    public static Image getAutoImage() {
        return getAutoImageDescriptor().createImage();
    }

    /**
     * Getter for the image for displaying a true state.
     * 
     * @return the image
     */
    public static Image getTrueImage() {
        return imageDescriptorFromPlugin(PLUGIN_ID, TRUE_IMAGE_PATH)
                .createImage();
    }

    /**
     * Getter for the image for displaying a false state.
     * 
     * @return the image
     */
    public static Image getFalseImage() {
        return imageDescriptorFromPlugin(PLUGIN_ID, FALSE_IMAGE_PATH)
                .createImage();
    }

    /**
     * Getter for the image for created iterations.
     * 
     * @return the image
     */
    public static Image getCreatedImage() {
        return imageDescriptorFromPlugin(PLUGIN_ID, CREATED_IMAGE_PATH)
                .createImage();
    }

    /**
     * Getter for the image for running iterations.
     * 
     * @return the image
     */
    public static Image getRunningImage() {
        return imageDescriptorFromPlugin(PLUGIN_ID, RUNNING_IMAGE_PATH)
                .createImage();
    }

    /**
     * Getter for the image for warnings.
     * 
     * @return the image
     */
    public static Image getWarningImage() {
        return imageDescriptorFromPlugin(PLUGIN_ID, WARNING_IMAGE_PATH)
                .createImage();
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

}
