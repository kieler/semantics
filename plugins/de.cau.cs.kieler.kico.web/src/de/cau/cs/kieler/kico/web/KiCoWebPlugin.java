package de.cau.cs.kieler.kico.web;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.prefs.Preferences;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.service.prefs.BackingStoreException;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 */
public class KiCoWebPlugin extends AbstractUIPlugin {

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.kico.web"; //$NON-NLS-1$

    /** The shared instance. */
    private static KiCoWebPlugin plugin;
    
    private static KiCoWebServer webServer;
    

    // -------------------------------------------------------------------------

    /**
     * The constructor
     */
    public KiCoWebPlugin() {
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
    public static KiCoWebPlugin getInstance() {
        return plugin;
    }

    // -------------------------------------------------------------------------
    
    public static int loadPort() {
        IEclipsePreferences prefs = InstanceScope.INSTANCE.getNode(PLUGIN_ID);
        String returnString = prefs.get("port", "");
        try {
            return Integer.parseInt(returnString);
        } catch(Exception e) {
            return 5555;
        }
    }
    
    // -------------------------------------------------------------------------
    
    public static boolean loadEnabled() {
        IEclipsePreferences prefs = InstanceScope.INSTANCE.getNode(PLUGIN_ID);
        return prefs.getBoolean("enabled", false);
    }

    // -------------------------------------------------------------------------
    
    public static void savePort(int port) {
        IEclipsePreferences prefs = InstanceScope.INSTANCE.getNode(PLUGIN_ID);
        prefs.put("port", port + "");
        try {
          prefs.flush();
        } catch(BackingStoreException e) {
          e.printStackTrace();
        }
    }

    // -------------------------------------------------------------------------
    
    public static void saveEnabled(boolean enabled) {
        IEclipsePreferences prefs = InstanceScope.INSTANCE.getNode(PLUGIN_ID);
        prefs.putBoolean("enabled", enabled);
        try {
          prefs.flush();
        } catch(BackingStoreException e) {
          e.printStackTrace();
        }
    }

    // -------------------------------------------------------------------------
    
    public static void setServer(KiCoWebServer webServer) {
        KiCoWebPlugin.webServer = webServer;
    }
    
    // -------------------------------------------------------------------------

    public static KiCoWebServer getServer() {
        return KiCoWebPlugin.webServer;
    }

    
    // -------------------------------------------------------------------------
}
