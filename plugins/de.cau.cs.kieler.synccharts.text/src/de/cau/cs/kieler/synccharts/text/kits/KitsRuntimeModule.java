package de.cau.cs.kieler.synccharts.text.kits;

import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.resource.XtextResource;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class KitsRuntimeModule extends de.cau.cs.kieler.synccharts.text.kits.AbstractKitsRuntimeModule {

	public Class<? extends XtextResource> bindXtextResource() {
		return KitsResource.class;
	}
	
	public Class<? extends ITransientValueService> bindITransientValueService() {
		return CustomTransientValueService.class;
	}
	
	public Class<? extends org.eclipse.xtext.linking.ILinker> bindILinker() {
		return KitsLinker.class;
	}

	
}
