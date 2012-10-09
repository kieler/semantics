
package de.cau.cs.kieler.esterel;

/**
 * Initialization support for running Xtext languages
 * without equinox extension registry.
 * 
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 */
public class EsterelStandaloneSetup extends EsterelStandaloneSetupGenerated{

	public static void doSetup() {
		new EsterelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

