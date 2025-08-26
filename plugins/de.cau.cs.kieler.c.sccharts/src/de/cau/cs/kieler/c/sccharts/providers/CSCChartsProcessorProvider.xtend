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
package de.cau.cs.kieler.c.sccharts.providers

import de.cau.cs.kieler.kicool.registration.IProcessorProvider

/**
 * Provider to make processors available to KiCool.
 * 
 * @author Wechselberg
 */
class CSCChartsProcessorProvider implements IProcessorProvider {
    
    override getProcessors() {
        #[
            de.cau.cs.kieler.c.sccharts.processors.CDTProcessor,
            de.cau.cs.kieler.c.sccharts.processors.CParserProcessor,
            de.cau.cs.kieler.c.sccharts.processors.CppParserProcessor,
            de.cau.cs.kieler.c.sccharts.processors.DataflowExtractor,
            de.cau.cs.kieler.c.sccharts.processors.CentralizedSMExtractor,
            de.cau.cs.kieler.c.sccharts.processors.ClassBasedSMExtractor,
            de.cau.cs.kieler.c.sccharts.processors.SCChartASTExtractor,
            de.cau.cs.kieler.c.sccharts.processors.StructflowExtractor
        ]
    }
    
}