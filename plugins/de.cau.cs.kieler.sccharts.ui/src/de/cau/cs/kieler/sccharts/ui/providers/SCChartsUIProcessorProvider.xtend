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
package de.cau.cs.kieler.sccharts.ui.providers

import de.cau.cs.kieler.kicool.registration.IProcessorProvider

/**
 * Provider to make processors available to KiCool.
 * 
 * @author als
 */
class SCChartsUIProcessorProvider implements IProcessorProvider {
    
    override getProcessors() {
        #[
            de.cau.cs.kieler.sccharts.ui.synthesis.processors.SCChartsSynthesisProcessor,
            de.cau.cs.kieler.sccharts.ui.synthesis.analyses.SCChartsSynthesisIntermediateProcessor,
            de.cau.cs.kieler.sccharts.ui.synthesis.analyses.SCChartsDiagramAnalysis,
            de.cau.cs.kieler.sccharts.ui.synthesis.analyses.SmartZoomAnalysis
        ]
    }
    
}
