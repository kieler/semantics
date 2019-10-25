/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.core

/**
 * @author ssm
 *
 */
class Platform {
    
    enum OS { WIN, MAC, UNIX }
    
    public static val MAX_PATH_LENGTH = 64
    static val OS_NAME = System.getProperty("os.name").toLowerCase();
  
    static def boolean isWindows() {
        return (OS_NAME.indexOf("win") >= 0);
    }
    
    static def boolean isMac() {
        return (OS_NAME.indexOf("mac") >= 0);
    }
    
    static def boolean isUnix() {
        return (OS_NAME.indexOf("nix") >= 0 || OS_NAME.indexOf("nux") >= 0 || OS_NAME.indexOf("aix") > 0);
    }
    
    static def OS getOS() {
        if (isWindows) return OS::WIN
        if (isMac) return OS::MAC
        return OS::UNIX
    }
}