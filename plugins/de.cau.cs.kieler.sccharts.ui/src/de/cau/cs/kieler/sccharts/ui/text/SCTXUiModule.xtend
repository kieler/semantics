/*
 * generated by Xtext
 */
package de.cau.cs.kieler.sccharts.ui.text

import de.cau.cs.kieler.sccharts.ui.text.quickfix.SCTXQuickfixProvider
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator
import org.eclipse.xtext.ui.editor.DirtyStateEditorSupport
import org.eclipse.xtext.ui.editor.IXtextEditorCallback
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class SCTXUiModule extends AbstractSCTXUiModule {
    
    /* introduces new highlighting profiles (e.g. annotationKey) */
    def Class<? extends DefaultHighlightingConfiguration> bindIHighlightingConfiguration() {
        return SCTXHighlightingConfiguration
    }

    /* provides a few additional highlighting rules */
    def Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
        return SCTXSemanticHighlightingCalculator
    } 
    
    /* IMPORTANT!
     * This prevents the NatureAddingEditorCallback from being added to the editor.
     * No 'do you 'Do you want to convert to an Xtext project?' dialog will be shown.
     * At the same time the new callback handles the correct update of imported resources when saved.
     * IMPORTANT!
     */
    def Class<? extends IXtextEditorCallback> bindIXtextEditorCallback() {
        return SCTXEditorCallback
    }
    def Class<? extends DirtyStateEditorSupport> bindDirtyStateEditorSupport() {
        return SCTXDirtyStateEditorSupport
    }

}