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
package de.cau.cs.kieler.synccharts.text.kits.ui;

/**
 * Custom {@link com.google.inject.Module} contributing to the Kits editor.
 * 
 * @author chsch
 */
public class KitsUiModule extends de.cau.cs.kieler.synccharts.text.kits.ui.AbstractKitsUiModule {
    public KitsUiModule(org.eclipse.ui.plugin.AbstractUIPlugin plugin) {
        super(plugin);
    }

    /* get rid of the dawn XtextNature question */
    public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
        return org.eclipse.xtext.ui.editor.IXtextEditorCallback.NullImpl.class;
    }

    /* e.g. declares '-->' '>->' to be highlighted as usual keywords */
    public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
        return KitsAntlrTokenToAttributeIdMapper.class;
    }

    /* introduces new highlighting profiles (e.g. annotationKey) */
    public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration> bindIHighlightingConfiguration() {
        return KitsHighlightingConfiguration.class;
    }

    /* provides a few additional highlighting rules */
    public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
        return KitsSemanticHighlightingCalculator.class;
    }

    /* the registration in KitsRuntimeModule will be overwritten by DefaultUIModule so it is here again */
    public Class<? extends org.eclipse.xtext.formatting.IIndentationInformation> bindIIndentationInformation() {
        return de.cau.cs.kieler.synccharts.text.kits.formatting.KitsIndentionInformation.class;
    }

}
