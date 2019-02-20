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
package de.cau.cs.kieler.language.server

import de.cau.cs.kieler.core.services.KielerServiceLoader
import de.cau.cs.kieler.kgraph.text.ide.KGraphLSSetup
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageServerExtension

/**
 * @author sdo
 *
 */
class LanguageRegistration {
    
    def bindAndRegisterLanguages() {
        val injectorKGraph = KGraphLSSetup.doLSSetup()        
        for (contribution: KielerServiceLoader.load(ILSSetupContribution)) {
            contribution.LSSetup.doLSSetup()
        }
        return injectorKGraph.getInstance(KGraphLanguageServerExtension)
    }
}