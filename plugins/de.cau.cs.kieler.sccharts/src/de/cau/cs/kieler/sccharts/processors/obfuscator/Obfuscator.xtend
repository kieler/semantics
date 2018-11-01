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
package de.cau.cs.kieler.sccharts.processors.obfuscator

import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property

/**
 * @author stu114663
 *
 */
class Obfuscator<SCCharts> extends InplaceProcessor<SCCharts> {
    
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsCoreExtensions
    
    public static val IProperty<String> OBFUSCATOR_ROOTSTATE_NAME = 
        new Property<String>("de.cau.cs.kieler.sccharts.obfuscator.rootStateName", "Obfuscator Spec")
               
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.obfuscator"
    }
    
    override getName() {
        "Obfuscator"
    }
    
    override process() {
        val model = getModel;
        
        val rootState = createState => [
            name = environment.getProperty(OBFUSCATOR_ROOTSTATE_NAME)
        ] 
        val scc = createSCChart => [
            rootStates += rootState
        ]
    }
}