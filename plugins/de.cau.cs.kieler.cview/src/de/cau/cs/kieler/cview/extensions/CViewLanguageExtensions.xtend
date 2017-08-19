/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.cview.extensions

import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.cview.model.cViewModel.Component
import com.google.inject.Inject
import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions
import de.cau.cs.kieler.cview.hooks.ICViewLanguage
import de.cau.cs.kieler.cview.CViewPlugin
import java.util.Set

/**
 * General language extensions.
 * 
 * @author cmot
 * 
 */
class CViewLanguageExtensions {

    @Inject extension CViewModelExtensions

    // Retrieve the language handling this component type or the default language
    def ICViewLanguage getLanguage(Component component) {
        return CViewPlugin.getLanguageHook(component)
    }

    // Returns true if the file is handled
    def boolean isFileHandled(Component component, Set<String> fileExtensions) {
        val filePath = component.location
        if (filePath != null) {
            for (fileExtension : fileExtensions) {
                if (filePath.endsWith("." + fileExtension)) {
                    return true
                }
            }
        }
        return false
    }

    // Retrieve the language handling this file type based on the declared file extensions
    def static ICViewLanguage getLanguage(String filePath) {
        for (languageHook : CViewPlugin.getRegisteredLanguageHooks(false)) {
            val fileExtensios = languageHook.fileExtensions
            if (!fileExtensios.nullOrEmpty && filePath != null) {
                for (fileExtension : fileExtensios) {
                    if (filePath.endsWith("." + fileExtension)) {
                        return languageHook
                    }
                }
            }
        }
    }

    // True if any VISIBLE children
    def boolean hieararchicalView(Component component, AbstractDiagramSynthesis<?> synthesis) {
        if (component.hieararchical) {
            return !component.children.filter[e|!e.filtered && e.language.diagramIsVisible(e)].nullOrEmpty;
        }
        return false
    }


}