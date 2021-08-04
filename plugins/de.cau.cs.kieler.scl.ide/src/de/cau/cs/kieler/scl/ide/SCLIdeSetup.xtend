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
package de.cau.cs.kieler.scl.ide

import com.google.inject.Guice
import de.cau.cs.kieler.scl.SCLRuntimeModule
import de.cau.cs.kieler.scl.SCLStandaloneSetup
import org.eclipse.xtext.util.Modules2
import de.cau.cs.kieler.kexpressions.ide.kext.KExtIdeSetup

/**
 * Initialization support for running Xtext languages as language servers.
 * 
 * @author sdo
 * 
 */
class SCLIdeSetup extends SCLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SCLRuntimeModule, new SCLIdeModule))
	}
	
	def static doSetup() {
        if (injector === null) {
            injector = new SCLIdeSetup().createInjectorAndDoEMFRegistration()
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
