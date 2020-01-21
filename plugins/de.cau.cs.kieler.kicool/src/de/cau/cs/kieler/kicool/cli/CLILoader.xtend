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
package de.cau.cs.kieler.kicool.cli

import java.net.URL
import java.net.URLClassLoader

/**
 * @author kolja
 * 
 */
class CLILoader extends URLClassLoader {
    new(ClassLoader classLoader) {
        super(#[], classLoader);
    }

    override void addURL(URL url) {
        super.addURL(url);
    }
}
