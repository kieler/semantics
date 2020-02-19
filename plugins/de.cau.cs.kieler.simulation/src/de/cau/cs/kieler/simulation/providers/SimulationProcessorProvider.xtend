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
package de.cau.cs.kieler.simulation.providers

import de.cau.cs.kieler.kicool.registration.IProcessorProvider

/**
 * Provider to make processors available to KiCool.
 * 
 * @author Wechselberg, als
 */
class SimulationProcessorProvider implements IProcessorProvider {
    
    override getProcessors() {
        #[
            de.cau.cs.kieler.simulation.processor.JavaSimulationTemplateGenerator,
            de.cau.cs.kieler.simulation.processor.CSimulationTemplateGenerator,
            de.cau.cs.kieler.simulation.processor.SimulationContextBuilder,
            de.cau.cs.kieler.simulation.internal.processor.Step,
            de.cau.cs.kieler.simulation.internal.processor.ReadTrace,
            de.cau.cs.kieler.simulation.internal.processor.CheckTrace,
            de.cau.cs.kieler.simulation.internal.processor.DynamicTickInput,
            de.cau.cs.kieler.simulation.processor.CTickTimeTemplateGenerator,
            de.cau.cs.kieler.simulation.processor.JavaTickTimeTemplateGenerator,
            de.cau.cs.kieler.simulation.testing.processor.TestModelsCollector
        ]
    }
    
}