
package de.cau.cs.kieler.sccharts.text.sct;

/**
 * Initialization support for running Xtext languages
 * without equinox extension registry
 */
public class SctStandaloneSetup extends SctStandaloneSetupGenerated{

	public static void doSetup() {
		new SctStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

