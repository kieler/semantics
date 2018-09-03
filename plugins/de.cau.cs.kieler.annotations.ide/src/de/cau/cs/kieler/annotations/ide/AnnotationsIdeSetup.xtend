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
package de.cau.cs.kieler.annotations.ide

import com.google.inject.Guice
import de.cau.cs.kieler.annotations.AnnotationsRuntimeModule
import de.cau.cs.kieler.annotations.AnnotationsStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 * 
 * @author sdo
 */
class AnnotationsIdeSetup extends AnnotationsStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new AnnotationsRuntimeModule, new AnnotationsIdeModule))
	}
	
}
