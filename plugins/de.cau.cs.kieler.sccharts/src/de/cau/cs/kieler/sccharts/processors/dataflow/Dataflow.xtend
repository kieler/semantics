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
import de.cau.cs.kieler.annotations.NamedObject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.IgnoreValue
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ScheduleDeclaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.sccharts.DataflowAssignment
import de.cau.cs.kieler.sccharts.DataflowReferenceCall
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsInheritanceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author ssm
 * @kieler.design 2017-10-19 proposed
 * @kieler.rating 2017-10-19 proposed yellow  
 */
class Dataflow extends SCChartsProcessor {
    
    // TODO consider activating by default
    // Will affect termination behavior if references are declared out of DF regions!
    public static val IProperty<Boolean> OO_MODE = 
        new Property<Boolean>("de.cau.cs.kieler.sccharts.processors.dataflow.oo", false)
    
    public static val IGNORE_ANNOTATION = "DFignore"
    public static val DF_BINDING = "_DF_keep_io_local"
    
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension SCChartsInheritanceExtensions
    @Inject extension SCChartsScopeExtensions
    
    
    extension SCChartsFactory sccFactory = SCChartsFactory.eINSTANCE
    
    static val GENERATED_PREFIX = "__df_"
    
    public static val ID = "de.cau.cs.kieler.sccharts.processors.dataflow"
    
    override getId() {
        ID
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
        if (OO_MODE.property || dataflowRegion.eAllContents.filter(ReferenceCall).exists[it.lowermostReference.valuedObject.declaration.isMethod]) {
            processDataflowRegionOO(dataflowRegion)
        } else {
            processDataflowRegionClassic(dataflowRegion)
        }
    }
    
