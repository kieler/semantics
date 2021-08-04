/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.core

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import org.osgi.framework.FrameworkUtil

/**
 * Provides access to the version of the running kieler.
 * 
 * @author als
 */
class KielerVersion {

    private static val VERSION_FILE_NAME = "kieler.version"

    static def String getVersion() {
        var URL versionFileURL
        try {
            if (Platform.isEclipsePlatformRunning) {
                versionFileURL = FrameworkUtil.getBundle(KielerVersion).getResource(VERSION_FILE_NAME)
            } else {
                versionFileURL = KielerVersion.classLoader.getResource(VERSION_FILE_NAME)
            }
        } catch (Exception e) {
            // ignore
        }
        if (versionFileURL !== null) {
            var BufferedReader reader
            try {
                reader = new BufferedReader(new InputStreamReader(versionFileURL.openStream))
                var version = reader.readLine
                if (version !== null) {
                    var extra = reader.readLine
                    if (extra !== null) {
                        version += " ("
                        do {
                            version += extra
                            extra = reader.readLine
                        } while (extra !== null)
                        version += ")"
                    }
                    return version
                }
            } catch (Exception e) {
                // ignore
            } finally {
                reader?.close()
            }
        }
        return "unknown"
    }
}
