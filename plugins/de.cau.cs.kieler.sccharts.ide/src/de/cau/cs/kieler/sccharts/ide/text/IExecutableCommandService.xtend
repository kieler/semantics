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


import java.util.List
import org.eclipse.lsp4j.ExecuteCommandParams
import org.eclipse.xtext.ide.server.ILanguageServerAccess
import org.eclipse.xtext.util.IDisposable
import org.eclipse.xtext.util.CancelIndicator

interface IExecutableCommandService {
    
    /**
     * Called on server initialize.
     * @return the supported commands
     */
    def List<String> initialize()
    
    /**
     * Called on server initialize, only if the client supported dynamicRegistration of commands.
     */
    def void initializeDynamicRegistration((String)=>IDisposable register) {}
    
    /**
     * Called when the client wants to execute a registered command.
     */
    def Object execute(ExecuteCommandParams params, ILanguageServerAccess access, CancelIndicator cancelIndicator)
}
