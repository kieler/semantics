
package de.cau.cs.kieler.synccharts.labelparser;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ActionLabelStandaloneSetup extends ActionLabelStandaloneSetupGenerated{

	public static void doSetup() {
		new ActionLabelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

