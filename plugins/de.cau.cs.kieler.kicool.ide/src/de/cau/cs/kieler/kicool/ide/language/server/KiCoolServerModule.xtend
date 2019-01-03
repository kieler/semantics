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
package de.cau.cs.kieler.kicool.ide.language.server

import de.cau.cs.kieler.klighd.lsp.KGraphDiagramModule
import org.eclipse.xtext.ide.server.ILanguageServerExtension

/**
 * Module to register additional classes for language support.
 * 
 * @author sdo
 *
 */
class KiCoolServerModule extends KGraphDiagramModule {
    
    /**
     * Bind language server extension for keith.
     */
    override Class<? extends ILanguageServerExtension> bindILanguageServerExtension() {
        KiCoolLanguageServerExtension
    }
}