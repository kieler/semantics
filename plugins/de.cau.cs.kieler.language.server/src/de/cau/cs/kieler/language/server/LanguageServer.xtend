/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018,2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server

import de.cau.cs.kieler.klighd.lsp.launch.AbstractLanguageServer
import de.cau.cs.kieler.klighd.lsp.launch.LanguageServerLauncher

/**
 * Entry point for the language server application for KIELER Theia.<br>
 * Expects none or host and port as arguments. If none the language server is started via<br>
 * stdin/out, otherwise it is started via a socket connection on specified host and port. If only one argument<br>
 * is provided it will be interpreted as port and host will be localhost<br>
 * <br>
 * <b>Note:</b> On MacOS X make sure to add "-Djava.awt.headless=true" to the vmargs!
 * Otherwise the application will freeze! <br>
 * <br>
 * To start this as a plain Java Application together with other Plug-Ins, make sure to add those projects and their
 * project folders into the Classpath.
 * 
 * @see LanguageServerLauncher
 * 
 * @author als, sdo, nre
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class LanguageServer extends AbstractLanguageServer {
    
    def static main(String[] args) {
        val server = new LanguageServer
        server.configureAndRun(new LanguageRegistration, new LSCreator)
    }
    
}