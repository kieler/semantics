/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.providers

import de.cau.cs.kieler.kicool.registration.ISystemProvider

/**
 * Provider to make systems available to KiCool.
 * 
 * @author sdo
 */
class KGraphGeneratorSystemProvider implements ISystemProvider {
    
    override getBundleId() {
        "de.cau.cs.kieler.sccharts.ui"
    }
    
    override getSystems() {
        #[
            "system/de.cau.cs.kieler.sccharts.ui.codegen.kgraph.kico"
        ]
    }
    
}