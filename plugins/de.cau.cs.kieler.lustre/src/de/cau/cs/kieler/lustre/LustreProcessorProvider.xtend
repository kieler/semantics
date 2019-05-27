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
package de.cau.cs.kieler.lustre

import de.cau.cs.kieler.kicool.registration.IProcessorProvider

/**
 * Provider to make processors available to KiCool.
 * 
 * @author Wechselberg
 */
class LustreProcessorProvider implements IProcessorProvider {
    
    override getProcessors() {
        #[
            de.cau.cs.kieler.lustre.processors.lustreToScc.LustreToSCCControlFlowApproach,
            de.cau.cs.kieler.lustre.processors.sccToLustre.SCChartsControlFlowToLustre,
            de.cau.cs.kieler.lustre.processors.lustreToScc.LustreToSCCharts,
            de.cau.cs.kieler.lustre.compiler.processors.LustreSimulationPreparation,
            de.cau.cs.kieler.lustre.compiler.processors.LustreSimulationTemplateGenerator,
            de.cau.cs.kieler.lustre.compiler.processors.LustreV6CodeGenerator
        ]
    }
    
}