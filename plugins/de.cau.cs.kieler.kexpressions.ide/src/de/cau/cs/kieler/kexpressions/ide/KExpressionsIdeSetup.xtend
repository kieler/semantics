/*
 * generated by Xtext
 */
package de.cau.cs.kieler.kexpressions.ide

import com.google.inject.Guice
import de.cau.cs.kieler.kexpressions.KExpressionsRuntimeModule
import de.cau.cs.kieler.kexpressions.KExpressionsStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class KExpressionsIdeSetup extends KExpressionsStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new KExpressionsRuntimeModule, new KExpressionsIdeModule))
	}
	
}