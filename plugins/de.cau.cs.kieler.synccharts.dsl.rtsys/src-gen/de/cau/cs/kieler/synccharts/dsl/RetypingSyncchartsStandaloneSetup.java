package de.cau.cs.kieler.synccharts.dsl;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from StandaloneSetup.xpt!
 */
public class RetypingSyncchartsStandaloneSetup implements ISetup {

	public static void doSetup() {
		new RetypingSyncchartsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public Injector createInjectorAndDoEMFRegistration() {
		org.eclipse.xtext.common.TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new de.cau.cs.kieler.synccharts.dsl.RetypingSyncchartsRuntimeModule());
	}
	
	public void register(Injector injector) {
	if (!EPackage.Registry.INSTANCE.containsKey("http://www.cau.de/cs/kieler/synccharts/dsl/RetypingSynccharts")) {
		EPackage.Registry.INSTANCE.put("http://www.cau.de/cs/kieler/synccharts/dsl/RetypingSynccharts", de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage.eINSTANCE);
	}

		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("rtsys", resourceFactory);
		



	}
}
