
package de.cau.cs.kieler.sccharts.text.sctState;

/**
 * Initialization support for running Xtext languages
 * without equinox extension registry
 */
public class SctStateStandaloneSetup extends SctStateStandaloneSetupGenerated{

	public static void doSetup() {
		new SctStateStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

