/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server

import org.eclipse.equinox.app.IApplication
import org.eclipse.equinox.app.IApplicationContext
import de.cau.cs.kieler.kexpressions.ide.RunSocketServer

/**
 * Entry point for the language server application for KIELER Theia.<br>
 * <br>
 * <b>Note:</b> On MacOS X make sure to add "-Djava.awt.headless=true" to the vmargs!
 * Otherwise the application will freeze! 
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class LanguageServer implements IApplication {
    
    override start(IApplicationContext context) throws Exception {
        // Start all language servers
        print("Starting language server")
        RunSocketServer.main()
        print("Existed language server")
        return EXIT_OK
    }
    
    override stop() {
        // Stop all language servers
    }
    
}