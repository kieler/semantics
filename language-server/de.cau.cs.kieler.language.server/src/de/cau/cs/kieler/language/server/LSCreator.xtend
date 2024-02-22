/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019,2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server

import de.cau.cs.kieler.core.services.KielerServiceLoader
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageClient
import de.cau.cs.kieler.klighd.lsp.interactive.layered.LayeredInteractiveLanguageServerExtension
import de.cau.cs.kieler.klighd.lsp.interactive.rectpacking.RectpackingInteractiveLanguageServerExtension
import de.cau.cs.kieler.klighd.lsp.launch.AbstractLsCreator
import java.util.List
import org.eclipse.xtext.ide.server.ILanguageServerExtension

/** 
 * Provides methods to create a LS.
 * This involves binding of modules and creating, starting, and configure logging for an LS.
 * 
 * @author sdo, nre
 */
class LSCreator extends AbstractLsCreator {
    
    LayeredInteractiveLanguageServerExtension constraints
    
    RectpackingInteractiveLanguageServerExtension rectPack
    
    List<ILSDiagramHighlighter> diagramHighlighters
    
    List<ILanguageServerExtension> iLanguageServerExtensions
    
    override getLanguageServerExtensions() {
        constraints = injector.getInstance(LayeredInteractiveLanguageServerExtension)
        rectPack = injector.getInstance(RectpackingInteractiveLanguageServerExtension)
        iLanguageServerExtensions = newArrayList(constraints, rectPack)
        for (lse : KielerServiceLoader.load(ILanguageServerContribution)) {
            iLanguageServerExtensions.add(lse.getLanguageServerExtension(injector))
        }
        return iLanguageServerExtensions
    }
    
    
    override getRemoteInterface() {
        KeithLanguageClient
    }
    
    override onConnect() {
        super.onConnect()
        for (Object ext : iLanguageServerExtensions) {
            if (ext instanceof ILanguageClientProvider) {
                ext.languageClient = languageClient
            }
        }
        constraints.client = languageClient as KGraphLanguageClient
        rectPack.client = languageClient as KGraphLanguageClient
        diagramHighlighters = newArrayList
        for (iLSdhc : KielerServiceLoader.load(ILSDiagramHighlighterContribution)) {
            var highlighter = iLSdhc.getHighlighter(injector)
            diagramHighlighters.add(highlighter)
            highlighter.registerObserver
        }
    }
    
    override onReload() {
        // On reload remove all diagram highlighters.
        // The diagram highlighters are as everything else created again on reload.
        diagramHighlighters.forEach[it.unregisterObserver()]
    }
    
}
