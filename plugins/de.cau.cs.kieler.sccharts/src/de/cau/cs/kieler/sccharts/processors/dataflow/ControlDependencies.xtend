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
import de.cau.cs.kieler.sccharts.State

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.kexpressions.keffects.dependencies.ValuedObjectAccessors
import de.cau.cs.kieler.kexpressions.keffects.dependencies.ForkStack
import java.util.Set
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kexpressions.keffects.Linkable
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsDependencyExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.keffects.dependencies.ValuedObjectIdentifier
import de.cau.cs.kieler.kexpressions.keffects.dependencies.ValuedObjectAccess
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kicool.classes.ImmutableCloneable
import de.cau.cs.kieler.kicool.processors.AbstractDependencyAnalysis
import de.cau.cs.kieler.kexpressions.keffects.ControlDependency

/**
 * @author ssm
 * @kieler.design 2019-03-14-23-26 proposed
 * @kieler.rating 2019-03-14-23-26 proposed yellow  
 */
class ControlDependencies extends StateDependencies {
    
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension KEffectsDependencyExtensions
    
    extension SCChartsFactory sccFactory = SCChartsFactory.eINSTANCE
    
    public static val IProperty<Boolean> STATE_DEPENDENCIES = 
        new Property<Boolean>("de.cau.cs.kieler.sccharts.dataflow.stateDependencies", false)        
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.controlDependencies"
    }
    
    override getName() {
        "Control Dependencies"
    }
    
    override process() {
        super.process()
        environment.setProperty(STATE_DEPENDENCIES, true)
    }
    
    override void searchDependenciesInControlflowRegion(ControlflowRegion cfr, ForkStack forkStack, Set<EObject> visited, 
        ValuedObjectAccessors valuedObjectAccessors) {
            
        if (visited.contains(cfr)) return;
    
        forkStack.push(cfr)
        visited += cfr
        
        for (state : cfr.states) {
            for (transition : state.outgoingTransitions) {
                transition.processAction(forkStack, valuedObjectAccessors)
                
                for (tsAction : transition.targetState.outgoingTransitions) {
                    if (!transition.outgoingLinks.exists[ it instanceof ControlDependency && it.target == tsAction]) {
                        transition.createControlDependency(tsAction)
                    }
                }
            }    
            
            if (state.isSuperstate) {
                state.searchDependenciesInSuperstate(forkStack, visited, valuedObjectAccessors)
                for (act : state.actions) {
                    act.processAction(forkStack, valuedObjectAccessors)            
                }
            }           
        }
        
        forkStack.pop
    }    
    
}
