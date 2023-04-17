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
package de.cau.cs.kieler.sccharts.ui.structuredProgramming

import com.google.inject.Injector
import de.cau.cs.kieler.klighd.lsp.KGraphDiagramState
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageClient
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageServerExtension
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.IStructuredProgrammingLanguageServerContribution

/**
 * Used during creation of a language server and to set the client acordingly
 * @author felixj
 *
 */
class ScchartsStructProgLanguageServerContribution implements IStructuredProgrammingLanguageServerContribution{
    override getLanguageServerExtension(Injector injector) {
        
        
        val serverExt = injector.getInstance(ScchartsStructuredProgrammingServerExtension)
        injector.getInstance(ScchartsStructuredActionHandler).ext = serverExt
        serverExt.KGraphDiagramState = injector.getInstance(KGraphDiagramState)
        serverExt.KGraphLanguageServerExtension = injector.getInstance(KGraphLanguageServerExtension)
        return serverExt
    }
    
    override setClient(Injector injector, KGraphLanguageClient client) {
        injector.getInstance(ScchartsStructuredProgrammingServerExtension).KGraphLanguageClient = client
    }
    
}