    def processDataflowRegionOO(DataflowRegion dataflowRegion) {
        val removeList = <EObject> newLinkedList => [ add(dataflowRegion) ]
        val parentState = dataflowRegion.eContainer as State
        
        // Generate root region and main state.
        val newControlflowRegion = parentState.createControlflowRegion(GENERATED_PREFIX + dataflowRegion.name) => [ r |
            for (s : dataflowRegion.schedule) {
                r.schedule += s.copy
            }
            trace(dataflowRegion)
        ]
        val newMainState = newControlflowRegion.createState(GENERATED_PREFIX + "main") => [
            initial = true
            trace(dataflowRegion)
        ]
        if (dataflowRegion.once) {
            newControlflowRegion.createState(GENERATED_PREFIX + "done") => [
                final = true
                newMainState.createTerminationTo(it)
                trace(dataflowRegion)
            ]
            trace(dataflowRegion)
        } else { // Delayed restart
            newControlflowRegion.createState(GENERATED_PREFIX + "restart").trace(dataflowRegion) => [
                newMainState.createTransitionTo(it) => [ 
                    preemption = PreemptionType.TERMINATION
                    trace(dataflowRegion)
                ]
                it.createTransitionTo(newMainState).trace(dataflowRegion)
            ]
        }
        
        // Move declarations
        newMainState.declarations += dataflowRegion.declarations
        
        // Search for used referenced declarations.
        val rdEquationMappingForTracing = <ValuedObject, Assignment> newHashMap
        val rdInstances = <ValuedObject> newLinkedHashSet
        for (equation : dataflowRegion.equations.immutableCopy) {
            equation.allAssignmentReferences.filter[ 
                isReferenceDeclarationReference &&
                (it.valuedObject.eContainer as ReferenceDeclaration).extern.size == 0 &&
                !(it.valuedObject.eContainer as ReferenceDeclaration).hasAnnotation(IGNORE_ANNOTATION)
            ].forEach[
                rdInstances += it.valuedObject
                rdEquationMappingForTracing.put(it.valuedObject, equation)
            ]
        }
        
        // Tag them to issue IO interface to become local variables
        rdInstances.forEach[it.declaration.addTagAnnotation(DF_BINDING)]
        
        val schedules = dataflowRegion.createScheduleDeclaration(newMainState)
        var scheduleIndex = -1
        var schedulePriority = 0
        var lastSequential = false
        
        // Replace the equations and correct external references.
        for (eq : dataflowRegion.equations.immutableCopy.indexed) {
            val processedEquations = <Pair<Integer, Assignment>> newLinkedList
            
            // Process tuples.
            if (eq.value.expression instanceof VectorValue) {
                val vectorValues = eq.value.expression.asVectorValue.values
                val rdInstance = eq.value.reference.valuedObject
                
                var idx = 0
                if (rdInstance.isModelReference) {
                    val ref = rdInstance.referenceDeclaration.reference
                    val decls = newArrayList()
                    decls += ref.asDeclarationScope.declarations
                    if (ref instanceof State) {
                        decls += ref.allInheritedDeclarations
                    }
                    for (declaration : decls.filter(VariableDeclaration).filter[ input ]) {
                        for (valuedObject : declaration.valuedObjects) {
                            if (vectorValues.size > 0) {
                                // Remember: The expression will be removed from it's containment.
                                // Remove it afterwards.
                                val value = vectorValues.head
                                if (!(value instanceof IgnoreValue)) {
                                    val newAssignment = createAssignment(rdInstance, valuedObject, value).
                                        trace(rdEquationMappingForTracing.get(rdInstance))
                                    val newEq = new Pair<Integer, Assignment>(idx + eq.key * 100, newAssignment)
                                    processedEquations += newEq
                                } else {
                                    vectorValues.head.remove
                                }
                            }
                            idx++
                        }
                    }
                } else if (rdInstance.isArray) {
                    for (value : vectorValues.immutableCopy) {
                        if (!(value instanceof IgnoreValue)) {
                            val newAssignment = createAssignment(rdInstance, value).
                                trace(rdEquationMappingForTracing.get(rdInstance))
                            newAssignment.indices += createIntValue(idx)
                            val newEq = new Pair<Integer, Assignment>(idx + eq.key * 100, newAssignment)
                            processedEquations += newEq
                        }
                        idx++
                    }
                }
                
                removeList += vectorValues
                removeList += eq.value
            } else {
                processedEquations += eq
            }
            
            if (eq.value.isSequential && !lastSequential) {
                scheduleIndex += 1
                schedulePriority = 0
            }
            
            for (equation : processedEquations) {
                val assignment = equation.value
                val newEqCfRegion = 
                    newMainState.createControlflowRegion(GENERATED_PREFIX + "subRegion_" + equation.key).trace(dataflowRegion)

                if (eq.value.isSequential || lastSequential) {
                    newEqCfRegion.schedule +=
                        schedules.valuedObjects.get(scheduleIndex).createScheduleReference(schedulePriority)
                    schedulePriority += 1
                }
                val newEqState = newEqCfRegion.createState(GENERATED_PREFIX + "" + equation.key) => [ 
                    initial = true
                    trace(dataflowRegion)
                ]
                val newEqDelayState = newEqCfRegion.createState(GENERATED_PREFIX + "d" + equation.key).trace(dataflowRegion)
                val eqTrans = newEqState.createTransitionTo(newEqDelayState) => [ 
                    delay = DelayType.IMMEDIATE
                    trace(dataflowRegion)
                ]
                
                if (dataflowRegion.once) {
                    newEqDelayState.final = true           
                } else {
                    newEqDelayState.createTransitionTo(newEqState).trace(dataflowRegion)
                    newEqCfRegion.final = true
                }
                
                if (assignment instanceof DataflowReferenceCall) {
                    eqTrans.effects += createReferenceCallEffect() => [
                        it.annotations += assignment.annotations
                        it.schedule += assignment.schedule
                        it.parameters += assignment.parameters
                        it.valuedObject = assignment.valuedObject
                        it.subReference = assignment.subReference
                        it.indices += assignment.indices
                    ]
                    if (assignment.expression !== null) {
                        eqTrans.trigger = assignment.expression
                    }
                    removeList += assignment
                } else if (assignment instanceof DataflowAssignment) {
                    eqTrans.addAssignment(createAssignment() => [
                        it.annotations += assignment.annotations
                        it.schedule += assignment.schedule
                        it.reference = assignment.reference
                        it.expression = assignment.expression
                        it.operator = assignment.operator
                    ])
                    removeList += assignment
                } else {
                    eqTrans.addAssignment(assignment)
                }
            }
            lastSequential = eq.value.isSequential
        }
        
        // Remove df artifacts.
        for (r : removeList) {
            r.remove
        }
    }
    
