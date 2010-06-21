
package de.cau.cs.kieler.synccharts.textual.actions;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ActionsStandaloneSetup extends ActionsStandaloneSetupGenerated{

	public static void doSetup() {
		new ActionsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

