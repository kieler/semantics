
package de.cau.kieler.synccharts.yakindu.model.reqtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class KidsexpStandaloneSetup extends KidsexpStandaloneSetupGenerated{

	public static void doSetup() {
		new KidsexpStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

