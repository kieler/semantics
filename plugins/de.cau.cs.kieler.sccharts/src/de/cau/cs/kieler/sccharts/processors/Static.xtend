/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.kexpressions.ValuedObjectReference

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * SCCharts Static Transformation.
 * 
 * @author cmot ssm
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 * 
 * ssm, 03.05.18: added global 
 */
class Static extends SCChartsProcessor implements Traceable {

    override getId() {
        "de.cau.cs.kieler.sccharts.processors.static"
    }
    
    override getName() {
        "Static"
    }
 
    override process() {
        setModel(model.transform)
    }


//    override getExpandsFeatureId() {
//        return SCChartsFeature::STATIC_ID
//    }
//
//    override getProducesFeatureIds() {
//        return Sets.newHashSet(SCChartsFeature::INITIALIZATION_ID)
//    }
//
//    override getNotHandlesFeatureIds() {
//        return Sets.newHashSet(SCChartsFeatureGroup::EXPANSION_ID)
//    }

    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension KExpressionsDeclarationExtensions
    
    // This prefix is used for naming of all generated signals, states and regions
    static val String GENERATED_PREFIX = "_"

    // -------------------------------------------------------------------------
    // --                          S T A T I C                                --
    // -------------------------------------------------------------------------
    // In some local superstate M that has a declaration of a static variable x, move the
    // declaration of the variable to the root state of the SCChart and rename x respecting
    // a proper unique and qualified naming. Within the scope of x (within M) update all
    // references (accesses) to x to the new name. Remove the static keyword from the declaration.
    // This is applied for all superstates that contain static variable declarations.
    //
    def State transform(State rootState) {
        // Traverse all states
        for (targetTransition : rootState.getAllStates.toList) {
            targetTransition.transformStatic(rootState)
        }
        rootState
    }

    def void transformStatic(State state, State targetRootState) {
        val staticDeclarations = state.variableDeclarations.filter[ isStatic ]
        for (staticDeclaration : staticDeclarations.toList) {
            for (staticValuedObject : staticDeclaration.valuedObjects) {
                staticValuedObject.setName(state.getHierarchicalName(GENERATED_PREFIX) + GENERATED_PREFIX +
                    staticValuedObject.name)
                voStore.update(staticValuedObject)
            }
            staticDeclaration.static = false
            targetRootState.declarations += staticDeclaration
        }
        
        val globalDeclarations = state.variableDeclarations.filter[ isGlobal ]
        if (!globalDeclarations.empty) {
            
            for (globalDeclaration : globalDeclarations.toList) {
                for (valuedObject : globalDeclaration.valuedObjects.immutableCopy) {
                    val existing = targetRootState.declarations.map[ valuedObjects ].flatten.findFirst[ name == valuedObject.name ]
                    if (existing === null) {
                        targetRootState.declarations += createVariableDeclaration(globalDeclaration) => [
                            global = false
                            valuedObjects += valuedObject
                        ]
                        voStore.update(valuedObject)
                    } else {
                        val references = state.eAllContents.filter(ValuedObjectReference).filter[ it.valuedObject === valuedObject ].toList
                        for (reference : references) {
                            reference.valuedObject = existing
                        }
                        valuedObject.remove
                        voStore.remove(valuedObject)
                    }
                }
                
                if (globalDeclaration.valuedObjects.nullOrEmpty) {
                    globalDeclaration.remove
                }
            }
               
        }
    }
    
    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }
    

}
