
package de.cau.cs.kieler.yakindu.synccharts.model.text;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SyncTextStandaloneSetup extends SyncTextStandaloneSetupGenerated{

	public static void doSetup() {
		new SyncTextStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

