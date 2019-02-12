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
package de.cau.cs.kieler.sccharts.ide.text

import com.google.inject.Guice
import de.cau.cs.kieler.kexpressions.ide.kext.KExtIdeSetup
import de.cau.cs.kieler.sccharts.text.SCTXRuntimeModule
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 * 
 * @author sdo
 * 
 */
class SCTXIdeSetup extends SCTXStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SCTXRuntimeModule, new SCTXIdeModule))
	}
	
	def static doSetup() {
        if (injector === null) {
            injector = new SCTXIdeSetup().createInjectorAndDoEMFRegistration()
        }
        return injector
    }
    
    override createInjectorAndDoEMFRegistration() {
        KExtIdeSetup.doSetup();

        val injector = createInjector();
        register(injector);
        return injector;
    }
}
