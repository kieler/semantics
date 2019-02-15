package de.cau.cs.kieler.esterel.compiler;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class EsterelCompilerActivator implements BundleActivator {

    // The plug-in ID
    public static final String PLUGIN_ID = "org.esterel.compiler"; //$NON-NLS-1$

    // The shared instance
    private static EsterelCompilerActivator plugin;
    
    /**
     * The constructor
     */
    public EsterelCompilerActivator() {
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static EsterelCompilerActivator getDefault() {
        return plugin;
    }
    
    public static Path getBundlePath() throws IOException, URISyntaxException {
        Bundle bundle = Platform.getBundle(EsterelCompilerActivator.PLUGIN_ID);
        return Paths.get(FileLocator.resolve(bundle.getEntry(".")).toURI()).normalize();
    }

}
