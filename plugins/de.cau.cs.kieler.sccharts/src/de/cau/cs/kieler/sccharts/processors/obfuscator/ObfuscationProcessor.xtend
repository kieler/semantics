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
import java.util.Random
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.iterators.ScopeIterator
import de.cau.cs.kieler.sccharts.iterators.StateIterator

/**
 * @author stu114663
 * 
 */
class ObfuscationProcessor extends InplaceProcessor<SCCharts> {

    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsCoreExtensions

    override getId() {
        "de.cau.cs.kieler.sccharts.processors.obfuscator"
    }

    override getName() {
        "Obfuscator"
    }

    override process() {
        val model = getModel;
        
        val obf = new BlankObfuscator

        model.rootStates.forEach[rs |
            obfuscateState(rs, obf)
            val stateI = StateIterator.sccAllStates(rs)
            
            stateI.forEach[s |
                obfuscateState(s, obf)
            ]
        ]
    }

    /**
     * Obfuscates the following:
     *   - state name
     *   - valued objects
     *   - regions
     */
    def obfuscateState(State state, Obfuscator obf) {
        state.name = obf.stateName
        
        state.declarations.forEach [ decl |
            decl.valuedObjects.forEach [ valO |
                valO.name = obf.valuedObjectName
            ]
        ]
        
        state.regions.forEach [ region | obfuscateRegion(region, obf)]
    }
    
    /**
     * Obfuscates the following:
     *   - region name
     *   - valued objects
     */
    def obfuscateRegion(Region region, Obfuscator obf) {
        region.name = obf.regionName
        
        region.declarations.forEach [ decl |
            decl.valuedObjects.forEach [ valO |
                valO.name = obf.valuedObjectName
            ]
        ]
    }
}
