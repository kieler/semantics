
package de.cau.cs.kieler.core.kexpressions;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class KExpressionsStandaloneSetup extends KExpressionsStandaloneSetupGenerated{

	public static void doSetup() {
		new KExpressionsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

