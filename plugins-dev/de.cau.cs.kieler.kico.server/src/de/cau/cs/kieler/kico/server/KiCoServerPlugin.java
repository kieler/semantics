/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.server;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.service.prefs.BackingStoreException;

import com.google.inject.Guice;

import de.cau.cs.kieler.core.model.PluginLog;

/**
 * The KiCoPlugin is the non-UI part of offering a TCP based  interface for KiCo compilation.
 * The TCP Message must conform to the protocol: 1. line are the comma separated transformation IDs
 * 2. line is the maximum line number of the following model 3.-n. is the model itself. The return
 * message will be the compiled model 1. line is the maximum line number of the following model
 * 2.-n. is the model itself.
 *
 * The activator class controls the plug-in life cycle.
 *
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 */
public class KiCoServerPlugin extends PluginLog {

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.kico.server"; //$NON-NLS-1$

    /** The shared instance. */
    private static KiCoServerPlugin plugin;

    /** The single server. */
    private static KiCoServer server;

    // -------------------------------------------------------------------------

    /**
     * The constructor
     */
    public KiCoServerPlugin() {
    }

    // -------------------------------------------------------------------------

    /**
     * Returns the shared instance.
     *
     * @return the shared instance
     */
    public static KiCoServerPlugin getInstance() {
        return plugin;
    }

    // -------------------------------------------------------------------------

    /**
     * Load the saved port number for the TCP server.
     *
     * @return the int
     */
    public static int loadPort() {
        IEclipsePreferences prefs = InstanceScope.INSTANCE.getNode(PLUGIN_ID);
        String returnString = prefs.get("port", "");
        try {
            return Integer.parseInt(returnString);
        } catch (Exception e) {
            return 5555;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Load enabled flag for the TCP server.
     *
     * @return true, if successful
     */
    public static boolean loadEnabled() {
        IEclipsePreferences prefs = InstanceScope.INSTANCE.getNode(PLUGIN_ID);
        return prefs.getBoolean("enabled", false);
    }

    // -------------------------------------------------------------------------

    /**
     * Save the port number for the TCP server.
     *
     * @param port the port
     */
    public static void savePort(int port) {
        IEclipsePreferences prefs = InstanceScope.INSTANCE.getNode(PLUGIN_ID);
        prefs.put("port", port + "");
        try {
            prefs.flush();
        } catch (BackingStoreException e) {
            e.printStackTrace();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Save enabled flag for the TCP server. This option will not turn on or off
     * the TCP server. Use startServer() and stopServer() for turning on or off
     * the TCP server.
     *
     * @param enabled the enabled
     */
    public static void saveEnabled(boolean enabled) {
        IEclipsePreferences prefs = InstanceScope.INSTANCE.getNode(PLUGIN_ID);
        prefs.putBoolean("enabled", enabled);
        try {
            prefs.flush();
        } catch (BackingStoreException e) {
            e.printStackTrace();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the single server for KiCoPlugin. There should always only be one
     * KiCoServer instance. Be sure to stop any existing KiCoServer before
     * setting up and starting a new one. This is an internal method.
     *
     * @param server the new server
     */
    private static void setServer(KiCoServer server) {
        KiCoServerPlugin.server = server;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the KiCoServer. This is an internal method.
     *
     * @return the server
     */
    private static KiCoServer getServer() {
        return KiCoServerPlugin.server;
    }

    // -------------------------------------------------------------------------

    /**
     * Start the single TCP server.
     */
    public static void startServer(boolean debug) {
        if (KiCoServerPlugin.getServer() == null) {
            KiCoServer newServer = Guice.createInjector().getInstance(KiCoServer.class);
            newServer.setDebug(debug);
            KiCoServerPlugin.setServer(newServer);
            KiCoServerPlugin.getServer().schedule();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Stop the single TCP server.
     */
    public static void stopServer() {
        if (KiCoServerPlugin.getServer() != null) {
            KiCoServerPlugin.getServer().abort();
        }
        KiCoServerPlugin.setServer(null);
    }

    // -------------------------------------------------------------------------

}
