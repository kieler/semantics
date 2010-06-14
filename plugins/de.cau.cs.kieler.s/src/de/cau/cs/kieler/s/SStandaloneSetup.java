
package de.cau.cs.kieler.s;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SStandaloneSetup extends SStandaloneSetupGenerated{

	public static void doSetup() {
		new SStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