    def processDataflowRegionClassic(DataflowRegion dataflowRegion) {
        val removeList = <EObject> newLinkedList => [ add(dataflowRegion) ]
        val parentState = dataflowRegion.eContainer as State
        
        // Generate root region and main state.
        val newControlflowRegion = parentState.createControlflowRegion(GENERATED_PREFIX + dataflowRegion.name) => [ r |
            for (s : dataflowRegion.schedule) {
                r.schedule += s.copy
            }
            trace(dataflowRegion)
        ]
        val newMainState = newControlflowRegion.createState(GENERATED_PREFIX + "main") => [
            initial = true
            trace(dataflowRegion)
        ]
        if (dataflowRegion.once) {
            newControlflowRegion.createState(GENERATED_PREFIX + "done") => [
                final = true
                newMainState.createTerminationTo(it)
                trace(dataflowRegion)
            ]
            trace(dataflowRegion)
        }
        for (declaration : dataflowRegion.declarations.immutableCopy) {
            newControlflowRegion.declarations += declaration
        }
        
        // Search for used referenced declarations.
        val rdEquationMappingForTracing = <ValuedObject, Assignment> newHashMap
        val rdInstances = <ValuedObject> newLinkedHashSet
        for (equation : dataflowRegion.equations.immutableCopy) {
            equation.allAssignmentReferences.filter[ 
                isReferenceDeclarationReference &&
                (it.valuedObject.eContainer as ReferenceDeclaration).extern.size == 0 &&
                !(it.valuedObject.eContainer as ReferenceDeclaration).hasAnnotation(IGNORE_ANNOTATION)
            ].forEach[
                rdInstances += it.valuedObject
                rdEquationMappingForTracing.put(it.valuedObject, equation)
            ]
        }
        
        // Create local version of the interface of the referenced states.
        // Additionally, store the mapping information, so that later references can be corrected.
        val referenceReplacements = <Pair<ValuedObject, ValuedObject>, ValuedObject> newHashMap
        for (kv : rdInstances.indexed) {
            val rdInstance = kv.value
            val rdInstanceIdx = kv.key
            val refDecl = rdInstance.referenceDeclaration
            val newRefCfRegion = 
                newMainState.createControlflowRegion(GENERATED_PREFIX + "refRegion_" + rdInstanceIdx).
                trace(rdEquationMappingForTracing.get(rdInstance))
            val newRefState = newRefCfRegion.createState(GENERATED_PREFIX + "" + rdInstanceIdx) => [ 
                initial = true
                reference = createScopeCall => [
                    parameters += refDecl.parameters.map[copy]
                    parameters += rdInstance.parameters
                ]
                trace(rdEquationMappingForTracing.get(rdInstance))
            ]
            val newRefDelayState = 
                newRefCfRegion.createState(GENERATED_PREFIX + "d" + rdInstanceIdx).
                trace(rdEquationMappingForTracing.get(rdInstance))
            newRefState.createTransitionTo(newRefDelayState) => [ 
                preemption = PreemptionType.TERMINATION
                trace(rdEquationMappingForTracing.get(rdInstance))
            ]
            newRefDelayState.createTransitionTo(newRefState).trace(rdEquationMappingForTracing.get(rdInstance))
            
            val ref = refDecl.reference
            newRefState.reference.target = ref as NamedObject
            newRefState.reference.genericParameters += (
                rdInstance.genericParameters.nullOrEmpty ? refDecl.genericParameters :rdInstance.genericParameters
            )?:emptyList.map[copy]
            
            val decls = newArrayList()
            decls += ref.asDeclarationScope.declarations
            if (ref instanceof State) {
                decls += ref.allInheritedDeclarations
            }
            // FIXME only for unbound variables
            // TODO Add validation for partial binding
            for (declaration : decls.filter(VariableDeclaration).filter[ input || output ]) {
                val localDeclaration = createVariableDeclaration(declaration.type).trace(declaration)
                if (declaration.type == ValueType.HOST) {
                    localDeclaration.hostType = declaration.hostType
                }
                
                for (valuedObject : declaration.valuedObjects) {
                    val localValuedObject = createValuedObject => [
                        name = GENERATED_PREFIX + "" + rdInstance.name + "_" + valuedObject.name
                        trace(valuedObject)
                    ]
                    localDeclaration.valuedObjects += localValuedObject
                    
                    newRefState.reference.parameters += createParameter => [ 
                        expression = localValuedObject.reference
                    ]
                    referenceReplacements.put(new Pair(rdInstance, valuedObject), localValuedObject)
                }
                
                if (!localDeclaration.valuedObjects.empty) {
                    rdInstance.getDeclarationScope.declarations += localDeclaration
                }
            }
        }

        val schedules = dataflowRegion.createScheduleDeclaration(newMainState)
        var scheduleIndex = -1
        var schedulePriority = 0
        var lastSequential = false
        
        // Replace the equations and correct external references.
        for (eq : dataflowRegion.equations.immutableCopy.indexed) {
            val processedEquations = <Pair<Integer, Assignment>> newLinkedList
            // Process tuples.
            if (eq.value.expression instanceof VectorValue) {
                val vectorValues = eq.value.expression.asVectorValue.values
                val rdInstance = eq.value.reference.valuedObject
                
                var idx = 0
                if (rdInstance.isModelReference) {
                    val ref = rdInstance.referenceDeclaration.reference
                    val decls = newArrayList()
                    decls += ref.asDeclarationScope.declarations
                    if (ref instanceof State) {
                        decls += ref.allInheritedDeclarations
                    }
                    for (declaration : decls.filter(VariableDeclaration).filter[ input ]) {
                        for (valuedObject : declaration.valuedObjects) {
                            if (vectorValues.size > 0) {
                                // Remember: The expression will be removed from it's containment.
                                // Remove it afterwards.
                                val value = vectorValues.head
                                if (!(value instanceof IgnoreValue)) {
                                    val newAssignment = createAssignment(rdInstance, valuedObject, value).
                                        trace(rdEquationMappingForTracing.get(rdInstance))
                                    val newEq = new Pair<Integer, Assignment>(idx + eq.key * 100, newAssignment)
                                    processedEquations += newEq
                                } else {
                                    vectorValues.head.remove
                                }
                            }
                            idx++
                        }
                    }
                } else if (rdInstance.isArray) {
                    for (value : vectorValues.immutableCopy) {
                        if (!(value instanceof IgnoreValue)) {
                            val newAssignment = createAssignment(rdInstance, value).
                                trace(rdEquationMappingForTracing.get(rdInstance))
                            newAssignment.indices += createIntValue(idx)
                            val newEq = new Pair<Integer, Assignment>(idx + eq.key * 100, newAssignment)
                            processedEquations += newEq
                        }
                        idx++
                    }
                }
                
                removeList += vectorValues
                removeList += eq.value
            } else {
                processedEquations += eq
            }
            
            if (eq.value.isSequential && !lastSequential) {
                scheduleIndex += 1
                schedulePriority = 0
            }
            
            for (equation : processedEquations) {
                val newEqCfRegion = newMainState.createControlflowRegion(GENERATED_PREFIX + "subRegion_" + equation.key).
                    trace(dataflowRegion)
                if (eq.value.isSequential || lastSequential) {
                    newEqCfRegion.schedule +=
                        schedules.valuedObjects.get(scheduleIndex).createScheduleReference(schedulePriority)
                    schedulePriority += 1
                }
                val newEqState = newEqCfRegion.createState(GENERATED_PREFIX + "" + equation.key) => [ 
                    initial = true
                    trace(dataflowRegion)
                ]
                val newEqDelayState = newEqCfRegion.createState(GENERATED_PREFIX + "d" + equation.key).
                    trace(dataflowRegion)
                val eqTrans = newEqState.createTransitionTo(newEqDelayState) => [ 
                    delay = DelayType.IMMEDIATE
                    trace(dataflowRegion)
                ]
                if (dataflowRegion.once) {
                    newEqDelayState.final = true                    
                } else {
                    newEqDelayState.createTransitionTo(newEqState).
                        trace(dataflowRegion)
                }
                
                var assignment = createAssignment => [ a |
                    a.reference = equation.value.reference?.copy
                    a.operator = equation.value.operator
                    a.expression = equation.value.expression.copy
                ]
                eqTrans.addAssignment(assignment)
                for (reference : assignment.allAssignmentReferences.filter[ isReferenceDeclarationReference ].toList) {
                    if (reference.subReference !== null) {
                        val refPair = new Pair<ValuedObject, ValuedObject>(reference.valuedObject, reference.subReference.valuedObject)
                        val replacement = referenceReplacements.get(refPair)
                        if (replacement !== null) {
                            reference.valuedObject = replacement
                            reference.subReference = null
                        }
                    }
                }
            }
            lastSequential = eq.value.isSequential
        }
        
        // Remove df artifacts.
        for (r : removeList) {
            r.remove
        }
        for (rdInstance : rdInstances) {
            rdInstance.removeFromContainmentAndCleanup
        }
    }
    

    def ScheduleDeclaration createScheduleDeclaration(DataflowRegion r, State parent) {
        var number = 0
        var lastSeq = false
        for (eq : r.equations) {
            if (!lastSeq && eq.isSequential) {
                number += 1
            }
            lastSeq = eq.isSequential
        }
        if (number > 0) {
            val schedule = createScheduleDeclaration
            for (var i = 0; i < number; i++) {
                schedule.valuedObjects += createValuedObject("seq" + i).uniqueName
            }
            parent.declarations += schedule
            return schedule
        }
        return null
    }
}
