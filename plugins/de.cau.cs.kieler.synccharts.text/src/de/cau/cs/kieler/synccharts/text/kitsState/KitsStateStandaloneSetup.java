
package de.cau.cs.kieler.synccharts.text.kitsState;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class KitsStateStandaloneSetup extends KitsStateStandaloneSetupGenerated{

	public static void doSetup() {
		new KitsStateStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

