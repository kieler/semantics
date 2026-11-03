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
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.kicool.classes.ITypedKiCoolCloneable
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.kexpressions.keffects.Linkable

/**
 * The Region-LCAF mapping stores dependency least common ancestor fork (lcaf) data.
 * It implements the {@link IKiCoolCloneable} interface so that the data can be stored in processor environments. 
 * 
 * @author ssm
 * @kieler.design 2018-05-17 proposed
 * @kieler.rating 2018-05-17 proposed yellow  
 *
 */
class RegionLCAFMap extends HashMap<Dependency, State> implements ITypedKiCoolCloneable<RegionLCAFMap> {
    
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
    def Pair<Linkable, Linkable> levelRegions(Dependency dependency) {
        var source = dependency.eContainer as Linkable
        var target = dependency.target
        val lcaf = dependency.get

        if (lcaf !== null) {
            // If a lcaf exists, we can retrieve the ancestor regions.
            if (source instanceof ControlflowRegion) {
                val sourceRegion = source.ancestorRegion(lcaf) as ControlflowRegion
                if (sourceRegion === null) {
                    throw new UnsupportedOperationException("source region ancestor region is null! " + sourceRegion)
                }
                source = sourceRegion
            } else if (source instanceof DuringAction) {
                val sourceContainer = source.eContainer
                val source2 = if (lcaf == sourceContainer) {
                        source
                    } else if (sourceContainer instanceof State) {
                        sourceContainer.parentRegion.ancestorRegion(lcaf)
                    } else if (sourceContainer instanceof Region) {
                        sourceContainer.ancestorRegion(lcaf)
                    }

                if (source2 === null) {
                    throw new UnsupportedOperationException("source action ancestor region is null! " + source)
                }
                source = source2
            } else {
                throw new UnsupportedOperationException(
                    "source is neither ControlflowRegion nor During Action, which is unsupported! " + source)
            }

            if (target instanceof ControlflowRegion) {
                val targetRegion = target.ancestorRegion(lcaf) as ControlflowRegion
                if (targetRegion === null) {
                    throw new UnsupportedOperationException("source region ancestor region is null! " + targetRegion)
                }
                target = targetRegion
            } else if (target instanceof DuringAction) {
                val targetContainer = target.eContainer
                val target2 = if (lcaf == targetContainer) {
                        source
                    } else if (targetContainer instanceof State) {
                        targetContainer.parentRegion.ancestorRegion(lcaf)
                    } else if (targetContainer instanceof Region) {
                        targetContainer.ancestorRegion(lcaf)
                    }

                if (target2 === null) {
                    throw new UnsupportedOperationException("source action ancestor region is null! " + source)
                }
                target = target2
            } else {
                throw new UnsupportedOperationException(
                    "source is neither ControlflowRegion nor During Action, which is unsupported! " + source)
            }
        }

//        if (lcaf !== null) {
//            val sourceRegion2 = sourceRegion.ancestorRegion(lcaf) as ControlflowRegion
//            val targetRegion2 = targetRegion.ancestorRegion(lcaf) as ControlflowRegion
//            
//            if (sourceRegion2 === null) {
//                throw new UnsupportedOperationException("source region ancestor region is null! " + sourceRegion2)
//            }
//            if (targetRegion2 === null) {
//                throw new UnsupportedOperationException("source region ancestor region is null! " + sourceRegion2)
//            }
//            
//            return new Pair<Region, Region>(sourceRegion2, targetRegion2)
//        }
        return new Pair<Linkable, Linkable>(source, target)
    }    
    
    
    private val persistedOriginal = <Dependency, State> newHashMap
    
    override getOriginalObject() {
        new RegionLCAFMap => [
            putAll(persistedOriginal)
        ]
    }
    
    def setOriginal() {
        persistedOriginal.putAll(this)
    }
}