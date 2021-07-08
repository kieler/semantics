/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.dataflow

import com.google.inject.Inject
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kexpressions.keffects.Linkable
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsDependencyExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import org.eclipse.emf.ecore.EObject

/**
 * @author ssm
 * @kieler.design 2018-07-30 proposed
 * @kieler.rating 2018-07-30 proposed yellow  
 */
class StateDependencies extends RegionDependencies {
    
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension KEffectsDependencyExtensions
    
    extension SCChartsFactory sccFactory = SCChartsFactory.eINSTANCE
    
    public static val IProperty<Boolean> STATE_DEPENDENCIES = 
        new Property<Boolean>("de.cau.cs.kieler.sccharts.dataflow.stateDependencies", false)        
    
    static val GENERATED_PREFIX = "__tdf_"
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.stateDependencies"
    }
    
    override getName() {
        "State Dependencies"
    }
    
    override process() {
        super.process()
        environment.setProperty(STATE_DEPENDENCIES, true)
    }
    
    override getSubModels(SCCharts rootModel) {
        return rootModel.rootStates
    }
    
    override protected getConcurrentForkFilter() {
        return [ State.isInstance(it) && (it as State).isSuperstate ]
    }
    
    override protected getThreadEntryClass() {
        return typeof(ControlflowRegion)
    }
    
    override protected Linkable association(EObject eObject) {
        return eObject as Linkable
    } 
    
    override protected DataDependency createDependency(Linkable source, Linkable target) {
        val scfr = source
        val tcfr = target
        return scfr.createDataDependency(tcfr) => [
            originalSource = source
            originalTarget = target
        ]
    }
    

}
