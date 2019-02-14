package de.cau.cs.kieler.lustre.compiler;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class LustreCompilerActivator implements BundleActivator {

    // The plug-in ID
    public static final String PLUGIN_ID = "de.cau.cs.kieler.lustre.compiler"; //$NON-NLS-1$

    // The shared instance
    private static LustreCompilerActivator plugin;
    
    /**
     * The constructor
     */
    public LustreCompilerActivator() {
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
//        super.start(context);
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
//        super.stop(context);
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static LustreCompilerActivator getDefault() {
        return plugin;
    }
    
    public static Path getBundlePath() throws IOException, URISyntaxException {
        Bundle bundle = Platform.getBundle(LustreCompilerActivator.PLUGIN_ID);
        return Paths.get(FileLocator.resolve(bundle.getEntry(".")).toURI()).normalize();
    }

}
