/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.pragmatics.kieler.core.services

import com.google.inject.Injector
import de.cau.cs.kieler.core.services.KielerLanguage
import de.cau.cs.kieler.kgraph.text.KGraphStandaloneSetupGenerated
import de.cau.cs.kieler.klighd.kgraph.KGraphData
import de.cau.cs.kieler.klighd.kgraph.KGraphPackage

/**
 * @author sdo
 *
 */
class KGraphStandaloneSetup extends KGraphStandaloneSetupGenerated implements KielerLanguage {
    static Injector injector
    
    def static doSetup() {
        if (injector === null) {
            injector = new KGraphStandaloneSetup().createInjectorAndDoEMFRegistration()
        }
        return injector
    }
    
    override register(Injector injector) {
        super.register(injector)
        // Ensure package is registered 
        KGraphPackage.eINSTANCE.eClass()
    }
    
    override getInjector() {
        return doSetup()
    }

    override getSupportedModels() {
        #[KGraphData]
    }
    
    override getSupportedResourceExtensions() {
        #["kgt"]
    }
    
    override getResourceExtension(Object model) {
        if (model instanceof KGraphData) {
            return "kgt"
        }
        return null
    }
    
}
