
package de.cau.cs.kieler.yakindu.model.stext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SynctextStandaloneSetup extends SynctextStandaloneSetupGenerated{

	public static void doSetup() {
		new SynctextStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

