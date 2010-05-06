
package de.cau.cs.kieler.synccharts.interfacedeclparser;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class InterfaceDeclStandaloneSetup extends InterfaceDeclStandaloneSetupGenerated{

	public static void doSetup() {
		new InterfaceDeclStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

