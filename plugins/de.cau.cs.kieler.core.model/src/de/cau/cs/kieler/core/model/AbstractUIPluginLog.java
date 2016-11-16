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

import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.google.inject.Inject;

/**
 * This class extends the AbstractUIPlugin and adds a logger mechanism, that can be used by all
 * classes of a concrete plugin.
 * 
 * @author cmot
 *
 */
public abstract class AbstractUIPluginLog extends AbstractUIPlugin {

    public static final boolean DEBUG = java.lang.management.ManagementFactory.getRuntimeMXBean()
            .getInputArguments().toString().contains("-agentlib:jdwp");

    /** The logger. */
    @Inject
    private static Logger logger;

    /** The logger started flag. */
    private static boolean loggerStarted = false;

    // -------------------------------------------------------------------------

    /**
     * Start the logger logger.
     */
    public static void startLogger(final boolean enforce) {
        if ((!loggerStarted && DEBUG) || enforce) {
            loggerStarted = true;
            SimpleFormatter formatter = new SimpleFormatter();
            StreamHandler handler = new StreamHandler(System.out, formatter); 
            
            if (logger == null) {
                logger = Logger.getGlobal();
            }
            
            logger.addHandler(handler);
        }
    }

    // -------------------------------------------------------------------------

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
        }
    }

    // -------------------------------------------------------------------------

}
