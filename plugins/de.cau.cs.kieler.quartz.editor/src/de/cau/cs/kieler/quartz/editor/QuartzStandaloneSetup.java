
package de.cau.cs.kieler.quartz.editor;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class QuartzStandaloneSetup extends QuartzStandaloneSetupGenerated{

	public static void doSetup() {
		new QuartzStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

