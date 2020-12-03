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
package de.cau.cs.kieler.esterel

import com.google.inject.Injector
import de.cau.cs.kieler.core.services.KielerLanguage
import de.cau.cs.kieler.esterel.scest.SCEstStandaloneSetup

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 * 
 * sdo
 * 
 */
class EsterelStandaloneSetup extends EsterelStandaloneSetupGenerated implements KielerLanguage {

    protected static var Injector injector

    def static doSetup() {
        if (injector === null) {
            // Ensure meta model package is registered 
            EsterelPackage.eINSTANCE.eClass()
            injector = new EsterelStandaloneSetup().createInjectorAndDoEMFRegistration()
        }
        return injector
    }
    
    override register(Injector injector) {
        super.register(injector)
        // Ensure package is registered 
        EsterelPackage.eINSTANCE.eClass()
    }

    override getInjector() {
        return doSetup()
    }

    override getSupportedModels() {
        #[EsterelProgram]
    }

    override getSupportedResourceExtensions() {
        #["strl"]
    }

    override getResourceExtension(Object model) {
        return SCEstStandaloneSetup.getEsterelResourceExtension(model)
    }
}
