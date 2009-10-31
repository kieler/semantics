package de.cau.cs.kieler.synccharts.dsl.scoping;

import org.eclipse.xtext.linking.impl.SimpleAttributeResolver;
import org.eclipse.xtext.scoping.impl.DefaultScope; //import org.eclipse.xtext.scoping.impl.DefaultScopeProvider;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleNameScopeProvider;

public class MyDefaultScopeProvider extends SimpleNameScopeProvider {
    // public class MyDefaultScopeProvider extends DefaultScopeProvider {
    @Override
    protected IScope createScope(Resource resource, EClass type) {
        return new DefaultScope(resource, type, getImportUriResolver(),
                SimpleAttributeResolver.newResolver(String.class, "id"));
    }

}
