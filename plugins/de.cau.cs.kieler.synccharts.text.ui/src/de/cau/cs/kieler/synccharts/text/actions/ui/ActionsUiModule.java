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
package de.cau.cs.kieler.synccharts.text.actions.ui;

/**
 * Custom {@link com.google.inject.Module} contributing to the (embedded) Actions editor.
 * 
 * @author chsch
 */
public class ActionsUiModule extends
        de.cau.cs.kieler.synccharts.text.actions.ui.AbstractActionsUiModule {
    public ActionsUiModule(org.eclipse.ui.plugin.AbstractUIPlugin plugin) {
        super(plugin);
    }

    public Class<? extends org.eclipse.xtext.validation.IDiagnosticConverter> bindIDiagnosticConverter() {
        return ActionsDiagnosticConverterImpl.class;
    }

    /* e.g. declares,e.g., comment annotations to be highlighted accordingly */
    public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
        return ActionsAntlrTokenToAttributeIdMapper.class;
    }

    /* introduces new highlighting profiles (e.g. annotationKey) */
    public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration> bindIHighlightingConfiguration() {
        return ActionsHighlightingConfiguration.class;
    }

    /* provides a few additional highlighting rules */
    public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
        return ActionsSemanticHighlightingCalculator.class;
    }

}
