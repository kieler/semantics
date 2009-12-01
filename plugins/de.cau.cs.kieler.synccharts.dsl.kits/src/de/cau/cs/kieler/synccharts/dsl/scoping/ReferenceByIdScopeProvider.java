package de.cau.cs.kieler.synccharts.dsl.scoping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.linking.impl.SimpleAttributeResolver;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultScope;
import org.eclipse.xtext.scoping.impl.SimpleNameScopeProvider;

import de.cau.cs.kieler.synccharts.Signal;

public class ReferenceByIdScopeProvider extends SimpleNameScopeProvider {
	@Override
	protected IScope createScope(Resource resource, EClass type) {

		if (type.getName().equals("Signal")) {
			System.out.println("signal ref's are now made by name per default");
			return new DefaultScope(resource, type, getImportUriResolver(),
					SimpleAttributeResolver.newResolver(String.class, "name"));}
		else if (type.getName().equals("State")) {
			System.out.println("signal ref's are now made by name per default");
			return new DefaultScope(resource, type, getImportUriResolver(),
					SimpleAttributeResolver.newResolver(String.class, "label"));

		} else
			return new DefaultScope(resource, type, getImportUriResolver(),
					SimpleAttributeResolver.newResolver(String.class, "id"));

	}
}
