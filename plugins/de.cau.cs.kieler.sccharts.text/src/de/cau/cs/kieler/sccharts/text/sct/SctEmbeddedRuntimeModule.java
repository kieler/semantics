/*
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
package de.cau.cs.kieler.sccharts.text.sct;

import org.eclipse.xtext.Constants;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Special guice configuration as SctEmbedded needs different scope provider.
 * Due to Resource selection by file extension I need to introduce a further
 * file extension resulting in the first declaration.
 * Otherwise the wrong scope provider is chosen during model parsing.
 * See also the extra extension in sccharts.text.ui's plugin.xml
 *
 * @author chsch
 */
public class SctEmbeddedRuntimeModule extends SctRuntimeModule {

	public void configureFileExtensions(Binder binder) {
		if (properties == null || properties.getProperty(Constants.FILE_EXTENSIONS) == null)
			binder.bind(String.class).annotatedWith(Names.named(Constants.FILE_EXTENSIONS)).toInstance("sctem");
	}

	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return de.cau.cs.kieler.sccharts.text.sct.scoping.SctEmbeddedScopeProvider.class;
	}
}
