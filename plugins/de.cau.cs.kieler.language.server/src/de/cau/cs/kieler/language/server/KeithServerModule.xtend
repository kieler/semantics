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
package de.cau.cs.kieler.language.server

import org.eclipse.xtext.ide.server.ILanguageServerExtension
import org.eclipse.xtext.service.AbstractGenericModule

/**
 * Module to register additional classes for language support.
 * 
 * @author sdo
 *
 */
class KeithServerModule extends AbstractGenericModule {
    
    /**
     * Bind language server extension for keith.
     */
    def Class<? extends ILanguageServerExtension> bindILanguageServerExtension() {
        KeithLanguageServerExtension
    }
}