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

import java.util.logging.Level;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * This class extends the AbstractUIPlugin and adds a logger mechanism, that can be used by all
 * classes of a concrete plugin.
 * 
 * @author cmot
 *
 */
public abstract class AbstractUIPluginLog extends AbstractUIPlugin {

    public static void log(final String msg) {
        PluginLog.log(msg);
    }
    
    public static void log(final String msg, Level logLevel) {
        PluginLog.log(msg, logLevel);
    }
    
    public static void logError(final String msg) {
        PluginLog.logError(msg);        
    }
    
    public static void logError(final String msg, Level logLevel) {
        PluginLog.logError(msg, logLevel);
    }
}
