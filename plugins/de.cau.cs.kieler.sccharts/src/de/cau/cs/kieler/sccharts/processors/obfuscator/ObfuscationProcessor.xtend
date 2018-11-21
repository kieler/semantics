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
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.iterators.RegionIterator
import de.cau.cs.kieler.sccharts.iterators.StateIterator
import de.cau.cs.kieler.sccharts.iterators.ValuedObjectIterator
import java.util.Iterator
import de.cau.cs.kieler.kexpressions.ValuedObject

/**
 * @author stu114663
 * 
 */
class ObfuscationProcessor extends InplaceProcessor<SCCharts> {

//    @Inject extension SCChartsStateExtensions
//    @Inject extension SCChartsCoreExtensions

    override getId() {
        "de.cau.cs.kieler.sccharts.processors.obfuscator"
    }

    override getName() {
        "Obfuscator"
    }

    override process() {
        val model = getModel;
        
        val obf = getObfuscator(ObfuscatorTypes.RANDOM, model)

        model.rootStates.forEach [ rs |
            obfuscateState(rs, obf)
            val stateI = StateIterator.sccAllStates(rs)

            stateI.forEach [ s |
                obfuscateState(s, obf)
            ]
        ]
    }
    
    def getObfuscator(ObfuscatorTypes type, SCCharts model) {
        switch (type) {
            case COUNTING: {
                return new CountingObfuscator(getItemCount(model))
            }
            case COUNTING_TYPE: {
                return new CountingTypeObfuscator(getValuedObjectsCount(model), getStatesCount(model), getRegionsCount(model))
            }
            case RANDOM: {
                return new RandomObfuscator(getItemCount(model))
            }
            case RANDOM_KEEP_LENGTH: {
                return new RandomKeepLengthObfuscator
            }
        }
    }

    /**
     * Obfuscates the following:
     *   - state name
     *   - valued objects
     *   - regions
     */
    def obfuscateState(State state, Obfuscator obf) {
        state.name = obf.getStateName(state)

        state.declarations.forEach [ decl |
            decl.valuedObjects.forEach [ valO |
                valO.name = obf.getValuedObjectName(valO)
            ]
        ]

        state.regions.forEach[region|obfuscateRegion(region, obf)]
    }

    /**
     * Obfuscates the following:
     *   - region name
     *   - valued objects
     */
    def obfuscateRegion(Region region, Obfuscator obf) {
        region.name = obf.getRegionName(region)

        region.declarations.forEach [ decl |
            decl.valuedObjects.forEach [ valO |
                valO.name = obf.getValuedObjectName(valO)
            ]
        ]
    }
    
    def static int getIteratorSizeVO(Iterator<ValuedObject> iter) {
        var int cnt = 0
        while (iter.hasNext()) {
            iter.next()
            cnt += 1
        }
        return cnt
    }
    
    def static int getIteratorSizeS(Iterator<State> iter) {
        var int cnt = 0
        while (iter.hasNext()) {
            iter.next()
            cnt += 1
        }
        return cnt
    }
    
    def static int getIteratorSizeR(Iterator<Region> iter) {
        var int cnt = 0
        while (iter.hasNext()) {
            iter.next()
            cnt += 1
        }
        return cnt
    }
    
    def static int getValuedObjectsCount(Scope scp) {
        return getIteratorSizeVO(ValuedObjectIterator.sccValuedObjects(scp))
    }
    
    def static int getStatesCount(Scope scp) {
        return getIteratorSizeS(StateIterator.sccAllStates(scp))
    }
    
    def static int getRegionsCount(Scope scp) {
        return getIteratorSizeR(RegionIterator.sccAllRegions(scp))
    }
    
    def static int getItemCount(SCCharts model) {
        var itemCount = 0
        for (rs : model.rootStates) {
            itemCount += getValuedObjectsCount(rs) + getStatesCount(rs) + getRegionsCount(rs)
        }
        return itemCount
    }
    
    def static int getValuedObjectsCount(SCCharts model) {
        var itemCount = 0
        for (rs : model.rootStates) {
            itemCount += getValuedObjectsCount(rs)
        }
        return itemCount
    }
    
    def static int getStatesCount(SCCharts model) {
        var itemCount = 0
        for (rs : model.rootStates) {
            itemCount += getStatesCount(rs)
        }
        return itemCount
    }
    
    def static int getRegionsCount(SCCharts model) {
        var itemCount = 0
        for (rs : model.rootStates) {
            itemCount += getRegionsCount(rs)
        }
        return itemCount
    }
}
