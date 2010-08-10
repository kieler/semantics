
package de.cau.cs.kieler.core.annotations;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AnnotationsStandaloneSetup extends AnnotationsStandaloneSetupGenerated{

	public static void doSetup() {
		new AnnotationsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

