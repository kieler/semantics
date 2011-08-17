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
package de.cau.cs.kieler.core.annotations.ui;

/**
 * Custom {@link com.google.inject.Module} contributing to the Kits editor.
 * 
 * @author chsch
 */
public class AnnotationsUiModule extends
        de.cau.cs.kieler.core.annotations.ui.AbstractAnnotationsUiModule {

    public AnnotationsUiModule(org.eclipse.ui.plugin.AbstractUIPlugin plugin) {
        super(plugin);
    }

    /* introduces new highlighting profiles (e.g. annotationKey) */
    public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration> bindIHighlightingConfiguration() {
        return AnnotationsHighlightingConfiguration.class;
    }

    /* provides a few additional highlighting rules */
    public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
        return AnnotationsSemanticHighlightingCalculator.class;
    }

}
