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
package de.cau.cs.kieler.simulation.ide.language.server

import de.cau.cs.kieler.language.server.ILanguageServerContribution
import com.google.inject.Injector

/**
 * Contribution to provide the corresponding language server extension
 * 
 * @author sdo
 *
 */
class SimulationLanguageServerContribution implements ILanguageServerContribution {
    
    override getLanguageServerExtension(Injector injector) {
        return injector.getInstance(SimulationLanguageServerExtension)
    }
}