
package de.cau.cs.kieler.synccharts.text.kits;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class KitsStandaloneSetup extends KitsStandaloneSetupGenerated{

	public static void doSetup() {
		new KitsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

