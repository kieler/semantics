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
package de.cau.cs.kieler.lustre

import com.google.inject.Injector
import de.cau.cs.kieler.core.services.KielerLanguage
import de.cau.cs.kieler.lustre.lustre.LustrePackage
import de.cau.cs.kieler.lustre.lustre.LustreProgram

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 * 
 * @author sdo
 */
class LustreStandaloneSetup extends LustreStandaloneSetupGenerated implements KielerLanguage {
    
    protected static Injector injector
    
    def static doSetup() {
        if (injector === null) {
            // Ensure meta model package is registered 
            LustrePackage.eINSTANCE.eClass()
            injector = new LustreStandaloneSetup().createInjectorAndDoEMFRegistration()
        }
        return injector
    }
    
    override register(Injector injector) {
        super.register(injector)
        // Ensure package is registered 
        LustrePackage.eINSTANCE.eClass()
    }
    
    override getInjector() {
        return doSetup()
    }
    
    override getSupportedModels() {
        #[LustreProgram]
    }
    
    override getSupportedResourceExtensions() {
        #["lus"]
    }
}
