package de.cau.cs.kieler.synccharts.text.kits;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 * 
 * @author chsch
 *
 */
public class KitsRuntimeModule extends de.cau.cs.kieler.synccharts.text.kits.AbstractKitsRuntimeModule {

	public Class<? extends org.eclipse.xtext.resource.XtextResource> bindXtextResource() {
		return KitsResource.class;
	}
	
	public Class<? extends org.eclipse.xtext.linking.ILinker> bindILinker() {
		return KitsLinker.class;
	}

	public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITransientValueService> bindITransientValueService() {
		return KitsTransientValueService.class;
	}
	
    public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
        return de.cau.cs.kieler.synccharts.text.kits.formatting.KitsValueConverter.class;
    }

    public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITokenSerializer.IValueSerializer> bindIValueSerializer() {
		return de.cau.cs.kieler.synccharts.text.kits.formatting.KitsValueSerializer.class;
	}
	
	public Class<? extends org.eclipse.xtext.formatting.IIndentationInformation> bindIIndentationInformation() {
		return de.cau.cs.kieler.synccharts.text.kits.formatting.KitsIndentionInformation.class;
	}

}
