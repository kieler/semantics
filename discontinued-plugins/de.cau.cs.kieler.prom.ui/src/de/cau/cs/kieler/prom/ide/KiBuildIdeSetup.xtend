/*
 * generated by Xtext
 */
package de.cau.cs.kieler.prom.ide

import com.google.inject.Guice
import de.cau.cs.kieler.prom.KiBuildRuntimeModule
import de.cau.cs.kieler.prom.KiBuildStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class KiBuildIdeSetup extends KiBuildStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new KiBuildRuntimeModule, new KiBuildIdeModule))
	}
	
}
