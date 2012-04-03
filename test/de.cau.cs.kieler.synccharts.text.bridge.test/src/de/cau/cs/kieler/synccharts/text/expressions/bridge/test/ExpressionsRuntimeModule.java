/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.text.expressions.bridge.test;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class ExpressionsRuntimeModule extends de.cau.cs.kieler.core.kexpressions.KExpressionsRuntimeModule {
	
	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return de.cau.cs.kieler.synccharts.text.actions.scoping.ActionsScopeProvider.class;
	}

//	public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
//	        return de.cau.cs.kieler.core.kexpressions.formatting.ExpressionsValueConverter.class;
//	}
}
