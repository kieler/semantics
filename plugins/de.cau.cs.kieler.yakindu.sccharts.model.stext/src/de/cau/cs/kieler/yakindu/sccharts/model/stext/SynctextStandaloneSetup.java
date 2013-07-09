package de.cau.cs.kieler.yakindu.sccharts.model.stext;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class SynctextStandaloneSetup extends
		SynctextStandaloneSetupGenerated {

	public static Injector doSetup() {
		return new SynctextStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
