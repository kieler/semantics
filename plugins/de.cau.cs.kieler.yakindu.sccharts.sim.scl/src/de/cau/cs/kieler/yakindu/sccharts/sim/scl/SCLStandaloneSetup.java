
package de.cau.cs.kieler.yakindu.sccharts.sim.scl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SCLStandaloneSetup extends SCLStandaloneSetupGenerated{

	public static void doSetup() {
		new SCLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

