
package de.cau.cs.kieler.sim.esi;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EsiStandaloneSetup extends EsiStandaloneSetupGenerated{

	public static void doSetup() {
		new EsiStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

