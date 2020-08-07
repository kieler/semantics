/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018,2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server.registration

import com.google.inject.Singleton
import de.cau.cs.kieler.core.services.KielerServiceLoader
import de.cau.cs.kieler.klighd.lsp.launch.AbstractRegistrationLanguageServerExtension
import de.cau.cs.kieler.klighd.lsp.launch.Language
import de.cau.cs.kieler.language.server.IHighlightingContribution
import de.cau.cs.kieler.pragmatics.language.server.PragmaticsRegistrationLanguageServerExtension

/**
 * Extends the language server with support for the KGraph and Elk Graph languages and all available classes
 * implementing the {@code IHighlightingContribution}.
 * 
 * @author sdo, nre
 */
 @Singleton
class RegistrationLanguageServerExtension extends PragmaticsRegistrationLanguageServerExtension {
    
    override getLanguageExtensions() {
        val languages = super.getLanguageExtensions
        for (contribution : KielerServiceLoader.load(IHighlightingContribution)) {
            val highlighting = contribution.highlighting
        	languages.add(new Language(highlighting.getId, highlighting.name, highlighting.keywords))
        }
        return languages
    }
    
    /**
     * Static access to the registered language extensions.
     */
    def static getRegisteredLanguageExtensions() {
        return AbstractRegistrationLanguageServerExtension.registeredLanguageExtensions
    }
    
}