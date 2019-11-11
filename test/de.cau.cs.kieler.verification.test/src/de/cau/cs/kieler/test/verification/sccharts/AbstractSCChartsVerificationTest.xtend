/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.test.verification.sccharts

import de.cau.cs.kieler.sccharts.SCCharts
import com.google.inject.Injector
import de.cau.cs.kieler.sccharts.processors.verification.SCChartsVerificationPropertyAnalyzer
import de.cau.cs.kieler.test.verification.AbstractVerificationTest

/**
 * @author aas
 *
 */
abstract class AbstractSCChartsVerificationTest extends AbstractVerificationTest<SCCharts> {
    
    new(Injector resourceSetInjector) {
        super(resourceSetInjector)
    }
    
    override getPropertyAnalyzerProcessorId() {
        return SCChartsVerificationPropertyAnalyzer.PROCESSOR_ID
    }
    
}
