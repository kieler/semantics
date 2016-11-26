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

/**
 * @author ssm
 *
 */
public enum LogLevel {

    NORMAL(0), HIGH(1);
    
    private int level = 0;
    
    LogLevel(int level) {
        this.level = level;
    }
    
    public boolean reached(LogLevel logLevel) {
        return  level >= logLevel.level;
    }
}
