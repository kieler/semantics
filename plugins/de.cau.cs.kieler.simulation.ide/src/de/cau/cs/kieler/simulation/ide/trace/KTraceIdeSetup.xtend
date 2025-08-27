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
package de.cau.cs.kieler.simulation.ide.trace

import com.google.inject.Guice
import de.cau.cs.kieler.core.ls.ILSSetup
import de.cau.cs.kieler.simulation.trace.KTraceRuntimeModule
import de.cau.cs.kieler.simulation.trace.KTraceStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 * 
 * @author nre
 */
class KTraceIdeSetup extends KTraceStandaloneSetup implements ILSSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new KTraceRuntimeModule, new KTraceIdeModule))
	}
    
    override doLSSetup() {
        return KTraceIdeSetup.doSetup
    }
	
}
