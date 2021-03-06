/*
 * generated by Xtext
 */
package de.cau.cs.kieler.kexpressions.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class KExpressionsUiModule extends AbstractKExpressionsUiModule {

    def Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration () {
        return KExpressionsHighlightingConfiguration;
    }
    
    def Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator(){
        return KExpressionsSemanticHighlightingCalculator;
    }

}
