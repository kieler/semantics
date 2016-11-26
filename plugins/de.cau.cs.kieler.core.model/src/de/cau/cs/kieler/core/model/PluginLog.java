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

    public static final boolean DEBUG = java.lang.management.ManagementFactory.getRuntimeMXBean()
            .getInputArguments().toString().contains("-agentlib:jdwp");
    
    private static Level activeLogLevel = java.lang.management.ManagementFactory.getRuntimeMXBean()
            .getInputArguments().toString().contains("-verboseLog") ? Level.FINE : Level.INFO;

    /** The logger. */
    @Inject
    private static Logger logger;

    /** The logger started flag. */
    private static boolean loggerStarted = false;

    // -------------------------------------------------------------------------

    /**
     * Start the logger logger.
     */
    private static void startLogger(final boolean enforce) {
        if ((!loggerStarted && DEBUG) || enforce) {
            loggerStarted = true;
            SimpleFormatter formatter = new SimpleFormatter();
            StreamHandler handler = new StreamHandler(System.out, formatter);
            handler.setLevel(activeLogLevel); 
            
            if (logger == null) {
                logger = Logger.getGlobal();
            }
            
            logger.addHandler(handler);
            logger.setUseParentHandlers(false);
        }
    }

    // -------------------------------------------------------------------------
    
    private static void flushAll() {
        for(Handler handler : logger.getHandlers()) {
            handler.flush();
        }
    }

    /**
     * Log an info.
     * 
     * @param msg
     *            the msg
     */
    public static void log(final String msg) {
        // start the logger if not yet started
        startLogger(false);
        
        StackTraceElement[] elems = Thread.currentThread().getStackTrace();
        
        String className = "";
        if(elems != null && elems.length > 1) {
            String smallName = elems[2].getClassName();
            int i = smallName.lastIndexOf(".");
            if (i > -1) {
                if (smallName.length() > i + 1) {
                    smallName = smallName.substring(i+1);
                }
            }
            className = smallName + ": ";
        }

        if (logger != null) {
            logger.info(className + msg);
            flushAll();
        }
    }
    
    /**
     * Log an info.
     * 
     * @param msg
     *            the msg
     */
    public static void log(final String msg, Level logLevel) {
        if (activeLogLevel.intValue() < logLevel.intValue()) {
            return;
        }
        
        // start the logger if not yet started
        startLogger(false);
        
        StackTraceElement[] elems = Thread.currentThread().getStackTrace();
        
        String className = "";
        if(elems != null && elems.length > 1) {
            String smallName = elems[2].getClassName();
            int i = smallName.lastIndexOf(".");
            if (i > -1) {
                if (smallName.length() > i + 1) {
                    smallName = smallName.substring(i+1);
                }
            }
            className = smallName + ": ";
        }

        if (logger != null) {
            logger.info(className + msg);
            flushAll();
        }
    }
    

    // -------------------------------------------------------------------------

    /**
     * Log an error.
     * 
     * @param msg
     *            the msg
     */
    public static void logError(final String msg) {

        StackTraceElement[] elems = Thread.currentThread().getStackTrace();
        String className = elems[0].getClassName();

        if (logger != null) {
            logger.severe(className + ": " + msg);
            flushAll();
        }
    }
    
    /**
     * Log an error.
     * 
     * @param msg
     *            the msg
     */
    public static void logError(final String msg, Level logLevel) {
        if (activeLogLevel.intValue() < logLevel.intValue()) {
            return;
        }

        StackTraceElement[] elems = Thread.currentThread().getStackTrace();
        String className = elems[0].getClassName();

        if (logger != null) {
            logger.severe(className + ": " + msg);
            flushAll();
        }
    }    

    // -------------------------------------------------------------------------

}
