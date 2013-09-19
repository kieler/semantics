package de.cau.cs.kieler.uml2.sim;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Uml2SimPlugin extends AbstractUIPlugin {

    /** path to the icon for kiem automated. */
    private static final String ICON_PATH = "icons/kiemSelection.png";

    // The plug-in ID
    public static final String PLUGIN_ID = "de.cau.cs.kieler.uml2.sim.maude"; //$NON-NLS-1$

    // The shared instance
    private static Uml2SimPlugin plugin;

    // The current shell
    private static Shell currentShell = null;

    /**
     * Getter for the main shell of the active workbench.
     * 
     * @return the active shell
     */
    public Shell getShell() {
        if (currentShell == null) {
            Display.getCurrent().asyncExec(new Runnable() {
                public void run() {
                    currentShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
                }
            });
        }
        while (currentShell == null) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // do not sleep
            }
        }
        return currentShell;
    }

    /**
     * The constructor
     */
    public Uml2SimPlugin() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static Uml2SimPlugin getDefault() {
        return plugin;
    }

    /**
     * Getter for the icon descriptor for this plug-in.
     * 
     * @return the image
     */
    public static ImageDescriptor getImageDescriptor() {
        // ImageDescriptor id2 = imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
        // "icons/stepIcon.png");
        ImageDescriptor id2 = imageDescriptorFromPlugin(PLUGIN_ID, ICON_PATH);
        return id2;
    }

}
