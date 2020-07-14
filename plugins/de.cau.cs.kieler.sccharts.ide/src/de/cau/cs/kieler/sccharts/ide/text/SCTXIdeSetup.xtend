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
import de.cau.cs.kieler.sccharts.text.SCTXRuntimeModule
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import org.eclipse.xtext.util.Modules2
import de.cau.cs.kieler.scl.ide.SCLIdeSetup

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
	    // Check whether the current injector is already an injector created by this class
        if (injector === null) {
            injector = new SCTXIdeSetup().createInjectorAndDoEMFRegistration()
        } else if (injector.getInstance(SCTXIdeModule) !== null) {
            injector = new SCTXIdeSetup().createInjectorAndDoEMFRegistration()
        }
        return injector
    }
    
    override createInjectorAndDoEMFRegistration() {
        SCLIdeSetup.doSetup();

        val injector = createInjector();
        register(injector);
        return injector;
    }
}
