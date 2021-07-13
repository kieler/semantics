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
import org.eclipse.elk.graph.EMapPropertyHolder
import org.eclipse.elk.graph.ElkGraphPackage
import org.eclipse.elk.graph.text.ElkGraphStandaloneSetupGenerated

/**
 * @author sdo
 *
 */
class ElkGraphStandaloneSetup extends ElkGraphStandaloneSetupGenerated implements KielerLanguage {
    static Injector injector
    
    def static doSetup() {
        if (injector === null) {
            injector = new ElkGraphStandaloneSetup().createInjectorAndDoEMFRegistration()
        }
        return injector
    }
    
    override register(Injector injector) {
        super.register(injector)
        // Ensure package is registered 
        ElkGraphPackage.eINSTANCE.eClass()
    }
    
    override getInjector() {
        return doSetup()
    }

    override getSupportedModels() {
        #[EMapPropertyHolder]
    }
    
    override getSupportedResourceExtensions() {
        #["elkt"]
    }
    
    override getResourceExtension(Object model) {
        if (model instanceof EMapPropertyHolder) {
            return "elkt"
        }
        return null
    }
    
}