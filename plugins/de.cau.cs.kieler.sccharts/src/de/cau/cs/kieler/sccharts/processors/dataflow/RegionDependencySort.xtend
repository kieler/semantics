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
package de.cau.cs.kieler.sccharts.processors.dataflow

import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor

import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.sccharts.Region
import java.util.Set
import java.util.LinkedHashSet
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property

/**
 * @author ssm
 * @kieler.design 2019-02-21 proposed
 * @kieler.rating 2019-02-21 proposed yellow  
 */
class RegionDependencySort extends SCChartsProcessor {
    
    public static val ID = "de.cau.cs.kieler.sccharts.processors.regionDependencySort"
    public static val ERROR_MSG = "Cannot topologically sort regions due to dependency cycles."
    
    public static val IProperty<Boolean> ERROR_ON_FAILURE = 
       new Property<Boolean>("de.cau.cs.kieler.sccharts.processors.regionDependencySort.errorOnFailure", true)          
    
    override getId() {
        ID
    }
    
    override getName() {
        "Region Dependency Sort"
    }
    
    override process() {
        val model = getModel
        
        val lcafMap = environment.getProperty(RegionDependencies.REGION_LCAF_MAP)
        if (lcafMap === null) {
            environment.warnings.add("No LCAF map found. No sorting applied.")
            return;
        }
        
        for (rootState : model.rootStates) {
            val dependencies = rootState.eAllContents.filter(ControlflowRegion).map[ outgoingLinks ].toList.flatten
                .filter(DataDependency).filter[ concurrent && !confluent ].toList
            val regionDependencies = <Pair<Region, Region>> newLinkedHashSet
            for (dependency : dependencies) {
                val cfrs = lcafMap.levelRegions(dependency)
                if (cfrs.key != cfrs.value) regionDependencies.add(cfrs) 
            }
            
            regionDependencies.sortTopologically
        }
    }
    
    protected def sortTopologically(LinkedHashSet<Pair<Region, Region>> dependencies) {
        val visited = <Region> newHashSet
        val remaining = <Region> newLinkedHashSet => [ r | dependencies.forEach[ r.add(it.key) ] ]
        
        for (d : dependencies) {
            if (!d.key.top(dependencies, remaining, visited)) {
                if (environment.getProperty(ERROR_ON_FAILURE)) {
                    environment.errors.add(ERROR_MSG)
                }
            }
        }  
    } 
    
    protected def boolean top(Region region, LinkedHashSet<Pair<Region, Region>> dependencies, Set<Region> remaining, Set<Region> visited) {
        if (visited.contains(region))
            return true
            
        visited.add(region)
        
        val deps = dependencies.filter[ key == region ]
        
        for (d : deps) {
            if (remaining.contains(d.value)) {
                if (!d.value.top(dependencies, remaining, visited) || remaining.contains(d.value)) {
                    return false                       
                }
            }
        }
        
        for (d : deps) {
            val r1 = d.key
            val r2 = d.value
            val p = r1.parentState
            val i1 = p.regions.indexOf(r1)
            val i2 = p.regions.indexOf(r2)
            if (i1 == -1 || i2 == -1) {
                throw new UnsupportedOperationException("Region sort encountered region on another level. This is not supported.") 
            }
            if (i2 < i1) {
                p.regions.remove(i1)
                p.regions.add(i2, r1)
            }
        }   
        
        remaining.remove(region)      
        
        return true
    }
}
