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
package de.cau.cs.kieler.sccharts.processors.tabels

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.sccharts.SCCharts

/**
 * @author stu114663
 *
 */
class TypeGuesser extends InplaceProcessor<SCCharts> {
//    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
//    @Inject extension KEffectsExtensions
//    @Inject extension KExtDeclarationExtensions
//    @Inject extension SCChartsControlflowRegionExtensions
//    @Inject extension SCChartsCoreExtensions
//    @Inject extension SCChartsStateExtensions
//    @Inject extension SCChartsTransitionExtensions
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.TypeGuesser"
    }
    
    override getName() {
        "TypeGuesser"
    }
    
    override process() {
        val SCCharts scc = model
        
        for (rs : scc.rootStates) {
            for (ref : rs.allReferenceFromEObject) {
                if (ref.valuedObject.variableReference) {
                    ref.valuedObject.variableDeclaration.type = ValueType.STRING
                }
            }
        }
    }
}