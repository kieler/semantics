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
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.kexpressions.ValuedObject
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


    //-------------------------------------------------------------------------
    @Inject extension KExpressionsValuedObjectExtensions  
    @Inject extension KExpressionsDeclarationExtensions  
    @Inject extension KEffectsExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension AnnotationsExtensions
    
    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--                       I N I T I A L I Z A T I O N                   --
    //-------------------------------------------------------------------------
    // @requires: entry actions
    // Transforming Variable Initializations
    def State transform(State rootState) {
        // Traverse all states
        for (scope : rootState.getAllScopes.toList) {
            scope.transformInitialization(rootState);
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
                                if (parentVO.cardinalities.nullOrEmpty) {
                                    for (oldPath : oldPaths) {
                                        val newPath = newArrayList(parentVO)
                                        newPath.addAll(oldPath)
                                        paths += newPath
                                    }
                                } else {
                                    environment.errors.add("Cannot initialize members of class/sturct types. Feature is currently not supported, please initialize manually.")
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
            setDefaultTrace(valuedObject, valuedObject.declaration)
            
            val assignment = valuedObjects.head.createAssignment(valuedObject.initialValue.copy)
            // Initialize class members
            var vor = assignment.reference
            for (subVO : valuedObjects.drop(1)) {
                vor.subReference = subVO.reference
                vor = vor.subReference
            }
            
            // Initialization combined with existing entry action: The order in which new, 
            // additional initialization-entry actions are added matters for the semantics.
            // Initializations before part of the declaration. Entry actions afterwards. 
            // So the initialization-entry-actions should be ordered also before the other
            // entry actions to keep the original order. 
            if (scope instanceof State) {
                val entryAction = scope.createEntryAction(0)
                entryAction.addAssignment(assignment)
            } else if (scope instanceof ControlflowRegion) {
                val entryAction = scope.states.findFirst[initial].createEntryAction(0)
                entryAction.addAssignment(assignment)
            }
            valuedObject.setInitialValue(null)
        }
    }

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }

}
