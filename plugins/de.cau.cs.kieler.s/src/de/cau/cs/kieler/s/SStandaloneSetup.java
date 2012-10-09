
package de.cau.cs.kieler.s;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 * 
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 */
public class SStandaloneSetup extends SStandaloneSetupGenerated{

	public static void doSetup() {
		new SStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

