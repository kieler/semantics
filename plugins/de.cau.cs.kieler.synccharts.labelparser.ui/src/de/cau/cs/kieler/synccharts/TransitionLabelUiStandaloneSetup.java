package de.cau.cs.kieler.synccharts;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from StandaloneSetup.xpt!
 */
public class TransitionLabelUiStandaloneSetup implements ISetup {

	public static void doSetup() {
		new TransitionLabelUiStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public Injector createInjectorAndDoEMFRegistration() {
		org.eclipse.xtext.common.TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new de.cau.cs.kieler.synccharts.TransitionLabelUiModule());
	}
	
	public void register(Injector injector) {
	if (!EPackage.Registry.INSTANCE.containsKey("http://kieler.cs.cau.de/synccharts/actionlabel")) {
		EPackage.Registry.INSTANCE.put("http://kieler.cs.cau.de/synccharts/actionlabel", de.cau.cs.kieler.synccharts.transitionlabel.TransitionlabelPackage.eINSTANCE);
	}

		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("action", resourceFactory);

	}
}
