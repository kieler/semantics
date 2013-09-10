/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.text.sct.ui;

/**
 * Special guice configuration as SctEmbedded needs different
 * {@link org.eclipse.xtext.validation.IDiagnosticConverter}.
 *
 * @author chsch
 */
public class SctEmbeddedUIModule extends SctUiModule {
    public SctEmbeddedUIModule(org.eclipse.ui.plugin.AbstractUIPlugin plugin) {
        super(plugin);
    }

    public Class<? extends org.eclipse.xtext.validation.IDiagnosticConverter> bindIDiagnosticConverter() {
        return SctDiagnosticConverterImpl.class;
    }
}
