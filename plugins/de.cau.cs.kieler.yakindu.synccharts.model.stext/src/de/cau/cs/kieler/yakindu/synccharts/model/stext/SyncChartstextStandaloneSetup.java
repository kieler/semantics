
package de.cau.cs.kieler.yakindu.synccharts.model.stext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SyncChartstextStandaloneSetup extends SyncChartstextStandaloneSetupGenerated{

	public static void doSetup() {
		new SyncChartstextStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

