/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.kexpressions.test;


/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 * 
 * @author cmot
 */
public class KExpressionsRuntimeModule extends de.cau.cs.kieler.core.kexpressions.KExpressionsRuntimeModule {
	
	// use a DummyScope with some declared dummy signals for testing
	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return de.cau.cs.kieler.core.kexpressions.test.scoping.DummyScopeProvider.class;
	}

//	public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
//	        return de.cau.cs.kieler.core.kexpressions.formatting.ExpressionsValueConverter.class;
//	}
	
}
