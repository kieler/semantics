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
package de.cau.cs.kieler.verification.processors

import java.util.Locale

/** 
 * @author aas
 */
class OsUtil {
    public static enum OS {
        WINDOWS,
        LINUX,
        MAC,
        UNKOWN
    }

    def static OS getOs() {
        // For other ways to determine the OS in Java see StackOverflow:
        // https://stackoverflow.com/questions/228477/how-do-i-programmatically-determine-operating-system-in-java
        var String os = getOsName().toLowerCase(Locale.US)
        if (os.contains("windows")) {
            return OS.WINDOWS
        } else if (os.contains("linux")) {
            return OS.LINUX
        } else if (os.contains("mac")) {
            return OS.MAC
        }
        return OS.UNKOWN
    }

    public static def boolean isWindows() {
        return getOs == OS.WINDOWS
    }
    
    public static def boolean isLinux() {
        return getOs == OS.LINUX
    }
    
    public static def boolean isMac() {
        return getOs == OS.MAC
    }

    def static String getOsName() {
        return System.getProperty("os.name", "unknown")
    }
}
