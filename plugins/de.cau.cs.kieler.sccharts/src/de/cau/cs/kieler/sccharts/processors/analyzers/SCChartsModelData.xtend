/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.analyzers

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kicool.processors.analyzers.AbstractModelDataCollector
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.text.SCTXResource
import java.util.Map

/**
 * @author als
 */
class SCChartsModelData extends AbstractModelDataCollector<SCCharts> {
    
    public static val NAMESPACE = "sccharts."
    public static val SCCHARTS_COUNT = NAMESPACE + "sccharts.count"
    public static val STATE_COUNT = NAMESPACE + "state.count"
    public static val STATE_REGIONS = NAMESPACE + "state.maxRegions"
    public static val CF_REGION_COUNT = NAMESPACE + "region.controlflow.count"
    public static val DF_REGION_COUNT = NAMESPACE + "region.dataflow.count"
    public static val REGION_DEPTH = NAMESPACE + "region.maxDepth"
    public static val VAR_COUNT = NAMESPACE + "variables.count"
    public static val IO_VAR_COUNT = NAMESPACE + "variables.io.count"
    
    @Inject extension SCChartsScopeExtensions
    @Inject extension KExpressionsDeclarationExtensions
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.analyzers.model.data.sccharts"
    }
    
    override getName() {
        "SCCharts Model Data"
    }
    
    override collect(SCCharts model, Map<String, Object> data) {
        val sccs = newArrayList
        sccs += model.rootStates
        
        if (!model.imports.empty) {
            val eR = model.eResource
            val eRS = eR?.resourceSet
            if (eR !== null && eRS !== null && eRS.resources.size > 1) {
                for (r : eRS.resources.filter(SCTXResource).filter[it !== eR]) {
                    for (s : r.contents.filter(SCCharts)) {
                        sccs += s.rootStates
                    }
                }
            }
        }
        
        data.put(SCCHARTS_COUNT, sccs.size)
        for (scc : sccs) {
            scc.collect(data)
        }
        
        model.rootStates.head.collectCommunication(data)
    }
    
    def collect(State rootState, Map<String, Object> data) {
        val regionDepth = newHashMap
        
        for (scope : rootState.allScopes.toIterable) {
            if (scope instanceof State) {
                data.increment(STATE_COUNT)
                data.max(STATE_REGIONS, scope.regions.size)
                
            } else if (scope instanceof Region) {
                if (scope instanceof ControlflowRegion) {
                    data.increment(CF_REGION_COUNT)
                } else if (scope instanceof DataflowRegion) {
                    data.increment(DF_REGION_COUNT)
                }
                
                // Depth
                val parent = scope.parentState?.parentRegion
                regionDepth.put(scope, regionDepth.getOrDefault(parent, 0) + 1)
                
            }
            
            data.increase(VAR_COUNT, scope.declarations.map[valuedObjects].flatten.size)
            data.increase(IO_VAR_COUNT, scope.declarations.filter[input || output].map[valuedObjects].flatten.size)
        }
        
        if (!regionDepth.empty) {
            data.put(REGION_DEPTH, regionDepth.values.max)
        }
    }
    
    def collectCommunication(State rootState, Map<String, Object> data) {
        
    }
    
}
