
package de.cau.cs.kieler.yakindu.synccharts.model.text;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from StandaloneSetup.xpt!
 */
@SuppressWarnings("all")
public class SyncTextStandaloneSetupGenerated implements ISetup {

	public Injector createInjectorAndDoEMFRegistration() {
		de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.SCChartsExpStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new de.cau.cs.kieler.yakindu.synccharts.model.text.SyncTextRuntimeModule());
	}
	
	public void register(Injector injector) {
	if (!EPackage.Registry.INSTANCE.containsKey("http://www.cau.de/kieler/yakindu/synccharts/SyncText")) {
		EPackage.Registry.INSTANCE.put("http://www.cau.de/kieler/yakindu/synccharts/SyncText", de.cau.cs.kieler.yakindu.synccharts.model.text.syncText.SyncTextPackage.eINSTANCE);
	}

		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		org.eclipse.xtext.resource.IResourceServiceProvider serviceProvider = injector.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sync", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("sync", serviceProvider);
		



	}
}
