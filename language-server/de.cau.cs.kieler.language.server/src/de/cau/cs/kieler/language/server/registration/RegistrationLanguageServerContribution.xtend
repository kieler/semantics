/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server.registration

import com.google.inject.Injector
import de.cau.cs.kieler.language.server.ILanguageServerContribution

/**
 * @author sdo
 *
 */
class RegistrationLanguageServerContribution implements ILanguageServerContribution {
    
    override getLanguageServerExtension(Injector injector) {
        val registration = injector.getInstance(RegistrationLanguageServerExtension)
        // Register all languages provided by the language server when the RegistrationLanguageServerExtension is loaded
        registration.languages
        return registration
    }
    
}