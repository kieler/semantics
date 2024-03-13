/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2024 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server.sccharts.structurebasedediting

import com.google.inject.Injector
import de.cau.cs.kieler.language.server.ILanguageServerContribution

/**
 * Used during creation of a language server and to set the client accordingly.
 *
 */
class SCChartsStructeBasedEditingLanguageServerContribution implements ILanguageServerContribution {

    override getLanguageServerExtension(Injector injector) {
        return injector.getInstance(SCChartsStructureBasedEditingLanguageServerExtension)
    }
}
