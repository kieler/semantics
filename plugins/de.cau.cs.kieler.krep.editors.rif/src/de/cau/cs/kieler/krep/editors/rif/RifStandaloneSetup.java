
package de.cau.cs.kieler.krep.editors.rif;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RifStandaloneSetup extends RifStandaloneSetupGenerated{

	public static void doSetup() {
		new RifStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

