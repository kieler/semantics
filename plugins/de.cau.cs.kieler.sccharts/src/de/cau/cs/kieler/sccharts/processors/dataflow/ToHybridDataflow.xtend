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
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.core.model.Pair
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.IgnoreValue
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.kexpressions.keffects.dependencies.AbstractDependencyAnalysis
import de.cau.cs.kieler.kexpressions.keffects.dependencies.LinkableInterfaceData
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsReplacementExtensions
import de.cau.cs.kieler.kexpressions.keffects.Linkable
import de.cau.cs.kieler.sccharts.Region
import java.util.List
import de.cau.cs.kieler.kexpressions.keffects.Dependency
import java.util.Map
import com.google.common.collect.Multimap
import com.google.common.collect.HashMultimap

/**
 * @author ssm
 * @kieler.design 2018-05-16 proposed
 * @kieler.rating 2018-05-16 proposed yellow  
 */
class ToHybridDataflow extends SCChartsProcessor {
    
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsReplacementExtensions
    
    extension SCChartsFactory sccFactory = SCChartsFactory.eINSTANCE
    
    static val GENERATED_PREFIX = "__tdf_"
    
    var regionCounter = 0
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.toHybridDataflow"
    }
    
    override getName() {
        "Hybrid Dataflow"
    }
    
    override process() {
        val lid = environment.getProperty(AbstractDependencyAnalysis.LINKABLE_INTERFACE_DATA)
        if (lid === null) {
            environment.errors.add("This processor must succeed the region dependency processor.")
            return
        }
        
        val lcafMap = environment.getProperty(RegionDependencies.REGION_LCAF_MAP) 
        
        val model = getModel
        for (subModel : model.rootStates.immutableCopy) {
            val dependencies = subModel.eAllContents.filter(Linkable).map[ outgoingLinks ].toList.flatten.filter(DataDependency).toList
            val Multimap<Region, Dependency> lrSourceMap =  HashMultimap.create
            val Multimap<Region, Dependency> lrTargetMap =  HashMultimap.create
            for (d : dependencies) {
                val lr = lcafMap.levelRegions(d)
                lrSourceMap.put(lr.first, d)
                lrTargetMap.put(lr.second, d)
            }
            
            subModel.processSuperState(model, lid, lrSourceMap, lrTargetMap)  
        }
    }
    
    def processSuperState(State state, SCCharts scc, LinkableInterfaceData lid, 
        Multimap<Region, Dependency> lrSourceMap, Multimap<Region, Dependency> lrTargetMap) 
    {
        val cfrs = state.regions.filter(ControlflowRegion).toList
        val dfr = createDataflowRegion(state.name) => [ state.regions += it ]
        val localVariables = <ValuedObject> newLinkedList
         
        for (cfr : cfrs.immutableCopy) {
            val stateName = if (cfr.name.nullOrEmpty) GENERATED_PREFIX + regionCounter++ else cfr.name
            val rootState = createState(stateName).uniqueName
            scc.rootStates += rootState
            rootState.regions += cfr
            
            
            val stateReference = createValuedObject(rootState.name)
            val refDecl = createReferenceDeclaration => [ 
                state.declarations += it
                reference = rootState
                valuedObjects += stateReference
            ]
            
            
            
//            val incomingDependencies = cfr.incomingLinks.filter(DataDependency).filter[ reference !== null ].toList
            val incomingDependencies = lrTargetMap.get(cfr).filter[ reference !== null ].toList
            val incomingDirectAccess = lid.filter[ linkable == cfr && directInputAccess && !isWriteAccess && !incomingDependencies.contains(valuedObject) ].toList
            val incomingValuedObjects = incomingDependencies.map[ reference ].filter(ValuedObject).toList +
//                incomingDependencies2.map[ reference ].filter(ValuedObject).toList +
                incomingDirectAccess.map[ valuedObject ].toList
            
            for (vo : incomingValuedObjects.toSet) {
                val newVO = createValuedObject(vo.name)
                createVariableDeclaration(vo.getVariableDeclaration.type) => [ 
                    input = true
                    valuedObjects += newVO
                    rootState.declarations += it
                ]
                cfr.replace(vo, newVO)
                
                val dfass = createAssignment(stateReference, newVO, vo.reference)
                dfr.equations += dfass
                
                if (vo.local) localVariables += vo 
            } 



//            val outgoingDependencies = cfr.outgoingLinks.filter(DataDependency).filter[ reference !== null ].toList
            val outgoingDependencies = lrSourceMap.get(cfr).filter[ reference !== null ].toList
            val outgoingDirectAccess = lid.filter[ linkable == cfr && directOutputAccess && isWriteAccess && !outgoingDependencies.contains(valuedObject) ].toList
            val outgoingValuedObjects = outgoingDependencies.map[ reference ].filter(ValuedObject).toList + 
                outgoingDirectAccess.map[ valuedObject ].toList
            
            for (vo : outgoingValuedObjects.toSet) {
                val newVO = createValuedObject(vo.name)
                createVariableDeclaration(vo.getVariableDeclaration.type) => [ 
                    output = true
                    valuedObjects += newVO
                    rootState.declarations += it
                ]
                cfr.replace(vo, newVO)
                
                val dfass = createAssignment(vo, stateReference.reference => [ subReference = newVO.reference ])
                dfr.equations += dfass
                
                if (vo.local) localVariables += vo 
            } 
                        
            snapshot
        }
        
        for (vo : localVariables) {
            if (vo.declaration.eContainer === state) {
                dfr.declarations += vo.declaration
            }
        }
    }
    
}
