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
package de.cau.cs.kieler.sccharts.ide.text

import org.eclipse.xtext.ide.server.ServerModule
import org.eclipse.xtext.ide.server.ILanguageServerExtension
import org.eclipse.lsp4j.services.LanguageServer
import org.eclipse.xtext.ide.server.LanguageServerImpl

/**
 * @author sdo
 *
 */
class SCTXServerModule extends ServerModule {
    
    def Class<? extends LanguageServer> bindLanguageServer() {
        LanguageServerImpl
    }
   
    def Class<? extends ILanguageServerExtension> bindILanguageServerExtension() {
        MyLanguageServerExtension
    }

    def Class<? extends IExecutableCommandService> bindIExecutableCommandService() {
        MyExecutableCommandService
    }
}