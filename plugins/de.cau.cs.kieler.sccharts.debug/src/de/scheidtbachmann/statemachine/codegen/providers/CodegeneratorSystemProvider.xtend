package de.scheidtbachmann.statemachine.codegen.providers

import de.cau.cs.kieler.kicool.registration.ISystemProvider

/**
 * Provider to make processors available to KiCool.
 * 
 * @author Wechselberg
 */
class CodegeneratorSystemProvider implements ISystemProvider {
    
    override getBundleId() {
        "de.cau.cs.kieler.sccharts.debug"
    }
    
    override getSystems() {
        #[
            "system/de.scheidtbachmann.codegen.statebased.lean.java.template.kico",
            "system/de.scheidtbachmann.codegen.statebased.lean.java.template.selective.kico"
        ]
    }
    
}
