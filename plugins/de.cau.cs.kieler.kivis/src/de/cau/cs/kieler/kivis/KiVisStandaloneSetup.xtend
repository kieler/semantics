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
package de.cau.cs.kieler.kivis

import com.google.inject.Injector
import de.cau.cs.kieler.kivis.kivis.KivisPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 * 
 * @author sdo
 * 
 */
class KiVisStandaloneSetup extends KiVisStandaloneSetupGenerated {

    static Injector injector
    
    def static doSetup() {
        if (injector === null) {
            injector = new KiVisStandaloneSetup().createInjectorAndDoEMFRegistration()
        }
        return injector
    }
    
    override register(Injector injector) {
        super.register(injector)
        // Ensure package is registered 
        KivisPackage.eINSTANCE.eClass()
    }
}
