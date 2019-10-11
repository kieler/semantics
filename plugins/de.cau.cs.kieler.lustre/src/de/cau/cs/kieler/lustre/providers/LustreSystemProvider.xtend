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
package de.cau.cs.kieler.lustre.providers

import de.cau.cs.kieler.kicool.registration.ISystemProvider

/**
 * Provider to make systems available to KiCool.
 * 
 * @author Wechselberg
 */
class LustreSystemProvider implements ISystemProvider{
    
    override getBundleId() {
        "de.cau.cs.kieler.lustre"
    }
    
    override getSystems() {
        #[
            "system/de.cau.cs.kieler.lustre.scc.controlflow.kico",
            "system/de.cau.cs.kieler.lustre.scc.kico",
            "system/de.cau.cs.kieler.lustre.c.controlflow.kico",
            "system/de.cau.cs.kieler.lustre.c2.kico",
            "system/de.cau.cs.kieler.lustre.c.kico",
            "system/de.cau.cs.kieler.lustre.v6.simulation.kico",
            "system/de.cau.cs.kieler.lustre.scade.kico",
            "system/de.cau.cs.kieler.lustre.scade.scc.kico",
            "system/de.cau.cs.kieler.lustre.scade.c.kico"
        ]
    }
    
}