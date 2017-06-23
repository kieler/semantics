package de.cau.cs.kieler.sccharts.legacy.text.actions;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.service.SingletonBinding;

import de.cau.cs.kieler.sccharts.legacy.text.actions.formatting.ActionsTransientValueService;
import de.cau.cs.kieler.sccharts.legacy.text.actions.formatting.ActionsValueConverter;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class ActionsRuntimeModule extends de.cau.cs.kieler.sccharts.legacy.text.actions.AbstractActionsRuntimeModule {


    public Class<? extends org.eclipse.xtext.resource.XtextResource> bindXtextResource() {
        return ActionsResource.class;
    }

    /* (non-Javadoc)
     * @see org.eclipse.xtext.service.DefaultRuntimeModule#bindITransientValueService()
     */
    @Override
    public Class<? extends ITransientValueService> bindITransientValueService() {
        return ActionsTransientValueService.class;
    }

    /* (non-Javadoc)
     * @see org.eclipse.xtext.service.DefaultRuntimeModule#bindIValueConverterService()
     */
    @Override
    public Class<? extends IValueConverterService> bindIValueConverterService() {
        return ActionsValueConverter.class;
    }

    // contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
    @SingletonBinding
    public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
            return de.cau.cs.kieler.sccharts.legacy.text.actions.scoping.ActionsScopeProvider.class;
    }


}
