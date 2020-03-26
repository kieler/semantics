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
package de.cau.cs.kieler.kicool.providers

import de.cau.cs.kieler.kicool.registration.IProcessorProvider

/**
 * Provider to make processors available to KiCool.
 * 
 * @author Wechselberg
 */
class DefaultProcessorProvider implements IProcessorProvider {
    
    override getProcessors() {
        #[
            de.cau.cs.kieler.kicool.processors.Identity,
            de.cau.cs.kieler.kicool.processors.metrics.EObjectCount,
            de.cau.cs.kieler.kicool.processors.Delay,
            de.cau.cs.kieler.kicool.processors.metrics.PTime,
            de.cau.cs.kieler.kicool.processors.DynamicIdentity,
            de.cau.cs.kieler.kicool.deploy.processor.ProjectSetup,
            de.cau.cs.kieler.kicool.deploy.processor.TemplateEngine,
            de.cau.cs.kieler.kicool.deploy.processor.VariableStoreInitializer,
            de.cau.cs.kieler.kicool.deploy.processor.VariableStoreCleaner,
            de.cau.cs.kieler.kicool.deploy.processor.JavaCompiler,
            de.cau.cs.kieler.kicool.deploy.processor.CCompiler,
            de.cau.cs.kieler.kicool.deploy.processor.ArduinoCompiler,
            de.cau.cs.kieler.kicool.deploy.processor.NXJCompiler,
            de.cau.cs.kieler.kicool.deploy.processor.MacroAnnotations,
            de.cau.cs.kieler.kicool.deploy.processor.ModelIncludes,
            de.cau.cs.kieler.kicool.processors.Snapshot,
            de.cau.cs.kieler.kicool.processors.ast.GCCAST,
            de.cau.cs.kieler.kicool.processors.ast.GCCAST2KAST,
            de.cau.cs.kieler.kicool.processors.EnvironmentConfigurationReader
        ]
    }
    
}