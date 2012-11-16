
package de.cau.kieler.scc.model.scctext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SCCExpStandaloneSetup extends SCCExpStandaloneSetupGenerated{

	public static void doSetup() {
		new SCCExpStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

