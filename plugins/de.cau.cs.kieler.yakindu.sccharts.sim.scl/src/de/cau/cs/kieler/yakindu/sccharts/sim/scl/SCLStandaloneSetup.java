
package de.cau.cs.kieler.yakindu.sccharts.sim.scl;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SCLStandaloneSetup extends SCLStandaloneSetupGenerated{

	public static Injector doSetup() {
		return new SCLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

