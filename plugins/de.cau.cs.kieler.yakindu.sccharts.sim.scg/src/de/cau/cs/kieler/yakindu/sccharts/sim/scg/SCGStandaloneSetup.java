
package de.cau.cs.kieler.yakindu.sccharts.sim.scg;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SCGStandaloneSetup extends SCGStandaloneSetupGenerated{

	public static void doSetup() {
		new SCGStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

