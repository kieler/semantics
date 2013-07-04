package de.cau.cs.kieler.yakindu.sccharts.model.stext;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class SCChartsExpStandaloneSetup extends
		SCChartsExpStandaloneSetupGenerated {

	public static Injector doSetup() {
		return new SCChartsExpStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
