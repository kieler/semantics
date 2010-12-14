
package de.cau.cs.kieler.kies;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EsterelStandaloneSetup extends EsterelStandaloneSetupGenerated{

	public static void doSetup() {
		new EsterelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

