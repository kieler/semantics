
package de.cau.cs.kieler.yakindu.sccharts.model.scchartstext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SCChartsExpStandaloneSetup extends SCChartsExpStandaloneSetupGenerated{

	public static void doSetup() {
		new SCChartsExpStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

