
package de.cau.cs.kieler.synccharts.text.interfaces;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class InterfacesStandaloneSetup extends InterfacesStandaloneSetupGenerated{

	public static void doSetup() {
		new InterfacesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

