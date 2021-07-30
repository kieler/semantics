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
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsAccessVisibilityExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import java.util.List

import static de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * SCCharts Initialization Transformation.
 * 
 * @author cmot ssm
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Initialization extends SCChartsProcessor implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.initialization"
    }
    
    override getName() {
        "Initialization"
    }
 
    override process() {
        setModel(model.transform)
    }

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }

    //-------------------------------------------------------------------------
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions 
    @Inject extension KExpressionsAccessVisibilityExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension AnnotationsExtensions
    
    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"
    
    public static val IProperty<Boolean> EXPLICIT_IMPLICIT_INIT = 
        new Property<Boolean>("de.cau.cs.kieler.sccharts.processors.initialization.implicit", true)

    //-------------------------------------------------------------------------
    //--                       I N I T I A L I Z A T I O N                   --
    //-------------------------------------------------------------------------
    // @requires: entry actions
    // Transforming Variable Initializations
    def State transform(State rootState) {
        // Traverse all states
        for (scope : rootState.getAllScopes.toList) {
            if (getProperty(EXPLICIT_IMPLICIT_INIT)) {
                scope.implicitInitialization()
            }
            scope.transformInitialization(rootState)
        }
        rootState
    }

    // Traverse all states and transform macro states that have actions to transform
    def void transformInitialization(Scope scope, State targetRootState) {
        val initVOs = <List<ValuedObject>>newArrayList
        // Find VO that need to be initialized
        for (decl : scope.declarations) {
            if (decl instanceof ClassDeclaration) {
                if (decl.host) {    
                    val vos = decl.valuedObjects.filter[initialValue instanceof TextExpression]
                    if (!vos.empty) {
                        initVOs += vos.map[newArrayList(it)]
                        vos.forEach[it.addTagAnnotation("skipClassInit")] // FIXME magic keyword affects code generation
                    }
                } else {
                    for (nestedVO : decl.allNestedValuedObjects.filter[initialValue !== null]) {
                        // Calculate paths to all initialized members
                        var paths = newArrayList(newArrayList(nestedVO))
                        var ClassDeclaration parent = nestedVO.declaration.eContainer as ClassDeclaration
                        while(parent !== null) {
                            val oldPaths = paths
                            paths = newArrayList
                            for (parentVO : parent.valuedObjects) {
                                for (oldPath : oldPaths) {
                                    val newPath = newArrayList(parentVO)
                                    newPath.addAll(oldPath)
                                    paths += newPath
                                }
                            }
                            if (parent == decl) {
                                parent = null
                            } else {
                                parent = parent.eContainer as ClassDeclaration
                            }
                        }
                        initVOs += paths
                    }
                }
            } else {
                initVOs += decl.valuedObjects.filter[initialValue !== null].map[newArrayList(it)]
            }
        }
        initVOs.reverse
        for (valuedObjects : initVOs) {
            val valuedObject = valuedObjects.last
            val assignments = newArrayList
            setDefaultTrace(valuedObject, valuedObject.declaration)
            
            if (valuedObjects.size == 1) {
                assignments += valuedObjects.head.createAssignment(valuedObject.initialValue.copy)
            } else { // Handle class members and arrays
                val assignment = valuedObjects.head.createAssignment(valuedObject.initialValue.copy)
                var inits = 1
                val cardinalities = newArrayList
                // Initialize class members
                var vor = assignment.reference
                for (subVO : valuedObjects.drop(1)) {
                    if (!vor.valuedObject.cardinalities.nullOrEmpty) {
                        for (card : vor.valuedObject.cardinalities) {
                            if (card instanceof IntValue) {
                                cardinalities += card.value
                                inits *= card.value
                            } else {
                                environment.errors.add("Cannot initialize members of class/sturct type with non-integer cardianlities in membership hierarchy.")
                            }
                        }
                        vor.indices += vor.valuedObject.cardinalities.map[createIntValue(0)]
                    }
                    vor.subReference = subVO.reference
                    vor = vor.subReference
                }
                assignments += assignment
                if (inits > 1) {
                    val nextIndices = newArrayList()
                    nextIndices += cardinalities.map[0]
                    for (x : 1..inits-1) {
                        // next index
                        var next = true
                        for (i : (cardinalities.size-1)..0) {
                            if (next) {
                                nextIndices.set(i, nextIndices.get(i) + 1)
                                if (nextIndices.get(i) >= cardinalities.get(i)) {
                                    nextIndices.set(i, 0)
                                } else {
                                    next = false
                                }
                            }
                        }
                        // copy and set
                        val nextAsm = assignment.copy
                        val idxIter = nextIndices.iterator
                        
                        vor = nextAsm.reference
                        while (vor !== null) {
                            for (idx : vor.indices) {
                                (idx as IntValue).value = idxIter.next
                            }
                            vor = vor.subReference
                        }
                        assignments += nextAsm
                    }
                }
            }
            
            // Initialization combined with existing entry action: The order in which new, 
            // additional initialization-entry actions are added matters for the semantics.
            // Initializations before part of the declaration. Entry actions afterwards. 
            // So the initialization-entry-actions should be ordered also before the other
            // entry actions to keep the original order. 
            if (scope instanceof State) {
                val entryAction = scope.createEntryAction(0)
                assignments.forEach[entryAction.addAssignment(it)]
            } else if (scope instanceof ControlflowRegion) {
                val entryAction = scope.states.findFirst[initial].createEntryAction(0)
                assignments.forEach[entryAction.addAssignment(it)]
            }
        }
        // Clear initial values AFTER all assignments are created because some nested VOs might need
        initVOs.map[last].forEach[initialValue = null]
    }
    
    def void implicitInitialization(Scope scope) {
        val decls = newLinkedList
        decls += scope.declarations.filter(VariableDeclaration)
        while (!decls.empty) {
            val decl = decls.pop
            if (decl instanceof ClassDeclaration) {
                if (!decl.isEnum) {
                    decls += decl.declarations.filter(VariableDeclaration)
                }
            } else {
                for (vo : decl.valuedObjects) {
                    if (vo.initialValue === null) {
                        val init = decl.type.initialValue
                        if (init !== null) {
                            vo.initialValue = init
                            if (!vo.cardinalities.empty) {
                                for (c : vo.cardinalities.reverseView) {
                                    if (c instanceof IntValue) {
                                        vo.initialValue = createOperatorExpression(OperatorType.MULT) => [
                                            subExpressions += createVectorValue => [
                                                values += vo.initialValue
                                            ]
                                            subExpressions += c.copy
                                        ]
                                    } else {
                                        environment.errors.add("Cannot initialize array with non integer cardinality: " + vo.name)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    def Value initialValue(ValueType type) {
        return switch(type) {
            case BOOL : { createBoolValue(false) }
            case INT, case UNSIGNED : { createIntValue(0) }
            case FLOAT, case DOUBLE : { createFloatValue(0) }
            case STRING : { createStringValue("") }
            default: { null }
        }
    }

}
