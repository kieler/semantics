package de.cau.cs.kieler.synccharts.dsl.scoping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.linking.impl.SimpleAttributeResolver;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultScope;
import org.eclipse.xtext.scoping.impl.SimpleNameScopeProvider;

public class ReferenceByIdScopeProvider extends SimpleNameScopeProvider {
@Override

	protected IScope createScope(Resource resource, EClass type) {
		System.out.println("cross ref's are now made by id per default");
		return new DefaultScope(resource, type, getImportUriResolver(),
				SimpleAttributeResolver.newResolver(String.class, "id"));

	}
}
