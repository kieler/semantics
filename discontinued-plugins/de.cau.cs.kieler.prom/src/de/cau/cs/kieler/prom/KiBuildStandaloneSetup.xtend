/*
 * generated by Xtext
 */
package de.cau.cs.kieler.prom


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class KiBuildStandaloneSetup extends KiBuildStandaloneSetupGenerated {

	def static doSetup() {
		return new KiBuildStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
