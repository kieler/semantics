package de.cau.cs.kieler.synccharts.dsl;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from StandaloneSetup.xpt!
 */
public class Kits_textonlyStandaloneSetup implements ISetup {

	public static void doSetup() {
		new Kits_textonlyStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public Injector createInjectorAndDoEMFRegistration() {
		org.eclipse.xtext.common.TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new de.cau.cs.kieler.synccharts.dsl.Kits_textonlyRuntimeModule());
	}
	
	public void register(Injector injector) {
	if (!EPackage.Registry.INSTANCE.containsKey("http://www.cau.de/cs/kieler/synccharts/dsl/Kits_textonly")) {
		EPackage.Registry.INSTANCE.put("http://www.cau.de/cs/kieler/synccharts/dsl/Kits_textonly", de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage.eINSTANCE);
	}

		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("kits_textonly", resourceFactory);
		



	}
}
