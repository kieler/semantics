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
package de.cau.cs.kieler.sccharts.processors.transformators

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor

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

/**
 * @author ssm
 * @kieler.design 2017-10-19 proposed
 * @kieler.rating 2017-10-19 proposed yellow  
 */
class Dataflow extends SCChartsProcessor {
    
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions
    
    extension SCChartsFactory sccFactory = SCChartsFactory.eINSTANCE
    
    static val GENERATED_PREFIX = "__df_"
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.transformators.dataflow"
    }
    
    override getName() {
        "Dataflow V2"
    }
    
    override process() {
        
    }
    
    def processState(State state) {
        for (df : state.eAllContents.filter(DataflowRegion).toList) {
            df.processDataflowRegion
            
            snapshot
        }
    }
    
    def processDataflowRegion(DataflowRegion dataflowRegion) {
        val removeList = <EObject> newLinkedList => [ add(dataflowRegion) ]
        val parentState = dataflowRegion.eContainer as State
        
        // Generate root region and main state.
        val newControlflowRegion = parentState.createControlflowRegion(GENERATED_PREFIX + dataflowRegion.name)
        val newMainState = newControlflowRegion.createState(GENERATED_PREFIX + "main") => [
            initial = true
        ]
        for (declaration : dataflowRegion.declarations.immutableCopy) {
            newControlflowRegion.declarations += declaration
        }
        
        // Search for used referenced declarations.
        val rdInstances = <ValuedObject> newLinkedHashSet
        for (equation : dataflowRegion.equations.immutableCopy) {
            equation.allAssignmentReferences.filter[ isReferenceDeclarationReference ].forEach[
                rdInstances += it.valuedObject
            ]
        }
        
        // Create local version of the interface of the referenced states.
        // Additionally, store the mapping information, so that later references can be corrected.
        val referenceReplacements = <Pair<ValuedObject, ValuedObject>, ValuedObject> newHashMap
        for (rdInstance : rdInstances.indexed) {
            val newRefCfRegion = newMainState.createControlflowRegion(GENERATED_PREFIX + "refRegion_" + rdInstance.key)
            val newRefState = newRefCfRegion.createState(GENERATED_PREFIX + "" + rdInstance.key) => [ 
                initial = true
                reference = createScopeCall
            ]
            val newRefDelayState = newRefCfRegion.createState(GENERATED_PREFIX + "d" + rdInstance.key)
            newRefState.createTransitionTo(newRefDelayState) => [ preemption = PreemptionType.TERMINATION  ]
            newRefDelayState.createTransitionTo(newRefState)
            
            newRefState.reference.scope = rdInstance.value.referenceDeclaration.reference as Scope
            for (declaration : rdInstance.value.referenceDeclaration.reference.asDeclarationScope.declarations.filter(VariableDeclaration).filter[ input || output ]) {
                val localDeclaration = createVariableDeclaration(declaration.type)
                
                for (valuedObject : declaration.valuedObjects) {
                    val localValuedObject = createValuedObject => [
                        name = GENERATED_PREFIX + "" + rdInstance.value.name + "_" + valuedObject.name
                    ]
                    localDeclaration.valuedObjects += localValuedObject
                    
                    newRefState.reference.parameters += createParameter => [ expression = localValuedObject.reference ]
                    referenceReplacements.put(new Pair(rdInstance.value, valuedObject), localValuedObject)
                }
                
                rdInstance.value.getDeclarationScope.declarations += localDeclaration
            }
        }
        
        // Replace the equations and correct external references.
        for (equation : dataflowRegion.equations.immutableCopy.indexed) {
            val newEqCfRegion = newMainState.createControlflowRegion(GENERATED_PREFIX + "subRegion_" + equation.key)
            val newEqState = newEqCfRegion.createState(GENERATED_PREFIX + "" + equation.key) => [ initial = true ]
            val newEqDelayState = newEqCfRegion.createState(GENERATED_PREFIX + "d" + equation.key)
            val eqTrans = newEqState.createTransitionTo(newEqDelayState) => [ delay = DelayType.IMMEDIATE]
            newEqDelayState.createTransitionTo(newEqState)
            
            eqTrans.addAssignment(equation.value)
            for (reference : equation.value.allAssignmentReferences.filter[ isReferenceDeclarationReference ].toList) {
                val refPair = new Pair<ValuedObject, ValuedObject>(reference.valuedObject, reference.subReference.valuedObject)
                val replacement = referenceReplacements.get(refPair)
                if (replacement != null) {
                    reference.valuedObject = replacement
                    reference.subReference = null
                }
            }
        }
        
        // Remove df artifacts.
        for (r : removeList) {
            r.remove
        }
        for (rdInstance : rdInstances) {
            rdInstance.removeFromContainmentAndCleanup
        }
    }
    
}
