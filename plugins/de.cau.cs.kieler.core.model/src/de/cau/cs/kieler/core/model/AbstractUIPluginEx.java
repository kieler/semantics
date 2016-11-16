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

import java.beans.Introspector;
import java.util.logging.Logger;

import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.google.inject.Inject;

/**
 * This class extends the AbstractUIPlugin and adds a logger mechanism, that can be used by
 * all classes of a concrete plugin.
 * 
 * @author cmot
 *
 */
public abstract class AbstractUIPluginEx extends AbstractUIPlugin {
    
    /** The logger. */
    @Inject
    public static Logger logger;

    // -------------------------------------------------------------------------

    /**
     * Log an info.
     * 
     * @param msg
     *            the msg
     */
    public static void log(String msg) {
        
        StackTraceElement[] elems = Thread.currentThread().getStackTrace();
        String className = elems[0].getClassName();
        
        if (logger != null) {
            logger.info(className + ": " + msg);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Log an error.
     * 
     * @param msg
     *            the msg
     */
    public static void logError(String msg) {
        
        StackTraceElement[] elems = Thread.currentThread().getStackTrace();
        String className = elems[0].getClassName();
        
        if (logger != null) {
            logger.severe(className + ": " + msg);
        }
    }
    
    // -------------------------------------------------------------------------
 
}
