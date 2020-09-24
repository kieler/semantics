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
package de.cau.cs.kieler.esterel.ide

import com.google.inject.Guice
import com.google.inject.Injector
import de.cau.cs.kieler.esterel.EsterelRuntimeModule
import de.cau.cs.kieler.esterel.EsterelStandaloneSetup
import de.cau.cs.kieler.scl.ide.SCLIdeSetup
import org.eclipse.xtext.util.Modules2
import de.cau.cs.kieler.core.ls.ILSSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class EsterelIdeSetup extends EsterelStandaloneSetup implements ILSSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new EsterelRuntimeModule, new EsterelIdeModule))
	}
	
	def static doSetup() {
        if (injector === null) {
            injector = new EsterelIdeSetup().createInjectorAndDoEMFRegistration()
        }
        return injector
    }
    
    override doLSSetup() {
        return EsterelIdeSetup.doSetup
    }
    
    override Injector createInjectorAndDoEMFRegistration() {
        SCLIdeSetup.doSetup();

        val injector = createInjector();
        register(injector);
        return injector;
    }
	
}
