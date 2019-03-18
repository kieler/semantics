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
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kexpressions.keffects.Linkable
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsDependencyExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.keffects.dependencies.ValuedObjectIdentifier
import de.cau.cs.kieler.kexpressions.keffects.dependencies.ValuedObjectAccess
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kicool.classes.ImmutableCloneable
import de.cau.cs.kieler.kicool.processors.dependencies.AbstractDependencyAnalysis
import de.cau.cs.kieler.sccharts.Action

/**
 * @author ssm
 * @kieler.design 2018-05-16 proposed
 * @kieler.rating 2018-05-16 proposed yellow  
 */
class RegionDependencies extends AbstractDependencyAnalysis<SCCharts, State> {
    
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension KEffectsDependencyExtensions
    
    extension SCChartsFactory sccFactory = SCChartsFactory.eINSTANCE
    
    public static val IProperty<ImmutableCloneable<SCCharts>> REGION_DEPENDENCIES = 
        new Property<ImmutableCloneable<SCCharts>>("de.cau.cs.kieler.sccharts.dataflow.regionDependencies", null)    
    
    public static val IProperty<RegionLCAFMap> REGION_LCAF_MAP = 
        new Property<RegionLCAFMap>("de.cau.cs.kieler.sccharts.dataflow.regionLCAFMap", new RegionLCAFMap)    
    
    static val GENERATED_PREFIX = "__tdf_"
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.regionDependencies"
    }
    
    override getName() {
        "Region Dependencies"
    }
    
    override process() {
        super.process()
        environment.setProperty(REGION_DEPENDENCIES, new ImmutableCloneable<SCCharts>(targetModel))
        environment.getProperty(REGION_LCAF_MAP).setOriginal
//        getModel.pragmas += REGION_DEPENDENCIES.createPragmaTag 
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
        return eObject.getFirstControlflowRegion
    } 
    
    override protected DataDependency createDependency(Linkable source, Linkable target) {
        val scfr = source.getFirstControlflowRegion
        val tcfr = target.getFirstControlflowRegion
        return scfr.createDataDependency(tcfr)
    }
    
    override protected postProcessDependency(DataDependency dependency, ValuedObjectIdentifier valuedObjectIdentifier, ValuedObjectAccess source, ValuedObjectAccess target) {
        val lcafMap = environment.getProperty(REGION_LCAF_MAP)
        
        val lcaf = getLeastCommonAncestorFork(source, target) as State   
        
        lcafMap.put(dependency, lcaf)   
    }
    

    
    override protected void searchDependencies(State subModel, ValuedObjectAccessors valuedObjectAccessors) {
        if (!subModel.isSuperstate)  
            throw new UnsupportedOperationException("A simple state cannot have any region dependencies.")
        
        val forkStack = new ForkStack
        val visited = <EObject> newHashSet
        
        subModel.searchDependenciesInSuperstate(forkStack, visited, valuedObjectAccessors)
    }
    
    protected def void searchDependenciesInSuperstate(State superstate, ForkStack forkStack, Set<EObject> visited, 
        ValuedObjectAccessors valuedObjectAccessors) {
            
        if (visited.contains(superstate)) return;
    
        forkStack.push(superstate)
        visited += superstate
        
        for (cfr : superstate.regions.filter(ControlflowRegion).toList) {
            cfr.searchDependenciesInControlflowRegion(forkStack, visited, valuedObjectAccessors)
        }
        
        forkStack.pop                
    }
    
    protected def void searchDependenciesInControlflowRegion(ControlflowRegion cfr, ForkStack forkStack, Set<EObject> visited, 
        ValuedObjectAccessors valuedObjectAccessors) {
            
        if (visited.contains(cfr)) return;
    
        forkStack.push(cfr)
        visited += cfr
        
        for (state : cfr.states) {
            for (transition : state.outgoingTransitions) {
                transition.processAction(forkStack, valuedObjectAccessors)
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
    
    protected def void processAction(Action action, ForkStack forkStack, 
        ValuedObjectAccessors valuedObjectAccessors) {
            
        if (action.trigger !== null) {
            action.processExpressionReader(action.trigger, forkStack, valuedObjectAccessors)
        }
        
        for (effect : action.effects) {
            if (effect instanceof Assignment) {
                effect.processAssignment(forkStack, valuedObjectAccessors)
            }
        }            
    }
    
}
