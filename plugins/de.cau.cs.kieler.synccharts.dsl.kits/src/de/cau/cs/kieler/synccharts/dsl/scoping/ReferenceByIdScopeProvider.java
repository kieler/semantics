package de.cau.cs.kieler.synccharts.dsl.scoping;

import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

public class ReferenceByIdScopeProvider extends DefaultGlobalScopeProvider {

	// protected IScope createScope(Resource resource, EClass type) {
	//
	// if (type.getName().equals("Signal")) {
	// System.out.println("signal ref's are now made by name per default");
	// return new DefaultScope(resource, type, getImportUriResolver(),
	// SimpleAttributeResolver.newResolver(String.class, "name"));}
	// else if (type.getName().equals("State")) {
	// System.out.println("State ref's are now made by label per default");
	// return new DefaultScope(resource, type, getImportUriResolver(),
	// SimpleAttributeResolver.newResolver(String.class, "label"));
	//
	// } else
	// System.out.println("Cross references per id!!");
	// return new DefaultScope(resource, type, getImportUriResolver(),
	// SimpleAttributeResolver.newResolver(String.class, "id"));
	//
	// }
}
