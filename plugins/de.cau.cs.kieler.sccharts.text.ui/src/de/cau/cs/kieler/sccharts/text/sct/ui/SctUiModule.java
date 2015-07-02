/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.text.sct.ui;


/**
 * Custom {@link com.google.inject.Module} contributing to the Sct editor.
 *
 * @author chsch
 */
public class SctUiModule extends de.cau.cs.kieler.sccharts.text.sct.ui.AbstractSctUiModule {
    public SctUiModule(org.eclipse.ui.plugin.AbstractUIPlugin plugin) {
        super(plugin);
    }

    /* get rid of the dawn XtextNature question */
    public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
        return org.eclipse.xtext.ui.editor.IXtextEditorCallback.NullImpl.class;
    }

    /* e.g. declares '-->' '>->' to be highlighted as usual keywords */
    public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
        return SctAntlrTokenToAttributeIdMapper.class;
    }

    /* introduces new highlighting profiles (e.g. annotationKey) */
    public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration> bindIHighlightingConfiguration() {
        return SctHighlightingConfiguration.class;
    }

    /* provides a few additional highlighting rules */
    public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
        return SctSemanticHighlightingCalculator.class;
    }

    /* the registration in SctRuntimeModule will be overwritten by DefaultUIModule so it is here again */
    public Class<? extends org.eclipse.xtext.formatting.IIndentationInformation> bindIIndentationInformation() {
        return de.cau.cs.kieler.sccharts.text.sct.formatting.SctIndentionInformation.class;
    }

    /* enables rename of our 'Scope' elements that do not have a 'name' but an 'id' */
    @SuppressWarnings("restriction")
    public Class<? extends org.eclipse.xtext.ui.refactoring.IRenameStrategy> bindIRenameStrategy() {
        return SctRenameStrategy.class;
    }

}
