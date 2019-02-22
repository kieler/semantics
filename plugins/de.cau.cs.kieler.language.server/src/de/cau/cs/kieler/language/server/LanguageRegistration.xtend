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

import com.google.inject.Guice
import de.cau.cs.kieler.core.services.KielerServiceLoader
import de.cau.cs.kieler.kgraph.text.ide.KGraphLSSetup
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageServerExtension
import org.eclipse.elk.graph.text.ElkGraphRuntimeModule
import org.eclipse.elk.graph.text.ElkGraphStandaloneSetup
import org.eclipse.elk.graph.text.ide.ElkGraphIdeModule
import org.eclipse.xtext.util.Modules2

/**
 * @author sdo
 *
 */
class LanguageRegistration {
    
    def bindAndRegisterLanguages() {
        val injectorKGraph = KGraphLSSetup.doLSSetup()
        new ElkGraphStandaloneSetup {
            
            override createInjector() {
                Guice.createInjector(Modules2.mixin(new ElkGraphRuntimeModule, new ElkGraphIdeModule))
            }
            
        }.createInjectorAndDoEMFRegistration
        for (contribution: KielerServiceLoader.load(ILSSetupContribution)) {
            contribution.LSSetup.doLSSetup()
        }
        return injectorKGraph.getInstance(KGraphLanguageServerExtension)
    }
}