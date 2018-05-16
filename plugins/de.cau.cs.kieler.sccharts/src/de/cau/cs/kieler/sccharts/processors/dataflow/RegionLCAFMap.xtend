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

import java.util.HashMap
import de.cau.cs.kieler.kexpressions.keffects.Dependency
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.core.model.Pair
import de.cau.cs.kieler.sccharts.State

/**
 * The Region-LCAF mapping stores dependency least common ancestor fork (lcaf) data.
 * It implements the {@link IKiCoolCloneable} interface so that the data can be stored in processor environments. 
 * 
 * @author ssm
 * @kieler.design 2018-05-17 proposed
 * @kieler.rating 2018-05-17 proposed yellow  
 *
 */
class RegionLCAFMap extends HashMap<Dependency, State> implements IKiCoolCloneable {
    
    extension SCChartsControlflowRegionExtensions cfgExt = new SCChartsControlflowRegionExtensions
    
    override isMutable() {
        true
    }
    
    override cloneObject() {
        new RegionLCAFMap => [
            it.putAll(this)
        ]
    }
    
    override void resolveCopiedObjects(Copier copier) {
        val resolved = new RegionLCAFMap
        for (key : keySet) {
            val dependency = copier.get(key) as Dependency
            val state = copier.get(key.get) as State
            resolved.put(dependency, state)
        } 
        this.clear
        this.putAll(resolved)
    }     
    
    /** levelRegions retrieves the ancestor regions that share a least common ancestor fork of the source and the
     *  target of a dependency.  
     * */
    def Pair<Region, Region> levelRegions(Dependency dependency) {
        val sourceRegion = dependency.eContainer as ControlflowRegion
        val targetRegion = dependency.target as ControlflowRegion
        val lcaf = dependency.get
        
        // If a lcaf exists, we can retrieve the ancester regions.
        if (lcaf !== null) {
            val sourceRegion2 = sourceRegion.ancestorRegion(lcaf) as ControlflowRegion
            val targetRegion2 = targetRegion.ancestorRegion(lcaf) as ControlflowRegion
            
            if (sourceRegion2 === null) {
                throw new UnsupportedOperationException("source region ancestor region is null! " + sourceRegion2)
            }
            if (targetRegion2 === null) {
                throw new UnsupportedOperationException("source region ancestor region is null! " + sourceRegion2)
            }
            
            return new Pair<Region, Region>(sourceRegion2, targetRegion2)
        }
        
        return new Pair<Region, Region>(sourceRegion, targetRegion)
    }    
    
}