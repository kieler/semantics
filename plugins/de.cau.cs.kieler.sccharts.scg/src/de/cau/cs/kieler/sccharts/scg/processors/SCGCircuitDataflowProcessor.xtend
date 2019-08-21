/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.scg.processors

import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import javax.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kexpressions.keffects.Assignment

/**
 * @author kolja
 *
 */
class SCGCircuitDataflowProcessor extends Processor<SCGraphs, SCCharts> implements Traceable{
    
    @Inject extension PragmaExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    
    override getId() {
        "de.cau.cs.kieler.sccharts.scg.processors.SCGCircuitDataflow"
    }
    
    override getName() {
        "CircuitDataflow"
    }
    
    override getType() {
        ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        val sccharts = createSCChart() => [
            for( scg : model.scgs ){
                it.rootStates.add( createState( scg.name ) => [
                    for( v : scg.variableDeclarations ){
                        it.declarations.add( v.copy )
                    }
                    it.createDataflowRegion(scg.name) => [
                        for( n : scg.nodes ){
                            if( n instanceof Assignment ){
                                it.equations.add( n.copy )
                            }
                        }
                    ]                    
                ])
            }
        ]
        sccharts.rootStates
        setModel(sccharts)
    }
    
}