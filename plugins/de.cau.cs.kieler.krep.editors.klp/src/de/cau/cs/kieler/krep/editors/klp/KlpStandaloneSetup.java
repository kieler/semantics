
package de.cau.cs.kieler.krep.editors.klp;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class KlpStandaloneSetup extends KlpStandaloneSetupGenerated{

	public static void doSetup() {
		new KlpStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

