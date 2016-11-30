/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.core.model;

import java.lang.reflect.Field;
import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * @author ssm
 *
 */
public class CoreLogger extends Logger {

    private static final String CORE_LOGGER_NAME = "global";
    private static final String CORE_LOGGER_BUNDLE_NAME = null;

    CoreLogger() {
        super(CORE_LOGGER_NAME, CORE_LOGGER_BUNDLE_NAME);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void log(LogRecord record) {
        if (!isLoggable(record.getLevel())) {
            return;
        }
        Filter theFilter = getFilter();
        if (theFilter != null && !theFilter.isLoggable(record)) {
            return;
        }

        final Handler[] loggerHandlers = this.getHandlers();

        for (Handler handler : loggerHandlers) {
            if (record.getLevel().intValue() >= Level.SEVERE.intValue()) {
                if (handler instanceof LogHandler) {
                    ((LogHandler) handler).publishToError(record);
                } else {
                    handler.publish(record);
                }
            } else {
                handler.publish(record);
            }
        }
    }
}
