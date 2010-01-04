package de.cau.cs.kieler.krep.evalbench.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.krep.evalbench.comm.CommonLayer;
import de.cau.cs.kieler.krep.evalbench.ui.views.AssemblerView;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

    /** The viewer to show the current program. */
    private AssemblerView viewer = null;

    // The plug-in ID
    public static final String PLUGIN_ID = "de.cau.cs.kieler.krep.evalbench.ui";

    // The shared instance
    private static Activator plugin;

    /**
     * The constructor
     */
    public Activator() {
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
    public static Activator getDefault() {
        return plugin;
    }

    /**
     * @return Viewer to display the current assembler.
     */
    public AssemblerView getViewer() {
        return viewer;
    }

    /**
     * @param v
     *            Assemblerview to display the current assembler. Only one assembler is shown at a
     *            time, as only one assembler can be currently on the processor.
     */
    public void setViewer(final AssemblerView v) {
        this.viewer = v;
    }

    /**
     * @return
     */
    public CommonLayer getCommonLayer() {
        // TODO Auto-generated method stub
        return de.cau.cs.kieler.krep.evalbench.Activator.getDefault().getCommonLayer();
    }

}
