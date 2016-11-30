/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.core.model;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

import org.eclipse.core.runtime.Plugin;

import com.google.inject.Inject;

/**
 * This class extends the Plugin and adds a logger mechanism, that can be used by all
 * classes of a concrete plugin.
 * 
 * @author cmot
 *
 */
public class PluginLog extends Plugin {

    /**
     * Log an info.
     * 
     * @param msg
     *            the msg
     */
    public static void log(final String msg) {
        Log.log(msg);
    }
    
    /**
     * Log an info.
     * 
     * @param msg
     *            the msg
     */
    public static void log(final String msg, Level logLevel) {
        Log.log(msg, logLevel);
    }
    

    // -------------------------------------------------------------------------

    /**
     * Log an error.
     * 
     * @param msg
     *            the msg
     */
    public static void logError(final String msg) {
        Log.logError(msg);
    }
    
    /**
     * Log an error.
     * 
     * @param msg
     *            the msg
     */
    public static void logError(final String msg, Level logLevel) {
        Log.logError(msg, logLevel);
    }    

    // -------------------------------------------------------------------------

}
