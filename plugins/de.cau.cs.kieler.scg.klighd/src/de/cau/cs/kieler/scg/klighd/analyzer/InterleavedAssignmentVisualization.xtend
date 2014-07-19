/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.klighd.analyzer

import de.cau.cs.kieler.scg.klighd.analyzer.IAnalysisVisualization
import de.cau.cs.kieler.scg.klighd.SCGraphDiagramSynthesis
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.scg.Dependency

/**
 * @author ssm
 * @kieler.design 2014-01-08 proposed 
 * @kieler.rating 2014-01-08 proposed yellow
 *
 */
class InterleavedAssignmentVisualization implements IAnalysisVisualization {

    private static val KColor INTERLEAVED_DEPENDENCY = KRenderingFactory::eINSTANCE.createKColor()=>[it.red = 168; it.green = 168; it.blue = 168;]
    
//    override Analysis visualize(Analysis anaysis, SCGraphDiagramSynthesis synthesis) {
//        anaysis => [
//            objectReferences.forEach[
//                synthesis.colorDependency(it as Dependency, INTERLEAVED_DEPENDENCY)
//            ]
//        ]
//    }
    
}