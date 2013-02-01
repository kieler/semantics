
package de.cau.cs.kieler.yakindu.synccharts.model.stext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SyncExpStandaloneSetup extends SyncExpStandaloneSetupGenerated{

	public static void doSetup() {
		new SyncExpStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

