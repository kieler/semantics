
package de.cau.cs.kieler.sim.coreeso;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CoreEsoStandaloneSetup extends CoreEsoStandaloneSetupGenerated{

	public static void doSetup() {
		new CoreEsoStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

