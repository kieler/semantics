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
package de.cau.cs.kieler.sccharts.text

import com.google.inject.Injector
import de.cau.cs.kieler.core.services.KielerLanguage
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.SCChartsPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 * 
 * @author sdo
 */
class SCTXStandaloneSetup extends SCTXStandaloneSetupGenerated implements KielerLanguage {
	
    protected static Injector injector
    
    def static doSetup() {
        if (injector === null) {
            injector = new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration()
        }
        return injector
    }
    
    override register(Injector injector) {
        super.register(injector)
        // Ensure package is registered 
        SCChartsPackage.eINSTANCE.eClass()
    }
	
	override getInjector() {
	    return doSetup()
	}

    override getSupportedModels() {
        #[SCCharts]
    }
    
    override getSupportedResourceExtensions() {
        #["sctx"]
    }
	
}
