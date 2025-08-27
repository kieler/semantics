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
package de.cau.cs.kieler.kicool.ide.providers

import de.cau.cs.kieler.kicool.registration.ISystemProvider

/**
 * Provider to make processors available to KiCool.
 * 
 * @author als
 */
class DiagramSystemProvider implements ISystemProvider {
    
    override getSystems() {
        #[
            "system/de.cau.cs.kieler.kicool.ide.diagram.synthesis.kico"
        ]
    }
    
    override getBundleId() {
        "de.cau.cs.kieler.kicool.ide"
    }
}