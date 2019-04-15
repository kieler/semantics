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

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.kexpressions.keffects.dependencies.ValuedObjectAccessors
import de.cau.cs.kieler.kexpressions.keffects.dependencies.ForkStack
import java.util.Set
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsDependencyExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.keffects.ControlDependency
import de.cau.cs.kieler.kicool.processors.dependencies.TarjanLinkable
import de.cau.cs.kieler.kicool.processors.dependencies.LoopDataLinkable
import de.cau.cs.kieler.kexpressions.keffects.Linkable
import java.util.List
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kicool.processors.dependencies.ITarjanFilter

/**
 * @author ssm
 * @kieler.design 2019-03-14-23-26 proposed
 * @kieler.rating 2019-03-14-23-26 proposed yellow  
 */
class ControlDependencies extends StateDependencies implements ITarjanFilter {
    
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension KEffectsDependencyExtensions
    @Inject extension TarjanLinkable
    
    public static val IProperty<Boolean> DO_TARJAN = 
        new Property<Boolean>("de.cau.cs.kieler.sccharts.dataflow.tarjan", true)        
    public static val IProperty<LoopDataLinkable> LOOP_DATA = 
        new Property<LoopDataLinkable>("de.cau.cs.kieler.kicool.processors.dependencies.data", null)   
    public static val IProperty<Boolean> LOOP_DATA_PERSISTENT = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.processors.dependencies.data.persistent", false)          
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.controlDependencies"
    }
    
    override getName() {
        "Control Dependencies"
    }
    
    override process() {
        super.process()
        environment.setProperty(STATE_DEPENDENCIES, false)
        
        if (environment.getProperty(DO_TARJAN)) {
            val loopData = new LoopDataLinkable(environment.getProperty(LOOP_DATA_PERSISTENT))
            getModel.findSCCs(loopData, this)
            environment.setProperty(LOOP_DATA, loopData)
            for(loop : loopData.loops) {
                println("Loop")
                for(n : loop.criticalNodes) {
                    println("  " + n)
                }
                println("")
            }
        }
        
        for(d : dependencies.filter(DataDependency).toList) {
            val scfr = d.eContainer.getFirstControlflowRegion
            val tcfr = d.target.getFirstControlflowRegion
            scfr.outgoingLinks += d
            d.target = tcfr
       } 
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
        
    override getLinkableNodes(EObject rootObject) {
        rootObject.eAllContents.filter(Linkable).toList
    }
    
    override filterNeighbors(Linkable node, List<Linkable> neighborList) {
        val directLinks = node.getOutgoingLinks.map[ target ]
        val nestedLinks = node.eAllContents.filter(DataDependency).map[ target ].toList
        neighborList.addAll(directLinks)
        neighborList.addAll(nestedLinks)
    }
    
}
