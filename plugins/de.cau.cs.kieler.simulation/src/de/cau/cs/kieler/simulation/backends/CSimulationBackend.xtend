/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.backends

import de.cau.cs.kieler.prom.drafts.PromProjectDrafts

/**
 * @author aas
 *
 */
class CSimulationBackend extends OriginBasedSimulationBackend {
    
    /**
     * {@inheritDoc}
     */
    override getBuildConfigOrigin() {
        "platform:/plugin/de.cau.cs.kieler.prom/resources/c/c-backend.kibuild"
    }
    
    /**
     * {@inheritDoc}
     */
    override getName() {
        "C"
    }
    
    /**
     * {@inheritDoc}
     */
    override getProjectDraft() {
        return PromProjectDrafts.genericC
    }
    
    /**
     * {@inheritDoc}
     */
    override getSupportedProcessors() {
        return #["de.cau.cs.kieler.scg.processors.codegen.c",
// The prio backend cannot be added now due to the deprecated prio c codegen.
// Add this backend as soon as the prio codegen is refactored to the new version.
//                 "de.cau.cs.kieler.scg.processors.sclp", 
                 "de.cau.cs.kieler.sccharts.processors.codegen.statebased"]
    }
    
    /**
     * {@inheritDoc}
     */
    override getSupportedFileExtensions() {
        return #["c"]
    }
}