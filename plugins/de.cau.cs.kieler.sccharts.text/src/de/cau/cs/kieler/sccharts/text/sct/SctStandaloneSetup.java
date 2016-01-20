package de.cau.cs.kieler.sccharts.text.sct;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages without equinox extension registry
 * 
 * @author chsch
 * @author als
 */
public class SctStandaloneSetup extends SctStandaloneSetupGenerated {

    public static Injector doSetup() {
        return new SctStandaloneSetup().createInjectorAndDoEMFRegistration();
    }
}
